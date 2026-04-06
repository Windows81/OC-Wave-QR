package com.google.android.gms.internal.measurement;

import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;

public final class zzpo implements Supplier<zzpn> {

    /* renamed from: A  reason: collision with root package name */
    public static zzpo f25791A = new zzpo();

    /* renamed from: z  reason: collision with root package name */
    public final Supplier f25792z = Suppliers.b(new zzpq());

    public static boolean a() {
        return ((zzpn) f25791A.get()).a();
    }

    public static boolean b() {
        return ((zzpn) f25791A.get()).b();
    }

    public final /* synthetic */ Object get() {
        return (zzpn) this.f25792z.get();
    }
}
