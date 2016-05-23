package org.springframework.social.skypeBot.api.impl;

import org.springframework.social.oauth2.AbstractOAuth2ApiBinding;
import org.springframework.social.skypeBot.api.SkypeBot;
import org.springframework.social.skypeBot.api.data.to.Message;
import org.springframework.web.util.UriComponentsBuilder;

/**
 * @author Anton Leliuk
 */
public class SkypeBotTemplate extends AbstractOAuth2ApiBinding implements SkypeBot {

    private String skypeUrl;
    private String apiVersion;

    public SkypeBotTemplate(String accessToken, String skypeUrl, String apiVersion) {
        super(accessToken);
        this.skypeUrl = skypeUrl;
        this.apiVersion = apiVersion;
    }

    @Override
    public void sendMessage(String skypeId, Message message) {
        getRestTemplate().postForObject(buildConversationUrl(skypeId).path("activities").toUriString(), message, Void.class);
    }

    private UriComponentsBuilder buildConversationUrl(String skypeId){
        return getMainUrl().pathSegment("conversations", skypeId);
    }

    private UriComponentsBuilder getMainUrl() {
        return UriComponentsBuilder.fromHttpUrl(skypeUrl).pathSegment(apiVersion);
    }
}
