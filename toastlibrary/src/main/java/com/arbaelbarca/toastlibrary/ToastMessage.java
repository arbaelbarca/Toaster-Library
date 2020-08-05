package com.arbaelbarca.toastlibrary;

import android.content.Context;
import android.widget.Toast;

public class ToastMessage {
    public void toastMessage(Context context, String message) {
        Toast.makeText(context, message, Toast.LENGTH_LONG).show();
    }
}
