package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
final class CompletableDeferredImpl<T> extends JobSupport implements CompletableDeferred<T> {
    public CompletableDeferredImpl(Job job) {
        super(true);
        L0(job);
    }

    public boolean C0() {
        return true;
    }

    public Object G(Continuation continuation) {
        Object i0 = i0(continuation);
        IntrinsicsKt.f();
        return i0;
    }

    public boolean c0(Object obj) {
        return R0(obj);
    }

    public boolean j(Throwable th) {
        return R0(new CompletedExceptionally(th, false, 2, (DefaultConstructorMarker) null));
    }

    public Object m() {
        return y0();
    }
}
