package org.springframework.social.botframework.connect;

import org.springframework.social.botframework.api.BotFramework;
import org.springframework.social.botframework.api.impl.BotFrameworkTemplate;
import org.springframework.social.oauth2.AbstractOAuth2ServiceProvider;
import org.springframework.social.oauth2.OAuth2Template;

/**
 * @author Anton Leliuk
 */
public class BotFrameworkServiceProvider extends AbstractOAuth2ServiceProvider<BotFramework> {
    
    public BotFrameworkServiceProvider(String clientId, String clientSecret, String accessTokenUrl) {
        super(getOauth2Operations(clientId, clientSecret, accessTokenUrl));
    }

    private static OAuth2Template getOauth2Operations(String clientId, String clientSecret, String accessTokenUrl) {
        OAuth2Template template = new OAuth2Template(clientId, clientSecret, "", accessTokenUrl);
        template.setUseParametersForClientAuthentication(true);
        return template;
    }

    @Override
    public BotFramework getApi(String accessToken) {
        return new BotFrameworkTemplate(accessToken);
    }
}
