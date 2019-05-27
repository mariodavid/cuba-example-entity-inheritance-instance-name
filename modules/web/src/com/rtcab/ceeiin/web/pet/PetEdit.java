package com.rtcab.ceeiin.web.pet;

import com.haulmont.cuba.gui.screen.*;
import com.rtcab.ceeiin.entity.Pet;

@UiController("ceeiin_Pet.edit")
@UiDescriptor("pet-edit.xml")
@EditedEntityContainer("petDc")
@LoadDataBeforeShow
public class PetEdit extends StandardEditor<Pet> {
}