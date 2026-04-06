package com.google.android.gms.internal.measurement;

import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;

public final class zzqs implements Supplier<zzqr> {

    /* renamed from: A  reason: collision with root package name */
    public static zzqs f25828A = new zzqs();

    /* renamed from: z  reason: collision with root package name */
    public final Supplier f25829z = Suppliers.b(new zzqu());

    public static boolean a() {
        return ((zzqr) f25828A.get()).a();
    }

    public static boolean b() {
        return ((zzqr) f25828A.get()).b();
    }

    public final /* synthetic */ Object get() {
        return (zzqr) this.f25829z.get();
    }
}
