package com.traning.autodeal.service;

import com.traning.autodeal.entity.Model;

import java.util.List;

public interface ModelService {
    String NAME = "autodeal_ModelService";

    List<Model> getUnsoldModels();
}