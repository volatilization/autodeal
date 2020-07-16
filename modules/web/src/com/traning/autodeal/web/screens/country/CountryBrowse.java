package com.traning.autodeal.web.screens.country;

import com.haulmont.cuba.gui.screen.*;
import com.traning.autodeal.entity.Country;

@UiController("autodeal_Country.browse")
@UiDescriptor("country-browse.xml")
@LookupComponent("countriesTable")
@LoadDataBeforeShow
public class CountryBrowse extends StandardLookup<Country> {
}