package com.example.seckill.vo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
@AllArgsConstructor
public enum RespBeanEnum {
    SUCCESS(200,"SUCCESS"),
    ERROR(500,"服务端异常"),
    LOGIN_ERROR(500210,"用户名或密码错误"),
    MOBILE_ERROR(500211,"手机号码格式不正确"),
    BIND_ERROR(500211,"手机号码格式不正确"),
    EMPTY_STOCK(500500,"库存不足"),
    REPEATE_ERROR(500501,"该商品没人限购一件"),
    SESSION_ERROR(500215,"用户不存在"),
    ORDER_NOT_EXIST(500300,"订单信息不存在");
    private final Integer code;
    private final String message;
}
