package org.springframework.social.botFramework.api.data.to.cards;

/**
 * @author Anton Leliuk
 */
public class ReceiptItem {

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
     * Subtitle appears just below Title field, differs from Title in font styling only
     */
    private String subtitle;

    /**
     * This action will be activated when user taps on the Item bubble.
     */
    private CardAction tap;

    /**
     * Text field appears just below subtitle, differs from Subtitle in font styling only
     */
    private String text;

    /**
     * Title of the card
     */
    private String title;

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

    public String getSubtitle() {
        return subtitle;
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }

    public CardAction getTap() {
        return tap;
    }

    public void setTap(CardAction tap) {
        this.tap = tap;
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
