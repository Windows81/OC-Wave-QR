package com.google.android.gms.internal.common;

import android.os.Handler;
import android.os.Looper;

public class zzi extends Handler {

    /* renamed from: a  reason: collision with root package name */
    public final Looper f25288a = Looper.getMainLooper();

    public zzi(Looper looper) {
        super(looper);
    }

    public zzi(Looper looper, Handler.Callback callback) {
        super(looper, callback);
    }
}
