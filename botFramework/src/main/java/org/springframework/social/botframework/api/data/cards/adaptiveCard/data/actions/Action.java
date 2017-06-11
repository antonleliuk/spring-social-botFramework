package org.springframework.social.botframework.api.data.cards.adaptiveCard.data.actions;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.springframework.social.botframework.api.data.cards.adaptiveCard.dict.ActionType;
import org.springframework.social.botframework.api.json.DictTypeSerializer;

/**
 * @author Anton Leliuk
 */
public abstract class Action {

    /**
     * Label for button or link that represents this action
     */
    private String title;

    @JsonSerialize(using = DictTypeSerializer.class)
    public abstract ActionType getType();

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
