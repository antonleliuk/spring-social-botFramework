package org.springframework.social.botframework.api.data;

import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * Attachment
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

    public Attachment<C> content(C content){
        this.content = content;
        return this;
    }

    public Attachment<C> contentType(String contentType){
        this.contentType = contentType;
        return this;
    }

    public Attachment<C> contentUrl(String contentUrl){
        this.contentUrl = contentUrl;
        return this;
    }

    public Attachment<C> name(String name){
        this.name = name;
        return this;
    }

    public Attachment<C> thumbnailUrl(String thumbnailUrl){
        this.thumbnailUrl = thumbnailUrl;
        return this;
    }

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
