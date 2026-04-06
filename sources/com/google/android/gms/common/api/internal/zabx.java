package com.google.android.gms.common.api.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;

public final class zabx extends BroadcastReceiver {

    /* renamed from: a  reason: collision with root package name */
    public Context f24682a;

    /* renamed from: b  reason: collision with root package name */
    public final zabw f24683b;

    public zabx(zabw zabw) {
        this.f24683b = zabw;
    }

    public final void a(Context context) {
        this.f24682a = context;
    }

    public final synchronized void b() {
        try {
            Context context = this.f24682a;
            if (context != null) {
                context.unregisterReceiver(this);
            }
            this.f24682a = null;
        } catch (Throwable th) {
            while (true) {
                throw th;
            }
        }
    }

    public final void onReceive(Context context, Intent intent) {
        Uri data = intent.getData();
        if ("com.google.android.gms".equals(data != null ? data.getSchemeSpecificPart() : null)) {
            this.f24683b.a();
            b();
        }
    }
}
