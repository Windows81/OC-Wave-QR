package com.google.android.gms.common.api;

import com.google.android.gms.common.api.PendingResult;

final class zab implements PendingResult.StatusListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Batch f24777a;

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0067, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(com.google.android.gms.common.api.Status r5) {
        /*
            r4 = this;
            com.google.android.gms.common.api.Batch r0 = r4.f24777a
            java.lang.Object r0 = r0.f24421u
            monitor-enter(r0)
            com.google.android.gms.common.api.Batch r1 = r4.f24777a     // Catch:{ all -> 0x0011 }
            boolean r1 = r1.h()     // Catch:{ all -> 0x0011 }
            if (r1 == 0) goto L_0x0013
            monitor-exit(r0)     // Catch:{ all -> 0x0011 }
            return
        L_0x0011:
            r5 = move-exception
            goto L_0x0068
        L_0x0013:
            boolean r1 = r5.m0()     // Catch:{ all -> 0x0011 }
            r2 = 1
            if (r1 == 0) goto L_0x0020
            com.google.android.gms.common.api.Batch r5 = r4.f24777a     // Catch:{ all -> 0x0011 }
            r5.f24419s = true     // Catch:{ all -> 0x0011 }
            goto L_0x002b
        L_0x0020:
            boolean r5 = r5.o0()     // Catch:{ all -> 0x0011 }
            if (r5 != 0) goto L_0x002b
            com.google.android.gms.common.api.Batch r5 = r4.f24777a     // Catch:{ all -> 0x0011 }
            r5.f24418r = true     // Catch:{ all -> 0x0011 }
        L_0x002b:
            com.google.android.gms.common.api.Batch r5 = r4.f24777a     // Catch:{ all -> 0x0011 }
            int r1 = r5.f24417q     // Catch:{ all -> 0x0011 }
            int r1 = r1 + -1
            r5.f24417q = r1     // Catch:{ all -> 0x0011 }
            com.google.android.gms.common.api.Batch r5 = r4.f24777a     // Catch:{ all -> 0x0011 }
            int r1 = r5.f24417q     // Catch:{ all -> 0x0011 }
            if (r1 != 0) goto L_0x0066
            boolean r1 = r5.f24419s     // Catch:{ all -> 0x0011 }
            if (r1 == 0) goto L_0x0048
            com.google.android.gms.common.api.zab.super.d()     // Catch:{ all -> 0x0011 }
            goto L_0x0066
        L_0x0048:
            boolean r5 = r5.f24418r     // Catch:{ all -> 0x0011 }
            if (r5 == 0) goto L_0x0056
            com.google.android.gms.common.api.Status r5 = new com.google.android.gms.common.api.Status     // Catch:{ all -> 0x0011 }
            r1 = 13
            r5.<init>(r1)     // Catch:{ all -> 0x0011 }
            goto L_0x0058
        L_0x0056:
            com.google.android.gms.common.api.Status r5 = com.google.android.gms.common.api.Status.E     // Catch:{ all -> 0x0011 }
        L_0x0058:
            com.google.android.gms.common.api.Batch r1 = r4.f24777a     // Catch:{ all -> 0x0011 }
            com.google.android.gms.common.api.BatchResult r2 = new com.google.android.gms.common.api.BatchResult     // Catch:{ all -> 0x0011 }
            com.google.android.gms.common.api.PendingResult[] r3 = r1.f24420t     // Catch:{ all -> 0x0011 }
            r2.<init>(r5, r3)     // Catch:{ all -> 0x0011 }
            r1.j(r2)     // Catch:{ all -> 0x0011 }
        L_0x0066:
            monitor-exit(r0)     // Catch:{ all -> 0x0011 }
            return
        L_0x0068:
            monitor-exit(r0)     // Catch:{ all -> 0x0011 }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.zab.a(com.google.android.gms.common.api.Status):void");
    }
}
