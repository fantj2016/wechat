package com.laojiao.wechat.wechat.service;

import com.laojiao.wechat.wechat.dataobject.ProductInfo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * Created by Fant.J on 2017/9/26.
 */
public interface ProductService {
    //查询某个产品详情
    ProductInfo findOne(String productId);
    //查询商品列表
    List<ProductInfo> findUpAll();

    Page<ProductInfo> findAll(Pageable pageable);

    ProductInfo save(ProductInfo productInfo);

    //加库存

    //减库存

}
