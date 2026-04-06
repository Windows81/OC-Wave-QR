package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;

@Metadata
public final class FlowKt__LogicKt$any$$inlined$collectWhile$1 implements FlowCollector<Object> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Ref.BooleanRef f41644A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Function2 f41645z;

    public FlowKt__LogicKt$any$$inlined$collectWhile$1(Function2 function2, Ref.BooleanRef booleanRef) {
        this.f41645z = function2;
        this.f41644A = booleanRef;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object c(java.lang.Object r5, kotlin.coroutines.Continuation r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof kotlinx.coroutines.flow.FlowKt__LogicKt$any$$inlined$collectWhile$1.AnonymousClass1
            if (r0 == 0) goto L_0x0013
            r0 = r6
            kotlinx.coroutines.flow.FlowKt__LogicKt$any$$inlined$collectWhile$1$1 r0 = (kotlinx.coroutines.flow.FlowKt__LogicKt$any$$inlined$collectWhile$1.AnonymousClass1) r0
            int r1 = r0.E
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.E = r1
            goto L_0x0018
        L_0x0013:
            kotlinx.coroutines.flow.FlowKt__LogicKt$any$$inlined$collectWhile$1$1 r0 = new kotlinx.coroutines.flow.FlowKt__LogicKt$any$$inlined$collectWhile$1$1
            r0.<init>(r4, r6)
        L_0x0018:
            java.lang.Object r6 = r0.D
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.E
            r3 = 1
            if (r2 == 0) goto L_0x0035
            if (r2 != r3) goto L_0x002d
            java.lang.Object r5 = r0.C
            kotlinx.coroutines.flow.FlowKt__LogicKt$any$$inlined$collectWhile$1 r5 = (kotlinx.coroutines.flow.FlowKt__LogicKt$any$$inlined$collectWhile$1) r5
            kotlin.ResultKt.b(r6)
            goto L_0x004e
        L_0x002d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0035:
            kotlin.ResultKt.b(r6)
            kotlin.jvm.functions.Function2 r6 = r4.f41645z
            r0.C = r4
            r0.E = r3
            r2 = 6
            kotlin.jvm.internal.InlineMarker.c(r2)
            java.lang.Object r6 = r6.m(r5, r0)
            r5 = 7
            kotlin.jvm.internal.InlineMarker.c(r5)
            if (r6 != r1) goto L_0x004d
            return r1
        L_0x004d:
            r5 = r4
        L_0x004e:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 == 0) goto L_0x005a
            kotlin.jvm.internal.Ref$BooleanRef r0 = r5.f41644A
            r0.f40901z = r3
        L_0x005a:
            if (r6 != 0) goto L_0x005f
            kotlin.Unit r5 = kotlin.Unit.f40552a
            return r5
        L_0x005f:
            kotlinx.coroutines.flow.internal.AbortFlowException r6 = new kotlinx.coroutines.flow.internal.AbortFlowException
            r6.<init>(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__LogicKt$any$$inlined$collectWhile$1.c(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
