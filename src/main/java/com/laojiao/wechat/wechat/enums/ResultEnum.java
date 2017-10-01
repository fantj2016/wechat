package com.laojiao.wechat.wechat.enums;

import lombok.Getter;

/**
 * Created by Fant.J on 2017/10/1.
 */
@Getter
public enum ResultEnum {

    PRODUCT_NOT_EXIST(10,"商品不存在"),
    ;

    private Integer code;

    private String message;

    ResultEnum(int i, String s) {
        this.code = i;
        this.message = s;
    }
}
