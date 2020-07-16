package com.traning.autodeal.service;

import com.haulmont.cuba.core.Persistence;
import com.haulmont.cuba.core.Query;
import com.traning.autodeal.entity.Country;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.inject.Inject;
import java.util.UUID;

@Component
public class CountrySelector {

    @Value("${default.country.code}")
    private int defaultCountryCode;

    @Inject
    private Persistence persistence;

    public Country getCountry(UUID managerId) {
        Country result = getManagerCountry(managerId);
        if (result != null) return result;
        return getDefaultCountry();
    }

    private Country getManagerCountry(UUID managerId) {
        Query query = persistence.getEntityManager().createQuery(
                "select m.country from autodeal_Manager m where m.id = :managerId");
        query.setParameter("managerId", managerId);
        return (Country) query.getFirstResult();
    }

    private Country getDefaultCountry() {
        Query query = persistence.getEntityManager().createQuery(
                "select c from autodeal_Country c where c.code = :defaultCode");
        query.setParameter("defaultCode", defaultCountryCode);
        return (Country) query.getFirstResult();
    }
}
