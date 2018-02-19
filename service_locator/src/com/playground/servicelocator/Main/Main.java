package com.playground.servicelocator.Main;

import com.playground.servicelocator.ServiceLocator.ServiceLocator;

public class Main {

    public static void main(String[] args) {
	// write your code here

        ServiceLocator serviceLocator=ServiceLocator.getInstance();

        ServiceLocatorDemo serviceLocatorDemo=new ServiceLocatorDemo(serviceLocator);


        serviceLocatorDemo.executeAuthentication();


        serviceLocatorDemo.executeDownload();
    }
}
