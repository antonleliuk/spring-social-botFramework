package org.springframework.social.botFramework.api.data;

import java.util.ArrayList;
import java.util.List;

/**
 * Metadata for an attachment
 * @author Anton Leliuk
 */
public class AttachmentInfo {

    /**
     * Name of the attachment
     */
    private String name = null;

    /**
     * ContentType of the attachment
     */
    private String type = null;

    /**
     * Attachment views
     */
    private List<AttachmentView> views = new ArrayList<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<AttachmentView> getViews() {
        return views;
    }

    public void setViews(List<AttachmentView> views) {
        this.views = views;
    }
}
