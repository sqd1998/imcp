package com.wh.pojo;
//权限表
public class Permit {
    private int id;
    private Integer flag;
    private Integer status;
    private int parent_id;
    private String permit_name;
    private String permit_desc;
    private String permit_path;

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

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public int getParent_id() {
        return parent_id;
    }

    public void setParent_id(int parent_id) {
        this.parent_id = parent_id;
    }

    public String getPermit_name() {
        return permit_name;
    }

    public void setPermit_name(String permit_name) {
        this.permit_name = permit_name;
    }

    public String getPermit_desc() {
        return permit_desc;
    }

    public void setPermit_desc(String permit_desc) {
        this.permit_desc = permit_desc;
    }

    public String getPermit_path() {
        return permit_path;
    }

    public void setPermit_path(String permit_path) {
        this.permit_path = permit_path;
    }

    @Override
    public String toString() {
        return "Permit{" +
                "id=" + id +
                ", flag=" + flag +
                ", status=" + status +
                ", parent_id=" + parent_id +
                ", permit_name='" + permit_name + '\'' +
                ", permit_desc='" + permit_desc + '\'' +
                ", permit_path='" + permit_path + '\'' +
                '}';
    }
}
