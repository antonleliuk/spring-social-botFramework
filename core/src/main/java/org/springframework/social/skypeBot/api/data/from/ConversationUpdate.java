package org.springframework.social.skypeBot.api.data.from;

import java.util.List;

import org.springframework.social.skypeBot.api.dict.ActivityType;

/**
 * This notification is sent when the conversation's properties change,
 * for example the topic name, or when user joins or leaves the group.
 * @author Anton Leliuk
 */
public class ConversationUpdate extends BaseMessage {

    /**
     * A list of added members.
     */
    private List<String> membersAdded;

    /**
     * A list of removed members from.
     */
    private List<String> membersRemoved;

    /**
     * The conversation's new topic name.
     */
    private String topicName;

    private boolean historyDisclosed;

    @Override
    public ActivityType getActivity() {
        return ActivityType.conversationUpdate;
    }

    public List<String> getMembersAdded() {
        return membersAdded;
    }

    public void setMembersAdded(List<String> membersAdded) {
        this.membersAdded = membersAdded;
    }

    public List<String> getMembersRemoved() {
        return membersRemoved;
    }

    public void setMembersRemoved(List<String> membersRemoved) {
        this.membersRemoved = membersRemoved;
    }

    public String getTopicName() {
        return topicName;
    }

    public void setTopicName(String topicName) {
        this.topicName = topicName;
    }

    public boolean isHistoryDisclosed() {
        return historyDisclosed;
    }

    public void setHistoryDisclosed(boolean historyDisclosed) {
        this.historyDisclosed = historyDisclosed;
    }
}
