package androidx.compose.foundation.lazy.grid;

import kotlin.Metadata;

@Metadata
public final class LazyGridKt {
    /* JADX WARNING: Removed duplicated region for block: B:101:0x011e  */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x0135  */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x013c  */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x0158  */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x015d  */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x017f  */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x0181  */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x018a  */
    /* JADX WARNING: Removed duplicated region for block: B:181:0x0336  */
    /* JADX WARNING: Removed duplicated region for block: B:184:0x0346  */
    /* JADX WARNING: Removed duplicated region for block: B:186:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x008e  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0093  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00ac  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00af  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00c6  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x00da  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x00e2  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x00e5  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x00fb  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0100  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x0119  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void a(androidx.compose.ui.Modifier r32, androidx.compose.foundation.lazy.grid.LazyGridState r33, androidx.compose.foundation.lazy.grid.LazyGridSlotsProvider r34, androidx.compose.foundation.layout.PaddingValues r35, boolean r36, boolean r37, androidx.compose.foundation.gestures.FlingBehavior r38, boolean r39, androidx.compose.foundation.OverscrollEffect r40, androidx.compose.foundation.layout.Arrangement.Vertical r41, androidx.compose.foundation.layout.Arrangement.Horizontal r42, kotlin.jvm.functions.Function1 r43, androidx.compose.runtime.Composer r44, int r45, int r46, int r47) {
        /*
            r14 = r33
            r15 = r34
            r13 = r37
            r12 = r39
            r11 = r43
            r10 = r45
            r9 = r47
            r0 = 708740370(0x2a3e8512, float:1.6921558E-13)
            r1 = r44
            androidx.compose.runtime.Composer r8 = r1.q(r0)
            r1 = r9 & 1
            if (r1 == 0) goto L_0x0021
            r4 = r10 | 6
            r5 = r4
            r4 = r32
            goto L_0x0035
        L_0x0021:
            r4 = r10 & 6
            if (r4 != 0) goto L_0x0032
            r4 = r32
            boolean r5 = r8.W(r4)
            if (r5 == 0) goto L_0x002f
            r5 = 4
            goto L_0x0030
        L_0x002f:
            r5 = 2
        L_0x0030:
            r5 = r5 | r10
            goto L_0x0035
        L_0x0032:
            r4 = r32
            r5 = r10
        L_0x0035:
            r6 = r9 & 2
            r16 = 32
            if (r6 == 0) goto L_0x003e
            r5 = r5 | 48
            goto L_0x004e
        L_0x003e:
            r6 = r10 & 48
            if (r6 != 0) goto L_0x004e
            boolean r6 = r8.W(r14)
            if (r6 == 0) goto L_0x004b
            r6 = r16
            goto L_0x004d
        L_0x004b:
            r6 = 16
        L_0x004d:
            r5 = r5 | r6
        L_0x004e:
            r6 = r9 & 4
            if (r6 == 0) goto L_0x0055
            r5 = r5 | 384(0x180, float:5.38E-43)
            goto L_0x006e
        L_0x0055:
            r6 = r10 & 384(0x180, float:5.38E-43)
            if (r6 != 0) goto L_0x006e
            r6 = r10 & 512(0x200, float:7.175E-43)
            if (r6 != 0) goto L_0x0062
            boolean r6 = r8.W(r15)
            goto L_0x0066
        L_0x0062:
            boolean r6 = r8.l(r15)
        L_0x0066:
            if (r6 == 0) goto L_0x006b
            r6 = 256(0x100, float:3.59E-43)
            goto L_0x006d
        L_0x006b:
            r6 = 128(0x80, float:1.794E-43)
        L_0x006d:
            r5 = r5 | r6
        L_0x006e:
            r6 = r9 & 8
            if (r6 == 0) goto L_0x0077
            r5 = r5 | 3072(0xc00, float:4.305E-42)
        L_0x0074:
            r2 = r35
            goto L_0x008a
        L_0x0077:
            r2 = r10 & 3072(0xc00, float:4.305E-42)
            if (r2 != 0) goto L_0x0074
            r2 = r35
            boolean r17 = r8.W(r2)
            if (r17 == 0) goto L_0x0086
            r17 = 2048(0x800, float:2.87E-42)
            goto L_0x0088
        L_0x0086:
            r17 = 1024(0x400, float:1.435E-42)
        L_0x0088:
            r5 = r5 | r17
        L_0x008a:
            r17 = r9 & 16
            if (r17 == 0) goto L_0x0093
            r5 = r5 | 24576(0x6000, float:3.4438E-41)
        L_0x0090:
            r3 = r36
            goto L_0x00a6
        L_0x0093:
            r3 = r10 & 24576(0x6000, float:3.4438E-41)
            if (r3 != 0) goto L_0x0090
            r3 = r36
            boolean r19 = r8.d(r3)
            if (r19 == 0) goto L_0x00a2
            r19 = 16384(0x4000, float:2.2959E-41)
            goto L_0x00a4
        L_0x00a2:
            r19 = 8192(0x2000, float:1.14794E-41)
        L_0x00a4:
            r5 = r5 | r19
        L_0x00a6:
            r19 = r9 & 32
            r20 = 196608(0x30000, float:2.75506E-40)
            if (r19 == 0) goto L_0x00af
            r5 = r5 | r20
            goto L_0x00c0
        L_0x00af:
            r19 = r10 & r20
            if (r19 != 0) goto L_0x00c0
            boolean r19 = r8.d(r13)
            if (r19 == 0) goto L_0x00bc
            r19 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00be
        L_0x00bc:
            r19 = 65536(0x10000, float:9.18355E-41)
        L_0x00be:
            r5 = r5 | r19
        L_0x00c0:
            r19 = 1572864(0x180000, float:2.204052E-39)
            r19 = r10 & r19
            if (r19 != 0) goto L_0x00da
            r19 = r9 & 64
            r7 = r38
            if (r19 != 0) goto L_0x00d5
            boolean r20 = r8.W(r7)
            if (r20 == 0) goto L_0x00d5
            r20 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00d7
        L_0x00d5:
            r20 = 524288(0x80000, float:7.34684E-40)
        L_0x00d7:
            r5 = r5 | r20
            goto L_0x00dc
        L_0x00da:
            r7 = r38
        L_0x00dc:
            r0 = r9 & 128(0x80, float:1.794E-43)
            r21 = 12582912(0xc00000, float:1.7632415E-38)
            if (r0 == 0) goto L_0x00e5
            r5 = r5 | r21
            goto L_0x00f5
        L_0x00e5:
            r0 = r10 & r21
            if (r0 != 0) goto L_0x00f5
            boolean r0 = r8.d(r12)
            if (r0 == 0) goto L_0x00f2
            r0 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00f4
        L_0x00f2:
            r0 = 4194304(0x400000, float:5.877472E-39)
        L_0x00f4:
            r5 = r5 | r0
        L_0x00f5:
            r0 = r9 & 256(0x100, float:3.59E-43)
            r21 = 100663296(0x6000000, float:2.4074124E-35)
            if (r0 == 0) goto L_0x0100
            r5 = r5 | r21
        L_0x00fd:
            r0 = r40
            goto L_0x0113
        L_0x0100:
            r0 = r10 & r21
            if (r0 != 0) goto L_0x00fd
            r0 = r40
            boolean r21 = r8.W(r0)
            if (r21 == 0) goto L_0x010f
            r21 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x0111
        L_0x010f:
            r21 = 33554432(0x2000000, float:9.403955E-38)
        L_0x0111:
            r5 = r5 | r21
        L_0x0113:
            r0 = r9 & 512(0x200, float:7.175E-43)
            r21 = 805306368(0x30000000, float:4.656613E-10)
            if (r0 == 0) goto L_0x011e
            r5 = r5 | r21
        L_0x011b:
            r0 = r41
            goto L_0x0131
        L_0x011e:
            r0 = r10 & r21
            if (r0 != 0) goto L_0x011b
            r0 = r41
            boolean r21 = r8.W(r0)
            if (r21 == 0) goto L_0x012d
            r21 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x012f
        L_0x012d:
            r21 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x012f:
            r5 = r5 | r21
        L_0x0131:
            r0 = r9 & 1024(0x400, float:1.435E-42)
            if (r0 == 0) goto L_0x013c
            r0 = r46 | 6
            r18 = r0
            r0 = r42
            goto L_0x0154
        L_0x013c:
            r0 = r46 & 6
            if (r0 != 0) goto L_0x0150
            r0 = r42
            boolean r21 = r8.W(r0)
            if (r21 == 0) goto L_0x014b
            r18 = 4
            goto L_0x014d
        L_0x014b:
            r18 = 2
        L_0x014d:
            r18 = r46 | r18
            goto L_0x0154
        L_0x0150:
            r0 = r42
            r18 = r46
        L_0x0154:
            r0 = r9 & 2048(0x800, float:2.87E-42)
            if (r0 == 0) goto L_0x015d
            r18 = r18 | 48
        L_0x015a:
            r0 = r18
            goto L_0x016d
        L_0x015d:
            r0 = r46 & 48
            if (r0 != 0) goto L_0x015a
            boolean r0 = r8.l(r11)
            if (r0 == 0) goto L_0x0168
            goto L_0x016a
        L_0x0168:
            r16 = 16
        L_0x016a:
            r18 = r18 | r16
            goto L_0x015a
        L_0x016d:
            r16 = 306783379(0x12492493, float:6.34695E-28)
            r2 = r5 & r16
            r3 = 306783378(0x12492492, float:6.3469493E-28)
            r4 = 0
            if (r2 != r3) goto L_0x0181
            r2 = r0 & 19
            r3 = 18
            if (r2 == r3) goto L_0x017f
            goto L_0x0181
        L_0x017f:
            r2 = r4
            goto L_0x0182
        L_0x0181:
            r2 = 1
        L_0x0182:
            r3 = r5 & 1
            boolean r2 = r8.E(r2, r3)
            if (r2 == 0) goto L_0x0336
            r8.p()
            r2 = r10 & 1
            if (r2 == 0) goto L_0x01ac
            boolean r2 = r8.J()
            if (r2 == 0) goto L_0x0198
            goto L_0x01ac
        L_0x0198:
            r8.B()
            r1 = r9 & 64
            if (r1 == 0) goto L_0x01a3
            r1 = -3670017(0xffffffffffc7ffff, float:NaN)
            r5 = r5 & r1
        L_0x01a3:
            r16 = r35
            r6 = r36
            r17 = r7
            r7 = r32
            goto L_0x01e2
        L_0x01ac:
            if (r1 == 0) goto L_0x01b1
            androidx.compose.ui.Modifier$Companion r1 = androidx.compose.ui.Modifier.f15489d
            goto L_0x01b3
        L_0x01b1:
            r1 = r32
        L_0x01b3:
            if (r6 == 0) goto L_0x01bf
            float r2 = (float) r4
            float r2 = androidx.compose.ui.unit.Dp.m(r2)
            androidx.compose.foundation.layout.PaddingValues r2 = androidx.compose.foundation.layout.PaddingKt.a(r2)
            goto L_0x01c1
        L_0x01bf:
            r2 = r35
        L_0x01c1:
            if (r17 == 0) goto L_0x01c4
            goto L_0x01c6
        L_0x01c4:
            r4 = r36
        L_0x01c6:
            r3 = r9 & 64
            if (r3 == 0) goto L_0x01dc
            androidx.compose.foundation.gestures.ScrollableDefaults r3 = androidx.compose.foundation.gestures.ScrollableDefaults.f3558a
            r6 = 6
            androidx.compose.foundation.gestures.FlingBehavior r3 = r3.a(r8, r6)
            r6 = -3670017(0xffffffffffc7ffff, float:NaN)
            r5 = r5 & r6
            r7 = r1
            r16 = r2
            r17 = r3
            r6 = r4
            goto L_0x01e2
        L_0x01dc:
            r16 = r2
            r6 = r4
            r17 = r7
            r7 = r1
        L_0x01e2:
            r8.U()
            boolean r1 = androidx.compose.runtime.ComposerKt.P()
            if (r1 == 0) goto L_0x01f3
            java.lang.String r1 = "androidx.compose.foundation.lazy.grid.LazyGrid (LazyGrid.kt:82)"
            r2 = 708740370(0x2a3e8512, float:1.6921558E-13)
            androidx.compose.runtime.ComposerKt.Y(r2, r5, r0, r1)
        L_0x01f3:
            int r1 = r5 >> 3
            r4 = r1 & 14
            r1 = r0 & 112(0x70, float:1.57E-43)
            r1 = r1 | r4
            kotlin.jvm.functions.Function0 r18 = androidx.compose.foundation.lazy.grid.LazyGridItemProviderKt.a(r14, r11, r8, r1)
            int r19 = r5 >> 9
            r1 = r19 & 112(0x70, float:1.57E-43)
            r1 = r1 | r4
            androidx.compose.foundation.lazy.layout.LazyLayoutSemanticState r20 = androidx.compose.foundation.lazy.grid.LazySemanticsKt.a(r14, r6, r8, r1)
            java.lang.Object r1 = r8.g()
            androidx.compose.runtime.Composer$Companion r2 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r2 = r2.a()
            if (r1 != r2) goto L_0x021c
            kotlin.coroutines.EmptyCoroutineContext r1 = kotlin.coroutines.EmptyCoroutineContext.f40721z
            kotlinx.coroutines.CoroutineScope r1 = androidx.compose.runtime.EffectsKt.j(r1, r8)
            r8.N(r1)
        L_0x021c:
            r21 = r1
            kotlinx.coroutines.CoroutineScope r21 = (kotlinx.coroutines.CoroutineScope) r21
            androidx.compose.runtime.ProvidableCompositionLocal r1 = androidx.compose.ui.platform.CompositionLocalsKt.j()
            java.lang.Object r1 = r8.C(r1)
            r22 = r1
            androidx.compose.ui.graphics.GraphicsContext r22 = (androidx.compose.ui.graphics.GraphicsContext) r22
            androidx.compose.runtime.CompositionLocal r1 = androidx.compose.ui.platform.CompositionLocalsKt.p()
            java.lang.Object r1 = r8.C(r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 != 0) goto L_0x0245
            androidx.compose.foundation.lazy.layout.StickyItemsPlacement$Companion r1 = androidx.compose.foundation.lazy.layout.StickyItemsPlacement.f4989a
            androidx.compose.foundation.lazy.layout.StickyItemsPlacement r1 = r1.a()
        L_0x0242:
            r23 = r1
            goto L_0x0247
        L_0x0245:
            r1 = 0
            goto L_0x0242
        L_0x0247:
            r1 = 524272(0x7fff0, float:7.34662E-40)
            r1 = r1 & r5
            int r0 = r0 << 18
            r2 = 3670016(0x380000, float:5.142788E-39)
            r0 = r0 & r2
            r0 = r0 | r1
            int r1 = r5 >> 6
            r2 = 29360128(0x1c00000, float:7.052966E-38)
            r1 = r1 & r2
            r24 = r0 | r1
            r25 = 0
            r0 = r18
            r1 = r33
            r2 = r34
            r3 = r16
            r26 = r4
            r4 = r6
            r27 = r5
            r5 = r37
            r28 = r6
            r6 = r42
            r29 = r7
            r7 = r41
            r44 = r8
            r8 = r21
            r9 = r22
            r10 = r23
            r11 = r44
            r12 = r24
            r13 = r25
            kotlin.jvm.functions.Function2 r12 = b(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            if (r37 == 0) goto L_0x0289
            androidx.compose.foundation.gestures.Orientation r0 = androidx.compose.foundation.gestures.Orientation.Vertical
        L_0x0287:
            r8 = r0
            goto L_0x028c
        L_0x0289:
            androidx.compose.foundation.gestures.Orientation r0 = androidx.compose.foundation.gestures.Orientation.Horizontal
            goto L_0x0287
        L_0x028c:
            if (r39 == 0) goto L_0x02ad
            r0 = -1614890700(0xffffffff9fbeb934, float:-8.077452E-20)
            r13 = r44
            r13.X(r0)
            androidx.compose.ui.Modifier$Companion r0 = androidx.compose.ui.Modifier.f15489d
            r1 = r26
            androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsState r1 = androidx.compose.foundation.lazy.grid.LazyGridBeyondBoundsModifierKt.a(r14, r13, r1)
            androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsInfo r2 = r33.p()
            r11 = r28
            androidx.compose.ui.Modifier r0 = androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsModifierLocalKt.b(r0, r1, r2, r11, r8)
            r13.M()
        L_0x02ab:
            r9 = r0
            goto L_0x02bd
        L_0x02ad:
            r13 = r44
            r11 = r28
            r0 = -1614595456(0xffffffff9fc33a80, float:-8.268249E-20)
            r13.X(r0)
            r13.M()
            androidx.compose.ui.Modifier$Companion r0 = androidx.compose.ui.Modifier.f15489d
            goto L_0x02ab
        L_0x02bd:
            androidx.compose.ui.layout.RemeasurementModifier r0 = r33.D()
            r10 = r29
            androidx.compose.ui.Modifier r0 = r10.o0(r0)
            androidx.compose.foundation.lazy.layout.AwaitFirstLayoutModifier r1 = r33.o()
            androidx.compose.ui.Modifier r0 = r0.o0(r1)
            r1 = 57344(0xe000, float:8.0356E-41)
            r1 = r19 & r1
            int r2 = r27 << 3
            r3 = 458752(0x70000, float:6.42848E-40)
            r2 = r2 & r3
            r7 = r1 | r2
            r1 = r18
            r2 = r20
            r3 = r8
            r4 = r39
            r5 = r11
            r6 = r13
            androidx.compose.ui.Modifier r0 = androidx.compose.foundation.lazy.layout.LazyLayoutSemanticsKt.c(r0, r1, r2, r3, r4, r5, r6, r7)
            androidx.compose.ui.Modifier r0 = r0.o0(r9)
            androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator r1 = r33.v()
            androidx.compose.ui.Modifier r1 = r1.j()
            androidx.compose.ui.Modifier r0 = r0.o0(r1)
            androidx.compose.foundation.interaction.MutableInteractionSource r6 = r33.u()
            r19 = 256(0x100, float:3.59E-43)
            r20 = 0
            r7 = 0
            r9 = 0
            r1 = r33
            r2 = r8
            r3 = r39
            r4 = r11
            r5 = r17
            r8 = r40
            r21 = r10
            r10 = r19
            r19 = r11
            r11 = r20
            androidx.compose.ui.Modifier r2 = androidx.compose.foundation.ScrollingContainerKt.b(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState r3 = r33.C()
            r6 = 0
            r1 = r18
            r4 = r12
            r5 = r13
            androidx.compose.foundation.lazy.layout.LazyLayoutKt.a(r1, r2, r3, r4, r5, r6, r7)
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x032d
            androidx.compose.runtime.ComposerKt.X()
        L_0x032d:
            r4 = r16
            r7 = r17
            r5 = r19
            r1 = r21
            goto L_0x0340
        L_0x0336:
            r13 = r8
            r13.B()
            r1 = r32
            r4 = r35
            r5 = r36
        L_0x0340:
            androidx.compose.runtime.ScopeUpdateScope r13 = r13.x()
            if (r13 == 0) goto L_0x036f
            androidx.compose.foundation.lazy.grid.LazyGridKt$LazyGrid$1 r12 = new androidx.compose.foundation.lazy.grid.LazyGridKt$LazyGrid$1
            r0 = r12
            r2 = r33
            r3 = r34
            r6 = r37
            r8 = r39
            r9 = r40
            r10 = r41
            r11 = r42
            r15 = r12
            r12 = r43
            r14 = r13
            r13 = r45
            r30 = r14
            r14 = r46
            r31 = r15
            r15 = r47
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            r0 = r30
            r1 = r31
            r0.a(r1)
        L_0x036f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.grid.LazyGridKt.a(androidx.compose.ui.Modifier, androidx.compose.foundation.lazy.grid.LazyGridState, androidx.compose.foundation.lazy.grid.LazyGridSlotsProvider, androidx.compose.foundation.layout.PaddingValues, boolean, boolean, androidx.compose.foundation.gestures.FlingBehavior, boolean, androidx.compose.foundation.OverscrollEffect, androidx.compose.foundation.layout.Arrangement$Vertical, androidx.compose.foundation.layout.Arrangement$Horizontal, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v9, resolved type: androidx.compose.foundation.lazy.grid.LazyGridKt$rememberLazyGridMeasurePolicy$1$1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v45, resolved type: androidx.compose.foundation.lazy.grid.LazyGridKt$rememberLazyGridMeasurePolicy$1$1} */
    /* JADX WARNING: type inference failed for: r4v4 */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x00d9, code lost:
        if (r4 == androidx.compose.runtime.Composer.f14567a.a()) goto L_0x00db;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0024, code lost:
        if (r0.W(r19) == false) goto L_0x0029;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0044  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x005e  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0078  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0092  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00aa  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00ac  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x00d3  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0102  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final kotlin.jvm.functions.Function2 b(kotlin.jvm.functions.Function0 r18, androidx.compose.foundation.lazy.grid.LazyGridState r19, androidx.compose.foundation.lazy.grid.LazyGridSlotsProvider r20, androidx.compose.foundation.layout.PaddingValues r21, boolean r22, boolean r23, androidx.compose.foundation.layout.Arrangement.Horizontal r24, androidx.compose.foundation.layout.Arrangement.Vertical r25, kotlinx.coroutines.CoroutineScope r26, androidx.compose.ui.graphics.GraphicsContext r27, androidx.compose.foundation.lazy.layout.StickyItemsPlacement r28, androidx.compose.runtime.Composer r29, int r30, int r31) {
        /*
            r0 = r29
            r1 = r30
            boolean r2 = androidx.compose.runtime.ComposerKt.P()
            if (r2 == 0) goto L_0x0014
            r2 = -2025385037(0xffffffff874713b3, float:-1.4976885E-34)
            java.lang.String r3 = "androidx.compose.foundation.lazy.grid.rememberLazyGridMeasurePolicy (LazyGrid.kt:179)"
            r4 = r31
            androidx.compose.runtime.ComposerKt.Y(r2, r1, r4, r3)
        L_0x0014:
            r2 = r1 & 112(0x70, float:1.57E-43)
            r2 = r2 ^ 48
            r3 = 32
            r4 = 0
            r5 = 1
            if (r2 <= r3) goto L_0x0027
            r2 = r19
            boolean r6 = r0.W(r2)
            if (r6 != 0) goto L_0x002d
            goto L_0x0029
        L_0x0027:
            r2 = r19
        L_0x0029:
            r6 = r1 & 48
            if (r6 != r3) goto L_0x002f
        L_0x002d:
            r3 = r5
            goto L_0x0030
        L_0x002f:
            r3 = r4
        L_0x0030:
            r6 = r1 & 896(0x380, float:1.256E-42)
            r6 = r6 ^ 384(0x180, float:5.38E-43)
            r7 = 256(0x100, float:3.59E-43)
            r12 = r20
            if (r6 <= r7) goto L_0x0040
            boolean r6 = r0.W(r12)
            if (r6 != 0) goto L_0x0044
        L_0x0040:
            r6 = r1 & 384(0x180, float:5.38E-43)
            if (r6 != r7) goto L_0x0046
        L_0x0044:
            r6 = r5
            goto L_0x0047
        L_0x0046:
            r6 = r4
        L_0x0047:
            r3 = r3 | r6
            r6 = r1 & 7168(0x1c00, float:1.0045E-41)
            r6 = r6 ^ 3072(0xc00, float:4.305E-42)
            r7 = 2048(0x800, float:2.87E-42)
            r9 = r21
            if (r6 <= r7) goto L_0x0058
            boolean r6 = r0.W(r9)
            if (r6 != 0) goto L_0x005c
        L_0x0058:
            r6 = r1 & 3072(0xc00, float:4.305E-42)
            if (r6 != r7) goto L_0x005e
        L_0x005c:
            r6 = r5
            goto L_0x005f
        L_0x005e:
            r6 = r4
        L_0x005f:
            r3 = r3 | r6
            r6 = 57344(0xe000, float:8.0356E-41)
            r6 = r6 & r1
            r6 = r6 ^ 24576(0x6000, float:3.4438E-41)
            r7 = 16384(0x4000, float:2.2959E-41)
            r10 = r22
            if (r6 <= r7) goto L_0x0072
            boolean r6 = r0.d(r10)
            if (r6 != 0) goto L_0x0076
        L_0x0072:
            r6 = r1 & 24576(0x6000, float:3.4438E-41)
            if (r6 != r7) goto L_0x0078
        L_0x0076:
            r6 = r5
            goto L_0x0079
        L_0x0078:
            r6 = r4
        L_0x0079:
            r3 = r3 | r6
            r6 = 458752(0x70000, float:6.42848E-40)
            r6 = r6 & r1
            r7 = 196608(0x30000, float:2.75506E-40)
            r6 = r6 ^ r7
            r8 = 131072(0x20000, float:1.83671E-40)
            r11 = r23
            if (r6 <= r8) goto L_0x008c
            boolean r6 = r0.d(r11)
            if (r6 != 0) goto L_0x0090
        L_0x008c:
            r6 = r1 & r7
            if (r6 != r8) goto L_0x0092
        L_0x0090:
            r6 = r5
            goto L_0x0093
        L_0x0092:
            r6 = r4
        L_0x0093:
            r3 = r3 | r6
            r6 = 3670016(0x380000, float:5.142788E-39)
            r6 = r6 & r1
            r7 = 1572864(0x180000, float:2.204052E-39)
            r6 = r6 ^ r7
            r8 = 1048576(0x100000, float:1.469368E-39)
            r14 = r24
            if (r6 <= r8) goto L_0x00a6
            boolean r6 = r0.W(r14)
            if (r6 != 0) goto L_0x00aa
        L_0x00a6:
            r6 = r1 & r7
            if (r6 != r8) goto L_0x00ac
        L_0x00aa:
            r6 = r5
            goto L_0x00ad
        L_0x00ac:
            r6 = r4
        L_0x00ad:
            r3 = r3 | r6
            r6 = 29360128(0x1c00000, float:7.052966E-38)
            r6 = r6 & r1
            r7 = 12582912(0xc00000, float:1.7632415E-38)
            r6 = r6 ^ r7
            r8 = 8388608(0x800000, float:1.17549435E-38)
            r13 = r25
            if (r6 <= r8) goto L_0x00c0
            boolean r6 = r0.W(r13)
            if (r6 != 0) goto L_0x00c3
        L_0x00c0:
            r1 = r1 & r7
            if (r1 != r8) goto L_0x00c4
        L_0x00c3:
            r4 = r5
        L_0x00c4:
            r1 = r3 | r4
            r3 = r27
            boolean r4 = r0.W(r3)
            r1 = r1 | r4
            java.lang.Object r4 = r29.g()
            if (r1 != 0) goto L_0x00db
            androidx.compose.runtime.Composer$Companion r1 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r1 = r1.a()
            if (r4 != r1) goto L_0x00fa
        L_0x00db:
            androidx.compose.foundation.lazy.grid.LazyGridKt$rememberLazyGridMeasurePolicy$1$1 r4 = new androidx.compose.foundation.lazy.grid.LazyGridKt$rememberLazyGridMeasurePolicy$1$1
            r6 = r4
            r7 = r19
            r8 = r23
            r9 = r21
            r10 = r22
            r11 = r18
            r12 = r20
            r13 = r25
            r14 = r24
            r15 = r26
            r16 = r27
            r17 = r28
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            r0.N(r4)
        L_0x00fa:
            kotlin.jvm.functions.Function2 r4 = (kotlin.jvm.functions.Function2) r4
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x0105
            androidx.compose.runtime.ComposerKt.X()
        L_0x0105:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.grid.LazyGridKt.b(kotlin.jvm.functions.Function0, androidx.compose.foundation.lazy.grid.LazyGridState, androidx.compose.foundation.lazy.grid.LazyGridSlotsProvider, androidx.compose.foundation.layout.PaddingValues, boolean, boolean, androidx.compose.foundation.layout.Arrangement$Horizontal, androidx.compose.foundation.layout.Arrangement$Vertical, kotlinx.coroutines.CoroutineScope, androidx.compose.ui.graphics.GraphicsContext, androidx.compose.foundation.lazy.layout.StickyItemsPlacement, androidx.compose.runtime.Composer, int, int):kotlin.jvm.functions.Function2");
    }
}
