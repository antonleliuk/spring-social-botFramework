package org.springframework.social.botframework.api.data;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Defines a conversation, including the bot and users that are included within the conversation.
 * @author Anton Leliuk
 */
public class Conversation {

    /**
     * Flag to indicate whether or not this is a group conversation. Set to true if this is a group conversation;
     * otherwise, false. The default is false. To start a group conversation, the channel must support group conversations.
     */
    @JsonProperty("isGroup")
    private boolean group = false;

    /**
     * A ChannelAccount object that identifies the bot.
     */
    private ChannelAccount bot = null;

    /**
     * Members to add to the conversation
     */
    private List<ChannelAccount> members = new ArrayList<>();

    /**
     * Topic of the conversation (if supported by the channel)
     */
    private String topicName = null;

    /**
     * In a Create Conversation request, an Activity object that defines the first message to post to the new conversation.
     */
    private Activity activity;

    public boolean isGroup() {
        return group;
    }

    public void setGroup(boolean group) {
        this.group = group;
    }

    public ChannelAccount getBot() {
        return bot;
    }

    public void setBot(ChannelAccount bot) {
        this.bot = bot;
    }

    public List<ChannelAccount> getMembers() {
        return members;
    }

    public void setMembers(List<ChannelAccount> members) {
        this.members = members;
    }

    public String getTopicName() {
        return topicName;
    }

    public void setTopicName(String topicName) {
        this.topicName = topicName;
    }

    public Activity getActivity() {
        return activity;
    }

    public void setActivity(Activity activity) {
        this.activity = activity;
    }
}
