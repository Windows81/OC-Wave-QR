package com.google.android.gms.internal.measurement;

import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;

public final class zzhr implements zzhs {

    /* renamed from: a  reason: collision with root package name */
    public final AtomicBoolean f25487a = new AtomicBoolean();

    /* renamed from: b  reason: collision with root package name */
    public HashMap f25488b = null;

    /* renamed from: c  reason: collision with root package name */
    public final HashMap f25489c = new HashMap(16, 1.0f);

    /* renamed from: d  reason: collision with root package name */
    public final HashMap f25490d = new HashMap(16, 1.0f);

    /* renamed from: e  reason: collision with root package name */
    public final HashMap f25491e = new HashMap(16, 1.0f);

    /* renamed from: f  reason: collision with root package name */
    public final HashMap f25492f = new HashMap(16, 1.0f);

    /* renamed from: g  reason: collision with root package name */
    public Object f25493g = null;

    /* renamed from: h  reason: collision with root package name */
    public boolean f25494h = false;

    /* renamed from: i  reason: collision with root package name */
    public String[] f25495i = new String[0];

    /* renamed from: j  reason: collision with root package name */
    public final zzhy f25496j = new zzhw();

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x006f, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00ea, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00ec, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:?, code lost:
        r7 = r6.f25496j.b(r7, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00f7, code lost:
        if (r7 == null) goto L_0x0100;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00fd, code lost:
        if (r7.equals((java.lang.Object) null) == false) goto L_0x0100;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00ff, code lost:
        r7 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0100, code lost:
        monitor-enter(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0103, code lost:
        if (r9 != r6.f25493g) goto L_0x010d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0105, code lost:
        r6.f25488b.put(r8, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x010b, code lost:
        r7 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x010d, code lost:
        monitor-exit(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x010e, code lost:
        if (r7 == null) goto L_0x0111;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0110, code lost:
        return r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0111, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0113, code lost:
        throw r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0114, code lost:
        return null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String a(android.content.ContentResolver r7, java.lang.String r8, java.lang.String r9) {
        /*
            r6 = this;
            if (r7 == 0) goto L_0x0117
            monitor-enter(r6)
            java.util.HashMap r9 = r6.f25488b     // Catch:{ all -> 0x002c }
            r0 = 1
            r1 = 0
            r2 = 0
            if (r9 != 0) goto L_0x002f
            java.util.concurrent.atomic.AtomicBoolean r9 = r6.f25487a     // Catch:{ all -> 0x002c }
            r9.set(r1)     // Catch:{ all -> 0x002c }
            java.util.HashMap r9 = new java.util.HashMap     // Catch:{ all -> 0x002c }
            r3 = 16
            r4 = 1065353216(0x3f800000, float:1.0)
            r9.<init>(r3, r4)     // Catch:{ all -> 0x002c }
            r6.f25488b = r9     // Catch:{ all -> 0x002c }
            java.lang.Object r9 = new java.lang.Object     // Catch:{ all -> 0x002c }
            r9.<init>()     // Catch:{ all -> 0x002c }
            r6.f25493g = r9     // Catch:{ all -> 0x002c }
            android.net.Uri r9 = com.google.android.gms.internal.measurement.zzhq.f25483a     // Catch:{ all -> 0x002c }
            com.google.android.gms.internal.measurement.zzht r3 = new com.google.android.gms.internal.measurement.zzht     // Catch:{ all -> 0x002c }
            r3.<init>(r6, r2)     // Catch:{ all -> 0x002c }
            r7.registerContentObserver(r9, r0, r3)     // Catch:{ all -> 0x002c }
            goto L_0x0059
        L_0x002c:
            r7 = move-exception
            goto L_0x0115
        L_0x002f:
            java.util.concurrent.atomic.AtomicBoolean r9 = r6.f25487a     // Catch:{ all -> 0x002c }
            boolean r9 = r9.getAndSet(r1)     // Catch:{ all -> 0x002c }
            if (r9 == 0) goto L_0x0059
            java.util.HashMap r9 = r6.f25488b     // Catch:{ all -> 0x002c }
            r9.clear()     // Catch:{ all -> 0x002c }
            java.util.HashMap r9 = r6.f25489c     // Catch:{ all -> 0x002c }
            r9.clear()     // Catch:{ all -> 0x002c }
            java.util.HashMap r9 = r6.f25490d     // Catch:{ all -> 0x002c }
            r9.clear()     // Catch:{ all -> 0x002c }
            java.util.HashMap r9 = r6.f25491e     // Catch:{ all -> 0x002c }
            r9.clear()     // Catch:{ all -> 0x002c }
            java.util.HashMap r9 = r6.f25492f     // Catch:{ all -> 0x002c }
            r9.clear()     // Catch:{ all -> 0x002c }
            java.lang.Object r9 = new java.lang.Object     // Catch:{ all -> 0x002c }
            r9.<init>()     // Catch:{ all -> 0x002c }
            r6.f25493g = r9     // Catch:{ all -> 0x002c }
            r6.f25494h = r1     // Catch:{ all -> 0x002c }
        L_0x0059:
            java.lang.Object r9 = r6.f25493g     // Catch:{ all -> 0x002c }
            java.util.HashMap r3 = r6.f25488b     // Catch:{ all -> 0x002c }
            boolean r3 = r3.containsKey(r8)     // Catch:{ all -> 0x002c }
            if (r3 == 0) goto L_0x0070
            java.util.HashMap r7 = r6.f25488b     // Catch:{ all -> 0x002c }
            java.lang.Object r7 = r7.get(r8)     // Catch:{ all -> 0x002c }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ all -> 0x002c }
            if (r7 == 0) goto L_0x006e
            r2 = r7
        L_0x006e:
            monitor-exit(r6)     // Catch:{ all -> 0x002c }
            return r2
        L_0x0070:
            java.lang.String[] r3 = r6.f25495i     // Catch:{ all -> 0x002c }
            int r4 = r3.length     // Catch:{ all -> 0x002c }
        L_0x0073:
            if (r1 >= r4) goto L_0x00f0
            r5 = r3[r1]     // Catch:{ all -> 0x002c }
            boolean r5 = r8.startsWith(r5)     // Catch:{ all -> 0x002c }
            if (r5 == 0) goto L_0x00ed
            boolean r9 = r6.f25494h     // Catch:{ all -> 0x002c }
            if (r9 != 0) goto L_0x00eb
            java.lang.String[] r9 = r6.f25495i     // Catch:{ all -> 0x002c }
            com.google.android.gms.internal.measurement.zzhy r1 = r6.f25496j     // Catch:{ zzhx -> 0x00d6 }
            com.google.android.gms.internal.measurement.zzhu r3 = new com.google.android.gms.internal.measurement.zzhu     // Catch:{ zzhx -> 0x00d6 }
            r3.<init>()     // Catch:{ zzhx -> 0x00d6 }
            java.util.Map r7 = r1.a(r7, r9, r3)     // Catch:{ zzhx -> 0x00d6 }
            java.util.HashMap r7 = (java.util.HashMap) r7     // Catch:{ zzhx -> 0x00d6 }
            boolean r9 = r7.isEmpty()     // Catch:{ all -> 0x002c }
            if (r9 != 0) goto L_0x00be
            java.util.Set r9 = r7.keySet()     // Catch:{ all -> 0x002c }
            java.util.HashMap r1 = r6.f25489c     // Catch:{ all -> 0x002c }
            java.util.Set r1 = r1.keySet()     // Catch:{ all -> 0x002c }
            r9.removeAll(r1)     // Catch:{ all -> 0x002c }
            java.util.HashMap r1 = r6.f25490d     // Catch:{ all -> 0x002c }
            java.util.Set r1 = r1.keySet()     // Catch:{ all -> 0x002c }
            r9.removeAll(r1)     // Catch:{ all -> 0x002c }
            java.util.HashMap r1 = r6.f25491e     // Catch:{ all -> 0x002c }
            java.util.Set r1 = r1.keySet()     // Catch:{ all -> 0x002c }
            r9.removeAll(r1)     // Catch:{ all -> 0x002c }
            java.util.HashMap r1 = r6.f25492f     // Catch:{ all -> 0x002c }
            java.util.Set r1 = r1.keySet()     // Catch:{ all -> 0x002c }
            r9.removeAll(r1)     // Catch:{ all -> 0x002c }
        L_0x00be:
            boolean r9 = r7.isEmpty()     // Catch:{ all -> 0x002c }
            if (r9 != 0) goto L_0x00d4
            java.util.HashMap r9 = r6.f25488b     // Catch:{ all -> 0x002c }
            boolean r9 = r9.isEmpty()     // Catch:{ all -> 0x002c }
            if (r9 == 0) goto L_0x00cf
            r6.f25488b = r7     // Catch:{ all -> 0x002c }
            goto L_0x00d4
        L_0x00cf:
            java.util.HashMap r9 = r6.f25488b     // Catch:{ all -> 0x002c }
            r9.putAll(r7)     // Catch:{ all -> 0x002c }
        L_0x00d4:
            r6.f25494h = r0     // Catch:{ all -> 0x002c }
        L_0x00d6:
            java.util.HashMap r7 = r6.f25488b     // Catch:{ all -> 0x002c }
            boolean r7 = r7.containsKey(r8)     // Catch:{ all -> 0x002c }
            if (r7 == 0) goto L_0x00eb
            java.util.HashMap r7 = r6.f25488b     // Catch:{ all -> 0x002c }
            java.lang.Object r7 = r7.get(r8)     // Catch:{ all -> 0x002c }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ all -> 0x002c }
            if (r7 == 0) goto L_0x00e9
            r2 = r7
        L_0x00e9:
            monitor-exit(r6)     // Catch:{ all -> 0x002c }
            return r2
        L_0x00eb:
            monitor-exit(r6)     // Catch:{ all -> 0x002c }
            return r2
        L_0x00ed:
            int r1 = r1 + 1
            goto L_0x0073
        L_0x00f0:
            monitor-exit(r6)     // Catch:{ all -> 0x002c }
            com.google.android.gms.internal.measurement.zzhy r0 = r6.f25496j     // Catch:{ zzhx -> 0x0114 }
            java.lang.String r7 = r0.b(r7, r8)     // Catch:{ zzhx -> 0x0114 }
            if (r7 == 0) goto L_0x0100
            boolean r0 = r7.equals(r2)
            if (r0 == 0) goto L_0x0100
            r7 = r2
        L_0x0100:
            monitor-enter(r6)
            java.lang.Object r0 = r6.f25493g     // Catch:{ all -> 0x010b }
            if (r9 != r0) goto L_0x010d
            java.util.HashMap r9 = r6.f25488b     // Catch:{ all -> 0x010b }
            r9.put(r8, r7)     // Catch:{ all -> 0x010b }
            goto L_0x010d
        L_0x010b:
            r7 = move-exception
            goto L_0x0112
        L_0x010d:
            monitor-exit(r6)     // Catch:{ all -> 0x010b }
            if (r7 == 0) goto L_0x0111
            return r7
        L_0x0111:
            return r2
        L_0x0112:
            monitor-exit(r6)     // Catch:{ all -> 0x010b }
            throw r7
        L_0x0114:
            return r2
        L_0x0115:
            monitor-exit(r6)     // Catch:{ all -> 0x002c }
            throw r7
        L_0x0117:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "ContentResolver needed with GservicesDelegateSupplier.init()"
            r7.<init>(r8)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzhr.a(android.content.ContentResolver, java.lang.String, java.lang.String):java.lang.String");
    }
}
