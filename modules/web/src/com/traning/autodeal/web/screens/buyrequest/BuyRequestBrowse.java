package com.traning.autodeal.web.screens.buyrequest;

import com.haulmont.cuba.gui.screen.*;
import com.traning.autodeal.entity.BuyRequest;

@UiController("autodeal_BuyRequest.browse")
@UiDescriptor("buy-request-browse.xml")
@LookupComponent("buyRequestsTable")
@LoadDataBeforeShow
public class BuyRequestBrowse extends StandardLookup<BuyRequest> {
}