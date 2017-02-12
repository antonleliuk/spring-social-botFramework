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
import org.springframework.social.botframework.api.data.ConversationParameters;
import org.springframework.social.oauth2.AbstractOAuth2ApiBinding;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

/**
 * @author Anton Leliuk
 */
public class BotFrameworkTemplate extends AbstractOAuth2ApiBinding implements BotFramework {

    private String skypeUrl;
    private String apiVersion;

    public BotFrameworkTemplate(String accessToken, String skypeUrl, String apiVersion) {
        super(accessToken);
        this.skypeUrl = skypeUrl;
        this.apiVersion = apiVersion;
    }

    @Override
    public byte[] getAttachment(String attachmentId, String viewId) {
        return getRestTemplate().getForEntity(getMainUrl().pathSegment("attachments", attachmentId, "views", viewId).toUriString(), byte[].class).getBody();
    }

    @Override
    public AttachmentInfo getAttachmentInfo(String attachmentId) {
        return getRestTemplate().getForObject(getMainUrl().pathSegment("attachments", attachmentId).toUriString(), AttachmentInfo.class);
    }

    @Override
    public ResourceResponse createConversation(ConversationParameters parameters) {
        return getRestTemplate().postForObject(getMainUrl().path("conversations").toUriString(), parameters, ResourceResponse.class);
    }

    @Override
    public List<ChannelAccount> listActivityMembers(String conversationId, String activityId) {
        return getRestTemplate().exchange(
                buildConversationUrl(conversationId).pathSegment("activities", activityId, "members").toUriString(),
                HttpMethod.GET,
                null,
                new ParameterizedTypeReference<List<ChannelAccount>>() {
                })
                .getBody();
    }

    @Override
    public List<ChannelAccount> listConversationMembers(String conversationId) {
        return getRestTemplate().exchange(
                buildConversationUrl(conversationId).pathSegment("members").toUriString(),
                HttpMethod.GET,
                null,
                new ParameterizedTypeReference<List<ChannelAccount>>() {})
                .getBody();
    }

    @Override
    public void replyToActivity(String conversationId, String activityId, Activity activity) {
        getRestTemplate().postForLocation(buildConversationUrl(conversationId).pathSegment("activities", activityId).toUriString(), activity);
    }

    @Override
    public void sendToConversation(String conversationId, Activity activity) {
        getRestTemplate().postForLocation(buildConversationUrl(conversationId).path("activities").toUriString(), activity);
    }

    @Override
    public ResourceResponse uploadAttachment(String conversationId, AttachmentData attachmentUpload) {
        return getRestTemplate().postForObject(
                buildConversationUrl(conversationId).pathSegment("attachments").toUriString(),
                attachmentUpload,
                ResourceResponse.class);
    }

    @Override
    protected void configureRestTemplate(RestTemplate restTemplate) {
        restTemplate.getInterceptors().add(new ContextIdHttpRequestInterceptor());
        restTemplate.getInterceptors().add(new LoggingClientHttpRequestInterceptor());
    }

    private UriComponentsBuilder buildConversationUrl(String skypeId){
        return getMainUrl().pathSegment("conversations", skypeId);
    }

    private UriComponentsBuilder getMainUrl() {
        return UriComponentsBuilder.fromHttpUrl(skypeUrl).pathSegment(apiVersion);
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
