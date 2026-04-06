package com.hansecom.abt.presentation.screens.payment;

import androidx.compose.material3.SheetState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.MutableState;
import androidx.navigation.NavController;
import androidx.navigation.NavHostController;
import androidx.navigation.NavOptions;
import androidx.navigation.Navigator;
import com.hansecom.abt.presentation.model.PaymentMethodState;
import com.hansecom.abt.presentation.screens.home.account.payment.add.AddPaymentMethodDestination;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;

@Metadata
public final class PaymentMethodSelectorKt$PaymentMethodSelector$4 implements Function3<Function0<? extends Unit>, Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ List f37819A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ String f37820B;
    public final /* synthetic */ Function1 C;
    public final /* synthetic */ CoroutineScope D;
    public final /* synthetic */ SheetState E;
    public final /* synthetic */ MutableState F;
    public final /* synthetic */ NavHostController G;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ List f37821z;

    public PaymentMethodSelectorKt$PaymentMethodSelector$4(List list, List list2, String str, Function1 function1, CoroutineScope coroutineScope, SheetState sheetState, MutableState mutableState, NavHostController navHostController) {
        this.f37821z = list;
        this.f37819A = list2;
        this.f37820B = str;
        this.C = function1;
        this.D = coroutineScope;
        this.E = sheetState;
        this.F = mutableState;
        this.G = navHostController;
    }

    public static final Unit h(Function1 function1, CoroutineScope coroutineScope, SheetState sheetState, MutableState mutableState, PaymentMethodState paymentMethodState) {
        Intrinsics.i(paymentMethodState, "it");
        function1.invoke(paymentMethodState);
        BuildersKt__Builders_commonKt.d(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new PaymentMethodSelectorKt$PaymentMethodSelector$4$1$1$1(sheetState, (Continuation) null), 3, (Object) null).S(new L(mutableState));
        return Unit.f40552a;
    }

    public static final Unit i(MutableState mutableState, Throwable th) {
        PaymentMethodSelectorKt.o(mutableState, false);
        return Unit.f40552a;
    }

    public static final Unit k(CoroutineScope coroutineScope, SheetState sheetState, NavHostController navHostController) {
        BuildersKt__Builders_commonKt.d(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new PaymentMethodSelectorKt$PaymentMethodSelector$4$2$1$1(sheetState, (Continuation) null), 3, (Object) null).S(new M(navHostController));
        return Unit.f40552a;
    }

    public static final Unit p(NavHostController navHostController, Throwable th) {
        NavController.Y(navHostController, AddPaymentMethodDestination.INSTANCE, (NavOptions) null, (Navigator.Extras) null, 6, (Object) null);
        return Unit.f40552a;
    }

    public /* bridge */ /* synthetic */ Object d(Object obj, Object obj2, Object obj3) {
        g((Function0) obj, (Composer) obj2, ((Number) obj3).intValue());
        return Unit.f40552a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v1, resolved type: kotlin.jvm.functions.Function1} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void g(kotlin.jvm.functions.Function0 r11, androidx.compose.runtime.Composer r12, int r13) {
        /*
            r10 = this;
            java.lang.String r0 = "it"
            kotlin.jvm.internal.Intrinsics.i(r11, r0)
            r11 = r13 & 17
            r0 = 16
            if (r11 != r0) goto L_0x0017
            boolean r11 = r12.t()
            if (r11 != 0) goto L_0x0012
            goto L_0x0017
        L_0x0012:
            r12.B()
            goto L_0x00bb
        L_0x0017:
            boolean r11 = androidx.compose.runtime.ComposerKt.P()
            if (r11 == 0) goto L_0x0026
            r11 = -1
            java.lang.String r0 = "com.hansecom.abt.presentation.screens.payment.PaymentMethodSelector.<anonymous> (PaymentMethodSelector.kt:74)"
            r1 = 919063559(0x36c7cc07, float:5.954414E-6)
            androidx.compose.runtime.ComposerKt.Y(r1, r13, r11, r0)
        L_0x0026:
            java.util.List r2 = r10.f37821z
            java.util.List r3 = r10.f37819A
            java.lang.String r4 = r10.f37820B
            r11 = -2142883443(0xffffffff8046318d, float:-6.44626E-39)
            r12.X(r11)
            kotlin.jvm.functions.Function1 r11 = r10.C
            boolean r11 = r12.W(r11)
            kotlinx.coroutines.CoroutineScope r13 = r10.D
            boolean r13 = r12.l(r13)
            r11 = r11 | r13
            androidx.compose.material3.SheetState r13 = r10.E
            boolean r13 = r12.W(r13)
            r11 = r11 | r13
            androidx.compose.runtime.MutableState r13 = r10.F
            boolean r13 = r12.W(r13)
            r11 = r11 | r13
            kotlin.jvm.functions.Function1 r13 = r10.C
            kotlinx.coroutines.CoroutineScope r0 = r10.D
            androidx.compose.material3.SheetState r1 = r10.E
            androidx.compose.runtime.MutableState r5 = r10.F
            java.lang.Object r6 = r12.g()
            if (r11 != 0) goto L_0x0063
            androidx.compose.runtime.Composer$Companion r11 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r11 = r11.a()
            if (r6 != r11) goto L_0x006b
        L_0x0063:
            com.hansecom.abt.presentation.screens.payment.J r6 = new com.hansecom.abt.presentation.screens.payment.J
            r6.<init>(r13, r0, r1, r5)
            r12.N(r6)
        L_0x006b:
            r5 = r6
            kotlin.jvm.functions.Function1 r5 = (kotlin.jvm.functions.Function1) r5
            r12.M()
            r11 = -2142873675(0xffffffff804657b5, float:-6.459948E-39)
            r12.X(r11)
            kotlinx.coroutines.CoroutineScope r11 = r10.D
            boolean r11 = r12.l(r11)
            androidx.compose.material3.SheetState r13 = r10.E
            boolean r13 = r12.W(r13)
            r11 = r11 | r13
            androidx.navigation.NavHostController r13 = r10.G
            boolean r13 = r12.l(r13)
            r11 = r11 | r13
            kotlinx.coroutines.CoroutineScope r13 = r10.D
            androidx.compose.material3.SheetState r0 = r10.E
            androidx.navigation.NavHostController r1 = r10.G
            java.lang.Object r6 = r12.g()
            if (r11 != 0) goto L_0x009f
            androidx.compose.runtime.Composer$Companion r11 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r11 = r11.a()
            if (r6 != r11) goto L_0x00a7
        L_0x009f:
            com.hansecom.abt.presentation.screens.payment.K r6 = new com.hansecom.abt.presentation.screens.payment.K
            r6.<init>(r13, r0, r1)
            r12.N(r6)
        L_0x00a7:
            kotlin.jvm.functions.Function0 r6 = (kotlin.jvm.functions.Function0) r6
            r12.M()
            r8 = 0
            r9 = 0
            r7 = r12
            com.hansecom.abt.presentation.screens.payment.ChoosePaymentNavigationKt.c(r2, r3, r4, r5, r6, r7, r8, r9)
            boolean r11 = androidx.compose.runtime.ComposerKt.P()
            if (r11 == 0) goto L_0x00bb
            androidx.compose.runtime.ComposerKt.X()
        L_0x00bb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.presentation.screens.payment.PaymentMethodSelectorKt$PaymentMethodSelector$4.g(kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int):void");
    }
}
