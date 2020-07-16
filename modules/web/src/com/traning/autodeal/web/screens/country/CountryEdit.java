package com.traning.autodeal.web.screens.country;

import com.haulmont.cuba.gui.screen.*;
import com.traning.autodeal.entity.Country;

@UiController("autodeal_Country.edit")
@UiDescriptor("country-edit.xml")
@EditedEntityContainer("countryDc")
@LoadDataBeforeShow
public class CountryEdit extends StandardEditor<Country> {
}