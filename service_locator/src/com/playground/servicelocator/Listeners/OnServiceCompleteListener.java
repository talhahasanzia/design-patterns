package com.playground.servicelocator.Listeners;


// for dummy operations to simualate async requests
// not required in Service Locator demo
public interface OnServiceCompleteListener<T,F> {
        void onServiceCompleted(T result);
        void onServiceFailed(F error);
}
