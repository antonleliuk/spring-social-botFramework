package com.skype.reactor;

import org.springframework.social.botFramework.api.data.Activity;
import org.springframework.social.botFramework.api.dict.ActivityType;
import org.springframework.social.botFramework.reactor.consumer.AbstractActivityConsumer;

/**
 * @author Anton Leliuk
 */
public class TypingActivityConsumer extends AbstractActivityConsumer {

    @Override
    protected void acceptInternal(Activity activity) {
        Activity answer = activity.createReplay();
        answer.setType(ActivityType.typing);
        botFramework.sendToConversation(answer.getRecipient().getId(), answer);
    }
}
