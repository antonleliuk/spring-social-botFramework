package org.springframework.social.botframework.api.data.cards.adaptiveCard.data.elements;

import org.springframework.social.botframework.api.data.cards.adaptiveCard.dict.CardElementType;

/**
 * @author Anton Leliuk
 */
public class FactSet extends CardElement {

    private Fact[] facts;

    @Override
    public CardElementType getType() {
        return CardElementType.FactSet;
    }

    public Fact[] getFacts() {
        return facts;
    }

    public void setFacts(Fact[] facts) {
        this.facts = facts;
    }

}
