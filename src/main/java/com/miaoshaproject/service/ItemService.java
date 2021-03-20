package com.miaoshaproject.service;

import com.miaoshaproject.error.BusinessException;
import com.miaoshaproject.service.model.ItemModel;

import java.util.List;

/**
 * @author zr
 * @create 2021-03-20-13:54
 */
public interface ItemService {

    //创建商品
    public ItemModel createItem(ItemModel itemModel) throws BusinessException;

    //商品列表浏览
    public List<ItemModel> listItem();


    //商品详情浏览
    public ItemModel getItemById(Integer id);
}
