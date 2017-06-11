package org.springframework.social.botframework.api.data.cards.adaptiveCard.data.actions;

import org.springframework.social.botframework.api.data.cards.adaptiveCard.data.elements.Container;
import org.springframework.social.botframework.api.data.cards.adaptiveCard.dict.ActionType;

/**
 * Action.ShowCard defines an inline AdaptiveCard which is shown to the user when it is clicked.
 * @author Anton Leliuk
 */
public class ShowCardAction extends Action {

    private Container card;

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
