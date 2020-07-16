package com.traning.autodeal.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@NamePattern("%s|name")
@Table(name = "AUTODEAL_COUNTRY")
@Entity(name = "autodeal_Country")
public class Country extends StandardEntity {
    private static final long serialVersionUID = -567135804941451887L;

    @Column(name = "NAME")
    protected String name;

    @Column(name = "CODE", length = 6)
    protected Integer code;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}