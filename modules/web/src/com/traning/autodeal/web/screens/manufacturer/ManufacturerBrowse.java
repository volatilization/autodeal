package com.traning.autodeal.web.screens.manufacturer;

import com.haulmont.cuba.gui.UiComponents;
import com.haulmont.cuba.gui.components.Component;
import com.haulmont.cuba.gui.components.GroupTable;
import com.haulmont.cuba.gui.components.Label;
import com.haulmont.cuba.gui.screen.*;
import com.traning.autodeal.entity.Manufacturer;
import com.traning.autodeal.service.ManufacturerService;

import javax.inject.Inject;

@UiController("autodeal_Manufacturer.browse")
@UiDescriptor("manufacturer-browse.xml")
@LookupComponent("manufacturersTable")
@LoadDataBeforeShow
public class ManufacturerBrowse extends StandardLookup<Manufacturer> {

    @Inject
    private ManufacturerService manufacturerService;

    @Inject
    private GroupTable<Manufacturer> manufacturersTable;

    @Inject
    private UiComponents uiComponents;

    @Subscribe
    protected void onInit(InitEvent event) {
        manufacturersTable.addGeneratedColumn(
                "models_amount",
                this::getModelsAmount
        );
    }

    private Component getModelsAmount(Manufacturer manufacturer) {
        Label label = uiComponents.create(Label.class);
        label.setValue(manufacturerService.getModelsAmount(manufacturer.getId()));
        return label;
    }

}