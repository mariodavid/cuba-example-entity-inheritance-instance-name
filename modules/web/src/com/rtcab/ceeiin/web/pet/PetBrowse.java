package com.rtcab.ceeiin.web.pet;

import com.haulmont.cuba.gui.screen.*;
import com.rtcab.ceeiin.entity.Pet;

@UiController("ceeiin_Pet.browse")
@UiDescriptor("pet-browse.xml")
@LookupComponent("petsTable")
@LoadDataBeforeShow
public class PetBrowse extends StandardLookup<Pet> {
}