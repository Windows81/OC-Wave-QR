package com.google.android.gms.common.api.internal;

import java.util.ArrayList;
import java.util.List;

final class zaa extends LifecycleCallback {

    /* renamed from: A  reason: collision with root package name */
    public List f24533A;

    public final void k() {
        List<Runnable> list;
        synchronized (this) {
            list = this.f24533A;
            this.f24533A = new ArrayList();
        }
        for (Runnable run : list) {
            run.run();
        }
    }
}
