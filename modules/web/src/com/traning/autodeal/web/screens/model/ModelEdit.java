package com.traning.autodeal.web.screens.model;

import com.haulmont.cuba.gui.screen.*;
import com.traning.autodeal.entity.Model;

@UiController("autodeal_Model.edit")
@UiDescriptor("model-edit.xml")
@EditedEntityContainer("modelDc")
@LoadDataBeforeShow
public class ModelEdit extends StandardEditor<Model> {
}