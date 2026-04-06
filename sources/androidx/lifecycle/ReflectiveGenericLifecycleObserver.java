package androidx.lifecycle;

import androidx.lifecycle.ClassesInfoCache;
import androidx.lifecycle.Lifecycle;

@Deprecated
class ReflectiveGenericLifecycleObserver implements LifecycleEventObserver {

    /* renamed from: A  reason: collision with root package name */
    public final ClassesInfoCache.CallbackInfo f21953A;

    /* renamed from: z  reason: collision with root package name */
    public final Object f21954z;

    public ReflectiveGenericLifecycleObserver(Object obj) {
        this.f21954z = obj;
        this.f21953A = ClassesInfoCache.f21866c.c(obj.getClass());
    }

    public void j(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        this.f21953A.a(lifecycleOwner, event, this.f21954z);
    }
}
