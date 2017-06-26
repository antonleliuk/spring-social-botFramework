package org.springframework.social.botframework.api.data.cards.adaptive.data.actions;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.springframework.social.botframework.api.data.cards.adaptive.dict.ActionType;
import org.springframework.social.botframework.api.json.DictTypeSerializer;

/**
 * @author Anton Leliuk
 */
public abstract class Action<A extends Action<A>> {

    /**
     * Label for button or link that represents this action
     */
    private String title;

    @JsonSerialize(using = DictTypeSerializer.class)
    public abstract ActionType getType();

    public A title(String title){
        this.title = title;
        return (A) this;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
