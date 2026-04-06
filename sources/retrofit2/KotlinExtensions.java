package retrofit2;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CancellableContinuationImpl;

@Metadata
public final class KotlinExtensions {
    public static final Object a(Call call, Continuation continuation) {
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.c(continuation), 1);
        cancellableContinuationImpl.G();
        cancellableContinuationImpl.u(new KotlinExtensions$await$2$1(call));
        call.G0(new KotlinExtensions$await$2$2(cancellableContinuationImpl));
        Object A2 = cancellableContinuationImpl.A();
        if (A2 == IntrinsicsKt.f()) {
            DebugProbesKt.c(continuation);
        }
        return A2;
    }

    public static final Object b(Call call, Continuation continuation) {
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.c(continuation), 1);
        cancellableContinuationImpl.G();
        cancellableContinuationImpl.u(new KotlinExtensions$await$4$1(call));
        call.G0(new KotlinExtensions$await$4$2(cancellableContinuationImpl));
        Object A2 = cancellableContinuationImpl.A();
        if (A2 == IntrinsicsKt.f()) {
            DebugProbesKt.c(continuation);
        }
        return A2;
    }

    public static final Object c(Call call, Continuation continuation) {
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.c(continuation), 1);
        cancellableContinuationImpl.G();
        cancellableContinuationImpl.u(new KotlinExtensions$awaitResponse$2$1(call));
        call.G0(new KotlinExtensions$awaitResponse$2$2(cancellableContinuationImpl));
        Object A2 = cancellableContinuationImpl.A();
        if (A2 == IntrinsicsKt.f()) {
            DebugProbesKt.c(continuation);
        }
        return A2;
    }

    public static final Object d(Call call, Continuation continuation) {
        Intrinsics.g(call, "null cannot be cast to non-null type retrofit2.Call<kotlin.Unit?>");
        return b(call, continuation);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object e(java.lang.Throwable r4, kotlin.coroutines.Continuation r5) {
        /*
            boolean r0 = r5 instanceof retrofit2.KotlinExtensions$suspendAndThrow$1
            if (r0 == 0) goto L_0x0013
            r0 = r5
            retrofit2.KotlinExtensions$suspendAndThrow$1 r0 = (retrofit2.KotlinExtensions$suspendAndThrow$1) r0
            int r1 = r0.E
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.E = r1
            goto L_0x0018
        L_0x0013:
            retrofit2.KotlinExtensions$suspendAndThrow$1 r0 = new retrofit2.KotlinExtensions$suspendAndThrow$1
            r0.<init>(r5)
        L_0x0018:
            java.lang.Object r5 = r0.D
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.E
            r3 = 1
            if (r2 == 0) goto L_0x0035
            if (r2 == r3) goto L_0x002d
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x002d:
            java.lang.Object r4 = r0.C
            java.lang.Throwable r4 = (java.lang.Throwable) r4
            kotlin.ResultKt.b(r5)
            goto L_0x005c
        L_0x0035:
            kotlin.ResultKt.b(r5)
            r0.C = r4
            r0.E = r3
            kotlinx.coroutines.CoroutineDispatcher r5 = kotlinx.coroutines.Dispatchers.a()
            kotlin.coroutines.CoroutineContext r2 = r0.f()
            retrofit2.KotlinExtensions$suspendAndThrow$2$1 r3 = new retrofit2.KotlinExtensions$suspendAndThrow$2$1
            r3.<init>(r0, r4)
            r5.o0(r2, r3)
            java.lang.Object r4 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            java.lang.Object r5 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            if (r4 != r5) goto L_0x0059
            kotlin.coroutines.jvm.internal.DebugProbesKt.c(r0)
        L_0x0059:
            if (r4 != r1) goto L_0x005c
            return r1
        L_0x005c:
            kotlin.KotlinNothingValueException r4 = new kotlin.KotlinNothingValueException
            r4.<init>()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: retrofit2.KotlinExtensions.e(java.lang.Throwable, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
