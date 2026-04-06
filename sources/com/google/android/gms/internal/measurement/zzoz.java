package com.google.android.gms.internal.measurement;

public final class zzoz implements zzpa {

    /* renamed from: a  reason: collision with root package name */
    public static final zzir f25771a;

    /* renamed from: b  reason: collision with root package name */
    public static final zzir f25772b;

    static {
        zziz e2 = new zziz(zzio.a("com.google.android.gms.measurement")).f().e();
        f25771a = e2.d("measurement.consent_regional_defaults.client2", true);
        f25772b = e2.d("measurement.consent_regional_defaults.service", true);
    }

    public final boolean a() {
        return true;
    }

    public final boolean b() {
        return ((Boolean) f25771a.f()).booleanValue();
    }

    public final boolean c() {
        return ((Boolean) f25772b.f()).booleanValue();
    }
}
