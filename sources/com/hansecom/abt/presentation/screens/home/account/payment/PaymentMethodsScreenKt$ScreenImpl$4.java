package com.hansecom.abt.presentation.screens.home.account.payment;

import androidx.compose.runtime.Composer;
import com.hansecom.abt.presentation.screens.home.account.payment.PaymentMethods;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

@Metadata
public final class PaymentMethodsScreenKt$ScreenImpl$4 implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function1 f35511A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Function1 f35512B;
    public final /* synthetic */ Function0 C;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ PaymentMethods.State f35513z;

    public PaymentMethodsScreenKt$ScreenImpl$4(PaymentMethods.State state, Function1 function1, Function1 function12, Function0 function0) {
        this.f35513z = state;
        this.f35511A = function1;
        this.f35512B = function12;
        this.C = function0;
    }

    /* access modifiers changed from: private */
    public static final Unit e(Function1 function1) {
        function1.invoke(PaymentMethods.Action.Refresh.f35497a);
        return Unit.f40552a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: kotlin.jvm.functions.Function0} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c(androidx.compose.runtime.Composer r11, int r12) {
        /*
            r10 = this;
            r0 = r12 & 3
            r1 = 2
            if (r0 != r1) goto L_0x0010
            boolean r0 = r11.t()
            if (r0 != 0) goto L_0x000c
            goto L_0x0010
        L_0x000c:
            r11.B()
            goto L_0x007b
        L_0x0010:
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x001f
            r0 = -1
            java.lang.String r1 = "com.hansecom.abt.presentation.screens.home.account.payment.ScreenImpl.<anonymous> (PaymentMethodsScreen.kt:79)"
            r2 = 456518889(0x1b35ece9, float:1.5048519E-22)
            androidx.compose.runtime.ComposerKt.Y(r2, r12, r0, r1)
        L_0x001f:
            com.hansecom.abt.presentation.screens.home.account.payment.PaymentMethods$State r12 = r10.f35513z
            boolean r0 = r12.h()
            r12 = -1124061244(0xffffffffbd002fc4, float:-0.031295553)
            r11.X(r12)
            kotlin.jvm.functions.Function1 r12 = r10.f35511A
            boolean r12 = r11.W(r12)
            kotlin.jvm.functions.Function1 r1 = r10.f35511A
            java.lang.Object r2 = r11.g()
            if (r12 != 0) goto L_0x0041
            androidx.compose.runtime.Composer$Companion r12 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r12 = r12.a()
            if (r2 != r12) goto L_0x0049
        L_0x0041:
            com.hansecom.abt.presentation.screens.home.account.payment.k r2 = new com.hansecom.abt.presentation.screens.home.account.payment.k
            r2.<init>(r1)
            r11.N(r2)
        L_0x0049:
            r1 = r2
            kotlin.jvm.functions.Function0 r1 = (kotlin.jvm.functions.Function0) r1
            r11.M()
            com.hansecom.abt.presentation.screens.home.account.payment.PaymentMethodsScreenKt$ScreenImpl$4$2 r12 = new com.hansecom.abt.presentation.screens.home.account.payment.PaymentMethodsScreenKt$ScreenImpl$4$2
            com.hansecom.abt.presentation.screens.home.account.payment.PaymentMethods$State r2 = r10.f35513z
            kotlin.jvm.functions.Function1 r3 = r10.f35511A
            kotlin.jvm.functions.Function1 r4 = r10.f35512B
            kotlin.jvm.functions.Function0 r5 = r10.C
            r12.<init>(r2, r3, r4, r5)
            r2 = 54
            r3 = 171722947(0xa3c48c3, float:9.065556E-33)
            r4 = 1
            androidx.compose.runtime.internal.ComposableLambda r6 = androidx.compose.runtime.internal.ComposableLambdaKt.e(r3, r4, r12, r11, r2)
            r8 = 1572864(0x180000, float:2.204052E-39)
            r9 = 60
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r7 = r11
            androidx.compose.material3.pulltorefresh.PullToRefreshKt.n(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9)
            boolean r11 = androidx.compose.runtime.ComposerKt.P()
            if (r11 == 0) goto L_0x007b
            androidx.compose.runtime.ComposerKt.X()
        L_0x007b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.presentation.screens.home.account.payment.PaymentMethodsScreenKt$ScreenImpl$4.c(androidx.compose.runtime.Composer, int):void");
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        c((Composer) obj, ((Number) obj2).intValue());
        return Unit.f40552a;
    }
}
