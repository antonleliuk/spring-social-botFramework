package org.springframework.social.skypeBot.api.data.from;

/**
 * This object represents activities associated with the conversation, such as:
 * <ul>
 *     <li>Text messages</li>
 *     <li>Notifications to members of updates to conversation properties, e.g. new conversation or new attachment</li>
 *     <li>Images and Videos</li>
 * </ul>
 * @author Anton Leliuk
 */
public class Activity {

    /**
     * A resource identifier for the activity
     */
    private String id;

    /**
     * The ID instantiated from the user/conversation activity
     */
    private String from;

    /**
     * The targeted activity of the user/conversation ID
     */
    private String to;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }
}
