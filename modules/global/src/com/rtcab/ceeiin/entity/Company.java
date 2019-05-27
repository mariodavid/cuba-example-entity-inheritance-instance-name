package com.rtcab.ceeiin.entity;

import com.haulmont.chile.core.annotations.NamePattern;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@DiscriminatorValue("COMPANY")
@NamePattern("%s|name")
@Entity(name = "ceeiin_Company")
public class Company extends Owner {
    @Column(name = "NAME")
    protected String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}