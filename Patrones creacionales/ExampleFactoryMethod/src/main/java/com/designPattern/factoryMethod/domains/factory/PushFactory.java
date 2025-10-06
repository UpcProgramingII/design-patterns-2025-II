package com.designPattern.factoryMethod.domains.factory;

import com.designPattern.factoryMethod.domains.Notification;
import com.designPattern.factoryMethod.domains.PushNotification;

public class PushFactory extends NotificationFactory{
    @Override
    public Notification create() {
        return new PushNotification();
    }
}
