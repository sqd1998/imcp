package com.wh.pojo;

import java.util.Date;
//设备表
public class Equipment {
    private int id;
    private Integer flag;
    private String create_time;
    private int create_userid;
    private String update_time;
    private int update_userid;
    private String equipment_seq;
    private String equipment_name;
    private String equipment_img_url;
    private Integer equipment_status;
    private int factory_id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Integer getFlag() {
        return flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }

    public String getCreate_time() {
        return create_time;
    }

    public void setCreate_time(String create_time) {
        this.create_time = create_time;
    }

    public int getCreate_userid() {
        return create_userid;
    }

    public void setCreate_userid(int create_userid) {
        this.create_userid = create_userid;
    }

    public String getUpdate_time() {
        return update_time;
    }

    public void setUpdate_time(String update_time) {
        this.update_time = update_time;
    }

    public int getUpdate_userid() {
        return update_userid;
    }

    public void setUpdate_userid(int update_userid) {
        this.update_userid = update_userid;
    }

    public String getEquipment_seq() {
        return equipment_seq;
    }

    public void setEquipment_seq(String equipment_seq) {
        this.equipment_seq = equipment_seq;
    }

    public String getEquipment_name() {
        return equipment_name;
    }

    public void setEquipment_name(String equipment_name) {
        this.equipment_name = equipment_name;
    }

    public String getEquipment_img_url() {
        return equipment_img_url;
    }

    public void setEquipment_img_url(String equipment_img_url) {
        this.equipment_img_url = equipment_img_url;
    }

    public Integer getEquipment_status() {
        return equipment_status;
    }

    public void setEquipment_status(Integer equipment_status) {
        this.equipment_status = equipment_status;
    }

    public int getFactory_id() {
        return factory_id;
    }

    public void setFactory_id(int factory_id) {
        this.factory_id = factory_id;
    }

    @Override
    public String toString() {
        return "Equipment{" +
                "id=" + id +
                ", flag=" + flag +
                ", create_time=" + create_time +
                ", create_userid=" + create_userid +
                ", update_time=" + update_time +
                ", update_userid=" + update_userid +
                ", equipment_seq='" + equipment_seq + '\'' +
                ", equipment_name='" + equipment_name + '\'' +
                ", equipment_img_url='" + equipment_img_url + '\'' +
                ", equipment_status=" + equipment_status +
                ", factory_id=" + factory_id +
                '}';
    }
}
