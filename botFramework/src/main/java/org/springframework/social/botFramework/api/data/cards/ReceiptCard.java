package org.springframework.social.botFramework.api.data.cards;

import java.util.ArrayList;
import java.util.List;

import org.springframework.social.botFramework.api.dict.CardType;

/**
 * @author Anton Leliuk
 */
public class ReceiptCard extends AbstractCard {

    /**
     * Set of actions applicable to the current card
     */
    private List<CardAction> buttons = new ArrayList<>();

    /**
     * This action will be activated when user taps on the card itself
     */
    private CardAction tap;

    /**
     * List of Fact objects
     */
    private List<Fact> facts = new ArrayList<>();

    /**
     * List of receipt items
     */
    private List<ReceiptItem> items = new ArrayList<>();

    /**
     * Total amount of TAX paid (or should be paid)
     */
    private String tax;

    /**
     * Total amount of money paid (or should be paid)
     */
    private String total;

    /**
     * Total amount of VAT paid (or should be paid)
     */
    private String vat;

    @Override
    public CardType getCardType() {
        return CardType.RECEIPT_CARD;
    }

    public List<CardAction> getButtons() {
        return buttons;
    }

    public void setButtons(List<CardAction> buttons) {
        this.buttons = buttons;
    }

    public CardAction getTap() {
        return tap;
    }

    public void setTap(CardAction tap) {
        this.tap = tap;
    }

    public List<Fact> getFacts() {
        return facts;
    }

    public void setFacts(List<Fact> facts) {
        this.facts = facts;
    }

    public List<ReceiptItem> getItems() {
        return items;
    }

    public void setItems(List<ReceiptItem> items) {
        this.items = items;
    }

    public String getTax() {
        return tax;
    }

    public void setTax(String tax) {
        this.tax = tax;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public String getVat() {
        return vat;
    }

    public void setVat(String vat) {
        this.vat = vat;
    }
}
