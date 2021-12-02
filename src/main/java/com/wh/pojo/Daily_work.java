package com.wh.pojo;

import java.util.Date;
//报工表
public class Daily_work {
    private int id;
    private Integer flag;
    private String create_time;
    private int create_userid;
    private String update_time;
    private int update_userid;
    private int schedule_id;
    private int equipment_id;
    private String equipment_seq;
    private String start_time;
    private String end_time;
    private Integer working_count;
    private Integer qualified_count;
    private Integer unqualified_count;
    private Integer complete_flag;
    private int factory_id;
    private String bak;

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

    public int getEquipment_id() {
        return equipment_id;
    }

    public void setEquipment_id(int equipment_id) {
        this.equipment_id = equipment_id;
    }

    public String getEquipment_seq() {
        return equipment_seq;
    }

    public void setEquipment_seq(String equipment_seq) {
        this.equipment_seq = equipment_seq;
    }

    public String getStart_time() {
        return start_time;
    }

    public void setStart_time(String start_time) {
        this.start_time = start_time;
    }

    public String getEnd_time() {
        return end_time;
    }

    public void setEnd_time(String end_time) {
        this.end_time = end_time;
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

    public Integer getUnqualified_count() {
        return unqualified_count;
    }

    public void setUnqualified_count(Integer unqualified_count) {
        this.unqualified_count = unqualified_count;
    }

    public Integer getComplete_flag() {
        return complete_flag;
    }

    public void setComplete_flag(Integer complete_flag) {
        this.complete_flag = complete_flag;
    }

    public int getFactory_id() {
        return factory_id;
    }

    public void setFactory_id(int factory_id) {
        this.factory_id = factory_id;
    }

    public String getBak() {
        return bak;
    }

    public void setBak(String bak) {
        this.bak = bak;
    }

    @Override
    public String toString() {
        return "Daily_work{" +
                "id=" + id +
                ", flag=" + flag +
                ", create_time=" + create_time +
                ", create_userid=" + create_userid +
                ", update_time=" + update_time +
                ", update_userid=" + update_userid +
                ", schedule_id=" + schedule_id +
                ", equipment_id=" + equipment_id +
                ", equipment_seq='" + equipment_seq + '\'' +
                ", start_time=" + start_time +
                ", end_time=" + end_time +
                ", working_count=" + working_count +
                ", qualified_count=" + qualified_count +
                ", unqualified_count=" + unqualified_count +
                ", complete_flag=" + complete_flag +
                ", factory_id=" + factory_id +
                ", bak='" + bak + '\'' +
                '}';
    }
}
