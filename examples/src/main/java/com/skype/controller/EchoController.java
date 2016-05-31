package com.skype.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.social.skypeBot.api.SkypeBot;
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
    private SkypeBot skypeBot;

    @RequestMapping(value = "/chat", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void chat(@RequestBody List<org.springframework.social.skypeBot.api.data.from.Message> messages){
        for (org.springframework.social.skypeBot.api.data.from.Message message : messages) {
            Message toSkype = new Message();
            toSkype.setContent(message.getContent());
            System.out.println(message.getContent());
            skypeBot.sendMessage(message.getFrom(), toSkype);
        }

    }
}
