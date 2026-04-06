package kotlin.coroutines;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.CoroutineContext.Element;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public abstract class AbstractCoroutineContextKey<B extends CoroutineContext.Element, E extends B> implements CoroutineContext.Key<E> {

    /* renamed from: A  reason: collision with root package name */
    public final CoroutineContext.Key f40712A;

    /* renamed from: z  reason: collision with root package name */
    public final Function1 f40713z;

    public AbstractCoroutineContextKey(CoroutineContext.Key key, Function1 function1) {
        Intrinsics.i(key, "baseKey");
        Intrinsics.i(function1, "safeCast");
        this.f40713z = function1;
        this.f40712A = key instanceof AbstractCoroutineContextKey ? ((AbstractCoroutineContextKey) key).f40712A : key;
    }

    public final boolean a(CoroutineContext.Key key) {
        Intrinsics.i(key, "key");
        return key == this || this.f40712A == key;
    }

    public final CoroutineContext.Element b(CoroutineContext.Element element) {
        Intrinsics.i(element, "element");
        return (CoroutineContext.Element) this.f40713z.invoke(element);
    }
}
