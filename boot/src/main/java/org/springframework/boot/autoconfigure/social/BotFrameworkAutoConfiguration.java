package org.springframework.boot.autoconfigure.social;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.boot.autoconfigure.AutoConfigureBefore;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.autoconfigure.condition.ConditionalOnWebApplication;
import org.springframework.boot.autoconfigure.web.WebMvcAutoConfiguration;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.social.UserIdSource;
import org.springframework.social.botframework.api.BotFramework;
import org.springframework.social.botframework.connect.BotFrameworkConnectionFactory;
import org.springframework.social.botframework.service.BotService;
import org.springframework.social.botframework.service.impl.BotServiceImpl;
import org.springframework.social.config.annotation.ConnectionFactoryConfigurer;
import org.springframework.social.config.annotation.EnableSocial;
import org.springframework.social.config.annotation.SocialConfigurerAdapter;
import org.springframework.social.connect.Connection;
import org.springframework.social.connect.ConnectionRepository;
import org.springframework.social.connect.UsersConnectionRepository;
import org.springframework.social.oauth2.AccessGrant;

/**
 * @author Anton Leliuk
 */
@Configuration
@ConditionalOnClass({ SocialConfigurerAdapter.class, BotFrameworkConnectionFactory.class })
@ConditionalOnProperty(prefix = "spring.social.microsoft.skype", name = "app-id")
@AutoConfigureBefore(SocialWebAutoConfiguration.class)
@AutoConfigureAfter(WebMvcAutoConfiguration.class)
public class BotFrameworkAutoConfiguration {

    @Configuration
    @EnableSocial
    @EnableConfigurationProperties(BotFrameworkProperties.class)
    @ConditionalOnWebApplication
    protected static class BotFrameworkConfigurerAdapter extends SocialConfigurerAdapter {

        @Autowired
        private BotFrameworkProperties properties;

        @Override
        public void addConnectionFactories(ConnectionFactoryConfigurer connectionFactoryConfigurer, Environment environment) {
            connectionFactoryConfigurer.addConnectionFactory(botFrameworkConnectionFactory());
        }

        @Override
        public UserIdSource getUserIdSource() {
            return () -> properties.getAppId();
        }

        @Bean
        @ConditionalOnMissingBean(BotFramework.class)
        public BotFramework botFramework(ConnectionRepository repository, BotFrameworkConnectionFactory connectionFactory){
            Connection<BotFramework> botFrameworkConnection = repository.findPrimaryConnection(BotFramework.class);
            if (botFrameworkConnection == null) {
                AccessGrant accessGrant = connectionFactory.getOAuthOperations().authenticateClient(properties.getScope());
                Connection<BotFramework> connection = connectionFactory.createConnection(accessGrant);
                repository.addConnection(connection);
                botFrameworkConnection = repository.findPrimaryConnection(BotFramework.class);
                assert botFrameworkConnection != null;
            }
            return botFrameworkConnection.getApi();
        }

        @Bean
        public ConnectionRepository connectionRepository(UsersConnectionRepository usersConnectionRepository) {
            return usersConnectionRepository.createConnectionRepository(getUserIdSource().getUserId());
        }

        @Bean
        public BotFrameworkConnectionFactory botFrameworkConnectionFactory(){
            return new BotFrameworkConnectionFactory(properties.getAppId(), properties.getAppSecret(), properties.getAuthUrl(), properties.getSkypeUrl(), properties.getApiVersion());
        }

        @Bean
        public BotService botService(){
            return new BotServiceImpl();
        }
    }
}
