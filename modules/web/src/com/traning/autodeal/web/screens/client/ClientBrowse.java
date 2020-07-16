package com.traning.autodeal.web.screens.client;

import com.haulmont.cuba.gui.UiComponents;
import com.haulmont.cuba.gui.components.Component;
import com.haulmont.cuba.gui.components.GroupTable;
import com.haulmont.cuba.gui.components.Label;
import com.haulmont.cuba.gui.screen.*;
import com.traning.autodeal.entity.Client;
import com.traning.autodeal.service.ClientService;

import javax.inject.Inject;

@UiController("autodeal_Client.browse")
@UiDescriptor("client-browse.xml")
@LookupComponent("clientsTable")
@LoadDataBeforeShow
public class ClientBrowse extends StandardLookup<Client> {

    @Inject
    private ClientService clientService;

    @Inject
    private GroupTable<Client> clientsTable;

    @Inject
    private UiComponents uiComponents;

    @Subscribe
    protected void onInit(InitEvent event) {
        clientsTable.addGeneratedColumn(
                "name",
                this::getInstanceName
        );
    }

    private Component getInstanceName(Client client) {
        Label label = uiComponents.create(Label.class);
        label.setValue(clientService.getInstanceName(client.getId()));
        return label;
    }
}