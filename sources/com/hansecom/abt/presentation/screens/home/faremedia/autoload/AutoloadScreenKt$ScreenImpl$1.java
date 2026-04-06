package com.hansecom.abt.presentation.screens.home.faremedia.autoload;

import androidx.compose.runtime.Composer;
import com.hansecom.abt.presentation.screens.home.faremedia.autoload.Autoload;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

@Metadata
public final class AutoloadScreenKt$ScreenImpl$1 implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function1 f36234A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Function1 f36235B;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Autoload.State f36236z;

    public AutoloadScreenKt$ScreenImpl$1(Autoload.State state, Function1 function1, Function1 function12) {
        this.f36236z = state;
        this.f36234A = function1;
        this.f36235B = function12;
    }

    public static final Unit h(Function1 function1) {
        function1.invoke((Object) null);
        return Unit.f40552a;
    }

    public static final Unit i(Function1 function1, Autoload.State state) {
        function1.invoke(state.c().h() ? Autoload.Action.Activate.f36221a : Autoload.Action.Pause.f36223a);
        return Unit.f40552a;
    }

    public static final Unit k(Function1 function1, Autoload.State state) {
        function1.invoke(Long.valueOf(state.c().f()));
        return Unit.f40552a;
    }

    public static final Unit p(Function1 function1) {
        function1.invoke(new Autoload.Action.ShowDeleteDialog(true));
        return Unit.f40552a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v40, resolved type: kotlin.jvm.functions.Function0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v65, resolved type: kotlin.jvm.functions.Function0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v77, resolved type: kotlin.jvm.functions.Function0} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void g(androidx.compose.runtime.Composer r39, int r40) {
        /*
            r38 = this;
            r0 = r38
            r14 = r39
            r1 = r40
            int r13 = r39.c()
            r2 = r1 & 3
            r3 = 2
            if (r2 != r3) goto L_0x001b
            boolean r2 = r39.t()
            if (r2 != 0) goto L_0x0016
            goto L_0x001b
        L_0x0016:
            r39.B()
            goto L_0x04ea
        L_0x001b:
            boolean r2 = androidx.compose.runtime.ComposerKt.P()
            if (r2 == 0) goto L_0x002a
            r2 = -1
            java.lang.String r4 = "com.hansecom.abt.presentation.screens.home.faremedia.autoload.ScreenImpl.<anonymous> (AutoloadScreen.kt:78)"
            r5 = 595517546(0x237ee06a, float:1.3816889E-17)
            androidx.compose.runtime.ComposerKt.Y(r5, r1, r2, r4)
        L_0x002a:
            r1 = 815234671(0x30977e6f, float:1.1022631E-9)
            r14.X(r1)
            com.hansecom.abt.presentation.screens.home.faremedia.autoload.Autoload$State r1 = r0.f36236z
            com.hansecom.abt.presentation.screens.home.faremedia.autoload.Autoload$State$LoadState r1 = r1.e()
            com.hansecom.abt.presentation.screens.home.faremedia.autoload.Autoload$State$LoadState r2 = com.hansecom.abt.presentation.screens.home.faremedia.autoload.Autoload.State.LoadState.INITIAL
            r15 = 0
            if (r1 != r2) goto L_0x004b
            com.hansecom.abt.ui.components.loading.LoadingContentKt.b(r14, r15)
            boolean r1 = androidx.compose.runtime.ComposerKt.P()
            if (r1 == 0) goto L_0x0047
            androidx.compose.runtime.ComposerKt.X()
        L_0x0047:
            r39.M()
            return
        L_0x004b:
            r39.M()
            androidx.compose.ui.Modifier$Companion r12 = androidx.compose.ui.Modifier.f15489d
            r11 = 0
            r10 = 1
            r9 = 0
            androidx.compose.ui.Modifier r1 = androidx.compose.foundation.layout.SizeKt.f(r12, r11, r10, r9)
            com.hansecom.abt.ui.theme.Dimensions r26 = com.hansecom.abt.ui.theme.Dimensions.f38856a
            float r2 = r26.c()
            androidx.compose.ui.Modifier r16 = androidx.compose.foundation.layout.PaddingKt.k(r1, r2, r11, r3, r9)
            androidx.compose.foundation.ScrollState r17 = androidx.compose.foundation.ScrollKt.c(r15, r14, r15, r10)
            r21 = 14
            r22 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            androidx.compose.ui.Modifier r1 = androidx.compose.foundation.ScrollKt.g(r16, r17, r18, r19, r20, r21, r22)
            com.hansecom.abt.presentation.screens.home.faremedia.autoload.Autoload$State r8 = r0.f36236z
            kotlin.jvm.functions.Function1 r7 = r0.f36234A
            kotlin.jvm.functions.Function1 r5 = r0.f36235B
            androidx.compose.foundation.layout.Arrangement r6 = androidx.compose.foundation.layout.Arrangement.f3739a
            androidx.compose.foundation.layout.Arrangement$Vertical r2 = r6.g()
            androidx.compose.ui.Alignment$Companion r16 = androidx.compose.ui.Alignment.f15444a
            androidx.compose.ui.Alignment$Horizontal r4 = r16.k()
            androidx.compose.ui.layout.MeasurePolicy r2 = androidx.compose.foundation.layout.ColumnKt.a(r2, r4, r14, r15)
            int r4 = androidx.compose.runtime.ComposablesKt.a(r14, r15)
            androidx.compose.runtime.CompositionLocalMap r10 = r39.I()
            androidx.compose.ui.Modifier r1 = androidx.compose.ui.ComposedModifierKt.e(r14, r1)
            androidx.compose.ui.node.ComposeUiNode$Companion r17 = androidx.compose.ui.node.ComposeUiNode.f17222h
            kotlin.jvm.functions.Function0 r11 = r17.a()
            androidx.compose.runtime.Applier r19 = r39.v()
            if (r19 != 0) goto L_0x00a4
            androidx.compose.runtime.ComposablesKt.d()
        L_0x00a4:
            r39.s()
            boolean r19 = r39.n()
            if (r19 == 0) goto L_0x00b1
            r14.y(r11)
            goto L_0x00b4
        L_0x00b1:
            r39.K()
        L_0x00b4:
            androidx.compose.runtime.Composer r11 = androidx.compose.runtime.Updater.b(r39)
            kotlin.jvm.functions.Function2 r3 = r17.c()
            androidx.compose.runtime.Updater.g(r11, r2, r3)
            kotlin.jvm.functions.Function2 r2 = r17.e()
            androidx.compose.runtime.Updater.g(r11, r10, r2)
            kotlin.jvm.functions.Function2 r2 = r17.b()
            boolean r3 = r11.n()
            if (r3 != 0) goto L_0x00de
            java.lang.Object r3 = r11.g()
            java.lang.Integer r10 = java.lang.Integer.valueOf(r4)
            boolean r3 = kotlin.jvm.internal.Intrinsics.d(r3, r10)
            if (r3 != 0) goto L_0x00ec
        L_0x00de:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r4)
            r11.N(r3)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r4)
            r11.A(r3, r2)
        L_0x00ec:
            kotlin.jvm.functions.Function2 r2 = r17.d()
            androidx.compose.runtime.Updater.g(r11, r1, r2)
            androidx.compose.foundation.layout.ColumnScopeInstance r1 = androidx.compose.foundation.layout.ColumnScopeInstance.f3815a
            r1 = -1643343121(0xffffffff9e0c92ef, float:-7.4419234E-21)
            r14.X(r1)
            r1 = 501173781(0x1ddf4e15, float:5.9108343E-21)
            r14.X(r1)
            com.hansecom.abt.presentation.screens.home.faremedia.autoload.AutoloadState r1 = r8.c()
            if (r1 != 0) goto L_0x0170
            java.lang.String r9 = r8.g()
            float r2 = r26.d()
            r1 = 64
            float r1 = (float) r1
            float r4 = androidx.compose.ui.unit.Dp.m(r1)
            r5 = 5
            r6 = 0
            r1 = 0
            r3 = 0
            androidx.compose.foundation.layout.PaddingValues r2 = androidx.compose.foundation.layout.PaddingKt.e(r1, r2, r3, r4, r5, r6)
            r11 = 48
            r12 = 109(0x6d, float:1.53E-43)
            r1 = 0
            r3 = 0
            r5 = 0
            r10 = 0
            r16 = 0
            r15 = r7
            r7 = r9
            r9 = r8
            r8 = r10
            r10 = r9
            r9 = r16
            r27 = r10
            r10 = r39
            com.hansecom.abt.ui.components.screenHeader.ScreenHeaderKt.b(r1, r2, r3, r5, r7, r8, r9, r10, r11, r12)
            r1 = 501183600(0x1ddf7470, float:5.9148002E-21)
            r14.X(r1)
            boolean r1 = r14.W(r15)
            java.lang.Object r2 = r39.g()
            if (r1 != 0) goto L_0x0150
            androidx.compose.runtime.Composer$Companion r1 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r1 = r1.a()
            if (r2 != r1) goto L_0x0158
        L_0x0150:
            com.hansecom.abt.presentation.screens.home.faremedia.autoload.j r2 = new com.hansecom.abt.presentation.screens.home.faremedia.autoload.j
            r2.<init>(r15)
            r14.N(r2)
        L_0x0158:
            kotlin.jvm.functions.Function0 r2 = (kotlin.jvm.functions.Function0) r2
            r39.M()
            r11 = r27
            r1 = 0
            com.hansecom.abt.presentation.screens.home.faremedia.autoload.AutoloadScreenKt.o(r11, r2, r14, r1)
            r14.F(r13)
            boolean r1 = androidx.compose.runtime.ComposerKt.P()
            if (r1 == 0) goto L_0x016f
            androidx.compose.runtime.ComposerKt.X()
        L_0x016f:
            return
        L_0x0170:
            r15 = r7
            r11 = r8
            r39.M()
            java.lang.String r7 = r11.g()
            int r1 = com.hansecom.abt.R.string.W0
            com.hansecom.abt.util.formatters.CurrencyValueFormater r2 = com.hansecom.abt.util.formatters.CurrencyValueFormater.f39045a
            com.hansecom.abt.presentation.screens.home.faremedia.autoload.AutoloadState r3 = r11.c()
            java.math.BigDecimal r3 = r3.e()
            java.lang.String r3 = r3.toString()
            r4 = 2
            r8 = 0
            java.lang.String r2 = com.hansecom.abt.util.formatters.CurrencyValueFormater.d(r2, r3, r8, r4, r9)
            java.lang.Object[] r2 = new java.lang.Object[]{r2}
            androidx.compose.ui.text.AnnotatedString r10 = com.hansecom.abt.util.resourcesResolvers.StyledStringResourceKt.c(r1, r2, r14, r8)
            r13 = 0
            r19 = 79
            r1 = 0
            r2 = 0
            r3 = 0
            r21 = 0
            r23 = 0
            r8 = r5
            r28 = r6
            r5 = r21
            r29 = r8
            r8 = r10
            r10 = r9
            r9 = r23
            r10 = r39
            r27 = r11
            r11 = r13
            r13 = r12
            r12 = r19
            com.hansecom.abt.ui.components.screenHeader.ScreenHeaderKt.b(r1, r2, r3, r5, r7, r8, r9, r10, r11, r12)
            r1 = 4
            float r1 = (float) r1
            float r1 = androidx.compose.ui.unit.Dp.m(r1)
            r2 = r28
            androidx.compose.foundation.layout.Arrangement$HorizontalOrVertical r1 = r2.n(r1)
            androidx.compose.ui.Alignment$Vertical r2 = r16.l()
            r12 = 6
            androidx.compose.ui.layout.MeasurePolicy r1 = androidx.compose.foundation.layout.RowKt.b(r1, r2, r14, r12)
            r2 = 0
            int r3 = androidx.compose.runtime.ComposablesKt.a(r14, r2)
            androidx.compose.runtime.CompositionLocalMap r2 = r39.I()
            androidx.compose.ui.Modifier r4 = androidx.compose.ui.ComposedModifierKt.e(r14, r13)
            kotlin.jvm.functions.Function0 r5 = r17.a()
            androidx.compose.runtime.Applier r6 = r39.v()
            if (r6 != 0) goto L_0x01e7
            androidx.compose.runtime.ComposablesKt.d()
        L_0x01e7:
            r39.s()
            boolean r6 = r39.n()
            if (r6 == 0) goto L_0x01f4
            r14.y(r5)
            goto L_0x01f7
        L_0x01f4:
            r39.K()
        L_0x01f7:
            androidx.compose.runtime.Composer r5 = androidx.compose.runtime.Updater.b(r39)
            kotlin.jvm.functions.Function2 r6 = r17.c()
            androidx.compose.runtime.Updater.g(r5, r1, r6)
            kotlin.jvm.functions.Function2 r1 = r17.e()
            androidx.compose.runtime.Updater.g(r5, r2, r1)
            kotlin.jvm.functions.Function2 r1 = r17.b()
            boolean r2 = r5.n()
            if (r2 != 0) goto L_0x0221
            java.lang.Object r2 = r5.g()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r3)
            boolean r2 = kotlin.jvm.internal.Intrinsics.d(r2, r6)
            if (r2 != 0) goto L_0x022f
        L_0x0221:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r3)
            r5.N(r2)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r3)
            r5.A(r2, r1)
        L_0x022f:
            kotlin.jvm.functions.Function2 r1 = r17.d()
            androidx.compose.runtime.Updater.g(r5, r4, r1)
            androidx.compose.foundation.layout.RowScopeInstance r1 = androidx.compose.foundation.layout.RowScopeInstance.f4150a
            int r1 = com.hansecom.abt.R.string.U0
            r10 = 0
            java.lang.Object[] r2 = new java.lang.Object[r10]
            java.lang.String r1 = com.hansecom.abt.util.resourcesResolvers.StringResourceKt.a(r1, r2, r14, r10)
            com.hansecom.abt.ui.theme.AbtTheme r11 = com.hansecom.abt.ui.theme.AbtTheme.f38851a
            com.hansecom.abt.ui.theme.typography.AbtTypography r2 = r11.d(r14, r12)
            androidx.compose.ui.text.TextStyle r21 = r2.f()
            r24 = 0
            r25 = 65534(0xfffe, float:9.1833E-41)
            r2 = 0
            r3 = 0
            r5 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r16 = 0
            r18 = r10
            r30 = r11
            r10 = r16
            r16 = 0
            r12 = r16
            r32 = r13
            r13 = r16
            r16 = 0
            r33 = r15
            r14 = r16
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r23 = 0
            r22 = r39
            com.hansecom.abt.ui.components.AbtTextKt.c(r1, r2, r3, r5, r7, r8, r9, r10, r12, r13, r14, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            com.hansecom.abt.presentation.screens.home.faremedia.autoload.AutoloadState r1 = r27.c()
            boolean r1 = r1.h()
            if (r1 == 0) goto L_0x028d
            int r1 = com.hansecom.abt.R.string.V0
        L_0x028b:
            r3 = 0
            goto L_0x0290
        L_0x028d:
            int r1 = com.hansecom.abt.R.string.T0
            goto L_0x028b
        L_0x0290:
            java.lang.Object[] r2 = new java.lang.Object[r3]
            r4 = r39
            java.lang.String r1 = com.hansecom.abt.util.resourcesResolvers.StringResourceKt.a(r1, r2, r4, r3)
            r15 = r30
            r14 = 6
            com.hansecom.abt.ui.theme.typography.AbtTypography r2 = r15.d(r4, r14)
            androidx.compose.ui.text.TextStyle r21 = r2.f()
            com.hansecom.abt.presentation.screens.home.faremedia.autoload.AutoloadState r2 = r27.c()
            boolean r2 = r2.h()
            if (r2 == 0) goto L_0x02c1
            r2 = -784654471(0xffffffffd13b1f79, float:-5.0230432E10)
            r4.X(r2)
            com.hansecom.abt.ui.theme.colorScheme.AbtColorScheme r2 = r15.b(r4, r14)
            long r5 = r2.b()
        L_0x02bb:
            r39.M()
            r30 = r5
            goto L_0x02d0
        L_0x02c1:
            r2 = -784653444(0xffffffffd13b237c, float:-5.0234638E10)
            r4.X(r2)
            com.hansecom.abt.ui.theme.colorScheme.AbtColorScheme r2 = r15.b(r4, r14)
            long r5 = r2.v()
            goto L_0x02bb
        L_0x02d0:
            r24 = 0
            r25 = 65530(0xfffa, float:9.1827E-41)
            r2 = 0
            r5 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r12 = 0
            r13 = 0
            r16 = 0
            r34 = r15
            r14 = r16
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r23 = 0
            r3 = r30
            r22 = r39
            com.hansecom.abt.ui.components.AbtTextKt.c(r1, r2, r3, r5, r7, r8, r9, r10, r12, r13, r14, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            r39.T()
            r1 = 24
            float r11 = (float) r1
            float r1 = androidx.compose.ui.unit.Dp.m(r11)
            r12 = r32
            androidx.compose.ui.Modifier r1 = androidx.compose.foundation.layout.SizeKt.i(r12, r1)
            r13 = r39
            r14 = 6
            androidx.compose.foundation.layout.SpacerKt.a(r1, r13, r14)
            r9 = 0
            r10 = 1
            r15 = 0
            androidx.compose.ui.Modifier r2 = androidx.compose.foundation.layout.SizeKt.h(r12, r15, r10, r9)
            com.hansecom.abt.presentation.screens.home.faremedia.autoload.AutoloadState r1 = r27.c()
            boolean r1 = r1.h()
            if (r1 == 0) goto L_0x0323
            int r1 = com.hansecom.abt.R.string.z0
        L_0x0321:
            r8 = 0
            goto L_0x0326
        L_0x0323:
            int r1 = com.hansecom.abt.R.string.N0
            goto L_0x0321
        L_0x0326:
            java.lang.Object[] r3 = new java.lang.Object[r8]
            java.lang.String r5 = com.hansecom.abt.util.resourcesResolvers.StringResourceKt.a(r1, r3, r13, r8)
            com.hansecom.abt.ui.components.abtButton.AbtButtonStyle$Companion r7 = com.hansecom.abt.ui.components.abtButton.AbtButtonStyle.f37880f
            com.hansecom.abt.ui.components.abtButton.AbtButtonStyles r1 = r7.a(r13, r14)
            com.hansecom.abt.ui.components.abtButton.AbtButtonStyle r3 = r1.c(r13, r8)
            r1 = 501227794(0x1de02112, float:5.93265E-21)
            r13.X(r1)
            r6 = r29
            boolean r1 = r13.W(r6)
            r4 = r27
            boolean r16 = r13.W(r4)
            r1 = r1 | r16
            java.lang.Object r8 = r39.g()
            if (r1 != 0) goto L_0x0358
            androidx.compose.runtime.Composer$Companion r1 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r1 = r1.a()
            if (r8 != r1) goto L_0x0360
        L_0x0358:
            com.hansecom.abt.presentation.screens.home.faremedia.autoload.k r8 = new com.hansecom.abt.presentation.screens.home.faremedia.autoload.k
            r8.<init>(r6, r4)
            r13.N(r8)
        L_0x0360:
            r1 = r8
            kotlin.jvm.functions.Function0 r1 = (kotlin.jvm.functions.Function0) r1
            r39.M()
            r16 = 48
            r17 = 104(0x68, float:1.46E-43)
            r8 = 0
            r18 = 0
            r19 = 0
            r27 = r4
            r4 = r8
            r8 = r6
            r6 = r18
            r35 = r7
            r7 = r19
            r36 = r8
            r8 = r39
            r9 = r16
            r15 = r10
            r10 = r17
            com.hansecom.abt.ui.components.abtButton.AbtButtonKt.j(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            float r1 = androidx.compose.ui.unit.Dp.m(r11)
            androidx.compose.ui.Modifier r1 = androidx.compose.foundation.layout.SizeKt.i(r12, r1)
            androidx.compose.foundation.layout.SpacerKt.a(r1, r13, r14)
            float r1 = (float) r15
            float r2 = androidx.compose.ui.unit.Dp.m(r1)
            r8 = r34
            com.hansecom.abt.ui.theme.colorScheme.AbtColorScheme r1 = r8.b(r13, r14)
            long r3 = r1.u()
            r6 = 48
            r7 = 1
            r1 = 0
            r5 = r39
            androidx.compose.material3.DividerKt.e(r1, r2, r3, r5, r6, r7)
            r1 = 32
            float r1 = (float) r1
            float r1 = androidx.compose.ui.unit.Dp.m(r1)
            androidx.compose.ui.Modifier r1 = androidx.compose.foundation.layout.SizeKt.i(r12, r1)
            androidx.compose.foundation.layout.SpacerKt.a(r1, r13, r14)
            com.hansecom.abt.presentation.screens.home.faremedia.autoload.AutoloadState r1 = r27.c()
            boolean r1 = r1.h()
            if (r1 == 0) goto L_0x03d2
            r1 = -1641016944(0xffffffff9e301190, float:-9.320994E-21)
            r13.X(r1)
            com.hansecom.abt.ui.theme.colorScheme.AbtColorScheme r1 = r8.b(r13, r14)
            long r1 = r1.a()
            r39.M()
            goto L_0x03e9
        L_0x03d2:
            r1 = -1640950604(0xffffffff9e3114b4, float:-9.374583E-21)
            r13.X(r1)
            androidx.compose.runtime.ProvidableCompositionLocal r1 = androidx.compose.material3.ContentColorKt.a()
            java.lang.Object r1 = r13.C(r1)
            androidx.compose.ui.graphics.Color r1 = (androidx.compose.ui.graphics.Color) r1
            long r1 = r1.v()
            r39.M()
        L_0x03e9:
            androidx.compose.runtime.ProvidableCompositionLocal r3 = androidx.compose.material3.ContentColorKt.a()
            androidx.compose.ui.graphics.Color r1 = androidx.compose.ui.graphics.Color.h(r1)
            androidx.compose.runtime.ProvidedValue r1 = r3.d(r1)
            com.hansecom.abt.presentation.screens.home.faremedia.autoload.AutoloadScreenKt$ScreenImpl$1$1$4 r2 = new com.hansecom.abt.presentation.screens.home.faremedia.autoload.AutoloadScreenKt$ScreenImpl$1$1$4
            r3 = r27
            r2.<init>(r3)
            r4 = 54
            r5 = 975180020(0x3a2010f4, float:6.106042E-4)
            androidx.compose.runtime.internal.ComposableLambda r2 = androidx.compose.runtime.internal.ComposableLambdaKt.e(r5, r15, r2, r13, r4)
            int r4 = androidx.compose.runtime.ProvidedValue.f14769i
            r4 = r4 | 48
            androidx.compose.runtime.CompositionLocalKt.c(r1, r2, r13, r4)
            r1 = 40
            float r1 = (float) r1
            float r1 = androidx.compose.ui.unit.Dp.m(r1)
            androidx.compose.ui.Modifier r1 = androidx.compose.foundation.layout.SizeKt.i(r12, r1)
            androidx.compose.foundation.layout.SpacerKt.a(r1, r13, r14)
            r1 = 0
            r11 = 0
            androidx.compose.ui.Modifier r2 = androidx.compose.foundation.layout.SizeKt.h(r12, r1, r15, r11)
            int r1 = com.hansecom.abt.R.string.J0
            r10 = 0
            java.lang.Object[] r4 = new java.lang.Object[r10]
            java.lang.String r5 = com.hansecom.abt.util.resourcesResolvers.StringResourceKt.a(r1, r4, r13, r10)
            r9 = r35
            com.hansecom.abt.ui.components.abtButton.AbtButtonStyles r1 = r9.a(r13, r14)
            com.hansecom.abt.ui.components.abtButton.AbtButtonStyle r4 = r1.e(r13, r10)
            r1 = 501310141(0x1de162bd, float:5.9659097E-21)
            r13.X(r1)
            r1 = r33
            boolean r6 = r13.W(r1)
            boolean r7 = r13.W(r3)
            r6 = r6 | r7
            java.lang.Object r7 = r39.g()
            if (r6 != 0) goto L_0x0452
            androidx.compose.runtime.Composer$Companion r6 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r6 = r6.a()
            if (r7 != r6) goto L_0x045a
        L_0x0452:
            com.hansecom.abt.presentation.screens.home.faremedia.autoload.l r7 = new com.hansecom.abt.presentation.screens.home.faremedia.autoload.l
            r7.<init>(r1, r3)
            r13.N(r7)
        L_0x045a:
            r1 = r7
            kotlin.jvm.functions.Function0 r1 = (kotlin.jvm.functions.Function0) r1
            r39.M()
            r16 = 48
            r17 = 104(0x68, float:1.46E-43)
            r6 = 0
            r7 = 0
            r8 = 0
            r3 = r4
            r4 = r6
            r6 = r7
            r7 = r8
            r8 = r39
            r37 = r9
            r9 = r16
            r10 = r17
            com.hansecom.abt.ui.components.abtButton.AbtButtonKt.j(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r1 = 8
            float r1 = (float) r1
            float r1 = androidx.compose.ui.unit.Dp.m(r1)
            androidx.compose.ui.Modifier r1 = androidx.compose.foundation.layout.SizeKt.i(r12, r1)
            androidx.compose.foundation.layout.SpacerKt.a(r1, r13, r14)
            r1 = 0
            androidx.compose.ui.Modifier r2 = androidx.compose.foundation.layout.SizeKt.h(r12, r1, r15, r11)
            int r1 = com.hansecom.abt.R.string.C0
            r3 = 0
            java.lang.Object[] r4 = new java.lang.Object[r3]
            java.lang.String r5 = com.hansecom.abt.util.resourcesResolvers.StringResourceKt.a(r1, r4, r13, r3)
            r1 = r37
            com.hansecom.abt.ui.components.abtButton.AbtButtonStyles r1 = r1.a(r13, r14)
            com.hansecom.abt.ui.components.abtButton.AbtButtonStyle r3 = r1.f(r13, r3)
            r1 = 501320958(0x1de18cfe, float:5.9702787E-21)
            r13.X(r1)
            r1 = r36
            boolean r4 = r13.W(r1)
            java.lang.Object r6 = r39.g()
            if (r4 != 0) goto L_0x04b6
            androidx.compose.runtime.Composer$Companion r4 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r4 = r4.a()
            if (r6 != r4) goto L_0x04be
        L_0x04b6:
            com.hansecom.abt.presentation.screens.home.faremedia.autoload.m r6 = new com.hansecom.abt.presentation.screens.home.faremedia.autoload.m
            r6.<init>(r1)
            r13.N(r6)
        L_0x04be:
            r1 = r6
            kotlin.jvm.functions.Function0 r1 = (kotlin.jvm.functions.Function0) r1
            r39.M()
            r9 = 48
            r10 = 104(0x68, float:1.46E-43)
            r4 = 0
            r6 = 0
            r7 = 0
            r8 = r39
            com.hansecom.abt.ui.components.abtButton.AbtButtonKt.j(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            float r1 = r26.e()
            androidx.compose.ui.Modifier r1 = androidx.compose.foundation.layout.SizeKt.i(r12, r1)
            androidx.compose.foundation.layout.SpacerKt.a(r1, r13, r14)
            r39.M()
            r39.T()
            boolean r1 = androidx.compose.runtime.ComposerKt.P()
            if (r1 == 0) goto L_0x04ea
            androidx.compose.runtime.ComposerKt.X()
        L_0x04ea:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.presentation.screens.home.faremedia.autoload.AutoloadScreenKt$ScreenImpl$1.g(androidx.compose.runtime.Composer, int):void");
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        g((Composer) obj, ((Number) obj2).intValue());
        return Unit.f40552a;
    }
}
