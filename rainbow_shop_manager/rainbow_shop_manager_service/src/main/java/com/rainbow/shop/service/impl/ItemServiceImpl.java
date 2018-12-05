package com.rainbow.shop.service.impl;

import com.rainbow.shop.mapper.TbItemMapper;
import com.rainbow.shop.pojo.TbItem;
import com.rainbow.shop.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItemServiceImpl implements ItemService {

    @Autowired
    private TbItemMapper itemMapper;

    @Override
    public TbItem getItemById(long itemId) {

        TbItem item = itemMapper.selectByPrimaryKey(itemId);
        //添加查询条件
//        TbItemExample example = new TbItemExample();
//        Criteria criteria = example.createCriteria();
//        criteria.andIdEqualTo(itemId);
//        List<TbItem> list = itemMapper.selectByExample(example);
//        if (list != null && list.size() > 0) {
//            TbItem item = list.get(0);
//            return item;
//        }
        return item;
    }


}
