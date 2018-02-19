package com.playground.servicelocator.ServiceLocator;

import com.playground.servicelocator.Services.Service;

import java.util.HashMap;

public class Cache {

    private static Cache instance;

    public static Cache getInstance() {
        if (instance == null)
            instance = new Cache();

        return instance;
    }

    private HashMap<String, Service> services;  // Service Name , Service Object

    private Cache() {
        services = new HashMap<>();
    }


    public Service getService(String name) {
        return services.get(name);
    }

    public void addService(String name, Service serviceObject) {
        if (!services.containsKey(name))
            services.put(name, serviceObject);
    }


}
