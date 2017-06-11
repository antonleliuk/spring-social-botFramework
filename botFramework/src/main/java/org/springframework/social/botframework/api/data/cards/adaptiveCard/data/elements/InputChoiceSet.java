package org.springframework.social.botframework.api.data.cards.adaptiveCard.data.elements;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.social.botframework.api.data.cards.adaptiveCard.dict.CardElementType;
import org.springframework.social.botframework.api.data.cards.adaptiveCard.dict.ChoiceInputStyle;

/**
 * @author Anton Leliuk
 */
public class InputChoiceSet extends CardElement {

    /**
     * Shows an array of Choice objects
     */
    private Choice[] choices;

    /**
     * Id for the value (will be used to identify collected input when SUBMIT is clicked)
     */
    private String id;

    @JsonProperty("isMultiSelect")
    private boolean multiSelect;

    private ChoiceInputStyle style;

    @Override
    public CardElementType getType() {
        return CardElementType.InputChoiceSet;
    }

    public Choice[] getChoices() {
        return choices;
    }

    public void setChoices(Choice[] choices) {
        this.choices = choices;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public boolean isMultiSelect() {
        return multiSelect;
    }

    public void setMultiSelect(boolean multiSelect) {
        this.multiSelect = multiSelect;
    }

    public ChoiceInputStyle getStyle() {
        return style;
    }

    public void setStyle(ChoiceInputStyle style) {
        this.style = style;
    }
}
