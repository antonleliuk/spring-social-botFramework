package org.springframework.social.botframework.security;

import org.springframework.social.botframework.api.BotFramework;
import org.springframework.social.botframework.connect.BotFrameworkConnectionFactory;
import org.springframework.social.security.provider.OAuth2AuthenticationService;

/**
 * @author Anton Leliuk
 */
public class BotFrameworkAuthenticationService extends OAuth2AuthenticationService<BotFramework> {

    public BotFrameworkAuthenticationService(String clientId, String clientSecret, String accessTokenUrl, String skypeUrl, String apiVersion) {
        super(new BotFrameworkConnectionFactory(clientId, clientSecret, accessTokenUrl, skypeUrl, apiVersion));
    }
}
