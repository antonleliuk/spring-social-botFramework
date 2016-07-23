package org.springframework.social.common.security;

import org.springframework.social.security.provider.OAuth2AuthenticationService;
import org.springframework.social.common.api.ConnectorClient;
import org.springframework.social.common.connect.SkypeBotConnectionFactory;

/**
 * @author Anton Leliuk
 */
public class SkypeBotAuthenticationService extends OAuth2AuthenticationService<ConnectorClient> {

    public SkypeBotAuthenticationService(String clientId, String clientSecret, String accessTokenUrl, String skypeUrl, String apiVersion) {
        super(new SkypeBotConnectionFactory(clientId, clientSecret, accessTokenUrl, skypeUrl, apiVersion));
    }
}
