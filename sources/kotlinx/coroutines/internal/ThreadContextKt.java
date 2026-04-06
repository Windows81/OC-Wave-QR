package kotlinx.coroutines.internal;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.ThreadContextElement;

@Metadata
public final class ThreadContextKt {

    /* renamed from: a  reason: collision with root package name */
    public static final Symbol f41871a = new Symbol("NO_THREAD_ELEMENTS");

    /* renamed from: b  reason: collision with root package name */
    public static final Function2 f41872b = new f();

    /* renamed from: c  reason: collision with root package name */
    public static final Function2 f41873c = new g();

    /* renamed from: d  reason: collision with root package name */
    public static final Function2 f41874d = new h();

    public static final Object d(Object obj, CoroutineContext.Element element) {
        if (!(element instanceof ThreadContextElement)) {
            return obj;
        }
        Integer num = obj instanceof Integer ? (Integer) obj : null;
        int intValue = num != null ? num.intValue() : 1;
        return intValue == 0 ? element : Integer.valueOf(intValue + 1);
    }

    public static final ThreadContextElement e(ThreadContextElement threadContextElement, CoroutineContext.Element element) {
        if (threadContextElement != null) {
            return threadContextElement;
        }
        if (element instanceof ThreadContextElement) {
            return (ThreadContextElement) element;
        }
        return null;
    }

    public static final void f(CoroutineContext coroutineContext, Object obj) {
        if (obj != f41871a) {
            if (obj instanceof ThreadState) {
                ((ThreadState) obj).b(coroutineContext);
                return;
            }
            Object k2 = coroutineContext.k((Object) null, f41873c);
            Intrinsics.g(k2, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
            ((ThreadContextElement) k2).X(coroutineContext, obj);
        }
    }

    public static final Object g(CoroutineContext coroutineContext) {
        Object k2 = coroutineContext.k(0, f41872b);
        Intrinsics.f(k2);
        return k2;
    }

    public static final ThreadState h(ThreadState threadState, CoroutineContext.Element element) {
        if (element instanceof ThreadContextElement) {
            ThreadContextElement threadContextElement = (ThreadContextElement) element;
            threadState.a(threadContextElement, threadContextElement.n0(threadState.f41881a));
        }
        return threadState;
    }

    public static final Object i(CoroutineContext coroutineContext, Object obj) {
        if (obj == null) {
            obj = g(coroutineContext);
        }
        if (obj == 0) {
            return f41871a;
        }
        if (obj instanceof Integer) {
            return coroutineContext.k(new ThreadState(coroutineContext, ((Number) obj).intValue()), f41874d);
        }
        Intrinsics.g(obj, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
        return ((ThreadContextElement) obj).n0(coroutineContext);
    }
}
