package com.wh.pojo;

import java.util.Date;
//生产计划表
public class Product_plan {
    private int id;
    private Integer flag;
    private String create_time;
    private int create_userid;
    private String update_time;
    private int update_userid;
    private String plan_seq;
    private int order_id;
    private int product_id;
    private Integer plan_count;
    private String delivery_date;
    private String plan_start_date;
    private String plan_end_date;
    private Integer plan_status;
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

    public String getPlan_seq() {
        return plan_seq;
    }

    public void setPlan_seq(String plan_seq) {
        this.plan_seq = plan_seq;
    }

    public int getOrder_id() {
        return order_id;
    }

    public void setOrder_id(int order_id) {
        this.order_id = order_id;
    }

    public int getProduct_id() {
        return product_id;
    }

    public void setProduct_id(int product_id) {
        this.product_id = product_id;
    }

    public Integer getPlan_count() {
        return plan_count;
    }

    public void setPlan_count(Integer plan_count) {
        this.plan_count = plan_count;
    }

    public String getDelivery_date() {
        return delivery_date;
    }

    public void setDelivery_date(String delivery_date) {
        this.delivery_date = delivery_date;
    }

    public String getPlan_start_date() {
        return plan_start_date;
    }

    public void setPlan_start_date(String plan_start_date) {
        this.plan_start_date = plan_start_date;
    }

    public String getPlan_end_date() {
        return plan_end_date;
    }

    public void setPlan_end_date(String plan_end_date) {
        this.plan_end_date = plan_end_date;
    }

    public Integer getPlan_status() {
        return plan_status;
    }

    public void setPlan_status(Integer plan_status) {
        this.plan_status = plan_status;
    }

    public int getFactory_id() {
        return factory_id;
    }

    public void setFactory_id(int factory_id) {
        this.factory_id = factory_id;
    }

    @Override
    public String toString() {
        return "Product_plan{" +
                "id=" + id +
                ", flag=" + flag +
                ", create_time=" + create_time +
                ", create_userid=" + create_userid +
                ", update_time=" + update_time +
                ", update_userid=" + update_userid +
                ", plan_seq='" + plan_seq + '\'' +
                ", order_id=" + order_id +
                ", product_id=" + product_id +
                ", plan_count=" + plan_count +
                ", delivery_date=" + delivery_date +
                ", plan_start_date=" + plan_start_date +
                ", plan_end_date=" + plan_end_date +
                ", plan_status=" + plan_status +
                ", factory_id=" + factory_id +
                '}';
    }
}
