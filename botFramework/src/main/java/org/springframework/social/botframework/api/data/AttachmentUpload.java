package org.springframework.social.botframework.api.data;

/**
 * Defines an attachment to be uploaded.
 * @author Anton Leliuk
 */
public class AttachmentUpload {

    /**
     * ContentType of the attachment.
     */
    private String type;

    /**
     * Name of the attachment.
     */
    private String name;

    /**
     * Binary data that represents the contents of the original version of the file.
     */
    private String originalBase64;

    /**
     * Binary data that represents the contents of the thumbnail version of the file.
     */
    private String thumbnailBase64;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
