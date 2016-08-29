package org.springframework.social.botFramework.api.data;

/**
 * Channel account information needed to route a message
 * @author Anton Leliuk
 */
public class ChannelAccount {

    /**
     * Channel id for the user or bot on this channel
     */
    private String id;

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
