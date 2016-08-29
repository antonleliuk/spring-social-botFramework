package org.springframework.social.botFramework.api.data;

import java.util.ArrayList;
import java.util.List;

import org.springframework.social.botFramework.api.json.ActivityTypeDeserializer;
import org.springframework.social.botFramework.api.json.ActivityTypeSerializer;
import org.springframework.social.botFramework.api.dict.ActivityType;
import org.springframework.social.botFramework.api.dict.AttachmentLayout;
import org.springframework.social.botFramework.api.dict.TextFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

/**
 * @author Anton Leliuk
 */
public class Activity extends BaseBotFrameworkMessage {

    /**
     * ContactAdded/Removed action
     */
    private String action;

    /**
     * Layout of multiple attachments
    */
    private AttachmentLayout attachmentLayout;

    private List<Attachment> attachments;

    /**
     * Channel specific payload
     */
    private Object channelData;

    private ConversationAccount conversation;

    /**
     * Entities Collection of Entity which contain metadata about this activity (each is typed)
     */
    private List<Entity> entities;

    /**
     * Sender address
     */
    private ChannelAccount from;

    /**
     * The previous history of the channel was disclosed
     */
    private boolean historyDisclosed;

    /**
     * The language code of the Text field
     */
    private String locale;

    /**
     * Addresses of added contacts
     */
    private List<ChannelAccount> membersAdded;

    /**
     * Addresses of removed contacts
     */
    private List<ChannelAccount> membersRemoved;


    private Object properties;

    /**
     * (Outbound to bot only) Bot's address that received the message 
     */
    private ChannelAccount recipient;

    /**
     * The original id this message is a response to
     */
    private String replyToId;

    /**
     * Text to display if you can't render cards
     */
    private String summary;

    /**
     * Content for the message
     */
    private String text;

    /**
     * Format of text fields
     */
    private TextFormat textFormat;

    /**
     * Conversations new topic name
     */
    private String topicName;

    /**
     * The type of the activity
     */
    @JsonSerialize(using = ActivityTypeSerializer.class)
    @JsonDeserialize(using = ActivityTypeDeserializer.class)
    private ActivityType type;

    public Activity createReplay(){
        Activity replay = new Activity();
        replay.setFrom(recipient);
        replay.setRecipient(from);
        replay.setConversation(conversation);
        replay.setServiceUrl(getServiceUrl());
        replay.setChannelId(getChannelId());
        return replay;
    }

    @JsonIgnore
    @Override
    public ActivityType getActivity() {
        return type;
    }

    public <C>Activity addAttachment(Attachment<C> attachment){
        if(attachments == null){
            attachments = new ArrayList<>();
        }
        attachments.add(attachment);
        return this;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public AttachmentLayout getAttachmentLayout() {
        return attachmentLayout;
    }

    public void setAttachmentLayout(AttachmentLayout attachmentLayout) {
        this.attachmentLayout = attachmentLayout;
    }

    public List<Attachment> getAttachments() {
        return attachments;
    }

    public void setAttachments(List<Attachment> attachments) {
        this.attachments = attachments;
    }

    public Object getChannelData() {
        return channelData;
    }

    public void setChannelData(Object channelData) {
        this.channelData = channelData;
    }

    public ConversationAccount getConversation() {
        return conversation;
    }

    public void setConversation(ConversationAccount conversation) {
        this.conversation = conversation;
    }

    public List<Entity> getEntities() {
        return entities;
    }

    public void setEntities(List<Entity> entities) {
        this.entities = entities;
    }

    public ChannelAccount getFrom() {
        return from;
    }

    public void setFrom(ChannelAccount from) {
        this.from = from;
    }

    public boolean isHistoryDisclosed() {
        return historyDisclosed;
    }

    public void setHistoryDisclosed(boolean historyDisclosed) {
        this.historyDisclosed = historyDisclosed;
    }

    public String getLocale() {
        return locale;
    }

    public void setLocale(String locale) {
        this.locale = locale;
    }

    public List<ChannelAccount> getMembersAdded() {
        return membersAdded;
    }

    public void setMembersAdded(List<ChannelAccount> membersAdded) {
        this.membersAdded = membersAdded;
    }

    public List<ChannelAccount> getMembersRemoved() {
        return membersRemoved;
    }

    public void setMembersRemoved(List<ChannelAccount> membersRemoved) {
        this.membersRemoved = membersRemoved;
    }

    public Object getProperties() {
        return properties;
    }

    public void setProperties(Object properties) {
        this.properties = properties;
    }

    public ChannelAccount getRecipient() {
        return recipient;
    }

    public void setRecipient(ChannelAccount recipient) {
        this.recipient = recipient;
    }

    public String getReplyToId() {
        return replyToId;
    }

    public void setReplyToId(String replyToId) {
        this.replyToId = replyToId;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public TextFormat getTextFormat() {
        return textFormat;
    }

    public void setTextFormat(TextFormat textFormat) {
        this.textFormat = textFormat;
    }

    public String getTopicName() {
        return topicName;
    }

    public void setTopicName(String topicName) {
        this.topicName = topicName;
    }

    public ActivityType getType() {
        return type;
    }

    public void setType(ActivityType type) {
        this.type = type;
    }
}
