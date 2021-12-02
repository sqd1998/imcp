package com.wh.pojo;
//设备产品对应表
public class Equipment_product {
    private int id;
    private int equipment_id;
    private int product_id;
    private int yield;
    private Integer unit;
    private int factory_id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getEquipment_id() {
        return equipment_id;
    }

    public void setEquipment_id(int equipment_id) {
        this.equipment_id = equipment_id;
    }

    public int getProduct_id() {
        return product_id;
    }

    public void setProduct_id(int product_id) {
        this.product_id = product_id;
    }

    public int getYield() {
        return yield;
    }

    public void setYield(int yield) {
        this.yield = yield;
    }

    public Integer getUnit() {
        return unit;
    }

    public void setUnit(Integer unit) {
        this.unit = unit;
    }

    public int getFactory_id() {
        return factory_id;
    }

    public void setFactory_id(int factory_id) {
        this.factory_id = factory_id;
    }

    @Override
    public String toString() {
        return "Equipment_product{" +
                "id=" + id +
                ", equipment_id=" + equipment_id +
                ", product_id=" + product_id +
                ", yield=" + yield +
                ", unit=" + unit +
                ", factory_id=" + factory_id +
                '}';
    }
}
