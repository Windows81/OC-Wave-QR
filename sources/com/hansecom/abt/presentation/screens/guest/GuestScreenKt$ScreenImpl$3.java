package com.hansecom.abt.presentation.screens.guest;

import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.runtime.Composer;
import com.hansecom.abt.presentation.screens.guest.Guest;
import com.hansecom.abt.ui.components.listItem.MenuItemState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class GuestScreenKt$ScreenImpl$3 implements Function3<PaddingValues, Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function1 f34701A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Guest.State f34702z;

    public GuestScreenKt$ScreenImpl$3(Guest.State state, Function1 function1) {
        this.f34702z = state;
        this.f34701A = function1;
    }

    /* access modifiers changed from: private */
    public static final Unit e(Function1 function1, MenuItemState menuItemState) {
        Intrinsics.i(menuItemState, "it");
        function1.invoke(new Guest.Action.MenuItemClick(menuItemState));
        return Unit.f40552a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v7, resolved type: kotlin.jvm.functions.Function1} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c(androidx.compose.foundation.layout.PaddingValues r28, androidx.compose.runtime.Composer r29, int r30) {
        /*
            r27 = this;
            r0 = r27
            r1 = r28
            r15 = r29
            java.lang.String r2 = "innerPadding"
            kotlin.jvm.internal.Intrinsics.i(r1, r2)
            r2 = r30 & 6
            if (r2 != 0) goto L_0x001b
            boolean r2 = r15.W(r1)
            if (r2 == 0) goto L_0x0017
            r2 = 4
            goto L_0x0018
        L_0x0017:
            r2 = 2
        L_0x0018:
            r2 = r30 | r2
            goto L_0x001d
        L_0x001b:
            r2 = r30
        L_0x001d:
            r3 = r2 & 19
            r4 = 18
            if (r3 != r4) goto L_0x002f
            boolean r3 = r29.t()
            if (r3 != 0) goto L_0x002a
            goto L_0x002f
        L_0x002a:
            r29.B()
            goto L_0x01ba
        L_0x002f:
            boolean r3 = androidx.compose.runtime.ComposerKt.P()
            if (r3 == 0) goto L_0x003e
            r3 = -1
            java.lang.String r4 = "com.hansecom.abt.presentation.screens.guest.ScreenImpl.<anonymous> (GuestScreen.kt:79)"
            r5 = -72096445(0xfffffffffbb3e543, float:-1.8681422E36)
            androidx.compose.runtime.ComposerKt.Y(r5, r2, r3, r4)
        L_0x003e:
            androidx.compose.ui.Modifier$Companion r13 = androidx.compose.ui.Modifier.f15489d
            androidx.compose.ui.Modifier r1 = androidx.compose.foundation.layout.PaddingKt.h(r13, r1)
            r2 = 0
            r3 = 0
            r4 = 1
            androidx.compose.ui.Modifier r5 = androidx.compose.foundation.layout.SizeKt.f(r1, r2, r4, r3)
            r14 = 0
            androidx.compose.foundation.ScrollState r6 = androidx.compose.foundation.ScrollKt.c(r14, r15, r14, r4)
            r10 = 14
            r11 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            androidx.compose.ui.Modifier r16 = androidx.compose.foundation.ScrollKt.g(r5, r6, r7, r8, r9, r10, r11)
            com.hansecom.abt.ui.theme.Dimensions r1 = com.hansecom.abt.ui.theme.Dimensions.f38856a
            float r20 = r1.e()
            r21 = 7
            r22 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            androidx.compose.ui.Modifier r2 = androidx.compose.foundation.layout.PaddingKt.m(r16, r17, r18, r19, r20, r21, r22)
            com.hansecom.abt.presentation.screens.guest.Guest$State r5 = r0.f34702z
            kotlin.jvm.functions.Function1 r3 = r0.f34701A
            androidx.compose.foundation.layout.Arrangement r4 = androidx.compose.foundation.layout.Arrangement.f3739a
            androidx.compose.foundation.layout.Arrangement$Vertical r4 = r4.g()
            androidx.compose.ui.Alignment$Companion r16 = androidx.compose.ui.Alignment.f15444a
            androidx.compose.ui.Alignment$Horizontal r6 = r16.k()
            androidx.compose.ui.layout.MeasurePolicy r4 = androidx.compose.foundation.layout.ColumnKt.a(r4, r6, r15, r14)
            int r6 = androidx.compose.runtime.ComposablesKt.a(r15, r14)
            androidx.compose.runtime.CompositionLocalMap r7 = r29.I()
            androidx.compose.ui.Modifier r2 = androidx.compose.ui.ComposedModifierKt.e(r15, r2)
            androidx.compose.ui.node.ComposeUiNode$Companion r8 = androidx.compose.ui.node.ComposeUiNode.f17222h
            kotlin.jvm.functions.Function0 r9 = r8.a()
            androidx.compose.runtime.Applier r10 = r29.v()
            if (r10 != 0) goto L_0x009d
            androidx.compose.runtime.ComposablesKt.d()
        L_0x009d:
            r29.s()
            boolean r10 = r29.n()
            if (r10 == 0) goto L_0x00aa
            r15.y(r9)
            goto L_0x00ad
        L_0x00aa:
            r29.K()
        L_0x00ad:
            androidx.compose.runtime.Composer r9 = androidx.compose.runtime.Updater.b(r29)
            kotlin.jvm.functions.Function2 r10 = r8.c()
            androidx.compose.runtime.Updater.g(r9, r4, r10)
            kotlin.jvm.functions.Function2 r4 = r8.e()
            androidx.compose.runtime.Updater.g(r9, r7, r4)
            kotlin.jvm.functions.Function2 r4 = r8.b()
            boolean r7 = r9.n()
            if (r7 != 0) goto L_0x00d7
            java.lang.Object r7 = r9.g()
            java.lang.Integer r10 = java.lang.Integer.valueOf(r6)
            boolean r7 = kotlin.jvm.internal.Intrinsics.d(r7, r10)
            if (r7 != 0) goto L_0x00e5
        L_0x00d7:
            java.lang.Integer r7 = java.lang.Integer.valueOf(r6)
            r9.N(r7)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r9.A(r6, r4)
        L_0x00e5:
            kotlin.jvm.functions.Function2 r4 = r8.d()
            androidx.compose.runtime.Updater.g(r9, r2, r4)
            androidx.compose.foundation.layout.ColumnScopeInstance r4 = androidx.compose.foundation.layout.ColumnScopeInstance.f3815a
            r2 = 1501366273(0x597d0801, float:4.45137309E15)
            r15.X(r2)
            com.hansecom.abt.ui.components.listItem.MenuItemListState r2 = r5.b()
            if (r2 == 0) goto L_0x014e
            com.hansecom.abt.ui.components.listItem.MenuItemListState r2 = r5.b()
            float r7 = r1.c()
            float r9 = r1.c()
            r1 = 50
            float r1 = (float) r1
            float r8 = androidx.compose.ui.unit.Dp.m(r1)
            r11 = 8
            r12 = 0
            r10 = 0
            r6 = r13
            androidx.compose.ui.Modifier r6 = androidx.compose.foundation.layout.PaddingKt.m(r6, r7, r8, r9, r10, r11, r12)
            r1 = 1501370417(0x597d1831, float:4.45248549E15)
            r15.X(r1)
            boolean r1 = r15.W(r3)
            java.lang.Object r7 = r29.g()
            if (r1 != 0) goto L_0x012e
            androidx.compose.runtime.Composer$Companion r1 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r1 = r1.a()
            if (r7 != r1) goto L_0x0136
        L_0x012e:
            com.hansecom.abt.presentation.screens.guest.t r7 = new com.hansecom.abt.presentation.screens.guest.t
            r7.<init>(r3)
            r15.N(r7)
        L_0x0136:
            r3 = r7
            kotlin.jvm.functions.Function1 r3 = (kotlin.jvm.functions.Function1) r3
            r29.M()
            r7 = 3072(0xc00, float:4.305E-42)
            r8 = 0
            r9 = 1
            r1 = r2
            r2 = r3
            r3 = r6
            r12 = r4
            r4 = r9
            r9 = r5
            r5 = r29
            r6 = r7
            r7 = r8
            com.hansecom.abt.ui.components.listItem.MenuItemListKt.j(r1, r2, r3, r4, r5, r6, r7)
            goto L_0x0150
        L_0x014e:
            r12 = r4
            r9 = r5
        L_0x0150:
            r29.M()
            int r1 = com.hansecom.abt.R.string.E5
            java.lang.String r2 = r9.c()
            java.lang.Object[] r2 = new java.lang.Object[]{r2}
            java.lang.String r1 = com.hansecom.abt.util.resourcesResolvers.StringResourceKt.a(r1, r2, r15, r14)
            com.hansecom.abt.ui.theme.AbtTheme r2 = com.hansecom.abt.ui.theme.AbtTheme.f38851a
            r3 = 6
            com.hansecom.abt.ui.theme.typography.AbtTypography r2 = r2.d(r15, r3)
            androidx.compose.ui.text.TextStyle r22 = r2.e()
            r2 = 24
            float r2 = (float) r2
            float r8 = androidx.compose.ui.unit.Dp.m(r2)
            r11 = 13
            r2 = 0
            r7 = 0
            r9 = 0
            r10 = 0
            r6 = r13
            r3 = r12
            r12 = r2
            androidx.compose.ui.Modifier r2 = androidx.compose.foundation.layout.PaddingKt.m(r6, r7, r8, r9, r10, r11, r12)
            androidx.compose.ui.Alignment$Horizontal r4 = r16.g()
            androidx.compose.ui.Modifier r2 = r3.b(r2, r4)
            r25 = 0
            r26 = 131068(0x1fffc, float:1.83665E-40)
            r3 = 0
            r5 = 0
            r6 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r13 = 0
            r14 = 0
            r16 = 0
            r15 = r16
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r24 = 0
            r23 = r29
            androidx.compose.material3.TextKt.j(r1, r2, r3, r5, r6, r8, r9, r10, r11, r13, r14, r15, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            r29.T()
            boolean r1 = androidx.compose.runtime.ComposerKt.P()
            if (r1 == 0) goto L_0x01ba
            androidx.compose.runtime.ComposerKt.X()
        L_0x01ba:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.presentation.screens.guest.GuestScreenKt$ScreenImpl$3.c(androidx.compose.foundation.layout.PaddingValues, androidx.compose.runtime.Composer, int):void");
    }

    public /* bridge */ /* synthetic */ Object d(Object obj, Object obj2, Object obj3) {
        c((PaddingValues) obj, (Composer) obj2, ((Number) obj3).intValue());
        return Unit.f40552a;
    }
}
