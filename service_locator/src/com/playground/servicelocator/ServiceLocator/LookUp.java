package com.playground.servicelocator.ServiceLocator;

import com.playground.servicelocator.Listeners.AuthenticationServiceListener;
import com.playground.servicelocator.Listeners.DownloadServiceListener;
import com.playground.servicelocator.Listeners.OnServiceCompleteListener;
import com.playground.servicelocator.Services.AuthenticationService;
import com.playground.servicelocator.Services.DownloadService;
import com.playground.servicelocator.Services.Service;

public class LookUp {
    private static LookUp instance;

    private LookUp() {
    }

    public static LookUp getInstance() {
        if (instance == null)
            instance = new LookUp();

        return instance;
    }

    public Service lookFor(String service) throws ClassNotFoundException,ClassCastException {

        if (service.equalsIgnoreCase(AuthenticationService.class.getSimpleName())) {
            return new AuthenticationService();
        }

        if (service.equalsIgnoreCase(DownloadService.class.getSimpleName())) {
            return new DownloadService();
        }

        throw new ClassNotFoundException("Service not found");


    }

}
