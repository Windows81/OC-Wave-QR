package com.google.android.gms.internal.measurement;

import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;

public final class zzqh implements Supplier<zzqk> {

    /* renamed from: A  reason: collision with root package name */
    public static zzqh f25817A = new zzqh();

    /* renamed from: z  reason: collision with root package name */
    public final Supplier f25818z = Suppliers.b(new zzqj());

    public static boolean a() {
        return ((zzqk) f25817A.get()).a();
    }

    public static boolean b() {
        return ((zzqk) f25817A.get()).b();
    }

    public final /* synthetic */ Object get() {
        return (zzqk) this.f25818z.get();
    }
}
