package kotlinx.coroutines.flow;

import kotlin.Metadata;

@Metadata
public final class FlowKt__LimitKt$take$$inlined$unsafeFlow$1 implements Flow<Object> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ int f41624A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Flow f41625z;

    public FlowKt__LimitKt$take$$inlined$unsafeFlow$1(Flow flow, int i2) {
        this.f41625z = flow;
        this.f41624A = i2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object a(kotlinx.coroutines.flow.FlowCollector r9, kotlin.coroutines.Continuation r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof kotlinx.coroutines.flow.FlowKt__LimitKt$take$$inlined$unsafeFlow$1.AnonymousClass1
            if (r0 == 0) goto L_0x0013
            r0 = r10
            kotlinx.coroutines.flow.FlowKt__LimitKt$take$$inlined$unsafeFlow$1$1 r0 = (kotlinx.coroutines.flow.FlowKt__LimitKt$take$$inlined$unsafeFlow$1.AnonymousClass1) r0
            int r1 = r0.D
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.D = r1
            goto L_0x0018
        L_0x0013:
            kotlinx.coroutines.flow.FlowKt__LimitKt$take$$inlined$unsafeFlow$1$1 r0 = new kotlinx.coroutines.flow.FlowKt__LimitKt$take$$inlined$unsafeFlow$1$1
            r0.<init>(r8, r10)
        L_0x0018:
            java.lang.Object r10 = r0.C
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.D
            r3 = 1
            if (r2 == 0) goto L_0x0035
            if (r2 != r3) goto L_0x002d
            java.lang.Object r9 = r0.F
            kotlin.ResultKt.b(r10)     // Catch:{ AbortFlowException -> 0x002b }
            goto L_0x005d
        L_0x002b:
            r10 = move-exception
            goto L_0x005a
        L_0x002d:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L_0x0035:
            kotlin.ResultKt.b(r10)
            java.lang.Object r10 = new java.lang.Object
            r10.<init>()
            kotlin.jvm.internal.Ref$IntRef r2 = new kotlin.jvm.internal.Ref$IntRef
            r2.<init>()
            kotlinx.coroutines.flow.Flow r4 = r8.f41625z     // Catch:{ AbortFlowException -> 0x0056 }
            kotlinx.coroutines.flow.FlowKt__LimitKt$take$2$1 r5 = new kotlinx.coroutines.flow.FlowKt__LimitKt$take$2$1     // Catch:{ AbortFlowException -> 0x0056 }
            int r6 = r8.f41624A     // Catch:{ AbortFlowException -> 0x0056 }
            r5.<init>(r2, r6, r9, r10)     // Catch:{ AbortFlowException -> 0x0056 }
            r0.F = r10     // Catch:{ AbortFlowException -> 0x0056 }
            r0.D = r3     // Catch:{ AbortFlowException -> 0x0056 }
            java.lang.Object r9 = r4.a(r5, r0)     // Catch:{ AbortFlowException -> 0x0056 }
            if (r9 != r1) goto L_0x005d
            return r1
        L_0x0056:
            r9 = move-exception
            r7 = r10
            r10 = r9
            r9 = r7
        L_0x005a:
            kotlinx.coroutines.flow.internal.FlowExceptions_commonKt.a(r10, r9)
        L_0x005d:
            kotlin.Unit r9 = kotlin.Unit.f40552a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__LimitKt$take$$inlined$unsafeFlow$1.a(kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
