package kotlinx.coroutines.internal;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.DispatchException;
import kotlinx.coroutines.EventLoop;
import kotlinx.coroutines.ThreadLocalEventLoop;

@Metadata
public final class DispatchedContinuationKt {

    /* renamed from: a  reason: collision with root package name */
    public static final Symbol f41832a = new Symbol("UNDEFINED");

    /* renamed from: b  reason: collision with root package name */
    public static final Symbol f41833b = new Symbol("REUSABLE_CLAIMED");

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x008c, code lost:
        if (r0.w1() != false) goto L_0x008e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00a2, code lost:
        if (r0.w1() != false) goto L_0x00a4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void b(kotlin.coroutines.Continuation r6, java.lang.Object r7) {
        /*
            boolean r0 = r6 instanceof kotlinx.coroutines.internal.DispatchedContinuation
            if (r0 == 0) goto L_0x00b1
            kotlinx.coroutines.internal.DispatchedContinuation r6 = (kotlinx.coroutines.internal.DispatchedContinuation) r6
            java.lang.Object r0 = kotlinx.coroutines.CompletionStateKt.b(r7)
            kotlinx.coroutines.CoroutineDispatcher r1 = r6.C
            kotlin.coroutines.CoroutineContext r2 = r6.f()
            boolean r1 = d(r1, r2)
            r2 = 1
            if (r1 == 0) goto L_0x0026
            r6.E = r0
            r6.f41395B = r2
            kotlinx.coroutines.CoroutineDispatcher r7 = r6.C
            kotlin.coroutines.CoroutineContext r0 = r6.f()
            c(r7, r0, r6)
            goto L_0x00b4
        L_0x0026:
            kotlinx.coroutines.ThreadLocalEventLoop r1 = kotlinx.coroutines.ThreadLocalEventLoop.f41437a
            kotlinx.coroutines.EventLoop r1 = r1.b()
            boolean r3 = r1.j1()
            if (r3 == 0) goto L_0x003b
            r6.E = r0
            r6.f41395B = r2
            r1.S0(r6)
            goto L_0x00b4
        L_0x003b:
            r1.W0(r2)
            kotlin.coroutines.CoroutineContext r3 = r6.f()     // Catch:{ all -> 0x0067 }
            kotlinx.coroutines.Job$Key r4 = kotlinx.coroutines.Job.f41415x     // Catch:{ all -> 0x0067 }
            kotlin.coroutines.CoroutineContext$Element r3 = r3.d(r4)     // Catch:{ all -> 0x0067 }
            kotlinx.coroutines.Job r3 = (kotlinx.coroutines.Job) r3     // Catch:{ all -> 0x0067 }
            if (r3 == 0) goto L_0x0069
            boolean r4 = r3.b()     // Catch:{ all -> 0x0067 }
            if (r4 != 0) goto L_0x0069
            java.util.concurrent.CancellationException r7 = r3.F()     // Catch:{ all -> 0x0067 }
            r6.a(r0, r7)     // Catch:{ all -> 0x0067 }
            kotlin.Result$Companion r0 = kotlin.Result.f40519A     // Catch:{ all -> 0x0067 }
            java.lang.Object r7 = kotlin.ResultKt.a(r7)     // Catch:{ all -> 0x0067 }
            java.lang.Object r7 = kotlin.Result.b(r7)     // Catch:{ all -> 0x0067 }
            r6.q(r7)     // Catch:{ all -> 0x0067 }
            goto L_0x0091
        L_0x0067:
            r7 = move-exception
            goto L_0x00a8
        L_0x0069:
            kotlin.coroutines.Continuation r0 = r6.D     // Catch:{ all -> 0x0067 }
            java.lang.Object r3 = r6.F     // Catch:{ all -> 0x0067 }
            kotlin.coroutines.CoroutineContext r4 = r0.f()     // Catch:{ all -> 0x0067 }
            java.lang.Object r3 = kotlinx.coroutines.internal.ThreadContextKt.i(r4, r3)     // Catch:{ all -> 0x0067 }
            kotlinx.coroutines.internal.Symbol r5 = kotlinx.coroutines.internal.ThreadContextKt.f41871a     // Catch:{ all -> 0x0067 }
            if (r3 == r5) goto L_0x007e
            kotlinx.coroutines.UndispatchedCoroutine r0 = kotlinx.coroutines.CoroutineContextKt.m(r0, r4, r3)     // Catch:{ all -> 0x0067 }
            goto L_0x007f
        L_0x007e:
            r0 = 0
        L_0x007f:
            kotlin.coroutines.Continuation r5 = r6.D     // Catch:{ all -> 0x009b }
            r5.q(r7)     // Catch:{ all -> 0x009b }
            kotlin.Unit r7 = kotlin.Unit.f40552a     // Catch:{ all -> 0x009b }
            if (r0 == 0) goto L_0x008e
            boolean r7 = r0.w1()     // Catch:{ all -> 0x0067 }
            if (r7 == 0) goto L_0x0091
        L_0x008e:
            kotlinx.coroutines.internal.ThreadContextKt.f(r4, r3)     // Catch:{ all -> 0x0067 }
        L_0x0091:
            boolean r7 = r1.E1()     // Catch:{ all -> 0x0067 }
            if (r7 != 0) goto L_0x0091
        L_0x0097:
            r1.H0(r2)
            goto L_0x00b4
        L_0x009b:
            r7 = move-exception
            if (r0 == 0) goto L_0x00a4
            boolean r0 = r0.w1()     // Catch:{ all -> 0x0067 }
            if (r0 == 0) goto L_0x00a7
        L_0x00a4:
            kotlinx.coroutines.internal.ThreadContextKt.f(r4, r3)     // Catch:{ all -> 0x0067 }
        L_0x00a7:
            throw r7     // Catch:{ all -> 0x0067 }
        L_0x00a8:
            r6.i(r7)     // Catch:{ all -> 0x00ac }
            goto L_0x0097
        L_0x00ac:
            r6 = move-exception
            r1.H0(r2)
            throw r6
        L_0x00b1:
            r6.q(r7)
        L_0x00b4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.internal.DispatchedContinuationKt.b(kotlin.coroutines.Continuation, java.lang.Object):void");
    }

    public static final void c(CoroutineDispatcher coroutineDispatcher, CoroutineContext coroutineContext, Runnable runnable) {
        try {
            coroutineDispatcher.o0(coroutineContext, runnable);
        } catch (Throwable th) {
            throw new DispatchException(th, coroutineDispatcher, coroutineContext);
        }
    }

    public static final boolean d(CoroutineDispatcher coroutineDispatcher, CoroutineContext coroutineContext) {
        try {
            return coroutineDispatcher.w0(coroutineContext);
        } catch (Throwable th) {
            throw new DispatchException(th, coroutineDispatcher, coroutineContext);
        }
    }

    public static final boolean e(DispatchedContinuation dispatchedContinuation) {
        Unit unit = Unit.f40552a;
        EventLoop b2 = ThreadLocalEventLoop.f41437a.b();
        if (b2.q1()) {
            return false;
        }
        if (b2.j1()) {
            dispatchedContinuation.E = unit;
            dispatchedContinuation.f41395B = 1;
            b2.S0(dispatchedContinuation);
            return true;
        }
        b2.W0(true);
        try {
            dispatchedContinuation.run();
            do {
            } while (b2.E1());
        } catch (Throwable th) {
            b2.H0(true);
            throw th;
        }
        b2.H0(true);
        return false;
    }
}
