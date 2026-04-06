package com.google.android.gms.internal.measurement;

import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;

public final class zzrq implements Supplier<zzrp> {

    /* renamed from: A  reason: collision with root package name */
    public static zzrq f25868A = new zzrq();

    /* renamed from: z  reason: collision with root package name */
    public final Supplier f25869z = Suppliers.b(new zzrs());

    public static boolean a() {
        return ((zzrp) f25868A.get()).a();
    }

    public static boolean b() {
        return ((zzrp) f25868A.get()).b();
    }

    public final /* synthetic */ Object get() {
        return (zzrp) this.f25869z.get();
    }
}
