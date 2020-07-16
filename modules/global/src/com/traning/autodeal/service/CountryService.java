package com.traning.autodeal.service;

import com.traning.autodeal.entity.Country;

import java.util.UUID;

public interface CountryService {
    String NAME = "autodeal_CountryService";

    Country getDefaultCountry(UUID managerId);
}