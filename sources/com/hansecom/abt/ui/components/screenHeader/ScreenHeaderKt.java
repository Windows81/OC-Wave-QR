package com.hansecom.abt.ui.components.screenHeader;

import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.Unit;

@Metadata
public final class ScreenHeaderKt {
    /* JADX WARNING: type inference failed for: r46v0, types: [java.lang.CharSequence] */
    /* JADX WARNING: Removed duplicated region for block: B:158:0x035f  */
    /* JADX WARNING: Removed duplicated region for block: B:160:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x007d  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00a1  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00a6  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00bf  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00c4  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x00e8  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x00f7  */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void b(androidx.compose.ui.Modifier r39, androidx.compose.foundation.layout.PaddingValues r40, long r41, long r43, java.lang.String r45, java.lang.CharSequence r46, boolean r47, androidx.compose.runtime.Composer r48, int r49, int r50) {
        /*
            r10 = r49
            r0 = 32
            r1 = 16
            r2 = 2
            r3 = 6
            r4 = 4
            r5 = 1386078453(0x529de0f5, float:3.39042009E11)
            r6 = r48
            androidx.compose.runtime.Composer r6 = r6.q(r5)
            r7 = 1
            r8 = r50 & 1
            if (r8 == 0) goto L_0x001d
            r9 = r10 | 6
            r11 = r9
            r9 = r39
            goto L_0x0031
        L_0x001d:
            r9 = r10 & 6
            if (r9 != 0) goto L_0x002e
            r9 = r39
            boolean r11 = r6.W(r9)
            if (r11 == 0) goto L_0x002b
            r11 = r4
            goto L_0x002c
        L_0x002b:
            r11 = r2
        L_0x002c:
            r11 = r11 | r10
            goto L_0x0031
        L_0x002e:
            r9 = r39
            r11 = r10
        L_0x0031:
            r2 = r50 & 2
            if (r2 == 0) goto L_0x003a
            r11 = r11 | 48
        L_0x0037:
            r12 = r40
            goto L_0x004a
        L_0x003a:
            r12 = r10 & 48
            if (r12 != 0) goto L_0x0037
            r12 = r40
            boolean r13 = r6.W(r12)
            if (r13 == 0) goto L_0x0048
            r13 = r0
            goto L_0x0049
        L_0x0048:
            r13 = r1
        L_0x0049:
            r11 = r11 | r13
        L_0x004a:
            r13 = r10 & 384(0x180, float:5.38E-43)
            if (r13 != 0) goto L_0x0063
            r13 = r50 & 4
            if (r13 != 0) goto L_0x005d
            r13 = r41
            boolean r15 = r6.j(r13)
            if (r15 == 0) goto L_0x005f
            r15 = 256(0x100, float:3.59E-43)
            goto L_0x0061
        L_0x005d:
            r13 = r41
        L_0x005f:
            r15 = 128(0x80, float:1.794E-43)
        L_0x0061:
            r11 = r11 | r15
            goto L_0x0065
        L_0x0063:
            r13 = r41
        L_0x0065:
            r15 = r10 & 3072(0xc00, float:4.305E-42)
            if (r15 != 0) goto L_0x007d
            r15 = r50 & 8
            r3 = r43
            if (r15 != 0) goto L_0x0078
            boolean r16 = r6.j(r3)
            if (r16 == 0) goto L_0x0078
            r16 = 2048(0x800, float:2.87E-42)
            goto L_0x007a
        L_0x0078:
            r16 = 1024(0x400, float:1.435E-42)
        L_0x007a:
            r11 = r11 | r16
            goto L_0x007f
        L_0x007d:
            r3 = r43
        L_0x007f:
            r16 = r50 & 16
            if (r16 == 0) goto L_0x0088
            r11 = r11 | 24576(0x6000, float:3.4438E-41)
        L_0x0085:
            r15 = r45
            goto L_0x009b
        L_0x0088:
            r15 = r10 & 24576(0x6000, float:3.4438E-41)
            if (r15 != 0) goto L_0x0085
            r15 = r45
            boolean r17 = r6.W(r15)
            if (r17 == 0) goto L_0x0097
            r17 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0099
        L_0x0097:
            r17 = 8192(0x2000, float:1.14794E-41)
        L_0x0099:
            r11 = r11 | r17
        L_0x009b:
            r17 = r50 & 32
            r18 = 196608(0x30000, float:2.75506E-40)
            if (r17 == 0) goto L_0x00a6
            r11 = r11 | r18
            r1 = r46
            goto L_0x00b9
        L_0x00a6:
            r18 = r10 & r18
            r1 = r46
            if (r18 != 0) goto L_0x00b9
            boolean r18 = r6.l(r1)
            if (r18 == 0) goto L_0x00b5
            r18 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00b7
        L_0x00b5:
            r18 = 65536(0x10000, float:9.18355E-41)
        L_0x00b7:
            r11 = r11 | r18
        L_0x00b9:
            r18 = r50 & 64
            r19 = 1572864(0x180000, float:2.204052E-39)
            if (r18 == 0) goto L_0x00c4
            r11 = r11 | r19
            r5 = r47
            goto L_0x00d7
        L_0x00c4:
            r19 = r10 & r19
            r5 = r47
            if (r19 != 0) goto L_0x00d7
            boolean r20 = r6.d(r5)
            if (r20 == 0) goto L_0x00d3
            r20 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00d5
        L_0x00d3:
            r20 = 524288(0x80000, float:7.34684E-40)
        L_0x00d5:
            r11 = r11 | r20
        L_0x00d7:
            r20 = 599187(0x92493, float:8.3964E-40)
            r0 = r11 & r20
            r7 = 599186(0x92492, float:8.39638E-40)
            if (r0 != r7) goto L_0x00f7
            boolean r0 = r6.t()
            if (r0 != 0) goto L_0x00e8
            goto L_0x00f7
        L_0x00e8:
            r6.B()
            r7 = r3
            r37 = r5
            r2 = r12
            r3 = r13
            r38 = r9
            r9 = r1
            r1 = r38
            goto L_0x0359
        L_0x00f7:
            r6.p()
            r0 = 1
            r7 = r10 & 1
            r0 = 0
            if (r7 == 0) goto L_0x0122
            boolean r7 = r6.J()
            if (r7 == 0) goto L_0x0107
            goto L_0x0122
        L_0x0107:
            r6.B()
            r2 = 4
            r2 = r50 & 4
            if (r2 == 0) goto L_0x0111
            r11 = r11 & -897(0xfffffffffffffc7f, float:NaN)
        L_0x0111:
            r2 = r50 & 8
            if (r2 == 0) goto L_0x0117
            r11 = r11 & -7169(0xffffffffffffe3ff, float:NaN)
        L_0x0117:
            r37 = r5
            r7 = r9
            r8 = r15
            r9 = r1
            r4 = r3
            r1 = r12
        L_0x011e:
            r2 = r13
            r13 = r11
            goto L_0x0183
        L_0x0122:
            if (r8 == 0) goto L_0x0127
            androidx.compose.ui.Modifier$Companion r7 = androidx.compose.ui.Modifier.f15489d
            goto L_0x0128
        L_0x0127:
            r7 = r9
        L_0x0128:
            if (r2 == 0) goto L_0x0144
            com.hansecom.abt.ui.theme.Dimensions r2 = com.hansecom.abt.ui.theme.Dimensions.f38856a
            float r23 = r2.d()
            r2 = 32
            float r2 = (float) r2
            float r25 = androidx.compose.ui.unit.Dp.m(r2)
            r26 = 5
            r27 = 0
            r22 = 0
            r24 = 0
            androidx.compose.foundation.layout.PaddingValues r2 = androidx.compose.foundation.layout.PaddingKt.e(r22, r23, r24, r25, r26, r27)
            r12 = r2
        L_0x0144:
            r2 = 4
            r2 = r50 & 4
            if (r2 == 0) goto L_0x0157
            com.hansecom.abt.ui.theme.AbtTheme r2 = com.hansecom.abt.ui.theme.AbtTheme.f38851a
            r8 = 6
            com.hansecom.abt.ui.theme.colorScheme.AbtColorScheme r2 = r2.b(r6, r8)
            long r13 = r2.q()
            r11 = r11 & -897(0xfffffffffffffc7f, float:NaN)
            goto L_0x0158
        L_0x0157:
            r8 = 6
        L_0x0158:
            r2 = r50 & 8
            if (r2 == 0) goto L_0x016a
            com.hansecom.abt.ui.theme.AbtTheme r2 = com.hansecom.abt.ui.theme.AbtTheme.f38851a
            com.hansecom.abt.ui.theme.colorScheme.AbtColorScheme r2 = r2.b(r6, r8)
            long r2 = r2.q()
            r4 = r11 & -7169(0xffffffffffffe3ff, float:NaN)
            r11 = r4
            goto L_0x016b
        L_0x016a:
            r2 = r3
        L_0x016b:
            java.lang.String r4 = ""
            if (r16 == 0) goto L_0x0171
            r8 = r4
            goto L_0x0173
        L_0x0171:
            r8 = r45
        L_0x0173:
            if (r17 == 0) goto L_0x0176
            goto L_0x0177
        L_0x0176:
            r4 = r1
        L_0x0177:
            if (r18 == 0) goto L_0x017f
            r37 = r0
            r9 = r4
        L_0x017c:
            r1 = r12
            r4 = r2
            goto L_0x011e
        L_0x017f:
            r9 = r4
            r37 = r5
            goto L_0x017c
        L_0x0183:
            r6.U()
            boolean r11 = androidx.compose.runtime.ComposerKt.P()
            if (r11 == 0) goto L_0x0195
            r11 = -1
            java.lang.String r12 = "com.hansecom.abt.ui.components.screenHeader.ScreenHeader (ScreenHeader.kt:32)"
            r14 = 1386078453(0x529de0f5, float:3.39042009E11)
            androidx.compose.runtime.ComposerKt.Y(r14, r13, r11, r12)
        L_0x0195:
            boolean r11 = kotlin.text.StringsKt.l0(r8)
            if (r11 == 0) goto L_0x01be
            boolean r11 = kotlin.text.StringsKt.l0(r9)
            if (r11 != 0) goto L_0x01a2
            goto L_0x01be
        L_0x01a2:
            r11 = -671495890(0xffffffffd7f9c92e, float:-5.49284911E14)
            r6.X(r11)
            androidx.compose.ui.Modifier$Companion r11 = androidx.compose.ui.Modifier.f15489d
            float r12 = r1.d()
            androidx.compose.ui.Modifier r11 = androidx.compose.foundation.layout.SizeKt.i(r11, r12)
            androidx.compose.foundation.layout.SpacerKt.a(r11, r6, r0)
            r6.M()
            r39 = r1
            r40 = r7
            goto L_0x0349
        L_0x01be:
            r11 = -672568800(0xffffffffd7e96a20, float:-5.13284025E14)
            r6.X(r11)
            androidx.compose.ui.Modifier r11 = androidx.compose.foundation.layout.PaddingKt.h(r7, r1)
            r12 = 0
            r14 = 0
            r15 = 1
            androidx.compose.ui.Modifier r11 = androidx.compose.foundation.layout.SizeKt.h(r11, r12, r15, r14)
            androidx.compose.foundation.layout.Arrangement r12 = androidx.compose.foundation.layout.Arrangement.f3739a
            androidx.compose.foundation.layout.Arrangement$HorizontalOrVertical r12 = r12.b()
            androidx.compose.ui.Alignment$Companion r14 = androidx.compose.ui.Alignment.f15444a
            androidx.compose.ui.Alignment$Horizontal r14 = r14.g()
            r15 = 54
            androidx.compose.ui.layout.MeasurePolicy r12 = androidx.compose.foundation.layout.ColumnKt.a(r12, r14, r6, r15)
            int r0 = androidx.compose.runtime.ComposablesKt.a(r6, r0)
            androidx.compose.runtime.CompositionLocalMap r14 = r6.I()
            androidx.compose.ui.Modifier r11 = androidx.compose.ui.ComposedModifierKt.e(r6, r11)
            androidx.compose.ui.node.ComposeUiNode$Companion r15 = androidx.compose.ui.node.ComposeUiNode.f17222h
            r39 = r1
            kotlin.jvm.functions.Function0 r1 = r15.a()
            androidx.compose.runtime.Applier r16 = r6.v()
            if (r16 != 0) goto L_0x01fe
            androidx.compose.runtime.ComposablesKt.d()
        L_0x01fe:
            r6.s()
            boolean r16 = r6.n()
            if (r16 == 0) goto L_0x020b
            r6.y(r1)
            goto L_0x020e
        L_0x020b:
            r6.K()
        L_0x020e:
            androidx.compose.runtime.Composer r1 = androidx.compose.runtime.Updater.b(r6)
            r40 = r7
            kotlin.jvm.functions.Function2 r7 = r15.c()
            androidx.compose.runtime.Updater.g(r1, r12, r7)
            kotlin.jvm.functions.Function2 r7 = r15.e()
            androidx.compose.runtime.Updater.g(r1, r14, r7)
            kotlin.jvm.functions.Function2 r7 = r15.b()
            boolean r12 = r1.n()
            if (r12 != 0) goto L_0x023a
            java.lang.Object r12 = r1.g()
            java.lang.Integer r14 = java.lang.Integer.valueOf(r0)
            boolean r12 = kotlin.jvm.internal.Intrinsics.d(r12, r14)
            if (r12 != 0) goto L_0x0248
        L_0x023a:
            java.lang.Integer r12 = java.lang.Integer.valueOf(r0)
            r1.N(r12)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.A(r0, r7)
        L_0x0248:
            kotlin.jvm.functions.Function2 r0 = r15.d()
            androidx.compose.runtime.Updater.g(r1, r11, r0)
            androidx.compose.foundation.layout.ColumnScopeInstance r0 = androidx.compose.foundation.layout.ColumnScopeInstance.f3815a
            r0 = -404548408(0xffffffffe7e314c8, float:-2.1447211E24)
            r6.X(r0)
            boolean r0 = kotlin.text.StringsKt.l0(r8)
            if (r0 != 0) goto L_0x02c5
            if (r37 == 0) goto L_0x0276
            r0 = 344063403(0x1481fdab, float:1.3125726E-26)
            r6.X(r0)
            com.hansecom.abt.ui.theme.AbtTheme r0 = com.hansecom.abt.ui.theme.AbtTheme.f38851a
            r1 = 6
            com.hansecom.abt.ui.theme.typography.AbtTypography r0 = r0.d(r6, r1)
            androidx.compose.ui.text.TextStyle r0 = r0.k()
            r6.M()
        L_0x0273:
            r32 = r0
            goto L_0x028b
        L_0x0276:
            r1 = 6
            r0 = 344142763(0x148333ab, float:1.3247999E-26)
            r6.X(r0)
            com.hansecom.abt.ui.theme.AbtTheme r0 = com.hansecom.abt.ui.theme.AbtTheme.f38851a
            com.hansecom.abt.ui.theme.typography.AbtTypography r0 = r0.d(r6, r1)
            androidx.compose.ui.text.TextStyle r0 = r0.l()
            r6.M()
            goto L_0x0273
        L_0x028b:
            androidx.compose.ui.text.style.TextAlign$Companion r0 = androidx.compose.ui.text.style.TextAlign.f19080b
            int r0 = r0.a()
            androidx.compose.ui.text.style.TextAlign r24 = androidx.compose.ui.text.style.TextAlign.h(r0)
            int r0 = r13 >> 12
            r0 = r0 & 14
            r1 = r13 & 896(0x380, float:1.256E-42)
            r34 = r0 | r1
            r35 = 0
            r36 = 130042(0x1fbfa, float:1.82228E-40)
            r12 = 0
            r15 = 0
            r16 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r23 = 0
            r25 = 0
            r27 = 0
            r28 = 0
            r29 = 0
            r30 = 0
            r31 = 0
            r11 = r8
            r0 = r13
            r13 = r2
            r33 = r6
            androidx.compose.material3.TextKt.j(r11, r12, r13, r15, r16, r18, r19, r20, r21, r23, r24, r25, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36)
            goto L_0x02c6
        L_0x02c5:
            r0 = r13
        L_0x02c6:
            r6.M()
            r1 = -404535127(0xffffffffe7e348a9, float:-2.146635E24)
            r6.X(r1)
            boolean r1 = kotlin.text.StringsKt.l0(r8)
            if (r1 != 0) goto L_0x02ed
            boolean r1 = kotlin.text.StringsKt.l0(r9)
            if (r1 != 0) goto L_0x02ed
            androidx.compose.ui.Modifier$Companion r1 = androidx.compose.ui.Modifier.f15489d
            r7 = 16
            float r7 = (float) r7
            float r7 = androidx.compose.ui.unit.Dp.m(r7)
            androidx.compose.ui.Modifier r1 = androidx.compose.foundation.layout.SizeKt.i(r1, r7)
            r7 = 6
            androidx.compose.foundation.layout.SpacerKt.a(r1, r6, r7)
            goto L_0x02ee
        L_0x02ed:
            r7 = 6
        L_0x02ee:
            r6.M()
            r1 = -404530595(0xffffffffe7e35a5d, float:-2.1472882E24)
            r6.X(r1)
            boolean r1 = kotlin.text.StringsKt.l0(r9)
            if (r1 != 0) goto L_0x0340
            com.hansecom.abt.ui.theme.AbtTheme r1 = com.hansecom.abt.ui.theme.AbtTheme.f38851a
            com.hansecom.abt.ui.theme.typography.AbtTypography r1 = r1.d(r6, r7)
            androidx.compose.ui.text.TextStyle r31 = r1.b()
            androidx.compose.ui.text.style.TextAlign$Companion r1 = androidx.compose.ui.text.style.TextAlign.f19080b
            int r1 = r1.a()
            androidx.compose.ui.text.style.TextAlign r23 = androidx.compose.ui.text.style.TextAlign.h(r1)
            int r1 = r0 >> 15
            r1 = r1 & 14
            int r0 = r0 >> 3
            r0 = r0 & 896(0x380, float:1.256E-42)
            r33 = r1 | r0
            r34 = 0
            r35 = 65018(0xfdfa, float:9.111E-41)
            r12 = 0
            r15 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r22 = 0
            r24 = 0
            r26 = 0
            r27 = 0
            r28 = 0
            r29 = 0
            r30 = 0
            r11 = r9
            r13 = r4
            r32 = r6
            com.hansecom.abt.ui.components.AbtTextKt.c(r11, r12, r13, r15, r17, r18, r19, r20, r22, r23, r24, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35)
        L_0x0340:
            r6.M()
            r6.T()
            r6.M()
        L_0x0349:
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x0352
            androidx.compose.runtime.ComposerKt.X()
        L_0x0352:
            r1 = r40
            r15 = r8
            r7 = r4
            r3 = r2
            r2 = r39
        L_0x0359:
            androidx.compose.runtime.ScopeUpdateScope r12 = r6.x()
            if (r12 == 0) goto L_0x0371
            com.hansecom.abt.ui.components.screenHeader.a r13 = new com.hansecom.abt.ui.components.screenHeader.a
            r0 = r13
            r5 = r7
            r7 = r15
            r8 = r9
            r9 = r37
            r10 = r49
            r11 = r50
            r0.<init>(r1, r2, r3, r5, r7, r8, r9, r10, r11)
            r12.a(r13)
        L_0x0371:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.ui.components.screenHeader.ScreenHeaderKt.b(androidx.compose.ui.Modifier, androidx.compose.foundation.layout.PaddingValues, long, long, java.lang.String, java.lang.CharSequence, boolean, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final Unit c(Modifier modifier, PaddingValues paddingValues, long j2, long j3, String str, CharSequence charSequence, boolean z2, int i2, int i3, Composer composer, int i4) {
        b(modifier, paddingValues, j2, j3, str, charSequence, z2, composer, RecomposeScopeImplKt.a(i2 | 1), i3);
        return Unit.f40552a;
    }
}
