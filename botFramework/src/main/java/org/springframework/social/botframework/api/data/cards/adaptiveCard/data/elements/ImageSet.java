package org.springframework.social.botframework.api.data.cards.adaptiveCard.data.elements;

import org.springframework.social.botframework.api.data.cards.adaptiveCard.dict.CardElementType;
import org.springframework.social.botframework.api.data.cards.adaptiveCard.dict.ImageSize;

/**
 * The ImageSet allows for the inclusion of a collection images like a photogallery.
 * @author Anton Leliuk
 */
public class ImageSet extends CardElement {

    private Image[] images;

    private ImageSize imageSize;

    @Override
    public CardElementType getType() {
        return CardElementType.ImageSet;
    }

    public Image[] getImages() {
        return images;
    }

    public void setImages(Image[] images) {
        this.images = images;
    }

    public ImageSize getImageSize() {
        return imageSize;
    }

    public void setImageSize(ImageSize imageSize) {
        this.imageSize = imageSize;
    }

}