package com.playground.servicelocator.Services;

import com.playground.servicelocator.Listeners.OnServiceCompleteListener;

public interface Service {
    String getName();
    void execute();
    void setListener(OnServiceCompleteListener listener);
}
