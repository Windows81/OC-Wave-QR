package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;

@Metadata
class DeferredCoroutine<T> extends AbstractCoroutine<T> implements Deferred<T> {
    public DeferredCoroutine(CoroutineContext coroutineContext, boolean z2) {
        super(coroutineContext, true, z2);
    }

    public static /* synthetic */ Object v1(DeferredCoroutine deferredCoroutine, Continuation continuation) {
        Object i0 = deferredCoroutine.i0(continuation);
        IntrinsicsKt.f();
        return i0;
    }

    public Object G(Continuation continuation) {
        return v1(this, continuation);
    }

    public Object m() {
        return y0();
    }
}
