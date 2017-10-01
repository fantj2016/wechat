package com.laojiao.wechat.wechat.exception;

import com.laojiao.wechat.wechat.enums.ResultEnum;

/**
 * Created by Fant.J on 2017/10/1.
 */
public class SellExceprion extends RuntimeException{
    private Integer code;

    public SellExceprion(ResultEnum resultEnum){
        //把resultEnum.getMessage() 传到父类方法里
        super(resultEnum.getMessage());
        this.code = resultEnum.getCode();
    }
}
