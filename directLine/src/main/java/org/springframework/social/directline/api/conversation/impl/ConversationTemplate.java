package org.springframework.social.directline.api.conversation.impl;

import org.springframework.http.HttpEntity;
import org.springframework.social.botframework.api.data.Activity;
import org.springframework.social.botframework.api.data.ResourceResponse;
import org.springframework.social.directline.api.conversation.ConversationOperations;
import org.springframework.social.directline.data.ActivitySet;
import org.springframework.social.directline.data.Conversation;
import org.springframework.social.directline.data.MultipartItem;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Anton Leliuk
 */
public class ConversationTemplate implements ConversationOperations {

    private RestTemplate restTemplate;

    public ConversationTemplate(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Override
    public Conversation startConversation() {
        return restTemplate.postForObject(ConversationOperations.getBaseUrl().build().toUri(),
                null,
                Conversation.class);
    }

    @Override
    public Conversation getConversationInformation(String conversationId, String waterMark) {
        return restTemplate.getForObject(
                ConversationOperations.getBaseUrl()
                        .pathSegment(conversationId)
                        .queryParam("watermark", waterMark)
                        .build()
                        .toUri(),
                Conversation.class);
    }

    @Override
    public ActivitySet getActivities(String conversationId, String waterMark) {
        return restTemplate.getForObject(
                ConversationOperations.getBaseUrl()
                        .pathSegment(conversationId)
                        .pathSegment("activities").queryParam("watermark", waterMark)
                        .build()
                        .toUri(),
                ActivitySet.class);
    }

    @Override
    public ResourceResponse sendActivity(String conversationId, Activity activity) {
        return restTemplate.postForObject(
                ConversationOperations.getBaseUrl()
                        .pathSegment(conversationId)
                        .pathSegment("activities")
                        .build()
                        .toUri(),
                activity,
                ResourceResponse.class);
    }

    @Override
    public ResourceResponse uploadFiles(String conversationId, String userId, List<MultipartItem> items) {
        List<HttpEntity<Object>> entities = items.stream().map(i ->
                new HttpEntity<>(i.getBody(), i.getHeaders())).collect(Collectors.toList());
        return restTemplate.postForObject(
                ConversationOperations.getBaseUrl()
                        .pathSegment(conversationId)
                        .pathSegment("upload")
                        .queryParam("userId", userId)
                        .build()
                        .toUri(),
                entities,
                ResourceResponse.class);
    }
}
