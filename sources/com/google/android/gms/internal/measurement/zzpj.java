package com.google.android.gms.internal.measurement;

import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;

public final class zzpj implements Supplier<zzpm> {

    /* renamed from: A  reason: collision with root package name */
    public static zzpj f25785A = new zzpj();

    /* renamed from: z  reason: collision with root package name */
    public final Supplier f25786z = Suppliers.b(new zzpl());

    public static boolean a() {
        return ((zzpm) f25785A.get()).a();
    }

    public static boolean b() {
        return ((zzpm) f25785A.get()).b();
    }

    public final /* synthetic */ Object get() {
        return (zzpm) this.f25786z.get();
    }
}
