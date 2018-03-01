package com.playground.servicelocator.Main;

import com.playground.servicelocator.Listeners.AuthenticationServiceListener;
import com.playground.servicelocator.Models.User;
import com.playground.servicelocator.ServiceLocator.ServiceLocator;
import com.playground.servicelocator.ServiceLocatorClassLoader.ServiceLocatorClassLoader;
import com.playground.servicelocator.Services.AuthenticationService;

public class Main {

    public static void main(String[] args) {
	// write your code here

        ApplicationContext applicationContext=new ApplicationContext();

        ServiceLocator serviceLocator=ServiceLocator.getInstance(applicationContext);

        ServiceLocatorDemo serviceLocatorDemo=new ServiceLocatorDemo(serviceLocator);


        serviceLocatorDemo.executeAuthentication();


        serviceLocatorDemo.executeDownload();

        ServiceLocatorClassLoader.
                getService(AuthenticationService.class);

        ServiceLocatorClassLoader.getService(AuthenticationService.class).execute();

    }
}
