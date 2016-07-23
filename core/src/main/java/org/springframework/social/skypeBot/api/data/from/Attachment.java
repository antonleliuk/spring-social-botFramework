package org.springframework.social.skypeBot.api.data.from;

import java.util.List;

import org.springframework.social.skypeBot.api.data.common.data.View;
import org.springframework.social.botFramework.api.data.to.BaseMessage;
import org.springframework.social.common.api.dict.ActivityType;
import org.springframework.social.skypeBot.api.dict.AttachmentType;

/**
 * Attachment notification
 * @author Anton Leliuk
 */
public class Attachment extends BaseMessage {

    /**
     * The content type
     */
    private AttachmentType type;

    /**
     * The attachment's name.
     */
    private String name;

    private List<View> views;

    @Override
    public ActivityType getActivity() {
        return ActivityType.attachment;
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

    public List<View> getViews() {
        return views;
    }

    public void setViews(List<View> views) {
        this.views = views;
    }
}
