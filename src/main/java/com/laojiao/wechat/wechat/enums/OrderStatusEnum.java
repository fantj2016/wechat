package com.laojiao.wechat.wechat.enums;

import lombok.Getter;

/**
 * Created by Fant.J on 2017/10/1.
 */
@Getter
public enum OrderStatusEnum {
    NEW(0,"新订单"),
    FINISHED(1,"完结"),
    CANCEL(2,"取消"),
    ;
    private Integer code;

    private String message;


    OrderStatusEnum(int i, String s) {
        this.code = i;
        this.message = s;
    }
}
