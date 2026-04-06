package com.google.android.gms.dynamic;

import java.util.Iterator;

final class zaa implements OnDelegateCreatedListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ DeferredLifecycleHelper f25203a;

    public zaa(DeferredLifecycleHelper deferredLifecycleHelper) {
        this.f25203a = deferredLifecycleHelper;
    }

    public final void a(LifecycleDelegate lifecycleDelegate) {
        this.f25203a.f25194a = lifecycleDelegate;
        Iterator it = this.f25203a.f25196c.iterator();
        while (it.hasNext()) {
            ((zah) it.next()).c(this.f25203a.f25194a);
        }
        this.f25203a.f25196c.clear();
        this.f25203a.f25195b = null;
    }
}
