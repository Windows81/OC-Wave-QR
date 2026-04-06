package androidx.compose.ui.graphics.vector;

import kotlin.Metadata;

@Metadata
public final class VectorComposeKt {
    /* JADX WARNING: Removed duplicated region for block: B:108:0x0134  */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x0136  */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x013f  */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x01a0  */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x01b3  */
    /* JADX WARNING: Removed duplicated region for block: B:153:0x01bf  */
    /* JADX WARNING: Removed duplicated region for block: B:154:0x01c3  */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x0227  */
    /* JADX WARNING: Removed duplicated region for block: B:159:0x0234  */
    /* JADX WARNING: Removed duplicated region for block: B:162:0x024b  */
    /* JADX WARNING: Removed duplicated region for block: B:164:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00a0  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00a5  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00be  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00c3  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x00dc  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x00e1  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x00fa  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x0110  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x0118  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x011b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void a(java.lang.String r21, float r22, float r23, float r24, float r25, float r26, float r27, float r28, java.util.List r29, kotlin.jvm.functions.Function2 r30, androidx.compose.runtime.Composer r31, int r32, int r33) {
        /*
            r10 = r30
            r11 = r32
            r12 = r33
            r0 = -213417674(0xfffffffff3478136, float:-1.5806393E31)
            r1 = r31
            androidx.compose.runtime.Composer r1 = r1.q(r0)
            r2 = r12 & 1
            if (r2 == 0) goto L_0x0019
            r3 = r11 | 6
            r4 = r3
            r3 = r21
            goto L_0x002d
        L_0x0019:
            r3 = r11 & 6
            if (r3 != 0) goto L_0x002a
            r3 = r21
            boolean r4 = r1.W(r3)
            if (r4 == 0) goto L_0x0027
            r4 = 4
            goto L_0x0028
        L_0x0027:
            r4 = 2
        L_0x0028:
            r4 = r4 | r11
            goto L_0x002d
        L_0x002a:
            r3 = r21
            r4 = r11
        L_0x002d:
            r5 = r12 & 2
            if (r5 == 0) goto L_0x0036
            r4 = r4 | 48
        L_0x0033:
            r6 = r22
            goto L_0x0048
        L_0x0036:
            r6 = r11 & 48
            if (r6 != 0) goto L_0x0033
            r6 = r22
            boolean r7 = r1.h(r6)
            if (r7 == 0) goto L_0x0045
            r7 = 32
            goto L_0x0047
        L_0x0045:
            r7 = 16
        L_0x0047:
            r4 = r4 | r7
        L_0x0048:
            r7 = r12 & 4
            if (r7 == 0) goto L_0x0051
            r4 = r4 | 384(0x180, float:5.38E-43)
        L_0x004e:
            r8 = r23
            goto L_0x0063
        L_0x0051:
            r8 = r11 & 384(0x180, float:5.38E-43)
            if (r8 != 0) goto L_0x004e
            r8 = r23
            boolean r9 = r1.h(r8)
            if (r9 == 0) goto L_0x0060
            r9 = 256(0x100, float:3.59E-43)
            goto L_0x0062
        L_0x0060:
            r9 = 128(0x80, float:1.794E-43)
        L_0x0062:
            r4 = r4 | r9
        L_0x0063:
            r9 = r12 & 8
            if (r9 == 0) goto L_0x006c
            r4 = r4 | 3072(0xc00, float:4.305E-42)
        L_0x0069:
            r13 = r24
            goto L_0x007e
        L_0x006c:
            r13 = r11 & 3072(0xc00, float:4.305E-42)
            if (r13 != 0) goto L_0x0069
            r13 = r24
            boolean r14 = r1.h(r13)
            if (r14 == 0) goto L_0x007b
            r14 = 2048(0x800, float:2.87E-42)
            goto L_0x007d
        L_0x007b:
            r14 = 1024(0x400, float:1.435E-42)
        L_0x007d:
            r4 = r4 | r14
        L_0x007e:
            r14 = r12 & 16
            if (r14 == 0) goto L_0x0087
            r4 = r4 | 24576(0x6000, float:3.4438E-41)
        L_0x0084:
            r15 = r25
            goto L_0x009a
        L_0x0087:
            r15 = r11 & 24576(0x6000, float:3.4438E-41)
            if (r15 != 0) goto L_0x0084
            r15 = r25
            boolean r16 = r1.h(r15)
            if (r16 == 0) goto L_0x0096
            r16 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0098
        L_0x0096:
            r16 = 8192(0x2000, float:1.14794E-41)
        L_0x0098:
            r4 = r4 | r16
        L_0x009a:
            r16 = r12 & 32
            r17 = 196608(0x30000, float:2.75506E-40)
            if (r16 == 0) goto L_0x00a5
            r4 = r4 | r17
            r0 = r26
            goto L_0x00b8
        L_0x00a5:
            r17 = r11 & r17
            r0 = r26
            if (r17 != 0) goto L_0x00b8
            boolean r18 = r1.h(r0)
            if (r18 == 0) goto L_0x00b4
            r18 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00b6
        L_0x00b4:
            r18 = 65536(0x10000, float:9.18355E-41)
        L_0x00b6:
            r4 = r4 | r18
        L_0x00b8:
            r18 = r12 & 64
            r19 = 1572864(0x180000, float:2.204052E-39)
            if (r18 == 0) goto L_0x00c3
            r4 = r4 | r19
            r0 = r27
            goto L_0x00d6
        L_0x00c3:
            r19 = r11 & r19
            r0 = r27
            if (r19 != 0) goto L_0x00d6
            boolean r19 = r1.h(r0)
            if (r19 == 0) goto L_0x00d2
            r19 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00d4
        L_0x00d2:
            r19 = 524288(0x80000, float:7.34684E-40)
        L_0x00d4:
            r4 = r4 | r19
        L_0x00d6:
            r0 = r12 & 128(0x80, float:1.794E-43)
            r19 = 12582912(0xc00000, float:1.7632415E-38)
            if (r0 == 0) goto L_0x00e1
            r4 = r4 | r19
            r3 = r28
            goto L_0x00f4
        L_0x00e1:
            r19 = r11 & r19
            r3 = r28
            if (r19 != 0) goto L_0x00f4
            boolean r19 = r1.h(r3)
            if (r19 == 0) goto L_0x00f0
            r19 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00f2
        L_0x00f0:
            r19 = 4194304(0x400000, float:5.877472E-39)
        L_0x00f2:
            r4 = r4 | r19
        L_0x00f4:
            r19 = 100663296(0x6000000, float:2.4074124E-35)
            r19 = r11 & r19
            if (r19 != 0) goto L_0x0110
            r3 = r12 & 256(0x100, float:3.59E-43)
            if (r3 != 0) goto L_0x0109
            r3 = r29
            boolean r19 = r1.l(r3)
            if (r19 == 0) goto L_0x010b
            r19 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x010d
        L_0x0109:
            r3 = r29
        L_0x010b:
            r19 = 33554432(0x2000000, float:9.403955E-38)
        L_0x010d:
            r4 = r4 | r19
            goto L_0x0112
        L_0x0110:
            r3 = r29
        L_0x0112:
            r3 = r12 & 512(0x200, float:7.175E-43)
            r19 = 805306368(0x30000000, float:4.656613E-10)
            if (r3 == 0) goto L_0x011b
            r4 = r4 | r19
            goto L_0x012b
        L_0x011b:
            r3 = r11 & r19
            if (r3 != 0) goto L_0x012b
            boolean r3 = r1.l(r10)
            if (r3 == 0) goto L_0x0128
            r3 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x012a
        L_0x0128:
            r3 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x012a:
            r4 = r4 | r3
        L_0x012b:
            r3 = 306783379(0x12492493, float:6.34695E-28)
            r3 = r3 & r4
            r6 = 306783378(0x12492492, float:6.3469493E-28)
            if (r3 == r6) goto L_0x0136
            r3 = 1
            goto L_0x0137
        L_0x0136:
            r3 = 0
        L_0x0137:
            r6 = r4 & 1
            boolean r3 = r1.E(r3, r6)
            if (r3 == 0) goto L_0x0234
            r1.p()
            r3 = r11 & 1
            r6 = -234881025(0xfffffffff1ffffff, float:-2.535301E30)
            if (r3 == 0) goto L_0x0165
            boolean r3 = r1.J()
            if (r3 == 0) goto L_0x0150
            goto L_0x0165
        L_0x0150:
            r1.B()
            r0 = r12 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L_0x0158
            r4 = r4 & r6
        L_0x0158:
            r2 = r21
            r5 = r22
            r7 = r26
            r9 = r27
            r3 = r28
        L_0x0162:
            r0 = r29
            goto L_0x0197
        L_0x0165:
            if (r2 == 0) goto L_0x016a
            java.lang.String r2 = ""
            goto L_0x016c
        L_0x016a:
            r2 = r21
        L_0x016c:
            r3 = 0
            if (r5 == 0) goto L_0x0171
            r5 = r3
            goto L_0x0173
        L_0x0171:
            r5 = r22
        L_0x0173:
            if (r7 == 0) goto L_0x0176
            r8 = r3
        L_0x0176:
            if (r9 == 0) goto L_0x0179
            r13 = r3
        L_0x0179:
            r7 = 1065353216(0x3f800000, float:1.0)
            if (r14 == 0) goto L_0x017e
            r15 = r7
        L_0x017e:
            if (r16 == 0) goto L_0x0181
            goto L_0x0183
        L_0x0181:
            r7 = r26
        L_0x0183:
            if (r18 == 0) goto L_0x0187
            r9 = r3
            goto L_0x0189
        L_0x0187:
            r9 = r27
        L_0x0189:
            if (r0 == 0) goto L_0x018c
            goto L_0x018e
        L_0x018c:
            r3 = r28
        L_0x018e:
            r0 = r12 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L_0x0162
            java.util.List r0 = androidx.compose.ui.graphics.vector.VectorKt.d()
            r4 = r4 & r6
        L_0x0197:
            r1.U()
            boolean r6 = androidx.compose.runtime.ComposerKt.P()
            if (r6 == 0) goto L_0x01a9
            r6 = -1
            java.lang.String r14 = "androidx.compose.ui.graphics.vector.Group (VectorCompose.kt:57)"
            r11 = -213417674(0xfffffffff3478136, float:-1.5806393E31)
            androidx.compose.runtime.ComposerKt.Y(r11, r4, r6, r14)
        L_0x01a9:
            androidx.compose.ui.graphics.vector.VectorComposeKt$Group$1 r6 = androidx.compose.ui.graphics.vector.VectorComposeKt$Group$1.f16624z
            androidx.compose.runtime.Applier r11 = r1.v()
            boolean r11 = r11 instanceof androidx.compose.ui.graphics.vector.VectorApplier
            if (r11 != 0) goto L_0x01b6
            androidx.compose.runtime.ComposablesKt.d()
        L_0x01b6:
            r1.z()
            boolean r11 = r1.n()
            if (r11 == 0) goto L_0x01c3
            r1.y(r6)
            goto L_0x01c6
        L_0x01c3:
            r1.K()
        L_0x01c6:
            androidx.compose.runtime.Composer r6 = androidx.compose.runtime.Updater.b(r1)
            androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$1 r11 = androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$1.f16625z
            androidx.compose.runtime.Updater.g(r6, r2, r11)
            java.lang.Float r11 = java.lang.Float.valueOf(r5)
            androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$2 r14 = androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$2.f16626z
            androidx.compose.runtime.Updater.g(r6, r11, r14)
            java.lang.Float r11 = java.lang.Float.valueOf(r8)
            androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$3 r14 = androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$3.f16627z
            androidx.compose.runtime.Updater.g(r6, r11, r14)
            java.lang.Float r11 = java.lang.Float.valueOf(r13)
            androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$4 r14 = androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$4.f16628z
            androidx.compose.runtime.Updater.g(r6, r11, r14)
            java.lang.Float r11 = java.lang.Float.valueOf(r15)
            androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$5 r14 = androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$5.f16629z
            androidx.compose.runtime.Updater.g(r6, r11, r14)
            java.lang.Float r11 = java.lang.Float.valueOf(r7)
            androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$6 r14 = androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$6.f16630z
            androidx.compose.runtime.Updater.g(r6, r11, r14)
            java.lang.Float r11 = java.lang.Float.valueOf(r9)
            androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$7 r14 = androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$7.f16631z
            androidx.compose.runtime.Updater.g(r6, r11, r14)
            java.lang.Float r11 = java.lang.Float.valueOf(r3)
            androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$8 r14 = androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$8.f16632z
            androidx.compose.runtime.Updater.g(r6, r11, r14)
            androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$9 r11 = androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$9.f16633z
            androidx.compose.runtime.Updater.g(r6, r0, r11)
            int r4 = r4 >> 27
            r4 = r4 & 14
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r10.m(r1, r4)
            r1.T()
            boolean r4 = androidx.compose.runtime.ComposerKt.P()
            if (r4 == 0) goto L_0x022a
            androidx.compose.runtime.ComposerKt.X()
        L_0x022a:
            r6 = r7
            r7 = r9
            r4 = r13
            r9 = r0
            r20 = r8
            r8 = r3
            r3 = r20
            goto L_0x0245
        L_0x0234:
            r1.B()
            r2 = r21
            r5 = r22
            r6 = r26
            r7 = r27
            r9 = r29
            r3 = r8
            r4 = r13
            r8 = r28
        L_0x0245:
            androidx.compose.runtime.ScopeUpdateScope r13 = r1.x()
            if (r13 == 0) goto L_0x025d
            androidx.compose.ui.graphics.vector.VectorComposeKt$Group$4 r14 = new androidx.compose.ui.graphics.vector.VectorComposeKt$Group$4
            r0 = r14
            r1 = r2
            r2 = r5
            r5 = r15
            r10 = r30
            r11 = r32
            r12 = r33
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            r13.a(r14)
        L_0x025d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.graphics.vector.VectorComposeKt.a(java.lang.String, float, float, float, float, float, float, float, java.util.List, kotlin.jvm.functions.Function2, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:107:0x0135  */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x013a  */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x0154  */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x0159  */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x0171  */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x0176  */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x018d  */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x0192  */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x01b3  */
    /* JADX WARNING: Removed duplicated region for block: B:153:0x01b5  */
    /* JADX WARNING: Removed duplicated region for block: B:156:0x01be  */
    /* JADX WARNING: Removed duplicated region for block: B:209:0x02d6  */
    /* JADX WARNING: Removed duplicated region for block: B:212:0x02f9  */
    /* JADX WARNING: Removed duplicated region for block: B:214:? A[RETURN, SYNTHETIC] */
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
    /* JADX WARNING: Removed duplicated region for block: B:78:0x00e2  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x00fb  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0100  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x0119  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x011e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void b(java.util.List r31, int r32, java.lang.String r33, androidx.compose.ui.graphics.Brush r34, float r35, androidx.compose.ui.graphics.Brush r36, float r37, float r38, int r39, int r40, float r41, float r42, float r43, float r44, androidx.compose.runtime.Composer r45, int r46, int r47, int r48) {
        /*
            r1 = r31
            r15 = r46
            r14 = r47
            r13 = r48
            r0 = -1478270750(0xffffffffa7e360e2, float:-6.3110197E-15)
            r2 = r45
            androidx.compose.runtime.Composer r2 = r2.q(r0)
            r3 = r13 & 1
            if (r3 == 0) goto L_0x0018
            r3 = r15 | 6
            goto L_0x0028
        L_0x0018:
            r3 = r15 & 6
            if (r3 != 0) goto L_0x0027
            boolean r3 = r2.l(r1)
            if (r3 == 0) goto L_0x0024
            r3 = 4
            goto L_0x0025
        L_0x0024:
            r3 = 2
        L_0x0025:
            r3 = r3 | r15
            goto L_0x0028
        L_0x0027:
            r3 = r15
        L_0x0028:
            r6 = r13 & 2
            if (r6 == 0) goto L_0x0031
            r3 = r3 | 48
        L_0x002e:
            r9 = r32
            goto L_0x0043
        L_0x0031:
            r9 = r15 & 48
            if (r9 != 0) goto L_0x002e
            r9 = r32
            boolean r10 = r2.i(r9)
            if (r10 == 0) goto L_0x0040
            r10 = 32
            goto L_0x0042
        L_0x0040:
            r10 = 16
        L_0x0042:
            r3 = r3 | r10
        L_0x0043:
            r10 = r13 & 4
            if (r10 == 0) goto L_0x004c
            r3 = r3 | 384(0x180, float:5.38E-43)
        L_0x0049:
            r4 = r33
            goto L_0x005f
        L_0x004c:
            r4 = r15 & 384(0x180, float:5.38E-43)
            if (r4 != 0) goto L_0x0049
            r4 = r33
            boolean r16 = r2.W(r4)
            if (r16 == 0) goto L_0x005b
            r16 = 256(0x100, float:3.59E-43)
            goto L_0x005d
        L_0x005b:
            r16 = 128(0x80, float:1.794E-43)
        L_0x005d:
            r3 = r3 | r16
        L_0x005f:
            r16 = r13 & 8
            r17 = 1024(0x400, float:1.435E-42)
            r18 = 2048(0x800, float:2.87E-42)
            if (r16 == 0) goto L_0x006c
            r3 = r3 | 3072(0xc00, float:4.305E-42)
        L_0x0069:
            r5 = r34
            goto L_0x007f
        L_0x006c:
            r5 = r15 & 3072(0xc00, float:4.305E-42)
            if (r5 != 0) goto L_0x0069
            r5 = r34
            boolean r20 = r2.W(r5)
            if (r20 == 0) goto L_0x007b
            r20 = r18
            goto L_0x007d
        L_0x007b:
            r20 = r17
        L_0x007d:
            r3 = r3 | r20
        L_0x007f:
            r20 = r13 & 16
            if (r20 == 0) goto L_0x0088
            r3 = r3 | 24576(0x6000, float:3.4438E-41)
        L_0x0085:
            r7 = r35
            goto L_0x009b
        L_0x0088:
            r7 = r15 & 24576(0x6000, float:3.4438E-41)
            if (r7 != 0) goto L_0x0085
            r7 = r35
            boolean r22 = r2.h(r7)
            if (r22 == 0) goto L_0x0097
            r22 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0099
        L_0x0097:
            r22 = 8192(0x2000, float:1.14794E-41)
        L_0x0099:
            r3 = r3 | r22
        L_0x009b:
            r22 = r13 & 32
            r23 = 196608(0x30000, float:2.75506E-40)
            if (r22 == 0) goto L_0x00a6
            r3 = r3 | r23
            r8 = r36
            goto L_0x00b9
        L_0x00a6:
            r23 = r15 & r23
            r8 = r36
            if (r23 != 0) goto L_0x00b9
            boolean r24 = r2.W(r8)
            if (r24 == 0) goto L_0x00b5
            r24 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00b7
        L_0x00b5:
            r24 = 65536(0x10000, float:9.18355E-41)
        L_0x00b7:
            r3 = r3 | r24
        L_0x00b9:
            r24 = r13 & 64
            r25 = 1572864(0x180000, float:2.204052E-39)
            if (r24 == 0) goto L_0x00c4
            r3 = r3 | r25
            r11 = r37
            goto L_0x00d7
        L_0x00c4:
            r25 = r15 & r25
            r11 = r37
            if (r25 != 0) goto L_0x00d7
            boolean r26 = r2.h(r11)
            if (r26 == 0) goto L_0x00d3
            r26 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00d5
        L_0x00d3:
            r26 = 524288(0x80000, float:7.34684E-40)
        L_0x00d5:
            r3 = r3 | r26
        L_0x00d7:
            r12 = r13 & 128(0x80, float:1.794E-43)
            r27 = 12582912(0xc00000, float:1.7632415E-38)
            if (r12 == 0) goto L_0x00e2
            r3 = r3 | r27
            r0 = r38
            goto L_0x00f5
        L_0x00e2:
            r27 = r15 & r27
            r0 = r38
            if (r27 != 0) goto L_0x00f5
            boolean r28 = r2.h(r0)
            if (r28 == 0) goto L_0x00f1
            r28 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00f3
        L_0x00f1:
            r28 = 4194304(0x400000, float:5.877472E-39)
        L_0x00f3:
            r3 = r3 | r28
        L_0x00f5:
            r0 = r13 & 256(0x100, float:3.59E-43)
            r28 = 100663296(0x6000000, float:2.4074124E-35)
            if (r0 == 0) goto L_0x0100
            r3 = r3 | r28
            r4 = r39
            goto L_0x0113
        L_0x0100:
            r28 = r15 & r28
            r4 = r39
            if (r28 != 0) goto L_0x0113
            boolean r28 = r2.i(r4)
            if (r28 == 0) goto L_0x010f
            r28 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x0111
        L_0x010f:
            r28 = 33554432(0x2000000, float:9.403955E-38)
        L_0x0111:
            r3 = r3 | r28
        L_0x0113:
            r4 = r13 & 512(0x200, float:7.175E-43)
            r28 = 805306368(0x30000000, float:4.656613E-10)
            if (r4 == 0) goto L_0x011e
            r3 = r3 | r28
            r5 = r40
            goto L_0x0131
        L_0x011e:
            r28 = r15 & r28
            r5 = r40
            if (r28 != 0) goto L_0x0131
            boolean r28 = r2.i(r5)
            if (r28 == 0) goto L_0x012d
            r28 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x012f
        L_0x012d:
            r28 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x012f:
            r3 = r3 | r28
        L_0x0131:
            r5 = r13 & 1024(0x400, float:1.435E-42)
            if (r5 == 0) goto L_0x013a
            r19 = r14 | 6
            r7 = r41
            goto L_0x0150
        L_0x013a:
            r28 = r14 & 6
            r7 = r41
            if (r28 != 0) goto L_0x014e
            boolean r28 = r2.h(r7)
            if (r28 == 0) goto L_0x0149
            r19 = 4
            goto L_0x014b
        L_0x0149:
            r19 = 2
        L_0x014b:
            r19 = r14 | r19
            goto L_0x0150
        L_0x014e:
            r19 = r14
        L_0x0150:
            r7 = r13 & 2048(0x800, float:2.87E-42)
            if (r7 == 0) goto L_0x0159
            r19 = r19 | 48
        L_0x0156:
            r8 = r19
            goto L_0x016d
        L_0x0159:
            r28 = r14 & 48
            r8 = r42
            if (r28 != 0) goto L_0x0156
            boolean r28 = r2.h(r8)
            if (r28 == 0) goto L_0x0168
            r21 = 32
            goto L_0x016a
        L_0x0168:
            r21 = 16
        L_0x016a:
            r19 = r19 | r21
            goto L_0x0156
        L_0x016d:
            r9 = r13 & 4096(0x1000, float:5.74E-42)
            if (r9 == 0) goto L_0x0176
            r8 = r8 | 384(0x180, float:5.38E-43)
        L_0x0173:
            r11 = r43
            goto L_0x0189
        L_0x0176:
            r11 = r14 & 384(0x180, float:5.38E-43)
            if (r11 != 0) goto L_0x0173
            r11 = r43
            boolean r19 = r2.h(r11)
            if (r19 == 0) goto L_0x0185
            r25 = 256(0x100, float:3.59E-43)
            goto L_0x0187
        L_0x0185:
            r25 = 128(0x80, float:1.794E-43)
        L_0x0187:
            r8 = r8 | r25
        L_0x0189:
            r11 = r13 & 8192(0x2000, float:1.14794E-41)
            if (r11 == 0) goto L_0x0192
            r8 = r8 | 3072(0xc00, float:4.305E-42)
        L_0x018f:
            r13 = r44
            goto L_0x01a2
        L_0x0192:
            r13 = r14 & 3072(0xc00, float:4.305E-42)
            if (r13 != 0) goto L_0x018f
            r13 = r44
            boolean r19 = r2.h(r13)
            if (r19 == 0) goto L_0x01a0
            r17 = r18
        L_0x01a0:
            r8 = r8 | r17
        L_0x01a2:
            r17 = 306783379(0x12492493, float:6.34695E-28)
            r13 = r3 & r17
            r14 = 306783378(0x12492492, float:6.3469493E-28)
            if (r13 != r14) goto L_0x01b5
            r13 = r8 & 1171(0x493, float:1.641E-42)
            r14 = 1170(0x492, float:1.64E-42)
            if (r13 == r14) goto L_0x01b3
            goto L_0x01b5
        L_0x01b3:
            r13 = 0
            goto L_0x01b6
        L_0x01b5:
            r13 = 1
        L_0x01b6:
            r14 = r3 & 1
            boolean r13 = r2.E(r13, r14)
            if (r13 == 0) goto L_0x02d6
            if (r6 == 0) goto L_0x01c5
            int r6 = androidx.compose.ui.graphics.vector.VectorKt.a()
            goto L_0x01c7
        L_0x01c5:
            r6 = r32
        L_0x01c7:
            if (r10 == 0) goto L_0x01cc
            java.lang.String r10 = ""
            goto L_0x01ce
        L_0x01cc:
            r10 = r33
        L_0x01ce:
            if (r16 == 0) goto L_0x01d2
            r13 = 0
            goto L_0x01d4
        L_0x01d2:
            r13 = r34
        L_0x01d4:
            if (r20 == 0) goto L_0x01d9
            r16 = 1065353216(0x3f800000, float:1.0)
            goto L_0x01db
        L_0x01d9:
            r16 = r35
        L_0x01db:
            if (r22 == 0) goto L_0x01e2
            r17 = 0
            r14 = r17
            goto L_0x01e4
        L_0x01e2:
            r14 = r36
        L_0x01e4:
            if (r24 == 0) goto L_0x01e9
            r17 = 1065353216(0x3f800000, float:1.0)
            goto L_0x01eb
        L_0x01e9:
            r17 = r37
        L_0x01eb:
            r18 = 0
            if (r12 == 0) goto L_0x01f2
            r12 = r18
            goto L_0x01f4
        L_0x01f2:
            r12 = r38
        L_0x01f4:
            if (r0 == 0) goto L_0x01fb
            int r0 = androidx.compose.ui.graphics.vector.VectorKt.b()
            goto L_0x01fd
        L_0x01fb:
            r0 = r39
        L_0x01fd:
            if (r4 == 0) goto L_0x0204
            int r4 = androidx.compose.ui.graphics.vector.VectorKt.c()
            goto L_0x0206
        L_0x0204:
            r4 = r40
        L_0x0206:
            if (r5 == 0) goto L_0x020b
            r5 = 1082130432(0x40800000, float:4.0)
            goto L_0x020d
        L_0x020b:
            r5 = r41
        L_0x020d:
            if (r7 == 0) goto L_0x0212
            r7 = r18
            goto L_0x0214
        L_0x0212:
            r7 = r42
        L_0x0214:
            if (r9 == 0) goto L_0x0219
            r9 = 1065353216(0x3f800000, float:1.0)
            goto L_0x021b
        L_0x0219:
            r9 = r43
        L_0x021b:
            if (r11 == 0) goto L_0x021e
            goto L_0x0220
        L_0x021e:
            r18 = r44
        L_0x0220:
            boolean r11 = androidx.compose.runtime.ComposerKt.P()
            if (r11 == 0) goto L_0x022e
            java.lang.String r11 = "androidx.compose.ui.graphics.vector.Path (VectorCompose.kt:114)"
            r15 = -1478270750(0xffffffffa7e360e2, float:-6.3110197E-15)
            androidx.compose.runtime.ComposerKt.Y(r15, r3, r8, r11)
        L_0x022e:
            androidx.compose.ui.graphics.vector.VectorComposeKt$Path$1 r3 = androidx.compose.ui.graphics.vector.VectorComposeKt$Path$1.f16637z
            androidx.compose.runtime.Applier r8 = r2.v()
            boolean r8 = r8 instanceof androidx.compose.ui.graphics.vector.VectorApplier
            if (r8 != 0) goto L_0x023b
            androidx.compose.runtime.ComposablesKt.d()
        L_0x023b:
            r2.z()
            boolean r8 = r2.n()
            if (r8 == 0) goto L_0x0248
            r2.y(r3)
            goto L_0x024b
        L_0x0248:
            r2.K()
        L_0x024b:
            androidx.compose.runtime.Composer r3 = androidx.compose.runtime.Updater.b(r2)
            androidx.compose.ui.graphics.vector.VectorComposeKt$Path$2$1 r8 = androidx.compose.ui.graphics.vector.VectorComposeKt$Path$2$1.f16638z
            androidx.compose.runtime.Updater.g(r3, r10, r8)
            androidx.compose.ui.graphics.vector.VectorComposeKt$Path$2$2 r8 = androidx.compose.ui.graphics.vector.VectorComposeKt$Path$2$2.f16644z
            androidx.compose.runtime.Updater.g(r3, r1, r8)
            androidx.compose.ui.graphics.PathFillType r8 = androidx.compose.ui.graphics.PathFillType.c(r6)
            androidx.compose.ui.graphics.vector.VectorComposeKt$Path$2$3 r11 = androidx.compose.ui.graphics.vector.VectorComposeKt$Path$2$3.f16645z
            androidx.compose.runtime.Updater.g(r3, r8, r11)
            androidx.compose.ui.graphics.vector.VectorComposeKt$Path$2$4 r8 = androidx.compose.ui.graphics.vector.VectorComposeKt$Path$2$4.f16646z
            androidx.compose.runtime.Updater.g(r3, r13, r8)
            java.lang.Float r8 = java.lang.Float.valueOf(r16)
            androidx.compose.ui.graphics.vector.VectorComposeKt$Path$2$5 r11 = androidx.compose.ui.graphics.vector.VectorComposeKt$Path$2$5.f16647z
            androidx.compose.runtime.Updater.g(r3, r8, r11)
            androidx.compose.ui.graphics.vector.VectorComposeKt$Path$2$6 r8 = androidx.compose.ui.graphics.vector.VectorComposeKt$Path$2$6.f16648z
            androidx.compose.runtime.Updater.g(r3, r14, r8)
            java.lang.Float r8 = java.lang.Float.valueOf(r17)
            androidx.compose.ui.graphics.vector.VectorComposeKt$Path$2$7 r11 = androidx.compose.ui.graphics.vector.VectorComposeKt$Path$2$7.f16649z
            androidx.compose.runtime.Updater.g(r3, r8, r11)
            java.lang.Float r8 = java.lang.Float.valueOf(r12)
            androidx.compose.ui.graphics.vector.VectorComposeKt$Path$2$8 r11 = androidx.compose.ui.graphics.vector.VectorComposeKt$Path$2$8.f16650z
            androidx.compose.runtime.Updater.g(r3, r8, r11)
            androidx.compose.ui.graphics.StrokeJoin r8 = androidx.compose.ui.graphics.StrokeJoin.d(r4)
            androidx.compose.ui.graphics.vector.VectorComposeKt$Path$2$9 r11 = androidx.compose.ui.graphics.vector.VectorComposeKt$Path$2$9.f16651z
            androidx.compose.runtime.Updater.g(r3, r8, r11)
            androidx.compose.ui.graphics.StrokeCap r8 = androidx.compose.ui.graphics.StrokeCap.d(r0)
            androidx.compose.ui.graphics.vector.VectorComposeKt$Path$2$10 r11 = androidx.compose.ui.graphics.vector.VectorComposeKt$Path$2$10.f16639z
            androidx.compose.runtime.Updater.g(r3, r8, r11)
            java.lang.Float r8 = java.lang.Float.valueOf(r5)
            androidx.compose.ui.graphics.vector.VectorComposeKt$Path$2$11 r11 = androidx.compose.ui.graphics.vector.VectorComposeKt$Path$2$11.f16640z
            androidx.compose.runtime.Updater.g(r3, r8, r11)
            java.lang.Float r8 = java.lang.Float.valueOf(r7)
            androidx.compose.ui.graphics.vector.VectorComposeKt$Path$2$12 r11 = androidx.compose.ui.graphics.vector.VectorComposeKt$Path$2$12.f16641z
            androidx.compose.runtime.Updater.g(r3, r8, r11)
            java.lang.Float r8 = java.lang.Float.valueOf(r9)
            androidx.compose.ui.graphics.vector.VectorComposeKt$Path$2$13 r11 = androidx.compose.ui.graphics.vector.VectorComposeKt$Path$2$13.f16642z
            androidx.compose.runtime.Updater.g(r3, r8, r11)
            java.lang.Float r8 = java.lang.Float.valueOf(r18)
            androidx.compose.ui.graphics.vector.VectorComposeKt$Path$2$14 r11 = androidx.compose.ui.graphics.vector.VectorComposeKt$Path$2$14.f16643z
            androidx.compose.runtime.Updater.g(r3, r8, r11)
            r2.T()
            boolean r3 = androidx.compose.runtime.ComposerKt.P()
            if (r3 == 0) goto L_0x02c9
            androidx.compose.runtime.ComposerKt.X()
        L_0x02c9:
            r11 = r5
            r3 = r10
            r8 = r12
            r5 = r16
            r10 = r4
            r12 = r7
            r4 = r13
            r7 = r17
            r13 = r9
            r9 = r0
            goto L_0x02f3
        L_0x02d6:
            r2.B()
            r6 = r32
            r3 = r33
            r4 = r34
            r5 = r35
            r14 = r36
            r7 = r37
            r8 = r38
            r9 = r39
            r10 = r40
            r11 = r41
            r12 = r42
            r13 = r43
            r18 = r44
        L_0x02f3:
            androidx.compose.runtime.ScopeUpdateScope r15 = r2.x()
            if (r15 == 0) goto L_0x0316
            androidx.compose.ui.graphics.vector.VectorComposeKt$Path$3 r2 = new androidx.compose.ui.graphics.vector.VectorComposeKt$Path$3
            r0 = r2
            r1 = r31
            r29 = r2
            r2 = r6
            r6 = r14
            r14 = r18
            r30 = r15
            r15 = r46
            r16 = r47
            r17 = r48
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            r1 = r29
            r0 = r30
            r0.a(r1)
        L_0x0316:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.graphics.vector.VectorComposeKt.b(java.util.List, int, java.lang.String, androidx.compose.ui.graphics.Brush, float, androidx.compose.ui.graphics.Brush, float, float, int, int, float, float, float, float, androidx.compose.runtime.Composer, int, int, int):void");
    }
}
