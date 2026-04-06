package com.google.android.gms.measurement.internal;

import android.content.ServiceConnection;
import android.net.Uri;
import android.os.Bundle;
import com.google.android.gms.common.stats.ConnectionTracker;
import com.google.android.gms.internal.measurement.zzbz;
import com.google.android.gms.internal.measurement.zzqn;

final class zzhf implements Runnable {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ ServiceConnection f26437A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ zzhc f26438B;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ zzbz f26439z;

    public zzhf(zzhc zzhc, zzbz zzbz, ServiceConnection serviceConnection) {
        this.f26439z = zzbz;
        this.f26437A = serviceConnection;
        this.f26438B = zzhc;
    }

    public final void run() {
        zzhc zzhc = this.f26438B;
        zzhd zzhd = zzhc.f26434b;
        String a2 = zzhc.f26433a;
        zzbz zzbz = this.f26439z;
        ServiceConnection serviceConnection = this.f26437A;
        Bundle a3 = zzhd.a(a2, zzbz);
        zzhd.f26435a.f().n();
        zzhd.f26435a.Q();
        if (a3 != null) {
            long j2 = a3.getLong("install_begin_timestamp_seconds", 0) * 1000;
            if (j2 == 0) {
                zzhd.f26435a.m().L().a("Service response is missing Install Referrer install timestamp");
            } else {
                String string = a3.getString("install_referrer");
                if (string == null || string.isEmpty()) {
                    zzhd.f26435a.m().G().a("No referrer defined in Install Referrer response");
                } else {
                    zzhd.f26435a.m().K().b("InstallReferrer API result", string);
                    boolean z2 = zzqn.a() && zzhd.f26435a.z().t(zzbj.U0);
                    zzop L = zzhd.f26435a.L();
                    Bundle C = L.C(Uri.parse("?" + string), z2);
                    if (C == null) {
                        zzhd.f26435a.m().G().a("No campaign params defined in Install Referrer result");
                    } else {
                        if (!z2) {
                            String string2 = C.getString("medium");
                            if (string2 != null && !"(not set)".equalsIgnoreCase(string2) && !"organic".equalsIgnoreCase(string2)) {
                                long j3 = a3.getLong("referrer_click_timestamp_seconds", 0) * 1000;
                                if (j3 == 0) {
                                    zzhd.f26435a.m().G().a("Install Referrer is missing click timestamp for ad campaign");
                                } else {
                                    C.putLong("click_timestamp", j3);
                                }
                            }
                        } else if (C.containsKey("gclid") || C.containsKey("gbraid")) {
                            long j4 = a3.getLong("referrer_click_timestamp_server_seconds", 0) * 1000;
                            if (j4 > 0) {
                                C.putLong("click_timestamp", j4);
                            }
                        }
                        if (j2 == zzhd.f26435a.F().f26361h.a()) {
                            zzhd.f26435a.m().K().a("Logging Install Referrer campaign from module while it may have already been logged.");
                        }
                        if (zzhd.f26435a.p()) {
                            zzhd.f26435a.F().f26361h.b(j2);
                            zzhd.f26435a.m().K().b("Logging Install Referrer campaign from gmscore with ", "referrer API v2");
                            C.putString("_cis", "referrer API v2");
                            zzhd.f26435a.H().i0("auto", "_cmp", C, a2);
                        }
                    }
                }
            }
        }
        if (serviceConnection != null) {
            ConnectionTracker.b().c(zzhd.f26435a.a(), serviceConnection);
        }
    }
}
