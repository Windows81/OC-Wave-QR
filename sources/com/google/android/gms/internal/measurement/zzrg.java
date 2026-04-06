package com.google.android.gms.internal.measurement;

public final class zzrg implements zzrd {

    /* renamed from: a  reason: collision with root package name */
    public static final zzir f25846a;

    static {
        zziz e2 = new zziz(zzio.a("com.google.android.gms.measurement")).f().e();
        e2.d("measurement.sdk.collection.enable_extend_user_property_size", true);
        e2.d("measurement.sdk.collection.last_deep_link_referrer2", true);
        f25846a = e2.d("measurement.sdk.collection.last_deep_link_referrer_campaign2", false);
        e2.b("measurement.id.sdk.collection.last_deep_link_referrer2", 0);
    }

    public final boolean a() {
        return ((Boolean) f25846a.f()).booleanValue();
    }
}
