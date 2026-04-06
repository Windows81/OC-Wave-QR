package kotlinx.coroutines.internal;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.ThreadContextElement;

@Metadata
public final class ThreadLocalElement<T> implements ThreadContextElement<T> {

    /* renamed from: A  reason: collision with root package name */
    public final ThreadLocal f41875A;

    /* renamed from: B  reason: collision with root package name */
    public final CoroutineContext.Key f41876B;

    /* renamed from: z  reason: collision with root package name */
    public final Object f41877z;

    public void X(CoroutineContext coroutineContext, Object obj) {
        this.f41875A.set(obj);
    }

    public CoroutineContext.Element d(CoroutineContext.Key key) {
        if (!Intrinsics.d(getKey(), key)) {
            return null;
        }
        Intrinsics.g(this, "null cannot be cast to non-null type E of kotlinx.coroutines.internal.ThreadLocalElement.get");
        return this;
    }

    public CoroutineContext g(CoroutineContext.Key key) {
        return Intrinsics.d(getKey(), key) ? EmptyCoroutineContext.f40721z : this;
    }

    public CoroutineContext.Key getKey() {
        return this.f41876B;
    }

    public Object k(Object obj, Function2 function2) {
        return ThreadContextElement.DefaultImpls.a(this, obj, function2);
    }

    public Object n0(CoroutineContext coroutineContext) {
        Object obj = this.f41875A.get();
        this.f41875A.set(this.f41877z);
        return obj;
    }

    public String toString() {
        return "ThreadLocal(value=" + this.f41877z + ", threadLocal = " + this.f41875A + ')';
    }

    public CoroutineContext y(CoroutineContext coroutineContext) {
        return ThreadContextElement.DefaultImpls.b(this, coroutineContext);
    }
}
