package org.springframework.social.botframework.api.data.cards.adaptive.data.elements;

import org.springframework.social.botframework.api.data.cards.adaptive.data.actions.Action;
import org.springframework.social.botframework.api.data.cards.adaptive.dict.CardElementType;
import org.springframework.social.botframework.api.data.cards.adaptive.dict.ContainerStyle;
import org.springframework.social.botframework.util.CollectionUtils;

import java.util.List;

/**
 * The Container is a CardItem which contains a list of CardItems that are logically grouped
 * @author Anton Leliuk
 */
public class Container extends CardElement<Container> {

    private List<Action> actions;

    private List<CardElement> items;

    private Action selectionAction;

    private ContainerStyle style;

    @Override
    public CardElementType getType() {
        return CardElementType.Container;
    }

    public Container action(Action action){
        this.actions = CollectionUtils.add(actions, action);
        return this;
    }

    public Container item(CardElement element){
        this.items = CollectionUtils.add(items, element);
        return this;
    }

    public Container selectionAction(Action action){
        this.selectionAction = action;
        return this;
    }

    public Container style(ContainerStyle style){
        this.style = style;
        return this;
    }

    public List<Action> getActions() {
        return actions;
    }

    public void setActions(List<Action> actions) {
        this.actions = actions;
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

    public ContainerStyle getStyle() {
        return style;
    }

    public void setStyle(ContainerStyle style) {
        this.style = style;
    }
}
