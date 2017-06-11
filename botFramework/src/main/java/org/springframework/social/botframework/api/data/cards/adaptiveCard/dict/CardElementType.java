package org.springframework.social.botframework.api.data.cards.adaptiveCard.dict;

import org.springframework.social.botframework.api.dict.DictType;

/**
 * @author Anton Leliuk
 */
public enum CardElementType implements DictType {

    AdaptiveCard,
    TextBlock,
    Image,
    Container,
    ColumnSet,
    FactSet,
    ImageSet,
    Column,
    InputText("Input.Text"),
    InputNumber("Input.Number"),
    InputDate("Input.Date"),
    InputTime("Input.Time"),
    InputToggle("Input.Toggle"),
    InputChoiceSet("Input.ChoiceSet");

    private String type;

    CardElementType() {
        this.type = name();
    }

    CardElementType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
