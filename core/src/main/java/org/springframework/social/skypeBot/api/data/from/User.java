package org.springframework.social.skypeBot.api.data.from;

/**
 * The User resource encapsulates user-related information, such as a user's identifier
 * @author Anton Leliuk
 */
public class User {

    /**
     * A unique resource identifier i.e. Skype ID
     */
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
