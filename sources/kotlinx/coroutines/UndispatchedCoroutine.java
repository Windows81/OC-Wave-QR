package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.internal.ScopeCoroutine;
import kotlinx.coroutines.internal.ThreadContextKt;

@Metadata
public final class UndispatchedCoroutine<T> extends ScopeCoroutine<T> {
    public final ThreadLocal D;
    private volatile boolean threadLocalIsSet;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public UndispatchedCoroutine(kotlin.coroutines.CoroutineContext r3, kotlin.coroutines.Continuation r4) {
        /*
            r2 = this;
            kotlinx.coroutines.UndispatchedMarker r0 = kotlinx.coroutines.UndispatchedMarker.f41441z
            kotlin.coroutines.CoroutineContext$Element r1 = r3.d(r0)
            if (r1 != 0) goto L_0x000d
            kotlin.coroutines.CoroutineContext r0 = r3.y(r0)
            goto L_0x000e
        L_0x000d:
            r0 = r3
        L_0x000e:
            r2.<init>(r0, r4)
            java.lang.ThreadLocal r0 = new java.lang.ThreadLocal
            r0.<init>()
            r2.D = r0
            kotlin.coroutines.CoroutineContext r4 = r4.f()
            kotlin.coroutines.ContinuationInterceptor$Key r0 = kotlin.coroutines.ContinuationInterceptor.f40717v
            kotlin.coroutines.CoroutineContext$Element r4 = r4.d(r0)
            boolean r4 = r4 instanceof kotlinx.coroutines.CoroutineDispatcher
            if (r4 != 0) goto L_0x0031
            r4 = 0
            java.lang.Object r4 = kotlinx.coroutines.internal.ThreadContextKt.i(r3, r4)
            kotlinx.coroutines.internal.ThreadContextKt.f(r3, r4)
            r2.y1(r3, r4)
        L_0x0031:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.UndispatchedCoroutine.<init>(kotlin.coroutines.CoroutineContext, kotlin.coroutines.Continuation):void");
    }

    public void r1(Object obj) {
        x1();
        Object a2 = CompletionStateKt.a(obj, this.C);
        Continuation continuation = this.C;
        CoroutineContext f2 = continuation.f();
        UndispatchedCoroutine undispatchedCoroutine = null;
        Object i2 = ThreadContextKt.i(f2, undispatchedCoroutine);
        if (i2 != ThreadContextKt.f41871a) {
            undispatchedCoroutine = CoroutineContextKt.m(continuation, f2, i2);
        }
        try {
            this.C.q(a2);
            Unit unit = Unit.f40552a;
        } finally {
            if (undispatchedCoroutine == null || undispatchedCoroutine.w1()) {
                ThreadContextKt.f(f2, i2);
            }
        }
    }

    public void v1() {
        x1();
    }

    public final boolean w1() {
        boolean z2 = this.threadLocalIsSet && this.D.get() == null;
        this.D.remove();
        return !z2;
    }

    public final void x1() {
        if (this.threadLocalIsSet) {
            Pair pair = (Pair) this.D.get();
            if (pair != null) {
                ThreadContextKt.f((CoroutineContext) pair.a(), pair.b());
            }
            this.D.remove();
        }
    }

    public final void y1(CoroutineContext coroutineContext, Object obj) {
        this.threadLocalIsSet = true;
        this.D.set(TuplesKt.a(coroutineContext, obj));
    }
}
