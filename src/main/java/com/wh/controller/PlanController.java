package com.wh.controller;

import com.wh.common.util.Result;
import com.wh.pojo.Product_plan;
import com.wh.service.PlanService;
import javafx.geometry.Pos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class PlanController {
    @Autowired
    private PlanService planService;

    //    生成计划
    @RequestMapping(value = "addPlan.action",method = RequestMethod.POST)
    @ResponseBody
    public Integer addPlan(Product_plan product_plan){
        planService.addPlan(product_plan);
        return 200;
    }
    //    修改计划
    @RequestMapping(value = "editPlan.action",method = RequestMethod.POST )
    @ResponseBody
    public Integer editPlan(Product_plan product_plan){
        planService.editPlan(product_plan);
        return 200;
    }
    //    删除计划
    @RequestMapping(value = "delPlan.action")
    @ResponseBody
    public Integer delPlan(Product_plan product_plan){
        System.out.print(product_plan.getId());
        planService.delPlan(product_plan);
        return 200;
    }
    //    查询所有计划
    @RequestMapping(value = "selAllPlan.action")
    @ResponseBody
    public Result selAllPlan(){
        List<Product_plan> planList = planService.selAllPlan();
        return new Result(0,"成功",100,planList);
    }
    //    按计划编号查询计划
    @RequestMapping(value = "selPlanBySeq.action")
    @ResponseBody
    public Result selPlanBySeq(Product_plan product_plan){
        List<Product_plan> planList = planService.selPlanBySep(product_plan);
        return new Result(0,"成功",100,planList);
    }
}
