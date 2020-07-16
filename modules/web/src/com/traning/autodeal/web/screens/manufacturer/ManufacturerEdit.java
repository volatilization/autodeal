package com.traning.autodeal.web.screens.manufacturer;

import com.haulmont.cuba.gui.screen.*;
import com.haulmont.cuba.security.global.UserSession;
import com.traning.autodeal.entity.Manufacturer;
import com.traning.autodeal.service.CountryService;

import javax.inject.Inject;

@UiController("autodeal_Manufacturer.edit")
@UiDescriptor("manufacturer-edit.xml")
@EditedEntityContainer("manufacturerDc")
@LoadDataBeforeShow
public class ManufacturerEdit extends StandardEditor<Manufacturer> {

    @Inject
    private CountryService countryService;

    @Inject
    private UserSession userSession;

    @Subscribe
    public void onBeforeCommitChanges(BeforeCommitChangesEvent event) {
        getEditedEntity().setCountry(countryService.getDefaultCountry(userSession.getUser().getUuid()));
        event.resume();
    }
}