package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;

@Metadata
public final class LazyGridDslKt {
    /* JADX WARNING: Removed duplicated region for block: B:106:0x0124  */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x012a  */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x012d  */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x015a  */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x015c  */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x0166  */
    /* JADX WARNING: Removed duplicated region for block: B:184:0x029f  */
    /* JADX WARNING: Removed duplicated region for block: B:187:0x02b6  */
    /* JADX WARNING: Removed duplicated region for block: B:189:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0098  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00ac  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00b4  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00b9  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x00d2  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x00e8  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x00f0  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x00f5  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x010e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void a(androidx.compose.foundation.lazy.grid.GridCells r33, androidx.compose.ui.Modifier r34, androidx.compose.foundation.lazy.grid.LazyGridState r35, androidx.compose.foundation.layout.PaddingValues r36, boolean r37, androidx.compose.foundation.layout.Arrangement.Horizontal r38, androidx.compose.foundation.layout.Arrangement.Vertical r39, androidx.compose.foundation.gestures.FlingBehavior r40, boolean r41, androidx.compose.foundation.OverscrollEffect r42, kotlin.jvm.functions.Function1 r43, androidx.compose.runtime.Composer r44, int r45, int r46, int r47) {
        /*
            r1 = r33
            r12 = r45
            r14 = r47
            r0 = 635941664(0x25e7b320, float:4.0193492E-16)
            r2 = r44
            androidx.compose.runtime.Composer r2 = r2.q(r0)
            r3 = r14 & 1
            if (r3 == 0) goto L_0x0016
            r3 = r12 | 6
            goto L_0x0026
        L_0x0016:
            r3 = r12 & 6
            if (r3 != 0) goto L_0x0025
            boolean r3 = r2.W(r1)
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
            r6 = r14 & 2
            if (r6 == 0) goto L_0x002f
            r3 = r3 | 48
        L_0x002c:
            r7 = r34
            goto L_0x0041
        L_0x002f:
            r7 = r12 & 48
            if (r7 != 0) goto L_0x002c
            r7 = r34
            boolean r8 = r2.W(r7)
            if (r8 == 0) goto L_0x003e
            r8 = 32
            goto L_0x0040
        L_0x003e:
            r8 = 16
        L_0x0040:
            r3 = r3 | r8
        L_0x0041:
            r8 = r12 & 384(0x180, float:5.38E-43)
            if (r8 != 0) goto L_0x005a
            r8 = r14 & 4
            if (r8 != 0) goto L_0x0054
            r8 = r35
            boolean r9 = r2.W(r8)
            if (r9 == 0) goto L_0x0056
            r9 = 256(0x100, float:3.59E-43)
            goto L_0x0058
        L_0x0054:
            r8 = r35
        L_0x0056:
            r9 = 128(0x80, float:1.794E-43)
        L_0x0058:
            r3 = r3 | r9
            goto L_0x005c
        L_0x005a:
            r8 = r35
        L_0x005c:
            r9 = r14 & 8
            if (r9 == 0) goto L_0x0065
            r3 = r3 | 3072(0xc00, float:4.305E-42)
        L_0x0062:
            r10 = r36
            goto L_0x0077
        L_0x0065:
            r10 = r12 & 3072(0xc00, float:4.305E-42)
            if (r10 != 0) goto L_0x0062
            r10 = r36
            boolean r11 = r2.W(r10)
            if (r11 == 0) goto L_0x0074
            r11 = 2048(0x800, float:2.87E-42)
            goto L_0x0076
        L_0x0074:
            r11 = 1024(0x400, float:1.435E-42)
        L_0x0076:
            r3 = r3 | r11
        L_0x0077:
            r11 = r14 & 16
            if (r11 == 0) goto L_0x0080
            r3 = r3 | 24576(0x6000, float:3.4438E-41)
        L_0x007d:
            r13 = r37
            goto L_0x0092
        L_0x0080:
            r13 = r12 & 24576(0x6000, float:3.4438E-41)
            if (r13 != 0) goto L_0x007d
            r13 = r37
            boolean r15 = r2.d(r13)
            if (r15 == 0) goto L_0x008f
            r15 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0091
        L_0x008f:
            r15 = 8192(0x2000, float:1.14794E-41)
        L_0x0091:
            r3 = r3 | r15
        L_0x0092:
            r15 = 196608(0x30000, float:2.75506E-40)
            r16 = r12 & r15
            if (r16 != 0) goto L_0x00ac
            r16 = r14 & 32
            r5 = r38
            if (r16 != 0) goto L_0x00a7
            boolean r16 = r2.W(r5)
            if (r16 == 0) goto L_0x00a7
            r16 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00a9
        L_0x00a7:
            r16 = 65536(0x10000, float:9.18355E-41)
        L_0x00a9:
            r3 = r3 | r16
            goto L_0x00ae
        L_0x00ac:
            r5 = r38
        L_0x00ae:
            r16 = r14 & 64
            r17 = 1572864(0x180000, float:2.204052E-39)
            if (r16 == 0) goto L_0x00b9
            r3 = r3 | r17
            r15 = r39
            goto L_0x00cc
        L_0x00b9:
            r17 = r12 & r17
            r15 = r39
            if (r17 != 0) goto L_0x00cc
            boolean r18 = r2.W(r15)
            if (r18 == 0) goto L_0x00c8
            r18 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00ca
        L_0x00c8:
            r18 = 524288(0x80000, float:7.34684E-40)
        L_0x00ca:
            r3 = r3 | r18
        L_0x00cc:
            r18 = 12582912(0xc00000, float:1.7632415E-38)
            r18 = r12 & r18
            if (r18 != 0) goto L_0x00e8
            r0 = r14 & 128(0x80, float:1.794E-43)
            if (r0 != 0) goto L_0x00e1
            r0 = r40
            boolean r19 = r2.W(r0)
            if (r19 == 0) goto L_0x00e3
            r19 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00e5
        L_0x00e1:
            r0 = r40
        L_0x00e3:
            r19 = 4194304(0x400000, float:5.877472E-39)
        L_0x00e5:
            r3 = r3 | r19
            goto L_0x00ea
        L_0x00e8:
            r0 = r40
        L_0x00ea:
            r4 = r14 & 256(0x100, float:3.59E-43)
            r20 = 100663296(0x6000000, float:2.4074124E-35)
            if (r4 == 0) goto L_0x00f5
            r3 = r3 | r20
            r0 = r41
            goto L_0x0108
        L_0x00f5:
            r20 = r12 & r20
            r0 = r41
            if (r20 != 0) goto L_0x0108
            boolean r20 = r2.d(r0)
            if (r20 == 0) goto L_0x0104
            r20 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x0106
        L_0x0104:
            r20 = 33554432(0x2000000, float:9.403955E-38)
        L_0x0106:
            r3 = r3 | r20
        L_0x0108:
            r20 = 805306368(0x30000000, float:4.656613E-10)
            r20 = r12 & r20
            if (r20 != 0) goto L_0x0124
            r0 = r14 & 512(0x200, float:7.175E-43)
            if (r0 != 0) goto L_0x011d
            r0 = r42
            boolean r20 = r2.W(r0)
            if (r20 == 0) goto L_0x011f
            r20 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x0121
        L_0x011d:
            r0 = r42
        L_0x011f:
            r20 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x0121:
            r3 = r3 | r20
            goto L_0x0126
        L_0x0124:
            r0 = r42
        L_0x0126:
            r0 = r14 & 1024(0x400, float:1.435E-42)
            if (r0 == 0) goto L_0x012d
            r0 = r46 | 6
            goto L_0x0147
        L_0x012d:
            r0 = r46 & 6
            if (r0 != 0) goto L_0x0143
            r0 = r43
            boolean r20 = r2.l(r0)
            if (r20 == 0) goto L_0x013c
            r20 = 4
            goto L_0x013e
        L_0x013c:
            r20 = 2
        L_0x013e:
            r20 = r46 | r20
            r0 = r20
            goto L_0x0147
        L_0x0143:
            r0 = r43
            r0 = r46
        L_0x0147:
            r20 = 306783379(0x12492493, float:6.34695E-28)
            r5 = r3 & r20
            r7 = 306783378(0x12492492, float:6.3469493E-28)
            r8 = 0
            r20 = 1
            if (r5 != r7) goto L_0x015c
            r5 = r0 & 3
            r7 = 2
            if (r5 == r7) goto L_0x015a
            goto L_0x015c
        L_0x015a:
            r5 = r8
            goto L_0x015e
        L_0x015c:
            r5 = r20
        L_0x015e:
            r7 = r3 & 1
            boolean r5 = r2.E(r5, r7)
            if (r5 == 0) goto L_0x029f
            r2.p()
            r5 = r12 & 1
            r7 = 3
            if (r5 == 0) goto L_0x01a7
            boolean r5 = r2.J()
            if (r5 == 0) goto L_0x0175
            goto L_0x01a7
        L_0x0175:
            r2.B()
            r4 = r14 & 4
            if (r4 == 0) goto L_0x017e
            r3 = r3 & -897(0xfffffffffffffc7f, float:NaN)
        L_0x017e:
            r4 = r14 & 32
            if (r4 == 0) goto L_0x0186
            r4 = -458753(0xfffffffffff8ffff, float:NaN)
            r3 = r3 & r4
        L_0x0186:
            r4 = r14 & 128(0x80, float:1.794E-43)
            if (r4 == 0) goto L_0x018e
            r4 = -29360129(0xfffffffffe3fffff, float:-6.380294E37)
            r3 = r3 & r4
        L_0x018e:
            r4 = r14 & 512(0x200, float:7.175E-43)
            if (r4 == 0) goto L_0x0196
            r4 = -1879048193(0xffffffff8fffffff, float:-2.5243547E-29)
            r3 = r3 & r4
        L_0x0196:
            r5 = r34
            r6 = r35
            r7 = r40
            r4 = r42
            r8 = r3
            r9 = r10
            r11 = r15
            r10 = r38
            r3 = r41
            goto L_0x0217
        L_0x01a7:
            if (r6 == 0) goto L_0x01ac
            androidx.compose.ui.Modifier$Companion r5 = androidx.compose.ui.Modifier.f15489d
            goto L_0x01ae
        L_0x01ac:
            r5 = r34
        L_0x01ae:
            r6 = r14 & 4
            if (r6 == 0) goto L_0x01b9
            androidx.compose.foundation.lazy.grid.LazyGridState r6 = androidx.compose.foundation.lazy.grid.LazyGridStateKt.b(r8, r8, r2, r8, r7)
            r3 = r3 & -897(0xfffffffffffffc7f, float:NaN)
            goto L_0x01bb
        L_0x01b9:
            r6 = r35
        L_0x01bb:
            if (r9 == 0) goto L_0x01c7
            float r9 = (float) r8
            float r9 = androidx.compose.ui.unit.Dp.m(r9)
            androidx.compose.foundation.layout.PaddingValues r9 = androidx.compose.foundation.layout.PaddingKt.a(r9)
            goto L_0x01c8
        L_0x01c7:
            r9 = r10
        L_0x01c8:
            if (r11 == 0) goto L_0x01cb
            r13 = r8
        L_0x01cb:
            r10 = r14 & 32
            if (r10 == 0) goto L_0x01e1
            androidx.compose.foundation.layout.Arrangement r10 = androidx.compose.foundation.layout.Arrangement.f3739a
            if (r13 != 0) goto L_0x01d8
            androidx.compose.foundation.layout.Arrangement$Horizontal r10 = r10.f()
            goto L_0x01dc
        L_0x01d8:
            androidx.compose.foundation.layout.Arrangement$Horizontal r10 = r10.c()
        L_0x01dc:
            r11 = -458753(0xfffffffffff8ffff, float:NaN)
            r3 = r3 & r11
            goto L_0x01e3
        L_0x01e1:
            r10 = r38
        L_0x01e3:
            if (r16 == 0) goto L_0x01ec
            androidx.compose.foundation.layout.Arrangement r11 = androidx.compose.foundation.layout.Arrangement.f3739a
            androidx.compose.foundation.layout.Arrangement$Vertical r11 = r11.g()
            goto L_0x01ed
        L_0x01ec:
            r11 = r15
        L_0x01ed:
            r15 = r14 & 128(0x80, float:1.794E-43)
            if (r15 == 0) goto L_0x01fd
            androidx.compose.foundation.gestures.ScrollableDefaults r15 = androidx.compose.foundation.gestures.ScrollableDefaults.f3558a
            r7 = 6
            androidx.compose.foundation.gestures.FlingBehavior r7 = r15.a(r2, r7)
            r15 = -29360129(0xfffffffffe3fffff, float:-6.380294E37)
            r3 = r3 & r15
            goto L_0x01ff
        L_0x01fd:
            r7 = r40
        L_0x01ff:
            if (r4 == 0) goto L_0x0202
            goto L_0x0204
        L_0x0202:
            r20 = r41
        L_0x0204:
            r4 = r14 & 512(0x200, float:7.175E-43)
            if (r4 == 0) goto L_0x0214
            androidx.compose.foundation.OverscrollEffect r4 = androidx.compose.foundation.OverscrollKt.b(r2, r8)
            r8 = -1879048193(0xffffffff8fffffff, float:-2.5243547E-29)
            r3 = r3 & r8
        L_0x0210:
            r8 = r3
            r3 = r20
            goto L_0x0217
        L_0x0214:
            r4 = r42
            goto L_0x0210
        L_0x0217:
            r2.U()
            boolean r15 = androidx.compose.runtime.ComposerKt.P()
            if (r15 == 0) goto L_0x0228
            java.lang.String r15 = "androidx.compose.foundation.lazy.grid.LazyHorizontalGrid (LazyGridDsl.kt:168)"
            r12 = 635941664(0x25e7b320, float:4.0193492E-16)
            androidx.compose.runtime.ComposerKt.Y(r12, r8, r0, r15)
        L_0x0228:
            r12 = r8 & 14
            int r15 = r8 >> 15
            r16 = r15 & 112(0x70, float:1.57E-43)
            r12 = r12 | r16
            androidx.compose.foundation.lazy.grid.LazyGridSlotsProvider r12 = h(r1, r11, r2, r12)
            int r16 = r8 >> 3
            r18 = r16 & 14
            r17 = 196608(0x30000, float:2.75506E-40)
            r17 = r18 | r17
            r18 = r16 & 112(0x70, float:1.57E-43)
            r17 = r17 | r18
            r1 = r8 & 7168(0x1c00, float:1.0045E-41)
            r1 = r17 | r1
            r17 = 57344(0xe000, float:8.0356E-41)
            r17 = r8 & r17
            r1 = r1 | r17
            r17 = 3670016(0x380000, float:5.142788E-39)
            r17 = r16 & r17
            r1 = r1 | r17
            r17 = 29360128(0x1c00000, float:7.052966E-38)
            r17 = r16 & r17
            r1 = r1 | r17
            r17 = 234881024(0xe000000, float:1.5777218E-30)
            r16 = r16 & r17
            r1 = r1 | r16
            int r8 = r8 << 9
            r16 = 1879048192(0x70000000, float:1.58456325E29)
            r8 = r8 & r16
            r28 = r1 | r8
            r1 = r15 & 14
            r8 = 3
            int r0 = r0 << r8
            r0 = r0 & 112(0x70, float:1.57E-43)
            r29 = r1 | r0
            r30 = 0
            r20 = 0
            r15 = r5
            r16 = r6
            r17 = r12
            r18 = r9
            r19 = r13
            r21 = r7
            r22 = r3
            r23 = r4
            r24 = r11
            r25 = r10
            r26 = r43
            r27 = r2
            androidx.compose.foundation.lazy.grid.LazyGridKt.a(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30)
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x0294
            androidx.compose.runtime.ComposerKt.X()
        L_0x0294:
            r8 = r7
            r7 = r11
            r32 = r9
            r9 = r3
            r3 = r6
            r6 = r10
            r10 = r4
            r4 = r32
            goto L_0x02b0
        L_0x029f:
            r2.B()
            r5 = r34
            r3 = r35
            r6 = r38
            r8 = r40
            r9 = r41
            r4 = r10
            r7 = r15
            r10 = r42
        L_0x02b0:
            androidx.compose.runtime.ScopeUpdateScope r15 = r2.x()
            if (r15 == 0) goto L_0x02d0
            androidx.compose.foundation.lazy.grid.LazyGridDslKt$LazyHorizontalGrid$1 r12 = new androidx.compose.foundation.lazy.grid.LazyGridDslKt$LazyHorizontalGrid$1
            r0 = r12
            r1 = r33
            r2 = r5
            r5 = r13
            r11 = r43
            r13 = r12
            r12 = r45
            r31 = r13
            r13 = r46
            r14 = r47
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            r0 = r31
            r15.a(r0)
        L_0x02d0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.grid.LazyGridDslKt.a(androidx.compose.foundation.lazy.grid.GridCells, androidx.compose.ui.Modifier, androidx.compose.foundation.lazy.grid.LazyGridState, androidx.compose.foundation.layout.PaddingValues, boolean, androidx.compose.foundation.layout.Arrangement$Horizontal, androidx.compose.foundation.layout.Arrangement$Vertical, androidx.compose.foundation.gestures.FlingBehavior, boolean, androidx.compose.foundation.OverscrollEffect, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:100:0x0111  */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x0116  */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x0136  */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x0139  */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x0142  */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x01dd  */
    /* JADX WARNING: Removed duplicated region for block: B:166:0x0212  */
    /* JADX WARNING: Removed duplicated region for block: B:168:0x0220  */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x0235  */
    /* JADX WARNING: Removed duplicated region for block: B:173:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x009c  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00b1  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00b9  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x00bd  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x00d5  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x00eb  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x00f3  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x00f8  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final /* synthetic */ void b(androidx.compose.foundation.lazy.grid.GridCells r29, androidx.compose.ui.Modifier r30, androidx.compose.foundation.lazy.grid.LazyGridState r31, androidx.compose.foundation.layout.PaddingValues r32, boolean r33, androidx.compose.foundation.layout.Arrangement.Horizontal r34, androidx.compose.foundation.layout.Arrangement.Vertical r35, androidx.compose.foundation.gestures.FlingBehavior r36, boolean r37, kotlin.jvm.functions.Function1 r38, androidx.compose.runtime.Composer r39, int r40, int r41) {
        /*
            r11 = r40
            r12 = r41
            r0 = 2123608858(0x7e93b31a, float:9.816323E37)
            r1 = r39
            androidx.compose.runtime.Composer r1 = r1.q(r0)
            r2 = r12 & 1
            if (r2 == 0) goto L_0x0017
            r2 = r11 | 6
            r3 = r2
            r2 = r29
            goto L_0x002b
        L_0x0017:
            r2 = r11 & 6
            if (r2 != 0) goto L_0x0028
            r2 = r29
            boolean r3 = r1.W(r2)
            if (r3 == 0) goto L_0x0025
            r3 = 4
            goto L_0x0026
        L_0x0025:
            r3 = 2
        L_0x0026:
            r3 = r3 | r11
            goto L_0x002b
        L_0x0028:
            r2 = r29
            r3 = r11
        L_0x002b:
            r4 = r12 & 2
            if (r4 == 0) goto L_0x0034
            r3 = r3 | 48
        L_0x0031:
            r5 = r30
            goto L_0x0046
        L_0x0034:
            r5 = r11 & 48
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
            r6 = r11 & 384(0x180, float:5.38E-43)
            if (r6 != 0) goto L_0x005f
            r6 = r12 & 4
            if (r6 != 0) goto L_0x0059
            r6 = r31
            boolean r7 = r1.W(r6)
            if (r7 == 0) goto L_0x005b
            r7 = 256(0x100, float:3.59E-43)
            goto L_0x005d
        L_0x0059:
            r6 = r31
        L_0x005b:
            r7 = 128(0x80, float:1.794E-43)
        L_0x005d:
            r3 = r3 | r7
            goto L_0x0061
        L_0x005f:
            r6 = r31
        L_0x0061:
            r7 = r12 & 8
            if (r7 == 0) goto L_0x006a
            r3 = r3 | 3072(0xc00, float:4.305E-42)
        L_0x0067:
            r8 = r32
            goto L_0x007c
        L_0x006a:
            r8 = r11 & 3072(0xc00, float:4.305E-42)
            if (r8 != 0) goto L_0x0067
            r8 = r32
            boolean r9 = r1.W(r8)
            if (r9 == 0) goto L_0x0079
            r9 = 2048(0x800, float:2.87E-42)
            goto L_0x007b
        L_0x0079:
            r9 = 1024(0x400, float:1.435E-42)
        L_0x007b:
            r3 = r3 | r9
        L_0x007c:
            r9 = r12 & 16
            if (r9 == 0) goto L_0x0085
            r3 = r3 | 24576(0x6000, float:3.4438E-41)
        L_0x0082:
            r10 = r33
            goto L_0x0097
        L_0x0085:
            r10 = r11 & 24576(0x6000, float:3.4438E-41)
            if (r10 != 0) goto L_0x0082
            r10 = r33
            boolean r13 = r1.d(r10)
            if (r13 == 0) goto L_0x0094
            r13 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0096
        L_0x0094:
            r13 = 8192(0x2000, float:1.14794E-41)
        L_0x0096:
            r3 = r3 | r13
        L_0x0097:
            r13 = 196608(0x30000, float:2.75506E-40)
            r13 = r13 & r11
            if (r13 != 0) goto L_0x00b1
            r13 = r12 & 32
            if (r13 != 0) goto L_0x00ab
            r13 = r34
            boolean r14 = r1.W(r13)
            if (r14 == 0) goto L_0x00ad
            r14 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00af
        L_0x00ab:
            r13 = r34
        L_0x00ad:
            r14 = 65536(0x10000, float:9.18355E-41)
        L_0x00af:
            r3 = r3 | r14
            goto L_0x00b3
        L_0x00b1:
            r13 = r34
        L_0x00b3:
            r14 = r12 & 64
            r15 = 1572864(0x180000, float:2.204052E-39)
            if (r14 == 0) goto L_0x00bd
            r3 = r3 | r15
        L_0x00ba:
            r15 = r35
            goto L_0x00cf
        L_0x00bd:
            r15 = r15 & r11
            if (r15 != 0) goto L_0x00ba
            r15 = r35
            boolean r16 = r1.W(r15)
            if (r16 == 0) goto L_0x00cb
            r16 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00cd
        L_0x00cb:
            r16 = 524288(0x80000, float:7.34684E-40)
        L_0x00cd:
            r3 = r3 | r16
        L_0x00cf:
            r16 = 12582912(0xc00000, float:1.7632415E-38)
            r16 = r11 & r16
            if (r16 != 0) goto L_0x00eb
            r0 = r12 & 128(0x80, float:1.794E-43)
            if (r0 != 0) goto L_0x00e4
            r0 = r36
            boolean r17 = r1.W(r0)
            if (r17 == 0) goto L_0x00e6
            r17 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00e8
        L_0x00e4:
            r0 = r36
        L_0x00e6:
            r17 = 4194304(0x400000, float:5.877472E-39)
        L_0x00e8:
            r3 = r3 | r17
            goto L_0x00ed
        L_0x00eb:
            r0 = r36
        L_0x00ed:
            r0 = r12 & 256(0x100, float:3.59E-43)
            r17 = 100663296(0x6000000, float:2.4074124E-35)
            if (r0 == 0) goto L_0x00f8
            r3 = r3 | r17
            r2 = r37
            goto L_0x010b
        L_0x00f8:
            r17 = r11 & r17
            r2 = r37
            if (r17 != 0) goto L_0x010b
            boolean r17 = r1.d(r2)
            if (r17 == 0) goto L_0x0107
            r17 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x0109
        L_0x0107:
            r17 = 33554432(0x2000000, float:9.403955E-38)
        L_0x0109:
            r3 = r3 | r17
        L_0x010b:
            r2 = r12 & 512(0x200, float:7.175E-43)
            r17 = 805306368(0x30000000, float:4.656613E-10)
            if (r2 == 0) goto L_0x0116
            r3 = r3 | r17
        L_0x0113:
            r2 = r38
            goto L_0x0129
        L_0x0116:
            r2 = r11 & r17
            if (r2 != 0) goto L_0x0113
            r2 = r38
            boolean r17 = r1.l(r2)
            if (r17 == 0) goto L_0x0125
            r17 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x0127
        L_0x0125:
            r17 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x0127:
            r3 = r3 | r17
        L_0x0129:
            r17 = 306783379(0x12492493, float:6.34695E-28)
            r2 = r3 & r17
            r5 = 306783378(0x12492492, float:6.3469493E-28)
            r6 = 0
            r17 = 1
            if (r2 == r5) goto L_0x0139
            r2 = r17
            goto L_0x013a
        L_0x0139:
            r2 = r6
        L_0x013a:
            r5 = r3 & 1
            boolean r2 = r1.E(r2, r5)
            if (r2 == 0) goto L_0x0220
            r1.p()
            r2 = r11 & 1
            r5 = -29360129(0xfffffffffe3fffff, float:-6.380294E37)
            r18 = -458753(0xfffffffffff8ffff, float:NaN)
            if (r2 == 0) goto L_0x0178
            boolean r2 = r1.J()
            if (r2 == 0) goto L_0x0156
            goto L_0x0178
        L_0x0156:
            r1.B()
            r0 = r12 & 4
            if (r0 == 0) goto L_0x015f
            r3 = r3 & -897(0xfffffffffffffc7f, float:NaN)
        L_0x015f:
            r0 = r12 & 32
            if (r0 == 0) goto L_0x0165
            r3 = r3 & r18
        L_0x0165:
            r0 = r12 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x016a
            r3 = r3 & r5
        L_0x016a:
            r2 = r30
            r4 = r31
            r0 = r36
            r5 = r3
            r7 = r8
            r8 = r13
            r9 = r15
        L_0x0174:
            r3 = r37
            goto L_0x01d4
        L_0x0178:
            if (r4 == 0) goto L_0x017d
            androidx.compose.ui.Modifier$Companion r2 = androidx.compose.ui.Modifier.f15489d
            goto L_0x017f
        L_0x017d:
            r2 = r30
        L_0x017f:
            r4 = r12 & 4
            if (r4 == 0) goto L_0x018b
            r4 = 3
            androidx.compose.foundation.lazy.grid.LazyGridState r4 = androidx.compose.foundation.lazy.grid.LazyGridStateKt.b(r6, r6, r1, r6, r4)
            r3 = r3 & -897(0xfffffffffffffc7f, float:NaN)
            goto L_0x018d
        L_0x018b:
            r4 = r31
        L_0x018d:
            if (r7 == 0) goto L_0x0199
            float r7 = (float) r6
            float r7 = androidx.compose.ui.unit.Dp.m(r7)
            androidx.compose.foundation.layout.PaddingValues r7 = androidx.compose.foundation.layout.PaddingKt.a(r7)
            goto L_0x019a
        L_0x0199:
            r7 = r8
        L_0x019a:
            if (r9 == 0) goto L_0x019d
            r10 = r6
        L_0x019d:
            r8 = r12 & 32
            if (r8 == 0) goto L_0x01b1
            androidx.compose.foundation.layout.Arrangement r8 = androidx.compose.foundation.layout.Arrangement.f3739a
            if (r10 != 0) goto L_0x01aa
            androidx.compose.foundation.layout.Arrangement$Horizontal r8 = r8.f()
            goto L_0x01ae
        L_0x01aa:
            androidx.compose.foundation.layout.Arrangement$Horizontal r8 = r8.c()
        L_0x01ae:
            r3 = r3 & r18
            goto L_0x01b2
        L_0x01b1:
            r8 = r13
        L_0x01b2:
            if (r14 == 0) goto L_0x01bb
            androidx.compose.foundation.layout.Arrangement r9 = androidx.compose.foundation.layout.Arrangement.f3739a
            androidx.compose.foundation.layout.Arrangement$Vertical r9 = r9.g()
            goto L_0x01bc
        L_0x01bb:
            r9 = r15
        L_0x01bc:
            r13 = r12 & 128(0x80, float:1.794E-43)
            if (r13 == 0) goto L_0x01c9
            androidx.compose.foundation.gestures.ScrollableDefaults r13 = androidx.compose.foundation.gestures.ScrollableDefaults.f3558a
            r14 = 6
            androidx.compose.foundation.gestures.FlingBehavior r13 = r13.a(r1, r14)
            r3 = r3 & r5
            goto L_0x01cb
        L_0x01c9:
            r13 = r36
        L_0x01cb:
            r5 = r3
            if (r0 == 0) goto L_0x01d2
            r0 = r13
            r3 = r17
            goto L_0x01d4
        L_0x01d2:
            r0 = r13
            goto L_0x0174
        L_0x01d4:
            r1.U()
            boolean r13 = androidx.compose.runtime.ComposerKt.P()
            if (r13 == 0) goto L_0x01e6
            r13 = -1
            java.lang.String r14 = "androidx.compose.foundation.lazy.grid.LazyHorizontalGrid (LazyGridDsl.kt:199)"
            r15 = 2123608858(0x7e93b31a, float:9.816323E37)
            androidx.compose.runtime.ComposerKt.Y(r15, r5, r13, r14)
        L_0x01e6:
            androidx.compose.foundation.OverscrollEffect r22 = androidx.compose.foundation.OverscrollKt.b(r1, r6)
            r6 = 268435454(0xffffffe, float:2.5243546E-29)
            r25 = r5 & r6
            int r5 = r5 >> 27
            r26 = r5 & 14
            r27 = 0
            r13 = r29
            r14 = r2
            r15 = r4
            r16 = r7
            r17 = r10
            r18 = r8
            r19 = r9
            r20 = r0
            r21 = r3
            r23 = r38
            r24 = r1
            a(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            boolean r5 = androidx.compose.runtime.ComposerKt.P()
            if (r5 == 0) goto L_0x0215
            androidx.compose.runtime.ComposerKt.X()
        L_0x0215:
            r6 = r8
            r5 = r10
            r8 = r0
            r28 = r9
            r9 = r3
            r3 = r4
            r4 = r7
            r7 = r28
            goto L_0x022f
        L_0x0220:
            r1.B()
            r2 = r30
            r3 = r31
            r9 = r37
            r4 = r8
            r5 = r10
            r6 = r13
            r7 = r15
            r8 = r36
        L_0x022f:
            androidx.compose.runtime.ScopeUpdateScope r13 = r1.x()
            if (r13 == 0) goto L_0x0246
            androidx.compose.foundation.lazy.grid.LazyGridDslKt$LazyHorizontalGrid$2 r14 = new androidx.compose.foundation.lazy.grid.LazyGridDslKt$LazyHorizontalGrid$2
            r0 = r14
            r1 = r29
            r10 = r38
            r11 = r40
            r12 = r41
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            r13.a(r14)
        L_0x0246:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.grid.LazyGridDslKt.b(androidx.compose.foundation.lazy.grid.GridCells, androidx.compose.ui.Modifier, androidx.compose.foundation.lazy.grid.LazyGridState, androidx.compose.foundation.layout.PaddingValues, boolean, androidx.compose.foundation.layout.Arrangement$Horizontal, androidx.compose.foundation.layout.Arrangement$Vertical, androidx.compose.foundation.gestures.FlingBehavior, boolean, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:106:0x0124  */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x012a  */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x012d  */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x015a  */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x015c  */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x0166  */
    /* JADX WARNING: Removed duplicated region for block: B:184:0x029f  */
    /* JADX WARNING: Removed duplicated region for block: B:187:0x02b6  */
    /* JADX WARNING: Removed duplicated region for block: B:189:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0098  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00ac  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00b4  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00b9  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x00d2  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x00e8  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x00f0  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x00f5  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x010e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void c(androidx.compose.foundation.lazy.grid.GridCells r33, androidx.compose.ui.Modifier r34, androidx.compose.foundation.lazy.grid.LazyGridState r35, androidx.compose.foundation.layout.PaddingValues r36, boolean r37, androidx.compose.foundation.layout.Arrangement.Vertical r38, androidx.compose.foundation.layout.Arrangement.Horizontal r39, androidx.compose.foundation.gestures.FlingBehavior r40, boolean r41, androidx.compose.foundation.OverscrollEffect r42, kotlin.jvm.functions.Function1 r43, androidx.compose.runtime.Composer r44, int r45, int r46, int r47) {
        /*
            r1 = r33
            r12 = r45
            r14 = r47
            r0 = -2072102870(0xffffffff847e382a, float:-2.9883346E-36)
            r2 = r44
            androidx.compose.runtime.Composer r2 = r2.q(r0)
            r3 = r14 & 1
            if (r3 == 0) goto L_0x0016
            r3 = r12 | 6
            goto L_0x0026
        L_0x0016:
            r3 = r12 & 6
            if (r3 != 0) goto L_0x0025
            boolean r3 = r2.W(r1)
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
            r6 = r14 & 2
            if (r6 == 0) goto L_0x002f
            r3 = r3 | 48
        L_0x002c:
            r7 = r34
            goto L_0x0041
        L_0x002f:
            r7 = r12 & 48
            if (r7 != 0) goto L_0x002c
            r7 = r34
            boolean r8 = r2.W(r7)
            if (r8 == 0) goto L_0x003e
            r8 = 32
            goto L_0x0040
        L_0x003e:
            r8 = 16
        L_0x0040:
            r3 = r3 | r8
        L_0x0041:
            r8 = r12 & 384(0x180, float:5.38E-43)
            if (r8 != 0) goto L_0x005a
            r8 = r14 & 4
            if (r8 != 0) goto L_0x0054
            r8 = r35
            boolean r9 = r2.W(r8)
            if (r9 == 0) goto L_0x0056
            r9 = 256(0x100, float:3.59E-43)
            goto L_0x0058
        L_0x0054:
            r8 = r35
        L_0x0056:
            r9 = 128(0x80, float:1.794E-43)
        L_0x0058:
            r3 = r3 | r9
            goto L_0x005c
        L_0x005a:
            r8 = r35
        L_0x005c:
            r9 = r14 & 8
            if (r9 == 0) goto L_0x0065
            r3 = r3 | 3072(0xc00, float:4.305E-42)
        L_0x0062:
            r10 = r36
            goto L_0x0077
        L_0x0065:
            r10 = r12 & 3072(0xc00, float:4.305E-42)
            if (r10 != 0) goto L_0x0062
            r10 = r36
            boolean r11 = r2.W(r10)
            if (r11 == 0) goto L_0x0074
            r11 = 2048(0x800, float:2.87E-42)
            goto L_0x0076
        L_0x0074:
            r11 = 1024(0x400, float:1.435E-42)
        L_0x0076:
            r3 = r3 | r11
        L_0x0077:
            r11 = r14 & 16
            if (r11 == 0) goto L_0x0080
            r3 = r3 | 24576(0x6000, float:3.4438E-41)
        L_0x007d:
            r13 = r37
            goto L_0x0092
        L_0x0080:
            r13 = r12 & 24576(0x6000, float:3.4438E-41)
            if (r13 != 0) goto L_0x007d
            r13 = r37
            boolean r15 = r2.d(r13)
            if (r15 == 0) goto L_0x008f
            r15 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0091
        L_0x008f:
            r15 = 8192(0x2000, float:1.14794E-41)
        L_0x0091:
            r3 = r3 | r15
        L_0x0092:
            r15 = 196608(0x30000, float:2.75506E-40)
            r16 = r12 & r15
            if (r16 != 0) goto L_0x00ac
            r16 = r14 & 32
            r5 = r38
            if (r16 != 0) goto L_0x00a7
            boolean r16 = r2.W(r5)
            if (r16 == 0) goto L_0x00a7
            r16 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00a9
        L_0x00a7:
            r16 = 65536(0x10000, float:9.18355E-41)
        L_0x00a9:
            r3 = r3 | r16
            goto L_0x00ae
        L_0x00ac:
            r5 = r38
        L_0x00ae:
            r16 = r14 & 64
            r17 = 1572864(0x180000, float:2.204052E-39)
            if (r16 == 0) goto L_0x00b9
            r3 = r3 | r17
            r15 = r39
            goto L_0x00cc
        L_0x00b9:
            r17 = r12 & r17
            r15 = r39
            if (r17 != 0) goto L_0x00cc
            boolean r18 = r2.W(r15)
            if (r18 == 0) goto L_0x00c8
            r18 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00ca
        L_0x00c8:
            r18 = 524288(0x80000, float:7.34684E-40)
        L_0x00ca:
            r3 = r3 | r18
        L_0x00cc:
            r18 = 12582912(0xc00000, float:1.7632415E-38)
            r18 = r12 & r18
            if (r18 != 0) goto L_0x00e8
            r0 = r14 & 128(0x80, float:1.794E-43)
            if (r0 != 0) goto L_0x00e1
            r0 = r40
            boolean r19 = r2.W(r0)
            if (r19 == 0) goto L_0x00e3
            r19 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00e5
        L_0x00e1:
            r0 = r40
        L_0x00e3:
            r19 = 4194304(0x400000, float:5.877472E-39)
        L_0x00e5:
            r3 = r3 | r19
            goto L_0x00ea
        L_0x00e8:
            r0 = r40
        L_0x00ea:
            r4 = r14 & 256(0x100, float:3.59E-43)
            r20 = 100663296(0x6000000, float:2.4074124E-35)
            if (r4 == 0) goto L_0x00f5
            r3 = r3 | r20
            r0 = r41
            goto L_0x0108
        L_0x00f5:
            r20 = r12 & r20
            r0 = r41
            if (r20 != 0) goto L_0x0108
            boolean r20 = r2.d(r0)
            if (r20 == 0) goto L_0x0104
            r20 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x0106
        L_0x0104:
            r20 = 33554432(0x2000000, float:9.403955E-38)
        L_0x0106:
            r3 = r3 | r20
        L_0x0108:
            r20 = 805306368(0x30000000, float:4.656613E-10)
            r20 = r12 & r20
            if (r20 != 0) goto L_0x0124
            r0 = r14 & 512(0x200, float:7.175E-43)
            if (r0 != 0) goto L_0x011d
            r0 = r42
            boolean r20 = r2.W(r0)
            if (r20 == 0) goto L_0x011f
            r20 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x0121
        L_0x011d:
            r0 = r42
        L_0x011f:
            r20 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x0121:
            r3 = r3 | r20
            goto L_0x0126
        L_0x0124:
            r0 = r42
        L_0x0126:
            r0 = r14 & 1024(0x400, float:1.435E-42)
            if (r0 == 0) goto L_0x012d
            r0 = r46 | 6
            goto L_0x0147
        L_0x012d:
            r0 = r46 & 6
            if (r0 != 0) goto L_0x0143
            r0 = r43
            boolean r20 = r2.l(r0)
            if (r20 == 0) goto L_0x013c
            r20 = 4
            goto L_0x013e
        L_0x013c:
            r20 = 2
        L_0x013e:
            r20 = r46 | r20
            r0 = r20
            goto L_0x0147
        L_0x0143:
            r0 = r43
            r0 = r46
        L_0x0147:
            r20 = 306783379(0x12492493, float:6.34695E-28)
            r5 = r3 & r20
            r7 = 306783378(0x12492492, float:6.3469493E-28)
            r8 = 0
            r20 = 1
            if (r5 != r7) goto L_0x015c
            r5 = r0 & 3
            r7 = 2
            if (r5 == r7) goto L_0x015a
            goto L_0x015c
        L_0x015a:
            r5 = r8
            goto L_0x015e
        L_0x015c:
            r5 = r20
        L_0x015e:
            r7 = r3 & 1
            boolean r5 = r2.E(r5, r7)
            if (r5 == 0) goto L_0x029f
            r2.p()
            r5 = r12 & 1
            r7 = 3
            if (r5 == 0) goto L_0x01a7
            boolean r5 = r2.J()
            if (r5 == 0) goto L_0x0175
            goto L_0x01a7
        L_0x0175:
            r2.B()
            r4 = r14 & 4
            if (r4 == 0) goto L_0x017e
            r3 = r3 & -897(0xfffffffffffffc7f, float:NaN)
        L_0x017e:
            r4 = r14 & 32
            if (r4 == 0) goto L_0x0186
            r4 = -458753(0xfffffffffff8ffff, float:NaN)
            r3 = r3 & r4
        L_0x0186:
            r4 = r14 & 128(0x80, float:1.794E-43)
            if (r4 == 0) goto L_0x018e
            r4 = -29360129(0xfffffffffe3fffff, float:-6.380294E37)
            r3 = r3 & r4
        L_0x018e:
            r4 = r14 & 512(0x200, float:7.175E-43)
            if (r4 == 0) goto L_0x0196
            r4 = -1879048193(0xffffffff8fffffff, float:-2.5243547E-29)
            r3 = r3 & r4
        L_0x0196:
            r5 = r34
            r6 = r35
            r7 = r40
            r4 = r42
            r8 = r3
            r9 = r10
            r11 = r15
            r10 = r38
            r3 = r41
            goto L_0x0217
        L_0x01a7:
            if (r6 == 0) goto L_0x01ac
            androidx.compose.ui.Modifier$Companion r5 = androidx.compose.ui.Modifier.f15489d
            goto L_0x01ae
        L_0x01ac:
            r5 = r34
        L_0x01ae:
            r6 = r14 & 4
            if (r6 == 0) goto L_0x01b9
            androidx.compose.foundation.lazy.grid.LazyGridState r6 = androidx.compose.foundation.lazy.grid.LazyGridStateKt.b(r8, r8, r2, r8, r7)
            r3 = r3 & -897(0xfffffffffffffc7f, float:NaN)
            goto L_0x01bb
        L_0x01b9:
            r6 = r35
        L_0x01bb:
            if (r9 == 0) goto L_0x01c7
            float r9 = (float) r8
            float r9 = androidx.compose.ui.unit.Dp.m(r9)
            androidx.compose.foundation.layout.PaddingValues r9 = androidx.compose.foundation.layout.PaddingKt.a(r9)
            goto L_0x01c8
        L_0x01c7:
            r9 = r10
        L_0x01c8:
            if (r11 == 0) goto L_0x01cb
            r13 = r8
        L_0x01cb:
            r10 = r14 & 32
            if (r10 == 0) goto L_0x01e1
            androidx.compose.foundation.layout.Arrangement r10 = androidx.compose.foundation.layout.Arrangement.f3739a
            if (r13 != 0) goto L_0x01d8
            androidx.compose.foundation.layout.Arrangement$Vertical r10 = r10.g()
            goto L_0x01dc
        L_0x01d8:
            androidx.compose.foundation.layout.Arrangement$Vertical r10 = r10.a()
        L_0x01dc:
            r11 = -458753(0xfffffffffff8ffff, float:NaN)
            r3 = r3 & r11
            goto L_0x01e3
        L_0x01e1:
            r10 = r38
        L_0x01e3:
            if (r16 == 0) goto L_0x01ec
            androidx.compose.foundation.layout.Arrangement r11 = androidx.compose.foundation.layout.Arrangement.f3739a
            androidx.compose.foundation.layout.Arrangement$Horizontal r11 = r11.f()
            goto L_0x01ed
        L_0x01ec:
            r11 = r15
        L_0x01ed:
            r15 = r14 & 128(0x80, float:1.794E-43)
            if (r15 == 0) goto L_0x01fd
            androidx.compose.foundation.gestures.ScrollableDefaults r15 = androidx.compose.foundation.gestures.ScrollableDefaults.f3558a
            r7 = 6
            androidx.compose.foundation.gestures.FlingBehavior r7 = r15.a(r2, r7)
            r15 = -29360129(0xfffffffffe3fffff, float:-6.380294E37)
            r3 = r3 & r15
            goto L_0x01ff
        L_0x01fd:
            r7 = r40
        L_0x01ff:
            if (r4 == 0) goto L_0x0202
            goto L_0x0204
        L_0x0202:
            r20 = r41
        L_0x0204:
            r4 = r14 & 512(0x200, float:7.175E-43)
            if (r4 == 0) goto L_0x0214
            androidx.compose.foundation.OverscrollEffect r4 = androidx.compose.foundation.OverscrollKt.b(r2, r8)
            r8 = -1879048193(0xffffffff8fffffff, float:-2.5243547E-29)
            r3 = r3 & r8
        L_0x0210:
            r8 = r3
            r3 = r20
            goto L_0x0217
        L_0x0214:
            r4 = r42
            goto L_0x0210
        L_0x0217:
            r2.U()
            boolean r15 = androidx.compose.runtime.ComposerKt.P()
            if (r15 == 0) goto L_0x0228
            java.lang.String r15 = "androidx.compose.foundation.lazy.grid.LazyVerticalGrid (LazyGridDsl.kt:79)"
            r12 = -2072102870(0xffffffff847e382a, float:-2.9883346E-36)
            androidx.compose.runtime.ComposerKt.Y(r12, r8, r0, r15)
        L_0x0228:
            r12 = r8 & 14
            int r15 = r8 >> 15
            r15 = r15 & 112(0x70, float:1.57E-43)
            r12 = r12 | r15
            androidx.compose.foundation.lazy.grid.LazyGridSlotsProvider r12 = g(r1, r11, r2, r12)
            int r15 = r8 >> 3
            r16 = r15 & 14
            r17 = 196608(0x30000, float:2.75506E-40)
            r16 = r16 | r17
            r17 = r15 & 112(0x70, float:1.57E-43)
            r16 = r16 | r17
            r1 = r8 & 7168(0x1c00, float:1.0045E-41)
            r1 = r16 | r1
            r16 = 57344(0xe000, float:8.0356E-41)
            r16 = r8 & r16
            r1 = r1 | r16
            r16 = 3670016(0x380000, float:5.142788E-39)
            r16 = r15 & r16
            r1 = r1 | r16
            r16 = 29360128(0x1c00000, float:7.052966E-38)
            r16 = r15 & r16
            r1 = r1 | r16
            r16 = 234881024(0xe000000, float:1.5777218E-30)
            r15 = r15 & r16
            r1 = r1 | r15
            int r15 = r8 << 12
            r16 = 1879048192(0x70000000, float:1.58456325E29)
            r15 = r15 & r16
            r28 = r1 | r15
            int r1 = r8 >> 18
            r1 = r1 & 14
            r8 = 3
            int r0 = r0 << r8
            r0 = r0 & 112(0x70, float:1.57E-43)
            r29 = r1 | r0
            r30 = 0
            r20 = 1
            r15 = r5
            r16 = r6
            r17 = r12
            r18 = r9
            r19 = r13
            r21 = r7
            r22 = r3
            r23 = r4
            r24 = r10
            r25 = r11
            r26 = r43
            r27 = r2
            androidx.compose.foundation.lazy.grid.LazyGridKt.a(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30)
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x0294
            androidx.compose.runtime.ComposerKt.X()
        L_0x0294:
            r8 = r7
            r7 = r11
            r32 = r9
            r9 = r3
            r3 = r6
            r6 = r10
            r10 = r4
            r4 = r32
            goto L_0x02b0
        L_0x029f:
            r2.B()
            r5 = r34
            r3 = r35
            r6 = r38
            r8 = r40
            r9 = r41
            r4 = r10
            r7 = r15
            r10 = r42
        L_0x02b0:
            androidx.compose.runtime.ScopeUpdateScope r15 = r2.x()
            if (r15 == 0) goto L_0x02d0
            androidx.compose.foundation.lazy.grid.LazyGridDslKt$LazyVerticalGrid$1 r12 = new androidx.compose.foundation.lazy.grid.LazyGridDslKt$LazyVerticalGrid$1
            r0 = r12
            r1 = r33
            r2 = r5
            r5 = r13
            r11 = r43
            r13 = r12
            r12 = r45
            r31 = r13
            r13 = r46
            r14 = r47
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            r0 = r31
            r15.a(r0)
        L_0x02d0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.grid.LazyGridDslKt.c(androidx.compose.foundation.lazy.grid.GridCells, androidx.compose.ui.Modifier, androidx.compose.foundation.lazy.grid.LazyGridState, androidx.compose.foundation.layout.PaddingValues, boolean, androidx.compose.foundation.layout.Arrangement$Vertical, androidx.compose.foundation.layout.Arrangement$Horizontal, androidx.compose.foundation.gestures.FlingBehavior, boolean, androidx.compose.foundation.OverscrollEffect, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:100:0x0111  */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x0116  */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x0136  */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x0139  */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x0142  */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x01dd  */
    /* JADX WARNING: Removed duplicated region for block: B:166:0x0212  */
    /* JADX WARNING: Removed duplicated region for block: B:168:0x0220  */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x0235  */
    /* JADX WARNING: Removed duplicated region for block: B:173:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x009c  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00b1  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00b9  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x00bd  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x00d5  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x00eb  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x00f3  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x00f8  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final /* synthetic */ void d(androidx.compose.foundation.lazy.grid.GridCells r29, androidx.compose.ui.Modifier r30, androidx.compose.foundation.lazy.grid.LazyGridState r31, androidx.compose.foundation.layout.PaddingValues r32, boolean r33, androidx.compose.foundation.layout.Arrangement.Vertical r34, androidx.compose.foundation.layout.Arrangement.Horizontal r35, androidx.compose.foundation.gestures.FlingBehavior r36, boolean r37, kotlin.jvm.functions.Function1 r38, androidx.compose.runtime.Composer r39, int r40, int r41) {
        /*
            r11 = r40
            r12 = r41
            r0 = 1485410512(0x588990d0, float:1.21004046E15)
            r1 = r39
            androidx.compose.runtime.Composer r1 = r1.q(r0)
            r2 = r12 & 1
            if (r2 == 0) goto L_0x0017
            r2 = r11 | 6
            r3 = r2
            r2 = r29
            goto L_0x002b
        L_0x0017:
            r2 = r11 & 6
            if (r2 != 0) goto L_0x0028
            r2 = r29
            boolean r3 = r1.W(r2)
            if (r3 == 0) goto L_0x0025
            r3 = 4
            goto L_0x0026
        L_0x0025:
            r3 = 2
        L_0x0026:
            r3 = r3 | r11
            goto L_0x002b
        L_0x0028:
            r2 = r29
            r3 = r11
        L_0x002b:
            r4 = r12 & 2
            if (r4 == 0) goto L_0x0034
            r3 = r3 | 48
        L_0x0031:
            r5 = r30
            goto L_0x0046
        L_0x0034:
            r5 = r11 & 48
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
            r6 = r11 & 384(0x180, float:5.38E-43)
            if (r6 != 0) goto L_0x005f
            r6 = r12 & 4
            if (r6 != 0) goto L_0x0059
            r6 = r31
            boolean r7 = r1.W(r6)
            if (r7 == 0) goto L_0x005b
            r7 = 256(0x100, float:3.59E-43)
            goto L_0x005d
        L_0x0059:
            r6 = r31
        L_0x005b:
            r7 = 128(0x80, float:1.794E-43)
        L_0x005d:
            r3 = r3 | r7
            goto L_0x0061
        L_0x005f:
            r6 = r31
        L_0x0061:
            r7 = r12 & 8
            if (r7 == 0) goto L_0x006a
            r3 = r3 | 3072(0xc00, float:4.305E-42)
        L_0x0067:
            r8 = r32
            goto L_0x007c
        L_0x006a:
            r8 = r11 & 3072(0xc00, float:4.305E-42)
            if (r8 != 0) goto L_0x0067
            r8 = r32
            boolean r9 = r1.W(r8)
            if (r9 == 0) goto L_0x0079
            r9 = 2048(0x800, float:2.87E-42)
            goto L_0x007b
        L_0x0079:
            r9 = 1024(0x400, float:1.435E-42)
        L_0x007b:
            r3 = r3 | r9
        L_0x007c:
            r9 = r12 & 16
            if (r9 == 0) goto L_0x0085
            r3 = r3 | 24576(0x6000, float:3.4438E-41)
        L_0x0082:
            r10 = r33
            goto L_0x0097
        L_0x0085:
            r10 = r11 & 24576(0x6000, float:3.4438E-41)
            if (r10 != 0) goto L_0x0082
            r10 = r33
            boolean r13 = r1.d(r10)
            if (r13 == 0) goto L_0x0094
            r13 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0096
        L_0x0094:
            r13 = 8192(0x2000, float:1.14794E-41)
        L_0x0096:
            r3 = r3 | r13
        L_0x0097:
            r13 = 196608(0x30000, float:2.75506E-40)
            r13 = r13 & r11
            if (r13 != 0) goto L_0x00b1
            r13 = r12 & 32
            if (r13 != 0) goto L_0x00ab
            r13 = r34
            boolean r14 = r1.W(r13)
            if (r14 == 0) goto L_0x00ad
            r14 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00af
        L_0x00ab:
            r13 = r34
        L_0x00ad:
            r14 = 65536(0x10000, float:9.18355E-41)
        L_0x00af:
            r3 = r3 | r14
            goto L_0x00b3
        L_0x00b1:
            r13 = r34
        L_0x00b3:
            r14 = r12 & 64
            r15 = 1572864(0x180000, float:2.204052E-39)
            if (r14 == 0) goto L_0x00bd
            r3 = r3 | r15
        L_0x00ba:
            r15 = r35
            goto L_0x00cf
        L_0x00bd:
            r15 = r15 & r11
            if (r15 != 0) goto L_0x00ba
            r15 = r35
            boolean r16 = r1.W(r15)
            if (r16 == 0) goto L_0x00cb
            r16 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00cd
        L_0x00cb:
            r16 = 524288(0x80000, float:7.34684E-40)
        L_0x00cd:
            r3 = r3 | r16
        L_0x00cf:
            r16 = 12582912(0xc00000, float:1.7632415E-38)
            r16 = r11 & r16
            if (r16 != 0) goto L_0x00eb
            r0 = r12 & 128(0x80, float:1.794E-43)
            if (r0 != 0) goto L_0x00e4
            r0 = r36
            boolean r17 = r1.W(r0)
            if (r17 == 0) goto L_0x00e6
            r17 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00e8
        L_0x00e4:
            r0 = r36
        L_0x00e6:
            r17 = 4194304(0x400000, float:5.877472E-39)
        L_0x00e8:
            r3 = r3 | r17
            goto L_0x00ed
        L_0x00eb:
            r0 = r36
        L_0x00ed:
            r0 = r12 & 256(0x100, float:3.59E-43)
            r17 = 100663296(0x6000000, float:2.4074124E-35)
            if (r0 == 0) goto L_0x00f8
            r3 = r3 | r17
            r2 = r37
            goto L_0x010b
        L_0x00f8:
            r17 = r11 & r17
            r2 = r37
            if (r17 != 0) goto L_0x010b
            boolean r17 = r1.d(r2)
            if (r17 == 0) goto L_0x0107
            r17 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x0109
        L_0x0107:
            r17 = 33554432(0x2000000, float:9.403955E-38)
        L_0x0109:
            r3 = r3 | r17
        L_0x010b:
            r2 = r12 & 512(0x200, float:7.175E-43)
            r17 = 805306368(0x30000000, float:4.656613E-10)
            if (r2 == 0) goto L_0x0116
            r3 = r3 | r17
        L_0x0113:
            r2 = r38
            goto L_0x0129
        L_0x0116:
            r2 = r11 & r17
            if (r2 != 0) goto L_0x0113
            r2 = r38
            boolean r17 = r1.l(r2)
            if (r17 == 0) goto L_0x0125
            r17 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x0127
        L_0x0125:
            r17 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x0127:
            r3 = r3 | r17
        L_0x0129:
            r17 = 306783379(0x12492493, float:6.34695E-28)
            r2 = r3 & r17
            r5 = 306783378(0x12492492, float:6.3469493E-28)
            r6 = 0
            r17 = 1
            if (r2 == r5) goto L_0x0139
            r2 = r17
            goto L_0x013a
        L_0x0139:
            r2 = r6
        L_0x013a:
            r5 = r3 & 1
            boolean r2 = r1.E(r2, r5)
            if (r2 == 0) goto L_0x0220
            r1.p()
            r2 = r11 & 1
            r5 = -29360129(0xfffffffffe3fffff, float:-6.380294E37)
            r18 = -458753(0xfffffffffff8ffff, float:NaN)
            if (r2 == 0) goto L_0x0178
            boolean r2 = r1.J()
            if (r2 == 0) goto L_0x0156
            goto L_0x0178
        L_0x0156:
            r1.B()
            r0 = r12 & 4
            if (r0 == 0) goto L_0x015f
            r3 = r3 & -897(0xfffffffffffffc7f, float:NaN)
        L_0x015f:
            r0 = r12 & 32
            if (r0 == 0) goto L_0x0165
            r3 = r3 & r18
        L_0x0165:
            r0 = r12 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x016a
            r3 = r3 & r5
        L_0x016a:
            r2 = r30
            r4 = r31
            r0 = r36
            r5 = r3
            r7 = r8
            r8 = r13
            r9 = r15
        L_0x0174:
            r3 = r37
            goto L_0x01d4
        L_0x0178:
            if (r4 == 0) goto L_0x017d
            androidx.compose.ui.Modifier$Companion r2 = androidx.compose.ui.Modifier.f15489d
            goto L_0x017f
        L_0x017d:
            r2 = r30
        L_0x017f:
            r4 = r12 & 4
            if (r4 == 0) goto L_0x018b
            r4 = 3
            androidx.compose.foundation.lazy.grid.LazyGridState r4 = androidx.compose.foundation.lazy.grid.LazyGridStateKt.b(r6, r6, r1, r6, r4)
            r3 = r3 & -897(0xfffffffffffffc7f, float:NaN)
            goto L_0x018d
        L_0x018b:
            r4 = r31
        L_0x018d:
            if (r7 == 0) goto L_0x0199
            float r7 = (float) r6
            float r7 = androidx.compose.ui.unit.Dp.m(r7)
            androidx.compose.foundation.layout.PaddingValues r7 = androidx.compose.foundation.layout.PaddingKt.a(r7)
            goto L_0x019a
        L_0x0199:
            r7 = r8
        L_0x019a:
            if (r9 == 0) goto L_0x019d
            r10 = r6
        L_0x019d:
            r8 = r12 & 32
            if (r8 == 0) goto L_0x01b1
            androidx.compose.foundation.layout.Arrangement r8 = androidx.compose.foundation.layout.Arrangement.f3739a
            if (r10 != 0) goto L_0x01aa
            androidx.compose.foundation.layout.Arrangement$Vertical r8 = r8.g()
            goto L_0x01ae
        L_0x01aa:
            androidx.compose.foundation.layout.Arrangement$Vertical r8 = r8.a()
        L_0x01ae:
            r3 = r3 & r18
            goto L_0x01b2
        L_0x01b1:
            r8 = r13
        L_0x01b2:
            if (r14 == 0) goto L_0x01bb
            androidx.compose.foundation.layout.Arrangement r9 = androidx.compose.foundation.layout.Arrangement.f3739a
            androidx.compose.foundation.layout.Arrangement$Horizontal r9 = r9.f()
            goto L_0x01bc
        L_0x01bb:
            r9 = r15
        L_0x01bc:
            r13 = r12 & 128(0x80, float:1.794E-43)
            if (r13 == 0) goto L_0x01c9
            androidx.compose.foundation.gestures.ScrollableDefaults r13 = androidx.compose.foundation.gestures.ScrollableDefaults.f3558a
            r14 = 6
            androidx.compose.foundation.gestures.FlingBehavior r13 = r13.a(r1, r14)
            r3 = r3 & r5
            goto L_0x01cb
        L_0x01c9:
            r13 = r36
        L_0x01cb:
            r5 = r3
            if (r0 == 0) goto L_0x01d2
            r0 = r13
            r3 = r17
            goto L_0x01d4
        L_0x01d2:
            r0 = r13
            goto L_0x0174
        L_0x01d4:
            r1.U()
            boolean r13 = androidx.compose.runtime.ComposerKt.P()
            if (r13 == 0) goto L_0x01e6
            r13 = -1
            java.lang.String r14 = "androidx.compose.foundation.lazy.grid.LazyVerticalGrid (LazyGridDsl.kt:110)"
            r15 = 1485410512(0x588990d0, float:1.21004046E15)
            androidx.compose.runtime.ComposerKt.Y(r15, r5, r13, r14)
        L_0x01e6:
            androidx.compose.foundation.OverscrollEffect r22 = androidx.compose.foundation.OverscrollKt.b(r1, r6)
            r6 = 268435454(0xffffffe, float:2.5243546E-29)
            r25 = r5 & r6
            int r5 = r5 >> 27
            r26 = r5 & 14
            r27 = 0
            r13 = r29
            r14 = r2
            r15 = r4
            r16 = r7
            r17 = r10
            r18 = r8
            r19 = r9
            r20 = r0
            r21 = r3
            r23 = r38
            r24 = r1
            c(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            boolean r5 = androidx.compose.runtime.ComposerKt.P()
            if (r5 == 0) goto L_0x0215
            androidx.compose.runtime.ComposerKt.X()
        L_0x0215:
            r6 = r8
            r5 = r10
            r8 = r0
            r28 = r9
            r9 = r3
            r3 = r4
            r4 = r7
            r7 = r28
            goto L_0x022f
        L_0x0220:
            r1.B()
            r2 = r30
            r3 = r31
            r9 = r37
            r4 = r8
            r5 = r10
            r6 = r13
            r7 = r15
            r8 = r36
        L_0x022f:
            androidx.compose.runtime.ScopeUpdateScope r13 = r1.x()
            if (r13 == 0) goto L_0x0246
            androidx.compose.foundation.lazy.grid.LazyGridDslKt$LazyVerticalGrid$2 r14 = new androidx.compose.foundation.lazy.grid.LazyGridDslKt$LazyVerticalGrid$2
            r0 = r14
            r1 = r29
            r10 = r38
            r11 = r40
            r12 = r41
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            r13.a(r14)
        L_0x0246:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.grid.LazyGridDslKt.d(androidx.compose.foundation.lazy.grid.GridCells, androidx.compose.ui.Modifier, androidx.compose.foundation.lazy.grid.LazyGridState, androidx.compose.foundation.layout.PaddingValues, boolean, androidx.compose.foundation.layout.Arrangement$Vertical, androidx.compose.foundation.layout.Arrangement$Horizontal, androidx.compose.foundation.gestures.FlingBehavior, boolean, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final List f(int i2, int i3, int i4) {
        int i5 = i2 - (i4 * (i3 - 1));
        int i6 = i5 / i3;
        int i7 = i5 % i3;
        ArrayList arrayList = new ArrayList(i3);
        int i8 = 0;
        while (i8 < i3) {
            arrayList.add(Integer.valueOf((i8 < i7 ? 1 : 0) + i6));
            i8++;
        }
        return arrayList;
    }

    public static final LazyGridSlotsProvider g(GridCells gridCells, Arrangement.Horizontal horizontal, Composer composer, int i2) {
        if (ComposerKt.P()) {
            ComposerKt.Y(-76500289, i2, -1, "androidx.compose.foundation.lazy.grid.rememberColumnWidthSums (LazyGridDsl.kt:221)");
        }
        boolean z2 = false;
        boolean z3 = (((i2 & 14) ^ 6) > 4 && composer.W(gridCells)) || (i2 & 6) == 4;
        if ((((i2 & 112) ^ 48) > 32 && composer.W(horizontal)) || (i2 & 48) == 32) {
            z2 = true;
        }
        boolean z4 = z3 | z2;
        Object g2 = composer.g();
        if (z4 || g2 == Composer.f14567a.a()) {
            g2 = new GridSlotCache(new LazyGridDslKt$rememberColumnWidthSums$1$1(gridCells, horizontal));
            composer.N(g2);
        }
        LazyGridSlotsProvider lazyGridSlotsProvider = (LazyGridSlotsProvider) g2;
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
        return lazyGridSlotsProvider;
    }

    public static final LazyGridSlotsProvider h(GridCells gridCells, Arrangement.Vertical vertical, Composer composer, int i2) {
        if (ComposerKt.P()) {
            ComposerKt.Y(-150818144, i2, -1, "androidx.compose.foundation.lazy.grid.rememberRowHeightSums (LazyGridDsl.kt:248)");
        }
        boolean z2 = false;
        boolean z3 = (((i2 & 14) ^ 6) > 4 && composer.W(gridCells)) || (i2 & 6) == 4;
        if ((((i2 & 112) ^ 48) > 32 && composer.W(vertical)) || (i2 & 48) == 32) {
            z2 = true;
        }
        boolean z4 = z3 | z2;
        Object g2 = composer.g();
        if (z4 || g2 == Composer.f14567a.a()) {
            g2 = new GridSlotCache(new LazyGridDslKt$rememberRowHeightSums$1$1(gridCells, vertical));
            composer.N(g2);
        }
        LazyGridSlotsProvider lazyGridSlotsProvider = (LazyGridSlotsProvider) g2;
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
        return lazyGridSlotsProvider;
    }
}
