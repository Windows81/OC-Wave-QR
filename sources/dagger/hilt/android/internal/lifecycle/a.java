package dagger.hilt.android.internal.lifecycle;

import java.io.Closeable;

public final /* synthetic */ class a implements Closeable {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ RetainedLifecycleImpl f39724z;

    public /* synthetic */ a(RetainedLifecycleImpl retainedLifecycleImpl) {
        this.f39724z = retainedLifecycleImpl;
    }

    public final void close() {
        this.f39724z.a();
    }
}
