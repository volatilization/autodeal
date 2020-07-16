package com.traning.autodeal.web.screens.color;

import com.haulmont.cuba.gui.screen.*;
import com.traning.autodeal.entity.Color;

@UiController("autodeal_Color.browse")
@UiDescriptor("color-browse.xml")
@LookupComponent("colorsTable")
@LoadDataBeforeShow
public class ColorBrowse extends StandardLookup<Color> {
}