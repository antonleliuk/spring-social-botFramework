package org.springframework.social.botframework.api.data.cards;

import java.util.ArrayList;
import java.util.List;

import org.springframework.social.botframework.api.dict.CardType;
import org.springframework.social.botframework.util.CollectionUtils;

/**
 * A card representing a request to signing
 * @author Anton Leliuk
 */
public class SignInCard extends AbstractCard<SignInCard> {

    /**
     * Action to use to perform sign-in
     */
    private List<CardAction> buttons = new ArrayList<>();

    @Override
    public CardType getCardType() {
        return CardType.SIGN_IN_CARD;
    }

    public SignInCard button(CardAction button){
        this.buttons = CollectionUtils.add(buttons, button);
        return this;
    }

    public List<CardAction> getButtons() {
        return buttons;
    }

    public void setButtons(List<CardAction> buttons) {
        this.buttons = buttons;
    }

}
