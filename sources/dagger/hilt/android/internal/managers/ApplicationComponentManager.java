package dagger.hilt.android.internal.managers;

import dagger.hilt.internal.GeneratedComponentManager;

public final class ApplicationComponentManager implements GeneratedComponentManager<Object> {

    /* renamed from: A  reason: collision with root package name */
    public final Object f39736A = new Object();

    /* renamed from: B  reason: collision with root package name */
    public final ComponentSupplier f39737B;

    /* renamed from: z  reason: collision with root package name */
    public volatile Object f39738z;

    public ApplicationComponentManager(ComponentSupplier componentSupplier) {
        this.f39737B = componentSupplier;
    }

    public Object e() {
        if (this.f39738z == null) {
            synchronized (this.f39736A) {
                try {
                    if (this.f39738z == null) {
                        this.f39738z = this.f39737B.get();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.f39738z;
    }
}
