package com.laojiao.wechat.wechat.service;

import com.laojiao.wechat.wechat.dataobject.ProductCategory;

import java.util.List;

/**
 * Created by SuperJohn on 2017/9/3.
 */
public interface CategoryService {

    ProductCategory findOne(Integer categoryId);

    List<ProductCategory> findAll();

    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);

    ProductCategory save(ProductCategory productCategory);
}
