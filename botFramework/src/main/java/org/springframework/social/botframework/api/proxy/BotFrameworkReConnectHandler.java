package org.springframework.social.botframework.api.proxy;

import org.springframework.social.ExpiredAuthorizationException;
import org.springframework.social.botframework.api.BotFramework;
import org.springframework.social.botframework.connect.BotFrameworkConnectionFactory;
import org.springframework.social.connect.Connection;
import org.springframework.social.connect.ConnectionRepository;
import org.springframework.social.oauth2.AccessGrant;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * {@link InvocationHandler} which will refresh access token
 * @author Anton Leliuk
 */
public class BotFrameworkReConnectHandler implements InvocationHandler {

    private ConnectionRepository repository;
    private BotFrameworkConnectionFactory connectionFactory;
    private String scope;

    public BotFrameworkReConnectHandler(ConnectionRepository repository, BotFrameworkConnectionFactory connectionFactory, String scope) {
        this.repository = repository;
        this.connectionFactory = connectionFactory;
        this.scope = scope;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        try {
            return invokeOperation(method, args);
        } catch (ExpiredAuthorizationException e) {
            /*
             * If token expired we will try to refresh and re-invoke operation
             */
            return invokeOperation(method, args);
        }
    }

    /**
     * Get existing connection or create new one if no connection found or it expired
     * @return {@link Connection} actual connection
     */
    private Connection<BotFramework> getOrCreateConnection() {
        Connection<BotFramework> botFramework = repository.findPrimaryConnection(BotFramework.class);
        if(botFramework == null || botFramework.hasExpired()){
            if (botFramework != null) {
                repository.removeConnection(botFramework.getKey());
            }

            AccessGrant accessGrant = connectionFactory.getOAuthOperations().authenticateClient(scope);
            Connection<BotFramework> connection = connectionFactory.createConnection(accessGrant);
            repository.addConnection(connection);
            botFramework = repository.findPrimaryConnection(BotFramework.class);
        }
        return botFramework;
    }

    /**
     * Invoke a operation on actual connection
     * @param method target method
     * @param args arguments
     * @return result of invocation
     * @throws Exception if we have problems with connection or with method invocation
     */
    private Object invokeOperation(Method method, Object[] args) throws Exception {
        Connection<BotFramework> botFramework = getOrCreateConnection();
        if (botFramework != null) {
            return method.invoke(botFramework.getApi(), args);
        }
        throw new IllegalArgumentException("Couldn't invoke method: " + method + ". Because we don't have a connection.");
    }
}
