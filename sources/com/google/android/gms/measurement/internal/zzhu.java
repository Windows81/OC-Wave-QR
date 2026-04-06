package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzdd;
import java.lang.Thread;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

final class zzhu<V> extends FutureTask<V> implements Comparable<zzhu<V>> {

    /* renamed from: A  reason: collision with root package name */
    public final boolean f26482A;

    /* renamed from: B  reason: collision with root package name */
    public final String f26483B;
    public final /* synthetic */ zzhp C;

    /* renamed from: z  reason: collision with root package name */
    public final long f26484z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzhu(zzhp zzhp, Runnable runnable, boolean z2, String str) {
        super(zzdd.a().b(runnable), (Object) null);
        this.C = zzhp;
        Preconditions.m(str);
        long andIncrement = zzhp.f26465l.getAndIncrement();
        this.f26484z = andIncrement;
        this.f26483B = str;
        this.f26482A = z2;
        if (andIncrement == Long.MAX_VALUE) {
            zzhp.m().G().a("Tasks index overflow");
        }
    }

    public final /* synthetic */ int compareTo(Object obj) {
        zzhu zzhu = (zzhu) obj;
        boolean z2 = this.f26482A;
        if (z2 != zzhu.f26482A) {
            return z2 ? -1 : 1;
        }
        long j2 = this.f26484z;
        long j3 = zzhu.f26484z;
        if (j2 < j3) {
            return -1;
        }
        if (j2 > j3) {
            return 1;
        }
        this.C.m().I().b("Two tasks share the same index. index", Long.valueOf(this.f26484z));
        return 0;
    }

    public final void setException(Throwable th) {
        Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler;
        this.C.m().G().b(this.f26483B, th);
        if ((th instanceof zzhs) && (defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler()) != null) {
            defaultUncaughtExceptionHandler.uncaughtException(Thread.currentThread(), th);
        }
        super.setException(th);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzhu(zzhp zzhp, Callable callable, boolean z2, String str) {
        super(zzdd.a().a(callable));
        this.C = zzhp;
        Preconditions.m(str);
        long andIncrement = zzhp.f26465l.getAndIncrement();
        this.f26484z = andIncrement;
        this.f26483B = str;
        this.f26482A = z2;
        if (andIncrement == Long.MAX_VALUE) {
            zzhp.m().G().a("Tasks index overflow");
        }
    }
}
