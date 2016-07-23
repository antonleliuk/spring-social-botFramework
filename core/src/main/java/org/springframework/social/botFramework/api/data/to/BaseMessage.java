package org.springframework.social.botFramework.api.data.to;

import org.springframework.social.common.api.dict.ActivityType;

/**
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
     */
    public abstract ActivityType getActivity();

}
