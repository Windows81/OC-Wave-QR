package com.google.android.gms.dynamic;

import android.os.Bundle;

final class zac implements zah {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Bundle f25208a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ DeferredLifecycleHelper f25209b;

    public zac(DeferredLifecycleHelper deferredLifecycleHelper, Bundle bundle) {
        this.f25209b = deferredLifecycleHelper;
        this.f25208a = bundle;
    }

    public final int b() {
        return 1;
    }

    public final void c(LifecycleDelegate lifecycleDelegate) {
        this.f25209b.f25194a.s(this.f25208a);
    }
}
