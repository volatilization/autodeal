package com.traning.autodeal.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.inject.Inject;
import java.util.UUID;

@Service(ManufacturerService.NAME)
public class ManufacturerServiceBean implements ManufacturerService {

    @Inject
    private ManufacturerSelector manufacturerSelector;

    @Override
    @Transactional
    public Integer getModelsAmount(UUID manufacturerId) {
        return manufacturerSelector.getModelsAmount(manufacturerId);
    }
}