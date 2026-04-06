package androidx.compose.ui.platform;

import android.view.Choreographer;
import androidx.compose.runtime.MonotonicFrameClock;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.ContinuationInterceptor;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CancellableContinuationImpl;

@Metadata
public final class AndroidUiFrameClock implements MonotonicFrameClock {

    /* renamed from: A  reason: collision with root package name */
    public final AndroidUiDispatcher f17642A;

    /* renamed from: z  reason: collision with root package name */
    public final Choreographer f17643z;

    public AndroidUiFrameClock(Choreographer choreographer, AndroidUiDispatcher androidUiDispatcher) {
        this.f17643z = choreographer;
        this.f17642A = androidUiDispatcher;
    }

    public Object Q(Function1 function1, Continuation continuation) {
        AndroidUiDispatcher androidUiDispatcher = this.f17642A;
        if (androidUiDispatcher == null) {
            CoroutineContext.Element d2 = continuation.f().d(ContinuationInterceptor.f40717v);
            androidUiDispatcher = d2 instanceof AndroidUiDispatcher ? (AndroidUiDispatcher) d2 : null;
        }
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.c(continuation), 1);
        cancellableContinuationImpl.G();
        AndroidUiFrameClock$withFrameNanos$2$callback$1 androidUiFrameClock$withFrameNanos$2$callback$1 = new AndroidUiFrameClock$withFrameNanos$2$callback$1(cancellableContinuationImpl, this, function1);
        if (androidUiDispatcher == null || !Intrinsics.d(androidUiDispatcher.q1(), e())) {
            e().postFrameCallback(androidUiFrameClock$withFrameNanos$2$callback$1);
            cancellableContinuationImpl.u(new AndroidUiFrameClock$withFrameNanos$2$2(this, androidUiFrameClock$withFrameNanos$2$callback$1));
        } else {
            androidUiDispatcher.H1(androidUiFrameClock$withFrameNanos$2$callback$1);
            cancellableContinuationImpl.u(new AndroidUiFrameClock$withFrameNanos$2$1(androidUiDispatcher, androidUiFrameClock$withFrameNanos$2$callback$1));
        }
        Object A2 = cancellableContinuationImpl.A();
        if (A2 == IntrinsicsKt.f()) {
            DebugProbesKt.c(continuation);
        }
        return A2;
    }

    public CoroutineContext.Element d(CoroutineContext.Key key) {
        return MonotonicFrameClock.DefaultImpls.b(this, key);
    }

    public final Choreographer e() {
        return this.f17643z;
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
