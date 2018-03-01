package com.playground.servicelocator.Services;

import com.playground.servicelocator.Listeners.AuthenticationServiceListener;
import com.playground.servicelocator.Listeners.OnServiceCompleteListener;
import com.playground.servicelocator.Models.User;

// Dummy service to simulate authenticate user
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
        User user = new User("Invoker", "WWW+WWQ+EEW+QWE+QQE+EEQ+WWE+EEE+QQQ+QQW");
        try {
            Thread.sleep(2000); // simulate fake authentication response time as delay
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        authenticationServiceListener.onServiceCompleted(user);
    }

    @Override
    public void setListener(OnServiceCompleteListener listener) {
        this.authenticationServiceListener = (AuthenticationServiceListener) listener;
    }
}
