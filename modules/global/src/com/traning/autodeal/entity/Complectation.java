package com.traning.autodeal.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Lob;
import javax.persistence.Table;
import java.math.BigDecimal;

@NamePattern("%s|name")
@Table(name = "AUTODEAL_COMPLECTATION")
@Entity(name = "autodeal_Complectation")
public class Complectation extends StandardEntity {
    private static final long serialVersionUID = 8184776674174064252L;

    @Column(name = "NAME")
    protected String name;

    @Column(name = "PRICE")
    protected BigDecimal price;

    @Column(name = "TYPE_")
    protected Integer type;

    @Lob
    @Column(name = "NOTE")
    protected String note;

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public Type getType() {
        return type == null ? null : Type.fromId(type);
    }

    public void setType(Type type) {
        this.type = type == null ? null : type.getId();
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}