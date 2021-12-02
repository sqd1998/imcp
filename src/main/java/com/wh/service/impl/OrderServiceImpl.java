package com.wh.service.impl;

import com.wh.dao.OrderMapper;
import com.wh.pojo.Product_order;
import com.wh.service.OrderService;

import java.util.List;

public class OrderServiceImpl implements OrderService {
    private OrderMapper mapper;
    @Override
    public void addProOrd(Product_order order) {
        mapper.addProOrd(order);
    }

    @Override
    public void editProOrd(Product_order order) {
        mapper.editProOrd(order);
    }

    @Override
    public void delProOrd(Product_order order) {
        mapper.delProOrd(order);
    }

    @Override
    public List<Product_order> selAllProOrd() {
        return mapper.selAllProOrd();
    }

    @Override
    public Product_order selProOrdByNum(Product_order order) {
        return mapper.selProOrdByNum(order);
    }

    public OrderMapper getMapper() {
        return mapper;
    }

    public void setMapper(OrderMapper mapper) {
        this.mapper = mapper;
    }
}
