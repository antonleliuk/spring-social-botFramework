package org.springframework.social.botframework.api.data.cards.adaptive.data.elements;

import org.springframework.social.botframework.api.data.cards.adaptive.dict.CardElementType;

/**
 * Input.Number collects number from the user
 * @author Anton Leliuk
 */
public class InputNumber extends InputCardElement<Number, InputNumber> {

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

    public InputNumber max(Number max){
        this.max = max;
        return this;
    }

    public InputNumber min(Number min){
        this.min = min;
        return this;
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
