package com.traning.autodeal.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.*;
import java.math.BigDecimal;

@NamePattern("%s|sold")
@Table(name = "AUTODEAL_BUY_REQUEST")
@Entity(name = "autodeal_BuyRequest")
public class BuyRequest extends StandardEntity {
    private static final long serialVersionUID = -2439320304231003966L;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "AUTO_ID")
    protected Auto auto;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CLIENT_ID")
    protected Client client;

    @Column(name = "SOLD")
    protected Boolean sold;

    @Column(name = "PRICE")
    protected BigDecimal price;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "MANAGER_ID")
    protected Manager manager;

    public Manager getManager() {
        return manager;
    }

    public void setManager(Manager manager) {
        this.manager = manager;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Boolean getSold() {
        return sold;
    }

    public void setSold(Boolean sold) {
        this.sold = sold;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Auto getAuto() {
        return auto;
    }

    public void setAuto(Auto auto) {
        this.auto = auto;
    }
}