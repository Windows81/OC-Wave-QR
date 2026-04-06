package com.google.android.gms.internal.measurement;

public final class zzpk implements zzph {

    /* renamed from: a  reason: collision with root package name */
    public static final zzir f25787a;

    /* renamed from: b  reason: collision with root package name */
    public static final zzir f25788b;

    static {
        zziz e2 = new zziz(zzio.a("com.google.android.gms.measurement")).f().e();
        f25787a = e2.d("measurement.set_default_event_parameters_with_backfill.client.dev", false);
        f25788b = e2.d("measurement.set_default_event_parameters_with_backfill.service", false);
    }

    public final boolean a() {
        return true;
    }

    public final boolean b() {
        return ((Boolean) f25787a.f()).booleanValue();
    }

    public final boolean c() {
        return ((Boolean) f25788b.f()).booleanValue();
    }
}
