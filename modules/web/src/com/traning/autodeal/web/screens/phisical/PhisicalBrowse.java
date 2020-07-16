package com.traning.autodeal.web.screens.phisical;

import com.haulmont.cuba.gui.UiComponents;
import com.haulmont.cuba.gui.components.Component;
import com.haulmont.cuba.gui.components.GroupTable;
import com.haulmont.cuba.gui.components.Label;
import com.haulmont.cuba.gui.screen.*;
import com.traning.autodeal.entity.client.Legal;
import com.traning.autodeal.entity.client.Phisical;
import com.traning.autodeal.service.BuyRequestService;

import javax.inject.Inject;
import java.util.function.Function;

@UiController("autodeal_Phisical.browse")
@UiDescriptor("phisical-browse.xml")
@LookupComponent("phisicalsTable")
@LoadDataBeforeShow
public class PhisicalBrowse extends StandardLookup<Phisical> {

    @Inject
    private BuyRequestService buyRequestService;

    @Inject
    private GroupTable<Phisical> phisicalsTable;

    @Inject
    private UiComponents uiComponents;

    @Subscribe
    protected void onInit(InitEvent event) {
        phisicalsTable.addGeneratedColumn(
                "buy_request_amount",
                this::getBuyRequestAmount
        );
        Function phoneFormatter = new PhoneFormatter();
        phisicalsTable.getColumn("phone").setFormatter(phoneFormatter);
    }

    private Component getBuyRequestAmount(Phisical phisical) {
        Label label = uiComponents.create(Label.class);
        label.setValue(buyRequestService.getRequestsAmount(phisical.getUuid()));
        return label;
    }
}