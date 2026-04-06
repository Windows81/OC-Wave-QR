package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.ContinuationInterceptor;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;

@Metadata
public final class DelayKt {
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object a(kotlin.coroutines.Continuation r4) {
        /*
            boolean r0 = r4 instanceof kotlinx.coroutines.DelayKt$awaitCancellation$1
            if (r0 == 0) goto L_0x0013
            r0 = r4
            kotlinx.coroutines.DelayKt$awaitCancellation$1 r0 = (kotlinx.coroutines.DelayKt$awaitCancellation$1) r0
            int r1 = r0.D
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.D = r1
            goto L_0x0018
        L_0x0013:
            kotlinx.coroutines.DelayKt$awaitCancellation$1 r0 = new kotlinx.coroutines.DelayKt$awaitCancellation$1
            r0.<init>(r4)
        L_0x0018:
            java.lang.Object r4 = r0.C
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.D
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 == r3) goto L_0x002d
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r0)
            throw r4
        L_0x002d:
            kotlin.ResultKt.b(r4)
            goto L_0x0052
        L_0x0031:
            kotlin.ResultKt.b(r4)
            r0.D = r3
            kotlinx.coroutines.CancellableContinuationImpl r4 = new kotlinx.coroutines.CancellableContinuationImpl
            kotlin.coroutines.Continuation r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.c(r0)
            r4.<init>(r2, r3)
            r4.G()
            java.lang.Object r4 = r4.A()
            java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            if (r4 != r2) goto L_0x004f
            kotlin.coroutines.jvm.internal.DebugProbesKt.c(r0)
        L_0x004f:
            if (r4 != r1) goto L_0x0052
            return r1
        L_0x0052:
            kotlin.KotlinNothingValueException r4 = new kotlin.KotlinNothingValueException
            r4.<init>()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.DelayKt.a(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static final Object b(long j2, Continuation continuation) {
        if (j2 <= 0) {
            return Unit.f40552a;
        }
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.c(continuation), 1);
        cancellableContinuationImpl.G();
        if (j2 < Long.MAX_VALUE) {
            d(cancellableContinuationImpl.f()).f(j2, cancellableContinuationImpl);
        }
        Object A2 = cancellableContinuationImpl.A();
        if (A2 == IntrinsicsKt.f()) {
            DebugProbesKt.c(continuation);
        }
        return A2 == IntrinsicsKt.f() ? A2 : Unit.f40552a;
    }

    public static final Object c(long j2, Continuation continuation) {
        Object b2 = b(e(j2), continuation);
        return b2 == IntrinsicsKt.f() ? b2 : Unit.f40552a;
    }

    public static final Delay d(CoroutineContext coroutineContext) {
        CoroutineContext.Element d2 = coroutineContext.d(ContinuationInterceptor.f40717v);
        Delay delay = d2 instanceof Delay ? (Delay) d2 : null;
        return delay == null ? DefaultExecutorKt.a() : delay;
    }

    public static final long e(long j2) {
        boolean T = Duration.T(j2);
        if (T) {
            return Duration.A(Duration.V(j2, DurationKt.t(999999, DurationUnit.NANOSECONDS)));
        }
        if (!T) {
            return 0;
        }
        throw new NoWhenBranchMatchedException();
    }
}
