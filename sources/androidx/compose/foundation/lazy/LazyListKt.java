package androidx.compose.foundation.lazy;

import kotlin.Metadata;

@Metadata
public final class LazyListKt {
    /* JADX WARNING: Removed duplicated region for block: B:106:0x0133  */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x0138  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x0152  */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x0157  */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x016d  */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x0172  */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x0186  */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x0189  */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x01a7  */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x01a9  */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x01b2  */
    /* JADX WARNING: Removed duplicated region for block: B:191:0x033c  */
    /* JADX WARNING: Removed duplicated region for block: B:194:0x0350  */
    /* JADX WARNING: Removed duplicated region for block: B:196:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00a3  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00a8  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00c1  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00c4  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x00db  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x00e0  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x00f9  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x00fe  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x0117  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x011c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void a(androidx.compose.ui.Modifier r31, androidx.compose.foundation.lazy.LazyListState r32, androidx.compose.foundation.layout.PaddingValues r33, boolean r34, boolean r35, androidx.compose.foundation.gestures.FlingBehavior r36, boolean r37, androidx.compose.foundation.OverscrollEffect r38, int r39, androidx.compose.ui.Alignment.Horizontal r40, androidx.compose.foundation.layout.Arrangement.Vertical r41, androidx.compose.ui.Alignment.Vertical r42, androidx.compose.foundation.layout.Arrangement.Horizontal r43, kotlin.jvm.functions.Function1 r44, androidx.compose.runtime.Composer r45, int r46, int r47, int r48) {
        /*
            r1 = r31
            r0 = r32
            r15 = r34
            r14 = r35
            r13 = r37
            r12 = r44
            r11 = r46
            r10 = r47
            r9 = r48
            r2 = 924924659(0x37213af3, float:9.610073E-6)
            r3 = r45
            androidx.compose.runtime.Composer r8 = r3.q(r2)
            r3 = r9 & 1
            if (r3 == 0) goto L_0x0022
            r3 = r11 | 6
            goto L_0x0032
        L_0x0022:
            r3 = r11 & 6
            if (r3 != 0) goto L_0x0031
            boolean r3 = r8.W(r1)
            if (r3 == 0) goto L_0x002e
            r3 = 4
            goto L_0x002f
        L_0x002e:
            r3 = 2
        L_0x002f:
            r3 = r3 | r11
            goto L_0x0032
        L_0x0031:
            r3 = r11
        L_0x0032:
            r6 = r9 & 2
            r16 = 32
            if (r6 == 0) goto L_0x003b
            r3 = r3 | 48
            goto L_0x004b
        L_0x003b:
            r6 = r11 & 48
            if (r6 != 0) goto L_0x004b
            boolean r6 = r8.W(r0)
            if (r6 == 0) goto L_0x0048
            r6 = r16
            goto L_0x004a
        L_0x0048:
            r6 = 16
        L_0x004a:
            r3 = r3 | r6
        L_0x004b:
            r6 = r9 & 4
            r17 = 128(0x80, float:1.794E-43)
            r18 = 256(0x100, float:3.59E-43)
            if (r6 == 0) goto L_0x0058
            r3 = r3 | 384(0x180, float:5.38E-43)
        L_0x0055:
            r6 = r33
            goto L_0x006b
        L_0x0058:
            r6 = r11 & 384(0x180, float:5.38E-43)
            if (r6 != 0) goto L_0x0055
            r6 = r33
            boolean r19 = r8.W(r6)
            if (r19 == 0) goto L_0x0067
            r19 = r18
            goto L_0x0069
        L_0x0067:
            r19 = r17
        L_0x0069:
            r3 = r3 | r19
        L_0x006b:
            r19 = r9 & 8
            r20 = 1024(0x400, float:1.435E-42)
            r21 = 2048(0x800, float:2.87E-42)
            if (r19 == 0) goto L_0x0076
            r3 = r3 | 3072(0xc00, float:4.305E-42)
            goto L_0x0086
        L_0x0076:
            r4 = r11 & 3072(0xc00, float:4.305E-42)
            if (r4 != 0) goto L_0x0086
            boolean r4 = r8.d(r15)
            if (r4 == 0) goto L_0x0083
            r4 = r21
            goto L_0x0085
        L_0x0083:
            r4 = r20
        L_0x0085:
            r3 = r3 | r4
        L_0x0086:
            r4 = r9 & 16
            if (r4 == 0) goto L_0x008d
            r3 = r3 | 24576(0x6000, float:3.4438E-41)
            goto L_0x009d
        L_0x008d:
            r4 = r11 & 24576(0x6000, float:3.4438E-41)
            if (r4 != 0) goto L_0x009d
            boolean r4 = r8.d(r14)
            if (r4 == 0) goto L_0x009a
            r4 = 16384(0x4000, float:2.2959E-41)
            goto L_0x009c
        L_0x009a:
            r4 = 8192(0x2000, float:1.14794E-41)
        L_0x009c:
            r3 = r3 | r4
        L_0x009d:
            r4 = r9 & 32
            r19 = 196608(0x30000, float:2.75506E-40)
            if (r4 == 0) goto L_0x00a8
            r3 = r3 | r19
        L_0x00a5:
            r4 = r36
            goto L_0x00bb
        L_0x00a8:
            r4 = r11 & r19
            if (r4 != 0) goto L_0x00a5
            r4 = r36
            boolean r19 = r8.W(r4)
            if (r19 == 0) goto L_0x00b7
            r19 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00b9
        L_0x00b7:
            r19 = 65536(0x10000, float:9.18355E-41)
        L_0x00b9:
            r3 = r3 | r19
        L_0x00bb:
            r19 = r9 & 64
            r22 = 1572864(0x180000, float:2.204052E-39)
            if (r19 == 0) goto L_0x00c4
            r3 = r3 | r22
            goto L_0x00d5
        L_0x00c4:
            r19 = r11 & r22
            if (r19 != 0) goto L_0x00d5
            boolean r19 = r8.d(r13)
            if (r19 == 0) goto L_0x00d1
            r19 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00d3
        L_0x00d1:
            r19 = 524288(0x80000, float:7.34684E-40)
        L_0x00d3:
            r3 = r3 | r19
        L_0x00d5:
            r5 = r9 & 128(0x80, float:1.794E-43)
            r22 = 12582912(0xc00000, float:1.7632415E-38)
            if (r5 == 0) goto L_0x00e0
            r3 = r3 | r22
        L_0x00dd:
            r5 = r38
            goto L_0x00f3
        L_0x00e0:
            r5 = r11 & r22
            if (r5 != 0) goto L_0x00dd
            r5 = r38
            boolean r22 = r8.W(r5)
            if (r22 == 0) goto L_0x00ef
            r22 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00f1
        L_0x00ef:
            r22 = 4194304(0x400000, float:5.877472E-39)
        L_0x00f1:
            r3 = r3 | r22
        L_0x00f3:
            r7 = r9 & 256(0x100, float:3.59E-43)
            r23 = 100663296(0x6000000, float:2.4074124E-35)
            if (r7 == 0) goto L_0x00fe
            r3 = r3 | r23
            r2 = r39
            goto L_0x0111
        L_0x00fe:
            r23 = r11 & r23
            r2 = r39
            if (r23 != 0) goto L_0x0111
            boolean r24 = r8.i(r2)
            if (r24 == 0) goto L_0x010d
            r24 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x010f
        L_0x010d:
            r24 = 33554432(0x2000000, float:9.403955E-38)
        L_0x010f:
            r3 = r3 | r24
        L_0x0111:
            r2 = r9 & 512(0x200, float:7.175E-43)
            r24 = 805306368(0x30000000, float:4.656613E-10)
            if (r2 == 0) goto L_0x011c
            r3 = r3 | r24
            r4 = r40
            goto L_0x012f
        L_0x011c:
            r24 = r11 & r24
            r4 = r40
            if (r24 != 0) goto L_0x012f
            boolean r24 = r8.W(r4)
            if (r24 == 0) goto L_0x012b
            r24 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x012d
        L_0x012b:
            r24 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x012d:
            r3 = r3 | r24
        L_0x012f:
            r4 = r9 & 1024(0x400, float:1.435E-42)
            if (r4 == 0) goto L_0x0138
            r19 = r10 | 6
            r5 = r41
            goto L_0x014e
        L_0x0138:
            r24 = r10 & 6
            r5 = r41
            if (r24 != 0) goto L_0x014c
            boolean r24 = r8.W(r5)
            if (r24 == 0) goto L_0x0147
            r19 = 4
            goto L_0x0149
        L_0x0147:
            r19 = 2
        L_0x0149:
            r19 = r10 | r19
            goto L_0x014e
        L_0x014c:
            r19 = r10
        L_0x014e:
            r5 = r9 & 2048(0x800, float:2.87E-42)
            if (r5 == 0) goto L_0x0157
            r19 = r19 | 48
        L_0x0154:
            r6 = r19
            goto L_0x0169
        L_0x0157:
            r24 = r10 & 48
            r6 = r42
            if (r24 != 0) goto L_0x0154
            boolean r24 = r8.W(r6)
            if (r24 == 0) goto L_0x0164
            goto L_0x0166
        L_0x0164:
            r16 = 16
        L_0x0166:
            r19 = r19 | r16
            goto L_0x0154
        L_0x0169:
            r11 = r9 & 4096(0x1000, float:5.74E-42)
            if (r11 == 0) goto L_0x0172
            r6 = r6 | 384(0x180, float:5.38E-43)
        L_0x016f:
            r13 = r43
            goto L_0x0182
        L_0x0172:
            r13 = r10 & 384(0x180, float:5.38E-43)
            if (r13 != 0) goto L_0x016f
            r13 = r43
            boolean r16 = r8.W(r13)
            if (r16 == 0) goto L_0x0180
            r17 = r18
        L_0x0180:
            r6 = r6 | r17
        L_0x0182:
            r13 = r9 & 8192(0x2000, float:1.14794E-41)
            if (r13 == 0) goto L_0x0189
            r6 = r6 | 3072(0xc00, float:4.305E-42)
            goto L_0x0197
        L_0x0189:
            r13 = r10 & 3072(0xc00, float:4.305E-42)
            if (r13 != 0) goto L_0x0197
            boolean r13 = r8.l(r12)
            if (r13 == 0) goto L_0x0195
            r20 = r21
        L_0x0195:
            r6 = r6 | r20
        L_0x0197:
            r13 = 306783379(0x12492493, float:6.34695E-28)
            r13 = r13 & r3
            r9 = 306783378(0x12492492, float:6.3469493E-28)
            if (r13 != r9) goto L_0x01a9
            r9 = r6 & 1171(0x493, float:1.641E-42)
            r13 = 1170(0x492, float:1.64E-42)
            if (r9 == r13) goto L_0x01a7
            goto L_0x01a9
        L_0x01a7:
            r9 = 0
            goto L_0x01aa
        L_0x01a9:
            r9 = 1
        L_0x01aa:
            r13 = r3 & 1
            boolean r9 = r8.E(r9, r13)
            if (r9 == 0) goto L_0x033c
            if (r7 == 0) goto L_0x01b7
            r7 = 0
            r13 = r7
            goto L_0x01b9
        L_0x01b7:
            r13 = r39
        L_0x01b9:
            r7 = 0
            if (r2 == 0) goto L_0x01bf
            r18 = r7
            goto L_0x01c1
        L_0x01bf:
            r18 = r40
        L_0x01c1:
            if (r4 == 0) goto L_0x01c6
            r19 = r7
            goto L_0x01c8
        L_0x01c6:
            r19 = r41
        L_0x01c8:
            if (r5 == 0) goto L_0x01cd
            r20 = r7
            goto L_0x01cf
        L_0x01cd:
            r20 = r42
        L_0x01cf:
            if (r11 == 0) goto L_0x01d4
            r21 = r7
            goto L_0x01d6
        L_0x01d4:
            r21 = r43
        L_0x01d6:
            boolean r2 = androidx.compose.runtime.ComposerKt.P()
            if (r2 == 0) goto L_0x01e4
            java.lang.String r2 = "androidx.compose.foundation.lazy.LazyList (LazyList.kt:84)"
            r4 = 924924659(0x37213af3, float:9.610073E-6)
            androidx.compose.runtime.ComposerKt.Y(r4, r3, r6, r2)
        L_0x01e4:
            int r2 = r3 >> 3
            r22 = r2 & 14
            int r2 = r6 >> 6
            r2 = r2 & 112(0x70, float:1.57E-43)
            r2 = r22 | r2
            kotlin.jvm.functions.Function0 r23 = androidx.compose.foundation.lazy.LazyListItemProviderKt.a(r0, r12, r8, r2)
            int r2 = r3 >> 9
            r4 = r2 & 112(0x70, float:1.57E-43)
            r4 = r22 | r4
            androidx.compose.foundation.lazy.layout.LazyLayoutSemanticState r24 = androidx.compose.foundation.lazy.LazyListSemanticsKt.a(r0, r14, r8, r4)
            java.lang.Object r4 = r8.g()
            androidx.compose.runtime.Composer$Companion r5 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r5 = r5.a()
            if (r4 != r5) goto L_0x0211
            kotlin.coroutines.EmptyCoroutineContext r4 = kotlin.coroutines.EmptyCoroutineContext.f40721z
            kotlinx.coroutines.CoroutineScope r4 = androidx.compose.runtime.EffectsKt.j(r4, r8)
            r8.N(r4)
        L_0x0211:
            r16 = r4
            kotlinx.coroutines.CoroutineScope r16 = (kotlinx.coroutines.CoroutineScope) r16
            androidx.compose.runtime.ProvidableCompositionLocal r4 = androidx.compose.ui.platform.CompositionLocalsKt.j()
            java.lang.Object r4 = r8.C(r4)
            r17 = r4
            androidx.compose.ui.graphics.GraphicsContext r17 = (androidx.compose.ui.graphics.GraphicsContext) r17
            androidx.compose.runtime.CompositionLocal r4 = androidx.compose.ui.platform.CompositionLocalsKt.p()
            java.lang.Object r4 = r8.C(r4)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 != 0) goto L_0x023a
            androidx.compose.foundation.lazy.layout.StickyItemsPlacement$Companion r4 = androidx.compose.foundation.lazy.layout.StickyItemsPlacement.f4989a
            androidx.compose.foundation.lazy.layout.StickyItemsPlacement r4 = r4.a()
            r25 = r4
            goto L_0x023c
        L_0x023a:
            r25 = r7
        L_0x023c:
            r4 = 65520(0xfff0, float:9.1813E-41)
            r4 = r4 & r3
            r5 = 458752(0x70000, float:6.42848E-40)
            r5 = r5 & r2
            r4 = r4 | r5
            r5 = 3670016(0x380000, float:5.142788E-39)
            r2 = r2 & r5
            r2 = r2 | r4
            int r4 = r6 << 18
            r5 = 29360128(0x1c00000, float:7.052966E-38)
            r5 = r5 & r4
            r2 = r2 | r5
            r5 = 234881024(0xe000000, float:1.5777218E-30)
            r4 = r4 & r5
            r2 = r2 | r4
            int r4 = r6 << 27
            r5 = 1879048192(0x70000000, float:1.58456325E29)
            r4 = r4 & r5
            r26 = r2 | r4
            r27 = 0
            r2 = r23
            r28 = r3
            r3 = r32
            r4 = r33
            r5 = r34
            r6 = r35
            r7 = r13
            r11 = r8
            r8 = r18
            r9 = r20
            r10 = r21
            r45 = r11
            r11 = r19
            r12 = r16
            r1 = r13
            r13 = r17
            r14 = r25
            r15 = r45
            r16 = r26
            r17 = r27
            kotlin.jvm.functions.Function2 r14 = b(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            if (r35 == 0) goto L_0x028a
            androidx.compose.foundation.gestures.Orientation r2 = androidx.compose.foundation.gestures.Orientation.Vertical
        L_0x0288:
            r10 = r2
            goto L_0x028d
        L_0x028a:
            androidx.compose.foundation.gestures.Orientation r2 = androidx.compose.foundation.gestures.Orientation.Horizontal
            goto L_0x0288
        L_0x028d:
            if (r37 == 0) goto L_0x02b2
            r2 = -1513147781(0xffffffffa5cf327b, float:-3.5942983E-16)
            r15 = r45
            r15.X(r2)
            androidx.compose.ui.Modifier$Companion r2 = androidx.compose.ui.Modifier.f15489d
            int r3 = r28 >> 21
            r3 = r3 & 112(0x70, float:1.57E-43)
            r3 = r22 | r3
            androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsState r3 = androidx.compose.foundation.lazy.LazyListBeyondBoundsModifierKt.a(r0, r1, r15, r3)
            androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsInfo r4 = r32.q()
            r13 = r34
            androidx.compose.ui.Modifier r2 = androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsModifierLocalKt.b(r2, r3, r4, r13, r10)
            r15.M()
        L_0x02b0:
            r11 = r2
            goto L_0x02c2
        L_0x02b2:
            r13 = r34
            r15 = r45
            r2 = -1512720880(0xffffffffa5d5b610, float:-3.707298E-16)
            r15.X(r2)
            r15.M()
            androidx.compose.ui.Modifier$Companion r2 = androidx.compose.ui.Modifier.f15489d
            goto L_0x02b0
        L_0x02c2:
            androidx.compose.ui.layout.RemeasurementModifier r2 = r32.D()
            r16 = r1
            r1 = r31
            androidx.compose.ui.Modifier r2 = r1.o0(r2)
            androidx.compose.foundation.lazy.layout.AwaitFirstLayoutModifier r3 = r32.p()
            androidx.compose.ui.Modifier r2 = r2.o0(r3)
            int r3 = r28 >> 6
            r4 = 57344(0xe000, float:8.0356E-41)
            r3 = r3 & r4
            r4 = 458752(0x70000, float:6.42848E-40)
            int r5 = r28 << 6
            r4 = r4 & r5
            r9 = r3 | r4
            r3 = r23
            r4 = r24
            r5 = r10
            r6 = r37
            r7 = r34
            r8 = r15
            androidx.compose.ui.Modifier r2 = androidx.compose.foundation.lazy.layout.LazyLayoutSemanticsKt.c(r2, r3, r4, r5, r6, r7, r8, r9)
            androidx.compose.ui.Modifier r2 = r2.o0(r11)
            androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator r3 = r32.w()
            androidx.compose.ui.Modifier r3 = r3.j()
            androidx.compose.ui.Modifier r2 = r2.o0(r3)
            androidx.compose.foundation.interaction.MutableInteractionSource r8 = r32.v()
            r12 = 256(0x100, float:3.59E-43)
            r17 = 0
            r9 = 0
            r11 = 0
            r3 = r32
            r4 = r10
            r5 = r37
            r6 = r34
            r7 = r36
            r10 = r38
            r13 = r17
            androidx.compose.ui.Modifier r4 = androidx.compose.foundation.ScrollingContainerKt.b(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState r5 = r32.C()
            r8 = 0
            r3 = r23
            r6 = r14
            r7 = r15
            androidx.compose.foundation.lazy.layout.LazyLayoutKt.a(r3, r4, r5, r6, r7, r8, r9)
            boolean r2 = androidx.compose.runtime.ComposerKt.P()
            if (r2 == 0) goto L_0x0331
            androidx.compose.runtime.ComposerKt.X()
        L_0x0331:
            r9 = r16
            r10 = r18
            r11 = r19
            r12 = r20
            r13 = r21
            goto L_0x034a
        L_0x033c:
            r15 = r8
            r15.B()
            r9 = r39
            r10 = r40
            r11 = r41
            r12 = r42
            r13 = r43
        L_0x034a:
            androidx.compose.runtime.ScopeUpdateScope r15 = r15.x()
            if (r15 == 0) goto L_0x0379
            androidx.compose.foundation.lazy.LazyListKt$LazyList$1 r14 = new androidx.compose.foundation.lazy.LazyListKt$LazyList$1
            r0 = r14
            r1 = r31
            r2 = r32
            r3 = r33
            r4 = r34
            r5 = r35
            r6 = r36
            r7 = r37
            r8 = r38
            r29 = r14
            r14 = r44
            r30 = r15
            r15 = r46
            r16 = r47
            r17 = r48
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            r1 = r29
            r0 = r30
            r0.a(r1)
        L_0x0379:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.LazyListKt.a(androidx.compose.ui.Modifier, androidx.compose.foundation.lazy.LazyListState, androidx.compose.foundation.layout.PaddingValues, boolean, boolean, androidx.compose.foundation.gestures.FlingBehavior, boolean, androidx.compose.foundation.OverscrollEffect, int, androidx.compose.ui.Alignment$Horizontal, androidx.compose.foundation.layout.Arrangement$Vertical, androidx.compose.ui.Alignment$Vertical, androidx.compose.foundation.layout.Arrangement$Horizontal, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v6, resolved type: androidx.compose.foundation.lazy.LazyListKt$rememberLazyListMeasurePolicy$1$1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v46, resolved type: androidx.compose.foundation.lazy.LazyListKt$rememberLazyListMeasurePolicy$1$1} */
    /* JADX WARNING: type inference failed for: r2v2 */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00bd, code lost:
        if (r0.W(r29) == false) goto L_0x00c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x00d9, code lost:
        if (r0.W(r30) == false) goto L_0x00de;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0023, code lost:
        if (r0.W(r22) == false) goto L_0x0028;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x00f8, code lost:
        if (r0.W(r33) == false) goto L_0x00fd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x0114, code lost:
        if (r2 == androidx.compose.runtime.Composer.f14567a.a()) goto L_0x0116;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0075  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0077  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x008f  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0091  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00a9  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00ab  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00b7  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00c0  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00c7  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x00d3  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00dc  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00e3  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x00f2  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x00fb  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0104  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x010e  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0141  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final kotlin.jvm.functions.Function2 b(kotlin.jvm.functions.Function0 r21, androidx.compose.foundation.lazy.LazyListState r22, androidx.compose.foundation.layout.PaddingValues r23, boolean r24, boolean r25, int r26, androidx.compose.ui.Alignment.Horizontal r27, androidx.compose.ui.Alignment.Vertical r28, androidx.compose.foundation.layout.Arrangement.Horizontal r29, androidx.compose.foundation.layout.Arrangement.Vertical r30, kotlinx.coroutines.CoroutineScope r31, androidx.compose.ui.graphics.GraphicsContext r32, androidx.compose.foundation.lazy.layout.StickyItemsPlacement r33, androidx.compose.runtime.Composer r34, int r35, int r36) {
        /*
            r0 = r34
            r1 = r35
            r2 = r36
            boolean r3 = androidx.compose.runtime.ComposerKt.P()
            if (r3 == 0) goto L_0x0014
            r3 = -739270660(0xffffffffd3ef9ffc, float:-2.05836255E12)
            java.lang.String r4 = "androidx.compose.foundation.lazy.rememberLazyListMeasurePolicy (LazyList.kt:187)"
            androidx.compose.runtime.ComposerKt.Y(r3, r1, r2, r4)
        L_0x0014:
            r3 = r1 & 112(0x70, float:1.57E-43)
            r3 = r3 ^ 48
            r4 = 32
            r6 = 1
            if (r3 <= r4) goto L_0x0026
            r3 = r22
            boolean r7 = r0.W(r3)
            if (r7 != 0) goto L_0x002c
            goto L_0x0028
        L_0x0026:
            r3 = r22
        L_0x0028:
            r7 = r1 & 48
            if (r7 != r4) goto L_0x002e
        L_0x002c:
            r4 = r6
            goto L_0x002f
        L_0x002e:
            r4 = 0
        L_0x002f:
            r7 = r1 & 896(0x380, float:1.256E-42)
            r7 = r7 ^ 384(0x180, float:5.38E-43)
            r8 = 256(0x100, float:3.59E-43)
            r10 = r23
            if (r7 <= r8) goto L_0x003f
            boolean r7 = r0.W(r10)
            if (r7 != 0) goto L_0x0043
        L_0x003f:
            r7 = r1 & 384(0x180, float:5.38E-43)
            if (r7 != r8) goto L_0x0045
        L_0x0043:
            r7 = r6
            goto L_0x0046
        L_0x0045:
            r7 = 0
        L_0x0046:
            r4 = r4 | r7
            r7 = r1 & 7168(0x1c00, float:1.0045E-41)
            r7 = r7 ^ 3072(0xc00, float:4.305E-42)
            r9 = 2048(0x800, float:2.87E-42)
            r11 = r24
            if (r7 <= r9) goto L_0x0057
            boolean r7 = r0.d(r11)
            if (r7 != 0) goto L_0x005b
        L_0x0057:
            r7 = r1 & 3072(0xc00, float:4.305E-42)
            if (r7 != r9) goto L_0x005d
        L_0x005b:
            r7 = r6
            goto L_0x005e
        L_0x005d:
            r7 = 0
        L_0x005e:
            r4 = r4 | r7
            r7 = 57344(0xe000, float:8.0356E-41)
            r7 = r7 & r1
            r7 = r7 ^ 24576(0x6000, float:3.4438E-41)
            r9 = 16384(0x4000, float:2.2959E-41)
            r12 = r25
            if (r7 <= r9) goto L_0x0071
            boolean r7 = r0.d(r12)
            if (r7 != 0) goto L_0x0075
        L_0x0071:
            r7 = r1 & 24576(0x6000, float:3.4438E-41)
            if (r7 != r9) goto L_0x0077
        L_0x0075:
            r7 = r6
            goto L_0x0078
        L_0x0077:
            r7 = 0
        L_0x0078:
            r4 = r4 | r7
            r7 = 3670016(0x380000, float:5.142788E-39)
            r7 = r7 & r1
            r9 = 1572864(0x180000, float:2.204052E-39)
            r7 = r7 ^ r9
            r13 = 1048576(0x100000, float:1.469368E-39)
            r15 = r27
            if (r7 <= r13) goto L_0x008b
            boolean r7 = r0.W(r15)
            if (r7 != 0) goto L_0x008f
        L_0x008b:
            r7 = r1 & r9
            if (r7 != r13) goto L_0x0091
        L_0x008f:
            r7 = r6
            goto L_0x0092
        L_0x0091:
            r7 = 0
        L_0x0092:
            r4 = r4 | r7
            r7 = 29360128(0x1c00000, float:7.052966E-38)
            r7 = r7 & r1
            r9 = 12582912(0xc00000, float:1.7632415E-38)
            r7 = r7 ^ r9
            r13 = 8388608(0x800000, float:1.17549435E-38)
            r14 = r28
            if (r7 <= r13) goto L_0x00a5
            boolean r7 = r0.W(r14)
            if (r7 != 0) goto L_0x00a9
        L_0x00a5:
            r7 = r1 & r9
            if (r7 != r13) goto L_0x00ab
        L_0x00a9:
            r7 = r6
            goto L_0x00ac
        L_0x00ab:
            r7 = 0
        L_0x00ac:
            r4 = r4 | r7
            r7 = 234881024(0xe000000, float:1.5777218E-30)
            r7 = r7 & r1
            r9 = 100663296(0x6000000, float:2.4074124E-35)
            r7 = r7 ^ r9
            r13 = 67108864(0x4000000, float:1.5046328E-36)
            if (r7 <= r13) goto L_0x00c0
            r7 = r29
            boolean r16 = r0.W(r7)
            if (r16 != 0) goto L_0x00c5
            goto L_0x00c2
        L_0x00c0:
            r7 = r29
        L_0x00c2:
            r9 = r9 & r1
            if (r9 != r13) goto L_0x00c7
        L_0x00c5:
            r9 = r6
            goto L_0x00c8
        L_0x00c7:
            r9 = 0
        L_0x00c8:
            r4 = r4 | r9
            r9 = 1879048192(0x70000000, float:1.58456325E29)
            r9 = r9 & r1
            r13 = 805306368(0x30000000, float:4.656613E-10)
            r9 = r9 ^ r13
            r5 = 536870912(0x20000000, float:1.0842022E-19)
            if (r9 <= r5) goto L_0x00dc
            r9 = r30
            boolean r17 = r0.W(r9)
            if (r17 != 0) goto L_0x00e1
            goto L_0x00de
        L_0x00dc:
            r9 = r30
        L_0x00de:
            r1 = r1 & r13
            if (r1 != r5) goto L_0x00e3
        L_0x00e1:
            r1 = r6
            goto L_0x00e4
        L_0x00e3:
            r1 = 0
        L_0x00e4:
            r1 = r1 | r4
            r4 = r32
            boolean r5 = r0.W(r4)
            r1 = r1 | r5
            r5 = r2 & 896(0x380, float:1.256E-42)
            r5 = r5 ^ 384(0x180, float:5.38E-43)
            if (r5 <= r8) goto L_0x00fb
            r5 = r33
            boolean r13 = r0.W(r5)
            if (r13 != 0) goto L_0x0101
            goto L_0x00fd
        L_0x00fb:
            r5 = r33
        L_0x00fd:
            r2 = r2 & 384(0x180, float:5.38E-43)
            if (r2 != r8) goto L_0x0104
        L_0x0101:
            r16 = r6
            goto L_0x0106
        L_0x0104:
            r16 = 0
        L_0x0106:
            r1 = r1 | r16
            java.lang.Object r2 = r34.g()
            if (r1 != 0) goto L_0x0116
            androidx.compose.runtime.Composer$Companion r1 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r1 = r1.a()
            if (r2 != r1) goto L_0x0139
        L_0x0116:
            androidx.compose.foundation.lazy.LazyListKt$rememberLazyListMeasurePolicy$1$1 r2 = new androidx.compose.foundation.lazy.LazyListKt$rememberLazyListMeasurePolicy$1$1
            r7 = r2
            r8 = r22
            r9 = r25
            r10 = r23
            r11 = r24
            r12 = r21
            r13 = r30
            r14 = r29
            r15 = r26
            r16 = r31
            r17 = r32
            r18 = r33
            r19 = r27
            r20 = r28
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            r0.N(r2)
        L_0x0139:
            kotlin.jvm.functions.Function2 r2 = (kotlin.jvm.functions.Function2) r2
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x0144
            androidx.compose.runtime.ComposerKt.X()
        L_0x0144:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.LazyListKt.b(kotlin.jvm.functions.Function0, androidx.compose.foundation.lazy.LazyListState, androidx.compose.foundation.layout.PaddingValues, boolean, boolean, int, androidx.compose.ui.Alignment$Horizontal, androidx.compose.ui.Alignment$Vertical, androidx.compose.foundation.layout.Arrangement$Horizontal, androidx.compose.foundation.layout.Arrangement$Vertical, kotlinx.coroutines.CoroutineScope, androidx.compose.ui.graphics.GraphicsContext, androidx.compose.foundation.lazy.layout.StickyItemsPlacement, androidx.compose.runtime.Composer, int, int):kotlin.jvm.functions.Function2");
    }
}
