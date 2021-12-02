package com.wh.dao;

import com.wh.pojo.Equipment;
import com.wh.pojo.Equipment_product;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface EquipmentMapper {
//    新建设备
    void addEqu(Equipment equipment);
//    修改设备
    void editEqu(Equipment equipment);
//    删除设备
    void delEqu(Equipment equipment);
//    查询设备
    List<Equipment> selEquByName(@Param("selName") String selName);
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
//    查询按照设备名
//    List<Equipment_product> selEPByProName(@Param("eProName") String eProName);
}
