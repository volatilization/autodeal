package com.traning.autodeal.service;

import com.traning.autodeal.entity.client.Type;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.inject.Inject;
import java.util.UUID;

@Service(ClientService.NAME)
public class ClientServiceBean implements ClientService {

    @Inject
    private ClientTransferer clientTransferer;

    @Override
    @Transactional
    public void saveClient(UUID instanceId, Type type) {
        clientTransferer.saveClient(instanceId, type);
    }

    @Override
    @Transactional
    public String getInstanceName(UUID clientId) {
        return clientTransferer.getInstanceName(clientId);
    }
}