package com.google.android.gms.measurement.internal;

import android.database.sqlite.SQLiteException;
import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzrl;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

final class zziw implements Callable<List<zznk>> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ zzp f26583a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Bundle f26584b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ zzia f26585c;

    public zziw(zzia zzia, zzp zzp, Bundle bundle) {
        this.f26583a = zzp;
        this.f26584b = bundle;
        this.f26585c = zzia;
    }

    public final /* synthetic */ Object call() {
        this.f26585c.f26522l.z0();
        zznv N = this.f26585c.f26522l;
        zzp zzp = this.f26583a;
        Bundle bundle = this.f26584b;
        N.f().n();
        if (!zzrl.a() || !N.i0().H(zzp.f26977z, zzbj.H0) || zzp.f26977z == null) {
            return new ArrayList();
        }
        if (bundle != null) {
            int[] intArray = bundle.getIntArray("uriSources");
            long[] longArray = bundle.getLongArray("uriTimestamps");
            if (intArray != null) {
                if (longArray == null || longArray.length != intArray.length) {
                    N.m().G().a("Uri sources and timestamps do not match");
                } else {
                    for (int i2 = 0; i2 < intArray.length; i2++) {
                        zzam l0 = N.l0();
                        String str = zzp.f26977z;
                        int i3 = intArray[i2];
                        long j2 = longArray[i2];
                        Preconditions.g(str);
                        l0.n();
                        l0.u();
                        try {
                            int delete = l0.B().delete("trigger_uris", "app_id=? and source=? and timestamp_millis<=?", new String[]{str, String.valueOf(i3), String.valueOf(j2)});
                            zzgk K = l0.m().K();
                            K.d("Pruned " + delete + " trigger URIs. appId, source, timestamp", str, Integer.valueOf(i3), Long.valueOf(j2));
                        } catch (SQLiteException e2) {
                            l0.m().G().c("Error pruning trigger URIs. appId", zzgi.v(str), e2);
                        }
                    }
                }
            }
        }
        return N.l0().W0(zzp.f26977z);
    }
}
