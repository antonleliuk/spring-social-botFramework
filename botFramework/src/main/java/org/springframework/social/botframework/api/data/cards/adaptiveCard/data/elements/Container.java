package org.springframework.social.botframework.api.data.cards.adaptiveCard.data.elements;

import org.springframework.social.botframework.api.data.cards.adaptiveCard.data.actions.Action;
import org.springframework.social.botframework.api.data.cards.adaptiveCard.dict.CardElementType;
import org.springframework.social.botframework.api.data.cards.adaptiveCard.dict.ContainerStyle;

/**
 * The Container is a CardItem which contains a list of CardItems that are logically grouped
 * @author Anton Leliuk
 */
public class Container extends CardElement {

    private Action[] actions;

    private CardElement[] items;

    private Action selectionAction;

    private ContainerStyle style;

    @Override
    public CardElementType getType() {
        return CardElementType.Container;
    }

    public Action[] getActions() {
        return actions;
    }

    public void setActions(Action[] actions) {
        this.actions = actions;
    }

    public CardElement[] getItems() {
        return items;
    }

    public void setItems(CardElement[] items) {
        this.items = items;
    }

    public Action getSelectionAction() {
        return selectionAction;
    }

    public void setSelectionAction(Action selectionAction) {
        this.selectionAction = selectionAction;
    }

    public ContainerStyle getStyle() {
        return style;
    }

    public void setStyle(ContainerStyle style) {
        this.style = style;
    }
}
