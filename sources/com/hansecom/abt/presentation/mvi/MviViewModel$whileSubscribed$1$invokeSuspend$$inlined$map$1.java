package com.hansecom.abt.presentation.mvi;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

@Metadata
public final class MviViewModel$whileSubscribed$1$invokeSuspend$$inlined$map$1 implements Flow<Boolean> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ int f34199A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Flow f34200z;

    public MviViewModel$whileSubscribed$1$invokeSuspend$$inlined$map$1(Flow flow, int i2) {
        this.f34200z = flow;
        this.f34199A = i2;
    }

    public Object a(final FlowCollector flowCollector, Continuation continuation) {
        Flow flow = this.f34200z;
        final int i2 = this.f34199A;
        Object a2 = flow.a(new FlowCollector() {
            /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object c(java.lang.Object r5, kotlin.coroutines.Continuation r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof com.hansecom.abt.presentation.mvi.MviViewModel$whileSubscribed$1$invokeSuspend$$inlined$map$1.AnonymousClass2.AnonymousClass1
                    if (r0 == 0) goto L_0x0013
                    r0 = r6
                    com.hansecom.abt.presentation.mvi.MviViewModel$whileSubscribed$1$invokeSuspend$$inlined$map$1$2$1 r0 = (com.hansecom.abt.presentation.mvi.MviViewModel$whileSubscribed$1$invokeSuspend$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                    int r1 = r0.D
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.D = r1
                    goto L_0x0018
                L_0x0013:
                    com.hansecom.abt.presentation.mvi.MviViewModel$whileSubscribed$1$invokeSuspend$$inlined$map$1$2$1 r0 = new com.hansecom.abt.presentation.mvi.MviViewModel$whileSubscribed$1$invokeSuspend$$inlined$map$1$2$1
                    r0.<init>(r4, r6)
                L_0x0018:
                    java.lang.Object r6 = r0.C
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                    int r2 = r0.D
                    r3 = 1
                    if (r2 == 0) goto L_0x0031
                    if (r2 != r3) goto L_0x0029
                    kotlin.ResultKt.b(r6)
                    goto L_0x0050
                L_0x0029:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L_0x0031:
                    kotlin.ResultKt.b(r6)
                    kotlinx.coroutines.flow.FlowCollector r6 = r4
                    java.lang.Number r5 = (java.lang.Number) r5
                    int r5 = r5.intValue()
                    int r2 = r2
                    if (r5 < r2) goto L_0x0042
                    r5 = r3
                    goto L_0x0043
                L_0x0042:
                    r5 = 0
                L_0x0043:
                    java.lang.Boolean r5 = kotlin.coroutines.jvm.internal.Boxing.a(r5)
                    r0.D = r3
                    java.lang.Object r5 = r6.c(r5, r0)
                    if (r5 != r1) goto L_0x0050
                    return r1
                L_0x0050:
                    kotlin.Unit r5 = kotlin.Unit.f40552a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.presentation.mvi.MviViewModel$whileSubscribed$1$invokeSuspend$$inlined$map$1.AnonymousClass2.c(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }, continuation);
        return a2 == IntrinsicsKt.f() ? a2 : Unit.f40552a;
    }
}
