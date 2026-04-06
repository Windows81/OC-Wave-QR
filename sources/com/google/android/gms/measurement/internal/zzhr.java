package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;
import java.lang.Thread;

final class zzhr implements Thread.UncaughtExceptionHandler {

    /* renamed from: a  reason: collision with root package name */
    public final String f26477a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ zzhp f26478b;

    public zzhr(zzhp zzhp, String str) {
        this.f26478b = zzhp;
        Preconditions.m(str);
        this.f26477a = str;
    }

    public final synchronized void uncaughtException(Thread thread, Throwable th) {
        this.f26478b.m().G().b(this.f26477a, th);
    }
}
