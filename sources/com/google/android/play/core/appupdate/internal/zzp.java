package com.google.android.play.core.appupdate.internal;

import android.os.IBinder;

public final /* synthetic */ class zzp implements IBinder.DeathRecipient {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ zzx f27435a;

    public /* synthetic */ zzp(zzx zzx) {
        this.f27435a = zzx;
    }

    public final void binderDied() {
        zzx.j(this.f27435a);
    }
}
