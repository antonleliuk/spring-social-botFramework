package com.skype.controller;

import java.io.IOException;
import java.io.StringWriter;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.social.botFramework.api.data.to.Activity;
import org.springframework.social.botFramework.api.data.to.Attachment;
import org.springframework.social.botFramework.api.data.to.ChannelAccount;
import org.springframework.social.botFramework.api.data.to.cards.CardAction;
import org.springframework.social.botFramework.api.data.to.cards.CardImage;
import org.springframework.social.botFramework.api.data.to.cards.HeroCard;
import org.springframework.social.botFramework.api.data.to.cards.SignInCard;
import org.springframework.social.common.api.ConnectorClient;
import org.springframework.social.common.api.dict.ActivityType;
import org.springframework.social.common.api.dict.CardActionType;
import org.springframework.social.common.api.dict.TextFormat;
import org.springframework.social.skypeBot.api.data.to.Message;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * @author Anton Leliuk
 */
@RestController
public class EchoController {

    @Autowired
    private ConnectorClient connectorClient;

    @Autowired
    private ObjectMapper objectMapper;

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
        try {
            StringWriter sw = new StringWriter();
            objectMapper.writer().writeValue(sw, from);
            System.out.println("Incoming message ------------");
            System.out.println(sw.toString());
            System.out.println("Incoming message ------------");
        } catch (IOException e) {
            e.printStackTrace();
        }
        if(!from.getActivity().isPing()){
            Activity replay = from.createReplay();
            replay.setType(ActivityType.text_message);
            replay.setText(from.getText());
            connectorClient.getBotFrameworkOperations().sendMessage(replay.getRecipient().getId(), replay);

            Activity card = from.createReplay();
            card.setType(ActivityType.card);
            card.setText("Simple card");
            card.setSummary("Summary of the card");
            card.setTextFormat(TextFormat.xml);
            HeroCard hc = new HeroCard();
            hc.setTitle("Hotel Radisson Blu Hotel at Disneyland (r) Paris.");
            hc.setSubtitle("Booked in the last 2 hours");
            hc.setText("Disneyland paris. 40 Aliee De la Mare dian Houleuse, Magny-le-Hongre, Seine-Marne.");
            CardImage ci = new CardImage();
            ci.setUrl("https://pp.vk.me/c7011/v7011856/29c82/BvJogtnQIfE.jpg");
            ci.setAlt("hello thumb");
            CardAction tap = new CardAction();
            tap.setType(CardActionType.openUrl);
            tap.setValue("https://en.wikipedia.org/wiki/Space_Needle");
            tap.setTitle("open");
            ci.setTap(tap);
            hc.getImages().add(ci);

            CardAction button = new CardAction();
            button.setTitle("Select");
            button.setValue("select:102");
            button.setType(CardActionType.imBack);
            hc.getButtons().add(button);


            Attachment<HeroCard> a = new Attachment<>();
            a.setContent(hc);
            a.setContentType(hc.getCardType().getType());
            card.addAttachment(a);

            SignInCard sc = new SignInCard();
            sc.setTitle("Sign title");
            sc.setText("Some text");
            sc.setSubtitle("Some subtitle");

            CardAction signInButton = new CardAction();
            signInButton.setTitle("signin");
            signInButton.setType(CardActionType.signin);
            signInButton.setValue("https://profitsoft.ua/uathesystem");
            sc.getButtons().add(signInButton);
            Attachment<SignInCard> sa = new Attachment<>();
            sa.setContent(sc);
            sa.setContentType(sc.getCardType().getType());
            card.addAttachment(sa);
            connectorClient.getBotFrameworkOperations().sendMessage(replay.getRecipient().getId(), card);
        }
    }

    @RequestMapping(value = "/to-bf", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void sendMessageToBotFramework(){
        Activity activity = new Activity();
        activity.setType(ActivityType.text_message);
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
