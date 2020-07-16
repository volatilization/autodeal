package com.traning.autodeal.service;

import com.traning.autodeal.entity.Country;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.inject.Inject;
import java.util.UUID;

@Service(CountryService.NAME)
public class CountryServiceBean implements CountryService {

    @Inject
    private CountrySelector countrySelector;

    @Override
    @Transactional
    public Country getDefaultCountry(UUID managerId) {
        return countrySelector.getCountry(managerId);
    }
}