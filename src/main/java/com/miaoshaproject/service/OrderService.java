package com.miaoshaproject.service;

import com.miaoshaproject.error.BusinessException;
import com.miaoshaproject.service.model.OrderModel;

/**
 * @author zr
 * @create 2021-03-20-16:45
 */
public interface OrderService {

    public OrderModel createOrder(Integer userId,Integer itemId,Integer amount) throws BusinessException;
}
