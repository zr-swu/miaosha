package com.miaoshaproject.service.model;

import java.math.BigDecimal;

/**
 * 用户下单的交易模型
 * @author zr
 * @create 2021-03-20-16:17
 */
public class OrderModel {
    //2018102100012828
    private String id;

    private Integer userId;

    private Integer itemId;

    //购买商品的单价
    private BigDecimal itemPrice;

    //购买总数量
    private Integer amount;

    //购买金额
    private BigDecimal orderPrice;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getItemId() {
        return itemId;
    }

    public void setItemId(Integer itemId) {
        this.itemId = itemId;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public BigDecimal getOrderPrice() {
        return orderPrice;
    }

    public void setOrderPrice(BigDecimal orderPrice) {
        this.orderPrice = orderPrice;
    }

    public BigDecimal getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(BigDecimal itemPrice) {
        this.itemPrice = itemPrice;
    }
}
