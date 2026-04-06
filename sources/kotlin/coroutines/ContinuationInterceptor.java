package kotlin.coroutines;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public interface ContinuationInterceptor extends CoroutineContext.Element {

    /* renamed from: v  reason: collision with root package name */
    public static final Key f40717v = Key.f40718z;

    @Metadata
    public static final class DefaultImpls {
        public static CoroutineContext.Element a(ContinuationInterceptor continuationInterceptor, CoroutineContext.Key key) {
            CoroutineContext.Element b2;
            Intrinsics.i(key, "key");
            if (key instanceof AbstractCoroutineContextKey) {
                AbstractCoroutineContextKey abstractCoroutineContextKey = (AbstractCoroutineContextKey) key;
                if (!abstractCoroutineContextKey.a(continuationInterceptor.getKey()) || (b2 = abstractCoroutineContextKey.b(continuationInterceptor)) == null) {
                    return null;
                }
                return b2;
            } else if (ContinuationInterceptor.f40717v != key) {
                return null;
            } else {
                Intrinsics.g(continuationInterceptor, "null cannot be cast to non-null type E of kotlin.coroutines.ContinuationInterceptor.get");
                return continuationInterceptor;
            }
        }

        public static CoroutineContext b(ContinuationInterceptor continuationInterceptor, CoroutineContext.Key key) {
            Intrinsics.i(key, "key");
            if (!(key instanceof AbstractCoroutineContextKey)) {
                return ContinuationInterceptor.f40717v == key ? EmptyCoroutineContext.f40721z : continuationInterceptor;
            }
            AbstractCoroutineContextKey abstractCoroutineContextKey = (AbstractCoroutineContextKey) key;
            return (!abstractCoroutineContextKey.a(continuationInterceptor.getKey()) || abstractCoroutineContextKey.b(continuationInterceptor) == null) ? continuationInterceptor : EmptyCoroutineContext.f40721z;
        }
    }

    @Metadata
    public static final class Key implements CoroutineContext.Key<ContinuationInterceptor> {

        /* renamed from: z  reason: collision with root package name */
        public static final /* synthetic */ Key f40718z = new Key();
    }

    void l(Continuation continuation);

    Continuation r(Continuation continuation);
}
