package com.zhangyu.stock.mapper;

/**
 * 库存 mapper 接口
 *
 * @author zhangyu
 * @date 2023/2/22 10:40
 */
public interface StockMapper {

    boolean reduce(Integer productId);
}
