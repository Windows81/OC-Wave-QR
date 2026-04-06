package com.google.android.gms.internal.measurement;

import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;

public final class zzqz implements Supplier<zzrc> {

    /* renamed from: A  reason: collision with root package name */
    public static zzqz f25836A = new zzqz();

    /* renamed from: z  reason: collision with root package name */
    public final Supplier f25837z = Suppliers.b(new zzrb());

    public static boolean a() {
        return ((zzrc) f25836A.get()).a();
    }

    public static boolean b() {
        return ((zzrc) f25836A.get()).b();
    }

    public static boolean c() {
        return ((zzrc) f25836A.get()).c();
    }

    public final /* synthetic */ Object get() {
        return (zzrc) this.f25837z.get();
    }
}
