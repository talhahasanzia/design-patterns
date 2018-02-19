package com.playground.servicelocator.Main;

import com.playground.servicelocator.Listeners.AuthenticationServiceListener;
import com.playground.servicelocator.Listeners.DownloadServiceListener;
import com.playground.servicelocator.Models.DownloadObject;
import com.playground.servicelocator.Models.User;
import com.playground.servicelocator.ServiceLocator.ServiceLocator;
import com.playground.servicelocator.Services.AuthenticationService;
import com.playground.servicelocator.Services.DownloadService;

public class ServiceLocatorDemo {
    private ServiceLocator serviceLocator;

    public ServiceLocatorDemo(ServiceLocator serviceLocator) {
        this.serviceLocator = serviceLocator;
    }

    public void executeAuthentication()
    {
        try {
            AuthenticationService authenticationService= (AuthenticationService) serviceLocator.getService(AuthenticationService.class.getSimpleName());
            setAuthListener(authenticationService);// not required in service locator flow, just for dummy operation
            authenticationService.execute();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void executeDownload()
    {
        try {
            DownloadService downloadService= (DownloadService) serviceLocator.getService(DownloadService.class.getSimpleName());
            setDownloadListener(downloadService); // Not required in service locator
            downloadService.execute();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }

    private void setDownloadListener(DownloadService downloadService) {
        downloadService.setListener(new DownloadServiceListener() {
            @Override
            public void onServiceCompleted(DownloadObject result) {
                System.out.println(result.getPath()+"- "+result.getName());
            }

            @Override
            public void onServiceFailed(String error) {

            }
        });
    }

    private void setAuthListener(AuthenticationService authenticationService) {
        authenticationService.setListener(new AuthenticationServiceListener() {
            @Override
            public void onServiceCompleted(User result) {
                System.out.println(result.getName());
            }

            @Override
            public void onServiceFailed(String error) {

            }
        });
    }



}
