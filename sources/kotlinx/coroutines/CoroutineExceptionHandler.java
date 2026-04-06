package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;

@Metadata
public interface CoroutineExceptionHandler extends CoroutineContext.Element {

    /* renamed from: w  reason: collision with root package name */
    public static final Key f41378w = Key.f41379z;

    @Metadata
    public static final class DefaultImpls {
        public static Object a(CoroutineExceptionHandler coroutineExceptionHandler, Object obj, Function2 function2) {
            return CoroutineContext.Element.DefaultImpls.a(coroutineExceptionHandler, obj, function2);
        }

        public static CoroutineContext.Element b(CoroutineExceptionHandler coroutineExceptionHandler, CoroutineContext.Key key) {
            return CoroutineContext.Element.DefaultImpls.b(coroutineExceptionHandler, key);
        }

        public static CoroutineContext c(CoroutineExceptionHandler coroutineExceptionHandler, CoroutineContext.Key key) {
            return CoroutineContext.Element.DefaultImpls.c(coroutineExceptionHandler, key);
        }

        public static CoroutineContext d(CoroutineExceptionHandler coroutineExceptionHandler, CoroutineContext coroutineContext) {
            return CoroutineContext.Element.DefaultImpls.d(coroutineExceptionHandler, coroutineContext);
        }
    }

    @Metadata
    public static final class Key implements CoroutineContext.Key<CoroutineExceptionHandler> {

        /* renamed from: z  reason: collision with root package name */
        public static final /* synthetic */ Key f41379z = new Key();
    }

    void m0(CoroutineContext coroutineContext, Throwable th);
}
