package com.google.android.gms.internal.base;

import android.os.Handler;
import android.os.Looper;

public class zau extends Handler {

    /* renamed from: a  reason: collision with root package name */
    public final Looper f25274a = Looper.getMainLooper();

    public zau(Looper looper) {
        super(looper);
    }

    public zau(Looper looper, Handler.Callback callback) {
        super(looper, callback);
    }
}
