package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.util.Log;
import java.util.concurrent.atomic.AtomicReference;

public final class zzdi extends zzdo {

    /* renamed from: l  reason: collision with root package name */
    public final AtomicReference f25415l = new AtomicReference();

    /* renamed from: m  reason: collision with root package name */
    public boolean f25416m;

    public static Object P(Bundle bundle, Class cls) {
        Object obj;
        if (bundle == null || (obj = bundle.get("r")) == null) {
            return null;
        }
        try {
            return cls.cast(obj);
        } catch (ClassCastException e2) {
            String canonicalName = cls.getCanonicalName();
            String canonicalName2 = obj.getClass().getCanonicalName();
            Log.w("AM", String.format("Unexpected object type. Expected, Received" + ": %s, %s", new Object[]{canonicalName, canonicalName2}), e2);
            throw e2;
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:5|6|8|9|10) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x000f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.os.Bundle N(long r3) {
        /*
            r2 = this;
            java.util.concurrent.atomic.AtomicReference r0 = r2.f25415l
            monitor-enter(r0)
            boolean r1 = r2.f25416m     // Catch:{ all -> 0x000d }
            if (r1 != 0) goto L_0x0012
            java.util.concurrent.atomic.AtomicReference r1 = r2.f25415l     // Catch:{ InterruptedException -> 0x000f }
            r1.wait(r3)     // Catch:{ InterruptedException -> 0x000f }
            goto L_0x0012
        L_0x000d:
            r3 = move-exception
            goto L_0x001c
        L_0x000f:
            monitor-exit(r0)     // Catch:{ all -> 0x000d }
            r3 = 0
            return r3
        L_0x0012:
            java.util.concurrent.atomic.AtomicReference r3 = r2.f25415l     // Catch:{ all -> 0x000d }
            java.lang.Object r3 = r3.get()     // Catch:{ all -> 0x000d }
            android.os.Bundle r3 = (android.os.Bundle) r3     // Catch:{ all -> 0x000d }
            monitor-exit(r0)     // Catch:{ all -> 0x000d }
            return r3
        L_0x001c:
            monitor-exit(r0)     // Catch:{ all -> 0x000d }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzdi.N(long):android.os.Bundle");
    }

    public final String W2(long j2) {
        return (String) P(N(j2), String.class);
    }

    public final void u(Bundle bundle) {
        synchronized (this.f25415l) {
            try {
                this.f25415l.set(bundle);
                this.f25416m = true;
                this.f25415l.notify();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final Long u1(long j2) {
        return (Long) P(N(j2), Long.class);
    }
}
