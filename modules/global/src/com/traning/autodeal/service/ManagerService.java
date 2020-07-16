package com.traning.autodeal.service;

import com.traning.autodeal.entity.Manager;

import java.util.UUID;

public interface ManagerService {
    String NAME = "autodeal_ManagerService";

    Manager getManager(UUID managerId);
}