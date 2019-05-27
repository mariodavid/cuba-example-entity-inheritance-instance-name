package com.rtcab.ceeiin.web.person;

import com.haulmont.cuba.gui.screen.*;
import com.rtcab.ceeiin.entity.Person;

@UiController("ceeiin_Person.edit")
@UiDescriptor("person-edit.xml")
@EditedEntityContainer("personDc")
@LoadDataBeforeShow
public class PersonEdit extends StandardEditor<Person> {
}