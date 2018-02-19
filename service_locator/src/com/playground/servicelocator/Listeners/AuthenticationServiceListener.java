package com.playground.servicelocator.Listeners;

import com.playground.servicelocator.Models.User;

public interface AuthenticationServiceListener extends OnServiceCompleteListener<User, String> {
    @Override
    void onServiceCompleted(User result);

    @Override
    void onServiceFailed(String error);
}
