package org.springframework.social.skypeBot.api.data.from;

import org.springframework.social.skypeBot.api.dict.AttachmentType;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The Attachments object represents media content (image and video) that is part of an Activity shared to Conversation
 * @author Anton Leliuk
 */
public class Attachments {

    /**
     * The attachment's unique resource identifier (allocated by the service)
     */
    @JsonProperty("attachmentId")
    private String id;

    /**
     * The content type
     */
    private AttachmentType type;

    /**
     * This is base-64 encoded binary original content that is uploaded by Bot via this API.
     */
    private String originalBase64;

    /**
     * Base64 encoded thumbnail content, required for Video attachments.
     * The thumbnail property is ignored for all other content. The thumbnail is optional
     * Videos thumbnails should be JPEG. The resolution is the same as the corresponding video resolution.
     * Overall message size include thumbnail must not be more than 20 MB.
     */
    private String thumbnailBase64;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public AttachmentType getType() {
        return type;
    }

    public void setType(AttachmentType type) {
        this.type = type;
    }

    public String getOriginalBase64() {
        return originalBase64;
    }

    public void setOriginalBase64(String originalBase64) {
        this.originalBase64 = originalBase64;
    }

    public String getThumbnailBase64() {
        return thumbnailBase64;
    }

    public void setThumbnailBase64(String thumbnailBase64) {
        this.thumbnailBase64 = thumbnailBase64;
    }
}
