package org.springframework.social.botFramework.api.impl;

import org.springframework.social.botFramework.api.BotFrameworkOperations;
import org.springframework.social.botFramework.api.data.to.Activity;
import org.springframework.social.common.api.impl.AbstractApiBinding;
import org.springframework.web.client.RestTemplate;

/**
 * @author Anton Leliuk
 */
public class BotFrameworkTemplate extends AbstractApiBinding implements BotFrameworkOperations {

    public BotFrameworkTemplate(RestTemplate restTemplate, String skypeUrl, String apiVersion) {
        super(restTemplate, skypeUrl, apiVersion);
    }

    @Override
    public Object sendMessage(String recipient, Activity activity) {
        return getRestTemplate().postForObject(buildConversationUrl(recipient).path("activities").toUriString(), activity, Object.class);
    }
}
