package org.springframework.social.skypeBot.api.data.from;

/**
 * The Conversation object represents a group of users who share the same activity stream
 * @author Anton Leliuk
 */
public class Conversation {

    /**
     * A resource identifier for the conversation
     */
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
