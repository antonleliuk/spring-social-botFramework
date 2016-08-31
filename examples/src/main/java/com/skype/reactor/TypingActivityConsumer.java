package com.skype.reactor;

import org.springframework.social.botFramework.api.data.Activity;
import org.springframework.social.botFramework.reactor.consumer.AbstractActivityConsumer;

/**
 * Consumer which will send {@literal typing} request to the BotFramework
 * In skype it will looks that bot is typing answer
 * @author Anton Leliuk
 */
public class TypingActivityConsumer extends AbstractActivityConsumer {

    @Override
    protected void acceptInternal(Activity activity) {
        Activity answer = activity.createReplay().typing();
        botFramework.sendToConversation(answer.getRecipient().getId(), answer);
    }
}
