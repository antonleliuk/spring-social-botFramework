package org.springframework.social.botFramework.api.data.to;

import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * @author Anton Leliuk
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Attachment<C> {

    /**
     * Embedded content
     */
    private C content;

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

    public C getContent() {
        return content;
    }

    public void setContent(C content) {
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
