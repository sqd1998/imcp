package com.wh.controller;


import com.wh.common.util.Result;
import com.wh.pojo.Product;
import com.wh.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class ProductController {
    @Autowired
    private ProductService productService;
//    添加产品
    @RequestMapping(value = "/addPro.action",method = RequestMethod.POST)
    @ResponseBody
    public Integer addPro(Product product){
        productService.addPro(product);
        return 200;
    }
//    修改产品
    @RequestMapping(value = "editPro.action",method = RequestMethod.POST)
    @ResponseBody
    public Integer editPro(Product product){
        productService.editPro(product);
        return 200;
    }
//    删除产品
    @RequestMapping(value = "delPro.action")
    @ResponseBody
    public Integer delPro (Product product){
        productService.delPro(product);
        return 200;
    }
//    按产品名进行查询
    @RequestMapping(value = "selProByName.action")
    public void selProByName(String proName){
        List<Product> productList =  productService.selProByName(proName);
    }
    //    查询所有产品
    @RequestMapping(value = "selAllPro.action")
    @ResponseBody
    public Result selAllPro(Integer page, Integer limit){
        List<Product> productList =  productService.selAllPro();
        return new Result(0,"成功",10,productList);
    }
}
