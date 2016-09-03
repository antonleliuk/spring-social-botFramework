package org.springframework.social.botFramework.api.data.cards;

/**
 * @author Anton Leliuk
 */
public class ReceiptItem extends CardElement {

    private CardImage image;

    /**
     * Amount with currency
     */
    private String price;

    /**
     * Number of items of given kind
     */
    private int quantity;

    /**
     * This action will be activated when user taps on the Item bubble.
     */
    private CardAction tap;

    public ReceiptItem image(CardImage image){
        this.image = image;
        return this;
    }

    public ReceiptItem price(String price){
        this.price = price;
        return this;
    }

    public ReceiptItem quantity(int quantity){
        this.quantity = quantity;
        return this;
    }

    public ReceiptItem tap(CardAction tap){
        this.tap = tap;
        return this;
    }

    public CardImage getImage() {
        return image;
    }

    public void setImage(CardImage image) {
        this.image = image;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public CardAction getTap() {
        return tap;
    }

    public void setTap(CardAction tap) {
        this.tap = tap;
    }

}
