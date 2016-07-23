package org.springframework.social.botFramework.api.data.from;

import org.springframework.social.common.api.dict.ActivityType;

/**
 * @author Anton Leliuk
 */
public class Message extends BaseBotFrameworkMessage {

    @Override
    public ActivityType getActivity() {
        return ActivityType.message;
    }
}
