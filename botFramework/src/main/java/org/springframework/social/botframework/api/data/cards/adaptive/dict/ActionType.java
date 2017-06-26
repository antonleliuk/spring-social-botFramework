package org.springframework.social.botframework.api.data.cards.adaptive.dict;

import org.springframework.social.botframework.api.dict.DictType;

/**
 * Adaptive card action type
 * @author Anton Leliuk
 */
public enum ActionType implements DictType {

    Submit("Action.Submit"), ShowCard("Action.ShowCard"), Http("Action.Http"), OpenUrl("Action.OpenUrl");

    private String type;

    ActionType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
