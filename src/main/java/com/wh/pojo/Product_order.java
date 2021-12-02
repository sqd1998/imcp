package com.wh.pojo;

import java.util.Date;
//产品订单表
public class Product_order {
    private int id;
    private Integer flag;
    private String create_time;
    private int create_userid;
    private String update_time;
    private int update_userid;
    private String order_seq;
    private Integer order_source;
    private int product_id;
    private Integer product_count;
    private String end_date;
    private Integer order_status;
    private int factory_id;
    private int factory_yield;

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

    public String getOrder_seq() {
        return order_seq;
    }

    public void setOrder_seq(String order_seq) {
        this.order_seq = order_seq;
    }

    public Integer getOrder_source() {
        return order_source;
    }

    public void setOrder_source(Integer order_source) {
        this.order_source = order_source;
    }

    public int getProduct_id() {
        return product_id;
    }

    public void setProduct_id(int product_id) {
        this.product_id = product_id;
    }

    public Integer getProduct_count() {
        return product_count;
    }

    public void setProduct_count(Integer product_count) {
        this.product_count = product_count;
    }

    public String getEnd_date() {
        return end_date;
    }

    public void setEnd_date(String end_date) {
        this.end_date = end_date;
    }

    public Integer getOrder_status() {
        return order_status;
    }

    public void setOrder_status(Integer order_status) {
        this.order_status = order_status;
    }

    public int getFactory_id() {
        return factory_id;
    }

    public void setFactory_id(int factory_id) {
        this.factory_id = factory_id;
    }

    public int getFactory_yield() {
        return factory_yield;
    }

    public void setFactory_yield(int factory_yield) {
        this.factory_yield = factory_yield;
    }

    @Override
    public String toString() {
        return "Product_order{" +
                "id=" + id +
                ", flag=" + flag +
                ", create_time=" + create_time +
                ", create_userid=" + create_userid +
                ", update_time=" + update_time +
                ", update_userid=" + update_userid +
                ", order_seq='" + order_seq + '\'' +
                ", order_source=" + order_source +
                ", product_id=" + product_id +
                ", product_count=" + product_count +
                ", end_date=" + end_date +
                ", order_status=" + order_status +
                ", factory_id=" + factory_id +
                ", factory_yield=" + factory_yield +
                '}';
    }
}
