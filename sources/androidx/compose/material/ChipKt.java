package androidx.compose.material;

import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;

@Metadata
public final class ChipKt {

    /* renamed from: a  reason: collision with root package name */
    public static final float f7475a = Dp.m((float) 12);

    /* renamed from: b  reason: collision with root package name */
    public static final float f7476b = Dp.m((float) 4);

    /* renamed from: c  reason: collision with root package name */
    public static final float f7477c;

    /* renamed from: d  reason: collision with root package name */
    public static final float f7478d;

    /* renamed from: e  reason: collision with root package name */
    public static final float f7479e = Dp.m((float) 24);

    static {
        float f2 = (float) 8;
        f7477c = Dp.m(f2);
        f7478d = Dp.m(f2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:100:0x0115  */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x0117  */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x0120  */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x01bb  */
    /* JADX WARNING: Removed duplicated region for block: B:143:0x0245  */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x024e  */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x0261  */
    /* JADX WARNING: Removed duplicated region for block: B:150:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0095  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00a1  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00b7  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x00cd  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x00d5  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x00da  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x00f3  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x00f8  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void a(kotlin.jvm.functions.Function0 r30, androidx.compose.ui.Modifier r31, boolean r32, androidx.compose.foundation.interaction.MutableInteractionSource r33, androidx.compose.ui.graphics.Shape r34, androidx.compose.foundation.BorderStroke r35, androidx.compose.material.ChipColors r36, kotlin.jvm.functions.Function2 r37, kotlin.jvm.functions.Function3 r38, androidx.compose.runtime.Composer r39, int r40, int r41) {
        /*
            r10 = r40
            r11 = r41
            r0 = -368396408(0xffffffffea0ab788, float:-4.1924616E25)
            r1 = r39
            androidx.compose.runtime.Composer r1 = r1.q(r0)
            r2 = r11 & 1
            if (r2 == 0) goto L_0x0017
            r2 = r10 | 6
            r3 = r2
            r2 = r30
            goto L_0x002b
        L_0x0017:
            r2 = r10 & 6
            if (r2 != 0) goto L_0x0028
            r2 = r30
            boolean r3 = r1.l(r2)
            if (r3 == 0) goto L_0x0025
            r3 = 4
            goto L_0x0026
        L_0x0025:
            r3 = 2
        L_0x0026:
            r3 = r3 | r10
            goto L_0x002b
        L_0x0028:
            r2 = r30
            r3 = r10
        L_0x002b:
            r4 = r11 & 2
            if (r4 == 0) goto L_0x0034
            r3 = r3 | 48
        L_0x0031:
            r5 = r31
            goto L_0x0046
        L_0x0034:
            r5 = r10 & 48
            if (r5 != 0) goto L_0x0031
            r5 = r31
            boolean r6 = r1.W(r5)
            if (r6 == 0) goto L_0x0043
            r6 = 32
            goto L_0x0045
        L_0x0043:
            r6 = 16
        L_0x0045:
            r3 = r3 | r6
        L_0x0046:
            r6 = r11 & 4
            if (r6 == 0) goto L_0x004f
            r3 = r3 | 384(0x180, float:5.38E-43)
        L_0x004c:
            r7 = r32
            goto L_0x0061
        L_0x004f:
            r7 = r10 & 384(0x180, float:5.38E-43)
            if (r7 != 0) goto L_0x004c
            r7 = r32
            boolean r8 = r1.d(r7)
            if (r8 == 0) goto L_0x005e
            r8 = 256(0x100, float:3.59E-43)
            goto L_0x0060
        L_0x005e:
            r8 = 128(0x80, float:1.794E-43)
        L_0x0060:
            r3 = r3 | r8
        L_0x0061:
            r8 = r11 & 8
            if (r8 == 0) goto L_0x006a
            r3 = r3 | 3072(0xc00, float:4.305E-42)
        L_0x0067:
            r9 = r33
            goto L_0x007c
        L_0x006a:
            r9 = r10 & 3072(0xc00, float:4.305E-42)
            if (r9 != 0) goto L_0x0067
            r9 = r33
            boolean r12 = r1.W(r9)
            if (r12 == 0) goto L_0x0079
            r12 = 2048(0x800, float:2.87E-42)
            goto L_0x007b
        L_0x0079:
            r12 = 1024(0x400, float:1.435E-42)
        L_0x007b:
            r3 = r3 | r12
        L_0x007c:
            r12 = r10 & 24576(0x6000, float:3.4438E-41)
            if (r12 != 0) goto L_0x0095
            r12 = r11 & 16
            if (r12 != 0) goto L_0x008f
            r12 = r34
            boolean r13 = r1.W(r12)
            if (r13 == 0) goto L_0x0091
            r13 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0093
        L_0x008f:
            r12 = r34
        L_0x0091:
            r13 = 8192(0x2000, float:1.14794E-41)
        L_0x0093:
            r3 = r3 | r13
            goto L_0x0097
        L_0x0095:
            r12 = r34
        L_0x0097:
            r13 = r11 & 32
            r14 = 196608(0x30000, float:2.75506E-40)
            if (r13 == 0) goto L_0x00a1
            r3 = r3 | r14
        L_0x009e:
            r14 = r35
            goto L_0x00b2
        L_0x00a1:
            r14 = r14 & r10
            if (r14 != 0) goto L_0x009e
            r14 = r35
            boolean r15 = r1.W(r14)
            if (r15 == 0) goto L_0x00af
            r15 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00b1
        L_0x00af:
            r15 = 65536(0x10000, float:9.18355E-41)
        L_0x00b1:
            r3 = r3 | r15
        L_0x00b2:
            r15 = 1572864(0x180000, float:2.204052E-39)
            r15 = r15 & r10
            if (r15 != 0) goto L_0x00cd
            r15 = r11 & 64
            if (r15 != 0) goto L_0x00c6
            r15 = r36
            boolean r16 = r1.W(r15)
            if (r16 == 0) goto L_0x00c8
            r16 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00ca
        L_0x00c6:
            r15 = r36
        L_0x00c8:
            r16 = 524288(0x80000, float:7.34684E-40)
        L_0x00ca:
            r3 = r3 | r16
            goto L_0x00cf
        L_0x00cd:
            r15 = r36
        L_0x00cf:
            r0 = r11 & 128(0x80, float:1.794E-43)
            r16 = 12582912(0xc00000, float:1.7632415E-38)
            if (r0 == 0) goto L_0x00da
            r3 = r3 | r16
            r15 = r37
            goto L_0x00ed
        L_0x00da:
            r16 = r10 & r16
            r15 = r37
            if (r16 != 0) goto L_0x00ed
            boolean r16 = r1.l(r15)
            if (r16 == 0) goto L_0x00e9
            r16 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00eb
        L_0x00e9:
            r16 = 4194304(0x400000, float:5.877472E-39)
        L_0x00eb:
            r3 = r3 | r16
        L_0x00ed:
            r2 = r11 & 256(0x100, float:3.59E-43)
            r16 = 100663296(0x6000000, float:2.4074124E-35)
            if (r2 == 0) goto L_0x00f8
            r3 = r3 | r16
        L_0x00f5:
            r2 = r38
            goto L_0x010b
        L_0x00f8:
            r2 = r10 & r16
            if (r2 != 0) goto L_0x00f5
            r2 = r38
            boolean r16 = r1.l(r2)
            if (r16 == 0) goto L_0x0107
            r16 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x0109
        L_0x0107:
            r16 = 33554432(0x2000000, float:9.403955E-38)
        L_0x0109:
            r3 = r3 | r16
        L_0x010b:
            r16 = 38347923(0x2492493, float:1.4777644E-37)
            r2 = r3 & r16
            r5 = 38347922(0x2492492, float:1.4777643E-37)
            if (r2 == r5) goto L_0x0117
            r2 = 1
            goto L_0x0118
        L_0x0117:
            r2 = 0
        L_0x0118:
            r5 = r3 & 1
            boolean r2 = r1.E(r2, r5)
            if (r2 == 0) goto L_0x024e
            r1.p()
            r2 = r10 & 1
            r5 = -3670017(0xffffffffffc7ffff, float:NaN)
            r16 = -57345(0xffffffffffff1fff, float:NaN)
            r15 = 0
            if (r2 == 0) goto L_0x014f
            boolean r2 = r1.J()
            if (r2 == 0) goto L_0x0135
            goto L_0x014f
        L_0x0135:
            r1.B()
            r0 = r11 & 16
            if (r0 == 0) goto L_0x013e
            r3 = r3 & r16
        L_0x013e:
            r0 = r11 & 64
            if (r0 == 0) goto L_0x0143
            r3 = r3 & r5
        L_0x0143:
            r2 = r31
            r0 = r36
            r5 = r3
            r4 = r12
            r6 = r14
            r8 = 0
        L_0x014b:
            r3 = r37
            goto L_0x01b2
        L_0x014f:
            if (r4 == 0) goto L_0x0154
            androidx.compose.ui.Modifier$Companion r2 = androidx.compose.ui.Modifier.f15489d
            goto L_0x0156
        L_0x0154:
            r2 = r31
        L_0x0156:
            if (r6 == 0) goto L_0x0159
            r7 = 1
        L_0x0159:
            if (r8 == 0) goto L_0x015c
            r9 = r15
        L_0x015c:
            r4 = r11 & 16
            if (r4 == 0) goto L_0x0178
            androidx.compose.material.MaterialTheme r4 = androidx.compose.material.MaterialTheme.f7937a
            r6 = 6
            androidx.compose.material.Shapes r4 = r4.b(r1, r6)
            androidx.compose.foundation.shape.CornerBasedShape r4 = r4.c()
            r6 = 50
            androidx.compose.foundation.shape.CornerSize r6 = androidx.compose.foundation.shape.CornerSizeKt.b(r6)
            androidx.compose.foundation.shape.CornerBasedShape r4 = r4.b(r6)
            r3 = r3 & r16
            goto L_0x0179
        L_0x0178:
            r4 = r12
        L_0x0179:
            if (r13 == 0) goto L_0x017d
            r6 = r15
            goto L_0x017e
        L_0x017d:
            r6 = r14
        L_0x017e:
            r8 = r11 & 64
            if (r8 == 0) goto L_0x01a7
            androidx.compose.material.ChipDefaults r12 = androidx.compose.material.ChipDefaults.f7470a
            r26 = 1572864(0x180000, float:2.204052E-39)
            r27 = 63
            r13 = 0
            r18 = 0
            r20 = 0
            r22 = 0
            r24 = 0
            r28 = 0
            r8 = 0
            r15 = r18
            r17 = r20
            r19 = r22
            r21 = r24
            r23 = r28
            r25 = r1
            androidx.compose.material.ChipColors r12 = r12.a(r13, r15, r17, r19, r21, r23, r25, r26, r27)
            r3 = r3 & r5
            goto L_0x01aa
        L_0x01a7:
            r8 = 0
            r12 = r36
        L_0x01aa:
            r5 = r3
            if (r0 == 0) goto L_0x01b0
            r0 = r12
            r3 = 0
            goto L_0x01b2
        L_0x01b0:
            r0 = r12
            goto L_0x014b
        L_0x01b2:
            r1.U()
            boolean r12 = androidx.compose.runtime.ComposerKt.P()
            if (r12 == 0) goto L_0x01c4
            r12 = -1
            java.lang.String r13 = "androidx.compose.material.Chip (Chip.kt:100)"
            r14 = -368396408(0xffffffffea0ab788, float:-4.1924616E25)
            androidx.compose.runtime.ComposerKt.Y(r14, r5, r12, r13)
        L_0x01c4:
            int r12 = r5 >> 6
            r12 = r12 & 14
            int r13 = r5 >> 15
            r13 = r13 & 112(0x70, float:1.57E-43)
            r12 = r12 | r13
            androidx.compose.runtime.State r13 = r0.b(r7, r1, r12)
            androidx.compose.material.ChipKt$Chip$1 r14 = androidx.compose.material.ChipKt$Chip$1.f7480z
            r10 = 0
            r15 = 1
            androidx.compose.ui.Modifier r8 = androidx.compose.ui.semantics.SemanticsModifierKt.d(r2, r8, r14, r15, r10)
            androidx.compose.runtime.State r10 = r0.a(r7, r1, r12)
            java.lang.Object r10 = r10.getValue()
            androidx.compose.ui.graphics.Color r10 = (androidx.compose.ui.graphics.Color) r10
            long r16 = r10.v()
            long r18 = b(r13)
            r24 = 14
            r25 = 0
            r20 = 1065353216(0x3f800000, float:1.0)
            r21 = 0
            r22 = 0
            r23 = 0
            long r18 = androidx.compose.ui.graphics.Color.l(r18, r20, r21, r22, r23, r24, r25)
            androidx.compose.material.ChipKt$Chip$2 r10 = new androidx.compose.material.ChipKt$Chip$2
            r31 = r10
            r32 = r13
            r33 = r3
            r34 = r0
            r35 = r7
            r36 = r38
            r31.<init>(r32, r33, r34, r35, r36)
            r12 = 54
            r13 = 139076687(0x84a244f, float:6.0829844E-34)
            androidx.compose.runtime.internal.ComposableLambda r23 = androidx.compose.runtime.internal.ComposableLambdaKt.e(r13, r15, r10, r1, r12)
            r10 = r5 & 14
            r12 = 805306368(0x30000000, float:4.656613E-10)
            r10 = r10 | r12
            r12 = r5 & 896(0x380, float:1.256E-42)
            r10 = r10 | r12
            int r12 = r5 >> 3
            r12 = r12 & 7168(0x1c00, float:1.0045E-41)
            r10 = r10 | r12
            int r12 = r5 << 3
            r13 = 3670016(0x380000, float:5.142788E-39)
            r12 = r12 & r13
            r10 = r10 | r12
            r12 = 234881024(0xe000000, float:1.5777218E-30)
            int r5 = r5 << 15
            r5 = r5 & r12
            r25 = r10 | r5
            r26 = 128(0x80, float:1.794E-43)
            r12 = r30
            r13 = r8
            r14 = r7
            r15 = r4
            r20 = r6
            r22 = r9
            r24 = r1
            androidx.compose.material.SurfaceKt.b(r12, r13, r14, r15, r16, r18, r20, r21, r22, r23, r24, r25, r26)
            boolean r5 = androidx.compose.runtime.ComposerKt.P()
            if (r5 == 0) goto L_0x0248
            androidx.compose.runtime.ComposerKt.X()
        L_0x0248:
            r8 = r3
            r5 = r4
            r3 = r7
            r4 = r9
            r7 = r0
            goto L_0x025b
        L_0x024e:
            r1.B()
            r2 = r31
            r8 = r37
            r3 = r7
            r4 = r9
            r5 = r12
            r6 = r14
            r7 = r36
        L_0x025b:
            androidx.compose.runtime.ScopeUpdateScope r12 = r1.x()
            if (r12 == 0) goto L_0x0272
            androidx.compose.material.ChipKt$Chip$3 r13 = new androidx.compose.material.ChipKt$Chip$3
            r0 = r13
            r1 = r30
            r9 = r38
            r10 = r40
            r11 = r41
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r12.a(r13)
        L_0x0272:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.ChipKt.a(kotlin.jvm.functions.Function0, androidx.compose.ui.Modifier, boolean, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.ui.graphics.Shape, androidx.compose.foundation.BorderStroke, androidx.compose.material.ChipColors, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function3, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final long b(State state) {
        return ((Color) state.getValue()).v();
    }

    /* JADX WARNING: Removed duplicated region for block: B:100:0x011b  */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x0134  */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x013b  */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x015b  */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x0162  */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x0187  */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x0189  */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x0192  */
    /* JADX WARNING: Removed duplicated region for block: B:184:0x032b  */
    /* JADX WARNING: Removed duplicated region for block: B:187:0x0344  */
    /* JADX WARNING: Removed duplicated region for block: B:189:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x009c  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x00b0  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00b8  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00bd  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x00d6  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x00f6  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x00fb  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x0114  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void c(boolean r40, kotlin.jvm.functions.Function0 r41, androidx.compose.ui.Modifier r42, boolean r43, androidx.compose.foundation.interaction.MutableInteractionSource r44, androidx.compose.ui.graphics.Shape r45, androidx.compose.foundation.BorderStroke r46, androidx.compose.material.SelectableChipColors r47, kotlin.jvm.functions.Function2 r48, kotlin.jvm.functions.Function2 r49, kotlin.jvm.functions.Function2 r50, kotlin.jvm.functions.Function3 r51, androidx.compose.runtime.Composer r52, int r53, int r54, int r55) {
        /*
            r13 = r40
            r0 = r47
            r11 = r53
            r9 = r55
            r1 = -1259208246(0xffffffffb4f201ca, float:-4.5077314E-7)
            r2 = r52
            androidx.compose.runtime.Composer r4 = r2.q(r1)
            r2 = r9 & 1
            if (r2 == 0) goto L_0x0018
            r2 = r11 | 6
            goto L_0x0028
        L_0x0018:
            r2 = r11 & 6
            if (r2 != 0) goto L_0x0027
            boolean r2 = r4.d(r13)
            if (r2 == 0) goto L_0x0024
            r2 = 4
            goto L_0x0025
        L_0x0024:
            r2 = 2
        L_0x0025:
            r2 = r2 | r11
            goto L_0x0028
        L_0x0027:
            r2 = r11
        L_0x0028:
            r6 = r9 & 2
            if (r6 == 0) goto L_0x0031
            r2 = r2 | 48
            r10 = r41
            goto L_0x0043
        L_0x0031:
            r6 = r11 & 48
            r10 = r41
            if (r6 != 0) goto L_0x0043
            boolean r6 = r4.l(r10)
            if (r6 == 0) goto L_0x0040
            r6 = 32
            goto L_0x0042
        L_0x0040:
            r6 = 16
        L_0x0042:
            r2 = r2 | r6
        L_0x0043:
            r6 = r9 & 4
            if (r6 == 0) goto L_0x004c
            r2 = r2 | 384(0x180, float:5.38E-43)
        L_0x0049:
            r12 = r42
            goto L_0x005e
        L_0x004c:
            r12 = r11 & 384(0x180, float:5.38E-43)
            if (r12 != 0) goto L_0x0049
            r12 = r42
            boolean r14 = r4.W(r12)
            if (r14 == 0) goto L_0x005b
            r14 = 256(0x100, float:3.59E-43)
            goto L_0x005d
        L_0x005b:
            r14 = 128(0x80, float:1.794E-43)
        L_0x005d:
            r2 = r2 | r14
        L_0x005e:
            r14 = r9 & 8
            if (r14 == 0) goto L_0x0067
            r2 = r2 | 3072(0xc00, float:4.305E-42)
        L_0x0064:
            r15 = r43
            goto L_0x007a
        L_0x0067:
            r15 = r11 & 3072(0xc00, float:4.305E-42)
            if (r15 != 0) goto L_0x0064
            r15 = r43
            boolean r16 = r4.d(r15)
            if (r16 == 0) goto L_0x0076
            r16 = 2048(0x800, float:2.87E-42)
            goto L_0x0078
        L_0x0076:
            r16 = 1024(0x400, float:1.435E-42)
        L_0x0078:
            r2 = r2 | r16
        L_0x007a:
            r16 = r9 & 16
            if (r16 == 0) goto L_0x0083
            r2 = r2 | 24576(0x6000, float:3.4438E-41)
        L_0x0080:
            r3 = r44
            goto L_0x0096
        L_0x0083:
            r3 = r11 & 24576(0x6000, float:3.4438E-41)
            if (r3 != 0) goto L_0x0080
            r3 = r44
            boolean r17 = r4.W(r3)
            if (r17 == 0) goto L_0x0092
            r17 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0094
        L_0x0092:
            r17 = 8192(0x2000, float:1.14794E-41)
        L_0x0094:
            r2 = r2 | r17
        L_0x0096:
            r17 = 196608(0x30000, float:2.75506E-40)
            r17 = r11 & r17
            if (r17 != 0) goto L_0x00b0
            r17 = r9 & 32
            r5 = r45
            if (r17 != 0) goto L_0x00ab
            boolean r18 = r4.W(r5)
            if (r18 == 0) goto L_0x00ab
            r18 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00ad
        L_0x00ab:
            r18 = 65536(0x10000, float:9.18355E-41)
        L_0x00ad:
            r2 = r2 | r18
            goto L_0x00b2
        L_0x00b0:
            r5 = r45
        L_0x00b2:
            r18 = r9 & 64
            r19 = 1572864(0x180000, float:2.204052E-39)
            if (r18 == 0) goto L_0x00bd
            r2 = r2 | r19
            r7 = r46
            goto L_0x00d0
        L_0x00bd:
            r19 = r11 & r19
            r7 = r46
            if (r19 != 0) goto L_0x00d0
            boolean r20 = r4.W(r7)
            if (r20 == 0) goto L_0x00cc
            r20 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00ce
        L_0x00cc:
            r20 = 524288(0x80000, float:7.34684E-40)
        L_0x00ce:
            r2 = r2 | r20
        L_0x00d0:
            r20 = 12582912(0xc00000, float:1.7632415E-38)
            r20 = r11 & r20
            if (r20 != 0) goto L_0x00f0
            r8 = r9 & 128(0x80, float:1.794E-43)
            if (r8 != 0) goto L_0x00ed
            r8 = 16777216(0x1000000, float:2.3509887E-38)
            r8 = r8 & r11
            if (r8 != 0) goto L_0x00e4
            boolean r8 = r4.W(r0)
            goto L_0x00e8
        L_0x00e4:
            boolean r8 = r4.l(r0)
        L_0x00e8:
            if (r8 == 0) goto L_0x00ed
            r8 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00ef
        L_0x00ed:
            r8 = 4194304(0x400000, float:5.877472E-39)
        L_0x00ef:
            r2 = r2 | r8
        L_0x00f0:
            r8 = r9 & 256(0x100, float:3.59E-43)
            r21 = 100663296(0x6000000, float:2.4074124E-35)
            if (r8 == 0) goto L_0x00fb
            r2 = r2 | r21
            r1 = r48
            goto L_0x010e
        L_0x00fb:
            r21 = r11 & r21
            r1 = r48
            if (r21 != 0) goto L_0x010e
            boolean r21 = r4.l(r1)
            if (r21 == 0) goto L_0x010a
            r21 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x010c
        L_0x010a:
            r21 = 33554432(0x2000000, float:9.403955E-38)
        L_0x010c:
            r2 = r2 | r21
        L_0x010e:
            r15 = r9 & 512(0x200, float:7.175E-43)
            r21 = 805306368(0x30000000, float:4.656613E-10)
            if (r15 == 0) goto L_0x011b
            r2 = r2 | r21
        L_0x0116:
            r21 = r15
            r15 = r49
            goto L_0x0130
        L_0x011b:
            r21 = r11 & r21
            if (r21 != 0) goto L_0x0116
            r21 = r15
            r15 = r49
            boolean r22 = r4.l(r15)
            if (r22 == 0) goto L_0x012c
            r22 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x012e
        L_0x012c:
            r22 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x012e:
            r2 = r2 | r22
        L_0x0130:
            r15 = r9 & 1024(0x400, float:1.435E-42)
            if (r15 == 0) goto L_0x013b
            r17 = r54 | 6
            r22 = r15
            r15 = r50
            goto L_0x0157
        L_0x013b:
            r22 = r54 & 6
            if (r22 != 0) goto L_0x0151
            r22 = r15
            r15 = r50
            boolean r23 = r4.l(r15)
            if (r23 == 0) goto L_0x014c
            r17 = 4
            goto L_0x014e
        L_0x014c:
            r17 = 2
        L_0x014e:
            r17 = r54 | r17
            goto L_0x0157
        L_0x0151:
            r22 = r15
            r15 = r50
            r17 = r54
        L_0x0157:
            r0 = r9 & 2048(0x800, float:2.87E-42)
            if (r0 == 0) goto L_0x0162
            r17 = r17 | 48
        L_0x015d:
            r0 = r51
        L_0x015f:
            r15 = r17
            goto L_0x0176
        L_0x0162:
            r0 = r54 & 48
            if (r0 != 0) goto L_0x015d
            r0 = r51
            boolean r23 = r4.l(r0)
            if (r23 == 0) goto L_0x0171
            r19 = 32
            goto L_0x0173
        L_0x0171:
            r19 = 16
        L_0x0173:
            r17 = r17 | r19
            goto L_0x015f
        L_0x0176:
            r17 = 306783379(0x12492493, float:6.34695E-28)
            r0 = r2 & r17
            r1 = 306783378(0x12492492, float:6.3469493E-28)
            if (r0 != r1) goto L_0x0189
            r0 = r15 & 19
            r1 = 18
            if (r0 == r1) goto L_0x0187
            goto L_0x0189
        L_0x0187:
            r0 = 0
            goto L_0x018a
        L_0x0189:
            r0 = 1
        L_0x018a:
            r1 = r2 & 1
            boolean r0 = r4.E(r0, r1)
            if (r0 == 0) goto L_0x032b
            r4.p()
            r0 = r11 & 1
            r1 = -29360129(0xfffffffffe3fffff, float:-6.380294E37)
            r17 = -458753(0xfffffffffff8ffff, float:NaN)
            if (r0 == 0) goto L_0x01c9
            boolean r0 = r4.J()
            if (r0 == 0) goto L_0x01a6
            goto L_0x01c9
        L_0x01a6:
            r4.B()
            r0 = r9 & 32
            if (r0 == 0) goto L_0x01af
            r2 = r2 & r17
        L_0x01af:
            r0 = r9 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x01b4
            r2 = r2 & r1
        L_0x01b4:
            r0 = r43
            r17 = r44
            r20 = r48
            r21 = r49
            r22 = r50
            r14 = r2
            r18 = r5
            r19 = r7
            r1 = r12
            r3 = r15
            r15 = r47
            goto L_0x0259
        L_0x01c9:
            if (r6 == 0) goto L_0x01ce
            androidx.compose.ui.Modifier$Companion r0 = androidx.compose.ui.Modifier.f15489d
            goto L_0x01cf
        L_0x01ce:
            r0 = r12
        L_0x01cf:
            if (r14 == 0) goto L_0x01d3
            r6 = 1
            goto L_0x01d5
        L_0x01d3:
            r6 = r43
        L_0x01d5:
            if (r16 == 0) goto L_0x01d9
            r12 = 0
            goto L_0x01db
        L_0x01d9:
            r12 = r44
        L_0x01db:
            r14 = r9 & 32
            if (r14 == 0) goto L_0x01f6
            androidx.compose.material.MaterialTheme r5 = androidx.compose.material.MaterialTheme.f7937a
            r14 = 6
            androidx.compose.material.Shapes r5 = r5.b(r4, r14)
            androidx.compose.foundation.shape.CornerBasedShape r5 = r5.c()
            r14 = 50
            androidx.compose.foundation.shape.CornerSize r14 = androidx.compose.foundation.shape.CornerSizeKt.b(r14)
            androidx.compose.foundation.shape.CornerBasedShape r5 = r5.b(r14)
            r2 = r2 & r17
        L_0x01f6:
            if (r18 == 0) goto L_0x01f9
            r7 = 0
        L_0x01f9:
            r14 = r9 & 128(0x80, float:1.794E-43)
            if (r14 == 0) goto L_0x0225
            androidx.compose.material.ChipDefaults r14 = androidx.compose.material.ChipDefaults.f7470a
            r34 = 805306368(0x30000000, float:4.656613E-10)
            r35 = 511(0x1ff, float:7.16E-43)
            r16 = 0
            r3 = r15
            r36 = r21
            r37 = r22
            r15 = r16
            r17 = 0
            r19 = 0
            r21 = 0
            r23 = 0
            r25 = 0
            r27 = 0
            r29 = 0
            r31 = 0
            r33 = r4
            androidx.compose.material.SelectableChipColors r14 = r14.b(r15, r17, r19, r21, r23, r25, r27, r29, r31, r33, r34, r35)
            r1 = r1 & r2
            r2 = r1
            goto L_0x022c
        L_0x0225:
            r3 = r15
            r36 = r21
            r37 = r22
            r14 = r47
        L_0x022c:
            if (r8 == 0) goto L_0x0230
            r1 = 0
            goto L_0x0232
        L_0x0230:
            r1 = r48
        L_0x0232:
            if (r36 == 0) goto L_0x0236
            r8 = 0
            goto L_0x0238
        L_0x0236:
            r8 = r49
        L_0x0238:
            if (r37 == 0) goto L_0x024b
            r20 = r1
            r18 = r5
            r19 = r7
            r21 = r8
            r17 = r12
            r15 = r14
            r22 = 0
        L_0x0247:
            r1 = r0
            r14 = r2
            r0 = r6
            goto L_0x0259
        L_0x024b:
            r22 = r50
            r20 = r1
            r18 = r5
            r19 = r7
            r21 = r8
            r17 = r12
            r15 = r14
            goto L_0x0247
        L_0x0259:
            r4.U()
            boolean r2 = androidx.compose.runtime.ComposerKt.P()
            if (r2 == 0) goto L_0x026a
            java.lang.String r2 = "androidx.compose.material.FilterChip (Chip.kt:196)"
            r5 = -1259208246(0xffffffffb4f201ca, float:-4.5077314E-7)
            androidx.compose.runtime.ComposerKt.Y(r5, r14, r3, r2)
        L_0x026a:
            int r2 = r14 >> 9
            r2 = r2 & 14
            int r3 = r14 << 3
            r5 = r3 & 112(0x70, float:1.57E-43)
            r2 = r2 | r5
            int r5 = r14 >> 15
            r5 = r5 & 896(0x380, float:1.256E-42)
            r5 = r5 | r2
            androidx.compose.runtime.State r12 = r15.d(r0, r13, r4, r5)
            androidx.compose.material.ChipKt$FilterChip$1 r2 = androidx.compose.material.ChipKt$FilterChip$1.f7493z
            r6 = 0
            r7 = 1
            r8 = 0
            androidx.compose.ui.Modifier r2 = androidx.compose.ui.semantics.SemanticsModifierKt.d(r1, r6, r2, r7, r8)
            androidx.compose.runtime.State r5 = r15.c(r0, r13, r4, r5)
            java.lang.Object r5 = r5.getValue()
            androidx.compose.ui.graphics.Color r5 = (androidx.compose.ui.graphics.Color) r5
            long r5 = r5.v()
            java.lang.Object r7 = r12.getValue()
            androidx.compose.ui.graphics.Color r7 = (androidx.compose.ui.graphics.Color) r7
            long r7 = r7.v()
            r16 = 14
            r23 = 0
            r24 = 1065353216(0x3f800000, float:1.0)
            r25 = 0
            r26 = 0
            r27 = 0
            r42 = r7
            r44 = r24
            r45 = r25
            r46 = r26
            r47 = r27
            r48 = r16
            r49 = r23
            long r7 = androidx.compose.ui.graphics.Color.l(r42, r44, r45, r46, r47, r48, r49)
            r23 = r1
            androidx.compose.material.ChipKt$FilterChip$2 r1 = new androidx.compose.material.ChipKt$FilterChip$2
            r42 = r1
            r43 = r12
            r44 = r20
            r45 = r40
            r46 = r21
            r47 = r22
            r48 = r51
            r49 = r15
            r50 = r0
            r42.<init>(r43, r44, r45, r46, r47, r48, r49, r50)
            r12 = 54
            r24 = r0
            r0 = 722126431(0x2b0ac65f, float:4.9302744E-13)
            r9 = 1
            androidx.compose.runtime.internal.ComposableLambda r12 = androidx.compose.runtime.internal.ComposableLambdaKt.e(r0, r9, r1, r4, r12)
            r0 = r14 & 7294(0x1c7e, float:1.0221E-41)
            int r1 = r14 >> 3
            r9 = 57344(0xe000, float:8.0356E-41)
            r1 = r1 & r9
            r0 = r0 | r1
            r1 = 29360128(0x1c00000, float:7.052966E-38)
            r1 = r1 & r3
            r0 = r0 | r1
            int r1 = r14 << 15
            r3 = 1879048192(0x70000000, float:1.58456325E29)
            r1 = r1 & r3
            r14 = r0 | r1
            r0 = 6
            r25 = r15
            r15 = r0
            r16 = 256(0x100, float:3.59E-43)
            r0 = 0
            r10 = r0
            r0 = r40
            r1 = r41
            r3 = r24
            r26 = r4
            r4 = r18
            r9 = r19
            r11 = r17
            r13 = r26
            androidx.compose.material.SurfaceKt.c(r0, r1, r2, r3, r4, r5, r7, r9, r10, r11, r12, r13, r14, r15, r16)
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x0318
            androidx.compose.runtime.ComposerKt.X()
        L_0x0318:
            r5 = r17
            r6 = r18
            r7 = r19
            r9 = r20
            r10 = r21
            r11 = r22
            r3 = r23
            r4 = r24
            r8 = r25
            goto L_0x033e
        L_0x032b:
            r26 = r4
            r26.B()
            r4 = r43
            r8 = r47
            r9 = r48
            r10 = r49
            r11 = r50
            r6 = r5
            r3 = r12
            r5 = r44
        L_0x033e:
            androidx.compose.runtime.ScopeUpdateScope r15 = r26.x()
            if (r15 == 0) goto L_0x0361
            androidx.compose.material.ChipKt$FilterChip$3 r14 = new androidx.compose.material.ChipKt$FilterChip$3
            r0 = r14
            r1 = r40
            r2 = r41
            r12 = r51
            r13 = r53
            r38 = r14
            r14 = r54
            r39 = r15
            r15 = r55
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            r1 = r38
            r0 = r39
            r0.a(r1)
        L_0x0361:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.ChipKt.c(boolean, kotlin.jvm.functions.Function0, androidx.compose.ui.Modifier, boolean, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.ui.graphics.Shape, androidx.compose.foundation.BorderStroke, androidx.compose.material.SelectableChipColors, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function3, androidx.compose.runtime.Composer, int, int, int):void");
    }
}
