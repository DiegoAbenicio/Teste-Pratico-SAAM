/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.diego.entity;

import java.math.BigDecimal;
import java.util.Date;

/**
 *
 * @author diego
 */
public class Employees {
    
    private Integer id;
    private String name;
    private Boolean status;
    private BigDecimal remuneration; 
    private Date admissionDate;

    public Employees(String name, Boolean status, BigDecimal remuneration, Date admissionDate){
        setName(name);
        setRemuneration(remuneration);
        setAdmissionDate(admissionDate);
        setStatus(status);
    }
    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public BigDecimal getRemuneration() {
        return remuneration;
    }

    public void setRemuneration(BigDecimal remuneration) {
        this.remuneration = remuneration;
    }

    public Date getAdmissionDate() {
        return admissionDate;
    }

    public void setAdmissionDate(Date admissionDate) {
        this.admissionDate = admissionDate;
    }
    
    
}
