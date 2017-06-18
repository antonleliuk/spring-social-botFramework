package org.springframework.social.directline.api.conversation;

import org.springframework.social.botframework.api.data.Activity;
import org.springframework.social.botframework.api.data.ResourceResponse;
import org.springframework.social.directline.api.DirectLine;
import org.springframework.social.directline.data.ActivitySet;
import org.springframework.social.directline.data.Conversation;
import org.springframework.social.directline.data.MultipartItem;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.List;

/**
 * Use these operations to open a conversation with your bot and exchange activities between client and bot.
 * @author Anton Leliuk
 */
public interface ConversationOperations {

    /**
     * Opens a new conversation with the bot.
     * @return A {@link Conversation} object
     */
    Conversation startConversation();

    /**
     * Gets information about an existing conversation and also generates a new WebSocket stream URL that a client
     * may use to reconnect to a conversation. You may optionally supply the watermark parameter in the request URI
     * to indicate the most recent message seen by the client.
     * @param conversationId id of conversation
     * @param waterMark indicate the most recent message seen by client
     * @return A {@link Conversation} object
     */
    Conversation getConversationInformation(String conversationId, String waterMark);

    /**
     * Retrieves activities from the bot for the specified conversation. You may optionally supply the watermark
     * parameter in the request URI to indicate the most recent message seen by the client.
     * @param conversationId id of conversation
     * @param waterMark indicate the most recent message seen by client
     * @return An {@link ActivitySet} object. The response contains watermark as a property of the ActivitySet object.
     * Clients should page through the available activities by advancing the watermark value until
     * no activities are returned.
     */
    ActivitySet getActivities(String conversationId, String waterMark);

    /**
     * Sends an activity to the bot.
     * @param conversationId id of conversation
     * @param activity An {@link Activity} object
     * @return A {@link ResourceResponse} that contains an id property which specifies the ID of the Activity that was sent to the bot.
     */
    ResourceResponse sendActivity(String conversationId, Activity activity);

    /**
     * For a single attachment, populate the request body with the file contents.
     * For multiple attachments, create a multipart request body that contains one part for each attachment,
     * and also (optionally) one part for the {@link Activity} object that should serve as the container for the
     * specified attachment(s).
     * For more information, see <a href="https://docs.microsoft.com/en-us/bot-framework/rest-api/bot-framework-rest-direct-line-3-0-send-activity">Send an activity to the bot</a>.
     * @param conversationId id of conversation
     * @param userId user id
     * @param items list of contents
     * @return A {@link ResourceResponse} that contains an id property which specifies the ID of the Activity that was sent to the bot.
     */
    ResourceResponse uploadFiles(String conversationId, String userId, List<MultipartItem> items);

    static UriComponentsBuilder getBaseUrl(){
        return UriComponentsBuilder.fromHttpUrl(DirectLine.getBaseUrl().toUriString()).pathSegment("conversations");
    }
}
