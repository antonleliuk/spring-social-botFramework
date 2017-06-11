package org.springframework.social.botframework.api.dict;

/**
 * @author Anton Leliuk
 */
public enum CardActionType {

    /**
     * URL to be opened in the built-in browser
     */
    openUrl,
    /**
     * Text of the message to send to the bot (from the user who clicked the button or tapped the card). This message
     * (from user to bot) will be visible to all conversation participants via the client application that
     * is hosting the conversation.
     */
    imBack,

    /**
     * Text of the message to send to the bot (from the user who clicked the button or tapped the card). Some client
     * applications may display this text in the message feed, where it will be visible to all conversation participants.
     */
    postBack,
    /**
     * Destination for a phone call in this format: tel:123123123123
     */
    call,
    /**
     * URL of audio to be played
     */
    playAudio,
    /**
     * URL of video to be played
     */
    playVideo,
    /**
     * URL of image to be displayed
     */
    showImage,
    /**
     * URL of file to be downloaded
     */
    downloadFile,
    /**
     * URL of OAuth flow to be initiated
     */
    signin
}
