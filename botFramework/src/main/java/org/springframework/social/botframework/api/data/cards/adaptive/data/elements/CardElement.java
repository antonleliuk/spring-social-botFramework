package org.springframework.social.botframework.api.data.cards.adaptive.data.elements;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.springframework.social.botframework.api.data.cards.adaptive.dict.CardElementType;
import org.springframework.social.botframework.api.data.cards.adaptive.dict.SeparationStyle;
import org.springframework.social.botframework.api.json.DictTypeSerializer;

/**
 * @author Anton Leliuk
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public abstract class CardElement<E extends CardElement<E>> {

    /**
     * Specifies what should be spoken for this entire Item. This is simple text or SSML fragment
     */
    private String speak;

    @JsonSerialize(using = DictTypeSerializer.class)
    private SeparationStyle separation;

    @JsonSerialize(using = DictTypeSerializer.class)
    public abstract CardElementType getType();

    public E speak(String speak){
        this.speak = speak;
        return (E) this;
    }

    public E separation(SeparationStyle style){
        this.separation = style;
        return (E) this;
    }

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
