package com.ayanasel.austin;

import cn.hutool.core.util.ObjectUtil;
import com.ayanasel.austin.pojo.SmsParam;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.java3y.austin.script.TencentSmsScript;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.HashSet;


@SpringBootApplication
@RestController
public class AustinApplication {

    @Autowired
    private TencentSmsScript tencentSmsScript;


    public static void main(String[] args) {
        SpringApplication.run(AustinApplication.class,args);
    }

    @GetMapping("/hello")
    public String hello() {

        SmsParam smsParam = SmsParam.builder()
                .phones(new HashSet<>(Arrays.asList("13719193845")))
                .content("3333")
                .build();

        return tencentSmsScript.send(smsParam);


    }



}
