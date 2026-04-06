package com.google.android.gms.internal.measurement;

public final class zzpf implements zzpg {

    /* renamed from: a  reason: collision with root package name */
    public static final zzir f25779a;

    /* renamed from: b  reason: collision with root package name */
    public static final zzir f25780b;

    /* renamed from: c  reason: collision with root package name */
    public static final zzir f25781c;

    /* renamed from: d  reason: collision with root package name */
    public static final zzir f25782d;

    static {
        zziz e2 = new zziz(zzio.a("com.google.android.gms.measurement")).f().e();
        f25779a = e2.d("measurement.consent.stop_reset_on_storage_denied.client", true);
        f25780b = e2.d("measurement.consent.stop_reset_on_storage_denied.service", true);
        f25781c = e2.d("measurement.consent.scrub_audience_data_analytics_consent", true);
        f25782d = e2.d("measurement.consent.fix_first_open_count_from_snapshot", true);
    }

    public final boolean a() {
        return true;
    }

    public final boolean b() {
        return ((Boolean) f25779a.f()).booleanValue();
    }

    public final boolean c() {
        return ((Boolean) f25780b.f()).booleanValue();
    }

    public final boolean e() {
        return ((Boolean) f25781c.f()).booleanValue();
    }

    public final boolean g() {
        return ((Boolean) f25782d.f()).booleanValue();
    }
}
