package com.google.android.gms.common.api.internal;

import android.os.Message;
import android.util.Log;
import com.google.android.gms.internal.base.zau;

final class zabc extends zau {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ zabe f24608b;

    public final void handleMessage(Message message) {
        int i2 = message.what;
        if (i2 == 1) {
            zabe.s(this.f24608b);
        } else if (i2 != 2) {
            Log.w("GoogleApiClientImpl", "Unknown message id: " + i2);
        } else {
            zabe.r(this.f24608b);
        }
    }
}
