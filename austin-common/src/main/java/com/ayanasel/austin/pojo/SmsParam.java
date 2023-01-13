package com.ayanasel.austin.pojo;

import lombok.Builder;
import lombok.Data;

import java.util.Set;

/**
 * 发送短信参数
 */
@Data
@Builder
public class SmsParam {

    /**
     * 需要发送的手机号
     */
    private Set<String> phones;

    /**
     * 发送文案
     */
    private String content;
}
