package com.traning.autodeal.entity;

import com.haulmont.cuba.core.entity.annotation.Extends;
import com.haulmont.cuba.security.entity.User;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity(name = "autodeal_Manager")
public class Manager extends User {
    private static final long serialVersionUID = 638665866696400915L;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "COUNTRY_ID")
    protected Country country;

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }
}