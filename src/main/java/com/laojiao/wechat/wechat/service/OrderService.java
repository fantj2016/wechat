package com.laojiao.wechat.wechat.service;

/**
 * Created by Fant.J on 2017/10/1.
 */
public interface OrderService {
    public OrderDTO create(OrderDTO orderDTO);

    OrderDTO findOne(String orderId);
}
