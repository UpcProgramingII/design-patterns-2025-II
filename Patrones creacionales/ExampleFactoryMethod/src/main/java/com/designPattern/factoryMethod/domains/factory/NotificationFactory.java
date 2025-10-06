package com.designPattern.factoryMethod.domains.factory;

import com.designPattern.factoryMethod.domains.Notification;

public abstract class NotificationFactory {

    public NotificationFactory() {
    }

    public abstract Notification create();

    public Notification getNotification(){
        return this.create();
    }

}
