package com.google.android.gms.internal.measurement;

public final class zzpe implements zzpb {

    /* renamed from: a  reason: collision with root package name */
    public static final zzir f25778a;

    static {
        zziz e2 = new zziz(zzio.a("com.google.android.gms.measurement")).f().e();
        e2.d("measurement.client.consent_state_v1", true);
        e2.d("measurement.client.3p_consent_state_v1", true);
        e2.d("measurement.service.consent_state_v1_W36", true);
        f25778a = e2.b("measurement.service.storage_consent_support_version", 203600);
    }

    public final long a() {
        return ((Long) f25778a.f()).longValue();
    }
}
