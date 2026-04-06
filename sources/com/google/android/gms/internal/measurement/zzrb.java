package com.google.android.gms.internal.measurement;

public final class zzrb implements zzrc {

    /* renamed from: a  reason: collision with root package name */
    public static final zzir f25840a;

    /* renamed from: b  reason: collision with root package name */
    public static final zzir f25841b;

    static {
        zziz e2 = new zziz(zzio.a("com.google.android.gms.measurement")).f().e();
        f25840a = e2.d("measurement.item_scoped_custom_parameters.client", true);
        f25841b = e2.d("measurement.item_scoped_custom_parameters.service", true);
    }

    public final boolean a() {
        return true;
    }

    public final boolean b() {
        return ((Boolean) f25840a.f()).booleanValue();
    }

    public final boolean c() {
        return ((Boolean) f25841b.f()).booleanValue();
    }
}
