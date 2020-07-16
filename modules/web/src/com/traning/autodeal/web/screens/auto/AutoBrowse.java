package com.traning.autodeal.web.screens.auto;

import com.haulmont.cuba.gui.screen.*;
import com.traning.autodeal.entity.Auto;

@UiController("autodeal_Auto.browse")
@UiDescriptor("auto-browse.xml")
@LookupComponent("autosTable")
@LoadDataBeforeShow
public class AutoBrowse extends StandardLookup<Auto> {
}