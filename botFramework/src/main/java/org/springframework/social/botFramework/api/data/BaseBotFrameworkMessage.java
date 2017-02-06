package org.springframework.social.botFramework.api.data;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * Base BotFramework message
 * @author Anton Leliuk
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public abstract class BaseBotFrameworkMessage extends BaseMessage {

    /**
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
     */

    private Date timestamp;

    private String serviceUrl;

    private String channelId;


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
