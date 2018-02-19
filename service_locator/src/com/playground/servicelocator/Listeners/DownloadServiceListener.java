package com.playground.servicelocator.Listeners;

import com.playground.servicelocator.Models.DownloadObject;

public interface DownloadServiceListener extends OnServiceCompleteListener<DownloadObject, String> {

    @Override
    void onServiceCompleted(DownloadObject result);

    @Override
    void onServiceFailed(String error);
}
