package com.google.android.gms.internal.measurement;

final class zzlz implements zznc {

    /* renamed from: b  reason: collision with root package name */
    public static final zzmi f25647b = new zzly();

    /* renamed from: a  reason: collision with root package name */
    public final zzmi f25648a;

    public zzlz() {
        this(new zzma(zzld.c(), f25647b));
    }

    public final zznd a(Class cls) {
        zznf.o(cls);
        zzmj a2 = this.f25648a.a(cls);
        if (a2.c()) {
            return zzmr.k(zznf.f(), zzks.a(), a2.a());
        }
        return zzmp.p(cls, a2, zzmv.a(), zzlx.a(), zznf.f(), zzmb.f25650a[a2.b().ordinal()] != 1 ? zzks.a() : null, zzmg.a());
    }

    public zzlz(zzmi zzmi) {
        this.f25648a = (zzmi) zzle.f(zzmi, "messageInfoFactory");
    }
}
