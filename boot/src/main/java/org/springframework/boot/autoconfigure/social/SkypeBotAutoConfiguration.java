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
import org.springframework.social.config.annotation.ConnectionFactoryConfigurer;
import org.springframework.social.config.annotation.EnableSocial;
import org.springframework.social.config.annotation.SocialConfigurerAdapter;
import org.springframework.social.connect.Connection;
import org.springframework.social.connect.ConnectionRepository;
import org.springframework.social.connect.UsersConnectionRepository;
import org.springframework.social.oauth2.AccessGrant;
import org.springframework.social.skypeBot.api.SkypeBot;
import org.springframework.social.skypeBot.connect.SkypeBotConnectionFactory;

/**
 * @author Anton Leliuk
 */
@Configuration
@ConditionalOnClass({ SocialConfigurerAdapter.class, SkypeBotConnectionFactory.class })
@ConditionalOnProperty(prefix = "spring.social.microsoft.skype", name = "app-id")
@AutoConfigureBefore(SocialWebAutoConfiguration.class)
@AutoConfigureAfter(WebMvcAutoConfiguration.class)
public class SkypeBotAutoConfiguration {

    @Configuration
    @EnableSocial
    @EnableConfigurationProperties(SkypeBotProperties.class)
    @ConditionalOnWebApplication
    protected static class SkypeBotConfigurerAdapter extends SocialConfigurerAdapter {

        @Autowired
        private SkypeBotProperties properties;

        @Override
        public void addConnectionFactories(ConnectionFactoryConfigurer connectionFactoryConfigurer, Environment environment) {
            connectionFactoryConfigurer.addConnectionFactory(skypeBotConnectionFactory());
        }

        @Override
        public UserIdSource getUserIdSource() {
            return () -> properties.getAppId();
        }

        @Bean
        @ConditionalOnMissingBean(SkypeBot.class)
        public SkypeBot skypeBot(ConnectionRepository repository, SkypeBotConnectionFactory connectionFactory){
            Connection<SkypeBot> skypeBot = repository.findPrimaryConnection(SkypeBot.class);
            if (skypeBot == null) {
                AccessGrant accessGrant = connectionFactory.getOAuthOperations().authenticateClient(properties.getScope());
                Connection<SkypeBot> connection = connectionFactory.createConnection(accessGrant);
                repository.addConnection(connection);
                skypeBot = repository.findPrimaryConnection(SkypeBot.class);
                assert skypeBot != null;
            }
            return skypeBot.getApi();
        }

        @Bean
        public ConnectionRepository connectionRepository(UsersConnectionRepository usersConnectionRepository) {
            return usersConnectionRepository.createConnectionRepository(getUserIdSource().getUserId());
        }

        @Bean
        public SkypeBotConnectionFactory skypeBotConnectionFactory(){
            return new SkypeBotConnectionFactory(properties.getAppId(), properties.getAppSecret(), properties.getAuthUrl(), properties.getSkypeUrl(), properties.getApiVersion());
        }
    }
}
