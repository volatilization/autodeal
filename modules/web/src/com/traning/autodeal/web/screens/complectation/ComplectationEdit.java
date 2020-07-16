package com.traning.autodeal.web.screens.complectation;

import com.haulmont.cuba.gui.screen.*;
import com.traning.autodeal.entity.Complectation;

@UiController("autodeal_Complectation.edit")
@UiDescriptor("complectation-edit.xml")
@EditedEntityContainer("complectationDc")
@LoadDataBeforeShow
public class ComplectationEdit extends StandardEditor<Complectation> {
}