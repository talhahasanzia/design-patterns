package com.playground.servicelocator.ServiceLocatorClassLoader;

import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;

// To generalize any service, we can use ClassLoader API to provide service classes at runtime.

public class ServiceLocatorClassLoader {

    private static HashMap<Class, Object> cache;

    public static void bindContext() {
        // in case of providing any dependency like context
    }

    public static <T> T getService(Class<T> clazz)
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
