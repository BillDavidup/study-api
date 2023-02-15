package com.dening.study.api.mybatis.dao.model;

import java.io.Serializable;
import java.time.LocalDateTime;
import lombok.Data;

/**
 * learn_person
 * @author 
 */
@Data
public class LearnPersonModel implements Serializable {
    /**
     * 自增主健
     */
    private Long id;

    /**
     * 姓氏
     */
    private String firstName;

    /**
     * 名
     */
    private String name;

    /**
     * 年龄
     */
    private Integer age;

    /**
     * 身份证唯一编号
     */
    private String idNum;

    /**
     * 出生时间
     */
    private LocalDateTime birthTime;

    /**
     * 工作状态,0:未入职 1:已入职未入场 2:已入职入场 3:离职
     */
    private Integer workStatus;

    /**
     * 软删除,0:未删除 1:已删除
     */
    private Integer isDel;

    /**
     * 更新时间,单位秒
     */
    private Integer createTime;

    /**
     * 出生时间,单位秒
     */
    private Integer updateTime;

    private static final long serialVersionUID = 1L;

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        LearnPersonModel other = (LearnPersonModel) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getFirstName() == null ? other.getFirstName() == null : this.getFirstName().equals(other.getFirstName()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getAge() == null ? other.getAge() == null : this.getAge().equals(other.getAge()))
            && (this.getIdNum() == null ? other.getIdNum() == null : this.getIdNum().equals(other.getIdNum()))
            && (this.getBirthTime() == null ? other.getBirthTime() == null : this.getBirthTime().equals(other.getBirthTime()))
            && (this.getWorkStatus() == null ? other.getWorkStatus() == null : this.getWorkStatus().equals(other.getWorkStatus()))
            && (this.getIsDel() == null ? other.getIsDel() == null : this.getIsDel().equals(other.getIsDel()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getFirstName() == null) ? 0 : getFirstName().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getAge() == null) ? 0 : getAge().hashCode());
        result = prime * result + ((getIdNum() == null) ? 0 : getIdNum().hashCode());
        result = prime * result + ((getBirthTime() == null) ? 0 : getBirthTime().hashCode());
        result = prime * result + ((getWorkStatus() == null) ? 0 : getWorkStatus().hashCode());
        result = prime * result + ((getIsDel() == null) ? 0 : getIsDel().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", firstName=").append(firstName);
        sb.append(", name=").append(name);
        sb.append(", age=").append(age);
        sb.append(", idNum=").append(idNum);
        sb.append(", birthTime=").append(birthTime);
        sb.append(", workStatus=").append(workStatus);
        sb.append(", isDel=").append(isDel);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}