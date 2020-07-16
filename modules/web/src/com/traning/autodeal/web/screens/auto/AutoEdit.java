package com.traning.autodeal.web.screens.auto;

import com.haulmont.cuba.gui.screen.*;
import com.traning.autodeal.entity.Auto;

@UiController("autodeal_Auto.edit")
@UiDescriptor("auto-edit.xml")
@EditedEntityContainer("autoDc")
@LoadDataBeforeShow
public class AutoEdit extends StandardEditor<Auto> {
    
}