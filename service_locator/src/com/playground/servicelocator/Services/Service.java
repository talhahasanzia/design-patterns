package com.playground.servicelocator.Services;

import com.playground.servicelocator.Listeners.OnServiceCompleteListener;


// Service contract
// this makes sure that each service will perform these operations
// and service locator mediates on this abstraction
public interface Service {
    String getName();
    void execute();
    void setListener(OnServiceCompleteListener listener);
}
