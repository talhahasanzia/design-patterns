package com.playground.servicelocator.Services;

import com.playground.servicelocator.Listeners.DownloadServiceListener;
import com.playground.servicelocator.Listeners.OnServiceCompleteListener;
import com.playground.servicelocator.Models.DownloadObject;

// Dummy download service that simulates download
public class DownloadService implements Service {

    private DownloadServiceListener downloadServiceListener;


    public DownloadService() {

    }

    @Override
    public String getName() {
        return DownloadService.class.getSimpleName();
    }

    @Override
    public void execute() {
        System.out.println("Downloading..");
        try {
            Thread.sleep(3000); // simulate fake download time as delay
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        DownloadObject downloadObject=new DownloadObject("/assets/rhinestones.mp3","Rhinestone Eyes","Gorillaz");
        downloadServiceListener.onServiceCompleted(downloadObject);
    }

    @Override
    public void setListener(OnServiceCompleteListener listener) {
        this.downloadServiceListener= (DownloadServiceListener) listener;
    }
}
