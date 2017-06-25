package org.springframework.social.botframework.api.data.cards.adaptiveCard.data.elements;

import org.springframework.social.botframework.api.data.cards.adaptiveCard.dict.CardElementType;
import org.springframework.social.botframework.util.CollectionUtils;

import java.util.List;

/**
 * The column group Item adds the ability to have a set of Column objects
 * @author Anton Leliuk
 */
public class ColumnSet extends CardElement<ColumnSet> {

    private List<Column> columns;

    @Override
    public CardElementType getType() {
        return CardElementType.ColumnSet;
    }

    public ColumnSet column(Column column){
        this.columns = CollectionUtils.add(columns, column);
        return this;
    }

    public List<Column> getColumns() {
        return columns;
    }

    public void setColumns(List<Column> columns) {
        this.columns = columns;
    }
}
