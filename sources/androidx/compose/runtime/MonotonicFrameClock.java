package androidx.compose.runtime;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

@Metadata
public interface MonotonicFrameClock extends CoroutineContext.Element {

    /* renamed from: b  reason: collision with root package name */
    public static final Key f14706b = Key.f14707z;

    @Metadata
    public static final class DefaultImpls {
        public static Object a(MonotonicFrameClock monotonicFrameClock, Object obj, Function2 function2) {
            return CoroutineContext.Element.DefaultImpls.a(monotonicFrameClock, obj, function2);
        }

        public static CoroutineContext.Element b(MonotonicFrameClock monotonicFrameClock, CoroutineContext.Key key) {
            return CoroutineContext.Element.DefaultImpls.b(monotonicFrameClock, key);
        }

        public static CoroutineContext c(MonotonicFrameClock monotonicFrameClock, CoroutineContext.Key key) {
            return CoroutineContext.Element.DefaultImpls.c(monotonicFrameClock, key);
        }

        public static CoroutineContext d(MonotonicFrameClock monotonicFrameClock, CoroutineContext coroutineContext) {
            return CoroutineContext.Element.DefaultImpls.d(monotonicFrameClock, coroutineContext);
        }
    }

    @Metadata
    public static final class Key implements CoroutineContext.Key<MonotonicFrameClock> {

        /* renamed from: z  reason: collision with root package name */
        public static final /* synthetic */ Key f14707z = new Key();
    }

    Object Q(Function1 function1, Continuation continuation);

    CoroutineContext.Key getKey() {
        return f14706b;
    }
}
