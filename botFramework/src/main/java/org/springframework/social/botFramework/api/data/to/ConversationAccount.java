package org.springframework.social.botFramework.api.data.to;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Channel account information for a conversation
 * @author Anton Leliuk
 */
public class ConversationAccount {

    /**
     * Channel id for the user or bot on this channel
     */
    private String id;

    /**
     * Is this a reference to a group
     */
    @JsonProperty("isGroup")
    private boolean group;

    /**
     * Display friendly name
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
