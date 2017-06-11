package org.springframework.social.botframework.api.data;

/**
 * Defines a bot or user account on the channel.
 * @author Anton Leliuk
 */
public class ChannelAccount {

    /**
     * ID that uniquely identifies the bot or user on the channel.
     */
    private String id;

    /**
     * Name of the bot or user.
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
