package com.rainbow.shop.controller;

import com.rainbow.shop.pojo.TbItem;
import com.rainbow.shop.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ItemController {

    @Autowired
    private ItemService itemService;


//    responSeBody 注解作用：结果直接返回json格式到视图
    @RequestMapping("item/{itemId}")
    @ResponseBody
    public TbItem getItemById(@PathVariable Long itemId) {
        TbItem tbItem = itemService.getItemById(itemId);
        System.out.println("tbItem: "+tbItem);
        return tbItem;
    }


}
