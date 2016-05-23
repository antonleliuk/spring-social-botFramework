package org.springframework.social.skypeBot.connect;

import org.springframework.social.oauth2.AbstractOAuth2ServiceProvider;
import org.springframework.social.oauth2.OAuth2Template;
import org.springframework.social.skypeBot.api.SkypeBot;
import org.springframework.social.skypeBot.api.impl.SkypeBotTemplate;

/**
 * @author Anton Leliuk
 */
public class SkypeBotServiceProvider extends AbstractOAuth2ServiceProvider<SkypeBot> {
    
    private String skypeUrl;
    private String apiVersion;

    public SkypeBotServiceProvider(String clientId, String clientSecret, String accessTokenUrl, String skypeUrl, String apiVersion) {
        super(getOauth2Operations(clientId, clientSecret, accessTokenUrl));
        this.skypeUrl = skypeUrl;
        this.apiVersion = apiVersion;
    }

    private static OAuth2Template getOauth2Operations(String clientId, String clientSecret, String accessTokenUrl) {
        OAuth2Template template = new OAuth2Template(clientId, clientSecret, "", accessTokenUrl);
        template.setUseParametersForClientAuthentication(true);
        return template;
    }

    @Override
    public SkypeBot getApi(String accessToken) {
        return new SkypeBotTemplate(accessToken, skypeUrl, apiVersion);
    }
}
