package com.wh.pojo;

import java.util.Date;
//订单跟踪表
public class Order_track {
    private int id;
    private Integer flag;
    private String create_time;
    private int create_userid;
    private String update_time;
    private int update_userid;
    private int schedule_id;
    private int plan_id;
    private int product_id;
    private Integer working_count;
    private Integer qualified_count;
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

    public int getSchedule_id() {
        return schedule_id;
    }

    public void setSchedule_id(int schedule_id) {
        this.schedule_id = schedule_id;
    }

    public int getPlan_id() {
        return plan_id;
    }

    public void setPlan_id(int plan_id) {
        this.plan_id = plan_id;
    }

    public int getProduct_id() {
        return product_id;
    }

    public void setProduct_id(int product_id) {
        this.product_id = product_id;
    }

    public Integer getWorking_count() {
        return working_count;
    }

    public void setWorking_count(Integer working_count) {
        this.working_count = working_count;
    }

    public Integer getQualified_count() {
        return qualified_count;
    }

    public void setQualified_count(Integer qualified_count) {
        this.qualified_count = qualified_count;
    }

    public int getFactory_id() {
        return factory_id;
    }

    public void setFactory_id(int factory_id) {
        this.factory_id = factory_id;
    }

    @Override
    public String toString() {
        return "Order_track{" +
                "id=" + id +
                ", flag=" + flag +
                ", create_time=" + create_time +
                ", create_userid=" + create_userid +
                ", update_time=" + update_time +
                ", update_userid=" + update_userid +
                ", schedule_id=" + schedule_id +
                ", plan_id=" + plan_id +
                ", product_id=" + product_id +
                ", working_count=" + working_count +
                ", qualified_count=" + qualified_count +
                ", factory_id=" + factory_id +
                '}';
    }
}
