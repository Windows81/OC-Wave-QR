package com.google.android.gms.common;

import android.content.Context;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.internal.base.zau;

final class zad extends zau {

    /* renamed from: b  reason: collision with root package name */
    public final Context f25155b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ GoogleApiAvailability f25156c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zad(GoogleApiAvailability googleApiAvailability, Context context) {
        super(Looper.myLooper() == null ? Looper.getMainLooper() : Looper.myLooper());
        this.f25156c = googleApiAvailability;
        this.f25155b = context.getApplicationContext();
    }

    public final void handleMessage(Message message) {
        int i2 = message.what;
        if (i2 != 1) {
            Log.w("GoogleApiAvailability", "Don't know how to handle this message: " + i2);
            return;
        }
        GoogleApiAvailability googleApiAvailability = this.f25156c;
        int i3 = googleApiAvailability.i(this.f25155b);
        if (googleApiAvailability.m(i3)) {
            this.f25156c.s(this.f25155b, i3);
        }
    }
}
