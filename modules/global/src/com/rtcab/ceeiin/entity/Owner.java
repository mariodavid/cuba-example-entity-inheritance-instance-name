package com.rtcab.ceeiin.entity;

import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.*;

@DiscriminatorValue("OWNER")
@DiscriminatorColumn(name = "DTYPE", discriminatorType = DiscriminatorType.STRING)
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@Table(name = "CEEIIN_OWNER")
@Entity(name = "ceeiin_Owner")
public class Owner extends StandardEntity {
    @Column(name = "OWNER_IDENTIFICATION_NUMBER")
    protected String ownerIdentificationNumber;

    public String getOwnerIdentificationNumber() {
        return ownerIdentificationNumber;
    }

    public void setOwnerIdentificationNumber(String ownerIdentificationNumber) {
        this.ownerIdentificationNumber = ownerIdentificationNumber;
    }
}