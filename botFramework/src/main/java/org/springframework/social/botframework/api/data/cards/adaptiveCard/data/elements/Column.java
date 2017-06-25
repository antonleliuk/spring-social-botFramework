package org.springframework.social.botframework.api.data.cards.adaptiveCard.data.elements;

import org.springframework.social.botframework.api.data.cards.adaptiveCard.data.actions.Action;
import org.springframework.social.botframework.api.data.cards.adaptiveCard.dict.CardElementType;
import org.springframework.social.botframework.api.data.cards.adaptiveCard.dict.ColumnSize;
import org.springframework.social.botframework.util.CollectionUtils;

import java.util.List;

/**
 * Defines a container that is part of a ColumnSet
 * @author Anton Leliuk
 */
public class Column extends CardElement<Column> {

    private List<CardElement> items;

    private Action selectionAction;

    private ColumnSize size;

    @Override
    public CardElementType getType() {
        return CardElementType.Column;
    }

    public Column item(CardElement element){
        this.items = CollectionUtils.add(items, element);
        return this;
    }

    public Column selectionAction(Action action){
        this.selectionAction = action;
        return this;
    }

    public Column size(ColumnSize size){
        this.size = size;
        return this;
    }

    public List<CardElement> getItems() {
        return items;
    }

    public void setItems(List<CardElement> items) {
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