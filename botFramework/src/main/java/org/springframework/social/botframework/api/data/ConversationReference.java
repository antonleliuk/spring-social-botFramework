package org.springframework.social.botframework.api.data;

/**
 * Defines a particular point in a conversation.
 * @author Anton Leliuk
 */
public class ConversationReference {

    /**
     * ID that uniquely identifies the activity that this object references.
     */
    private String activityId;

    /**
     * A ChannelAccount object that identifies the bot in the conversation that this object references.
     */
    private ChannelAccount bot;

    /**
     * An ID that uniquely identifies the channel in the conversation that this object references.
     */
    private String channelId;

    /**
     * A ConversationAccount object that defines the conversation that this object references.
     */
    private ConversationAccount conversation;

    /**
     * URL that specifies the channel's service endpoint in the conversation that this object references.
     */
    private String serviceUrl;

    /**
     * A ChannelAccount object that identifies the user in the conversation that this object references.
     */
    private ChannelAccount user;

    public String getActivityId() {
        return activityId;
    }

    public void setActivityId(String activityId) {
        this.activityId = activityId;
    }

    public ChannelAccount getBot() {
        return bot;
    }

    public void setBot(ChannelAccount bot) {
        this.bot = bot;
    }

    public String getChannelId() {
        return channelId;
    }

    public void setChannelId(String channelId) {
        this.channelId = channelId;
    }

    public ConversationAccount getConversation() {
        return conversation;
    }

    public void setConversation(ConversationAccount conversation) {
        this.conversation = conversation;
    }

    public String getServiceUrl() {
        return serviceUrl;
    }

    public void setServiceUrl(String serviceUrl) {
        this.serviceUrl = serviceUrl;
    }

    public ChannelAccount getUser() {
        return user;
    }

    public void setUser(ChannelAccount user) {
        this.user = user;
    }
}
