package org.springframework.social.skypeBot.api.data.from;

import org.springframework.social.skypeBot.api.dict.ActionType;
import org.springframework.social.skypeBot.api.dict.ActivityType;

/**
 * The contact relationship update notification is delivered when the
 * Bot is added to or removed from the user’s contact list.
 * @author Anton Leliuk
 */
public class ContactRelationUpdate extends BaseMessage {

    /**
     * Enum constants "add" or "remove" which indicates whether the user was added or removed as user’s Skype contact.
     */
    private ActionType action;

    /**
     * Friendly display name of the user
     */
    private String fromDisplayName;

    @Override
    public ActivityType getActivity() {
        return ActivityType.contactRelationUpdate;
    }

    public ActionType getAction() {
        return action;
    }

    public void setAction(ActionType action) {
        this.action = action;
    }

    public String getFromDisplayName() {
        return fromDisplayName;
    }

    public void setFromDisplayName(String fromDisplayName) {
        this.fromDisplayName = fromDisplayName;
    }
}
