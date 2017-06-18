package org.springframework.social.botframework.api;

import java.util.List;

import org.springframework.social.ApiBinding;
import org.springframework.social.botframework.api.data.Activity;
import org.springframework.social.botframework.api.data.AttachmentInfo;
import org.springframework.social.botframework.api.data.ChannelAccount;
import org.springframework.social.botframework.api.data.ResourceResponse;
import org.springframework.social.botframework.api.data.AttachmentData;
import org.springframework.social.botframework.api.data.Conversation;

/**
 * @author Anton Leliuk
 */
public interface BotFramework extends ApiBinding {

    String VERSION = "v3";

    /**
     * Get the named view as binary content
     * @param serviceUrl service url
     * @param attachmentId attachment id
     * @param viewId view id from attachment info
     * @return attachment bytes
     */
    byte[] getAttachment(String serviceUrl, String attachmentId, String viewId);

    /**
     * Get attachment info structure describing the attachment views
     * @param serviceUrl service url
     * @param attachmentId attachment id
     * @return {@link AttachmentInfo} attachment metadata
     */
    AttachmentInfo getAttachmentInfo(String serviceUrl, String attachmentId);

    /**
     * Create a new conversation
     * @param serviceUrl service url
     * @param parameters Parameters to create the conversation from
     * @return {@link ResourceResponse} resource response
     */
    ResourceResponse createConversation(String serviceUrl, Conversation parameters);

    /**
     * Call this method to enumerate the members of an activity
     * @param serviceUrl service url
     * @param conversationId conversation id
     * @param activityId activity id
     * @return list of activity members
     */
    List<ChannelAccount> listActivityMembers(String serviceUrl, String conversationId, String activityId);

    /**
     * Call this method to enumerate the members of a conversation
     * @param serviceUrl service url
     * @param conversationId conversation id
     * @return list of conversation members
     */
    List<ChannelAccount> listConversationMembers(String serviceUrl, String conversationId);

    /**
     * Reply on a conversation
     * @param serviceUrl service url
     * @param conversationId conversation id
     * @param activityId activity id
     * @param activity original activity
     */
    void replyToActivity(String serviceUrl, String conversationId, String activityId, Activity activity);

    /**
     * This method allows you to upload an attachment directly into a channels blob storage.
     * This is useful because it allows you to store data in a compliant store when dealing with enterprises.
     * The response is a ResourceResponse which contains an AttachmentId which is suitable for using with the attachments api.
     * @param serviceUrl service url
     * @param conversationId conversation id
     * @param activity {@link Activity} activity
     */
    void sendToConversation(String serviceUrl, String conversationId, Activity activity);

    /**
     * This method allows you to upload an attachment directly into a channels blob storage.
     * This is useful because it allows you to store data in a compliant store when dealing with enterprises.
     * The response is a ResourceResponse which contains an AttachmentId which is suitable for using with the attachments api.
     * @param serviceUrl service url
     * @param conversationId conversation id
     * @param attachmentUpload attachment data
     * @return {@link ResourceResponse} resource response
     */
    ResourceResponse uploadAttachment(String serviceUrl, String conversationId, AttachmentData attachmentUpload);
}
