package com.hansecom.abt.ui.components.fareMediaCard;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import com.hansecom.abt.util.resourcesResolvers.StringValue;
import kotlin.Metadata;
import kotlin.Unit;

@Metadata
public final class FareMediaCardKt {
    /* JADX WARNING: Removed duplicated region for block: B:104:0x0429  */
    /* JADX WARNING: Removed duplicated region for block: B:106:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0072  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void c(java.lang.String r38, java.lang.String r39, long r40, androidx.compose.runtime.Composer r42, int r43, int r44) {
        /*
            r1 = r38
            r5 = r43
            r0 = 6
            r2 = -713332498(0xffffffffd57b68ee, float:-1.72767555E13)
            r3 = r42
            androidx.compose.runtime.Composer r3 = r3.q(r2)
            r4 = 1
            r6 = r44 & 1
            r13 = 2
            r15 = 4
            if (r6 == 0) goto L_0x0018
            r6 = r5 | 6
            goto L_0x0028
        L_0x0018:
            r6 = r5 & 6
            if (r6 != 0) goto L_0x0027
            boolean r6 = r3.W(r1)
            if (r6 == 0) goto L_0x0024
            r6 = r15
            goto L_0x0025
        L_0x0024:
            r6 = r13
        L_0x0025:
            r6 = r6 | r5
            goto L_0x0028
        L_0x0027:
            r6 = r5
        L_0x0028:
            r7 = r44 & 2
            if (r7 == 0) goto L_0x0031
            r6 = r6 | 48
            r14 = r39
            goto L_0x0043
        L_0x0031:
            r7 = r5 & 48
            r14 = r39
            if (r7 != 0) goto L_0x0043
            boolean r7 = r3.W(r14)
            if (r7 == 0) goto L_0x0040
            r7 = 32
            goto L_0x0042
        L_0x0040:
            r7 = 16
        L_0x0042:
            r6 = r6 | r7
        L_0x0043:
            r7 = r44 & 4
            if (r7 == 0) goto L_0x004c
            r6 = r6 | 384(0x180, float:5.38E-43)
        L_0x0049:
            r8 = r40
            goto L_0x005e
        L_0x004c:
            r8 = r5 & 384(0x180, float:5.38E-43)
            if (r8 != 0) goto L_0x0049
            r8 = r40
            boolean r10 = r3.j(r8)
            if (r10 == 0) goto L_0x005b
            r10 = 256(0x100, float:3.59E-43)
            goto L_0x005d
        L_0x005b:
            r10 = 128(0x80, float:1.794E-43)
        L_0x005d:
            r6 = r6 | r10
        L_0x005e:
            r10 = r6 & 147(0x93, float:2.06E-43)
            r11 = 146(0x92, float:2.05E-43)
            if (r10 != r11) goto L_0x0072
            boolean r10 = r3.t()
            if (r10 != 0) goto L_0x006b
            goto L_0x0072
        L_0x006b:
            r3.B()
            r35 = r8
            goto L_0x0423
        L_0x0072:
            if (r7 == 0) goto L_0x007c
            androidx.compose.ui.graphics.Color$Companion r7 = androidx.compose.ui.graphics.Color.f15975b
            long r7 = r7.e()
            r11 = r7
            goto L_0x007d
        L_0x007c:
            r11 = r8
        L_0x007d:
            boolean r7 = androidx.compose.runtime.ComposerKt.P()
            if (r7 == 0) goto L_0x0089
            r7 = -1
            java.lang.String r8 = "com.hansecom.abt.ui.components.fareMediaCard.BottomInfoCard (FareMediaCard.kt:159)"
            androidx.compose.runtime.ComposerKt.Y(r2, r6, r7, r8)
        L_0x0089:
            androidx.compose.ui.Modifier$Companion r2 = androidx.compose.ui.Modifier.f15489d
            r10 = 0
            r8 = 0
            androidx.compose.ui.Modifier r16 = androidx.compose.foundation.layout.SizeKt.h(r2, r10, r4, r8)
            r20 = 2
            r21 = 0
            r19 = 0
            r17 = r11
            androidx.compose.ui.Modifier r6 = androidx.compose.foundation.BackgroundKt.b(r16, r17, r19, r20, r21)
            androidx.compose.foundation.layout.Arrangement r32 = androidx.compose.foundation.layout.Arrangement.f3739a
            androidx.compose.foundation.layout.Arrangement$Vertical r7 = r32.g()
            androidx.compose.ui.Alignment$Companion r33 = androidx.compose.ui.Alignment.f15444a
            androidx.compose.ui.Alignment$Horizontal r9 = r33.k()
            r15 = 0
            androidx.compose.ui.layout.MeasurePolicy r7 = androidx.compose.foundation.layout.ColumnKt.a(r7, r9, r3, r15)
            int r9 = androidx.compose.runtime.ComposablesKt.a(r3, r15)
            androidx.compose.runtime.CompositionLocalMap r8 = r3.I()
            androidx.compose.ui.Modifier r6 = androidx.compose.ui.ComposedModifierKt.e(r3, r6)
            androidx.compose.ui.node.ComposeUiNode$Companion r34 = androidx.compose.ui.node.ComposeUiNode.f17222h
            kotlin.jvm.functions.Function0 r10 = r34.a()
            androidx.compose.runtime.Applier r16 = r3.v()
            if (r16 != 0) goto L_0x00c9
            androidx.compose.runtime.ComposablesKt.d()
        L_0x00c9:
            r3.s()
            boolean r16 = r3.n()
            if (r16 == 0) goto L_0x00d6
            r3.y(r10)
            goto L_0x00d9
        L_0x00d6:
            r3.K()
        L_0x00d9:
            androidx.compose.runtime.Composer r10 = androidx.compose.runtime.Updater.b(r3)
            kotlin.jvm.functions.Function2 r0 = r34.c()
            androidx.compose.runtime.Updater.g(r10, r7, r0)
            kotlin.jvm.functions.Function2 r0 = r34.e()
            androidx.compose.runtime.Updater.g(r10, r8, r0)
            kotlin.jvm.functions.Function2 r0 = r34.b()
            boolean r7 = r10.n()
            if (r7 != 0) goto L_0x0103
            java.lang.Object r7 = r10.g()
            java.lang.Integer r8 = java.lang.Integer.valueOf(r9)
            boolean r7 = kotlin.jvm.internal.Intrinsics.d(r7, r8)
            if (r7 != 0) goto L_0x0111
        L_0x0103:
            java.lang.Integer r7 = java.lang.Integer.valueOf(r9)
            r10.N(r7)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r9)
            r10.A(r7, r0)
        L_0x0111:
            kotlin.jvm.functions.Function2 r0 = r34.d()
            androidx.compose.runtime.Updater.g(r10, r6, r0)
            androidx.compose.foundation.layout.ColumnScopeInstance r0 = androidx.compose.foundation.layout.ColumnScopeInstance.f3815a
            r0 = -184740416(0xfffffffff4fd15c0, float:-1.6041165E32)
            r3.X(r0)
            androidx.compose.ui.graphics.Color$Companion r0 = androidx.compose.ui.graphics.Color.f15975b
            long r6 = r0.e()
            boolean r6 = androidx.compose.ui.graphics.Color.n(r11, r6)
            if (r6 != 0) goto L_0x0147
            float r6 = (float) r4
            float r7 = androidx.compose.ui.unit.Dp.m(r6)
            long r8 = r0.g()
            r0 = 432(0x1b0, float:6.05E-43)
            r16 = 1
            r6 = 0
            r10 = 0
            r15 = r10
            r14 = 0
            r10 = r3
            r35 = r11
            r11 = r0
            r12 = r16
            androidx.compose.material3.DividerKt.e(r6, r7, r8, r10, r11, r12)
            goto L_0x014b
        L_0x0147:
            r35 = r11
            r14 = 0
            r15 = 0
        L_0x014b:
            r3.M()
            androidx.compose.ui.Modifier r0 = androidx.compose.foundation.layout.SizeKt.h(r2, r14, r4, r15)
            r6 = 24
            float r6 = (float) r6
            float r6 = androidx.compose.ui.unit.Dp.m(r6)
            androidx.compose.ui.Modifier r0 = androidx.compose.foundation.layout.PaddingKt.k(r0, r6, r14, r13, r15)
            r6 = 12
            float r6 = (float) r6
            float r6 = androidx.compose.ui.unit.Dp.m(r6)
            androidx.compose.ui.Modifier r0 = androidx.compose.foundation.layout.PaddingKt.k(r0, r14, r6, r4, r15)
            androidx.compose.foundation.layout.Arrangement$Horizontal r6 = r32.f()
            androidx.compose.ui.Alignment$Vertical r7 = r33.l()
            r8 = 0
            androidx.compose.ui.layout.MeasurePolicy r6 = androidx.compose.foundation.layout.RowKt.b(r6, r7, r3, r8)
            int r7 = androidx.compose.runtime.ComposablesKt.a(r3, r8)
            androidx.compose.runtime.CompositionLocalMap r8 = r3.I()
            androidx.compose.ui.Modifier r0 = androidx.compose.ui.ComposedModifierKt.e(r3, r0)
            kotlin.jvm.functions.Function0 r9 = r34.a()
            androidx.compose.runtime.Applier r10 = r3.v()
            if (r10 != 0) goto L_0x018e
            androidx.compose.runtime.ComposablesKt.d()
        L_0x018e:
            r3.s()
            boolean r10 = r3.n()
            if (r10 == 0) goto L_0x019b
            r3.y(r9)
            goto L_0x019e
        L_0x019b:
            r3.K()
        L_0x019e:
            androidx.compose.runtime.Composer r9 = androidx.compose.runtime.Updater.b(r3)
            kotlin.jvm.functions.Function2 r10 = r34.c()
            androidx.compose.runtime.Updater.g(r9, r6, r10)
            kotlin.jvm.functions.Function2 r6 = r34.e()
            androidx.compose.runtime.Updater.g(r9, r8, r6)
            kotlin.jvm.functions.Function2 r6 = r34.b()
            boolean r8 = r9.n()
            if (r8 != 0) goto L_0x01c8
            java.lang.Object r8 = r9.g()
            java.lang.Integer r10 = java.lang.Integer.valueOf(r7)
            boolean r8 = kotlin.jvm.internal.Intrinsics.d(r8, r10)
            if (r8 != 0) goto L_0x01d6
        L_0x01c8:
            java.lang.Integer r8 = java.lang.Integer.valueOf(r7)
            r9.N(r8)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r9.A(r7, r6)
        L_0x01d6:
            kotlin.jvm.functions.Function2 r6 = r34.d()
            androidx.compose.runtime.Updater.g(r9, r0, r6)
            androidx.compose.foundation.layout.RowScopeInstance r0 = androidx.compose.foundation.layout.RowScopeInstance.f4150a
            r20 = 2
            r21 = 0
            r18 = 1073741824(0x40000000, float:2.0)
            r19 = 0
            r16 = r0
            r17 = r2
            androidx.compose.ui.Modifier r6 = androidx.compose.foundation.layout.RowScope.c(r16, r17, r18, r19, r20, r21)
            androidx.compose.foundation.layout.Arrangement$Vertical r7 = r32.g()
            androidx.compose.ui.Alignment$Horizontal r8 = r33.k()
            r9 = 0
            androidx.compose.ui.layout.MeasurePolicy r7 = androidx.compose.foundation.layout.ColumnKt.a(r7, r8, r3, r9)
            int r8 = androidx.compose.runtime.ComposablesKt.a(r3, r9)
            androidx.compose.runtime.CompositionLocalMap r9 = r3.I()
            androidx.compose.ui.Modifier r6 = androidx.compose.ui.ComposedModifierKt.e(r3, r6)
            kotlin.jvm.functions.Function0 r10 = r34.a()
            androidx.compose.runtime.Applier r11 = r3.v()
            if (r11 != 0) goto L_0x0215
            androidx.compose.runtime.ComposablesKt.d()
        L_0x0215:
            r3.s()
            boolean r11 = r3.n()
            if (r11 == 0) goto L_0x0222
            r3.y(r10)
            goto L_0x0225
        L_0x0222:
            r3.K()
        L_0x0225:
            androidx.compose.runtime.Composer r10 = androidx.compose.runtime.Updater.b(r3)
            kotlin.jvm.functions.Function2 r11 = r34.c()
            androidx.compose.runtime.Updater.g(r10, r7, r11)
            kotlin.jvm.functions.Function2 r7 = r34.e()
            androidx.compose.runtime.Updater.g(r10, r9, r7)
            kotlin.jvm.functions.Function2 r7 = r34.b()
            boolean r9 = r10.n()
            if (r9 != 0) goto L_0x024f
            java.lang.Object r9 = r10.g()
            java.lang.Integer r11 = java.lang.Integer.valueOf(r8)
            boolean r9 = kotlin.jvm.internal.Intrinsics.d(r9, r11)
            if (r9 != 0) goto L_0x025d
        L_0x024f:
            java.lang.Integer r9 = java.lang.Integer.valueOf(r8)
            r10.N(r9)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r10.A(r8, r7)
        L_0x025d:
            kotlin.jvm.functions.Function2 r7 = r34.d()
            androidx.compose.runtime.Updater.g(r10, r6, r7)
            int r6 = com.hansecom.abt.R.string.Q4
            r13 = 0
            java.lang.String r6 = androidx.compose.ui.res.StringResources_androidKt.b(r6, r3, r13)
            com.hansecom.abt.ui.theme.AbtTheme r11 = com.hansecom.abt.ui.theme.AbtTheme.f38851a
            r7 = 6
            com.hansecom.abt.ui.theme.typography.AbtTypography r8 = r11.d(r3, r7)
            androidx.compose.ui.text.TextStyle r27 = r8.d()
            r30 = 0
            r31 = 131070(0x1fffe, float:1.83668E-40)
            r7 = 0
            r8 = 0
            r10 = 0
            r16 = 0
            r4 = r11
            r11 = r16
            r16 = 0
            r17 = r13
            r13 = r16
            r14 = r16
            r15 = r16
            r16 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r29 = 0
            r28 = r3
            androidx.compose.material3.TextKt.j(r6, r7, r8, r10, r11, r13, r14, r15, r16, r18, r19, r20, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31)
            r6 = 4
            float r15 = (float) r6
            float r6 = androidx.compose.ui.unit.Dp.m(r15)
            androidx.compose.ui.Modifier r6 = androidx.compose.foundation.layout.SizeKt.i(r2, r6)
            r7 = 6
            androidx.compose.foundation.layout.SpacerKt.a(r6, r3, r7)
            com.hansecom.abt.util.formatters.CardNumberValueFormater r6 = com.hansecom.abt.util.formatters.CardNumberValueFormater.f39044a
            java.lang.String r6 = r6.a(r1)
            com.hansecom.abt.ui.theme.typography.AbtTypography r8 = r4.d(r3, r7)
            androidx.compose.ui.text.TextStyle r27 = r8.g()
            java.lang.String r7 = "fare_media_card_number"
            androidx.compose.ui.Modifier r7 = androidx.compose.ui.platform.TestTagKt.a(r2, r7)
            r31 = 131068(0x1fffc, float:1.83665E-40)
            r8 = 0
            r11 = 0
            r13 = 0
            r14 = 0
            r16 = 0
            r37 = r15
            r15 = r16
            r16 = 0
            r29 = 48
            androidx.compose.material3.TextKt.j(r6, r7, r8, r10, r11, r13, r14, r15, r16, r18, r19, r20, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31)
            r3.T()
            r20 = 2
            r21 = 0
            r18 = 1065353216(0x3f800000, float:1.0)
            r19 = 0
            r16 = r0
            r17 = r2
            androidx.compose.ui.Modifier r0 = androidx.compose.foundation.layout.RowScope.c(r16, r17, r18, r19, r20, r21)
            androidx.compose.foundation.layout.Arrangement$Vertical r6 = r32.g()
            androidx.compose.ui.Alignment$Horizontal r7 = r33.k()
            r15 = 0
            androidx.compose.ui.layout.MeasurePolicy r6 = androidx.compose.foundation.layout.ColumnKt.a(r6, r7, r3, r15)
            int r7 = androidx.compose.runtime.ComposablesKt.a(r3, r15)
            androidx.compose.runtime.CompositionLocalMap r8 = r3.I()
            androidx.compose.ui.Modifier r0 = androidx.compose.ui.ComposedModifierKt.e(r3, r0)
            kotlin.jvm.functions.Function0 r9 = r34.a()
            androidx.compose.runtime.Applier r10 = r3.v()
            if (r10 != 0) goto L_0x0318
            androidx.compose.runtime.ComposablesKt.d()
        L_0x0318:
            r3.s()
            boolean r10 = r3.n()
            if (r10 == 0) goto L_0x0325
            r3.y(r9)
            goto L_0x0328
        L_0x0325:
            r3.K()
        L_0x0328:
            androidx.compose.runtime.Composer r9 = androidx.compose.runtime.Updater.b(r3)
            kotlin.jvm.functions.Function2 r10 = r34.c()
            androidx.compose.runtime.Updater.g(r9, r6, r10)
            kotlin.jvm.functions.Function2 r6 = r34.e()
            androidx.compose.runtime.Updater.g(r9, r8, r6)
            kotlin.jvm.functions.Function2 r6 = r34.b()
            boolean r8 = r9.n()
            if (r8 != 0) goto L_0x0352
            java.lang.Object r8 = r9.g()
            java.lang.Integer r10 = java.lang.Integer.valueOf(r7)
            boolean r8 = kotlin.jvm.internal.Intrinsics.d(r8, r10)
            if (r8 != 0) goto L_0x0360
        L_0x0352:
            java.lang.Integer r8 = java.lang.Integer.valueOf(r7)
            r9.N(r8)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r9.A(r7, r6)
        L_0x0360:
            kotlin.jvm.functions.Function2 r6 = r34.d()
            androidx.compose.runtime.Updater.g(r9, r0, r6)
            r0 = 1
            r13 = 0
            r14 = 0
            androidx.compose.ui.Modifier r7 = androidx.compose.foundation.layout.SizeKt.h(r2, r14, r0, r13)
            int r0 = com.hansecom.abt.R.string.R4
            java.lang.String r6 = androidx.compose.ui.res.StringResources_androidKt.b(r0, r3, r15)
            r0 = 6
            com.hansecom.abt.ui.theme.typography.AbtTypography r8 = r4.d(r3, r0)
            androidx.compose.ui.text.TextStyle r27 = r8.d()
            androidx.compose.ui.text.style.TextAlign$Companion r0 = androidx.compose.ui.text.style.TextAlign.f19080b
            int r8 = r0.b()
            androidx.compose.ui.text.style.TextAlign r19 = androidx.compose.ui.text.style.TextAlign.h(r8)
            r30 = 0
            r31 = 130044(0x1fbfc, float:1.8223E-40)
            r8 = 0
            r10 = 0
            r11 = 0
            r16 = 0
            r13 = r16
            r14 = r16
            r15 = r16
            r16 = 0
            r18 = 0
            r20 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r29 = 48
            r28 = r3
            androidx.compose.material3.TextKt.j(r6, r7, r8, r10, r11, r13, r14, r15, r16, r18, r19, r20, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31)
            float r6 = androidx.compose.ui.unit.Dp.m(r37)
            androidx.compose.ui.Modifier r6 = androidx.compose.foundation.layout.SizeKt.i(r2, r6)
            r7 = 6
            androidx.compose.foundation.layout.SpacerKt.a(r6, r3, r7)
            r6 = 1
            r8 = 0
            r9 = 0
            androidx.compose.ui.Modifier r2 = androidx.compose.foundation.layout.SizeKt.h(r2, r8, r6, r9)
            r6 = -269858104(0xffffffffefea4ac8, float:-1.4501979E29)
            r3.X(r6)
            int r6 = r39.length()
            if (r6 != 0) goto L_0x03d7
            int r6 = com.hansecom.abt.R.string.S4
            r8 = 0
            java.lang.String r6 = androidx.compose.ui.res.StringResources_androidKt.b(r6, r3, r8)
            goto L_0x03d9
        L_0x03d7:
            r6 = r39
        L_0x03d9:
            r3.M()
            com.hansecom.abt.ui.theme.typography.AbtTypography r4 = r4.d(r3, r7)
            androidx.compose.ui.text.TextStyle r27 = r4.g()
            int r0 = r0.b()
            androidx.compose.ui.text.style.TextAlign r19 = androidx.compose.ui.text.style.TextAlign.h(r0)
            r30 = 0
            r31 = 130044(0x1fbfc, float:1.8223E-40)
            r8 = 0
            r10 = 0
            r11 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r18 = 0
            r20 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r29 = 48
            r7 = r2
            r28 = r3
            androidx.compose.material3.TextKt.j(r6, r7, r8, r10, r11, r13, r14, r15, r16, r18, r19, r20, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31)
            r3.T()
            r3.T()
            r3.T()
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x0423
            androidx.compose.runtime.ComposerKt.X()
        L_0x0423:
            androidx.compose.runtime.ScopeUpdateScope r7 = r3.x()
            if (r7 == 0) goto L_0x043c
            com.hansecom.abt.ui.components.fareMediaCard.d r8 = new com.hansecom.abt.ui.components.fareMediaCard.d
            r0 = r8
            r1 = r38
            r2 = r39
            r3 = r35
            r5 = r43
            r6 = r44
            r0.<init>(r1, r2, r3, r5, r6)
            r7.a(r8)
        L_0x043c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.ui.components.fareMediaCard.FareMediaCardKt.c(java.lang.String, java.lang.String, long, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final Unit d(String str, String str2, long j2, int i2, int i3, Composer composer, int i4) {
        c(str, str2, j2, composer, RecomposeScopeImplKt.a(i2 | 1), i3);
        return Unit.f40552a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:105:0x0139  */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x014f  */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x0169  */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x0176  */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x0237  */
    /* JADX WARNING: Removed duplicated region for block: B:154:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x00fa  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0101  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x011c  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x0122  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void e(java.lang.String r24, java.lang.String r25, java.lang.String r26, com.hansecom.abt.util.resourcesResolvers.StringValue r27, boolean r28, boolean r29, boolean r30, androidx.compose.ui.Modifier r31, long r32, com.hansecom.abt.util.resourcesResolvers.StringValue r34, com.hansecom.abt.ui.components.fareMediaCard.FareMediaCardTransferStyle r35, androidx.compose.runtime.Composer r36, int r37, int r38, int r39) {
        /*
            r12 = r24
            r13 = r25
            r14 = r26
            r15 = r27
            r11 = r37
            r10 = r39
            java.lang.String r0 = "cardBalance"
            kotlin.jvm.internal.Intrinsics.i(r12, r0)
            java.lang.String r0 = "cardNumber"
            kotlin.jvm.internal.Intrinsics.i(r13, r0)
            java.lang.String r0 = "riderType"
            kotlin.jvm.internal.Intrinsics.i(r14, r0)
            java.lang.String r0 = "autoloadLabel"
            kotlin.jvm.internal.Intrinsics.i(r15, r0)
            r0 = 436331523(0x1a01e403, float:2.686076E-23)
            r1 = r36
            androidx.compose.runtime.Composer r8 = r1.q(r0)
            r1 = r10 & 1
            if (r1 == 0) goto L_0x0030
            r1 = r11 | 6
            goto L_0x0040
        L_0x0030:
            r1 = r11 & 6
            if (r1 != 0) goto L_0x003f
            boolean r1 = r8.W(r12)
            if (r1 == 0) goto L_0x003c
            r1 = 4
            goto L_0x003d
        L_0x003c:
            r1 = 2
        L_0x003d:
            r1 = r1 | r11
            goto L_0x0040
        L_0x003f:
            r1 = r11
        L_0x0040:
            r4 = r10 & 2
            if (r4 == 0) goto L_0x0047
            r1 = r1 | 48
            goto L_0x0057
        L_0x0047:
            r4 = r11 & 48
            if (r4 != 0) goto L_0x0057
            boolean r4 = r8.W(r13)
            if (r4 == 0) goto L_0x0054
            r4 = 32
            goto L_0x0056
        L_0x0054:
            r4 = 16
        L_0x0056:
            r1 = r1 | r4
        L_0x0057:
            r4 = r10 & 4
            if (r4 == 0) goto L_0x005e
            r1 = r1 | 384(0x180, float:5.38E-43)
            goto L_0x006e
        L_0x005e:
            r4 = r11 & 384(0x180, float:5.38E-43)
            if (r4 != 0) goto L_0x006e
            boolean r4 = r8.W(r14)
            if (r4 == 0) goto L_0x006b
            r4 = 256(0x100, float:3.59E-43)
            goto L_0x006d
        L_0x006b:
            r4 = 128(0x80, float:1.794E-43)
        L_0x006d:
            r1 = r1 | r4
        L_0x006e:
            r4 = r10 & 8
            if (r4 == 0) goto L_0x0075
            r1 = r1 | 3072(0xc00, float:4.305E-42)
            goto L_0x0085
        L_0x0075:
            r4 = r11 & 3072(0xc00, float:4.305E-42)
            if (r4 != 0) goto L_0x0085
            boolean r4 = r8.W(r15)
            if (r4 == 0) goto L_0x0082
            r4 = 2048(0x800, float:2.87E-42)
            goto L_0x0084
        L_0x0082:
            r4 = 1024(0x400, float:1.435E-42)
        L_0x0084:
            r1 = r1 | r4
        L_0x0085:
            r4 = r10 & 16
            if (r4 == 0) goto L_0x008e
            r1 = r1 | 24576(0x6000, float:3.4438E-41)
            r9 = r28
            goto L_0x00a0
        L_0x008e:
            r4 = r11 & 24576(0x6000, float:3.4438E-41)
            r9 = r28
            if (r4 != 0) goto L_0x00a0
            boolean r4 = r8.d(r9)
            if (r4 == 0) goto L_0x009d
            r4 = 16384(0x4000, float:2.2959E-41)
            goto L_0x009f
        L_0x009d:
            r4 = 8192(0x2000, float:1.14794E-41)
        L_0x009f:
            r1 = r1 | r4
        L_0x00a0:
            r4 = r10 & 32
            r5 = 196608(0x30000, float:2.75506E-40)
            if (r4 == 0) goto L_0x00aa
            r1 = r1 | r5
            r7 = r29
            goto L_0x00bc
        L_0x00aa:
            r4 = r11 & r5
            r7 = r29
            if (r4 != 0) goto L_0x00bc
            boolean r4 = r8.d(r7)
            if (r4 == 0) goto L_0x00b9
            r4 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00bb
        L_0x00b9:
            r4 = 65536(0x10000, float:9.18355E-41)
        L_0x00bb:
            r1 = r1 | r4
        L_0x00bc:
            r4 = r10 & 64
            r5 = 1572864(0x180000, float:2.204052E-39)
            if (r4 == 0) goto L_0x00c6
            r1 = r1 | r5
            r6 = r30
            goto L_0x00d8
        L_0x00c6:
            r4 = r11 & r5
            r6 = r30
            if (r4 != 0) goto L_0x00d8
            boolean r4 = r8.d(r6)
            if (r4 == 0) goto L_0x00d5
            r4 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00d7
        L_0x00d5:
            r4 = 524288(0x80000, float:7.34684E-40)
        L_0x00d7:
            r1 = r1 | r4
        L_0x00d8:
            r4 = r10 & 128(0x80, float:1.794E-43)
            r5 = 12582912(0xc00000, float:1.7632415E-38)
            if (r4 == 0) goto L_0x00e2
            r1 = r1 | r5
        L_0x00df:
            r5 = r31
            goto L_0x00f4
        L_0x00e2:
            r5 = r5 & r11
            if (r5 != 0) goto L_0x00df
            r5 = r31
            boolean r16 = r8.W(r5)
            if (r16 == 0) goto L_0x00f0
            r16 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00f2
        L_0x00f0:
            r16 = 4194304(0x400000, float:5.877472E-39)
        L_0x00f2:
            r1 = r1 | r16
        L_0x00f4:
            r2 = r10 & 256(0x100, float:3.59E-43)
            r16 = 100663296(0x6000000, float:2.4074124E-35)
            if (r2 == 0) goto L_0x0101
            r1 = r1 | r16
            r17 = r4
            r3 = r32
            goto L_0x0116
        L_0x0101:
            r16 = r11 & r16
            r17 = r4
            r3 = r32
            if (r16 != 0) goto L_0x0116
            boolean r18 = r8.j(r3)
            if (r18 == 0) goto L_0x0112
            r18 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x0114
        L_0x0112:
            r18 = 33554432(0x2000000, float:9.403955E-38)
        L_0x0114:
            r1 = r1 | r18
        L_0x0116:
            r0 = r10 & 512(0x200, float:7.175E-43)
            r19 = 805306368(0x30000000, float:4.656613E-10)
            if (r0 == 0) goto L_0x0122
            r1 = r1 | r19
            r3 = r34
        L_0x0120:
            r4 = r1
            goto L_0x0135
        L_0x0122:
            r19 = r11 & r19
            r3 = r34
            if (r19 != 0) goto L_0x0120
            boolean r4 = r8.W(r3)
            if (r4 == 0) goto L_0x0131
            r4 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x0133
        L_0x0131:
            r4 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x0133:
            r1 = r1 | r4
            goto L_0x0120
        L_0x0135:
            r1 = r38 & 6
            if (r1 != 0) goto L_0x014f
            r1 = r10 & 1024(0x400, float:1.435E-42)
            if (r1 != 0) goto L_0x0148
            r1 = r35
            boolean r19 = r8.W(r1)
            if (r19 == 0) goto L_0x014a
            r19 = 4
            goto L_0x014c
        L_0x0148:
            r1 = r35
        L_0x014a:
            r19 = 2
        L_0x014c:
            r19 = r38 | r19
            goto L_0x0153
        L_0x014f:
            r1 = r35
            r19 = r38
        L_0x0153:
            r20 = 306783379(0x12492493, float:6.34695E-28)
            r1 = r4 & r20
            r3 = 306783378(0x12492492, float:6.3469493E-28)
            if (r1 != r3) goto L_0x0176
            r1 = r19 & 3
            r3 = 2
            if (r1 != r3) goto L_0x0176
            boolean r1 = r8.t()
            if (r1 != 0) goto L_0x0169
            goto L_0x0176
        L_0x0169:
            r8.B()
            r9 = r32
            r11 = r34
            r12 = r35
            r13 = r8
            r8 = r5
            goto L_0x0231
        L_0x0176:
            r8.p()
            r1 = r11 & 1
            if (r1 == 0) goto L_0x0198
            boolean r1 = r8.J()
            if (r1 == 0) goto L_0x0184
            goto L_0x0198
        L_0x0184:
            r8.B()
            r0 = r10 & 1024(0x400, float:1.435E-42)
            if (r0 == 0) goto L_0x018d
            r19 = r19 & -15
        L_0x018d:
            r17 = r34
            r21 = r35
            r16 = r5
            r0 = r19
            r19 = r32
            goto L_0x01d0
        L_0x0198:
            if (r17 == 0) goto L_0x019d
            androidx.compose.ui.Modifier$Companion r1 = androidx.compose.ui.Modifier.f15489d
            goto L_0x019e
        L_0x019d:
            r1 = r5
        L_0x019e:
            if (r2 == 0) goto L_0x01a7
            androidx.compose.ui.graphics.Color$Companion r2 = androidx.compose.ui.graphics.Color.f15975b
            long r2 = r2.e()
            goto L_0x01a9
        L_0x01a7:
            r2 = r32
        L_0x01a9:
            if (r0 == 0) goto L_0x01ad
            r0 = 0
            goto L_0x01af
        L_0x01ad:
            r0 = r34
        L_0x01af:
            r5 = r10 & 1024(0x400, float:1.435E-42)
            if (r5 == 0) goto L_0x01c9
            com.hansecom.abt.ui.components.fareMediaCard.FareMediaCardTransferStyles r5 = com.hansecom.abt.ui.components.fareMediaCard.FareMediaCardTransferStyles.f38210a
            r31 = r0
            r0 = 6
            com.hansecom.abt.ui.components.fareMediaCard.FareMediaCardTransferStyle r0 = r5.a(r8, r0)
            r19 = r19 & -15
            r17 = r31
            r21 = r0
        L_0x01c2:
            r16 = r1
            r0 = r19
            r19 = r2
            goto L_0x01d0
        L_0x01c9:
            r31 = r0
            r17 = r31
            r21 = r35
            goto L_0x01c2
        L_0x01d0:
            r8.U()
            boolean r1 = androidx.compose.runtime.ComposerKt.P()
            if (r1 == 0) goto L_0x01e1
            java.lang.String r1 = "com.hansecom.abt.ui.components.fareMediaCard.FareMediaCard (FareMediaCard.kt:62)"
            r2 = 436331523(0x1a01e403, float:2.686076E-23)
            androidx.compose.runtime.ComposerKt.Y(r2, r4, r0, r1)
        L_0x01e1:
            com.hansecom.abt.ui.components.fareMediaCard.FareMediaCardKt$FareMediaCard$1 r5 = new com.hansecom.abt.ui.components.fareMediaCard.FareMediaCardKt$FareMediaCard$1
            r0 = r5
            r1 = r28
            r2 = r21
            r3 = r17
            r18 = r4
            r4 = r29
            r12 = r5
            r5 = r30
            r6 = r25
            r7 = r26
            r13 = r8
            r8 = r19
            r10 = r24
            r11 = r27
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r10, r11)
            r0 = 54
            r1 = -1860014647(0xffffffff91226dc9, float:-1.2813377E-28)
            r2 = 1
            androidx.compose.runtime.internal.ComposableLambda r0 = androidx.compose.runtime.internal.ComposableLambdaKt.e(r1, r2, r12, r13, r0)
            int r1 = r18 >> 21
            r1 = r1 & 14
            r1 = r1 | 384(0x180, float:5.38E-43)
            r2 = 2
            r3 = 0
            r31 = r16
            r32 = r3
            r33 = r0
            r34 = r13
            r35 = r1
            r36 = r2
            com.hansecom.abt.ui.components.fareMediaCard.FareMediaCardBaseKt.c(r31, r32, r33, r34, r35, r36)
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x0229
            androidx.compose.runtime.ComposerKt.X()
        L_0x0229:
            r8 = r16
            r11 = r17
            r9 = r19
            r12 = r21
        L_0x0231:
            androidx.compose.runtime.ScopeUpdateScope r13 = r13.x()
            if (r13 == 0) goto L_0x025e
            com.hansecom.abt.ui.components.fareMediaCard.c r7 = new com.hansecom.abt.ui.components.fareMediaCard.c
            r0 = r7
            r1 = r24
            r2 = r25
            r3 = r26
            r4 = r27
            r5 = r28
            r6 = r29
            r15 = r7
            r7 = r30
            r14 = r13
            r13 = r37
            r22 = r14
            r14 = r38
            r23 = r15
            r15 = r39
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r11, r12, r13, r14, r15)
            r0 = r22
            r1 = r23
            r0.a(r1)
        L_0x025e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.ui.components.fareMediaCard.FareMediaCardKt.e(java.lang.String, java.lang.String, java.lang.String, com.hansecom.abt.util.resourcesResolvers.StringValue, boolean, boolean, boolean, androidx.compose.ui.Modifier, long, com.hansecom.abt.util.resourcesResolvers.StringValue, com.hansecom.abt.ui.components.fareMediaCard.FareMediaCardTransferStyle, androidx.compose.runtime.Composer, int, int, int):void");
    }

    public static final Unit f(String str, String str2, String str3, StringValue stringValue, boolean z2, boolean z3, boolean z4, Modifier modifier, long j2, StringValue stringValue2, FareMediaCardTransferStyle fareMediaCardTransferStyle, int i2, int i3, int i4, Composer composer, int i5) {
        e(str, str2, str3, stringValue, z2, z3, z4, modifier, j2, stringValue2, fareMediaCardTransferStyle, composer, RecomposeScopeImplKt.a(i2 | 1), RecomposeScopeImplKt.a(i3), i4);
        return Unit.f40552a;
    }
}
