/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.anshu.bean;

/**
 *
 * @author HOME
 */
public class StudentBean {
    private int id;
    private String name;
    private String enroll;
    private float per;

    public StudentBean() {
    }
    public StudentBean(int id, String name, String enroll, float per) {
        this.id = id;
        this.name = name;
        this.enroll = enroll;
        this.per = per;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEnroll() {
        return enroll;
    }

    public void setEnroll(String enroll) {
        this.enroll = enroll;
    }

    public float getPer() {
        return per;
    }

    public void setPer(float per) {
        this.per = per;
    }

    
}
