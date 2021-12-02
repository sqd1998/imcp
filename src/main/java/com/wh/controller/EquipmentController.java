package com.wh.controller;

import com.wh.common.util.Result;
import com.wh.pojo.Equipment;
import com.wh.pojo.Equipment_product;
import com.wh.service.EquipmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class EquipmentController {
    @Autowired
    private EquipmentService equipmentService;

//    新建设备
    @RequestMapping(value = "addEqu.action")
    @ResponseBody
    public Integer addEqu(Equipment equipment){
        equipmentService.addEqu(equipment);
        return 200;
    }
//    修改设备
    @RequestMapping(value = "editEqu.action",method = RequestMethod.POST)
    @ResponseBody
    public Integer editEqu(Equipment equipment){
        equipmentService.editEqu(equipment);
        return 200;
    }
    //    删除设备
    @RequestMapping(value = "delEqu.action")
    @ResponseBody
    public Integer delEqu(Equipment equipment){
        equipmentService.delEqu(equipment);
        return 200;
    }
//        通过设备名字查找设备
    @RequestMapping(value = "selEquByName")
    @ResponseBody
    public List<Equipment> selEquByName(String selName){
        return equipmentService.selEquByName(selName);
}
//      查询所有设备
    @RequestMapping(value = "selAllEqu.action")
    @ResponseBody
    public Result selAllEqu(){
        List<Equipment> equipmentList = equipmentService.selAllEqu();
        return new Result(0,"成功",10,equipmentList);
    }
    //    添加产品设备对应
    @RequestMapping(value = "addEP.action")
    @ResponseBody
    public Integer addEP(Equipment_product equipment_product){
        equipmentService.addEP(equipment_product);
        return 200;
    }
    //    修改
    @RequestMapping(value = "editEP.action" ,method = RequestMethod.POST)
    @ResponseBody
    public Integer editEP(Equipment_product equipment_product){
        equipmentService.editEP(equipment_product);
        return 200;
    }
    //    删除
    @RequestMapping(value = "delEP.action")
    @ResponseBody
    public Integer delEP(Equipment_product equipment_product){
        equipmentService.delEP(equipment_product);
        return 200;
    }
    //    查询所有
    @RequestMapping(value = "selAllEP.action")
    @ResponseBody
    public Result selAllEP(){
        List<Equipment_product> equipment_productList = equipmentService.selAllEP();
        return new Result(0,"成功",100,equipment_productList);
    }
}
