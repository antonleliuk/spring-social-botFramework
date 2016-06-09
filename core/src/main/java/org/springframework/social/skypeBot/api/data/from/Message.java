package org.springframework.social.skypeBot.api.data.from;

import org.springframework.social.skypeBot.api.dict.AttachmentType;

/**
 * @author Anton Leliuk
 */
public class Message extends BaseMessage {

    /**
     * The message's text content including rich text and the canonical representations of emoticons
     */
    private String content;

    private AttachmentType type;

    private String name;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
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