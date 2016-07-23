package org.springframework.social.common.connect;

import org.springframework.social.oauth2.AbstractOAuth2ServiceProvider;
import org.springframework.social.oauth2.OAuth2Template;
import org.springframework.social.common.api.ConnectorClient;
import org.springframework.social.common.api.impl.ConnectorClientTemplate;

/**
 * @author Anton Leliuk
 */
public class SkypeBotServiceProvider extends AbstractOAuth2ServiceProvider<ConnectorClient> {
    
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
    public ConnectorClient getApi(String accessToken) {
        return new ConnectorClientTemplate(accessToken, skypeUrl, apiVersion);
    }
}
