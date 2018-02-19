package com.playground.servicelocator.ServiceLocator;

import com.playground.servicelocator.Listeners.OnServiceCompleteListener;
import com.playground.servicelocator.Services.Service;

public class ServiceLocator {

    private static ServiceLocator instance;


    private Cache cache;
    private LookUp lookUp;

    public static ServiceLocator getInstance() {
        if (instance == null)
            instance = new ServiceLocator();

        return instance;
    }

    private ServiceLocator() {
        cache = Cache.getInstance();
        lookUp = LookUp.getInstance();
    }

    public Service getService(String serviceName) throws ClassNotFoundException {

        Service service = cache.getService(serviceName);

        if (service == null) {
            service = lookUp.lookFor(serviceName);
            cache.addService(serviceName, service);
        }

        return service;

    }


}
