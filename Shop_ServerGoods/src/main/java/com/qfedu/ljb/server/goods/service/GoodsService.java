package com.qfedu.ljb.server.goods.service;

import com.qfedu.common.vo.R;

import java.util.Map;

/**
 *@Author feri
 *@Date Created in 2019/6/19 09:56
 */
public interface GoodsService {
    R queryIndexNew();
    R queryPage(Map<String,String> map);
    R queryDetail(int id);

}
