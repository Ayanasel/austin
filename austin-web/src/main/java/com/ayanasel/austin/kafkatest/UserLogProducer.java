package com.ayanasel.austin.kafkatest;

import com.alibaba.fastjson.JSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

/**
 * @author : Ayanasel
 * @date : 2023/1/13 20:27
 **/
@Component
public class UserLogProducer {

    @Autowired
    private KafkaTemplate kafkaTemplate;

    public void sendLog(String userid) {
        UserLog userLog = new UserLog();
        userLog.setUsername("jhp").setUserid(userid).setState("0");
        System.out.println("发送用户日志数据：" + userLog);
        kafkaTemplate.send("austin", JSON.toJSONString(userLog));
    }

}
