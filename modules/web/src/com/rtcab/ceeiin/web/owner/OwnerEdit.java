package com.rtcab.ceeiin.web.owner;

import com.haulmont.cuba.gui.screen.*;
import com.rtcab.ceeiin.entity.Owner;

@UiController("ceeiin_Owner.edit")
@UiDescriptor("owner-edit.xml")
@EditedEntityContainer("ownerDc")
@LoadDataBeforeShow
public class OwnerEdit extends StandardEditor<Owner> {
}