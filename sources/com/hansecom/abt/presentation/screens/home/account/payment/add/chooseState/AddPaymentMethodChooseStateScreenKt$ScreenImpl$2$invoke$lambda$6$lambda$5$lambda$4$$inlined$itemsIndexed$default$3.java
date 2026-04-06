package com.hansecom.abt.presentation.screens.home.account.payment.add.chooseState;

import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.runtime.Composer;
import com.hansecom.abt.presentation.screens.home.account.payment.add.addNmi.AddPaymentMethodNmi;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class AddPaymentMethodChooseStateScreenKt$ScreenImpl$2$invoke$lambda$6$lambda$5$lambda$4$$inlined$itemsIndexed$default$3 extends Lambda implements Function4<LazyItemScope, Integer, Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ AddPaymentMethodNmi.State.ChooseState f35736A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Function1 f35737B;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ List f35738z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AddPaymentMethodChooseStateScreenKt$ScreenImpl$2$invoke$lambda$6$lambda$5$lambda$4$$inlined$itemsIndexed$default$3(List list, AddPaymentMethodNmi.State.ChooseState chooseState, Function1 function1) {
        super(4);
        this.f35738z = list;
        this.f35736A = chooseState;
        this.f35737B = function1;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: kotlin.jvm.functions.Function0} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b(androidx.compose.foundation.lazy.LazyItemScope r11, int r12, androidx.compose.runtime.Composer r13, int r14) {
        /*
            r10 = this;
            r0 = r14 & 6
            if (r0 != 0) goto L_0x000f
            boolean r11 = r13.W(r11)
            if (r11 == 0) goto L_0x000c
            r11 = 4
            goto L_0x000d
        L_0x000c:
            r11 = 2
        L_0x000d:
            r11 = r11 | r14
            goto L_0x0010
        L_0x000f:
            r11 = r14
        L_0x0010:
            r14 = r14 & 48
            if (r14 != 0) goto L_0x0020
            boolean r14 = r13.i(r12)
            if (r14 == 0) goto L_0x001d
            r14 = 32
            goto L_0x001f
        L_0x001d:
            r14 = 16
        L_0x001f:
            r11 = r11 | r14
        L_0x0020:
            r14 = r11 & 147(0x93, float:2.06E-43)
            r0 = 146(0x92, float:2.05E-43)
            r1 = 0
            r2 = 1
            if (r14 == r0) goto L_0x002a
            r14 = r2
            goto L_0x002b
        L_0x002a:
            r14 = r1
        L_0x002b:
            r0 = r11 & 1
            boolean r14 = r13.E(r14, r0)
            if (r14 == 0) goto L_0x00ac
            boolean r14 = androidx.compose.runtime.ComposerKt.P()
            if (r14 == 0) goto L_0x0042
            r14 = -1
            java.lang.String r0 = "androidx.compose.foundation.lazy.itemsIndexed.<anonymous> (LazyDsl.kt:214)"
            r3 = -1091073711(0xffffffffbef78951, float:-0.48346952)
            androidx.compose.runtime.ComposerKt.Y(r3, r11, r14, r0)
        L_0x0042:
            java.util.List r11 = r10.f35738z
            java.lang.Object r11 = r11.get(r12)
            r3 = r11
            java.lang.String r3 = (java.lang.String) r3
            r11 = 1088063875(0x40da8983, float:6.829286)
            r13.X(r11)
            androidx.compose.ui.Modifier$Companion r11 = androidx.compose.ui.Modifier.f15489d
            java.lang.String r14 = "state_item"
            androidx.compose.ui.Modifier r5 = androidx.compose.ui.platform.TestTagKt.a(r11, r14)
            com.hansecom.abt.presentation.screens.home.account.payment.add.addNmi.AddPaymentMethodNmi$State$ChooseState r11 = r10.f35736A
            kotlinx.collections.immutable.ImmutableList r11 = r11.d()
            int r11 = r11.size()
            int r11 = r11 - r2
            if (r12 == r11) goto L_0x0068
            r6 = r2
            goto L_0x0069
        L_0x0068:
            r6 = r1
        L_0x0069:
            r11 = 1559127195(0x5cee649b, float:5.36813291E17)
            r13.X(r11)
            kotlin.jvm.functions.Function1 r11 = r10.f35737B
            boolean r11 = r13.W(r11)
            boolean r12 = r13.W(r3)
            r11 = r11 | r12
            java.lang.Object r12 = r13.g()
            if (r11 != 0) goto L_0x0088
            androidx.compose.runtime.Composer$Companion r11 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r11 = r11.a()
            if (r12 != r11) goto L_0x0092
        L_0x0088:
            com.hansecom.abt.presentation.screens.home.account.payment.add.chooseState.AddPaymentMethodChooseStateScreenKt$ScreenImpl$2$1$2$1$1$1$1 r12 = new com.hansecom.abt.presentation.screens.home.account.payment.add.chooseState.AddPaymentMethodChooseStateScreenKt$ScreenImpl$2$1$2$1$1$1$1
            kotlin.jvm.functions.Function1 r11 = r10.f35737B
            r12.<init>(r11, r3)
            r13.N(r12)
        L_0x0092:
            r4 = r12
            kotlin.jvm.functions.Function0 r4 = (kotlin.jvm.functions.Function0) r4
            r13.M()
            r8 = 384(0x180, float:5.38E-43)
            r9 = 0
            r7 = r13
            com.hansecom.abt.ui.components.listItem.OptionItemKt.b(r3, r4, r5, r6, r7, r8, r9)
            r13.M()
            boolean r11 = androidx.compose.runtime.ComposerKt.P()
            if (r11 == 0) goto L_0x00af
            androidx.compose.runtime.ComposerKt.X()
            goto L_0x00af
        L_0x00ac:
            r13.B()
        L_0x00af:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.presentation.screens.home.account.payment.add.chooseState.AddPaymentMethodChooseStateScreenKt$ScreenImpl$2$invoke$lambda$6$lambda$5$lambda$4$$inlined$itemsIndexed$default$3.b(androidx.compose.foundation.lazy.LazyItemScope, int, androidx.compose.runtime.Composer, int):void");
    }

    public /* bridge */ /* synthetic */ Object j(Object obj, Object obj2, Object obj3, Object obj4) {
        b((LazyItemScope) obj, ((Number) obj2).intValue(), (Composer) obj3, ((Number) obj4).intValue());
        return Unit.f40552a;
    }
}
