package com.wh.dao;

import com.wh.pojo.Product_plan;

import java.util.List;

public interface PlanMapper {
//    生成计划
    void addPlan(Product_plan product_plan);
//    修改计划
    void editPlan(Product_plan product_plan);
//    删除计划
    void delPlan(Product_plan product_plan);
//    查询所有计划
    List<Product_plan> selAllPlan();
//    按计划编号查询计划
    List<Product_plan> selPlanBySeq(Product_plan product_plan);
}
