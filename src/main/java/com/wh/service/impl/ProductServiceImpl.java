package com.wh.service.impl;

import com.wh.dao.ProductMapper;
import com.wh.pojo.Product;
import com.wh.service.ProductService;

import java.util.List;

public class ProductServiceImpl implements ProductService {
    private ProductMapper mapper;
    @Override
    public void addPro(Product product) {
        mapper.addPro(product);
    }

    @Override
    public void editPro(Product product) {
        mapper.editPro(product);
    }

    @Override
    public void delPro(Product product) {
        mapper.delPro(product);
    }

    @Override
    public List<Product> selProByName(String proName) {
        return mapper.selProByName(proName);
    }

    @Override
    public List<Product> selAllPro() {
        return mapper.selAllPro();
    }

    public ProductMapper getMapper() {
        return mapper;
    }

    public void setMapper(ProductMapper mapper) {
        this.mapper = mapper;
    }
}
