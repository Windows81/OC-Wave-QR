package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.jvm.internal.Ref;

@Metadata
public final class FlowKt__LimitKt$take$2$1<T> implements FlowCollector {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ int f41639A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ FlowCollector f41640B;
    public final /* synthetic */ Object C;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Ref.IntRef f41641z;

    public FlowKt__LimitKt$take$2$1(Ref.IntRef intRef, int i2, FlowCollector flowCollector, Object obj) {
        this.f41641z = intRef;
        this.f41639A = i2;
        this.f41640B = flowCollector;
        this.C = obj;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object c(java.lang.Object r6, kotlin.coroutines.Continuation r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof kotlinx.coroutines.flow.FlowKt__LimitKt$take$2$1$emit$1
            if (r0 == 0) goto L_0x0013
            r0 = r7
            kotlinx.coroutines.flow.FlowKt__LimitKt$take$2$1$emit$1 r0 = (kotlinx.coroutines.flow.FlowKt__LimitKt$take$2$1$emit$1) r0
            int r1 = r0.E
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.E = r1
            goto L_0x0018
        L_0x0013:
            kotlinx.coroutines.flow.FlowKt__LimitKt$take$2$1$emit$1 r0 = new kotlinx.coroutines.flow.FlowKt__LimitKt$take$2$1$emit$1
            r0.<init>(r5, r7)
        L_0x0018:
            java.lang.Object r7 = r0.C
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.E
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x0038
            if (r2 == r4) goto L_0x0034
            if (r2 != r3) goto L_0x002c
            kotlin.ResultKt.b(r7)
            goto L_0x0061
        L_0x002c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0034:
            kotlin.ResultKt.b(r7)
            goto L_0x0051
        L_0x0038:
            kotlin.ResultKt.b(r7)
            kotlin.jvm.internal.Ref$IntRef r7 = r5.f41641z
            int r2 = r7.f40906z
            int r2 = r2 + r4
            r7.f40906z = r2
            int r7 = r5.f41639A
            if (r2 >= r7) goto L_0x0054
            kotlinx.coroutines.flow.FlowCollector r7 = r5.f41640B
            r0.E = r4
            java.lang.Object r6 = r7.c(r6, r0)
            if (r6 != r1) goto L_0x0051
            return r1
        L_0x0051:
            kotlin.Unit r6 = kotlin.Unit.f40552a
            return r6
        L_0x0054:
            kotlinx.coroutines.flow.FlowCollector r7 = r5.f41640B
            java.lang.Object r2 = r5.C
            r0.E = r3
            java.lang.Object r6 = kotlinx.coroutines.flow.FlowKt__LimitKt.e(r7, r6, r2, r0)
            if (r6 != r1) goto L_0x0061
            return r1
        L_0x0061:
            kotlin.Unit r6 = kotlin.Unit.f40552a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__LimitKt$take$2$1.c(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
