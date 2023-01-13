package com.ayanasel.austin.kafkatest;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @Description 定义用户发送的日志数据
 * @author : Ayanasel
 * @date : 2023/1/13 20:21
 **/
@Data
// 当该值为 true 时，对应字段的 setter 方法调用后，会返回当前对象。
@Accessors(chain = true)
public class UserLog {
    private String username;
    private String userid;
    private String state;
}