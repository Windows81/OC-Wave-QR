package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.ContinuationInterceptor;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.jvm.internal.CoroutineStackFrame;
import kotlin.jvm.internal.Ref;

@Metadata
public final class CoroutineContextKt {
    public static final CoroutineContext d(CoroutineContext coroutineContext, CoroutineContext coroutineContext2, boolean z2) {
        boolean h2 = h(coroutineContext);
        boolean h3 = h(coroutineContext2);
        if (!h2 && !h3) {
            return coroutineContext.y(coroutineContext2);
        }
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.f40908z = coroutineContext2;
        EmptyCoroutineContext emptyCoroutineContext = EmptyCoroutineContext.f40721z;
        CoroutineContext coroutineContext3 = (CoroutineContext) coroutineContext.k(emptyCoroutineContext, new c(objectRef, z2));
        if (h3) {
            objectRef.f40908z = ((CoroutineContext) objectRef.f40908z).k(emptyCoroutineContext, new d());
        }
        return coroutineContext3.y((CoroutineContext) objectRef.f40908z);
    }

    public static final CoroutineContext e(Ref.ObjectRef objectRef, boolean z2, CoroutineContext coroutineContext, CoroutineContext.Element element) {
        if (!(element instanceof CopyableThreadContextElement)) {
            return coroutineContext.y(element);
        }
        CoroutineContext.Element d2 = ((CoroutineContext) objectRef.f40908z).d(element.getKey());
        if (d2 == null) {
            return coroutineContext.y(z2 ? ((CopyableThreadContextElement) element).T() : (CopyableThreadContextElement) element);
        }
        objectRef.f40908z = ((CoroutineContext) objectRef.f40908z).g(element.getKey());
        return coroutineContext.y(((CopyableThreadContextElement) element).x(d2));
    }

    public static final CoroutineContext f(CoroutineContext coroutineContext, CoroutineContext.Element element) {
        return element instanceof CopyableThreadContextElement ? coroutineContext.y(((CopyableThreadContextElement) element).T()) : coroutineContext.y(element);
    }

    public static final String g(CoroutineContext coroutineContext) {
        return null;
    }

    public static final boolean h(CoroutineContext coroutineContext) {
        return ((Boolean) coroutineContext.k(Boolean.FALSE, new b())).booleanValue();
    }

    public static final boolean i(boolean z2, CoroutineContext.Element element) {
        return z2 || (element instanceof CopyableThreadContextElement);
    }

    public static final CoroutineContext j(CoroutineContext coroutineContext, CoroutineContext coroutineContext2) {
        return !h(coroutineContext2) ? coroutineContext.y(coroutineContext2) : d(coroutineContext, coroutineContext2, false);
    }

    public static final CoroutineContext k(CoroutineScope coroutineScope, CoroutineContext coroutineContext) {
        CoroutineContext d2 = d(coroutineScope.getCoroutineContext(), coroutineContext, true);
        return (d2 == Dispatchers.a() || d2.d(ContinuationInterceptor.f40717v) != null) ? d2 : d2.y(Dispatchers.a());
    }

    public static final UndispatchedCoroutine l(CoroutineStackFrame coroutineStackFrame) {
        while (!(coroutineStackFrame instanceof DispatchedCoroutine) && (coroutineStackFrame = coroutineStackFrame.e()) != null) {
            if (coroutineStackFrame instanceof UndispatchedCoroutine) {
                return (UndispatchedCoroutine) coroutineStackFrame;
            }
        }
        return null;
    }

    public static final UndispatchedCoroutine m(Continuation continuation, CoroutineContext coroutineContext, Object obj) {
        if (!(continuation instanceof CoroutineStackFrame) || coroutineContext.d(UndispatchedMarker.f41441z) == null) {
            return null;
        }
        UndispatchedCoroutine l2 = l((CoroutineStackFrame) continuation);
        if (l2 != null) {
            l2.y1(coroutineContext, obj);
        }
        return l2;
    }
}
