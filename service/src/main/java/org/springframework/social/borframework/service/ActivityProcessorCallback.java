package org.springframework.social.borframework.service;

import org.springframework.social.botframework.api.data.Activity;

/**
 * @author Anton Leliuk
 */
public interface ActivityProcessorCallback {

    default void onPersonalMessage(Activity activity) {};

    default void onGroupMessage(Activity activity) {};

    default void onContactRelationUpdate(Activity activity){};

    default void onConversationUpdate(Activity activity) {};

    default void onTyping(Activity activity) {};

    default void onPing(Activity activity) {};

    default void onDeleteUserData(Activity activity) {};

    default void onEndOfConversation(Activity activity) {};
}
