package com.hansecom.abt.presentation.screens.home.more;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import com.hansecom.abt.presentation.screens.home.more.More;
import com.hansecom.abt.ui.components.listItem.MenuItemState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class MoreScreenKt$ScreenImpl$1 implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ More.State f37432A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Function1 f37433B;
    public final /* synthetic */ Function0 C;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Modifier f37434z;

    public MoreScreenKt$ScreenImpl$1(Modifier modifier, More.State state, Function1 function1, Function0 function0) {
        this.f37434z = modifier;
        this.f37432A = state;
        this.f37433B = function1;
        this.C = function0;
    }

    /* access modifiers changed from: private */
    public static final Unit e(Function1 function1, MenuItemState menuItemState) {
        Intrinsics.i(menuItemState, "it");
        function1.invoke(new More.Action.MenuItemClick(menuItemState));
        return Unit.f40552a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v18, resolved type: kotlin.jvm.functions.Function1} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c(androidx.compose.runtime.Composer r36, int r37) {
        /*
            r35 = this;
            r0 = r35
            r15 = r36
            r1 = r37
            r2 = r1 & 3
            r3 = 2
            if (r2 != r3) goto L_0x0017
            boolean r2 = r36.t()
            if (r2 != 0) goto L_0x0012
            goto L_0x0017
        L_0x0012:
            r36.B()
            goto L_0x01da
        L_0x0017:
            boolean r2 = androidx.compose.runtime.ComposerKt.P()
            if (r2 == 0) goto L_0x0026
            r2 = -1
            java.lang.String r3 = "com.hansecom.abt.presentation.screens.home.more.ScreenImpl.<anonymous> (MoreScreen.kt:73)"
            r4 = 505284293(0x1e1e06c5, float:8.36585E-21)
            androidx.compose.runtime.ComposerKt.Y(r4, r1, r2, r3)
        L_0x0026:
            androidx.compose.ui.Modifier r1 = r0.f37434z
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
            com.hansecom.abt.ui.theme.Dimensions r23 = com.hansecom.abt.ui.theme.Dimensions.f38856a
            float r20 = r23.e()
            r21 = 7
            r22 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            androidx.compose.ui.Modifier r1 = androidx.compose.foundation.layout.PaddingKt.m(r16, r17, r18, r19, r20, r21, r22)
            com.hansecom.abt.presentation.screens.home.more.More$State r13 = r0.f37432A
            kotlin.jvm.functions.Function1 r12 = r0.f37433B
            kotlin.jvm.functions.Function0 r11 = r0.C
            androidx.compose.foundation.layout.Arrangement r2 = androidx.compose.foundation.layout.Arrangement.f3739a
            androidx.compose.foundation.layout.Arrangement$Vertical r2 = r2.g()
            androidx.compose.ui.Alignment$Companion r16 = androidx.compose.ui.Alignment.f15444a
            androidx.compose.ui.Alignment$Horizontal r3 = r16.k()
            androidx.compose.ui.layout.MeasurePolicy r2 = androidx.compose.foundation.layout.ColumnKt.a(r2, r3, r15, r14)
            int r3 = androidx.compose.runtime.ComposablesKt.a(r15, r14)
            androidx.compose.runtime.CompositionLocalMap r4 = r36.I()
            androidx.compose.ui.Modifier r1 = androidx.compose.ui.ComposedModifierKt.e(r15, r1)
            androidx.compose.ui.node.ComposeUiNode$Companion r5 = androidx.compose.ui.node.ComposeUiNode.f17222h
            kotlin.jvm.functions.Function0 r6 = r5.a()
            androidx.compose.runtime.Applier r7 = r36.v()
            if (r7 != 0) goto L_0x0083
            androidx.compose.runtime.ComposablesKt.d()
        L_0x0083:
            r36.s()
            boolean r7 = r36.n()
            if (r7 == 0) goto L_0x0090
            r15.y(r6)
            goto L_0x0093
        L_0x0090:
            r36.K()
        L_0x0093:
            androidx.compose.runtime.Composer r6 = androidx.compose.runtime.Updater.b(r36)
            kotlin.jvm.functions.Function2 r7 = r5.c()
            androidx.compose.runtime.Updater.g(r6, r2, r7)
            kotlin.jvm.functions.Function2 r2 = r5.e()
            androidx.compose.runtime.Updater.g(r6, r4, r2)
            kotlin.jvm.functions.Function2 r2 = r5.b()
            boolean r4 = r6.n()
            if (r4 != 0) goto L_0x00bd
            java.lang.Object r4 = r6.g()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r3)
            boolean r4 = kotlin.jvm.internal.Intrinsics.d(r4, r7)
            if (r4 != 0) goto L_0x00cb
        L_0x00bd:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)
            r6.N(r4)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r6.A(r3, r2)
        L_0x00cb:
            kotlin.jvm.functions.Function2 r2 = r5.d()
            androidx.compose.runtime.Updater.g(r6, r1, r2)
            androidx.compose.foundation.layout.ColumnScopeInstance r10 = androidx.compose.foundation.layout.ColumnScopeInstance.f3815a
            com.hansecom.abt.ui.theme.AbtTheme r9 = com.hansecom.abt.ui.theme.AbtTheme.f38851a
            r8 = 6
            com.hansecom.abt.ui.theme.colorScheme.AbtColorScheme r1 = r9.b(r15, r8)
            long r3 = r1.x()
            com.hansecom.abt.presentation.screens.home.more.ComposableSingletons$MoreScreenKt r1 = com.hansecom.abt.presentation.screens.home.more.ComposableSingletons$MoreScreenKt.f37412a
            kotlin.jvm.functions.Function2 r17 = r1.a()
            r18 = 12582912(0xc00000, float:1.7632415E-38)
            r19 = 123(0x7b, float:1.72E-43)
            r1 = 0
            r2 = 0
            r5 = 0
            r7 = 0
            r20 = 0
            r21 = 0
            r8 = r20
            r33 = r9
            r9 = r21
            r34 = r10
            r10 = r17
            r17 = r11
            r11 = r36
            r14 = r12
            r12 = r18
            r18 = r13
            r13 = r19
            androidx.compose.material3.SurfaceKt.c(r1, r2, r3, r5, r7, r8, r9, r10, r11, r12, r13)
            r1 = 30595585(0x1d2da01, float:7.7454637E-38)
            r15.X(r1)
            com.hansecom.abt.ui.components.listItem.MenuItemListState r1 = r18.c()
            if (r1 == 0) goto L_0x0162
            com.hansecom.abt.ui.components.listItem.MenuItemListState r1 = r18.c()
            androidx.compose.ui.Modifier$Companion r2 = androidx.compose.ui.Modifier.f15489d
            float r3 = r23.c()
            float r5 = r23.c()
            r4 = 50
            float r4 = (float) r4
            float r4 = androidx.compose.ui.unit.Dp.m(r4)
            r7 = 8
            r8 = 0
            r6 = 0
            androidx.compose.ui.Modifier r3 = androidx.compose.foundation.layout.PaddingKt.m(r2, r3, r4, r5, r6, r7, r8)
            r2 = 30599389(0x1d2e8dd, float:7.747596E-38)
            r15.X(r2)
            boolean r2 = r15.W(r14)
            java.lang.Object r4 = r36.g()
            if (r2 != 0) goto L_0x014b
            androidx.compose.runtime.Composer$Companion r2 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r2 = r2.a()
            if (r4 != r2) goto L_0x0153
        L_0x014b:
            com.hansecom.abt.presentation.screens.home.more.o r4 = new com.hansecom.abt.presentation.screens.home.more.o
            r4.<init>(r14)
            r15.N(r4)
        L_0x0153:
            r2 = r4
            kotlin.jvm.functions.Function1 r2 = (kotlin.jvm.functions.Function1) r2
            r36.M()
            r6 = 3072(0xc00, float:4.305E-42)
            r7 = 0
            r4 = 1
            r5 = r36
            com.hansecom.abt.ui.components.listItem.MenuItemListKt.j(r1, r2, r3, r4, r5, r6, r7)
        L_0x0162:
            r36.M()
            int r1 = com.hansecom.abt.R.string.e7
            java.lang.String r2 = r18.d()
            java.lang.Object[] r2 = new java.lang.Object[]{r2}
            r3 = 0
            java.lang.String r7 = com.hansecom.abt.util.resourcesResolvers.StringResourceKt.a(r1, r2, r15, r3)
            r1 = r33
            r2 = 6
            com.hansecom.abt.ui.theme.typography.AbtTypography r1 = r1.d(r15, r2)
            androidx.compose.ui.text.TextStyle r28 = r1.e()
            androidx.compose.ui.Modifier$Companion r8 = androidx.compose.ui.Modifier.f15489d
            r1 = 24
            float r1 = (float) r1
            float r10 = androidx.compose.ui.unit.Dp.m(r1)
            r13 = 13
            r14 = 0
            r9 = 0
            r11 = 0
            r12 = 0
            androidx.compose.ui.Modifier r1 = androidx.compose.foundation.layout.PaddingKt.m(r8, r9, r10, r11, r12, r13, r14)
            androidx.compose.ui.Alignment$Horizontal r2 = r16.g()
            r3 = r34
            androidx.compose.ui.Modifier r1 = r3.b(r1, r2)
            r5 = 0
            r6 = 2
            r3 = 0
            r2 = r17
            r4 = r36
            androidx.compose.ui.Modifier r8 = com.hansecom.abt.util.DebugMenuModifierKt.c(r1, r2, r3, r4, r5, r6)
            r31 = 0
            r32 = 131068(0x1fffc, float:1.83665E-40)
            r9 = 0
            r11 = 0
            r12 = 0
            r1 = 0
            r15 = r1
            r16 = 0
            r17 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r30 = 0
            r29 = r36
            androidx.compose.material3.TextKt.j(r7, r8, r9, r11, r12, r14, r15, r16, r17, r19, r20, r21, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32)
            r36.T()
            boolean r1 = androidx.compose.runtime.ComposerKt.P()
            if (r1 == 0) goto L_0x01da
            androidx.compose.runtime.ComposerKt.X()
        L_0x01da:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.presentation.screens.home.more.MoreScreenKt$ScreenImpl$1.c(androidx.compose.runtime.Composer, int):void");
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        c((Composer) obj, ((Number) obj2).intValue());
        return Unit.f40552a;
    }
}
