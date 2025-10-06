package com.designPattern.factoryMethod.domains.factory;

import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class FactoryProvider {

    private Map<String, NotificationFactory> factories = new HashMap<>();

    public FactoryProvider() {
        this.factories.put("email", new EmailFactory());
        this.factories.put("sms", new SmsFactory());
        this.factories.put("push", new PushFactory());
        
    }

    public NotificationFactory getFactory(String type){

         return this.factories.get(type);

    }

    public NotificationFactory configureNotification(String type){
        if(type.equals("sms")){
            return new SmsFactory();

        } else if (type.equals("push")) {
            return new PushFactory();

        } else  {
            return new EmailFactory();

        }
    }

}
