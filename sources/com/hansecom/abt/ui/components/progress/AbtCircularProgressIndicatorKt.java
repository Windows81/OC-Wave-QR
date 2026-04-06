package com.hansecom.abt.ui.components.progress;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class AbtCircularProgressIndicatorKt {
    /* JADX WARNING: Removed duplicated region for block: B:106:0x01aa  */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x01f0  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x0125  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x013e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void e(androidx.compose.ui.Modifier r24, long r25, float r27, long r28, int r30, androidx.compose.runtime.Composer r31, int r32, int r33) {
        /*
            r8 = r32
            r0 = 2027697504(0x78dc3560, float:3.5730871E34)
            r1 = r31
            androidx.compose.runtime.Composer r1 = r1.q(r0)
            r2 = r33 & 1
            if (r2 == 0) goto L_0x0015
            r3 = r8 | 6
            r4 = r3
            r3 = r24
            goto L_0x0029
        L_0x0015:
            r3 = r8 & 6
            if (r3 != 0) goto L_0x0026
            r3 = r24
            boolean r4 = r1.W(r3)
            if (r4 == 0) goto L_0x0023
            r4 = 4
            goto L_0x0024
        L_0x0023:
            r4 = 2
        L_0x0024:
            r4 = r4 | r8
            goto L_0x0029
        L_0x0026:
            r3 = r24
            r4 = r8
        L_0x0029:
            r5 = r8 & 48
            if (r5 != 0) goto L_0x0042
            r5 = r33 & 2
            if (r5 != 0) goto L_0x003c
            r5 = r25
            boolean r7 = r1.j(r5)
            if (r7 == 0) goto L_0x003e
            r7 = 32
            goto L_0x0040
        L_0x003c:
            r5 = r25
        L_0x003e:
            r7 = 16
        L_0x0040:
            r4 = r4 | r7
            goto L_0x0044
        L_0x0042:
            r5 = r25
        L_0x0044:
            r7 = r8 & 384(0x180, float:5.38E-43)
            if (r7 != 0) goto L_0x005d
            r7 = r33 & 4
            if (r7 != 0) goto L_0x0057
            r7 = r27
            boolean r9 = r1.h(r7)
            if (r9 == 0) goto L_0x0059
            r9 = 256(0x100, float:3.59E-43)
            goto L_0x005b
        L_0x0057:
            r7 = r27
        L_0x0059:
            r9 = 128(0x80, float:1.794E-43)
        L_0x005b:
            r4 = r4 | r9
            goto L_0x005f
        L_0x005d:
            r7 = r27
        L_0x005f:
            r9 = r8 & 3072(0xc00, float:4.305E-42)
            if (r9 != 0) goto L_0x0078
            r9 = r33 & 8
            if (r9 != 0) goto L_0x0072
            r9 = r28
            boolean r11 = r1.j(r9)
            if (r11 == 0) goto L_0x0074
            r11 = 2048(0x800, float:2.87E-42)
            goto L_0x0076
        L_0x0072:
            r9 = r28
        L_0x0074:
            r11 = 1024(0x400, float:1.435E-42)
        L_0x0076:
            r4 = r4 | r11
            goto L_0x007a
        L_0x0078:
            r9 = r28
        L_0x007a:
            r11 = r8 & 24576(0x6000, float:3.4438E-41)
            if (r11 != 0) goto L_0x0093
            r11 = r33 & 16
            if (r11 != 0) goto L_0x008d
            r11 = r30
            boolean r12 = r1.i(r11)
            if (r12 == 0) goto L_0x008f
            r12 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0091
        L_0x008d:
            r11 = r30
        L_0x008f:
            r12 = 8192(0x2000, float:1.14794E-41)
        L_0x0091:
            r4 = r4 | r12
            goto L_0x0095
        L_0x0093:
            r11 = r30
        L_0x0095:
            r12 = r4 & 9363(0x2493, float:1.312E-41)
            r13 = 9362(0x2492, float:1.3119E-41)
            if (r12 != r13) goto L_0x00aa
            boolean r12 = r1.t()
            if (r12 != 0) goto L_0x00a2
            goto L_0x00aa
        L_0x00a2:
            r1.B()
            r2 = r3
            r4 = r7
            r7 = r11
            goto L_0x01f7
        L_0x00aa:
            r1.p()
            r12 = r8 & 1
            r13 = -57345(0xffffffffffff1fff, float:NaN)
            if (r12 == 0) goto L_0x00de
            boolean r12 = r1.J()
            if (r12 == 0) goto L_0x00bb
            goto L_0x00de
        L_0x00bb:
            r1.B()
            r2 = r33 & 2
            if (r2 == 0) goto L_0x00c4
            r4 = r4 & -113(0xffffffffffffff8f, float:NaN)
        L_0x00c4:
            r2 = r33 & 4
            if (r2 == 0) goto L_0x00ca
            r4 = r4 & -897(0xfffffffffffffc7f, float:NaN)
        L_0x00ca:
            r2 = r33 & 8
            if (r2 == 0) goto L_0x00d0
            r4 = r4 & -7169(0xffffffffffffe3ff, float:NaN)
        L_0x00d0:
            r2 = r33 & 16
            if (r2 == 0) goto L_0x00d5
            r4 = r4 & r13
        L_0x00d5:
            r2 = r3
        L_0x00d6:
            r21 = r11
        L_0x00d8:
            r22 = r9
            r9 = r4
            r3 = r22
            goto L_0x011c
        L_0x00de:
            if (r2 == 0) goto L_0x00e3
            androidx.compose.ui.Modifier$Companion r2 = androidx.compose.ui.Modifier.f15489d
            goto L_0x00e4
        L_0x00e3:
            r2 = r3
        L_0x00e4:
            r3 = r33 & 2
            if (r3 == 0) goto L_0x00f2
            androidx.compose.material3.ProgressIndicatorDefaults r3 = androidx.compose.material3.ProgressIndicatorDefaults.f10620a
            int r5 = androidx.compose.material3.ProgressIndicatorDefaults.f10629j
            long r5 = r3.c(r1, r5)
            r4 = r4 & -113(0xffffffffffffff8f, float:NaN)
        L_0x00f2:
            r3 = r33 & 4
            if (r3 == 0) goto L_0x00ff
            androidx.compose.material3.ProgressIndicatorDefaults r3 = androidx.compose.material3.ProgressIndicatorDefaults.f10620a
            float r3 = r3.i()
            r4 = r4 & -897(0xfffffffffffffc7f, float:NaN)
            r7 = r3
        L_0x00ff:
            r3 = r33 & 8
            if (r3 == 0) goto L_0x010e
            androidx.compose.material3.ProgressIndicatorDefaults r3 = androidx.compose.material3.ProgressIndicatorDefaults.f10620a
            int r9 = androidx.compose.material3.ProgressIndicatorDefaults.f10629j
            long r9 = r3.g(r1, r9)
            r3 = r4 & -7169(0xffffffffffffe3ff, float:NaN)
            r4 = r3
        L_0x010e:
            r3 = r33 & 16
            if (r3 == 0) goto L_0x00d6
            androidx.compose.material3.ProgressIndicatorDefaults r3 = androidx.compose.material3.ProgressIndicatorDefaults.f10620a
            int r3 = r3.f()
            r4 = r4 & r13
            r21 = r3
            goto L_0x00d8
        L_0x011c:
            r1.U()
            boolean r10 = androidx.compose.runtime.ComposerKt.P()
            if (r10 == 0) goto L_0x012b
            r10 = -1
            java.lang.String r11 = "com.hansecom.abt.ui.components.progress.AbtCircularProgressIndicator (AbtCircularProgressIndicator.kt:23)"
            androidx.compose.runtime.ComposerKt.Y(r0, r9, r10, r11)
        L_0x012b:
            androidx.compose.runtime.ProvidableCompositionLocal r0 = androidx.compose.ui.platform.InspectionModeKt.a()
            java.lang.Object r0 = r1.C(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r10 = 0
            r11 = 0
            r12 = 1
            if (r0 == 0) goto L_0x01aa
            r0 = -1965032439(0xffffffff8adffc09, float:-2.1568924E-32)
            r1.X(r0)
            r0 = 213707641(0xcbceb79, float:2.9107706E-31)
            r1.X(r0)
            java.lang.Object r0 = r1.g()
            androidx.compose.runtime.Composer$Companion r13 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r14 = r13.a()
            if (r0 != r14) goto L_0x015e
            com.hansecom.abt.ui.components.progress.a r0 = new com.hansecom.abt.ui.components.progress.a
            r0.<init>()
            r1.N(r0)
        L_0x015e:
            kotlin.jvm.functions.Function0 r0 = (kotlin.jvm.functions.Function0) r0
            r1.M()
            r14 = 213708855(0xcbcf037, float:2.911056E-31)
            r1.X(r14)
            java.lang.Object r14 = r1.g()
            java.lang.Object r13 = r13.a()
            if (r14 != r13) goto L_0x017b
            com.hansecom.abt.ui.components.progress.b r14 = new com.hansecom.abt.ui.components.progress.b
            r14.<init>()
            r1.N(r14)
        L_0x017b:
            kotlin.jvm.functions.Function1 r14 = (kotlin.jvm.functions.Function1) r14
            r1.M()
            androidx.compose.ui.Modifier r10 = androidx.compose.ui.semantics.SemanticsModifierKt.d(r2, r11, r14, r12, r10)
            int r9 = r9 << 3
            r11 = r9 & 896(0x380, float:1.256E-42)
            r11 = r11 | 6
            r12 = r9 & 7168(0x1c00, float:1.0045E-41)
            r11 = r11 | r12
            r12 = 57344(0xe000, float:8.0356E-41)
            r12 = r12 & r9
            r11 = r11 | r12
            r12 = 458752(0x70000, float:6.42848E-40)
            r9 = r9 & r12
            r19 = r11 | r9
            r20 = 64
            r17 = 0
            r9 = r0
            r11 = r5
            r13 = r7
            r14 = r3
            r16 = r21
            r18 = r1
            androidx.compose.material3.ProgressIndicatorKt.o(r9, r10, r11, r13, r14, r16, r17, r18, r19, r20)
            r1.M()
            goto L_0x01ea
        L_0x01aa:
            r0 = -1964828645(0xffffffff8ae3181b, float:-2.1868372E-32)
            r1.X(r0)
            r0 = 213714871(0xcbd07b7, float:2.9124704E-31)
            r1.X(r0)
            java.lang.Object r0 = r1.g()
            androidx.compose.runtime.Composer$Companion r13 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r13 = r13.a()
            if (r0 != r13) goto L_0x01ca
            com.hansecom.abt.ui.components.progress.c r0 = new com.hansecom.abt.ui.components.progress.c
            r0.<init>()
            r1.N(r0)
        L_0x01ca:
            kotlin.jvm.functions.Function1 r0 = (kotlin.jvm.functions.Function1) r0
            r1.M()
            androidx.compose.ui.Modifier r0 = androidx.compose.ui.semantics.SemanticsModifierKt.d(r2, r11, r0, r12, r10)
            r10 = 65520(0xfff0, float:9.1813E-41)
            r18 = r9 & r10
            r19 = 32
            r16 = 0
            r9 = r0
            r10 = r5
            r12 = r7
            r13 = r3
            r15 = r21
            r17 = r1
            androidx.compose.material3.ProgressIndicatorKt.n(r9, r10, r12, r13, r15, r16, r17, r18, r19)
            r1.M()
        L_0x01ea:
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x01f3
            androidx.compose.runtime.ComposerKt.X()
        L_0x01f3:
            r9 = r3
            r4 = r7
            r7 = r21
        L_0x01f7:
            androidx.compose.runtime.ScopeUpdateScope r11 = r1.x()
            if (r11 == 0) goto L_0x020d
            com.hansecom.abt.ui.components.progress.d r12 = new com.hansecom.abt.ui.components.progress.d
            r0 = r12
            r1 = r2
            r2 = r5
            r5 = r9
            r8 = r32
            r9 = r33
            r0.<init>(r1, r2, r4, r5, r7, r8, r9)
            r11.a(r12)
        L_0x020d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.ui.components.progress.AbtCircularProgressIndicatorKt.e(androidx.compose.ui.Modifier, long, float, long, int, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final float f() {
        return 0.6f;
    }

    public static final Unit g(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        Intrinsics.i(semanticsPropertyReceiver, "$this$semantics");
        SemanticsPropertiesKt.y0(semanticsPropertyReceiver, "progress");
        return Unit.f40552a;
    }

    public static final Unit h(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        Intrinsics.i(semanticsPropertyReceiver, "$this$semantics");
        SemanticsPropertiesKt.y0(semanticsPropertyReceiver, "progress");
        return Unit.f40552a;
    }

    public static final Unit i(Modifier modifier, long j2, float f2, long j3, int i2, int i3, int i4, Composer composer, int i5) {
        e(modifier, j2, f2, j3, i2, composer, RecomposeScopeImplKt.a(i3 | 1), i4);
        return Unit.f40552a;
    }
}
