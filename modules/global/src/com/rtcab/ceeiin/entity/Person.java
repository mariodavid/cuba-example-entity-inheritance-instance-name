package com.rtcab.ceeiin.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.security.entity.User;

import javax.persistence.*;

@DiscriminatorValue("PERSON")
@NamePattern("%s|user")
@Entity(name = "ceeiin_Person")
public class Person extends Owner {
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "USER_ID")
    protected User user;

    @Column(name = "PERSON_ID")
    protected String personId;

    public String getPersonId() {
        return personId;
    }

    public void setPersonId(String personId) {
        this.personId = personId;
    }


    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}