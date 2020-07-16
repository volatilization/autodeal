package com.traning.autodeal.service;

import java.util.UUID;

public interface BuyRequestService {
    String NAME = "autodeal_BuyRequestService";

    Integer getRequestsAmount(UUID clientId);
}