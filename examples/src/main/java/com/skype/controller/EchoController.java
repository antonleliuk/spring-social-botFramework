package com.skype.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.social.skypeBot.api.SkypeBot;
import org.springframework.social.skypeBot.api.data.from.Message;
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
    public void chat(@RequestBody Message fromSkype){

        org.springframework.social.skypeBot.api.data.to.Message toSkype = new org.springframework.social.skypeBot.api.data.to.Message();
        toSkype.setContent(fromSkype.getContent());
        skypeBot.sendMessage(fromSkype.getFrom(), toSkype);
    }
}
