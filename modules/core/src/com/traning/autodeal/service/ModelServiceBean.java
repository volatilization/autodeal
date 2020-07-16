package com.traning.autodeal.service;

import com.traning.autodeal.entity.Model;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.inject.Inject;
import java.util.List;

@Service(ModelService.NAME)
public class ModelServiceBean implements ModelService {

    @Inject
    private ModelSelector modelSelector;

    @Override
    @Transactional
    public List<Model> getUnsoldModels() {
        return modelSelector.getUnsoldModels();
    }
}