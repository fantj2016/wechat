package com.laojiao.wechat.wechat.repository;

import com.laojiao.wechat.wechat.dataobject.ProductCategory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.transaction.Transactional;

import java.util.Arrays;
import java.util.List;

/**
 * Created by SuperJohn on 2017/9/3.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductCategoryRepositoryTest {


    @Autowired
    private ProductCategoryRepository repository;
    @Test
    public void findByCategoryTypeIn() throws Exception {
        List<Integer> list = Arrays.asList(1,2,3);
        List<ProductCategory> results = repository.findByCategoryTypeIn(list);
        for(ProductCategory item:results){
            System.out.println(item.toString());
        }

    }
    @Test
    @Transactional
    public void insertProductCategory(){
        ProductCategory productCategory = new ProductCategory();
        productCategory.setCategoryId(8);
        productCategory.setCategoryName("老焦专栏");
        productCategory.setCategoryType(4);
        repository.save(productCategory);
    }

}