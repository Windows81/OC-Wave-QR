package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.internal.ListenerHolder;

public final class zaf extends zad {

    /* renamed from: c  reason: collision with root package name */
    public final zaci f24738c;

    public final /* bridge */ /* synthetic */ void d(zaad zaad, boolean z2) {
    }

    public final boolean f(zabq zabq) {
        return this.f24738c.f24699a.e();
    }

    public final Feature[] g(zabq zabq) {
        return this.f24738c.f24699a.c();
    }

    public final void h(zabq zabq) {
        this.f24738c.f24699a.d(zabq.t(), this.f24723b);
        ListenerHolder.ListenerKey b2 = this.f24738c.f24699a.b();
        if (b2 != null) {
            zabq.v().put(b2, this.f24738c);
        }
    }
}
