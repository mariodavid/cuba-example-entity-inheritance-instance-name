package com.rtcab.ceeiin.core;

import com.haulmont.cuba.core.EntityManager;
import com.haulmont.cuba.core.listener.BeforeInsertEntityListener;
import com.haulmont.cuba.core.listener.BeforeUpdateEntityListener;
import com.rtcab.ceeiin.entity.Owner;
import org.springframework.stereotype.Component;

@Component(OwnerInstanceNameGenerator.NAME)
public class OwnerInstanceNameGenerator implements BeforeInsertEntityListener<Owner>,
        BeforeUpdateEntityListener<Owner> {
    public static final String NAME = "ceeiin_OwnerInstanceNameGenerator";

    @Override
    public void onBeforeInsert(Owner entity, EntityManager entityManager) {
        entity.setDescription(entity.generateInstanceName());
    }

    @Override
    public void onBeforeUpdate(Owner entity, EntityManager entityManager) {
        entity.setDescription(entity.generateInstanceName());
    }
}