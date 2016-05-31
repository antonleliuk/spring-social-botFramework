package org.springframework.social.skypeBot.api.data.to;

import java.util.List;

import org.springframework.social.skypeBot.api.dict.AttachmentType;

/**
 * Information about the stored attachment.
 * @author Anton Leliuk
 */
public class AttachmentViewResponse {

    /**
     * Available attachment views
     */
    private List<View> views;

    /**
     * Attachment type
     */
    private AttachmentType type;

    /**
     * (Optional) The attachment's name
     */
    private String name;

    public List<View> getViews() {
        return views;
    }

    public void setViews(List<View> views) {
        this.views = views;
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
