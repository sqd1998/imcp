package com.wh.controller;

import com.wh.common.util.Result;
import com.wh.pojo.Product_order;
import com.wh.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class OrderController {
    @Autowired
    private OrderService orderService;
//    添加订单
    @RequestMapping(value = "addProOrd.action")
    @ResponseBody
    public Integer addProOrd(Product_order product_order){
        product_order.setOrder_seq("o"+System.currentTimeMillis());
        orderService.addProOrd(product_order);
        return 200;
    }
    //    编辑产品订单
    @RequestMapping(value = "editProOrd.action",method = RequestMethod.POST)
    @ResponseBody
    public Integer editProOrd(Product_order order){
        orderService.editProOrd(order);
        return 200;
    }
    //    删除订单
    @RequestMapping(value = "delProOrd.action")
    @ResponseBody
    public Integer delProOrd(Product_order order){
        orderService.delProOrd(order);
        return 200;
    }
    //    查询所有订单
    @RequestMapping(value = "selAllProOrd.action")
    @ResponseBody
    public Result selAllProOrd(){
        List<Product_order> orderList = orderService.selAllProOrd();
        return new Result(0,"成功",100,orderList);
    }
    //    查询订单按照订单编号
    @RequestMapping(value = "selProOrdByNum",method = RequestMethod.POST)
    @ResponseBody
    public Result selProOrdByNum(Product_order order){
        Product_order product_order = orderService.selProOrdByNum(order);
        return new Result(0,"成功",100,product_order);
    }
}
