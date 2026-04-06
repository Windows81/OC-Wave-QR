package androidx.compose.material;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.draw.ShadowKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import kotlin.Metadata;

@Metadata
public final class SurfaceKt {
    /* JADX WARNING: Removed duplicated region for block: B:115:0x01b3  */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x01c1  */
    /* JADX WARNING: Removed duplicated region for block: B:120:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x007c  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0081  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0099  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00b5  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00ba  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x00d8  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x00da  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x00e3  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void a(androidx.compose.ui.Modifier r26, androidx.compose.ui.graphics.Shape r27, long r28, long r30, androidx.compose.foundation.BorderStroke r32, float r33, kotlin.jvm.functions.Function2 r34, androidx.compose.runtime.Composer r35, int r36, int r37) {
        /*
            r10 = r36
            r0 = 1412203386(0x542c837a, float:2.96376074E12)
            r1 = r35
            androidx.compose.runtime.Composer r1 = r1.q(r0)
            r2 = r37 & 1
            if (r2 == 0) goto L_0x0015
            r3 = r10 | 6
            r4 = r3
            r3 = r26
            goto L_0x0029
        L_0x0015:
            r3 = r10 & 6
            if (r3 != 0) goto L_0x0026
            r3 = r26
            boolean r4 = r1.W(r3)
            if (r4 == 0) goto L_0x0023
            r4 = 4
            goto L_0x0024
        L_0x0023:
            r4 = 2
        L_0x0024:
            r4 = r4 | r10
            goto L_0x0029
        L_0x0026:
            r3 = r26
            r4 = r10
        L_0x0029:
            r5 = r37 & 2
            if (r5 == 0) goto L_0x0032
            r4 = r4 | 48
        L_0x002f:
            r6 = r27
            goto L_0x0044
        L_0x0032:
            r6 = r10 & 48
            if (r6 != 0) goto L_0x002f
            r6 = r27
            boolean r7 = r1.W(r6)
            if (r7 == 0) goto L_0x0041
            r7 = 32
            goto L_0x0043
        L_0x0041:
            r7 = 16
        L_0x0043:
            r4 = r4 | r7
        L_0x0044:
            r7 = r10 & 384(0x180, float:5.38E-43)
            if (r7 != 0) goto L_0x005d
            r7 = r37 & 4
            if (r7 != 0) goto L_0x0057
            r7 = r28
            boolean r9 = r1.j(r7)
            if (r9 == 0) goto L_0x0059
            r9 = 256(0x100, float:3.59E-43)
            goto L_0x005b
        L_0x0057:
            r7 = r28
        L_0x0059:
            r9 = 128(0x80, float:1.794E-43)
        L_0x005b:
            r4 = r4 | r9
            goto L_0x005f
        L_0x005d:
            r7 = r28
        L_0x005f:
            r9 = r10 & 3072(0xc00, float:4.305E-42)
            if (r9 != 0) goto L_0x0076
            r9 = r37 & 8
            r11 = r30
            if (r9 != 0) goto L_0x0072
            boolean r9 = r1.j(r11)
            if (r9 == 0) goto L_0x0072
            r9 = 2048(0x800, float:2.87E-42)
            goto L_0x0074
        L_0x0072:
            r9 = 1024(0x400, float:1.435E-42)
        L_0x0074:
            r4 = r4 | r9
            goto L_0x0078
        L_0x0076:
            r11 = r30
        L_0x0078:
            r9 = r37 & 16
            if (r9 == 0) goto L_0x0081
            r4 = r4 | 24576(0x6000, float:3.4438E-41)
        L_0x007e:
            r13 = r32
            goto L_0x0093
        L_0x0081:
            r13 = r10 & 24576(0x6000, float:3.4438E-41)
            if (r13 != 0) goto L_0x007e
            r13 = r32
            boolean r14 = r1.W(r13)
            if (r14 == 0) goto L_0x0090
            r14 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0092
        L_0x0090:
            r14 = 8192(0x2000, float:1.14794E-41)
        L_0x0092:
            r4 = r4 | r14
        L_0x0093:
            r14 = r37 & 32
            r15 = 196608(0x30000, float:2.75506E-40)
            if (r14 == 0) goto L_0x009d
            r4 = r4 | r15
        L_0x009a:
            r15 = r33
            goto L_0x00af
        L_0x009d:
            r15 = r15 & r10
            if (r15 != 0) goto L_0x009a
            r15 = r33
            boolean r16 = r1.h(r15)
            if (r16 == 0) goto L_0x00ab
            r16 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00ad
        L_0x00ab:
            r16 = 65536(0x10000, float:9.18355E-41)
        L_0x00ad:
            r4 = r4 | r16
        L_0x00af:
            r16 = r37 & 64
            r17 = 1572864(0x180000, float:2.204052E-39)
            if (r16 == 0) goto L_0x00ba
            r4 = r4 | r17
            r0 = r34
            goto L_0x00cd
        L_0x00ba:
            r16 = r10 & r17
            r0 = r34
            if (r16 != 0) goto L_0x00cd
            boolean r17 = r1.l(r0)
            if (r17 == 0) goto L_0x00c9
            r17 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00cb
        L_0x00c9:
            r17 = 524288(0x80000, float:7.34684E-40)
        L_0x00cb:
            r4 = r4 | r17
        L_0x00cd:
            r17 = 599187(0x92493, float:8.3964E-40)
            r0 = r4 & r17
            r3 = 599186(0x92492, float:8.39638E-40)
            r6 = 1
            if (r0 == r3) goto L_0x00da
            r0 = r6
            goto L_0x00db
        L_0x00da:
            r0 = 0
        L_0x00db:
            r3 = r4 & 1
            boolean r0 = r1.E(r0, r3)
            if (r0 == 0) goto L_0x01b3
            r1.p()
            r0 = r10 & 1
            if (r0 == 0) goto L_0x0105
            boolean r0 = r1.J()
            if (r0 == 0) goto L_0x00f1
            goto L_0x0105
        L_0x00f1:
            r1.B()
            r0 = r37 & 4
            if (r0 == 0) goto L_0x00fa
            r4 = r4 & -897(0xfffffffffffffc7f, float:NaN)
        L_0x00fa:
            r0 = r37 & 8
            if (r0 == 0) goto L_0x0100
            r4 = r4 & -7169(0xffffffffffffe3ff, float:NaN)
        L_0x0100:
            r0 = r26
            r2 = r27
            goto L_0x0142
        L_0x0105:
            if (r2 == 0) goto L_0x010a
            androidx.compose.ui.Modifier$Companion r0 = androidx.compose.ui.Modifier.f15489d
            goto L_0x010c
        L_0x010a:
            r0 = r26
        L_0x010c:
            if (r5 == 0) goto L_0x0113
            androidx.compose.ui.graphics.Shape r2 = androidx.compose.ui.graphics.RectangleShapeKt.a()
            goto L_0x0115
        L_0x0113:
            r2 = r27
        L_0x0115:
            r3 = r37 & 4
            if (r3 == 0) goto L_0x0126
            androidx.compose.material.MaterialTheme r3 = androidx.compose.material.MaterialTheme.f7937a
            r5 = 6
            androidx.compose.material.Colors r3 = r3.a(r1, r5)
            long r7 = r3.n()
            r4 = r4 & -897(0xfffffffffffffc7f, float:NaN)
        L_0x0126:
            r3 = r37 & 8
            if (r3 == 0) goto L_0x0135
            int r3 = r4 >> 6
            r3 = r3 & 14
            long r11 = androidx.compose.material.ColorsKt.b(r7, r1, r3)
            r3 = r4 & -7169(0xffffffffffffe3ff, float:NaN)
            r4 = r3
        L_0x0135:
            if (r9 == 0) goto L_0x0139
            r3 = 0
            r13 = r3
        L_0x0139:
            if (r14 == 0) goto L_0x0142
            r3 = 0
            float r3 = (float) r3
            float r3 = androidx.compose.ui.unit.Dp.m(r3)
            r15 = r3
        L_0x0142:
            r1.U()
            boolean r3 = androidx.compose.runtime.ComposerKt.P()
            if (r3 == 0) goto L_0x0154
            r3 = -1
            java.lang.String r5 = "androidx.compose.material.Surface (Surface.kt:102)"
            r9 = 1412203386(0x542c837a, float:2.96376074E12)
            androidx.compose.runtime.ComposerKt.Y(r9, r4, r3, r5)
        L_0x0154:
            androidx.compose.runtime.ProvidableCompositionLocal r3 = androidx.compose.material.ElevationOverlayKt.c()
            java.lang.Object r3 = r1.C(r3)
            androidx.compose.ui.unit.Dp r3 = (androidx.compose.ui.unit.Dp) r3
            float r3 = r3.t()
            float r3 = r3 + r15
            float r22 = androidx.compose.ui.unit.Dp.m(r3)
            androidx.compose.runtime.ProvidableCompositionLocal r3 = androidx.compose.material.ContentColorKt.a()
            androidx.compose.ui.graphics.Color r4 = androidx.compose.ui.graphics.Color.h(r11)
            androidx.compose.runtime.ProvidedValue r3 = r3.d(r4)
            androidx.compose.runtime.ProvidableCompositionLocal r4 = androidx.compose.material.ElevationOverlayKt.c()
            androidx.compose.ui.unit.Dp r5 = androidx.compose.ui.unit.Dp.j(r22)
            androidx.compose.runtime.ProvidedValue r4 = r4.d(r5)
            androidx.compose.runtime.ProvidedValue[] r3 = new androidx.compose.runtime.ProvidedValue[]{r3, r4}
            androidx.compose.material.SurfaceKt$Surface$1 r4 = new androidx.compose.material.SurfaceKt$Surface$1
            r17 = r4
            r18 = r0
            r19 = r2
            r20 = r7
            r23 = r13
            r24 = r15
            r25 = r34
            r17.<init>(r18, r19, r20, r22, r23, r24, r25)
            r5 = 54
            r9 = -1822160838(0xffffffff9364083a, float:-2.8781702E-27)
            androidx.compose.runtime.internal.ComposableLambda r4 = androidx.compose.runtime.internal.ComposableLambdaKt.e(r9, r6, r4, r1, r5)
            int r5 = androidx.compose.runtime.ProvidedValue.f14769i
            r5 = r5 | 48
            androidx.compose.runtime.CompositionLocalKt.d(r3, r4, r1, r5)
            boolean r3 = androidx.compose.runtime.ComposerKt.P()
            if (r3 == 0) goto L_0x01af
            androidx.compose.runtime.ComposerKt.X()
        L_0x01af:
            r3 = r2
            r5 = r11
            r2 = r0
            goto L_0x01bb
        L_0x01b3:
            r1.B()
            r2 = r26
            r3 = r27
            r5 = r11
        L_0x01bb:
            androidx.compose.runtime.ScopeUpdateScope r12 = r1.x()
            if (r12 == 0) goto L_0x01d5
            androidx.compose.material.SurfaceKt$Surface$2 r14 = new androidx.compose.material.SurfaceKt$Surface$2
            r0 = r14
            r1 = r2
            r2 = r3
            r3 = r7
            r7 = r13
            r8 = r15
            r9 = r34
            r10 = r36
            r11 = r37
            r0.<init>(r1, r2, r3, r5, r7, r8, r9, r10, r11)
            r12.a(r14)
        L_0x01d5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.SurfaceKt.a(androidx.compose.ui.Modifier, androidx.compose.ui.graphics.Shape, long, long, androidx.compose.foundation.BorderStroke, float, kotlin.jvm.functions.Function2, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:147:0x01b0, code lost:
        if (r0 != 0) goto L_0x01b2;
     */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x0113  */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x0130  */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x0132  */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x013b  */
    /* JADX WARNING: Removed duplicated region for block: B:155:0x0234  */
    /* JADX WARNING: Removed duplicated region for block: B:158:0x024b  */
    /* JADX WARNING: Removed duplicated region for block: B:160:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0095  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x009c  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00af  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00b7  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00bb  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x00d2  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x00d7  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x00f0  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x00f5  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x010e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void b(kotlin.jvm.functions.Function0 r29, androidx.compose.ui.Modifier r30, boolean r31, androidx.compose.ui.graphics.Shape r32, long r33, long r35, androidx.compose.foundation.BorderStroke r37, float r38, androidx.compose.foundation.interaction.MutableInteractionSource r39, kotlin.jvm.functions.Function2 r40, androidx.compose.runtime.Composer r41, int r42, int r43) {
        /*
            r13 = r42
            r14 = r43
            r0 = 1560876237(0x5d0914cd, float:6.1735908E17)
            r1 = r41
            androidx.compose.runtime.Composer r1 = r1.q(r0)
            r2 = r14 & 1
            if (r2 == 0) goto L_0x0017
            r2 = r13 | 6
            r3 = r2
            r2 = r29
            goto L_0x002b
        L_0x0017:
            r2 = r13 & 6
            if (r2 != 0) goto L_0x0028
            r2 = r29
            boolean r3 = r1.l(r2)
            if (r3 == 0) goto L_0x0025
            r3 = 4
            goto L_0x0026
        L_0x0025:
            r3 = 2
        L_0x0026:
            r3 = r3 | r13
            goto L_0x002b
        L_0x0028:
            r2 = r29
            r3 = r13
        L_0x002b:
            r4 = r14 & 2
            if (r4 == 0) goto L_0x0034
            r3 = r3 | 48
        L_0x0031:
            r5 = r30
            goto L_0x0046
        L_0x0034:
            r5 = r13 & 48
            if (r5 != 0) goto L_0x0031
            r5 = r30
            boolean r6 = r1.W(r5)
            if (r6 == 0) goto L_0x0043
            r6 = 32
            goto L_0x0045
        L_0x0043:
            r6 = 16
        L_0x0045:
            r3 = r3 | r6
        L_0x0046:
            r6 = r14 & 4
            if (r6 == 0) goto L_0x004f
            r3 = r3 | 384(0x180, float:5.38E-43)
        L_0x004c:
            r7 = r31
            goto L_0x0061
        L_0x004f:
            r7 = r13 & 384(0x180, float:5.38E-43)
            if (r7 != 0) goto L_0x004c
            r7 = r31
            boolean r8 = r1.d(r7)
            if (r8 == 0) goto L_0x005e
            r8 = 256(0x100, float:3.59E-43)
            goto L_0x0060
        L_0x005e:
            r8 = 128(0x80, float:1.794E-43)
        L_0x0060:
            r3 = r3 | r8
        L_0x0061:
            r8 = r14 & 8
            if (r8 == 0) goto L_0x006a
            r3 = r3 | 3072(0xc00, float:4.305E-42)
        L_0x0067:
            r9 = r32
            goto L_0x007c
        L_0x006a:
            r9 = r13 & 3072(0xc00, float:4.305E-42)
            if (r9 != 0) goto L_0x0067
            r9 = r32
            boolean r10 = r1.W(r9)
            if (r10 == 0) goto L_0x0079
            r10 = 2048(0x800, float:2.87E-42)
            goto L_0x007b
        L_0x0079:
            r10 = 1024(0x400, float:1.435E-42)
        L_0x007b:
            r3 = r3 | r10
        L_0x007c:
            r10 = r13 & 24576(0x6000, float:3.4438E-41)
            if (r10 != 0) goto L_0x0095
            r10 = r14 & 16
            if (r10 != 0) goto L_0x008f
            r10 = r33
            boolean r12 = r1.j(r10)
            if (r12 == 0) goto L_0x0091
            r12 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0093
        L_0x008f:
            r10 = r33
        L_0x0091:
            r12 = 8192(0x2000, float:1.14794E-41)
        L_0x0093:
            r3 = r3 | r12
            goto L_0x0097
        L_0x0095:
            r10 = r33
        L_0x0097:
            r12 = 196608(0x30000, float:2.75506E-40)
            r12 = r12 & r13
            if (r12 != 0) goto L_0x00af
            r12 = r14 & 32
            r9 = r35
            if (r12 != 0) goto L_0x00ab
            boolean r11 = r1.j(r9)
            if (r11 == 0) goto L_0x00ab
            r11 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00ad
        L_0x00ab:
            r11 = 65536(0x10000, float:9.18355E-41)
        L_0x00ad:
            r3 = r3 | r11
            goto L_0x00b1
        L_0x00af:
            r9 = r35
        L_0x00b1:
            r11 = r14 & 64
            r12 = 1572864(0x180000, float:2.204052E-39)
            if (r11 == 0) goto L_0x00bb
            r3 = r3 | r12
        L_0x00b8:
            r12 = r37
            goto L_0x00cc
        L_0x00bb:
            r12 = r12 & r13
            if (r12 != 0) goto L_0x00b8
            r12 = r37
            boolean r15 = r1.W(r12)
            if (r15 == 0) goto L_0x00c9
            r15 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00cb
        L_0x00c9:
            r15 = 524288(0x80000, float:7.34684E-40)
        L_0x00cb:
            r3 = r3 | r15
        L_0x00cc:
            r15 = r14 & 128(0x80, float:1.794E-43)
            r16 = 12582912(0xc00000, float:1.7632415E-38)
            if (r15 == 0) goto L_0x00d7
            r3 = r3 | r16
            r0 = r38
            goto L_0x00ea
        L_0x00d7:
            r16 = r13 & r16
            r0 = r38
            if (r16 != 0) goto L_0x00ea
            boolean r17 = r1.h(r0)
            if (r17 == 0) goto L_0x00e6
            r17 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00e8
        L_0x00e6:
            r17 = 4194304(0x400000, float:5.877472E-39)
        L_0x00e8:
            r3 = r3 | r17
        L_0x00ea:
            r0 = r14 & 256(0x100, float:3.59E-43)
            r17 = 100663296(0x6000000, float:2.4074124E-35)
            if (r0 == 0) goto L_0x00f5
            r3 = r3 | r17
            r2 = r39
            goto L_0x0108
        L_0x00f5:
            r17 = r13 & r17
            r2 = r39
            if (r17 != 0) goto L_0x0108
            boolean r17 = r1.W(r2)
            if (r17 == 0) goto L_0x0104
            r17 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x0106
        L_0x0104:
            r17 = 33554432(0x2000000, float:9.403955E-38)
        L_0x0106:
            r3 = r3 | r17
        L_0x0108:
            r2 = r14 & 512(0x200, float:7.175E-43)
            r17 = 805306368(0x30000000, float:4.656613E-10)
            if (r2 == 0) goto L_0x0113
            r3 = r3 | r17
        L_0x0110:
            r2 = r40
            goto L_0x0126
        L_0x0113:
            r2 = r13 & r17
            if (r2 != 0) goto L_0x0110
            r2 = r40
            boolean r17 = r1.l(r2)
            if (r17 == 0) goto L_0x0122
            r17 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x0124
        L_0x0122:
            r17 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x0124:
            r3 = r3 | r17
        L_0x0126:
            r17 = 306783379(0x12492493, float:6.34695E-28)
            r2 = r3 & r17
            r5 = 306783378(0x12492492, float:6.3469493E-28)
            if (r2 == r5) goto L_0x0132
            r2 = 1
            goto L_0x0133
        L_0x0132:
            r2 = 0
        L_0x0133:
            r5 = r3 & 1
            boolean r2 = r1.E(r2, r5)
            if (r2 == 0) goto L_0x0234
            r1.p()
            r2 = r13 & 1
            r5 = -458753(0xfffffffffff8ffff, float:NaN)
            r17 = -57345(0xffffffffffff1fff, float:NaN)
            if (r2 == 0) goto L_0x016a
            boolean r2 = r1.J()
            if (r2 == 0) goto L_0x014f
            goto L_0x016a
        L_0x014f:
            r1.B()
            r0 = r14 & 16
            if (r0 == 0) goto L_0x0158
            r3 = r3 & r17
        L_0x0158:
            r0 = r14 & 32
            if (r0 == 0) goto L_0x015d
            r3 = r3 & r5
        L_0x015d:
            r2 = r30
            r4 = r31
            r6 = r32
            r7 = r33
            r11 = r38
        L_0x0167:
            r5 = r39
            goto L_0x01b2
        L_0x016a:
            if (r4 == 0) goto L_0x016f
            androidx.compose.ui.Modifier$Companion r2 = androidx.compose.ui.Modifier.f15489d
            goto L_0x0171
        L_0x016f:
            r2 = r30
        L_0x0171:
            if (r6 == 0) goto L_0x0175
            r4 = 1
            goto L_0x0177
        L_0x0175:
            r4 = r31
        L_0x0177:
            if (r8 == 0) goto L_0x017e
            androidx.compose.ui.graphics.Shape r6 = androidx.compose.ui.graphics.RectangleShapeKt.a()
            goto L_0x0180
        L_0x017e:
            r6 = r32
        L_0x0180:
            r8 = r14 & 16
            if (r8 == 0) goto L_0x0192
            androidx.compose.material.MaterialTheme r8 = androidx.compose.material.MaterialTheme.f7937a
            r7 = 6
            androidx.compose.material.Colors r7 = r8.a(r1, r7)
            long r7 = r7.n()
            r3 = r3 & r17
            goto L_0x0194
        L_0x0192:
            r7 = r33
        L_0x0194:
            r17 = r14 & 32
            if (r17 == 0) goto L_0x01a1
            int r9 = r3 >> 12
            r9 = r9 & 14
            long r9 = androidx.compose.material.ColorsKt.b(r7, r1, r9)
            r3 = r3 & r5
        L_0x01a1:
            r5 = 0
            if (r11 == 0) goto L_0x01a5
            r12 = r5
        L_0x01a5:
            if (r15 == 0) goto L_0x01ae
            r11 = 0
            float r11 = (float) r11
            float r11 = androidx.compose.ui.unit.Dp.m(r11)
            goto L_0x01b0
        L_0x01ae:
            r11 = r38
        L_0x01b0:
            if (r0 == 0) goto L_0x0167
        L_0x01b2:
            r1.U()
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x01c4
            r0 = -1
            java.lang.String r15 = "androidx.compose.material.Surface (Surface.kt:208)"
            r13 = 1560876237(0x5d0914cd, float:6.1735908E17)
            androidx.compose.runtime.ComposerKt.Y(r13, r3, r0, r15)
        L_0x01c4:
            androidx.compose.runtime.ProvidableCompositionLocal r0 = androidx.compose.material.ElevationOverlayKt.c()
            java.lang.Object r0 = r1.C(r0)
            androidx.compose.ui.unit.Dp r0 = (androidx.compose.ui.unit.Dp) r0
            float r0 = r0.t()
            float r0 = r0 + r11
            float r20 = androidx.compose.ui.unit.Dp.m(r0)
            androidx.compose.runtime.ProvidableCompositionLocal r0 = androidx.compose.material.ContentColorKt.a()
            androidx.compose.ui.graphics.Color r3 = androidx.compose.ui.graphics.Color.h(r9)
            androidx.compose.runtime.ProvidedValue r0 = r0.d(r3)
            androidx.compose.runtime.ProvidableCompositionLocal r3 = androidx.compose.material.ElevationOverlayKt.c()
            androidx.compose.ui.unit.Dp r13 = androidx.compose.ui.unit.Dp.j(r20)
            androidx.compose.runtime.ProvidedValue r3 = r3.d(r13)
            androidx.compose.runtime.ProvidedValue[] r0 = new androidx.compose.runtime.ProvidedValue[]{r0, r3}
            androidx.compose.material.SurfaceKt$Surface$3 r3 = new androidx.compose.material.SurfaceKt$Surface$3
            r15 = r3
            r16 = r2
            r17 = r6
            r18 = r7
            r21 = r12
            r22 = r11
            r23 = r5
            r24 = r4
            r25 = r29
            r26 = r40
            r15.<init>(r16, r17, r18, r20, r21, r22, r23, r24, r25, r26)
            r13 = 54
            r15 = 2031491085(0x7916180d, float:4.870827E34)
            r30 = r2
            r2 = 1
            androidx.compose.runtime.internal.ComposableLambda r2 = androidx.compose.runtime.internal.ComposableLambdaKt.e(r15, r2, r3, r1, r13)
            int r3 = androidx.compose.runtime.ProvidedValue.f14769i
            r3 = r3 | 48
            androidx.compose.runtime.CompositionLocalKt.d(r0, r2, r1, r3)
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x0227
            androidx.compose.runtime.ComposerKt.X()
        L_0x0227:
            r2 = r30
            r3 = r4
            r4 = r6
            r28 = r11
            r11 = r5
            r5 = r7
            r7 = r9
            r10 = r28
            r9 = r12
            goto L_0x0245
        L_0x0234:
            r1.B()
            r2 = r30
            r3 = r31
            r4 = r32
            r5 = r33
            r11 = r39
            r7 = r9
            r9 = r12
            r10 = r38
        L_0x0245:
            androidx.compose.runtime.ScopeUpdateScope r15 = r1.x()
            if (r15 == 0) goto L_0x0260
            androidx.compose.material.SurfaceKt$Surface$4 r13 = new androidx.compose.material.SurfaceKt$Surface$4
            r0 = r13
            r1 = r29
            r12 = r40
            r27 = r13
            r13 = r42
            r14 = r43
            r0.<init>(r1, r2, r3, r4, r5, r7, r9, r10, r11, r12, r13, r14)
            r0 = r27
            r15.a(r0)
        L_0x0260:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.SurfaceKt.b(kotlin.jvm.functions.Function0, androidx.compose.ui.Modifier, boolean, androidx.compose.ui.graphics.Shape, long, long, androidx.compose.foundation.BorderStroke, float, androidx.compose.foundation.interaction.MutableInteractionSource, kotlin.jvm.functions.Function2, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:108:0x012a  */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x0130  */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x015a  */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x015c  */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x0165  */
    /* JADX WARNING: Removed duplicated region for block: B:169:0x0265  */
    /* JADX WARNING: Removed duplicated region for block: B:172:0x027b  */
    /* JADX WARNING: Removed duplicated region for block: B:174:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x009c  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00b0  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00b8  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x00cc  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x00d4  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x00d9  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x00f1  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x00f6  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x010f  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x0114  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void c(boolean r31, kotlin.jvm.functions.Function0 r32, androidx.compose.ui.Modifier r33, boolean r34, androidx.compose.ui.graphics.Shape r35, long r36, long r38, androidx.compose.foundation.BorderStroke r40, float r41, androidx.compose.foundation.interaction.MutableInteractionSource r42, kotlin.jvm.functions.Function2 r43, androidx.compose.runtime.Composer r44, int r45, int r46, int r47) {
        /*
            r14 = r45
            r15 = r47
            r0 = 262027249(0xf9e37f1, float:1.560155E-29)
            r1 = r44
            androidx.compose.runtime.Composer r1 = r1.q(r0)
            r2 = r15 & 1
            if (r2 == 0) goto L_0x0017
            r2 = r14 | 6
            r5 = r2
            r2 = r31
            goto L_0x002b
        L_0x0017:
            r2 = r14 & 6
            if (r2 != 0) goto L_0x0028
            r2 = r31
            boolean r5 = r1.d(r2)
            if (r5 == 0) goto L_0x0025
            r5 = 4
            goto L_0x0026
        L_0x0025:
            r5 = 2
        L_0x0026:
            r5 = r5 | r14
            goto L_0x002b
        L_0x0028:
            r2 = r31
            r5 = r14
        L_0x002b:
            r6 = r15 & 2
            if (r6 == 0) goto L_0x0034
            r5 = r5 | 48
        L_0x0031:
            r6 = r32
            goto L_0x0046
        L_0x0034:
            r6 = r14 & 48
            if (r6 != 0) goto L_0x0031
            r6 = r32
            boolean r7 = r1.l(r6)
            if (r7 == 0) goto L_0x0043
            r7 = 32
            goto L_0x0045
        L_0x0043:
            r7 = 16
        L_0x0045:
            r5 = r5 | r7
        L_0x0046:
            r7 = r15 & 4
            if (r7 == 0) goto L_0x004f
            r5 = r5 | 384(0x180, float:5.38E-43)
        L_0x004c:
            r8 = r33
            goto L_0x0061
        L_0x004f:
            r8 = r14 & 384(0x180, float:5.38E-43)
            if (r8 != 0) goto L_0x004c
            r8 = r33
            boolean r9 = r1.W(r8)
            if (r9 == 0) goto L_0x005e
            r9 = 256(0x100, float:3.59E-43)
            goto L_0x0060
        L_0x005e:
            r9 = 128(0x80, float:1.794E-43)
        L_0x0060:
            r5 = r5 | r9
        L_0x0061:
            r9 = r15 & 8
            if (r9 == 0) goto L_0x006a
            r5 = r5 | 3072(0xc00, float:4.305E-42)
        L_0x0067:
            r10 = r34
            goto L_0x007c
        L_0x006a:
            r10 = r14 & 3072(0xc00, float:4.305E-42)
            if (r10 != 0) goto L_0x0067
            r10 = r34
            boolean r11 = r1.d(r10)
            if (r11 == 0) goto L_0x0079
            r11 = 2048(0x800, float:2.87E-42)
            goto L_0x007b
        L_0x0079:
            r11 = 1024(0x400, float:1.435E-42)
        L_0x007b:
            r5 = r5 | r11
        L_0x007c:
            r11 = r15 & 16
            if (r11 == 0) goto L_0x0085
            r5 = r5 | 24576(0x6000, float:3.4438E-41)
        L_0x0082:
            r12 = r35
            goto L_0x0097
        L_0x0085:
            r12 = r14 & 24576(0x6000, float:3.4438E-41)
            if (r12 != 0) goto L_0x0082
            r12 = r35
            boolean r13 = r1.W(r12)
            if (r13 == 0) goto L_0x0094
            r13 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0096
        L_0x0094:
            r13 = 8192(0x2000, float:1.14794E-41)
        L_0x0096:
            r5 = r5 | r13
        L_0x0097:
            r13 = 196608(0x30000, float:2.75506E-40)
            r13 = r13 & r14
            if (r13 != 0) goto L_0x00b0
            r13 = r15 & 32
            r3 = r36
            if (r13 != 0) goto L_0x00ab
            boolean r16 = r1.j(r3)
            if (r16 == 0) goto L_0x00ab
            r16 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00ad
        L_0x00ab:
            r16 = 65536(0x10000, float:9.18355E-41)
        L_0x00ad:
            r5 = r5 | r16
            goto L_0x00b2
        L_0x00b0:
            r3 = r36
        L_0x00b2:
            r16 = 1572864(0x180000, float:2.204052E-39)
            r16 = r14 & r16
            if (r16 != 0) goto L_0x00cc
            r16 = r15 & 64
            r13 = r38
            if (r16 != 0) goto L_0x00c7
            boolean r17 = r1.j(r13)
            if (r17 == 0) goto L_0x00c7
            r17 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00c9
        L_0x00c7:
            r17 = 524288(0x80000, float:7.34684E-40)
        L_0x00c9:
            r5 = r5 | r17
            goto L_0x00ce
        L_0x00cc:
            r13 = r38
        L_0x00ce:
            r0 = r15 & 128(0x80, float:1.794E-43)
            r18 = 12582912(0xc00000, float:1.7632415E-38)
            if (r0 == 0) goto L_0x00d9
            r5 = r5 | r18
        L_0x00d6:
            r13 = r40
            goto L_0x00eb
        L_0x00d9:
            r13 = r45 & r18
            if (r13 != 0) goto L_0x00d6
            r13 = r40
            boolean r14 = r1.W(r13)
            if (r14 == 0) goto L_0x00e8
            r14 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00ea
        L_0x00e8:
            r14 = 4194304(0x400000, float:5.877472E-39)
        L_0x00ea:
            r5 = r5 | r14
        L_0x00eb:
            r14 = r15 & 256(0x100, float:3.59E-43)
            r18 = 100663296(0x6000000, float:2.4074124E-35)
            if (r14 == 0) goto L_0x00f6
            r5 = r5 | r18
            r2 = r41
            goto L_0x0109
        L_0x00f6:
            r18 = r45 & r18
            r2 = r41
            if (r18 != 0) goto L_0x0109
            boolean r18 = r1.h(r2)
            if (r18 == 0) goto L_0x0105
            r18 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x0107
        L_0x0105:
            r18 = 33554432(0x2000000, float:9.403955E-38)
        L_0x0107:
            r5 = r5 | r18
        L_0x0109:
            r2 = r15 & 512(0x200, float:7.175E-43)
            r18 = 805306368(0x30000000, float:4.656613E-10)
            if (r2 == 0) goto L_0x0114
            r5 = r5 | r18
            r3 = r42
            goto L_0x0126
        L_0x0114:
            r18 = r45 & r18
            r3 = r42
            if (r18 != 0) goto L_0x0126
            boolean r4 = r1.W(r3)
            if (r4 == 0) goto L_0x0123
            r4 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x0125
        L_0x0123:
            r4 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x0125:
            r5 = r5 | r4
        L_0x0126:
            r4 = r15 & 1024(0x400, float:1.435E-42)
            if (r4 == 0) goto L_0x0130
            r4 = r46 | 6
            r3 = r4
            r4 = r43
            goto L_0x014a
        L_0x0130:
            r4 = r46 & 6
            if (r4 != 0) goto L_0x0146
            r4 = r43
            boolean r18 = r1.l(r4)
            if (r18 == 0) goto L_0x013f
            r18 = 4
            goto L_0x0141
        L_0x013f:
            r18 = 2
        L_0x0141:
            r18 = r46 | r18
            r3 = r18
            goto L_0x014a
        L_0x0146:
            r4 = r43
            r3 = r46
        L_0x014a:
            r18 = 306783379(0x12492493, float:6.34695E-28)
            r4 = r5 & r18
            r6 = 306783378(0x12492492, float:6.3469493E-28)
            if (r4 != r6) goto L_0x015c
            r4 = r3 & 3
            r6 = 2
            if (r4 == r6) goto L_0x015a
            goto L_0x015c
        L_0x015a:
            r4 = 0
            goto L_0x015d
        L_0x015c:
            r4 = 1
        L_0x015d:
            r6 = r5 & 1
            boolean r4 = r1.E(r4, r6)
            if (r4 == 0) goto L_0x0265
            r1.p()
            r4 = r45 & 1
            r6 = -3670017(0xffffffffffc7ffff, float:NaN)
            r16 = -458753(0xfffffffffff8ffff, float:NaN)
            if (r4 == 0) goto L_0x0194
            boolean r4 = r1.J()
            if (r4 == 0) goto L_0x0179
            goto L_0x0194
        L_0x0179:
            r1.B()
            r0 = r15 & 32
            if (r0 == 0) goto L_0x0182
            r5 = r5 & r16
        L_0x0182:
            r0 = r15 & 64
            if (r0 == 0) goto L_0x0187
            r5 = r5 & r6
        L_0x0187:
            r4 = r33
            r0 = r41
            r2 = r42
            r9 = r5
            r7 = r12
            r11 = r36
            r5 = r38
            goto L_0x01e4
        L_0x0194:
            if (r7 == 0) goto L_0x0199
            androidx.compose.ui.Modifier$Companion r4 = androidx.compose.ui.Modifier.f15489d
            goto L_0x019b
        L_0x0199:
            r4 = r33
        L_0x019b:
            if (r9 == 0) goto L_0x019e
            r10 = 1
        L_0x019e:
            if (r11 == 0) goto L_0x01a5
            androidx.compose.ui.graphics.Shape r7 = androidx.compose.ui.graphics.RectangleShapeKt.a()
            goto L_0x01a6
        L_0x01a5:
            r7 = r12
        L_0x01a6:
            r9 = r15 & 32
            if (r9 == 0) goto L_0x01b8
            androidx.compose.material.MaterialTheme r9 = androidx.compose.material.MaterialTheme.f7937a
            r11 = 6
            androidx.compose.material.Colors r9 = r9.a(r1, r11)
            long r11 = r9.n()
            r5 = r5 & r16
            goto L_0x01ba
        L_0x01b8:
            r11 = r36
        L_0x01ba:
            r9 = r15 & 64
            if (r9 == 0) goto L_0x01c8
            int r9 = r5 >> 15
            r9 = r9 & 14
            long r18 = androidx.compose.material.ColorsKt.b(r11, r1, r9)
            r5 = r5 & r6
            goto L_0x01ca
        L_0x01c8:
            r18 = r38
        L_0x01ca:
            r6 = 0
            if (r0 == 0) goto L_0x01ce
            r13 = r6
        L_0x01ce:
            if (r14 == 0) goto L_0x01d7
            r0 = 0
            float r0 = (float) r0
            float r0 = androidx.compose.ui.unit.Dp.m(r0)
            goto L_0x01d9
        L_0x01d7:
            r0 = r41
        L_0x01d9:
            if (r2 == 0) goto L_0x01e0
            r9 = r5
            r2 = r6
        L_0x01dd:
            r5 = r18
            goto L_0x01e4
        L_0x01e0:
            r2 = r42
            r9 = r5
            goto L_0x01dd
        L_0x01e4:
            r1.U()
            boolean r14 = androidx.compose.runtime.ComposerKt.P()
            if (r14 == 0) goto L_0x01f5
            java.lang.String r14 = "androidx.compose.material.Surface (Surface.kt:318)"
            r8 = 262027249(0xf9e37f1, float:1.560155E-29)
            androidx.compose.runtime.ComposerKt.Y(r8, r9, r3, r14)
        L_0x01f5:
            androidx.compose.runtime.ProvidableCompositionLocal r3 = androidx.compose.material.ElevationOverlayKt.c()
            java.lang.Object r3 = r1.C(r3)
            androidx.compose.ui.unit.Dp r3 = (androidx.compose.ui.unit.Dp) r3
            float r3 = r3.t()
            float r3 = r3 + r0
            float r21 = androidx.compose.ui.unit.Dp.m(r3)
            androidx.compose.runtime.ProvidableCompositionLocal r3 = androidx.compose.material.ContentColorKt.a()
            androidx.compose.ui.graphics.Color r8 = androidx.compose.ui.graphics.Color.h(r5)
            androidx.compose.runtime.ProvidedValue r3 = r3.d(r8)
            androidx.compose.runtime.ProvidableCompositionLocal r8 = androidx.compose.material.ElevationOverlayKt.c()
            androidx.compose.ui.unit.Dp r9 = androidx.compose.ui.unit.Dp.j(r21)
            androidx.compose.runtime.ProvidedValue r8 = r8.d(r9)
            androidx.compose.runtime.ProvidedValue[] r3 = new androidx.compose.runtime.ProvidedValue[]{r3, r8}
            androidx.compose.material.SurfaceKt$Surface$5 r8 = new androidx.compose.material.SurfaceKt$Surface$5
            r16 = r8
            r17 = r4
            r18 = r7
            r19 = r11
            r22 = r13
            r23 = r0
            r24 = r31
            r25 = r2
            r26 = r10
            r27 = r32
            r28 = r43
            r16.<init>(r17, r18, r19, r21, r22, r23, r24, r25, r26, r27, r28)
            r9 = 54
            r14 = -1391199439(0xffffffffad13fb31, float:-8.411758E-12)
            r33 = r0
            r0 = 1
            androidx.compose.runtime.internal.ComposableLambda r0 = androidx.compose.runtime.internal.ComposableLambdaKt.e(r14, r0, r8, r1, r9)
            int r8 = androidx.compose.runtime.ProvidedValue.f14769i
            r8 = r8 | 48
            androidx.compose.runtime.CompositionLocalKt.d(r3, r0, r1, r8)
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x025b
            androidx.compose.runtime.ComposerKt.X()
        L_0x025b:
            r3 = r4
            r8 = r5
            r5 = r7
            r4 = r10
            r6 = r11
            r10 = r13
            r11 = r33
            r12 = r2
            goto L_0x0275
        L_0x0265:
            r1.B()
            r3 = r33
            r6 = r36
            r8 = r38
            r11 = r41
            r4 = r10
            r5 = r12
            r10 = r13
            r12 = r42
        L_0x0275:
            androidx.compose.runtime.ScopeUpdateScope r14 = r1.x()
            if (r14 == 0) goto L_0x0298
            androidx.compose.material.SurfaceKt$Surface$6 r13 = new androidx.compose.material.SurfaceKt$Surface$6
            r0 = r13
            r1 = r31
            r2 = r32
            r29 = r13
            r13 = r43
            r30 = r14
            r14 = r45
            r15 = r46
            r16 = r47
            r0.<init>(r1, r2, r3, r4, r5, r6, r8, r10, r11, r12, r13, r14, r15, r16)
            r1 = r29
            r0 = r30
            r0.a(r1)
        L_0x0298:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.SurfaceKt.c(boolean, kotlin.jvm.functions.Function0, androidx.compose.ui.Modifier, boolean, androidx.compose.ui.graphics.Shape, long, long, androidx.compose.foundation.BorderStroke, float, androidx.compose.foundation.interaction.MutableInteractionSource, kotlin.jvm.functions.Function2, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:108:0x012a  */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x0130  */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x015a  */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x015c  */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x0165  */
    /* JADX WARNING: Removed duplicated region for block: B:169:0x0265  */
    /* JADX WARNING: Removed duplicated region for block: B:172:0x027b  */
    /* JADX WARNING: Removed duplicated region for block: B:174:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x009c  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00b0  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00b8  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x00cc  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x00d4  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x00d9  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x00f1  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x00f6  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x010f  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x0114  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void d(boolean r31, kotlin.jvm.functions.Function1 r32, androidx.compose.ui.Modifier r33, boolean r34, androidx.compose.ui.graphics.Shape r35, long r36, long r38, androidx.compose.foundation.BorderStroke r40, float r41, androidx.compose.foundation.interaction.MutableInteractionSource r42, kotlin.jvm.functions.Function2 r43, androidx.compose.runtime.Composer r44, int r45, int r46, int r47) {
        /*
            r14 = r45
            r15 = r47
            r0 = 1341569296(0x4ff6b910, float:8.2786468E9)
            r1 = r44
            androidx.compose.runtime.Composer r1 = r1.q(r0)
            r2 = r15 & 1
            if (r2 == 0) goto L_0x0017
            r2 = r14 | 6
            r5 = r2
            r2 = r31
            goto L_0x002b
        L_0x0017:
            r2 = r14 & 6
            if (r2 != 0) goto L_0x0028
            r2 = r31
            boolean r5 = r1.d(r2)
            if (r5 == 0) goto L_0x0025
            r5 = 4
            goto L_0x0026
        L_0x0025:
            r5 = 2
        L_0x0026:
            r5 = r5 | r14
            goto L_0x002b
        L_0x0028:
            r2 = r31
            r5 = r14
        L_0x002b:
            r6 = r15 & 2
            if (r6 == 0) goto L_0x0034
            r5 = r5 | 48
        L_0x0031:
            r6 = r32
            goto L_0x0046
        L_0x0034:
            r6 = r14 & 48
            if (r6 != 0) goto L_0x0031
            r6 = r32
            boolean r7 = r1.l(r6)
            if (r7 == 0) goto L_0x0043
            r7 = 32
            goto L_0x0045
        L_0x0043:
            r7 = 16
        L_0x0045:
            r5 = r5 | r7
        L_0x0046:
            r7 = r15 & 4
            if (r7 == 0) goto L_0x004f
            r5 = r5 | 384(0x180, float:5.38E-43)
        L_0x004c:
            r8 = r33
            goto L_0x0061
        L_0x004f:
            r8 = r14 & 384(0x180, float:5.38E-43)
            if (r8 != 0) goto L_0x004c
            r8 = r33
            boolean r9 = r1.W(r8)
            if (r9 == 0) goto L_0x005e
            r9 = 256(0x100, float:3.59E-43)
            goto L_0x0060
        L_0x005e:
            r9 = 128(0x80, float:1.794E-43)
        L_0x0060:
            r5 = r5 | r9
        L_0x0061:
            r9 = r15 & 8
            if (r9 == 0) goto L_0x006a
            r5 = r5 | 3072(0xc00, float:4.305E-42)
        L_0x0067:
            r10 = r34
            goto L_0x007c
        L_0x006a:
            r10 = r14 & 3072(0xc00, float:4.305E-42)
            if (r10 != 0) goto L_0x0067
            r10 = r34
            boolean r11 = r1.d(r10)
            if (r11 == 0) goto L_0x0079
            r11 = 2048(0x800, float:2.87E-42)
            goto L_0x007b
        L_0x0079:
            r11 = 1024(0x400, float:1.435E-42)
        L_0x007b:
            r5 = r5 | r11
        L_0x007c:
            r11 = r15 & 16
            if (r11 == 0) goto L_0x0085
            r5 = r5 | 24576(0x6000, float:3.4438E-41)
        L_0x0082:
            r12 = r35
            goto L_0x0097
        L_0x0085:
            r12 = r14 & 24576(0x6000, float:3.4438E-41)
            if (r12 != 0) goto L_0x0082
            r12 = r35
            boolean r13 = r1.W(r12)
            if (r13 == 0) goto L_0x0094
            r13 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0096
        L_0x0094:
            r13 = 8192(0x2000, float:1.14794E-41)
        L_0x0096:
            r5 = r5 | r13
        L_0x0097:
            r13 = 196608(0x30000, float:2.75506E-40)
            r13 = r13 & r14
            if (r13 != 0) goto L_0x00b0
            r13 = r15 & 32
            r3 = r36
            if (r13 != 0) goto L_0x00ab
            boolean r16 = r1.j(r3)
            if (r16 == 0) goto L_0x00ab
            r16 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00ad
        L_0x00ab:
            r16 = 65536(0x10000, float:9.18355E-41)
        L_0x00ad:
            r5 = r5 | r16
            goto L_0x00b2
        L_0x00b0:
            r3 = r36
        L_0x00b2:
            r16 = 1572864(0x180000, float:2.204052E-39)
            r16 = r14 & r16
            if (r16 != 0) goto L_0x00cc
            r16 = r15 & 64
            r13 = r38
            if (r16 != 0) goto L_0x00c7
            boolean r17 = r1.j(r13)
            if (r17 == 0) goto L_0x00c7
            r17 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00c9
        L_0x00c7:
            r17 = 524288(0x80000, float:7.34684E-40)
        L_0x00c9:
            r5 = r5 | r17
            goto L_0x00ce
        L_0x00cc:
            r13 = r38
        L_0x00ce:
            r0 = r15 & 128(0x80, float:1.794E-43)
            r18 = 12582912(0xc00000, float:1.7632415E-38)
            if (r0 == 0) goto L_0x00d9
            r5 = r5 | r18
        L_0x00d6:
            r13 = r40
            goto L_0x00eb
        L_0x00d9:
            r13 = r45 & r18
            if (r13 != 0) goto L_0x00d6
            r13 = r40
            boolean r14 = r1.W(r13)
            if (r14 == 0) goto L_0x00e8
            r14 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00ea
        L_0x00e8:
            r14 = 4194304(0x400000, float:5.877472E-39)
        L_0x00ea:
            r5 = r5 | r14
        L_0x00eb:
            r14 = r15 & 256(0x100, float:3.59E-43)
            r18 = 100663296(0x6000000, float:2.4074124E-35)
            if (r14 == 0) goto L_0x00f6
            r5 = r5 | r18
            r2 = r41
            goto L_0x0109
        L_0x00f6:
            r18 = r45 & r18
            r2 = r41
            if (r18 != 0) goto L_0x0109
            boolean r18 = r1.h(r2)
            if (r18 == 0) goto L_0x0105
            r18 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x0107
        L_0x0105:
            r18 = 33554432(0x2000000, float:9.403955E-38)
        L_0x0107:
            r5 = r5 | r18
        L_0x0109:
            r2 = r15 & 512(0x200, float:7.175E-43)
            r18 = 805306368(0x30000000, float:4.656613E-10)
            if (r2 == 0) goto L_0x0114
            r5 = r5 | r18
            r3 = r42
            goto L_0x0126
        L_0x0114:
            r18 = r45 & r18
            r3 = r42
            if (r18 != 0) goto L_0x0126
            boolean r4 = r1.W(r3)
            if (r4 == 0) goto L_0x0123
            r4 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x0125
        L_0x0123:
            r4 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x0125:
            r5 = r5 | r4
        L_0x0126:
            r4 = r15 & 1024(0x400, float:1.435E-42)
            if (r4 == 0) goto L_0x0130
            r4 = r46 | 6
            r3 = r4
            r4 = r43
            goto L_0x014a
        L_0x0130:
            r4 = r46 & 6
            if (r4 != 0) goto L_0x0146
            r4 = r43
            boolean r18 = r1.l(r4)
            if (r18 == 0) goto L_0x013f
            r18 = 4
            goto L_0x0141
        L_0x013f:
            r18 = 2
        L_0x0141:
            r18 = r46 | r18
            r3 = r18
            goto L_0x014a
        L_0x0146:
            r4 = r43
            r3 = r46
        L_0x014a:
            r18 = 306783379(0x12492493, float:6.34695E-28)
            r4 = r5 & r18
            r6 = 306783378(0x12492492, float:6.3469493E-28)
            if (r4 != r6) goto L_0x015c
            r4 = r3 & 3
            r6 = 2
            if (r4 == r6) goto L_0x015a
            goto L_0x015c
        L_0x015a:
            r4 = 0
            goto L_0x015d
        L_0x015c:
            r4 = 1
        L_0x015d:
            r6 = r5 & 1
            boolean r4 = r1.E(r4, r6)
            if (r4 == 0) goto L_0x0265
            r1.p()
            r4 = r45 & 1
            r6 = -3670017(0xffffffffffc7ffff, float:NaN)
            r16 = -458753(0xfffffffffff8ffff, float:NaN)
            if (r4 == 0) goto L_0x0194
            boolean r4 = r1.J()
            if (r4 == 0) goto L_0x0179
            goto L_0x0194
        L_0x0179:
            r1.B()
            r0 = r15 & 32
            if (r0 == 0) goto L_0x0182
            r5 = r5 & r16
        L_0x0182:
            r0 = r15 & 64
            if (r0 == 0) goto L_0x0187
            r5 = r5 & r6
        L_0x0187:
            r4 = r33
            r0 = r41
            r2 = r42
            r9 = r5
            r7 = r12
            r11 = r36
            r5 = r38
            goto L_0x01e4
        L_0x0194:
            if (r7 == 0) goto L_0x0199
            androidx.compose.ui.Modifier$Companion r4 = androidx.compose.ui.Modifier.f15489d
            goto L_0x019b
        L_0x0199:
            r4 = r33
        L_0x019b:
            if (r9 == 0) goto L_0x019e
            r10 = 1
        L_0x019e:
            if (r11 == 0) goto L_0x01a5
            androidx.compose.ui.graphics.Shape r7 = androidx.compose.ui.graphics.RectangleShapeKt.a()
            goto L_0x01a6
        L_0x01a5:
            r7 = r12
        L_0x01a6:
            r9 = r15 & 32
            if (r9 == 0) goto L_0x01b8
            androidx.compose.material.MaterialTheme r9 = androidx.compose.material.MaterialTheme.f7937a
            r11 = 6
            androidx.compose.material.Colors r9 = r9.a(r1, r11)
            long r11 = r9.n()
            r5 = r5 & r16
            goto L_0x01ba
        L_0x01b8:
            r11 = r36
        L_0x01ba:
            r9 = r15 & 64
            if (r9 == 0) goto L_0x01c8
            int r9 = r5 >> 15
            r9 = r9 & 14
            long r18 = androidx.compose.material.ColorsKt.b(r11, r1, r9)
            r5 = r5 & r6
            goto L_0x01ca
        L_0x01c8:
            r18 = r38
        L_0x01ca:
            r6 = 0
            if (r0 == 0) goto L_0x01ce
            r13 = r6
        L_0x01ce:
            if (r14 == 0) goto L_0x01d7
            r0 = 0
            float r0 = (float) r0
            float r0 = androidx.compose.ui.unit.Dp.m(r0)
            goto L_0x01d9
        L_0x01d7:
            r0 = r41
        L_0x01d9:
            if (r2 == 0) goto L_0x01e0
            r9 = r5
            r2 = r6
        L_0x01dd:
            r5 = r18
            goto L_0x01e4
        L_0x01e0:
            r2 = r42
            r9 = r5
            goto L_0x01dd
        L_0x01e4:
            r1.U()
            boolean r14 = androidx.compose.runtime.ComposerKt.P()
            if (r14 == 0) goto L_0x01f5
            java.lang.String r14 = "androidx.compose.material.Surface (Surface.kt:429)"
            r8 = 1341569296(0x4ff6b910, float:8.2786468E9)
            androidx.compose.runtime.ComposerKt.Y(r8, r9, r3, r14)
        L_0x01f5:
            androidx.compose.runtime.ProvidableCompositionLocal r3 = androidx.compose.material.ElevationOverlayKt.c()
            java.lang.Object r3 = r1.C(r3)
            androidx.compose.ui.unit.Dp r3 = (androidx.compose.ui.unit.Dp) r3
            float r3 = r3.t()
            float r3 = r3 + r0
            float r21 = androidx.compose.ui.unit.Dp.m(r3)
            androidx.compose.runtime.ProvidableCompositionLocal r3 = androidx.compose.material.ContentColorKt.a()
            androidx.compose.ui.graphics.Color r8 = androidx.compose.ui.graphics.Color.h(r5)
            androidx.compose.runtime.ProvidedValue r3 = r3.d(r8)
            androidx.compose.runtime.ProvidableCompositionLocal r8 = androidx.compose.material.ElevationOverlayKt.c()
            androidx.compose.ui.unit.Dp r9 = androidx.compose.ui.unit.Dp.j(r21)
            androidx.compose.runtime.ProvidedValue r8 = r8.d(r9)
            androidx.compose.runtime.ProvidedValue[] r3 = new androidx.compose.runtime.ProvidedValue[]{r3, r8}
            androidx.compose.material.SurfaceKt$Surface$7 r8 = new androidx.compose.material.SurfaceKt$Surface$7
            r16 = r8
            r17 = r4
            r18 = r7
            r19 = r11
            r22 = r13
            r23 = r0
            r24 = r31
            r25 = r2
            r26 = r10
            r27 = r32
            r28 = r43
            r16.<init>(r17, r18, r19, r21, r22, r23, r24, r25, r26, r27, r28)
            r9 = 54
            r14 = -311657392(0xffffffffed6c7c50, float:-4.5742967E27)
            r33 = r0
            r0 = 1
            androidx.compose.runtime.internal.ComposableLambda r0 = androidx.compose.runtime.internal.ComposableLambdaKt.e(r14, r0, r8, r1, r9)
            int r8 = androidx.compose.runtime.ProvidedValue.f14769i
            r8 = r8 | 48
            androidx.compose.runtime.CompositionLocalKt.d(r3, r0, r1, r8)
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x025b
            androidx.compose.runtime.ComposerKt.X()
        L_0x025b:
            r3 = r4
            r8 = r5
            r5 = r7
            r4 = r10
            r6 = r11
            r10 = r13
            r11 = r33
            r12 = r2
            goto L_0x0275
        L_0x0265:
            r1.B()
            r3 = r33
            r6 = r36
            r8 = r38
            r11 = r41
            r4 = r10
            r5 = r12
            r10 = r13
            r12 = r42
        L_0x0275:
            androidx.compose.runtime.ScopeUpdateScope r14 = r1.x()
            if (r14 == 0) goto L_0x0298
            androidx.compose.material.SurfaceKt$Surface$8 r13 = new androidx.compose.material.SurfaceKt$Surface$8
            r0 = r13
            r1 = r31
            r2 = r32
            r29 = r13
            r13 = r43
            r30 = r14
            r14 = r45
            r15 = r46
            r16 = r47
            r0.<init>(r1, r2, r3, r4, r5, r6, r8, r10, r11, r12, r13, r14, r15, r16)
            r1 = r29
            r0 = r30
            r0.a(r1)
        L_0x0298:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.SurfaceKt.d(boolean, kotlin.jvm.functions.Function1, androidx.compose.ui.Modifier, boolean, androidx.compose.ui.graphics.Shape, long, long, androidx.compose.foundation.BorderStroke, float, androidx.compose.foundation.interaction.MutableInteractionSource, kotlin.jvm.functions.Function2, androidx.compose.runtime.Composer, int, int, int):void");
    }

    public static final Modifier g(Modifier modifier, Shape shape, long j2, BorderStroke borderStroke, float f2) {
        return ClipKt.a(BackgroundKt.a(ShadowKt.b(modifier, f2, shape, false, 0, 0, 24, (Object) null).o0(borderStroke != null ? BorderKt.e(Modifier.f15489d, borderStroke, shape) : Modifier.f15489d), j2, shape), shape);
    }

    public static final long h(long j2, ElevationOverlay elevationOverlay, float f2, Composer composer, int i2) {
        if (ComposerKt.P()) {
            ComposerKt.Y(1561611256, i2, -1, "androidx.compose.material.surfaceColorAtElevation (Surface.kt:480)");
        }
        if (!Color.n(j2, MaterialTheme.f7937a.a(composer, 6).n()) || elevationOverlay == null) {
            composer.X(1082990783);
            composer.M();
        } else {
            composer.X(1082922676);
            j2 = elevationOverlay.a(j2, f2, composer, (i2 & 14) | ((i2 >> 3) & 112) | ((i2 << 3) & 896));
            composer.M();
        }
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
        return j2;
    }
}
