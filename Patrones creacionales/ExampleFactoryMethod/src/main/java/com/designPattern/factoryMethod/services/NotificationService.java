package com.designPattern.factoryMethod.services;

import com.designPattern.factoryMethod.domains.*;
import com.designPattern.factoryMethod.domains.factory.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class NotificationService {

    private Notification notification;
    @Autowired
    private FactoryProvider provider;

    public NotificationService(){
    }

    public String sendNotification(String type, String msg){

        NotificationFactory factory = provider.getFactory(type);
        this.notification = factory.getNotification();
        return notification.send(msg);

    }



}
