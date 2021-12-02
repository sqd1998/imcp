package com.wh.pojo;

import java.util.Date;
//用户表
public class User {
    private Integer id;
    private Integer flag;
    private String create_time;
    private Integer create_userid;
    private String update_time;
    private Integer update_userid;
    private Integer user_status;
    private String user_name;
    private String user_real_name;
    private String user_passwd;
    private String user_job_num;
    private String user_phone_num;
    private String user_email;
    private Integer role_id;
    private Integer factory_id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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

    public Integer getCreate_userid() {
        return create_userid;
    }

    public void setCreate_userid(Integer create_userid) {
        this.create_userid = create_userid;
    }

    public String getUpdate_time() {
        return update_time;
    }

    public void setUpdate_time(String update_time) {
        this.update_time = update_time;
    }

    public Integer getUpdate_userid() {
        return update_userid;
    }

    public void setUpdate_userid(Integer update_userid) {
        this.update_userid = update_userid;
    }

    public Integer getUser_status() {
        return user_status;
    }

    public void setUser_status(Integer user_status) {
        this.user_status = user_status;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getUser_real_name() {
        return user_real_name;
    }

    public void setUser_real_name(String user_real_name) {
        this.user_real_name = user_real_name;
    }

    public String getUser_passwd() {
        return user_passwd;
    }

    public void setUser_passwd(String user_passwd) {
        this.user_passwd = user_passwd;
    }

    public String getUser_job_num() {
        return user_job_num;
    }

    public void setUser_job_num(String user_job_num) {
        this.user_job_num = user_job_num;
    }

    public String getUser_phone_num() {
        return user_phone_num;
    }

    public void setUser_phone_num(String user_phone_num) {
        this.user_phone_num = user_phone_num;
    }

    public String getUser_email() {
        return user_email;
    }

    public void setUser_email(String user_email) {
        this.user_email = user_email;
    }

    public Integer getRole_id() {
        return role_id;
    }

    public void setRole_id(Integer role_id) {
        this.role_id = role_id;
    }

    public Integer getFactory_id() {
        return factory_id;
    }

    public void setFactory_id(Integer factory_id) {
        this.factory_id = factory_id;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", flag=" + flag +
                ", create_time=" + create_time +
                ", create_userid=" + create_userid +
                ", update_time=" + update_time +
                ", update_userid=" + update_userid +
                ", user_status=" + user_status +
                ", user_name='" + user_name + '\'' +
                ", user_real_name='" + user_real_name + '\'' +
                ", user_passwd='" + user_passwd + '\'' +
                ", user_job_num='" + user_job_num + '\'' +
                ", user_phone_num=" + user_phone_num +
                ", user_email='" + user_email + '\'' +
                ", role_id=" + role_id +
                ", factory_id=" + factory_id +
                '}';
    }
}
