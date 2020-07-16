package com.traning.autodeal.entity;

import com.haulmont.cuba.core.entity.StandardEntity;
import com.traning.autodeal.entity.client.Type;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.UUID;

@Table(name = "AUTODEAL_CLIENT")
@Entity(name = "autodeal_Client")
public class Client extends StandardEntity {
    private static final long serialVersionUID = -3414522527630639383L;

    @Column(name = "TYPE_")
    protected Integer type;

    @Column(name = "INSTANCEID")
    protected UUID instanceid;

    public UUID getInstanceid() {
        return instanceid;
    }

    public void setInstanceid(UUID instanceid) {
        this.instanceid = instanceid;
    }

    public void setType(Type type) {
        this.type = type == null ? null : type.getId();
    }

    public Type getType() {
        return type == null ? null : Type.fromId(type);
    }

}