package org.springframework.social.botframework.api.data.cards;

import org.springframework.social.botframework.api.data.cards.adaptiveCard.data.elements.CardElement;
import org.springframework.social.botframework.api.data.cards.adaptiveCard.data.actions.Action;
import org.springframework.social.botframework.api.data.cards.adaptiveCard.dict.CardElementType;
import org.springframework.social.botframework.api.dict.CardType;

import java.util.List;

/**
 * @author Anton Leliuk
 */
public class AdaptiveCard extends AbstractCard {

    private CardElementType type = CardElementType.AdaptiveCard;

    /**
     * Title/caption for the adaptive card.
     */
    private String title;

    /**
     * The items that are to be displayed in this container.
     */
    private List<CardElement> body;

    /**
     * Actions
     */
    private List<Action> actions;

    /**
     * Version of schema that this card was authored
     */
    private String version;

    /**
     * if a client doesn't support the minVersion the card should be rejected. If it does, then the elements
     * that are not supported are safe to ignore
     */
    private String minVersion;

    /**
     * if a client is not able to show the card, show fallbackText to the user. This can be in markdown format.
     */
    private String fallbackText;

    @Override
    public CardType getCardType() {
        return CardType.ADAPTIVE_CARD;
    }

    public CardElementType getType() {
        return type;
    }

    public void setType(CardElementType type) {
        this.type = type;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public void setTitle(String title) {
        this.title = title;
    }

    public List<CardElement> getBody() {
        return body;
    }

    public void setBody(List<CardElement> body) {
        this.body = body;
    }

    public List<Action> getActions() {
        return actions;
    }

    public void setActions(List<Action> actions) {
        this.actions = actions;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getMinVersion() {
        return minVersion;
    }

    public void setMinVersion(String minVersion) {
        this.minVersion = minVersion;
    }

    public String getFallbackText() {
        return fallbackText;
    }

    public void setFallbackText(String fallbackText) {
        this.fallbackText = fallbackText;
    }
}
