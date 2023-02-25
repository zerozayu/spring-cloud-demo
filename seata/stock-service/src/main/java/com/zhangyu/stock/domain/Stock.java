package com.zhangyu.stock.domain;

import lombok.Data;

import java.io.Serializable;

/**
 * 库存实体类
 *
 * @author zhangyu
 * @date 2023/2/22 10:23
 */
@Data
public class Stock implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer id;

    private Integer productId;

    private Integer count;
}
