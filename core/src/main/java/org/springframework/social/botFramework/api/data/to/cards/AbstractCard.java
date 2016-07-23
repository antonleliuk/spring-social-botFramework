package org.springframework.social.botFramework.api.data.to.cards;

import org.springframework.social.common.api.dict.CardType;
import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * @author Anton Leliuk
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public abstract class AbstractCard {

    /**
     * Subtitle of the card
     */
    private String subtitle;

    /**
     * Text for the card (for sign-in request)
     */
    private String text;

    /**
     * Title of the card
     */
    private String title;

    public abstract CardType getCardType();

    public String getSubtitle() {
        return subtitle;
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
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
