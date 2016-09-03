package org.springframework.social.botFramework.api.data.cards;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author Anton Leliuk
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CardElement {

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

    public <C extends CardElement> C title(String title){
        this.title = title;
        return (C)this;
    }

    public <C extends CardElement> C subTitle(String subTitle){
        this.subTitle = subTitle;
        return (C)this;
    }

    public <C extends CardElement> C text(String text){
        this.text = text;
        return (C)this;
    }

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
