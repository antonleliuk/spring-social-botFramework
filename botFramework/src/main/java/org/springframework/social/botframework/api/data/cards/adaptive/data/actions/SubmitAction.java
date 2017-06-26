package org.springframework.social.botframework.api.data.cards.adaptive.data.actions;

import org.springframework.social.botframework.api.data.cards.adaptive.dict.ActionType;

/**
 * Submit action gathers up input fields, merges with optional data field and generates event to client asking for
 * data to be submitted. It is up to the client to determine how that data is processed.
 * For example: With BotFramework bots the client would send an activity through the messaging medium to the bot.
 * @author Anton Leliuk
 */
public class SubmitAction extends Action<SubmitAction> {

    /**
     * initial data that input fields will be combined with. This is essentially 'hidden' properties
     */
    private Object data;

    public SubmitAction data(Object data){
        this.data = data;
        return this;
    }

    @Override
    public ActionType getType() {
        return ActionType.Submit;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
