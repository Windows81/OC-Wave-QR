package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.jvm.functions.Function4;

@Metadata
public final class FlowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1 implements Flow<Object> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function4 f41616A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Flow f41617z;

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0078  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00ab  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object a(kotlinx.coroutines.flow.FlowCollector r12, kotlin.coroutines.Continuation r13) {
        /*
            r11 = this;
            boolean r0 = r13 instanceof kotlinx.coroutines.flow.FlowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1.AnonymousClass1
            if (r0 == 0) goto L_0x0013
            r0 = r13
            kotlinx.coroutines.flow.FlowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1$1 r0 = (kotlinx.coroutines.flow.FlowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1.AnonymousClass1) r0
            int r1 = r0.D
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.D = r1
            goto L_0x0018
        L_0x0013:
            kotlinx.coroutines.flow.FlowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1$1 r0 = new kotlinx.coroutines.flow.FlowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1$1
            r0.<init>(r11, r13)
        L_0x0018:
            java.lang.Object r13 = r0.C
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.D
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x0052
            if (r2 == r4) goto L_0x0042
            if (r2 != r3) goto L_0x003a
            long r5 = r0.I
            java.lang.Object r12 = r0.H
            java.lang.Throwable r12 = (java.lang.Throwable) r12
            java.lang.Object r2 = r0.G
            kotlinx.coroutines.flow.FlowCollector r2 = (kotlinx.coroutines.flow.FlowCollector) r2
            java.lang.Object r7 = r0.F
            kotlinx.coroutines.flow.FlowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1 r7 = (kotlinx.coroutines.flow.FlowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1) r7
            kotlin.ResultKt.b(r13)
            goto L_0x009a
        L_0x003a:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L_0x0042:
            int r12 = r0.J
            long r5 = r0.I
            java.lang.Object r2 = r0.G
            kotlinx.coroutines.flow.FlowCollector r2 = (kotlinx.coroutines.flow.FlowCollector) r2
            java.lang.Object r7 = r0.F
            kotlinx.coroutines.flow.FlowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1 r7 = (kotlinx.coroutines.flow.FlowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1) r7
            kotlin.ResultKt.b(r13)
            goto L_0x0074
        L_0x0052:
            kotlin.ResultKt.b(r13)
            r5 = 0
            r13 = r11
        L_0x0058:
            kotlinx.coroutines.flow.Flow r2 = r13.f41617z
            r0.F = r13
            r0.G = r12
            r7 = 0
            r0.H = r7
            r0.I = r5
            r7 = 0
            r0.J = r7
            r0.D = r4
            java.lang.Object r2 = kotlinx.coroutines.flow.FlowKt.i(r2, r12, r0)
            if (r2 != r1) goto L_0x006f
            return r1
        L_0x006f:
            r10 = r2
            r2 = r12
            r12 = r7
            r7 = r13
            r13 = r10
        L_0x0074:
            java.lang.Throwable r13 = (java.lang.Throwable) r13
            if (r13 == 0) goto L_0x00a6
            kotlin.jvm.functions.Function4 r12 = r7.f41616A
            java.lang.Long r8 = kotlin.coroutines.jvm.internal.Boxing.d(r5)
            r0.F = r7
            r0.G = r2
            r0.H = r13
            r0.I = r5
            r0.D = r3
            r9 = 6
            kotlin.jvm.internal.InlineMarker.c(r9)
            java.lang.Object r12 = r12.j(r2, r13, r8, r0)
            r8 = 7
            kotlin.jvm.internal.InlineMarker.c(r8)
            if (r12 != r1) goto L_0x0097
            return r1
        L_0x0097:
            r10 = r13
            r13 = r12
            r12 = r10
        L_0x009a:
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r13 = r13.booleanValue()
            if (r13 == 0) goto L_0x00a8
            r12 = 1
            long r5 = r5 + r12
            r12 = r4
        L_0x00a6:
            r13 = r7
            goto L_0x00a9
        L_0x00a8:
            throw r12
        L_0x00a9:
            if (r12 != 0) goto L_0x00ae
            kotlin.Unit r12 = kotlin.Unit.f40552a
            return r12
        L_0x00ae:
            r12 = r2
            goto L_0x0058
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1.a(kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
