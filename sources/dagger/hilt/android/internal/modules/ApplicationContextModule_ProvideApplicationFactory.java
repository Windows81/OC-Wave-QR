package dagger.hilt.android.internal.modules;

import android.app.Application;
import dagger.internal.Factory;
import dagger.internal.Preconditions;

public final class ApplicationContextModule_ProvideApplicationFactory implements Factory<Application> {

    /* renamed from: a  reason: collision with root package name */
    public final ApplicationContextModule f39757a;

    public static Application b(ApplicationContextModule applicationContextModule) {
        return (Application) Preconditions.d(applicationContextModule.a());
    }

    /* renamed from: a */
    public Application get() {
        return b(this.f39757a);
    }
}
