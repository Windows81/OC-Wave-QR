package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.jvm.internal.Ref;

@Metadata
final class FlowKt__TransformKt$withIndex$1$1<T> implements FlowCollector {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Ref.IntRef f41720A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ FlowCollector f41721z;

    public FlowKt__TransformKt$withIndex$1$1(FlowCollector flowCollector, Ref.IntRef intRef) {
        this.f41721z = flowCollector;
        this.f41720A = intRef;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object c(java.lang.Object r8, kotlin.coroutines.Continuation r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof kotlinx.coroutines.flow.FlowKt__TransformKt$withIndex$1$1$emit$1
            if (r0 == 0) goto L_0x0013
            r0 = r9
            kotlinx.coroutines.flow.FlowKt__TransformKt$withIndex$1$1$emit$1 r0 = (kotlinx.coroutines.flow.FlowKt__TransformKt$withIndex$1$1$emit$1) r0
            int r1 = r0.E
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.E = r1
            goto L_0x0018
        L_0x0013:
            kotlinx.coroutines.flow.FlowKt__TransformKt$withIndex$1$1$emit$1 r0 = new kotlinx.coroutines.flow.FlowKt__TransformKt$withIndex$1$1$emit$1
            r0.<init>(r7, r9)
        L_0x0018:
            java.lang.Object r9 = r0.C
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.E
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 != r3) goto L_0x0029
            kotlin.ResultKt.b(r9)
            goto L_0x004e
        L_0x0029:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x0031:
            kotlin.ResultKt.b(r9)
            kotlinx.coroutines.flow.FlowCollector r9 = r7.f41721z
            kotlin.collections.IndexedValue r2 = new kotlin.collections.IndexedValue
            kotlin.jvm.internal.Ref$IntRef r4 = r7.f41720A
            int r5 = r4.f40906z
            int r6 = r5 + 1
            r4.f40906z = r6
            if (r5 < 0) goto L_0x0051
            r2.<init>(r5, r8)
            r0.E = r3
            java.lang.Object r8 = r9.c(r2, r0)
            if (r8 != r1) goto L_0x004e
            return r1
        L_0x004e:
            kotlin.Unit r8 = kotlin.Unit.f40552a
            return r8
        L_0x0051:
            java.lang.ArithmeticException r8 = new java.lang.ArithmeticException
            java.lang.String r9 = "Index overflow has happened"
            r8.<init>(r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__TransformKt$withIndex$1$1.c(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
