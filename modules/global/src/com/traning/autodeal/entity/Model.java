package com.traning.autodeal.entity;

import com.haulmont.chile.core.annotations.Composition;
import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.cuba.core.entity.annotation.OnDelete;
import com.haulmont.cuba.core.global.DeletePolicy;

import javax.persistence.*;

@NamePattern("%s|name")
@Table(name = "AUTODEAL_MODEL")
@Entity(name = "autodeal_Model")
public class Model extends StandardEntity {
    private static final long serialVersionUID = -7075761022784252812L;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "MANUFACTURER_ID")
    protected Manufacturer manufacturer;

    @Composition
    @OnDelete(DeletePolicy.CASCADE)
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "COMPLECTATION_ID")
    protected Complectation complectation;

    @Column(name = "NAME")
    protected String name;

    public Complectation getComplectation() {
        return complectation;
    }

    public void setComplectation(Complectation complectation) {
        this.complectation = complectation;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Manufacturer getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(Manufacturer manufacturer) {
        this.manufacturer = manufacturer;
    }
}