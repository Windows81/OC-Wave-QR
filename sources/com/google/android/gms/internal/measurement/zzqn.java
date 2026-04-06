package com.google.android.gms.internal.measurement;

import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;

public final class zzqn implements Supplier<zzqq> {

    /* renamed from: A  reason: collision with root package name */
    public static zzqn f25823A = new zzqn();

    /* renamed from: z  reason: collision with root package name */
    public final Supplier f25824z = Suppliers.b(new zzqp());

    public static boolean a() {
        return ((zzqq) f25823A.get()).a();
    }

    public static boolean b() {
        return ((zzqq) f25823A.get()).b();
    }

    public static boolean c() {
        return ((zzqq) f25823A.get()).c();
    }

    public final /* synthetic */ Object get() {
        return (zzqq) this.f25824z.get();
    }
}
