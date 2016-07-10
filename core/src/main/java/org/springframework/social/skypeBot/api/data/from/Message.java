package org.springframework.social.skypeBot.api.data.from;

import org.springframework.social.skypeBot.api.dict.ActivityType;

/**
 * Message notification. When a message is sent to Bot or group thread the Bot is member of,
 * notification of the following format will be sent to Bot URL
 * @author Anton Leliuk
 */
public class Message extends BaseMessage {

    /**
     * The message's text content including rich text and the canonical representations of emoticons
     */
    private String content;

    @Override
    public ActivityType getActivity() {
        return ActivityType.message;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

}