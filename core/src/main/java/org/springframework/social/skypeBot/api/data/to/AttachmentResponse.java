package org.springframework.social.skypeBot.api.data.to;

/**
 * @author Anton Leliuk
 */
public class AttachmentResponse {

    /**
     * The attachment's object identifier. It should be used to address the attachments object
     */
    private String attachmentId;

    /**
     * (Optional) The identifier of the notification that shared the attachment. This can 0 or missing for 1:1 conversations with the Bot
     */
    private String activityId;

    public String getAttachmentId() {
        return attachmentId;
    }

    public void setAttachmentId(String attachmentId) {
        this.attachmentId = attachmentId;
    }

    public String getActivityId() {
        return activityId;
    }

    public void setActivityId(String activityId) {
        this.activityId = activityId;
    }
}
