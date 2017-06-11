package org.springframework.social.botframework.api.data;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Channel account information for a conversation
 * @author Anton Leliuk
 */
public class ConversationAccount {

    /**
     * The ID that identifies the conversation. The ID is unique per channel. If the channel starts the conversion,
     * it sets this ID; otherwise, the bot sets this property to the ID that it gets back in the response when it
     * starts the conversation (see Starting a conversation).
     */
    private String id;

    /**
     * Flag to indicate whether or not this is a group conversation. Set to true if this is a group
     * conversation; otherwise, false. The default is false.
     */
    @JsonProperty("isGroup")
    private boolean group;

    /**
     * A display name that can be used to identify the conversation.
     */
    private String name;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public boolean isGroup() {
        return group;
    }

    public void setGroup(boolean group) {
        this.group = group;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
