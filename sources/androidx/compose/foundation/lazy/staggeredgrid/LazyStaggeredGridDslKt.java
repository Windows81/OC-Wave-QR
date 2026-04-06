package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.Metadata;

@Metadata
public final class LazyStaggeredGridDslKt {
    /* JADX WARNING: Removed duplicated region for block: B:106:0x0126  */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x012c  */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x012f  */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x015b  */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x015d  */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x0167  */
    /* JADX WARNING: Removed duplicated region for block: B:176:0x028e  */
    /* JADX WARNING: Removed duplicated region for block: B:179:0x02a6  */
    /* JADX WARNING: Removed duplicated region for block: B:181:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0098  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00b6  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00bb  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x00d4  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x00ea  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x00f2  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x00f7  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x0110  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void a(androidx.compose.foundation.lazy.staggeredgrid.StaggeredGridCells r33, androidx.compose.ui.Modifier r34, androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState r35, androidx.compose.foundation.layout.PaddingValues r36, boolean r37, androidx.compose.foundation.layout.Arrangement.Vertical r38, float r39, androidx.compose.foundation.gestures.FlingBehavior r40, boolean r41, androidx.compose.foundation.OverscrollEffect r42, kotlin.jvm.functions.Function1 r43, androidx.compose.runtime.Composer r44, int r45, int r46, int r47) {
        /*
            r1 = r33
            r12 = r45
            r14 = r47
            r0 = -670735644(0xffffffffd80562e4, float:-5.8663911E14)
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
            r15 = r14 & 32
            r16 = 196608(0x30000, float:2.75506E-40)
            if (r15 == 0) goto L_0x009d
            r3 = r3 | r16
            r5 = r38
            goto L_0x00b0
        L_0x009d:
            r16 = r12 & r16
            r5 = r38
            if (r16 != 0) goto L_0x00b0
            boolean r16 = r2.W(r5)
            if (r16 == 0) goto L_0x00ac
            r16 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00ae
        L_0x00ac:
            r16 = 65536(0x10000, float:9.18355E-41)
        L_0x00ae:
            r3 = r3 | r16
        L_0x00b0:
            r16 = r14 & 64
            r17 = 1572864(0x180000, float:2.204052E-39)
            if (r16 == 0) goto L_0x00bb
            r3 = r3 | r17
            r0 = r39
            goto L_0x00ce
        L_0x00bb:
            r17 = r12 & r17
            r0 = r39
            if (r17 != 0) goto L_0x00ce
            boolean r18 = r2.h(r0)
            if (r18 == 0) goto L_0x00ca
            r18 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00cc
        L_0x00ca:
            r18 = 524288(0x80000, float:7.34684E-40)
        L_0x00cc:
            r3 = r3 | r18
        L_0x00ce:
            r18 = 12582912(0xc00000, float:1.7632415E-38)
            r18 = r12 & r18
            if (r18 != 0) goto L_0x00ea
            r4 = r14 & 128(0x80, float:1.794E-43)
            if (r4 != 0) goto L_0x00e3
            r4 = r40
            boolean r19 = r2.W(r4)
            if (r19 == 0) goto L_0x00e5
            r19 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00e7
        L_0x00e3:
            r4 = r40
        L_0x00e5:
            r19 = 4194304(0x400000, float:5.877472E-39)
        L_0x00e7:
            r3 = r3 | r19
            goto L_0x00ec
        L_0x00ea:
            r4 = r40
        L_0x00ec:
            r0 = r14 & 256(0x100, float:3.59E-43)
            r19 = 100663296(0x6000000, float:2.4074124E-35)
            if (r0 == 0) goto L_0x00f7
            r3 = r3 | r19
            r4 = r41
            goto L_0x010a
        L_0x00f7:
            r19 = r12 & r19
            r4 = r41
            if (r19 != 0) goto L_0x010a
            boolean r19 = r2.d(r4)
            if (r19 == 0) goto L_0x0106
            r19 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x0108
        L_0x0106:
            r19 = 33554432(0x2000000, float:9.403955E-38)
        L_0x0108:
            r3 = r3 | r19
        L_0x010a:
            r19 = 805306368(0x30000000, float:4.656613E-10)
            r19 = r12 & r19
            if (r19 != 0) goto L_0x0126
            r4 = r14 & 512(0x200, float:7.175E-43)
            if (r4 != 0) goto L_0x011f
            r4 = r42
            boolean r19 = r2.W(r4)
            if (r19 == 0) goto L_0x0121
            r19 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x0123
        L_0x011f:
            r4 = r42
        L_0x0121:
            r19 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x0123:
            r3 = r3 | r19
            goto L_0x0128
        L_0x0126:
            r4 = r42
        L_0x0128:
            r4 = r14 & 1024(0x400, float:1.435E-42)
            if (r4 == 0) goto L_0x012f
            r4 = r46 | 6
            goto L_0x0149
        L_0x012f:
            r4 = r46 & 6
            if (r4 != 0) goto L_0x0145
            r4 = r43
            boolean r19 = r2.l(r4)
            if (r19 == 0) goto L_0x013e
            r19 = 4
            goto L_0x0140
        L_0x013e:
            r19 = 2
        L_0x0140:
            r19 = r46 | r19
            r4 = r19
            goto L_0x0149
        L_0x0145:
            r4 = r43
            r4 = r46
        L_0x0149:
            r19 = 306783379(0x12492493, float:6.34695E-28)
            r5 = r3 & r19
            r7 = 306783378(0x12492492, float:6.3469493E-28)
            r19 = 1
            if (r5 != r7) goto L_0x015d
            r5 = r4 & 3
            r7 = 2
            if (r5 == r7) goto L_0x015b
            goto L_0x015d
        L_0x015b:
            r5 = 0
            goto L_0x015f
        L_0x015d:
            r5 = r19
        L_0x015f:
            r7 = r3 & 1
            boolean r5 = r2.E(r5, r7)
            if (r5 == 0) goto L_0x028e
            r2.p()
            r5 = r12 & 1
            r7 = -1879048193(0xffffffff8fffffff, float:-2.5243547E-29)
            r18 = -29360129(0xfffffffffe3fffff, float:-6.380294E37)
            r8 = 3
            if (r5 == 0) goto L_0x01a2
            boolean r5 = r2.J()
            if (r5 == 0) goto L_0x017c
            goto L_0x01a2
        L_0x017c:
            r2.B()
            r0 = r14 & 4
            if (r0 == 0) goto L_0x0185
            r3 = r3 & -897(0xfffffffffffffc7f, float:NaN)
        L_0x0185:
            r0 = r14 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x018b
            r3 = r3 & r18
        L_0x018b:
            r0 = r14 & 512(0x200, float:7.175E-43)
            if (r0 == 0) goto L_0x0190
            r3 = r3 & r7
        L_0x0190:
            r5 = r34
            r0 = r35
            r6 = r39
            r11 = r40
            r7 = r42
            r15 = r3
            r9 = r10
            r10 = r38
            r3 = r41
            goto L_0x020b
        L_0x01a2:
            if (r6 == 0) goto L_0x01a7
            androidx.compose.ui.Modifier$Companion r5 = androidx.compose.ui.Modifier.f15489d
            goto L_0x01a9
        L_0x01a7:
            r5 = r34
        L_0x01a9:
            r6 = r14 & 4
            if (r6 == 0) goto L_0x01b5
            r6 = 0
            androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState r20 = androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridStateKt.a(r6, r6, r2, r6, r8)
            r3 = r3 & -897(0xfffffffffffffc7f, float:NaN)
            goto L_0x01b8
        L_0x01b5:
            r6 = 0
            r20 = r35
        L_0x01b8:
            if (r9 == 0) goto L_0x01c4
            float r9 = (float) r6
            float r9 = androidx.compose.ui.unit.Dp.m(r9)
            androidx.compose.foundation.layout.PaddingValues r9 = androidx.compose.foundation.layout.PaddingKt.a(r9)
            goto L_0x01c5
        L_0x01c4:
            r9 = r10
        L_0x01c5:
            if (r11 == 0) goto L_0x01c8
            r13 = r6
        L_0x01c8:
            if (r15 == 0) goto L_0x01d6
            androidx.compose.foundation.layout.Arrangement r10 = androidx.compose.foundation.layout.Arrangement.f3739a
            float r11 = (float) r6
            float r11 = androidx.compose.ui.unit.Dp.m(r11)
            androidx.compose.foundation.layout.Arrangement$HorizontalOrVertical r10 = r10.n(r11)
            goto L_0x01d8
        L_0x01d6:
            r10 = r38
        L_0x01d8:
            if (r16 == 0) goto L_0x01e0
            float r11 = (float) r6
            float r6 = androidx.compose.ui.unit.Dp.m(r11)
            goto L_0x01e2
        L_0x01e0:
            r6 = r39
        L_0x01e2:
            r11 = r14 & 128(0x80, float:1.794E-43)
            if (r11 == 0) goto L_0x01f0
            androidx.compose.foundation.gestures.ScrollableDefaults r11 = androidx.compose.foundation.gestures.ScrollableDefaults.f3558a
            r15 = 6
            androidx.compose.foundation.gestures.FlingBehavior r11 = r11.a(r2, r15)
            r3 = r3 & r18
            goto L_0x01f2
        L_0x01f0:
            r11 = r40
        L_0x01f2:
            if (r0 == 0) goto L_0x01f5
            goto L_0x01f7
        L_0x01f5:
            r19 = r41
        L_0x01f7:
            r0 = r14 & 512(0x200, float:7.175E-43)
            if (r0 == 0) goto L_0x0208
            r0 = 0
            androidx.compose.foundation.OverscrollEffect r0 = androidx.compose.foundation.OverscrollKt.b(r2, r0)
            r3 = r3 & r7
            r7 = r0
        L_0x0202:
            r15 = r3
            r3 = r19
            r0 = r20
            goto L_0x020b
        L_0x0208:
            r7 = r42
            goto L_0x0202
        L_0x020b:
            r2.U()
            boolean r16 = androidx.compose.runtime.ComposerKt.P()
            if (r16 == 0) goto L_0x021c
            java.lang.String r8 = "androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid (LazyStaggeredGridDsl.kt:206)"
            r12 = -670735644(0xffffffffd80562e4, float:-5.8663911E14)
            androidx.compose.runtime.ComposerKt.Y(r12, r15, r4, r8)
        L_0x021c:
            androidx.compose.foundation.gestures.Orientation r16 = androidx.compose.foundation.gestures.Orientation.Horizontal
            float r25 = r10.a()
            r8 = r15 & 14
            int r12 = r15 >> 12
            r12 = r12 & 112(0x70, float:1.57E-43)
            r8 = r8 | r12
            int r12 = r15 >> 3
            r14 = r12 & 896(0x380, float:1.256E-42)
            r8 = r8 | r14
            androidx.compose.foundation.lazy.staggeredgrid.LazyGridStaggeredGridSlotsProvider r17 = f(r1, r10, r9, r2, r8)
            int r8 = r15 >> 6
            r8 = r8 & 14
            r8 = r8 | 48
            int r14 = r15 << 6
            r14 = r14 & 7168(0x1c00, float:1.0045E-41)
            r8 = r8 | r14
            int r14 = r15 << 3
            r18 = 57344(0xe000, float:8.0356E-41)
            r18 = r14 & r18
            r8 = r8 | r18
            r18 = 458752(0x70000, float:6.42848E-40)
            r14 = r14 & r18
            r8 = r8 | r14
            r14 = 3670016(0x380000, float:5.142788E-39)
            r14 = r14 & r12
            r8 = r8 | r14
            r14 = 29360128(0x1c00000, float:7.052966E-38)
            r14 = r14 & r12
            r8 = r8 | r14
            r14 = 234881024(0xe000000, float:1.5777218E-30)
            r12 = r12 & r14
            r8 = r8 | r12
            int r12 = r15 << 9
            r14 = 1879048192(0x70000000, float:1.58456325E29)
            r12 = r12 & r14
            r28 = r8 | r12
            r8 = 3
            int r4 = r4 << r8
            r29 = r4 & 112(0x70, float:1.57E-43)
            r30 = 0
            r15 = r0
            r18 = r5
            r19 = r9
            r20 = r13
            r21 = r11
            r22 = r3
            r23 = r7
            r24 = r6
            r26 = r43
            r27 = r2
            androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridKt.a(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30)
            boolean r4 = androidx.compose.runtime.ComposerKt.P()
            if (r4 == 0) goto L_0x0283
            androidx.compose.runtime.ComposerKt.X()
        L_0x0283:
            r4 = r9
            r8 = r11
            r9 = r3
            r3 = r0
            r32 = r7
            r7 = r6
            r6 = r10
            r10 = r32
            goto L_0x02a0
        L_0x028e:
            r2.B()
            r5 = r34
            r3 = r35
            r6 = r38
            r7 = r39
            r8 = r40
            r9 = r41
            r4 = r10
            r10 = r42
        L_0x02a0:
            androidx.compose.runtime.ScopeUpdateScope r15 = r2.x()
            if (r15 == 0) goto L_0x02bf
            androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt$LazyHorizontalStaggeredGrid$1 r14 = new androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt$LazyHorizontalStaggeredGrid$1
            r0 = r14
            r1 = r33
            r2 = r5
            r5 = r13
            r11 = r43
            r12 = r45
            r13 = r46
            r31 = r14
            r14 = r47
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            r0 = r31
            r15.a(r0)
        L_0x02bf:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt.a(androidx.compose.foundation.lazy.staggeredgrid.StaggeredGridCells, androidx.compose.ui.Modifier, androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState, androidx.compose.foundation.layout.PaddingValues, boolean, androidx.compose.foundation.layout.Arrangement$Vertical, float, androidx.compose.foundation.gestures.FlingBehavior, boolean, androidx.compose.foundation.OverscrollEffect, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:101:0x0117  */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x0137  */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x013a  */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x0143  */
    /* JADX WARNING: Removed duplicated region for block: B:154:0x01d0  */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x0205  */
    /* JADX WARNING: Removed duplicated region for block: B:159:0x0213  */
    /* JADX WARNING: Removed duplicated region for block: B:162:0x0229  */
    /* JADX WARNING: Removed duplicated region for block: B:164:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00a1  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00b8  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00bd  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x00d6  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x00ec  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x00f4  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x00f9  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x0112  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final /* synthetic */ void b(androidx.compose.foundation.lazy.staggeredgrid.StaggeredGridCells r29, androidx.compose.ui.Modifier r30, androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState r31, androidx.compose.foundation.layout.PaddingValues r32, boolean r33, androidx.compose.foundation.layout.Arrangement.Vertical r34, float r35, androidx.compose.foundation.gestures.FlingBehavior r36, boolean r37, kotlin.jvm.functions.Function1 r38, androidx.compose.runtime.Composer r39, int r40, int r41) {
        /*
            r11 = r40
            r12 = r41
            r0 = -8666074(0xffffffffff7bc426, float:-3.3465469E38)
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
            r13 = r12 & 32
            r14 = 196608(0x30000, float:2.75506E-40)
            if (r13 == 0) goto L_0x00a1
            r3 = r3 | r14
        L_0x009e:
            r14 = r34
            goto L_0x00b2
        L_0x00a1:
            r14 = r14 & r11
            if (r14 != 0) goto L_0x009e
            r14 = r34
            boolean r15 = r1.W(r14)
            if (r15 == 0) goto L_0x00af
            r15 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00b1
        L_0x00af:
            r15 = 65536(0x10000, float:9.18355E-41)
        L_0x00b1:
            r3 = r3 | r15
        L_0x00b2:
            r15 = r12 & 64
            r16 = 1572864(0x180000, float:2.204052E-39)
            if (r15 == 0) goto L_0x00bd
            r3 = r3 | r16
            r0 = r35
            goto L_0x00d0
        L_0x00bd:
            r16 = r11 & r16
            r0 = r35
            if (r16 != 0) goto L_0x00d0
            boolean r17 = r1.h(r0)
            if (r17 == 0) goto L_0x00cc
            r17 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00ce
        L_0x00cc:
            r17 = 524288(0x80000, float:7.34684E-40)
        L_0x00ce:
            r3 = r3 | r17
        L_0x00d0:
            r17 = 12582912(0xc00000, float:1.7632415E-38)
            r17 = r11 & r17
            if (r17 != 0) goto L_0x00ec
            r0 = r12 & 128(0x80, float:1.794E-43)
            if (r0 != 0) goto L_0x00e5
            r0 = r36
            boolean r17 = r1.W(r0)
            if (r17 == 0) goto L_0x00e7
            r17 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00e9
        L_0x00e5:
            r0 = r36
        L_0x00e7:
            r17 = 4194304(0x400000, float:5.877472E-39)
        L_0x00e9:
            r3 = r3 | r17
            goto L_0x00ee
        L_0x00ec:
            r0 = r36
        L_0x00ee:
            r0 = r12 & 256(0x100, float:3.59E-43)
            r17 = 100663296(0x6000000, float:2.4074124E-35)
            if (r0 == 0) goto L_0x00f9
            r3 = r3 | r17
            r2 = r37
            goto L_0x010c
        L_0x00f9:
            r17 = r11 & r17
            r2 = r37
            if (r17 != 0) goto L_0x010c
            boolean r17 = r1.d(r2)
            if (r17 == 0) goto L_0x0108
            r17 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x010a
        L_0x0108:
            r17 = 33554432(0x2000000, float:9.403955E-38)
        L_0x010a:
            r3 = r3 | r17
        L_0x010c:
            r2 = r12 & 512(0x200, float:7.175E-43)
            r17 = 805306368(0x30000000, float:4.656613E-10)
            if (r2 == 0) goto L_0x0117
            r3 = r3 | r17
        L_0x0114:
            r2 = r38
            goto L_0x012a
        L_0x0117:
            r2 = r11 & r17
            if (r2 != 0) goto L_0x0114
            r2 = r38
            boolean r17 = r1.l(r2)
            if (r17 == 0) goto L_0x0126
            r17 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x0128
        L_0x0126:
            r17 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x0128:
            r3 = r3 | r17
        L_0x012a:
            r17 = 306783379(0x12492493, float:6.34695E-28)
            r2 = r3 & r17
            r5 = 306783378(0x12492492, float:6.3469493E-28)
            r6 = 0
            r17 = 1
            if (r2 == r5) goto L_0x013a
            r2 = r17
            goto L_0x013b
        L_0x013a:
            r2 = r6
        L_0x013b:
            r5 = r3 & 1
            boolean r2 = r1.E(r2, r5)
            if (r2 == 0) goto L_0x0213
            r1.p()
            r2 = r11 & 1
            r5 = -29360129(0xfffffffffe3fffff, float:-6.380294E37)
            if (r2 == 0) goto L_0x0171
            boolean r2 = r1.J()
            if (r2 == 0) goto L_0x0154
            goto L_0x0171
        L_0x0154:
            r1.B()
            r0 = r12 & 4
            if (r0 == 0) goto L_0x015d
            r3 = r3 & -897(0xfffffffffffffc7f, float:NaN)
        L_0x015d:
            r0 = r12 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x0162
            r3 = r3 & r5
        L_0x0162:
            r2 = r30
            r4 = r31
            r9 = r35
            r0 = r36
            r5 = r3
            r7 = r8
            r8 = r14
        L_0x016d:
            r3 = r37
            goto L_0x01c7
        L_0x0171:
            if (r4 == 0) goto L_0x0176
            androidx.compose.ui.Modifier$Companion r2 = androidx.compose.ui.Modifier.f15489d
            goto L_0x0178
        L_0x0176:
            r2 = r30
        L_0x0178:
            r4 = r12 & 4
            if (r4 == 0) goto L_0x0184
            r4 = 3
            androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState r4 = androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridStateKt.a(r6, r6, r1, r6, r4)
            r3 = r3 & -897(0xfffffffffffffc7f, float:NaN)
            goto L_0x0186
        L_0x0184:
            r4 = r31
        L_0x0186:
            if (r7 == 0) goto L_0x0192
            float r7 = (float) r6
            float r7 = androidx.compose.ui.unit.Dp.m(r7)
            androidx.compose.foundation.layout.PaddingValues r7 = androidx.compose.foundation.layout.PaddingKt.a(r7)
            goto L_0x0193
        L_0x0192:
            r7 = r8
        L_0x0193:
            if (r9 == 0) goto L_0x0196
            r10 = r6
        L_0x0196:
            if (r13 == 0) goto L_0x01a4
            androidx.compose.foundation.layout.Arrangement r8 = androidx.compose.foundation.layout.Arrangement.f3739a
            float r9 = (float) r6
            float r9 = androidx.compose.ui.unit.Dp.m(r9)
            androidx.compose.foundation.layout.Arrangement$HorizontalOrVertical r8 = r8.n(r9)
            goto L_0x01a5
        L_0x01a4:
            r8 = r14
        L_0x01a5:
            if (r15 == 0) goto L_0x01ad
            float r9 = (float) r6
            float r9 = androidx.compose.ui.unit.Dp.m(r9)
            goto L_0x01af
        L_0x01ad:
            r9 = r35
        L_0x01af:
            r13 = r12 & 128(0x80, float:1.794E-43)
            if (r13 == 0) goto L_0x01bc
            androidx.compose.foundation.gestures.ScrollableDefaults r13 = androidx.compose.foundation.gestures.ScrollableDefaults.f3558a
            r14 = 6
            androidx.compose.foundation.gestures.FlingBehavior r13 = r13.a(r1, r14)
            r3 = r3 & r5
            goto L_0x01be
        L_0x01bc:
            r13 = r36
        L_0x01be:
            r5 = r3
            if (r0 == 0) goto L_0x01c5
            r0 = r13
            r3 = r17
            goto L_0x01c7
        L_0x01c5:
            r0 = r13
            goto L_0x016d
        L_0x01c7:
            r1.U()
            boolean r13 = androidx.compose.runtime.ComposerKt.P()
            if (r13 == 0) goto L_0x01d9
            r13 = -1
            java.lang.String r14 = "androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid (LazyStaggeredGridDsl.kt:236)"
            r15 = -8666074(0xffffffffff7bc426, float:-3.3465469E38)
            androidx.compose.runtime.ComposerKt.Y(r15, r5, r13, r14)
        L_0x01d9:
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
            if (r5 == 0) goto L_0x0208
            androidx.compose.runtime.ComposerKt.X()
        L_0x0208:
            r6 = r8
            r5 = r10
            r8 = r0
            r28 = r9
            r9 = r3
            r3 = r4
            r4 = r7
            r7 = r28
            goto L_0x0223
        L_0x0213:
            r1.B()
            r2 = r30
            r3 = r31
            r7 = r35
            r9 = r37
            r4 = r8
            r5 = r10
            r6 = r14
            r8 = r36
        L_0x0223:
            androidx.compose.runtime.ScopeUpdateScope r13 = r1.x()
            if (r13 == 0) goto L_0x023a
            androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt$LazyHorizontalStaggeredGrid$2 r14 = new androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt$LazyHorizontalStaggeredGrid$2
            r0 = r14
            r1 = r29
            r10 = r38
            r11 = r40
            r12 = r41
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            r13.a(r14)
        L_0x023a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt.b(androidx.compose.foundation.lazy.staggeredgrid.StaggeredGridCells, androidx.compose.ui.Modifier, androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState, androidx.compose.foundation.layout.PaddingValues, boolean, androidx.compose.foundation.layout.Arrangement$Vertical, float, androidx.compose.foundation.gestures.FlingBehavior, boolean, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:106:0x0126  */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x012c  */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x012f  */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x015b  */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x015d  */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x0167  */
    /* JADX WARNING: Removed duplicated region for block: B:176:0x028e  */
    /* JADX WARNING: Removed duplicated region for block: B:179:0x02a6  */
    /* JADX WARNING: Removed duplicated region for block: B:181:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0098  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00b6  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00bb  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x00d4  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x00ea  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x00f2  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x00f7  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x0110  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void c(androidx.compose.foundation.lazy.staggeredgrid.StaggeredGridCells r33, androidx.compose.ui.Modifier r34, androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState r35, androidx.compose.foundation.layout.PaddingValues r36, boolean r37, float r38, androidx.compose.foundation.layout.Arrangement.Horizontal r39, androidx.compose.foundation.gestures.FlingBehavior r40, boolean r41, androidx.compose.foundation.OverscrollEffect r42, kotlin.jvm.functions.Function1 r43, androidx.compose.runtime.Composer r44, int r45, int r46, int r47) {
        /*
            r1 = r33
            r12 = r45
            r14 = r47
            r0 = -578931208(0xffffffffdd7e35f8, float:-1.14486373E18)
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
            r15 = r14 & 32
            r16 = 196608(0x30000, float:2.75506E-40)
            if (r15 == 0) goto L_0x009d
            r3 = r3 | r16
            r5 = r38
            goto L_0x00b0
        L_0x009d:
            r16 = r12 & r16
            r5 = r38
            if (r16 != 0) goto L_0x00b0
            boolean r16 = r2.h(r5)
            if (r16 == 0) goto L_0x00ac
            r16 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00ae
        L_0x00ac:
            r16 = 65536(0x10000, float:9.18355E-41)
        L_0x00ae:
            r3 = r3 | r16
        L_0x00b0:
            r16 = r14 & 64
            r17 = 1572864(0x180000, float:2.204052E-39)
            if (r16 == 0) goto L_0x00bb
            r3 = r3 | r17
            r0 = r39
            goto L_0x00ce
        L_0x00bb:
            r17 = r12 & r17
            r0 = r39
            if (r17 != 0) goto L_0x00ce
            boolean r18 = r2.W(r0)
            if (r18 == 0) goto L_0x00ca
            r18 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00cc
        L_0x00ca:
            r18 = 524288(0x80000, float:7.34684E-40)
        L_0x00cc:
            r3 = r3 | r18
        L_0x00ce:
            r18 = 12582912(0xc00000, float:1.7632415E-38)
            r18 = r12 & r18
            if (r18 != 0) goto L_0x00ea
            r4 = r14 & 128(0x80, float:1.794E-43)
            if (r4 != 0) goto L_0x00e3
            r4 = r40
            boolean r19 = r2.W(r4)
            if (r19 == 0) goto L_0x00e5
            r19 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00e7
        L_0x00e3:
            r4 = r40
        L_0x00e5:
            r19 = 4194304(0x400000, float:5.877472E-39)
        L_0x00e7:
            r3 = r3 | r19
            goto L_0x00ec
        L_0x00ea:
            r4 = r40
        L_0x00ec:
            r0 = r14 & 256(0x100, float:3.59E-43)
            r19 = 100663296(0x6000000, float:2.4074124E-35)
            if (r0 == 0) goto L_0x00f7
            r3 = r3 | r19
            r4 = r41
            goto L_0x010a
        L_0x00f7:
            r19 = r12 & r19
            r4 = r41
            if (r19 != 0) goto L_0x010a
            boolean r19 = r2.d(r4)
            if (r19 == 0) goto L_0x0106
            r19 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x0108
        L_0x0106:
            r19 = 33554432(0x2000000, float:9.403955E-38)
        L_0x0108:
            r3 = r3 | r19
        L_0x010a:
            r19 = 805306368(0x30000000, float:4.656613E-10)
            r19 = r12 & r19
            if (r19 != 0) goto L_0x0126
            r4 = r14 & 512(0x200, float:7.175E-43)
            if (r4 != 0) goto L_0x011f
            r4 = r42
            boolean r19 = r2.W(r4)
            if (r19 == 0) goto L_0x0121
            r19 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x0123
        L_0x011f:
            r4 = r42
        L_0x0121:
            r19 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x0123:
            r3 = r3 | r19
            goto L_0x0128
        L_0x0126:
            r4 = r42
        L_0x0128:
            r4 = r14 & 1024(0x400, float:1.435E-42)
            if (r4 == 0) goto L_0x012f
            r4 = r46 | 6
            goto L_0x0149
        L_0x012f:
            r4 = r46 & 6
            if (r4 != 0) goto L_0x0145
            r4 = r43
            boolean r19 = r2.l(r4)
            if (r19 == 0) goto L_0x013e
            r19 = 4
            goto L_0x0140
        L_0x013e:
            r19 = 2
        L_0x0140:
            r19 = r46 | r19
            r4 = r19
            goto L_0x0149
        L_0x0145:
            r4 = r43
            r4 = r46
        L_0x0149:
            r19 = 306783379(0x12492493, float:6.34695E-28)
            r5 = r3 & r19
            r7 = 306783378(0x12492492, float:6.3469493E-28)
            r19 = 1
            if (r5 != r7) goto L_0x015d
            r5 = r4 & 3
            r7 = 2
            if (r5 == r7) goto L_0x015b
            goto L_0x015d
        L_0x015b:
            r5 = 0
            goto L_0x015f
        L_0x015d:
            r5 = r19
        L_0x015f:
            r7 = r3 & 1
            boolean r5 = r2.E(r5, r7)
            if (r5 == 0) goto L_0x028e
            r2.p()
            r5 = r12 & 1
            r7 = -1879048193(0xffffffff8fffffff, float:-2.5243547E-29)
            r18 = -29360129(0xfffffffffe3fffff, float:-6.380294E37)
            r8 = 3
            if (r5 == 0) goto L_0x01a2
            boolean r5 = r2.J()
            if (r5 == 0) goto L_0x017c
            goto L_0x01a2
        L_0x017c:
            r2.B()
            r0 = r14 & 4
            if (r0 == 0) goto L_0x0185
            r3 = r3 & -897(0xfffffffffffffc7f, float:NaN)
        L_0x0185:
            r0 = r14 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x018b
            r3 = r3 & r18
        L_0x018b:
            r0 = r14 & 512(0x200, float:7.175E-43)
            if (r0 == 0) goto L_0x0190
            r3 = r3 & r7
        L_0x0190:
            r5 = r34
            r0 = r35
            r6 = r39
            r11 = r40
            r7 = r42
            r15 = r3
            r9 = r10
            r10 = r38
            r3 = r41
            goto L_0x020b
        L_0x01a2:
            if (r6 == 0) goto L_0x01a7
            androidx.compose.ui.Modifier$Companion r5 = androidx.compose.ui.Modifier.f15489d
            goto L_0x01a9
        L_0x01a7:
            r5 = r34
        L_0x01a9:
            r6 = r14 & 4
            if (r6 == 0) goto L_0x01b5
            r6 = 0
            androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState r20 = androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridStateKt.a(r6, r6, r2, r6, r8)
            r3 = r3 & -897(0xfffffffffffffc7f, float:NaN)
            goto L_0x01b8
        L_0x01b5:
            r6 = 0
            r20 = r35
        L_0x01b8:
            if (r9 == 0) goto L_0x01c4
            float r9 = (float) r6
            float r9 = androidx.compose.ui.unit.Dp.m(r9)
            androidx.compose.foundation.layout.PaddingValues r9 = androidx.compose.foundation.layout.PaddingKt.a(r9)
            goto L_0x01c5
        L_0x01c4:
            r9 = r10
        L_0x01c5:
            if (r11 == 0) goto L_0x01c8
            r13 = r6
        L_0x01c8:
            if (r15 == 0) goto L_0x01d0
            float r10 = (float) r6
            float r10 = androidx.compose.ui.unit.Dp.m(r10)
            goto L_0x01d2
        L_0x01d0:
            r10 = r38
        L_0x01d2:
            if (r16 == 0) goto L_0x01e0
            androidx.compose.foundation.layout.Arrangement r11 = androidx.compose.foundation.layout.Arrangement.f3739a
            float r15 = (float) r6
            float r6 = androidx.compose.ui.unit.Dp.m(r15)
            androidx.compose.foundation.layout.Arrangement$HorizontalOrVertical r6 = r11.n(r6)
            goto L_0x01e2
        L_0x01e0:
            r6 = r39
        L_0x01e2:
            r11 = r14 & 128(0x80, float:1.794E-43)
            if (r11 == 0) goto L_0x01f0
            androidx.compose.foundation.gestures.ScrollableDefaults r11 = androidx.compose.foundation.gestures.ScrollableDefaults.f3558a
            r15 = 6
            androidx.compose.foundation.gestures.FlingBehavior r11 = r11.a(r2, r15)
            r3 = r3 & r18
            goto L_0x01f2
        L_0x01f0:
            r11 = r40
        L_0x01f2:
            if (r0 == 0) goto L_0x01f5
            goto L_0x01f7
        L_0x01f5:
            r19 = r41
        L_0x01f7:
            r0 = r14 & 512(0x200, float:7.175E-43)
            if (r0 == 0) goto L_0x0208
            r0 = 0
            androidx.compose.foundation.OverscrollEffect r0 = androidx.compose.foundation.OverscrollKt.b(r2, r0)
            r3 = r3 & r7
            r7 = r0
        L_0x0202:
            r15 = r3
            r3 = r19
            r0 = r20
            goto L_0x020b
        L_0x0208:
            r7 = r42
            goto L_0x0202
        L_0x020b:
            r2.U()
            boolean r16 = androidx.compose.runtime.ComposerKt.P()
            if (r16 == 0) goto L_0x021c
            java.lang.String r8 = "androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid (LazyStaggeredGridDsl.kt:81)"
            r12 = -578931208(0xffffffffdd7e35f8, float:-1.14486373E18)
            androidx.compose.runtime.ComposerKt.Y(r12, r15, r4, r8)
        L_0x021c:
            androidx.compose.foundation.gestures.Orientation r16 = androidx.compose.foundation.gestures.Orientation.Vertical
            float r25 = r6.a()
            r8 = r15 & 14
            int r12 = r15 >> 15
            r12 = r12 & 112(0x70, float:1.57E-43)
            r8 = r8 | r12
            int r12 = r15 >> 3
            r14 = r12 & 896(0x380, float:1.256E-42)
            r8 = r8 | r14
            androidx.compose.foundation.lazy.staggeredgrid.LazyGridStaggeredGridSlotsProvider r17 = e(r1, r6, r9, r2, r8)
            int r8 = r15 >> 6
            r8 = r8 & 14
            r8 = r8 | 48
            int r14 = r15 << 6
            r14 = r14 & 7168(0x1c00, float:1.0045E-41)
            r8 = r8 | r14
            int r14 = r15 << 3
            r18 = 57344(0xe000, float:8.0356E-41)
            r18 = r14 & r18
            r8 = r8 | r18
            r18 = 458752(0x70000, float:6.42848E-40)
            r14 = r14 & r18
            r8 = r8 | r14
            r14 = 3670016(0x380000, float:5.142788E-39)
            r14 = r14 & r12
            r8 = r8 | r14
            r14 = 29360128(0x1c00000, float:7.052966E-38)
            r14 = r14 & r12
            r8 = r8 | r14
            r14 = 234881024(0xe000000, float:1.5777218E-30)
            r12 = r12 & r14
            r8 = r8 | r12
            int r12 = r15 << 12
            r14 = 1879048192(0x70000000, float:1.58456325E29)
            r12 = r12 & r14
            r28 = r8 | r12
            r8 = 3
            int r4 = r4 << r8
            r29 = r4 & 112(0x70, float:1.57E-43)
            r30 = 0
            r15 = r0
            r18 = r5
            r19 = r9
            r20 = r13
            r21 = r11
            r22 = r3
            r23 = r7
            r24 = r10
            r26 = r43
            r27 = r2
            androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridKt.a(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30)
            boolean r4 = androidx.compose.runtime.ComposerKt.P()
            if (r4 == 0) goto L_0x0283
            androidx.compose.runtime.ComposerKt.X()
        L_0x0283:
            r4 = r9
            r8 = r11
            r9 = r3
            r3 = r0
            r32 = r7
            r7 = r6
            r6 = r10
            r10 = r32
            goto L_0x02a0
        L_0x028e:
            r2.B()
            r5 = r34
            r3 = r35
            r6 = r38
            r7 = r39
            r8 = r40
            r9 = r41
            r4 = r10
            r10 = r42
        L_0x02a0:
            androidx.compose.runtime.ScopeUpdateScope r15 = r2.x()
            if (r15 == 0) goto L_0x02bf
            androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt$LazyVerticalStaggeredGrid$1 r14 = new androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt$LazyVerticalStaggeredGrid$1
            r0 = r14
            r1 = r33
            r2 = r5
            r5 = r13
            r11 = r43
            r12 = r45
            r13 = r46
            r31 = r14
            r14 = r47
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            r0 = r31
            r15.a(r0)
        L_0x02bf:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt.c(androidx.compose.foundation.lazy.staggeredgrid.StaggeredGridCells, androidx.compose.ui.Modifier, androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState, androidx.compose.foundation.layout.PaddingValues, boolean, float, androidx.compose.foundation.layout.Arrangement$Horizontal, androidx.compose.foundation.gestures.FlingBehavior, boolean, androidx.compose.foundation.OverscrollEffect, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:101:0x0117  */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x0137  */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x013a  */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x0143  */
    /* JADX WARNING: Removed duplicated region for block: B:154:0x01d0  */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x0205  */
    /* JADX WARNING: Removed duplicated region for block: B:159:0x0213  */
    /* JADX WARNING: Removed duplicated region for block: B:162:0x0229  */
    /* JADX WARNING: Removed duplicated region for block: B:164:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00a1  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00b8  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00bd  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x00d6  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x00ec  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x00f4  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x00f9  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x0112  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final /* synthetic */ void d(androidx.compose.foundation.lazy.staggeredgrid.StaggeredGridCells r29, androidx.compose.ui.Modifier r30, androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState r31, androidx.compose.foundation.layout.PaddingValues r32, boolean r33, float r34, androidx.compose.foundation.layout.Arrangement.Horizontal r35, androidx.compose.foundation.gestures.FlingBehavior r36, boolean r37, kotlin.jvm.functions.Function1 r38, androidx.compose.runtime.Composer r39, int r40, int r41) {
        /*
            r11 = r40
            r12 = r41
            r0 = 1695323794(0x650c9692, float:4.1494302E22)
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
            r13 = r12 & 32
            r14 = 196608(0x30000, float:2.75506E-40)
            if (r13 == 0) goto L_0x00a1
            r3 = r3 | r14
        L_0x009e:
            r14 = r34
            goto L_0x00b2
        L_0x00a1:
            r14 = r14 & r11
            if (r14 != 0) goto L_0x009e
            r14 = r34
            boolean r15 = r1.h(r14)
            if (r15 == 0) goto L_0x00af
            r15 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00b1
        L_0x00af:
            r15 = 65536(0x10000, float:9.18355E-41)
        L_0x00b1:
            r3 = r3 | r15
        L_0x00b2:
            r15 = r12 & 64
            r16 = 1572864(0x180000, float:2.204052E-39)
            if (r15 == 0) goto L_0x00bd
            r3 = r3 | r16
            r0 = r35
            goto L_0x00d0
        L_0x00bd:
            r16 = r11 & r16
            r0 = r35
            if (r16 != 0) goto L_0x00d0
            boolean r17 = r1.W(r0)
            if (r17 == 0) goto L_0x00cc
            r17 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00ce
        L_0x00cc:
            r17 = 524288(0x80000, float:7.34684E-40)
        L_0x00ce:
            r3 = r3 | r17
        L_0x00d0:
            r17 = 12582912(0xc00000, float:1.7632415E-38)
            r17 = r11 & r17
            if (r17 != 0) goto L_0x00ec
            r0 = r12 & 128(0x80, float:1.794E-43)
            if (r0 != 0) goto L_0x00e5
            r0 = r36
            boolean r17 = r1.W(r0)
            if (r17 == 0) goto L_0x00e7
            r17 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00e9
        L_0x00e5:
            r0 = r36
        L_0x00e7:
            r17 = 4194304(0x400000, float:5.877472E-39)
        L_0x00e9:
            r3 = r3 | r17
            goto L_0x00ee
        L_0x00ec:
            r0 = r36
        L_0x00ee:
            r0 = r12 & 256(0x100, float:3.59E-43)
            r17 = 100663296(0x6000000, float:2.4074124E-35)
            if (r0 == 0) goto L_0x00f9
            r3 = r3 | r17
            r2 = r37
            goto L_0x010c
        L_0x00f9:
            r17 = r11 & r17
            r2 = r37
            if (r17 != 0) goto L_0x010c
            boolean r17 = r1.d(r2)
            if (r17 == 0) goto L_0x0108
            r17 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x010a
        L_0x0108:
            r17 = 33554432(0x2000000, float:9.403955E-38)
        L_0x010a:
            r3 = r3 | r17
        L_0x010c:
            r2 = r12 & 512(0x200, float:7.175E-43)
            r17 = 805306368(0x30000000, float:4.656613E-10)
            if (r2 == 0) goto L_0x0117
            r3 = r3 | r17
        L_0x0114:
            r2 = r38
            goto L_0x012a
        L_0x0117:
            r2 = r11 & r17
            if (r2 != 0) goto L_0x0114
            r2 = r38
            boolean r17 = r1.l(r2)
            if (r17 == 0) goto L_0x0126
            r17 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x0128
        L_0x0126:
            r17 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x0128:
            r3 = r3 | r17
        L_0x012a:
            r17 = 306783379(0x12492493, float:6.34695E-28)
            r2 = r3 & r17
            r5 = 306783378(0x12492492, float:6.3469493E-28)
            r6 = 0
            r17 = 1
            if (r2 == r5) goto L_0x013a
            r2 = r17
            goto L_0x013b
        L_0x013a:
            r2 = r6
        L_0x013b:
            r5 = r3 & 1
            boolean r2 = r1.E(r2, r5)
            if (r2 == 0) goto L_0x0213
            r1.p()
            r2 = r11 & 1
            r5 = -29360129(0xfffffffffe3fffff, float:-6.380294E37)
            if (r2 == 0) goto L_0x0171
            boolean r2 = r1.J()
            if (r2 == 0) goto L_0x0154
            goto L_0x0171
        L_0x0154:
            r1.B()
            r0 = r12 & 4
            if (r0 == 0) goto L_0x015d
            r3 = r3 & -897(0xfffffffffffffc7f, float:NaN)
        L_0x015d:
            r0 = r12 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x0162
            r3 = r3 & r5
        L_0x0162:
            r2 = r30
            r4 = r31
            r9 = r35
            r0 = r36
            r5 = r3
            r7 = r8
            r8 = r14
        L_0x016d:
            r3 = r37
            goto L_0x01c7
        L_0x0171:
            if (r4 == 0) goto L_0x0176
            androidx.compose.ui.Modifier$Companion r2 = androidx.compose.ui.Modifier.f15489d
            goto L_0x0178
        L_0x0176:
            r2 = r30
        L_0x0178:
            r4 = r12 & 4
            if (r4 == 0) goto L_0x0184
            r4 = 3
            androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState r4 = androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridStateKt.a(r6, r6, r1, r6, r4)
            r3 = r3 & -897(0xfffffffffffffc7f, float:NaN)
            goto L_0x0186
        L_0x0184:
            r4 = r31
        L_0x0186:
            if (r7 == 0) goto L_0x0192
            float r7 = (float) r6
            float r7 = androidx.compose.ui.unit.Dp.m(r7)
            androidx.compose.foundation.layout.PaddingValues r7 = androidx.compose.foundation.layout.PaddingKt.a(r7)
            goto L_0x0193
        L_0x0192:
            r7 = r8
        L_0x0193:
            if (r9 == 0) goto L_0x0196
            r10 = r6
        L_0x0196:
            if (r13 == 0) goto L_0x019e
            float r8 = (float) r6
            float r8 = androidx.compose.ui.unit.Dp.m(r8)
            goto L_0x019f
        L_0x019e:
            r8 = r14
        L_0x019f:
            if (r15 == 0) goto L_0x01ad
            androidx.compose.foundation.layout.Arrangement r9 = androidx.compose.foundation.layout.Arrangement.f3739a
            float r13 = (float) r6
            float r13 = androidx.compose.ui.unit.Dp.m(r13)
            androidx.compose.foundation.layout.Arrangement$HorizontalOrVertical r9 = r9.n(r13)
            goto L_0x01af
        L_0x01ad:
            r9 = r35
        L_0x01af:
            r13 = r12 & 128(0x80, float:1.794E-43)
            if (r13 == 0) goto L_0x01bc
            androidx.compose.foundation.gestures.ScrollableDefaults r13 = androidx.compose.foundation.gestures.ScrollableDefaults.f3558a
            r14 = 6
            androidx.compose.foundation.gestures.FlingBehavior r13 = r13.a(r1, r14)
            r3 = r3 & r5
            goto L_0x01be
        L_0x01bc:
            r13 = r36
        L_0x01be:
            r5 = r3
            if (r0 == 0) goto L_0x01c5
            r0 = r13
            r3 = r17
            goto L_0x01c7
        L_0x01c5:
            r0 = r13
            goto L_0x016d
        L_0x01c7:
            r1.U()
            boolean r13 = androidx.compose.runtime.ComposerKt.P()
            if (r13 == 0) goto L_0x01d9
            r13 = -1
            java.lang.String r14 = "androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid (LazyStaggeredGridDsl.kt:111)"
            r15 = 1695323794(0x650c9692, float:4.1494302E22)
            androidx.compose.runtime.ComposerKt.Y(r15, r5, r13, r14)
        L_0x01d9:
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
            if (r5 == 0) goto L_0x0208
            androidx.compose.runtime.ComposerKt.X()
        L_0x0208:
            r6 = r8
            r5 = r10
            r8 = r0
            r28 = r9
            r9 = r3
            r3 = r4
            r4 = r7
            r7 = r28
            goto L_0x0223
        L_0x0213:
            r1.B()
            r2 = r30
            r3 = r31
            r7 = r35
            r9 = r37
            r4 = r8
            r5 = r10
            r6 = r14
            r8 = r36
        L_0x0223:
            androidx.compose.runtime.ScopeUpdateScope r13 = r1.x()
            if (r13 == 0) goto L_0x023a
            androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt$LazyVerticalStaggeredGrid$2 r14 = new androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt$LazyVerticalStaggeredGrid$2
            r0 = r14
            r1 = r29
            r10 = r38
            r11 = r40
            r12 = r41
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            r13.a(r14)
        L_0x023a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt.d(androidx.compose.foundation.lazy.staggeredgrid.StaggeredGridCells, androidx.compose.ui.Modifier, androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState, androidx.compose.foundation.layout.PaddingValues, boolean, float, androidx.compose.foundation.layout.Arrangement$Horizontal, androidx.compose.foundation.gestures.FlingBehavior, boolean, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final LazyGridStaggeredGridSlotsProvider e(StaggeredGridCells staggeredGridCells, Arrangement.Horizontal horizontal, PaddingValues paddingValues, Composer composer, int i2) {
        if (ComposerKt.P()) {
            ComposerKt.Y(-1267076841, i2, -1, "androidx.compose.foundation.lazy.staggeredgrid.rememberColumnSlots (LazyStaggeredGridDsl.kt:134)");
        }
        boolean z2 = false;
        boolean z3 = ((((i2 & 14) ^ 6) > 4 && composer.W(staggeredGridCells)) || (i2 & 6) == 4) | ((((i2 & 112) ^ 48) > 32 && composer.W(horizontal)) || (i2 & 48) == 32);
        if ((((i2 & 896) ^ 384) > 256 && composer.W(paddingValues)) || (i2 & 384) == 256) {
            z2 = true;
        }
        boolean z4 = z3 | z2;
        Object g2 = composer.g();
        if (z4 || g2 == Composer.f14567a.a()) {
            g2 = new LazyStaggeredGridSlotCache(new LazyStaggeredGridDslKt$rememberColumnSlots$1$1(paddingValues, staggeredGridCells, horizontal));
            composer.N(g2);
        }
        LazyGridStaggeredGridSlotsProvider lazyGridStaggeredGridSlotsProvider = (LazyGridStaggeredGridSlotsProvider) g2;
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
        return lazyGridStaggeredGridSlotsProvider;
    }

    public static final LazyGridStaggeredGridSlotsProvider f(StaggeredGridCells staggeredGridCells, Arrangement.Vertical vertical, PaddingValues paddingValues, Composer composer, int i2) {
        if (ComposerKt.P()) {
            ComposerKt.Y(-1532383053, i2, -1, "androidx.compose.foundation.lazy.staggeredgrid.rememberRowSlots (LazyStaggeredGridDsl.kt:259)");
        }
        boolean z2 = false;
        boolean z3 = ((((i2 & 14) ^ 6) > 4 && composer.W(staggeredGridCells)) || (i2 & 6) == 4) | ((((i2 & 112) ^ 48) > 32 && composer.W(vertical)) || (i2 & 48) == 32);
        if ((((i2 & 896) ^ 384) > 256 && composer.W(paddingValues)) || (i2 & 384) == 256) {
            z2 = true;
        }
        boolean z4 = z3 | z2;
        Object g2 = composer.g();
        if (z4 || g2 == Composer.f14567a.a()) {
            g2 = new LazyStaggeredGridSlotCache(new LazyStaggeredGridDslKt$rememberRowSlots$1$1(paddingValues, staggeredGridCells, vertical));
            composer.N(g2);
        }
        LazyGridStaggeredGridSlotsProvider lazyGridStaggeredGridSlotsProvider = (LazyGridStaggeredGridSlotsProvider) g2;
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
        return lazyGridStaggeredGridSlotsProvider;
    }
}
