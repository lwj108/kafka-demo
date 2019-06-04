package com.example.kafkademo.controller;

import com.example.kafkademo.provider.KafkaSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by liweijun
 * on 2019-06-04 15:12
 **/
@RestController
@RequestMapping("/kafka")
public class SendController {

    @Autowired
    private KafkaSender kafkaSender;

    @RequestMapping(value = "/send")
    public String send(){
        kafkaSender.send();
        return "{\"code\":0}";
    }
}
