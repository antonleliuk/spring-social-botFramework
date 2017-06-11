package org.springframework.social.botframework.api.data.cards.adaptiveCard.data.elements;

import org.springframework.social.botframework.api.data.cards.adaptiveCard.dict.CardElementType;

/**
 * Input.Number collects number from the user
 * @author Anton Leliuk
 */
public class InputNumber extends InputCardElement<Number> {

    /**
     * hint of maximum value (may be ignored by some clients)
     */
    private Number max;

    /**
     * hint of minimum value (may be ignored by some clients)
     */
    private Number min;

    @Override
    public CardElementType getType() {
        return CardElementType.InputNumber;
    }

    public Number getMax() {
        return max;
    }

    public void setMax(Number max) {
        this.max = max;
    }

    public Number getMin() {
        return min;
    }

    public void setMin(Number min) {
        this.min = min;
    }
}
