package com.traning.autodeal.entity.client;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@NamePattern("%s|name")
@Table(name = "AUTODEAL_PHISICAL")
@Entity(name = "autodeal_Phisical")
public class Phisical extends StandardEntity {
    private static final long serialVersionUID = 4980368335115247052L;

    @Column(name = "NAME")
    protected String name;

    @Column(name = "PHONE")
    protected String phone;

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPhone() {
        return phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}