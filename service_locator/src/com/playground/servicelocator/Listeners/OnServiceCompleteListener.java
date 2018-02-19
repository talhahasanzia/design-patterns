package com.playground.servicelocator.Listeners;

public interface OnServiceCompleteListener<T,F> {
        void onServiceCompleted(T result);
        void onServiceFailed(F error);
}
