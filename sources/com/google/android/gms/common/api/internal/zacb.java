package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.internal.ListenerHolder;

public final /* synthetic */ class zacb implements Runnable {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ ListenerHolder.Notifier f24684A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ ListenerHolder f24685z;

    public /* synthetic */ zacb(ListenerHolder listenerHolder, ListenerHolder.Notifier notifier) {
        this.f24685z = listenerHolder;
        this.f24684A = notifier;
    }

    public final void run() {
        this.f24685z.d(this.f24684A);
    }
}
