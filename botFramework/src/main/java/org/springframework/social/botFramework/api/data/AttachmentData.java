package org.springframework.social.botFramework.api.data;

/**
 * Attachment data
 * @author Anton Leliuk
 */
public class AttachmentData {

    /**
     * Name of the attachment
     */
    private String name;

    /**
     * Original content
     */
    private byte[] originalBase64;

    /**
     * Thumbnail
     */
    private byte[] thumbnailBase64;

    /**
     * Content type of the attachment
     */
    private String type;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public byte[] getOriginalBase64() {
        return originalBase64;
    }

    public void setOriginalBase64(byte[] originalBase64) {
        this.originalBase64 = originalBase64;
    }

    public byte[] getThumbnailBase64() {
        return thumbnailBase64;
    }

    public void setThumbnailBase64(byte[] thumbnailBase64) {
        this.thumbnailBase64 = thumbnailBase64;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
