package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Ref;

@Metadata
final class FlowKt__TransformKt$runningReduce$1$1<T> implements FlowCollector {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function3 f41717A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ FlowCollector f41718B;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Ref.ObjectRef f41719z;

    public FlowKt__TransformKt$runningReduce$1$1(Ref.ObjectRef objectRef, Function3 function3, FlowCollector flowCollector) {
        this.f41719z = objectRef;
        this.f41717A = function3;
        this.f41718B = flowCollector;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0078 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object c(java.lang.Object r8, kotlin.coroutines.Continuation r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof kotlinx.coroutines.flow.FlowKt__TransformKt$runningReduce$1$1$emit$1
            if (r0 == 0) goto L_0x0013
            r0 = r9
            kotlinx.coroutines.flow.FlowKt__TransformKt$runningReduce$1$1$emit$1 r0 = (kotlinx.coroutines.flow.FlowKt__TransformKt$runningReduce$1$1$emit$1) r0
            int r1 = r0.G
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.G = r1
            goto L_0x0018
        L_0x0013:
            kotlinx.coroutines.flow.FlowKt__TransformKt$runningReduce$1$1$emit$1 r0 = new kotlinx.coroutines.flow.FlowKt__TransformKt$runningReduce$1$1$emit$1
            r0.<init>(r7, r9)
        L_0x0018:
            java.lang.Object r9 = r0.E
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.G
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x0040
            if (r2 == r4) goto L_0x0034
            if (r2 != r3) goto L_0x002c
            kotlin.ResultKt.b(r9)
            goto L_0x0079
        L_0x002c:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x0034:
            java.lang.Object r8 = r0.D
            kotlin.jvm.internal.Ref$ObjectRef r8 = (kotlin.jvm.internal.Ref.ObjectRef) r8
            java.lang.Object r2 = r0.C
            kotlinx.coroutines.flow.FlowKt__TransformKt$runningReduce$1$1 r2 = (kotlinx.coroutines.flow.FlowKt__TransformKt$runningReduce$1$1) r2
            kotlin.ResultKt.b(r9)
            goto L_0x0060
        L_0x0040:
            kotlin.ResultKt.b(r9)
            kotlin.jvm.internal.Ref$ObjectRef r9 = r7.f41719z
            java.lang.Object r2 = r9.f40908z
            kotlinx.coroutines.internal.Symbol r5 = kotlinx.coroutines.flow.internal.NullSurrogateKt.f41808a
            if (r2 != r5) goto L_0x004d
            r2 = r7
            goto L_0x0063
        L_0x004d:
            kotlin.jvm.functions.Function3 r5 = r7.f41717A
            r0.C = r7
            r0.D = r9
            r0.G = r4
            java.lang.Object r8 = r5.d(r2, r8, r0)
            if (r8 != r1) goto L_0x005c
            return r1
        L_0x005c:
            r2 = r7
            r6 = r9
            r9 = r8
            r8 = r6
        L_0x0060:
            r6 = r9
            r9 = r8
            r8 = r6
        L_0x0063:
            r9.f40908z = r8
            kotlinx.coroutines.flow.FlowCollector r8 = r2.f41718B
            kotlin.jvm.internal.Ref$ObjectRef r9 = r2.f41719z
            java.lang.Object r9 = r9.f40908z
            r2 = 0
            r0.C = r2
            r0.D = r2
            r0.G = r3
            java.lang.Object r8 = r8.c(r9, r0)
            if (r8 != r1) goto L_0x0079
            return r1
        L_0x0079:
            kotlin.Unit r8 = kotlin.Unit.f40552a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__TransformKt$runningReduce$1$1.c(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
