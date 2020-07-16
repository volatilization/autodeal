package com.traning.autodeal.web.screens.buyrequest;

import com.haulmont.cuba.gui.screen.*;
import com.haulmont.cuba.security.global.UserSession;
import com.traning.autodeal.entity.BuyRequest;
import com.traning.autodeal.entity.Manager;
import com.traning.autodeal.service.ManagerService;

import javax.inject.Inject;

@UiController("autodeal_BuyRequest.edit")
@UiDescriptor("buy-request-edit.xml")
@EditedEntityContainer("buyRequestDc")
@LoadDataBeforeShow
public class BuyRequestEdit extends StandardEditor<BuyRequest> {

    @Inject
    private UserSession userSession;

    @Inject
    private ManagerService managerService;

    @Subscribe
    public void onBeforeCommitChanges(BeforeCommitChangesEvent event) {
        getEditedEntity().setManager(managerService.getManager(userSession.getUser().getUuid()));
        event.resume();
    }
}