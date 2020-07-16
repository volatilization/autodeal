package com.traning.autodeal.service;

import java.util.UUID;

public interface ManufacturerService {
    String NAME = "autodeal_ManufacturerService";

    Integer getModelsAmount(UUID manufacturerId);
}