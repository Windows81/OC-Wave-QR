package androidx.compose.runtime;

import androidx.compose.runtime.MonotonicFrameClock;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Dispatchers;

@Metadata
final class FallbackFrameClock implements MonotonicFrameClock {

    /* renamed from: z  reason: collision with root package name */
    public static final FallbackFrameClock f14662z = new FallbackFrameClock();

    public Object Q(Function1 function1, Continuation continuation) {
        return BuildersKt.g(Dispatchers.c(), new FallbackFrameClock$withFrameNanos$2(function1, (Continuation) null), continuation);
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
