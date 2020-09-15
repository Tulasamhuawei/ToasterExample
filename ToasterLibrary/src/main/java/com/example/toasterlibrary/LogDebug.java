package com.example.toasterlibrary;

import android.util.Log;

public class LogDebug {
    private static final String TAG = "My Logs";

    public static void d(String message){
        Log.d(TAG,message);
    }
}
