package com.google.android.gms.internal.measurement;

import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;

public final class zzqy implements Supplier<zzqx> {

    /* renamed from: A  reason: collision with root package name */
    public static zzqy f25834A = new zzqy();

    /* renamed from: z  reason: collision with root package name */
    public final Supplier f25835z = Suppliers.b(new zzra());

    public static boolean a() {
        return ((zzqx) f25834A.get()).a();
    }

    public static boolean b() {
        return ((zzqx) f25834A.get()).b();
    }

    public final /* synthetic */ Object get() {
        return (zzqx) this.f25835z.get();
    }
}
