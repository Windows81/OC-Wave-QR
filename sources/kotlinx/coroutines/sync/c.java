package kotlinx.coroutines.sync;

import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.sync.MutexImpl;

public final /* synthetic */ class c implements Function3 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ MutexImpl.CancellableContinuationWithOwner f41984A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ MutexImpl f41985z;

    public /* synthetic */ c(MutexImpl mutexImpl, MutexImpl.CancellableContinuationWithOwner cancellableContinuationWithOwner) {
        this.f41985z = mutexImpl;
        this.f41984A = cancellableContinuationWithOwner;
    }

    public final Object d(Object obj, Object obj2, Object obj3) {
        return MutexImpl.CancellableContinuationWithOwner.k(this.f41985z, this.f41984A, (Throwable) obj, (Unit) obj2, (CoroutineContext) obj3);
    }
}
