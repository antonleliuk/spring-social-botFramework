package org.springframework.social.botframework.api.data.cards;

import org.springframework.social.botframework.api.dict.CardActionType;

/**
 * @author Anton Leliuk
 */
public class CardAction {

    /**
     * URL Picture which will appear on the button, next to text label.
     * Media hosted on 3rd party domains will be automatically hosted on auth protected CDN.
     * Auth protection will be used to ensure that content uploaded to Skype CDN will only be accessible
     * by Microsoft Clients Please refer to Chapter 7 for description of media caching algorithm.
     */
    private String image;

    /**
     * Text description which appear on the button.
     */
    private String title;

    /**
     * Defines the type of action implemented by this button
     */
    private CardActionType type;

    /**
     * Supplementary parameter for action. Content of this property depends on the ActionType
     */
    private String value;

    public CardAction image(String image){
        this.image = image;
        return this;
    }

    public CardAction title(String title){
        this.title = title;
        return this;
    }

    public CardAction type(CardActionType type){
        this.type = type;
        return this;
    }

    public CardAction value(String value){
        this.value = value;
        return this;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public CardActionType getType() {
        return type;
    }

    public void setType(CardActionType type) {
        this.type = type;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
