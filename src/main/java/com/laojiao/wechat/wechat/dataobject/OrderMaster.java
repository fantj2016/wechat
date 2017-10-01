package com.laojiao.wechat.wechat.dataobject;

import com.laojiao.wechat.wechat.enums.OrderStatusEnum;
import com.laojiao.wechat.wechat.enums.PayStatusEnum;
import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by Fant.J on 2017/10/1.
 */
@Entity
@Data
@DynamicUpdate
public class OrderMaster {
    /** 订单id.*/
    @Id
    private String orderId;
    /** 买家名字.*/
    private String buyerName;
    /** 买家手机号.*/
    private String buyerPhone;
    /** 买家地址 */
    private String buyerAddress;
    /** 买家openid */
    private String buyerOpenid;
    /** 订单金额 */
    private BigDecimal orderAmount;
    /** 订单状态，默认0为新下单 */
    private Integer orderStatus = OrderStatusEnum.NEW.getCode();
    /** 支付状态，默认0为未支付 */
    private Integer payStatus = PayStatusEnum.WAIT.getCode();
    /** 创建时间 */
    private Date createTime;
    /** 修改时间 */
    private Date updateTime;
}
