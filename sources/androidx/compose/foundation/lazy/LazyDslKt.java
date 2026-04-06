package androidx.compose.foundation.lazy;

import kotlin.Metadata;

@Metadata
public final class LazyDslKt {
    /* JADX WARNING: Removed duplicated region for block: B:136:0x0195  */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x01db  */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x01e3  */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x01f5  */
    /* JADX WARNING: Removed duplicated region for block: B:146:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0095  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00a1  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00b7  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x00cd  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x00d5  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x00da  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x00f7  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x00f9  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x0102  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final /* synthetic */ void a(androidx.compose.ui.Modifier r24, androidx.compose.foundation.lazy.LazyListState r25, androidx.compose.foundation.layout.PaddingValues r26, boolean r27, androidx.compose.foundation.layout.Arrangement.Vertical r28, androidx.compose.ui.Alignment.Horizontal r29, androidx.compose.foundation.gestures.FlingBehavior r30, kotlin.jvm.functions.Function1 r31, androidx.compose.runtime.Composer r32, int r33, int r34) {
        /*
            r9 = r33
            r10 = r34
            r0 = -563353797(0xffffffffde6be73b, float:-4.24965505E18)
            r1 = r32
            androidx.compose.runtime.Composer r1 = r1.q(r0)
            r2 = r10 & 1
            if (r2 == 0) goto L_0x0017
            r3 = r9 | 6
            r4 = r3
            r3 = r24
            goto L_0x002b
        L_0x0017:
            r3 = r9 & 6
            if (r3 != 0) goto L_0x0028
            r3 = r24
            boolean r4 = r1.W(r3)
            if (r4 == 0) goto L_0x0025
            r4 = 4
            goto L_0x0026
        L_0x0025:
            r4 = 2
        L_0x0026:
            r4 = r4 | r9
            goto L_0x002b
        L_0x0028:
            r3 = r24
            r4 = r9
        L_0x002b:
            r5 = r9 & 48
            if (r5 != 0) goto L_0x0044
            r5 = r10 & 2
            if (r5 != 0) goto L_0x003e
            r5 = r25
            boolean r6 = r1.W(r5)
            if (r6 == 0) goto L_0x0040
            r6 = 32
            goto L_0x0042
        L_0x003e:
            r5 = r25
        L_0x0040:
            r6 = 16
        L_0x0042:
            r4 = r4 | r6
            goto L_0x0046
        L_0x0044:
            r5 = r25
        L_0x0046:
            r6 = r10 & 4
            if (r6 == 0) goto L_0x004f
            r4 = r4 | 384(0x180, float:5.38E-43)
        L_0x004c:
            r7 = r26
            goto L_0x0061
        L_0x004f:
            r7 = r9 & 384(0x180, float:5.38E-43)
            if (r7 != 0) goto L_0x004c
            r7 = r26
            boolean r8 = r1.W(r7)
            if (r8 == 0) goto L_0x005e
            r8 = 256(0x100, float:3.59E-43)
            goto L_0x0060
        L_0x005e:
            r8 = 128(0x80, float:1.794E-43)
        L_0x0060:
            r4 = r4 | r8
        L_0x0061:
            r8 = r10 & 8
            if (r8 == 0) goto L_0x006a
            r4 = r4 | 3072(0xc00, float:4.305E-42)
        L_0x0067:
            r11 = r27
            goto L_0x007c
        L_0x006a:
            r11 = r9 & 3072(0xc00, float:4.305E-42)
            if (r11 != 0) goto L_0x0067
            r11 = r27
            boolean r12 = r1.d(r11)
            if (r12 == 0) goto L_0x0079
            r12 = 2048(0x800, float:2.87E-42)
            goto L_0x007b
        L_0x0079:
            r12 = 1024(0x400, float:1.435E-42)
        L_0x007b:
            r4 = r4 | r12
        L_0x007c:
            r12 = r9 & 24576(0x6000, float:3.4438E-41)
            if (r12 != 0) goto L_0x0095
            r12 = r10 & 16
            if (r12 != 0) goto L_0x008f
            r12 = r28
            boolean r13 = r1.W(r12)
            if (r13 == 0) goto L_0x0091
            r13 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0093
        L_0x008f:
            r12 = r28
        L_0x0091:
            r13 = 8192(0x2000, float:1.14794E-41)
        L_0x0093:
            r4 = r4 | r13
            goto L_0x0097
        L_0x0095:
            r12 = r28
        L_0x0097:
            r13 = r10 & 32
            r14 = 196608(0x30000, float:2.75506E-40)
            if (r13 == 0) goto L_0x00a1
            r4 = r4 | r14
        L_0x009e:
            r14 = r29
            goto L_0x00b2
        L_0x00a1:
            r14 = r14 & r9
            if (r14 != 0) goto L_0x009e
            r14 = r29
            boolean r15 = r1.W(r14)
            if (r15 == 0) goto L_0x00af
            r15 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00b1
        L_0x00af:
            r15 = 65536(0x10000, float:9.18355E-41)
        L_0x00b1:
            r4 = r4 | r15
        L_0x00b2:
            r15 = 1572864(0x180000, float:2.204052E-39)
            r15 = r15 & r9
            if (r15 != 0) goto L_0x00cd
            r15 = r10 & 64
            if (r15 != 0) goto L_0x00c6
            r15 = r30
            boolean r16 = r1.W(r15)
            if (r16 == 0) goto L_0x00c8
            r16 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00ca
        L_0x00c6:
            r15 = r30
        L_0x00c8:
            r16 = 524288(0x80000, float:7.34684E-40)
        L_0x00ca:
            r4 = r4 | r16
            goto L_0x00cf
        L_0x00cd:
            r15 = r30
        L_0x00cf:
            r0 = r10 & 128(0x80, float:1.794E-43)
            r17 = 12582912(0xc00000, float:1.7632415E-38)
            if (r0 == 0) goto L_0x00da
            r4 = r4 | r17
        L_0x00d7:
            r0 = r31
            goto L_0x00ed
        L_0x00da:
            r0 = r9 & r17
            if (r0 != 0) goto L_0x00d7
            r0 = r31
            boolean r18 = r1.l(r0)
            if (r18 == 0) goto L_0x00e9
            r18 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00eb
        L_0x00e9:
            r18 = 4194304(0x400000, float:5.877472E-39)
        L_0x00eb:
            r4 = r4 | r18
        L_0x00ed:
            r18 = 4793491(0x492493, float:6.717112E-39)
            r0 = r4 & r18
            r3 = 4793490(0x492492, float:6.71711E-39)
            if (r0 == r3) goto L_0x00f9
            r0 = 1
            goto L_0x00fa
        L_0x00f9:
            r0 = 0
        L_0x00fa:
            r3 = r4 & 1
            boolean r0 = r1.E(r0, r3)
            if (r0 == 0) goto L_0x01e3
            r1.p()
            r0 = r9 & 1
            r3 = -3670017(0xffffffffffc7ffff, float:NaN)
            r18 = -57345(0xffffffffffff1fff, float:NaN)
            r5 = 6
            if (r0 == 0) goto L_0x0136
            boolean r0 = r1.J()
            if (r0 == 0) goto L_0x0117
            goto L_0x0136
        L_0x0117:
            r1.B()
            r0 = r10 & 2
            if (r0 == 0) goto L_0x0120
            r4 = r4 & -113(0xffffffffffffff8f, float:NaN)
        L_0x0120:
            r0 = r10 & 16
            if (r0 == 0) goto L_0x0126
            r4 = r4 & r18
        L_0x0126:
            r0 = r10 & 64
            if (r0 == 0) goto L_0x012b
            r4 = r4 & r3
        L_0x012b:
            r0 = r24
            r2 = r25
            r6 = r7
        L_0x0130:
            r3 = r11
            r7 = r14
            r8 = r15
        L_0x0133:
            r11 = r4
            r4 = r12
            goto L_0x018c
        L_0x0136:
            if (r2 == 0) goto L_0x013b
            androidx.compose.ui.Modifier$Companion r0 = androidx.compose.ui.Modifier.f15489d
            goto L_0x013d
        L_0x013b:
            r0 = r24
        L_0x013d:
            r2 = r10 & 2
            if (r2 == 0) goto L_0x014a
            r2 = 3
            r3 = 0
            androidx.compose.foundation.lazy.LazyListState r2 = androidx.compose.foundation.lazy.LazyListStateKt.b(r3, r3, r1, r3, r2)
            r4 = r4 & -113(0xffffffffffffff8f, float:NaN)
            goto L_0x014d
        L_0x014a:
            r3 = 0
            r2 = r25
        L_0x014d:
            if (r6 == 0) goto L_0x0159
            float r6 = (float) r3
            float r6 = androidx.compose.ui.unit.Dp.m(r6)
            androidx.compose.foundation.layout.PaddingValues r6 = androidx.compose.foundation.layout.PaddingKt.a(r6)
            goto L_0x015a
        L_0x0159:
            r6 = r7
        L_0x015a:
            if (r8 == 0) goto L_0x015d
            r11 = r3
        L_0x015d:
            r3 = r10 & 16
            if (r3 == 0) goto L_0x0171
            androidx.compose.foundation.layout.Arrangement r3 = androidx.compose.foundation.layout.Arrangement.f3739a
            if (r11 != 0) goto L_0x016a
            androidx.compose.foundation.layout.Arrangement$Vertical r3 = r3.g()
            goto L_0x016e
        L_0x016a:
            androidx.compose.foundation.layout.Arrangement$Vertical r3 = r3.a()
        L_0x016e:
            r4 = r4 & r18
            r12 = r3
        L_0x0171:
            if (r13 == 0) goto L_0x017a
            androidx.compose.ui.Alignment$Companion r3 = androidx.compose.ui.Alignment.f15444a
            androidx.compose.ui.Alignment$Horizontal r3 = r3.k()
            r14 = r3
        L_0x017a:
            r3 = r10 & 64
            if (r3 == 0) goto L_0x0130
            androidx.compose.foundation.gestures.ScrollableDefaults r3 = androidx.compose.foundation.gestures.ScrollableDefaults.f3558a
            androidx.compose.foundation.gestures.FlingBehavior r3 = r3.a(r1, r5)
            r7 = -3670017(0xffffffffffc7ffff, float:NaN)
            r4 = r4 & r7
            r8 = r3
            r3 = r11
            r7 = r14
            goto L_0x0133
        L_0x018c:
            r1.U()
            boolean r12 = androidx.compose.runtime.ComposerKt.P()
            if (r12 == 0) goto L_0x019e
            r12 = -1
            java.lang.String r13 = "androidx.compose.foundation.lazy.LazyColumn (LazyDsl.kt:455)"
            r14 = -563353797(0xffffffffde6be73b, float:-4.24965505E18)
            androidx.compose.runtime.ComposerKt.Y(r14, r11, r12, r13)
        L_0x019e:
            r12 = r11 & 14
            r12 = r12 | r17
            r13 = r11 & 112(0x70, float:1.57E-43)
            r12 = r12 | r13
            r13 = r11 & 896(0x380, float:1.256E-42)
            r12 = r12 | r13
            r13 = r11 & 7168(0x1c00, float:1.0045E-41)
            r12 = r12 | r13
            r13 = 57344(0xe000, float:8.0356E-41)
            r13 = r13 & r11
            r12 = r12 | r13
            r13 = 458752(0x70000, float:6.42848E-40)
            r13 = r13 & r11
            r12 = r12 | r13
            r13 = 3670016(0x380000, float:5.142788E-39)
            r13 = r13 & r11
            r12 = r12 | r13
            r13 = 1879048192(0x70000000, float:1.58456325E29)
            int r5 = r11 << 6
            r5 = r5 & r13
            r22 = r12 | r5
            r23 = 256(0x100, float:3.59E-43)
            r18 = 1
            r19 = 0
            r11 = r0
            r12 = r2
            r13 = r6
            r14 = r3
            r15 = r4
            r16 = r7
            r17 = r8
            r20 = r31
            r21 = r1
            b(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            boolean r5 = androidx.compose.runtime.ComposerKt.P()
            if (r5 == 0) goto L_0x01de
            androidx.compose.runtime.ComposerKt.X()
        L_0x01de:
            r5 = r4
            r4 = r3
            r3 = r2
            r2 = r0
            goto L_0x01ef
        L_0x01e3:
            r1.B()
            r2 = r24
            r3 = r25
            r6 = r7
            r4 = r11
            r5 = r12
            r7 = r14
            r8 = r15
        L_0x01ef:
            androidx.compose.runtime.ScopeUpdateScope r11 = r1.x()
            if (r11 == 0) goto L_0x0209
            androidx.compose.foundation.lazy.LazyDslKt$LazyColumn$3 r12 = new androidx.compose.foundation.lazy.LazyDslKt$LazyColumn$3
            r0 = r12
            r1 = r2
            r2 = r3
            r3 = r6
            r6 = r7
            r7 = r8
            r8 = r31
            r9 = r33
            r10 = r34
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r11.a(r12)
        L_0x0209:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.LazyDslKt.a(androidx.compose.ui.Modifier, androidx.compose.foundation.lazy.LazyListState, androidx.compose.foundation.layout.PaddingValues, boolean, androidx.compose.foundation.layout.Arrangement$Vertical, androidx.compose.ui.Alignment$Horizontal, androidx.compose.foundation.gestures.FlingBehavior, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:100:0x0111  */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x0116  */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x0136  */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x0139  */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x0142  */
    /* JADX WARNING: Removed duplicated region for block: B:173:0x025e  */
    /* JADX WARNING: Removed duplicated region for block: B:176:0x0275  */
    /* JADX WARNING: Removed duplicated region for block: B:178:? A[RETURN, SYNTHETIC] */
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
    /* JADX WARNING: Removed duplicated region for block: B:97:0x0109  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void b(androidx.compose.ui.Modifier r32, androidx.compose.foundation.lazy.LazyListState r33, androidx.compose.foundation.layout.PaddingValues r34, boolean r35, androidx.compose.foundation.layout.Arrangement.Vertical r36, androidx.compose.ui.Alignment.Horizontal r37, androidx.compose.foundation.gestures.FlingBehavior r38, boolean r39, androidx.compose.foundation.OverscrollEffect r40, kotlin.jvm.functions.Function1 r41, androidx.compose.runtime.Composer r42, int r43, int r44) {
        /*
            r11 = r43
            r12 = r44
            r0 = 53695811(0x3335543, float:5.270125E-37)
            r1 = r42
            androidx.compose.runtime.Composer r1 = r1.q(r0)
            r2 = r12 & 1
            if (r2 == 0) goto L_0x0017
            r3 = r11 | 6
            r4 = r3
            r3 = r32
            goto L_0x002b
        L_0x0017:
            r3 = r11 & 6
            if (r3 != 0) goto L_0x0028
            r3 = r32
            boolean r4 = r1.W(r3)
            if (r4 == 0) goto L_0x0025
            r4 = 4
            goto L_0x0026
        L_0x0025:
            r4 = 2
        L_0x0026:
            r4 = r4 | r11
            goto L_0x002b
        L_0x0028:
            r3 = r32
            r4 = r11
        L_0x002b:
            r5 = r11 & 48
            if (r5 != 0) goto L_0x0044
            r5 = r12 & 2
            if (r5 != 0) goto L_0x003e
            r5 = r33
            boolean r6 = r1.W(r5)
            if (r6 == 0) goto L_0x0040
            r6 = 32
            goto L_0x0042
        L_0x003e:
            r5 = r33
        L_0x0040:
            r6 = 16
        L_0x0042:
            r4 = r4 | r6
            goto L_0x0046
        L_0x0044:
            r5 = r33
        L_0x0046:
            r6 = r12 & 4
            if (r6 == 0) goto L_0x004f
            r4 = r4 | 384(0x180, float:5.38E-43)
        L_0x004c:
            r7 = r34
            goto L_0x0061
        L_0x004f:
            r7 = r11 & 384(0x180, float:5.38E-43)
            if (r7 != 0) goto L_0x004c
            r7 = r34
            boolean r8 = r1.W(r7)
            if (r8 == 0) goto L_0x005e
            r8 = 256(0x100, float:3.59E-43)
            goto L_0x0060
        L_0x005e:
            r8 = 128(0x80, float:1.794E-43)
        L_0x0060:
            r4 = r4 | r8
        L_0x0061:
            r8 = r12 & 8
            if (r8 == 0) goto L_0x006a
            r4 = r4 | 3072(0xc00, float:4.305E-42)
        L_0x0067:
            r9 = r35
            goto L_0x007c
        L_0x006a:
            r9 = r11 & 3072(0xc00, float:4.305E-42)
            if (r9 != 0) goto L_0x0067
            r9 = r35
            boolean r10 = r1.d(r9)
            if (r10 == 0) goto L_0x0079
            r10 = 2048(0x800, float:2.87E-42)
            goto L_0x007b
        L_0x0079:
            r10 = 1024(0x400, float:1.435E-42)
        L_0x007b:
            r4 = r4 | r10
        L_0x007c:
            r10 = r11 & 24576(0x6000, float:3.4438E-41)
            if (r10 != 0) goto L_0x0095
            r10 = r12 & 16
            if (r10 != 0) goto L_0x008f
            r10 = r36
            boolean r13 = r1.W(r10)
            if (r13 == 0) goto L_0x0091
            r13 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0093
        L_0x008f:
            r10 = r36
        L_0x0091:
            r13 = 8192(0x2000, float:1.14794E-41)
        L_0x0093:
            r4 = r4 | r13
            goto L_0x0097
        L_0x0095:
            r10 = r36
        L_0x0097:
            r13 = r12 & 32
            r14 = 196608(0x30000, float:2.75506E-40)
            if (r13 == 0) goto L_0x00a1
            r4 = r4 | r14
        L_0x009e:
            r14 = r37
            goto L_0x00b2
        L_0x00a1:
            r14 = r14 & r11
            if (r14 != 0) goto L_0x009e
            r14 = r37
            boolean r15 = r1.W(r14)
            if (r15 == 0) goto L_0x00af
            r15 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00b1
        L_0x00af:
            r15 = 65536(0x10000, float:9.18355E-41)
        L_0x00b1:
            r4 = r4 | r15
        L_0x00b2:
            r15 = 1572864(0x180000, float:2.204052E-39)
            r15 = r15 & r11
            if (r15 != 0) goto L_0x00cd
            r15 = r12 & 64
            if (r15 != 0) goto L_0x00c6
            r15 = r38
            boolean r16 = r1.W(r15)
            if (r16 == 0) goto L_0x00c8
            r16 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00ca
        L_0x00c6:
            r15 = r38
        L_0x00c8:
            r16 = 524288(0x80000, float:7.34684E-40)
        L_0x00ca:
            r4 = r4 | r16
            goto L_0x00cf
        L_0x00cd:
            r15 = r38
        L_0x00cf:
            r0 = r12 & 128(0x80, float:1.794E-43)
            r17 = 12582912(0xc00000, float:1.7632415E-38)
            if (r0 == 0) goto L_0x00da
            r4 = r4 | r17
            r3 = r39
            goto L_0x00ed
        L_0x00da:
            r17 = r11 & r17
            r3 = r39
            if (r17 != 0) goto L_0x00ed
            boolean r17 = r1.d(r3)
            if (r17 == 0) goto L_0x00e9
            r17 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00eb
        L_0x00e9:
            r17 = 4194304(0x400000, float:5.877472E-39)
        L_0x00eb:
            r4 = r4 | r17
        L_0x00ed:
            r17 = 100663296(0x6000000, float:2.4074124E-35)
            r17 = r11 & r17
            if (r17 != 0) goto L_0x0109
            r3 = r12 & 256(0x100, float:3.59E-43)
            if (r3 != 0) goto L_0x0102
            r3 = r40
            boolean r17 = r1.W(r3)
            if (r17 == 0) goto L_0x0104
            r17 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x0106
        L_0x0102:
            r3 = r40
        L_0x0104:
            r17 = 33554432(0x2000000, float:9.403955E-38)
        L_0x0106:
            r4 = r4 | r17
            goto L_0x010b
        L_0x0109:
            r3 = r40
        L_0x010b:
            r3 = r12 & 512(0x200, float:7.175E-43)
            r17 = 805306368(0x30000000, float:4.656613E-10)
            if (r3 == 0) goto L_0x0116
            r4 = r4 | r17
        L_0x0113:
            r3 = r41
            goto L_0x0129
        L_0x0116:
            r3 = r11 & r17
            if (r3 != 0) goto L_0x0113
            r3 = r41
            boolean r17 = r1.l(r3)
            if (r17 == 0) goto L_0x0125
            r17 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x0127
        L_0x0125:
            r17 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x0127:
            r4 = r4 | r17
        L_0x0129:
            r17 = 306783379(0x12492493, float:6.34695E-28)
            r3 = r4 & r17
            r5 = 306783378(0x12492492, float:6.3469493E-28)
            r7 = 0
            r17 = 1
            if (r3 == r5) goto L_0x0139
            r3 = r17
            goto L_0x013a
        L_0x0139:
            r3 = r7
        L_0x013a:
            r5 = r4 & 1
            boolean r3 = r1.E(r3, r5)
            if (r3 == 0) goto L_0x025e
            r1.p()
            r3 = r11 & 1
            r5 = -234881025(0xfffffffff1ffffff, float:-2.535301E30)
            r18 = -3670017(0xffffffffffc7ffff, float:NaN)
            r19 = -57345(0xffffffffffff1fff, float:NaN)
            if (r3 == 0) goto L_0x0183
            boolean r3 = r1.J()
            if (r3 == 0) goto L_0x0159
            goto L_0x0183
        L_0x0159:
            r1.B()
            r0 = r12 & 2
            if (r0 == 0) goto L_0x0162
            r4 = r4 & -113(0xffffffffffffff8f, float:NaN)
        L_0x0162:
            r0 = r12 & 16
            if (r0 == 0) goto L_0x0168
            r4 = r4 & r19
        L_0x0168:
            r0 = r12 & 64
            if (r0 == 0) goto L_0x016e
            r4 = r4 & r18
        L_0x016e:
            r0 = r12 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L_0x0173
            r4 = r4 & r5
        L_0x0173:
            r2 = r32
            r3 = r33
            r6 = r34
            r5 = r40
            r7 = r4
            r8 = r10
            r10 = r14
            r0 = r15
            r4 = r39
            goto L_0x01ee
        L_0x0183:
            if (r2 == 0) goto L_0x0188
            androidx.compose.ui.Modifier$Companion r2 = androidx.compose.ui.Modifier.f15489d
            goto L_0x018a
        L_0x0188:
            r2 = r32
        L_0x018a:
            r3 = r12 & 2
            if (r3 == 0) goto L_0x0196
            r3 = 3
            androidx.compose.foundation.lazy.LazyListState r3 = androidx.compose.foundation.lazy.LazyListStateKt.b(r7, r7, r1, r7, r3)
            r4 = r4 & -113(0xffffffffffffff8f, float:NaN)
            goto L_0x0198
        L_0x0196:
            r3 = r33
        L_0x0198:
            if (r6 == 0) goto L_0x01a4
            float r6 = (float) r7
            float r6 = androidx.compose.ui.unit.Dp.m(r6)
            androidx.compose.foundation.layout.PaddingValues r6 = androidx.compose.foundation.layout.PaddingKt.a(r6)
            goto L_0x01a6
        L_0x01a4:
            r6 = r34
        L_0x01a6:
            if (r8 == 0) goto L_0x01a9
            r9 = r7
        L_0x01a9:
            r8 = r12 & 16
            if (r8 == 0) goto L_0x01bd
            androidx.compose.foundation.layout.Arrangement r8 = androidx.compose.foundation.layout.Arrangement.f3739a
            if (r9 != 0) goto L_0x01b6
            androidx.compose.foundation.layout.Arrangement$Vertical r8 = r8.g()
            goto L_0x01ba
        L_0x01b6:
            androidx.compose.foundation.layout.Arrangement$Vertical r8 = r8.a()
        L_0x01ba:
            r4 = r4 & r19
            goto L_0x01be
        L_0x01bd:
            r8 = r10
        L_0x01be:
            if (r13 == 0) goto L_0x01c7
            androidx.compose.ui.Alignment$Companion r10 = androidx.compose.ui.Alignment.f15444a
            androidx.compose.ui.Alignment$Horizontal r10 = r10.k()
            goto L_0x01c8
        L_0x01c7:
            r10 = r14
        L_0x01c8:
            r13 = r12 & 64
            if (r13 == 0) goto L_0x01d6
            androidx.compose.foundation.gestures.ScrollableDefaults r13 = androidx.compose.foundation.gestures.ScrollableDefaults.f3558a
            r14 = 6
            androidx.compose.foundation.gestures.FlingBehavior r13 = r13.a(r1, r14)
            r4 = r4 & r18
            goto L_0x01d7
        L_0x01d6:
            r13 = r15
        L_0x01d7:
            if (r0 == 0) goto L_0x01da
            goto L_0x01dc
        L_0x01da:
            r17 = r39
        L_0x01dc:
            r0 = r12 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L_0x01eb
            androidx.compose.foundation.OverscrollEffect r0 = androidx.compose.foundation.OverscrollKt.b(r1, r7)
            r4 = r4 & r5
            r5 = r0
        L_0x01e6:
            r7 = r4
            r0 = r13
            r4 = r17
            goto L_0x01ee
        L_0x01eb:
            r5 = r40
            goto L_0x01e6
        L_0x01ee:
            r1.U()
            boolean r13 = androidx.compose.runtime.ComposerKt.P()
            if (r13 == 0) goto L_0x0200
            r13 = -1
            java.lang.String r14 = "androidx.compose.foundation.lazy.LazyColumn (LazyDsl.kt:399)"
            r15 = 53695811(0x3335543, float:5.270125E-37)
            androidx.compose.runtime.ComposerKt.Y(r15, r7, r13, r14)
        L_0x0200:
            r13 = r7 & 14
            r13 = r13 | 24576(0x6000, float:3.4438E-41)
            r14 = r7 & 112(0x70, float:1.57E-43)
            r13 = r13 | r14
            r14 = r7 & 896(0x380, float:1.256E-42)
            r13 = r13 | r14
            r14 = r7 & 7168(0x1c00, float:1.0045E-41)
            r13 = r13 | r14
            int r14 = r7 >> 3
            r15 = 458752(0x70000, float:6.42848E-40)
            r15 = r15 & r14
            r13 = r13 | r15
            r15 = 3670016(0x380000, float:5.142788E-39)
            r15 = r15 & r14
            r13 = r13 | r15
            r15 = 29360128(0x1c00000, float:7.052966E-38)
            r14 = r14 & r15
            r13 = r13 | r14
            int r14 = r7 << 12
            r15 = 1879048192(0x70000000, float:1.58456325E29)
            r14 = r14 & r15
            r28 = r13 | r14
            int r13 = r7 >> 12
            r13 = r13 & 14
            int r7 = r7 >> 18
            r7 = r7 & 7168(0x1c00, float:1.0045E-41)
            r29 = r13 | r7
            r30 = 6400(0x1900, float:8.968E-42)
            r17 = 1
            r21 = 0
            r24 = 0
            r25 = 0
            r13 = r2
            r14 = r3
            r15 = r6
            r16 = r9
            r18 = r0
            r19 = r4
            r20 = r5
            r22 = r10
            r23 = r8
            r26 = r41
            r27 = r1
            androidx.compose.foundation.lazy.LazyListKt.a(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30)
            boolean r7 = androidx.compose.runtime.ComposerKt.P()
            if (r7 == 0) goto L_0x0255
            androidx.compose.runtime.ComposerKt.X()
        L_0x0255:
            r7 = r0
            r31 = r8
            r8 = r4
            r4 = r9
            r9 = r5
            r5 = r31
            goto L_0x026f
        L_0x025e:
            r1.B()
            r2 = r32
            r3 = r33
            r6 = r34
            r8 = r39
            r4 = r9
            r5 = r10
            r10 = r14
            r7 = r15
            r9 = r40
        L_0x026f:
            androidx.compose.runtime.ScopeUpdateScope r13 = r1.x()
            if (r13 == 0) goto L_0x0288
            androidx.compose.foundation.lazy.LazyDslKt$LazyColumn$1 r14 = new androidx.compose.foundation.lazy.LazyDslKt$LazyColumn$1
            r0 = r14
            r1 = r2
            r2 = r3
            r3 = r6
            r6 = r10
            r10 = r41
            r11 = r43
            r12 = r44
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            r13.a(r14)
        L_0x0288:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.LazyDslKt.b(androidx.compose.ui.Modifier, androidx.compose.foundation.lazy.LazyListState, androidx.compose.foundation.layout.PaddingValues, boolean, androidx.compose.foundation.layout.Arrangement$Vertical, androidx.compose.ui.Alignment$Horizontal, androidx.compose.foundation.gestures.FlingBehavior, boolean, androidx.compose.foundation.OverscrollEffect, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:100:0x0118  */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x011b  */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x0124  */
    /* JADX WARNING: Removed duplicated region for block: B:156:0x0201  */
    /* JADX WARNING: Removed duplicated region for block: B:159:0x0215  */
    /* JADX WARNING: Removed duplicated region for block: B:161:? A[RETURN, SYNTHETIC] */
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
    public static final /* synthetic */ void c(androidx.compose.ui.Modifier r26, androidx.compose.foundation.lazy.LazyListState r27, androidx.compose.foundation.layout.PaddingValues r28, boolean r29, androidx.compose.foundation.layout.Arrangement.Vertical r30, androidx.compose.ui.Alignment.Horizontal r31, androidx.compose.foundation.gestures.FlingBehavior r32, boolean r33, kotlin.jvm.functions.Function1 r34, androidx.compose.runtime.Composer r35, int r36, int r37) {
        /*
            r10 = r36
            r11 = r37
            r0 = -740714857(0xffffffffd3d99697, float:-1.86906876E12)
            r1 = r35
            androidx.compose.runtime.Composer r1 = r1.q(r0)
            r2 = r11 & 1
            if (r2 == 0) goto L_0x0017
            r3 = r10 | 6
            r4 = r3
            r3 = r26
            goto L_0x002b
        L_0x0017:
            r3 = r10 & 6
            if (r3 != 0) goto L_0x0028
            r3 = r26
            boolean r4 = r1.W(r3)
            if (r4 == 0) goto L_0x0025
            r4 = 4
            goto L_0x0026
        L_0x0025:
            r4 = 2
        L_0x0026:
            r4 = r4 | r10
            goto L_0x002b
        L_0x0028:
            r3 = r26
            r4 = r10
        L_0x002b:
            r5 = r10 & 48
            if (r5 != 0) goto L_0x0044
            r5 = r11 & 2
            if (r5 != 0) goto L_0x003e
            r5 = r27
            boolean r6 = r1.W(r5)
            if (r6 == 0) goto L_0x0040
            r6 = 32
            goto L_0x0042
        L_0x003e:
            r5 = r27
        L_0x0040:
            r6 = 16
        L_0x0042:
            r4 = r4 | r6
            goto L_0x0046
        L_0x0044:
            r5 = r27
        L_0x0046:
            r6 = r11 & 4
            if (r6 == 0) goto L_0x004f
            r4 = r4 | 384(0x180, float:5.38E-43)
        L_0x004c:
            r7 = r28
            goto L_0x0061
        L_0x004f:
            r7 = r10 & 384(0x180, float:5.38E-43)
            if (r7 != 0) goto L_0x004c
            r7 = r28
            boolean r8 = r1.W(r7)
            if (r8 == 0) goto L_0x005e
            r8 = 256(0x100, float:3.59E-43)
            goto L_0x0060
        L_0x005e:
            r8 = 128(0x80, float:1.794E-43)
        L_0x0060:
            r4 = r4 | r8
        L_0x0061:
            r8 = r11 & 8
            if (r8 == 0) goto L_0x006a
            r4 = r4 | 3072(0xc00, float:4.305E-42)
        L_0x0067:
            r9 = r29
            goto L_0x007c
        L_0x006a:
            r9 = r10 & 3072(0xc00, float:4.305E-42)
            if (r9 != 0) goto L_0x0067
            r9 = r29
            boolean r12 = r1.d(r9)
            if (r12 == 0) goto L_0x0079
            r12 = 2048(0x800, float:2.87E-42)
            goto L_0x007b
        L_0x0079:
            r12 = 1024(0x400, float:1.435E-42)
        L_0x007b:
            r4 = r4 | r12
        L_0x007c:
            r12 = r10 & 24576(0x6000, float:3.4438E-41)
            if (r12 != 0) goto L_0x0095
            r12 = r11 & 16
            if (r12 != 0) goto L_0x008f
            r12 = r30
            boolean r13 = r1.W(r12)
            if (r13 == 0) goto L_0x0091
            r13 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0093
        L_0x008f:
            r12 = r30
        L_0x0091:
            r13 = 8192(0x2000, float:1.14794E-41)
        L_0x0093:
            r4 = r4 | r13
            goto L_0x0097
        L_0x0095:
            r12 = r30
        L_0x0097:
            r13 = r11 & 32
            r14 = 196608(0x30000, float:2.75506E-40)
            if (r13 == 0) goto L_0x00a1
            r4 = r4 | r14
        L_0x009e:
            r14 = r31
            goto L_0x00b2
        L_0x00a1:
            r14 = r14 & r10
            if (r14 != 0) goto L_0x009e
            r14 = r31
            boolean r15 = r1.W(r14)
            if (r15 == 0) goto L_0x00af
            r15 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00b1
        L_0x00af:
            r15 = 65536(0x10000, float:9.18355E-41)
        L_0x00b1:
            r4 = r4 | r15
        L_0x00b2:
            r15 = 1572864(0x180000, float:2.204052E-39)
            r15 = r15 & r10
            if (r15 != 0) goto L_0x00cd
            r15 = r11 & 64
            if (r15 != 0) goto L_0x00c6
            r15 = r32
            boolean r16 = r1.W(r15)
            if (r16 == 0) goto L_0x00c8
            r16 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00ca
        L_0x00c6:
            r15 = r32
        L_0x00c8:
            r16 = 524288(0x80000, float:7.34684E-40)
        L_0x00ca:
            r4 = r4 | r16
            goto L_0x00cf
        L_0x00cd:
            r15 = r32
        L_0x00cf:
            r0 = r11 & 128(0x80, float:1.794E-43)
            r17 = 12582912(0xc00000, float:1.7632415E-38)
            if (r0 == 0) goto L_0x00da
            r4 = r4 | r17
            r3 = r33
            goto L_0x00ed
        L_0x00da:
            r17 = r10 & r17
            r3 = r33
            if (r17 != 0) goto L_0x00ed
            boolean r17 = r1.d(r3)
            if (r17 == 0) goto L_0x00e9
            r17 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00eb
        L_0x00e9:
            r17 = 4194304(0x400000, float:5.877472E-39)
        L_0x00eb:
            r4 = r4 | r17
        L_0x00ed:
            r3 = r11 & 256(0x100, float:3.59E-43)
            r17 = 100663296(0x6000000, float:2.4074124E-35)
            if (r3 == 0) goto L_0x00f8
            r4 = r4 | r17
        L_0x00f5:
            r3 = r34
            goto L_0x010b
        L_0x00f8:
            r3 = r10 & r17
            if (r3 != 0) goto L_0x00f5
            r3 = r34
            boolean r17 = r1.l(r3)
            if (r17 == 0) goto L_0x0107
            r17 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x0109
        L_0x0107:
            r17 = 33554432(0x2000000, float:9.403955E-38)
        L_0x0109:
            r4 = r4 | r17
        L_0x010b:
            r17 = 38347923(0x2492493, float:1.4777644E-37)
            r3 = r4 & r17
            r5 = 38347922(0x2492492, float:1.4777643E-37)
            r7 = 0
            r17 = 1
            if (r3 == r5) goto L_0x011b
            r3 = r17
            goto L_0x011c
        L_0x011b:
            r3 = r7
        L_0x011c:
            r5 = r4 & 1
            boolean r3 = r1.E(r3, r5)
            if (r3 == 0) goto L_0x0201
            r1.p()
            r3 = r10 & 1
            r5 = 3
            r18 = -3670017(0xffffffffffc7ffff, float:NaN)
            r19 = -57345(0xffffffffffff1fff, float:NaN)
            if (r3 == 0) goto L_0x015c
            boolean r3 = r1.J()
            if (r3 == 0) goto L_0x0139
            goto L_0x015c
        L_0x0139:
            r1.B()
            r0 = r11 & 2
            if (r0 == 0) goto L_0x0142
            r4 = r4 & -113(0xffffffffffffff8f, float:NaN)
        L_0x0142:
            r0 = r11 & 16
            if (r0 == 0) goto L_0x0148
            r4 = r4 & r19
        L_0x0148:
            r0 = r11 & 64
            if (r0 == 0) goto L_0x014e
            r4 = r4 & r18
        L_0x014e:
            r2 = r26
            r3 = r27
            r6 = r28
            r25 = r33
            r8 = r12
            r0 = r14
            r12 = r4
            r4 = r15
            goto L_0x01bb
        L_0x015c:
            if (r2 == 0) goto L_0x0161
            androidx.compose.ui.Modifier$Companion r2 = androidx.compose.ui.Modifier.f15489d
            goto L_0x0163
        L_0x0161:
            r2 = r26
        L_0x0163:
            r3 = r11 & 2
            if (r3 == 0) goto L_0x016e
            androidx.compose.foundation.lazy.LazyListState r3 = androidx.compose.foundation.lazy.LazyListStateKt.b(r7, r7, r1, r7, r5)
            r4 = r4 & -113(0xffffffffffffff8f, float:NaN)
            goto L_0x0170
        L_0x016e:
            r3 = r27
        L_0x0170:
            if (r6 == 0) goto L_0x017c
            float r6 = (float) r7
            float r6 = androidx.compose.ui.unit.Dp.m(r6)
            androidx.compose.foundation.layout.PaddingValues r6 = androidx.compose.foundation.layout.PaddingKt.a(r6)
            goto L_0x017e
        L_0x017c:
            r6 = r28
        L_0x017e:
            if (r8 == 0) goto L_0x0181
            r9 = r7
        L_0x0181:
            r8 = r11 & 16
            if (r8 == 0) goto L_0x0195
            androidx.compose.foundation.layout.Arrangement r8 = androidx.compose.foundation.layout.Arrangement.f3739a
            if (r9 != 0) goto L_0x018e
            androidx.compose.foundation.layout.Arrangement$Vertical r8 = r8.g()
            goto L_0x0192
        L_0x018e:
            androidx.compose.foundation.layout.Arrangement$Vertical r8 = r8.a()
        L_0x0192:
            r4 = r4 & r19
            goto L_0x0196
        L_0x0195:
            r8 = r12
        L_0x0196:
            if (r13 == 0) goto L_0x019f
            androidx.compose.ui.Alignment$Companion r12 = androidx.compose.ui.Alignment.f15444a
            androidx.compose.ui.Alignment$Horizontal r12 = r12.k()
            goto L_0x01a0
        L_0x019f:
            r12 = r14
        L_0x01a0:
            r13 = r11 & 64
            if (r13 == 0) goto L_0x01ae
            androidx.compose.foundation.gestures.ScrollableDefaults r13 = androidx.compose.foundation.gestures.ScrollableDefaults.f3558a
            r14 = 6
            androidx.compose.foundation.gestures.FlingBehavior r13 = r13.a(r1, r14)
            r4 = r4 & r18
            goto L_0x01af
        L_0x01ae:
            r13 = r15
        L_0x01af:
            if (r0 == 0) goto L_0x01b7
            r0 = r12
            r25 = r17
        L_0x01b4:
            r12 = r4
            r4 = r13
            goto L_0x01bb
        L_0x01b7:
            r25 = r33
            r0 = r12
            goto L_0x01b4
        L_0x01bb:
            r1.U()
            boolean r13 = androidx.compose.runtime.ComposerKt.P()
            if (r13 == 0) goto L_0x01cd
            r13 = -1
            java.lang.String r14 = "androidx.compose.foundation.lazy.LazyColumn (LazyDsl.kt:428)"
            r15 = -740714857(0xffffffffd3d99697, float:-1.86906876E12)
            androidx.compose.runtime.ComposerKt.Y(r15, r12, r13, r14)
        L_0x01cd:
            androidx.compose.foundation.OverscrollEffect r20 = androidx.compose.foundation.OverscrollKt.b(r1, r7)
            r7 = 33554430(0x1fffffe, float:9.4039537E-38)
            r7 = r7 & r12
            r13 = 1879048192(0x70000000, float:1.58456325E29)
            int r5 = r12 << 3
            r5 = r5 & r13
            r23 = r7 | r5
            r24 = 0
            r12 = r2
            r13 = r3
            r14 = r6
            r15 = r9
            r16 = r8
            r17 = r0
            r18 = r4
            r19 = r25
            r21 = r34
            r22 = r1
            b(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            boolean r5 = androidx.compose.runtime.ComposerKt.P()
            if (r5 == 0) goto L_0x01fa
            androidx.compose.runtime.ComposerKt.X()
        L_0x01fa:
            r14 = r0
            r7 = r4
            r5 = r8
            r4 = r9
            r8 = r25
            goto L_0x020f
        L_0x0201:
            r1.B()
            r2 = r26
            r3 = r27
            r6 = r28
            r8 = r33
            r4 = r9
            r5 = r12
            r7 = r15
        L_0x020f:
            androidx.compose.runtime.ScopeUpdateScope r12 = r1.x()
            if (r12 == 0) goto L_0x0228
            androidx.compose.foundation.lazy.LazyDslKt$LazyColumn$2 r13 = new androidx.compose.foundation.lazy.LazyDslKt$LazyColumn$2
            r0 = r13
            r1 = r2
            r2 = r3
            r3 = r6
            r6 = r14
            r9 = r34
            r10 = r36
            r11 = r37
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r12.a(r13)
        L_0x0228:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.LazyDslKt.c(androidx.compose.ui.Modifier, androidx.compose.foundation.lazy.LazyListState, androidx.compose.foundation.layout.PaddingValues, boolean, androidx.compose.foundation.layout.Arrangement$Vertical, androidx.compose.ui.Alignment$Horizontal, androidx.compose.foundation.gestures.FlingBehavior, boolean, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:136:0x0195  */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x01db  */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x01e3  */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x01f5  */
    /* JADX WARNING: Removed duplicated region for block: B:146:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0095  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00a1  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00b7  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x00cd  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x00d5  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x00da  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x00f7  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x00f9  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x0102  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final /* synthetic */ void d(androidx.compose.ui.Modifier r24, androidx.compose.foundation.lazy.LazyListState r25, androidx.compose.foundation.layout.PaddingValues r26, boolean r27, androidx.compose.foundation.layout.Arrangement.Horizontal r28, androidx.compose.ui.Alignment.Vertical r29, androidx.compose.foundation.gestures.FlingBehavior r30, kotlin.jvm.functions.Function1 r31, androidx.compose.runtime.Composer r32, int r33, int r34) {
        /*
            r9 = r33
            r10 = r34
            r0 = 407929823(0x185083df, float:2.6949948E-24)
            r1 = r32
            androidx.compose.runtime.Composer r1 = r1.q(r0)
            r2 = r10 & 1
            if (r2 == 0) goto L_0x0017
            r3 = r9 | 6
            r4 = r3
            r3 = r24
            goto L_0x002b
        L_0x0017:
            r3 = r9 & 6
            if (r3 != 0) goto L_0x0028
            r3 = r24
            boolean r4 = r1.W(r3)
            if (r4 == 0) goto L_0x0025
            r4 = 4
            goto L_0x0026
        L_0x0025:
            r4 = 2
        L_0x0026:
            r4 = r4 | r9
            goto L_0x002b
        L_0x0028:
            r3 = r24
            r4 = r9
        L_0x002b:
            r5 = r9 & 48
            if (r5 != 0) goto L_0x0044
            r5 = r10 & 2
            if (r5 != 0) goto L_0x003e
            r5 = r25
            boolean r6 = r1.W(r5)
            if (r6 == 0) goto L_0x0040
            r6 = 32
            goto L_0x0042
        L_0x003e:
            r5 = r25
        L_0x0040:
            r6 = 16
        L_0x0042:
            r4 = r4 | r6
            goto L_0x0046
        L_0x0044:
            r5 = r25
        L_0x0046:
            r6 = r10 & 4
            if (r6 == 0) goto L_0x004f
            r4 = r4 | 384(0x180, float:5.38E-43)
        L_0x004c:
            r7 = r26
            goto L_0x0061
        L_0x004f:
            r7 = r9 & 384(0x180, float:5.38E-43)
            if (r7 != 0) goto L_0x004c
            r7 = r26
            boolean r8 = r1.W(r7)
            if (r8 == 0) goto L_0x005e
            r8 = 256(0x100, float:3.59E-43)
            goto L_0x0060
        L_0x005e:
            r8 = 128(0x80, float:1.794E-43)
        L_0x0060:
            r4 = r4 | r8
        L_0x0061:
            r8 = r10 & 8
            if (r8 == 0) goto L_0x006a
            r4 = r4 | 3072(0xc00, float:4.305E-42)
        L_0x0067:
            r11 = r27
            goto L_0x007c
        L_0x006a:
            r11 = r9 & 3072(0xc00, float:4.305E-42)
            if (r11 != 0) goto L_0x0067
            r11 = r27
            boolean r12 = r1.d(r11)
            if (r12 == 0) goto L_0x0079
            r12 = 2048(0x800, float:2.87E-42)
            goto L_0x007b
        L_0x0079:
            r12 = 1024(0x400, float:1.435E-42)
        L_0x007b:
            r4 = r4 | r12
        L_0x007c:
            r12 = r9 & 24576(0x6000, float:3.4438E-41)
            if (r12 != 0) goto L_0x0095
            r12 = r10 & 16
            if (r12 != 0) goto L_0x008f
            r12 = r28
            boolean r13 = r1.W(r12)
            if (r13 == 0) goto L_0x0091
            r13 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0093
        L_0x008f:
            r12 = r28
        L_0x0091:
            r13 = 8192(0x2000, float:1.14794E-41)
        L_0x0093:
            r4 = r4 | r13
            goto L_0x0097
        L_0x0095:
            r12 = r28
        L_0x0097:
            r13 = r10 & 32
            r14 = 196608(0x30000, float:2.75506E-40)
            if (r13 == 0) goto L_0x00a1
            r4 = r4 | r14
        L_0x009e:
            r14 = r29
            goto L_0x00b2
        L_0x00a1:
            r14 = r14 & r9
            if (r14 != 0) goto L_0x009e
            r14 = r29
            boolean r15 = r1.W(r14)
            if (r15 == 0) goto L_0x00af
            r15 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00b1
        L_0x00af:
            r15 = 65536(0x10000, float:9.18355E-41)
        L_0x00b1:
            r4 = r4 | r15
        L_0x00b2:
            r15 = 1572864(0x180000, float:2.204052E-39)
            r15 = r15 & r9
            if (r15 != 0) goto L_0x00cd
            r15 = r10 & 64
            if (r15 != 0) goto L_0x00c6
            r15 = r30
            boolean r16 = r1.W(r15)
            if (r16 == 0) goto L_0x00c8
            r16 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00ca
        L_0x00c6:
            r15 = r30
        L_0x00c8:
            r16 = 524288(0x80000, float:7.34684E-40)
        L_0x00ca:
            r4 = r4 | r16
            goto L_0x00cf
        L_0x00cd:
            r15 = r30
        L_0x00cf:
            r0 = r10 & 128(0x80, float:1.794E-43)
            r17 = 12582912(0xc00000, float:1.7632415E-38)
            if (r0 == 0) goto L_0x00da
            r4 = r4 | r17
        L_0x00d7:
            r0 = r31
            goto L_0x00ed
        L_0x00da:
            r0 = r9 & r17
            if (r0 != 0) goto L_0x00d7
            r0 = r31
            boolean r18 = r1.l(r0)
            if (r18 == 0) goto L_0x00e9
            r18 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00eb
        L_0x00e9:
            r18 = 4194304(0x400000, float:5.877472E-39)
        L_0x00eb:
            r4 = r4 | r18
        L_0x00ed:
            r18 = 4793491(0x492493, float:6.717112E-39)
            r0 = r4 & r18
            r3 = 4793490(0x492492, float:6.71711E-39)
            if (r0 == r3) goto L_0x00f9
            r0 = 1
            goto L_0x00fa
        L_0x00f9:
            r0 = 0
        L_0x00fa:
            r3 = r4 & 1
            boolean r0 = r1.E(r0, r3)
            if (r0 == 0) goto L_0x01e3
            r1.p()
            r0 = r9 & 1
            r3 = -3670017(0xffffffffffc7ffff, float:NaN)
            r18 = -57345(0xffffffffffff1fff, float:NaN)
            r5 = 6
            if (r0 == 0) goto L_0x0136
            boolean r0 = r1.J()
            if (r0 == 0) goto L_0x0117
            goto L_0x0136
        L_0x0117:
            r1.B()
            r0 = r10 & 2
            if (r0 == 0) goto L_0x0120
            r4 = r4 & -113(0xffffffffffffff8f, float:NaN)
        L_0x0120:
            r0 = r10 & 16
            if (r0 == 0) goto L_0x0126
            r4 = r4 & r18
        L_0x0126:
            r0 = r10 & 64
            if (r0 == 0) goto L_0x012b
            r4 = r4 & r3
        L_0x012b:
            r0 = r24
            r2 = r25
            r6 = r7
        L_0x0130:
            r3 = r11
            r7 = r14
            r8 = r15
        L_0x0133:
            r11 = r4
            r4 = r12
            goto L_0x018c
        L_0x0136:
            if (r2 == 0) goto L_0x013b
            androidx.compose.ui.Modifier$Companion r0 = androidx.compose.ui.Modifier.f15489d
            goto L_0x013d
        L_0x013b:
            r0 = r24
        L_0x013d:
            r2 = r10 & 2
            if (r2 == 0) goto L_0x014a
            r2 = 3
            r3 = 0
            androidx.compose.foundation.lazy.LazyListState r2 = androidx.compose.foundation.lazy.LazyListStateKt.b(r3, r3, r1, r3, r2)
            r4 = r4 & -113(0xffffffffffffff8f, float:NaN)
            goto L_0x014d
        L_0x014a:
            r3 = 0
            r2 = r25
        L_0x014d:
            if (r6 == 0) goto L_0x0159
            float r6 = (float) r3
            float r6 = androidx.compose.ui.unit.Dp.m(r6)
            androidx.compose.foundation.layout.PaddingValues r6 = androidx.compose.foundation.layout.PaddingKt.a(r6)
            goto L_0x015a
        L_0x0159:
            r6 = r7
        L_0x015a:
            if (r8 == 0) goto L_0x015d
            r11 = r3
        L_0x015d:
            r3 = r10 & 16
            if (r3 == 0) goto L_0x0171
            androidx.compose.foundation.layout.Arrangement r3 = androidx.compose.foundation.layout.Arrangement.f3739a
            if (r11 != 0) goto L_0x016a
            androidx.compose.foundation.layout.Arrangement$Horizontal r3 = r3.f()
            goto L_0x016e
        L_0x016a:
            androidx.compose.foundation.layout.Arrangement$Horizontal r3 = r3.c()
        L_0x016e:
            r4 = r4 & r18
            r12 = r3
        L_0x0171:
            if (r13 == 0) goto L_0x017a
            androidx.compose.ui.Alignment$Companion r3 = androidx.compose.ui.Alignment.f15444a
            androidx.compose.ui.Alignment$Vertical r3 = r3.l()
            r14 = r3
        L_0x017a:
            r3 = r10 & 64
            if (r3 == 0) goto L_0x0130
            androidx.compose.foundation.gestures.ScrollableDefaults r3 = androidx.compose.foundation.gestures.ScrollableDefaults.f3558a
            androidx.compose.foundation.gestures.FlingBehavior r3 = r3.a(r1, r5)
            r7 = -3670017(0xffffffffffc7ffff, float:NaN)
            r4 = r4 & r7
            r8 = r3
            r3 = r11
            r7 = r14
            goto L_0x0133
        L_0x018c:
            r1.U()
            boolean r12 = androidx.compose.runtime.ComposerKt.P()
            if (r12 == 0) goto L_0x019e
            r12 = -1
            java.lang.String r13 = "androidx.compose.foundation.lazy.LazyRow (LazyDsl.kt:509)"
            r14 = 407929823(0x185083df, float:2.6949948E-24)
            androidx.compose.runtime.ComposerKt.Y(r14, r11, r12, r13)
        L_0x019e:
            r12 = r11 & 14
            r12 = r12 | r17
            r13 = r11 & 112(0x70, float:1.57E-43)
            r12 = r12 | r13
            r13 = r11 & 896(0x380, float:1.256E-42)
            r12 = r12 | r13
            r13 = r11 & 7168(0x1c00, float:1.0045E-41)
            r12 = r12 | r13
            r13 = 57344(0xe000, float:8.0356E-41)
            r13 = r13 & r11
            r12 = r12 | r13
            r13 = 458752(0x70000, float:6.42848E-40)
            r13 = r13 & r11
            r12 = r12 | r13
            r13 = 3670016(0x380000, float:5.142788E-39)
            r13 = r13 & r11
            r12 = r12 | r13
            r13 = 1879048192(0x70000000, float:1.58456325E29)
            int r5 = r11 << 6
            r5 = r5 & r13
            r22 = r12 | r5
            r23 = 256(0x100, float:3.59E-43)
            r18 = 1
            r19 = 0
            r11 = r0
            r12 = r2
            r13 = r6
            r14 = r3
            r15 = r4
            r16 = r7
            r17 = r8
            r20 = r31
            r21 = r1
            e(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            boolean r5 = androidx.compose.runtime.ComposerKt.P()
            if (r5 == 0) goto L_0x01de
            androidx.compose.runtime.ComposerKt.X()
        L_0x01de:
            r5 = r4
            r4 = r3
            r3 = r2
            r2 = r0
            goto L_0x01ef
        L_0x01e3:
            r1.B()
            r2 = r24
            r3 = r25
            r6 = r7
            r4 = r11
            r5 = r12
            r7 = r14
            r8 = r15
        L_0x01ef:
            androidx.compose.runtime.ScopeUpdateScope r11 = r1.x()
            if (r11 == 0) goto L_0x0209
            androidx.compose.foundation.lazy.LazyDslKt$LazyRow$3 r12 = new androidx.compose.foundation.lazy.LazyDslKt$LazyRow$3
            r0 = r12
            r1 = r2
            r2 = r3
            r3 = r6
            r6 = r7
            r7 = r8
            r8 = r31
            r9 = r33
            r10 = r34
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r11.a(r12)
        L_0x0209:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.LazyDslKt.d(androidx.compose.ui.Modifier, androidx.compose.foundation.lazy.LazyListState, androidx.compose.foundation.layout.PaddingValues, boolean, androidx.compose.foundation.layout.Arrangement$Horizontal, androidx.compose.ui.Alignment$Vertical, androidx.compose.foundation.gestures.FlingBehavior, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:100:0x0111  */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x0116  */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x0136  */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x0139  */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x0142  */
    /* JADX WARNING: Removed duplicated region for block: B:173:0x025d  */
    /* JADX WARNING: Removed duplicated region for block: B:176:0x0274  */
    /* JADX WARNING: Removed duplicated region for block: B:178:? A[RETURN, SYNTHETIC] */
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
    /* JADX WARNING: Removed duplicated region for block: B:97:0x0109  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void e(androidx.compose.ui.Modifier r32, androidx.compose.foundation.lazy.LazyListState r33, androidx.compose.foundation.layout.PaddingValues r34, boolean r35, androidx.compose.foundation.layout.Arrangement.Horizontal r36, androidx.compose.ui.Alignment.Vertical r37, androidx.compose.foundation.gestures.FlingBehavior r38, boolean r39, androidx.compose.foundation.OverscrollEffect r40, kotlin.jvm.functions.Function1 r41, androidx.compose.runtime.Composer r42, int r43, int r44) {
        /*
            r11 = r43
            r12 = r44
            r0 = -1884325601(0xffffffff8faf791f, float:-1.7302986E-29)
            r1 = r42
            androidx.compose.runtime.Composer r1 = r1.q(r0)
            r2 = r12 & 1
            if (r2 == 0) goto L_0x0017
            r3 = r11 | 6
            r4 = r3
            r3 = r32
            goto L_0x002b
        L_0x0017:
            r3 = r11 & 6
            if (r3 != 0) goto L_0x0028
            r3 = r32
            boolean r4 = r1.W(r3)
            if (r4 == 0) goto L_0x0025
            r4 = 4
            goto L_0x0026
        L_0x0025:
            r4 = 2
        L_0x0026:
            r4 = r4 | r11
            goto L_0x002b
        L_0x0028:
            r3 = r32
            r4 = r11
        L_0x002b:
            r5 = r11 & 48
            if (r5 != 0) goto L_0x0044
            r5 = r12 & 2
            if (r5 != 0) goto L_0x003e
            r5 = r33
            boolean r6 = r1.W(r5)
            if (r6 == 0) goto L_0x0040
            r6 = 32
            goto L_0x0042
        L_0x003e:
            r5 = r33
        L_0x0040:
            r6 = 16
        L_0x0042:
            r4 = r4 | r6
            goto L_0x0046
        L_0x0044:
            r5 = r33
        L_0x0046:
            r6 = r12 & 4
            if (r6 == 0) goto L_0x004f
            r4 = r4 | 384(0x180, float:5.38E-43)
        L_0x004c:
            r7 = r34
            goto L_0x0061
        L_0x004f:
            r7 = r11 & 384(0x180, float:5.38E-43)
            if (r7 != 0) goto L_0x004c
            r7 = r34
            boolean r8 = r1.W(r7)
            if (r8 == 0) goto L_0x005e
            r8 = 256(0x100, float:3.59E-43)
            goto L_0x0060
        L_0x005e:
            r8 = 128(0x80, float:1.794E-43)
        L_0x0060:
            r4 = r4 | r8
        L_0x0061:
            r8 = r12 & 8
            if (r8 == 0) goto L_0x006a
            r4 = r4 | 3072(0xc00, float:4.305E-42)
        L_0x0067:
            r9 = r35
            goto L_0x007c
        L_0x006a:
            r9 = r11 & 3072(0xc00, float:4.305E-42)
            if (r9 != 0) goto L_0x0067
            r9 = r35
            boolean r10 = r1.d(r9)
            if (r10 == 0) goto L_0x0079
            r10 = 2048(0x800, float:2.87E-42)
            goto L_0x007b
        L_0x0079:
            r10 = 1024(0x400, float:1.435E-42)
        L_0x007b:
            r4 = r4 | r10
        L_0x007c:
            r10 = r11 & 24576(0x6000, float:3.4438E-41)
            if (r10 != 0) goto L_0x0095
            r10 = r12 & 16
            if (r10 != 0) goto L_0x008f
            r10 = r36
            boolean r13 = r1.W(r10)
            if (r13 == 0) goto L_0x0091
            r13 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0093
        L_0x008f:
            r10 = r36
        L_0x0091:
            r13 = 8192(0x2000, float:1.14794E-41)
        L_0x0093:
            r4 = r4 | r13
            goto L_0x0097
        L_0x0095:
            r10 = r36
        L_0x0097:
            r13 = r12 & 32
            r14 = 196608(0x30000, float:2.75506E-40)
            if (r13 == 0) goto L_0x00a1
            r4 = r4 | r14
        L_0x009e:
            r14 = r37
            goto L_0x00b2
        L_0x00a1:
            r14 = r14 & r11
            if (r14 != 0) goto L_0x009e
            r14 = r37
            boolean r15 = r1.W(r14)
            if (r15 == 0) goto L_0x00af
            r15 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00b1
        L_0x00af:
            r15 = 65536(0x10000, float:9.18355E-41)
        L_0x00b1:
            r4 = r4 | r15
        L_0x00b2:
            r15 = 1572864(0x180000, float:2.204052E-39)
            r15 = r15 & r11
            if (r15 != 0) goto L_0x00cd
            r15 = r12 & 64
            if (r15 != 0) goto L_0x00c6
            r15 = r38
            boolean r16 = r1.W(r15)
            if (r16 == 0) goto L_0x00c8
            r16 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00ca
        L_0x00c6:
            r15 = r38
        L_0x00c8:
            r16 = 524288(0x80000, float:7.34684E-40)
        L_0x00ca:
            r4 = r4 | r16
            goto L_0x00cf
        L_0x00cd:
            r15 = r38
        L_0x00cf:
            r0 = r12 & 128(0x80, float:1.794E-43)
            r17 = 12582912(0xc00000, float:1.7632415E-38)
            if (r0 == 0) goto L_0x00da
            r4 = r4 | r17
            r3 = r39
            goto L_0x00ed
        L_0x00da:
            r17 = r11 & r17
            r3 = r39
            if (r17 != 0) goto L_0x00ed
            boolean r17 = r1.d(r3)
            if (r17 == 0) goto L_0x00e9
            r17 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00eb
        L_0x00e9:
            r17 = 4194304(0x400000, float:5.877472E-39)
        L_0x00eb:
            r4 = r4 | r17
        L_0x00ed:
            r17 = 100663296(0x6000000, float:2.4074124E-35)
            r17 = r11 & r17
            if (r17 != 0) goto L_0x0109
            r3 = r12 & 256(0x100, float:3.59E-43)
            if (r3 != 0) goto L_0x0102
            r3 = r40
            boolean r17 = r1.W(r3)
            if (r17 == 0) goto L_0x0104
            r17 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x0106
        L_0x0102:
            r3 = r40
        L_0x0104:
            r17 = 33554432(0x2000000, float:9.403955E-38)
        L_0x0106:
            r4 = r4 | r17
            goto L_0x010b
        L_0x0109:
            r3 = r40
        L_0x010b:
            r3 = r12 & 512(0x200, float:7.175E-43)
            r17 = 805306368(0x30000000, float:4.656613E-10)
            if (r3 == 0) goto L_0x0116
            r4 = r4 | r17
        L_0x0113:
            r3 = r41
            goto L_0x0129
        L_0x0116:
            r3 = r11 & r17
            if (r3 != 0) goto L_0x0113
            r3 = r41
            boolean r17 = r1.l(r3)
            if (r17 == 0) goto L_0x0125
            r17 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x0127
        L_0x0125:
            r17 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x0127:
            r4 = r4 | r17
        L_0x0129:
            r17 = 306783379(0x12492493, float:6.34695E-28)
            r3 = r4 & r17
            r5 = 306783378(0x12492492, float:6.3469493E-28)
            r7 = 0
            r17 = 1
            if (r3 == r5) goto L_0x0139
            r3 = r17
            goto L_0x013a
        L_0x0139:
            r3 = r7
        L_0x013a:
            r5 = r4 & 1
            boolean r3 = r1.E(r3, r5)
            if (r3 == 0) goto L_0x025d
            r1.p()
            r3 = r11 & 1
            r5 = -234881025(0xfffffffff1ffffff, float:-2.535301E30)
            r18 = -3670017(0xffffffffffc7ffff, float:NaN)
            r19 = -57345(0xffffffffffff1fff, float:NaN)
            if (r3 == 0) goto L_0x0183
            boolean r3 = r1.J()
            if (r3 == 0) goto L_0x0159
            goto L_0x0183
        L_0x0159:
            r1.B()
            r0 = r12 & 2
            if (r0 == 0) goto L_0x0162
            r4 = r4 & -113(0xffffffffffffff8f, float:NaN)
        L_0x0162:
            r0 = r12 & 16
            if (r0 == 0) goto L_0x0168
            r4 = r4 & r19
        L_0x0168:
            r0 = r12 & 64
            if (r0 == 0) goto L_0x016e
            r4 = r4 & r18
        L_0x016e:
            r0 = r12 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L_0x0173
            r4 = r4 & r5
        L_0x0173:
            r2 = r32
            r3 = r33
            r6 = r34
            r5 = r40
            r7 = r4
            r8 = r10
            r10 = r14
            r0 = r15
            r4 = r39
            goto L_0x01ee
        L_0x0183:
            if (r2 == 0) goto L_0x0188
            androidx.compose.ui.Modifier$Companion r2 = androidx.compose.ui.Modifier.f15489d
            goto L_0x018a
        L_0x0188:
            r2 = r32
        L_0x018a:
            r3 = r12 & 2
            if (r3 == 0) goto L_0x0196
            r3 = 3
            androidx.compose.foundation.lazy.LazyListState r3 = androidx.compose.foundation.lazy.LazyListStateKt.b(r7, r7, r1, r7, r3)
            r4 = r4 & -113(0xffffffffffffff8f, float:NaN)
            goto L_0x0198
        L_0x0196:
            r3 = r33
        L_0x0198:
            if (r6 == 0) goto L_0x01a4
            float r6 = (float) r7
            float r6 = androidx.compose.ui.unit.Dp.m(r6)
            androidx.compose.foundation.layout.PaddingValues r6 = androidx.compose.foundation.layout.PaddingKt.a(r6)
            goto L_0x01a6
        L_0x01a4:
            r6 = r34
        L_0x01a6:
            if (r8 == 0) goto L_0x01a9
            r9 = r7
        L_0x01a9:
            r8 = r12 & 16
            if (r8 == 0) goto L_0x01bd
            androidx.compose.foundation.layout.Arrangement r8 = androidx.compose.foundation.layout.Arrangement.f3739a
            if (r9 != 0) goto L_0x01b6
            androidx.compose.foundation.layout.Arrangement$Horizontal r8 = r8.f()
            goto L_0x01ba
        L_0x01b6:
            androidx.compose.foundation.layout.Arrangement$Horizontal r8 = r8.c()
        L_0x01ba:
            r4 = r4 & r19
            goto L_0x01be
        L_0x01bd:
            r8 = r10
        L_0x01be:
            if (r13 == 0) goto L_0x01c7
            androidx.compose.ui.Alignment$Companion r10 = androidx.compose.ui.Alignment.f15444a
            androidx.compose.ui.Alignment$Vertical r10 = r10.l()
            goto L_0x01c8
        L_0x01c7:
            r10 = r14
        L_0x01c8:
            r13 = r12 & 64
            if (r13 == 0) goto L_0x01d6
            androidx.compose.foundation.gestures.ScrollableDefaults r13 = androidx.compose.foundation.gestures.ScrollableDefaults.f3558a
            r14 = 6
            androidx.compose.foundation.gestures.FlingBehavior r13 = r13.a(r1, r14)
            r4 = r4 & r18
            goto L_0x01d7
        L_0x01d6:
            r13 = r15
        L_0x01d7:
            if (r0 == 0) goto L_0x01da
            goto L_0x01dc
        L_0x01da:
            r17 = r39
        L_0x01dc:
            r0 = r12 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L_0x01eb
            androidx.compose.foundation.OverscrollEffect r0 = androidx.compose.foundation.OverscrollKt.b(r1, r7)
            r4 = r4 & r5
            r5 = r0
        L_0x01e6:
            r7 = r4
            r0 = r13
            r4 = r17
            goto L_0x01ee
        L_0x01eb:
            r5 = r40
            goto L_0x01e6
        L_0x01ee:
            r1.U()
            boolean r13 = androidx.compose.runtime.ComposerKt.P()
            if (r13 == 0) goto L_0x0200
            r13 = -1
            java.lang.String r14 = "androidx.compose.foundation.lazy.LazyRow (LazyDsl.kt:339)"
            r15 = -1884325601(0xffffffff8faf791f, float:-1.7302986E-29)
            androidx.compose.runtime.ComposerKt.Y(r15, r7, r13, r14)
        L_0x0200:
            r13 = r7 & 14
            r13 = r13 | 24576(0x6000, float:3.4438E-41)
            r14 = r7 & 112(0x70, float:1.57E-43)
            r13 = r13 | r14
            r14 = r7 & 896(0x380, float:1.256E-42)
            r13 = r13 | r14
            r14 = r7 & 7168(0x1c00, float:1.0045E-41)
            r13 = r13 | r14
            int r14 = r7 >> 3
            r15 = 458752(0x70000, float:6.42848E-40)
            r15 = r15 & r14
            r13 = r13 | r15
            r15 = 3670016(0x380000, float:5.142788E-39)
            r15 = r15 & r14
            r13 = r13 | r15
            r15 = 29360128(0x1c00000, float:7.052966E-38)
            r14 = r14 & r15
            r28 = r13 | r14
            int r13 = r7 >> 12
            r13 = r13 & 112(0x70, float:1.57E-43)
            int r14 = r7 >> 6
            r14 = r14 & 896(0x380, float:1.256E-42)
            r13 = r13 | r14
            int r7 = r7 >> 18
            r7 = r7 & 7168(0x1c00, float:1.0045E-41)
            r29 = r13 | r7
            r30 = 1792(0x700, float:2.511E-42)
            r17 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r13 = r2
            r14 = r3
            r15 = r6
            r16 = r9
            r18 = r0
            r19 = r4
            r20 = r5
            r24 = r10
            r25 = r8
            r26 = r41
            r27 = r1
            androidx.compose.foundation.lazy.LazyListKt.a(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30)
            boolean r7 = androidx.compose.runtime.ComposerKt.P()
            if (r7 == 0) goto L_0x0254
            androidx.compose.runtime.ComposerKt.X()
        L_0x0254:
            r7 = r0
            r31 = r8
            r8 = r4
            r4 = r9
            r9 = r5
            r5 = r31
            goto L_0x026e
        L_0x025d:
            r1.B()
            r2 = r32
            r3 = r33
            r6 = r34
            r8 = r39
            r4 = r9
            r5 = r10
            r10 = r14
            r7 = r15
            r9 = r40
        L_0x026e:
            androidx.compose.runtime.ScopeUpdateScope r13 = r1.x()
            if (r13 == 0) goto L_0x0287
            androidx.compose.foundation.lazy.LazyDslKt$LazyRow$1 r14 = new androidx.compose.foundation.lazy.LazyDslKt$LazyRow$1
            r0 = r14
            r1 = r2
            r2 = r3
            r3 = r6
            r6 = r10
            r10 = r41
            r11 = r43
            r12 = r44
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            r13.a(r14)
        L_0x0287:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.LazyDslKt.e(androidx.compose.ui.Modifier, androidx.compose.foundation.lazy.LazyListState, androidx.compose.foundation.layout.PaddingValues, boolean, androidx.compose.foundation.layout.Arrangement$Horizontal, androidx.compose.ui.Alignment$Vertical, androidx.compose.foundation.gestures.FlingBehavior, boolean, androidx.compose.foundation.OverscrollEffect, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:100:0x0118  */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x011b  */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x0124  */
    /* JADX WARNING: Removed duplicated region for block: B:156:0x0201  */
    /* JADX WARNING: Removed duplicated region for block: B:159:0x0215  */
    /* JADX WARNING: Removed duplicated region for block: B:161:? A[RETURN, SYNTHETIC] */
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
    public static final /* synthetic */ void f(androidx.compose.ui.Modifier r26, androidx.compose.foundation.lazy.LazyListState r27, androidx.compose.foundation.layout.PaddingValues r28, boolean r29, androidx.compose.foundation.layout.Arrangement.Horizontal r30, androidx.compose.ui.Alignment.Vertical r31, androidx.compose.foundation.gestures.FlingBehavior r32, boolean r33, kotlin.jvm.functions.Function1 r34, androidx.compose.runtime.Composer r35, int r36, int r37) {
        /*
            r10 = r36
            r11 = r37
            r0 = -1724297413(0xffffffff99394f3b, float:-9.580276E-24)
            r1 = r35
            androidx.compose.runtime.Composer r1 = r1.q(r0)
            r2 = r11 & 1
            if (r2 == 0) goto L_0x0017
            r3 = r10 | 6
            r4 = r3
            r3 = r26
            goto L_0x002b
        L_0x0017:
            r3 = r10 & 6
            if (r3 != 0) goto L_0x0028
            r3 = r26
            boolean r4 = r1.W(r3)
            if (r4 == 0) goto L_0x0025
            r4 = 4
            goto L_0x0026
        L_0x0025:
            r4 = 2
        L_0x0026:
            r4 = r4 | r10
            goto L_0x002b
        L_0x0028:
            r3 = r26
            r4 = r10
        L_0x002b:
            r5 = r10 & 48
            if (r5 != 0) goto L_0x0044
            r5 = r11 & 2
            if (r5 != 0) goto L_0x003e
            r5 = r27
            boolean r6 = r1.W(r5)
            if (r6 == 0) goto L_0x0040
            r6 = 32
            goto L_0x0042
        L_0x003e:
            r5 = r27
        L_0x0040:
            r6 = 16
        L_0x0042:
            r4 = r4 | r6
            goto L_0x0046
        L_0x0044:
            r5 = r27
        L_0x0046:
            r6 = r11 & 4
            if (r6 == 0) goto L_0x004f
            r4 = r4 | 384(0x180, float:5.38E-43)
        L_0x004c:
            r7 = r28
            goto L_0x0061
        L_0x004f:
            r7 = r10 & 384(0x180, float:5.38E-43)
            if (r7 != 0) goto L_0x004c
            r7 = r28
            boolean r8 = r1.W(r7)
            if (r8 == 0) goto L_0x005e
            r8 = 256(0x100, float:3.59E-43)
            goto L_0x0060
        L_0x005e:
            r8 = 128(0x80, float:1.794E-43)
        L_0x0060:
            r4 = r4 | r8
        L_0x0061:
            r8 = r11 & 8
            if (r8 == 0) goto L_0x006a
            r4 = r4 | 3072(0xc00, float:4.305E-42)
        L_0x0067:
            r9 = r29
            goto L_0x007c
        L_0x006a:
            r9 = r10 & 3072(0xc00, float:4.305E-42)
            if (r9 != 0) goto L_0x0067
            r9 = r29
            boolean r12 = r1.d(r9)
            if (r12 == 0) goto L_0x0079
            r12 = 2048(0x800, float:2.87E-42)
            goto L_0x007b
        L_0x0079:
            r12 = 1024(0x400, float:1.435E-42)
        L_0x007b:
            r4 = r4 | r12
        L_0x007c:
            r12 = r10 & 24576(0x6000, float:3.4438E-41)
            if (r12 != 0) goto L_0x0095
            r12 = r11 & 16
            if (r12 != 0) goto L_0x008f
            r12 = r30
            boolean r13 = r1.W(r12)
            if (r13 == 0) goto L_0x0091
            r13 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0093
        L_0x008f:
            r12 = r30
        L_0x0091:
            r13 = 8192(0x2000, float:1.14794E-41)
        L_0x0093:
            r4 = r4 | r13
            goto L_0x0097
        L_0x0095:
            r12 = r30
        L_0x0097:
            r13 = r11 & 32
            r14 = 196608(0x30000, float:2.75506E-40)
            if (r13 == 0) goto L_0x00a1
            r4 = r4 | r14
        L_0x009e:
            r14 = r31
            goto L_0x00b2
        L_0x00a1:
            r14 = r14 & r10
            if (r14 != 0) goto L_0x009e
            r14 = r31
            boolean r15 = r1.W(r14)
            if (r15 == 0) goto L_0x00af
            r15 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00b1
        L_0x00af:
            r15 = 65536(0x10000, float:9.18355E-41)
        L_0x00b1:
            r4 = r4 | r15
        L_0x00b2:
            r15 = 1572864(0x180000, float:2.204052E-39)
            r15 = r15 & r10
            if (r15 != 0) goto L_0x00cd
            r15 = r11 & 64
            if (r15 != 0) goto L_0x00c6
            r15 = r32
            boolean r16 = r1.W(r15)
            if (r16 == 0) goto L_0x00c8
            r16 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00ca
        L_0x00c6:
            r15 = r32
        L_0x00c8:
            r16 = 524288(0x80000, float:7.34684E-40)
        L_0x00ca:
            r4 = r4 | r16
            goto L_0x00cf
        L_0x00cd:
            r15 = r32
        L_0x00cf:
            r0 = r11 & 128(0x80, float:1.794E-43)
            r17 = 12582912(0xc00000, float:1.7632415E-38)
            if (r0 == 0) goto L_0x00da
            r4 = r4 | r17
            r3 = r33
            goto L_0x00ed
        L_0x00da:
            r17 = r10 & r17
            r3 = r33
            if (r17 != 0) goto L_0x00ed
            boolean r17 = r1.d(r3)
            if (r17 == 0) goto L_0x00e9
            r17 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00eb
        L_0x00e9:
            r17 = 4194304(0x400000, float:5.877472E-39)
        L_0x00eb:
            r4 = r4 | r17
        L_0x00ed:
            r3 = r11 & 256(0x100, float:3.59E-43)
            r17 = 100663296(0x6000000, float:2.4074124E-35)
            if (r3 == 0) goto L_0x00f8
            r4 = r4 | r17
        L_0x00f5:
            r3 = r34
            goto L_0x010b
        L_0x00f8:
            r3 = r10 & r17
            if (r3 != 0) goto L_0x00f5
            r3 = r34
            boolean r17 = r1.l(r3)
            if (r17 == 0) goto L_0x0107
            r17 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x0109
        L_0x0107:
            r17 = 33554432(0x2000000, float:9.403955E-38)
        L_0x0109:
            r4 = r4 | r17
        L_0x010b:
            r17 = 38347923(0x2492493, float:1.4777644E-37)
            r3 = r4 & r17
            r5 = 38347922(0x2492492, float:1.4777643E-37)
            r7 = 0
            r17 = 1
            if (r3 == r5) goto L_0x011b
            r3 = r17
            goto L_0x011c
        L_0x011b:
            r3 = r7
        L_0x011c:
            r5 = r4 & 1
            boolean r3 = r1.E(r3, r5)
            if (r3 == 0) goto L_0x0201
            r1.p()
            r3 = r10 & 1
            r5 = 3
            r18 = -3670017(0xffffffffffc7ffff, float:NaN)
            r19 = -57345(0xffffffffffff1fff, float:NaN)
            if (r3 == 0) goto L_0x015c
            boolean r3 = r1.J()
            if (r3 == 0) goto L_0x0139
            goto L_0x015c
        L_0x0139:
            r1.B()
            r0 = r11 & 2
            if (r0 == 0) goto L_0x0142
            r4 = r4 & -113(0xffffffffffffff8f, float:NaN)
        L_0x0142:
            r0 = r11 & 16
            if (r0 == 0) goto L_0x0148
            r4 = r4 & r19
        L_0x0148:
            r0 = r11 & 64
            if (r0 == 0) goto L_0x014e
            r4 = r4 & r18
        L_0x014e:
            r2 = r26
            r3 = r27
            r6 = r28
            r25 = r33
            r8 = r12
            r0 = r14
            r12 = r4
            r4 = r15
            goto L_0x01bb
        L_0x015c:
            if (r2 == 0) goto L_0x0161
            androidx.compose.ui.Modifier$Companion r2 = androidx.compose.ui.Modifier.f15489d
            goto L_0x0163
        L_0x0161:
            r2 = r26
        L_0x0163:
            r3 = r11 & 2
            if (r3 == 0) goto L_0x016e
            androidx.compose.foundation.lazy.LazyListState r3 = androidx.compose.foundation.lazy.LazyListStateKt.b(r7, r7, r1, r7, r5)
            r4 = r4 & -113(0xffffffffffffff8f, float:NaN)
            goto L_0x0170
        L_0x016e:
            r3 = r27
        L_0x0170:
            if (r6 == 0) goto L_0x017c
            float r6 = (float) r7
            float r6 = androidx.compose.ui.unit.Dp.m(r6)
            androidx.compose.foundation.layout.PaddingValues r6 = androidx.compose.foundation.layout.PaddingKt.a(r6)
            goto L_0x017e
        L_0x017c:
            r6 = r28
        L_0x017e:
            if (r8 == 0) goto L_0x0181
            r9 = r7
        L_0x0181:
            r8 = r11 & 16
            if (r8 == 0) goto L_0x0195
            androidx.compose.foundation.layout.Arrangement r8 = androidx.compose.foundation.layout.Arrangement.f3739a
            if (r9 != 0) goto L_0x018e
            androidx.compose.foundation.layout.Arrangement$Horizontal r8 = r8.f()
            goto L_0x0192
        L_0x018e:
            androidx.compose.foundation.layout.Arrangement$Horizontal r8 = r8.c()
        L_0x0192:
            r4 = r4 & r19
            goto L_0x0196
        L_0x0195:
            r8 = r12
        L_0x0196:
            if (r13 == 0) goto L_0x019f
            androidx.compose.ui.Alignment$Companion r12 = androidx.compose.ui.Alignment.f15444a
            androidx.compose.ui.Alignment$Vertical r12 = r12.l()
            goto L_0x01a0
        L_0x019f:
            r12 = r14
        L_0x01a0:
            r13 = r11 & 64
            if (r13 == 0) goto L_0x01ae
            androidx.compose.foundation.gestures.ScrollableDefaults r13 = androidx.compose.foundation.gestures.ScrollableDefaults.f3558a
            r14 = 6
            androidx.compose.foundation.gestures.FlingBehavior r13 = r13.a(r1, r14)
            r4 = r4 & r18
            goto L_0x01af
        L_0x01ae:
            r13 = r15
        L_0x01af:
            if (r0 == 0) goto L_0x01b7
            r0 = r12
            r25 = r17
        L_0x01b4:
            r12 = r4
            r4 = r13
            goto L_0x01bb
        L_0x01b7:
            r25 = r33
            r0 = r12
            goto L_0x01b4
        L_0x01bb:
            r1.U()
            boolean r13 = androidx.compose.runtime.ComposerKt.P()
            if (r13 == 0) goto L_0x01cd
            r13 = -1
            java.lang.String r14 = "androidx.compose.foundation.lazy.LazyRow (LazyDsl.kt:482)"
            r15 = -1724297413(0xffffffff99394f3b, float:-9.580276E-24)
            androidx.compose.runtime.ComposerKt.Y(r15, r12, r13, r14)
        L_0x01cd:
            androidx.compose.foundation.OverscrollEffect r20 = androidx.compose.foundation.OverscrollKt.b(r1, r7)
            r7 = 33554430(0x1fffffe, float:9.4039537E-38)
            r7 = r7 & r12
            r13 = 1879048192(0x70000000, float:1.58456325E29)
            int r5 = r12 << 3
            r5 = r5 & r13
            r23 = r7 | r5
            r24 = 0
            r12 = r2
            r13 = r3
            r14 = r6
            r15 = r9
            r16 = r8
            r17 = r0
            r18 = r4
            r19 = r25
            r21 = r34
            r22 = r1
            e(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            boolean r5 = androidx.compose.runtime.ComposerKt.P()
            if (r5 == 0) goto L_0x01fa
            androidx.compose.runtime.ComposerKt.X()
        L_0x01fa:
            r14 = r0
            r7 = r4
            r5 = r8
            r4 = r9
            r8 = r25
            goto L_0x020f
        L_0x0201:
            r1.B()
            r2 = r26
            r3 = r27
            r6 = r28
            r8 = r33
            r4 = r9
            r5 = r12
            r7 = r15
        L_0x020f:
            androidx.compose.runtime.ScopeUpdateScope r12 = r1.x()
            if (r12 == 0) goto L_0x0228
            androidx.compose.foundation.lazy.LazyDslKt$LazyRow$2 r13 = new androidx.compose.foundation.lazy.LazyDslKt$LazyRow$2
            r0 = r13
            r1 = r2
            r2 = r3
            r3 = r6
            r6 = r14
            r9 = r34
            r10 = r36
            r11 = r37
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r12.a(r13)
        L_0x0228:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.LazyDslKt.f(androidx.compose.ui.Modifier, androidx.compose.foundation.lazy.LazyListState, androidx.compose.foundation.layout.PaddingValues, boolean, androidx.compose.foundation.layout.Arrangement$Horizontal, androidx.compose.ui.Alignment$Vertical, androidx.compose.foundation.gestures.FlingBehavior, boolean, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }
}
