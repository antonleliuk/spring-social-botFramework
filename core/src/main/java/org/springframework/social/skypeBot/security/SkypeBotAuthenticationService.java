package org.springframework.social.skypeBot.security;

import org.springframework.social.security.provider.OAuth2AuthenticationService;
import org.springframework.social.skypeBot.api.SkypeBot;
import org.springframework.social.skypeBot.connect.SkypeBotConnectionFactory;

/**
 * @author Anton Leliuk
 */
public class SkypeBotAuthenticationService extends OAuth2AuthenticationService<SkypeBot> {

    public SkypeBotAuthenticationService(String clientId, String clientSecret, String accessTokenUrl, String skypeUrl, String apiVersion) {
        super(new SkypeBotConnectionFactory(clientId, clientSecret, accessTokenUrl, skypeUrl, apiVersion));
    }
}
