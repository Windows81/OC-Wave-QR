package kotlinx.coroutines.sync;

import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function3;

public final /* synthetic */ class e implements Function3 {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ SemaphoreAndMutexImpl f41988z;

    public /* synthetic */ e(SemaphoreAndMutexImpl semaphoreAndMutexImpl) {
        this.f41988z = semaphoreAndMutexImpl;
    }

    public final Object d(Object obj, Object obj2, Object obj3) {
        return SemaphoreAndMutexImpl.u(this.f41988z, (Throwable) obj, (Unit) obj2, (CoroutineContext) obj3);
    }
}
