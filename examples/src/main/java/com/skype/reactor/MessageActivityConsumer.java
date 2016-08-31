package com.skype.reactor;

import org.springframework.social.botFramework.api.data.Activity;
import org.springframework.social.botFramework.api.data.Attachment;
import org.springframework.social.botFramework.api.data.cards.CardAction;
import org.springframework.social.botFramework.api.data.cards.CardImage;
import org.springframework.social.botFramework.api.data.cards.Fact;
import org.springframework.social.botFramework.api.data.cards.HeroCard;
import org.springframework.social.botFramework.api.data.cards.ReceiptCard;
import org.springframework.social.botFramework.api.data.cards.ReceiptItem;
import org.springframework.social.botFramework.api.data.cards.SignInCard;
import org.springframework.social.botFramework.api.data.cards.ThumbnailCard;
import org.springframework.social.botFramework.api.dict.ActivityType;
import org.springframework.social.botFramework.api.dict.AttachmentLayout;
import org.springframework.social.botFramework.api.dict.CardActionType;
import org.springframework.social.botFramework.api.dict.TextFormat;
import org.springframework.social.botFramework.reactor.consumer.AbstractActivityConsumer;

/**
 * @author Anton Leliuk
 */
public class MessageActivityConsumer extends AbstractActivityConsumer {

    @Override
    protected void acceptInternal(Activity activity) {
        Activity replay = activity.createReplay().textMessage(activity.getText());
        botFramework.sendToConversation(replay.getRecipient().getId(), replay);

        Activity card = activity.createReplay()
                .card()
                .attachmentLayout(AttachmentLayout.carousel)
                .text("Simple card")
                .summary("Summary of the card")
                .textFormat(TextFormat.xml);

        HeroCard hc = new HeroCard()
                .title("Hotel Radisson Blu Hotel at Disneyland (r) Paris.")
                .subTitle("Booked in the last 2 hours")
                .text("Disneyland paris. 40 Aliee De la Mare dian Houleuse, Magny-le-Hongre, Seine-Marne.");
        CardImage ci = new CardImage()
                .url("https://pp.vk.me/c7011/v7011856/29c82/BvJogtnQIfE.jpg")
                .alt("hello thumb")
                .tap(new CardAction()
                        .type(CardActionType.openUrl)
                        .value("https://en.wikipedia.org/wiki/Space_Needle")
                        .title("open"));
        hc.addImage(ci);

        hc.addButton(new CardAction().title("Select").value("select:102").type(CardActionType.imBack));

        card.addAttachment(hc.toAttachment());
        botFramework.sendToConversation(card.getRecipient().getId(), card);

        card = activity.createReplay();
        card.setAttachmentLayout(AttachmentLayout.carousel);
        card.setType(ActivityType.card);
        card.setText("Simple signIn card");
        card.setSummary("Summary of the signIn card");
        card.setTextFormat(TextFormat.xml);

        SignInCard sc = new SignInCard();
        sc.setTitle("Sign title");
        sc.setText("Some text");
        sc.setSubTitle("Some subtitle");

        CardAction signInButton = new CardAction();
        signInButton.setTitle("signin");
        signInButton.setType(CardActionType.signin);
        signInButton.setValue("https://profitsoft.ua/uathesystem");
        sc.getButtons().add(signInButton);
        Attachment<SignInCard> sa = new Attachment<>();
        sa.setContent(sc);
        sa.setContentType(sc.getCardType().getType());
        card.addAttachment(sa);
        botFramework.sendToConversation(card.getRecipient().getId(), card);

        card = activity.createReplay();
        card.setAttachmentLayout(AttachmentLayout.carousel);
        card.setType(ActivityType.card);
        card.setText("Simple thumbnail card");
        card.setSummary("Summary of the thumbnail card");
        card.setTextFormat(TextFormat.xml);

        ThumbnailCard tc = new ThumbnailCard();
        tc.setTitle("Title");
        tc.setText("Text");
        tc.setSubTitle("Sub title");

        CardAction tcButton = new CardAction();
        tcButton.setType(CardActionType.openUrl);
        tcButton.setTitle("view");
        tcButton.setValue("https://pp.vk.me/c7011/v7011856/29c82/BvJogtnQIfE.jpg");
        tc.getButtons().add(tcButton);

        Attachment<ThumbnailCard> ta = new Attachment<>();
        ta.setContent(tc);
        ta.setContentType(tc.getCardType().getType());
        card.addAttachment(ta);
        botFramework.sendToConversation(card.getRecipient().getId(), card);

        card = activity.createReplay();
        card.setAttachmentLayout(AttachmentLayout.carousel);
        card.setType(ActivityType.card);
        card.setText("Simple receipt card");
        card.setSummary("Summary of the receipt card");
        card.setTextFormat(TextFormat.xml);

        ReceiptCard rc = new ReceiptCard();
        rc.setTitle("Title");
        rc.setText("Text");
        rc.setSubTitle("Sub title");

        Fact f = new Fact();
        f.setKey("Some key");
        f.setValue("Some value");
        rc.getFacts().add(f);

        ReceiptItem ri = new ReceiptItem();
        CardImage rci = new CardImage();
        rci.setUrl("https://pp.vk.me/c7011/v7011856/29c82/BvJogtnQIfE.jpg");
        rci.setAlt("alt text");
        ri.setImage(rci);
        ri.setQuantity(1);
        ri.setPrice("100 uah");
        rc.getItems().add(ri);
        rc.setTax("TAX: 150 uah");
        rc.setVat("VAT: 200 uah");
        rc.setTotal("TOTAL: 350 uah");

        Attachment<ReceiptCard> ra = new Attachment<>();
        ra.setContent(rc);
        ra.setContentType(rc.getCardType().getType());
        card.addAttachment(ra);

        botFramework.sendToConversation(card.getConversation().getId(), card);
    }

}
