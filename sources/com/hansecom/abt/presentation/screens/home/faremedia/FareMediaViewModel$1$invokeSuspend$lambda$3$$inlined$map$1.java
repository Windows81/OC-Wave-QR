package com.hansecom.abt.presentation.screens.home.faremedia;

import java.time.LocalDateTime;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

@Metadata
public final class FareMediaViewModel$1$invokeSuspend$lambda$3$$inlined$map$1 implements Flow<Pair<? extends String, ? extends LocalDateTime>> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ String f35985A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Flow f35986z;

    public FareMediaViewModel$1$invokeSuspend$lambda$3$$inlined$map$1(Flow flow, String str) {
        this.f35986z = flow;
        this.f35985A = str;
    }

    public Object a(final FlowCollector flowCollector, Continuation continuation) {
        Flow flow = this.f35986z;
        final String str = this.f35985A;
        Object a2 = flow.a(new FlowCollector() {
            /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object c(java.lang.Object r6, kotlin.coroutines.Continuation r7) {
                /*
                    r5 = this;
                    boolean r0 = r7 instanceof com.hansecom.abt.presentation.screens.home.faremedia.FareMediaViewModel$1$invokeSuspend$lambda$3$$inlined$map$1.AnonymousClass2.AnonymousClass1
                    if (r0 == 0) goto L_0x0013
                    r0 = r7
                    com.hansecom.abt.presentation.screens.home.faremedia.FareMediaViewModel$1$invokeSuspend$lambda$3$$inlined$map$1$2$1 r0 = (com.hansecom.abt.presentation.screens.home.faremedia.FareMediaViewModel$1$invokeSuspend$lambda$3$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                    int r1 = r0.D
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.D = r1
                    goto L_0x0018
                L_0x0013:
                    com.hansecom.abt.presentation.screens.home.faremedia.FareMediaViewModel$1$invokeSuspend$lambda$3$$inlined$map$1$2$1 r0 = new com.hansecom.abt.presentation.screens.home.faremedia.FareMediaViewModel$1$invokeSuspend$lambda$3$$inlined$map$1$2$1
                    r0.<init>(r5, r7)
                L_0x0018:
                    java.lang.Object r7 = r0.C
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                    int r2 = r0.D
                    r3 = 1
                    if (r2 == 0) goto L_0x0031
                    if (r2 != r3) goto L_0x0029
                    kotlin.ResultKt.b(r7)
                    goto L_0x0048
                L_0x0029:
                    java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                    java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                    r6.<init>(r7)
                    throw r6
                L_0x0031:
                    kotlin.ResultKt.b(r7)
                    kotlinx.coroutines.flow.FlowCollector r7 = r4
                    java.time.LocalDateTime r6 = (java.time.LocalDateTime) r6
                    kotlin.Pair r2 = new kotlin.Pair
                    java.lang.String r4 = r2
                    r2.<init>(r4, r6)
                    r0.D = r3
                    java.lang.Object r6 = r7.c(r2, r0)
                    if (r6 != r1) goto L_0x0048
                    return r1
                L_0x0048:
                    kotlin.Unit r6 = kotlin.Unit.f40552a
                    return r6
                */
                throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.presentation.screens.home.faremedia.FareMediaViewModel$1$invokeSuspend$lambda$3$$inlined$map$1.AnonymousClass2.c(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }, continuation);
        return a2 == IntrinsicsKt.f() ? a2 : Unit.f40552a;
    }
}
