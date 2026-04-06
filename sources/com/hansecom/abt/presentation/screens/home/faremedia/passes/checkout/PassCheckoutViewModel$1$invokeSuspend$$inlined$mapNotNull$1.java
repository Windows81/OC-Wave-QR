package com.hansecom.abt.presentation.screens.home.faremedia.passes.checkout;

import com.hansecom.mapi.models.FareProductOffer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

@Metadata
public final class PassCheckoutViewModel$1$invokeSuspend$$inlined$mapNotNull$1 implements Flow<FareProductOffer> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ PassCheckoutViewModel f37116A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Flow f37117z;

    public PassCheckoutViewModel$1$invokeSuspend$$inlined$mapNotNull$1(Flow flow, PassCheckoutViewModel passCheckoutViewModel) {
        this.f37117z = flow;
        this.f37116A = passCheckoutViewModel;
    }

    public Object a(final FlowCollector flowCollector, Continuation continuation) {
        Flow flow = this.f37117z;
        final PassCheckoutViewModel passCheckoutViewModel = this.f37116A;
        Object a2 = flow.a(new FlowCollector() {
            /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object c(java.lang.Object r7, kotlin.coroutines.Continuation r8) {
                /*
                    r6 = this;
                    boolean r0 = r8 instanceof com.hansecom.abt.presentation.screens.home.faremedia.passes.checkout.PassCheckoutViewModel$1$invokeSuspend$$inlined$mapNotNull$1.AnonymousClass2.AnonymousClass1
                    if (r0 == 0) goto L_0x0013
                    r0 = r8
                    com.hansecom.abt.presentation.screens.home.faremedia.passes.checkout.PassCheckoutViewModel$1$invokeSuspend$$inlined$mapNotNull$1$2$1 r0 = (com.hansecom.abt.presentation.screens.home.faremedia.passes.checkout.PassCheckoutViewModel$1$invokeSuspend$$inlined$mapNotNull$1.AnonymousClass2.AnonymousClass1) r0
                    int r1 = r0.D
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.D = r1
                    goto L_0x0018
                L_0x0013:
                    com.hansecom.abt.presentation.screens.home.faremedia.passes.checkout.PassCheckoutViewModel$1$invokeSuspend$$inlined$mapNotNull$1$2$1 r0 = new com.hansecom.abt.presentation.screens.home.faremedia.passes.checkout.PassCheckoutViewModel$1$invokeSuspend$$inlined$mapNotNull$1$2$1
                    r0.<init>(r6, r8)
                L_0x0018:
                    java.lang.Object r8 = r0.C
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                    int r2 = r0.D
                    r3 = 1
                    if (r2 == 0) goto L_0x0031
                    if (r2 != r3) goto L_0x0029
                    kotlin.ResultKt.b(r8)
                    goto L_0x006f
                L_0x0029:
                    java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                    java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                    r7.<init>(r8)
                    throw r7
                L_0x0031:
                    kotlin.ResultKt.b(r8)
                    kotlinx.coroutines.flow.FlowCollector r8 = r4
                    java.util.List r7 = (java.util.List) r7
                    java.lang.Iterable r7 = (java.lang.Iterable) r7
                    java.util.Iterator r7 = r7.iterator()
                L_0x003e:
                    boolean r2 = r7.hasNext()
                    if (r2 == 0) goto L_0x0063
                    java.lang.Object r2 = r7.next()
                    r4 = r2
                    com.hansecom.mapi.models.FareProductOffer r4 = (com.hansecom.mapi.models.FareProductOffer) r4
                    java.lang.Integer r4 = r4.f()
                    com.hansecom.abt.presentation.screens.home.faremedia.passes.checkout.PassCheckoutViewModel r5 = r2
                    com.hansecom.abt.presentation.screens.home.faremedia.cardOptions.CardOptionsCheckoutDestination r5 = r5.f37111p
                    int r5 = r5.c()
                    if (r4 != 0) goto L_0x005c
                    goto L_0x003e
                L_0x005c:
                    int r4 = r4.intValue()
                    if (r4 != r5) goto L_0x003e
                    goto L_0x0064
                L_0x0063:
                    r2 = 0
                L_0x0064:
                    if (r2 == 0) goto L_0x006f
                    r0.D = r3
                    java.lang.Object r7 = r8.c(r2, r0)
                    if (r7 != r1) goto L_0x006f
                    return r1
                L_0x006f:
                    kotlin.Unit r7 = kotlin.Unit.f40552a
                    return r7
                */
                throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.presentation.screens.home.faremedia.passes.checkout.PassCheckoutViewModel$1$invokeSuspend$$inlined$mapNotNull$1.AnonymousClass2.c(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }, continuation);
        return a2 == IntrinsicsKt.f() ? a2 : Unit.f40552a;
    }
}
