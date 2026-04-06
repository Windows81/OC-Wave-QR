package com.google.android.datatransport.runtime.backends;

import android.content.Context;
import com.google.android.datatransport.runtime.dagger.internal.Factory;
import com.google.android.datatransport.runtime.time.Clock;
import javax.inject.Provider;

public final class CreationContextFactory_Factory implements Factory<CreationContextFactory> {

    /* renamed from: a  reason: collision with root package name */
    public final Provider f24095a;

    /* renamed from: b  reason: collision with root package name */
    public final Provider f24096b;

    /* renamed from: c  reason: collision with root package name */
    public final Provider f24097c;

    public CreationContextFactory_Factory(Provider provider, Provider provider2, Provider provider3) {
        this.f24095a = provider;
        this.f24096b = provider2;
        this.f24097c = provider3;
    }

    public static CreationContextFactory_Factory a(Provider provider, Provider provider2, Provider provider3) {
        return new CreationContextFactory_Factory(provider, provider2, provider3);
    }

    public static CreationContextFactory c(Context context, Clock clock, Clock clock2) {
        return new CreationContextFactory(context, clock, clock2);
    }

    /* renamed from: b */
    public CreationContextFactory get() {
        return c((Context) this.f24095a.get(), (Clock) this.f24096b.get(), (Clock) this.f24097c.get());
    }
}
