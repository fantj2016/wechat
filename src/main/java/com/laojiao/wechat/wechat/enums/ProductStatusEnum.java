package com.laojiao.wechat.wechat.enums;

import lombok.Getter;

/**
 * Created by Fant.J on 2017/9/26.
 */
@Getter
public enum ProductStatusEnum {
    UP(0,"在线"),
    DOWN(1,"下架");

    private Integer code;

    private String message;

    ProductStatusEnum(Integer code,String message){
        this.code = code;
        this.message = message;
    }
}
