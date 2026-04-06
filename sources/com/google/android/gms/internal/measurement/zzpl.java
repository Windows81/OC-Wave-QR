package com.google.android.gms.internal.measurement;

public final class zzpl implements zzpm {

    /* renamed from: a  reason: collision with root package name */
    public static final zzir f25789a;

    /* renamed from: b  reason: collision with root package name */
    public static final zzir f25790b;

    static {
        zziz e2 = new zziz(zzio.a("com.google.android.gms.measurement")).f().e();
        f25789a = e2.d("measurement.set_default_event_parameters_propagate_clear.client.dev", false);
        f25790b = e2.d("measurement.set_default_event_parameters_propagate_clear.service", false);
    }

    public final boolean a() {
        return ((Boolean) f25789a.f()).booleanValue();
    }

    public final boolean b() {
        return ((Boolean) f25790b.f()).booleanValue();
    }
}
