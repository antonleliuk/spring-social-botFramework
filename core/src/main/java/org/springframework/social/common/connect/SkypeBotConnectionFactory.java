package org.springframework.social.common.connect;


import org.springframework.social.connect.support.OAuth2ConnectionFactory;
import org.springframework.social.common.api.ConnectorClient;

/**
 * @author Anton Leliuk
 */
public class SkypeBotConnectionFactory extends OAuth2ConnectionFactory<ConnectorClient> {

    public static final String PROVIDER_ID = "skypeBot";

    public SkypeBotConnectionFactory(String clientId, String clientSecret, String accessTokenUrl, String skypeUrl, String apiVersion) {
        super(PROVIDER_ID, new SkypeBotServiceProvider(clientId, clientSecret, accessTokenUrl, skypeUrl, apiVersion), null);
    }
}
