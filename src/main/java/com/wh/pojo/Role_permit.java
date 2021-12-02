package com.wh.pojo;

import java.util.Date;
//角色权限对应表
public class Role_permit {
    private int id;
    private Integer flag;
    private String create_time;
    private int create_userid;
    private String update_time;
    private int update_userid;
    private int factory_id;
    private int role_id;
    private int permit_id;

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

    public int getFactory_id() {
        return factory_id;
    }

    public void setFactory_id(int factory_id) {
        this.factory_id = factory_id;
    }

    public int getRole_id() {
        return role_id;
    }

    public void setRole_id(int role_id) {
        this.role_id = role_id;
    }

    public int getPermit_id() {
        return permit_id;
    }

    public void setPermit_id(int permit_id) {
        this.permit_id = permit_id;
    }

    @Override
    public String toString() {
        return "Role_permit{" +
                "id=" + id +
                ", flag=" + flag +
                ", create_time=" + create_time +
                ", create_userid=" + create_userid +
                ", update_time=" + update_time +
                ", update_userid=" + update_userid +
                ", factory_id=" + factory_id +
                ", role_id=" + role_id +
                ", permit_id=" + permit_id +
                '}';
    }
}
