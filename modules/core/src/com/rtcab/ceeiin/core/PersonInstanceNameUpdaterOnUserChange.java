package com.rtcab.ceeiin.core;

import com.haulmont.cuba.core.EntityManager;
import com.haulmont.cuba.core.TypedQuery;
import com.haulmont.cuba.core.listener.BeforeInsertEntityListener;
import com.haulmont.cuba.core.listener.BeforeUpdateEntityListener;
import com.haulmont.cuba.security.entity.User;
import com.rtcab.ceeiin.entity.Owner;
import com.rtcab.ceeiin.entity.Person;
import org.springframework.stereotype.Component;

@Component(PersonInstanceNameUpdaterOnUserChange.NAME)
public class PersonInstanceNameUpdaterOnUserChange implements BeforeUpdateEntityListener<User> {

    public static final String NAME = "ceeiin_PersonInstanceNameUpdaterOnUserChange";

    @Override
    public void onBeforeUpdate(User entity, EntityManager entityManager) {

        TypedQuery<Person> query = entityManager.createQuery("select e from ceeiin_Person e where e.user = :user", Person.class);
        query.setParameter("user", entity);

        Person person = query.getFirstResult();

        person.setUser(entity);
        person.setDescription(person.generateInstanceName());

        entityManager.persist(person);
    }
}