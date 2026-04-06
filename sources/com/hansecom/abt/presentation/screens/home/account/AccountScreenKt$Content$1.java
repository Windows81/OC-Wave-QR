package com.hansecom.abt.presentation.screens.home.account;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import com.hansecom.abt.presentation.screens.home.account.Account;
import com.hansecom.abt.ui.components.listItem.MenuItemState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class AccountScreenKt$Content$1 implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Account.State f35060A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Function1 f35061B;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Modifier f35062z;

    public AccountScreenKt$Content$1(Modifier modifier, Account.State state, Function1 function1) {
        this.f35062z = modifier;
        this.f35060A = state;
        this.f35061B = function1;
    }

    public static final Unit e(Function1 function1, MenuItemState menuItemState) {
        Intrinsics.i(menuItemState, "it");
        function1.invoke(new Account.Action.MenuItemClick(menuItemState));
        return Unit.f40552a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v9, resolved type: kotlin.jvm.functions.Function1} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c(androidx.compose.runtime.Composer r24, int r25) {
        /*
            r23 = this;
            r0 = r23
            r14 = r24
            r1 = r25
            r2 = r1 & 3
            r3 = 2
            if (r2 != r3) goto L_0x0017
            boolean r2 = r24.t()
            if (r2 != 0) goto L_0x0012
            goto L_0x0017
        L_0x0012:
            r24.B()
            goto L_0x015d
        L_0x0017:
            boolean r2 = androidx.compose.runtime.ComposerKt.P()
            if (r2 == 0) goto L_0x0026
            r2 = -1
            java.lang.String r3 = "com.hansecom.abt.presentation.screens.home.account.Content.<anonymous> (AccountScreen.kt:120)"
            r4 = 419099969(0x18faf541, float:6.487113E-24)
            androidx.compose.runtime.ComposerKt.Y(r4, r1, r2, r3)
        L_0x0026:
            androidx.compose.ui.Modifier r1 = r0.f35062z
            r2 = 0
            r3 = 0
            r4 = 1
            androidx.compose.ui.Modifier r5 = androidx.compose.foundation.layout.SizeKt.f(r1, r2, r4, r3)
            r1 = 0
            androidx.compose.foundation.ScrollState r6 = androidx.compose.foundation.ScrollKt.c(r1, r14, r1, r4)
            r10 = 14
            r11 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            androidx.compose.ui.Modifier r15 = androidx.compose.foundation.ScrollKt.g(r5, r6, r7, r8, r9, r10, r11)
            com.hansecom.abt.ui.theme.Dimensions r22 = com.hansecom.abt.ui.theme.Dimensions.f38856a
            float r19 = r22.e()
            r20 = 7
            r21 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            androidx.compose.ui.Modifier r2 = androidx.compose.foundation.layout.PaddingKt.m(r15, r16, r17, r18, r19, r20, r21)
            com.hansecom.abt.presentation.screens.home.account.Account$State r15 = r0.f35060A
            kotlin.jvm.functions.Function1 r13 = r0.f35061B
            androidx.compose.foundation.layout.Arrangement r3 = androidx.compose.foundation.layout.Arrangement.f3739a
            androidx.compose.foundation.layout.Arrangement$Vertical r3 = r3.g()
            androidx.compose.ui.Alignment$Companion r4 = androidx.compose.ui.Alignment.f15444a
            androidx.compose.ui.Alignment$Horizontal r4 = r4.k()
            androidx.compose.ui.layout.MeasurePolicy r3 = androidx.compose.foundation.layout.ColumnKt.a(r3, r4, r14, r1)
            int r1 = androidx.compose.runtime.ComposablesKt.a(r14, r1)
            androidx.compose.runtime.CompositionLocalMap r4 = r24.I()
            androidx.compose.ui.Modifier r2 = androidx.compose.ui.ComposedModifierKt.e(r14, r2)
            androidx.compose.ui.node.ComposeUiNode$Companion r5 = androidx.compose.ui.node.ComposeUiNode.f17222h
            kotlin.jvm.functions.Function0 r6 = r5.a()
            androidx.compose.runtime.Applier r7 = r24.v()
            if (r7 != 0) goto L_0x0081
            androidx.compose.runtime.ComposablesKt.d()
        L_0x0081:
            r24.s()
            boolean r7 = r24.n()
            if (r7 == 0) goto L_0x008e
            r14.y(r6)
            goto L_0x0091
        L_0x008e:
            r24.K()
        L_0x0091:
            androidx.compose.runtime.Composer r6 = androidx.compose.runtime.Updater.b(r24)
            kotlin.jvm.functions.Function2 r7 = r5.c()
            androidx.compose.runtime.Updater.g(r6, r3, r7)
            kotlin.jvm.functions.Function2 r3 = r5.e()
            androidx.compose.runtime.Updater.g(r6, r4, r3)
            kotlin.jvm.functions.Function2 r3 = r5.b()
            boolean r4 = r6.n()
            if (r4 != 0) goto L_0x00bb
            java.lang.Object r4 = r6.g()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r1)
            boolean r4 = kotlin.jvm.internal.Intrinsics.d(r4, r7)
            if (r4 != 0) goto L_0x00c9
        L_0x00bb:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r1)
            r6.N(r4)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r6.A(r1, r3)
        L_0x00c9:
            kotlin.jvm.functions.Function2 r1 = r5.d()
            androidx.compose.runtime.Updater.g(r6, r2, r1)
            androidx.compose.foundation.layout.ColumnScopeInstance r1 = androidx.compose.foundation.layout.ColumnScopeInstance.f3815a
            com.hansecom.abt.ui.theme.AbtTheme r1 = com.hansecom.abt.ui.theme.AbtTheme.f38851a
            r2 = 6
            com.hansecom.abt.ui.theme.colorScheme.AbtColorScheme r1 = r1.b(r14, r2)
            long r3 = r1.x()
            com.hansecom.abt.presentation.screens.home.account.ComposableSingletons$AccountScreenKt r1 = com.hansecom.abt.presentation.screens.home.account.ComposableSingletons$AccountScreenKt.f35085a
            kotlin.jvm.functions.Function2 r10 = r1.a()
            r12 = 12582912(0xc00000, float:1.7632415E-38)
            r16 = 123(0x7b, float:1.72E-43)
            r1 = 0
            r2 = 0
            r5 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r11 = r24
            r0 = r13
            r13 = r16
            androidx.compose.material3.SurfaceKt.c(r1, r2, r3, r5, r7, r8, r9, r10, r11, r12, r13)
            r1 = -1754689(0xffffffffffe539bf, float:NaN)
            r14.X(r1)
            com.hansecom.abt.ui.components.listItem.MenuItemListState r1 = r15.i()
            if (r1 == 0) goto L_0x014e
            com.hansecom.abt.ui.components.listItem.MenuItemListState r1 = r15.i()
            r2 = -1750844(0xffffffffffe548c4, float:NaN)
            r14.X(r2)
            boolean r2 = r14.W(r0)
            java.lang.Object r3 = r24.g()
            if (r2 != 0) goto L_0x011e
            androidx.compose.runtime.Composer$Companion r2 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r2 = r2.a()
            if (r3 != r2) goto L_0x0126
        L_0x011e:
            com.hansecom.abt.presentation.screens.home.account.L r3 = new com.hansecom.abt.presentation.screens.home.account.L
            r3.<init>(r0)
            r14.N(r3)
        L_0x0126:
            r2 = r3
            kotlin.jvm.functions.Function1 r2 = (kotlin.jvm.functions.Function1) r2
            r24.M()
            androidx.compose.ui.Modifier$Companion r3 = androidx.compose.ui.Modifier.f15489d
            float r4 = r22.c()
            float r6 = r22.c()
            r0 = 50
            float r0 = (float) r0
            float r5 = androidx.compose.ui.unit.Dp.m(r0)
            r8 = 8
            r9 = 0
            r7 = 0
            androidx.compose.ui.Modifier r3 = androidx.compose.foundation.layout.PaddingKt.m(r3, r4, r5, r6, r7, r8, r9)
            r6 = 0
            r7 = 8
            r4 = 0
            r5 = r24
            com.hansecom.abt.ui.components.listItem.MenuItemListKt.j(r1, r2, r3, r4, r5, r6, r7)
        L_0x014e:
            r24.M()
            r24.T()
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x015d
            androidx.compose.runtime.ComposerKt.X()
        L_0x015d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.presentation.screens.home.account.AccountScreenKt$Content$1.c(androidx.compose.runtime.Composer, int):void");
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        c((Composer) obj, ((Number) obj2).intValue());
        return Unit.f40552a;
    }
}
