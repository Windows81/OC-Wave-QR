package com.google.android.gms.internal.measurement;

public final class zzrs implements zzrp {

    /* renamed from: a  reason: collision with root package name */
    public static final zzir f25872a;

    static {
        zziz e2 = new zziz(zzio.a("com.google.android.gms.measurement")).f().e();
        e2.d("measurement.collection.enable_session_stitching_token.client.dev", true);
        e2.d("measurement.collection.enable_session_stitching_token.first_open_fix", true);
        f25872a = e2.d("measurement.session_stitching_token_enabled", false);
        e2.d("measurement.link_sst_to_sid", true);
    }

    public final boolean a() {
        return true;
    }

    public final boolean b() {
        return ((Boolean) f25872a.f()).booleanValue();
    }
}
