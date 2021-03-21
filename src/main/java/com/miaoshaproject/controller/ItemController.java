package com.miaoshaproject.controller;

import com.miaoshaproject.controller.viewobject.ItemVO;
import com.miaoshaproject.error.BusinessException;
import com.miaoshaproject.response.CommonReturnType;
import com.miaoshaproject.service.ItemService;
import com.miaoshaproject.service.model.ItemModel;
import org.joda.time.format.DateTimeFormat;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.math.BigDecimal;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author zr
 * @create 2021-03-20-14:37
 */

@Controller(value = "item")
@RequestMapping(value = "/item")
public class ItemController extends BaseController{

    @Autowired
    private ItemService itemService;


    @RequestMapping(value = "/create",method = RequestMethod.POST,consumes = CONTENT_TYPE_FORMED)
    @ResponseBody
    //创建商品的controller
    public CommonReturnType createItem(@RequestParam(name = "title") String title,
                                       @RequestParam(name = "description") String description,
                                       @RequestParam(name = "price") BigDecimal price,
                                       @RequestParam(name = "stock") Integer stock,
                                       @RequestParam(name = "imgUrl") String imgUrl) throws BusinessException {

        //封装service请求 用来创建商品
        //封装service请求用来创建商品
        ItemModel itemModel = new ItemModel();
        itemModel.setTitle(title);
        itemModel.setDescription(description);
        itemModel.setPrice(price);
        itemModel.setStock(stock);
        itemModel.setImgUrl(imgUrl);

        ItemModel itemModelForReturn = itemService.createItem(itemModel);

        ItemVO itemVO = convertVOFromItemModel(itemModelForReturn);

        return CommonReturnType.create(itemVO,"success");

    }

    //商品详情页浏览
    @RequestMapping(value = "/get",method = RequestMethod.GET)
    @ResponseBody
    public CommonReturnType getItem(@RequestParam(name = "id") Integer id){
        ItemModel itemModel = itemService.getItemById(id);

        ItemVO itemVO = convertVOFromItemModel(itemModel);

        return CommonReturnType.create(itemVO);
    }

    //商品列表页浏览
    @RequestMapping(value = "/list",method = RequestMethod.GET)
    @ResponseBody
    public CommonReturnType listItem(){
        List<ItemModel> itemModelList = itemService.listItem();
        List<ItemVO> itemVOList = itemModelList.stream().map(itemModel -> {
            ItemVO itemVO = convertVOFromItemModel(itemModel);
            return itemVO;
        }).collect(Collectors.toList());

        return CommonReturnType.create(itemVOList);
    }

    private ItemVO convertVOFromItemModel(ItemModel itemModel){
        if(itemModel==null)
            return null;

        ItemVO itemVO = new ItemVO();
        BeanUtils.copyProperties(itemModel,itemVO );

        if(itemModel.getPromoModel()!=null){//有正在或即将进行的活动
            itemVO.setPromoId(itemModel.getPromoModel().getId());
            itemVO.setStartDate(itemModel.getPromoModel().getStartDate().toString(DateTimeFormat.forPattern("yyyy-MM-dd HH:mm:ss")));
            itemVO.setPromoStatus(itemModel.getPromoModel().getStatus());
            itemVO.setPromoPrice(itemModel.getPromoModel().getPromoItemPrice());
        }else{
            itemVO.setPromoStatus(0);
        }
        return itemVO;
    }
}
