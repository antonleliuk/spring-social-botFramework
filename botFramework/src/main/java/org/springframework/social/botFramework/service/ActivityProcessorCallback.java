package org.springframework.social.botFramework.service;

import org.springframework.social.botFramework.api.data.Activity;

/**
 * @author Anton Leliuk
 */
public interface ActivityProcessorCallback {

    void onPersonalMessage(Activity activity);

    void onGroupMessage(Activity activity);

    void onContactRelationUpdate(Activity activity);

    void onConversationUpdate(Activity activity);

    void onTyping(Activity activity);

    void onPing(Activity activity);

    void onDeleteUserData(Activity activity);
}
