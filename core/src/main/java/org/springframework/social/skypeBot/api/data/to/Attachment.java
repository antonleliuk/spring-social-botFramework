package org.springframework.social.skypeBot.api.data.to;

import org.springframework.social.skypeBot.api.dict.AttachmentType;

/**
 * @author Anton Leliuk
 */
public class Attachment {

    /**
     * The base64 encoded attachment body
     */
    private String originalBase64;

    /**
     * An optional base64 encoded attachment thumbnail
     */
    private String thumbnailBase64;

    /**
     * The attachment's type
     */
    private AttachmentType type;

    /**
     * An optional attachment name
     */
    private String name;

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

    public AttachmentType getType() {
        return type;
    }

    public void setType(AttachmentType type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
