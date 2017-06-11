package org.springframework.social.botframework.api.data.cards;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.social.botframework.api.data.MediaUrl;
import org.springframework.social.botframework.api.data.ThumbnailUrl;

import java.util.List;

/**
 * @author Anton Leliuk
 */
public abstract class MultimediaCard extends AbstractCard {

    /**
     * Flag that indicates whether to replay the list of videos when the last one ends. Set this property to true to
     * automatically replay the videos, GIFs; otherwise, false. The default value is true.
     */
    @JsonProperty("autoloop")
    private boolean autoLoop = true;

    /**
     * Flag that indicates whether to automatically play the videos when the card is displayed. Set this property
     * to true to automatically play the videos, GIFs; otherwise, false. The default value is true.
     */
    @JsonProperty("autostart")
    private boolean autoStart = true;

    /**
     * Array of CardAction objects that enable the user to perform one or more actions.
     * The channel determines the number of buttons that you may specify.
     */
    private List<CardAction> buttons;

    /**
     * A ThumbnailUrl object that specifies the image to display on the card.
     */
    private ThumbnailUrl image;

    /**
     * Array of MediaUrl objects that specifies the list of videos or animated GIFs to play.
     */
    private List<MediaUrl> media;

    /**
     * Flag that indicates whether the videos may be shared with others. Set this property to true if the videos may
     * be shared; otherwise, false. The default value is true.
     */
    private boolean shareable = true;

    public boolean isAutoLoop() {
        return autoLoop;
    }

    public void setAutoLoop(boolean autoLoop) {
        this.autoLoop = autoLoop;
    }

    public boolean isAutoStart() {
        return autoStart;
    }

    public void setAutoStart(boolean autoStart) {
        this.autoStart = autoStart;
    }

    public List<CardAction> getButtons() {
        return buttons;
    }

    public void setButtons(List<CardAction> buttons) {
        this.buttons = buttons;
    }

    public ThumbnailUrl getImage() {
        return image;
    }

    public void setImage(ThumbnailUrl image) {
        this.image = image;
    }

    public List<MediaUrl> getMedia() {
        return media;
    }

    public void setMedia(List<MediaUrl> media) {
        this.media = media;
    }

    public boolean isShareable() {
        return shareable;
    }

    public void setShareable(boolean shareable) {
        this.shareable = shareable;
    }
}
