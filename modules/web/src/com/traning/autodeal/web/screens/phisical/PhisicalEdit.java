package com.traning.autodeal.web.screens.phisical;

import com.haulmont.cuba.gui.screen.*;
import com.traning.autodeal.entity.client.Phisical;
import com.traning.autodeal.entity.client.Type;
import com.traning.autodeal.service.ClientService;

import javax.inject.Inject;

@UiController("autodeal_Phisical.edit")
@UiDescriptor("phisical-edit.xml")
@EditedEntityContainer("phisicalDc")
@LoadDataBeforeShow
public class PhisicalEdit extends StandardEditor<Phisical> {

    @Inject
    private ClientService clientService;

    @Subscribe
    public void onBeforeCommitChanges(BeforeCommitChangesEvent event) {
        clientService.saveClient(getEditedEntity().getUuid(), Type.PHISICAL);
        event.resume();
    }
}