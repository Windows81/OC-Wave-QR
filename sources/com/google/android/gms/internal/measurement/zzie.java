package com.google.android.gms.internal.measurement;

import android.database.ContentObserver;
import android.os.Handler;

final class zzie extends ContentObserver {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ zzic f25513a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzie(zzic zzic, Handler handler) {
        super((Handler) null);
        this.f25513a = zzic;
    }

    public final void onChange(boolean z2) {
        this.f25513a.e();
    }
}
