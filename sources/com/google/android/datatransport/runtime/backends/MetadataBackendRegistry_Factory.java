package com.google.android.datatransport.runtime.backends;

import android.content.Context;
import com.google.android.datatransport.runtime.dagger.internal.Factory;
import javax.inject.Provider;

public final class MetadataBackendRegistry_Factory implements Factory<MetadataBackendRegistry> {

    /* renamed from: a  reason: collision with root package name */
    public final Provider f24103a;

    /* renamed from: b  reason: collision with root package name */
    public final Provider f24104b;

    public MetadataBackendRegistry_Factory(Provider provider, Provider provider2) {
        this.f24103a = provider;
        this.f24104b = provider2;
    }

    public static MetadataBackendRegistry_Factory a(Provider provider, Provider provider2) {
        return new MetadataBackendRegistry_Factory(provider, provider2);
    }

    public static MetadataBackendRegistry c(Context context, Object obj) {
        return new MetadataBackendRegistry(context, (CreationContextFactory) obj);
    }

    /* renamed from: b */
    public MetadataBackendRegistry get() {
        return c((Context) this.f24103a.get(), this.f24104b.get());
    }
}
