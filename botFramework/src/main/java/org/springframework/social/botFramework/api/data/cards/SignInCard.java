package org.springframework.social.botFramework.api.data.cards;

import java.util.ArrayList;
import java.util.List;

import org.springframework.social.botFramework.api.dict.CardType;

/**
 * A card representing a request to signing
 * @author Anton Leliuk
 */
public class SignInCard extends AbstractCard {

    /**
     * Action to use to perform sign-in
     */
    private List<CardAction> buttons = new ArrayList<>();

    @Override
    public CardType getCardType() {
        return CardType.SIGN_IN_CARD;
    }

    public List<CardAction> getButtons() {
        return buttons;
    }

    public void setButtons(List<CardAction> buttons) {
        this.buttons = buttons;
    }

}
