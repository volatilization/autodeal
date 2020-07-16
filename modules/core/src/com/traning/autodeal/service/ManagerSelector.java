package com.traning.autodeal.service;

import com.haulmont.cuba.core.Persistence;
import com.haulmont.cuba.core.Query;
import com.traning.autodeal.entity.Manager;
import org.springframework.stereotype.Component;

import javax.inject.Inject;
import java.util.UUID;

@Component
public class ManagerSelector {

    @Inject
    private Persistence persistence;

    public Manager getManagerById(UUID managerId) {
        Query getManager = persistence.getEntityManager().createQuery(
                "select m from autodeal_Manager m where m.id = :managerId");
        getManager.setParameter("managerId", managerId);
        return (Manager) getManager.getFirstResult();
    }
}
