package org.springframework.social.botFramework.api.data.to;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author Anton Leliuk
 */
public class ConversationParameters {

    /**
     * Group conversation
     */
    @JsonProperty("isGroup")
    private Boolean group = null;

    /**
     * The bot address for this conversation
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

    public Boolean getGroup() {
        return group;
    }

    public void setGroup(Boolean group) {
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
}
