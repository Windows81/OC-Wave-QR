package androidx.compose.material3;

import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.material3.internal.FloatProducer;
import androidx.compose.material3.internal.TextFieldImplKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.DpKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

@Metadata
public final class TextFieldKt {

    /* renamed from: a  reason: collision with root package name */
    public static final float f11399a = Dp.m((float) 8);

    /* JADX WARNING: Code restructure failed: missing block: B:233:0x05bd, code lost:
        if (r9.l(r11) != false) goto L_0x05c6;
     */
    /* JADX WARNING: Removed duplicated region for block: B:245:0x0610  */
    /* JADX WARNING: Removed duplicated region for block: B:248:0x061c  */
    /* JADX WARNING: Removed duplicated region for block: B:249:0x0620  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void c(androidx.compose.ui.Modifier r38, kotlin.jvm.functions.Function2 r39, kotlin.jvm.functions.Function2 r40, kotlin.jvm.functions.Function3 r41, kotlin.jvm.functions.Function2 r42, kotlin.jvm.functions.Function2 r43, kotlin.jvm.functions.Function2 r44, kotlin.jvm.functions.Function2 r45, boolean r46, androidx.compose.material3.TextFieldLabelPosition r47, androidx.compose.material3.internal.FloatProducer r48, kotlin.jvm.functions.Function2 r49, kotlin.jvm.functions.Function2 r50, androidx.compose.foundation.layout.PaddingValues r51, androidx.compose.runtime.Composer r52, int r53, int r54) {
        /*
            r1 = r38
            r2 = r39
            r3 = r40
            r4 = r41
            r5 = r42
            r6 = r43
            r7 = r44
            r8 = r45
            r0 = r47
            r15 = r48
            r14 = r49
            r13 = r50
            r12 = r51
            r11 = r53
            r10 = r54
            r9 = -1086465551(0xffffffffbf3dd9f1, float:-0.7416068)
            r12 = r52
            androidx.compose.runtime.Composer r12 = r12.q(r9)
            r18 = r11 & 6
            if (r18 != 0) goto L_0x0039
            boolean r18 = r12.W(r1)
            if (r18 == 0) goto L_0x0034
            r18 = 4
            goto L_0x0036
        L_0x0034:
            r18 = 2
        L_0x0036:
            r18 = r11 | r18
            goto L_0x003b
        L_0x0039:
            r18 = r11
        L_0x003b:
            r20 = r11 & 48
            r21 = 16
            r22 = 32
            if (r20 != 0) goto L_0x0050
            boolean r20 = r12.l(r2)
            if (r20 == 0) goto L_0x004c
            r20 = r22
            goto L_0x004e
        L_0x004c:
            r20 = r21
        L_0x004e:
            r18 = r18 | r20
        L_0x0050:
            r9 = r11 & 384(0x180, float:5.38E-43)
            r23 = 128(0x80, float:1.794E-43)
            r24 = 256(0x100, float:3.59E-43)
            if (r9 != 0) goto L_0x0065
            boolean r9 = r12.l(r3)
            if (r9 == 0) goto L_0x0061
            r9 = r24
            goto L_0x0063
        L_0x0061:
            r9 = r23
        L_0x0063:
            r18 = r18 | r9
        L_0x0065:
            r9 = r11 & 3072(0xc00, float:4.305E-42)
            r25 = 1024(0x400, float:1.435E-42)
            if (r9 != 0) goto L_0x0078
            boolean r9 = r12.l(r4)
            if (r9 == 0) goto L_0x0074
            r9 = 2048(0x800, float:2.87E-42)
            goto L_0x0076
        L_0x0074:
            r9 = r25
        L_0x0076:
            r18 = r18 | r9
        L_0x0078:
            r9 = r11 & 24576(0x6000, float:3.4438E-41)
            if (r9 != 0) goto L_0x0089
            boolean r9 = r12.l(r5)
            if (r9 == 0) goto L_0x0085
            r9 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0087
        L_0x0085:
            r9 = 8192(0x2000, float:1.14794E-41)
        L_0x0087:
            r18 = r18 | r9
        L_0x0089:
            r9 = 196608(0x30000, float:2.75506E-40)
            r9 = r9 & r11
            if (r9 != 0) goto L_0x009b
            boolean r9 = r12.l(r6)
            if (r9 == 0) goto L_0x0097
            r9 = 131072(0x20000, float:1.83671E-40)
            goto L_0x0099
        L_0x0097:
            r9 = 65536(0x10000, float:9.18355E-41)
        L_0x0099:
            r18 = r18 | r9
        L_0x009b:
            r9 = 1572864(0x180000, float:2.204052E-39)
            r9 = r9 & r11
            if (r9 != 0) goto L_0x00ad
            boolean r9 = r12.l(r7)
            if (r9 == 0) goto L_0x00a9
            r9 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00ab
        L_0x00a9:
            r9 = 524288(0x80000, float:7.34684E-40)
        L_0x00ab:
            r18 = r18 | r9
        L_0x00ad:
            r9 = 12582912(0xc00000, float:1.7632415E-38)
            r9 = r9 & r11
            if (r9 != 0) goto L_0x00bf
            boolean r9 = r12.l(r8)
            if (r9 == 0) goto L_0x00bb
            r9 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00bd
        L_0x00bb:
            r9 = 4194304(0x400000, float:5.877472E-39)
        L_0x00bd:
            r18 = r18 | r9
        L_0x00bf:
            r9 = 100663296(0x6000000, float:2.4074124E-35)
            r9 = r9 & r11
            if (r9 != 0) goto L_0x00d4
            r9 = r46
            boolean r26 = r12.d(r9)
            if (r26 == 0) goto L_0x00cf
            r26 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x00d1
        L_0x00cf:
            r26 = 33554432(0x2000000, float:9.403955E-38)
        L_0x00d1:
            r18 = r18 | r26
            goto L_0x00d6
        L_0x00d4:
            r9 = r46
        L_0x00d6:
            r26 = 805306368(0x30000000, float:4.656613E-10)
            r26 = r11 & r26
            if (r26 != 0) goto L_0x00e9
            boolean r26 = r12.W(r0)
            if (r26 == 0) goto L_0x00e5
            r26 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x00e7
        L_0x00e5:
            r26 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x00e7:
            r18 = r18 | r26
        L_0x00e9:
            r2 = r18
            r18 = r10 & 6
            if (r18 != 0) goto L_0x0106
            r18 = r10 & 8
            if (r18 != 0) goto L_0x00f8
            boolean r18 = r12.W(r15)
            goto L_0x00fc
        L_0x00f8:
            boolean r18 = r12.l(r15)
        L_0x00fc:
            if (r18 == 0) goto L_0x0101
            r18 = 4
            goto L_0x0103
        L_0x0101:
            r18 = 2
        L_0x0103:
            r18 = r10 | r18
            goto L_0x0108
        L_0x0106:
            r18 = r10
        L_0x0108:
            r27 = r10 & 48
            if (r27 != 0) goto L_0x0116
            boolean r27 = r12.l(r14)
            if (r27 == 0) goto L_0x0114
            r21 = r22
        L_0x0114:
            r18 = r18 | r21
        L_0x0116:
            r9 = r10 & 384(0x180, float:5.38E-43)
            if (r9 != 0) goto L_0x0124
            boolean r9 = r12.l(r13)
            if (r9 == 0) goto L_0x0122
            r23 = r24
        L_0x0122:
            r18 = r18 | r23
        L_0x0124:
            r9 = r10 & 3072(0xc00, float:4.305E-42)
            if (r9 != 0) goto L_0x0137
            r9 = r51
            boolean r21 = r12.W(r9)
            if (r21 == 0) goto L_0x0132
            r25 = 2048(0x800, float:2.87E-42)
        L_0x0132:
            r18 = r18 | r25
        L_0x0134:
            r4 = r18
            goto L_0x013a
        L_0x0137:
            r9 = r51
            goto L_0x0134
        L_0x013a:
            r18 = 306783379(0x12492493, float:6.34695E-28)
            r9 = r2 & r18
            r10 = 306783378(0x12492492, float:6.3469493E-28)
            if (r9 != r10) goto L_0x014e
            r9 = r4 & 1171(0x493, float:1.641E-42)
            r10 = 1170(0x492, float:1.64E-42)
            if (r9 == r10) goto L_0x014b
            goto L_0x014e
        L_0x014b:
            r9 = 0
        L_0x014c:
            r10 = 1
            goto L_0x0150
        L_0x014e:
            r9 = 1
            goto L_0x014c
        L_0x0150:
            r3 = r2 & 1
            boolean r3 = r12.E(r9, r3)
            if (r3 == 0) goto L_0x084c
            boolean r3 = androidx.compose.runtime.ComposerKt.P()
            if (r3 == 0) goto L_0x0166
            java.lang.String r3 = "androidx.compose.material3.TextFieldLayout (TextField.kt:671)"
            r9 = -1086465551(0xffffffffbf3dd9f1, float:-0.7416068)
            androidx.compose.runtime.ComposerKt.Y(r9, r2, r4, r3)
        L_0x0166:
            r3 = 0
            float r9 = androidx.compose.material3.internal.TextFieldImplKt.M(r12, r3)
            r3 = 234881024(0xe000000, float:1.5777218E-30)
            r3 = r3 & r2
            r10 = 67108864(0x4000000, float:1.5046328E-36)
            if (r3 != r10) goto L_0x0174
            r3 = 1
            goto L_0x0175
        L_0x0174:
            r3 = 0
        L_0x0175:
            r10 = 1879048192(0x70000000, float:1.58456325E29)
            r10 = r10 & r2
            r11 = 536870912(0x20000000, float:1.0842022E-19)
            if (r10 != r11) goto L_0x017e
            r10 = 1
            goto L_0x017f
        L_0x017e:
            r10 = 0
        L_0x017f:
            r3 = r3 | r10
            r11 = r4 & 14
            r10 = 4
            if (r11 == r10) goto L_0x0193
            r19 = r4 & 8
            if (r19 == 0) goto L_0x0190
            boolean r19 = r12.W(r15)
            if (r19 == 0) goto L_0x0190
            goto L_0x0193
        L_0x0190:
            r19 = 0
            goto L_0x0195
        L_0x0193:
            r19 = 1
        L_0x0195:
            r3 = r3 | r19
            r10 = r4 & 7168(0x1c00, float:1.0045E-41)
            r19 = r11
            r11 = 2048(0x800, float:2.87E-42)
            if (r10 != r11) goto L_0x01a1
            r10 = 1
            goto L_0x01a2
        L_0x01a1:
            r10 = 0
        L_0x01a2:
            r3 = r3 | r10
            boolean r10 = r12.h(r9)
            r3 = r3 | r10
            java.lang.Object r10 = r12.g()
            if (r3 != 0) goto L_0x01bc
            androidx.compose.runtime.Composer$Companion r3 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r3 = r3.a()
            if (r10 != r3) goto L_0x01b7
            goto L_0x01bc
        L_0x01b7:
            r9 = r12
            r0 = r14
            r28 = r19
            goto L_0x01df
        L_0x01bc:
            androidx.compose.material3.TextFieldMeasurePolicy r3 = new androidx.compose.material3.TextFieldMeasurePolicy
            r21 = 0
            r16 = r9
            r10 = 4
            r11 = 1
            r9 = r3
            r10 = r46
            r28 = r19
            r11 = r47
            r29 = r12
            r12 = r48
            r13 = r51
            r0 = r14
            r14 = r16
            r15 = r21
            r9.<init>(r10, r11, r12, r13, r14, r15)
            r9 = r29
            r9.N(r3)
            r10 = r3
        L_0x01df:
            androidx.compose.material3.TextFieldMeasurePolicy r10 = (androidx.compose.material3.TextFieldMeasurePolicy) r10
            androidx.compose.runtime.ProvidableCompositionLocal r3 = androidx.compose.ui.platform.CompositionLocalsKt.m()
            java.lang.Object r3 = r9.C(r3)
            androidx.compose.ui.unit.LayoutDirection r3 = (androidx.compose.ui.unit.LayoutDirection) r3
            r11 = 0
            int r12 = androidx.compose.runtime.ComposablesKt.a(r9, r11)
            androidx.compose.runtime.CompositionLocalMap r11 = r9.I()
            androidx.compose.ui.Modifier r13 = androidx.compose.ui.ComposedModifierKt.e(r9, r1)
            androidx.compose.ui.node.ComposeUiNode$Companion r14 = androidx.compose.ui.node.ComposeUiNode.f17222h
            kotlin.jvm.functions.Function0 r15 = r14.a()
            androidx.compose.runtime.Applier r16 = r9.v()
            if (r16 != 0) goto L_0x0207
            androidx.compose.runtime.ComposablesKt.d()
        L_0x0207:
            r9.s()
            boolean r16 = r9.n()
            if (r16 == 0) goto L_0x0214
            r9.y(r15)
            goto L_0x0217
        L_0x0214:
            r9.K()
        L_0x0217:
            androidx.compose.runtime.Composer r15 = androidx.compose.runtime.Updater.b(r9)
            kotlin.jvm.functions.Function2 r1 = r14.c()
            androidx.compose.runtime.Updater.g(r15, r10, r1)
            kotlin.jvm.functions.Function2 r1 = r14.e()
            androidx.compose.runtime.Updater.g(r15, r11, r1)
            kotlin.jvm.functions.Function2 r1 = r14.b()
            boolean r10 = r15.n()
            if (r10 != 0) goto L_0x0241
            java.lang.Object r10 = r15.g()
            java.lang.Integer r11 = java.lang.Integer.valueOf(r12)
            boolean r10 = kotlin.jvm.internal.Intrinsics.d(r10, r11)
            if (r10 != 0) goto L_0x024f
        L_0x0241:
            java.lang.Integer r10 = java.lang.Integer.valueOf(r12)
            r15.N(r10)
            java.lang.Integer r10 = java.lang.Integer.valueOf(r12)
            r15.A(r10, r1)
        L_0x024f:
            kotlin.jvm.functions.Function2 r1 = r14.d()
            androidx.compose.runtime.Updater.g(r15, r13, r1)
            r1 = 3
            int r10 = r4 >> 3
            r10 = r10 & 14
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            r0.m(r9, r10)
            if (r5 == 0) goto L_0x02fd
            r10 = -1445181094(0xffffffffa9dc495a, float:-9.782687E-14)
            r9.X(r10)
            androidx.compose.ui.Modifier$Companion r10 = androidx.compose.ui.Modifier.f15489d
            java.lang.String r11 = "Leading"
            androidx.compose.ui.Modifier r10 = androidx.compose.ui.layout.LayoutIdKt.b(r10, r11)
            androidx.compose.ui.Modifier r10 = androidx.compose.material3.InteractiveComponentSizeKt.h(r10)
            androidx.compose.ui.Alignment$Companion r11 = androidx.compose.ui.Alignment.f15444a
            androidx.compose.ui.Alignment r11 = r11.e()
            r12 = 0
            androidx.compose.ui.layout.MeasurePolicy r11 = androidx.compose.foundation.layout.BoxKt.g(r11, r12)
            int r13 = androidx.compose.runtime.ComposablesKt.a(r9, r12)
            androidx.compose.runtime.CompositionLocalMap r12 = r9.I()
            androidx.compose.ui.Modifier r10 = androidx.compose.ui.ComposedModifierKt.e(r9, r10)
            kotlin.jvm.functions.Function0 r15 = r14.a()
            androidx.compose.runtime.Applier r16 = r9.v()
            if (r16 != 0) goto L_0x029a
            androidx.compose.runtime.ComposablesKt.d()
        L_0x029a:
            r9.s()
            boolean r16 = r9.n()
            if (r16 == 0) goto L_0x02a7
            r9.y(r15)
            goto L_0x02aa
        L_0x02a7:
            r9.K()
        L_0x02aa:
            androidx.compose.runtime.Composer r15 = androidx.compose.runtime.Updater.b(r9)
            kotlin.jvm.functions.Function2 r1 = r14.c()
            androidx.compose.runtime.Updater.g(r15, r11, r1)
            kotlin.jvm.functions.Function2 r1 = r14.e()
            androidx.compose.runtime.Updater.g(r15, r12, r1)
            kotlin.jvm.functions.Function2 r1 = r14.b()
            boolean r11 = r15.n()
            if (r11 != 0) goto L_0x02d4
            java.lang.Object r11 = r15.g()
            java.lang.Integer r12 = java.lang.Integer.valueOf(r13)
            boolean r11 = kotlin.jvm.internal.Intrinsics.d(r11, r12)
            if (r11 != 0) goto L_0x02e2
        L_0x02d4:
            java.lang.Integer r11 = java.lang.Integer.valueOf(r13)
            r15.N(r11)
            java.lang.Integer r11 = java.lang.Integer.valueOf(r13)
            r15.A(r11, r1)
        L_0x02e2:
            kotlin.jvm.functions.Function2 r1 = r14.d()
            androidx.compose.runtime.Updater.g(r15, r10, r1)
            androidx.compose.foundation.layout.BoxScopeInstance r1 = androidx.compose.foundation.layout.BoxScopeInstance.f3797a
            int r1 = r2 >> 12
            r1 = r1 & 14
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r5.m(r9, r1)
            r9.T()
            r9.M()
            goto L_0x0306
        L_0x02fd:
            r1 = -1444935078(0xffffffffa9e00a5a, float:-9.949394E-14)
            r9.X(r1)
            r9.M()
        L_0x0306:
            if (r6 == 0) goto L_0x03a3
            r1 = -1444892360(0xffffffffa9e0b138, float:-9.978341E-14)
            r9.X(r1)
            androidx.compose.ui.Modifier$Companion r1 = androidx.compose.ui.Modifier.f15489d
            java.lang.String r10 = "Trailing"
            androidx.compose.ui.Modifier r1 = androidx.compose.ui.layout.LayoutIdKt.b(r1, r10)
            androidx.compose.ui.Modifier r1 = androidx.compose.material3.InteractiveComponentSizeKt.h(r1)
            androidx.compose.ui.Alignment$Companion r10 = androidx.compose.ui.Alignment.f15444a
            androidx.compose.ui.Alignment r10 = r10.e()
            r11 = 0
            androidx.compose.ui.layout.MeasurePolicy r10 = androidx.compose.foundation.layout.BoxKt.g(r10, r11)
            int r12 = androidx.compose.runtime.ComposablesKt.a(r9, r11)
            androidx.compose.runtime.CompositionLocalMap r11 = r9.I()
            androidx.compose.ui.Modifier r1 = androidx.compose.ui.ComposedModifierKt.e(r9, r1)
            kotlin.jvm.functions.Function0 r13 = r14.a()
            androidx.compose.runtime.Applier r15 = r9.v()
            if (r15 != 0) goto L_0x033e
            androidx.compose.runtime.ComposablesKt.d()
        L_0x033e:
            r9.s()
            boolean r15 = r9.n()
            if (r15 == 0) goto L_0x034b
            r9.y(r13)
            goto L_0x034e
        L_0x034b:
            r9.K()
        L_0x034e:
            androidx.compose.runtime.Composer r13 = androidx.compose.runtime.Updater.b(r9)
            kotlin.jvm.functions.Function2 r15 = r14.c()
            androidx.compose.runtime.Updater.g(r13, r10, r15)
            kotlin.jvm.functions.Function2 r10 = r14.e()
            androidx.compose.runtime.Updater.g(r13, r11, r10)
            kotlin.jvm.functions.Function2 r10 = r14.b()
            boolean r11 = r13.n()
            if (r11 != 0) goto L_0x0378
            java.lang.Object r11 = r13.g()
            java.lang.Integer r15 = java.lang.Integer.valueOf(r12)
            boolean r11 = kotlin.jvm.internal.Intrinsics.d(r11, r15)
            if (r11 != 0) goto L_0x0386
        L_0x0378:
            java.lang.Integer r11 = java.lang.Integer.valueOf(r12)
            r13.N(r11)
            java.lang.Integer r11 = java.lang.Integer.valueOf(r12)
            r13.A(r11, r10)
        L_0x0386:
            kotlin.jvm.functions.Function2 r10 = r14.d()
            androidx.compose.runtime.Updater.g(r13, r1, r10)
            androidx.compose.foundation.layout.BoxScopeInstance r1 = androidx.compose.foundation.layout.BoxScopeInstance.f3797a
            int r1 = r2 >> 15
            r1 = r1 & 14
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r6.m(r9, r1)
            r9.T()
            r9.M()
        L_0x03a0:
            r15 = r51
            goto L_0x03ad
        L_0x03a3:
            r1 = -1444644422(0xffffffffa9e479ba, float:-1.014635E-13)
            r9.X(r1)
            r9.M()
            goto L_0x03a0
        L_0x03ad:
            float r1 = androidx.compose.foundation.layout.PaddingKt.g(r15, r3)
            float r3 = androidx.compose.foundation.layout.PaddingKt.f(r15, r3)
            r10 = 0
            float r11 = androidx.compose.material3.internal.TextFieldImplKt.Q(r9, r10)
            if (r5 == 0) goto L_0x03ce
            float r1 = r1 - r11
            float r1 = androidx.compose.ui.unit.Dp.m(r1)
            float r12 = (float) r10
            float r12 = androidx.compose.ui.unit.Dp.m(r12)
            float r1 = kotlin.ranges.RangesKt.d(r1, r12)
            float r1 = androidx.compose.ui.unit.Dp.m(r1)
        L_0x03ce:
            if (r6 == 0) goto L_0x03e2
            float r3 = r3 - r11
            float r3 = androidx.compose.ui.unit.Dp.m(r3)
            float r11 = (float) r10
            float r10 = androidx.compose.ui.unit.Dp.m(r11)
            float r3 = kotlin.ranges.RangesKt.d(r3, r10)
            float r3 = androidx.compose.ui.unit.Dp.m(r3)
        L_0x03e2:
            r10 = 0
            r11 = 0
            if (r7 == 0) goto L_0x049c
            r12 = -1443868027(0xffffffffa9f05285, float:-1.0672456E-13)
            r9.X(r12)
            androidx.compose.ui.Modifier$Companion r12 = androidx.compose.ui.Modifier.f15489d
            java.lang.String r13 = "Prefix"
            androidx.compose.ui.Modifier r12 = androidx.compose.ui.layout.LayoutIdKt.b(r12, r13)
            float r13 = androidx.compose.material3.internal.TextFieldImplKt.G()
            r0 = 2
            androidx.compose.ui.Modifier r12 = androidx.compose.foundation.layout.SizeKt.k(r12, r13, r10, r0, r11)
            r0 = 3
            r13 = 0
            androidx.compose.ui.Modifier r18 = androidx.compose.foundation.layout.SizeKt.C(r12, r11, r13, r0, r11)
            float r21 = androidx.compose.material3.internal.TextFieldImplKt.I()
            r23 = 10
            r24 = 0
            r20 = 0
            r22 = 0
            r19 = r1
            androidx.compose.ui.Modifier r0 = androidx.compose.foundation.layout.PaddingKt.m(r18, r19, r20, r21, r22, r23, r24)
            androidx.compose.ui.Alignment$Companion r12 = androidx.compose.ui.Alignment.f15444a
            androidx.compose.ui.Alignment r12 = r12.o()
            r13 = 0
            androidx.compose.ui.layout.MeasurePolicy r12 = androidx.compose.foundation.layout.BoxKt.g(r12, r13)
            int r16 = androidx.compose.runtime.ComposablesKt.a(r9, r13)
            androidx.compose.runtime.CompositionLocalMap r13 = r9.I()
            androidx.compose.ui.Modifier r0 = androidx.compose.ui.ComposedModifierKt.e(r9, r0)
            kotlin.jvm.functions.Function0 r10 = r14.a()
            androidx.compose.runtime.Applier r18 = r9.v()
            if (r18 != 0) goto L_0x0439
            androidx.compose.runtime.ComposablesKt.d()
        L_0x0439:
            r9.s()
            boolean r18 = r9.n()
            if (r18 == 0) goto L_0x0446
            r9.y(r10)
            goto L_0x0449
        L_0x0446:
            r9.K()
        L_0x0449:
            androidx.compose.runtime.Composer r10 = androidx.compose.runtime.Updater.b(r9)
            kotlin.jvm.functions.Function2 r11 = r14.c()
            androidx.compose.runtime.Updater.g(r10, r12, r11)
            kotlin.jvm.functions.Function2 r11 = r14.e()
            androidx.compose.runtime.Updater.g(r10, r13, r11)
            kotlin.jvm.functions.Function2 r11 = r14.b()
            boolean r12 = r10.n()
            if (r12 != 0) goto L_0x0473
            java.lang.Object r12 = r10.g()
            java.lang.Integer r13 = java.lang.Integer.valueOf(r16)
            boolean r12 = kotlin.jvm.internal.Intrinsics.d(r12, r13)
            if (r12 != 0) goto L_0x0481
        L_0x0473:
            java.lang.Integer r12 = java.lang.Integer.valueOf(r16)
            r10.N(r12)
            java.lang.Integer r12 = java.lang.Integer.valueOf(r16)
            r10.A(r12, r11)
        L_0x0481:
            kotlin.jvm.functions.Function2 r11 = r14.d()
            androidx.compose.runtime.Updater.g(r10, r0, r11)
            androidx.compose.foundation.layout.BoxScopeInstance r0 = androidx.compose.foundation.layout.BoxScopeInstance.f3797a
            int r0 = r2 >> 18
            r0 = r0 & 14
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r7.m(r9, r0)
            r9.T()
            r9.M()
            goto L_0x04a5
        L_0x049c:
            r0 = -1443540326(0xffffffffa9f5529a, float:-1.0894515E-13)
            r9.X(r0)
            r9.M()
        L_0x04a5:
            if (r8 == 0) goto L_0x0561
            r0 = -1443497081(0xffffffffa9f5fb87, float:-1.0923819E-13)
            r9.X(r0)
            androidx.compose.ui.Modifier$Companion r0 = androidx.compose.ui.Modifier.f15489d
            java.lang.String r10 = "Suffix"
            androidx.compose.ui.Modifier r0 = androidx.compose.ui.layout.LayoutIdKt.b(r0, r10)
            float r10 = androidx.compose.material3.internal.TextFieldImplKt.G()
            r11 = 2
            r12 = 0
            r13 = 0
            androidx.compose.ui.Modifier r0 = androidx.compose.foundation.layout.SizeKt.k(r0, r10, r12, r11, r13)
            r10 = 0
            r11 = 3
            androidx.compose.ui.Modifier r18 = androidx.compose.foundation.layout.SizeKt.C(r0, r13, r10, r11, r13)
            float r19 = androidx.compose.material3.internal.TextFieldImplKt.I()
            r23 = 10
            r24 = 0
            r20 = 0
            r22 = 0
            r21 = r3
            androidx.compose.ui.Modifier r0 = androidx.compose.foundation.layout.PaddingKt.m(r18, r19, r20, r21, r22, r23, r24)
            androidx.compose.ui.Alignment$Companion r10 = androidx.compose.ui.Alignment.f15444a
            androidx.compose.ui.Alignment r10 = r10.o()
            r11 = 0
            androidx.compose.ui.layout.MeasurePolicy r10 = androidx.compose.foundation.layout.BoxKt.g(r10, r11)
            int r12 = androidx.compose.runtime.ComposablesKt.a(r9, r11)
            androidx.compose.runtime.CompositionLocalMap r13 = r9.I()
            androidx.compose.ui.Modifier r0 = androidx.compose.ui.ComposedModifierKt.e(r9, r0)
            kotlin.jvm.functions.Function0 r11 = r14.a()
            androidx.compose.runtime.Applier r16 = r9.v()
            if (r16 != 0) goto L_0x04fc
            androidx.compose.runtime.ComposablesKt.d()
        L_0x04fc:
            r9.s()
            boolean r16 = r9.n()
            if (r16 == 0) goto L_0x0509
            r9.y(r11)
            goto L_0x050c
        L_0x0509:
            r9.K()
        L_0x050c:
            androidx.compose.runtime.Composer r11 = androidx.compose.runtime.Updater.b(r9)
            kotlin.jvm.functions.Function2 r5 = r14.c()
            androidx.compose.runtime.Updater.g(r11, r10, r5)
            kotlin.jvm.functions.Function2 r5 = r14.e()
            androidx.compose.runtime.Updater.g(r11, r13, r5)
            kotlin.jvm.functions.Function2 r5 = r14.b()
            boolean r10 = r11.n()
            if (r10 != 0) goto L_0x0536
            java.lang.Object r10 = r11.g()
            java.lang.Integer r13 = java.lang.Integer.valueOf(r12)
            boolean r10 = kotlin.jvm.internal.Intrinsics.d(r10, r13)
            if (r10 != 0) goto L_0x0544
        L_0x0536:
            java.lang.Integer r10 = java.lang.Integer.valueOf(r12)
            r11.N(r10)
            java.lang.Integer r10 = java.lang.Integer.valueOf(r12)
            r11.A(r10, r5)
        L_0x0544:
            kotlin.jvm.functions.Function2 r5 = r14.d()
            androidx.compose.runtime.Updater.g(r11, r0, r5)
            androidx.compose.foundation.layout.BoxScopeInstance r0 = androidx.compose.foundation.layout.BoxScopeInstance.f3797a
            int r0 = r2 >> 21
            r0 = r0 & 14
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r8.m(r9, r0)
            r9.T()
            r9.M()
        L_0x055e:
            r0 = r47
            goto L_0x056b
        L_0x0561:
            r0 = -1443171302(0xffffffffa9faf41a, float:-1.1144575E-13)
            r9.X(r0)
            r9.M()
            goto L_0x055e
        L_0x056b:
            boolean r5 = r0 instanceof androidx.compose.material3.TextFieldLabelPosition.Above
            if (r5 == 0) goto L_0x058b
            androidx.compose.ui.Modifier$Companion r16 = androidx.compose.ui.Modifier.f15489d
            float r17 = androidx.compose.material3.internal.TextFieldImplKt.C()
            float r19 = androidx.compose.material3.internal.TextFieldImplKt.C()
            float r20 = androidx.compose.material3.internal.TextFieldImplKt.B()
            r21 = 2
            r22 = 0
            r18 = 0
            androidx.compose.ui.Modifier r5 = androidx.compose.foundation.layout.PaddingKt.m(r16, r17, r18, r19, r20, r21, r22)
        L_0x0587:
            r10 = r40
            r11 = 0
            goto L_0x059e
        L_0x058b:
            androidx.compose.ui.Modifier$Companion r16 = androidx.compose.ui.Modifier.f15489d
            r21 = 10
            r22 = 0
            r18 = 0
            r20 = 0
            r17 = r1
            r19 = r3
            androidx.compose.ui.Modifier r5 = androidx.compose.foundation.layout.PaddingKt.m(r16, r17, r18, r19, r20, r21, r22)
            goto L_0x0587
        L_0x059e:
            if (r10 == 0) goto L_0x0678
            r12 = -1442671489(0xffffffffaa02947f, float:-1.159784E-13)
            r9.X(r12)
            androidx.compose.ui.Modifier$Companion r12 = androidx.compose.ui.Modifier.f15489d
            java.lang.String r13 = "Label"
            androidx.compose.ui.Modifier r12 = androidx.compose.ui.layout.LayoutIdKt.b(r12, r13)
            r11 = r28
            r13 = 4
            if (r11 == r13) goto L_0x05c4
            r11 = r4 & 8
            if (r11 == 0) goto L_0x05c0
            r11 = r48
            boolean r13 = r9.l(r11)
            if (r13 == 0) goto L_0x05c2
            goto L_0x05c6
        L_0x05c0:
            r11 = r48
        L_0x05c2:
            r13 = 0
            goto L_0x05c7
        L_0x05c4:
            r11 = r48
        L_0x05c6:
            r13 = 1
        L_0x05c7:
            java.lang.Object r0 = r9.g()
            if (r13 != 0) goto L_0x05d5
            androidx.compose.runtime.Composer$Companion r13 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r13 = r13.a()
            if (r0 != r13) goto L_0x05dd
        L_0x05d5:
            androidx.compose.material3.e7 r0 = new androidx.compose.material3.e7
            r0.<init>(r11)
            r9.N(r0)
        L_0x05dd:
            kotlin.jvm.functions.Function0 r0 = (kotlin.jvm.functions.Function0) r0
            androidx.compose.ui.Modifier r0 = androidx.compose.material3.internal.TextFieldImplKt.R(r12, r0)
            r16 = r1
            r1 = 3
            r12 = 0
            r13 = 0
            androidx.compose.ui.Modifier r0 = androidx.compose.foundation.layout.SizeKt.C(r0, r13, r12, r1, r13)
            androidx.compose.ui.Modifier r0 = r0.o0(r5)
            androidx.compose.ui.Alignment$Companion r1 = androidx.compose.ui.Alignment.f15444a
            androidx.compose.ui.Alignment r1 = r1.o()
            androidx.compose.ui.layout.MeasurePolicy r1 = androidx.compose.foundation.layout.BoxKt.g(r1, r12)
            int r5 = androidx.compose.runtime.ComposablesKt.a(r9, r12)
            androidx.compose.runtime.CompositionLocalMap r12 = r9.I()
            androidx.compose.ui.Modifier r0 = androidx.compose.ui.ComposedModifierKt.e(r9, r0)
            kotlin.jvm.functions.Function0 r13 = r14.a()
            androidx.compose.runtime.Applier r18 = r9.v()
            if (r18 != 0) goto L_0x0613
            androidx.compose.runtime.ComposablesKt.d()
        L_0x0613:
            r9.s()
            boolean r18 = r9.n()
            if (r18 == 0) goto L_0x0620
            r9.y(r13)
            goto L_0x0623
        L_0x0620:
            r9.K()
        L_0x0623:
            androidx.compose.runtime.Composer r13 = androidx.compose.runtime.Updater.b(r9)
            r18 = r3
            kotlin.jvm.functions.Function2 r3 = r14.c()
            androidx.compose.runtime.Updater.g(r13, r1, r3)
            kotlin.jvm.functions.Function2 r1 = r14.e()
            androidx.compose.runtime.Updater.g(r13, r12, r1)
            kotlin.jvm.functions.Function2 r1 = r14.b()
            boolean r3 = r13.n()
            if (r3 != 0) goto L_0x064f
            java.lang.Object r3 = r13.g()
            java.lang.Integer r12 = java.lang.Integer.valueOf(r5)
            boolean r3 = kotlin.jvm.internal.Intrinsics.d(r3, r12)
            if (r3 != 0) goto L_0x065d
        L_0x064f:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r5)
            r13.N(r3)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r5)
            r13.A(r3, r1)
        L_0x065d:
            kotlin.jvm.functions.Function2 r1 = r14.d()
            androidx.compose.runtime.Updater.g(r13, r0, r1)
            androidx.compose.foundation.layout.BoxScopeInstance r0 = androidx.compose.foundation.layout.BoxScopeInstance.f3797a
            int r0 = r2 >> 6
            r0 = r0 & 14
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r10.m(r9, r0)
            r9.T()
            r9.M()
            goto L_0x0687
        L_0x0678:
            r11 = r48
            r16 = r1
            r18 = r3
            r0 = -1442276518(0xffffffffaa089b5a, float:-1.2133125E-13)
            r9.X(r0)
            r9.M()
        L_0x0687:
            androidx.compose.ui.Modifier$Companion r0 = androidx.compose.ui.Modifier.f15489d
            float r1 = androidx.compose.material3.internal.TextFieldImplKt.G()
            r3 = 2
            r5 = 0
            r12 = 0
            androidx.compose.ui.Modifier r1 = androidx.compose.foundation.layout.SizeKt.k(r0, r1, r5, r3, r12)
            r3 = 0
            r5 = 3
            androidx.compose.ui.Modifier r29 = androidx.compose.foundation.layout.SizeKt.C(r1, r12, r3, r5, r12)
            if (r7 != 0) goto L_0x069f
            r30 = r16
            goto L_0x06a6
        L_0x069f:
            float r1 = (float) r3
            float r1 = androidx.compose.ui.unit.Dp.m(r1)
            r30 = r1
        L_0x06a6:
            if (r8 != 0) goto L_0x06ab
            r32 = r18
            goto L_0x06b2
        L_0x06ab:
            float r1 = (float) r3
            float r3 = androidx.compose.ui.unit.Dp.m(r1)
            r32 = r3
        L_0x06b2:
            r34 = 10
            r35 = 0
            r31 = 0
            r33 = 0
            androidx.compose.ui.Modifier r1 = androidx.compose.foundation.layout.PaddingKt.m(r29, r30, r31, r32, r33, r34, r35)
            r18 = r4
            r4 = r41
            if (r4 == 0) goto L_0x06e3
            r3 = -1441906533(0xffffffffaa0e409b, float:-1.2634548E-13)
            r9.X(r3)
            java.lang.String r3 = "Hint"
            androidx.compose.ui.Modifier r3 = androidx.compose.ui.layout.LayoutIdKt.b(r0, r3)
            androidx.compose.ui.Modifier r3 = r3.o0(r1)
            int r5 = r2 >> 6
            r5 = r5 & 112(0x70, float:1.57E-43)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r4.d(r3, r9, r5)
            r9.M()
            goto L_0x06ec
        L_0x06e3:
            r3 = -1441815238(0xffffffffaa0fa53a, float:-1.2758276E-13)
            r9.X(r3)
            r9.M()
        L_0x06ec:
            java.lang.String r3 = "TextField"
            androidx.compose.ui.Modifier r3 = androidx.compose.ui.layout.LayoutIdKt.b(r0, r3)
            androidx.compose.ui.Modifier r1 = r3.o0(r1)
            androidx.compose.ui.Alignment$Companion r3 = androidx.compose.ui.Alignment.f15444a
            androidx.compose.ui.Alignment r5 = r3.o()
            r12 = 1
            androidx.compose.ui.layout.MeasurePolicy r5 = androidx.compose.foundation.layout.BoxKt.g(r5, r12)
            r12 = 0
            int r13 = androidx.compose.runtime.ComposablesKt.a(r9, r12)
            androidx.compose.runtime.CompositionLocalMap r12 = r9.I()
            androidx.compose.ui.Modifier r1 = androidx.compose.ui.ComposedModifierKt.e(r9, r1)
            kotlin.jvm.functions.Function0 r4 = r14.a()
            androidx.compose.runtime.Applier r16 = r9.v()
            if (r16 != 0) goto L_0x071b
            androidx.compose.runtime.ComposablesKt.d()
        L_0x071b:
            r9.s()
            boolean r16 = r9.n()
            if (r16 == 0) goto L_0x0728
            r9.y(r4)
            goto L_0x072b
        L_0x0728:
            r9.K()
        L_0x072b:
            androidx.compose.runtime.Composer r4 = androidx.compose.runtime.Updater.b(r9)
            kotlin.jvm.functions.Function2 r6 = r14.c()
            androidx.compose.runtime.Updater.g(r4, r5, r6)
            kotlin.jvm.functions.Function2 r5 = r14.e()
            androidx.compose.runtime.Updater.g(r4, r12, r5)
            kotlin.jvm.functions.Function2 r5 = r14.b()
            boolean r6 = r4.n()
            if (r6 != 0) goto L_0x0755
            java.lang.Object r6 = r4.g()
            java.lang.Integer r12 = java.lang.Integer.valueOf(r13)
            boolean r6 = kotlin.jvm.internal.Intrinsics.d(r6, r12)
            if (r6 != 0) goto L_0x0763
        L_0x0755:
            java.lang.Integer r6 = java.lang.Integer.valueOf(r13)
            r4.N(r6)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r13)
            r4.A(r6, r5)
        L_0x0763:
            kotlin.jvm.functions.Function2 r5 = r14.d()
            androidx.compose.runtime.Updater.g(r4, r1, r5)
            androidx.compose.foundation.layout.BoxScopeInstance r1 = androidx.compose.foundation.layout.BoxScopeInstance.f3797a
            r1 = 3
            int r2 = r2 >> r1
            r1 = r2 & 14
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2 = r39
            r2.m(r9, r1)
            r9.T()
            r13 = r50
            if (r13 == 0) goto L_0x0836
            r1 = -1441566587(0xffffffffaa137085, float:-1.3095261E-13)
            r9.X(r1)
            java.lang.String r1 = "Supporting"
            androidx.compose.ui.Modifier r0 = androidx.compose.ui.layout.LayoutIdKt.b(r0, r1)
            float r1 = androidx.compose.material3.internal.TextFieldImplKt.F()
            r4 = 2
            r5 = 0
            r6 = 0
            androidx.compose.ui.Modifier r0 = androidx.compose.foundation.layout.SizeKt.k(r0, r1, r5, r4, r6)
            r1 = 0
            r4 = 3
            androidx.compose.ui.Modifier r0 = androidx.compose.foundation.layout.SizeKt.C(r0, r6, r1, r4, r6)
            androidx.compose.material3.TextFieldDefaults r19 = androidx.compose.material3.TextFieldDefaults.f11367a
            r24 = 15
            r25 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            androidx.compose.foundation.layout.PaddingValues r1 = androidx.compose.material3.TextFieldDefaults.v(r19, r20, r21, r22, r23, r24, r25)
            androidx.compose.ui.Modifier r0 = androidx.compose.foundation.layout.PaddingKt.h(r0, r1)
            androidx.compose.ui.Alignment r1 = r3.o()
            r3 = 0
            androidx.compose.ui.layout.MeasurePolicy r1 = androidx.compose.foundation.layout.BoxKt.g(r1, r3)
            int r3 = androidx.compose.runtime.ComposablesKt.a(r9, r3)
            androidx.compose.runtime.CompositionLocalMap r4 = r9.I()
            androidx.compose.ui.Modifier r0 = androidx.compose.ui.ComposedModifierKt.e(r9, r0)
            kotlin.jvm.functions.Function0 r5 = r14.a()
            androidx.compose.runtime.Applier r6 = r9.v()
            if (r6 != 0) goto L_0x07d5
            androidx.compose.runtime.ComposablesKt.d()
        L_0x07d5:
            r9.s()
            boolean r6 = r9.n()
            if (r6 == 0) goto L_0x07e2
            r9.y(r5)
            goto L_0x07e5
        L_0x07e2:
            r9.K()
        L_0x07e5:
            androidx.compose.runtime.Composer r5 = androidx.compose.runtime.Updater.b(r9)
            kotlin.jvm.functions.Function2 r6 = r14.c()
            androidx.compose.runtime.Updater.g(r5, r1, r6)
            kotlin.jvm.functions.Function2 r1 = r14.e()
            androidx.compose.runtime.Updater.g(r5, r4, r1)
            kotlin.jvm.functions.Function2 r1 = r14.b()
            boolean r4 = r5.n()
            if (r4 != 0) goto L_0x080f
            java.lang.Object r4 = r5.g()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r3)
            boolean r4 = kotlin.jvm.internal.Intrinsics.d(r4, r6)
            if (r4 != 0) goto L_0x081d
        L_0x080f:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)
            r5.N(r4)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r5.A(r3, r1)
        L_0x081d:
            kotlin.jvm.functions.Function2 r1 = r14.d()
            androidx.compose.runtime.Updater.g(r5, r0, r1)
            int r0 = r18 >> 6
            r0 = r0 & 14
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r13.m(r9, r0)
            r9.T()
            r9.M()
            goto L_0x083f
        L_0x0836:
            r0 = -1441177382(0xffffffffaa1960da, float:-1.3622732E-13)
            r9.X(r0)
            r9.M()
        L_0x083f:
            r9.T()
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x0857
            androidx.compose.runtime.ComposerKt.X()
            goto L_0x0857
        L_0x084c:
            r2 = r39
            r10 = r40
            r9 = r12
            r11 = r15
            r15 = r51
            r9.B()
        L_0x0857:
            androidx.compose.runtime.ScopeUpdateScope r14 = r9.x()
            if (r14 == 0) goto L_0x088e
            androidx.compose.material3.f7 r12 = new androidx.compose.material3.f7
            r0 = r12
            r1 = r38
            r2 = r39
            r3 = r40
            r4 = r41
            r5 = r42
            r6 = r43
            r7 = r44
            r8 = r45
            r9 = r46
            r10 = r47
            r11 = r48
            r36 = r12
            r12 = r49
            r13 = r50
            r37 = r14
            r14 = r51
            r15 = r53
            r16 = r54
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            r1 = r36
            r0 = r37
            r0.a(r1)
        L_0x088e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.TextFieldKt.c(androidx.compose.ui.Modifier, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function3, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, boolean, androidx.compose.material3.TextFieldLabelPosition, androidx.compose.material3.internal.FloatProducer, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, androidx.compose.foundation.layout.PaddingValues, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final Dp d(FloatProducer floatProducer) {
        return Dp.j(DpKt.c(TextFieldImplKt.G(), TextFieldImplKt.E(), floatProducer.invoke()));
    }

    public static final Unit e(Modifier modifier, Function2 function2, Function2 function22, Function3 function3, Function2 function23, Function2 function24, Function2 function25, Function2 function26, boolean z2, TextFieldLabelPosition textFieldLabelPosition, FloatProducer floatProducer, Function2 function27, Function2 function28, PaddingValues paddingValues, int i2, int i3, Composer composer, int i4) {
        c(modifier, function2, function22, function3, function23, function24, function25, function26, z2, textFieldLabelPosition, floatProducer, function27, function28, paddingValues, composer, RecomposeScopeImplKt.a(i2 | 1), RecomposeScopeImplKt.a(i3));
        return Unit.f40552a;
    }

    public static final float f() {
        return f11399a;
    }
}
