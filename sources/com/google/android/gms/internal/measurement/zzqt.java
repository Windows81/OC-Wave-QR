package com.google.android.gms.internal.measurement;

import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;

public final class zzqt implements Supplier<zzqw> {

    /* renamed from: A  reason: collision with root package name */
    public static zzqt f25830A = new zzqt();

    /* renamed from: z  reason: collision with root package name */
    public final Supplier f25831z = Suppliers.b(new zzqv());

    public static boolean a() {
        return ((zzqw) f25830A.get()).a();
    }

    public static boolean b() {
        return ((zzqw) f25830A.get()).b();
    }

    public final /* synthetic */ Object get() {
        return (zzqw) this.f25831z.get();
    }
}
