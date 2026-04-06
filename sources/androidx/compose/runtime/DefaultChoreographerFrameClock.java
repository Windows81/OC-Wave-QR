package androidx.compose.runtime;

import android.view.Choreographer;
import androidx.compose.runtime.MonotonicFrameClock;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.Dispatchers;

@Metadata
final class DefaultChoreographerFrameClock implements MonotonicFrameClock {

    /* renamed from: A  reason: collision with root package name */
    public static final Choreographer f14640A = ((Choreographer) BuildersKt.e(Dispatchers.c().H0(), new DefaultChoreographerFrameClock$choreographer$1((Continuation) null)));

    /* renamed from: z  reason: collision with root package name */
    public static final DefaultChoreographerFrameClock f14641z = new DefaultChoreographerFrameClock();

    public Object Q(Function1 function1, Continuation continuation) {
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.c(continuation), 1);
        cancellableContinuationImpl.G();
        DefaultChoreographerFrameClock$withFrameNanos$2$callback$1 defaultChoreographerFrameClock$withFrameNanos$2$callback$1 = new DefaultChoreographerFrameClock$withFrameNanos$2$callback$1(cancellableContinuationImpl, function1);
        f14640A.postFrameCallback(defaultChoreographerFrameClock$withFrameNanos$2$callback$1);
        cancellableContinuationImpl.u(new DefaultChoreographerFrameClock$withFrameNanos$2$1(defaultChoreographerFrameClock$withFrameNanos$2$callback$1));
        Object A2 = cancellableContinuationImpl.A();
        if (A2 == IntrinsicsKt.f()) {
            DebugProbesKt.c(continuation);
        }
        return A2;
    }

    public CoroutineContext.Element d(CoroutineContext.Key key) {
        return MonotonicFrameClock.DefaultImpls.b(this, key);
    }

    public CoroutineContext g(CoroutineContext.Key key) {
        return MonotonicFrameClock.DefaultImpls.c(this, key);
    }

    public Object k(Object obj, Function2 function2) {
        return MonotonicFrameClock.DefaultImpls.a(this, obj, function2);
    }

    public CoroutineContext y(CoroutineContext coroutineContext) {
        return MonotonicFrameClock.DefaultImpls.d(this, coroutineContext);
    }
}
