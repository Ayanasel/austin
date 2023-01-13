package com.ayanasel.austin.kafkatest;

import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import java.util.Optional;

/**
 * @author : Ayanasel
 * @date : 2023/1/13 20:23
 **/
@Component
@Slf4j
public class UserLogConsumer {
    @KafkaListener(topics = {"austin"},groupId = "austinGroup1")
    public void consumer(ConsumerRecord<?,?> consumerRecord) {
        // 判断是否为null
        Optional<?> kafkaMessage = Optional.ofNullable(consumerRecord.value());
        log.info(">>>>>>>>> record = " + kafkaMessage);
        if (kafkaMessage.isPresent()) {
            // 得到 Optional 实例中的值
            Object message = kafkaMessage.get();
            System.out.println("消费消息 ： " + message);
        }
    }
}
