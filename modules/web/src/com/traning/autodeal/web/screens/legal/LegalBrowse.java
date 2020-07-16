package com.traning.autodeal.web.screens.legal;

import com.haulmont.cuba.gui.UiComponents;
import com.haulmont.cuba.gui.components.Component;
import com.haulmont.cuba.gui.components.GroupTable;
import com.haulmont.cuba.gui.components.Label;
import com.haulmont.cuba.gui.screen.*;
import com.traning.autodeal.entity.Manufacturer;
import com.traning.autodeal.entity.client.Legal;
import com.traning.autodeal.service.BuyRequestService;
import com.traning.autodeal.service.ManufacturerService;

import javax.inject.Inject;

@UiController("autodeal_Legal.browse")
@UiDescriptor("legal-browse.xml")
@LookupComponent("legalsTable")
@LoadDataBeforeShow
public class LegalBrowse extends StandardLookup<Legal> {

    @Inject
    private BuyRequestService buyRequestService;

    @Inject
    private GroupTable<Legal> legalsTable;

    @Inject
    private UiComponents uiComponents;

    @Subscribe
    protected void onInit(InitEvent event) {
        legalsTable.addGeneratedColumn(
                "buy_request_amount",
                this::getBuyRequestAmount
        );
    }

    private Component getBuyRequestAmount(Legal legal) {
        Label label = uiComponents.create(Label.class);
        label.setValue(buyRequestService.getRequestsAmount(legal.getUuid()));
        return label;
    }
}