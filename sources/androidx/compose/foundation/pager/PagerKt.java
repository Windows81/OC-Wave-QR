package androidx.compose.foundation.pager;

import androidx.compose.foundation.gestures.snapping.SnapPosition;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.math.MathKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;

@Metadata
public final class PagerKt {
    /* JADX WARNING: Removed duplicated region for block: B:110:0x0147  */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x014c  */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x0166  */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x0180  */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x0189  */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x018e  */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x01a5  */
    /* JADX WARNING: Removed duplicated region for block: B:151:0x01b9  */
    /* JADX WARNING: Removed duplicated region for block: B:154:0x01bf  */
    /* JADX WARNING: Removed duplicated region for block: B:156:0x01c4  */
    /* JADX WARNING: Removed duplicated region for block: B:166:0x01eb  */
    /* JADX WARNING: Removed duplicated region for block: B:167:0x01ed  */
    /* JADX WARNING: Removed duplicated region for block: B:170:0x01f7  */
    /* JADX WARNING: Removed duplicated region for block: B:233:0x03c0  */
    /* JADX WARNING: Removed duplicated region for block: B:236:0x03e1  */
    /* JADX WARNING: Removed duplicated region for block: B:238:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00a5  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00aa  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00c3  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00c8  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x00e1  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x00f7  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x00ff  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0104  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x011d  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x0126  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void a(androidx.compose.foundation.pager.PagerState r37, androidx.compose.ui.Modifier r38, androidx.compose.foundation.layout.PaddingValues r39, androidx.compose.foundation.pager.PageSize r40, int r41, float r42, androidx.compose.ui.Alignment.Vertical r43, androidx.compose.foundation.gestures.TargetedFlingBehavior r44, boolean r45, boolean r46, kotlin.jvm.functions.Function1 r47, androidx.compose.ui.input.nestedscroll.NestedScrollConnection r48, androidx.compose.foundation.gestures.snapping.SnapPosition r49, androidx.compose.foundation.OverscrollEffect r50, kotlin.jvm.functions.Function4 r51, androidx.compose.runtime.Composer r52, int r53, int r54, int r55) {
        /*
            r15 = r37
            r14 = r53
            r12 = r54
            r11 = r55
            r9 = -1372972868(0xffffffffae2a18bc, float:-3.8675493E-11)
            r0 = r52
            androidx.compose.runtime.Composer r10 = r0.q(r9)
            r0 = r11 & 1
            if (r0 == 0) goto L_0x0018
            r0 = r14 | 6
            goto L_0x0028
        L_0x0018:
            r0 = r14 & 6
            if (r0 != 0) goto L_0x0027
            boolean r0 = r10.W(r15)
            if (r0 == 0) goto L_0x0024
            r0 = 4
            goto L_0x0025
        L_0x0024:
            r0 = 2
        L_0x0025:
            r0 = r0 | r14
            goto L_0x0028
        L_0x0027:
            r0 = r14
        L_0x0028:
            r3 = r11 & 2
            if (r3 == 0) goto L_0x0031
            r0 = r0 | 48
        L_0x002e:
            r6 = r38
            goto L_0x0043
        L_0x0031:
            r6 = r14 & 48
            if (r6 != 0) goto L_0x002e
            r6 = r38
            boolean r7 = r10.W(r6)
            if (r7 == 0) goto L_0x0040
            r7 = 32
            goto L_0x0042
        L_0x0040:
            r7 = 16
        L_0x0042:
            r0 = r0 | r7
        L_0x0043:
            r7 = r11 & 4
            if (r7 == 0) goto L_0x004c
            r0 = r0 | 384(0x180, float:5.38E-43)
        L_0x0049:
            r1 = r39
            goto L_0x005f
        L_0x004c:
            r1 = r14 & 384(0x180, float:5.38E-43)
            if (r1 != 0) goto L_0x0049
            r1 = r39
            boolean r16 = r10.W(r1)
            if (r16 == 0) goto L_0x005b
            r16 = 256(0x100, float:3.59E-43)
            goto L_0x005d
        L_0x005b:
            r16 = 128(0x80, float:1.794E-43)
        L_0x005d:
            r0 = r0 | r16
        L_0x005f:
            r16 = r11 & 8
            r17 = 1024(0x400, float:1.435E-42)
            r18 = 2048(0x800, float:2.87E-42)
            if (r16 == 0) goto L_0x006c
            r0 = r0 | 3072(0xc00, float:4.305E-42)
        L_0x0069:
            r2 = r40
            goto L_0x007f
        L_0x006c:
            r2 = r14 & 3072(0xc00, float:4.305E-42)
            if (r2 != 0) goto L_0x0069
            r2 = r40
            boolean r20 = r10.W(r2)
            if (r20 == 0) goto L_0x007b
            r20 = r18
            goto L_0x007d
        L_0x007b:
            r20 = r17
        L_0x007d:
            r0 = r0 | r20
        L_0x007f:
            r20 = r11 & 16
            r21 = 16384(0x4000, float:2.2959E-41)
            r22 = 8192(0x2000, float:1.14794E-41)
            if (r20 == 0) goto L_0x008c
            r0 = r0 | 24576(0x6000, float:3.4438E-41)
        L_0x0089:
            r4 = r41
            goto L_0x009f
        L_0x008c:
            r4 = r14 & 24576(0x6000, float:3.4438E-41)
            if (r4 != 0) goto L_0x0089
            r4 = r41
            boolean r24 = r10.i(r4)
            if (r24 == 0) goto L_0x009b
            r24 = r21
            goto L_0x009d
        L_0x009b:
            r24 = r22
        L_0x009d:
            r0 = r0 | r24
        L_0x009f:
            r24 = r11 & 32
            r25 = 196608(0x30000, float:2.75506E-40)
            if (r24 == 0) goto L_0x00aa
            r0 = r0 | r25
            r5 = r42
            goto L_0x00bd
        L_0x00aa:
            r26 = r14 & r25
            r5 = r42
            if (r26 != 0) goto L_0x00bd
            boolean r27 = r10.h(r5)
            if (r27 == 0) goto L_0x00b9
            r27 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00bb
        L_0x00b9:
            r27 = 65536(0x10000, float:9.18355E-41)
        L_0x00bb:
            r0 = r0 | r27
        L_0x00bd:
            r27 = r11 & 64
            r28 = 1572864(0x180000, float:2.204052E-39)
            if (r27 == 0) goto L_0x00c8
            r0 = r0 | r28
            r8 = r43
            goto L_0x00db
        L_0x00c8:
            r28 = r14 & r28
            r8 = r43
            if (r28 != 0) goto L_0x00db
            boolean r29 = r10.W(r8)
            if (r29 == 0) goto L_0x00d7
            r29 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00d9
        L_0x00d7:
            r29 = 524288(0x80000, float:7.34684E-40)
        L_0x00d9:
            r0 = r0 | r29
        L_0x00db:
            r29 = 12582912(0xc00000, float:1.7632415E-38)
            r29 = r14 & r29
            if (r29 != 0) goto L_0x00f7
            r13 = r11 & 128(0x80, float:1.794E-43)
            if (r13 != 0) goto L_0x00f0
            r13 = r44
            boolean r30 = r10.W(r13)
            if (r30 == 0) goto L_0x00f2
            r30 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00f4
        L_0x00f0:
            r13 = r44
        L_0x00f2:
            r30 = 4194304(0x400000, float:5.877472E-39)
        L_0x00f4:
            r0 = r0 | r30
            goto L_0x00f9
        L_0x00f7:
            r13 = r44
        L_0x00f9:
            r9 = r11 & 256(0x100, float:3.59E-43)
            r31 = 100663296(0x6000000, float:2.4074124E-35)
            if (r9 == 0) goto L_0x0104
            r0 = r0 | r31
            r8 = r45
            goto L_0x0117
        L_0x0104:
            r31 = r14 & r31
            r8 = r45
            if (r31 != 0) goto L_0x0117
            boolean r31 = r10.d(r8)
            if (r31 == 0) goto L_0x0113
            r31 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x0115
        L_0x0113:
            r31 = 33554432(0x2000000, float:9.403955E-38)
        L_0x0115:
            r0 = r0 | r31
        L_0x0117:
            r8 = r11 & 512(0x200, float:7.175E-43)
            r31 = 805306368(0x30000000, float:4.656613E-10)
            if (r8 == 0) goto L_0x0126
            r0 = r0 | r31
            r32 = r0
            r31 = r8
            r8 = r46
            goto L_0x0143
        L_0x0126:
            r31 = r14 & r31
            if (r31 != 0) goto L_0x013e
            r31 = r8
            r8 = r46
            boolean r32 = r10.d(r8)
            if (r32 == 0) goto L_0x0137
            r32 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x0139
        L_0x0137:
            r32 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x0139:
            r0 = r0 | r32
        L_0x013b:
            r32 = r0
            goto L_0x0143
        L_0x013e:
            r31 = r8
            r8 = r46
            goto L_0x013b
        L_0x0143:
            r0 = r11 & 1024(0x400, float:1.435E-42)
            if (r0 == 0) goto L_0x014c
            r19 = r12 | 6
            r8 = r47
            goto L_0x0162
        L_0x014c:
            r33 = r12 & 6
            r8 = r47
            if (r33 != 0) goto L_0x0160
            boolean r33 = r10.l(r8)
            if (r33 == 0) goto L_0x015b
            r19 = 4
            goto L_0x015d
        L_0x015b:
            r19 = 2
        L_0x015d:
            r19 = r12 | r19
            goto L_0x0162
        L_0x0160:
            r19 = r12
        L_0x0162:
            r33 = r12 & 48
            if (r33 != 0) goto L_0x0180
            r33 = r0
            r0 = r11 & 2048(0x800, float:2.87E-42)
            if (r0 != 0) goto L_0x0177
            r0 = r48
            boolean r34 = r10.l(r0)
            if (r34 == 0) goto L_0x0179
            r23 = 32
            goto L_0x017b
        L_0x0177:
            r0 = r48
        L_0x0179:
            r23 = 16
        L_0x017b:
            r19 = r19 | r23
        L_0x017d:
            r0 = r19
            goto L_0x0185
        L_0x0180:
            r33 = r0
            r0 = r48
            goto L_0x017d
        L_0x0185:
            r8 = r11 & 4096(0x1000, float:5.74E-42)
            if (r8 == 0) goto L_0x018e
            r0 = r0 | 384(0x180, float:5.38E-43)
        L_0x018b:
            r1 = r49
            goto L_0x01a1
        L_0x018e:
            r1 = r12 & 384(0x180, float:5.38E-43)
            if (r1 != 0) goto L_0x018b
            r1 = r49
            boolean r19 = r10.W(r1)
            if (r19 == 0) goto L_0x019d
            r29 = 256(0x100, float:3.59E-43)
            goto L_0x019f
        L_0x019d:
            r29 = 128(0x80, float:1.794E-43)
        L_0x019f:
            r0 = r0 | r29
        L_0x01a1:
            r1 = r12 & 3072(0xc00, float:4.305E-42)
            if (r1 != 0) goto L_0x01b9
            r1 = r11 & 8192(0x2000, float:1.14794E-41)
            if (r1 != 0) goto L_0x01b4
            r1 = r50
            boolean r19 = r10.W(r1)
            if (r19 == 0) goto L_0x01b6
            r17 = r18
            goto L_0x01b6
        L_0x01b4:
            r1 = r50
        L_0x01b6:
            r0 = r0 | r17
            goto L_0x01bb
        L_0x01b9:
            r1 = r50
        L_0x01bb:
            r1 = r11 & 16384(0x4000, float:2.2959E-41)
            if (r1 == 0) goto L_0x01c4
            r0 = r0 | 24576(0x6000, float:3.4438E-41)
        L_0x01c1:
            r1 = r51
            goto L_0x01d5
        L_0x01c4:
            r1 = r12 & 24576(0x6000, float:3.4438E-41)
            if (r1 != 0) goto L_0x01c1
            r1 = r51
            boolean r17 = r10.l(r1)
            if (r17 == 0) goto L_0x01d1
            goto L_0x01d3
        L_0x01d1:
            r21 = r22
        L_0x01d3:
            r0 = r0 | r21
        L_0x01d5:
            r17 = 306783379(0x12492493, float:6.34695E-28)
            r1 = r32 & r17
            r2 = 306783378(0x12492492, float:6.3469493E-28)
            r17 = r8
            r8 = 0
            r18 = 1
            if (r1 != r2) goto L_0x01ed
            r1 = r0 & 9363(0x2493, float:1.312E-41)
            r2 = 9362(0x2492, float:1.3119E-41)
            if (r1 == r2) goto L_0x01eb
            goto L_0x01ed
        L_0x01eb:
            r1 = r8
            goto L_0x01ef
        L_0x01ed:
            r1 = r18
        L_0x01ef:
            r2 = r32 & 1
            boolean r1 = r10.E(r1, r2)
            if (r1 == 0) goto L_0x03c0
            r10.p()
            r1 = r14 & 1
            if (r1 == 0) goto L_0x023b
            boolean r1 = r10.J()
            if (r1 == 0) goto L_0x0205
            goto L_0x023b
        L_0x0205:
            r10.B()
            r1 = r11 & 128(0x80, float:1.794E-43)
            if (r1 == 0) goto L_0x0211
            r1 = -29360129(0xfffffffffe3fffff, float:-6.380294E37)
            r32 = r32 & r1
        L_0x0211:
            r1 = r11 & 2048(0x800, float:2.87E-42)
            if (r1 == 0) goto L_0x0217
            r0 = r0 & -113(0xffffffffffffff8f, float:NaN)
        L_0x0217:
            r1 = r11 & 8192(0x2000, float:1.14794E-41)
            if (r1 == 0) goto L_0x021d
            r0 = r0 & -7169(0xffffffffffffe3ff, float:NaN)
        L_0x021d:
            r22 = r39
            r23 = r40
            r26 = r43
            r28 = r45
            r29 = r46
            r31 = r47
            r33 = r49
            r34 = r50
            r24 = r4
            r25 = r5
            r21 = r6
            r27 = r13
            r1 = r32
            r32 = r48
            goto L_0x0310
        L_0x023b:
            if (r3 == 0) goto L_0x0242
            androidx.compose.ui.Modifier$Companion r1 = androidx.compose.ui.Modifier.f15489d
            r19 = r1
            goto L_0x0244
        L_0x0242:
            r19 = r6
        L_0x0244:
            if (r7 == 0) goto L_0x0252
            float r1 = (float) r8
            float r1 = androidx.compose.ui.unit.Dp.m(r1)
            androidx.compose.foundation.layout.PaddingValues r1 = androidx.compose.foundation.layout.PaddingKt.a(r1)
            r21 = r1
            goto L_0x0254
        L_0x0252:
            r21 = r39
        L_0x0254:
            if (r16 == 0) goto L_0x025b
            androidx.compose.foundation.pager.PageSize$Fill r1 = androidx.compose.foundation.pager.PageSize.Fill.f5258a
            r16 = r1
            goto L_0x025d
        L_0x025b:
            r16 = r40
        L_0x025d:
            if (r20 == 0) goto L_0x0262
            r20 = r8
            goto L_0x0264
        L_0x0262:
            r20 = r4
        L_0x0264:
            if (r24 == 0) goto L_0x026e
            float r1 = (float) r8
            float r1 = androidx.compose.ui.unit.Dp.m(r1)
            r22 = r1
            goto L_0x0270
        L_0x026e:
            r22 = r5
        L_0x0270:
            if (r27 == 0) goto L_0x027b
            androidx.compose.ui.Alignment$Companion r1 = androidx.compose.ui.Alignment.f15444a
            androidx.compose.ui.Alignment$Vertical r1 = r1.i()
            r23 = r1
            goto L_0x027d
        L_0x027b:
            r23 = r43
        L_0x027d:
            r1 = r11 & 128(0x80, float:1.794E-43)
            if (r1 == 0) goto L_0x02a6
            androidx.compose.foundation.pager.PagerDefaults r1 = androidx.compose.foundation.pager.PagerDefaults.f5265a
            r2 = r32 & 14
            r7 = r2 | r25
            r13 = 30
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r24 = r0
            r25 = r33
            r0 = r1
            r1 = r37
            r6 = r10
            r12 = r8
            r26 = r17
            r17 = r31
            r8 = r13
            androidx.compose.foundation.gestures.TargetedFlingBehavior r0 = r0.a(r1, r2, r3, r4, r5, r6, r7, r8)
            r1 = -29360129(0xfffffffffe3fffff, float:-6.380294E37)
            r32 = r32 & r1
            r13 = r0
            goto L_0x02af
        L_0x02a6:
            r24 = r0
            r12 = r8
            r26 = r17
            r17 = r31
            r25 = r33
        L_0x02af:
            if (r9 == 0) goto L_0x02b2
            goto L_0x02b4
        L_0x02b2:
            r18 = r45
        L_0x02b4:
            if (r17 == 0) goto L_0x02b8
            r0 = r12
            goto L_0x02ba
        L_0x02b8:
            r0 = r46
        L_0x02ba:
            if (r25 == 0) goto L_0x02be
            r1 = 0
            goto L_0x02c0
        L_0x02be:
            r1 = r47
        L_0x02c0:
            r2 = r11 & 2048(0x800, float:2.87E-42)
            if (r2 == 0) goto L_0x02d3
            androidx.compose.foundation.pager.PagerDefaults r2 = androidx.compose.foundation.pager.PagerDefaults.f5265a
            androidx.compose.foundation.gestures.Orientation r3 = androidx.compose.foundation.gestures.Orientation.Horizontal
            r4 = r32 & 14
            r4 = r4 | 432(0x1b0, float:6.05E-43)
            androidx.compose.ui.input.nestedscroll.NestedScrollConnection r2 = r2.b(r15, r3, r10, r4)
            r3 = r24 & -113(0xffffffffffffff8f, float:NaN)
            goto L_0x02d7
        L_0x02d3:
            r2 = r48
            r3 = r24
        L_0x02d7:
            if (r26 == 0) goto L_0x02dc
            androidx.compose.foundation.gestures.snapping.SnapPosition$Start r4 = androidx.compose.foundation.gestures.snapping.SnapPosition.Start.f3677a
            goto L_0x02de
        L_0x02dc:
            r4 = r49
        L_0x02de:
            r5 = r11 & 8192(0x2000, float:1.14794E-41)
            if (r5 == 0) goto L_0x0306
            androidx.compose.foundation.OverscrollEffect r5 = androidx.compose.foundation.OverscrollKt.b(r10, r12)
            r3 = r3 & -7169(0xffffffffffffe3ff, float:NaN)
            r29 = r0
            r31 = r1
            r0 = r3
            r33 = r4
            r34 = r5
        L_0x02f1:
            r27 = r13
            r28 = r18
            r24 = r20
            r25 = r22
            r26 = r23
            r1 = r32
            r32 = r2
            r23 = r16
            r22 = r21
            r21 = r19
            goto L_0x0310
        L_0x0306:
            r34 = r50
            r29 = r0
            r31 = r1
            r0 = r3
            r33 = r4
            goto L_0x02f1
        L_0x0310:
            r10.U()
            boolean r2 = androidx.compose.runtime.ComposerKt.P()
            if (r2 == 0) goto L_0x0321
            java.lang.String r2 = "androidx.compose.foundation.pager.HorizontalPager (Pager.kt:129)"
            r3 = -1372972868(0xffffffffae2a18bc, float:-3.8675493E-11)
            androidx.compose.runtime.ComposerKt.Y(r3, r1, r0, r2)
        L_0x0321:
            androidx.compose.foundation.gestures.Orientation r4 = androidx.compose.foundation.gestures.Orientation.Horizontal
            androidx.compose.ui.Alignment$Companion r2 = androidx.compose.ui.Alignment.f15444a
            androidx.compose.ui.Alignment$Horizontal r13 = r2.g()
            int r2 = r1 >> 3
            r2 = r2 & 14
            r2 = r2 | 24576(0x6000, float:3.4438E-41)
            int r3 = r1 << 3
            r3 = r3 & 112(0x70, float:1.57E-43)
            r2 = r2 | r3
            r3 = r1 & 896(0x380, float:1.256E-42)
            r2 = r2 | r3
            int r3 = r1 >> 18
            r3 = r3 & 7168(0x1c00, float:1.0045E-41)
            r2 = r2 | r3
            int r3 = r1 >> 6
            r5 = 458752(0x70000, float:6.42848E-40)
            r5 = r5 & r3
            r2 = r2 | r5
            r5 = 3670016(0x380000, float:5.142788E-39)
            r5 = r5 & r3
            r2 = r2 | r5
            int r5 = r0 << 12
            r6 = 29360128(0x1c00000, float:7.052966E-38)
            r5 = r5 & r6
            r2 = r2 | r5
            int r5 = r1 << 12
            r6 = 234881024(0xe000000, float:1.5777218E-30)
            r6 = r6 & r5
            r2 = r2 | r6
            r6 = 1879048192(0x70000000, float:1.58456325E29)
            r5 = r5 & r6
            r18 = r2 | r5
            int r1 = r1 >> 9
            r1 = r1 & 14
            r1 = r1 | 3072(0xc00, float:4.305E-42)
            r2 = r0 & 112(0x70, float:1.57E-43)
            r1 = r1 | r2
            int r2 = r0 << 6
            r5 = r2 & 896(0x380, float:1.256E-42)
            r1 = r1 | r5
            r5 = 57344(0xe000, float:8.0356E-41)
            r3 = r3 & r5
            r1 = r1 | r3
            int r0 = r0 << 9
            r3 = 458752(0x70000, float:6.42848E-40)
            r0 = r0 & r3
            r0 = r0 | r1
            r1 = 3670016(0x380000, float:5.142788E-39)
            r1 = r1 & r2
            r19 = r0 | r1
            r20 = 0
            r0 = r21
            r1 = r37
            r2 = r22
            r3 = r29
            r5 = r27
            r6 = r28
            r7 = r34
            r8 = r24
            r9 = r25
            r30 = r10
            r10 = r23
            r11 = r32
            r12 = r31
            r14 = r26
            r15 = r33
            r16 = r51
            r17 = r30
            androidx.compose.foundation.pager.LazyLayoutPagerKt.a(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x03a5
            androidx.compose.runtime.ComposerKt.X()
        L_0x03a5:
            r2 = r21
            r3 = r22
            r4 = r23
            r5 = r24
            r6 = r25
            r7 = r26
            r8 = r27
            r9 = r28
            r10 = r29
            r11 = r31
            r12 = r32
            r13 = r33
            r14 = r34
            goto L_0x03db
        L_0x03c0:
            r30 = r10
            r30.B()
            r3 = r39
            r7 = r43
            r9 = r45
            r10 = r46
            r11 = r47
            r12 = r48
            r14 = r50
            r2 = r6
            r8 = r13
            r13 = r49
            r6 = r5
            r5 = r4
            r4 = r40
        L_0x03db:
            androidx.compose.runtime.ScopeUpdateScope r15 = r30.x()
            if (r15 == 0) goto L_0x03fc
            androidx.compose.foundation.pager.PagerKt$HorizontalPager$1 r1 = new androidx.compose.foundation.pager.PagerKt$HorizontalPager$1
            r0 = r1
            r35 = r1
            r1 = r37
            r36 = r15
            r15 = r51
            r16 = r53
            r17 = r54
            r18 = r55
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            r1 = r35
            r0 = r36
            r0.a(r1)
        L_0x03fc:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.pager.PagerKt.a(androidx.compose.foundation.pager.PagerState, androidx.compose.ui.Modifier, androidx.compose.foundation.layout.PaddingValues, androidx.compose.foundation.pager.PageSize, int, float, androidx.compose.ui.Alignment$Vertical, androidx.compose.foundation.gestures.TargetedFlingBehavior, boolean, boolean, kotlin.jvm.functions.Function1, androidx.compose.ui.input.nestedscroll.NestedScrollConnection, androidx.compose.foundation.gestures.snapping.SnapPosition, androidx.compose.foundation.OverscrollEffect, kotlin.jvm.functions.Function4, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:110:0x0143  */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x0148  */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x0162  */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x017c  */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x0185  */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x018a  */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x01a1  */
    /* JADX WARNING: Removed duplicated region for block: B:146:0x01a6  */
    /* JADX WARNING: Removed duplicated region for block: B:156:0x01cc  */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x01ce  */
    /* JADX WARNING: Removed duplicated region for block: B:160:0x01d8  */
    /* JADX WARNING: Removed duplicated region for block: B:216:0x0339  */
    /* JADX WARNING: Removed duplicated region for block: B:219:0x0358  */
    /* JADX WARNING: Removed duplicated region for block: B:221:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00a1  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00a6  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00bf  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00c4  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x00dd  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x00f3  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x00fb  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0100  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x0119  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x0122  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final /* synthetic */ void b(androidx.compose.foundation.pager.PagerState r35, androidx.compose.ui.Modifier r36, androidx.compose.foundation.layout.PaddingValues r37, androidx.compose.foundation.pager.PageSize r38, int r39, float r40, androidx.compose.ui.Alignment.Vertical r41, androidx.compose.foundation.gestures.TargetedFlingBehavior r42, boolean r43, boolean r44, kotlin.jvm.functions.Function1 r45, androidx.compose.ui.input.nestedscroll.NestedScrollConnection r46, androidx.compose.foundation.gestures.snapping.SnapPosition r47, kotlin.jvm.functions.Function4 r48, androidx.compose.runtime.Composer r49, int r50, int r51, int r52) {
        /*
            r15 = r35
            r14 = r50
            r12 = r51
            r11 = r52
            r9 = 1870896258(0x6f839c82, float:8.1463485E28)
            r0 = r49
            androidx.compose.runtime.Composer r10 = r0.q(r9)
            r0 = r11 & 1
            if (r0 == 0) goto L_0x0018
            r0 = r14 | 6
            goto L_0x0028
        L_0x0018:
            r0 = r14 & 6
            if (r0 != 0) goto L_0x0027
            boolean r0 = r10.W(r15)
            if (r0 == 0) goto L_0x0024
            r0 = 4
            goto L_0x0025
        L_0x0024:
            r0 = 2
        L_0x0025:
            r0 = r0 | r14
            goto L_0x0028
        L_0x0027:
            r0 = r14
        L_0x0028:
            r3 = r11 & 2
            if (r3 == 0) goto L_0x0031
            r0 = r0 | 48
        L_0x002e:
            r6 = r36
            goto L_0x0043
        L_0x0031:
            r6 = r14 & 48
            if (r6 != 0) goto L_0x002e
            r6 = r36
            boolean r7 = r10.W(r6)
            if (r7 == 0) goto L_0x0040
            r7 = 32
            goto L_0x0042
        L_0x0040:
            r7 = 16
        L_0x0042:
            r0 = r0 | r7
        L_0x0043:
            r7 = r11 & 4
            if (r7 == 0) goto L_0x004c
            r0 = r0 | 384(0x180, float:5.38E-43)
        L_0x0049:
            r1 = r37
            goto L_0x005f
        L_0x004c:
            r1 = r14 & 384(0x180, float:5.38E-43)
            if (r1 != 0) goto L_0x0049
            r1 = r37
            boolean r16 = r10.W(r1)
            if (r16 == 0) goto L_0x005b
            r16 = 256(0x100, float:3.59E-43)
            goto L_0x005d
        L_0x005b:
            r16 = 128(0x80, float:1.794E-43)
        L_0x005d:
            r0 = r0 | r16
        L_0x005f:
            r16 = r11 & 8
            r17 = 1024(0x400, float:1.435E-42)
            r18 = 2048(0x800, float:2.87E-42)
            if (r16 == 0) goto L_0x006c
            r0 = r0 | 3072(0xc00, float:4.305E-42)
        L_0x0069:
            r2 = r38
            goto L_0x007f
        L_0x006c:
            r2 = r14 & 3072(0xc00, float:4.305E-42)
            if (r2 != 0) goto L_0x0069
            r2 = r38
            boolean r20 = r10.W(r2)
            if (r20 == 0) goto L_0x007b
            r20 = r18
            goto L_0x007d
        L_0x007b:
            r20 = r17
        L_0x007d:
            r0 = r0 | r20
        L_0x007f:
            r20 = r11 & 16
            if (r20 == 0) goto L_0x0088
            r0 = r0 | 24576(0x6000, float:3.4438E-41)
        L_0x0085:
            r4 = r39
            goto L_0x009b
        L_0x0088:
            r4 = r14 & 24576(0x6000, float:3.4438E-41)
            if (r4 != 0) goto L_0x0085
            r4 = r39
            boolean r22 = r10.i(r4)
            if (r22 == 0) goto L_0x0097
            r22 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0099
        L_0x0097:
            r22 = 8192(0x2000, float:1.14794E-41)
        L_0x0099:
            r0 = r0 | r22
        L_0x009b:
            r22 = r11 & 32
            r23 = 196608(0x30000, float:2.75506E-40)
            if (r22 == 0) goto L_0x00a6
            r0 = r0 | r23
            r5 = r40
            goto L_0x00b9
        L_0x00a6:
            r24 = r14 & r23
            r5 = r40
            if (r24 != 0) goto L_0x00b9
            boolean r25 = r10.h(r5)
            if (r25 == 0) goto L_0x00b5
            r25 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00b7
        L_0x00b5:
            r25 = 65536(0x10000, float:9.18355E-41)
        L_0x00b7:
            r0 = r0 | r25
        L_0x00b9:
            r25 = r11 & 64
            r26 = 1572864(0x180000, float:2.204052E-39)
            if (r25 == 0) goto L_0x00c4
            r0 = r0 | r26
            r8 = r41
            goto L_0x00d7
        L_0x00c4:
            r26 = r14 & r26
            r8 = r41
            if (r26 != 0) goto L_0x00d7
            boolean r27 = r10.W(r8)
            if (r27 == 0) goto L_0x00d3
            r27 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00d5
        L_0x00d3:
            r27 = 524288(0x80000, float:7.34684E-40)
        L_0x00d5:
            r0 = r0 | r27
        L_0x00d7:
            r27 = 12582912(0xc00000, float:1.7632415E-38)
            r27 = r14 & r27
            if (r27 != 0) goto L_0x00f3
            r13 = r11 & 128(0x80, float:1.794E-43)
            if (r13 != 0) goto L_0x00ec
            r13 = r42
            boolean r28 = r10.W(r13)
            if (r28 == 0) goto L_0x00ee
            r28 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00f0
        L_0x00ec:
            r13 = r42
        L_0x00ee:
            r28 = 4194304(0x400000, float:5.877472E-39)
        L_0x00f0:
            r0 = r0 | r28
            goto L_0x00f5
        L_0x00f3:
            r13 = r42
        L_0x00f5:
            r9 = r11 & 256(0x100, float:3.59E-43)
            r29 = 100663296(0x6000000, float:2.4074124E-35)
            if (r9 == 0) goto L_0x0100
            r0 = r0 | r29
            r8 = r43
            goto L_0x0113
        L_0x0100:
            r29 = r14 & r29
            r8 = r43
            if (r29 != 0) goto L_0x0113
            boolean r29 = r10.d(r8)
            if (r29 == 0) goto L_0x010f
            r29 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x0111
        L_0x010f:
            r29 = 33554432(0x2000000, float:9.403955E-38)
        L_0x0111:
            r0 = r0 | r29
        L_0x0113:
            r8 = r11 & 512(0x200, float:7.175E-43)
            r29 = 805306368(0x30000000, float:4.656613E-10)
            if (r8 == 0) goto L_0x0122
            r0 = r0 | r29
            r30 = r0
            r29 = r8
            r8 = r44
            goto L_0x013f
        L_0x0122:
            r29 = r14 & r29
            if (r29 != 0) goto L_0x013a
            r29 = r8
            r8 = r44
            boolean r30 = r10.d(r8)
            if (r30 == 0) goto L_0x0133
            r30 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x0135
        L_0x0133:
            r30 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x0135:
            r0 = r0 | r30
        L_0x0137:
            r30 = r0
            goto L_0x013f
        L_0x013a:
            r29 = r8
            r8 = r44
            goto L_0x0137
        L_0x013f:
            r0 = r11 & 1024(0x400, float:1.435E-42)
            if (r0 == 0) goto L_0x0148
            r19 = r12 | 6
            r8 = r45
            goto L_0x015e
        L_0x0148:
            r31 = r12 & 6
            r8 = r45
            if (r31 != 0) goto L_0x015c
            boolean r31 = r10.l(r8)
            if (r31 == 0) goto L_0x0157
            r19 = 4
            goto L_0x0159
        L_0x0157:
            r19 = 2
        L_0x0159:
            r19 = r12 | r19
            goto L_0x015e
        L_0x015c:
            r19 = r12
        L_0x015e:
            r31 = r12 & 48
            if (r31 != 0) goto L_0x017c
            r31 = r0
            r0 = r11 & 2048(0x800, float:2.87E-42)
            if (r0 != 0) goto L_0x0173
            r0 = r46
            boolean r32 = r10.l(r0)
            if (r32 == 0) goto L_0x0175
            r21 = 32
            goto L_0x0177
        L_0x0173:
            r0 = r46
        L_0x0175:
            r21 = 16
        L_0x0177:
            r19 = r19 | r21
        L_0x0179:
            r0 = r19
            goto L_0x0181
        L_0x017c:
            r31 = r0
            r0 = r46
            goto L_0x0179
        L_0x0181:
            r8 = r11 & 4096(0x1000, float:5.74E-42)
            if (r8 == 0) goto L_0x018a
            r0 = r0 | 384(0x180, float:5.38E-43)
        L_0x0187:
            r1 = r47
            goto L_0x019d
        L_0x018a:
            r1 = r12 & 384(0x180, float:5.38E-43)
            if (r1 != 0) goto L_0x0187
            r1 = r47
            boolean r19 = r10.W(r1)
            if (r19 == 0) goto L_0x0199
            r26 = 256(0x100, float:3.59E-43)
            goto L_0x019b
        L_0x0199:
            r26 = 128(0x80, float:1.794E-43)
        L_0x019b:
            r0 = r0 | r26
        L_0x019d:
            r1 = r11 & 8192(0x2000, float:1.14794E-41)
            if (r1 == 0) goto L_0x01a6
            r0 = r0 | 3072(0xc00, float:4.305E-42)
        L_0x01a3:
            r1 = r48
            goto L_0x01b6
        L_0x01a6:
            r1 = r12 & 3072(0xc00, float:4.305E-42)
            if (r1 != 0) goto L_0x01a3
            r1 = r48
            boolean r19 = r10.l(r1)
            if (r19 == 0) goto L_0x01b4
            r17 = r18
        L_0x01b4:
            r0 = r0 | r17
        L_0x01b6:
            r17 = 306783379(0x12492493, float:6.34695E-28)
            r1 = r30 & r17
            r2 = 306783378(0x12492492, float:6.3469493E-28)
            r17 = r8
            r8 = 0
            r18 = 1
            if (r1 != r2) goto L_0x01ce
            r1 = r0 & 1171(0x493, float:1.641E-42)
            r2 = 1170(0x492, float:1.64E-42)
            if (r1 == r2) goto L_0x01cc
            goto L_0x01ce
        L_0x01cc:
            r1 = r8
            goto L_0x01d0
        L_0x01ce:
            r1 = r18
        L_0x01d0:
            r2 = r30 & 1
            boolean r1 = r10.E(r1, r2)
            if (r1 == 0) goto L_0x0339
            r10.p()
            r1 = r14 & 1
            r19 = -29360129(0xfffffffffe3fffff, float:-6.380294E37)
            if (r1 == 0) goto L_0x0215
            boolean r1 = r10.J()
            if (r1 == 0) goto L_0x01e9
            goto L_0x0215
        L_0x01e9:
            r10.B()
            r1 = r11 & 128(0x80, float:1.794E-43)
            if (r1 == 0) goto L_0x01f2
            r30 = r30 & r19
        L_0x01f2:
            r1 = r11 & 2048(0x800, float:2.87E-42)
            if (r1 == 0) goto L_0x01f8
            r0 = r0 & -113(0xffffffffffffff8f, float:NaN)
        L_0x01f8:
            r24 = r37
            r19 = r38
            r25 = r41
            r26 = r43
            r27 = r44
            r29 = r45
            r31 = r47
            r20 = r4
            r22 = r5
            r21 = r6
            r12 = r8
            r23 = r13
            r1 = r30
            r30 = r46
            goto L_0x02ce
        L_0x0215:
            if (r3 == 0) goto L_0x021c
            androidx.compose.ui.Modifier$Companion r1 = androidx.compose.ui.Modifier.f15489d
            r21 = r1
            goto L_0x021e
        L_0x021c:
            r21 = r6
        L_0x021e:
            if (r7 == 0) goto L_0x022c
            float r1 = (float) r8
            float r1 = androidx.compose.ui.unit.Dp.m(r1)
            androidx.compose.foundation.layout.PaddingValues r1 = androidx.compose.foundation.layout.PaddingKt.a(r1)
            r24 = r1
            goto L_0x022e
        L_0x022c:
            r24 = r37
        L_0x022e:
            if (r16 == 0) goto L_0x0235
            androidx.compose.foundation.pager.PageSize$Fill r1 = androidx.compose.foundation.pager.PageSize.Fill.f5258a
            r16 = r1
            goto L_0x0237
        L_0x0235:
            r16 = r38
        L_0x0237:
            if (r20 == 0) goto L_0x023c
            r20 = r8
            goto L_0x023e
        L_0x023c:
            r20 = r4
        L_0x023e:
            if (r22 == 0) goto L_0x0248
            float r1 = (float) r8
            float r1 = androidx.compose.ui.unit.Dp.m(r1)
            r22 = r1
            goto L_0x024a
        L_0x0248:
            r22 = r5
        L_0x024a:
            if (r25 == 0) goto L_0x0255
            androidx.compose.ui.Alignment$Companion r1 = androidx.compose.ui.Alignment.f15444a
            androidx.compose.ui.Alignment$Vertical r1 = r1.i()
            r25 = r1
            goto L_0x0257
        L_0x0255:
            r25 = r41
        L_0x0257:
            r1 = r11 & 128(0x80, float:1.794E-43)
            if (r1 == 0) goto L_0x027c
            androidx.compose.foundation.pager.PagerDefaults r1 = androidx.compose.foundation.pager.PagerDefaults.f5265a
            r2 = r30 & 14
            r7 = r2 | r23
            r13 = 30
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r23 = r0
            r26 = r31
            r0 = r1
            r1 = r35
            r6 = r10
            r12 = r8
            r27 = r17
            r17 = r29
            r8 = r13
            androidx.compose.foundation.gestures.TargetedFlingBehavior r0 = r0.a(r1, r2, r3, r4, r5, r6, r7, r8)
            r30 = r30 & r19
            goto L_0x0286
        L_0x027c:
            r23 = r0
            r12 = r8
            r27 = r17
            r17 = r29
            r26 = r31
            r0 = r13
        L_0x0286:
            if (r9 == 0) goto L_0x0289
            goto L_0x028b
        L_0x0289:
            r18 = r43
        L_0x028b:
            if (r17 == 0) goto L_0x028f
            r1 = r12
            goto L_0x0291
        L_0x028f:
            r1 = r44
        L_0x0291:
            if (r26 == 0) goto L_0x0295
            r2 = 0
            goto L_0x0297
        L_0x0295:
            r2 = r45
        L_0x0297:
            r3 = r11 & 2048(0x800, float:2.87E-42)
            if (r3 == 0) goto L_0x02aa
            androidx.compose.foundation.pager.PagerDefaults r3 = androidx.compose.foundation.pager.PagerDefaults.f5265a
            androidx.compose.foundation.gestures.Orientation r4 = androidx.compose.foundation.gestures.Orientation.Horizontal
            r5 = r30 & 14
            r5 = r5 | 432(0x1b0, float:6.05E-43)
            androidx.compose.ui.input.nestedscroll.NestedScrollConnection r3 = r3.b(r15, r4, r10, r5)
            r4 = r23 & -113(0xffffffffffffff8f, float:NaN)
            goto L_0x02ae
        L_0x02aa:
            r3 = r46
            r4 = r23
        L_0x02ae:
            if (r27 == 0) goto L_0x02c4
            androidx.compose.foundation.gestures.snapping.SnapPosition$Start r5 = androidx.compose.foundation.gestures.snapping.SnapPosition.Start.f3677a
            r23 = r0
            r27 = r1
            r29 = r2
            r0 = r4
            r31 = r5
        L_0x02bb:
            r19 = r16
            r26 = r18
            r1 = r30
            r30 = r3
            goto L_0x02ce
        L_0x02c4:
            r31 = r47
            r23 = r0
            r27 = r1
            r29 = r2
            r0 = r4
            goto L_0x02bb
        L_0x02ce:
            r10.U()
            boolean r2 = androidx.compose.runtime.ComposerKt.P()
            if (r2 == 0) goto L_0x02df
            java.lang.String r2 = "androidx.compose.foundation.pager.HorizontalPager (Pager.kt:169)"
            r3 = 1870896258(0x6f839c82, float:8.1463485E28)
            androidx.compose.runtime.ComposerKt.Y(r3, r1, r0, r2)
        L_0x02df:
            androidx.compose.foundation.OverscrollEffect r13 = androidx.compose.foundation.OverscrollKt.b(r10, r12)
            r2 = 2147483646(0x7ffffffe, float:NaN)
            r16 = r1 & r2
            r1 = r0 & 1022(0x3fe, float:1.432E-42)
            int r0 = r0 << 3
            r2 = 57344(0xe000, float:8.0356E-41)
            r0 = r0 & r2
            r17 = r1 | r0
            r18 = 0
            r0 = r35
            r1 = r21
            r2 = r24
            r3 = r19
            r4 = r20
            r5 = r22
            r6 = r25
            r7 = r23
            r8 = r26
            r9 = r27
            r28 = r10
            r10 = r29
            r11 = r30
            r12 = r31
            r14 = r48
            r15 = r28
            a(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x0320
            androidx.compose.runtime.ComposerKt.X()
        L_0x0320:
            r4 = r19
            r5 = r20
            r2 = r21
            r6 = r22
            r8 = r23
            r3 = r24
            r7 = r25
            r9 = r26
            r10 = r27
            r11 = r29
            r12 = r30
            r13 = r31
            goto L_0x0352
        L_0x0339:
            r28 = r10
            r28.B()
            r3 = r37
            r7 = r41
            r9 = r43
            r10 = r44
            r11 = r45
            r12 = r46
            r2 = r6
            r8 = r13
            r13 = r47
            r6 = r5
            r5 = r4
            r4 = r38
        L_0x0352:
            androidx.compose.runtime.ScopeUpdateScope r15 = r28.x()
            if (r15 == 0) goto L_0x0373
            androidx.compose.foundation.pager.PagerKt$HorizontalPager$2 r14 = new androidx.compose.foundation.pager.PagerKt$HorizontalPager$2
            r0 = r14
            r1 = r35
            r33 = r14
            r14 = r48
            r34 = r15
            r15 = r50
            r16 = r51
            r17 = r52
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            r1 = r33
            r0 = r34
            r0.a(r1)
        L_0x0373:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.pager.PagerKt.b(androidx.compose.foundation.pager.PagerState, androidx.compose.ui.Modifier, androidx.compose.foundation.layout.PaddingValues, androidx.compose.foundation.pager.PageSize, int, float, androidx.compose.ui.Alignment$Vertical, androidx.compose.foundation.gestures.TargetedFlingBehavior, boolean, boolean, kotlin.jvm.functions.Function1, androidx.compose.ui.input.nestedscroll.NestedScrollConnection, androidx.compose.foundation.gestures.snapping.SnapPosition, kotlin.jvm.functions.Function4, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:110:0x0147  */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x014c  */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x0166  */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x0180  */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x0189  */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x018e  */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x01a5  */
    /* JADX WARNING: Removed duplicated region for block: B:151:0x01b9  */
    /* JADX WARNING: Removed duplicated region for block: B:154:0x01bf  */
    /* JADX WARNING: Removed duplicated region for block: B:156:0x01c4  */
    /* JADX WARNING: Removed duplicated region for block: B:166:0x01eb  */
    /* JADX WARNING: Removed duplicated region for block: B:167:0x01ed  */
    /* JADX WARNING: Removed duplicated region for block: B:170:0x01f7  */
    /* JADX WARNING: Removed duplicated region for block: B:233:0x03be  */
    /* JADX WARNING: Removed duplicated region for block: B:236:0x03df  */
    /* JADX WARNING: Removed duplicated region for block: B:238:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00a5  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00aa  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00c3  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00c8  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x00e1  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x00f7  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x00ff  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0104  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x011d  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x0126  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void c(androidx.compose.foundation.pager.PagerState r37, androidx.compose.ui.Modifier r38, androidx.compose.foundation.layout.PaddingValues r39, androidx.compose.foundation.pager.PageSize r40, int r41, float r42, androidx.compose.ui.Alignment.Horizontal r43, androidx.compose.foundation.gestures.TargetedFlingBehavior r44, boolean r45, boolean r46, kotlin.jvm.functions.Function1 r47, androidx.compose.ui.input.nestedscroll.NestedScrollConnection r48, androidx.compose.foundation.gestures.snapping.SnapPosition r49, androidx.compose.foundation.OverscrollEffect r50, kotlin.jvm.functions.Function4 r51, androidx.compose.runtime.Composer r52, int r53, int r54, int r55) {
        /*
            r15 = r37
            r13 = r53
            r12 = r54
            r11 = r55
            r9 = 632853564(0x25b8943c, float:3.201936E-16)
            r0 = r52
            androidx.compose.runtime.Composer r10 = r0.q(r9)
            r0 = r11 & 1
            if (r0 == 0) goto L_0x0018
            r0 = r13 | 6
            goto L_0x0028
        L_0x0018:
            r0 = r13 & 6
            if (r0 != 0) goto L_0x0027
            boolean r0 = r10.W(r15)
            if (r0 == 0) goto L_0x0024
            r0 = 4
            goto L_0x0025
        L_0x0024:
            r0 = 2
        L_0x0025:
            r0 = r0 | r13
            goto L_0x0028
        L_0x0027:
            r0 = r13
        L_0x0028:
            r3 = r11 & 2
            if (r3 == 0) goto L_0x0031
            r0 = r0 | 48
        L_0x002e:
            r6 = r38
            goto L_0x0043
        L_0x0031:
            r6 = r13 & 48
            if (r6 != 0) goto L_0x002e
            r6 = r38
            boolean r7 = r10.W(r6)
            if (r7 == 0) goto L_0x0040
            r7 = 32
            goto L_0x0042
        L_0x0040:
            r7 = 16
        L_0x0042:
            r0 = r0 | r7
        L_0x0043:
            r7 = r11 & 4
            if (r7 == 0) goto L_0x004c
            r0 = r0 | 384(0x180, float:5.38E-43)
        L_0x0049:
            r1 = r39
            goto L_0x005f
        L_0x004c:
            r1 = r13 & 384(0x180, float:5.38E-43)
            if (r1 != 0) goto L_0x0049
            r1 = r39
            boolean r16 = r10.W(r1)
            if (r16 == 0) goto L_0x005b
            r16 = 256(0x100, float:3.59E-43)
            goto L_0x005d
        L_0x005b:
            r16 = 128(0x80, float:1.794E-43)
        L_0x005d:
            r0 = r0 | r16
        L_0x005f:
            r16 = r11 & 8
            r17 = 1024(0x400, float:1.435E-42)
            r18 = 2048(0x800, float:2.87E-42)
            if (r16 == 0) goto L_0x006c
            r0 = r0 | 3072(0xc00, float:4.305E-42)
        L_0x0069:
            r2 = r40
            goto L_0x007f
        L_0x006c:
            r2 = r13 & 3072(0xc00, float:4.305E-42)
            if (r2 != 0) goto L_0x0069
            r2 = r40
            boolean r20 = r10.W(r2)
            if (r20 == 0) goto L_0x007b
            r20 = r18
            goto L_0x007d
        L_0x007b:
            r20 = r17
        L_0x007d:
            r0 = r0 | r20
        L_0x007f:
            r20 = r11 & 16
            r21 = 16384(0x4000, float:2.2959E-41)
            r22 = 8192(0x2000, float:1.14794E-41)
            if (r20 == 0) goto L_0x008c
            r0 = r0 | 24576(0x6000, float:3.4438E-41)
        L_0x0089:
            r4 = r41
            goto L_0x009f
        L_0x008c:
            r4 = r13 & 24576(0x6000, float:3.4438E-41)
            if (r4 != 0) goto L_0x0089
            r4 = r41
            boolean r24 = r10.i(r4)
            if (r24 == 0) goto L_0x009b
            r24 = r21
            goto L_0x009d
        L_0x009b:
            r24 = r22
        L_0x009d:
            r0 = r0 | r24
        L_0x009f:
            r24 = r11 & 32
            r25 = 196608(0x30000, float:2.75506E-40)
            if (r24 == 0) goto L_0x00aa
            r0 = r0 | r25
            r5 = r42
            goto L_0x00bd
        L_0x00aa:
            r26 = r13 & r25
            r5 = r42
            if (r26 != 0) goto L_0x00bd
            boolean r27 = r10.h(r5)
            if (r27 == 0) goto L_0x00b9
            r27 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00bb
        L_0x00b9:
            r27 = 65536(0x10000, float:9.18355E-41)
        L_0x00bb:
            r0 = r0 | r27
        L_0x00bd:
            r27 = r11 & 64
            r28 = 1572864(0x180000, float:2.204052E-39)
            if (r27 == 0) goto L_0x00c8
            r0 = r0 | r28
            r8 = r43
            goto L_0x00db
        L_0x00c8:
            r28 = r13 & r28
            r8 = r43
            if (r28 != 0) goto L_0x00db
            boolean r29 = r10.W(r8)
            if (r29 == 0) goto L_0x00d7
            r29 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00d9
        L_0x00d7:
            r29 = 524288(0x80000, float:7.34684E-40)
        L_0x00d9:
            r0 = r0 | r29
        L_0x00db:
            r29 = 12582912(0xc00000, float:1.7632415E-38)
            r29 = r13 & r29
            if (r29 != 0) goto L_0x00f7
            r14 = r11 & 128(0x80, float:1.794E-43)
            if (r14 != 0) goto L_0x00f0
            r14 = r44
            boolean r30 = r10.W(r14)
            if (r30 == 0) goto L_0x00f2
            r30 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00f4
        L_0x00f0:
            r14 = r44
        L_0x00f2:
            r30 = 4194304(0x400000, float:5.877472E-39)
        L_0x00f4:
            r0 = r0 | r30
            goto L_0x00f9
        L_0x00f7:
            r14 = r44
        L_0x00f9:
            r9 = r11 & 256(0x100, float:3.59E-43)
            r31 = 100663296(0x6000000, float:2.4074124E-35)
            if (r9 == 0) goto L_0x0104
            r0 = r0 | r31
            r8 = r45
            goto L_0x0117
        L_0x0104:
            r31 = r13 & r31
            r8 = r45
            if (r31 != 0) goto L_0x0117
            boolean r31 = r10.d(r8)
            if (r31 == 0) goto L_0x0113
            r31 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x0115
        L_0x0113:
            r31 = 33554432(0x2000000, float:9.403955E-38)
        L_0x0115:
            r0 = r0 | r31
        L_0x0117:
            r8 = r11 & 512(0x200, float:7.175E-43)
            r31 = 805306368(0x30000000, float:4.656613E-10)
            if (r8 == 0) goto L_0x0126
            r0 = r0 | r31
            r32 = r0
            r31 = r8
            r8 = r46
            goto L_0x0143
        L_0x0126:
            r31 = r13 & r31
            if (r31 != 0) goto L_0x013e
            r31 = r8
            r8 = r46
            boolean r32 = r10.d(r8)
            if (r32 == 0) goto L_0x0137
            r32 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x0139
        L_0x0137:
            r32 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x0139:
            r0 = r0 | r32
        L_0x013b:
            r32 = r0
            goto L_0x0143
        L_0x013e:
            r31 = r8
            r8 = r46
            goto L_0x013b
        L_0x0143:
            r0 = r11 & 1024(0x400, float:1.435E-42)
            if (r0 == 0) goto L_0x014c
            r19 = r12 | 6
            r8 = r47
            goto L_0x0162
        L_0x014c:
            r33 = r12 & 6
            r8 = r47
            if (r33 != 0) goto L_0x0160
            boolean r33 = r10.l(r8)
            if (r33 == 0) goto L_0x015b
            r19 = 4
            goto L_0x015d
        L_0x015b:
            r19 = 2
        L_0x015d:
            r19 = r12 | r19
            goto L_0x0162
        L_0x0160:
            r19 = r12
        L_0x0162:
            r33 = r12 & 48
            if (r33 != 0) goto L_0x0180
            r33 = r0
            r0 = r11 & 2048(0x800, float:2.87E-42)
            if (r0 != 0) goto L_0x0177
            r0 = r48
            boolean r34 = r10.l(r0)
            if (r34 == 0) goto L_0x0179
            r23 = 32
            goto L_0x017b
        L_0x0177:
            r0 = r48
        L_0x0179:
            r23 = 16
        L_0x017b:
            r19 = r19 | r23
        L_0x017d:
            r0 = r19
            goto L_0x0185
        L_0x0180:
            r33 = r0
            r0 = r48
            goto L_0x017d
        L_0x0185:
            r8 = r11 & 4096(0x1000, float:5.74E-42)
            if (r8 == 0) goto L_0x018e
            r0 = r0 | 384(0x180, float:5.38E-43)
        L_0x018b:
            r1 = r49
            goto L_0x01a1
        L_0x018e:
            r1 = r12 & 384(0x180, float:5.38E-43)
            if (r1 != 0) goto L_0x018b
            r1 = r49
            boolean r19 = r10.W(r1)
            if (r19 == 0) goto L_0x019d
            r29 = 256(0x100, float:3.59E-43)
            goto L_0x019f
        L_0x019d:
            r29 = 128(0x80, float:1.794E-43)
        L_0x019f:
            r0 = r0 | r29
        L_0x01a1:
            r1 = r12 & 3072(0xc00, float:4.305E-42)
            if (r1 != 0) goto L_0x01b9
            r1 = r11 & 8192(0x2000, float:1.14794E-41)
            if (r1 != 0) goto L_0x01b4
            r1 = r50
            boolean r19 = r10.W(r1)
            if (r19 == 0) goto L_0x01b6
            r17 = r18
            goto L_0x01b6
        L_0x01b4:
            r1 = r50
        L_0x01b6:
            r0 = r0 | r17
            goto L_0x01bb
        L_0x01b9:
            r1 = r50
        L_0x01bb:
            r1 = r11 & 16384(0x4000, float:2.2959E-41)
            if (r1 == 0) goto L_0x01c4
            r0 = r0 | 24576(0x6000, float:3.4438E-41)
        L_0x01c1:
            r1 = r51
            goto L_0x01d5
        L_0x01c4:
            r1 = r12 & 24576(0x6000, float:3.4438E-41)
            if (r1 != 0) goto L_0x01c1
            r1 = r51
            boolean r17 = r10.l(r1)
            if (r17 == 0) goto L_0x01d1
            goto L_0x01d3
        L_0x01d1:
            r21 = r22
        L_0x01d3:
            r0 = r0 | r21
        L_0x01d5:
            r17 = 306783379(0x12492493, float:6.34695E-28)
            r1 = r32 & r17
            r2 = 306783378(0x12492492, float:6.3469493E-28)
            r17 = r8
            r8 = 0
            r18 = 1
            if (r1 != r2) goto L_0x01ed
            r1 = r0 & 9363(0x2493, float:1.312E-41)
            r2 = 9362(0x2492, float:1.3119E-41)
            if (r1 == r2) goto L_0x01eb
            goto L_0x01ed
        L_0x01eb:
            r1 = r8
            goto L_0x01ef
        L_0x01ed:
            r1 = r18
        L_0x01ef:
            r2 = r32 & 1
            boolean r1 = r10.E(r1, r2)
            if (r1 == 0) goto L_0x03be
            r10.p()
            r1 = r13 & 1
            if (r1 == 0) goto L_0x023b
            boolean r1 = r10.J()
            if (r1 == 0) goto L_0x0205
            goto L_0x023b
        L_0x0205:
            r10.B()
            r1 = r11 & 128(0x80, float:1.794E-43)
            if (r1 == 0) goto L_0x0211
            r1 = -29360129(0xfffffffffe3fffff, float:-6.380294E37)
            r32 = r32 & r1
        L_0x0211:
            r1 = r11 & 2048(0x800, float:2.87E-42)
            if (r1 == 0) goto L_0x0217
            r0 = r0 & -113(0xffffffffffffff8f, float:NaN)
        L_0x0217:
            r1 = r11 & 8192(0x2000, float:1.14794E-41)
            if (r1 == 0) goto L_0x021d
            r0 = r0 & -7169(0xffffffffffffe3ff, float:NaN)
        L_0x021d:
            r22 = r39
            r23 = r40
            r26 = r43
            r28 = r45
            r29 = r46
            r31 = r47
            r33 = r49
            r34 = r50
            r24 = r4
            r25 = r5
            r21 = r6
            r27 = r14
            r1 = r32
            r32 = r48
            goto L_0x0310
        L_0x023b:
            if (r3 == 0) goto L_0x0242
            androidx.compose.ui.Modifier$Companion r1 = androidx.compose.ui.Modifier.f15489d
            r19 = r1
            goto L_0x0244
        L_0x0242:
            r19 = r6
        L_0x0244:
            if (r7 == 0) goto L_0x0252
            float r1 = (float) r8
            float r1 = androidx.compose.ui.unit.Dp.m(r1)
            androidx.compose.foundation.layout.PaddingValues r1 = androidx.compose.foundation.layout.PaddingKt.a(r1)
            r21 = r1
            goto L_0x0254
        L_0x0252:
            r21 = r39
        L_0x0254:
            if (r16 == 0) goto L_0x025b
            androidx.compose.foundation.pager.PageSize$Fill r1 = androidx.compose.foundation.pager.PageSize.Fill.f5258a
            r16 = r1
            goto L_0x025d
        L_0x025b:
            r16 = r40
        L_0x025d:
            if (r20 == 0) goto L_0x0262
            r20 = r8
            goto L_0x0264
        L_0x0262:
            r20 = r4
        L_0x0264:
            if (r24 == 0) goto L_0x026e
            float r1 = (float) r8
            float r1 = androidx.compose.ui.unit.Dp.m(r1)
            r22 = r1
            goto L_0x0270
        L_0x026e:
            r22 = r5
        L_0x0270:
            if (r27 == 0) goto L_0x027b
            androidx.compose.ui.Alignment$Companion r1 = androidx.compose.ui.Alignment.f15444a
            androidx.compose.ui.Alignment$Horizontal r1 = r1.g()
            r23 = r1
            goto L_0x027d
        L_0x027b:
            r23 = r43
        L_0x027d:
            r1 = r11 & 128(0x80, float:1.794E-43)
            if (r1 == 0) goto L_0x02a6
            androidx.compose.foundation.pager.PagerDefaults r1 = androidx.compose.foundation.pager.PagerDefaults.f5265a
            r2 = r32 & 14
            r7 = r2 | r25
            r14 = 30
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r24 = r0
            r25 = r33
            r0 = r1
            r1 = r37
            r6 = r10
            r12 = r8
            r26 = r17
            r17 = r31
            r8 = r14
            androidx.compose.foundation.gestures.TargetedFlingBehavior r0 = r0.a(r1, r2, r3, r4, r5, r6, r7, r8)
            r1 = -29360129(0xfffffffffe3fffff, float:-6.380294E37)
            r32 = r32 & r1
            r14 = r0
            goto L_0x02af
        L_0x02a6:
            r24 = r0
            r12 = r8
            r26 = r17
            r17 = r31
            r25 = r33
        L_0x02af:
            if (r9 == 0) goto L_0x02b2
            goto L_0x02b4
        L_0x02b2:
            r18 = r45
        L_0x02b4:
            if (r17 == 0) goto L_0x02b8
            r0 = r12
            goto L_0x02ba
        L_0x02b8:
            r0 = r46
        L_0x02ba:
            if (r25 == 0) goto L_0x02be
            r1 = 0
            goto L_0x02c0
        L_0x02be:
            r1 = r47
        L_0x02c0:
            r2 = r11 & 2048(0x800, float:2.87E-42)
            if (r2 == 0) goto L_0x02d3
            androidx.compose.foundation.pager.PagerDefaults r2 = androidx.compose.foundation.pager.PagerDefaults.f5265a
            androidx.compose.foundation.gestures.Orientation r3 = androidx.compose.foundation.gestures.Orientation.Vertical
            r4 = r32 & 14
            r4 = r4 | 432(0x1b0, float:6.05E-43)
            androidx.compose.ui.input.nestedscroll.NestedScrollConnection r2 = r2.b(r15, r3, r10, r4)
            r3 = r24 & -113(0xffffffffffffff8f, float:NaN)
            goto L_0x02d7
        L_0x02d3:
            r2 = r48
            r3 = r24
        L_0x02d7:
            if (r26 == 0) goto L_0x02dc
            androidx.compose.foundation.gestures.snapping.SnapPosition$Start r4 = androidx.compose.foundation.gestures.snapping.SnapPosition.Start.f3677a
            goto L_0x02de
        L_0x02dc:
            r4 = r49
        L_0x02de:
            r5 = r11 & 8192(0x2000, float:1.14794E-41)
            if (r5 == 0) goto L_0x0306
            androidx.compose.foundation.OverscrollEffect r5 = androidx.compose.foundation.OverscrollKt.b(r10, r12)
            r3 = r3 & -7169(0xffffffffffffe3ff, float:NaN)
            r29 = r0
            r31 = r1
            r0 = r3
            r33 = r4
            r34 = r5
        L_0x02f1:
            r27 = r14
            r28 = r18
            r24 = r20
            r25 = r22
            r26 = r23
            r1 = r32
            r32 = r2
            r23 = r16
            r22 = r21
            r21 = r19
            goto L_0x0310
        L_0x0306:
            r34 = r50
            r29 = r0
            r31 = r1
            r0 = r3
            r33 = r4
            goto L_0x02f1
        L_0x0310:
            r10.U()
            boolean r2 = androidx.compose.runtime.ComposerKt.P()
            if (r2 == 0) goto L_0x0321
            java.lang.String r2 = "androidx.compose.foundation.pager.VerticalPager (Pager.kt:259)"
            r3 = 632853564(0x25b8943c, float:3.201936E-16)
            androidx.compose.runtime.ComposerKt.Y(r3, r1, r0, r2)
        L_0x0321:
            androidx.compose.foundation.gestures.Orientation r4 = androidx.compose.foundation.gestures.Orientation.Vertical
            androidx.compose.ui.Alignment$Companion r2 = androidx.compose.ui.Alignment.f15444a
            androidx.compose.ui.Alignment$Vertical r14 = r2.i()
            int r2 = r1 >> 3
            r2 = r2 & 14
            r2 = r2 | 24576(0x6000, float:3.4438E-41)
            int r3 = r1 << 3
            r3 = r3 & 112(0x70, float:1.57E-43)
            r2 = r2 | r3
            r3 = r1 & 896(0x380, float:1.256E-42)
            r2 = r2 | r3
            int r3 = r1 >> 18
            r3 = r3 & 7168(0x1c00, float:1.0045E-41)
            r2 = r2 | r3
            int r3 = r1 >> 6
            r5 = 458752(0x70000, float:6.42848E-40)
            r5 = r5 & r3
            r2 = r2 | r5
            r5 = 3670016(0x380000, float:5.142788E-39)
            r3 = r3 & r5
            r2 = r2 | r3
            int r3 = r0 << 12
            r5 = 29360128(0x1c00000, float:7.052966E-38)
            r3 = r3 & r5
            r2 = r2 | r3
            int r3 = r1 << 12
            r5 = 234881024(0xe000000, float:1.5777218E-30)
            r5 = r5 & r3
            r2 = r2 | r5
            r5 = 1879048192(0x70000000, float:1.58456325E29)
            r3 = r3 & r5
            r18 = r2 | r3
            int r1 = r1 >> 9
            r2 = r1 & 14
            r2 = r2 | 24576(0x6000, float:3.4438E-41)
            r3 = r0 & 112(0x70, float:1.57E-43)
            r2 = r2 | r3
            int r3 = r0 << 6
            r5 = r3 & 896(0x380, float:1.256E-42)
            r2 = r2 | r5
            r1 = r1 & 7168(0x1c00, float:1.0045E-41)
            r1 = r1 | r2
            int r0 = r0 << 9
            r2 = 458752(0x70000, float:6.42848E-40)
            r0 = r0 & r2
            r0 = r0 | r1
            r1 = 3670016(0x380000, float:5.142788E-39)
            r1 = r1 & r3
            r19 = r0 | r1
            r20 = 0
            r0 = r21
            r1 = r37
            r2 = r22
            r3 = r29
            r5 = r27
            r6 = r28
            r7 = r34
            r8 = r24
            r9 = r25
            r30 = r10
            r10 = r23
            r11 = r32
            r12 = r31
            r13 = r26
            r15 = r33
            r16 = r51
            r17 = r30
            androidx.compose.foundation.pager.LazyLayoutPagerKt.a(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x03a3
            androidx.compose.runtime.ComposerKt.X()
        L_0x03a3:
            r2 = r21
            r3 = r22
            r4 = r23
            r5 = r24
            r6 = r25
            r7 = r26
            r8 = r27
            r9 = r28
            r10 = r29
            r11 = r31
            r12 = r32
            r13 = r33
            r14 = r34
            goto L_0x03d9
        L_0x03be:
            r30 = r10
            r30.B()
            r3 = r39
            r7 = r43
            r9 = r45
            r10 = r46
            r11 = r47
            r12 = r48
            r13 = r49
            r2 = r6
            r8 = r14
            r14 = r50
            r6 = r5
            r5 = r4
            r4 = r40
        L_0x03d9:
            androidx.compose.runtime.ScopeUpdateScope r15 = r30.x()
            if (r15 == 0) goto L_0x03fa
            androidx.compose.foundation.pager.PagerKt$VerticalPager$1 r1 = new androidx.compose.foundation.pager.PagerKt$VerticalPager$1
            r0 = r1
            r35 = r1
            r1 = r37
            r36 = r15
            r15 = r51
            r16 = r53
            r17 = r54
            r18 = r55
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            r1 = r35
            r0 = r36
            r0.a(r1)
        L_0x03fa:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.pager.PagerKt.c(androidx.compose.foundation.pager.PagerState, androidx.compose.ui.Modifier, androidx.compose.foundation.layout.PaddingValues, androidx.compose.foundation.pager.PageSize, int, float, androidx.compose.ui.Alignment$Horizontal, androidx.compose.foundation.gestures.TargetedFlingBehavior, boolean, boolean, kotlin.jvm.functions.Function1, androidx.compose.ui.input.nestedscroll.NestedScrollConnection, androidx.compose.foundation.gestures.snapping.SnapPosition, androidx.compose.foundation.OverscrollEffect, kotlin.jvm.functions.Function4, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:110:0x0143  */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x0148  */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x0162  */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x017c  */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x0185  */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x018a  */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x01a1  */
    /* JADX WARNING: Removed duplicated region for block: B:146:0x01a6  */
    /* JADX WARNING: Removed duplicated region for block: B:156:0x01cc  */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x01ce  */
    /* JADX WARNING: Removed duplicated region for block: B:160:0x01d8  */
    /* JADX WARNING: Removed duplicated region for block: B:216:0x0339  */
    /* JADX WARNING: Removed duplicated region for block: B:219:0x0358  */
    /* JADX WARNING: Removed duplicated region for block: B:221:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00a1  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00a6  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00bf  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00c4  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x00dd  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x00f3  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x00fb  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0100  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x0119  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x0122  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final /* synthetic */ void d(androidx.compose.foundation.pager.PagerState r35, androidx.compose.ui.Modifier r36, androidx.compose.foundation.layout.PaddingValues r37, androidx.compose.foundation.pager.PageSize r38, int r39, float r40, androidx.compose.ui.Alignment.Horizontal r41, androidx.compose.foundation.gestures.TargetedFlingBehavior r42, boolean r43, boolean r44, kotlin.jvm.functions.Function1 r45, androidx.compose.ui.input.nestedscroll.NestedScrollConnection r46, androidx.compose.foundation.gestures.snapping.SnapPosition r47, kotlin.jvm.functions.Function4 r48, androidx.compose.runtime.Composer r49, int r50, int r51, int r52) {
        /*
            r15 = r35
            r14 = r50
            r12 = r51
            r11 = r52
            r9 = 909160706(0x3630b102, float:2.6329076E-6)
            r0 = r49
            androidx.compose.runtime.Composer r10 = r0.q(r9)
            r0 = r11 & 1
            if (r0 == 0) goto L_0x0018
            r0 = r14 | 6
            goto L_0x0028
        L_0x0018:
            r0 = r14 & 6
            if (r0 != 0) goto L_0x0027
            boolean r0 = r10.W(r15)
            if (r0 == 0) goto L_0x0024
            r0 = 4
            goto L_0x0025
        L_0x0024:
            r0 = 2
        L_0x0025:
            r0 = r0 | r14
            goto L_0x0028
        L_0x0027:
            r0 = r14
        L_0x0028:
            r3 = r11 & 2
            if (r3 == 0) goto L_0x0031
            r0 = r0 | 48
        L_0x002e:
            r6 = r36
            goto L_0x0043
        L_0x0031:
            r6 = r14 & 48
            if (r6 != 0) goto L_0x002e
            r6 = r36
            boolean r7 = r10.W(r6)
            if (r7 == 0) goto L_0x0040
            r7 = 32
            goto L_0x0042
        L_0x0040:
            r7 = 16
        L_0x0042:
            r0 = r0 | r7
        L_0x0043:
            r7 = r11 & 4
            if (r7 == 0) goto L_0x004c
            r0 = r0 | 384(0x180, float:5.38E-43)
        L_0x0049:
            r1 = r37
            goto L_0x005f
        L_0x004c:
            r1 = r14 & 384(0x180, float:5.38E-43)
            if (r1 != 0) goto L_0x0049
            r1 = r37
            boolean r16 = r10.W(r1)
            if (r16 == 0) goto L_0x005b
            r16 = 256(0x100, float:3.59E-43)
            goto L_0x005d
        L_0x005b:
            r16 = 128(0x80, float:1.794E-43)
        L_0x005d:
            r0 = r0 | r16
        L_0x005f:
            r16 = r11 & 8
            r17 = 1024(0x400, float:1.435E-42)
            r18 = 2048(0x800, float:2.87E-42)
            if (r16 == 0) goto L_0x006c
            r0 = r0 | 3072(0xc00, float:4.305E-42)
        L_0x0069:
            r2 = r38
            goto L_0x007f
        L_0x006c:
            r2 = r14 & 3072(0xc00, float:4.305E-42)
            if (r2 != 0) goto L_0x0069
            r2 = r38
            boolean r20 = r10.W(r2)
            if (r20 == 0) goto L_0x007b
            r20 = r18
            goto L_0x007d
        L_0x007b:
            r20 = r17
        L_0x007d:
            r0 = r0 | r20
        L_0x007f:
            r20 = r11 & 16
            if (r20 == 0) goto L_0x0088
            r0 = r0 | 24576(0x6000, float:3.4438E-41)
        L_0x0085:
            r4 = r39
            goto L_0x009b
        L_0x0088:
            r4 = r14 & 24576(0x6000, float:3.4438E-41)
            if (r4 != 0) goto L_0x0085
            r4 = r39
            boolean r22 = r10.i(r4)
            if (r22 == 0) goto L_0x0097
            r22 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0099
        L_0x0097:
            r22 = 8192(0x2000, float:1.14794E-41)
        L_0x0099:
            r0 = r0 | r22
        L_0x009b:
            r22 = r11 & 32
            r23 = 196608(0x30000, float:2.75506E-40)
            if (r22 == 0) goto L_0x00a6
            r0 = r0 | r23
            r5 = r40
            goto L_0x00b9
        L_0x00a6:
            r24 = r14 & r23
            r5 = r40
            if (r24 != 0) goto L_0x00b9
            boolean r25 = r10.h(r5)
            if (r25 == 0) goto L_0x00b5
            r25 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00b7
        L_0x00b5:
            r25 = 65536(0x10000, float:9.18355E-41)
        L_0x00b7:
            r0 = r0 | r25
        L_0x00b9:
            r25 = r11 & 64
            r26 = 1572864(0x180000, float:2.204052E-39)
            if (r25 == 0) goto L_0x00c4
            r0 = r0 | r26
            r8 = r41
            goto L_0x00d7
        L_0x00c4:
            r26 = r14 & r26
            r8 = r41
            if (r26 != 0) goto L_0x00d7
            boolean r27 = r10.W(r8)
            if (r27 == 0) goto L_0x00d3
            r27 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00d5
        L_0x00d3:
            r27 = 524288(0x80000, float:7.34684E-40)
        L_0x00d5:
            r0 = r0 | r27
        L_0x00d7:
            r27 = 12582912(0xc00000, float:1.7632415E-38)
            r27 = r14 & r27
            if (r27 != 0) goto L_0x00f3
            r13 = r11 & 128(0x80, float:1.794E-43)
            if (r13 != 0) goto L_0x00ec
            r13 = r42
            boolean r28 = r10.W(r13)
            if (r28 == 0) goto L_0x00ee
            r28 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00f0
        L_0x00ec:
            r13 = r42
        L_0x00ee:
            r28 = 4194304(0x400000, float:5.877472E-39)
        L_0x00f0:
            r0 = r0 | r28
            goto L_0x00f5
        L_0x00f3:
            r13 = r42
        L_0x00f5:
            r9 = r11 & 256(0x100, float:3.59E-43)
            r29 = 100663296(0x6000000, float:2.4074124E-35)
            if (r9 == 0) goto L_0x0100
            r0 = r0 | r29
            r8 = r43
            goto L_0x0113
        L_0x0100:
            r29 = r14 & r29
            r8 = r43
            if (r29 != 0) goto L_0x0113
            boolean r29 = r10.d(r8)
            if (r29 == 0) goto L_0x010f
            r29 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x0111
        L_0x010f:
            r29 = 33554432(0x2000000, float:9.403955E-38)
        L_0x0111:
            r0 = r0 | r29
        L_0x0113:
            r8 = r11 & 512(0x200, float:7.175E-43)
            r29 = 805306368(0x30000000, float:4.656613E-10)
            if (r8 == 0) goto L_0x0122
            r0 = r0 | r29
            r30 = r0
            r29 = r8
            r8 = r44
            goto L_0x013f
        L_0x0122:
            r29 = r14 & r29
            if (r29 != 0) goto L_0x013a
            r29 = r8
            r8 = r44
            boolean r30 = r10.d(r8)
            if (r30 == 0) goto L_0x0133
            r30 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x0135
        L_0x0133:
            r30 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x0135:
            r0 = r0 | r30
        L_0x0137:
            r30 = r0
            goto L_0x013f
        L_0x013a:
            r29 = r8
            r8 = r44
            goto L_0x0137
        L_0x013f:
            r0 = r11 & 1024(0x400, float:1.435E-42)
            if (r0 == 0) goto L_0x0148
            r19 = r12 | 6
            r8 = r45
            goto L_0x015e
        L_0x0148:
            r31 = r12 & 6
            r8 = r45
            if (r31 != 0) goto L_0x015c
            boolean r31 = r10.l(r8)
            if (r31 == 0) goto L_0x0157
            r19 = 4
            goto L_0x0159
        L_0x0157:
            r19 = 2
        L_0x0159:
            r19 = r12 | r19
            goto L_0x015e
        L_0x015c:
            r19 = r12
        L_0x015e:
            r31 = r12 & 48
            if (r31 != 0) goto L_0x017c
            r31 = r0
            r0 = r11 & 2048(0x800, float:2.87E-42)
            if (r0 != 0) goto L_0x0173
            r0 = r46
            boolean r32 = r10.l(r0)
            if (r32 == 0) goto L_0x0175
            r21 = 32
            goto L_0x0177
        L_0x0173:
            r0 = r46
        L_0x0175:
            r21 = 16
        L_0x0177:
            r19 = r19 | r21
        L_0x0179:
            r0 = r19
            goto L_0x0181
        L_0x017c:
            r31 = r0
            r0 = r46
            goto L_0x0179
        L_0x0181:
            r8 = r11 & 4096(0x1000, float:5.74E-42)
            if (r8 == 0) goto L_0x018a
            r0 = r0 | 384(0x180, float:5.38E-43)
        L_0x0187:
            r1 = r47
            goto L_0x019d
        L_0x018a:
            r1 = r12 & 384(0x180, float:5.38E-43)
            if (r1 != 0) goto L_0x0187
            r1 = r47
            boolean r19 = r10.W(r1)
            if (r19 == 0) goto L_0x0199
            r26 = 256(0x100, float:3.59E-43)
            goto L_0x019b
        L_0x0199:
            r26 = 128(0x80, float:1.794E-43)
        L_0x019b:
            r0 = r0 | r26
        L_0x019d:
            r1 = r11 & 8192(0x2000, float:1.14794E-41)
            if (r1 == 0) goto L_0x01a6
            r0 = r0 | 3072(0xc00, float:4.305E-42)
        L_0x01a3:
            r1 = r48
            goto L_0x01b6
        L_0x01a6:
            r1 = r12 & 3072(0xc00, float:4.305E-42)
            if (r1 != 0) goto L_0x01a3
            r1 = r48
            boolean r19 = r10.l(r1)
            if (r19 == 0) goto L_0x01b4
            r17 = r18
        L_0x01b4:
            r0 = r0 | r17
        L_0x01b6:
            r17 = 306783379(0x12492493, float:6.34695E-28)
            r1 = r30 & r17
            r2 = 306783378(0x12492492, float:6.3469493E-28)
            r17 = r8
            r8 = 0
            r18 = 1
            if (r1 != r2) goto L_0x01ce
            r1 = r0 & 1171(0x493, float:1.641E-42)
            r2 = 1170(0x492, float:1.64E-42)
            if (r1 == r2) goto L_0x01cc
            goto L_0x01ce
        L_0x01cc:
            r1 = r8
            goto L_0x01d0
        L_0x01ce:
            r1 = r18
        L_0x01d0:
            r2 = r30 & 1
            boolean r1 = r10.E(r1, r2)
            if (r1 == 0) goto L_0x0339
            r10.p()
            r1 = r14 & 1
            r19 = -29360129(0xfffffffffe3fffff, float:-6.380294E37)
            if (r1 == 0) goto L_0x0215
            boolean r1 = r10.J()
            if (r1 == 0) goto L_0x01e9
            goto L_0x0215
        L_0x01e9:
            r10.B()
            r1 = r11 & 128(0x80, float:1.794E-43)
            if (r1 == 0) goto L_0x01f2
            r30 = r30 & r19
        L_0x01f2:
            r1 = r11 & 2048(0x800, float:2.87E-42)
            if (r1 == 0) goto L_0x01f8
            r0 = r0 & -113(0xffffffffffffff8f, float:NaN)
        L_0x01f8:
            r24 = r37
            r19 = r38
            r25 = r41
            r26 = r43
            r27 = r44
            r29 = r45
            r31 = r47
            r20 = r4
            r22 = r5
            r21 = r6
            r12 = r8
            r23 = r13
            r1 = r30
            r30 = r46
            goto L_0x02ce
        L_0x0215:
            if (r3 == 0) goto L_0x021c
            androidx.compose.ui.Modifier$Companion r1 = androidx.compose.ui.Modifier.f15489d
            r21 = r1
            goto L_0x021e
        L_0x021c:
            r21 = r6
        L_0x021e:
            if (r7 == 0) goto L_0x022c
            float r1 = (float) r8
            float r1 = androidx.compose.ui.unit.Dp.m(r1)
            androidx.compose.foundation.layout.PaddingValues r1 = androidx.compose.foundation.layout.PaddingKt.a(r1)
            r24 = r1
            goto L_0x022e
        L_0x022c:
            r24 = r37
        L_0x022e:
            if (r16 == 0) goto L_0x0235
            androidx.compose.foundation.pager.PageSize$Fill r1 = androidx.compose.foundation.pager.PageSize.Fill.f5258a
            r16 = r1
            goto L_0x0237
        L_0x0235:
            r16 = r38
        L_0x0237:
            if (r20 == 0) goto L_0x023c
            r20 = r8
            goto L_0x023e
        L_0x023c:
            r20 = r4
        L_0x023e:
            if (r22 == 0) goto L_0x0248
            float r1 = (float) r8
            float r1 = androidx.compose.ui.unit.Dp.m(r1)
            r22 = r1
            goto L_0x024a
        L_0x0248:
            r22 = r5
        L_0x024a:
            if (r25 == 0) goto L_0x0255
            androidx.compose.ui.Alignment$Companion r1 = androidx.compose.ui.Alignment.f15444a
            androidx.compose.ui.Alignment$Horizontal r1 = r1.g()
            r25 = r1
            goto L_0x0257
        L_0x0255:
            r25 = r41
        L_0x0257:
            r1 = r11 & 128(0x80, float:1.794E-43)
            if (r1 == 0) goto L_0x027c
            androidx.compose.foundation.pager.PagerDefaults r1 = androidx.compose.foundation.pager.PagerDefaults.f5265a
            r2 = r30 & 14
            r7 = r2 | r23
            r13 = 30
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r23 = r0
            r26 = r31
            r0 = r1
            r1 = r35
            r6 = r10
            r12 = r8
            r27 = r17
            r17 = r29
            r8 = r13
            androidx.compose.foundation.gestures.TargetedFlingBehavior r0 = r0.a(r1, r2, r3, r4, r5, r6, r7, r8)
            r30 = r30 & r19
            goto L_0x0286
        L_0x027c:
            r23 = r0
            r12 = r8
            r27 = r17
            r17 = r29
            r26 = r31
            r0 = r13
        L_0x0286:
            if (r9 == 0) goto L_0x0289
            goto L_0x028b
        L_0x0289:
            r18 = r43
        L_0x028b:
            if (r17 == 0) goto L_0x028f
            r1 = r12
            goto L_0x0291
        L_0x028f:
            r1 = r44
        L_0x0291:
            if (r26 == 0) goto L_0x0295
            r2 = 0
            goto L_0x0297
        L_0x0295:
            r2 = r45
        L_0x0297:
            r3 = r11 & 2048(0x800, float:2.87E-42)
            if (r3 == 0) goto L_0x02aa
            androidx.compose.foundation.pager.PagerDefaults r3 = androidx.compose.foundation.pager.PagerDefaults.f5265a
            androidx.compose.foundation.gestures.Orientation r4 = androidx.compose.foundation.gestures.Orientation.Vertical
            r5 = r30 & 14
            r5 = r5 | 432(0x1b0, float:6.05E-43)
            androidx.compose.ui.input.nestedscroll.NestedScrollConnection r3 = r3.b(r15, r4, r10, r5)
            r4 = r23 & -113(0xffffffffffffff8f, float:NaN)
            goto L_0x02ae
        L_0x02aa:
            r3 = r46
            r4 = r23
        L_0x02ae:
            if (r27 == 0) goto L_0x02c4
            androidx.compose.foundation.gestures.snapping.SnapPosition$Start r5 = androidx.compose.foundation.gestures.snapping.SnapPosition.Start.f3677a
            r23 = r0
            r27 = r1
            r29 = r2
            r0 = r4
            r31 = r5
        L_0x02bb:
            r19 = r16
            r26 = r18
            r1 = r30
            r30 = r3
            goto L_0x02ce
        L_0x02c4:
            r31 = r47
            r23 = r0
            r27 = r1
            r29 = r2
            r0 = r4
            goto L_0x02bb
        L_0x02ce:
            r10.U()
            boolean r2 = androidx.compose.runtime.ComposerKt.P()
            if (r2 == 0) goto L_0x02df
            java.lang.String r2 = "androidx.compose.foundation.pager.VerticalPager (Pager.kt:299)"
            r3 = 909160706(0x3630b102, float:2.6329076E-6)
            androidx.compose.runtime.ComposerKt.Y(r3, r1, r0, r2)
        L_0x02df:
            androidx.compose.foundation.OverscrollEffect r13 = androidx.compose.foundation.OverscrollKt.b(r10, r12)
            r2 = 2147483646(0x7ffffffe, float:NaN)
            r16 = r1 & r2
            r1 = r0 & 1022(0x3fe, float:1.432E-42)
            int r0 = r0 << 3
            r2 = 57344(0xe000, float:8.0356E-41)
            r0 = r0 & r2
            r17 = r1 | r0
            r18 = 0
            r0 = r35
            r1 = r21
            r2 = r24
            r3 = r19
            r4 = r20
            r5 = r22
            r6 = r25
            r7 = r23
            r8 = r26
            r9 = r27
            r28 = r10
            r10 = r29
            r11 = r30
            r12 = r31
            r14 = r48
            r15 = r28
            c(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x0320
            androidx.compose.runtime.ComposerKt.X()
        L_0x0320:
            r4 = r19
            r5 = r20
            r2 = r21
            r6 = r22
            r8 = r23
            r3 = r24
            r7 = r25
            r9 = r26
            r10 = r27
            r11 = r29
            r12 = r30
            r13 = r31
            goto L_0x0352
        L_0x0339:
            r28 = r10
            r28.B()
            r3 = r37
            r7 = r41
            r9 = r43
            r10 = r44
            r11 = r45
            r12 = r46
            r2 = r6
            r8 = r13
            r13 = r47
            r6 = r5
            r5 = r4
            r4 = r38
        L_0x0352:
            androidx.compose.runtime.ScopeUpdateScope r15 = r28.x()
            if (r15 == 0) goto L_0x0373
            androidx.compose.foundation.pager.PagerKt$VerticalPager$2 r14 = new androidx.compose.foundation.pager.PagerKt$VerticalPager$2
            r0 = r14
            r1 = r35
            r33 = r14
            r14 = r48
            r34 = r15
            r15 = r50
            r16 = r51
            r17 = r52
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            r1 = r33
            r0 = r34
            r0.a(r1)
        L_0x0373:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.pager.PagerKt.d(androidx.compose.foundation.pager.PagerState, androidx.compose.ui.Modifier, androidx.compose.foundation.layout.PaddingValues, androidx.compose.foundation.pager.PageSize, int, float, androidx.compose.ui.Alignment$Horizontal, androidx.compose.foundation.gestures.TargetedFlingBehavior, boolean, boolean, kotlin.jvm.functions.Function1, androidx.compose.ui.input.nestedscroll.NestedScrollConnection, androidx.compose.foundation.gestures.snapping.SnapPosition, kotlin.jvm.functions.Function4, androidx.compose.runtime.Composer, int, int, int):void");
    }

    public static final int g(SnapPosition snapPosition, int i2, int i3, int i4, int i5, int i6, int i7, float f2, int i8) {
        return MathKt.d(((float) snapPosition.a(i2, i3, i5, i6, i7, i8)) - (f2 * ((float) (i3 + i4))));
    }

    public static final Modifier h(Modifier modifier, PagerState pagerState, boolean z2, CoroutineScope coroutineScope, boolean z3) {
        return z3 ? modifier.o0(SemanticsModifierKt.d(Modifier.f15489d, false, new PagerKt$pagerSemantics$1(z2, pagerState, coroutineScope), 1, (Object) null)) : modifier.o0(Modifier.f15489d);
    }

    public static final boolean i(PagerState pagerState, CoroutineScope coroutineScope) {
        if (!pagerState.d()) {
            return false;
        }
        Job unused = BuildersKt__Builders_commonKt.d(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new PagerKt$pagerSemantics$performBackwardPaging$1(pagerState, (Continuation) null), 3, (Object) null);
        return true;
    }

    public static final boolean j(PagerState pagerState, CoroutineScope coroutineScope) {
        if (!pagerState.f()) {
            return false;
        }
        Job unused = BuildersKt__Builders_commonKt.d(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new PagerKt$pagerSemantics$performForwardPaging$1(pagerState, (Continuation) null), 3, (Object) null);
        return true;
    }
}
