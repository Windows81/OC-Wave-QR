package com.hansecom.abt.presentation.screens.home.faremedia.addValue.cashPayment.instructions;

import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import com.hansecom.abt.presentation.screens.home.faremedia.addValue.cashPayment.instructions.FareMediaAddValueCashPaymentInstructions;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class FareMediaAddValueCashInstructionsScreenKt$ScreenImpl$1 implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function0 f36173A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ FareMediaAddValueCashPaymentInstructions.State f36174z;

    public FareMediaAddValueCashInstructionsScreenKt$ScreenImpl$1(FareMediaAddValueCashPaymentInstructions.State state, Function0 function0) {
        this.f36174z = state;
        this.f36173A = function0;
    }

    public static final Unit e(List list, FareMediaAddValueCashPaymentInstructions.State state, Function0 function0, LazyListScope lazyListScope) {
        Intrinsics.i(lazyListScope, "$this$LazyColumn");
        ComposableSingletons$FareMediaAddValueCashInstructionsScreenKt composableSingletons$FareMediaAddValueCashInstructionsScreenKt = ComposableSingletons$FareMediaAddValueCashInstructionsScreenKt.f36160a;
        LazyListScope.f(lazyListScope, (Object) null, (Object) null, composableSingletons$FareMediaAddValueCashInstructionsScreenKt.a(), 3, (Object) null);
        lazyListScope.d(list.size(), (Function1) null, new FareMediaAddValueCashInstructionsScreenKt$ScreenImpl$1$invoke$lambda$4$lambda$3$$inlined$itemsIndexed$default$2(list), ComposableLambdaKt.c(-1091073711, true, new FareMediaAddValueCashInstructionsScreenKt$ScreenImpl$1$invoke$lambda$4$lambda$3$$inlined$itemsIndexed$default$3(list, list)));
        if (state.b()) {
            LazyListScope.f(lazyListScope, (Object) null, (Object) null, ComposableLambdaKt.c(-416422174, true, new FareMediaAddValueCashInstructionsScreenKt$ScreenImpl$1$1$1$2(function0)), 3, (Object) null);
        }
        LazyListScope.f(lazyListScope, (Object) null, (Object) null, composableSingletons$FareMediaAddValueCashInstructionsScreenKt.b(), 3, (Object) null);
        return Unit.f40552a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v0, resolved type: kotlin.jvm.functions.Function1} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c(androidx.compose.runtime.Composer r16, int r17) {
        /*
            r15 = this;
            r0 = r15
            r11 = r16
            r1 = r17
            r2 = r1 & 3
            r3 = 2
            if (r2 != r3) goto L_0x0016
            boolean r2 = r16.t()
            if (r2 != 0) goto L_0x0011
            goto L_0x0016
        L_0x0011:
            r16.B()
            goto L_0x00c3
        L_0x0016:
            boolean r2 = androidx.compose.runtime.ComposerKt.P()
            if (r2 == 0) goto L_0x0025
            r2 = -1
            java.lang.String r4 = "com.hansecom.abt.presentation.screens.home.faremedia.addValue.cashPayment.instructions.ScreenImpl.<anonymous> (FareMediaAddValueCashInstructionsScreen.kt:52)"
            r5 = 513848754(0x1ea0b5b2, float:1.7015806E-20)
            androidx.compose.runtime.ComposerKt.Y(r5, r1, r2, r4)
        L_0x0025:
            r1 = 1514465053(0x5a44e71d, float:1.38558018E16)
            r11.X(r1)
            java.lang.Object r1 = r16.g()
            androidx.compose.runtime.Composer$Companion r2 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r4 = r2.a()
            if (r1 != r4) goto L_0x0054
            int r1 = com.hansecom.abt.R.string.y7
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            int r4 = com.hansecom.abt.R.string.z7
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            int r5 = com.hansecom.abt.R.string.A7
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            java.lang.Integer[] r1 = new java.lang.Integer[]{r1, r4, r5}
            java.util.List r1 = kotlin.collections.CollectionsKt.p(r1)
            r11.N(r1)
        L_0x0054:
            java.util.List r1 = (java.util.List) r1
            r16.M()
            androidx.compose.ui.Modifier$Companion r4 = androidx.compose.ui.Modifier.f15489d
            r5 = 1
            r6 = 0
            r7 = 0
            androidx.compose.ui.Modifier r4 = androidx.compose.foundation.layout.SizeKt.f(r4, r6, r5, r7)
            com.hansecom.abt.ui.theme.Dimensions r5 = com.hansecom.abt.ui.theme.Dimensions.f38856a
            float r5 = r5.c()
            androidx.compose.ui.Modifier r3 = androidx.compose.foundation.layout.PaddingKt.k(r4, r5, r6, r3, r7)
            r4 = 1514480538(0x5a45239a, float:1.38724287E16)
            r11.X(r4)
            boolean r4 = r11.l(r1)
            com.hansecom.abt.presentation.screens.home.faremedia.addValue.cashPayment.instructions.FareMediaAddValueCashPaymentInstructions$State r5 = r0.f36174z
            boolean r5 = r11.W(r5)
            r4 = r4 | r5
            kotlin.jvm.functions.Function0 r5 = r0.f36173A
            boolean r5 = r11.W(r5)
            r4 = r4 | r5
            com.hansecom.abt.presentation.screens.home.faremedia.addValue.cashPayment.instructions.FareMediaAddValueCashPaymentInstructions$State r5 = r0.f36174z
            kotlin.jvm.functions.Function0 r6 = r0.f36173A
            java.lang.Object r7 = r16.g()
            if (r4 != 0) goto L_0x0094
            java.lang.Object r2 = r2.a()
            if (r7 != r2) goto L_0x009c
        L_0x0094:
            com.hansecom.abt.presentation.screens.home.faremedia.addValue.cashPayment.instructions.e r7 = new com.hansecom.abt.presentation.screens.home.faremedia.addValue.cashPayment.instructions.e
            r7.<init>(r1, r5, r6)
            r11.N(r7)
        L_0x009c:
            r10 = r7
            kotlin.jvm.functions.Function1 r10 = (kotlin.jvm.functions.Function1) r10
            r16.M()
            r12 = 6
            r13 = 510(0x1fe, float:7.15E-43)
            r2 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r14 = 0
            r1 = r3
            r3 = r4
            r4 = r5
            r5 = r6
            r6 = r7
            r7 = r8
            r8 = r9
            r9 = r14
            r11 = r16
            androidx.compose.foundation.lazy.LazyDslKt.b(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            boolean r1 = androidx.compose.runtime.ComposerKt.P()
            if (r1 == 0) goto L_0x00c3
            androidx.compose.runtime.ComposerKt.X()
        L_0x00c3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.presentation.screens.home.faremedia.addValue.cashPayment.instructions.FareMediaAddValueCashInstructionsScreenKt$ScreenImpl$1.c(androidx.compose.runtime.Composer, int):void");
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        c((Composer) obj, ((Number) obj2).intValue());
        return Unit.f40552a;
    }
}
