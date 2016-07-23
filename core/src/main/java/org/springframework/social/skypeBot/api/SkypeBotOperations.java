package org.springframework.social.skypeBot.api;

import org.springframework.social.skypeBot.api.data.to.Attachment;
import org.springframework.social.skypeBot.api.data.to.AttachmentResponse;
import org.springframework.social.skypeBot.api.data.to.AttachmentViewResponse;
import org.springframework.social.skypeBot.api.data.to.Message;

/**
 * @author Anton Leliuk
 */
public interface SkypeBotOperations {

    void sendMessage(String skypeId, Message message);

    AttachmentResponse sendAttachment(String skypeId, Attachment attachment);

    AttachmentViewResponse getAttachment(String attachmentId);

    Object getAttachmentView(String attachmentId, String viewId);
}
