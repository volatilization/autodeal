package com.traning.autodeal.service;

import com.haulmont.cuba.core.Persistence;
import com.haulmont.cuba.core.Query;
import com.traning.autodeal.entity.Client;
import com.traning.autodeal.entity.client.Legal;
import com.traning.autodeal.entity.client.Phisical;
import com.traning.autodeal.entity.client.Type;
import org.springframework.stereotype.Component;

import javax.inject.Inject;
import java.util.UUID;

@Component
public class ClientTransferer {

    @Inject
    private Persistence persistence;

    public void saveClient(UUID instanceId, Type type) {
        Query checkExistingClient = persistence.getEntityManager().createQuery(
                "select c from autodeal_Client c where c.instanceid = :instanceId");
        checkExistingClient.setParameter("instanceId", instanceId);
        if (checkExistingClient.getResultList().isEmpty()) insertNewClient(instanceId, type);
    }

    private void insertNewClient(UUID instanceId, Type type) {
        Client client = new Client();
        client.setType(type);
        client.setInstanceid(instanceId);
        persistence.getEntityManager().persist(client);

//        Query insertQuery = persistence.getEntityManager().createQuery(
//                "insert into autodeal_Client (id, version, type, instanceid) values " +
//                            "(:uuid, :version, :type, :instanceId)");
//        insertQuery.setParameter("uuid", UUID.randomUUID());
//        insertQuery.setParameter("version", 1);
//        insertQuery.setParameter("type", type.getId());
//        insertQuery.setParameter("instanceId", instanceId);
//        insertQuery.getSingleResult();
    }


    public String getInstanceName(UUID clientId) {
        return getInstanceNameByClient(getClientById(clientId));
    }

    private Client getClientById(UUID clientId) {
        Query getClientById = persistence.getEntityManager().createQuery(
                "select c from autodeal_Client c where c.id = :clientId");
        getClientById.setParameter("clientId", clientId);
        return (Client) getClientById.getFirstResult();
    }

    private String getInstanceNameByClient(Client client) {
        if (client.getType().equals(Type.LEGAL)) {
            return getLegalInstanceById(client.getInstanceid()).getName();
        } else {
            return getPhisicalInstanceById(client.getInstanceid()).getName();
        }
    }

    private Legal getLegalInstanceById(UUID instanceId) {
        Query getLegalInstanceById = persistence.getEntityManager().createQuery(
                "select l from autodeal_Legal l where l.id = :instanceId");
        getLegalInstanceById.setParameter("instanceId", instanceId);
        return (Legal) getLegalInstanceById.getFirstResult();
    }

    private Phisical getPhisicalInstanceById(UUID instanceId) {
        Query getPhisicalInstanceById = persistence.getEntityManager().createQuery(
                "select p from autodeal_Phisical p where p.id = :instanceId");
        getPhisicalInstanceById.setParameter("instanceId", instanceId);
        return (Phisical) getPhisicalInstanceById.getFirstResult();
    }
}
