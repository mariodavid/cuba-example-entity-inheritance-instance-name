package com.rtcab.ceeiin.web.owner;

import com.haulmont.cuba.gui.ScreenBuilders;
import com.haulmont.cuba.gui.components.Action;
import com.haulmont.cuba.gui.screen.*;
import com.rtcab.ceeiin.entity.Company;
import com.rtcab.ceeiin.entity.Owner;
import com.rtcab.ceeiin.entity.Person;

import javax.inject.Inject;

@UiController("ceeiin_Owner.browse")
@UiDescriptor("owner-browse.xml")
@LookupComponent("ownersTable")
@LoadDataBeforeShow
public class OwnerBrowse extends StandardLookup<Owner> {


    @Inject
    protected ScreenBuilders screenBuilders;

    @Subscribe("ownersTable.createCompany")
    protected void onOwnersTableCreateCompany(Action.ActionPerformedEvent event) {
        screenBuilders.editor(Company.class, this)
                .newEntity()
                .withOpenMode(OpenMode.DIALOG)
                .show();

    }

    @Subscribe("ownersTable.createPerson")
    protected void onOwnersTableCreatePerson(Action.ActionPerformedEvent event) {
        screenBuilders.editor(Person.class, this)
                .newEntity()
                .withOpenMode(OpenMode.DIALOG)
                .show();
    }
    
    
}