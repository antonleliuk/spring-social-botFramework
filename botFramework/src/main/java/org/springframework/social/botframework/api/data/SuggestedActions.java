package org.springframework.social.botframework.api.data;

import org.springframework.social.botframework.api.data.cards.CardAction;

import java.util.List;

/**
 * Defines the options from which a user can choose.
 * @author Anton Leliuk
 */
public class SuggestedActions {

    /**
     * Array of strings that contains the IDs of the recipients to whom the suggested actions should be displayed.
     */
    private List<String> to;

    /**
     * Array of CardAction objects that define the suggested actions.
     */
    private List<CardAction> actions;

    public List<String> getTo() {
        return to;
    }

    public void setTo(List<String> to) {
        this.to = to;
    }

    public List<CardAction> getActions() {
        return actions;
    }

    public void setActions(List<CardAction> actions) {
        this.actions = actions;
    }
}
