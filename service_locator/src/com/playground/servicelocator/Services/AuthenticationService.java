package com.playground.servicelocator.Services;

import com.playground.servicelocator.Listeners.AuthenticationServiceListener;
import com.playground.servicelocator.Listeners.OnServiceCompleteListener;
import com.playground.servicelocator.Models.User;

public class AuthenticationService implements Service {

    private AuthenticationServiceListener authenticationServiceListener;

    public AuthenticationService() {
    }

    @Override
    public String getName() {
        return AuthenticationService.class.getSimpleName();
    }

    @Override
    public void execute() {
        authenticationServiceListener.onServiceCompleted(new User("Talha","ajhd236"));
    }

    @Override
    public void setListener(OnServiceCompleteListener listener) {
        this.authenticationServiceListener= (AuthenticationServiceListener) listener;
    }
}
