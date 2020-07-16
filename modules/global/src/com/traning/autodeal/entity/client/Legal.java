package com.traning.autodeal.entity.client;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Lob;
import javax.persistence.Table;

@NamePattern("%s|name")
@Table(name = "AUTODEAL_LEGAL")
@Entity(name = "autodeal_Legal")
public class Legal extends StandardEntity {
    private static final long serialVersionUID = -6105459646904028357L;

    @Column(name = "NAME")
    protected String name;

    @Lob
    @Column(name = "INN_ADDRESS")
    protected String inn_address;

    public String getInn_address() {
        return inn_address;
    }

    public void setInn_address(String inn_address) {
        this.inn_address = inn_address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}