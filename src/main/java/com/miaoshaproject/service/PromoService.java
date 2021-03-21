package com.miaoshaproject.service;

import com.miaoshaproject.service.model.PromoModel;

/**
 * @author zr
 * @create 2021-03-21-10:08
 */
public interface PromoService {

    /**
     * 提供按itemId查询 即将进行或正在进行的 商品活动的接口
     * 返回一个活动模型
     * @param itemId
     * @return
     */
    PromoModel getPromoByItemId(Integer itemId);
}
