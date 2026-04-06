package com.google.android.gms.internal.measurement;

import android.database.ContentObserver;
import android.os.Handler;

final class zzht extends ContentObserver {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ zzhr f25497a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzht(zzhr zzhr, Handler handler) {
        super((Handler) null);
        this.f25497a = zzhr;
    }

    public final void onChange(boolean z2) {
        this.f25497a.f25487a.set(true);
    }
}
