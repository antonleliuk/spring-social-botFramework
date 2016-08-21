package org.springframework.social.botFramework.api;

import java.util.List;

import org.springframework.social.ApiBinding;
import org.springframework.social.botFramework.api.data.to.Activity;
import org.springframework.social.botFramework.api.data.to.AttachmentData;
import org.springframework.social.botFramework.api.data.to.AttachmentInfo;
import org.springframework.social.botFramework.api.data.to.ChannelAccount;
import org.springframework.social.botFramework.api.data.to.ConversationParameters;
import org.springframework.social.botFramework.api.data.to.ResourceResponse;

/**
 * @author Anton Leliuk
 */
public interface BotFramework extends ApiBinding {

//    Object sendMessage(String recipient, Activity activity);

    /**
     * Get the named view as binary content
     * @param attachmentId attachment id
     * @param viewId view id from attachment info
     */
    byte[] getAttachment(String attachmentId, String viewId);

    /**
     * Get attachment info structure describing the attachment views
     * @param attachmentId attachment id
     */
    AttachmentInfo getAttachmentInfo(String attachmentId);

    /**
     * Create a new conversation
     * @param parameters Parameters to create the conversation from
     */
    ResourceResponse createConversation(ConversationParameters parameters);

    /**
     * Call this method to enumerate the members of an activity
     * @param conversationId conversation id
     * @param activityId activity if
     */
    List<ChannelAccount> listActivityMembers(String conversationId, String activityId);

    /**
     * Call this method to enumerate the members of a conversation
     * @param conversationId conversation id
     */
    List<ChannelAccount> listConversationMembers(String conversationId);

    /**
     * Reply on a conversation
     * @param conversationId conversation id
     * @param activity
     */
    void replyToActivity(String conversationId, Activity activity);

    /**
     * This method allows you to upload an attachment directly into a channels blob storage.
     * This is useful because it allows you to store data in a compliant store when dealing with enterprises.
     * The response is a ResourceResponse which contains an AttachmentId which is suitable for using with the attachments api.
     * @param conversationId
     * @param activity
     */
    void sendToConversation(String conversationId, Activity activity);

    /**
     * This method allows you to upload an attachment directly into a channels blob storage.
     * This is useful because it allows you to store data in a compliant store when dealing with enterprises.
     * The response is a ResourceResponse which contains an AttachmentId which is suitable for using with the attachments api.
     * @param conversationId conversation id
     * @param attachmentUpload attachment data
     */
    ResourceResponse uploadAttachment(String conversationId, AttachmentData attachmentUpload);
}
