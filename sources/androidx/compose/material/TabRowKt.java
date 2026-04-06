package androidx.compose.material;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;

@Metadata
public final class TabRowKt {

    /* renamed from: a  reason: collision with root package name */
    public static final float f8695a = Dp.m((float) 90);

    /* renamed from: b  reason: collision with root package name */
    public static final AnimationSpec f8696b = AnimationSpecKt.n(250, 0, EasingKt.d(), 2, (Object) null);

    /* JADX WARNING: Removed duplicated region for block: B:131:0x01db  */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x01eb  */
    /* JADX WARNING: Removed duplicated region for block: B:136:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0075  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0098  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x009c  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00b4  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00b9  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x00d2  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x00d7  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x00f5  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x00f7  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x0100  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void a(int r27, androidx.compose.ui.Modifier r28, long r29, long r31, float r33, kotlin.jvm.functions.Function3 r34, kotlin.jvm.functions.Function2 r35, kotlin.jvm.functions.Function2 r36, androidx.compose.runtime.Composer r37, int r38, int r39) {
        /*
            r1 = r27
            r11 = r38
            r12 = r39
            r0 = -1473476840(0xffffffffa82c8718, float:-9.577212E-15)
            r2 = r37
            androidx.compose.runtime.Composer r2 = r2.q(r0)
            r3 = r12 & 1
            if (r3 == 0) goto L_0x0016
            r3 = r11 | 6
            goto L_0x0026
        L_0x0016:
            r3 = r11 & 6
            if (r3 != 0) goto L_0x0025
            boolean r3 = r2.i(r1)
            if (r3 == 0) goto L_0x0022
            r3 = 4
            goto L_0x0023
        L_0x0022:
            r3 = 2
        L_0x0023:
            r3 = r3 | r11
            goto L_0x0026
        L_0x0025:
            r3 = r11
        L_0x0026:
            r4 = r12 & 2
            if (r4 == 0) goto L_0x002f
            r3 = r3 | 48
        L_0x002c:
            r5 = r28
            goto L_0x0041
        L_0x002f:
            r5 = r11 & 48
            if (r5 != 0) goto L_0x002c
            r5 = r28
            boolean r6 = r2.W(r5)
            if (r6 == 0) goto L_0x003e
            r6 = 32
            goto L_0x0040
        L_0x003e:
            r6 = 16
        L_0x0040:
            r3 = r3 | r6
        L_0x0041:
            r6 = r11 & 384(0x180, float:5.38E-43)
            if (r6 != 0) goto L_0x005a
            r6 = r12 & 4
            if (r6 != 0) goto L_0x0054
            r6 = r29
            boolean r8 = r2.j(r6)
            if (r8 == 0) goto L_0x0056
            r8 = 256(0x100, float:3.59E-43)
            goto L_0x0058
        L_0x0054:
            r6 = r29
        L_0x0056:
            r8 = 128(0x80, float:1.794E-43)
        L_0x0058:
            r3 = r3 | r8
            goto L_0x005c
        L_0x005a:
            r6 = r29
        L_0x005c:
            r8 = r11 & 3072(0xc00, float:4.305E-42)
            if (r8 != 0) goto L_0x0075
            r8 = r12 & 8
            if (r8 != 0) goto L_0x006f
            r8 = r31
            boolean r10 = r2.j(r8)
            if (r10 == 0) goto L_0x0071
            r10 = 2048(0x800, float:2.87E-42)
            goto L_0x0073
        L_0x006f:
            r8 = r31
        L_0x0071:
            r10 = 1024(0x400, float:1.435E-42)
        L_0x0073:
            r3 = r3 | r10
            goto L_0x0077
        L_0x0075:
            r8 = r31
        L_0x0077:
            r10 = r12 & 16
            if (r10 == 0) goto L_0x0080
            r3 = r3 | 24576(0x6000, float:3.4438E-41)
        L_0x007d:
            r13 = r33
            goto L_0x0092
        L_0x0080:
            r13 = r11 & 24576(0x6000, float:3.4438E-41)
            if (r13 != 0) goto L_0x007d
            r13 = r33
            boolean r14 = r2.h(r13)
            if (r14 == 0) goto L_0x008f
            r14 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0091
        L_0x008f:
            r14 = 8192(0x2000, float:1.14794E-41)
        L_0x0091:
            r3 = r3 | r14
        L_0x0092:
            r14 = r12 & 32
            r15 = 196608(0x30000, float:2.75506E-40)
            if (r14 == 0) goto L_0x009c
            r3 = r3 | r15
        L_0x0099:
            r15 = r34
            goto L_0x00ae
        L_0x009c:
            r15 = r15 & r11
            if (r15 != 0) goto L_0x0099
            r15 = r34
            boolean r16 = r2.l(r15)
            if (r16 == 0) goto L_0x00aa
            r16 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00ac
        L_0x00aa:
            r16 = 65536(0x10000, float:9.18355E-41)
        L_0x00ac:
            r3 = r3 | r16
        L_0x00ae:
            r16 = r12 & 64
            r17 = 1572864(0x180000, float:2.204052E-39)
            if (r16 == 0) goto L_0x00b9
            r3 = r3 | r17
            r0 = r35
            goto L_0x00cc
        L_0x00b9:
            r18 = r11 & r17
            r0 = r35
            if (r18 != 0) goto L_0x00cc
            boolean r19 = r2.l(r0)
            if (r19 == 0) goto L_0x00c8
            r19 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00ca
        L_0x00c8:
            r19 = 524288(0x80000, float:7.34684E-40)
        L_0x00ca:
            r3 = r3 | r19
        L_0x00cc:
            r0 = r12 & 128(0x80, float:1.794E-43)
            r19 = 12582912(0xc00000, float:1.7632415E-38)
            if (r0 == 0) goto L_0x00d7
            r3 = r3 | r19
        L_0x00d4:
            r0 = r36
            goto L_0x00ea
        L_0x00d7:
            r0 = r11 & r19
            if (r0 != 0) goto L_0x00d4
            r0 = r36
            boolean r19 = r2.l(r0)
            if (r19 == 0) goto L_0x00e6
            r19 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00e8
        L_0x00e6:
            r19 = 4194304(0x400000, float:5.877472E-39)
        L_0x00e8:
            r3 = r3 | r19
        L_0x00ea:
            r19 = 4793491(0x492493, float:6.717112E-39)
            r0 = r3 & r19
            r5 = 4793490(0x492492, float:6.71711E-39)
            r6 = 1
            if (r0 == r5) goto L_0x00f7
            r0 = r6
            goto L_0x00f8
        L_0x00f7:
            r0 = 0
        L_0x00f8:
            r5 = r3 & 1
            boolean r0 = r2.E(r0, r5)
            if (r0 == 0) goto L_0x01db
            r2.p()
            r0 = r11 & 1
            r5 = 54
            if (r0 == 0) goto L_0x012a
            boolean r0 = r2.J()
            if (r0 == 0) goto L_0x0110
            goto L_0x012a
        L_0x0110:
            r2.B()
            r0 = r12 & 4
            if (r0 == 0) goto L_0x0119
            r3 = r3 & -897(0xfffffffffffffc7f, float:NaN)
        L_0x0119:
            r0 = r12 & 8
            if (r0 == 0) goto L_0x011f
            r3 = r3 & -7169(0xffffffffffffe3ff, float:NaN)
        L_0x011f:
            r0 = r28
            r25 = r35
            r10 = r13
            r7 = r15
            r13 = r3
            r3 = r29
            goto L_0x0184
        L_0x012a:
            if (r4 == 0) goto L_0x012f
            androidx.compose.ui.Modifier$Companion r0 = androidx.compose.ui.Modifier.f15489d
            goto L_0x0131
        L_0x012f:
            r0 = r28
        L_0x0131:
            r4 = r12 & 4
            if (r4 == 0) goto L_0x0146
            androidx.compose.material.MaterialTheme r4 = androidx.compose.material.MaterialTheme.f7937a
            r7 = 6
            androidx.compose.material.Colors r4 = r4.a(r2, r7)
            long r19 = androidx.compose.material.ColorsKt.d(r4)
            r3 = r3 & -897(0xfffffffffffffc7f, float:NaN)
            r7 = r3
            r3 = r19
            goto L_0x0149
        L_0x0146:
            r7 = r3
            r3 = r29
        L_0x0149:
            r19 = r12 & 8
            if (r19 == 0) goto L_0x0157
            int r8 = r7 >> 6
            r8 = r8 & 14
            long r8 = androidx.compose.material.ColorsKt.b(r3, r2, r8)
            r7 = r7 & -7169(0xffffffffffffe3ff, float:NaN)
        L_0x0157:
            if (r10 == 0) goto L_0x0160
            androidx.compose.material.TabRowDefaults r10 = androidx.compose.material.TabRowDefaults.f8682a
            float r10 = r10.d()
            goto L_0x0161
        L_0x0160:
            r10 = r13
        L_0x0161:
            if (r14 == 0) goto L_0x0170
            androidx.compose.material.TabRowKt$ScrollableTabRow$1 r13 = new androidx.compose.material.TabRowKt$ScrollableTabRow$1
            r13.<init>(r1)
            r14 = -655609869(0xffffffffd8ec2ff3, float:-2.07752548E15)
            androidx.compose.runtime.internal.ComposableLambda r13 = androidx.compose.runtime.internal.ComposableLambdaKt.e(r14, r6, r13, r2, r5)
            goto L_0x0171
        L_0x0170:
            r13 = r15
        L_0x0171:
            if (r16 == 0) goto L_0x0181
            androidx.compose.material.ComposableSingletons$TabRowKt r14 = androidx.compose.material.ComposableSingletons$TabRowKt.f7556a
            kotlin.jvm.functions.Function2 r14 = r14.b()
            r25 = r14
        L_0x017b:
            r26 = r13
            r13 = r7
            r7 = r26
            goto L_0x0184
        L_0x0181:
            r25 = r35
            goto L_0x017b
        L_0x0184:
            r2.U()
            boolean r14 = androidx.compose.runtime.ComposerKt.P()
            if (r14 == 0) goto L_0x0196
            r14 = -1
            java.lang.String r15 = "androidx.compose.material.ScrollableTabRow (TabRow.kt:236)"
            r5 = -1473476840(0xffffffffa82c8718, float:-9.577212E-15)
            androidx.compose.runtime.ComposerKt.Y(r5, r13, r14, r15)
        L_0x0196:
            androidx.compose.material.TabRowKt$ScrollableTabRow$2 r5 = new androidx.compose.material.TabRowKt$ScrollableTabRow$2
            r28 = r5
            r29 = r10
            r30 = r36
            r31 = r25
            r32 = r7
            r33 = r27
            r28.<init>(r29, r30, r31, r32, r33)
            r14 = 1455860572(0x56c6ab5c, float:1.09219643E14)
            r15 = 54
            androidx.compose.runtime.internal.ComposableLambda r21 = androidx.compose.runtime.internal.ComposableLambdaKt.e(r14, r6, r5, r2, r15)
            int r5 = r13 >> 3
            r5 = r5 & 14
            r5 = r5 | r17
            r6 = r13 & 896(0x380, float:1.256E-42)
            r5 = r5 | r6
            r6 = r13 & 7168(0x1c00, float:1.0045E-41)
            r23 = r5 | r6
            r24 = 50
            r14 = 0
            r19 = 0
            r20 = 0
            r13 = r0
            r15 = r3
            r17 = r8
            r22 = r2
            androidx.compose.material.SurfaceKt.a(r13, r14, r15, r17, r19, r20, r21, r22, r23, r24)
            boolean r5 = androidx.compose.runtime.ComposerKt.P()
            if (r5 == 0) goto L_0x01d6
            androidx.compose.runtime.ComposerKt.X()
        L_0x01d6:
            r4 = r3
            r15 = r7
            r7 = r10
            r3 = r0
            goto L_0x01e5
        L_0x01db:
            r2.B()
            r3 = r28
            r4 = r29
            r25 = r35
            r7 = r13
        L_0x01e5:
            androidx.compose.runtime.ScopeUpdateScope r13 = r2.x()
            if (r13 == 0) goto L_0x0202
            androidx.compose.material.TabRowKt$ScrollableTabRow$3 r14 = new androidx.compose.material.TabRowKt$ScrollableTabRow$3
            r0 = r14
            r1 = r27
            r2 = r3
            r3 = r4
            r5 = r8
            r8 = r15
            r9 = r25
            r10 = r36
            r11 = r38
            r12 = r39
            r0.<init>(r1, r2, r3, r5, r7, r8, r9, r10, r11, r12)
            r13.a(r14)
        L_0x0202:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.TabRowKt.a(int, androidx.compose.ui.Modifier, long, long, float, kotlin.jvm.functions.Function3, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:116:0x01a3  */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x01b1  */
    /* JADX WARNING: Removed duplicated region for block: B:121:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0096  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x009a  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00b2  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00b5  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x00d1  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x00d3  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x00dc  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void b(int r25, androidx.compose.ui.Modifier r26, long r27, long r29, kotlin.jvm.functions.Function3 r31, kotlin.jvm.functions.Function2 r32, kotlin.jvm.functions.Function2 r33, androidx.compose.runtime.Composer r34, int r35, int r36) {
        /*
            r1 = r25
            r9 = r33
            r10 = r35
            r0 = -249175289(0xfffffffff125e307, float:-8.214318E29)
            r2 = r34
            androidx.compose.runtime.Composer r2 = r2.q(r0)
            r3 = r36 & 1
            if (r3 == 0) goto L_0x0016
            r3 = r10 | 6
            goto L_0x0026
        L_0x0016:
            r3 = r10 & 6
            if (r3 != 0) goto L_0x0025
            boolean r3 = r2.i(r1)
            if (r3 == 0) goto L_0x0022
            r3 = 4
            goto L_0x0023
        L_0x0022:
            r3 = 2
        L_0x0023:
            r3 = r3 | r10
            goto L_0x0026
        L_0x0025:
            r3 = r10
        L_0x0026:
            r4 = r36 & 2
            if (r4 == 0) goto L_0x002f
            r3 = r3 | 48
        L_0x002c:
            r5 = r26
            goto L_0x0041
        L_0x002f:
            r5 = r10 & 48
            if (r5 != 0) goto L_0x002c
            r5 = r26
            boolean r6 = r2.W(r5)
            if (r6 == 0) goto L_0x003e
            r6 = 32
            goto L_0x0040
        L_0x003e:
            r6 = 16
        L_0x0040:
            r3 = r3 | r6
        L_0x0041:
            r6 = r10 & 384(0x180, float:5.38E-43)
            if (r6 != 0) goto L_0x005a
            r6 = r36 & 4
            if (r6 != 0) goto L_0x0054
            r6 = r27
            boolean r8 = r2.j(r6)
            if (r8 == 0) goto L_0x0056
            r8 = 256(0x100, float:3.59E-43)
            goto L_0x0058
        L_0x0054:
            r6 = r27
        L_0x0056:
            r8 = 128(0x80, float:1.794E-43)
        L_0x0058:
            r3 = r3 | r8
            goto L_0x005c
        L_0x005a:
            r6 = r27
        L_0x005c:
            r8 = r10 & 3072(0xc00, float:4.305E-42)
            if (r8 != 0) goto L_0x0073
            r8 = r36 & 8
            r11 = r29
            if (r8 != 0) goto L_0x006f
            boolean r8 = r2.j(r11)
            if (r8 == 0) goto L_0x006f
            r8 = 2048(0x800, float:2.87E-42)
            goto L_0x0071
        L_0x006f:
            r8 = 1024(0x400, float:1.435E-42)
        L_0x0071:
            r3 = r3 | r8
            goto L_0x0075
        L_0x0073:
            r11 = r29
        L_0x0075:
            r8 = r36 & 16
            if (r8 == 0) goto L_0x007e
            r3 = r3 | 24576(0x6000, float:3.4438E-41)
        L_0x007b:
            r13 = r31
            goto L_0x0090
        L_0x007e:
            r13 = r10 & 24576(0x6000, float:3.4438E-41)
            if (r13 != 0) goto L_0x007b
            r13 = r31
            boolean r14 = r2.l(r13)
            if (r14 == 0) goto L_0x008d
            r14 = 16384(0x4000, float:2.2959E-41)
            goto L_0x008f
        L_0x008d:
            r14 = 8192(0x2000, float:1.14794E-41)
        L_0x008f:
            r3 = r3 | r14
        L_0x0090:
            r14 = r36 & 32
            r15 = 196608(0x30000, float:2.75506E-40)
            if (r14 == 0) goto L_0x009a
            r3 = r3 | r15
        L_0x0097:
            r15 = r32
            goto L_0x00ac
        L_0x009a:
            r15 = r15 & r10
            if (r15 != 0) goto L_0x0097
            r15 = r32
            boolean r16 = r2.l(r15)
            if (r16 == 0) goto L_0x00a8
            r16 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00aa
        L_0x00a8:
            r16 = 65536(0x10000, float:9.18355E-41)
        L_0x00aa:
            r3 = r3 | r16
        L_0x00ac:
            r16 = r36 & 64
            r17 = 1572864(0x180000, float:2.204052E-39)
            if (r16 == 0) goto L_0x00b5
            r3 = r3 | r17
            goto L_0x00c6
        L_0x00b5:
            r16 = r10 & r17
            if (r16 != 0) goto L_0x00c6
            boolean r16 = r2.l(r9)
            if (r16 == 0) goto L_0x00c2
            r16 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00c4
        L_0x00c2:
            r16 = 524288(0x80000, float:7.34684E-40)
        L_0x00c4:
            r3 = r3 | r16
        L_0x00c6:
            r16 = 599187(0x92493, float:8.3964E-40)
            r0 = r3 & r16
            r5 = 599186(0x92492, float:8.39638E-40)
            r6 = 1
            if (r0 == r5) goto L_0x00d3
            r0 = r6
            goto L_0x00d4
        L_0x00d3:
            r0 = 0
        L_0x00d4:
            r5 = r3 & 1
            boolean r0 = r2.E(r0, r5)
            if (r0 == 0) goto L_0x01a3
            r2.p()
            r0 = r10 & 1
            r5 = 54
            if (r0 == 0) goto L_0x0107
            boolean r0 = r2.J()
            if (r0 == 0) goto L_0x00ec
            goto L_0x0107
        L_0x00ec:
            r2.B()
            r0 = r36 & 4
            if (r0 == 0) goto L_0x00f5
            r3 = r3 & -897(0xfffffffffffffc7f, float:NaN)
        L_0x00f5:
            r0 = r36 & 8
            if (r0 == 0) goto L_0x00fb
            r3 = r3 & -7169(0xffffffffffffe3ff, float:NaN)
        L_0x00fb:
            r0 = r26
            r7 = r11
            r11 = r3
            r3 = r27
            r23 = r15
            r15 = r13
            r13 = r23
            goto L_0x0155
        L_0x0107:
            if (r4 == 0) goto L_0x010c
            androidx.compose.ui.Modifier$Companion r0 = androidx.compose.ui.Modifier.f15489d
            goto L_0x010e
        L_0x010c:
            r0 = r26
        L_0x010e:
            r4 = r36 & 4
            if (r4 == 0) goto L_0x0123
            androidx.compose.material.MaterialTheme r4 = androidx.compose.material.MaterialTheme.f7937a
            r7 = 6
            androidx.compose.material.Colors r4 = r4.a(r2, r7)
            long r19 = androidx.compose.material.ColorsKt.d(r4)
            r3 = r3 & -897(0xfffffffffffffc7f, float:NaN)
            r7 = r3
            r3 = r19
            goto L_0x0126
        L_0x0123:
            r7 = r3
            r3 = r27
        L_0x0126:
            r16 = r36 & 8
            if (r16 == 0) goto L_0x0134
            int r11 = r7 >> 6
            r11 = r11 & 14
            long r11 = androidx.compose.material.ColorsKt.b(r3, r2, r11)
            r7 = r7 & -7169(0xffffffffffffe3ff, float:NaN)
        L_0x0134:
            if (r8 == 0) goto L_0x0143
            androidx.compose.material.TabRowKt$TabRow$1 r8 = new androidx.compose.material.TabRowKt$TabRow$1
            r8.<init>(r1)
            r13 = -553782708(0xffffffffdefdf24c, float:-9.1493859E18)
            androidx.compose.runtime.internal.ComposableLambda r8 = androidx.compose.runtime.internal.ComposableLambdaKt.e(r13, r6, r8, r2, r5)
            goto L_0x0144
        L_0x0143:
            r8 = r13
        L_0x0144:
            if (r14 == 0) goto L_0x0153
            androidx.compose.material.ComposableSingletons$TabRowKt r13 = androidx.compose.material.ComposableSingletons$TabRowKt.f7556a
            kotlin.jvm.functions.Function2 r13 = r13.a()
        L_0x014c:
            r15 = r8
            r23 = r11
            r11 = r7
            r7 = r23
            goto L_0x0155
        L_0x0153:
            r13 = r15
            goto L_0x014c
        L_0x0155:
            r2.U()
            boolean r12 = androidx.compose.runtime.ComposerKt.P()
            if (r12 == 0) goto L_0x0167
            r12 = -1
            java.lang.String r14 = "androidx.compose.material.TabRow (TabRow.kt:145)"
            r5 = -249175289(0xfffffffff125e307, float:-8.214318E29)
            androidx.compose.runtime.ComposerKt.Y(r5, r11, r12, r14)
        L_0x0167:
            androidx.compose.ui.Modifier r5 = androidx.compose.foundation.selection.SelectableGroupKt.a(r0)
            androidx.compose.material.TabRowKt$TabRow$2 r12 = new androidx.compose.material.TabRowKt$TabRow$2
            r12.<init>(r9, r13, r15)
            r14 = -1961746365(0xffffffff8b122043, float:-2.8142848E-32)
            r26 = r0
            r0 = 54
            androidx.compose.runtime.internal.ComposableLambda r19 = androidx.compose.runtime.internal.ComposableLambdaKt.e(r14, r6, r12, r2, r0)
            r0 = r11 & 896(0x380, float:1.256E-42)
            r0 = r0 | r17
            r6 = r11 & 7168(0x1c00, float:1.0045E-41)
            r21 = r0 | r6
            r22 = 50
            r12 = 0
            r17 = 0
            r18 = 0
            r11 = r5
            r0 = r13
            r13 = r3
            r5 = r15
            r15 = r7
            r20 = r2
            androidx.compose.material.SurfaceKt.a(r11, r12, r13, r15, r17, r18, r19, r20, r21, r22)
            boolean r6 = androidx.compose.runtime.ComposerKt.P()
            if (r6 == 0) goto L_0x019d
            androidx.compose.runtime.ComposerKt.X()
        L_0x019d:
            r15 = r0
            r13 = r5
            r4 = r3
            r3 = r26
            goto L_0x01ab
        L_0x01a3:
            r2.B()
            r3 = r26
            r4 = r27
            r7 = r11
        L_0x01ab:
            androidx.compose.runtime.ScopeUpdateScope r12 = r2.x()
            if (r12 == 0) goto L_0x01c7
            androidx.compose.material.TabRowKt$TabRow$3 r14 = new androidx.compose.material.TabRowKt$TabRow$3
            r0 = r14
            r1 = r25
            r2 = r3
            r3 = r4
            r5 = r7
            r7 = r13
            r8 = r15
            r9 = r33
            r10 = r35
            r11 = r36
            r0.<init>(r1, r2, r3, r5, r7, r8, r9, r10, r11)
            r12.a(r14)
        L_0x01c7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.TabRowKt.b(int, androidx.compose.ui.Modifier, long, long, kotlin.jvm.functions.Function3, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, androidx.compose.runtime.Composer, int, int):void");
    }
}
