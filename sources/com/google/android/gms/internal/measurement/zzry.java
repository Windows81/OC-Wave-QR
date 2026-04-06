package com.google.android.gms.internal.measurement;

public final class zzry implements zzrv {

    /* renamed from: a  reason: collision with root package name */
    public static final zzir f25879a;

    /* renamed from: b  reason: collision with root package name */
    public static final zzir f25880b;

    /* renamed from: c  reason: collision with root package name */
    public static final zzir f25881c;

    /* renamed from: d  reason: collision with root package name */
    public static final zzir f25882d;

    static {
        zziz e2 = new zziz(zzio.a("com.google.android.gms.measurement")).f().e();
        f25879a = e2.d("measurement.sgtm.google_signal.enable", false);
        f25880b = e2.d("measurement.sgtm.preview_mode_enabled", true);
        f25881c = e2.d("measurement.sgtm.service", true);
        f25882d = e2.d("measurement.sgtm.upload_queue", false);
        e2.b("measurement.id.sgtm", 0);
    }

    public final boolean a() {
        return true;
    }

    public final boolean b() {
        return ((Boolean) f25879a.f()).booleanValue();
    }

    public final boolean c() {
        return ((Boolean) f25880b.f()).booleanValue();
    }

    public final boolean e() {
        return ((Boolean) f25881c.f()).booleanValue();
    }

    public final boolean g() {
        return ((Boolean) f25882d.f()).booleanValue();
    }
}
