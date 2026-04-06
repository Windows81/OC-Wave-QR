package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.jvm.internal.Ref;

@Metadata
public final class FlowKt__LimitKt$drop$2$1<T> implements FlowCollector {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ int f41633A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ FlowCollector f41634B;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Ref.IntRef f41635z;

    public FlowKt__LimitKt$drop$2$1(Ref.IntRef intRef, int i2, FlowCollector flowCollector) {
        this.f41635z = intRef;
        this.f41633A = i2;
        this.f41634B = flowCollector;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object c(java.lang.Object r6, kotlin.coroutines.Continuation r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof kotlinx.coroutines.flow.FlowKt__LimitKt$drop$2$1$emit$1
            if (r0 == 0) goto L_0x0013
            r0 = r7
            kotlinx.coroutines.flow.FlowKt__LimitKt$drop$2$1$emit$1 r0 = (kotlinx.coroutines.flow.FlowKt__LimitKt$drop$2$1$emit$1) r0
            int r1 = r0.E
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.E = r1
            goto L_0x0018
        L_0x0013:
            kotlinx.coroutines.flow.FlowKt__LimitKt$drop$2$1$emit$1 r0 = new kotlinx.coroutines.flow.FlowKt__LimitKt$drop$2$1$emit$1
            r0.<init>(r5, r7)
        L_0x0018:
            java.lang.Object r7 = r0.C
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.E
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 != r3) goto L_0x0029
            kotlin.ResultKt.b(r7)
            goto L_0x0047
        L_0x0029:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0031:
            kotlin.ResultKt.b(r7)
            kotlin.jvm.internal.Ref$IntRef r7 = r5.f41635z
            int r2 = r7.f40906z
            int r4 = r5.f41633A
            if (r2 < r4) goto L_0x004a
            kotlinx.coroutines.flow.FlowCollector r7 = r5.f41634B
            r0.E = r3
            java.lang.Object r6 = r7.c(r6, r0)
            if (r6 != r1) goto L_0x0047
            return r1
        L_0x0047:
            kotlin.Unit r6 = kotlin.Unit.f40552a
            return r6
        L_0x004a:
            int r2 = r2 + r3
            r7.f40906z = r2
            kotlin.Unit r6 = kotlin.Unit.f40552a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__LimitKt$drop$2$1.c(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
