package com.traning.autodeal.service;

import com.haulmont.cuba.core.Persistence;
import com.haulmont.cuba.core.Query;
import com.traning.autodeal.entity.Model;
import org.springframework.stereotype.Component;

import javax.inject.Inject;
import java.util.List;

@Component
public class ModelSelector {

    @Inject
    private Persistence persistence;

    public List<Model> getUnsoldModels() {
        Query unsoldModels = persistence.getEntityManager().createQuery(
                "select m from autodeal_Model m where m.id in (" +
                            "select a.model.id from autodeal_Auto a where a.id in (" +
                                "select e.id from autodeal_BuyRequest e where e.sold = false))");
        return unsoldModels.getResultList();
    }
}
