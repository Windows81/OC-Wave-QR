package com.hansecom.abt.presentation.screens.payment;

import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.runtime.Composer;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function4;

@Metadata
/* renamed from: com.hansecom.abt.presentation.screens.payment.ChoosePaymentMethodScreenKt$Content$lambda$25$lambda$24$$inlined$itemsWithSpacing-6a0pyJM$3  reason: invalid class name */
public final class ChoosePaymentMethodScreenKt$Content$lambda$25$lambda$24$$inlined$itemsWithSpacing6a0pyJM$3 implements Function4<LazyItemScope, Integer, Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ float f37751A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Function1 f37752B;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ List f37753z;

    public ChoosePaymentMethodScreenKt$Content$lambda$25$lambda$24$$inlined$itemsWithSpacing6a0pyJM$3(List list, float f2, Function1 function1) {
        this.f37753z = list;
        this.f37751A = f2;
        this.f37752B = function1;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: kotlin.jvm.functions.Function0} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b(androidx.compose.foundation.lazy.LazyItemScope r9, int r10, androidx.compose.runtime.Composer r11, int r12) {
        /*
            r8 = this;
            java.lang.String r0 = "$this$items"
            kotlin.jvm.internal.Intrinsics.i(r9, r0)
            r0 = r12 & 6
            if (r0 != 0) goto L_0x0014
            boolean r9 = r11.W(r9)
            if (r9 == 0) goto L_0x0011
            r9 = 4
            goto L_0x0012
        L_0x0011:
            r9 = 2
        L_0x0012:
            r9 = r9 | r12
            goto L_0x0015
        L_0x0014:
            r9 = r12
        L_0x0015:
            r12 = r12 & 48
            if (r12 != 0) goto L_0x0025
            boolean r12 = r11.i(r10)
            if (r12 == 0) goto L_0x0022
            r12 = 32
            goto L_0x0024
        L_0x0022:
            r12 = 16
        L_0x0024:
            r9 = r9 | r12
        L_0x0025:
            r12 = r9 & 147(0x93, float:2.06E-43)
            r0 = 146(0x92, float:2.05E-43)
            if (r12 != r0) goto L_0x0037
            boolean r12 = r11.t()
            if (r12 != 0) goto L_0x0032
            goto L_0x0037
        L_0x0032:
            r11.B()
            goto L_0x00ae
        L_0x0037:
            boolean r12 = androidx.compose.runtime.ComposerKt.P()
            if (r12 == 0) goto L_0x0046
            r12 = -1
            java.lang.String r0 = "com.hansecom.abt.util.itemsWithSpacing.<anonymous> (LazyListExt.kt:22)"
            r1 = -1395388335(0xffffffffacd41051, float:-6.027214E-12)
            androidx.compose.runtime.ComposerKt.Y(r1, r9, r12, r0)
        L_0x0046:
            java.util.List r9 = r8.f37753z
            java.lang.Object r9 = r9.get(r10)
            r1 = r9
            com.hansecom.abt.presentation.model.PaymentMethodState r1 = (com.hansecom.abt.presentation.model.PaymentMethodState) r1
            r9 = 1821797188(0x6c966b44, float:1.4547634E27)
            r11.X(r9)
            com.hansecom.abt.ui.components.paymentOptions.PaymentMethodItem r0 = com.hansecom.abt.ui.components.paymentOptions.PaymentMethodItem.f38685a
            r9 = -79776910(0xfffffffffb3eb372, float:-9.90176E35)
            r11.X(r9)
            kotlin.jvm.functions.Function1 r9 = r8.f37752B
            boolean r9 = r11.W(r9)
            boolean r12 = r11.l(r1)
            r7 = 0
            r9 = r9 | r12
            java.lang.Object r12 = r11.g()
            if (r9 != 0) goto L_0x0077
            androidx.compose.runtime.Composer$Companion r9 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r9 = r9.a()
            if (r12 != r9) goto L_0x0081
        L_0x0077:
            com.hansecom.abt.presentation.screens.payment.ChoosePaymentMethodScreenKt$Content$1$1$11$1$1 r12 = new com.hansecom.abt.presentation.screens.payment.ChoosePaymentMethodScreenKt$Content$1$1$11$1$1
            kotlin.jvm.functions.Function1 r9 = r8.f37752B
            r12.<init>(r9, r1)
            r11.N(r12)
        L_0x0081:
            r2 = r12
            kotlin.jvm.functions.Function0 r2 = (kotlin.jvm.functions.Function0) r2
            r11.M()
            r5 = 3072(0xc00, float:4.305E-42)
            r6 = 4
            r3 = 0
            r4 = r11
            r0.j(r1, r2, r3, r4, r5, r6)
            r11.M()
            java.util.List r9 = r8.f37753z
            int r9 = kotlin.collections.CollectionsKt.o(r9)
            if (r10 >= r9) goto L_0x00a5
            androidx.compose.ui.Modifier$Companion r9 = androidx.compose.ui.Modifier.f15489d
            float r10 = r8.f37751A
            androidx.compose.ui.Modifier r9 = androidx.compose.foundation.layout.SizeKt.t(r9, r10)
            androidx.compose.foundation.layout.SpacerKt.a(r9, r11, r7)
        L_0x00a5:
            boolean r9 = androidx.compose.runtime.ComposerKt.P()
            if (r9 == 0) goto L_0x00ae
            androidx.compose.runtime.ComposerKt.X()
        L_0x00ae:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.presentation.screens.payment.ChoosePaymentMethodScreenKt$Content$lambda$25$lambda$24$$inlined$itemsWithSpacing6a0pyJM$3.b(androidx.compose.foundation.lazy.LazyItemScope, int, androidx.compose.runtime.Composer, int):void");
    }

    public /* bridge */ /* synthetic */ Object j(Object obj, Object obj2, Object obj3, Object obj4) {
        b((LazyItemScope) obj, ((Number) obj2).intValue(), (Composer) obj3, ((Number) obj4).intValue());
        return Unit.f40552a;
    }
}
