package com.google.android.datatransport.runtime.scheduling.persistence;

import android.content.Context;
import com.google.android.datatransport.runtime.dagger.internal.Factory;
import javax.inject.Provider;

public final class SchemaManager_Factory implements Factory<SchemaManager> {

    /* renamed from: a  reason: collision with root package name */
    public final Provider f24270a;

    /* renamed from: b  reason: collision with root package name */
    public final Provider f24271b;

    /* renamed from: c  reason: collision with root package name */
    public final Provider f24272c;

    public SchemaManager_Factory(Provider provider, Provider provider2, Provider provider3) {
        this.f24270a = provider;
        this.f24271b = provider2;
        this.f24272c = provider3;
    }

    public static SchemaManager_Factory a(Provider provider, Provider provider2, Provider provider3) {
        return new SchemaManager_Factory(provider, provider2, provider3);
    }

    public static SchemaManager c(Context context, String str, int i2) {
        return new SchemaManager(context, str, i2);
    }

    /* renamed from: b */
    public SchemaManager get() {
        return c((Context) this.f24270a.get(), (String) this.f24271b.get(), ((Integer) this.f24272c.get()).intValue());
    }
}
