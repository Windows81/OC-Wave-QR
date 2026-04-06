package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.tasks.TaskCompletionSource;

public final class zah extends zad {

    /* renamed from: c  reason: collision with root package name */
    public final ListenerHolder.ListenerKey f24742c;

    public zah(ListenerHolder.ListenerKey listenerKey, TaskCompletionSource taskCompletionSource) {
        super(4, taskCompletionSource);
        this.f24742c = listenerKey;
    }

    public final /* bridge */ /* synthetic */ void d(zaad zaad, boolean z2) {
    }

    public final boolean f(zabq zabq) {
        zaci zaci = (zaci) zabq.v().get(this.f24742c);
        return zaci != null && zaci.f24699a.e();
    }

    public final Feature[] g(zabq zabq) {
        zaci zaci = (zaci) zabq.v().get(this.f24742c);
        if (zaci == null) {
            return null;
        }
        return zaci.f24699a.c();
    }

    public final void h(zabq zabq) {
        zaci zaci = (zaci) zabq.v().remove(this.f24742c);
        if (zaci != null) {
            zaci.f24700b.a(zabq.t(), this.f24723b);
            zaci.f24699a.a();
            return;
        }
        this.f24723b.e(Boolean.FALSE);
    }
}
