package androidx.compose.material;

import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;

@Metadata
public final class FloatingActionButtonKt {

    /* renamed from: a  reason: collision with root package name */
    public static final float f7871a = Dp.m((float) 56);

    /* renamed from: b  reason: collision with root package name */
    public static final float f7872b = Dp.m((float) 48);

    /* renamed from: c  reason: collision with root package name */
    public static final float f7873c = Dp.m((float) 12);

    /* renamed from: d  reason: collision with root package name */
    public static final float f7874d = Dp.m((float) 20);

    /* JADX WARNING: Removed duplicated region for block: B:100:0x010d  */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x010f  */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x0118  */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x01db  */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x0244  */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x0250  */
    /* JADX WARNING: Removed duplicated region for block: B:155:0x0264  */
    /* JADX WARNING: Removed duplicated region for block: B:157:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0097  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00ac  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x00c9  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x00d1  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x00e4  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x00eb  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x0101  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void a(kotlin.jvm.functions.Function2 r29, kotlin.jvm.functions.Function0 r30, androidx.compose.ui.Modifier r31, kotlin.jvm.functions.Function2 r32, androidx.compose.foundation.interaction.MutableInteractionSource r33, androidx.compose.ui.graphics.Shape r34, long r35, long r37, androidx.compose.material.FloatingActionButtonElevation r39, androidx.compose.runtime.Composer r40, int r41, int r42) {
        /*
            r1 = r29
            r12 = r41
            r13 = r42
            r0 = -1555720195(0xffffffffa34597fd, float:-1.0711576E-17)
            r2 = r40
            androidx.compose.runtime.Composer r2 = r2.q(r0)
            r3 = r13 & 1
            if (r3 == 0) goto L_0x0016
            r3 = r12 | 6
            goto L_0x0026
        L_0x0016:
            r3 = r12 & 6
            if (r3 != 0) goto L_0x0025
            boolean r3 = r2.l(r1)
            if (r3 == 0) goto L_0x0022
            r3 = 4
            goto L_0x0023
        L_0x0022:
            r3 = 2
        L_0x0023:
            r3 = r3 | r12
            goto L_0x0026
        L_0x0025:
            r3 = r12
        L_0x0026:
            r4 = r13 & 2
            if (r4 == 0) goto L_0x002f
            r3 = r3 | 48
        L_0x002c:
            r4 = r30
            goto L_0x0041
        L_0x002f:
            r4 = r12 & 48
            if (r4 != 0) goto L_0x002c
            r4 = r30
            boolean r5 = r2.l(r4)
            if (r5 == 0) goto L_0x003e
            r5 = 32
            goto L_0x0040
        L_0x003e:
            r5 = 16
        L_0x0040:
            r3 = r3 | r5
        L_0x0041:
            r5 = r13 & 4
            if (r5 == 0) goto L_0x004a
            r3 = r3 | 384(0x180, float:5.38E-43)
        L_0x0047:
            r6 = r31
            goto L_0x005c
        L_0x004a:
            r6 = r12 & 384(0x180, float:5.38E-43)
            if (r6 != 0) goto L_0x0047
            r6 = r31
            boolean r7 = r2.W(r6)
            if (r7 == 0) goto L_0x0059
            r7 = 256(0x100, float:3.59E-43)
            goto L_0x005b
        L_0x0059:
            r7 = 128(0x80, float:1.794E-43)
        L_0x005b:
            r3 = r3 | r7
        L_0x005c:
            r7 = r13 & 8
            if (r7 == 0) goto L_0x0065
            r3 = r3 | 3072(0xc00, float:4.305E-42)
        L_0x0062:
            r8 = r32
            goto L_0x0077
        L_0x0065:
            r8 = r12 & 3072(0xc00, float:4.305E-42)
            if (r8 != 0) goto L_0x0062
            r8 = r32
            boolean r9 = r2.l(r8)
            if (r9 == 0) goto L_0x0074
            r9 = 2048(0x800, float:2.87E-42)
            goto L_0x0076
        L_0x0074:
            r9 = 1024(0x400, float:1.435E-42)
        L_0x0076:
            r3 = r3 | r9
        L_0x0077:
            r9 = r13 & 16
            if (r9 == 0) goto L_0x0080
            r3 = r3 | 24576(0x6000, float:3.4438E-41)
        L_0x007d:
            r10 = r33
            goto L_0x0092
        L_0x0080:
            r10 = r12 & 24576(0x6000, float:3.4438E-41)
            if (r10 != 0) goto L_0x007d
            r10 = r33
            boolean r11 = r2.W(r10)
            if (r11 == 0) goto L_0x008f
            r11 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0091
        L_0x008f:
            r11 = 8192(0x2000, float:1.14794E-41)
        L_0x0091:
            r3 = r3 | r11
        L_0x0092:
            r11 = 196608(0x30000, float:2.75506E-40)
            r11 = r11 & r12
            if (r11 != 0) goto L_0x00ac
            r11 = r13 & 32
            if (r11 != 0) goto L_0x00a6
            r11 = r34
            boolean r14 = r2.W(r11)
            if (r14 == 0) goto L_0x00a8
            r14 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00aa
        L_0x00a6:
            r11 = r34
        L_0x00a8:
            r14 = 65536(0x10000, float:9.18355E-41)
        L_0x00aa:
            r3 = r3 | r14
            goto L_0x00ae
        L_0x00ac:
            r11 = r34
        L_0x00ae:
            r14 = 1572864(0x180000, float:2.204052E-39)
            r14 = r14 & r12
            if (r14 != 0) goto L_0x00c9
            r14 = r13 & 64
            if (r14 != 0) goto L_0x00c2
            r14 = r35
            boolean r16 = r2.j(r14)
            if (r16 == 0) goto L_0x00c4
            r16 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00c6
        L_0x00c2:
            r14 = r35
        L_0x00c4:
            r16 = 524288(0x80000, float:7.34684E-40)
        L_0x00c6:
            r3 = r3 | r16
            goto L_0x00cb
        L_0x00c9:
            r14 = r35
        L_0x00cb:
            r16 = 12582912(0xc00000, float:1.7632415E-38)
            r17 = r12 & r16
            if (r17 != 0) goto L_0x00e4
            r0 = r13 & 128(0x80, float:1.794E-43)
            r10 = r37
            if (r0 != 0) goto L_0x00e0
            boolean r0 = r2.j(r10)
            if (r0 == 0) goto L_0x00e0
            r0 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00e2
        L_0x00e0:
            r0 = 4194304(0x400000, float:5.877472E-39)
        L_0x00e2:
            r3 = r3 | r0
            goto L_0x00e6
        L_0x00e4:
            r10 = r37
        L_0x00e6:
            r0 = 100663296(0x6000000, float:2.4074124E-35)
            r0 = r0 & r12
            if (r0 != 0) goto L_0x0101
            r0 = r13 & 256(0x100, float:3.59E-43)
            if (r0 != 0) goto L_0x00fa
            r0 = r39
            boolean r18 = r2.W(r0)
            if (r18 == 0) goto L_0x00fc
            r18 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x00fe
        L_0x00fa:
            r0 = r39
        L_0x00fc:
            r18 = 33554432(0x2000000, float:9.403955E-38)
        L_0x00fe:
            r3 = r3 | r18
            goto L_0x0103
        L_0x0101:
            r0 = r39
        L_0x0103:
            r18 = 38347923(0x2492493, float:1.4777644E-37)
            r0 = r3 & r18
            r4 = 38347922(0x2492492, float:1.4777643E-37)
            if (r0 == r4) goto L_0x010f
            r0 = 1
            goto L_0x0110
        L_0x010f:
            r0 = 0
        L_0x0110:
            r4 = r3 & 1
            boolean r0 = r2.E(r0, r4)
            if (r0 == 0) goto L_0x0250
            r2.p()
            r0 = r12 & 1
            r4 = -234881025(0xfffffffff1ffffff, float:-2.535301E30)
            r18 = -29360129(0xfffffffffe3fffff, float:-6.380294E37)
            r19 = -3670017(0xffffffffffc7ffff, float:NaN)
            r20 = -458753(0xfffffffffff8ffff, float:NaN)
            r6 = 6
            if (r0 == 0) goto L_0x015d
            boolean r0 = r2.J()
            if (r0 == 0) goto L_0x0133
            goto L_0x015d
        L_0x0133:
            r2.B()
            r0 = r13 & 32
            if (r0 == 0) goto L_0x013c
            r3 = r3 & r20
        L_0x013c:
            r0 = r13 & 64
            if (r0 == 0) goto L_0x0142
            r3 = r3 & r19
        L_0x0142:
            r0 = r13 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x0148
            r3 = r3 & r18
        L_0x0148:
            r0 = r13 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L_0x014d
            r3 = r3 & r4
        L_0x014d:
            r0 = r31
            r5 = r33
            r7 = r34
            r9 = r10
        L_0x0154:
            r11 = r39
        L_0x0156:
            r27 = r14
            r14 = r3
            r3 = r27
            goto L_0x01d2
        L_0x015d:
            if (r5 == 0) goto L_0x0162
            androidx.compose.ui.Modifier$Companion r0 = androidx.compose.ui.Modifier.f15489d
            goto L_0x0164
        L_0x0162:
            r0 = r31
        L_0x0164:
            r5 = 0
            if (r7 == 0) goto L_0x0168
            r8 = r5
        L_0x0168:
            if (r9 == 0) goto L_0x016b
            goto L_0x016d
        L_0x016b:
            r5 = r33
        L_0x016d:
            r7 = r13 & 32
            if (r7 == 0) goto L_0x0188
            androidx.compose.material.MaterialTheme r7 = androidx.compose.material.MaterialTheme.f7937a
            androidx.compose.material.Shapes r7 = r7.b(r2, r6)
            androidx.compose.foundation.shape.CornerBasedShape r7 = r7.c()
            r9 = 50
            androidx.compose.foundation.shape.CornerSize r9 = androidx.compose.foundation.shape.CornerSizeKt.b(r9)
            androidx.compose.foundation.shape.CornerBasedShape r7 = r7.b(r9)
            r3 = r3 & r20
            goto L_0x018a
        L_0x0188:
            r7 = r34
        L_0x018a:
            r9 = r13 & 64
            if (r9 == 0) goto L_0x019a
            androidx.compose.material.MaterialTheme r9 = androidx.compose.material.MaterialTheme.f7937a
            androidx.compose.material.Colors r9 = r9.a(r2, r6)
            long r14 = r9.l()
            r3 = r3 & r19
        L_0x019a:
            r9 = r13 & 128(0x80, float:1.794E-43)
            if (r9 == 0) goto L_0x01a9
            int r9 = r3 >> 18
            r9 = r9 & 14
            long r9 = androidx.compose.material.ColorsKt.b(r14, r2, r9)
            r3 = r3 & r18
            goto L_0x01aa
        L_0x01a9:
            r9 = r10
        L_0x01aa:
            r11 = r13 & 256(0x100, float:3.59E-43)
            if (r11 == 0) goto L_0x0154
            androidx.compose.material.FloatingActionButtonDefaults r11 = androidx.compose.material.FloatingActionButtonDefaults.f7863a
            r18 = 24576(0x6000, float:3.4438E-41)
            r19 = 15
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r31 = r11
            r32 = r20
            r33 = r21
            r34 = r22
            r35 = r23
            r36 = r2
            r37 = r18
            r38 = r19
            androidx.compose.material.FloatingActionButtonElevation r11 = r31.a(r32, r33, r34, r35, r36, r37, r38)
            r3 = r3 & r4
            goto L_0x0156
        L_0x01d2:
            r2.U()
            boolean r15 = androidx.compose.runtime.ComposerKt.P()
            if (r15 == 0) goto L_0x01e4
            r15 = -1
            java.lang.String r6 = "androidx.compose.material.ExtendedFloatingActionButton (FloatingActionButton.kt:159)"
            r12 = -1555720195(0xffffffffa34597fd, float:-1.0711576E-17)
            androidx.compose.runtime.ComposerKt.Y(r12, r14, r15, r6)
        L_0x01e4:
            float r6 = f7872b
            r12 = 12
            r15 = 0
            r17 = 0
            r19 = 0
            r31 = r0
            r32 = r6
            r33 = r6
            r34 = r17
            r35 = r19
            r36 = r12
            r37 = r15
            androidx.compose.ui.Modifier r15 = androidx.compose.foundation.layout.SizeKt.x(r31, r32, r33, r34, r35, r36, r37)
            androidx.compose.material.FloatingActionButtonKt$ExtendedFloatingActionButton$1 r6 = new androidx.compose.material.FloatingActionButtonKt$ExtendedFloatingActionButton$1
            r6.<init>(r8, r1)
            r12 = 54
            r0 = 1418981691(0x5493f13b, float:5.0832589E12)
            r1 = 1
            androidx.compose.runtime.internal.ComposableLambda r23 = androidx.compose.runtime.internal.ComposableLambdaKt.e(r0, r1, r6, r2, r12)
            int r0 = r14 >> 3
            r0 = r0 & 14
            r0 = r0 | r16
            r1 = 6
            int r1 = r14 >> 6
            r6 = r1 & 896(0x380, float:1.256E-42)
            r0 = r0 | r6
            r6 = r1 & 7168(0x1c00, float:1.0045E-41)
            r0 = r0 | r6
            r6 = 57344(0xe000, float:8.0356E-41)
            r6 = r6 & r1
            r0 = r0 | r6
            r6 = 458752(0x70000, float:6.42848E-40)
            r6 = r6 & r1
            r0 = r0 | r6
            r6 = 3670016(0x380000, float:5.142788E-39)
            r1 = r1 & r6
            r25 = r0 | r1
            r26 = 0
            r14 = r30
            r16 = r5
            r17 = r7
            r18 = r3
            r20 = r9
            r22 = r11
            r24 = r2
            b(r14, r15, r16, r17, r18, r20, r22, r23, r24, r25, r26)
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x0247
            androidx.compose.runtime.ComposerKt.X()
        L_0x0247:
            r6 = r7
            r27 = r3
            r3 = r31
            r4 = r8
            r7 = r27
            goto L_0x025e
        L_0x0250:
            r2.B()
            r3 = r31
            r5 = r33
            r6 = r34
            r4 = r8
            r9 = r10
            r7 = r14
            r11 = r39
        L_0x025e:
            androidx.compose.runtime.ScopeUpdateScope r14 = r2.x()
            if (r14 == 0) goto L_0x0275
            androidx.compose.material.FloatingActionButtonKt$ExtendedFloatingActionButton$2 r15 = new androidx.compose.material.FloatingActionButtonKt$ExtendedFloatingActionButton$2
            r0 = r15
            r1 = r29
            r2 = r30
            r12 = r41
            r13 = r42
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r9, r11, r12, r13)
            r14.a(r15)
        L_0x0275:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.FloatingActionButtonKt.a(kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function0, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function2, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.ui.graphics.Shape, long, long, androidx.compose.material.FloatingActionButtonElevation, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:131:0x01b2  */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x01bd  */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x01dd  */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x0243  */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x024e  */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x025d  */
    /* JADX WARNING: Removed duplicated region for block: B:147:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x007c  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0095  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x009c  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x00af  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00b6  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x00cb  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x00d3  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x00d6  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x00ef  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x00f1  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x00fa  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void b(kotlin.jvm.functions.Function0 r28, androidx.compose.ui.Modifier r29, androidx.compose.foundation.interaction.MutableInteractionSource r30, androidx.compose.ui.graphics.Shape r31, long r32, long r34, androidx.compose.material.FloatingActionButtonElevation r36, kotlin.jvm.functions.Function2 r37, androidx.compose.runtime.Composer r38, int r39, int r40) {
        /*
            r10 = r37
            r11 = r39
            r12 = r40
            r0 = 1028985328(0x3d5511f0, float:0.05201906)
            r1 = r38
            androidx.compose.runtime.Composer r1 = r1.q(r0)
            r2 = r12 & 1
            if (r2 == 0) goto L_0x0019
            r2 = r11 | 6
            r3 = r2
            r2 = r28
            goto L_0x002d
        L_0x0019:
            r2 = r11 & 6
            if (r2 != 0) goto L_0x002a
            r2 = r28
            boolean r3 = r1.l(r2)
            if (r3 == 0) goto L_0x0027
            r3 = 4
            goto L_0x0028
        L_0x0027:
            r3 = 2
        L_0x0028:
            r3 = r3 | r11
            goto L_0x002d
        L_0x002a:
            r2 = r28
            r3 = r11
        L_0x002d:
            r4 = r12 & 2
            if (r4 == 0) goto L_0x0036
            r3 = r3 | 48
        L_0x0033:
            r5 = r29
            goto L_0x0048
        L_0x0036:
            r5 = r11 & 48
            if (r5 != 0) goto L_0x0033
            r5 = r29
            boolean r6 = r1.W(r5)
            if (r6 == 0) goto L_0x0045
            r6 = 32
            goto L_0x0047
        L_0x0045:
            r6 = 16
        L_0x0047:
            r3 = r3 | r6
        L_0x0048:
            r6 = r12 & 4
            if (r6 == 0) goto L_0x0051
            r3 = r3 | 384(0x180, float:5.38E-43)
        L_0x004e:
            r7 = r30
            goto L_0x0063
        L_0x0051:
            r7 = r11 & 384(0x180, float:5.38E-43)
            if (r7 != 0) goto L_0x004e
            r7 = r30
            boolean r8 = r1.W(r7)
            if (r8 == 0) goto L_0x0060
            r8 = 256(0x100, float:3.59E-43)
            goto L_0x0062
        L_0x0060:
            r8 = 128(0x80, float:1.794E-43)
        L_0x0062:
            r3 = r3 | r8
        L_0x0063:
            r8 = r11 & 3072(0xc00, float:4.305E-42)
            if (r8 != 0) goto L_0x007c
            r8 = r12 & 8
            if (r8 != 0) goto L_0x0076
            r8 = r31
            boolean r9 = r1.W(r8)
            if (r9 == 0) goto L_0x0078
            r9 = 2048(0x800, float:2.87E-42)
            goto L_0x007a
        L_0x0076:
            r8 = r31
        L_0x0078:
            r9 = 1024(0x400, float:1.435E-42)
        L_0x007a:
            r3 = r3 | r9
            goto L_0x007e
        L_0x007c:
            r8 = r31
        L_0x007e:
            r9 = r11 & 24576(0x6000, float:3.4438E-41)
            if (r9 != 0) goto L_0x0095
            r9 = r12 & 16
            r13 = r32
            if (r9 != 0) goto L_0x0091
            boolean r9 = r1.j(r13)
            if (r9 == 0) goto L_0x0091
            r9 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0093
        L_0x0091:
            r9 = 8192(0x2000, float:1.14794E-41)
        L_0x0093:
            r3 = r3 | r9
            goto L_0x0097
        L_0x0095:
            r13 = r32
        L_0x0097:
            r9 = 196608(0x30000, float:2.75506E-40)
            r9 = r9 & r11
            if (r9 != 0) goto L_0x00af
            r9 = r12 & 32
            r7 = r34
            if (r9 != 0) goto L_0x00ab
            boolean r9 = r1.j(r7)
            if (r9 == 0) goto L_0x00ab
            r9 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00ad
        L_0x00ab:
            r9 = 65536(0x10000, float:9.18355E-41)
        L_0x00ad:
            r3 = r3 | r9
            goto L_0x00b1
        L_0x00af:
            r7 = r34
        L_0x00b1:
            r9 = 1572864(0x180000, float:2.204052E-39)
            r9 = r9 & r11
            if (r9 != 0) goto L_0x00cb
            r9 = r12 & 64
            if (r9 != 0) goto L_0x00c5
            r9 = r36
            boolean r15 = r1.W(r9)
            if (r15 == 0) goto L_0x00c7
            r15 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00c9
        L_0x00c5:
            r9 = r36
        L_0x00c7:
            r15 = 524288(0x80000, float:7.34684E-40)
        L_0x00c9:
            r3 = r3 | r15
            goto L_0x00cd
        L_0x00cb:
            r9 = r36
        L_0x00cd:
            r15 = r12 & 128(0x80, float:1.794E-43)
            r16 = 12582912(0xc00000, float:1.7632415E-38)
            if (r15 == 0) goto L_0x00d6
            r3 = r3 | r16
            goto L_0x00e6
        L_0x00d6:
            r15 = r11 & r16
            if (r15 != 0) goto L_0x00e6
            boolean r15 = r1.l(r10)
            if (r15 == 0) goto L_0x00e3
            r15 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00e5
        L_0x00e3:
            r15 = 4194304(0x400000, float:5.877472E-39)
        L_0x00e5:
            r3 = r3 | r15
        L_0x00e6:
            r15 = 4793491(0x492493, float:6.717112E-39)
            r15 = r15 & r3
            r0 = 4793490(0x492492, float:6.71711E-39)
            if (r15 == r0) goto L_0x00f1
            r0 = 1
            goto L_0x00f2
        L_0x00f1:
            r0 = 0
        L_0x00f2:
            r15 = r3 & 1
            boolean r0 = r1.E(r0, r15)
            if (r0 == 0) goto L_0x024e
            r1.p()
            r0 = r11 & 1
            r17 = -3670017(0xffffffffffc7ffff, float:NaN)
            r18 = -458753(0xfffffffffff8ffff, float:NaN)
            r19 = -57345(0xffffffffffff1fff, float:NaN)
            if (r0 == 0) goto L_0x0135
            boolean r0 = r1.J()
            if (r0 == 0) goto L_0x0111
            goto L_0x0135
        L_0x0111:
            r1.B()
            r0 = r12 & 8
            if (r0 == 0) goto L_0x011a
            r3 = r3 & -7169(0xffffffffffffe3ff, float:NaN)
        L_0x011a:
            r0 = r12 & 16
            if (r0 == 0) goto L_0x0120
            r3 = r3 & r19
        L_0x0120:
            r0 = r12 & 32
            if (r0 == 0) goto L_0x0126
            r3 = r3 & r18
        L_0x0126:
            r0 = r12 & 64
            if (r0 == 0) goto L_0x012c
            r3 = r3 & r17
        L_0x012c:
            r0 = r30
            r2 = r31
            r6 = r7
        L_0x0131:
            r8 = r3
        L_0x0132:
            r3 = r13
            goto L_0x01a9
        L_0x0135:
            if (r4 == 0) goto L_0x013a
            androidx.compose.ui.Modifier$Companion r0 = androidx.compose.ui.Modifier.f15489d
            r5 = r0
        L_0x013a:
            if (r6 == 0) goto L_0x013e
            r0 = 0
            goto L_0x0140
        L_0x013e:
            r0 = r30
        L_0x0140:
            r4 = r12 & 8
            r6 = 6
            if (r4 == 0) goto L_0x015c
            androidx.compose.material.MaterialTheme r4 = androidx.compose.material.MaterialTheme.f7937a
            androidx.compose.material.Shapes r4 = r4.b(r1, r6)
            androidx.compose.foundation.shape.CornerBasedShape r4 = r4.c()
            r20 = 50
            androidx.compose.foundation.shape.CornerSize r2 = androidx.compose.foundation.shape.CornerSizeKt.b(r20)
            androidx.compose.foundation.shape.CornerBasedShape r2 = r4.b(r2)
            r3 = r3 & -7169(0xffffffffffffe3ff, float:NaN)
            goto L_0x015e
        L_0x015c:
            r2 = r31
        L_0x015e:
            r4 = r12 & 16
            if (r4 == 0) goto L_0x016e
            androidx.compose.material.MaterialTheme r4 = androidx.compose.material.MaterialTheme.f7937a
            androidx.compose.material.Colors r4 = r4.a(r1, r6)
            long r13 = r4.l()
            r3 = r3 & r19
        L_0x016e:
            r4 = r12 & 32
            if (r4 == 0) goto L_0x017d
            int r4 = r3 >> 12
            r4 = r4 & 14
            long r6 = androidx.compose.material.ColorsKt.b(r13, r1, r4)
            r3 = r3 & r18
            goto L_0x017e
        L_0x017d:
            r6 = r7
        L_0x017e:
            r4 = r12 & 64
            if (r4 == 0) goto L_0x0131
            androidx.compose.material.FloatingActionButtonDefaults r4 = androidx.compose.material.FloatingActionButtonDefaults.f7863a
            r8 = 24576(0x6000, float:3.4438E-41)
            r9 = 15
            r18 = 0
            r19 = 0
            r20 = 0
            r22 = 0
            r29 = r4
            r30 = r18
            r31 = r19
            r32 = r20
            r33 = r22
            r34 = r1
            r35 = r8
            r36 = r9
            androidx.compose.material.FloatingActionButtonElevation r4 = r29.a(r30, r31, r32, r33, r34, r35, r36)
            r3 = r3 & r17
            r8 = r3
            r9 = r4
            goto L_0x0132
        L_0x01a9:
            r1.U()
            boolean r13 = androidx.compose.runtime.ComposerKt.P()
            if (r13 == 0) goto L_0x01bb
            r13 = -1
            java.lang.String r14 = "androidx.compose.material.FloatingActionButton (FloatingActionButton.kt:90)"
            r15 = 1028985328(0x3d5511f0, float:0.05201906)
            androidx.compose.runtime.ComposerKt.Y(r15, r8, r13, r14)
        L_0x01bb:
            if (r0 != 0) goto L_0x01dd
            r13 = -1991740377(0xffffffff89487427, float:-2.4128739E-33)
            r1.X(r13)
            java.lang.Object r13 = r1.g()
            androidx.compose.runtime.Composer$Companion r14 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r14 = r14.a()
            if (r13 != r14) goto L_0x01d6
            androidx.compose.foundation.interaction.MutableInteractionSource r13 = androidx.compose.foundation.interaction.InteractionSourceKt.a()
            r1.N(r13)
        L_0x01d6:
            androidx.compose.foundation.interaction.MutableInteractionSource r13 = (androidx.compose.foundation.interaction.MutableInteractionSource) r13
            r1.M()
            r15 = r13
            goto L_0x01e7
        L_0x01dd:
            r13 = 628486320(0x2575f0b0, float:2.1331911E-16)
            r1.X(r13)
            r1.M()
            r15 = r0
        L_0x01e7:
            androidx.compose.material.FloatingActionButtonKt$FloatingActionButton$1 r13 = androidx.compose.material.FloatingActionButtonKt$FloatingActionButton$1.f7880z
            r29 = r0
            r0 = 1
            r11 = 0
            r14 = 0
            androidx.compose.ui.Modifier r14 = androidx.compose.ui.semantics.SemanticsModifierKt.d(r5, r14, r13, r0, r11)
            int r0 = r8 >> 15
            r0 = r0 & 112(0x70, float:1.57E-43)
            androidx.compose.runtime.State r0 = r9.a(r15, r1, r0)
            java.lang.Object r0 = r0.getValue()
            androidx.compose.ui.unit.Dp r0 = (androidx.compose.ui.unit.Dp) r0
            float r22 = r0.t()
            androidx.compose.material.FloatingActionButtonKt$FloatingActionButton$2 r0 = new androidx.compose.material.FloatingActionButtonKt$FloatingActionButton$2
            r0.<init>(r6, r10)
            r11 = 54
            r13 = 1972871863(0x7597a2b7, float:3.8444193E32)
            r30 = r5
            r5 = 1
            androidx.compose.runtime.internal.ComposableLambda r24 = androidx.compose.runtime.internal.ComposableLambdaKt.e(r13, r5, r0, r1, r11)
            r0 = r8 & 14
            r5 = 805306368(0x30000000, float:4.656613E-10)
            r0 = r0 | r5
            r5 = r8 & 7168(0x1c00, float:1.0045E-41)
            r0 = r0 | r5
            r5 = 57344(0xe000, float:8.0356E-41)
            r5 = r5 & r8
            r0 = r0 | r5
            r5 = 458752(0x70000, float:6.42848E-40)
            r5 = r5 & r8
            r26 = r0 | r5
            r27 = 68
            r0 = 0
            r21 = 0
            r13 = r28
            r5 = r15
            r15 = r0
            r16 = r2
            r17 = r3
            r19 = r6
            r23 = r5
            r25 = r1
            androidx.compose.material.SurfaceKt.b(r13, r14, r15, r16, r17, r19, r21, r22, r23, r24, r25, r26, r27)
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x0246
            androidx.compose.runtime.ComposerKt.X()
        L_0x0246:
            r7 = r6
            r5 = r3
            r3 = r29
            r4 = r2
            r2 = r30
            goto L_0x0257
        L_0x024e:
            r1.B()
            r3 = r30
            r4 = r31
            r2 = r5
            r5 = r13
        L_0x0257:
            androidx.compose.runtime.ScopeUpdateScope r13 = r1.x()
            if (r13 == 0) goto L_0x026e
            androidx.compose.material.FloatingActionButtonKt$FloatingActionButton$3 r14 = new androidx.compose.material.FloatingActionButtonKt$FloatingActionButton$3
            r0 = r14
            r1 = r28
            r10 = r37
            r11 = r39
            r12 = r40
            r0.<init>(r1, r2, r3, r4, r5, r7, r9, r10, r11, r12)
            r13.a(r14)
        L_0x026e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.FloatingActionButtonKt.b(kotlin.jvm.functions.Function0, androidx.compose.ui.Modifier, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.ui.graphics.Shape, long, long, androidx.compose.material.FloatingActionButtonElevation, kotlin.jvm.functions.Function2, androidx.compose.runtime.Composer, int, int):void");
    }
}
