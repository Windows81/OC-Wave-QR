package kotlinx.coroutines;

import java.util.concurrent.locks.LockSupport;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;

@Metadata
final class BlockingCoroutine<T> extends AbstractCoroutine<T> {
    public final Thread C;
    public final EventLoop D;

    public BlockingCoroutine(CoroutineContext coroutineContext, Thread thread, EventLoop eventLoop) {
        super(coroutineContext, true, true);
        this.C = thread;
        this.D = eventLoop;
    }

    public boolean N0() {
        return true;
    }

    public void h0(Object obj) {
        if (!Intrinsics.d(Thread.currentThread(), this.C)) {
            Thread thread = this.C;
            AbstractTimeSource a2 = AbstractTimeSourceKt.f41360a;
            if (a2 != null) {
                a2.f(thread);
            } else {
                LockSupport.unpark(thread);
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v9, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: kotlinx.coroutines.CompletedExceptionally} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object v1() {
        /*
            r6 = this;
            kotlinx.coroutines.AbstractTimeSource r0 = kotlinx.coroutines.AbstractTimeSourceKt.f41360a
            if (r0 == 0) goto L_0x0009
            r0.c()
        L_0x0009:
            kotlinx.coroutines.EventLoop r0 = r6.D     // Catch:{ all -> 0x0014 }
            r1 = 1
            r2 = 0
            r3 = 0
            if (r0 == 0) goto L_0x0016
            kotlinx.coroutines.EventLoop.b1(r0, r2, r1, r3)     // Catch:{ all -> 0x0014 }
            goto L_0x0016
        L_0x0014:
            r0 = move-exception
            goto L_0x0075
        L_0x0016:
            kotlinx.coroutines.EventLoop r0 = r6.D     // Catch:{ all -> 0x001f }
            if (r0 == 0) goto L_0x0021
            long r4 = r0.w1()     // Catch:{ all -> 0x001f }
            goto L_0x0026
        L_0x001f:
            r0 = move-exception
            goto L_0x006d
        L_0x0021:
            r4 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
        L_0x0026:
            boolean r0 = r6.t()     // Catch:{ all -> 0x001f }
            if (r0 != 0) goto L_0x0048
            kotlinx.coroutines.AbstractTimeSource r0 = kotlinx.coroutines.AbstractTimeSourceKt.f41360a     // Catch:{ all -> 0x001f }
            if (r0 == 0) goto L_0x0036
            r0.b(r6, r4)     // Catch:{ all -> 0x001f }
            goto L_0x0039
        L_0x0036:
            java.util.concurrent.locks.LockSupport.parkNanos(r6, r4)     // Catch:{ all -> 0x001f }
        L_0x0039:
            boolean r0 = java.lang.Thread.interrupted()     // Catch:{ all -> 0x001f }
            if (r0 == 0) goto L_0x0016
            java.lang.InterruptedException r0 = new java.lang.InterruptedException     // Catch:{ all -> 0x001f }
            r0.<init>()     // Catch:{ all -> 0x001f }
            r6.k0(r0)     // Catch:{ all -> 0x001f }
            goto L_0x0016
        L_0x0048:
            kotlinx.coroutines.EventLoop r0 = r6.D     // Catch:{ all -> 0x0014 }
            if (r0 == 0) goto L_0x004f
            kotlinx.coroutines.EventLoop.J0(r0, r2, r1, r3)     // Catch:{ all -> 0x0014 }
        L_0x004f:
            kotlinx.coroutines.AbstractTimeSource r0 = kotlinx.coroutines.AbstractTimeSourceKt.f41360a
            if (r0 == 0) goto L_0x0058
            r0.g()
        L_0x0058:
            java.lang.Object r0 = r6.G0()
            java.lang.Object r0 = kotlinx.coroutines.JobSupportKt.h(r0)
            boolean r1 = r0 instanceof kotlinx.coroutines.CompletedExceptionally
            if (r1 == 0) goto L_0x0067
            r3 = r0
            kotlinx.coroutines.CompletedExceptionally r3 = (kotlinx.coroutines.CompletedExceptionally) r3
        L_0x0067:
            if (r3 != 0) goto L_0x006a
            return r0
        L_0x006a:
            java.lang.Throwable r0 = r3.f41376a
            throw r0
        L_0x006d:
            kotlinx.coroutines.EventLoop r4 = r6.D     // Catch:{ all -> 0x0014 }
            if (r4 == 0) goto L_0x0074
            kotlinx.coroutines.EventLoop.J0(r4, r2, r1, r3)     // Catch:{ all -> 0x0014 }
        L_0x0074:
            throw r0     // Catch:{ all -> 0x0014 }
        L_0x0075:
            kotlinx.coroutines.AbstractTimeSource r1 = kotlinx.coroutines.AbstractTimeSourceKt.f41360a
            if (r1 == 0) goto L_0x007e
            r1.g()
        L_0x007e:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.BlockingCoroutine.v1():java.lang.Object");
    }
}
