package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

public final class zaad {

    /* renamed from: a  reason: collision with root package name */
    public final Map f24552a = Collections.synchronizedMap(new WeakHashMap());

    /* renamed from: b  reason: collision with root package name */
    public final Map f24553b = Collections.synchronizedMap(new WeakHashMap());

    public final void c(BasePendingResult basePendingResult, boolean z2) {
        this.f24552a.put(basePendingResult, Boolean.valueOf(z2));
        basePendingResult.b(new zaab(this, basePendingResult));
    }

    public final void d(TaskCompletionSource taskCompletionSource, boolean z2) {
        this.f24553b.put(taskCompletionSource, Boolean.valueOf(z2));
        taskCompletionSource.a().b(new zaac(this, taskCompletionSource));
    }

    public final void e(int i2, String str) {
        StringBuilder sb = new StringBuilder("The connection to Google Play services was lost");
        if (i2 == 1) {
            sb.append(" due to service disconnection.");
        } else if (i2 == 3) {
            sb.append(" due to dead object exception.");
        }
        if (str != null) {
            sb.append(" Last reason for disconnect: ");
            sb.append(str);
        }
        h(true, new Status(20, sb.toString()));
    }

    public final void f() {
        h(false, GoogleApiManager.f24480p);
    }

    public final boolean g() {
        return !this.f24552a.isEmpty() || !this.f24553b.isEmpty();
    }

    public final void h(boolean z2, Status status) {
        HashMap hashMap;
        HashMap hashMap2;
        synchronized (this.f24552a) {
            hashMap = new HashMap(this.f24552a);
        }
        synchronized (this.f24553b) {
            hashMap2 = new HashMap(this.f24553b);
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            if (z2 || ((Boolean) entry.getValue()).booleanValue()) {
                ((BasePendingResult) entry.getKey()).g(status);
            }
        }
        for (Map.Entry entry2 : hashMap2.entrySet()) {
            if (z2 || ((Boolean) entry2.getValue()).booleanValue()) {
                ((TaskCompletionSource) entry2.getKey()).d(new ApiException(status));
            }
        }
    }
}
