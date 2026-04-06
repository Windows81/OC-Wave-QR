package kotlin.coroutines;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public abstract class AbstractCoroutineContextElement implements CoroutineContext.Element {

    /* renamed from: z  reason: collision with root package name */
    public final CoroutineContext.Key f40711z;

    public AbstractCoroutineContextElement(CoroutineContext.Key key) {
        Intrinsics.i(key, "key");
        this.f40711z = key;
    }

    public CoroutineContext.Element d(CoroutineContext.Key key) {
        return CoroutineContext.Element.DefaultImpls.b(this, key);
    }

    public CoroutineContext g(CoroutineContext.Key key) {
        return CoroutineContext.Element.DefaultImpls.c(this, key);
    }

    public CoroutineContext.Key getKey() {
        return this.f40711z;
    }

    public Object k(Object obj, Function2 function2) {
        return CoroutineContext.Element.DefaultImpls.a(this, obj, function2);
    }

    public CoroutineContext y(CoroutineContext coroutineContext) {
        return CoroutineContext.Element.DefaultImpls.d(this, coroutineContext);
    }
}
