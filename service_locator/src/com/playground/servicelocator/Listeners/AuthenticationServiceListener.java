package com.playground.servicelocator.Listeners;

import com.playground.servicelocator.Models.User;


// for dummy operations to simualate async requests
// not required in Service Locator demo
public interface AuthenticationServiceListener extends OnServiceCompleteListener<User, String> {
    @Override
    void onServiceCompleted(User result);

    @Override
    void onServiceFailed(String error);
}
