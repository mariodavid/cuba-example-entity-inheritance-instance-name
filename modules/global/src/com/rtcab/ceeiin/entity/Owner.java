package com.rtcab.ceeiin.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.cuba.core.entity.annotation.Listeners;

import javax.persistence.*;

@DiscriminatorValue("OWNER")
@DiscriminatorColumn(name = "DTYPE", discriminatorType = DiscriminatorType.STRING)
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@Table(name = "CEEIIN_OWNER")
@NamePattern("%s|description")
@Entity(name = "ceeiin_Owner")
@Listeners("ceeiin_OwnerInstanceNameGenerator")
public class Owner extends StandardEntity {
    @Column(name = "OWNER_IDENTIFICATION_NUMBER")
    protected String ownerIdentificationNumber;

    @Column(name = "DESCRIPTION")
    protected String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getOwnerIdentificationNumber() {
        return ownerIdentificationNumber;
    }

    public void setOwnerIdentificationNumber(String ownerIdentificationNumber) {
        this.ownerIdentificationNumber = ownerIdentificationNumber;
    }

    public String generateInstanceName() {
        return "";
    }
}