package org.springframework.social.botframework.api.data.cards.adaptiveCard.data.elements;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.springframework.social.botframework.api.data.cards.adaptiveCard.dict.CardElementType;
import org.springframework.social.botframework.api.data.cards.adaptiveCard.dict.SeparationStyle;
import org.springframework.social.botframework.api.json.DictTypeSerializer;

/**
 * @author Anton Leliuk
 */
public abstract class CardElement {

    /**
     * Specifies what should be spoken for this entire Item. This is simple text or SSML fragment
     */
    private String speak;

    @JsonSerialize(using = DictTypeSerializer.class)
    private SeparationStyle separation;

    @JsonSerialize(using = DictTypeSerializer.class)
    public abstract CardElementType getType();

    public String getSpeak() {
        return speak;
    }

    public void setSpeak(String speak) {
        this.speak = speak;
    }

    public SeparationStyle getSeparation() {
        return separation;
    }

    public void setSeparation(SeparationStyle separation) {
        this.separation = separation;
    }
}
