package org.springframework.social.common.api;

import org.springframework.social.ApiBinding;
import org.springframework.social.botFramework.api.BotFrameworkOperations;
import org.springframework.social.skypeBot.api.SkypeBotOperations;

/**
 * @author Anton Leliuk
 */
public interface ConnectorClient extends ApiBinding {

    SkypeBotOperations getSkypeBotOperations();

    BotFrameworkOperations getBotFrameworkOperations();

}
