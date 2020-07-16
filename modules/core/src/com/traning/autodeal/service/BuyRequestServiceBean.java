package com.traning.autodeal.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.inject.Inject;
import java.util.UUID;

@Service(BuyRequestService.NAME)
public class BuyRequestServiceBean implements BuyRequestService {

    @Inject
    private BuyRequestCounter buyRequestCounter;

    @Override
    @Transactional
    public Integer getRequestsAmount(UUID clientId) {
        return buyRequestCounter.getRequestsAmount(clientId);
    }
}