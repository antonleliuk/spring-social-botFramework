package org.springframework.social.skypeBot.api.dict;

/**
 * @author Anton Leliuk
 */
public enum AttachmentType {

    /**
     * Compatible with Skype Picture Sharing specifically, PNG, JPG or GIF up to 20 MB.
     * The maximum resolution is 2000 x 2000
     */
    Image,

    /**
     * Compatible with Skype Video Message specifically, MP4,
     * AAC+H264 up to 20 MB (approximately 1 minute of video at 2 Mbps)
     */
    Video,

    Audio,

    File
}
