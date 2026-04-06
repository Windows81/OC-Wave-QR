package androidx.compose.foundation.lazy.staggeredgrid;

import kotlin.Metadata;

@Metadata
public final class LazyStaggeredGridKt {
    /* JADX WARNING: Removed duplicated region for block: B:100:0x011b  */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x0132  */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x0137  */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x0151  */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x0156  */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x017b  */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x017d  */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x0187  */
    /* JADX WARNING: Removed duplicated region for block: B:182:0x0345  */
    /* JADX WARNING: Removed duplicated region for block: B:185:0x035e  */
    /* JADX WARNING: Removed duplicated region for block: B:187:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00a0  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00a5  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00be  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x00d2  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x00da  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x00df  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x00f8  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x00fd  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x0116  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void a(androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState r30, androidx.compose.foundation.gestures.Orientation r31, androidx.compose.foundation.lazy.staggeredgrid.LazyGridStaggeredGridSlotsProvider r32, androidx.compose.ui.Modifier r33, androidx.compose.foundation.layout.PaddingValues r34, boolean r35, androidx.compose.foundation.gestures.FlingBehavior r36, boolean r37, androidx.compose.foundation.OverscrollEffect r38, float r39, float r40, kotlin.jvm.functions.Function1 r41, androidx.compose.runtime.Composer r42, int r43, int r44, int r45) {
        /*
            r12 = r30
            r13 = r31
            r14 = r32
            r15 = r41
            r11 = r43
            r10 = r45
            r0 = -1904835166(0xffffffff8e7685a2, float:-3.0386183E-30)
            r1 = r42
            androidx.compose.runtime.Composer r9 = r1.q(r0)
            r1 = r10 & 1
            if (r1 == 0) goto L_0x001c
            r1 = r11 | 6
            goto L_0x002c
        L_0x001c:
            r1 = r11 & 6
            if (r1 != 0) goto L_0x002b
            boolean r1 = r9.W(r12)
            if (r1 == 0) goto L_0x0028
            r1 = 4
            goto L_0x0029
        L_0x0028:
            r1 = 2
        L_0x0029:
            r1 = r1 | r11
            goto L_0x002c
        L_0x002b:
            r1 = r11
        L_0x002c:
            r4 = r10 & 2
            if (r4 == 0) goto L_0x0033
            r1 = r1 | 48
            goto L_0x0043
        L_0x0033:
            r4 = r11 & 48
            if (r4 != 0) goto L_0x0043
            boolean r4 = r9.W(r13)
            if (r4 == 0) goto L_0x0040
            r4 = 32
            goto L_0x0042
        L_0x0040:
            r4 = 16
        L_0x0042:
            r1 = r1 | r4
        L_0x0043:
            r4 = r10 & 4
            if (r4 == 0) goto L_0x004a
            r1 = r1 | 384(0x180, float:5.38E-43)
            goto L_0x0063
        L_0x004a:
            r4 = r11 & 384(0x180, float:5.38E-43)
            if (r4 != 0) goto L_0x0063
            r4 = r11 & 512(0x200, float:7.175E-43)
            if (r4 != 0) goto L_0x0057
            boolean r4 = r9.W(r14)
            goto L_0x005b
        L_0x0057:
            boolean r4 = r9.l(r14)
        L_0x005b:
            if (r4 == 0) goto L_0x0060
            r4 = 256(0x100, float:3.59E-43)
            goto L_0x0062
        L_0x0060:
            r4 = 128(0x80, float:1.794E-43)
        L_0x0062:
            r1 = r1 | r4
        L_0x0063:
            r4 = r10 & 8
            if (r4 == 0) goto L_0x006c
            r1 = r1 | 3072(0xc00, float:4.305E-42)
        L_0x0069:
            r7 = r33
            goto L_0x007e
        L_0x006c:
            r7 = r11 & 3072(0xc00, float:4.305E-42)
            if (r7 != 0) goto L_0x0069
            r7 = r33
            boolean r8 = r9.W(r7)
            if (r8 == 0) goto L_0x007b
            r8 = 2048(0x800, float:2.87E-42)
            goto L_0x007d
        L_0x007b:
            r8 = 1024(0x400, float:1.435E-42)
        L_0x007d:
            r1 = r1 | r8
        L_0x007e:
            r8 = r10 & 16
            if (r8 == 0) goto L_0x0087
            r1 = r1 | 24576(0x6000, float:3.4438E-41)
        L_0x0084:
            r2 = r34
            goto L_0x009a
        L_0x0087:
            r2 = r11 & 24576(0x6000, float:3.4438E-41)
            if (r2 != 0) goto L_0x0084
            r2 = r34
            boolean r16 = r9.W(r2)
            if (r16 == 0) goto L_0x0096
            r16 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0098
        L_0x0096:
            r16 = 8192(0x2000, float:1.14794E-41)
        L_0x0098:
            r1 = r1 | r16
        L_0x009a:
            r16 = r10 & 32
            r17 = 196608(0x30000, float:2.75506E-40)
            if (r16 == 0) goto L_0x00a5
            r1 = r1 | r17
            r3 = r35
            goto L_0x00b8
        L_0x00a5:
            r17 = r11 & r17
            r3 = r35
            if (r17 != 0) goto L_0x00b8
            boolean r18 = r9.d(r3)
            if (r18 == 0) goto L_0x00b4
            r18 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00b6
        L_0x00b4:
            r18 = 65536(0x10000, float:9.18355E-41)
        L_0x00b6:
            r1 = r1 | r18
        L_0x00b8:
            r18 = 1572864(0x180000, float:2.204052E-39)
            r18 = r11 & r18
            if (r18 != 0) goto L_0x00d2
            r18 = r10 & 64
            r5 = r36
            if (r18 != 0) goto L_0x00cd
            boolean r19 = r9.W(r5)
            if (r19 == 0) goto L_0x00cd
            r19 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00cf
        L_0x00cd:
            r19 = 524288(0x80000, float:7.34684E-40)
        L_0x00cf:
            r1 = r1 | r19
            goto L_0x00d4
        L_0x00d2:
            r5 = r36
        L_0x00d4:
            r6 = r10 & 128(0x80, float:1.794E-43)
            r20 = 12582912(0xc00000, float:1.7632415E-38)
            if (r6 == 0) goto L_0x00df
            r1 = r1 | r20
            r0 = r37
            goto L_0x00f2
        L_0x00df:
            r20 = r11 & r20
            r0 = r37
            if (r20 != 0) goto L_0x00f2
            boolean r21 = r9.d(r0)
            if (r21 == 0) goto L_0x00ee
            r21 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00f0
        L_0x00ee:
            r21 = 4194304(0x400000, float:5.877472E-39)
        L_0x00f0:
            r1 = r1 | r21
        L_0x00f2:
            r0 = r10 & 256(0x100, float:3.59E-43)
            r21 = 100663296(0x6000000, float:2.4074124E-35)
            if (r0 == 0) goto L_0x00fd
            r1 = r1 | r21
        L_0x00fa:
            r0 = r38
            goto L_0x0110
        L_0x00fd:
            r0 = r11 & r21
            if (r0 != 0) goto L_0x00fa
            r0 = r38
            boolean r21 = r9.W(r0)
            if (r21 == 0) goto L_0x010c
            r21 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x010e
        L_0x010c:
            r21 = 33554432(0x2000000, float:9.403955E-38)
        L_0x010e:
            r1 = r1 | r21
        L_0x0110:
            r0 = r10 & 512(0x200, float:7.175E-43)
            r21 = 805306368(0x30000000, float:4.656613E-10)
            if (r0 == 0) goto L_0x011b
            r1 = r1 | r21
            r2 = r39
            goto L_0x012e
        L_0x011b:
            r21 = r11 & r21
            r2 = r39
            if (r21 != 0) goto L_0x012e
            boolean r21 = r9.h(r2)
            if (r21 == 0) goto L_0x012a
            r21 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x012c
        L_0x012a:
            r21 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x012c:
            r1 = r1 | r21
        L_0x012e:
            r2 = r10 & 1024(0x400, float:1.435E-42)
            if (r2 == 0) goto L_0x0137
            r17 = r44 | 6
            r3 = r40
            goto L_0x014d
        L_0x0137:
            r21 = r44 & 6
            r3 = r40
            if (r21 != 0) goto L_0x014b
            boolean r21 = r9.h(r3)
            if (r21 == 0) goto L_0x0146
            r17 = 4
            goto L_0x0148
        L_0x0146:
            r17 = 2
        L_0x0148:
            r17 = r44 | r17
            goto L_0x014d
        L_0x014b:
            r17 = r44
        L_0x014d:
            r3 = r10 & 2048(0x800, float:2.87E-42)
            if (r3 == 0) goto L_0x0156
            r17 = r17 | 48
        L_0x0153:
            r3 = r17
            goto L_0x0168
        L_0x0156:
            r3 = r44 & 48
            if (r3 != 0) goto L_0x0153
            boolean r3 = r9.l(r15)
            if (r3 == 0) goto L_0x0163
            r18 = 32
            goto L_0x0165
        L_0x0163:
            r18 = 16
        L_0x0165:
            r17 = r17 | r18
            goto L_0x0153
        L_0x0168:
            r17 = 306783379(0x12492493, float:6.34695E-28)
            r5 = r1 & r17
            r18 = 1
            r7 = 306783378(0x12492492, float:6.3469493E-28)
            if (r5 != r7) goto L_0x017d
            r5 = r3 & 19
            r7 = 18
            if (r5 == r7) goto L_0x017b
            goto L_0x017d
        L_0x017b:
            r5 = 0
            goto L_0x017f
        L_0x017d:
            r5 = r18
        L_0x017f:
            r7 = r1 & 1
            boolean r5 = r9.E(r5, r7)
            if (r5 == 0) goto L_0x0345
            r9.p()
            r5 = r11 & 1
            if (r5 == 0) goto L_0x01b1
            boolean r5 = r9.J()
            if (r5 == 0) goto L_0x0195
            goto L_0x01b1
        L_0x0195:
            r9.B()
            r0 = r10 & 64
            if (r0 == 0) goto L_0x01a0
            r0 = -3670017(0xffffffffffc7ffff, float:NaN)
            r1 = r1 & r0
        L_0x01a0:
            r8 = r33
            r16 = r34
            r7 = r35
            r18 = r36
            r19 = r37
            r21 = r39
            r22 = r40
            r6 = r1
            goto L_0x020e
        L_0x01b1:
            if (r4 == 0) goto L_0x01b6
            androidx.compose.ui.Modifier$Companion r4 = androidx.compose.ui.Modifier.f15489d
            goto L_0x01b8
        L_0x01b6:
            r4 = r33
        L_0x01b8:
            if (r8 == 0) goto L_0x01c5
            r5 = 0
            float r7 = (float) r5
            float r5 = androidx.compose.ui.unit.Dp.m(r7)
            androidx.compose.foundation.layout.PaddingValues r5 = androidx.compose.foundation.layout.PaddingKt.a(r5)
            goto L_0x01c7
        L_0x01c5:
            r5 = r34
        L_0x01c7:
            if (r16 == 0) goto L_0x01cb
            r7 = 0
            goto L_0x01cd
        L_0x01cb:
            r7 = r35
        L_0x01cd:
            r8 = r10 & 64
            if (r8 == 0) goto L_0x01df
            androidx.compose.foundation.gestures.ScrollableDefaults r8 = androidx.compose.foundation.gestures.ScrollableDefaults.f3558a
            r33 = r4
            r4 = 6
            androidx.compose.foundation.gestures.FlingBehavior r4 = r8.a(r9, r4)
            r8 = -3670017(0xffffffffffc7ffff, float:NaN)
            r1 = r1 & r8
            goto L_0x01e3
        L_0x01df:
            r33 = r4
            r4 = r36
        L_0x01e3:
            if (r6 == 0) goto L_0x01e6
            goto L_0x01e8
        L_0x01e6:
            r18 = r37
        L_0x01e8:
            if (r0 == 0) goto L_0x01f1
            r0 = 0
            float r6 = (float) r0
            float r6 = androidx.compose.ui.unit.Dp.m(r6)
            goto L_0x01f4
        L_0x01f1:
            r0 = 0
            r6 = r39
        L_0x01f4:
            if (r2 == 0) goto L_0x0209
            float r0 = (float) r0
            float r0 = androidx.compose.ui.unit.Dp.m(r0)
            r8 = r33
            r22 = r0
        L_0x01ff:
            r16 = r5
            r21 = r6
            r19 = r18
            r6 = r1
            r18 = r4
            goto L_0x020e
        L_0x0209:
            r8 = r33
            r22 = r40
            goto L_0x01ff
        L_0x020e:
            r9.U()
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x021f
            java.lang.String r0 = "androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGrid (LazyStaggeredGrid.kt:62)"
            r1 = -1904835166(0xffffffff8e7685a2, float:-3.0386183E-30)
            androidx.compose.runtime.ComposerKt.Y(r1, r6, r3, r0)
        L_0x021f:
            r5 = r6 & 14
            r0 = r3 & 112(0x70, float:1.57E-43)
            r0 = r0 | r5
            kotlin.jvm.functions.Function0 r20 = androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemProviderKt.a(r12, r15, r9, r0)
            java.lang.Object r0 = r9.g()
            androidx.compose.runtime.Composer$Companion r1 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r1 = r1.a()
            if (r0 != r1) goto L_0x023d
            kotlin.coroutines.EmptyCoroutineContext r0 = kotlin.coroutines.EmptyCoroutineContext.f40721z
            kotlinx.coroutines.CoroutineScope r0 = androidx.compose.runtime.EffectsKt.j(r0, r9)
            r9.N(r0)
        L_0x023d:
            r23 = r0
            kotlinx.coroutines.CoroutineScope r23 = (kotlinx.coroutines.CoroutineScope) r23
            androidx.compose.runtime.ProvidableCompositionLocal r0 = androidx.compose.ui.platform.CompositionLocalsKt.j()
            java.lang.Object r0 = r9.C(r0)
            r24 = r0
            androidx.compose.ui.graphics.GraphicsContext r24 = (androidx.compose.ui.graphics.GraphicsContext) r24
            int r0 = r6 >> 6
            r1 = r0 & 896(0x380, float:1.256E-42)
            r1 = r1 | r5
            r0 = r0 & 7168(0x1c00, float:1.0045E-41)
            r0 = r0 | r1
            int r1 = r6 << 9
            r2 = 57344(0xe000, float:8.0356E-41)
            r1 = r1 & r2
            r0 = r0 | r1
            int r25 = r6 >> 12
            r1 = 458752(0x70000, float:6.42848E-40)
            r1 = r25 & r1
            r0 = r0 | r1
            r1 = 3670016(0x380000, float:5.142788E-39)
            r2 = 18
            int r2 = r3 << 18
            r1 = r1 & r2
            r0 = r0 | r1
            int r1 = r6 << 18
            r2 = 234881024(0xe000000, float:1.5777218E-30)
            r1 = r1 & r2
            r17 = r0 | r1
            r0 = r30
            r1 = r20
            r2 = r16
            r3 = r7
            r4 = r31
            r14 = r5
            r5 = r21
            r26 = r6
            r6 = r22
            r15 = r7
            r7 = r23
            r27 = r8
            r8 = r32
            r42 = r9
            r9 = r24
            r10 = r42
            r11 = r17
            kotlin.jvm.functions.Function2 r17 = androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasurePolicyKt.f(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r0 = r25 & 112(0x70, float:1.57E-43)
            r0 = r0 | r14
            r11 = r42
            androidx.compose.foundation.lazy.layout.LazyLayoutSemanticState r2 = androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridSemanticsKt.a(r12, r15, r11, r0)
            if (r19 == 0) goto L_0x02b9
            r0 = 1913386186(0x720bf4ca, float:2.7721183E30)
            r11.X(r0)
            androidx.compose.ui.Modifier$Companion r0 = androidx.compose.ui.Modifier.f15489d
            androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsState r1 = androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridBeyondBoundsModifierKt.a(r12, r11, r14)
            androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsInfo r3 = r30.r()
            androidx.compose.ui.Modifier r0 = androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsModifierLocalKt.b(r0, r1, r3, r15, r13)
            r11.M()
        L_0x02b7:
            r8 = r0
            goto L_0x02c5
        L_0x02b9:
            r0 = 1913691040(0x72109ba0, float:2.8642548E30)
            r11.X(r0)
            r11.M()
            androidx.compose.ui.Modifier$Companion r0 = androidx.compose.ui.Modifier.f15489d
            goto L_0x02b7
        L_0x02c5:
            androidx.compose.ui.layout.RemeasurementModifier r0 = r30.F()
            r14 = r27
            androidx.compose.ui.Modifier r0 = r14.o0(r0)
            androidx.compose.foundation.lazy.layout.AwaitFirstLayoutModifier r1 = r30.q()
            androidx.compose.ui.Modifier r0 = r0.o0(r1)
            int r1 = r26 << 6
            r1 = r1 & 7168(0x1c00, float:1.0045E-41)
            int r3 = r26 >> 9
            r4 = 57344(0xe000, float:8.0356E-41)
            r3 = r3 & r4
            r1 = r1 | r3
            r3 = 458752(0x70000, float:6.42848E-40)
            r3 = r26 & r3
            r7 = r1 | r3
            r1 = r20
            r3 = r31
            r4 = r19
            r5 = r15
            r6 = r11
            androidx.compose.ui.Modifier r0 = androidx.compose.foundation.lazy.layout.LazyLayoutSemanticsKt.c(r0, r1, r2, r3, r4, r5, r6, r7)
            androidx.compose.ui.Modifier r0 = r0.o0(r8)
            androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator r1 = r30.v()
            androidx.compose.ui.Modifier r1 = r1.j()
            androidx.compose.ui.Modifier r0 = r0.o0(r1)
            androidx.compose.foundation.interaction.MutableInteractionSource r6 = r30.A()
            r10 = 256(0x100, float:3.59E-43)
            r23 = 0
            r7 = 0
            r9 = 0
            r1 = r30
            r2 = r31
            r3 = r19
            r4 = r15
            r5 = r18
            r8 = r38
            r24 = r11
            r11 = r23
            androidx.compose.ui.Modifier r2 = androidx.compose.foundation.ScrollingContainerKt.b(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState r3 = r30.E()
            r6 = 0
            r1 = r20
            r4 = r17
            r5 = r24
            androidx.compose.foundation.lazy.layout.LazyLayoutKt.a(r1, r2, r3, r4, r5, r6, r7)
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x0338
            androidx.compose.runtime.ComposerKt.X()
        L_0x0338:
            r4 = r14
            r6 = r15
            r5 = r16
            r7 = r18
            r8 = r19
            r10 = r21
            r11 = r22
            goto L_0x0358
        L_0x0345:
            r24 = r9
            r24.B()
            r4 = r33
            r5 = r34
            r6 = r35
            r7 = r36
            r8 = r37
            r10 = r39
            r11 = r40
        L_0x0358:
            androidx.compose.runtime.ScopeUpdateScope r15 = r24.x()
            if (r15 == 0) goto L_0x037f
            androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridKt$LazyStaggeredGrid$1 r14 = new androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridKt$LazyStaggeredGrid$1
            r0 = r14
            r1 = r30
            r2 = r31
            r3 = r32
            r9 = r38
            r12 = r41
            r13 = r43
            r28 = r14
            r14 = r44
            r29 = r15
            r15 = r45
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            r1 = r28
            r0 = r29
            r0.a(r1)
        L_0x037f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridKt.a(androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState, androidx.compose.foundation.gestures.Orientation, androidx.compose.foundation.lazy.staggeredgrid.LazyGridStaggeredGridSlotsProvider, androidx.compose.ui.Modifier, androidx.compose.foundation.layout.PaddingValues, boolean, androidx.compose.foundation.gestures.FlingBehavior, boolean, androidx.compose.foundation.OverscrollEffect, float, float, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int, int):void");
    }
}
