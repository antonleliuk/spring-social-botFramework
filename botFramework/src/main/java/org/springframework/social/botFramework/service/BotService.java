package org.springframework.social.botFramework.service;

import org.springframework.social.botFramework.api.data.Activity;

/**
 * @author Anton Leliuk
 */
public interface BotService {

    void reply(Activity activity);
}
