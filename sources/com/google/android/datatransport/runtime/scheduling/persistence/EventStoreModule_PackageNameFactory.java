package com.google.android.datatransport.runtime.scheduling.persistence;

import android.content.Context;
import com.google.android.datatransport.runtime.dagger.internal.Factory;
import com.google.android.datatransport.runtime.dagger.internal.Preconditions;
import javax.inject.Provider;

public final class EventStoreModule_PackageNameFactory implements Factory<String> {

    /* renamed from: a  reason: collision with root package name */
    public final Provider f24254a;

    public EventStoreModule_PackageNameFactory(Provider provider) {
        this.f24254a = provider;
    }

    public static EventStoreModule_PackageNameFactory a(Provider provider) {
        return new EventStoreModule_PackageNameFactory(provider);
    }

    public static String c(Context context) {
        return (String) Preconditions.d(EventStoreModule.b(context));
    }

    /* renamed from: b */
    public String get() {
        return c((Context) this.f24254a.get());
    }
}
