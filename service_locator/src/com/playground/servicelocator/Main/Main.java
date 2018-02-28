package com.playground.servicelocator.Main;

import com.playground.servicelocator.ServiceLocator.ServiceLocator;

public class Main {

    public static void main(String[] args) {
        // write your code here

        ApplicationContext applicationContext = new ApplicationContext(); // to pass framework dependies to serviceLocator

        ServiceLocator serviceLocator = ServiceLocator.getInstance(applicationContext);

        ServiceLocatorDemo serviceLocatorDemo = new ServiceLocatorDemo(serviceLocator);


        serviceLocatorDemo.executeAuthentication();


        serviceLocatorDemo.executeDownload();
    }
}
