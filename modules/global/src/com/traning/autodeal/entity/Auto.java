package com.traning.autodeal.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.cuba.core.entity.annotation.OnDelete;
import com.haulmont.cuba.core.global.DeletePolicy;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@NamePattern("%s|name")
@Table(name = "AUTODEAL_AUTO")
@Entity(name = "autodeal_Auto")
public class Auto extends StandardEntity {
    private static final long serialVersionUID = -4096695370760450455L;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "MANUFACTURER_ID")
    protected Manufacturer manufacturer;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "MODEL_ID")
    protected Model model;

    @OnDelete(DeletePolicy.CASCADE)
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "COMPLECTATION_ID")
    protected Complectation complectation;

    @Column(name = "NAME")
    protected String name;

    @Temporal(TemporalType.DATE)
    @Column(name = "YEAR_")
    protected Date year;

    @Column(name = "PRICE")
    protected BigDecimal price;

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Date getYear() {
        return year;
    }

    public void setYear(Date year) {
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Complectation getComplectation() {
        return complectation;
    }

    public void setComplectation(Complectation complectation) {
        this.complectation = complectation;
    }

    public Model getModel() {
        return model;
    }

    public void setModel(Model model) {
        this.model = model;
    }

    public Manufacturer getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(Manufacturer manufacturer) {
        this.manufacturer = manufacturer;
    }
}