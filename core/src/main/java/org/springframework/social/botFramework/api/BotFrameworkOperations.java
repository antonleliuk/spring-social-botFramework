package org.springframework.social.botFramework.api;

import org.springframework.social.botFramework.api.data.to.Activity;

/**
 * @author Anton Leliuk
 */
public interface BotFrameworkOperations {

    Object sendMessage(String recipient, Activity activity);
}
