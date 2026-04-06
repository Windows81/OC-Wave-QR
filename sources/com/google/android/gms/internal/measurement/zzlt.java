package com.google.android.gms.internal.measurement;

public class zzlt {

    /* renamed from: a  reason: collision with root package name */
    public volatile zzml f25642a;

    /* renamed from: b  reason: collision with root package name */
    public volatile zzjs f25643b;

    public final int a() {
        if (this.f25643b != null) {
            return this.f25643b.u();
        }
        if (this.f25642a != null) {
            return this.f25642a.h();
        }
        return 0;
    }

    public final zzml b(zzml zzml) {
        zzml zzml2 = this.f25642a;
        this.f25643b = null;
        this.f25642a = zzml;
        return zzml2;
    }

    public final zzjs c() {
        if (this.f25643b != null) {
            return this.f25643b;
        }
        synchronized (this) {
            try {
                if (this.f25643b != null) {
                    zzjs zzjs = this.f25643b;
                    return zzjs;
                }
                if (this.f25642a == null) {
                    this.f25643b = zzjs.f25568A;
                } else {
                    this.f25643b = this.f25642a.f();
                }
                zzjs zzjs2 = this.f25643b;
                return zzjs2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:8|9|10|11|12|13) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x0014 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.measurement.zzml d(com.google.android.gms.internal.measurement.zzml r2) {
        /*
            r1 = this;
            com.google.android.gms.internal.measurement.zzml r0 = r1.f25642a
            if (r0 != 0) goto L_0x001e
            monitor-enter(r1)
            com.google.android.gms.internal.measurement.zzml r0 = r1.f25642a     // Catch:{ all -> 0x000b }
            if (r0 == 0) goto L_0x000d
            monitor-exit(r1)     // Catch:{ all -> 0x000b }
            goto L_0x001e
        L_0x000b:
            r2 = move-exception
            goto L_0x001c
        L_0x000d:
            r1.f25642a = r2     // Catch:{ zzlk -> 0x0014 }
            com.google.android.gms.internal.measurement.zzjs r0 = com.google.android.gms.internal.measurement.zzjs.f25568A     // Catch:{ zzlk -> 0x0014 }
            r1.f25643b = r0     // Catch:{ zzlk -> 0x0014 }
            goto L_0x001a
        L_0x0014:
            r1.f25642a = r2     // Catch:{ all -> 0x000b }
            com.google.android.gms.internal.measurement.zzjs r2 = com.google.android.gms.internal.measurement.zzjs.f25568A     // Catch:{ all -> 0x000b }
            r1.f25643b = r2     // Catch:{ all -> 0x000b }
        L_0x001a:
            monitor-exit(r1)     // Catch:{ all -> 0x000b }
            goto L_0x001e
        L_0x001c:
            monitor-exit(r1)     // Catch:{ all -> 0x000b }
            throw r2
        L_0x001e:
            com.google.android.gms.internal.measurement.zzml r2 = r1.f25642a
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzlt.d(com.google.android.gms.internal.measurement.zzml):com.google.android.gms.internal.measurement.zzml");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzlt)) {
            return false;
        }
        zzlt zzlt = (zzlt) obj;
        zzml zzml = this.f25642a;
        zzml zzml2 = zzlt.f25642a;
        return (zzml == null && zzml2 == null) ? c().equals(zzlt.c()) : (zzml == null || zzml2 == null) ? zzml != null ? zzml.equals(zzlt.d(zzml.e())) : d(zzml2.e()).equals(zzml2) : zzml.equals(zzml2);
    }

    public int hashCode() {
        return 1;
    }
}
