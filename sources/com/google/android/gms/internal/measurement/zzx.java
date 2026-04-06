package com.google.android.gms.internal.measurement;

import java.util.List;
import java.util.concurrent.Callable;

public final class zzx extends zzal {

    /* renamed from: B  reason: collision with root package name */
    public final Callable f25892B;

    public zzx(String str, Callable callable) {
        super(str);
        this.f25892B = callable;
    }

    public final zzaq a(zzh zzh, List list) {
        try {
            return zzj.b(this.f25892B.call());
        } catch (Exception unused) {
            return zzaq.f25336m;
        }
    }
}
