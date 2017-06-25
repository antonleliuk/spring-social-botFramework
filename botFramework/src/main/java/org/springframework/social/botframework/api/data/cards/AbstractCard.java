package org.springframework.social.botframework.api.data.cards;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.springframework.social.botframework.api.data.Attachment;
import org.springframework.social.botframework.api.dict.CardType;
import org.springframework.social.botframework.api.json.DictTypeSerializer;

/**
 * @author Anton Leliuk
 */
public abstract class AbstractCard<C extends CardElement<C>> extends CardElement<C> {

    @JsonIgnore
    public <C extends AbstractCard> Attachment<C> toAttachment(){
        return new Attachment<C>().content((C) this).contentType(getCardType().getType());
    }

    @JsonSerialize(using = DictTypeSerializer.class)
    public abstract CardType getCardType();

}
