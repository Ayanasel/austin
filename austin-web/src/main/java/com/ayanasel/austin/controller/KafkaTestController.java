package com.ayanasel.austin.controller;

import com.ayanasel.austin.kafkatest.UserLogProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : Ayanasel
 * @date : 2023/1/13 20:20
 **/
@RestController
public class KafkaTestController {

    @Autowired
    private UserLogProducer userLogProducer;

    @GetMapping("/kafka/insert")
    public String insert(String userId) {
        userLogProducer.sendLog(userId);

        return null;
    }

}
