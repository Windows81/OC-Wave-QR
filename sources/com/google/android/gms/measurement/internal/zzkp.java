package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.zzdl;

final class zzkp implements Runnable {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ zzjk f26697A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ zzdl f26698z;

    public zzkp(zzjk zzjk, zzdl zzdl) {
        this.f26698z = zzdl;
        this.f26697A = zzjk;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0069 A[SYNTHETIC, Splitter:B:12:0x0069] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r7 = this;
            com.google.android.gms.measurement.internal.zzjk r0 = r7.f26697A
            com.google.android.gms.measurement.internal.zznb r0 = r0.u()
            com.google.android.gms.measurement.internal.zzgu r1 = r0.i()
            com.google.android.gms.measurement.internal.zzjc r1 = r1.M()
            boolean r1 = r1.B()
            r2 = 0
            if (r1 != 0) goto L_0x0024
            com.google.android.gms.measurement.internal.zzgi r0 = r0.m()
            com.google.android.gms.measurement.internal.zzgk r0 = r0.M()
            java.lang.String r1 = "Analytics storage consent denied; will not get session id"
            r0.a(r1)
        L_0x0022:
            r0 = r2
            goto L_0x0055
        L_0x0024:
            com.google.android.gms.measurement.internal.zzgu r1 = r0.i()
            com.google.android.gms.common.util.Clock r3 = r0.b()
            long r3 = r3.a()
            boolean r1 = r1.z(r3)
            if (r1 != 0) goto L_0x0022
            com.google.android.gms.measurement.internal.zzgu r1 = r0.i()
            com.google.android.gms.measurement.internal.zzgz r1 = r1.f26372s
            long r3 = r1.a()
            r5 = 0
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 != 0) goto L_0x0047
            goto L_0x0022
        L_0x0047:
            com.google.android.gms.measurement.internal.zzgu r0 = r0.i()
            com.google.android.gms.measurement.internal.zzgz r0 = r0.f26372s
            long r0 = r0.a()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
        L_0x0055:
            if (r0 == 0) goto L_0x0069
            com.google.android.gms.measurement.internal.zzjk r1 = r7.f26697A
            com.google.android.gms.measurement.internal.zzhw r1 = r1.f26587a
            com.google.android.gms.measurement.internal.zzop r1 = r1.L()
            com.google.android.gms.internal.measurement.zzdl r2 = r7.f26698z
            long r3 = r0.longValue()
            r1.Q(r2, r3)
            return
        L_0x0069:
            com.google.android.gms.internal.measurement.zzdl r0 = r7.f26698z     // Catch:{ RemoteException -> 0x006f }
            r0.u(r2)     // Catch:{ RemoteException -> 0x006f }
            return
        L_0x006f:
            r0 = move-exception
            com.google.android.gms.measurement.internal.zzjk r1 = r7.f26697A
            com.google.android.gms.measurement.internal.zzhw r1 = r1.f26587a
            com.google.android.gms.measurement.internal.zzgi r1 = r1.m()
            com.google.android.gms.measurement.internal.zzgk r1 = r1.G()
            java.lang.String r2 = "getSessionId failed with exception"
            r1.b(r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzkp.run():void");
    }
}
