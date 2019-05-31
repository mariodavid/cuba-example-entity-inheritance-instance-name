package com.rtcab.ceeiin.entity;

import com.haulmont.cuba.security.entity.User;

import javax.persistence.*;
import java.util.Objects;

@DiscriminatorValue("PERSON")
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

    @Override
    public String generateInstanceName() {
        return renderAttribute(getPersonId()) + " - " + renderAttribute(user.getCaption());
    }

    private String renderAttribute(String field) {
        return Objects.toString(field, "");
    }
}