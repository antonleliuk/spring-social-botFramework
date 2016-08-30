package com.skype.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.social.botFramework.api.data.Activity;
import org.springframework.social.botFramework.service.BotService;
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
    private BotService botService;

    @RequestMapping(value = "/signIn")
    public void signIn(){
    }

    @RequestMapping(value = "/bf-chat", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void botFrameworkChat(@RequestBody Activity from){
        botService.reply(from);
    }
}
