package org.springframework.social.botFramework.api.data.to;

/**
 * @author Anton Leliuk
 */
public class AttachmentData {

    /**
     * Name of the attachment
     */
    private String name;

    /**
     * Original content
     */
    private byte[] originalBase64;

    /**
     * Thumbnail
     */
    private byte[] thumbnailBase64;

    /**
     * Content type of the attachment
     */
    private String type;
}
