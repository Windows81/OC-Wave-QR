package dagger.hilt.android.internal.modules;

import android.content.Context;
import dagger.internal.Factory;
import dagger.internal.Preconditions;

public final class ApplicationContextModule_ProvideContextFactory implements Factory<Context> {

    /* renamed from: a  reason: collision with root package name */
    public final ApplicationContextModule f39758a;

    public static Context b(ApplicationContextModule applicationContextModule) {
        return (Context) Preconditions.d(applicationContextModule.b());
    }

    /* renamed from: a */
    public Context get() {
        return b(this.f39758a);
    }
}
