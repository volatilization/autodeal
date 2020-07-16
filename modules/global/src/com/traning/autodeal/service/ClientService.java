package com.traning.autodeal.service;

import com.traning.autodeal.entity.client.Type;

import java.util.UUID;

public interface ClientService {
    String NAME = "autodeal_ClientService";

    void saveClient(UUID instanceId, Type type);

    String getInstanceName(UUID clientId);
}