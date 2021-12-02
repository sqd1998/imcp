package com.wh.pojo;

import java.util.Date;
//工厂定义表
public class Factory {
    private int id;
    private Integer flag;
    private String create_time;
    private int create_userid;
    private String update_time;
    private int update_userid;
    private String bak;
    private String factory_name;
    private String factory_img_url;
    private String factory_addr;
    private String factory_url;
    private Integer factory_worker;
    private Integer factory_status;

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

    public String getBak() {
        return bak;
    }

    public void setBak(String bak) {
        this.bak = bak;
    }

    public String getFactory_name() {
        return factory_name;
    }

    public void setFactory_name(String factory_name) {
        this.factory_name = factory_name;
    }

    public String getFactory_img_url() {
        return factory_img_url;
    }

    public void setFactory_img_url(String factory_img_url) {
        this.factory_img_url = factory_img_url;
    }

    public String getFactory_addr() {
        return factory_addr;
    }

    public void setFactory_addr(String factory_addr) {
        this.factory_addr = factory_addr;
    }

    public String getFactory_url() {
        return factory_url;
    }

    public void setFactory_url(String factory_url) {
        this.factory_url = factory_url;
    }

    public Integer getFactory_worker() {
        return factory_worker;
    }

    public void setFactory_worker(Integer factory_worker) {
        this.factory_worker = factory_worker;
    }

    public Integer getFactory_status() {
        return factory_status;
    }

    public void setFactory_status(Integer factory_status) {
        this.factory_status = factory_status;
    }

    @Override
    public String toString() {
        return "Factory{" +
                "id=" + id +
                ", flag=" + flag +
                ", create_time=" + create_time +
                ", create_userid=" + create_userid +
                ", update_time=" + update_time +
                ", update_userid=" + update_userid +
                ", bak='" + bak + '\'' +
                ", factory_name='" + factory_name + '\'' +
                ", factory_img_url='" + factory_img_url + '\'' +
                ", factory_addr='" + factory_addr + '\'' +
                ", factory_url='" + factory_url + '\'' +
                ", factory_worker=" + factory_worker +
                ", factory_status=" + factory_status +
                '}';
    }
}
