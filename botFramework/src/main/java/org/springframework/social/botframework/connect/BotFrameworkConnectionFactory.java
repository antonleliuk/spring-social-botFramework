package org.springframework.social.botframework.connect;


import org.springframework.social.botframework.api.BotFramework;
import org.springframework.social.connect.support.OAuth2ConnectionFactory;

/**
 * @author Anton Leliuk
 */
public class BotFrameworkConnectionFactory extends OAuth2ConnectionFactory<BotFramework> {

    public static final String PROVIDER_ID = "skypeBot";

    public BotFrameworkConnectionFactory(String clientId, String clientSecret, String accessTokenUrl, String skypeUrl, String apiVersion) {
        super(PROVIDER_ID, new BotFrameworkServiceProvider(clientId, clientSecret, accessTokenUrl, skypeUrl, apiVersion), null);
    }
}
