package com.rtcab.ceeiin.web.company;

import com.haulmont.cuba.gui.screen.*;
import com.rtcab.ceeiin.entity.Company;

@UiController("ceeiin_Company.edit")
@UiDescriptor("company-edit.xml")
@EditedEntityContainer("companyDc")
@LoadDataBeforeShow
public class CompanyEdit extends StandardEditor<Company> {
}