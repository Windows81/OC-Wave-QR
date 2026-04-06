package com.google.android.gms.internal.measurement;

import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;

public final class zzpi implements Supplier<zzph> {

    /* renamed from: A  reason: collision with root package name */
    public static zzpi f25783A = new zzpi();

    /* renamed from: z  reason: collision with root package name */
    public final Supplier f25784z = Suppliers.b(new zzpk());

    public static boolean a() {
        return ((zzph) f25783A.get()).a();
    }

    public static boolean b() {
        return ((zzph) f25783A.get()).b();
    }

    public static boolean c() {
        return ((zzph) f25783A.get()).c();
    }

    public final /* synthetic */ Object get() {
        return (zzph) this.f25784z.get();
    }
}
