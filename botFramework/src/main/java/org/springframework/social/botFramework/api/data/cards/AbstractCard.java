package org.springframework.social.botFramework.api.data.cards;

import org.springframework.social.botFramework.api.data.Attachment;
import org.springframework.social.botFramework.api.json.CardTypeSerializer;
import org.springframework.social.botFramework.api.dict.CardType;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

/**
 * @author Anton Leliuk
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public abstract class AbstractCard {

    /**
     * Subtitle of the card
     */
    @JsonProperty("subtitle")
    private String subTitle;

    /**
     * Text for the card (for sign-in request)
     */
    private String text;

    /**
     * Title of the card
     */
    private String title;

    public <C extends AbstractCard> C title(String title){
        this.title = title;
        return (C)this;
    }

    public <C extends AbstractCard> C subTitle(String subTitle){
        this.subTitle = subTitle;
        return (C)this;
    }

    public <C extends AbstractCard> C text(String text){
        this.text = text;
        return (C)this;
    }

    public <C extends AbstractCard> Attachment<C> toAttachment(){
        return new Attachment<C>().content((C) this).contentType(getCardType().getType());
    }

    @JsonSerialize(using = CardTypeSerializer.class)
    public abstract CardType getCardType();

    public String getSubTitle() {
        return subTitle;
    }

    public void setSubTitle(String subTitle) {
        this.subTitle = subTitle;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
