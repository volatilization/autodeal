package com.traning.autodeal.web.screens.legal;

import com.haulmont.cuba.gui.screen.*;
import com.traning.autodeal.entity.client.Legal;
import com.traning.autodeal.entity.client.Type;
import com.traning.autodeal.service.ClientService;

import javax.inject.Inject;

@UiController("autodeal_Legal.edit")
@UiDescriptor("legal-edit.xml")
@EditedEntityContainer("legalDc")
@LoadDataBeforeShow
public class LegalEdit extends StandardEditor<Legal> {

    @Inject
    private ClientService clientService;

    @Subscribe
    public void onBeforeCommitChanges(BeforeCommitChangesEvent event) {
        clientService.saveClient(getEditedEntity().getUuid(), Type.LEGAL);
        event.resume();
    }
}