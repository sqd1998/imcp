package com.wh.service;

import com.wh.pojo.Product_order;

import java.util.List;

public interface OrderService {
    //    新建产品订单
    void addProOrd(Product_order order);
    //    编辑产品订单
    void editProOrd(Product_order order);
    //    删除订单
    void delProOrd(Product_order order);
    //    查询所有订单
    List<Product_order> selAllProOrd();
    //    查询订单按照订单编号
    Product_order selProOrdByNum(Product_order order);

}
