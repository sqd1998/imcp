package com.wh.service;

import com.wh.pojo.Equipment;
import com.wh.pojo.Equipment_product;

import java.util.List;

public interface EquipmentService {
//    新建设备
    void addEqu(Equipment equipment);
//    修改设备
    void editEqu(Equipment equipment);
    //    删除设备
    void delEqu(Equipment equipment);
//    通过名字查找设备
    List<Equipment> selEquByName(String selName);
    //    查询所有设备
    List<Equipment> selAllEqu();
    //    添加产品设备对应
    void addEP(Equipment_product equipment_product);
    //    修改
    void editEP(Equipment_product equipment_product);
    //    删除
    void delEP(Equipment_product equipment_product);
    //    查询所有
    List<Equipment_product> selAllEP();
}
