package com.traning.autodeal.service;

import com.haulmont.cuba.core.Persistence;
import com.haulmont.cuba.core.Query;
import org.springframework.stereotype.Component;

import javax.inject.Inject;
import java.util.UUID;

@Component
public class ManufacturerSelector {

    @Inject
    private Persistence persistence;

    public Integer getModelsAmount(UUID manufacturerId) {
        Query getModelsAmount = persistence.getEntityManager().createQuery(
                "select count(e) from autodeal_Model e where e.manufacturer.id = :manufacturer_id");
        getModelsAmount.setParameter("manufacturer_id", manufacturerId);
        return ((Long) getModelsAmount.getFirstResult()).intValue();
    }
}
