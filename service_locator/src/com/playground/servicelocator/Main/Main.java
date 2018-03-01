package com.playground.servicelocator.Main;

import com.playground.servicelocator.Models.ApplicationContext;
import com.playground.servicelocator.ServiceLocator.ServiceLocator;
import com.playground.servicelocator.ServiceLocatorClassLoader.ServiceLocatorClassLoader;
import com.playground.servicelocator.Services.AuthenticationService;

public class Main {

    public static void main(String[] args) {

        // Objects example

        ApplicationContext applicationContext=new ApplicationContext();

        ServiceLocator serviceLocator=ServiceLocator.getInstance(applicationContext); // get service locator

        // initialize deme , this is not required it is just for sake of the example and clean code
        // You can do all the code here that is in ServiceLocatorDemo class.
        ServiceLocatorDemo serviceLocatorDemo=new ServiceLocatorDemo(serviceLocator);


        serviceLocatorDemo.executeAuthentication(); // sample execution of Authentication service


        serviceLocatorDemo.executeDownload(); // sample execution of Download service


        // Class loader example

        ServiceLocatorClassLoader.
                getService(AuthenticationService.class);

        ServiceLocatorClassLoader.getService(AuthenticationService.class).execute();

    }
}
