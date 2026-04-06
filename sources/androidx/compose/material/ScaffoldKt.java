package androidx.compose.material;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

@Metadata
public final class ScaffoldKt {

    /* renamed from: a  reason: collision with root package name */
    public static final ProvidableCompositionLocal f8255a = CompositionLocalKt.j(ScaffoldKt$LocalFabPlacement$1.f8257z);

    /* renamed from: b  reason: collision with root package name */
    public static final float f8256b = Dp.m((float) 16);

    /* JADX WARNING: Code restructure failed: missing block: B:142:0x01a2, code lost:
        if (r0.j(r73) != false) goto L_0x01a9;
     */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x0142  */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x0158  */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x0160  */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x0165  */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x017c  */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x0192  */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x0198  */
    /* JADX WARNING: Removed duplicated region for block: B:146:0x01ac  */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x01b2  */
    /* JADX WARNING: Removed duplicated region for block: B:156:0x01c6  */
    /* JADX WARNING: Removed duplicated region for block: B:159:0x01cc  */
    /* JADX WARNING: Removed duplicated region for block: B:166:0x01e3  */
    /* JADX WARNING: Removed duplicated region for block: B:169:0x01e9  */
    /* JADX WARNING: Removed duplicated region for block: B:176:0x01fd  */
    /* JADX WARNING: Removed duplicated region for block: B:179:0x0203  */
    /* JADX WARNING: Removed duplicated region for block: B:180:0x0208  */
    /* JADX WARNING: Removed duplicated region for block: B:191:0x0233  */
    /* JADX WARNING: Removed duplicated region for block: B:192:0x0235  */
    /* JADX WARNING: Removed duplicated region for block: B:195:0x023f  */
    /* JADX WARNING: Removed duplicated region for block: B:288:0x0472  */
    /* JADX WARNING: Removed duplicated region for block: B:291:0x049d  */
    /* JADX WARNING: Removed duplicated region for block: B:293:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0091  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00cc  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00d1  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x00ea  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x00ef  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0108  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x010d  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x0126  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x012b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void a(androidx.compose.ui.Modifier r59, androidx.compose.material.ScaffoldState r60, kotlin.jvm.functions.Function2 r61, kotlin.jvm.functions.Function2 r62, kotlin.jvm.functions.Function3 r63, kotlin.jvm.functions.Function2 r64, int r65, boolean r66, kotlin.jvm.functions.Function3 r67, boolean r68, androidx.compose.ui.graphics.Shape r69, float r70, long r71, long r73, long r75, long r77, long r79, kotlin.jvm.functions.Function3 r81, androidx.compose.runtime.Composer r82, int r83, int r84, int r85) {
        /*
            r15 = r83
            r13 = r84
            r14 = r85
            r0 = 1037492569(0x3dd6e159, float:0.104922004)
            r1 = r82
            androidx.compose.runtime.Composer r0 = r1.q(r0)
            r1 = r14 & 1
            if (r1 == 0) goto L_0x0019
            r4 = r15 | 6
            r5 = r4
            r4 = r59
            goto L_0x002d
        L_0x0019:
            r4 = r15 & 6
            if (r4 != 0) goto L_0x002a
            r4 = r59
            boolean r5 = r0.W(r4)
            if (r5 == 0) goto L_0x0027
            r5 = 4
            goto L_0x0028
        L_0x0027:
            r5 = 2
        L_0x0028:
            r5 = r5 | r15
            goto L_0x002d
        L_0x002a:
            r4 = r59
            r5 = r15
        L_0x002d:
            r6 = r15 & 48
            if (r6 != 0) goto L_0x0046
            r6 = r14 & 2
            if (r6 != 0) goto L_0x0040
            r6 = r60
            boolean r9 = r0.W(r6)
            if (r9 == 0) goto L_0x0042
            r9 = 32
            goto L_0x0044
        L_0x0040:
            r6 = r60
        L_0x0042:
            r9 = 16
        L_0x0044:
            r5 = r5 | r9
            goto L_0x0048
        L_0x0046:
            r6 = r60
        L_0x0048:
            r9 = r14 & 4
            if (r9 == 0) goto L_0x0051
            r5 = r5 | 384(0x180, float:5.38E-43)
        L_0x004e:
            r12 = r61
            goto L_0x0064
        L_0x0051:
            r12 = r15 & 384(0x180, float:5.38E-43)
            if (r12 != 0) goto L_0x004e
            r12 = r61
            boolean r16 = r0.l(r12)
            if (r16 == 0) goto L_0x0060
            r16 = 256(0x100, float:3.59E-43)
            goto L_0x0062
        L_0x0060:
            r16 = 128(0x80, float:1.794E-43)
        L_0x0062:
            r5 = r5 | r16
        L_0x0064:
            r16 = r14 & 8
            r17 = 2048(0x800, float:2.87E-42)
            r18 = 1024(0x400, float:1.435E-42)
            if (r16 == 0) goto L_0x0071
            r5 = r5 | 3072(0xc00, float:4.305E-42)
        L_0x006e:
            r2 = r62
            goto L_0x0084
        L_0x0071:
            r2 = r15 & 3072(0xc00, float:4.305E-42)
            if (r2 != 0) goto L_0x006e
            r2 = r62
            boolean r19 = r0.l(r2)
            if (r19 == 0) goto L_0x0080
            r19 = r17
            goto L_0x0082
        L_0x0080:
            r19 = r18
        L_0x0082:
            r5 = r5 | r19
        L_0x0084:
            r19 = r14 & 16
            r20 = 8192(0x2000, float:1.14794E-41)
            r21 = 16384(0x4000, float:2.2959E-41)
            if (r19 == 0) goto L_0x0091
            r5 = r5 | 24576(0x6000, float:3.4438E-41)
        L_0x008e:
            r3 = r63
            goto L_0x00a4
        L_0x0091:
            r3 = r15 & 24576(0x6000, float:3.4438E-41)
            if (r3 != 0) goto L_0x008e
            r3 = r63
            boolean r23 = r0.l(r3)
            if (r23 == 0) goto L_0x00a0
            r23 = r21
            goto L_0x00a2
        L_0x00a0:
            r23 = r20
        L_0x00a2:
            r5 = r5 | r23
        L_0x00a4:
            r23 = r14 & 32
            r24 = 131072(0x20000, float:1.83671E-40)
            r25 = 196608(0x30000, float:2.75506E-40)
            r26 = 65536(0x10000, float:9.18355E-41)
            if (r23 == 0) goto L_0x00b3
            r5 = r5 | r25
            r7 = r64
            goto L_0x00c6
        L_0x00b3:
            r27 = r15 & r25
            r7 = r64
            if (r27 != 0) goto L_0x00c6
            boolean r28 = r0.l(r7)
            if (r28 == 0) goto L_0x00c2
            r28 = r24
            goto L_0x00c4
        L_0x00c2:
            r28 = r26
        L_0x00c4:
            r5 = r5 | r28
        L_0x00c6:
            r28 = r14 & 64
            r29 = 1572864(0x180000, float:2.204052E-39)
            if (r28 == 0) goto L_0x00d1
            r5 = r5 | r29
            r8 = r65
            goto L_0x00e4
        L_0x00d1:
            r30 = r15 & r29
            r8 = r65
            if (r30 != 0) goto L_0x00e4
            boolean r31 = r0.i(r8)
            if (r31 == 0) goto L_0x00e0
            r31 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00e2
        L_0x00e0:
            r31 = 524288(0x80000, float:7.34684E-40)
        L_0x00e2:
            r5 = r5 | r31
        L_0x00e4:
            r10 = r14 & 128(0x80, float:1.794E-43)
            r32 = 12582912(0xc00000, float:1.7632415E-38)
            if (r10 == 0) goto L_0x00ef
            r5 = r5 | r32
            r11 = r66
            goto L_0x0102
        L_0x00ef:
            r33 = r15 & r32
            r11 = r66
            if (r33 != 0) goto L_0x0102
            boolean r34 = r0.d(r11)
            if (r34 == 0) goto L_0x00fe
            r34 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x0100
        L_0x00fe:
            r34 = 4194304(0x400000, float:5.877472E-39)
        L_0x0100:
            r5 = r5 | r34
        L_0x0102:
            r2 = r14 & 256(0x100, float:3.59E-43)
            r34 = 100663296(0x6000000, float:2.4074124E-35)
            if (r2 == 0) goto L_0x010d
            r5 = r5 | r34
            r3 = r67
            goto L_0x0120
        L_0x010d:
            r34 = r15 & r34
            r3 = r67
            if (r34 != 0) goto L_0x0120
            boolean r34 = r0.l(r3)
            if (r34 == 0) goto L_0x011c
            r34 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x011e
        L_0x011c:
            r34 = 33554432(0x2000000, float:9.403955E-38)
        L_0x011e:
            r5 = r5 | r34
        L_0x0120:
            r3 = r14 & 512(0x200, float:7.175E-43)
            r34 = 805306368(0x30000000, float:4.656613E-10)
            if (r3 == 0) goto L_0x012b
            r5 = r5 | r34
            r4 = r68
            goto L_0x013e
        L_0x012b:
            r34 = r15 & r34
            r4 = r68
            if (r34 != 0) goto L_0x013e
            boolean r34 = r0.d(r4)
            if (r34 == 0) goto L_0x013a
            r34 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x013c
        L_0x013a:
            r34 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x013c:
            r5 = r5 | r34
        L_0x013e:
            r34 = r13 & 6
            if (r34 != 0) goto L_0x0158
            r4 = r14 & 1024(0x400, float:1.435E-42)
            if (r4 != 0) goto L_0x0151
            r4 = r69
            boolean r34 = r0.W(r4)
            if (r34 == 0) goto L_0x0153
            r22 = 4
            goto L_0x0155
        L_0x0151:
            r4 = r69
        L_0x0153:
            r22 = 2
        L_0x0155:
            r22 = r13 | r22
            goto L_0x015c
        L_0x0158:
            r4 = r69
            r22 = r13
        L_0x015c:
            r4 = r14 & 2048(0x800, float:2.87E-42)
            if (r4 == 0) goto L_0x0165
            r22 = r22 | 48
            r6 = r70
            goto L_0x0178
        L_0x0165:
            r34 = r13 & 48
            r6 = r70
            if (r34 != 0) goto L_0x0178
            boolean r34 = r0.h(r6)
            if (r34 == 0) goto L_0x0174
            r27 = 32
            goto L_0x0176
        L_0x0174:
            r27 = 16
        L_0x0176:
            r22 = r22 | r27
        L_0x0178:
            r6 = r13 & 384(0x180, float:5.38E-43)
            if (r6 != 0) goto L_0x0192
            r6 = r14 & 4096(0x1000, float:5.74E-42)
            if (r6 != 0) goto L_0x018b
            r6 = r71
            boolean r27 = r0.j(r6)
            if (r27 == 0) goto L_0x018d
            r31 = 256(0x100, float:3.59E-43)
            goto L_0x018f
        L_0x018b:
            r6 = r71
        L_0x018d:
            r31 = 128(0x80, float:1.794E-43)
        L_0x018f:
            r22 = r22 | r31
            goto L_0x0194
        L_0x0192:
            r6 = r71
        L_0x0194:
            r6 = r13 & 3072(0xc00, float:4.305E-42)
            if (r6 != 0) goto L_0x01ac
            r6 = r14 & 8192(0x2000, float:1.14794E-41)
            if (r6 != 0) goto L_0x01a5
            r6 = r73
            boolean r27 = r0.j(r6)
            if (r27 == 0) goto L_0x01a7
            goto L_0x01a9
        L_0x01a5:
            r6 = r73
        L_0x01a7:
            r17 = r18
        L_0x01a9:
            r22 = r22 | r17
            goto L_0x01ae
        L_0x01ac:
            r6 = r73
        L_0x01ae:
            r6 = r13 & 24576(0x6000, float:3.4438E-41)
            if (r6 != 0) goto L_0x01c6
            r6 = r14 & 16384(0x4000, float:2.2959E-41)
            if (r6 != 0) goto L_0x01c1
            r6 = r75
            boolean r17 = r0.j(r6)
            if (r17 == 0) goto L_0x01c3
            r20 = r21
            goto L_0x01c3
        L_0x01c1:
            r6 = r75
        L_0x01c3:
            r22 = r22 | r20
            goto L_0x01c8
        L_0x01c6:
            r6 = r75
        L_0x01c8:
            r17 = r13 & r25
            if (r17 != 0) goto L_0x01e3
            r17 = 32768(0x8000, float:4.5918E-41)
            r17 = r14 & r17
            r6 = r77
            if (r17 != 0) goto L_0x01de
            boolean r17 = r0.j(r6)
            if (r17 == 0) goto L_0x01de
            r17 = r24
            goto L_0x01e0
        L_0x01de:
            r17 = r26
        L_0x01e0:
            r22 = r22 | r17
            goto L_0x01e5
        L_0x01e3:
            r6 = r77
        L_0x01e5:
            r17 = r13 & r29
            if (r17 != 0) goto L_0x01fd
            r17 = r14 & r26
            r6 = r79
            if (r17 != 0) goto L_0x01f8
            boolean r17 = r0.j(r6)
            if (r17 == 0) goto L_0x01f8
            r17 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x01fa
        L_0x01f8:
            r17 = 524288(0x80000, float:7.34684E-40)
        L_0x01fa:
            r22 = r22 | r17
            goto L_0x01ff
        L_0x01fd:
            r6 = r79
        L_0x01ff:
            r17 = r14 & r24
            if (r17 == 0) goto L_0x0208
            r22 = r22 | r32
            r13 = r81
            goto L_0x021b
        L_0x0208:
            r17 = r13 & r32
            r13 = r81
            if (r17 != 0) goto L_0x021b
            boolean r17 = r0.l(r13)
            if (r17 == 0) goto L_0x0217
            r17 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x0219
        L_0x0217:
            r17 = 4194304(0x400000, float:5.877472E-39)
        L_0x0219:
            r22 = r22 | r17
        L_0x021b:
            r17 = 306783379(0x12492493, float:6.34695E-28)
            r6 = r5 & r17
            r7 = 306783378(0x12492492, float:6.3469493E-28)
            r8 = 0
            r17 = 1
            if (r6 != r7) goto L_0x0235
            r6 = 4793491(0x492493, float:6.717112E-39)
            r6 = r22 & r6
            r7 = 4793490(0x492492, float:6.71711E-39)
            if (r6 == r7) goto L_0x0233
            goto L_0x0235
        L_0x0233:
            r6 = r8
            goto L_0x0237
        L_0x0235:
            r6 = r17
        L_0x0237:
            r7 = r5 & 1
            boolean r6 = r0.E(r6, r7)
            if (r6 == 0) goto L_0x0472
            r0.p()
            r6 = r15 & 1
            if (r6 == 0) goto L_0x02a7
            boolean r6 = r0.J()
            if (r6 == 0) goto L_0x024d
            goto L_0x02a7
        L_0x024d:
            r0.B()
            r1 = r14 & 2
            if (r1 == 0) goto L_0x0256
            r5 = r5 & -113(0xffffffffffffff8f, float:NaN)
        L_0x0256:
            r1 = r14 & 1024(0x400, float:1.435E-42)
            if (r1 == 0) goto L_0x025c
            r22 = r22 & -15
        L_0x025c:
            r1 = r22
            r2 = r14 & 4096(0x1000, float:5.74E-42)
            if (r2 == 0) goto L_0x0264
            r1 = r1 & -897(0xfffffffffffffc7f, float:NaN)
        L_0x0264:
            r2 = r14 & 8192(0x2000, float:1.14794E-41)
            if (r2 == 0) goto L_0x026a
            r1 = r1 & -7169(0xffffffffffffe3ff, float:NaN)
        L_0x026a:
            r2 = r14 & 16384(0x4000, float:2.2959E-41)
            if (r2 == 0) goto L_0x0272
            r2 = -57345(0xffffffffffff1fff, float:NaN)
            r1 = r1 & r2
        L_0x0272:
            r2 = 32768(0x8000, float:4.5918E-41)
            r2 = r2 & r14
            if (r2 == 0) goto L_0x027c
            r2 = -458753(0xfffffffffff8ffff, float:NaN)
            r1 = r1 & r2
        L_0x027c:
            r2 = r14 & r26
            if (r2 == 0) goto L_0x0284
            r2 = -3670017(0xffffffffffc7ffff, float:NaN)
            r1 = r1 & r2
        L_0x0284:
            r2 = r60
            r7 = r62
            r9 = r63
            r3 = r65
            r4 = r67
            r8 = r69
            r10 = r70
            r44 = r71
            r46 = r73
            r48 = r75
            r50 = r77
            r52 = r79
            r13 = r1
            r14 = r5
            r6 = r12
            r1 = r59
            r12 = r64
            r5 = r68
            goto L_0x03c0
        L_0x02a7:
            if (r1 == 0) goto L_0x02ac
            androidx.compose.ui.Modifier$Companion r1 = androidx.compose.ui.Modifier.f15489d
            goto L_0x02ae
        L_0x02ac:
            r1 = r59
        L_0x02ae:
            r6 = r14 & 2
            if (r6 == 0) goto L_0x02be
            r6 = 0
            r7 = 3
            r59 = r1
            r1 = 0
            androidx.compose.material.ScaffoldState r1 = g(r1, r6, r0, r8, r7)
            r5 = r5 & -113(0xffffffffffffff8f, float:NaN)
            goto L_0x02c2
        L_0x02be:
            r59 = r1
            r1 = r60
        L_0x02c2:
            if (r9 == 0) goto L_0x02cb
            androidx.compose.material.ComposableSingletons$ScaffoldKt r6 = androidx.compose.material.ComposableSingletons$ScaffoldKt.f7536a
            kotlin.jvm.functions.Function2 r6 = r6.e()
            goto L_0x02cc
        L_0x02cb:
            r6 = r12
        L_0x02cc:
            if (r16 == 0) goto L_0x02d5
            androidx.compose.material.ComposableSingletons$ScaffoldKt r7 = androidx.compose.material.ComposableSingletons$ScaffoldKt.f7536a
            kotlin.jvm.functions.Function2 r7 = r7.f()
            goto L_0x02d7
        L_0x02d5:
            r7 = r62
        L_0x02d7:
            if (r19 == 0) goto L_0x02e0
            androidx.compose.material.ComposableSingletons$ScaffoldKt r9 = androidx.compose.material.ComposableSingletons$ScaffoldKt.f7536a
            kotlin.jvm.functions.Function3 r9 = r9.g()
            goto L_0x02e2
        L_0x02e0:
            r9 = r63
        L_0x02e2:
            if (r23 == 0) goto L_0x02eb
            androidx.compose.material.ComposableSingletons$ScaffoldKt r12 = androidx.compose.material.ComposableSingletons$ScaffoldKt.f7536a
            kotlin.jvm.functions.Function2 r12 = r12.h()
            goto L_0x02ed
        L_0x02eb:
            r12 = r64
        L_0x02ed:
            if (r28 == 0) goto L_0x02f6
            androidx.compose.material.FabPosition$Companion r16 = androidx.compose.material.FabPosition.f7852b
            int r16 = r16.b()
            goto L_0x02f8
        L_0x02f6:
            r16 = r65
        L_0x02f8:
            if (r10 == 0) goto L_0x02fb
            r11 = r8
        L_0x02fb:
            if (r2 == 0) goto L_0x02ff
            r2 = 0
            goto L_0x0301
        L_0x02ff:
            r2 = r67
        L_0x0301:
            if (r3 == 0) goto L_0x0304
            goto L_0x0306
        L_0x0304:
            r17 = r68
        L_0x0306:
            r3 = r14 & 1024(0x400, float:1.435E-42)
            r10 = 6
            if (r3 == 0) goto L_0x031a
            androidx.compose.material.MaterialTheme r3 = androidx.compose.material.MaterialTheme.f7937a
            androidx.compose.material.Shapes r3 = r3.b(r0, r10)
            androidx.compose.foundation.shape.CornerBasedShape r3 = r3.a()
            r22 = r22 & -15
        L_0x0317:
            r8 = r22
            goto L_0x031d
        L_0x031a:
            r3 = r69
            goto L_0x0317
        L_0x031d:
            if (r4 == 0) goto L_0x0326
            androidx.compose.material.DrawerDefaults r4 = androidx.compose.material.DrawerDefaults.f7703a
            float r4 = r4.c()
            goto L_0x0328
        L_0x0326:
            r4 = r70
        L_0x0328:
            r10 = r14 & 4096(0x1000, float:5.74E-42)
            if (r10 == 0) goto L_0x0340
            androidx.compose.material.MaterialTheme r10 = androidx.compose.material.MaterialTheme.f7937a
            r18 = r1
            r1 = 6
            androidx.compose.material.Colors r10 = r10.a(r0, r1)
            long r19 = r10.n()
            r8 = r8 & -897(0xfffffffffffffc7f, float:NaN)
            r61 = r2
            r1 = r19
            goto L_0x0346
        L_0x0340:
            r18 = r1
            r61 = r2
            r1 = r71
        L_0x0346:
            r10 = r14 & 8192(0x2000, float:1.14794E-41)
            if (r10 == 0) goto L_0x0355
            int r10 = r8 >> 6
            r10 = r10 & 14
            long r19 = androidx.compose.material.ColorsKt.b(r1, r0, r10)
            r8 = r8 & -7169(0xffffffffffffe3ff, float:NaN)
            goto L_0x0357
        L_0x0355:
            r19 = r73
        L_0x0357:
            r10 = r14 & 16384(0x4000, float:2.2959E-41)
            if (r10 == 0) goto L_0x0369
            androidx.compose.material.DrawerDefaults r10 = androidx.compose.material.DrawerDefaults.f7703a
            r21 = r1
            r1 = 6
            long r23 = r10.d(r0, r1)
            r2 = -57345(0xffffffffffff1fff, float:NaN)
            r8 = r8 & r2
            goto L_0x036e
        L_0x0369:
            r21 = r1
            r1 = 6
            r23 = r75
        L_0x036e:
            r2 = 32768(0x8000, float:4.5918E-41)
            r2 = r2 & r14
            if (r2 == 0) goto L_0x0383
            androidx.compose.material.MaterialTheme r2 = androidx.compose.material.MaterialTheme.f7937a
            androidx.compose.material.Colors r1 = r2.a(r0, r1)
            long r1 = r1.c()
            r10 = -458753(0xfffffffffff8ffff, float:NaN)
            r8 = r8 & r10
            goto L_0x0385
        L_0x0383:
            r1 = r77
        L_0x0385:
            r10 = r14 & r26
            if (r10 == 0) goto L_0x03ae
            int r10 = r8 >> 15
            r10 = r10 & 14
            long r25 = androidx.compose.material.ColorsKt.b(r1, r0, r10)
            r10 = -3670017(0xffffffffffc7ffff, float:NaN)
            r8 = r8 & r10
            r50 = r1
            r10 = r4
            r14 = r5
            r13 = r8
            r5 = r17
            r2 = r18
            r46 = r19
            r44 = r21
            r48 = r23
            r52 = r25
        L_0x03a6:
            r1 = r59
            r4 = r61
            r8 = r3
            r3 = r16
            goto L_0x03c0
        L_0x03ae:
            r52 = r79
            r50 = r1
            r10 = r4
            r14 = r5
            r13 = r8
            r5 = r17
            r2 = r18
            r46 = r19
            r44 = r21
            r48 = r23
            goto L_0x03a6
        L_0x03c0:
            r0.U()
            boolean r16 = androidx.compose.runtime.ComposerKt.P()
            if (r16 == 0) goto L_0x03d5
            r15 = 1037492569(0x3dd6e159, float:0.104922004)
            r54 = r0
            java.lang.String r0 = "androidx.compose.material.Scaffold (Scaffold.kt:323)"
            androidx.compose.runtime.ComposerKt.Y(r15, r14, r13, r0)
        L_0x03d3:
            r0 = 0
            goto L_0x03d8
        L_0x03d5:
            r54 = r0
            goto L_0x03d3
        L_0x03d8:
            float r0 = (float) r0
            float r0 = androidx.compose.ui.unit.Dp.m(r0)
            r15 = 14
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r59 = r0
            r60 = r17
            r61 = r18
            r62 = r19
            r63 = r15
            r64 = r16
            androidx.compose.foundation.layout.WindowInsets r16 = androidx.compose.foundation.layout.WindowInsetsKt.d(r59, r60, r61, r62, r63, r64)
            int r0 = r14 << 3
            r15 = 2147483632(0x7ffffff0, float:NaN)
            r41 = r0 & r15
            int r0 = r14 >> 27
            r0 = r0 & 14
            int r13 = r13 << 3
            r14 = r13 & 112(0x70, float:1.57E-43)
            r0 = r0 | r14
            r14 = r13 & 896(0x380, float:1.256E-42)
            r0 = r0 | r14
            r14 = r13 & 7168(0x1c00, float:1.0045E-41)
            r0 = r0 | r14
            r14 = 57344(0xe000, float:8.0356E-41)
            r14 = r14 & r13
            r0 = r0 | r14
            r14 = 458752(0x70000, float:6.42848E-40)
            r14 = r14 & r13
            r0 = r0 | r14
            r14 = 3670016(0x380000, float:5.142788E-39)
            r14 = r14 & r13
            r0 = r0 | r14
            r14 = 29360128(0x1c00000, float:7.052966E-38)
            r14 = r14 & r13
            r0 = r0 | r14
            r14 = 234881024(0xe000000, float:1.5777218E-30)
            r13 = r13 & r14
            r42 = r0 | r13
            r43 = 0
            r17 = r1
            r18 = r2
            r19 = r6
            r20 = r7
            r21 = r9
            r22 = r12
            r23 = r3
            r24 = r11
            r25 = r4
            r26 = r5
            r27 = r8
            r28 = r10
            r29 = r44
            r31 = r46
            r33 = r48
            r35 = r50
            r37 = r52
            r39 = r81
            r40 = r54
            b(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r31, r33, r35, r37, r39, r40, r41, r42, r43)
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x0457
            androidx.compose.runtime.ComposerKt.X()
        L_0x0457:
            r13 = r44
            r15 = r46
            r17 = r48
            r19 = r50
            r21 = r52
            r57 = r7
            r7 = r3
            r3 = r6
            r6 = r12
            r12 = r10
            r10 = r5
            r5 = r9
            r9 = r4
            r4 = r57
            r58 = r11
            r11 = r8
            r8 = r58
            goto L_0x0497
        L_0x0472:
            r54 = r0
            r54.B()
            r1 = r59
            r2 = r60
            r4 = r62
            r5 = r63
            r6 = r64
            r7 = r65
            r9 = r67
            r10 = r68
            r13 = r71
            r15 = r73
            r17 = r75
            r19 = r77
            r21 = r79
            r8 = r11
            r3 = r12
            r11 = r69
            r12 = r70
        L_0x0497:
            androidx.compose.runtime.ScopeUpdateScope r0 = r54.x()
            if (r0 == 0) goto L_0x04ba
            r59 = r15
            androidx.compose.material.ScaffoldKt$Scaffold$3 r15 = new androidx.compose.material.ScaffoldKt$Scaffold$3
            r55 = r0
            r0 = r15
            r56 = r15
            r15 = r59
            r23 = r81
            r24 = r83
            r25 = r84
            r26 = r85
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r15, r17, r19, r21, r23, r24, r25, r26)
            r0 = r55
            r1 = r56
            r0.a(r1)
        L_0x04ba:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.ScaffoldKt.a(androidx.compose.ui.Modifier, androidx.compose.material.ScaffoldState, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function3, kotlin.jvm.functions.Function2, int, boolean, kotlin.jvm.functions.Function3, boolean, androidx.compose.ui.graphics.Shape, float, long, long, long, long, long, kotlin.jvm.functions.Function3, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v0, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v0, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r32v1, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r32v2, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v1, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v2, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v3, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v4, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v5, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v6, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v7, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v8, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v6, resolved type: androidx.compose.material.MutableWindowInsets} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v17, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v18, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v19, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v20, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v21, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v25, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v30, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v31, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v32, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v33, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v34, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v35, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v14, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v18, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v23, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v29, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v1, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v2, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v34, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v35, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r28v2, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v50, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v51, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v2, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r32v5, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r32v7, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r32v8, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r32v11, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v50, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v53, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v54, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v57, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v59, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v60, resolved type: int} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x013c  */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x0141  */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x015b  */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x0173  */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x017a  */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x017f  */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x0196  */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x01aa  */
    /* JADX WARNING: Removed duplicated region for block: B:151:0x01b0  */
    /* JADX WARNING: Removed duplicated region for block: B:158:0x01c4  */
    /* JADX WARNING: Removed duplicated region for block: B:161:0x01ca  */
    /* JADX WARNING: Removed duplicated region for block: B:168:0x01e1  */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x01e9  */
    /* JADX WARNING: Removed duplicated region for block: B:178:0x01fd  */
    /* JADX WARNING: Removed duplicated region for block: B:181:0x0205  */
    /* JADX WARNING: Removed duplicated region for block: B:188:0x0219  */
    /* JADX WARNING: Removed duplicated region for block: B:191:0x0221  */
    /* JADX WARNING: Removed duplicated region for block: B:192:0x0226  */
    /* JADX WARNING: Removed duplicated region for block: B:203:0x024d  */
    /* JADX WARNING: Removed duplicated region for block: B:204:0x024f  */
    /* JADX WARNING: Removed duplicated region for block: B:207:0x0258  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:312:0x04dd  */
    /* JADX WARNING: Removed duplicated region for block: B:315:0x0508  */
    /* JADX WARNING: Removed duplicated region for block: B:317:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00a8  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00ad  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00c6  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00cb  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x00e4  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x00e9  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0102  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0107  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x0120  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x0125  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void b(androidx.compose.foundation.layout.WindowInsets r37, androidx.compose.ui.Modifier r38, androidx.compose.material.ScaffoldState r39, kotlin.jvm.functions.Function2 r40, kotlin.jvm.functions.Function2 r41, kotlin.jvm.functions.Function3 r42, kotlin.jvm.functions.Function2 r43, int r44, boolean r45, kotlin.jvm.functions.Function3 r46, boolean r47, androidx.compose.ui.graphics.Shape r48, float r49, long r50, long r52, long r54, long r56, long r58, kotlin.jvm.functions.Function3 r60, androidx.compose.runtime.Composer r61, int r62, int r63, int r64) {
        /*
            r1 = r37
            r14 = r62
            r15 = r63
            r13 = r64
            r0 = -1288630565(0xffffffffb3310edb, float:-4.1224535E-8)
            r2 = r61
            androidx.compose.runtime.Composer r0 = r2.q(r0)
            r2 = r13 & 1
            if (r2 == 0) goto L_0x0018
            r2 = r14 | 6
            goto L_0x0028
        L_0x0018:
            r2 = r14 & 6
            if (r2 != 0) goto L_0x0027
            boolean r2 = r0.W(r1)
            if (r2 == 0) goto L_0x0024
            r2 = 4
            goto L_0x0025
        L_0x0024:
            r2 = 2
        L_0x0025:
            r2 = r2 | r14
            goto L_0x0028
        L_0x0027:
            r2 = r14
        L_0x0028:
            r5 = r13 & 2
            if (r5 == 0) goto L_0x0031
            r2 = r2 | 48
        L_0x002e:
            r8 = r38
            goto L_0x0043
        L_0x0031:
            r8 = r14 & 48
            if (r8 != 0) goto L_0x002e
            r8 = r38
            boolean r9 = r0.W(r8)
            if (r9 == 0) goto L_0x0040
            r9 = 32
            goto L_0x0042
        L_0x0040:
            r9 = 16
        L_0x0042:
            r2 = r2 | r9
        L_0x0043:
            r9 = r14 & 384(0x180, float:5.38E-43)
            if (r9 != 0) goto L_0x005c
            r9 = r13 & 4
            if (r9 != 0) goto L_0x0056
            r9 = r39
            boolean r12 = r0.W(r9)
            if (r12 == 0) goto L_0x0058
            r12 = 256(0x100, float:3.59E-43)
            goto L_0x005a
        L_0x0056:
            r9 = r39
        L_0x0058:
            r12 = 128(0x80, float:1.794E-43)
        L_0x005a:
            r2 = r2 | r12
            goto L_0x005e
        L_0x005c:
            r9 = r39
        L_0x005e:
            r12 = r13 & 8
            r16 = 1024(0x400, float:1.435E-42)
            r17 = 2048(0x800, float:2.87E-42)
            if (r12 == 0) goto L_0x006b
            r2 = r2 | 3072(0xc00, float:4.305E-42)
        L_0x0068:
            r3 = r40
            goto L_0x007e
        L_0x006b:
            r3 = r14 & 3072(0xc00, float:4.305E-42)
            if (r3 != 0) goto L_0x0068
            r3 = r40
            boolean r18 = r0.l(r3)
            if (r18 == 0) goto L_0x007a
            r18 = r17
            goto L_0x007c
        L_0x007a:
            r18 = r16
        L_0x007c:
            r2 = r2 | r18
        L_0x007e:
            r18 = r13 & 16
            r19 = 8192(0x2000, float:1.14794E-41)
            r20 = 16384(0x4000, float:2.2959E-41)
            if (r18 == 0) goto L_0x008b
            r2 = r2 | 24576(0x6000, float:3.4438E-41)
        L_0x0088:
            r6 = r41
            goto L_0x009e
        L_0x008b:
            r6 = r14 & 24576(0x6000, float:3.4438E-41)
            if (r6 != 0) goto L_0x0088
            r6 = r41
            boolean r22 = r0.l(r6)
            if (r22 == 0) goto L_0x009a
            r22 = r20
            goto L_0x009c
        L_0x009a:
            r22 = r19
        L_0x009c:
            r2 = r2 | r22
        L_0x009e:
            r22 = r13 & 32
            r23 = 196608(0x30000, float:2.75506E-40)
            r24 = 65536(0x10000, float:9.18355E-41)
            r25 = 131072(0x20000, float:1.83671E-40)
            if (r22 == 0) goto L_0x00ad
            r2 = r2 | r23
            r7 = r42
            goto L_0x00c0
        L_0x00ad:
            r26 = r14 & r23
            r7 = r42
            if (r26 != 0) goto L_0x00c0
            boolean r27 = r0.l(r7)
            if (r27 == 0) goto L_0x00bc
            r27 = r25
            goto L_0x00be
        L_0x00bc:
            r27 = r24
        L_0x00be:
            r2 = r2 | r27
        L_0x00c0:
            r27 = r13 & 64
            r28 = 1572864(0x180000, float:2.204052E-39)
            if (r27 == 0) goto L_0x00cb
            r2 = r2 | r28
            r10 = r43
            goto L_0x00de
        L_0x00cb:
            r28 = r14 & r28
            r10 = r43
            if (r28 != 0) goto L_0x00de
            boolean r29 = r0.l(r10)
            if (r29 == 0) goto L_0x00da
            r29 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00dc
        L_0x00da:
            r29 = 524288(0x80000, float:7.34684E-40)
        L_0x00dc:
            r2 = r2 | r29
        L_0x00de:
            r11 = r13 & 128(0x80, float:1.794E-43)
            r30 = 12582912(0xc00000, float:1.7632415E-38)
            if (r11 == 0) goto L_0x00e9
            r2 = r2 | r30
            r4 = r44
            goto L_0x00fc
        L_0x00e9:
            r30 = r14 & r30
            r4 = r44
            if (r30 != 0) goto L_0x00fc
            boolean r31 = r0.i(r4)
            if (r31 == 0) goto L_0x00f8
            r31 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00fa
        L_0x00f8:
            r31 = 4194304(0x400000, float:5.877472E-39)
        L_0x00fa:
            r2 = r2 | r31
        L_0x00fc:
            r3 = r13 & 256(0x100, float:3.59E-43)
            r31 = 100663296(0x6000000, float:2.4074124E-35)
            if (r3 == 0) goto L_0x0107
            r2 = r2 | r31
            r4 = r45
            goto L_0x011a
        L_0x0107:
            r32 = r14 & r31
            r4 = r45
            if (r32 != 0) goto L_0x011a
            boolean r32 = r0.d(r4)
            if (r32 == 0) goto L_0x0116
            r32 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x0118
        L_0x0116:
            r32 = 33554432(0x2000000, float:9.403955E-38)
        L_0x0118:
            r2 = r2 | r32
        L_0x011a:
            r4 = r13 & 512(0x200, float:7.175E-43)
            r32 = 805306368(0x30000000, float:4.656613E-10)
            if (r4 == 0) goto L_0x0125
            r2 = r2 | r32
            r6 = r46
            goto L_0x0138
        L_0x0125:
            r32 = r14 & r32
            r6 = r46
            if (r32 != 0) goto L_0x0138
            boolean r32 = r0.l(r6)
            if (r32 == 0) goto L_0x0134
            r32 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x0136
        L_0x0134:
            r32 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x0136:
            r2 = r2 | r32
        L_0x0138:
            r6 = r13 & 1024(0x400, float:1.435E-42)
            if (r6 == 0) goto L_0x0141
            r32 = r15 | 6
            r7 = r47
            goto L_0x0157
        L_0x0141:
            r32 = r15 & 6
            r7 = r47
            if (r32 != 0) goto L_0x0155
            boolean r32 = r0.d(r7)
            if (r32 == 0) goto L_0x0150
            r32 = 4
            goto L_0x0152
        L_0x0150:
            r32 = 2
        L_0x0152:
            r32 = r15 | r32
            goto L_0x0157
        L_0x0155:
            r32 = r15
        L_0x0157:
            r33 = r15 & 48
            if (r33 != 0) goto L_0x0173
            r7 = r13 & 2048(0x800, float:2.87E-42)
            if (r7 != 0) goto L_0x016a
            r7 = r48
            boolean r33 = r0.W(r7)
            if (r33 == 0) goto L_0x016c
            r21 = 32
            goto L_0x016e
        L_0x016a:
            r7 = r48
        L_0x016c:
            r21 = 16
        L_0x016e:
            r32 = r32 | r21
        L_0x0170:
            r7 = r32
            goto L_0x0176
        L_0x0173:
            r7 = r48
            goto L_0x0170
        L_0x0176:
            r8 = r13 & 4096(0x1000, float:5.74E-42)
            if (r8 == 0) goto L_0x017f
            r7 = r7 | 384(0x180, float:5.38E-43)
        L_0x017c:
            r9 = r49
            goto L_0x0192
        L_0x017f:
            r9 = r15 & 384(0x180, float:5.38E-43)
            if (r9 != 0) goto L_0x017c
            r9 = r49
            boolean r21 = r0.h(r9)
            if (r21 == 0) goto L_0x018e
            r28 = 256(0x100, float:3.59E-43)
            goto L_0x0190
        L_0x018e:
            r28 = 128(0x80, float:1.794E-43)
        L_0x0190:
            r7 = r7 | r28
        L_0x0192:
            r9 = r15 & 3072(0xc00, float:4.305E-42)
            if (r9 != 0) goto L_0x01aa
            r9 = r13 & 8192(0x2000, float:1.14794E-41)
            if (r9 != 0) goto L_0x01a5
            r9 = r50
            boolean r21 = r0.j(r9)
            if (r21 == 0) goto L_0x01a7
            r16 = r17
            goto L_0x01a7
        L_0x01a5:
            r9 = r50
        L_0x01a7:
            r7 = r7 | r16
            goto L_0x01ac
        L_0x01aa:
            r9 = r50
        L_0x01ac:
            r9 = r15 & 24576(0x6000, float:3.4438E-41)
            if (r9 != 0) goto L_0x01c4
            r9 = r13 & 16384(0x4000, float:2.2959E-41)
            if (r9 != 0) goto L_0x01bf
            r9 = r52
            boolean r16 = r0.j(r9)
            if (r16 == 0) goto L_0x01c1
            r19 = r20
            goto L_0x01c1
        L_0x01bf:
            r9 = r52
        L_0x01c1:
            r7 = r7 | r19
            goto L_0x01c6
        L_0x01c4:
            r9 = r52
        L_0x01c6:
            r16 = r15 & r23
            if (r16 != 0) goto L_0x01e1
            r16 = 32768(0x8000, float:4.5918E-41)
            r16 = r13 & r16
            r9 = r54
            if (r16 != 0) goto L_0x01dc
            boolean r16 = r0.j(r9)
            if (r16 == 0) goto L_0x01dc
            r16 = r25
            goto L_0x01de
        L_0x01dc:
            r16 = r24
        L_0x01de:
            r7 = r7 | r16
            goto L_0x01e3
        L_0x01e1:
            r9 = r54
        L_0x01e3:
            r16 = 1572864(0x180000, float:2.204052E-39)
            r16 = r15 & r16
            if (r16 != 0) goto L_0x01fd
            r16 = r13 & r24
            r9 = r56
            if (r16 != 0) goto L_0x01f8
            boolean r16 = r0.j(r9)
            if (r16 == 0) goto L_0x01f8
            r16 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x01fa
        L_0x01f8:
            r16 = 524288(0x80000, float:7.34684E-40)
        L_0x01fa:
            r7 = r7 | r16
            goto L_0x01ff
        L_0x01fd:
            r9 = r56
        L_0x01ff:
            r16 = 12582912(0xc00000, float:1.7632415E-38)
            r16 = r15 & r16
            if (r16 != 0) goto L_0x0219
            r16 = r13 & r25
            r9 = r58
            if (r16 != 0) goto L_0x0214
            boolean r16 = r0.j(r9)
            if (r16 == 0) goto L_0x0214
            r16 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x0216
        L_0x0214:
            r16 = 4194304(0x400000, float:5.877472E-39)
        L_0x0216:
            r7 = r7 | r16
            goto L_0x021b
        L_0x0219:
            r9 = r58
        L_0x021b:
            r16 = 262144(0x40000, float:3.67342E-40)
            r16 = r13 & r16
            if (r16 == 0) goto L_0x0226
            r7 = r7 | r31
            r15 = r60
            goto L_0x0239
        L_0x0226:
            r16 = r15 & r31
            r15 = r60
            if (r16 != 0) goto L_0x0239
            boolean r16 = r0.l(r15)
            if (r16 == 0) goto L_0x0235
            r16 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x0237
        L_0x0235:
            r16 = 33554432(0x2000000, float:9.403955E-38)
        L_0x0237:
            r7 = r7 | r16
        L_0x0239:
            r16 = 306783379(0x12492493, float:6.34695E-28)
            r9 = r2 & r16
            r10 = 306783378(0x12492492, float:6.3469493E-28)
            if (r9 != r10) goto L_0x024f
            r9 = 38347923(0x2492493, float:1.4777644E-37)
            r9 = r9 & r7
            r10 = 38347922(0x2492492, float:1.4777643E-37)
            if (r9 == r10) goto L_0x024d
            goto L_0x024f
        L_0x024d:
            r9 = 0
            goto L_0x0250
        L_0x024f:
            r9 = 1
        L_0x0250:
            r10 = r2 & 1
            boolean r9 = r0.E(r9, r10)
            if (r9 == 0) goto L_0x04dd
            r0.p()
            r9 = r14 & 1
            if (r9 == 0) goto L_0x02c3
            boolean r9 = r0.J()
            if (r9 == 0) goto L_0x0266
            goto L_0x02c3
        L_0x0266:
            r0.B()
            r3 = r13 & 4
            if (r3 == 0) goto L_0x026f
            r2 = r2 & -897(0xfffffffffffffc7f, float:NaN)
        L_0x026f:
            r3 = r13 & 2048(0x800, float:2.87E-42)
            if (r3 == 0) goto L_0x0275
            r7 = r7 & -113(0xffffffffffffff8f, float:NaN)
        L_0x0275:
            r3 = r13 & 8192(0x2000, float:1.14794E-41)
            if (r3 == 0) goto L_0x027b
            r7 = r7 & -7169(0xffffffffffffe3ff, float:NaN)
        L_0x027b:
            r3 = r13 & 16384(0x4000, float:2.2959E-41)
            if (r3 == 0) goto L_0x0283
            r3 = -57345(0xffffffffffff1fff, float:NaN)
            r7 = r7 & r3
        L_0x0283:
            r3 = 32768(0x8000, float:4.5918E-41)
            r3 = r3 & r13
            if (r3 == 0) goto L_0x028d
            r3 = -458753(0xfffffffffff8ffff, float:NaN)
            r7 = r7 & r3
        L_0x028d:
            r3 = r13 & r24
            if (r3 == 0) goto L_0x0295
            r3 = -3670017(0xffffffffffc7ffff, float:NaN)
            r7 = r7 & r3
        L_0x0295:
            r3 = r13 & r25
            if (r3 == 0) goto L_0x029d
            r3 = -29360129(0xfffffffffe3fffff, float:-6.380294E37)
            r7 = r7 & r3
        L_0x029d:
            r9 = r39
            r10 = r40
            r12 = r41
            r15 = r42
            r17 = r43
            r11 = r44
            r3 = r45
            r4 = r46
            r6 = r47
            r5 = r48
            r8 = r49
            r20 = r50
            r18 = r52
            r22 = r54
            r24 = r56
            r26 = r58
            r13 = r7
            r7 = r2
            r2 = r38
            goto L_0x03d8
        L_0x02c3:
            if (r5 == 0) goto L_0x02c8
            androidx.compose.ui.Modifier$Companion r5 = androidx.compose.ui.Modifier.f15489d
            goto L_0x02ca
        L_0x02c8:
            r5 = r38
        L_0x02ca:
            r9 = r13 & 4
            if (r9 == 0) goto L_0x02db
            r9 = 0
            r10 = 3
            r15 = 0
            r38 = r5
            r5 = 0
            androidx.compose.material.ScaffoldState r9 = g(r15, r9, r0, r5, r10)
            r2 = r2 & -897(0xfffffffffffffc7f, float:NaN)
            goto L_0x02e0
        L_0x02db:
            r38 = r5
            r5 = 0
            r9 = r39
        L_0x02e0:
            if (r12 == 0) goto L_0x02e9
            androidx.compose.material.ComposableSingletons$ScaffoldKt r10 = androidx.compose.material.ComposableSingletons$ScaffoldKt.f7536a
            kotlin.jvm.functions.Function2 r10 = r10.a()
            goto L_0x02eb
        L_0x02e9:
            r10 = r40
        L_0x02eb:
            if (r18 == 0) goto L_0x02f4
            androidx.compose.material.ComposableSingletons$ScaffoldKt r12 = androidx.compose.material.ComposableSingletons$ScaffoldKt.f7536a
            kotlin.jvm.functions.Function2 r12 = r12.b()
            goto L_0x02f6
        L_0x02f4:
            r12 = r41
        L_0x02f6:
            if (r22 == 0) goto L_0x02ff
            androidx.compose.material.ComposableSingletons$ScaffoldKt r15 = androidx.compose.material.ComposableSingletons$ScaffoldKt.f7536a
            kotlin.jvm.functions.Function3 r15 = r15.c()
            goto L_0x0301
        L_0x02ff:
            r15 = r42
        L_0x0301:
            if (r27 == 0) goto L_0x030a
            androidx.compose.material.ComposableSingletons$ScaffoldKt r17 = androidx.compose.material.ComposableSingletons$ScaffoldKt.f7536a
            kotlin.jvm.functions.Function2 r17 = r17.d()
            goto L_0x030c
        L_0x030a:
            r17 = r43
        L_0x030c:
            if (r11 == 0) goto L_0x0315
            androidx.compose.material.FabPosition$Companion r11 = androidx.compose.material.FabPosition.f7852b
            int r11 = r11.b()
            goto L_0x0317
        L_0x0315:
            r11 = r44
        L_0x0317:
            if (r3 == 0) goto L_0x031b
            r3 = r5
            goto L_0x031d
        L_0x031b:
            r3 = r45
        L_0x031d:
            if (r4 == 0) goto L_0x0321
            r4 = 0
            goto L_0x0323
        L_0x0321:
            r4 = r46
        L_0x0323:
            if (r6 == 0) goto L_0x0327
            r6 = 1
            goto L_0x0329
        L_0x0327:
            r6 = r47
        L_0x0329:
            r5 = r13 & 2048(0x800, float:2.87E-42)
            r39 = r2
            r2 = 6
            if (r5 == 0) goto L_0x033d
            androidx.compose.material.MaterialTheme r5 = androidx.compose.material.MaterialTheme.f7937a
            androidx.compose.material.Shapes r5 = r5.b(r0, r2)
            androidx.compose.foundation.shape.CornerBasedShape r5 = r5.a()
            r7 = r7 & -113(0xffffffffffffff8f, float:NaN)
            goto L_0x033f
        L_0x033d:
            r5 = r48
        L_0x033f:
            if (r8 == 0) goto L_0x0348
            androidx.compose.material.DrawerDefaults r8 = androidx.compose.material.DrawerDefaults.f7703a
            float r8 = r8.c()
            goto L_0x034a
        L_0x0348:
            r8 = r49
        L_0x034a:
            r2 = r13 & 8192(0x2000, float:1.14794E-41)
            if (r2 == 0) goto L_0x035e
            androidx.compose.material.MaterialTheme r2 = androidx.compose.material.MaterialTheme.f7937a
            r41 = r3
            r3 = 6
            androidx.compose.material.Colors r2 = r2.a(r0, r3)
            long r2 = r2.n()
            r7 = r7 & -7169(0xffffffffffffe3ff, float:NaN)
            goto L_0x0362
        L_0x035e:
            r41 = r3
            r2 = r50
        L_0x0362:
            r42 = r4
            r4 = r13 & 16384(0x4000, float:2.2959E-41)
            if (r4 == 0) goto L_0x0375
            int r4 = r7 >> 9
            r4 = r4 & 14
            long r18 = androidx.compose.material.ColorsKt.b(r2, r0, r4)
            r4 = -57345(0xffffffffffff1fff, float:NaN)
            r7 = r7 & r4
            goto L_0x0377
        L_0x0375:
            r18 = r52
        L_0x0377:
            r4 = 32768(0x8000, float:4.5918E-41)
            r4 = r4 & r13
            if (r4 == 0) goto L_0x038c
            androidx.compose.material.DrawerDefaults r4 = androidx.compose.material.DrawerDefaults.f7703a
            r20 = r2
            r2 = 6
            long r3 = r4.d(r0, r2)
            r22 = -458753(0xfffffffffff8ffff, float:NaN)
            r7 = r7 & r22
            goto L_0x0391
        L_0x038c:
            r20 = r2
            r2 = 6
            r3 = r54
        L_0x0391:
            r22 = r13 & r24
            r43 = r3
            if (r22 == 0) goto L_0x03a7
            androidx.compose.material.MaterialTheme r3 = androidx.compose.material.MaterialTheme.f7937a
            androidx.compose.material.Colors r2 = r3.a(r0, r2)
            long r2 = r2.c()
            r4 = -3670017(0xffffffffffc7ffff, float:NaN)
            r4 = r4 & r7
            r7 = r4
            goto L_0x03a9
        L_0x03a7:
            r2 = r56
        L_0x03a9:
            r4 = r13 & r25
            if (r4 == 0) goto L_0x03c9
            int r4 = r7 >> 18
            r4 = r4 & 14
            long r22 = androidx.compose.material.ColorsKt.b(r2, r0, r4)
            r4 = -29360129(0xfffffffffe3fffff, float:-6.380294E37)
            r7 = r7 & r4
            r4 = r42
            r24 = r2
            r13 = r7
            r26 = r22
            r2 = r38
            r7 = r39
            r3 = r41
            r22 = r43
            goto L_0x03d8
        L_0x03c9:
            r4 = r42
            r22 = r43
            r26 = r58
            r24 = r2
            r13 = r7
            r2 = r38
            r7 = r39
            r3 = r41
        L_0x03d8:
            r0.U()
            boolean r28 = androidx.compose.runtime.ComposerKt.P()
            if (r28 == 0) goto L_0x03ec
            r14 = -1288630565(0xffffffffb3310edb, float:-4.1224535E-8)
            r54 = r8
            java.lang.String r8 = "androidx.compose.material.Scaffold (Scaffold.kt:197)"
            androidx.compose.runtime.ComposerKt.Y(r14, r7, r13, r8)
            goto L_0x03ee
        L_0x03ec:
            r54 = r8
        L_0x03ee:
            r8 = r7 & 14
            r14 = 4
            if (r8 != r14) goto L_0x03f5
            r8 = 1
            goto L_0x03f6
        L_0x03f5:
            r8 = 0
        L_0x03f6:
            java.lang.Object r14 = r0.g()
            if (r8 != 0) goto L_0x0404
            androidx.compose.runtime.Composer$Companion r8 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r8 = r8.a()
            if (r14 != r8) goto L_0x040c
        L_0x0404:
            androidx.compose.material.MutableWindowInsets r14 = new androidx.compose.material.MutableWindowInsets
            r14.<init>(r1)
            r0.N(r14)
        L_0x040c:
            r8 = r14
            androidx.compose.material.MutableWindowInsets r8 = (androidx.compose.material.MutableWindowInsets) r8
            androidx.compose.material.ScaffoldKt$Scaffold$child$1 r14 = new androidx.compose.material.ScaffoldKt$Scaffold$child$1
            r38 = r14
            r39 = r8
            r40 = r37
            r41 = r24
            r43 = r26
            r45 = r3
            r46 = r11
            r47 = r10
            r48 = r60
            r49 = r17
            r50 = r12
            r51 = r15
            r52 = r9
            r38.<init>(r39, r40, r41, r43, r45, r46, r47, r48, r49, r50, r51, r52)
            r8 = 54
            r1 = -219833176(0xfffffffff2e59ca8, float:-9.095866E30)
            r55 = r3
            r3 = 1
            androidx.compose.runtime.internal.ComposableLambda r1 = androidx.compose.runtime.internal.ComposableLambdaKt.e(r1, r3, r14, r0, r8)
            if (r4 == 0) goto L_0x049c
            r8 = 651765711(0x26d927cf, float:1.506819E-15)
            r0.X(r8)
            androidx.compose.material.DrawerState r8 = r9.a()
            androidx.compose.material.ScaffoldKt$Scaffold$1 r14 = new androidx.compose.material.ScaffoldKt$Scaffold$1
            r14.<init>(r1)
            r1 = 54
            r56 = r9
            r9 = -1409196448(0xffffffffac015e60, float:-1.8384391E-12)
            androidx.compose.runtime.internal.ComposableLambda r1 = androidx.compose.runtime.internal.ComposableLambdaKt.e(r9, r3, r14, r0, r1)
            int r3 = r7 >> 27
            r3 = r3 & 14
            r9 = 805306368(0x30000000, float:4.656613E-10)
            r3 = r3 | r9
            r7 = r7 & 112(0x70, float:1.57E-43)
            r3 = r3 | r7
            int r7 = r13 << 9
            r9 = r7 & 7168(0x1c00, float:1.0045E-41)
            r3 = r3 | r9
            r9 = 57344(0xe000, float:8.0356E-41)
            r9 = r9 & r7
            r3 = r3 | r9
            r9 = 458752(0x70000, float:6.42848E-40)
            r9 = r9 & r7
            r3 = r3 | r9
            r9 = 3670016(0x380000, float:5.142788E-39)
            r9 = r9 & r7
            r3 = r3 | r9
            r9 = 29360128(0x1c00000, float:7.052966E-38)
            r9 = r9 & r7
            r3 = r3 | r9
            r9 = 234881024(0xe000000, float:1.5777218E-30)
            r7 = r7 & r9
            r3 = r3 | r7
            r7 = 0
            r38 = r4
            r39 = r2
            r40 = r8
            r41 = r6
            r42 = r5
            r43 = r54
            r44 = r20
            r46 = r18
            r48 = r22
            r50 = r1
            r51 = r0
            r52 = r3
            r53 = r7
            androidx.compose.material.DrawerKt.e(r38, r39, r40, r41, r42, r43, r44, r46, r48, r50, r51, r52, r53)
            r0.M()
            goto L_0x04b4
        L_0x049c:
            r56 = r9
            r3 = 652256007(0x26e0a307, float:1.5587311E-15)
            r0.X(r3)
            int r3 = r7 >> 3
            r3 = r3 & 14
            r3 = r3 | 48
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r1.d(r2, r0, r3)
            r0.M()
        L_0x04b4:
            boolean r1 = androidx.compose.runtime.ComposerKt.P()
            if (r1 == 0) goto L_0x04bd
            androidx.compose.runtime.ComposerKt.X()
        L_0x04bd:
            r13 = r54
            r9 = r55
            r3 = r56
            r8 = r11
            r7 = r17
            r16 = r18
            r18 = r22
            r22 = r26
            r11 = r6
            r6 = r15
            r14 = r20
            r20 = r24
            r35 = r10
            r10 = r4
            r4 = r35
            r36 = r12
            r12 = r5
            r5 = r36
            goto L_0x0502
        L_0x04dd:
            r0.B()
            r2 = r38
            r3 = r39
            r4 = r40
            r5 = r41
            r6 = r42
            r7 = r43
            r8 = r44
            r9 = r45
            r10 = r46
            r11 = r47
            r12 = r48
            r13 = r49
            r14 = r50
            r16 = r52
            r18 = r54
            r20 = r56
            r22 = r58
        L_0x0502:
            androidx.compose.runtime.ScopeUpdateScope r1 = r0.x()
            if (r1 == 0) goto L_0x0522
            androidx.compose.material.ScaffoldKt$Scaffold$2 r0 = new androidx.compose.material.ScaffoldKt$Scaffold$2
            r38 = r0
            r34 = r1
            r1 = r37
            r24 = r60
            r25 = r62
            r26 = r63
            r27 = r64
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r16, r18, r20, r22, r24, r25, r26, r27)
            r1 = r38
            r0 = r34
            r0.a(r1)
        L_0x0522:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.ScaffoldKt.b(androidx.compose.foundation.layout.WindowInsets, androidx.compose.ui.Modifier, androidx.compose.material.ScaffoldState, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function3, kotlin.jvm.functions.Function2, int, boolean, kotlin.jvm.functions.Function3, boolean, androidx.compose.ui.graphics.Shape, float, long, long, long, long, long, kotlin.jvm.functions.Function3, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v9, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v15, resolved type: androidx.compose.material.ScaffoldKt$ScaffoldLayout$1$1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v21, resolved type: androidx.compose.material.ScaffoldKt$ScaffoldLayout$1$1} */
    /* JADX WARNING: type inference failed for: r8v10 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void c(boolean r20, int r21, kotlin.jvm.functions.Function2 r22, kotlin.jvm.functions.Function3 r23, kotlin.jvm.functions.Function2 r24, kotlin.jvm.functions.Function2 r25, androidx.compose.foundation.layout.WindowInsets r26, kotlin.jvm.functions.Function2 r27, androidx.compose.runtime.Composer r28, int r29) {
        /*
            r9 = r29
            r0 = -468424875(0xffffffffe4146755, float:-1.0950256E22)
            r1 = r28
            androidx.compose.runtime.Composer r1 = r1.q(r0)
            r2 = r9 & 6
            if (r2 != 0) goto L_0x001c
            r2 = r20
            boolean r4 = r1.d(r2)
            if (r4 == 0) goto L_0x0019
            r4 = 4
            goto L_0x001a
        L_0x0019:
            r4 = 2
        L_0x001a:
            r4 = r4 | r9
            goto L_0x001f
        L_0x001c:
            r2 = r20
            r4 = r9
        L_0x001f:
            r5 = r9 & 48
            if (r5 != 0) goto L_0x0032
            r5 = r21
            boolean r7 = r1.i(r5)
            if (r7 == 0) goto L_0x002e
            r7 = 32
            goto L_0x0030
        L_0x002e:
            r7 = 16
        L_0x0030:
            r4 = r4 | r7
            goto L_0x0034
        L_0x0032:
            r5 = r21
        L_0x0034:
            r7 = r9 & 384(0x180, float:5.38E-43)
            if (r7 != 0) goto L_0x0047
            r7 = r22
            boolean r10 = r1.l(r7)
            if (r10 == 0) goto L_0x0043
            r10 = 256(0x100, float:3.59E-43)
            goto L_0x0045
        L_0x0043:
            r10 = 128(0x80, float:1.794E-43)
        L_0x0045:
            r4 = r4 | r10
            goto L_0x0049
        L_0x0047:
            r7 = r22
        L_0x0049:
            r10 = r9 & 3072(0xc00, float:4.305E-42)
            r15 = r23
            if (r10 != 0) goto L_0x005b
            boolean r10 = r1.l(r15)
            if (r10 == 0) goto L_0x0058
            r10 = 2048(0x800, float:2.87E-42)
            goto L_0x005a
        L_0x0058:
            r10 = 1024(0x400, float:1.435E-42)
        L_0x005a:
            r4 = r4 | r10
        L_0x005b:
            r10 = r9 & 24576(0x6000, float:3.4438E-41)
            r14 = r24
            if (r10 != 0) goto L_0x006d
            boolean r10 = r1.l(r14)
            if (r10 == 0) goto L_0x006a
            r10 = 16384(0x4000, float:2.2959E-41)
            goto L_0x006c
        L_0x006a:
            r10 = 8192(0x2000, float:1.14794E-41)
        L_0x006c:
            r4 = r4 | r10
        L_0x006d:
            r10 = 196608(0x30000, float:2.75506E-40)
            r10 = r10 & r9
            if (r10 != 0) goto L_0x0082
            r10 = r25
            boolean r16 = r1.l(r10)
            if (r16 == 0) goto L_0x007d
            r16 = 131072(0x20000, float:1.83671E-40)
            goto L_0x007f
        L_0x007d:
            r16 = 65536(0x10000, float:9.18355E-41)
        L_0x007f:
            r4 = r4 | r16
            goto L_0x0084
        L_0x0082:
            r10 = r25
        L_0x0084:
            r16 = 1572864(0x180000, float:2.204052E-39)
            r16 = r9 & r16
            r3 = r26
            if (r16 != 0) goto L_0x0099
            boolean r17 = r1.W(r3)
            if (r17 == 0) goto L_0x0095
            r17 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x0097
        L_0x0095:
            r17 = 524288(0x80000, float:7.34684E-40)
        L_0x0097:
            r4 = r4 | r17
        L_0x0099:
            r17 = 12582912(0xc00000, float:1.7632415E-38)
            r17 = r9 & r17
            r6 = r27
            if (r17 != 0) goto L_0x00ae
            boolean r19 = r1.l(r6)
            if (r19 == 0) goto L_0x00aa
            r19 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00ac
        L_0x00aa:
            r19 = 4194304(0x400000, float:5.877472E-39)
        L_0x00ac:
            r4 = r4 | r19
        L_0x00ae:
            r19 = 4793491(0x492493, float:6.717112E-39)
            r13 = r4 & r19
            r11 = 4793490(0x492492, float:6.71711E-39)
            if (r13 == r11) goto L_0x00ba
            r11 = 1
            goto L_0x00bb
        L_0x00ba:
            r11 = 0
        L_0x00bb:
            r13 = r4 & 1
            boolean r11 = r1.E(r11, r13)
            if (r11 == 0) goto L_0x0174
            boolean r11 = androidx.compose.runtime.ComposerKt.P()
            if (r11 == 0) goto L_0x00cf
            r11 = -1
            java.lang.String r13 = "androidx.compose.material.ScaffoldLayout (Scaffold.kt:378)"
            androidx.compose.runtime.ComposerKt.Y(r0, r4, r11, r13)
        L_0x00cf:
            java.lang.Object r0 = r1.g()
            androidx.compose.runtime.Composer$Companion r11 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r13 = r11.a()
            if (r0 != r13) goto L_0x00e3
            androidx.compose.material.ScaffoldKt$ScaffoldLayout$contentPadding$1$1 r0 = new androidx.compose.material.ScaffoldKt$ScaffoldLayout$contentPadding$1$1
            r0.<init>()
            r1.N(r0)
        L_0x00e3:
            androidx.compose.material.ScaffoldKt$ScaffoldLayout$contentPadding$1$1 r0 = (androidx.compose.material.ScaffoldKt$ScaffoldLayout$contentPadding$1$1) r0
            r13 = r4 & 896(0x380, float:1.256E-42)
            r12 = 256(0x100, float:3.59E-43)
            if (r13 != r12) goto L_0x00ed
            r12 = 1
            goto L_0x00ee
        L_0x00ed:
            r12 = 0
        L_0x00ee:
            r13 = 57344(0xe000, float:8.0356E-41)
            r13 = r13 & r4
            r8 = 16384(0x4000, float:2.2959E-41)
            if (r13 != r8) goto L_0x00f8
            r8 = 1
            goto L_0x00f9
        L_0x00f8:
            r8 = 0
        L_0x00f9:
            r8 = r8 | r12
            r12 = 3670016(0x380000, float:5.142788E-39)
            r12 = r12 & r4
            r13 = 1048576(0x100000, float:1.469368E-39)
            if (r12 != r13) goto L_0x0103
            r12 = 1
            goto L_0x0104
        L_0x0103:
            r12 = 0
        L_0x0104:
            r8 = r8 | r12
            r12 = 458752(0x70000, float:6.42848E-40)
            r12 = r12 & r4
            r13 = 131072(0x20000, float:1.83671E-40)
            if (r12 != r13) goto L_0x010e
            r12 = 1
            goto L_0x010f
        L_0x010e:
            r12 = 0
        L_0x010f:
            r8 = r8 | r12
            r12 = r4 & 112(0x70, float:1.57E-43)
            r13 = 32
            if (r12 != r13) goto L_0x0118
            r12 = 1
            goto L_0x0119
        L_0x0118:
            r12 = 0
        L_0x0119:
            r8 = r8 | r12
            r12 = r4 & 14
            r13 = 4
            if (r12 != r13) goto L_0x0121
            r12 = 1
            goto L_0x0122
        L_0x0121:
            r12 = 0
        L_0x0122:
            r8 = r8 | r12
            r12 = 29360128(0x1c00000, float:7.052966E-38)
            r12 = r12 & r4
            r13 = 8388608(0x800000, float:1.17549435E-38)
            if (r12 != r13) goto L_0x012c
            r12 = 1
            goto L_0x012d
        L_0x012c:
            r12 = 0
        L_0x012d:
            r8 = r8 | r12
            r4 = r4 & 7168(0x1c00, float:1.0045E-41)
            r12 = 2048(0x800, float:2.87E-42)
            if (r4 != r12) goto L_0x0136
            r4 = 1
            goto L_0x0137
        L_0x0136:
            r4 = 0
        L_0x0137:
            r4 = r4 | r8
            java.lang.Object r8 = r1.g()
            if (r4 != 0) goto L_0x0147
            java.lang.Object r4 = r11.a()
            if (r8 != r4) goto L_0x0145
            goto L_0x0147
        L_0x0145:
            r4 = 0
            goto L_0x0163
        L_0x0147:
            androidx.compose.material.ScaffoldKt$ScaffoldLayout$1$1 r8 = new androidx.compose.material.ScaffoldKt$ScaffoldLayout$1$1
            r10 = r8
            r11 = r22
            r4 = 0
            r12 = r24
            r13 = r25
            r14 = r21
            r15 = r20
            r16 = r26
            r17 = r0
            r18 = r27
            r19 = r23
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19)
            r1.N(r8)
        L_0x0163:
            kotlin.jvm.functions.Function2 r8 = (kotlin.jvm.functions.Function2) r8
            r0 = 0
            r10 = 1
            androidx.compose.ui.layout.SubcomposeLayoutKt.a(r0, r8, r1, r4, r10)
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x0177
            androidx.compose.runtime.ComposerKt.X()
            goto L_0x0177
        L_0x0174:
            r1.B()
        L_0x0177:
            androidx.compose.runtime.ScopeUpdateScope r10 = r1.x()
            if (r10 == 0) goto L_0x0198
            androidx.compose.material.ScaffoldKt$ScaffoldLayout$2 r11 = new androidx.compose.material.ScaffoldKt$ScaffoldLayout$2
            r0 = r11
            r1 = r20
            r2 = r21
            r3 = r22
            r4 = r23
            r5 = r24
            r6 = r25
            r7 = r26
            r8 = r27
            r9 = r29
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r10.a(r11)
        L_0x0198:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.ScaffoldKt.c(boolean, int, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function3, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, androidx.compose.foundation.layout.WindowInsets, kotlin.jvm.functions.Function2, androidx.compose.runtime.Composer, int):void");
    }

    public static final ProvidableCompositionLocal f() {
        return f8255a;
    }

    public static final ScaffoldState g(DrawerState drawerState, SnackbarHostState snackbarHostState, Composer composer, int i2, int i3) {
        if ((i3 & 1) != 0) {
            drawerState = DrawerKt.r(DrawerValue.Closed, (Function1) null, composer, 6, 2);
        }
        if ((i3 & 2) != 0) {
            Object g2 = composer.g();
            if (g2 == Composer.f14567a.a()) {
                g2 = new SnackbarHostState();
                composer.N(g2);
            }
            snackbarHostState = (SnackbarHostState) g2;
        }
        if (ComposerKt.P()) {
            ComposerKt.Y(1569641925, i2, -1, "androidx.compose.material.rememberScaffoldState (Scaffold.kt:73)");
        }
        Object g3 = composer.g();
        if (g3 == Composer.f14567a.a()) {
            g3 = new ScaffoldState(drawerState, snackbarHostState);
            composer.N(g3);
        }
        ScaffoldState scaffoldState = (ScaffoldState) g3;
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
        return scaffoldState;
    }
}
