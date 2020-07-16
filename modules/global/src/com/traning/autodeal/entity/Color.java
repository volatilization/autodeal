package com.traning.autodeal.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@NamePattern("%s|name")
@Table(name = "AUTODEAL_COLOR")
@Entity(name = "autodeal_Color")
public class Color extends StandardEntity {
    private static final long serialVersionUID = -3131905899660247324L;

    @NotNull
    @Column(name = "NAME", nullable = false, unique = true)
    protected String name;

    @NotNull
    @Column(name = "CODE", nullable = false, unique = true)
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