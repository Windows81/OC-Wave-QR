package com.google.android.gms.dynamic;

import android.app.Activity;
import android.os.Bundle;

final class zab implements zah {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Activity f25204a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Bundle f25205b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Bundle f25206c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ DeferredLifecycleHelper f25207d;

    public zab(DeferredLifecycleHelper deferredLifecycleHelper, Activity activity, Bundle bundle, Bundle bundle2) {
        this.f25207d = deferredLifecycleHelper;
        this.f25204a = activity;
        this.f25205b = bundle;
        this.f25206c = bundle2;
    }

    public final int b() {
        return 0;
    }

    public final void c(LifecycleDelegate lifecycleDelegate) {
        this.f25207d.f25194a.x(this.f25204a, this.f25205b, this.f25206c);
    }
}
