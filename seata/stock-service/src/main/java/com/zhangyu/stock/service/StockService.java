package com.zhangyu.stock.service;

/**
 * 库存 svc
 *
 * @author zhangyu
 * @date 2023/2/22 10:33
 */
public interface StockService {

    boolean reduce(Integer productId);
}
