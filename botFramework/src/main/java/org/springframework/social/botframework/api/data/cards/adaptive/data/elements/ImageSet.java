package org.springframework.social.botframework.api.data.cards.adaptive.data.elements;

import org.springframework.social.botframework.api.data.cards.adaptive.dict.CardElementType;
import org.springframework.social.botframework.api.data.cards.adaptive.dict.ImageSize;
import org.springframework.social.botframework.util.CollectionUtils;

import java.util.List;

/**
 * The ImageSet allows for the inclusion of a collection images like a photogallery.
 * @author Anton Leliuk
 */
public class ImageSet extends CardElement<ImageSet> {

    private List<Image> images;

    private ImageSize imageSize;

    @Override
    public CardElementType getType() {
        return CardElementType.ImageSet;
    }

    public ImageSet image(Image image){
        this.images = CollectionUtils.add(images, image);
        return this;
    }

    public ImageSet imageSize(ImageSize size){
        this.imageSize = size;
        return this;
    }

    public List<Image> getImages() {
        return images;
    }

    public void setImages(List<Image> images) {
        this.images = images;
    }

    public ImageSize getImageSize() {
        return imageSize;
    }

    public void setImageSize(ImageSize imageSize) {
        this.imageSize = imageSize;
    }

}