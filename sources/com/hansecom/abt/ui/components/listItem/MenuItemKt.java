package com.hansecom.abt.ui.components.listItem;

import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.DividerKt;
import androidx.compose.material3.IconKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.unit.Dp;
import com.hansecom.abt.ui.theme.AbtTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class MenuItemKt {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v8, resolved type: kotlin.jvm.functions.Function0} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x013b  */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x0140  */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x016c  */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x0183  */
    /* JADX WARNING: Removed duplicated region for block: B:189:0x0362  */
    /* JADX WARNING: Removed duplicated region for block: B:191:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0077  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x008e  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0093  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00ab  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00b0  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00c9  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00ce  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x00e6  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x00eb  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0103  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0108  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x0126  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void h(java.lang.String r27, androidx.compose.ui.Modifier r28, float r29, androidx.compose.foundation.layout.PaddingValues r30, kotlin.jvm.functions.Function0 r31, androidx.compose.ui.graphics.painter.Painter r32, androidx.compose.ui.graphics.painter.Painter r33, boolean r34, boolean r35, boolean r36, java.lang.String r37, androidx.compose.runtime.Composer r38, int r39, int r40, int r41) {
        /*
            r1 = r27
            r12 = r39
            r14 = r41
            r2 = 128(0x80, float:1.794E-43)
            r3 = 256(0x100, float:3.59E-43)
            r4 = 32
            r5 = 16
            java.lang.String r6 = "text"
            kotlin.jvm.internal.Intrinsics.i(r1, r6)
            r6 = -1538512961(0xffffffffa44c27bf, float:-4.4269115E-17)
            r7 = r38
            androidx.compose.runtime.Composer r7 = r7.q(r6)
            r8 = 1
            r9 = r14 & 1
            r10 = 2
            r11 = 4
            if (r9 == 0) goto L_0x0026
            r9 = r12 | 6
            goto L_0x0036
        L_0x0026:
            r9 = r12 & 6
            if (r9 != 0) goto L_0x0035
            boolean r9 = r7.W(r1)
            if (r9 == 0) goto L_0x0032
            r9 = r11
            goto L_0x0033
        L_0x0032:
            r9 = r10
        L_0x0033:
            r9 = r9 | r12
            goto L_0x0036
        L_0x0035:
            r9 = r12
        L_0x0036:
            r13 = r14 & 2
            if (r13 == 0) goto L_0x003f
            r9 = r9 | 48
        L_0x003c:
            r15 = r28
            goto L_0x0052
        L_0x003f:
            r15 = r12 & 48
            if (r15 != 0) goto L_0x003c
            r15 = r28
            boolean r16 = r7.W(r15)
            if (r16 == 0) goto L_0x004e
            r16 = r4
            goto L_0x0050
        L_0x004e:
            r16 = r5
        L_0x0050:
            r9 = r9 | r16
        L_0x0052:
            r16 = r14 & 4
            if (r16 == 0) goto L_0x005b
            r9 = r9 | 384(0x180, float:5.38E-43)
        L_0x0058:
            r8 = r29
            goto L_0x006e
        L_0x005b:
            r8 = r12 & 384(0x180, float:5.38E-43)
            if (r8 != 0) goto L_0x0058
            r8 = r29
            boolean r17 = r7.h(r8)
            if (r17 == 0) goto L_0x006a
            r17 = r3
            goto L_0x006c
        L_0x006a:
            r17 = r2
        L_0x006c:
            r9 = r9 | r17
        L_0x006e:
            r17 = r14 & 8
            if (r17 == 0) goto L_0x0077
            r9 = r9 | 3072(0xc00, float:4.305E-42)
        L_0x0074:
            r6 = r30
            goto L_0x008a
        L_0x0077:
            r6 = r12 & 3072(0xc00, float:4.305E-42)
            if (r6 != 0) goto L_0x0074
            r6 = r30
            boolean r19 = r7.W(r6)
            if (r19 == 0) goto L_0x0086
            r19 = 2048(0x800, float:2.87E-42)
            goto L_0x0088
        L_0x0086:
            r19 = 1024(0x400, float:1.435E-42)
        L_0x0088:
            r9 = r9 | r19
        L_0x008a:
            r19 = r14 & 16
            if (r19 == 0) goto L_0x0093
            r9 = r9 | 24576(0x6000, float:3.4438E-41)
        L_0x0090:
            r11 = r31
            goto L_0x00a6
        L_0x0093:
            r11 = r12 & 24576(0x6000, float:3.4438E-41)
            if (r11 != 0) goto L_0x0090
            r11 = r31
            boolean r21 = r7.l(r11)
            if (r21 == 0) goto L_0x00a2
            r21 = 16384(0x4000, float:2.2959E-41)
            goto L_0x00a4
        L_0x00a2:
            r21 = 8192(0x2000, float:1.14794E-41)
        L_0x00a4:
            r9 = r9 | r21
        L_0x00a6:
            r4 = r4 & r14
            r21 = 196608(0x30000, float:2.75506E-40)
            if (r4 == 0) goto L_0x00b0
            r9 = r9 | r21
            r5 = r32
            goto L_0x00c3
        L_0x00b0:
            r21 = r12 & r21
            r5 = r32
            if (r21 != 0) goto L_0x00c3
            boolean r22 = r7.l(r5)
            if (r22 == 0) goto L_0x00bf
            r22 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00c1
        L_0x00bf:
            r22 = 65536(0x10000, float:9.18355E-41)
        L_0x00c1:
            r9 = r9 | r22
        L_0x00c3:
            r22 = r14 & 64
            r23 = 1572864(0x180000, float:2.204052E-39)
            if (r22 == 0) goto L_0x00ce
            r9 = r9 | r23
            r10 = r33
            goto L_0x00e1
        L_0x00ce:
            r23 = r12 & r23
            r10 = r33
            if (r23 != 0) goto L_0x00e1
            boolean r24 = r7.l(r10)
            if (r24 == 0) goto L_0x00dd
            r24 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00df
        L_0x00dd:
            r24 = 524288(0x80000, float:7.34684E-40)
        L_0x00df:
            r9 = r9 | r24
        L_0x00e1:
            r2 = r2 & r14
            r24 = 12582912(0xc00000, float:1.7632415E-38)
            if (r2 == 0) goto L_0x00eb
            r9 = r9 | r24
            r0 = r34
            goto L_0x00fe
        L_0x00eb:
            r24 = r12 & r24
            r0 = r34
            if (r24 != 0) goto L_0x00fe
            boolean r25 = r7.d(r0)
            if (r25 == 0) goto L_0x00fa
            r25 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00fc
        L_0x00fa:
            r25 = 4194304(0x400000, float:5.877472E-39)
        L_0x00fc:
            r9 = r9 | r25
        L_0x00fe:
            r3 = r3 & r14
            r25 = 100663296(0x6000000, float:2.4074124E-35)
            if (r3 == 0) goto L_0x0108
            r9 = r9 | r25
            r0 = r35
            goto L_0x011b
        L_0x0108:
            r25 = r12 & r25
            r0 = r35
            if (r25 != 0) goto L_0x011b
            boolean r25 = r7.d(r0)
            if (r25 == 0) goto L_0x0117
            r25 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x0119
        L_0x0117:
            r25 = 33554432(0x2000000, float:9.403955E-38)
        L_0x0119:
            r9 = r9 | r25
        L_0x011b:
            r0 = r14 & 512(0x200, float:7.175E-43)
            r25 = 805306368(0x30000000, float:4.656613E-10)
            if (r0 == 0) goto L_0x0126
        L_0x0121:
            r9 = r9 | r25
        L_0x0123:
            r5 = 1024(0x400, float:1.435E-42)
            goto L_0x0138
        L_0x0126:
            r25 = r12 & r25
            r5 = r36
            if (r25 != 0) goto L_0x0123
            boolean r25 = r7.d(r5)
            if (r25 == 0) goto L_0x0135
            r25 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x0121
        L_0x0135:
            r25 = 268435456(0x10000000, float:2.5243549E-29)
            goto L_0x0121
        L_0x0138:
            r5 = r5 & r14
            if (r5 == 0) goto L_0x0140
            r24 = r40 | 6
        L_0x013d:
            r6 = r24
            goto L_0x0156
        L_0x0140:
            r24 = r40 & 6
            r6 = r37
            if (r24 != 0) goto L_0x0154
            boolean r24 = r7.W(r6)
            if (r24 == 0) goto L_0x014f
            r24 = 4
            goto L_0x0151
        L_0x014f:
            r24 = 2
        L_0x0151:
            r24 = r40 | r24
            goto L_0x013d
        L_0x0154:
            r6 = r40
        L_0x0156:
            r24 = 306783379(0x12492493, float:6.34695E-28)
            r8 = r9 & r24
            r10 = 306783378(0x12492492, float:6.3469493E-28)
            if (r8 != r10) goto L_0x0183
            r8 = r6 & 3
            r10 = 2
            if (r8 != r10) goto L_0x0183
            boolean r8 = r7.t()
            if (r8 != 0) goto L_0x016c
            goto L_0x0183
        L_0x016c:
            r7.B()
            r3 = r29
            r4 = r30
            r6 = r32
            r8 = r34
            r9 = r35
            r10 = r36
            r5 = r11
            r2 = r15
            r15 = r33
            r11 = r37
            goto L_0x035c
        L_0x0183:
            if (r13 == 0) goto L_0x0188
            androidx.compose.ui.Modifier$Companion r8 = androidx.compose.ui.Modifier.f15489d
            goto L_0x0189
        L_0x0188:
            r8 = r15
        L_0x0189:
            if (r16 == 0) goto L_0x0193
            r10 = 56
            float r10 = (float) r10
            float r10 = androidx.compose.ui.unit.Dp.m(r10)
            goto L_0x0195
        L_0x0193:
            r10 = r29
        L_0x0195:
            if (r17 == 0) goto L_0x01a9
            r13 = 16
            float r15 = (float) r13
            float r13 = androidx.compose.ui.unit.Dp.m(r15)
            r15 = 4
            float r15 = (float) r15
            float r15 = androidx.compose.ui.unit.Dp.m(r15)
            androidx.compose.foundation.layout.PaddingValues r13 = androidx.compose.foundation.layout.PaddingKt.b(r13, r15)
            goto L_0x01ab
        L_0x01a9:
            r13 = r30
        L_0x01ab:
            if (r19 == 0) goto L_0x01ae
            r11 = 0
        L_0x01ae:
            if (r4 == 0) goto L_0x01b2
            r4 = 0
            goto L_0x01b4
        L_0x01b2:
            r4 = r32
        L_0x01b4:
            if (r22 == 0) goto L_0x01b8
            r15 = 0
            goto L_0x01ba
        L_0x01b8:
            r15 = r33
        L_0x01ba:
            if (r2 == 0) goto L_0x01be
            r2 = 1
            goto L_0x01c0
        L_0x01be:
            r2 = r34
        L_0x01c0:
            if (r3 == 0) goto L_0x01c4
            r3 = 0
            goto L_0x01c6
        L_0x01c4:
            r3 = r35
        L_0x01c6:
            if (r0 == 0) goto L_0x01ca
            r0 = 1
            goto L_0x01cc
        L_0x01ca:
            r0 = r36
        L_0x01cc:
            if (r5 == 0) goto L_0x01d0
            r5 = 0
            goto L_0x01d2
        L_0x01d0:
            r5 = r37
        L_0x01d2:
            boolean r16 = androidx.compose.runtime.ComposerKt.P()
            if (r16 == 0) goto L_0x01e0
            java.lang.String r12 = "com.hansecom.abt.ui.components.listItem.MenuItem (MenuItem.kt:49)"
            r14 = -1538512961(0xffffffffa44c27bf, float:-4.4269115E-17)
            androidx.compose.runtime.ComposerKt.Y(r14, r9, r6, r12)
        L_0x01e0:
            r6 = -1644280028(0xffffffff9dfe4724, float:-6.7306798E-21)
            r7.X(r6)
            r6 = 57344(0xe000, float:8.0356E-41)
            r6 = r6 & r9
            r12 = 16384(0x4000, float:2.2959E-41)
            if (r6 != r12) goto L_0x01f0
            r6 = 1
            goto L_0x01f1
        L_0x01f0:
            r6 = 0
        L_0x01f1:
            java.lang.Object r12 = r7.g()
            if (r6 != 0) goto L_0x01ff
            androidx.compose.runtime.Composer$Companion r6 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r6 = r6.a()
            if (r12 != r6) goto L_0x0207
        L_0x01ff:
            com.hansecom.abt.ui.components.listItem.o r12 = new com.hansecom.abt.ui.components.listItem.o
            r12.<init>(r11)
            r7.N(r12)
        L_0x0207:
            r6 = r12
            kotlin.jvm.functions.Function0 r6 = (kotlin.jvm.functions.Function0) r6
            r7.M()
            r12 = 6
            r14 = 0
            r17 = 0
            r18 = 0
            r28 = r8
            r29 = r0
            r30 = r17
            r31 = r18
            r32 = r6
            r33 = r12
            r34 = r14
            androidx.compose.ui.Modifier r6 = androidx.compose.foundation.ClickableKt.f(r28, r29, r30, r31, r32, r33, r34)
            androidx.compose.foundation.layout.Arrangement r12 = androidx.compose.foundation.layout.Arrangement.f3739a
            androidx.compose.foundation.layout.Arrangement$Vertical r12 = r12.g()
            androidx.compose.ui.Alignment$Companion r14 = androidx.compose.ui.Alignment.f15444a
            androidx.compose.ui.Alignment$Horizontal r14 = r14.k()
            r17 = r8
            r8 = 0
            androidx.compose.ui.layout.MeasurePolicy r12 = androidx.compose.foundation.layout.ColumnKt.a(r12, r14, r7, r8)
            int r14 = androidx.compose.runtime.ComposablesKt.a(r7, r8)
            androidx.compose.runtime.CompositionLocalMap r8 = r7.I()
            androidx.compose.ui.Modifier r6 = androidx.compose.ui.ComposedModifierKt.e(r7, r6)
            androidx.compose.ui.node.ComposeUiNode$Companion r18 = androidx.compose.ui.node.ComposeUiNode.f17222h
            r19 = r11
            kotlin.jvm.functions.Function0 r11 = r18.a()
            androidx.compose.runtime.Applier r20 = r7.v()
            if (r20 != 0) goto L_0x0255
            androidx.compose.runtime.ComposablesKt.d()
        L_0x0255:
            r7.s()
            boolean r20 = r7.n()
            if (r20 == 0) goto L_0x0262
            r7.y(r11)
            goto L_0x0265
        L_0x0262:
            r7.K()
        L_0x0265:
            androidx.compose.runtime.Composer r11 = androidx.compose.runtime.Updater.b(r7)
            r20 = r3
            kotlin.jvm.functions.Function2 r3 = r18.c()
            androidx.compose.runtime.Updater.g(r11, r12, r3)
            kotlin.jvm.functions.Function2 r3 = r18.e()
            androidx.compose.runtime.Updater.g(r11, r8, r3)
            kotlin.jvm.functions.Function2 r3 = r18.b()
            boolean r8 = r11.n()
            if (r8 != 0) goto L_0x0291
            java.lang.Object r8 = r11.g()
            java.lang.Integer r12 = java.lang.Integer.valueOf(r14)
            boolean r8 = kotlin.jvm.internal.Intrinsics.d(r8, r12)
            if (r8 != 0) goto L_0x029f
        L_0x0291:
            java.lang.Integer r8 = java.lang.Integer.valueOf(r14)
            r11.N(r8)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r14)
            r11.A(r8, r3)
        L_0x029f:
            kotlin.jvm.functions.Function2 r3 = r18.d()
            androidx.compose.runtime.Updater.g(r11, r6, r3)
            androidx.compose.foundation.layout.ColumnScopeInstance r3 = androidx.compose.foundation.layout.ColumnScopeInstance.f3815a
            com.hansecom.abt.ui.components.listItem.MenuItemKt$MenuItem$2$1 r3 = new com.hansecom.abt.ui.components.listItem.MenuItemKt$MenuItem$2$1
            r3.<init>(r4, r2, r1, r15)
            r6 = 54
            r8 = 1458536728(0x56ef8118, float:1.31668866E14)
            r11 = 1
            androidx.compose.runtime.internal.ComposableLambda r3 = androidx.compose.runtime.internal.ComposableLambdaKt.e(r8, r11, r3, r7, r6)
            int r6 = r9 >> 3
            r8 = r6 & 112(0x70, float:1.57E-43)
            r8 = r8 | 24576(0x6000, float:3.4438E-41)
            r6 = r6 & 896(0x380, float:1.256E-42)
            r6 = r6 | r8
            int r8 = r9 >> 18
            r8 = r8 & 7168(0x1c00, float:1.0045E-41)
            r6 = r6 | r8
            r8 = 1
            r11 = 0
            r28 = r11
            r29 = r10
            r30 = r13
            r31 = r0
            r32 = r3
            r33 = r7
            r34 = r6
            r35 = r8
            q(r28, r29, r30, r31, r32, r33, r34, r35)
            r3 = -721128344(0xffffffffd5047468, float:-9.1022185E12)
            r7.X(r3)
            if (r5 != 0) goto L_0x02e3
            goto L_0x0332
        L_0x02e3:
            androidx.compose.ui.Modifier$Companion r3 = androidx.compose.ui.Modifier.f15489d
            androidx.compose.runtime.ProvidableCompositionLocal r6 = androidx.compose.ui.platform.CompositionLocalsKt.m()
            java.lang.Object r6 = r7.C(r6)
            androidx.compose.ui.unit.LayoutDirection r6 = (androidx.compose.ui.unit.LayoutDirection) r6
            float r6 = androidx.compose.foundation.layout.PaddingKt.g(r13, r6)
            androidx.compose.runtime.ProvidableCompositionLocal r8 = androidx.compose.ui.platform.CompositionLocalsKt.m()
            java.lang.Object r8 = r7.C(r8)
            androidx.compose.ui.unit.LayoutDirection r8 = (androidx.compose.ui.unit.LayoutDirection) r8
            float r8 = androidx.compose.foundation.layout.PaddingKt.f(r13, r8)
            r11 = 16
            float r11 = (float) r11
            float r11 = androidx.compose.ui.unit.Dp.m(r11)
            r12 = 2
            r14 = 0
            r18 = 0
            r28 = r3
            r29 = r6
            r30 = r18
            r31 = r8
            r32 = r11
            r33 = r12
            r34 = r14
            androidx.compose.ui.Modifier r3 = androidx.compose.foundation.layout.PaddingKt.m(r28, r29, r30, r31, r32, r33, r34)
            int r6 = r9 >> 21
            r6 = r6 & 896(0x380, float:1.256E-42)
            r8 = 0
            r28 = r5
            r29 = r3
            r30 = r0
            r31 = r7
            r32 = r6
            r33 = r8
            i(r28, r29, r30, r31, r32, r33)
        L_0x0332:
            r7.M()
            r3 = -721115256(0xffffffffd504a788, float:-9.1159423E12)
            r7.X(r3)
            if (r20 == 0) goto L_0x0341
            r3 = 0
            k(r7, r3)
        L_0x0341:
            r7.M()
            r7.T()
            boolean r3 = androidx.compose.runtime.ComposerKt.P()
            if (r3 == 0) goto L_0x0350
            androidx.compose.runtime.ComposerKt.X()
        L_0x0350:
            r8 = r2
            r6 = r4
            r11 = r5
            r3 = r10
            r4 = r13
            r2 = r17
            r5 = r19
            r9 = r20
            r10 = r0
        L_0x035c:
            androidx.compose.runtime.ScopeUpdateScope r14 = r7.x()
            if (r14 == 0) goto L_0x0379
            com.hansecom.abt.ui.components.listItem.p r13 = new com.hansecom.abt.ui.components.listItem.p
            r0 = r13
            r1 = r27
            r7 = r15
            r12 = r39
            r15 = r13
            r13 = r40
            r26 = r14
            r14 = r41
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            r0 = r26
            r0.a(r15)
        L_0x0379:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.ui.components.listItem.MenuItemKt.h(java.lang.String, androidx.compose.ui.Modifier, float, androidx.compose.foundation.layout.PaddingValues, kotlin.jvm.functions.Function0, androidx.compose.ui.graphics.painter.Painter, androidx.compose.ui.graphics.painter.Painter, boolean, boolean, boolean, java.lang.String, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00fa  */
    /* JADX WARNING: Removed duplicated region for block: B:60:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void i(java.lang.String r33, androidx.compose.ui.Modifier r34, boolean r35, androidx.compose.runtime.Composer r36, int r37, int r38) {
        /*
            r4 = r37
            r0 = 94815799(0x5a6c637, float:1.5683378E-35)
            r1 = r36
            androidx.compose.runtime.Composer r1 = r1.q(r0)
            r2 = r38 & 1
            if (r2 == 0) goto L_0x0015
            r2 = r4 | 6
            r3 = r2
            r2 = r33
            goto L_0x0029
        L_0x0015:
            r2 = r4 & 6
            if (r2 != 0) goto L_0x0026
            r2 = r33
            boolean r3 = r1.W(r2)
            if (r3 == 0) goto L_0x0023
            r3 = 4
            goto L_0x0024
        L_0x0023:
            r3 = 2
        L_0x0024:
            r3 = r3 | r4
            goto L_0x0029
        L_0x0026:
            r2 = r33
            r3 = r4
        L_0x0029:
            r5 = r38 & 2
            if (r5 == 0) goto L_0x0032
            r3 = r3 | 48
        L_0x002f:
            r6 = r34
            goto L_0x0044
        L_0x0032:
            r6 = r4 & 48
            if (r6 != 0) goto L_0x002f
            r6 = r34
            boolean r7 = r1.W(r6)
            if (r7 == 0) goto L_0x0041
            r7 = 32
            goto L_0x0043
        L_0x0041:
            r7 = 16
        L_0x0043:
            r3 = r3 | r7
        L_0x0044:
            r7 = r38 & 4
            if (r7 == 0) goto L_0x004d
            r3 = r3 | 384(0x180, float:5.38E-43)
        L_0x004a:
            r8 = r35
            goto L_0x005f
        L_0x004d:
            r8 = r4 & 384(0x180, float:5.38E-43)
            if (r8 != 0) goto L_0x004a
            r8 = r35
            boolean r9 = r1.d(r8)
            if (r9 == 0) goto L_0x005c
            r9 = 256(0x100, float:3.59E-43)
            goto L_0x005e
        L_0x005c:
            r9 = 128(0x80, float:1.794E-43)
        L_0x005e:
            r3 = r3 | r9
        L_0x005f:
            r9 = r3 & 147(0x93, float:2.06E-43)
            r10 = 146(0x92, float:2.05E-43)
            if (r9 != r10) goto L_0x0074
            boolean r9 = r1.t()
            if (r9 != 0) goto L_0x006c
            goto L_0x0074
        L_0x006c:
            r1.B()
            r31 = r6
            r3 = r8
            goto L_0x00f4
        L_0x0074:
            if (r5 == 0) goto L_0x007b
            androidx.compose.ui.Modifier$Companion r5 = androidx.compose.ui.Modifier.f15489d
            r31 = r5
            goto L_0x007d
        L_0x007b:
            r31 = r6
        L_0x007d:
            if (r7 == 0) goto L_0x0083
            r5 = 1
            r32 = r5
            goto L_0x0085
        L_0x0083:
            r32 = r8
        L_0x0085:
            boolean r5 = androidx.compose.runtime.ComposerKt.P()
            if (r5 == 0) goto L_0x0091
            r5 = -1
            java.lang.String r6 = "com.hansecom.abt.ui.components.listItem.MenuItemDescription (MenuItem.kt:136)"
            androidx.compose.runtime.ComposerKt.Y(r0, r3, r5, r6)
        L_0x0091:
            com.hansecom.abt.ui.theme.AbtTheme r0 = com.hansecom.abt.ui.theme.AbtTheme.f38851a
            r5 = 6
            com.hansecom.abt.ui.theme.typography.AbtTypography r6 = r0.d(r1, r5)
            androidx.compose.ui.text.TextStyle r26 = r6.d()
            r6 = 0
            if (r32 == 0) goto L_0x00b2
            r7 = 735123737(0x2bd11919, float:1.4857309E-12)
            r1.X(r7)
            com.hansecom.abt.ui.components.listItem.AbtMenuItemStyle r0 = r0.c(r1, r5)
            long r5 = r0.b(r1, r6)
        L_0x00ad:
            r1.M()
            r7 = r5
            goto L_0x00c1
        L_0x00b2:
            r7 = 735125057(0x2bd11e41, float:1.485874E-12)
            r1.X(r7)
            com.hansecom.abt.ui.components.listItem.AbtMenuItemStyle r0 = r0.c(r1, r5)
            long r5 = r0.c(r1, r6)
            goto L_0x00ad
        L_0x00c1:
            r28 = r3 & 126(0x7e, float:1.77E-43)
            r29 = 0
            r30 = 131064(0x1fff8, float:1.8366E-40)
            r9 = 0
            r10 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r5 = r33
            r6 = r31
            r27 = r1
            androidx.compose.material3.TextKt.j(r5, r6, r7, r9, r10, r12, r13, r14, r15, r17, r18, r19, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30)
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x00f2
            androidx.compose.runtime.ComposerKt.X()
        L_0x00f2:
            r3 = r32
        L_0x00f4:
            androidx.compose.runtime.ScopeUpdateScope r6 = r1.x()
            if (r6 == 0) goto L_0x010b
            com.hansecom.abt.ui.components.listItem.q r7 = new com.hansecom.abt.ui.components.listItem.q
            r0 = r7
            r1 = r33
            r2 = r31
            r4 = r37
            r5 = r38
            r0.<init>(r1, r2, r3, r4, r5)
            r6.a(r7)
        L_0x010b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.ui.components.listItem.MenuItemKt.i(java.lang.String, androidx.compose.ui.Modifier, boolean, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final Unit j(String str, Modifier modifier, boolean z2, int i2, int i3, Composer composer, int i4) {
        i(str, modifier, z2, composer, RecomposeScopeImplKt.a(i2 | 1), i3);
        return Unit.f40552a;
    }

    public static final void k(Composer composer, int i2) {
        Composer q2 = composer.q(2114049444);
        if (i2 != 0 || !q2.t()) {
            if (ComposerKt.P()) {
                ComposerKt.Y(2114049444, i2, -1, "com.hansecom.abt.ui.components.listItem.MenuItemDivider (MenuItem.kt:144)");
            }
            DividerKt.e((Modifier) null, Dp.m((float) 1), AbtTheme.f38851a.c(q2, 6).a(q2, 0), q2, 48, 1);
            if (ComposerKt.P()) {
                ComposerKt.X();
            }
        } else {
            q2.B();
        }
        ScopeUpdateScope x2 = q2.x();
        if (x2 != null) {
            x2.a(new r(i2));
        }
    }

    public static final Unit l(int i2, Composer composer, int i3) {
        k(composer, RecomposeScopeImplKt.a(i2 | 1));
        return Unit.f40552a;
    }

    public static final void m(Painter painter, Modifier modifier, Composer composer, int i2, int i3) {
        int i4;
        Intrinsics.i(painter, "icon");
        Composer q2 = composer.q(119224988);
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = (q2.l(painter) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i5 = i3 & 2;
        if (i5 != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            i4 |= q2.W(modifier) ? 32 : 16;
        }
        if ((i4 & 19) != 18 || !q2.t()) {
            if (i5 != 0) {
                modifier = Modifier.f15489d;
            }
            if (ComposerKt.P()) {
                ComposerKt.Y(119224988, i4, -1, "com.hansecom.abt.ui.components.listItem.MenuItemIcon (MenuItem.kt:116)");
            }
            IconKt.d(painter, (String) null, SizeKt.t(modifier, Dp.m((float) 24)), 0, q2, (i4 & 14) | 48, 8);
            if (ComposerKt.P()) {
                ComposerKt.X();
            }
        } else {
            q2.B();
        }
        ScopeUpdateScope x2 = q2.x();
        if (x2 != null) {
            x2.a(new m(painter, modifier, i2, i3));
        }
    }

    public static final Unit n(Painter painter, Modifier modifier, int i2, int i3, Composer composer, int i4) {
        m(painter, modifier, composer, RecomposeScopeImplKt.a(i2 | 1), i3);
        return Unit.f40552a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:37:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00f2  */
    /* JADX WARNING: Removed duplicated region for block: B:52:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void o(androidx.compose.foundation.layout.RowScope r34, java.lang.String r35, androidx.compose.ui.Modifier r36, androidx.compose.runtime.Composer r37, int r38, int r39) {
        /*
            r6 = r34
            r7 = r35
            r15 = r38
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.i(r6, r0)
            java.lang.String r0 = "text"
            kotlin.jvm.internal.Intrinsics.i(r7, r0)
            r0 = 1618432379(0x6077517b, float:7.128464E19)
            r1 = r37
            androidx.compose.runtime.Composer r14 = r1.q(r0)
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r39 & r1
            if (r1 == 0) goto L_0x0022
            r1 = r15 | 6
            goto L_0x0032
        L_0x0022:
            r1 = r15 & 6
            if (r1 != 0) goto L_0x0031
            boolean r1 = r14.W(r6)
            if (r1 == 0) goto L_0x002e
            r1 = 4
            goto L_0x002f
        L_0x002e:
            r1 = 2
        L_0x002f:
            r1 = r1 | r15
            goto L_0x0032
        L_0x0031:
            r1 = r15
        L_0x0032:
            r2 = r39 & 1
            if (r2 == 0) goto L_0x0039
            r1 = r1 | 48
            goto L_0x0049
        L_0x0039:
            r2 = r15 & 48
            if (r2 != 0) goto L_0x0049
            boolean r2 = r14.W(r7)
            if (r2 == 0) goto L_0x0046
            r2 = 32
            goto L_0x0048
        L_0x0046:
            r2 = 16
        L_0x0048:
            r1 = r1 | r2
        L_0x0049:
            r2 = r39 & 2
            if (r2 == 0) goto L_0x0053
            r1 = r1 | 384(0x180, float:5.38E-43)
        L_0x004f:
            r3 = r36
        L_0x0051:
            r9 = r1
            goto L_0x0066
        L_0x0053:
            r3 = r15 & 384(0x180, float:5.38E-43)
            if (r3 != 0) goto L_0x004f
            r3 = r36
            boolean r4 = r14.W(r3)
            if (r4 == 0) goto L_0x0062
            r4 = 256(0x100, float:3.59E-43)
            goto L_0x0064
        L_0x0062:
            r4 = 128(0x80, float:1.794E-43)
        L_0x0064:
            r1 = r1 | r4
            goto L_0x0051
        L_0x0066:
            r1 = r9 & 147(0x93, float:2.06E-43)
            r4 = 146(0x92, float:2.05E-43)
            if (r1 != r4) goto L_0x0079
            boolean r1 = r14.t()
            if (r1 != 0) goto L_0x0073
            goto L_0x0079
        L_0x0073:
            r14.B()
            r1 = r14
            goto L_0x00ec
        L_0x0079:
            if (r2 == 0) goto L_0x0080
            androidx.compose.ui.Modifier$Companion r1 = androidx.compose.ui.Modifier.f15489d
            r33 = r1
            goto L_0x0082
        L_0x0080:
            r33 = r3
        L_0x0082:
            boolean r1 = androidx.compose.runtime.ComposerKt.P()
            if (r1 == 0) goto L_0x008e
            r1 = -1
            java.lang.String r2 = "com.hansecom.abt.ui.components.listItem.MenuItemLabel (MenuItem.kt:123)"
            androidx.compose.runtime.ComposerKt.Y(r0, r9, r1, r2)
        L_0x008e:
            com.hansecom.abt.ui.theme.AbtTheme r0 = com.hansecom.abt.ui.theme.AbtTheme.f38851a
            r1 = 6
            com.hansecom.abt.ui.theme.typography.AbtTypography r0 = r0.d(r14, r1)
            androidx.compose.ui.text.TextStyle r28 = r0.a()
            r4 = 2
            r5 = 0
            r2 = 1065353216(0x3f800000, float:1.0)
            r3 = 0
            r0 = r34
            r1 = r33
            androidx.compose.ui.Modifier r0 = androidx.compose.foundation.layout.RowScope.c(r0, r1, r2, r3, r4, r5)
            r1 = 12
            float r1 = (float) r1
            float r1 = androidx.compose.ui.unit.Dp.m(r1)
            r2 = 0
            r3 = 0
            r4 = 1
            androidx.compose.ui.Modifier r8 = androidx.compose.foundation.layout.PaddingKt.k(r0, r3, r1, r4, r2)
            int r0 = r9 >> 3
            r30 = r0 & 14
            r31 = 0
            r32 = 131068(0x1fffc, float:1.83665E-40)
            r9 = 0
            r11 = 0
            r12 = 0
            r0 = 0
            r1 = r14
            r14 = r0
            r15 = r0
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
            r7 = r35
            r29 = r1
            androidx.compose.material3.TextKt.j(r7, r8, r9, r11, r12, r14, r15, r16, r17, r19, r20, r21, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32)
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x00ea
            androidx.compose.runtime.ComposerKt.X()
        L_0x00ea:
            r3 = r33
        L_0x00ec:
            androidx.compose.runtime.ScopeUpdateScope r7 = r1.x()
            if (r7 == 0) goto L_0x0103
            com.hansecom.abt.ui.components.listItem.n r8 = new com.hansecom.abt.ui.components.listItem.n
            r0 = r8
            r1 = r34
            r2 = r35
            r4 = r38
            r5 = r39
            r0.<init>(r1, r2, r3, r4, r5)
            r7.a(r8)
        L_0x0103:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.ui.components.listItem.MenuItemKt.o(androidx.compose.foundation.layout.RowScope, java.lang.String, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final Unit p(RowScope rowScope, String str, Modifier modifier, int i2, int i3, Composer composer, int i4) {
        o(rowScope, str, modifier, composer, RecomposeScopeImplKt.a(i2 | 1), i3);
        return Unit.f40552a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00a7  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0140  */
    /* JADX WARNING: Removed duplicated region for block: B:85:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void q(androidx.compose.ui.Modifier r16, float r17, androidx.compose.foundation.layout.PaddingValues r18, boolean r19, kotlin.jvm.functions.Function3 r20, androidx.compose.runtime.Composer r21, int r22, int r23) {
        /*
            r5 = r20
            r6 = r22
            java.lang.String r0 = "content"
            kotlin.jvm.internal.Intrinsics.i(r5, r0)
            r0 = -1255215605(0xffffffffb52eee0b, float:-6.516645E-7)
            r1 = r21
            androidx.compose.runtime.Composer r1 = r1.q(r0)
            r2 = r23 & 1
            r3 = 4
            if (r2 == 0) goto L_0x001d
            r4 = r6 | 6
            r7 = r4
            r4 = r16
            goto L_0x0031
        L_0x001d:
            r4 = r6 & 6
            if (r4 != 0) goto L_0x002e
            r4 = r16
            boolean r7 = r1.W(r4)
            if (r7 == 0) goto L_0x002b
            r7 = r3
            goto L_0x002c
        L_0x002b:
            r7 = 2
        L_0x002c:
            r7 = r7 | r6
            goto L_0x0031
        L_0x002e:
            r4 = r16
            r7 = r6
        L_0x0031:
            r8 = r23 & 2
            r9 = 16
            if (r8 == 0) goto L_0x003c
            r7 = r7 | 48
        L_0x0039:
            r10 = r17
            goto L_0x004d
        L_0x003c:
            r10 = r6 & 48
            if (r10 != 0) goto L_0x0039
            r10 = r17
            boolean r11 = r1.h(r10)
            if (r11 == 0) goto L_0x004b
            r11 = 32
            goto L_0x004c
        L_0x004b:
            r11 = r9
        L_0x004c:
            r7 = r7 | r11
        L_0x004d:
            r11 = r23 & 4
            if (r11 == 0) goto L_0x0056
            r7 = r7 | 384(0x180, float:5.38E-43)
        L_0x0053:
            r12 = r18
            goto L_0x0068
        L_0x0056:
            r12 = r6 & 384(0x180, float:5.38E-43)
            if (r12 != 0) goto L_0x0053
            r12 = r18
            boolean r13 = r1.W(r12)
            if (r13 == 0) goto L_0x0065
            r13 = 256(0x100, float:3.59E-43)
            goto L_0x0067
        L_0x0065:
            r13 = 128(0x80, float:1.794E-43)
        L_0x0067:
            r7 = r7 | r13
        L_0x0068:
            r13 = r23 & 8
            if (r13 == 0) goto L_0x0071
            r7 = r7 | 3072(0xc00, float:4.305E-42)
        L_0x006e:
            r14 = r19
            goto L_0x0083
        L_0x0071:
            r14 = r6 & 3072(0xc00, float:4.305E-42)
            if (r14 != 0) goto L_0x006e
            r14 = r19
            boolean r15 = r1.d(r14)
            if (r15 == 0) goto L_0x0080
            r15 = 2048(0x800, float:2.87E-42)
            goto L_0x0082
        L_0x0080:
            r15 = 1024(0x400, float:1.435E-42)
        L_0x0082:
            r7 = r7 | r15
        L_0x0083:
            r15 = r23 & 16
            if (r15 == 0) goto L_0x008a
            r7 = r7 | 24576(0x6000, float:3.4438E-41)
            goto L_0x009a
        L_0x008a:
            r15 = r6 & 24576(0x6000, float:3.4438E-41)
            if (r15 != 0) goto L_0x009a
            boolean r15 = r1.l(r5)
            if (r15 == 0) goto L_0x0097
            r15 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0099
        L_0x0097:
            r15 = 8192(0x2000, float:1.14794E-41)
        L_0x0099:
            r7 = r7 | r15
        L_0x009a:
            r15 = r7 & 9363(0x2493, float:1.312E-41)
            r0 = 9362(0x2492, float:1.3119E-41)
            if (r15 != r0) goto L_0x00ae
            boolean r0 = r1.t()
            if (r0 != 0) goto L_0x00a7
            goto L_0x00ae
        L_0x00a7:
            r1.B()
        L_0x00aa:
            r2 = r10
            r3 = r12
            goto L_0x013a
        L_0x00ae:
            if (r2 == 0) goto L_0x00b3
            androidx.compose.ui.Modifier$Companion r0 = androidx.compose.ui.Modifier.f15489d
            goto L_0x00b4
        L_0x00b3:
            r0 = r4
        L_0x00b4:
            if (r8 == 0) goto L_0x00be
            r2 = 56
            float r2 = (float) r2
            float r2 = androidx.compose.ui.unit.Dp.m(r2)
            r10 = r2
        L_0x00be:
            if (r11 == 0) goto L_0x00cf
            float r2 = (float) r9
            float r2 = androidx.compose.ui.unit.Dp.m(r2)
            float r3 = (float) r3
            float r3 = androidx.compose.ui.unit.Dp.m(r3)
            androidx.compose.foundation.layout.PaddingValues r2 = androidx.compose.foundation.layout.PaddingKt.b(r2, r3)
            r12 = r2
        L_0x00cf:
            r2 = 1
            if (r13 == 0) goto L_0x00d3
            r14 = r2
        L_0x00d3:
            boolean r3 = androidx.compose.runtime.ComposerKt.P()
            if (r3 == 0) goto L_0x00e2
            r3 = -1
            java.lang.String r4 = "com.hansecom.abt.ui.components.listItem.MenuItemRow (MenuItem.kt:95)"
            r8 = -1255215605(0xffffffffb52eee0b, float:-6.516645E-7)
            androidx.compose.runtime.ComposerKt.Y(r8, r7, r3, r4)
        L_0x00e2:
            androidx.compose.runtime.ProvidableCompositionLocal r3 = androidx.compose.material3.ContentColorKt.a()
            r4 = 0
            r7 = 6
            if (r14 == 0) goto L_0x00fe
            r8 = 116785820(0x6f6029c, float:9.253875E-35)
            r1.X(r8)
            com.hansecom.abt.ui.theme.AbtTheme r8 = com.hansecom.abt.ui.theme.AbtTheme.f38851a
            com.hansecom.abt.ui.components.listItem.AbtMenuItemStyle r7 = r8.c(r1, r7)
            long r7 = r7.b(r1, r4)
            r1.M()
            goto L_0x0111
        L_0x00fe:
            r8 = 116850548(0x6f6ff74, float:9.291027E-35)
            r1.X(r8)
            com.hansecom.abt.ui.theme.AbtTheme r8 = com.hansecom.abt.ui.theme.AbtTheme.f38851a
            com.hansecom.abt.ui.components.listItem.AbtMenuItemStyle r7 = r8.c(r1, r7)
            long r7 = r7.c(r1, r4)
            r1.M()
        L_0x0111:
            androidx.compose.ui.graphics.Color r4 = androidx.compose.ui.graphics.Color.h(r7)
            androidx.compose.runtime.ProvidedValue r3 = r3.d(r4)
            com.hansecom.abt.ui.components.listItem.MenuItemKt$MenuItemRow$1 r4 = new com.hansecom.abt.ui.components.listItem.MenuItemKt$MenuItemRow$1
            r4.<init>(r0, r10, r12, r5)
            r7 = 54
            r8 = -2076929333(0xffffffff843492cb, float:-2.1226302E-36)
            androidx.compose.runtime.internal.ComposableLambda r2 = androidx.compose.runtime.internal.ComposableLambdaKt.e(r8, r2, r4, r1, r7)
            int r4 = androidx.compose.runtime.ProvidedValue.f14769i
            r4 = r4 | 48
            androidx.compose.runtime.CompositionLocalKt.c(r3, r2, r1, r4)
            boolean r2 = androidx.compose.runtime.ComposerKt.P()
            if (r2 == 0) goto L_0x0137
            androidx.compose.runtime.ComposerKt.X()
        L_0x0137:
            r4 = r0
            goto L_0x00aa
        L_0x013a:
            androidx.compose.runtime.ScopeUpdateScope r8 = r1.x()
            if (r8 == 0) goto L_0x0151
            com.hansecom.abt.ui.components.listItem.s r9 = new com.hansecom.abt.ui.components.listItem.s
            r0 = r9
            r1 = r4
            r4 = r14
            r5 = r20
            r6 = r22
            r7 = r23
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r8.a(r9)
        L_0x0151:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.ui.components.listItem.MenuItemKt.q(androidx.compose.ui.Modifier, float, androidx.compose.foundation.layout.PaddingValues, boolean, kotlin.jvm.functions.Function3, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final Unit r(Modifier modifier, float f2, PaddingValues paddingValues, boolean z2, Function3 function3, int i2, int i3, Composer composer, int i4) {
        q(modifier, f2, paddingValues, z2, function3, composer, RecomposeScopeImplKt.a(i2 | 1), i3);
        return Unit.f40552a;
    }

    public static final Unit s(Function0 function0) {
        if (function0 != null) {
            function0.invoke();
        }
        return Unit.f40552a;
    }

    public static final Unit t(String str, Modifier modifier, float f2, PaddingValues paddingValues, Function0 function0, Painter painter, Painter painter2, boolean z2, boolean z3, boolean z4, String str2, int i2, int i3, int i4, Composer composer, int i5) {
        h(str, modifier, f2, paddingValues, function0, painter, painter2, z2, z3, z4, str2, composer, RecomposeScopeImplKt.a(i2 | 1), RecomposeScopeImplKt.a(i3), i4);
        return Unit.f40552a;
    }
}
