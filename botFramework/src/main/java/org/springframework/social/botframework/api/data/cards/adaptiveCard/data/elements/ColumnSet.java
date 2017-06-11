package org.springframework.social.botframework.api.data.cards.adaptiveCard.data.elements;

import org.springframework.social.botframework.api.data.cards.adaptiveCard.dict.CardElementType;

/**
 * The column group Item adds the ability to have a set of Column objects
 * @author Anton Leliuk
 */
public class ColumnSet extends CardElement {

    private Column[] columns;

    @Override
    public CardElementType getType() {
        return CardElementType.ColumnSet;
    }

    public Column[] getColumns() {
        return columns;
    }

    public void setColumns(Column[] columns) {
        this.columns = columns;
    }

}
