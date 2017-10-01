package com.laojiao.wechat.wechat.dto;

import lombok.Data;

import java.math.BigDecimal;

/**
 * Created by Fant.J on 2017/10/1.
 */
@Data
public class OrderDTO {

    /**订单*/
    private String orderId;
    /***/
    private String buyerName;
    /***/
    private String buyerPhone;
    /***/
    private String buyerAddress;
    /***/
    private String buyerOpenid;
    /***/
    private BigDecimal orderAmount;
    /***/
    private Integer orderStatus;
    /***/
    private Integer payStatus;
    /***/

}
