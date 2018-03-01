package com.playground.servicelocator.Listeners;

import com.playground.servicelocator.Models.DownloadObject;


// for dummy operations to simualate async requests
// not required in Service Locator demo
public interface DownloadServiceListener extends OnServiceCompleteListener<DownloadObject, String> {

    @Override
    void onServiceCompleted(DownloadObject result);

    @Override
    void onServiceFailed(String error);
}
