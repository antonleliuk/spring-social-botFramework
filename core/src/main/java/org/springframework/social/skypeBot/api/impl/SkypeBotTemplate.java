package org.springframework.social.skypeBot.api.impl;

import org.springframework.social.common.api.impl.AbstractApiBinding;
import org.springframework.social.skypeBot.api.SkypeBotOperations;
import org.springframework.social.skypeBot.api.data.to.Attachment;
import org.springframework.social.skypeBot.api.data.to.AttachmentResponse;
import org.springframework.social.skypeBot.api.data.to.AttachmentViewResponse;
import org.springframework.social.skypeBot.api.data.to.Message;
import org.springframework.web.client.RestTemplate;

/**
 * @author Anton Leliuk
 */
public class SkypeBotTemplate extends AbstractApiBinding implements SkypeBotOperations {

    public SkypeBotTemplate(RestTemplate restTemplate, String skypeUrl, String apiVersion) {
        super(restTemplate, skypeUrl, apiVersion);
    }

    @Override
    public void sendMessage(String skypeId, Message message) {
        getRestTemplate().postForObject(buildConversationUrl(skypeId).path("activities").toUriString(), message, Void.class);
    }

    @Override
    public AttachmentResponse sendAttachment(String skypeId, Attachment attachment) {
        return getRestTemplate().postForObject(buildConversationUrl(skypeId).path("attachments").toUriString(), attachment, AttachmentResponse.class);
    }

    @Override
    public AttachmentViewResponse getAttachment(String attachmentId) {
        return getRestTemplate().getForObject(
                getMainUrl().pathSegment("attachments", "{attachmentId}").toUriString(),
                AttachmentViewResponse.class,
                attachmentId);
    }

    @Override
    public Object getAttachmentView(String attachmentId, String viewId) {
        return getRestTemplate().getForEntity(
                getMainUrl().pathSegment("attachments", "{attachmentId}", "views", "viewId").toUriString(),
                Object.class,
                attachmentId, viewId);
    }
}
