package org.springframework.social.botFramework.service;

import org.springframework.social.botFramework.api.data.Activity;

/**
 * @author Anton Leliuk
 */
public interface BotService {

    void process(Activity activity, ActivityProcessorCallback callback);

    void typing(Activity activity);

    void reply(Activity answer);
}
