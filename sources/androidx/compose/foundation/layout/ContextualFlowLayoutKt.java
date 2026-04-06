package androidx.compose.foundation.layout;

import kotlin.Metadata;

@Metadata
public final class ContextualFlowLayoutKt {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v1, resolved type: androidx.compose.foundation.layout.FlowLayoutOverflowState} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v25, resolved type: java.util.ArrayList} */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x01a5, code lost:
        if (r13 == androidx.compose.runtime.Composer.f14567a.a()) goto L_0x01a7;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x0121  */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x020a  */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x021f  */
    /* JADX WARNING: Removed duplicated region for block: B:152:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x009f  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00a4  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00bd  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00c2  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x00db  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x00e0  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x00f9  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x00fc  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x0116  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x0118  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void a(int r24, androidx.compose.ui.Modifier r25, androidx.compose.foundation.layout.Arrangement.Vertical r26, androidx.compose.foundation.layout.Arrangement.Horizontal r27, androidx.compose.ui.Alignment.Horizontal r28, int r29, int r30, androidx.compose.foundation.layout.ContextualFlowColumnOverflow r31, kotlin.jvm.functions.Function4 r32, androidx.compose.runtime.Composer r33, int r34, int r35) {
        /*
            r9 = r32
            r10 = r34
            r11 = r35
            r0 = 1048542435(0x3e7f7ce3, float:0.24949984)
            r1 = r33
            androidx.compose.runtime.Composer r1 = r1.q(r0)
            r2 = r11 & 1
            if (r2 == 0) goto L_0x0019
            r2 = r10 | 6
            r3 = r2
            r2 = r24
            goto L_0x002d
        L_0x0019:
            r2 = r10 & 6
            if (r2 != 0) goto L_0x002a
            r2 = r24
            boolean r3 = r1.i(r2)
            if (r3 == 0) goto L_0x0027
            r3 = 4
            goto L_0x0028
        L_0x0027:
            r3 = 2
        L_0x0028:
            r3 = r3 | r10
            goto L_0x002d
        L_0x002a:
            r2 = r24
            r3 = r10
        L_0x002d:
            r4 = r11 & 2
            if (r4 == 0) goto L_0x0036
            r3 = r3 | 48
        L_0x0033:
            r5 = r25
            goto L_0x0048
        L_0x0036:
            r5 = r10 & 48
            if (r5 != 0) goto L_0x0033
            r5 = r25
            boolean r6 = r1.W(r5)
            if (r6 == 0) goto L_0x0045
            r6 = 32
            goto L_0x0047
        L_0x0045:
            r6 = 16
        L_0x0047:
            r3 = r3 | r6
        L_0x0048:
            r6 = r11 & 4
            if (r6 == 0) goto L_0x0051
            r3 = r3 | 384(0x180, float:5.38E-43)
        L_0x004e:
            r7 = r26
            goto L_0x0063
        L_0x0051:
            r7 = r10 & 384(0x180, float:5.38E-43)
            if (r7 != 0) goto L_0x004e
            r7 = r26
            boolean r8 = r1.W(r7)
            if (r8 == 0) goto L_0x0060
            r8 = 256(0x100, float:3.59E-43)
            goto L_0x0062
        L_0x0060:
            r8 = 128(0x80, float:1.794E-43)
        L_0x0062:
            r3 = r3 | r8
        L_0x0063:
            r8 = r11 & 8
            if (r8 == 0) goto L_0x006c
            r3 = r3 | 3072(0xc00, float:4.305E-42)
        L_0x0069:
            r12 = r27
            goto L_0x007e
        L_0x006c:
            r12 = r10 & 3072(0xc00, float:4.305E-42)
            if (r12 != 0) goto L_0x0069
            r12 = r27
            boolean r13 = r1.W(r12)
            if (r13 == 0) goto L_0x007b
            r13 = 2048(0x800, float:2.87E-42)
            goto L_0x007d
        L_0x007b:
            r13 = 1024(0x400, float:1.435E-42)
        L_0x007d:
            r3 = r3 | r13
        L_0x007e:
            r13 = r11 & 16
            if (r13 == 0) goto L_0x0087
            r3 = r3 | 24576(0x6000, float:3.4438E-41)
        L_0x0084:
            r14 = r28
            goto L_0x0099
        L_0x0087:
            r14 = r10 & 24576(0x6000, float:3.4438E-41)
            if (r14 != 0) goto L_0x0084
            r14 = r28
            boolean r15 = r1.W(r14)
            if (r15 == 0) goto L_0x0096
            r15 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0098
        L_0x0096:
            r15 = 8192(0x2000, float:1.14794E-41)
        L_0x0098:
            r3 = r3 | r15
        L_0x0099:
            r15 = r11 & 32
            r16 = 196608(0x30000, float:2.75506E-40)
            if (r15 == 0) goto L_0x00a4
            r3 = r3 | r16
            r0 = r29
            goto L_0x00b7
        L_0x00a4:
            r16 = r10 & r16
            r0 = r29
            if (r16 != 0) goto L_0x00b7
            boolean r17 = r1.i(r0)
            if (r17 == 0) goto L_0x00b3
            r17 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00b5
        L_0x00b3:
            r17 = 65536(0x10000, float:9.18355E-41)
        L_0x00b5:
            r3 = r3 | r17
        L_0x00b7:
            r17 = r11 & 64
            r18 = 1572864(0x180000, float:2.204052E-39)
            if (r17 == 0) goto L_0x00c2
            r3 = r3 | r18
            r0 = r30
            goto L_0x00d5
        L_0x00c2:
            r18 = r10 & r18
            r0 = r30
            if (r18 != 0) goto L_0x00d5
            boolean r18 = r1.i(r0)
            if (r18 == 0) goto L_0x00d1
            r18 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00d3
        L_0x00d1:
            r18 = 524288(0x80000, float:7.34684E-40)
        L_0x00d3:
            r3 = r3 | r18
        L_0x00d5:
            r0 = r11 & 128(0x80, float:1.794E-43)
            r18 = 12582912(0xc00000, float:1.7632415E-38)
            if (r0 == 0) goto L_0x00e0
            r3 = r3 | r18
            r2 = r31
            goto L_0x00f3
        L_0x00e0:
            r18 = r10 & r18
            r2 = r31
            if (r18 != 0) goto L_0x00f3
            boolean r18 = r1.W(r2)
            if (r18 == 0) goto L_0x00ef
            r18 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00f1
        L_0x00ef:
            r18 = 4194304(0x400000, float:5.877472E-39)
        L_0x00f1:
            r3 = r3 | r18
        L_0x00f3:
            r2 = r11 & 256(0x100, float:3.59E-43)
            r18 = 100663296(0x6000000, float:2.4074124E-35)
            if (r2 == 0) goto L_0x00fc
            r3 = r3 | r18
            goto L_0x010c
        L_0x00fc:
            r2 = r10 & r18
            if (r2 != 0) goto L_0x010c
            boolean r2 = r1.l(r9)
            if (r2 == 0) goto L_0x0109
            r2 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x010b
        L_0x0109:
            r2 = 33554432(0x2000000, float:9.403955E-38)
        L_0x010b:
            r3 = r3 | r2
        L_0x010c:
            r2 = 38347923(0x2492493, float:1.4777644E-37)
            r2 = r2 & r3
            r5 = 38347922(0x2492492, float:1.4777643E-37)
            r7 = 1
            if (r2 == r5) goto L_0x0118
            r2 = r7
            goto L_0x0119
        L_0x0118:
            r2 = 0
        L_0x0119:
            r5 = r3 & 1
            boolean r2 = r1.E(r2, r5)
            if (r2 == 0) goto L_0x020a
            if (r4 == 0) goto L_0x0126
            androidx.compose.ui.Modifier$Companion r2 = androidx.compose.ui.Modifier.f15489d
            goto L_0x0128
        L_0x0126:
            r2 = r25
        L_0x0128:
            if (r6 == 0) goto L_0x0131
            androidx.compose.foundation.layout.Arrangement r4 = androidx.compose.foundation.layout.Arrangement.f3739a
            androidx.compose.foundation.layout.Arrangement$Vertical r4 = r4.g()
            goto L_0x0133
        L_0x0131:
            r4 = r26
        L_0x0133:
            if (r8 == 0) goto L_0x013c
            androidx.compose.foundation.layout.Arrangement r5 = androidx.compose.foundation.layout.Arrangement.f3739a
            androidx.compose.foundation.layout.Arrangement$Horizontal r5 = r5.f()
            goto L_0x013d
        L_0x013c:
            r5 = r12
        L_0x013d:
            if (r13 == 0) goto L_0x0146
            androidx.compose.ui.Alignment$Companion r6 = androidx.compose.ui.Alignment.f15444a
            androidx.compose.ui.Alignment$Horizontal r6 = r6.k()
            goto L_0x0147
        L_0x0146:
            r6 = r14
        L_0x0147:
            r8 = 2147483647(0x7fffffff, float:NaN)
            if (r15 == 0) goto L_0x014f
            r23 = r8
            goto L_0x0151
        L_0x014f:
            r23 = r29
        L_0x0151:
            if (r17 == 0) goto L_0x0154
            goto L_0x0156
        L_0x0154:
            r8 = r30
        L_0x0156:
            if (r0 == 0) goto L_0x015f
            androidx.compose.foundation.layout.ContextualFlowColumnOverflow$Companion r0 = androidx.compose.foundation.layout.ContextualFlowColumnOverflow.f3818f
            androidx.compose.foundation.layout.ContextualFlowColumnOverflow r0 = r0.a()
            goto L_0x0161
        L_0x015f:
            r0 = r31
        L_0x0161:
            boolean r12 = androidx.compose.runtime.ComposerKt.P()
            if (r12 == 0) goto L_0x0170
            r12 = -1
            java.lang.String r13 = "androidx.compose.foundation.layout.ContextualFlowColumn (ContextualFlowLayout.kt:154)"
            r14 = 1048542435(0x3e7f7ce3, float:0.24949984)
            androidx.compose.runtime.ComposerKt.Y(r14, r3, r12, r13)
        L_0x0170:
            r12 = 29360128(0x1c00000, float:7.052966E-38)
            r12 = r12 & r3
            r13 = 8388608(0x800000, float:1.17549435E-38)
            if (r12 != r13) goto L_0x0179
            r13 = r7
            goto L_0x017a
        L_0x0179:
            r13 = 0
        L_0x017a:
            java.lang.Object r14 = r1.g()
            if (r13 != 0) goto L_0x0188
            androidx.compose.runtime.Composer$Companion r13 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r13 = r13.a()
            if (r14 != r13) goto L_0x018f
        L_0x0188:
            androidx.compose.foundation.layout.FlowLayoutOverflowState r14 = r0.b()
            r1.N(r14)
        L_0x018f:
            r15 = r14
            androidx.compose.foundation.layout.FlowLayoutOverflowState r15 = (androidx.compose.foundation.layout.FlowLayoutOverflowState) r15
            r13 = 8388608(0x800000, float:1.17549435E-38)
            if (r12 != r13) goto L_0x0198
            r12 = r7
            goto L_0x0199
        L_0x0198:
            r12 = 0
        L_0x0199:
            java.lang.Object r13 = r1.g()
            if (r12 != 0) goto L_0x01a7
            androidx.compose.runtime.Composer$Companion r12 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r12 = r12.a()
            if (r13 != r12) goto L_0x01b2
        L_0x01a7:
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            r0.a(r15, r13)
            r1.N(r13)
        L_0x01b2:
            r19 = r13
            java.util.List r19 = (java.util.List) r19
            androidx.compose.foundation.layout.ContextualFlowLayoutKt$ContextualFlowColumn$measurePolicy$1 r12 = new androidx.compose.foundation.layout.ContextualFlowLayoutKt$ContextualFlowColumn$measurePolicy$1
            r12.<init>(r9)
            r13 = 54
            r14 = 1048264111(0x3e7b3daf, float:0.24535249)
            androidx.compose.runtime.internal.ComposableLambda r20 = androidx.compose.runtime.internal.ComposableLambdaKt.e(r14, r7, r12, r1, r13)
            int r7 = r3 >> 6
            r12 = r7 & 14
            r12 = r12 | r18
            r13 = r7 & 112(0x70, float:1.57E-43)
            r12 = r12 | r13
            r13 = r7 & 896(0x380, float:1.256E-42)
            r12 = r12 | r13
            r13 = r7 & 7168(0x1c00, float:1.0045E-41)
            r12 = r12 | r13
            r13 = 57344(0xe000, float:8.0356E-41)
            r7 = r7 & r13
            r7 = r7 | r12
            int r12 = r3 << 18
            r13 = 3670016(0x380000, float:5.142788E-39)
            r12 = r12 & r13
            r22 = r7 | r12
            r12 = r4
            r13 = r5
            r14 = r6
            r7 = r15
            r15 = r23
            r16 = r8
            r17 = r7
            r18 = r24
            r21 = r1
            kotlin.jvm.functions.Function2 r7 = c(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            int r3 = r3 >> 3
            r3 = r3 & 14
            r12 = 0
            androidx.compose.ui.layout.SubcomposeLayoutKt.a(r2, r7, r1, r3, r12)
            boolean r3 = androidx.compose.runtime.ComposerKt.P()
            if (r3 == 0) goto L_0x0202
            androidx.compose.runtime.ComposerKt.X()
        L_0x0202:
            r3 = r4
            r4 = r5
            r5 = r6
            r7 = r8
            r6 = r23
            r8 = r0
            goto L_0x0219
        L_0x020a:
            r1.B()
            r2 = r25
            r3 = r26
            r6 = r29
            r7 = r30
            r8 = r31
            r4 = r12
            r5 = r14
        L_0x0219:
            androidx.compose.runtime.ScopeUpdateScope r12 = r1.x()
            if (r12 == 0) goto L_0x0230
            androidx.compose.foundation.layout.ContextualFlowLayoutKt$ContextualFlowColumn$1 r13 = new androidx.compose.foundation.layout.ContextualFlowLayoutKt$ContextualFlowColumn$1
            r0 = r13
            r1 = r24
            r9 = r32
            r10 = r34
            r11 = r35
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r12.a(r13)
        L_0x0230:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.layout.ContextualFlowLayoutKt.a(int, androidx.compose.ui.Modifier, androidx.compose.foundation.layout.Arrangement$Vertical, androidx.compose.foundation.layout.Arrangement$Horizontal, androidx.compose.ui.Alignment$Horizontal, int, int, androidx.compose.foundation.layout.ContextualFlowColumnOverflow, kotlin.jvm.functions.Function4, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v1, resolved type: androidx.compose.foundation.layout.FlowLayoutOverflowState} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v25, resolved type: java.util.ArrayList} */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x01a5, code lost:
        if (r13 == androidx.compose.runtime.Composer.f14567a.a()) goto L_0x01a7;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x0121  */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x020a  */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x021f  */
    /* JADX WARNING: Removed duplicated region for block: B:152:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x009f  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00a4  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00bd  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00c2  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x00db  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x00e0  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x00f9  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x00fc  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x0116  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x0118  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void b(int r24, androidx.compose.ui.Modifier r25, androidx.compose.foundation.layout.Arrangement.Horizontal r26, androidx.compose.foundation.layout.Arrangement.Vertical r27, androidx.compose.ui.Alignment.Vertical r28, int r29, int r30, androidx.compose.foundation.layout.ContextualFlowRowOverflow r31, kotlin.jvm.functions.Function4 r32, androidx.compose.runtime.Composer r33, int r34, int r35) {
        /*
            r9 = r32
            r10 = r34
            r11 = r35
            r0 = 253921631(0xf22895f, float:8.013673E-30)
            r1 = r33
            androidx.compose.runtime.Composer r1 = r1.q(r0)
            r2 = r11 & 1
            if (r2 == 0) goto L_0x0019
            r2 = r10 | 6
            r3 = r2
            r2 = r24
            goto L_0x002d
        L_0x0019:
            r2 = r10 & 6
            if (r2 != 0) goto L_0x002a
            r2 = r24
            boolean r3 = r1.i(r2)
            if (r3 == 0) goto L_0x0027
            r3 = 4
            goto L_0x0028
        L_0x0027:
            r3 = 2
        L_0x0028:
            r3 = r3 | r10
            goto L_0x002d
        L_0x002a:
            r2 = r24
            r3 = r10
        L_0x002d:
            r4 = r11 & 2
            if (r4 == 0) goto L_0x0036
            r3 = r3 | 48
        L_0x0033:
            r5 = r25
            goto L_0x0048
        L_0x0036:
            r5 = r10 & 48
            if (r5 != 0) goto L_0x0033
            r5 = r25
            boolean r6 = r1.W(r5)
            if (r6 == 0) goto L_0x0045
            r6 = 32
            goto L_0x0047
        L_0x0045:
            r6 = 16
        L_0x0047:
            r3 = r3 | r6
        L_0x0048:
            r6 = r11 & 4
            if (r6 == 0) goto L_0x0051
            r3 = r3 | 384(0x180, float:5.38E-43)
        L_0x004e:
            r7 = r26
            goto L_0x0063
        L_0x0051:
            r7 = r10 & 384(0x180, float:5.38E-43)
            if (r7 != 0) goto L_0x004e
            r7 = r26
            boolean r8 = r1.W(r7)
            if (r8 == 0) goto L_0x0060
            r8 = 256(0x100, float:3.59E-43)
            goto L_0x0062
        L_0x0060:
            r8 = 128(0x80, float:1.794E-43)
        L_0x0062:
            r3 = r3 | r8
        L_0x0063:
            r8 = r11 & 8
            if (r8 == 0) goto L_0x006c
            r3 = r3 | 3072(0xc00, float:4.305E-42)
        L_0x0069:
            r12 = r27
            goto L_0x007e
        L_0x006c:
            r12 = r10 & 3072(0xc00, float:4.305E-42)
            if (r12 != 0) goto L_0x0069
            r12 = r27
            boolean r13 = r1.W(r12)
            if (r13 == 0) goto L_0x007b
            r13 = 2048(0x800, float:2.87E-42)
            goto L_0x007d
        L_0x007b:
            r13 = 1024(0x400, float:1.435E-42)
        L_0x007d:
            r3 = r3 | r13
        L_0x007e:
            r13 = r11 & 16
            if (r13 == 0) goto L_0x0087
            r3 = r3 | 24576(0x6000, float:3.4438E-41)
        L_0x0084:
            r14 = r28
            goto L_0x0099
        L_0x0087:
            r14 = r10 & 24576(0x6000, float:3.4438E-41)
            if (r14 != 0) goto L_0x0084
            r14 = r28
            boolean r15 = r1.W(r14)
            if (r15 == 0) goto L_0x0096
            r15 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0098
        L_0x0096:
            r15 = 8192(0x2000, float:1.14794E-41)
        L_0x0098:
            r3 = r3 | r15
        L_0x0099:
            r15 = r11 & 32
            r16 = 196608(0x30000, float:2.75506E-40)
            if (r15 == 0) goto L_0x00a4
            r3 = r3 | r16
            r0 = r29
            goto L_0x00b7
        L_0x00a4:
            r16 = r10 & r16
            r0 = r29
            if (r16 != 0) goto L_0x00b7
            boolean r17 = r1.i(r0)
            if (r17 == 0) goto L_0x00b3
            r17 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00b5
        L_0x00b3:
            r17 = 65536(0x10000, float:9.18355E-41)
        L_0x00b5:
            r3 = r3 | r17
        L_0x00b7:
            r17 = r11 & 64
            r18 = 1572864(0x180000, float:2.204052E-39)
            if (r17 == 0) goto L_0x00c2
            r3 = r3 | r18
            r0 = r30
            goto L_0x00d5
        L_0x00c2:
            r18 = r10 & r18
            r0 = r30
            if (r18 != 0) goto L_0x00d5
            boolean r18 = r1.i(r0)
            if (r18 == 0) goto L_0x00d1
            r18 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00d3
        L_0x00d1:
            r18 = 524288(0x80000, float:7.34684E-40)
        L_0x00d3:
            r3 = r3 | r18
        L_0x00d5:
            r0 = r11 & 128(0x80, float:1.794E-43)
            r18 = 12582912(0xc00000, float:1.7632415E-38)
            if (r0 == 0) goto L_0x00e0
            r3 = r3 | r18
            r2 = r31
            goto L_0x00f3
        L_0x00e0:
            r18 = r10 & r18
            r2 = r31
            if (r18 != 0) goto L_0x00f3
            boolean r18 = r1.W(r2)
            if (r18 == 0) goto L_0x00ef
            r18 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00f1
        L_0x00ef:
            r18 = 4194304(0x400000, float:5.877472E-39)
        L_0x00f1:
            r3 = r3 | r18
        L_0x00f3:
            r2 = r11 & 256(0x100, float:3.59E-43)
            r18 = 100663296(0x6000000, float:2.4074124E-35)
            if (r2 == 0) goto L_0x00fc
            r3 = r3 | r18
            goto L_0x010c
        L_0x00fc:
            r2 = r10 & r18
            if (r2 != 0) goto L_0x010c
            boolean r2 = r1.l(r9)
            if (r2 == 0) goto L_0x0109
            r2 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x010b
        L_0x0109:
            r2 = 33554432(0x2000000, float:9.403955E-38)
        L_0x010b:
            r3 = r3 | r2
        L_0x010c:
            r2 = 38347923(0x2492493, float:1.4777644E-37)
            r2 = r2 & r3
            r5 = 38347922(0x2492492, float:1.4777643E-37)
            r7 = 1
            if (r2 == r5) goto L_0x0118
            r2 = r7
            goto L_0x0119
        L_0x0118:
            r2 = 0
        L_0x0119:
            r5 = r3 & 1
            boolean r2 = r1.E(r2, r5)
            if (r2 == 0) goto L_0x020a
            if (r4 == 0) goto L_0x0126
            androidx.compose.ui.Modifier$Companion r2 = androidx.compose.ui.Modifier.f15489d
            goto L_0x0128
        L_0x0126:
            r2 = r25
        L_0x0128:
            if (r6 == 0) goto L_0x0131
            androidx.compose.foundation.layout.Arrangement r4 = androidx.compose.foundation.layout.Arrangement.f3739a
            androidx.compose.foundation.layout.Arrangement$Horizontal r4 = r4.f()
            goto L_0x0133
        L_0x0131:
            r4 = r26
        L_0x0133:
            if (r8 == 0) goto L_0x013c
            androidx.compose.foundation.layout.Arrangement r5 = androidx.compose.foundation.layout.Arrangement.f3739a
            androidx.compose.foundation.layout.Arrangement$Vertical r5 = r5.g()
            goto L_0x013d
        L_0x013c:
            r5 = r12
        L_0x013d:
            if (r13 == 0) goto L_0x0146
            androidx.compose.ui.Alignment$Companion r6 = androidx.compose.ui.Alignment.f15444a
            androidx.compose.ui.Alignment$Vertical r6 = r6.l()
            goto L_0x0147
        L_0x0146:
            r6 = r14
        L_0x0147:
            r8 = 2147483647(0x7fffffff, float:NaN)
            if (r15 == 0) goto L_0x014f
            r23 = r8
            goto L_0x0151
        L_0x014f:
            r23 = r29
        L_0x0151:
            if (r17 == 0) goto L_0x0154
            goto L_0x0156
        L_0x0154:
            r8 = r30
        L_0x0156:
            if (r0 == 0) goto L_0x015f
            androidx.compose.foundation.layout.ContextualFlowRowOverflow$Companion r0 = androidx.compose.foundation.layout.ContextualFlowRowOverflow.f3848f
            androidx.compose.foundation.layout.ContextualFlowRowOverflow r0 = r0.a()
            goto L_0x0161
        L_0x015f:
            r0 = r31
        L_0x0161:
            boolean r12 = androidx.compose.runtime.ComposerKt.P()
            if (r12 == 0) goto L_0x0170
            r12 = -1
            java.lang.String r13 = "androidx.compose.foundation.layout.ContextualFlowRow (ContextualFlowLayout.kt:79)"
            r14 = 253921631(0xf22895f, float:8.013673E-30)
            androidx.compose.runtime.ComposerKt.Y(r14, r3, r12, r13)
        L_0x0170:
            r12 = 29360128(0x1c00000, float:7.052966E-38)
            r12 = r12 & r3
            r13 = 8388608(0x800000, float:1.17549435E-38)
            if (r12 != r13) goto L_0x0179
            r13 = r7
            goto L_0x017a
        L_0x0179:
            r13 = 0
        L_0x017a:
            java.lang.Object r14 = r1.g()
            if (r13 != 0) goto L_0x0188
            androidx.compose.runtime.Composer$Companion r13 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r13 = r13.a()
            if (r14 != r13) goto L_0x018f
        L_0x0188:
            androidx.compose.foundation.layout.FlowLayoutOverflowState r14 = r0.b()
            r1.N(r14)
        L_0x018f:
            r15 = r14
            androidx.compose.foundation.layout.FlowLayoutOverflowState r15 = (androidx.compose.foundation.layout.FlowLayoutOverflowState) r15
            r13 = 8388608(0x800000, float:1.17549435E-38)
            if (r12 != r13) goto L_0x0198
            r12 = r7
            goto L_0x0199
        L_0x0198:
            r12 = 0
        L_0x0199:
            java.lang.Object r13 = r1.g()
            if (r12 != 0) goto L_0x01a7
            androidx.compose.runtime.Composer$Companion r12 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r12 = r12.a()
            if (r13 != r12) goto L_0x01b2
        L_0x01a7:
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            r0.a(r15, r13)
            r1.N(r13)
        L_0x01b2:
            r19 = r13
            java.util.List r19 = (java.util.List) r19
            androidx.compose.foundation.layout.ContextualFlowLayoutKt$ContextualFlowRow$measurePolicy$1 r12 = new androidx.compose.foundation.layout.ContextualFlowLayoutKt$ContextualFlowRow$measurePolicy$1
            r12.<init>(r9)
            r13 = 54
            r14 = -1599700159(0xffffffffa0a68341, float:-2.820835E-19)
            androidx.compose.runtime.internal.ComposableLambda r20 = androidx.compose.runtime.internal.ComposableLambdaKt.e(r14, r7, r12, r1, r13)
            int r7 = r3 >> 6
            r12 = r7 & 14
            r12 = r12 | r18
            r13 = r7 & 112(0x70, float:1.57E-43)
            r12 = r12 | r13
            r13 = r7 & 896(0x380, float:1.256E-42)
            r12 = r12 | r13
            r13 = r7 & 7168(0x1c00, float:1.0045E-41)
            r12 = r12 | r13
            r13 = 57344(0xe000, float:8.0356E-41)
            r7 = r7 & r13
            r7 = r7 | r12
            int r12 = r3 << 18
            r13 = 3670016(0x380000, float:5.142788E-39)
            r12 = r12 & r13
            r22 = r7 | r12
            r12 = r4
            r13 = r5
            r14 = r6
            r7 = r15
            r15 = r23
            r16 = r8
            r17 = r7
            r18 = r24
            r21 = r1
            kotlin.jvm.functions.Function2 r7 = d(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            int r3 = r3 >> 3
            r3 = r3 & 14
            r12 = 0
            androidx.compose.ui.layout.SubcomposeLayoutKt.a(r2, r7, r1, r3, r12)
            boolean r3 = androidx.compose.runtime.ComposerKt.P()
            if (r3 == 0) goto L_0x0202
            androidx.compose.runtime.ComposerKt.X()
        L_0x0202:
            r3 = r4
            r4 = r5
            r5 = r6
            r7 = r8
            r6 = r23
            r8 = r0
            goto L_0x0219
        L_0x020a:
            r1.B()
            r2 = r25
            r3 = r26
            r6 = r29
            r7 = r30
            r8 = r31
            r4 = r12
            r5 = r14
        L_0x0219:
            androidx.compose.runtime.ScopeUpdateScope r12 = r1.x()
            if (r12 == 0) goto L_0x0230
            androidx.compose.foundation.layout.ContextualFlowLayoutKt$ContextualFlowRow$1 r13 = new androidx.compose.foundation.layout.ContextualFlowLayoutKt$ContextualFlowRow$1
            r0 = r13
            r1 = r24
            r9 = r32
            r10 = r34
            r11 = r35
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r12.a(r13)
        L_0x0230:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.layout.ContextualFlowLayoutKt.b(int, androidx.compose.ui.Modifier, androidx.compose.foundation.layout.Arrangement$Horizontal, androidx.compose.foundation.layout.Arrangement$Vertical, androidx.compose.ui.Alignment$Vertical, int, int, androidx.compose.foundation.layout.ContextualFlowRowOverflow, kotlin.jvm.functions.Function4, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0024, code lost:
        if (r1.W(r21) == false) goto L_0x0029;
     */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0044  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x008e  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00ad  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00af  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0110  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final kotlin.jvm.functions.Function2 c(androidx.compose.foundation.layout.Arrangement.Vertical r21, androidx.compose.foundation.layout.Arrangement.Horizontal r22, androidx.compose.ui.Alignment.Horizontal r23, int r24, int r25, androidx.compose.foundation.layout.FlowLayoutOverflowState r26, int r27, java.util.List r28, kotlin.jvm.functions.Function4 r29, androidx.compose.runtime.Composer r30, int r31) {
        /*
            r0 = r23
            r1 = r30
            r2 = r31
            boolean r3 = androidx.compose.runtime.ComposerKt.P()
            if (r3 == 0) goto L_0x0015
            r3 = -1
            java.lang.String r4 = "androidx.compose.foundation.layout.contextualColumnMeasureHelper (ContextualFlowLayout.kt:434)"
            r5 = -1985535130(0xffffffff89a72366, float:-4.0237076E-33)
            androidx.compose.runtime.ComposerKt.Y(r5, r2, r3, r4)
        L_0x0015:
            r3 = r2 & 14
            r3 = r3 ^ 6
            r4 = 4
            r5 = 0
            r6 = 1
            if (r3 <= r4) goto L_0x0027
            r3 = r21
            boolean r7 = r1.W(r3)
            if (r7 != 0) goto L_0x002d
            goto L_0x0029
        L_0x0027:
            r3 = r21
        L_0x0029:
            r7 = r2 & 6
            if (r7 != r4) goto L_0x002f
        L_0x002d:
            r4 = r6
            goto L_0x0030
        L_0x002f:
            r4 = r5
        L_0x0030:
            r7 = r2 & 112(0x70, float:1.57E-43)
            r7 = r7 ^ 48
            r8 = 32
            r9 = r22
            if (r7 <= r8) goto L_0x0040
            boolean r7 = r1.W(r9)
            if (r7 != 0) goto L_0x0044
        L_0x0040:
            r7 = r2 & 48
            if (r7 != r8) goto L_0x0046
        L_0x0044:
            r7 = r6
            goto L_0x0047
        L_0x0046:
            r7 = r5
        L_0x0047:
            r4 = r4 | r7
            r7 = r2 & 896(0x380, float:1.256E-42)
            r7 = r7 ^ 384(0x180, float:5.38E-43)
            r8 = 256(0x100, float:3.59E-43)
            if (r7 <= r8) goto L_0x0056
            boolean r7 = r1.W(r0)
            if (r7 != 0) goto L_0x005a
        L_0x0056:
            r7 = r2 & 384(0x180, float:5.38E-43)
            if (r7 != r8) goto L_0x005c
        L_0x005a:
            r7 = r6
            goto L_0x005d
        L_0x005c:
            r7 = r5
        L_0x005d:
            r4 = r4 | r7
            r7 = r2 & 7168(0x1c00, float:1.0045E-41)
            r7 = r7 ^ 3072(0xc00, float:4.305E-42)
            r8 = 2048(0x800, float:2.87E-42)
            r15 = r24
            if (r7 <= r8) goto L_0x006e
            boolean r7 = r1.i(r15)
            if (r7 != 0) goto L_0x0072
        L_0x006e:
            r7 = r2 & 3072(0xc00, float:4.305E-42)
            if (r7 != r8) goto L_0x0074
        L_0x0072:
            r7 = r6
            goto L_0x0075
        L_0x0074:
            r7 = r5
        L_0x0075:
            r4 = r4 | r7
            r7 = 57344(0xe000, float:8.0356E-41)
            r7 = r7 & r2
            r7 = r7 ^ 24576(0x6000, float:3.4438E-41)
            r8 = 16384(0x4000, float:2.2959E-41)
            r14 = r25
            if (r7 <= r8) goto L_0x0088
            boolean r7 = r1.i(r14)
            if (r7 != 0) goto L_0x008c
        L_0x0088:
            r7 = r2 & 24576(0x6000, float:3.4438E-41)
            if (r7 != r8) goto L_0x008e
        L_0x008c:
            r7 = r6
            goto L_0x008f
        L_0x008e:
            r7 = r5
        L_0x008f:
            r4 = r4 | r7
            r13 = r26
            boolean r7 = r1.W(r13)
            r4 = r4 | r7
            r7 = 3670016(0x380000, float:5.142788E-39)
            r7 = r7 & r2
            r8 = 1572864(0x180000, float:2.204052E-39)
            r7 = r7 ^ r8
            r10 = 1048576(0x100000, float:1.469368E-39)
            r12 = r27
            if (r7 <= r10) goto L_0x00a9
            boolean r7 = r1.i(r12)
            if (r7 != 0) goto L_0x00ad
        L_0x00a9:
            r7 = r2 & r8
            if (r7 != r10) goto L_0x00af
        L_0x00ad:
            r7 = r6
            goto L_0x00b0
        L_0x00af:
            r7 = r5
        L_0x00b0:
            r4 = r4 | r7
            r7 = 234881024(0xe000000, float:1.5777218E-30)
            r7 = r7 & r2
            r8 = 100663296(0x6000000, float:2.4074124E-35)
            r7 = r7 ^ r8
            r10 = 67108864(0x4000000, float:1.5046328E-36)
            r11 = r29
            if (r7 <= r10) goto L_0x00c3
            boolean r7 = r1.W(r11)
            if (r7 != 0) goto L_0x00c6
        L_0x00c3:
            r2 = r2 & r8
            if (r2 != r10) goto L_0x00c7
        L_0x00c6:
            r5 = r6
        L_0x00c7:
            r2 = r4 | r5
            java.lang.Object r4 = r30.g()
            if (r2 != 0) goto L_0x00d7
            androidx.compose.runtime.Composer$Companion r2 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r2 = r2.a()
            if (r4 != r2) goto L_0x0108
        L_0x00d7:
            float r2 = r21.a()
            androidx.compose.foundation.layout.CrossAxisAlignment$Companion r4 = androidx.compose.foundation.layout.CrossAxisAlignment.f3867a
            androidx.compose.foundation.layout.CrossAxisAlignment r0 = r4.b(r0)
            float r4 = r22.a()
            androidx.compose.foundation.layout.FlowMeasureLazyPolicy r5 = new androidx.compose.foundation.layout.FlowMeasureLazyPolicy
            r8 = 0
            r20 = 0
            r7 = r5
            r9 = r22
            r10 = r21
            r11 = r2
            r12 = r0
            r13 = r4
            r14 = r27
            r15 = r25
            r16 = r24
            r17 = r26
            r18 = r28
            r19 = r29
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            kotlin.jvm.functions.Function2 r4 = r5.i()
            r1.N(r4)
        L_0x0108:
            kotlin.jvm.functions.Function2 r4 = (kotlin.jvm.functions.Function2) r4
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x0113
            androidx.compose.runtime.ComposerKt.X()
        L_0x0113:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.layout.ContextualFlowLayoutKt.c(androidx.compose.foundation.layout.Arrangement$Vertical, androidx.compose.foundation.layout.Arrangement$Horizontal, androidx.compose.ui.Alignment$Horizontal, int, int, androidx.compose.foundation.layout.FlowLayoutOverflowState, int, java.util.List, kotlin.jvm.functions.Function4, androidx.compose.runtime.Composer, int):kotlin.jvm.functions.Function2");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0024, code lost:
        if (r1.W(r21) == false) goto L_0x0029;
     */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0044  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x008e  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00ad  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00af  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0110  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final kotlin.jvm.functions.Function2 d(androidx.compose.foundation.layout.Arrangement.Horizontal r21, androidx.compose.foundation.layout.Arrangement.Vertical r22, androidx.compose.ui.Alignment.Vertical r23, int r24, int r25, androidx.compose.foundation.layout.FlowLayoutOverflowState r26, int r27, java.util.List r28, kotlin.jvm.functions.Function4 r29, androidx.compose.runtime.Composer r30, int r31) {
        /*
            r0 = r23
            r1 = r30
            r2 = r31
            boolean r3 = androidx.compose.runtime.ComposerKt.P()
            if (r3 == 0) goto L_0x0015
            r3 = -1
            java.lang.String r4 = "androidx.compose.foundation.layout.contextualRowMeasurementHelper (ContextualFlowLayout.kt:394)"
            r5 = 785825072(0x2ed6bd30, float:9.7652E-11)
            androidx.compose.runtime.ComposerKt.Y(r5, r2, r3, r4)
        L_0x0015:
            r3 = r2 & 14
            r3 = r3 ^ 6
            r4 = 4
            r5 = 0
            r6 = 1
            if (r3 <= r4) goto L_0x0027
            r3 = r21
            boolean r7 = r1.W(r3)
            if (r7 != 0) goto L_0x002d
            goto L_0x0029
        L_0x0027:
            r3 = r21
        L_0x0029:
            r7 = r2 & 6
            if (r7 != r4) goto L_0x002f
        L_0x002d:
            r4 = r6
            goto L_0x0030
        L_0x002f:
            r4 = r5
        L_0x0030:
            r7 = r2 & 112(0x70, float:1.57E-43)
            r7 = r7 ^ 48
            r8 = 32
            r10 = r22
            if (r7 <= r8) goto L_0x0040
            boolean r7 = r1.W(r10)
            if (r7 != 0) goto L_0x0044
        L_0x0040:
            r7 = r2 & 48
            if (r7 != r8) goto L_0x0046
        L_0x0044:
            r7 = r6
            goto L_0x0047
        L_0x0046:
            r7 = r5
        L_0x0047:
            r4 = r4 | r7
            r7 = r2 & 896(0x380, float:1.256E-42)
            r7 = r7 ^ 384(0x180, float:5.38E-43)
            r8 = 256(0x100, float:3.59E-43)
            if (r7 <= r8) goto L_0x0056
            boolean r7 = r1.W(r0)
            if (r7 != 0) goto L_0x005a
        L_0x0056:
            r7 = r2 & 384(0x180, float:5.38E-43)
            if (r7 != r8) goto L_0x005c
        L_0x005a:
            r7 = r6
            goto L_0x005d
        L_0x005c:
            r7 = r5
        L_0x005d:
            r4 = r4 | r7
            r7 = r2 & 7168(0x1c00, float:1.0045E-41)
            r7 = r7 ^ 3072(0xc00, float:4.305E-42)
            r8 = 2048(0x800, float:2.87E-42)
            r15 = r24
            if (r7 <= r8) goto L_0x006e
            boolean r7 = r1.i(r15)
            if (r7 != 0) goto L_0x0072
        L_0x006e:
            r7 = r2 & 3072(0xc00, float:4.305E-42)
            if (r7 != r8) goto L_0x0074
        L_0x0072:
            r7 = r6
            goto L_0x0075
        L_0x0074:
            r7 = r5
        L_0x0075:
            r4 = r4 | r7
            r7 = 57344(0xe000, float:8.0356E-41)
            r7 = r7 & r2
            r7 = r7 ^ 24576(0x6000, float:3.4438E-41)
            r8 = 16384(0x4000, float:2.2959E-41)
            r14 = r25
            if (r7 <= r8) goto L_0x0088
            boolean r7 = r1.i(r14)
            if (r7 != 0) goto L_0x008c
        L_0x0088:
            r7 = r2 & 24576(0x6000, float:3.4438E-41)
            if (r7 != r8) goto L_0x008e
        L_0x008c:
            r7 = r6
            goto L_0x008f
        L_0x008e:
            r7 = r5
        L_0x008f:
            r4 = r4 | r7
            r13 = r26
            boolean r7 = r1.W(r13)
            r4 = r4 | r7
            r7 = 3670016(0x380000, float:5.142788E-39)
            r7 = r7 & r2
            r8 = 1572864(0x180000, float:2.204052E-39)
            r7 = r7 ^ r8
            r9 = 1048576(0x100000, float:1.469368E-39)
            r12 = r27
            if (r7 <= r9) goto L_0x00a9
            boolean r7 = r1.i(r12)
            if (r7 != 0) goto L_0x00ad
        L_0x00a9:
            r7 = r2 & r8
            if (r7 != r9) goto L_0x00af
        L_0x00ad:
            r7 = r6
            goto L_0x00b0
        L_0x00af:
            r7 = r5
        L_0x00b0:
            r4 = r4 | r7
            r7 = 234881024(0xe000000, float:1.5777218E-30)
            r7 = r7 & r2
            r8 = 100663296(0x6000000, float:2.4074124E-35)
            r7 = r7 ^ r8
            r9 = 67108864(0x4000000, float:1.5046328E-36)
            r11 = r29
            if (r7 <= r9) goto L_0x00c3
            boolean r7 = r1.W(r11)
            if (r7 != 0) goto L_0x00c6
        L_0x00c3:
            r2 = r2 & r8
            if (r2 != r9) goto L_0x00c7
        L_0x00c6:
            r5 = r6
        L_0x00c7:
            r2 = r4 | r5
            java.lang.Object r4 = r30.g()
            if (r2 != 0) goto L_0x00d7
            androidx.compose.runtime.Composer$Companion r2 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r2 = r2.a()
            if (r4 != r2) goto L_0x0108
        L_0x00d7:
            float r2 = r21.a()
            androidx.compose.foundation.layout.CrossAxisAlignment$Companion r4 = androidx.compose.foundation.layout.CrossAxisAlignment.f3867a
            androidx.compose.foundation.layout.CrossAxisAlignment r0 = r4.c(r0)
            float r4 = r22.a()
            androidx.compose.foundation.layout.FlowMeasureLazyPolicy r5 = new androidx.compose.foundation.layout.FlowMeasureLazyPolicy
            r8 = 1
            r20 = 0
            r7 = r5
            r9 = r21
            r10 = r22
            r11 = r2
            r12 = r0
            r13 = r4
            r14 = r27
            r15 = r25
            r16 = r24
            r17 = r26
            r18 = r28
            r19 = r29
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            kotlin.jvm.functions.Function2 r4 = r5.i()
            r1.N(r4)
        L_0x0108:
            kotlin.jvm.functions.Function2 r4 = (kotlin.jvm.functions.Function2) r4
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x0113
            androidx.compose.runtime.ComposerKt.X()
        L_0x0113:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.layout.ContextualFlowLayoutKt.d(androidx.compose.foundation.layout.Arrangement$Horizontal, androidx.compose.foundation.layout.Arrangement$Vertical, androidx.compose.ui.Alignment$Vertical, int, int, androidx.compose.foundation.layout.FlowLayoutOverflowState, int, java.util.List, kotlin.jvm.functions.Function4, androidx.compose.runtime.Composer, int):kotlin.jvm.functions.Function2");
    }
}
