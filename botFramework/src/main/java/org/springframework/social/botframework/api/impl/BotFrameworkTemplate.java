package org.springframework.social.botframework.api.impl;

import java.io.IOException;
import java.util.List;
import java.util.UUID;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpRequest;
import org.springframework.http.client.ClientHttpRequestExecution;
import org.springframework.http.client.ClientHttpRequestInterceptor;
import org.springframework.http.client.ClientHttpResponse;
import org.springframework.social.botframework.api.data.Activity;
import org.springframework.social.botframework.api.data.AttachmentInfo;
import org.springframework.social.botframework.api.data.ChannelAccount;
import org.springframework.social.botframework.api.data.ResourceResponse;
import org.springframework.social.botframework.api.BotFramework;
import org.springframework.social.botframework.api.data.AttachmentData;
import org.springframework.social.botframework.api.data.Conversation;
import org.springframework.social.oauth2.AbstractOAuth2ApiBinding;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

/**
 * @author Anton Leliuk
 */
public class BotFrameworkTemplate extends AbstractOAuth2ApiBinding implements BotFramework {

    public BotFrameworkTemplate(String accessToken) {
        super(accessToken);
    }

    @Override
    public byte[] getAttachment(String serviceUrl, String attachmentId, String viewId) {
        return getRestTemplate().getForEntity(getMainUrl(serviceUrl).pathSegment("attachments", attachmentId, "views", viewId).toUriString(), byte[].class).getBody();
    }

    @Override
    public AttachmentInfo getAttachmentInfo(String serviceUrl, String attachmentId) {
        return getRestTemplate().getForObject(getMainUrl(serviceUrl).pathSegment("attachments", attachmentId).toUriString(), AttachmentInfo.class);
    }

    @Override
    public ResourceResponse createConversation(String serviceUrl, Conversation parameters) {
        return getRestTemplate().postForObject(getMainUrl(serviceUrl).path("conversations").toUriString(), parameters, ResourceResponse.class);
    }

    @Override
    public List<ChannelAccount> listActivityMembers(String serviceUrl, String conversationId, String activityId) {
        return getRestTemplate().exchange(
                buildConversationUrl(serviceUrl, conversationId).pathSegment("activities", activityId, "members").toUriString(),
                HttpMethod.GET,
                null,
                new ParameterizedTypeReference<List<ChannelAccount>>() {
                })
                .getBody();
    }

    @Override
    public List<ChannelAccount> listConversationMembers(String serviceUrl, String conversationId) {
        return getRestTemplate().exchange(
                buildConversationUrl(serviceUrl, conversationId).pathSegment("members").toUriString(),
                HttpMethod.GET,
                null,
                new ParameterizedTypeReference<List<ChannelAccount>>() {})
                .getBody();
    }

    @Override
    public void replyToActivity(String serviceUrl, String conversationId, String activityId, Activity activity) {
        getRestTemplate().postForLocation(buildConversationUrl(serviceUrl, conversationId).pathSegment("activities", activityId).toUriString(), activity);
    }

    @Override
    public void sendToConversation(String serviceUrl, String conversationId, Activity activity) {
        getRestTemplate().postForLocation(buildConversationUrl(serviceUrl, conversationId).path("activities").toUriString(), activity);
    }

    @Override
    public ResourceResponse uploadAttachment(String serviceUrl, String conversationId, AttachmentData attachmentUpload) {
        return getRestTemplate().postForObject(
                buildConversationUrl(serviceUrl, conversationId).pathSegment("attachments").toUriString(),
                attachmentUpload,
                ResourceResponse.class);
    }

    @Override
    protected void configureRestTemplate(RestTemplate restTemplate) {
        restTemplate.getInterceptors().add(new ContextIdHttpRequestInterceptor());
        restTemplate.getInterceptors().add(new LoggingClientHttpRequestInterceptor());
    }

    private UriComponentsBuilder buildConversationUrl(String serviceUrl, String skypeId){
        return getMainUrl(serviceUrl).pathSegment("conversations", skypeId);
    }

    private UriComponentsBuilder getMainUrl(String serviceUrl) {
        return UriComponentsBuilder.fromHttpUrl(serviceUrl).pathSegment(VERSION);
    }

    private class LoggingClientHttpRequestInterceptor implements ClientHttpRequestInterceptor {

        @Override
        public ClientHttpResponse intercept(HttpRequest request, byte[] body, ClientHttpRequestExecution execution) throws IOException {
            StringBuilder sb = new StringBuilder(System.lineSeparator())
                    .append("-------------------").append(System.lineSeparator())
                    .append("URL = ").append(request.getURI()).append(System.lineSeparator())
                    .append("Headers = ").append(request.getHeaders()).append(System.lineSeparator())
                    .append("Body = ").append(new String(body)).append(System.lineSeparator())
                    .append("-------------------");
            System.out.println(sb);
            return execution.execute(request, body);
        }
    }

    private class ContextIdHttpRequestInterceptor implements ClientHttpRequestInterceptor {

        @Override
        public ClientHttpResponse intercept(HttpRequest request, byte[] body, ClientHttpRequestExecution execution) throws IOException {
            request.getHeaders().add("ContextId", UUID.randomUUID().toString());
            return execution.execute(request, body);
        }
    }
}
