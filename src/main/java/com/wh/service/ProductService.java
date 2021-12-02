package com.wh.service;

import com.wh.pojo.Product;

import java.util.List;

public interface ProductService {
    //    新建产品
    void addPro(Product product);
    //    修改产品
    void editPro(Product product);
    //    删除产品
    void delPro(Product product);
    //    查询产品
    List<Product> selProByName(String proName);
    //    查询所有产品
    List<Product> selAllPro();
}
