package com.wh.dao;

import com.wh.pojo.Product;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ProductMapper {
//    新建产品
    void addPro(Product product);
//    修改产品
    void editPro(Product product);
//    删除产品
    void delPro(Product product);
//    通过产品名查询产品
    List<Product> selProByName(@Param("proName") String proName);
//    查询所有产品
    List<Product> selAllPro();
}
