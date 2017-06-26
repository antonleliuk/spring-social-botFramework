package org.springframework.social.botframework.api.data.cards.adaptive.data.elements;

import org.springframework.social.botframework.api.data.cards.adaptive.dict.CardElementType;
import org.springframework.social.botframework.util.CollectionUtils;

import java.util.List;

/**
 * @author Anton Leliuk
 */
public class FactSet extends CardElement<FactSet> {

    private List<Fact> facts;

    @Override
    public CardElementType getType() {
        return CardElementType.FactSet;
    }

    public FactSet fact(Fact fact){
        this.facts = CollectionUtils.add(facts, fact);
        return this;
    }

    public List<Fact> getFacts() {
        return facts;
    }

    public void setFacts(List<Fact> facts) {
        this.facts = facts;
    }
}
