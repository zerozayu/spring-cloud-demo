package com.zhangyu.order.domain;

import lombok.*;

import java.math.BigDecimal;

/**
 * 订单实体类
 *
 * @author zhangyu
 * @date 2023/2/22 23:01
 */
@Data
public class Order {

    private Integer id;

    private Integer productId;

    private BigDecimal totalAmount;

    private Integer status;

}
