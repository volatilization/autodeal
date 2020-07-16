package com.traning.autodeal.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@NamePattern("%s|name")
@Table(name = "AUTODEAL_MANUFACTURER")
@Entity(name = "autodeal_Manufacturer")
public class Manufacturer extends StandardEntity {
    private static final long serialVersionUID = 1221314460607075131L;

    @NotNull
    @Column(name = "NAME", nullable = false, unique = true)
    protected String name;

    @Column(name = "CODE", nullable = false, unique = true)
    protected @NotNull Integer code;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "COUNTRY_ID")
    protected Country country;

    public void setCode(Integer code) {
        this.code = code;
    }

    public Integer getCode() {
        return code;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}