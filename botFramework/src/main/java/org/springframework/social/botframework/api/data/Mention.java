package org.springframework.social.botframework.api.data;

/**
 * Defines a user or bot that was mentioned in the conversation.
 * @author Anton Leliuk
 */
public class Mention implements Entity {

    /**
     * A ChannelAccount object that specifies the user or the bot that was mentioned. Note that some channels such as
     * Slack assign names per conversation, so it is possible that your bot's mentioned name
     * (in the message's recipient property) may be different from the handle that you specified when you registered
     * your bot. However, the account IDs for both would be the same.
     */
    private ChannelAccount mentioned;

    /**
     * The user or bot as mentioned in the conversation. For example, if the message is "@ColorBot pick me a new color,"
     * this property would be set to @ColorBot. Not all channels set this property.
     */
    private String text;

    /**
     * This object's type. Always set to Mention.
     */
    private String type;

    public ChannelAccount getMentioned() {
        return mentioned;
    }

    public void setMentioned(ChannelAccount mentioned) {
        this.mentioned = mentioned;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
