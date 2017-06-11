package org.springframework.social.botframework.api.data.cards.adaptiveCard.data.elements;

import org.springframework.social.botframework.api.data.cards.adaptiveCard.dict.CardElementType;

import java.util.Date;

/**
 * Input.Date collects Date from the user
 * @author Anton Leliuk
 */
public class InputDate extends InputCardElement<Date> {

    /**
     * hint of maximum value expressed in iso-8601 format (may be ignored by some clients)
     */
    private String max;

    /**
     * hint of minimum value expressed in iso-8601 format (may be ignored by some clients)
     */
    private String min;

    @Override
    public CardElementType getType() {
        return CardElementType.InputDate;
    }

    /**
     * The initial value for a field expressed in iso-8601 format
     * @return initial value
     */
    @Override
    public Date getValue() {
        return super.getValue();
    }

    public String getMax() {
        return max;
    }

    public void setMax(String max) {
        this.max = max;
    }

    public String getMin() {
        return min;
    }

    public void setMin(String min) {
        this.min = min;
    }
}
