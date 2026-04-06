package com.google.android.gms.internal.measurement;

public final class zzpx implements zzpy {

    /* renamed from: a  reason: collision with root package name */
    public static final zzir f25803a;

    /* renamed from: b  reason: collision with root package name */
    public static final zzir f25804b;

    static {
        zziz e2 = new zziz(zzio.a("com.google.android.gms.measurement")).f().e();
        e2.d("measurement.collection.event_safelist", true);
        f25803a = e2.d("measurement.service.store_null_safelist", true);
        f25804b = e2.d("measurement.service.store_safelist", true);
    }

    public final boolean a() {
        return true;
    }

    public final boolean b() {
        return ((Boolean) f25803a.f()).booleanValue();
    }

    public final boolean c() {
        return ((Boolean) f25804b.f()).booleanValue();
    }
}
