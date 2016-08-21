package org.springframework.boot.autoconfigure.social;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author Anton Leliuk
 */
@ConfigurationProperties("spring.social.microsoft.skype")
public class BotFrameworkProperties extends SocialProperties {

    private String scope;

    private String authUrl;

    private String skypeUrl;

    private String grantType;

    private String apiVersion;

    public String getScope() {
        return scope;
    }

    public void setScope(String scope) {
        this.scope = scope;
    }

    public String getAuthUrl() {
        return authUrl;
    }

    public void setAuthUrl(String authUrl) {
        this.authUrl = authUrl;
    }

    public String getSkypeUrl() {
        return skypeUrl;
    }

    public void setSkypeUrl(String skypeUrl) {
        this.skypeUrl = skypeUrl;
    }

    public String getGrantType() {
        return grantType;
    }

    public void setGrantType(String grantType) {
        this.grantType = grantType;
    }

    public String getApiVersion() {
        return apiVersion;
    }

    public void setApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
    }
}
