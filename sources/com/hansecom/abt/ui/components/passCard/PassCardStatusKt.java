package com.hansecom.abt.ui.components.passCard;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.foundation.text.TextAutoSize;
import androidx.compose.material3.CardColors;
import androidx.compose.material3.CardDefaults;
import androidx.compose.material3.CardElevation;
import androidx.compose.material3.CardKt;
import androidx.compose.material3.SurfaceKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Dp;
import com.hansecom.abt.R;
import com.hansecom.abt.ui.theme.AbtTheme;
import com.hansecom.abt.util.formatters.DateTimeFormaterKt;
import com.hansecom.abt.util.resourcesResolvers.StringResourceKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class PassCardStatusKt {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v2, resolved type: kotlin.jvm.functions.Function1} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void f(androidx.compose.ui.Modifier r40, boolean r41, kotlin.jvm.functions.Function1 r42, androidx.compose.runtime.Composer r43, int r44) {
        /*
            r0 = r40
            r11 = r41
            r12 = r42
            r13 = r44
            r1 = 707794730(0x2a30172a, float:1.5639977E-13)
            r2 = r43
            androidx.compose.runtime.Composer r10 = r2.q(r1)
            r2 = r13 & 6
            if (r2 != 0) goto L_0x0020
            boolean r2 = r10.W(r0)
            if (r2 == 0) goto L_0x001d
            r2 = 4
            goto L_0x001e
        L_0x001d:
            r2 = 2
        L_0x001e:
            r2 = r2 | r13
            goto L_0x0021
        L_0x0020:
            r2 = r13
        L_0x0021:
            r3 = r13 & 48
            r4 = 32
            if (r3 != 0) goto L_0x0032
            boolean r3 = r10.d(r11)
            if (r3 == 0) goto L_0x002f
            r3 = r4
            goto L_0x0031
        L_0x002f:
            r3 = 16
        L_0x0031:
            r2 = r2 | r3
        L_0x0032:
            r3 = r13 & 384(0x180, float:5.38E-43)
            r5 = 256(0x100, float:3.59E-43)
            if (r3 != 0) goto L_0x0043
            boolean r3 = r10.l(r12)
            if (r3 == 0) goto L_0x0040
            r3 = r5
            goto L_0x0042
        L_0x0040:
            r3 = 128(0x80, float:1.794E-43)
        L_0x0042:
            r2 = r2 | r3
        L_0x0043:
            r9 = r2
            r2 = r9 & 147(0x93, float:2.06E-43)
            r3 = 146(0x92, float:2.05E-43)
            if (r2 != r3) goto L_0x0057
            boolean r2 = r10.t()
            if (r2 != 0) goto L_0x0051
            goto L_0x0057
        L_0x0051:
            r10.B()
            r15 = r10
            goto L_0x01d1
        L_0x0057:
            boolean r2 = androidx.compose.runtime.ComposerKt.P()
            if (r2 == 0) goto L_0x0063
            r2 = -1
            java.lang.String r3 = "com.hansecom.abt.ui.components.passCard.AutoloadSection (PassCardStatus.kt:146)"
            androidx.compose.runtime.ComposerKt.Y(r1, r9, r2, r3)
        L_0x0063:
            r1 = 44
            float r1 = (float) r1
            float r1 = androidx.compose.ui.unit.Dp.m(r1)
            r14 = 0
            r15 = 1
            r7 = 0
            androidx.compose.ui.Modifier r1 = androidx.compose.foundation.layout.SizeKt.b(r0, r14, r1, r15, r7)
            androidx.compose.ui.semantics.Role$Companion r2 = androidx.compose.ui.semantics.Role.f18040b
            int r2 = r2.c()
            androidx.compose.ui.semantics.Role r6 = androidx.compose.ui.semantics.Role.j(r2)
            r2 = 1825465635(0x6cce6523, float:1.9961306E27)
            r10.X(r2)
            r2 = r9 & 896(0x380, float:1.256E-42)
            r3 = 0
            if (r2 != r5) goto L_0x0088
            r2 = r15
            goto L_0x0089
        L_0x0088:
            r2 = r3
        L_0x0089:
            r5 = r9 & 112(0x70, float:1.57E-43)
            if (r5 != r4) goto L_0x008f
            r4 = r15
            goto L_0x0090
        L_0x008f:
            r4 = r3
        L_0x0090:
            r2 = r2 | r4
            java.lang.Object r4 = r10.g()
            if (r2 != 0) goto L_0x009f
            androidx.compose.runtime.Composer$Companion r2 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r2 = r2.a()
            if (r4 != r2) goto L_0x00a7
        L_0x009f:
            com.hansecom.abt.ui.components.passCard.B r4 = new com.hansecom.abt.ui.components.passCard.B
            r4.<init>(r12, r11)
            r10.N(r4)
        L_0x00a7:
            r5 = r4
            kotlin.jvm.functions.Function1 r5 = (kotlin.jvm.functions.Function1) r5
            r10.M()
            r16 = 2
            r17 = 0
            r4 = 0
            r2 = r41
            r8 = r3
            r3 = r4
            r4 = r6
            r6 = r16
            r8 = r7
            r7 = r17
            androidx.compose.ui.Modifier r1 = androidx.compose.foundation.selection.ToggleableKt.d(r1, r2, r3, r4, r5, r6, r7)
            r2 = 8
            float r2 = (float) r2
            float r2 = androidx.compose.ui.unit.Dp.m(r2)
            androidx.compose.ui.Modifier r1 = androidx.compose.foundation.layout.PaddingKt.k(r1, r14, r2, r15, r8)
            androidx.compose.ui.Alignment$Companion r2 = androidx.compose.ui.Alignment.f15444a
            androidx.compose.ui.Alignment$Vertical r2 = r2.i()
            androidx.compose.foundation.layout.Arrangement r3 = androidx.compose.foundation.layout.Arrangement.f3739a
            androidx.compose.foundation.layout.Arrangement$Horizontal r3 = r3.f()
            r4 = 48
            androidx.compose.ui.layout.MeasurePolicy r2 = androidx.compose.foundation.layout.RowKt.b(r3, r2, r10, r4)
            r3 = 0
            int r5 = androidx.compose.runtime.ComposablesKt.a(r10, r3)
            androidx.compose.runtime.CompositionLocalMap r3 = r10.I()
            androidx.compose.ui.Modifier r1 = androidx.compose.ui.ComposedModifierKt.e(r10, r1)
            androidx.compose.ui.node.ComposeUiNode$Companion r6 = androidx.compose.ui.node.ComposeUiNode.f17222h
            kotlin.jvm.functions.Function0 r7 = r6.a()
            androidx.compose.runtime.Applier r8 = r10.v()
            if (r8 != 0) goto L_0x00f9
            androidx.compose.runtime.ComposablesKt.d()
        L_0x00f9:
            r10.s()
            boolean r8 = r10.n()
            if (r8 == 0) goto L_0x0106
            r10.y(r7)
            goto L_0x0109
        L_0x0106:
            r10.K()
        L_0x0109:
            androidx.compose.runtime.Composer r7 = androidx.compose.runtime.Updater.b(r10)
            kotlin.jvm.functions.Function2 r8 = r6.c()
            androidx.compose.runtime.Updater.g(r7, r2, r8)
            kotlin.jvm.functions.Function2 r2 = r6.e()
            androidx.compose.runtime.Updater.g(r7, r3, r2)
            kotlin.jvm.functions.Function2 r2 = r6.b()
            boolean r3 = r7.n()
            if (r3 != 0) goto L_0x0133
            java.lang.Object r3 = r7.g()
            java.lang.Integer r8 = java.lang.Integer.valueOf(r5)
            boolean r3 = kotlin.jvm.internal.Intrinsics.d(r3, r8)
            if (r3 != 0) goto L_0x0141
        L_0x0133:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r5)
            r7.N(r3)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r5)
            r7.A(r3, r2)
        L_0x0141:
            kotlin.jvm.functions.Function2 r2 = r6.d()
            androidx.compose.runtime.Updater.g(r7, r1, r2)
            androidx.compose.foundation.layout.RowScopeInstance r18 = androidx.compose.foundation.layout.RowScopeInstance.f4150a
            int r1 = com.hansecom.abt.R.string.k7
            r2 = 0
            java.lang.Object[] r3 = new java.lang.Object[r2]
            java.lang.String r14 = com.hansecom.abt.util.resourcesResolvers.StringResourceKt.a(r1, r3, r10, r2)
            com.hansecom.abt.ui.theme.AbtTheme r1 = com.hansecom.abt.ui.theme.AbtTheme.f38851a
            r2 = 6
            com.hansecom.abt.ui.theme.typography.AbtTypography r3 = r1.d(r10, r2)
            androidx.compose.ui.text.TextStyle r35 = r3.f()
            com.hansecom.abt.ui.theme.colorScheme.AbtColorScheme r1 = r1.b(r10, r2)
            long r16 = r1.q()
            androidx.compose.ui.Modifier$Companion r19 = androidx.compose.ui.Modifier.f15489d
            r22 = 2
            r23 = 0
            r20 = 1065353216(0x3f800000, float:1.0)
            r21 = 0
            androidx.compose.ui.Modifier r24 = androidx.compose.foundation.layout.RowScope.c(r18, r19, r20, r21, r22, r23)
            r1 = 16
            float r1 = (float) r1
            float r27 = androidx.compose.ui.unit.Dp.m(r1)
            r29 = 11
            r30 = 0
            r25 = 0
            r26 = 0
            r28 = 0
            androidx.compose.ui.Modifier r15 = androidx.compose.foundation.layout.PaddingKt.m(r24, r25, r26, r27, r28, r29, r30)
            r38 = 0
            r39 = 131064(0x1fff8, float:1.8366E-40)
            r18 = 0
            r19 = 0
            r21 = 0
            r22 = 0
            r24 = 0
            r26 = 0
            r27 = 0
            r28 = 0
            r30 = 0
            r31 = 0
            r32 = 0
            r33 = 0
            r34 = 0
            r37 = 0
            r36 = r10
            androidx.compose.material3.TextKt.j(r14, r15, r16, r18, r19, r21, r22, r23, r24, r26, r27, r28, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39)
            int r1 = r9 >> 3
            r1 = r1 & 14
            r9 = r1 | 48
            r14 = 124(0x7c, float:1.74E-43)
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r1 = r41
            r8 = r10
            r15 = r10
            r10 = r14
            androidx.compose.material3.SwitchKt.c(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r15.T()
            boolean r1 = androidx.compose.runtime.ComposerKt.P()
            if (r1 == 0) goto L_0x01d1
            androidx.compose.runtime.ComposerKt.X()
        L_0x01d1:
            androidx.compose.runtime.ScopeUpdateScope r1 = r15.x()
            if (r1 == 0) goto L_0x01df
            com.hansecom.abt.ui.components.passCard.C r2 = new com.hansecom.abt.ui.components.passCard.C
            r2.<init>(r0, r11, r12, r13)
            r1.a(r2)
        L_0x01df:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.ui.components.passCard.PassCardStatusKt.f(androidx.compose.ui.Modifier, boolean, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int):void");
    }

    public static final Unit g(Modifier modifier, boolean z2, Function1 function1, int i2, Composer composer, int i3) {
        f(modifier, z2, function1, composer, RecomposeScopeImplKt.a(i2 | 1));
        return Unit.f40552a;
    }

    public static final Unit h(Function1 function1, boolean z2, boolean z3) {
        function1.invoke(Boolean.valueOf(!z2));
        return Unit.f40552a;
    }

    public static final void i(PassCardState passCardState, Composer composer, int i2) {
        int i3;
        Composer composer2;
        AbtTheme abtTheme;
        int i4;
        long b2;
        PassCardState passCardState2 = passCardState;
        int i5 = i2;
        Composer q2 = composer.q(-10704762);
        if ((i5 & 6) == 0) {
            i3 = (q2.W(passCardState2) ? 4 : 2) | i5;
        } else {
            i3 = i5;
        }
        if ((i3 & 3) != 2 || !q2.t()) {
            if (ComposerKt.P()) {
                ComposerKt.Y(-10704762, i3, -1, "com.hansecom.abt.ui.components.passCard.CardTitle (PassCardStatus.kt:67)");
            }
            Modifier.Companion companion = Modifier.f15489d;
            Modifier h2 = SizeKt.h(companion, 0.0f, 1, (Object) null);
            Alignment.Companion companion2 = Alignment.f15444a;
            Alignment.Vertical i6 = companion2.i();
            Arrangement arrangement = Arrangement.f3739a;
            MeasurePolicy b3 = RowKt.b(arrangement.f(), i6, q2, 48);
            int a2 = ComposablesKt.a(q2, 0);
            CompositionLocalMap I = q2.I();
            Modifier e2 = ComposedModifierKt.e(q2, h2);
            ComposeUiNode.Companion companion3 = ComposeUiNode.f17222h;
            Function0 a3 = companion3.a();
            if (q2.v() == null) {
                ComposablesKt.d();
            }
            q2.s();
            if (q2.n()) {
                q2.y(a3);
            } else {
                q2.K();
            }
            Composer b4 = Updater.b(q2);
            Updater.g(b4, b3, companion3.c());
            Updater.g(b4, I, companion3.e());
            Function2 b5 = companion3.b();
            if (b4.n() || !Intrinsics.d(b4.g(), Integer.valueOf(a2))) {
                b4.N(Integer.valueOf(a2));
                b4.A(Integer.valueOf(a2), b5);
            }
            Updater.g(b4, e2, companion3.d());
            RowScopeInstance rowScopeInstance = RowScopeInstance.f4150a;
            Modifier t2 = SizeKt.t(companion, Dp.m((float) 40));
            AbtTheme abtTheme2 = AbtTheme.f38851a;
            RowScopeInstance rowScopeInstance2 = rowScopeInstance;
            AbtTheme abtTheme3 = abtTheme2;
            composer2 = q2;
            SurfaceKt.c(t2, RoundedCornerShapeKt.f(), abtTheme2.b(q2, 6).v(), 0, 0.0f, 0.0f, (BorderStroke) null, ComposableLambdaKt.e(-1595391995, true, new PassCardStatusKt$CardTitle$1$1(rowScopeInstance), q2, 54), q2, 12582918, 120);
            float f2 = (float) 16;
            SpacerKt.a(SizeKt.y(companion, Dp.m(f2)), composer2, 6);
            Modifier h3 = SizeKt.h(companion, 0.0f, 1, (Object) null);
            MeasurePolicy a4 = ColumnKt.a(arrangement.b(), companion2.k(), composer2, 6);
            int a5 = ComposablesKt.a(composer2, 0);
            CompositionLocalMap I2 = composer2.I();
            Modifier e3 = ComposedModifierKt.e(composer2, h3);
            Function0 a6 = companion3.a();
            if (composer2.v() == null) {
                ComposablesKt.d();
            }
            composer2.s();
            if (composer2.n()) {
                composer2.y(a6);
            } else {
                composer2.K();
            }
            Composer b6 = Updater.b(composer2);
            Updater.g(b6, a4, companion3.c());
            Updater.g(b6, I2, companion3.e());
            Function2 b7 = companion3.b();
            if (b6.n() || !Intrinsics.d(b6.g(), Integer.valueOf(a5))) {
                b6.N(Integer.valueOf(a5));
                b6.A(Integer.valueOf(a5), b7);
            }
            Updater.g(b6, e3, companion3.d());
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.f3815a;
            AbtTheme abtTheme4 = abtTheme3;
            AbtTheme abtTheme5 = abtTheme4;
            float f3 = f2;
            TextKt.j(passCardState.g(), (Modifier) null, abtTheme4.b(composer2, 6).q(), (TextAutoSize) null, 0, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0, (TextDecoration) null, (TextAlign) null, 0, 0, false, 0, 0, (Function1) null, abtTheme4.d(composer2, 6).m(), composer2, 0, 0, 131066);
            boolean i7 = passCardState.i();
            composer2.X(1407406374);
            boolean d2 = composer2.d(i7);
            Object g2 = composer2.g();
            if (d2 || g2 == Composer.f14567a.a()) {
                g2 = Integer.valueOf(passCardState.i() ? R.string.r7 : R.string.s7);
                composer2.N(g2);
            }
            int intValue = ((Number) g2).intValue();
            composer2.M();
            if (passCardState.i()) {
                composer2.X(680205868);
                abtTheme = abtTheme5;
                i4 = 6;
                b2 = abtTheme.b(composer2, 6).v();
                composer2.M();
            } else {
                abtTheme = abtTheme5;
                i4 = 6;
                composer2.X(680272239);
                b2 = abtTheme.b(composer2, 6).b();
                composer2.M();
            }
            long j2 = b2;
            float f4 = (float) 8;
            SpacerKt.a(SizeKt.i(companion, Dp.m(f4)), composer2, i4);
            MeasurePolicy b8 = RowKt.b(arrangement.f(), companion2.i(), composer2, 48);
            int a7 = ComposablesKt.a(composer2, 0);
            CompositionLocalMap I3 = composer2.I();
            Modifier e4 = ComposedModifierKt.e(composer2, companion);
            Function0 a8 = companion3.a();
            if (composer2.v() == null) {
                ComposablesKt.d();
            }
            composer2.s();
            if (composer2.n()) {
                composer2.y(a8);
            } else {
                composer2.K();
            }
            Composer b9 = Updater.b(composer2);
            Updater.g(b9, b8, companion3.c());
            Updater.g(b9, I3, companion3.e());
            Function2 b10 = companion3.b();
            if (b9.n() || !Intrinsics.d(b9.g(), Integer.valueOf(a7))) {
                b9.N(Integer.valueOf(a7));
                b9.A(Integer.valueOf(a7), b10);
            }
            Updater.g(b9, e4, companion3.d());
            RowScopeInstance rowScopeInstance3 = rowScopeInstance2;
            Composer composer3 = composer2;
            TextKt.j(StringResourceKt.a(R.string.t7, new Object[0], composer2, 0), rowScopeInstance3.b(companion), 0, (TextAutoSize) null, 0, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0, (TextDecoration) null, (TextAlign) null, 0, 0, false, 0, 0, (Function1) null, abtTheme.d(composer2, i4).d(), composer3, 0, 0, 131068);
            SpacerKt.a(SizeKt.y(companion, Dp.m(f3)), composer2, 6);
            long j3 = j2;
            BoxKt.a(BackgroundKt.a(SizeKt.t(companion, Dp.m(f4)), j3, RoundedCornerShapeKt.f()), composer2, 0);
            SpacerKt.a(SizeKt.y(companion, Dp.m((float) 4)), composer2, 6);
            TextKt.j(StringResourceKt.a(intValue, new Object[0], composer2, 0), rowScopeInstance3.b(companion), j3, (TextAutoSize) null, 0, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0, (TextDecoration) null, (TextAlign) null, 0, 0, false, 0, 0, (Function1) null, abtTheme.d(composer2, 6).d(), composer3, 0, 0, 131064);
            composer2.T();
            composer2.T();
            composer2.T();
            if (ComposerKt.P()) {
                ComposerKt.X();
            }
        } else {
            q2.B();
            composer2 = q2;
        }
        ScopeUpdateScope x2 = composer2.x();
        if (x2 != null) {
            x2.a(new z(passCardState, i5));
        }
    }

    public static final Unit j(PassCardState passCardState, int i2, Composer composer, int i3) {
        i(passCardState, composer, RecomposeScopeImplKt.a(i2 | 1));
        return Unit.f40552a;
    }

    public static final void k(PassCardState passCardState, Function1 function1, Modifier modifier, Composer composer, int i2, int i3) {
        int i4;
        Intrinsics.i(passCardState, "state");
        Intrinsics.i(function1, "onAutoLoadStateChange");
        Composer q2 = composer.q(1761666769);
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = (q2.W(passCardState) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            i4 |= q2.l(function1) ? 32 : 16;
        }
        int i5 = i3 & 4;
        if (i5 != 0) {
            i4 |= 384;
        } else if ((i2 & 384) == 0) {
            i4 |= q2.W(modifier) ? 256 : 128;
        }
        if ((i4 & 147) != 146 || !q2.t()) {
            if (i5 != 0) {
                modifier = Modifier.f15489d;
            }
            if (ComposerKt.P()) {
                ComposerKt.Y(1761666769, i4, -1, "com.hansecom.abt.ui.components.passCard.PassCardStatus (PassCardStatus.kt:45)");
            }
            m(modifier, ComposableLambdaKt.e(-1244189979, true, new PassCardStatusKt$PassCardStatus$1(passCardState, function1), q2, 54), q2, ((i4 >> 6) & 14) | 48);
            if (ComposerKt.P()) {
                ComposerKt.X();
            }
        } else {
            q2.B();
        }
        Modifier modifier2 = modifier;
        ScopeUpdateScope x2 = q2.x();
        if (x2 != null) {
            x2.a(new A(passCardState, function1, modifier2, i2, i3));
        }
    }

    public static final Unit l(PassCardState passCardState, Function1 function1, Modifier modifier, int i2, int i3, Composer composer, int i4) {
        k(passCardState, function1, modifier, composer, RecomposeScopeImplKt.a(i2 | 1), i3);
        return Unit.f40552a;
    }

    public static final void m(Modifier modifier, Function3 function3, Composer composer, int i2) {
        int i3;
        Composer composer2;
        Modifier modifier2 = modifier;
        Function3 function32 = function3;
        int i4 = i2;
        Intrinsics.i(modifier2, "modifier");
        Intrinsics.i(function32, "content");
        Composer q2 = composer.q(565420065);
        if ((i4 & 6) == 0) {
            i3 = (q2.W(modifier2) ? 4 : 2) | i4;
        } else {
            i3 = i4;
        }
        if ((i4 & 48) == 0) {
            i3 |= q2.l(function32) ? 32 : 16;
        }
        if ((i3 & 19) != 18 || !q2.t()) {
            if (ComposerKt.P()) {
                ComposerKt.Y(565420065, i3, -1, "com.hansecom.abt.ui.components.passCard.PassContainer (PassCardStatus.kt:129)");
            }
            CardDefaults cardDefaults = CardDefaults.f9356a;
            float m2 = Dp.m((float) 4);
            int i5 = CardDefaults.f9357b;
            CardElevation c2 = cardDefaults.c(m2, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, q2, (i5 << 18) | 6, 62);
            composer2 = q2;
            CardKt.c(modifier, RoundedCornerShapeKt.d(Dp.m((float) 8)), CardColors.d(cardDefaults.a(q2, i5), AbtTheme.f38851a.b(q2, 6).A(), 0, 0, 0, 14, (Object) null), c2, (BorderStroke) null, ComposableLambdaKt.e(298359279, true, new PassCardStatusKt$PassContainer$1(function32), q2, 54), q2, (i3 & 14) | 196608, 16);
            if (ComposerKt.P()) {
                ComposerKt.X();
            }
        } else {
            q2.B();
            composer2 = q2;
        }
        ScopeUpdateScope x2 = composer2.x();
        if (x2 != null) {
            x2.a(new D(modifier2, function32, i4));
        }
    }

    public static final Unit n(Modifier modifier, Function3 function3, int i2, Composer composer, int i3) {
        m(modifier, function3, composer, RecomposeScopeImplKt.a(i2 | 1));
        return Unit.f40552a;
    }

    public static final String r(PassCardState passCardState, Composer composer, int i2) {
        composer.X(-1773985334);
        if (ComposerKt.P()) {
            ComposerKt.Y(-1773985334, i2, -1, "com.hansecom.abt.ui.components.passCard.buildPassDescription (PassCardStatus.kt:174)");
        }
        StringBuilder sb = new StringBuilder();
        composer.X(-37030336);
        if (passCardState.d() > 1) {
            sb.append(StringResourceKt.a(R.string.q7, new Object[0], composer, 0));
            sb.append(' ');
            sb.append(passCardState.d());
            sb.append(10);
        }
        composer.M();
        if (passCardState.i()) {
            composer.X(1001900260);
            sb.append(StringResourceKt.a(R.string.j7, new Object[]{DateTimeFormaterKt.b(passCardState.h(), composer, 0)}, composer, 0));
            composer.M();
        } else {
            composer.X(1002022524);
            sb.append(StringResourceKt.a(R.string.p7, new Object[]{DateTimeFormaterKt.b(passCardState.c(), composer, 0)}, composer, 0));
            composer.M();
        }
        String sb2 = sb.toString();
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
        composer.M();
        return sb2;
    }
}
