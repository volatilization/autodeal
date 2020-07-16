package com.traning.autodeal.web.screens.model;

import com.haulmont.cuba.gui.screen.*;
import com.traning.autodeal.entity.Model;

@UiController("autodeal_Model.browse")
@UiDescriptor("model-browse.xml")
@LookupComponent("modelsTable")
@LoadDataBeforeShow
public class ModelBrowse extends StandardLookup<Model> {
}