package com.rtcab.ceeiin.core;

import org.springframework.stereotype.Component;

import com.haulmont.cuba.core.global.Events;
import com.haulmont.cuba.core.sys.events.AppContextInitializedEvent;
import com.haulmont.cuba.core.sys.listener.EntityListenerManager;
import com.haulmont.cuba.security.entity.User;
import org.springframework.context.event.EventListener;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import javax.inject.Inject;

@Component(EntityListenerRegisterer.NAME)
public class EntityListenerRegisterer {
    public static final String NAME = "ceeiin_EntityListenerRegisterer";


    @Inject
    private EntityListenerManager entityListenerManager;

    @EventListener(AppContextInitializedEvent.class)
    @Order(Events.LOWEST_PLATFORM_PRECEDENCE + 100)
    public void initEntityListeners() {
        entityListenerManager.addListener(User.class, "ceeiin_PersonInstanceNameUpdaterOnUserChange");
    }
}