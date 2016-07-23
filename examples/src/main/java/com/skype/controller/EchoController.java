package com.skype.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.social.botFramework.api.data.to.Activity;
import org.springframework.social.botFramework.api.data.to.ChannelAccount;
import org.springframework.social.common.api.ConnectorClient;
import org.springframework.social.common.api.dict.ActivityType;
import org.springframework.social.skypeBot.api.data.to.Message;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Anton Leliuk
 */
@RestController
public class EchoController {

    @Autowired
    private ConnectorClient connectorClient;

    @RequestMapping(value = "/chat", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void chat(@RequestBody List<org.springframework.social.skypeBot.api.data.from.Message> messages){
        for (org.springframework.social.skypeBot.api.data.from.Message message : messages) {
            Message toSkype = new Message();
            toSkype.setContent(message.getContent());
            System.out.println(message.getContent());
            connectorClient.getSkypeBotOperations().sendMessage(message.getFrom(), toSkype);
        }
    }

    @RequestMapping(value = "/bf-chat", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void botFrameworkChat(@RequestBody Activity from){
        Activity replay = from.createReplay();
        replay.setType(ActivityType.message);
        replay.setText(from.getText());
        connectorClient.getBotFrameworkOperations().sendMessage(replay.getRecipient().getId(), replay);
    }

    @RequestMapping(value = "/to-bf", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void sendMessageToBotFramework(){
        Activity activity = new Activity();
        activity.setType(ActivityType.message);
        activity.setServiceUrl("https://skype.botframework.com");
        activity.setChannelId("skype");
        ChannelAccount recipient = new ChannelAccount();
        recipient.setId("29:10F8FhTcEHm8uNsUxCPZeFF7ST3MkUq-CjjWSH62DKZY");
        recipient.setName("Anton Leliuk");
        activity.setRecipient(recipient);
        ChannelAccount from = new ChannelAccount();
        from.setName("SystemActivityMonitor");
        from.setId("28:1a239996-a170-4c7f-9bd4-6502ec582f5e");
        activity.setFrom(from);
        activity.setText("Hello from BotFramework");
        Object o = connectorClient.getBotFrameworkOperations().sendMessage("29:10F8FhTcEHm8uNsUxCPZeFF7ST3MkUq-CjjWSH62DKZY", activity);
    }

//    @RequestMapping(value = "/chat/attachment/{skypeId}", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
//    public void attachment(@PathVariable("skypeId") String skypeId){
//        Attachment attachment = new Attachment();
//        attachment.setType(AttachmentType.Image);
//        attachment.setName("testPicture");
//        attachment.setOriginalBase64();
//        attachment.setThumbnailBase64();
//        skypeBot.sendAttachment(skypeId, attachment);
//    }
}
