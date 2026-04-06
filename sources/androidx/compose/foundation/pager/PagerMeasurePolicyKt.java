package androidx.compose.foundation.pager;

import kotlin.Metadata;

@Metadata
public final class PagerMeasurePolicyKt {
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00bc, code lost:
        if (r0.h(r27) == false) goto L_0x00c1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x00d8, code lost:
        if (r0.W(r28) == false) goto L_0x00dd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0022, code lost:
        if (r0.W(r22) == false) goto L_0x0027;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x00f1, code lost:
        if (r0.W(r31) == false) goto L_0x00f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x010a, code lost:
        if (r0.W(r33) == false) goto L_0x010f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x0127, code lost:
        if (r0.i(r26) == false) goto L_0x012c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x0179  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0042  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0044  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x008e  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00a8  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00aa  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00b6  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00bf  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00c6  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x00d2  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00db  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00e2  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x00eb  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x00f4  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x00fc  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x0104  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x010d  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0115  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0121  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x012a  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x0134  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final kotlin.jvm.functions.Function2 a(kotlin.jvm.functions.Function0 r21, androidx.compose.foundation.pager.PagerState r22, androidx.compose.foundation.layout.PaddingValues r23, boolean r24, androidx.compose.foundation.gestures.Orientation r25, int r26, float r27, androidx.compose.foundation.pager.PageSize r28, androidx.compose.ui.Alignment.Horizontal r29, androidx.compose.ui.Alignment.Vertical r30, androidx.compose.foundation.gestures.snapping.SnapPosition r31, kotlinx.coroutines.CoroutineScope r32, kotlin.jvm.functions.Function0 r33, androidx.compose.runtime.Composer r34, int r35, int r36) {
        /*
            r0 = r34
            r1 = r35
            r2 = r36
            boolean r3 = androidx.compose.runtime.ComposerKt.P()
            if (r3 == 0) goto L_0x0014
            r3 = 1391419623(0x52ef60e7, float:5.14061468E11)
            java.lang.String r4 = "androidx.compose.foundation.pager.rememberPagerMeasurePolicy (PagerMeasurePolicy.kt:57)"
            androidx.compose.runtime.ComposerKt.Y(r3, r1, r2, r4)
        L_0x0014:
            r3 = r1 & 112(0x70, float:1.57E-43)
            r3 = r3 ^ 48
            r4 = 32
            if (r3 <= r4) goto L_0x0025
            r3 = r22
            boolean r7 = r0.W(r3)
            if (r7 != 0) goto L_0x002b
            goto L_0x0027
        L_0x0025:
            r3 = r22
        L_0x0027:
            r7 = r1 & 48
            if (r7 != r4) goto L_0x002d
        L_0x002b:
            r4 = 1
            goto L_0x002e
        L_0x002d:
            r4 = 0
        L_0x002e:
            r7 = r1 & 896(0x380, float:1.256E-42)
            r7 = r7 ^ 384(0x180, float:5.38E-43)
            r8 = 256(0x100, float:3.59E-43)
            r10 = r23
            if (r7 <= r8) goto L_0x003e
            boolean r7 = r0.W(r10)
            if (r7 != 0) goto L_0x0042
        L_0x003e:
            r7 = r1 & 384(0x180, float:5.38E-43)
            if (r7 != r8) goto L_0x0044
        L_0x0042:
            r7 = 1
            goto L_0x0045
        L_0x0044:
            r7 = 0
        L_0x0045:
            r4 = r4 | r7
            r7 = r1 & 7168(0x1c00, float:1.0045E-41)
            r7 = r7 ^ 3072(0xc00, float:4.305E-42)
            r9 = 2048(0x800, float:2.87E-42)
            r11 = r24
            if (r7 <= r9) goto L_0x0056
            boolean r7 = r0.d(r11)
            if (r7 != 0) goto L_0x005a
        L_0x0056:
            r7 = r1 & 3072(0xc00, float:4.305E-42)
            if (r7 != r9) goto L_0x005c
        L_0x005a:
            r7 = 1
            goto L_0x005d
        L_0x005c:
            r7 = 0
        L_0x005d:
            r4 = r4 | r7
            r7 = 57344(0xe000, float:8.0356E-41)
            r7 = r7 & r1
            r7 = r7 ^ 24576(0x6000, float:3.4438E-41)
            r9 = 16384(0x4000, float:2.2959E-41)
            r12 = r25
            if (r7 <= r9) goto L_0x0070
            boolean r7 = r0.W(r12)
            if (r7 != 0) goto L_0x0074
        L_0x0070:
            r7 = r1 & 24576(0x6000, float:3.4438E-41)
            if (r7 != r9) goto L_0x0076
        L_0x0074:
            r7 = 1
            goto L_0x0077
        L_0x0076:
            r7 = 0
        L_0x0077:
            r4 = r4 | r7
            r7 = 234881024(0xe000000, float:1.5777218E-30)
            r7 = r7 & r1
            r9 = 100663296(0x6000000, float:2.4074124E-35)
            r7 = r7 ^ r9
            r13 = 67108864(0x4000000, float:1.5046328E-36)
            r15 = r29
            if (r7 <= r13) goto L_0x008a
            boolean r7 = r0.W(r15)
            if (r7 != 0) goto L_0x008e
        L_0x008a:
            r7 = r1 & r9
            if (r7 != r13) goto L_0x0090
        L_0x008e:
            r7 = 1
            goto L_0x0091
        L_0x0090:
            r7 = 0
        L_0x0091:
            r4 = r4 | r7
            r7 = 1879048192(0x70000000, float:1.58456325E29)
            r7 = r7 & r1
            r9 = 805306368(0x30000000, float:4.656613E-10)
            r7 = r7 ^ r9
            r13 = 536870912(0x20000000, float:1.0842022E-19)
            r14 = r30
            if (r7 <= r13) goto L_0x00a4
            boolean r7 = r0.W(r14)
            if (r7 != 0) goto L_0x00a8
        L_0x00a4:
            r7 = r1 & r9
            if (r7 != r13) goto L_0x00aa
        L_0x00a8:
            r7 = 1
            goto L_0x00ab
        L_0x00aa:
            r7 = 0
        L_0x00ab:
            r4 = r4 | r7
            r7 = 3670016(0x380000, float:5.142788E-39)
            r7 = r7 & r1
            r9 = 1572864(0x180000, float:2.204052E-39)
            r7 = r7 ^ r9
            r13 = 1048576(0x100000, float:1.469368E-39)
            if (r7 <= r13) goto L_0x00bf
            r7 = r27
            boolean r16 = r0.h(r7)
            if (r16 != 0) goto L_0x00c4
            goto L_0x00c1
        L_0x00bf:
            r7 = r27
        L_0x00c1:
            r9 = r9 & r1
            if (r9 != r13) goto L_0x00c6
        L_0x00c4:
            r9 = 1
            goto L_0x00c7
        L_0x00c6:
            r9 = 0
        L_0x00c7:
            r4 = r4 | r9
            r9 = 29360128(0x1c00000, float:7.052966E-38)
            r9 = r9 & r1
            r13 = 12582912(0xc00000, float:1.7632415E-38)
            r9 = r9 ^ r13
            r5 = 8388608(0x800000, float:1.17549435E-38)
            if (r9 <= r5) goto L_0x00db
            r9 = r28
            boolean r17 = r0.W(r9)
            if (r17 != 0) goto L_0x00e0
            goto L_0x00dd
        L_0x00db:
            r9 = r28
        L_0x00dd:
            r13 = r13 & r1
            if (r13 != r5) goto L_0x00e2
        L_0x00e0:
            r5 = 1
            goto L_0x00e3
        L_0x00e2:
            r5 = 0
        L_0x00e3:
            r4 = r4 | r5
            r5 = r2 & 14
            r5 = r5 ^ 6
            r13 = 4
            if (r5 <= r13) goto L_0x00f4
            r5 = r31
            boolean r17 = r0.W(r5)
            if (r17 != 0) goto L_0x00fa
            goto L_0x00f6
        L_0x00f4:
            r5 = r31
        L_0x00f6:
            r6 = r2 & 6
            if (r6 != r13) goto L_0x00fc
        L_0x00fa:
            r6 = 1
            goto L_0x00fd
        L_0x00fc:
            r6 = 0
        L_0x00fd:
            r4 = r4 | r6
            r6 = r2 & 896(0x380, float:1.256E-42)
            r6 = r6 ^ 384(0x180, float:5.38E-43)
            if (r6 <= r8) goto L_0x010d
            r6 = r33
            boolean r13 = r0.W(r6)
            if (r13 != 0) goto L_0x0113
            goto L_0x010f
        L_0x010d:
            r6 = r33
        L_0x010f:
            r2 = r2 & 384(0x180, float:5.38E-43)
            if (r2 != r8) goto L_0x0115
        L_0x0113:
            r2 = 1
            goto L_0x0116
        L_0x0115:
            r2 = 0
        L_0x0116:
            r2 = r2 | r4
            r4 = 458752(0x70000, float:6.42848E-40)
            r4 = r4 & r1
            r8 = 196608(0x30000, float:2.75506E-40)
            r4 = r4 ^ r8
            r13 = 131072(0x20000, float:1.83671E-40)
            if (r4 <= r13) goto L_0x012a
            r4 = r26
            boolean r13 = r0.i(r4)
            if (r13 != 0) goto L_0x0131
            goto L_0x012c
        L_0x012a:
            r4 = r26
        L_0x012c:
            r1 = r1 & r8
            r8 = 131072(0x20000, float:1.83671E-40)
            if (r1 != r8) goto L_0x0134
        L_0x0131:
            r16 = 1
            goto L_0x0136
        L_0x0134:
            r16 = 0
        L_0x0136:
            r1 = r2 | r16
            r2 = r32
            boolean r8 = r0.W(r2)
            r1 = r1 | r8
            java.lang.Object r8 = r34.g()
            if (r1 != 0) goto L_0x014d
            androidx.compose.runtime.Composer$Companion r1 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r1 = r1.a()
            if (r8 != r1) goto L_0x0171
        L_0x014d:
            androidx.compose.foundation.pager.PagerMeasurePolicyKt$rememberPagerMeasurePolicy$1$1 r1 = new androidx.compose.foundation.pager.PagerMeasurePolicyKt$rememberPagerMeasurePolicy$1$1
            r7 = r1
            r8 = r22
            r9 = r25
            r10 = r23
            r11 = r24
            r12 = r27
            r13 = r28
            r14 = r21
            r15 = r33
            r16 = r30
            r17 = r29
            r18 = r26
            r19 = r31
            r20 = r32
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            r0.N(r1)
            r8 = r1
        L_0x0171:
            kotlin.jvm.functions.Function2 r8 = (kotlin.jvm.functions.Function2) r8
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x017c
            androidx.compose.runtime.ComposerKt.X()
        L_0x017c:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.pager.PagerMeasurePolicyKt.a(kotlin.jvm.functions.Function0, androidx.compose.foundation.pager.PagerState, androidx.compose.foundation.layout.PaddingValues, boolean, androidx.compose.foundation.gestures.Orientation, int, float, androidx.compose.foundation.pager.PageSize, androidx.compose.ui.Alignment$Horizontal, androidx.compose.ui.Alignment$Vertical, androidx.compose.foundation.gestures.snapping.SnapPosition, kotlinx.coroutines.CoroutineScope, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int, int):kotlin.jvm.functions.Function2");
    }
}
