package com.briup.crm.common.bean;

import java.io.Serializable;

public class SalPlan implements Serializable {
    /**
     * 编号
     */
    private Long plaId;

    /**
     * 销售机会编号
     */
    private Long plaChcId;

    /**
     * 计划项
     */
    private String plaTodo;

    /**
     * 执行结果
     */
    private String plaResult;

    private static final long serialVersionUID = 1L;

    public Long getPlaId() {
        return plaId;
    }

    public void setPlaId(Long plaId) {
        this.plaId = plaId;
    }

    public Long getPlaChcId() {
        return plaChcId;
    }

    public void setPlaChcId(Long plaChcId) {
        this.plaChcId = plaChcId;
    }

    public String getPlaTodo() {
        return plaTodo;
    }

    public void setPlaTodo(String plaTodo) {
        this.plaTodo = plaTodo == null ? null : plaTodo.trim();
    }

    public String getPlaResult() {
        return plaResult;
    }

    public void setPlaResult(String plaResult) {
        this.plaResult = plaResult == null ? null : plaResult.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", plaId=").append(plaId);
        sb.append(", plaChcId=").append(plaChcId);
        sb.append(", plaTodo=").append(plaTodo);
        sb.append(", plaResult=").append(plaResult);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}