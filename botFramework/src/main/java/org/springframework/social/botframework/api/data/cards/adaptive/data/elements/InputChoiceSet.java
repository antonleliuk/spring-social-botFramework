package org.springframework.social.botframework.api.data.cards.adaptive.data.elements;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.social.botframework.api.data.cards.adaptive.dict.CardElementType;
import org.springframework.social.botframework.api.data.cards.adaptive.dict.ChoiceInputStyle;
import org.springframework.social.botframework.util.CollectionUtils;

import java.util.List;

/**
 * @author Anton Leliuk
 */
public class InputChoiceSet extends CardElement<InputChoiceSet> {

    /**
     * Shows an array of Choice objects
     */
    private List<Choice> choices;

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

    public InputChoiceSet choice(Choice choice){
        this.choices = CollectionUtils.add(choices, choice);
        return this;
    }

    public InputChoiceSet id(String id){
        this.id = id;
        return this;
    }

    public InputChoiceSet multiSelect(boolean multiSelect){
        this.multiSelect = multiSelect;
        return this;
    }

    public InputChoiceSet style(ChoiceInputStyle style){
        this.style = style;
        return this;
    }

    public List<Choice> getChoices() {
        return choices;
    }

    public void setChoices(List<Choice> choices) {
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
