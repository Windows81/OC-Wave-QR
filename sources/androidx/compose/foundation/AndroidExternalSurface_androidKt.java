package androidx.compose.foundation;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import kotlin.Metadata;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlinx.coroutines.CoroutineScope;

@Metadata
public final class AndroidExternalSurface_androidKt {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v8, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v16, resolved type: androidx.compose.foundation.AndroidExternalSurface_androidKt$AndroidEmbeddedExternalSurface$3$1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v5, resolved type: androidx.compose.foundation.AndroidExternalSurface_androidKt$AndroidEmbeddedExternalSurface$3$1} */
    /* JADX WARNING: type inference failed for: r12v9 */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x014a, code lost:
        if (r12 == androidx.compose.runtime.Composer.f14567a.a()) goto L_0x014c;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x012e  */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x0133  */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x0138  */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x0144  */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x017a  */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x0181  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x018e  */
    /* JADX WARNING: Removed duplicated region for block: B:119:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0081  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00a5  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x00f4  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x0112  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x0115  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x0123  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x0126  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void a(androidx.compose.ui.Modifier r23, boolean r24, long r25, float[] r27, kotlin.jvm.functions.Function1 r28, androidx.compose.runtime.Composer r29, int r30, int r31) {
        /*
            r7 = r30
            r0 = 217541314(0xcf76ac2, float:3.8120628E-31)
            r1 = r29
            androidx.compose.runtime.Composer r1 = r1.q(r0)
            r2 = r31 & 1
            if (r2 == 0) goto L_0x0015
            r3 = r7 | 6
            r4 = r3
            r3 = r23
            goto L_0x0029
        L_0x0015:
            r3 = r7 & 6
            if (r3 != 0) goto L_0x0026
            r3 = r23
            boolean r4 = r1.W(r3)
            if (r4 == 0) goto L_0x0023
            r4 = 4
            goto L_0x0024
        L_0x0023:
            r4 = 2
        L_0x0024:
            r4 = r4 | r7
            goto L_0x0029
        L_0x0026:
            r3 = r23
            r4 = r7
        L_0x0029:
            r5 = r31 & 2
            if (r5 == 0) goto L_0x0032
            r4 = r4 | 48
        L_0x002f:
            r8 = r24
            goto L_0x0044
        L_0x0032:
            r8 = r7 & 48
            if (r8 != 0) goto L_0x002f
            r8 = r24
            boolean r9 = r1.d(r8)
            if (r9 == 0) goto L_0x0041
            r9 = 32
            goto L_0x0043
        L_0x0041:
            r9 = 16
        L_0x0043:
            r4 = r4 | r9
        L_0x0044:
            r9 = r7 & 384(0x180, float:5.38E-43)
            r10 = 256(0x100, float:3.59E-43)
            if (r9 != 0) goto L_0x005c
            r9 = r31 & 4
            r11 = r25
            if (r9 != 0) goto L_0x0058
            boolean r9 = r1.j(r11)
            if (r9 == 0) goto L_0x0058
            r9 = r10
            goto L_0x005a
        L_0x0058:
            r9 = 128(0x80, float:1.794E-43)
        L_0x005a:
            r4 = r4 | r9
            goto L_0x005e
        L_0x005c:
            r11 = r25
        L_0x005e:
            r9 = r31 & 8
            if (r9 == 0) goto L_0x0065
            r4 = r4 | 3072(0xc00, float:4.305E-42)
            goto L_0x007d
        L_0x0065:
            r14 = r7 & 3072(0xc00, float:4.305E-42)
            if (r14 != 0) goto L_0x007d
            if (r27 == 0) goto L_0x0070
            androidx.compose.ui.graphics.Matrix r14 = androidx.compose.ui.graphics.Matrix.a(r27)
            goto L_0x0071
        L_0x0070:
            r14 = 0
        L_0x0071:
            boolean r14 = r1.l(r14)
            if (r14 == 0) goto L_0x007a
            r14 = 2048(0x800, float:2.87E-42)
            goto L_0x007c
        L_0x007a:
            r14 = 1024(0x400, float:1.435E-42)
        L_0x007c:
            r4 = r4 | r14
        L_0x007d:
            r14 = r31 & 16
            if (r14 == 0) goto L_0x0086
            r4 = r4 | 24576(0x6000, float:3.4438E-41)
        L_0x0083:
            r14 = r28
            goto L_0x0099
        L_0x0086:
            r14 = r7 & 24576(0x6000, float:3.4438E-41)
            if (r14 != 0) goto L_0x0083
            r14 = r28
            boolean r16 = r1.l(r14)
            if (r16 == 0) goto L_0x0095
            r16 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0097
        L_0x0095:
            r16 = 8192(0x2000, float:1.14794E-41)
        L_0x0097:
            r4 = r4 | r16
        L_0x0099:
            r13 = r4 & 9363(0x2493, float:1.312E-41)
            r6 = 9362(0x2492, float:1.3119E-41)
            r15 = 0
            r18 = 1
            if (r13 == r6) goto L_0x00a5
            r6 = r18
            goto L_0x00a6
        L_0x00a5:
            r6 = r15
        L_0x00a6:
            r13 = r4 & 1
            boolean r6 = r1.E(r6, r13)
            if (r6 == 0) goto L_0x0181
            r1.p()
            r6 = r7 & 1
            if (r6 == 0) goto L_0x00cc
            boolean r6 = r1.J()
            if (r6 == 0) goto L_0x00bc
            goto L_0x00cc
        L_0x00bc:
            r1.B()
            r2 = r31 & 4
            if (r2 == 0) goto L_0x00c5
            r4 = r4 & -897(0xfffffffffffffc7f, float:NaN)
        L_0x00c5:
            r6 = r27
            r2 = r3
        L_0x00c8:
            r3 = r8
        L_0x00c9:
            r8 = r4
            r4 = r11
            goto L_0x00eb
        L_0x00cc:
            if (r2 == 0) goto L_0x00d1
            androidx.compose.ui.Modifier$Companion r2 = androidx.compose.ui.Modifier.f15489d
            goto L_0x00d2
        L_0x00d1:
            r2 = r3
        L_0x00d2:
            if (r5 == 0) goto L_0x00d6
            r8 = r18
        L_0x00d6:
            r3 = r31 & 4
            if (r3 == 0) goto L_0x00e3
            androidx.compose.ui.unit.IntSize$Companion r3 = androidx.compose.ui.unit.IntSize.f19170b
            long r5 = r3.a()
            r4 = r4 & -897(0xfffffffffffffc7f, float:NaN)
            r11 = r5
        L_0x00e3:
            if (r9 == 0) goto L_0x00e8
            r3 = r8
            r6 = 0
            goto L_0x00c9
        L_0x00e8:
            r6 = r27
            goto L_0x00c8
        L_0x00eb:
            r1.U()
            boolean r9 = androidx.compose.runtime.ComposerKt.P()
            if (r9 == 0) goto L_0x00fa
            r9 = -1
            java.lang.String r11 = "androidx.compose.foundation.AndroidEmbeddedExternalSurface (AndroidExternalSurface.android.kt:433)"
            androidx.compose.runtime.ComposerKt.Y(r0, r8, r9, r11)
        L_0x00fa:
            androidx.compose.foundation.AndroidEmbeddedExternalSurfaceState r0 = c(r1, r15)
            androidx.compose.foundation.AndroidExternalSurface_androidKt$AndroidEmbeddedExternalSurface$1 r9 = androidx.compose.foundation.AndroidExternalSurface_androidKt$AndroidEmbeddedExternalSurface$1.f2897z
            androidx.compose.foundation.AndroidExternalSurface_androidKt$AndroidEmbeddedExternalSurface$2 r11 = androidx.compose.foundation.AndroidExternalSurface_androidKt$AndroidEmbeddedExternalSurface$2.f2898z
            r12 = r8 & 896(0x380, float:1.256E-42)
            r12 = r12 ^ 384(0x180, float:5.38E-43)
            if (r12 <= r10) goto L_0x010e
            boolean r12 = r1.j(r4)
            if (r12 != 0) goto L_0x0112
        L_0x010e:
            r12 = r8 & 384(0x180, float:5.38E-43)
            if (r12 != r10) goto L_0x0115
        L_0x0112:
            r10 = r18
            goto L_0x0116
        L_0x0115:
            r10 = r15
        L_0x0116:
            boolean r12 = r1.l(r0)
            r10 = r10 | r12
            r12 = 57344(0xe000, float:8.0356E-41)
            r12 = r12 & r8
            r13 = 16384(0x4000, float:2.2959E-41)
            if (r12 != r13) goto L_0x0126
            r12 = r18
            goto L_0x0127
        L_0x0126:
            r12 = r15
        L_0x0127:
            r10 = r10 | r12
            r12 = r8 & 112(0x70, float:1.57E-43)
            r13 = 32
            if (r12 != r13) goto L_0x0130
            r15 = r18
        L_0x0130:
            r10 = r10 | r15
            if (r6 == 0) goto L_0x0138
            androidx.compose.ui.graphics.Matrix r13 = androidx.compose.ui.graphics.Matrix.a(r6)
            goto L_0x0139
        L_0x0138:
            r13 = 0
        L_0x0139:
            boolean r12 = r1.l(r13)
            r10 = r10 | r12
            java.lang.Object r12 = r1.g()
            if (r10 != 0) goto L_0x014c
            androidx.compose.runtime.Composer$Companion r10 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r10 = r10.a()
            if (r12 != r10) goto L_0x0160
        L_0x014c:
            androidx.compose.foundation.AndroidExternalSurface_androidKt$AndroidEmbeddedExternalSurface$3$1 r12 = new androidx.compose.foundation.AndroidExternalSurface_androidKt$AndroidEmbeddedExternalSurface$3$1
            r16 = r12
            r17 = r4
            r19 = r0
            r20 = r28
            r21 = r3
            r22 = r6
            r16.<init>(r17, r19, r20, r21, r22)
            r1.N(r12)
        L_0x0160:
            kotlin.jvm.functions.Function1 r12 = (kotlin.jvm.functions.Function1) r12
            int r0 = r8 << 3
            r0 = r0 & 112(0x70, float:1.57E-43)
            r0 = r0 | 390(0x186, float:5.47E-43)
            r15 = 8
            r13 = 0
            r8 = r9
            r9 = r2
            r10 = r11
            r11 = r13
            r13 = r1
            r14 = r0
            androidx.compose.ui.viewinterop.AndroidView_androidKt.b(r8, r9, r10, r11, r12, r13, r14, r15)
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x017d
            androidx.compose.runtime.ComposerKt.X()
        L_0x017d:
            r8 = r3
            r3 = r4
            r5 = r6
            goto L_0x0188
        L_0x0181:
            r1.B()
            r5 = r27
            r2 = r3
            r3 = r11
        L_0x0188:
            androidx.compose.runtime.ScopeUpdateScope r9 = r1.x()
            if (r9 == 0) goto L_0x019f
            androidx.compose.foundation.AndroidExternalSurface_androidKt$AndroidEmbeddedExternalSurface$4 r10 = new androidx.compose.foundation.AndroidExternalSurface_androidKt$AndroidEmbeddedExternalSurface$4
            r0 = r10
            r1 = r2
            r2 = r8
            r6 = r28
            r7 = r30
            r8 = r31
            r0.<init>(r1, r2, r3, r5, r6, r7, r8)
            r9.a(r10)
        L_0x019f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.AndroidExternalSurface_androidKt.a(androidx.compose.ui.Modifier, boolean, long, float[], kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v5, resolved type: kotlin.jvm.functions.Function1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v13, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v26, resolved type: androidx.compose.foundation.AndroidExternalSurface_androidKt$AndroidExternalSurface$3$1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v2, resolved type: androidx.compose.foundation.AndroidExternalSurface_androidKt$AndroidExternalSurface$3$1} */
    /* JADX WARNING: type inference failed for: r12v14 */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x0193, code lost:
        if (r12 == androidx.compose.runtime.Composer.f14567a.a()) goto L_0x0195;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x0162  */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x0165  */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x016c  */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x016f  */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x0177  */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x017a  */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x0184  */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x018d  */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x01bf  */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x01c8  */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x01d5  */
    /* JADX WARNING: Removed duplicated region for block: B:137:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00a0  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00be  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00c1  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x00ca  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x0118  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x012c  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x012f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void b(androidx.compose.ui.Modifier r21, boolean r22, long r23, int r25, boolean r26, kotlin.jvm.functions.Function1 r27, androidx.compose.runtime.Composer r28, int r29, int r30) {
        /*
            r7 = r27
            r8 = r29
            r0 = 640888974(0x2633308e, float:6.2168904E-16)
            r1 = r28
            androidx.compose.runtime.Composer r1 = r1.q(r0)
            r2 = r30 & 1
            if (r2 == 0) goto L_0x0017
            r3 = r8 | 6
            r4 = r3
            r3 = r21
            goto L_0x002b
        L_0x0017:
            r3 = r8 & 6
            if (r3 != 0) goto L_0x0028
            r3 = r21
            boolean r4 = r1.W(r3)
            if (r4 == 0) goto L_0x0025
            r4 = 4
            goto L_0x0026
        L_0x0025:
            r4 = 2
        L_0x0026:
            r4 = r4 | r8
            goto L_0x002b
        L_0x0028:
            r3 = r21
            r4 = r8
        L_0x002b:
            r5 = r30 & 2
            if (r5 == 0) goto L_0x0034
            r4 = r4 | 48
        L_0x0031:
            r9 = r22
            goto L_0x0046
        L_0x0034:
            r9 = r8 & 48
            if (r9 != 0) goto L_0x0031
            r9 = r22
            boolean r10 = r1.d(r9)
            if (r10 == 0) goto L_0x0043
            r10 = 32
            goto L_0x0045
        L_0x0043:
            r10 = 16
        L_0x0045:
            r4 = r4 | r10
        L_0x0046:
            r10 = r8 & 384(0x180, float:5.38E-43)
            if (r10 != 0) goto L_0x005d
            r10 = r30 & 4
            r12 = r23
            if (r10 != 0) goto L_0x0059
            boolean r10 = r1.j(r12)
            if (r10 == 0) goto L_0x0059
            r10 = 256(0x100, float:3.59E-43)
            goto L_0x005b
        L_0x0059:
            r10 = 128(0x80, float:1.794E-43)
        L_0x005b:
            r4 = r4 | r10
            goto L_0x005f
        L_0x005d:
            r12 = r23
        L_0x005f:
            r10 = r30 & 8
            if (r10 == 0) goto L_0x0068
            r4 = r4 | 3072(0xc00, float:4.305E-42)
        L_0x0065:
            r15 = r25
            goto L_0x007b
        L_0x0068:
            r15 = r8 & 3072(0xc00, float:4.305E-42)
            if (r15 != 0) goto L_0x0065
            r15 = r25
            boolean r16 = r1.i(r15)
            if (r16 == 0) goto L_0x0077
            r16 = 2048(0x800, float:2.87E-42)
            goto L_0x0079
        L_0x0077:
            r16 = 1024(0x400, float:1.435E-42)
        L_0x0079:
            r4 = r4 | r16
        L_0x007b:
            r16 = r30 & 16
            if (r16 == 0) goto L_0x0084
            r4 = r4 | 24576(0x6000, float:3.4438E-41)
        L_0x0081:
            r14 = r26
            goto L_0x0097
        L_0x0084:
            r14 = r8 & 24576(0x6000, float:3.4438E-41)
            if (r14 != 0) goto L_0x0081
            r14 = r26
            boolean r17 = r1.d(r14)
            if (r17 == 0) goto L_0x0093
            r17 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0095
        L_0x0093:
            r17 = 8192(0x2000, float:1.14794E-41)
        L_0x0095:
            r4 = r4 | r17
        L_0x0097:
            r17 = r30 & 32
            r18 = 196608(0x30000, float:2.75506E-40)
            if (r17 == 0) goto L_0x00a0
            r4 = r4 | r18
            goto L_0x00b1
        L_0x00a0:
            r17 = r8 & r18
            if (r17 != 0) goto L_0x00b1
            boolean r17 = r1.l(r7)
            if (r17 == 0) goto L_0x00ad
            r17 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00af
        L_0x00ad:
            r17 = 65536(0x10000, float:9.18355E-41)
        L_0x00af:
            r4 = r4 | r17
        L_0x00b1:
            r17 = 74899(0x12493, float:1.04956E-40)
            r11 = r4 & r17
            r6 = 74898(0x12492, float:1.04954E-40)
            r0 = 0
            r19 = 1
            if (r11 == r6) goto L_0x00c1
            r6 = r19
            goto L_0x00c2
        L_0x00c1:
            r6 = r0
        L_0x00c2:
            r11 = r4 & 1
            boolean r6 = r1.E(r6, r11)
            if (r6 == 0) goto L_0x01c8
            r1.p()
            r6 = r8 & 1
            if (r6 == 0) goto L_0x00e9
            boolean r6 = r1.J()
            if (r6 == 0) goto L_0x00d8
            goto L_0x00e9
        L_0x00d8:
            r1.B()
            r2 = r30 & 4
            if (r2 == 0) goto L_0x00e1
            r4 = r4 & -897(0xfffffffffffffc7f, float:NaN)
        L_0x00e1:
            r2 = r3
        L_0x00e2:
            r3 = r9
            r20 = r14
        L_0x00e5:
            r6 = r15
            r9 = r4
            r4 = r12
            goto L_0x010f
        L_0x00e9:
            if (r2 == 0) goto L_0x00ee
            androidx.compose.ui.Modifier$Companion r2 = androidx.compose.ui.Modifier.f15489d
            goto L_0x00ef
        L_0x00ee:
            r2 = r3
        L_0x00ef:
            if (r5 == 0) goto L_0x00f3
            r9 = r19
        L_0x00f3:
            r3 = r30 & 4
            if (r3 == 0) goto L_0x0100
            androidx.compose.ui.unit.IntSize$Companion r3 = androidx.compose.ui.unit.IntSize.f19170b
            long r5 = r3.a()
            r4 = r4 & -897(0xfffffffffffffc7f, float:NaN)
            r12 = r5
        L_0x0100:
            if (r10 == 0) goto L_0x0109
            androidx.compose.foundation.AndroidExternalSurfaceZOrder$Companion r3 = androidx.compose.foundation.AndroidExternalSurfaceZOrder.f2892b
            int r3 = r3.a()
            r15 = r3
        L_0x0109:
            if (r16 == 0) goto L_0x00e2
            r20 = r0
            r3 = r9
            goto L_0x00e5
        L_0x010f:
            r1.U()
            boolean r10 = androidx.compose.runtime.ComposerKt.P()
            if (r10 == 0) goto L_0x0121
            r10 = -1
            java.lang.String r11 = "androidx.compose.foundation.AndroidExternalSurface (AndroidExternalSurface.android.kt:275)"
            r12 = 640888974(0x2633308e, float:6.2168904E-16)
            androidx.compose.runtime.ComposerKt.Y(r12, r9, r10, r11)
        L_0x0121:
            androidx.compose.foundation.AndroidExternalSurfaceState r10 = d(r1, r0)
            r11 = 458752(0x70000, float:6.42848E-40)
            r11 = r11 & r9
            r12 = 131072(0x20000, float:1.83671E-40)
            if (r11 != r12) goto L_0x012f
            r11 = r19
            goto L_0x0130
        L_0x012f:
            r11 = r0
        L_0x0130:
            boolean r12 = r1.l(r10)
            r11 = r11 | r12
            java.lang.Object r12 = r1.g()
            if (r11 != 0) goto L_0x0143
            androidx.compose.runtime.Composer$Companion r11 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r11 = r11.a()
            if (r12 != r11) goto L_0x014b
        L_0x0143:
            androidx.compose.foundation.AndroidExternalSurface_androidKt$AndroidExternalSurface$1$1 r12 = new androidx.compose.foundation.AndroidExternalSurface_androidKt$AndroidExternalSurface$1$1
            r12.<init>(r7, r10)
            r1.N(r12)
        L_0x014b:
            r10 = r12
            kotlin.jvm.functions.Function1 r10 = (kotlin.jvm.functions.Function1) r10
            androidx.compose.foundation.AndroidExternalSurface_androidKt$AndroidExternalSurface$2 r11 = androidx.compose.foundation.AndroidExternalSurface_androidKt$AndroidExternalSurface$2.f2907z
            r12 = r9 & 896(0x380, float:1.256E-42)
            r12 = r12 ^ 384(0x180, float:5.38E-43)
            r13 = 256(0x100, float:3.59E-43)
            if (r12 <= r13) goto L_0x015e
            boolean r12 = r1.j(r4)
            if (r12 != 0) goto L_0x0162
        L_0x015e:
            r12 = r9 & 384(0x180, float:5.38E-43)
            if (r12 != r13) goto L_0x0165
        L_0x0162:
            r12 = r19
            goto L_0x0166
        L_0x0165:
            r12 = r0
        L_0x0166:
            r13 = r9 & 112(0x70, float:1.57E-43)
            r14 = 32
            if (r13 != r14) goto L_0x016f
            r13 = r19
            goto L_0x0170
        L_0x016f:
            r13 = r0
        L_0x0170:
            r12 = r12 | r13
            r13 = r9 & 7168(0x1c00, float:1.0045E-41)
            r14 = 2048(0x800, float:2.87E-42)
            if (r13 != r14) goto L_0x017a
            r13 = r19
            goto L_0x017b
        L_0x017a:
            r13 = r0
        L_0x017b:
            r12 = r12 | r13
            r13 = 57344(0xe000, float:8.0356E-41)
            r13 = r13 & r9
            r14 = 16384(0x4000, float:2.2959E-41)
            if (r13 != r14) goto L_0x0186
            r0 = r19
        L_0x0186:
            r0 = r0 | r12
            java.lang.Object r12 = r1.g()
            if (r0 != 0) goto L_0x0195
            androidx.compose.runtime.Composer$Companion r0 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r0 = r0.a()
            if (r12 != r0) goto L_0x01a7
        L_0x0195:
            androidx.compose.foundation.AndroidExternalSurface_androidKt$AndroidExternalSurface$3$1 r12 = new androidx.compose.foundation.AndroidExternalSurface_androidKt$AndroidExternalSurface$3$1
            r21 = r12
            r22 = r4
            r24 = r3
            r25 = r6
            r26 = r20
            r21.<init>(r22, r24, r25, r26)
            r1.N(r12)
        L_0x01a7:
            r13 = r12
            kotlin.jvm.functions.Function1 r13 = (kotlin.jvm.functions.Function1) r13
            int r0 = r9 << 3
            r0 = r0 & 112(0x70, float:1.57E-43)
            r15 = r0 | 384(0x180, float:5.38E-43)
            r16 = 8
            r12 = 0
            r9 = r10
            r10 = r2
            r14 = r1
            androidx.compose.ui.viewinterop.AndroidView_androidKt.b(r9, r10, r11, r12, r13, r14, r15, r16)
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x01c2
            androidx.compose.runtime.ComposerKt.X()
        L_0x01c2:
            r9 = r3
            r3 = r4
            r5 = r6
            r6 = r20
            goto L_0x01cf
        L_0x01c8:
            r1.B()
            r2 = r3
            r3 = r12
            r6 = r14
            r5 = r15
        L_0x01cf:
            androidx.compose.runtime.ScopeUpdateScope r10 = r1.x()
            if (r10 == 0) goto L_0x01e6
            androidx.compose.foundation.AndroidExternalSurface_androidKt$AndroidExternalSurface$4 r11 = new androidx.compose.foundation.AndroidExternalSurface_androidKt$AndroidExternalSurface$4
            r0 = r11
            r1 = r2
            r2 = r9
            r7 = r27
            r8 = r29
            r9 = r30
            r0.<init>(r1, r2, r3, r5, r6, r7, r8, r9)
            r10.a(r11)
        L_0x01e6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.AndroidExternalSurface_androidKt.b(androidx.compose.ui.Modifier, boolean, long, int, boolean, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final AndroidEmbeddedExternalSurfaceState c(Composer composer, int i2) {
        if (ComposerKt.P()) {
            ComposerKt.Y(-1057437053, i2, -1, "androidx.compose.foundation.rememberAndroidEmbeddedExternalSurfaceState (AndroidExternalSurface.android.kt:371)");
        }
        Object g2 = composer.g();
        Composer.Companion companion = Composer.f14567a;
        if (g2 == companion.a()) {
            g2 = EffectsKt.j(EmptyCoroutineContext.f40721z, composer);
            composer.N(g2);
        }
        CoroutineScope coroutineScope = (CoroutineScope) g2;
        Object g3 = composer.g();
        if (g3 == companion.a()) {
            g3 = new AndroidEmbeddedExternalSurfaceState(coroutineScope);
            composer.N(g3);
        }
        AndroidEmbeddedExternalSurfaceState androidEmbeddedExternalSurfaceState = (AndroidEmbeddedExternalSurfaceState) g3;
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
        return androidEmbeddedExternalSurfaceState;
    }

    public static final AndroidExternalSurfaceState d(Composer composer, int i2) {
        if (ComposerKt.P()) {
            ComposerKt.Y(-873615933, i2, -1, "androidx.compose.foundation.rememberAndroidExternalSurfaceState (AndroidExternalSurface.android.kt:188)");
        }
        Object g2 = composer.g();
        Composer.Companion companion = Composer.f14567a;
        if (g2 == companion.a()) {
            g2 = EffectsKt.j(EmptyCoroutineContext.f40721z, composer);
            composer.N(g2);
        }
        CoroutineScope coroutineScope = (CoroutineScope) g2;
        Object g3 = composer.g();
        if (g3 == companion.a()) {
            g3 = new AndroidExternalSurfaceState(coroutineScope);
            composer.N(g3);
        }
        AndroidExternalSurfaceState androidExternalSurfaceState = (AndroidExternalSurfaceState) g3;
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
        return androidExternalSurfaceState;
    }
}
