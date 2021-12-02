package com.wh.service.impl;

import com.wh.dao.PlanMapper;
import com.wh.pojo.Product_plan;
import com.wh.service.PlanService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class PlanServiceImpl implements PlanService {
    private PlanMapper mapper;
    @Override
    public void addPlan(Product_plan product_plan) {
        mapper.addPlan(product_plan);
    }

    @Override
    public void editPlan(Product_plan product_plan) {
        mapper.editPlan(product_plan);
    }

    @Override
    public void delPlan(Product_plan product_plan) {
        mapper.delPlan(product_plan);
    }

    @Override
    public List<Product_plan> selAllPlan() {
        return mapper.selAllPlan();
    }

    @Override
    public List<Product_plan> selPlanBySep(Product_plan product_plan) {
        return mapper.selPlanBySeq(product_plan);
    }

    public PlanMapper getMapper() {
        return mapper;
    }

    public void setMapper(PlanMapper mapper) {
        this.mapper = mapper;
    }
}
