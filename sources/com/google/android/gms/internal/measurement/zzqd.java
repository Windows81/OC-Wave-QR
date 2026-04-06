package com.google.android.gms.internal.measurement;

public final class zzqd implements zzqe {

    /* renamed from: a  reason: collision with root package name */
    public static final zzir f25812a;

    /* renamed from: b  reason: collision with root package name */
    public static final zzir f25813b;

    /* renamed from: c  reason: collision with root package name */
    public static final zzir f25814c;

    static {
        zziz e2 = new zziz(zzio.a("com.google.android.gms.measurement")).f().e();
        e2.d("measurement.service.audience.fix_skip_audience_with_failed_filters", true);
        f25812a = e2.d("measurement.audience.refresh_event_count_filters_timestamp", false);
        f25813b = e2.d("measurement.audience.use_bundle_end_timestamp_for_non_sequence_property_filters", false);
        f25814c = e2.d("measurement.audience.use_bundle_timestamp_for_event_count_filters", false);
    }

    public final boolean a() {
        return true;
    }

    public final boolean b() {
        return ((Boolean) f25812a.f()).booleanValue();
    }

    public final boolean c() {
        return ((Boolean) f25813b.f()).booleanValue();
    }

    public final boolean e() {
        return ((Boolean) f25814c.f()).booleanValue();
    }
}
