package androidx.compose.foundation;

import kotlin.Metadata;

@Metadata
public final class BasicTooltip_androidKt {
    /* JADX WARNING: Removed duplicated region for block: B:101:0x0131  */
    /* JADX WARNING: Removed duplicated region for block: B:103:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x009f  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00b6  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00ba  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x00d7  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x00da  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x00e3  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x0126  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final /* synthetic */ void a(androidx.compose.ui.window.PopupPositionProvider r20, kotlin.jvm.functions.Function2 r21, androidx.compose.foundation.BasicTooltipState r22, androidx.compose.ui.Modifier r23, boolean r24, boolean r25, kotlin.jvm.functions.Function2 r26, androidx.compose.runtime.Composer r27, int r28, int r29) {
        /*
            r8 = r28
            r0 = -2005652140(0xffffffff88742d54, float:-7.347936E-34)
            r1 = r27
            androidx.compose.runtime.Composer r1 = r1.q(r0)
            r2 = r29 & 1
            if (r2 == 0) goto L_0x0015
            r2 = r8 | 6
            r3 = r2
            r2 = r20
            goto L_0x0029
        L_0x0015:
            r2 = r8 & 6
            if (r2 != 0) goto L_0x0026
            r2 = r20
            boolean r3 = r1.W(r2)
            if (r3 == 0) goto L_0x0023
            r3 = 4
            goto L_0x0024
        L_0x0023:
            r3 = 2
        L_0x0024:
            r3 = r3 | r8
            goto L_0x0029
        L_0x0026:
            r2 = r20
            r3 = r8
        L_0x0029:
            r4 = r29 & 2
            if (r4 == 0) goto L_0x0032
            r3 = r3 | 48
        L_0x002f:
            r4 = r21
            goto L_0x0044
        L_0x0032:
            r4 = r8 & 48
            if (r4 != 0) goto L_0x002f
            r4 = r21
            boolean r5 = r1.l(r4)
            if (r5 == 0) goto L_0x0041
            r5 = 32
            goto L_0x0043
        L_0x0041:
            r5 = 16
        L_0x0043:
            r3 = r3 | r5
        L_0x0044:
            r5 = r29 & 4
            if (r5 == 0) goto L_0x004d
            r3 = r3 | 384(0x180, float:5.38E-43)
        L_0x004a:
            r5 = r22
            goto L_0x005f
        L_0x004d:
            r5 = r8 & 384(0x180, float:5.38E-43)
            if (r5 != 0) goto L_0x004a
            r5 = r22
            boolean r6 = r1.W(r5)
            if (r6 == 0) goto L_0x005c
            r6 = 256(0x100, float:3.59E-43)
            goto L_0x005e
        L_0x005c:
            r6 = 128(0x80, float:1.794E-43)
        L_0x005e:
            r3 = r3 | r6
        L_0x005f:
            r6 = r29 & 8
            if (r6 == 0) goto L_0x0068
            r3 = r3 | 3072(0xc00, float:4.305E-42)
        L_0x0065:
            r7 = r23
            goto L_0x007a
        L_0x0068:
            r7 = r8 & 3072(0xc00, float:4.305E-42)
            if (r7 != 0) goto L_0x0065
            r7 = r23
            boolean r9 = r1.W(r7)
            if (r9 == 0) goto L_0x0077
            r9 = 2048(0x800, float:2.87E-42)
            goto L_0x0079
        L_0x0077:
            r9 = 1024(0x400, float:1.435E-42)
        L_0x0079:
            r3 = r3 | r9
        L_0x007a:
            r9 = r29 & 16
            if (r9 == 0) goto L_0x0083
            r3 = r3 | 24576(0x6000, float:3.4438E-41)
        L_0x0080:
            r10 = r24
            goto L_0x0095
        L_0x0083:
            r10 = r8 & 24576(0x6000, float:3.4438E-41)
            if (r10 != 0) goto L_0x0080
            r10 = r24
            boolean r11 = r1.d(r10)
            if (r11 == 0) goto L_0x0092
            r11 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0094
        L_0x0092:
            r11 = 8192(0x2000, float:1.14794E-41)
        L_0x0094:
            r3 = r3 | r11
        L_0x0095:
            r11 = r29 & 32
            r12 = 196608(0x30000, float:2.75506E-40)
            if (r11 == 0) goto L_0x009f
            r3 = r3 | r12
        L_0x009c:
            r12 = r25
            goto L_0x00b0
        L_0x009f:
            r12 = r12 & r8
            if (r12 != 0) goto L_0x009c
            r12 = r25
            boolean r13 = r1.d(r12)
            if (r13 == 0) goto L_0x00ad
            r13 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00af
        L_0x00ad:
            r13 = 65536(0x10000, float:9.18355E-41)
        L_0x00af:
            r3 = r3 | r13
        L_0x00b0:
            r13 = r29 & 64
            r14 = 1572864(0x180000, float:2.204052E-39)
            if (r13 == 0) goto L_0x00ba
            r3 = r3 | r14
            r15 = r26
            goto L_0x00cc
        L_0x00ba:
            r13 = r8 & r14
            r15 = r26
            if (r13 != 0) goto L_0x00cc
            boolean r13 = r1.l(r15)
            if (r13 == 0) goto L_0x00c9
            r13 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00cb
        L_0x00c9:
            r13 = 524288(0x80000, float:7.34684E-40)
        L_0x00cb:
            r3 = r3 | r13
        L_0x00cc:
            r13 = 599187(0x92493, float:8.3964E-40)
            r13 = r13 & r3
            r14 = 599186(0x92492, float:8.39638E-40)
            r16 = 1
            if (r13 == r14) goto L_0x00da
            r13 = r16
            goto L_0x00db
        L_0x00da:
            r13 = 0
        L_0x00db:
            r14 = r3 & 1
            boolean r13 = r1.E(r13, r14)
            if (r13 == 0) goto L_0x0126
            if (r6 == 0) goto L_0x00e8
            androidx.compose.ui.Modifier$Companion r6 = androidx.compose.ui.Modifier.f15489d
            goto L_0x00e9
        L_0x00e8:
            r6 = r7
        L_0x00e9:
            if (r9 == 0) goto L_0x00ee
            r7 = r16
            goto L_0x00ef
        L_0x00ee:
            r7 = r10
        L_0x00ef:
            if (r11 == 0) goto L_0x00f4
            r19 = r16
            goto L_0x00f6
        L_0x00f4:
            r19 = r12
        L_0x00f6:
            boolean r9 = androidx.compose.runtime.ComposerKt.P()
            if (r9 == 0) goto L_0x0102
            r9 = -1
            java.lang.String r10 = "androidx.compose.foundation.BasicTooltipBoxAndroid (BasicTooltip.android.kt:61)"
            androidx.compose.runtime.ComposerKt.Y(r0, r3, r9, r10)
        L_0x0102:
            r0 = 4194302(0x3ffffe, float:5.877469E-39)
            r17 = r3 & r0
            r18 = 0
            r9 = r20
            r10 = r21
            r11 = r22
            r12 = r6
            r13 = r7
            r14 = r19
            r15 = r26
            r16 = r1
            androidx.compose.foundation.BasicTooltipKt.a(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x0123
            androidx.compose.runtime.ComposerKt.X()
        L_0x0123:
            r12 = r19
            goto L_0x012b
        L_0x0126:
            r1.B()
            r6 = r7
            r7 = r10
        L_0x012b:
            androidx.compose.runtime.ScopeUpdateScope r10 = r1.x()
            if (r10 == 0) goto L_0x0149
            androidx.compose.foundation.BasicTooltip_androidKt$BasicTooltipBoxAndroid$1 r11 = new androidx.compose.foundation.BasicTooltip_androidKt$BasicTooltipBoxAndroid$1
            r0 = r11
            r1 = r20
            r2 = r21
            r3 = r22
            r4 = r6
            r5 = r7
            r6 = r12
            r7 = r26
            r8 = r28
            r9 = r29
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r10.a(r11)
        L_0x0149:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.BasicTooltip_androidKt.a(androidx.compose.ui.window.PopupPositionProvider, kotlin.jvm.functions.Function2, androidx.compose.foundation.BasicTooltipState, androidx.compose.ui.Modifier, boolean, boolean, kotlin.jvm.functions.Function2, androidx.compose.runtime.Composer, int, int):void");
    }
}
