package androidx.compose.runtime;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
final class CancelledCoroutineContext implements CoroutineContext.Element {

    /* renamed from: z  reason: collision with root package name */
    public static final Key f14549z = new Key((DefaultConstructorMarker) null);

    @Metadata
    public static final class Key implements CoroutineContext.Key<CancelledCoroutineContext> {
        public /* synthetic */ Key(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Key() {
        }
    }

    public CoroutineContext.Element d(CoroutineContext.Key key) {
        return CoroutineContext.Element.DefaultImpls.b(this, key);
    }

    public CoroutineContext g(CoroutineContext.Key key) {
        return CoroutineContext.Element.DefaultImpls.c(this, key);
    }

    public CoroutineContext.Key getKey() {
        return f14549z;
    }

    public Object k(Object obj, Function2 function2) {
        return CoroutineContext.Element.DefaultImpls.a(this, obj, function2);
    }

    public CoroutineContext y(CoroutineContext coroutineContext) {
        return CoroutineContext.Element.DefaultImpls.d(this, coroutineContext);
    }
}
