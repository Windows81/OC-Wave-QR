package com.google.android.gms.common;

import java.util.concurrent.Callable;

final class zzv extends zzx {

    /* renamed from: f  reason: collision with root package name */
    public final Callable f25184f;

    public /* synthetic */ zzv(Callable callable, zzu zzu) {
        super(false, 1, 5, (String) null, (Throwable) null, (zzw) null);
        this.f25184f = callable;
    }

    public final String a() {
        try {
            return (String) this.f25184f.call();
        } catch (Exception e2) {
            throw new RuntimeException(e2);
        }
    }
}
