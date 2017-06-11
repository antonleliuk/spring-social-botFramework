package org.springframework.social.botframework.api.data;

import com.fasterxml.jackson.annotation.JsonInclude;
import org.springframework.social.botframework.api.dict.ActivityType;

import java.util.Date;

/**
 * Base message
 *
 * {
 *      type=message,
 *      id=2yGK5Zkz453aQQYS,
 *      timestamp=2016-07-12T08:48:51.505Z,
 *      serviceUrl=https://skype.botframework.com,
 *      channelId=skype,
 *      from= {
 *          id=29:10F8FhTcEHm8uNsUxCPZeFF7ST3MkUq-CjjWSH62DKZY,
 *          name=Антон Лелюк
 *      },
 *      conversation={
 *          isGroup=false,
 *          id=29:10F8FhTcEHm8uNsUxCPZeFF7ST3MkUq-CjjWSH62DKZY
 *      },
 *      recipient={
 *          id=28:1a239996-a170-4c7f-9bd4-6502ec582f5e,
 *          name=SystemActivityMonitor
 *      },
 *      text=<ss type="wasntme">(wasntme)</ss>,
 *      entities=[]
 *  }
 *
 *
 *  {
 *      type=ping,
 *      timestamp=0001-01-01T00:00:00,
 *      serviceUrl=https://dev.botframework.com/,
 *      channelId=test,
 *      from={
 *          id=portal
 *      },
 *      conversation={
 *          id=ping
 *      },
 *      recipient={
 *          id=bot
 *      }
 *  }
 *
 *
 * @author Anton Leliuk
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public abstract class BaseMessage {

    /**
     * ID that uniquely identifies the activity on the channel.
     */
    private String id;

    private Date timestamp;

    private String serviceUrl;

    /**
     * An ID that uniquely identifies the channel. Set by the channel.
     */
    private String channelId;

    /**
     * Date and time that the message was sent in the local time zone, expressed in ISO-8601 format.
     */
    private Date localTimestamp;


    /**
     * Which event happened and what other fields to expect.
     * For message this field contains constant string: “message”
     * @return {@link ActivityType} type of an activity
     */
    public abstract ActivityType getActivity();

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    public String getServiceUrl() {
        return serviceUrl;
    }

    public void setServiceUrl(String serviceUrl) {
        this.serviceUrl = serviceUrl;
    }

    public String getChannelId() {
        return channelId;
    }

    public void setChannelId(String channelId) {
        this.channelId = channelId;
    }
}
