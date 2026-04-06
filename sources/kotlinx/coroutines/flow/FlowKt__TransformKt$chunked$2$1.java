package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.jvm.internal.Ref;

@Metadata
final class FlowKt__TransformKt$chunked$2$1<T> implements FlowCollector {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ int f41711A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ FlowCollector f41712B;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Ref.ObjectRef f41713z;

    public FlowKt__TransformKt$chunked$2$1(Ref.ObjectRef objectRef, int i2, FlowCollector flowCollector) {
        this.f41713z = objectRef;
        this.f41711A = i2;
        this.f41712B = flowCollector;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object c(java.lang.Object r5, kotlin.coroutines.Continuation r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof kotlinx.coroutines.flow.FlowKt__TransformKt$chunked$2$1$emit$1
            if (r0 == 0) goto L_0x0013
            r0 = r6
            kotlinx.coroutines.flow.FlowKt__TransformKt$chunked$2$1$emit$1 r0 = (kotlinx.coroutines.flow.FlowKt__TransformKt$chunked$2$1$emit$1) r0
            int r1 = r0.F
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.F = r1
            goto L_0x0018
        L_0x0013:
            kotlinx.coroutines.flow.FlowKt__TransformKt$chunked$2$1$emit$1 r0 = new kotlinx.coroutines.flow.FlowKt__TransformKt$chunked$2$1$emit$1
            r0.<init>(r4, r6)
        L_0x0018:
            java.lang.Object r6 = r0.D
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.F
            r3 = 1
            if (r2 == 0) goto L_0x0035
            if (r2 != r3) goto L_0x002d
            java.lang.Object r5 = r0.C
            kotlinx.coroutines.flow.FlowKt__TransformKt$chunked$2$1 r5 = (kotlinx.coroutines.flow.FlowKt__TransformKt$chunked$2$1) r5
            kotlin.ResultKt.b(r6)
            goto L_0x0064
        L_0x002d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0035:
            kotlin.ResultKt.b(r6)
            kotlin.jvm.internal.Ref$ObjectRef r6 = r4.f41713z
            java.lang.Object r6 = r6.f40908z
            java.util.ArrayList r6 = (java.util.ArrayList) r6
            if (r6 != 0) goto L_0x004b
            java.util.ArrayList r6 = new java.util.ArrayList
            int r2 = r4.f41711A
            r6.<init>(r2)
            kotlin.jvm.internal.Ref$ObjectRef r2 = r4.f41713z
            r2.f40908z = r6
        L_0x004b:
            r6.add(r5)
            int r5 = r6.size()
            int r2 = r4.f41711A
            if (r5 != r2) goto L_0x0069
            kotlinx.coroutines.flow.FlowCollector r5 = r4.f41712B
            r0.C = r4
            r0.F = r3
            java.lang.Object r5 = r5.c(r6, r0)
            if (r5 != r1) goto L_0x0063
            return r1
        L_0x0063:
            r5 = r4
        L_0x0064:
            kotlin.jvm.internal.Ref$ObjectRef r5 = r5.f41713z
            r6 = 0
            r5.f40908z = r6
        L_0x0069:
            kotlin.Unit r5 = kotlin.Unit.f40552a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__TransformKt$chunked$2$1.c(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
