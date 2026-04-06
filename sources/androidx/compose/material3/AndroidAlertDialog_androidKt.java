package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.window.DialogProperties;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

@Metadata
public final class AndroidAlertDialog_androidKt {
    /* JADX WARNING: Removed duplicated region for block: B:105:0x012d  */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x0133  */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x0147  */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x014e  */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x0162  */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x0168  */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x016d  */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x0184  */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x0189  */
    /* JADX WARNING: Removed duplicated region for block: B:151:0x01aa  */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x01ac  */
    /* JADX WARNING: Removed duplicated region for block: B:155:0x01b5  */
    /* JADX WARNING: Removed duplicated region for block: B:221:0x02f8  */
    /* JADX WARNING: Removed duplicated region for block: B:224:0x0315  */
    /* JADX WARNING: Removed duplicated region for block: B:226:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00a6  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00ab  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00c4  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00c9  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x00e2  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x00f8  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0100  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x0113  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x011a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void b(kotlin.jvm.functions.Function0 r47, kotlin.jvm.functions.Function2 r48, androidx.compose.ui.Modifier r49, kotlin.jvm.functions.Function2 r50, kotlin.jvm.functions.Function2 r51, kotlin.jvm.functions.Function2 r52, kotlin.jvm.functions.Function2 r53, androidx.compose.ui.graphics.Shape r54, long r55, long r57, long r59, long r61, float r63, androidx.compose.ui.window.DialogProperties r64, androidx.compose.runtime.Composer r65, int r66, int r67, int r68) {
        /*
            r15 = r66
            r13 = r67
            r14 = r68
            r0 = 94478519(0x5a1a0b7, float:1.5199405E-35)
            r1 = r65
            androidx.compose.runtime.Composer r1 = r1.q(r0)
            r2 = r14 & 1
            if (r2 == 0) goto L_0x0019
            r2 = r15 | 6
            r5 = r2
            r2 = r47
            goto L_0x002d
        L_0x0019:
            r2 = r15 & 6
            if (r2 != 0) goto L_0x002a
            r2 = r47
            boolean r5 = r1.l(r2)
            if (r5 == 0) goto L_0x0027
            r5 = 4
            goto L_0x0028
        L_0x0027:
            r5 = 2
        L_0x0028:
            r5 = r5 | r15
            goto L_0x002d
        L_0x002a:
            r2 = r47
            r5 = r15
        L_0x002d:
            r6 = r14 & 2
            if (r6 == 0) goto L_0x0036
            r5 = r5 | 48
        L_0x0033:
            r6 = r48
            goto L_0x0048
        L_0x0036:
            r6 = r15 & 48
            if (r6 != 0) goto L_0x0033
            r6 = r48
            boolean r9 = r1.l(r6)
            if (r9 == 0) goto L_0x0045
            r9 = 32
            goto L_0x0047
        L_0x0045:
            r9 = 16
        L_0x0047:
            r5 = r5 | r9
        L_0x0048:
            r9 = r14 & 4
            if (r9 == 0) goto L_0x0051
            r5 = r5 | 384(0x180, float:5.38E-43)
        L_0x004e:
            r12 = r49
            goto L_0x0064
        L_0x0051:
            r12 = r15 & 384(0x180, float:5.38E-43)
            if (r12 != 0) goto L_0x004e
            r12 = r49
            boolean r16 = r1.W(r12)
            if (r16 == 0) goto L_0x0060
            r16 = 256(0x100, float:3.59E-43)
            goto L_0x0062
        L_0x0060:
            r16 = 128(0x80, float:1.794E-43)
        L_0x0062:
            r5 = r5 | r16
        L_0x0064:
            r16 = r14 & 8
            r17 = 1024(0x400, float:1.435E-42)
            r18 = 2048(0x800, float:2.87E-42)
            if (r16 == 0) goto L_0x0071
            r5 = r5 | 3072(0xc00, float:4.305E-42)
        L_0x006e:
            r3 = r50
            goto L_0x0084
        L_0x0071:
            r3 = r15 & 3072(0xc00, float:4.305E-42)
            if (r3 != 0) goto L_0x006e
            r3 = r50
            boolean r19 = r1.l(r3)
            if (r19 == 0) goto L_0x0080
            r19 = r18
            goto L_0x0082
        L_0x0080:
            r19 = r17
        L_0x0082:
            r5 = r5 | r19
        L_0x0084:
            r19 = r14 & 16
            if (r19 == 0) goto L_0x008d
            r5 = r5 | 24576(0x6000, float:3.4438E-41)
        L_0x008a:
            r4 = r51
            goto L_0x00a0
        L_0x008d:
            r4 = r15 & 24576(0x6000, float:3.4438E-41)
            if (r4 != 0) goto L_0x008a
            r4 = r51
            boolean r21 = r1.l(r4)
            if (r21 == 0) goto L_0x009c
            r21 = 16384(0x4000, float:2.2959E-41)
            goto L_0x009e
        L_0x009c:
            r21 = 8192(0x2000, float:1.14794E-41)
        L_0x009e:
            r5 = r5 | r21
        L_0x00a0:
            r21 = r14 & 32
            r22 = 196608(0x30000, float:2.75506E-40)
            if (r21 == 0) goto L_0x00ab
            r5 = r5 | r22
            r7 = r52
            goto L_0x00be
        L_0x00ab:
            r22 = r15 & r22
            r7 = r52
            if (r22 != 0) goto L_0x00be
            boolean r23 = r1.l(r7)
            if (r23 == 0) goto L_0x00ba
            r23 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00bc
        L_0x00ba:
            r23 = 65536(0x10000, float:9.18355E-41)
        L_0x00bc:
            r5 = r5 | r23
        L_0x00be:
            r23 = r14 & 64
            r24 = 1572864(0x180000, float:2.204052E-39)
            if (r23 == 0) goto L_0x00c9
            r5 = r5 | r24
            r8 = r53
            goto L_0x00dc
        L_0x00c9:
            r24 = r15 & r24
            r8 = r53
            if (r24 != 0) goto L_0x00dc
            boolean r25 = r1.l(r8)
            if (r25 == 0) goto L_0x00d8
            r25 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00da
        L_0x00d8:
            r25 = 524288(0x80000, float:7.34684E-40)
        L_0x00da:
            r5 = r5 | r25
        L_0x00dc:
            r25 = 12582912(0xc00000, float:1.7632415E-38)
            r25 = r15 & r25
            if (r25 != 0) goto L_0x00f8
            r10 = r14 & 128(0x80, float:1.794E-43)
            if (r10 != 0) goto L_0x00f1
            r10 = r54
            boolean r26 = r1.W(r10)
            if (r26 == 0) goto L_0x00f3
            r26 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00f5
        L_0x00f1:
            r10 = r54
        L_0x00f3:
            r26 = 4194304(0x400000, float:5.877472E-39)
        L_0x00f5:
            r5 = r5 | r26
            goto L_0x00fa
        L_0x00f8:
            r10 = r54
        L_0x00fa:
            r26 = 100663296(0x6000000, float:2.4074124E-35)
            r26 = r15 & r26
            if (r26 != 0) goto L_0x0113
            r11 = r14 & 256(0x100, float:3.59E-43)
            r2 = r55
            if (r11 != 0) goto L_0x010f
            boolean r11 = r1.j(r2)
            if (r11 == 0) goto L_0x010f
            r11 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x0111
        L_0x010f:
            r11 = 33554432(0x2000000, float:9.403955E-38)
        L_0x0111:
            r5 = r5 | r11
            goto L_0x0115
        L_0x0113:
            r2 = r55
        L_0x0115:
            r11 = 805306368(0x30000000, float:4.656613E-10)
            r11 = r11 & r15
            if (r11 != 0) goto L_0x012d
            r11 = r14 & 512(0x200, float:7.175E-43)
            r2 = r57
            if (r11 != 0) goto L_0x0129
            boolean r11 = r1.j(r2)
            if (r11 == 0) goto L_0x0129
            r11 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x012b
        L_0x0129:
            r11 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x012b:
            r5 = r5 | r11
            goto L_0x012f
        L_0x012d:
            r2 = r57
        L_0x012f:
            r11 = r13 & 6
            if (r11 != 0) goto L_0x0147
            r11 = r14 & 1024(0x400, float:1.435E-42)
            r2 = r59
            if (r11 != 0) goto L_0x0142
            boolean r11 = r1.j(r2)
            if (r11 == 0) goto L_0x0142
            r20 = 4
            goto L_0x0144
        L_0x0142:
            r20 = 2
        L_0x0144:
            r11 = r13 | r20
            goto L_0x014a
        L_0x0147:
            r2 = r59
            r11 = r13
        L_0x014a:
            r20 = r13 & 48
            if (r20 != 0) goto L_0x0162
            r0 = r14 & 2048(0x800, float:2.87E-42)
            r2 = r61
            if (r0 != 0) goto L_0x015d
            boolean r0 = r1.j(r2)
            if (r0 == 0) goto L_0x015d
            r22 = 32
            goto L_0x015f
        L_0x015d:
            r22 = 16
        L_0x015f:
            r11 = r11 | r22
            goto L_0x0164
        L_0x0162:
            r2 = r61
        L_0x0164:
            r0 = r14 & 4096(0x1000, float:5.74E-42)
            if (r0 == 0) goto L_0x016d
            r11 = r11 | 384(0x180, float:5.38E-43)
        L_0x016a:
            r2 = r63
            goto L_0x0180
        L_0x016d:
            r2 = r13 & 384(0x180, float:5.38E-43)
            if (r2 != 0) goto L_0x016a
            r2 = r63
            boolean r3 = r1.h(r2)
            if (r3 == 0) goto L_0x017c
            r26 = 256(0x100, float:3.59E-43)
            goto L_0x017e
        L_0x017c:
            r26 = 128(0x80, float:1.794E-43)
        L_0x017e:
            r11 = r11 | r26
        L_0x0180:
            r3 = r14 & 8192(0x2000, float:1.14794E-41)
            if (r3 == 0) goto L_0x0189
            r11 = r11 | 3072(0xc00, float:4.305E-42)
        L_0x0186:
            r2 = r64
            goto L_0x0199
        L_0x0189:
            r2 = r13 & 3072(0xc00, float:4.305E-42)
            if (r2 != 0) goto L_0x0186
            r2 = r64
            boolean r22 = r1.W(r2)
            if (r22 == 0) goto L_0x0197
            r17 = r18
        L_0x0197:
            r11 = r11 | r17
        L_0x0199:
            r17 = 306783379(0x12492493, float:6.34695E-28)
            r2 = r5 & r17
            r4 = 306783378(0x12492492, float:6.3469493E-28)
            if (r2 != r4) goto L_0x01ac
            r2 = r11 & 1171(0x493, float:1.641E-42)
            r4 = 1170(0x492, float:1.64E-42)
            if (r2 == r4) goto L_0x01aa
            goto L_0x01ac
        L_0x01aa:
            r2 = 0
            goto L_0x01ad
        L_0x01ac:
            r2 = 1
        L_0x01ad:
            r4 = r5 & 1
            boolean r2 = r1.E(r2, r4)
            if (r2 == 0) goto L_0x02f8
            r1.p()
            r2 = r15 & 1
            r4 = -234881025(0xfffffffff1ffffff, float:-2.535301E30)
            r17 = -29360129(0xfffffffffe3fffff, float:-6.380294E37)
            if (r2 == 0) goto L_0x0200
            boolean r2 = r1.J()
            if (r2 == 0) goto L_0x01c9
            goto L_0x0200
        L_0x01c9:
            r1.B()
            r0 = r14 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x01d2
            r5 = r5 & r17
        L_0x01d2:
            r0 = r14 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L_0x01d7
            r5 = r5 & r4
        L_0x01d7:
            r0 = r14 & 512(0x200, float:7.175E-43)
            if (r0 == 0) goto L_0x01df
            r0 = -1879048193(0xffffffff8fffffff, float:-2.5243547E-29)
            r5 = r5 & r0
        L_0x01df:
            r0 = r14 & 1024(0x400, float:1.435E-42)
            if (r0 == 0) goto L_0x01e5
            r11 = r11 & -15
        L_0x01e5:
            r0 = r14 & 2048(0x800, float:2.87E-42)
            if (r0 == 0) goto L_0x01eb
            r11 = r11 & -113(0xffffffffffffff8f, float:NaN)
        L_0x01eb:
            r9 = r50
            r0 = r51
            r3 = r55
            r37 = r57
            r39 = r59
            r41 = r61
            r2 = r8
            r6 = r11
            r8 = r64
            r11 = r5
            r5 = r63
            goto L_0x02a1
        L_0x0200:
            if (r9 == 0) goto L_0x0205
            androidx.compose.ui.Modifier$Companion r2 = androidx.compose.ui.Modifier.f15489d
            r12 = r2
        L_0x0205:
            r2 = 0
            if (r16 == 0) goto L_0x020a
            r9 = r2
            goto L_0x020c
        L_0x020a:
            r9 = r50
        L_0x020c:
            if (r19 == 0) goto L_0x0211
            r16 = r2
            goto L_0x0213
        L_0x0211:
            r16 = r51
        L_0x0213:
            if (r21 == 0) goto L_0x0216
            r7 = r2
        L_0x0216:
            if (r23 == 0) goto L_0x0219
            goto L_0x021a
        L_0x0219:
            r2 = r8
        L_0x021a:
            r8 = r14 & 128(0x80, float:1.794E-43)
            r4 = 6
            if (r8 == 0) goto L_0x0228
            androidx.compose.material3.AlertDialogDefaults r8 = androidx.compose.material3.AlertDialogDefaults.f9123a
            androidx.compose.ui.graphics.Shape r8 = r8.c(r1, r4)
            r5 = r5 & r17
            r10 = r8
        L_0x0228:
            r8 = r14 & 256(0x100, float:3.59E-43)
            if (r8 == 0) goto L_0x0237
            androidx.compose.material3.AlertDialogDefaults r8 = androidx.compose.material3.AlertDialogDefaults.f9123a
            long r17 = r8.a(r1, r4)
            r8 = -234881025(0xfffffffff1ffffff, float:-2.535301E30)
            r5 = r5 & r8
            goto L_0x0239
        L_0x0237:
            r17 = r55
        L_0x0239:
            r8 = r14 & 512(0x200, float:7.175E-43)
            if (r8 == 0) goto L_0x0248
            androidx.compose.material3.AlertDialogDefaults r8 = androidx.compose.material3.AlertDialogDefaults.f9123a
            long r21 = r8.b(r1, r4)
            r8 = -1879048193(0xffffffff8fffffff, float:-2.5243547E-29)
            r5 = r5 & r8
            goto L_0x024a
        L_0x0248:
            r21 = r57
        L_0x024a:
            r8 = r14 & 1024(0x400, float:1.435E-42)
            if (r8 == 0) goto L_0x0257
            androidx.compose.material3.AlertDialogDefaults r8 = androidx.compose.material3.AlertDialogDefaults.f9123a
            long r23 = r8.e(r1, r4)
            r11 = r11 & -15
            goto L_0x0259
        L_0x0257:
            r23 = r59
        L_0x0259:
            r8 = r14 & 2048(0x800, float:2.87E-42)
            if (r8 == 0) goto L_0x0267
            androidx.compose.material3.AlertDialogDefaults r8 = androidx.compose.material3.AlertDialogDefaults.f9123a
            long r25 = r8.d(r1, r4)
            r4 = r11 & -113(0xffffffffffffff8f, float:NaN)
            r11 = r4
            goto L_0x0269
        L_0x0267:
            r25 = r61
        L_0x0269:
            if (r0 == 0) goto L_0x0272
            androidx.compose.material3.AlertDialogDefaults r0 = androidx.compose.material3.AlertDialogDefaults.f9123a
            float r0 = r0.f()
            goto L_0x0274
        L_0x0272:
            r0 = r63
        L_0x0274:
            if (r3 == 0) goto L_0x029e
            androidx.compose.ui.window.DialogProperties r3 = new androidx.compose.ui.window.DialogProperties
            r4 = 7
            r8 = 0
            r19 = 0
            r27 = 0
            r28 = 0
            r49 = r3
            r50 = r19
            r51 = r27
            r52 = r28
            r53 = r4
            r54 = r8
            r49.<init>((boolean) r50, (boolean) r51, (boolean) r52, (int) r53, (kotlin.jvm.internal.DefaultConstructorMarker) r54)
            r8 = r3
        L_0x0290:
            r6 = r11
            r3 = r17
            r37 = r21
            r39 = r23
            r41 = r25
            r11 = r5
            r5 = r0
            r0 = r16
            goto L_0x02a1
        L_0x029e:
            r8 = r64
            goto L_0x0290
        L_0x02a1:
            r1.U()
            boolean r16 = androidx.compose.runtime.ComposerKt.P()
            if (r16 == 0) goto L_0x02b2
            java.lang.String r13 = "androidx.compose.material3.AlertDialog (AndroidAlertDialog.android.kt:46)"
            r14 = 94478519(0x5a1a0b7, float:1.5199405E-35)
            androidx.compose.runtime.ComposerKt.Y(r14, r11, r6, r13)
        L_0x02b2:
            r13 = 2147483646(0x7ffffffe, float:NaN)
            r35 = r11 & r13
            r6 = r6 & 8190(0x1ffe, float:1.1477E-41)
            r36 = r6
            r16 = r47
            r17 = r48
            r18 = r12
            r19 = r9
            r20 = r0
            r21 = r7
            r22 = r2
            r23 = r10
            r24 = r3
            r26 = r37
            r28 = r39
            r30 = r41
            r32 = r5
            r33 = r8
            r34 = r1
            androidx.compose.material3.AlertDialogKt.j(r16, r17, r18, r19, r20, r21, r22, r23, r24, r26, r28, r30, r32, r33, r34, r35, r36)
            boolean r6 = androidx.compose.runtime.ComposerKt.P()
            if (r6 == 0) goto L_0x02e5
            androidx.compose.runtime.ComposerKt.X()
        L_0x02e5:
            r17 = r5
            r6 = r7
            r18 = r8
            r8 = r10
            r13 = r39
            r5 = r0
            r7 = r2
            r45 = r3
            r4 = r9
            r9 = r45
            r3 = r12
            r11 = r37
            goto L_0x030f
        L_0x02f8:
            r1.B()
            r4 = r50
            r5 = r51
            r13 = r59
            r41 = r61
            r17 = r63
            r18 = r64
            r6 = r7
            r7 = r8
            r8 = r10
            r3 = r12
            r9 = r55
            r11 = r57
        L_0x030f:
            androidx.compose.runtime.ScopeUpdateScope r2 = r1.x()
            if (r2 == 0) goto L_0x0332
            androidx.compose.material3.g r1 = new androidx.compose.material3.g
            r0 = r1
            r43 = r1
            r1 = r47
            r44 = r2
            r2 = r48
            r15 = r41
            r19 = r66
            r20 = r67
            r21 = r68
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r11, r13, r15, r17, r18, r19, r20, r21)
            r1 = r43
            r0 = r44
            r0.a(r1)
        L_0x0332:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.AndroidAlertDialog_androidKt.b(kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function2, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, androidx.compose.ui.graphics.Shape, long, long, long, long, float, androidx.compose.ui.window.DialogProperties, androidx.compose.runtime.Composer, int, int, int):void");
    }

    public static final Unit c(Function0 function0, Function2 function2, Modifier modifier, Function2 function22, Function2 function23, Function2 function24, Function2 function25, Shape shape, long j2, long j3, long j4, long j5, float f2, DialogProperties dialogProperties, int i2, int i3, int i4, Composer composer, int i5) {
        b(function0, function2, modifier, function22, function23, function24, function25, shape, j2, j3, j4, j5, f2, dialogProperties, composer, RecomposeScopeImplKt.a(i2 | 1), RecomposeScopeImplKt.a(i3), i4);
        return Unit.f40552a;
    }
}
