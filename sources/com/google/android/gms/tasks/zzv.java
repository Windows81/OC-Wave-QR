package com.google.android.gms.tasks;

import com.google.android.gms.common.api.internal.LifecycleCallback;
import java.lang.ref.WeakReference;
import java.util.List;

final class zzv extends LifecycleCallback {

    /* renamed from: A  reason: collision with root package name */
    public final List f27238A;

    public final void k() {
        synchronized (this.f27238A) {
            try {
                for (WeakReference weakReference : this.f27238A) {
                    zzq zzq = (zzq) weakReference.get();
                    if (zzq != null) {
                        zzq.c();
                    }
                }
                this.f27238A.clear();
            } finally {
            }
        }
    }
}
