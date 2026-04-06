package androidx.compose.foundation.text;

import kotlin.Metadata;

@Metadata
public final class ClickableTextKt {
    /* JADX WARNING: Removed duplicated region for block: B:134:0x01df  */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x01ef  */
    /* JADX WARNING: Removed duplicated region for block: B:139:? A[RETURN, SYNTHETIC] */
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
    /* JADX WARNING: Removed duplicated region for block: B:78:0x00df  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x00fc  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x00ff  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0109  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void a(androidx.compose.ui.text.AnnotatedString r26, androidx.compose.ui.Modifier r27, androidx.compose.ui.text.TextStyle r28, boolean r29, int r30, int r31, kotlin.jvm.functions.Function1 r32, kotlin.jvm.functions.Function1 r33, androidx.compose.runtime.Composer r34, int r35, int r36) {
        /*
            r8 = r33
            r9 = r35
            r10 = r36
            r0 = -246609449(0xfffffffff14d09d7, float:-1.0153012E30)
            r1 = r34
            androidx.compose.runtime.Composer r1 = r1.q(r0)
            r2 = r10 & 1
            if (r2 == 0) goto L_0x0019
            r2 = r9 | 6
            r4 = r2
            r2 = r26
            goto L_0x002d
        L_0x0019:
            r2 = r9 & 6
            if (r2 != 0) goto L_0x002a
            r2 = r26
            boolean r4 = r1.W(r2)
            if (r4 == 0) goto L_0x0027
            r4 = 4
            goto L_0x0028
        L_0x0027:
            r4 = 2
        L_0x0028:
            r4 = r4 | r9
            goto L_0x002d
        L_0x002a:
            r2 = r26
            r4 = r9
        L_0x002d:
            r5 = r10 & 2
            if (r5 == 0) goto L_0x0036
            r4 = r4 | 48
        L_0x0033:
            r6 = r27
            goto L_0x0048
        L_0x0036:
            r6 = r9 & 48
            if (r6 != 0) goto L_0x0033
            r6 = r27
            boolean r7 = r1.W(r6)
            if (r7 == 0) goto L_0x0045
            r7 = 32
            goto L_0x0047
        L_0x0045:
            r7 = 16
        L_0x0047:
            r4 = r4 | r7
        L_0x0048:
            r7 = r10 & 4
            if (r7 == 0) goto L_0x0051
            r4 = r4 | 384(0x180, float:5.38E-43)
        L_0x004e:
            r11 = r28
            goto L_0x0063
        L_0x0051:
            r11 = r9 & 384(0x180, float:5.38E-43)
            if (r11 != 0) goto L_0x004e
            r11 = r28
            boolean r12 = r1.W(r11)
            if (r12 == 0) goto L_0x0060
            r12 = 256(0x100, float:3.59E-43)
            goto L_0x0062
        L_0x0060:
            r12 = 128(0x80, float:1.794E-43)
        L_0x0062:
            r4 = r4 | r12
        L_0x0063:
            r12 = r10 & 8
            if (r12 == 0) goto L_0x006c
            r4 = r4 | 3072(0xc00, float:4.305E-42)
        L_0x0069:
            r13 = r29
            goto L_0x007e
        L_0x006c:
            r13 = r9 & 3072(0xc00, float:4.305E-42)
            if (r13 != 0) goto L_0x0069
            r13 = r29
            boolean r14 = r1.d(r13)
            if (r14 == 0) goto L_0x007b
            r14 = 2048(0x800, float:2.87E-42)
            goto L_0x007d
        L_0x007b:
            r14 = 1024(0x400, float:1.435E-42)
        L_0x007d:
            r4 = r4 | r14
        L_0x007e:
            r14 = r10 & 16
            if (r14 == 0) goto L_0x0087
            r4 = r4 | 24576(0x6000, float:3.4438E-41)
        L_0x0084:
            r15 = r30
            goto L_0x009a
        L_0x0087:
            r15 = r9 & 24576(0x6000, float:3.4438E-41)
            if (r15 != 0) goto L_0x0084
            r15 = r30
            boolean r16 = r1.i(r15)
            if (r16 == 0) goto L_0x0096
            r16 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0098
        L_0x0096:
            r16 = 8192(0x2000, float:1.14794E-41)
        L_0x0098:
            r4 = r4 | r16
        L_0x009a:
            r16 = r10 & 32
            r17 = 196608(0x30000, float:2.75506E-40)
            if (r16 == 0) goto L_0x00a5
            r4 = r4 | r17
            r3 = r31
            goto L_0x00b8
        L_0x00a5:
            r17 = r9 & r17
            r3 = r31
            if (r17 != 0) goto L_0x00b8
            boolean r17 = r1.i(r3)
            if (r17 == 0) goto L_0x00b4
            r17 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00b6
        L_0x00b4:
            r17 = 65536(0x10000, float:9.18355E-41)
        L_0x00b6:
            r4 = r4 | r17
        L_0x00b8:
            r17 = r10 & 64
            r19 = 1572864(0x180000, float:2.204052E-39)
            if (r17 == 0) goto L_0x00c3
            r4 = r4 | r19
            r0 = r32
            goto L_0x00d6
        L_0x00c3:
            r19 = r9 & r19
            r0 = r32
            if (r19 != 0) goto L_0x00d6
            boolean r20 = r1.l(r0)
            if (r20 == 0) goto L_0x00d2
            r20 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00d4
        L_0x00d2:
            r20 = 524288(0x80000, float:7.34684E-40)
        L_0x00d4:
            r4 = r4 | r20
        L_0x00d6:
            r0 = r10 & 128(0x80, float:1.794E-43)
            r20 = 12582912(0xc00000, float:1.7632415E-38)
            if (r0 == 0) goto L_0x00df
            r4 = r4 | r20
            goto L_0x00ef
        L_0x00df:
            r0 = r9 & r20
            if (r0 != 0) goto L_0x00ef
            boolean r0 = r1.l(r8)
            if (r0 == 0) goto L_0x00ec
            r0 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00ee
        L_0x00ec:
            r0 = 4194304(0x400000, float:5.877472E-39)
        L_0x00ee:
            r4 = r4 | r0
        L_0x00ef:
            r0 = 4793491(0x492493, float:6.717112E-39)
            r0 = r0 & r4
            r2 = 4793490(0x492492, float:6.71711E-39)
            r21 = 0
            r22 = 1
            if (r0 == r2) goto L_0x00ff
            r0 = r22
            goto L_0x0101
        L_0x00ff:
            r0 = r21
        L_0x0101:
            r2 = r4 & 1
            boolean r0 = r1.E(r0, r2)
            if (r0 == 0) goto L_0x01df
            if (r5 == 0) goto L_0x010e
            androidx.compose.ui.Modifier$Companion r0 = androidx.compose.ui.Modifier.f15489d
            r6 = r0
        L_0x010e:
            if (r7 == 0) goto L_0x0117
            androidx.compose.ui.text.TextStyle$Companion r0 = androidx.compose.ui.text.TextStyle.f18499d
            androidx.compose.ui.text.TextStyle r0 = r0.a()
            goto L_0x0118
        L_0x0117:
            r0 = r11
        L_0x0118:
            if (r12 == 0) goto L_0x011d
            r2 = r22
            goto L_0x011e
        L_0x011d:
            r2 = r13
        L_0x011e:
            if (r14 == 0) goto L_0x0127
            androidx.compose.ui.text.style.TextOverflow$Companion r5 = androidx.compose.ui.text.style.TextOverflow.f19125b
            int r5 = r5.a()
            goto L_0x0128
        L_0x0127:
            r5 = r15
        L_0x0128:
            if (r16 == 0) goto L_0x012d
            r3 = 2147483647(0x7fffffff, float:NaN)
        L_0x012d:
            if (r17 == 0) goto L_0x0132
            androidx.compose.foundation.text.ClickableTextKt$ClickableText$1 r7 = androidx.compose.foundation.text.ClickableTextKt$ClickableText$1.f5620z
            goto L_0x0134
        L_0x0132:
            r7 = r32
        L_0x0134:
            boolean r11 = androidx.compose.runtime.ComposerKt.P()
            if (r11 == 0) goto L_0x0143
            r11 = -1
            java.lang.String r12 = "androidx.compose.foundation.text.ClickableText (ClickableText.kt:79)"
            r13 = -246609449(0xfffffffff14d09d7, float:-1.0153012E30)
            androidx.compose.runtime.ComposerKt.Y(r13, r4, r11, r12)
        L_0x0143:
            java.lang.Object r11 = r1.g()
            androidx.compose.runtime.Composer$Companion r12 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r13 = r12.a()
            if (r11 != r13) goto L_0x0158
            r11 = 0
            r13 = 2
            androidx.compose.runtime.MutableState r11 = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.e(r11, r11, r13, r11)
            r1.N(r11)
        L_0x0158:
            androidx.compose.runtime.MutableState r11 = (androidx.compose.runtime.MutableState) r11
            androidx.compose.ui.Modifier$Companion r13 = androidx.compose.ui.Modifier.f15489d
            r14 = 29360128(0x1c00000, float:7.052966E-38)
            r14 = r14 & r4
            r15 = 8388608(0x800000, float:1.17549435E-38)
            if (r14 != r15) goto L_0x0166
            r14 = r22
            goto L_0x0168
        L_0x0166:
            r14 = r21
        L_0x0168:
            java.lang.Object r15 = r1.g()
            if (r14 != 0) goto L_0x0174
            java.lang.Object r14 = r12.a()
            if (r15 != r14) goto L_0x017c
        L_0x0174:
            androidx.compose.foundation.text.ClickableTextKt$ClickableText$pressIndicator$1$1 r15 = new androidx.compose.foundation.text.ClickableTextKt$ClickableText$pressIndicator$1$1
            r15.<init>(r11, r8)
            r1.N(r15)
        L_0x017c:
            androidx.compose.ui.input.pointer.PointerInputEventHandler r15 = (androidx.compose.ui.input.pointer.PointerInputEventHandler) r15
            androidx.compose.ui.Modifier r13 = androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt.c(r13, r8, r15)
            androidx.compose.ui.Modifier r13 = r6.o0(r13)
            r14 = 3670016(0x380000, float:5.142788E-39)
            r15 = r4 & r14
            r14 = 1048576(0x100000, float:1.469368E-39)
            if (r15 != r14) goto L_0x0190
            r21 = r22
        L_0x0190:
            java.lang.Object r14 = r1.g()
            if (r21 != 0) goto L_0x019c
            java.lang.Object r12 = r12.a()
            if (r14 != r12) goto L_0x01a4
        L_0x019c:
            androidx.compose.foundation.text.ClickableTextKt$ClickableText$2$1 r14 = new androidx.compose.foundation.text.ClickableTextKt$ClickableText$2$1
            r14.<init>(r11, r7)
            r1.N(r14)
        L_0x01a4:
            kotlin.jvm.functions.Function1 r14 = (kotlin.jvm.functions.Function1) r14
            r11 = 58254(0xe38e, float:8.1631E-41)
            r11 = r11 & r4
            r12 = 458752(0x70000, float:6.42848E-40)
            int r15 = r4 << 6
            r12 = r12 & r15
            r11 = r11 | r12
            int r4 = r4 << 3
            r12 = 3670016(0x380000, float:5.142788E-39)
            r4 = r4 & r12
            r23 = r11 | r4
            r24 = 0
            r25 = 1920(0x780, float:2.69E-42)
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r11 = r26
            r12 = r13
            r13 = r0
            r15 = r5
            r16 = r2
            r17 = r3
            r22 = r1
            androidx.compose.foundation.text.BasicTextKt.d(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            boolean r4 = androidx.compose.runtime.ComposerKt.P()
            if (r4 == 0) goto L_0x01da
            androidx.compose.runtime.ComposerKt.X()
        L_0x01da:
            r4 = r2
            r2 = r6
            r6 = r3
            r3 = r0
            goto L_0x01e9
        L_0x01df:
            r1.B()
            r7 = r32
            r2 = r6
            r4 = r13
            r5 = r15
            r6 = r3
            r3 = r11
        L_0x01e9:
            androidx.compose.runtime.ScopeUpdateScope r11 = r1.x()
            if (r11 == 0) goto L_0x0200
            androidx.compose.foundation.text.ClickableTextKt$ClickableText$3 r12 = new androidx.compose.foundation.text.ClickableTextKt$ClickableText$3
            r0 = r12
            r1 = r26
            r8 = r33
            r9 = r35
            r10 = r36
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r11.a(r12)
        L_0x0200:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.ClickableTextKt.a(androidx.compose.ui.text.AnnotatedString, androidx.compose.ui.Modifier, androidx.compose.ui.text.TextStyle, boolean, int, int, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }
}
