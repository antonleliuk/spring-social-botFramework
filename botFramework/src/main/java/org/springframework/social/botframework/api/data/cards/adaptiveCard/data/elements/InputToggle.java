package org.springframework.social.botframework.api.data.cards.adaptiveCard.data.elements;

import org.springframework.social.botframework.api.data.cards.adaptiveCard.dict.CardElementType;

/**
 * Input.Toggle collects text from the user
 * @author Anton Leliuk
 */
public class InputToggle extends InputCardElement<Boolean> {

    /**
     * Title for the toggle
     */
    private String title;

    /**
     * The value when toggle is off (default:false)
     */
    private boolean valueOff = false;

    /**
     * The value when toggle is on (default:true)
     */
    private boolean valueOn = false;

    @Override
    public CardElementType getType() {
        return CardElementType.InputToggle;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isValueOff() {
        return valueOff;
    }

    public void setValueOff(boolean valueOff) {
        this.valueOff = valueOff;
    }

    public boolean isValueOn() {
        return valueOn;
    }

    public void setValueOn(boolean valueOn) {
        this.valueOn = valueOn;
    }
}
