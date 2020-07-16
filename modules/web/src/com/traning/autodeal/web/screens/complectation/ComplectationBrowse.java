package com.traning.autodeal.web.screens.complectation;

import com.haulmont.cuba.gui.screen.*;
import com.traning.autodeal.entity.Complectation;

@UiController("autodeal_Complectation.browse")
@UiDescriptor("complectation-browse.xml")
@LookupComponent("complectationsTable")
@LoadDataBeforeShow
public class ComplectationBrowse extends StandardLookup<Complectation> {
}