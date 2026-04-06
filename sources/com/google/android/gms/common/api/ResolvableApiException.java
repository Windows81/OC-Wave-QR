package com.google.android.gms.common.api;

import android.app.Activity;
import android.app.PendingIntent;

public class ResolvableApiException extends ApiException {
    public ResolvableApiException(Status status) {
        super(status);
    }

    public PendingIntent c() {
        return a().Q();
    }

    public void d(Activity activity, int i2) {
        a().A0(activity, i2);
    }
}
