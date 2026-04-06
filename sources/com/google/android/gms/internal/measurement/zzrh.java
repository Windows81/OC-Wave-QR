package com.google.android.gms.internal.measurement;

public final class zzrh implements zzri {

    /* renamed from: a  reason: collision with root package name */
    public static final zzir f25847a;

    /* renamed from: b  reason: collision with root package name */
    public static final zzir f25848b;

    /* renamed from: c  reason: collision with root package name */
    public static final zzir f25849c;

    /* renamed from: d  reason: collision with root package name */
    public static final zzir f25850d;

    /* renamed from: e  reason: collision with root package name */
    public static final zzir f25851e;

    /* renamed from: f  reason: collision with root package name */
    public static final zzir f25852f;

    static {
        zziz e2 = new zziz(zzio.a("com.google.android.gms.measurement")).f().e();
        f25847a = e2.d("measurement.test.boolean_flag", false);
        f25848b = e2.b("measurement.test.cached_long_flag", -1);
        f25849c = e2.a("measurement.test.double_flag", -3.0d);
        f25850d = e2.b("measurement.test.int_flag", -2);
        f25851e = e2.b("measurement.test.long_flag", -1);
        f25852f = e2.c("measurement.test.string_flag", "---");
    }

    public final double a() {
        return ((Double) f25849c.f()).doubleValue();
    }

    public final long b() {
        return ((Long) f25848b.f()).longValue();
    }

    public final long c() {
        return ((Long) f25850d.f()).longValue();
    }

    public final long e() {
        return ((Long) f25851e.f()).longValue();
    }

    public final String g() {
        return (String) f25852f.f();
    }

    public final boolean h() {
        return ((Boolean) f25847a.f()).booleanValue();
    }
}
