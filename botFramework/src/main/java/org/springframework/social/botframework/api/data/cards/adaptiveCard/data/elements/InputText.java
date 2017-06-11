package org.springframework.social.botframework.api.data.cards.adaptiveCard.data.elements;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.social.botframework.api.data.cards.adaptiveCard.dict.CardElementType;
import org.springframework.social.botframework.api.data.cards.adaptiveCard.dict.TextInputStyle;

/**
 * Input.Text collects text from the user
 * @author Anton Leliuk
 */
public class InputText extends InputCardElement<String> {

    @JsonProperty("isMultiline")
    private boolean multiLine;

    /**
     * hint of maximum length characters to collect (may be ignored by some clients)
     */
    private Integer maxLength;

    private TextInputStyle style;

    @Override
    public CardElementType getType() {
        return CardElementType.InputText;
    }

    public boolean isMultiLine() {
        return multiLine;
    }

    public void setMultiLine(boolean multiLine) {
        this.multiLine = multiLine;
    }

    public Integer getMaxLength() {
        return maxLength;
    }

    public void setMaxLength(Integer maxLength) {
        this.maxLength = maxLength;
    }

    public TextInputStyle getStyle() {
        return style;
    }

    public void setStyle(TextInputStyle style) {
        this.style = style;
    }

}
