package org.springframework.social.botframework.api.data.cards.adaptiveCard.data.elements;

import org.springframework.social.botframework.api.data.cards.adaptiveCard.data.actions.Action;
import org.springframework.social.botframework.api.data.cards.adaptiveCard.dict.CardElementType;
import org.springframework.social.botframework.api.data.cards.adaptiveCard.dict.ColumnSize;

/**
 * Defines a container that is part of a ColumnSet
 * @author Anton Leliuk
 */
public class Column extends CardElement {

    private CardElement[] items;

    private Action selectionAction;

    private ColumnSize size;

    @Override
    public CardElementType getType() {
        return CardElementType.Column;
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

    public ColumnSize getSize() {
        return size;
    }

    public void setSize(ColumnSize size) {
        this.size = size;
    }

}