package com.laojiao.wechat.wechat.controller;

import VO.ProductInfoVO;
import VO.ProductVO;
import VO.ResultVO;
import com.laojiao.wechat.wechat.dataobject.ProductCategory;
import com.laojiao.wechat.wechat.dataobject.ProductInfo;
import com.laojiao.wechat.wechat.service.CategoryService;
import com.laojiao.wechat.wechat.service.ProductService;
import com.laojiao.wechat.wechat.util.ResultVOUtil;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by Fant.J on 2017/9/26.
 */
@RestController
@RequestMapping("/buyer/product")
public class BuyerProductController {

    @Autowired
    private ProductService productService;
    @Autowired
    private CategoryService categoryService;
    @GetMapping("/list")
    public ResultVO list(){
        //1.查询所有的上架商品
        List<ProductInfo> productInfoList = productService.findUpAll();

        //2.查询类目（一次性查询全部）
//        List<Integer> categoryTypeList = new ArrayList<>();
        //根据产品获取类目    传统方法
//        for (ProductInfo item:productInfoList){
//            categoryTypeList.add(item.getCategoryType());
//        }

        //java8 方法
        List<Integer> categoryTypeList = productInfoList.stream().map(e -> e.getCategoryType()).collect(Collectors.toList());
        List<ProductCategory> categoryList = categoryService.findByCategoryTypeIn(categoryTypeList);
        List<ProductVO> productVOList = new ArrayList<>();
        for (ProductCategory item:categoryList){
            ProductVO productVO = new ProductVO();
            productVO.setCategoryName(item.getCategoryName());
            productVO.setCategoryType(item.getCategoryType());

            List<ProductInfoVO> productInfoVOList = new ArrayList<>();
            for (ProductInfo productInfo:productInfoList){
                if (productInfo.getCategoryType().equals(item.getCategoryType())){
                    ProductInfoVO productInfoVO = new ProductInfoVO();
                    BeanUtils.copyProperties(productInfo,productInfoVO);
                    productInfoVOList.add(productInfoVO);
                }
                productVO.setProductInfoVOList(productInfoVOList);

            }
            productVOList.add(productVO);
        }
        //3.数据拼装

        return ResultVOUtil.success(productVOList);
    }

}
