package dagger.hilt.android.internal.managers;

import android.app.Application;
import android.app.Service;
import dagger.hilt.EntryPoints;
import dagger.hilt.android.internal.builders.ServiceComponentBuilder;
import dagger.hilt.internal.GeneratedComponentManager;
import dagger.hilt.internal.Preconditions;

public final class ServiceComponentManager implements GeneratedComponentManager<Object> {

    /* renamed from: A  reason: collision with root package name */
    public Object f39746A;

    /* renamed from: z  reason: collision with root package name */
    public final Service f39747z;

    public interface ServiceComponentBuilderEntryPoint {
        ServiceComponentBuilder a();
    }

    private Object a() {
        Application application = this.f39747z.getApplication();
        Preconditions.c(application instanceof GeneratedComponentManager, "Hilt service must be attached to an @HiltAndroidApp Application. Found: %s", application.getClass());
        return ((ServiceComponentBuilderEntryPoint) EntryPoints.a(application, ServiceComponentBuilderEntryPoint.class)).a().a(this.f39747z).d();
    }

    public Object e() {
        if (this.f39746A == null) {
            this.f39746A = a();
        }
        return this.f39746A;
    }
}
