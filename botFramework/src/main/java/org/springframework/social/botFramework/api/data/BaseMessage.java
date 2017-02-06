package org.springframework.social.botFramework.api.data;

import org.springframework.social.botFramework.api.dict.ActivityType;

/**
 * Base message
 * @author Anton Leliuk
 */
public abstract class BaseMessage {

    /**
     * The message activityId.
     * Optional: Is 0 when message cannot be referenced.
     */
    private String id;

    /**
     * Which event happened and what other fields to expect.
     * For message this field contains constant string: “message”
     * @return {@link ActivityType} type of an activity
     */
    public abstract ActivityType getActivity();

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
