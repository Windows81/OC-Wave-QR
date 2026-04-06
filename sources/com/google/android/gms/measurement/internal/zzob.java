package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;
import java.util.concurrent.Callable;

final class zzob implements Callable<String> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ zzp f26943a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ zznv f26944b;

    public zzob(zznv zznv, zzp zzp) {
        this.f26943a = zzp;
        this.f26944b = zznv;
    }

    public final /* synthetic */ Object call() {
        if (!this.f26944b.U((String) Preconditions.m(this.f26943a.f26977z)).B() || !zzjc.q(this.f26943a.U).B()) {
            this.f26944b.m().K().a("Analytics storage consent denied. Returning null app instance id");
            return null;
        }
        zzh i2 = this.f26944b.i(this.f26943a);
        if (i2 != null) {
            return i2.m();
        }
        this.f26944b.m().L().a("App info was null when attempting to get app instance id");
        return null;
    }
}
