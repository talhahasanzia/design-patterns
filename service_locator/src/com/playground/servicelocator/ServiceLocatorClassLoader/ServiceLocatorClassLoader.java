package com.playground.servicelocator.ServiceLocatorClassLoader;

import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;

public class ServiceLocatorClassLoader {

    private static HashMap<Class, Object> cache;

    public static void bindContext() {
    }

    public static <T extends Object> T getService(Class<T> clazz)
    {
        T service = null;

        try {
            Class theClass = Class.forName(clazz.getName());
            if(getCache().get(clazz) == null) {
                getCache().put(clazz, theClass.getDeclaredConstructor().newInstance());
            }
            return (T) getCache().get(clazz);
        } catch (InstantiationException | IllegalAccessException | NoSuchMethodException | InvocationTargetException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        return service;
    }


    private static HashMap<Class, Object> getCache() {
        if (cache == null)
            cache = new HashMap<>();

        return cache;
    }

}
