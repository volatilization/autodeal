package com.traning.autodeal.service;

import com.traning.autodeal.entity.Manager;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.inject.Inject;
import java.util.UUID;

@Service(ManagerService.NAME)
public class ManagerServiceBean implements ManagerService {

    @Inject
    private ManagerSelector managerSelector;

    @Override
    @Transactional
    public Manager getManager(UUID managerId) {
        return managerSelector.getManagerById(managerId);
    }
}