package org.springframework.social.botframework.api.data.cards.adaptive.data.actions;

import org.springframework.social.botframework.api.data.cards.adaptive.data.elements.Container;
import org.springframework.social.botframework.api.data.cards.adaptive.dict.ActionType;

/**
 * Action.ShowCard defines an inline AdaptiveCard which is shown to the user when it is clicked.
 * @author Anton Leliuk
 */
public class ShowCardAction extends Action<ShowCardAction> {

    private Container card;

    public ShowCardAction card(Container card){
        this.card = card;
        return this;
    }

    @Override
    public ActionType getType() {
        return ActionType.ShowCard;
    }

    public Container getCard() {
        return card;
    }

    public void setCard(Container card) {
        this.card = card;
    }
}
