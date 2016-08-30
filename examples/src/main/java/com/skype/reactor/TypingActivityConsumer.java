package com.skype.reactor;

import org.springframework.social.botFramework.api.data.Activity;
import org.springframework.social.botFramework.reactor.consumer.AbstractActivityConsumer;

/**
 * @author Anton Leliuk
 */
public class TypingActivityConsumer extends AbstractActivityConsumer {

    @Override
    protected void acceptInternal(Activity activity) {
        Activity answer = activity.createReplay().typing();
        botFramework.sendToConversation(answer.getRecipient().getId(), answer);
    }
}
