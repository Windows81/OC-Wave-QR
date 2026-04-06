package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.common.data.DataHolder;

public abstract class DataHolderNotifier<L> implements ListenerHolder.Notifier<L> {

    /* renamed from: a  reason: collision with root package name */
    public final DataHolder f24477a;

    public final void a(Object obj) {
        c(obj, this.f24477a);
    }

    public void b() {
        DataHolder dataHolder = this.f24477a;
        if (dataHolder != null) {
            dataHolder.close();
        }
    }

    public abstract void c(Object obj, DataHolder dataHolder);
}
