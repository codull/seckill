package com.anthony1314.entity;

import java.util.Date;

/**
 * @program: seckill
 *
 * @description: 商品信息实体类
 *
 * @author: anthony1314
 *
 * @create: 2019-11-20 09:30
 **/

public class Seckill {
    //商品信息id
    private long seckillId;
    //商品姓名
    private String name;

    public long getSeckillId() {
        return seckillId;
    }

    public void setSeckillId(long seckillId) {
        this.seckillId = seckillId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    //商品数量
    private int number;
    //开始时间
    private Date startTime;
    //结束时间
    private Date endTime;
    //创造时间
    private Date createTime;
    @Override
    public String toString(){
        return "Seckill{" +
                "seckillId=" + seckillId +
                ", name='" + name + '\'' +
                ", number=" + number +
                ", startTime=" + startTime +
                ", endTime=" + endTime +
                ", createTime=" + createTime +
                '}';
    }



}
