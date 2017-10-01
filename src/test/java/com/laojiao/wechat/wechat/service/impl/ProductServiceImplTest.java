package com.laojiao.wechat.wechat.service.impl;

import com.laojiao.wechat.wechat.dataobject.ProductInfo;
import com.laojiao.wechat.wechat.service.ProductService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

/**
 * Created by Fant.J on 2017/9/26.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductServiceImplTest {
    @Autowired
    ProductService productService;
    @Test
    public void findOne() throws Exception {
    }

    @Test
    public void findUpAll() throws Exception {
        PageRequest request = new PageRequest(0,2);
        Page<ProductInfo> productInfos = productService.findAll(request);
        System.out.println(productInfos.getTotalElements());
    }

}