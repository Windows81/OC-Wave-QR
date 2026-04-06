package kotlinx.coroutines.sync;

import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.sync.MutexImpl;

public final /* synthetic */ class d implements Function1 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ MutexImpl.CancellableContinuationWithOwner f41986A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ MutexImpl f41987z;

    public /* synthetic */ d(MutexImpl mutexImpl, MutexImpl.CancellableContinuationWithOwner cancellableContinuationWithOwner) {
        this.f41987z = mutexImpl;
        this.f41986A = cancellableContinuationWithOwner;
    }

    public final Object invoke(Object obj) {
        return MutexImpl.CancellableContinuationWithOwner.h(this.f41987z, this.f41986A, (Throwable) obj);
    }
}
