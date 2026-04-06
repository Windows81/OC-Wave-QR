package kotlin.coroutines;

import java.io.Serializable;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class EmptyCoroutineContext implements CoroutineContext, Serializable {

    /* renamed from: z  reason: collision with root package name */
    public static final EmptyCoroutineContext f40721z = new EmptyCoroutineContext();

    public CoroutineContext.Element d(CoroutineContext.Key key) {
        Intrinsics.i(key, "key");
        return null;
    }

    public CoroutineContext g(CoroutineContext.Key key) {
        Intrinsics.i(key, "key");
        return this;
    }

    public int hashCode() {
        return 0;
    }

    public Object k(Object obj, Function2 function2) {
        Intrinsics.i(function2, "operation");
        return obj;
    }

    public String toString() {
        return "EmptyCoroutineContext";
    }

    public CoroutineContext y(CoroutineContext coroutineContext) {
        Intrinsics.i(coroutineContext, "context");
        return coroutineContext;
    }
}
