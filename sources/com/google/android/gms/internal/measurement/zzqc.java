package com.google.android.gms.internal.measurement;

public final class zzqc implements zzpz {

    /* renamed from: a  reason: collision with root package name */
    public static final zzir f25809a;

    /* renamed from: b  reason: collision with root package name */
    public static final zzir f25810b;

    /* renamed from: c  reason: collision with root package name */
    public static final zzir f25811c;

    static {
        zziz e2 = new zziz(zzio.a("com.google.android.gms.measurement")).f().e();
        e2.d("measurement.client.ad_id_consent_fix", true);
        e2.d("measurement.service.consent.aiid_reset_fix", false);
        e2.d("measurement.service.consent.aiid_reset_fix2", true);
        f25809a = e2.d("measurement.service.consent.app_start_fix", true);
        f25810b = e2.d("measurement.service.consent.params_on_fx", true);
        f25811c = e2.d("measurement.service.consent.pfo_on_fx", true);
    }

    public final boolean a() {
        return ((Boolean) f25809a.f()).booleanValue();
    }

    public final boolean b() {
        return ((Boolean) f25810b.f()).booleanValue();
    }

    public final boolean c() {
        return ((Boolean) f25811c.f()).booleanValue();
    }
}
