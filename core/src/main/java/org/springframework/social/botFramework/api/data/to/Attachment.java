package org.springframework.social.botFramework.api.data.to;

/**
 * @author Anton Leliuk
 */
public class Attachment {

    /**
     * Embedded content
     */
    private String content;

    /**
     * mimetype/content-type for the file
     */
    private String contentType;

    private String contentUrl;

    /**
     * The name of attachment
     */
    private String name;

    /**
     * Thumbnail associated with attachment
     */
    private String thumbnailUrl;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getContentType() {
        return contentType;
    }

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    public String getContentUrl() {
        return contentUrl;
    }

    public void setContentUrl(String contentUrl) {
        this.contentUrl = contentUrl;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getThumbnailUrl() {
        return thumbnailUrl;
    }

    public void setThumbnailUrl(String thumbnailUrl) {
        this.thumbnailUrl = thumbnailUrl;
    }
}
