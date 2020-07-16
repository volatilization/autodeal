package com.traning.autodeal.service;

import com.haulmont.cuba.core.Persistence;
import com.haulmont.cuba.core.Query;
import org.springframework.stereotype.Component;

import javax.inject.Inject;
import java.util.UUID;

@Component
public class BuyRequestCounter {

    @Inject
    private Persistence persistence;

    public Integer getRequestsAmount(UUID clientId) {
        Query query = persistence.getEntityManager().createQuery(
                "select count(r) from autodeal_BuyRequest r where r.client.id in (" +
                            "select c.id from autodeal_Client c where c.instanceid = :clientId)");
        query.setParameter("clientId", clientId);
        return ((Long) query.getFirstResult()).intValue();
    }
}
