package com.wh.service.impl;

import com.wh.dao.EquipmentMapper;
import com.wh.pojo.Equipment;
import com.wh.pojo.Equipment_product;
import com.wh.service.EquipmentService;

import java.util.List;


public class EquipmentServiceImpl implements EquipmentService {
    private EquipmentMapper mapper;
//   新建设备
    @Override
    public void addEqu(Equipment equipment) {
        mapper.addEqu(equipment);
    }
//修改设备
    @Override
    public void editEqu(Equipment equipment) {
        mapper.editEqu(equipment);
    }
//删除设备
    @Override
    public void delEqu(Equipment equipment) {
        mapper.delEqu(equipment);
    }
    //    通过名字查找设备
    @Override
    public List<Equipment> selEquByName(String selName) {
        return mapper.selEquByName(selName);
    }

    @Override
    public List<Equipment> selAllEqu() {
        return mapper.selAllEqu();
    }

    @Override
    public void addEP(Equipment_product equipment_product) {
        mapper.addEP(equipment_product);
    }

    @Override
    public void editEP(Equipment_product equipment_product) {
        mapper.editEP(equipment_product);
    }

    @Override
    public void delEP(Equipment_product equipment_product) {
        mapper.delEP(equipment_product);
    }

    @Override
    public List<Equipment_product> selAllEP() {
        return mapper.selAllEP();
    }

    public EquipmentMapper getMapper() {
        return mapper;
    }

    public void setMapper(EquipmentMapper mapper) {
        this.mapper = mapper;
    }
}
