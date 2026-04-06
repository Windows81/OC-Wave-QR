package androidx.compose.foundation.text;

import androidx.compose.foundation.text.modifiers.SelectableTextAnnotatedStringElement;
import androidx.compose.foundation.text.modifiers.SelectionController;
import androidx.compose.foundation.text.modifiers.TextAnnotatedStringElement;
import androidx.compose.foundation.text.selection.SelectionRegistrar;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorProducer;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.unit.Constraints;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class BasicTextKt {
    /* JADX WARNING: Removed duplicated region for block: B:119:0x0195  */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x01a8  */
    /* JADX WARNING: Removed duplicated region for block: B:124:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00a1  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00b9  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00be  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x00d7  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x00dc  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x00fb  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x00fe  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x0107  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final /* synthetic */ void a(androidx.compose.ui.text.AnnotatedString r26, androidx.compose.ui.Modifier r27, androidx.compose.ui.text.TextStyle r28, kotlin.jvm.functions.Function1 r29, int r30, boolean r31, int r32, java.util.Map r33, androidx.compose.runtime.Composer r34, int r35, int r36) {
        /*
            r9 = r35
            r10 = r36
            r0 = -648605928(0xffffffffd9570f18, float:-3.78335723E15)
            r1 = r34
            androidx.compose.runtime.Composer r1 = r1.q(r0)
            r2 = r10 & 1
            if (r2 == 0) goto L_0x0017
            r2 = r9 | 6
            r3 = r2
            r2 = r26
            goto L_0x002b
        L_0x0017:
            r2 = r9 & 6
            if (r2 != 0) goto L_0x0028
            r2 = r26
            boolean r3 = r1.W(r2)
            if (r3 == 0) goto L_0x0025
            r3 = 4
            goto L_0x0026
        L_0x0025:
            r3 = 2
        L_0x0026:
            r3 = r3 | r9
            goto L_0x002b
        L_0x0028:
            r2 = r26
            r3 = r9
        L_0x002b:
            r4 = r10 & 2
            if (r4 == 0) goto L_0x0034
            r3 = r3 | 48
        L_0x0031:
            r5 = r27
            goto L_0x0046
        L_0x0034:
            r5 = r9 & 48
            if (r5 != 0) goto L_0x0031
            r5 = r27
            boolean r6 = r1.W(r5)
            if (r6 == 0) goto L_0x0043
            r6 = 32
            goto L_0x0045
        L_0x0043:
            r6 = 16
        L_0x0045:
            r3 = r3 | r6
        L_0x0046:
            r6 = r10 & 4
            if (r6 == 0) goto L_0x004f
            r3 = r3 | 384(0x180, float:5.38E-43)
        L_0x004c:
            r7 = r28
            goto L_0x0061
        L_0x004f:
            r7 = r9 & 384(0x180, float:5.38E-43)
            if (r7 != 0) goto L_0x004c
            r7 = r28
            boolean r8 = r1.W(r7)
            if (r8 == 0) goto L_0x005e
            r8 = 256(0x100, float:3.59E-43)
            goto L_0x0060
        L_0x005e:
            r8 = 128(0x80, float:1.794E-43)
        L_0x0060:
            r3 = r3 | r8
        L_0x0061:
            r8 = r10 & 8
            if (r8 == 0) goto L_0x006a
            r3 = r3 | 3072(0xc00, float:4.305E-42)
        L_0x0067:
            r11 = r29
            goto L_0x007c
        L_0x006a:
            r11 = r9 & 3072(0xc00, float:4.305E-42)
            if (r11 != 0) goto L_0x0067
            r11 = r29
            boolean r12 = r1.l(r11)
            if (r12 == 0) goto L_0x0079
            r12 = 2048(0x800, float:2.87E-42)
            goto L_0x007b
        L_0x0079:
            r12 = 1024(0x400, float:1.435E-42)
        L_0x007b:
            r3 = r3 | r12
        L_0x007c:
            r12 = r10 & 16
            if (r12 == 0) goto L_0x0085
            r3 = r3 | 24576(0x6000, float:3.4438E-41)
        L_0x0082:
            r13 = r30
            goto L_0x0097
        L_0x0085:
            r13 = r9 & 24576(0x6000, float:3.4438E-41)
            if (r13 != 0) goto L_0x0082
            r13 = r30
            boolean r14 = r1.i(r13)
            if (r14 == 0) goto L_0x0094
            r14 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0096
        L_0x0094:
            r14 = 8192(0x2000, float:1.14794E-41)
        L_0x0096:
            r3 = r3 | r14
        L_0x0097:
            r14 = r10 & 32
            r15 = 196608(0x30000, float:2.75506E-40)
            if (r14 == 0) goto L_0x00a1
            r3 = r3 | r15
        L_0x009e:
            r15 = r31
            goto L_0x00b3
        L_0x00a1:
            r15 = r15 & r9
            if (r15 != 0) goto L_0x009e
            r15 = r31
            boolean r16 = r1.d(r15)
            if (r16 == 0) goto L_0x00af
            r16 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00b1
        L_0x00af:
            r16 = 65536(0x10000, float:9.18355E-41)
        L_0x00b1:
            r3 = r3 | r16
        L_0x00b3:
            r16 = r10 & 64
            r17 = 1572864(0x180000, float:2.204052E-39)
            if (r16 == 0) goto L_0x00be
            r3 = r3 | r17
            r0 = r32
            goto L_0x00d1
        L_0x00be:
            r17 = r9 & r17
            r0 = r32
            if (r17 != 0) goto L_0x00d1
            boolean r18 = r1.i(r0)
            if (r18 == 0) goto L_0x00cd
            r18 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00cf
        L_0x00cd:
            r18 = 524288(0x80000, float:7.34684E-40)
        L_0x00cf:
            r3 = r3 | r18
        L_0x00d1:
            r0 = r10 & 128(0x80, float:1.794E-43)
            r18 = 12582912(0xc00000, float:1.7632415E-38)
            if (r0 == 0) goto L_0x00dc
            r3 = r3 | r18
            r2 = r33
            goto L_0x00ef
        L_0x00dc:
            r19 = r9 & r18
            r2 = r33
            if (r19 != 0) goto L_0x00ef
            boolean r19 = r1.l(r2)
            if (r19 == 0) goto L_0x00eb
            r19 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00ed
        L_0x00eb:
            r19 = 4194304(0x400000, float:5.877472E-39)
        L_0x00ed:
            r3 = r3 | r19
        L_0x00ef:
            r19 = 4793491(0x492493, float:6.717112E-39)
            r2 = r3 & r19
            r5 = 4793490(0x492492, float:6.71711E-39)
            r19 = 1
            if (r2 == r5) goto L_0x00fe
            r2 = r19
            goto L_0x00ff
        L_0x00fe:
            r2 = 0
        L_0x00ff:
            r5 = r3 & 1
            boolean r2 = r1.E(r2, r5)
            if (r2 == 0) goto L_0x0195
            if (r4 == 0) goto L_0x010c
            androidx.compose.ui.Modifier$Companion r2 = androidx.compose.ui.Modifier.f15489d
            goto L_0x010e
        L_0x010c:
            r2 = r27
        L_0x010e:
            if (r6 == 0) goto L_0x0117
            androidx.compose.ui.text.TextStyle$Companion r4 = androidx.compose.ui.text.TextStyle.f18499d
            androidx.compose.ui.text.TextStyle r4 = r4.a()
            r7 = r4
        L_0x0117:
            if (r8 == 0) goto L_0x011b
            r4 = 0
            goto L_0x011c
        L_0x011b:
            r4 = r11
        L_0x011c:
            if (r12 == 0) goto L_0x0125
            androidx.compose.ui.text.style.TextOverflow$Companion r5 = androidx.compose.ui.text.style.TextOverflow.f19125b
            int r5 = r5.a()
            goto L_0x0126
        L_0x0125:
            r5 = r13
        L_0x0126:
            if (r14 == 0) goto L_0x012b
            r6 = r19
            goto L_0x012c
        L_0x012b:
            r6 = r15
        L_0x012c:
            if (r16 == 0) goto L_0x0132
            r8 = 2147483647(0x7fffffff, float:NaN)
            goto L_0x0134
        L_0x0132:
            r8 = r32
        L_0x0134:
            if (r0 == 0) goto L_0x013b
            java.util.Map r0 = kotlin.collections.MapsKt.h()
            goto L_0x013d
        L_0x013b:
            r0 = r33
        L_0x013d:
            boolean r11 = androidx.compose.runtime.ComposerKt.P()
            if (r11 == 0) goto L_0x014c
            r11 = -1
            java.lang.String r12 = "androidx.compose.foundation.text.BasicText (BasicText.kt:392)"
            r13 = -648605928(0xffffffffd9570f18, float:-3.78335723E15)
            androidx.compose.runtime.ComposerKt.Y(r13, r3, r11, r12)
        L_0x014c:
            r11 = r3 & 14
            r11 = r11 | r18
            r12 = r3 & 112(0x70, float:1.57E-43)
            r11 = r11 | r12
            r12 = r3 & 896(0x380, float:1.256E-42)
            r11 = r11 | r12
            r12 = r3 & 7168(0x1c00, float:1.0045E-41)
            r11 = r11 | r12
            r12 = 57344(0xe000, float:8.0356E-41)
            r12 = r12 & r3
            r11 = r11 | r12
            r12 = 458752(0x70000, float:6.42848E-40)
            r12 = r12 & r3
            r11 = r11 | r12
            r12 = 3670016(0x380000, float:5.142788E-39)
            r12 = r12 & r3
            r11 = r11 | r12
            int r3 = r3 << 3
            r12 = 234881024(0xe000000, float:1.5777218E-30)
            r3 = r3 & r12
            r23 = r11 | r3
            r24 = 0
            r25 = 1536(0x600, float:2.152E-42)
            r18 = 1
            r20 = 0
            r21 = 0
            r11 = r26
            r12 = r2
            r13 = r7
            r14 = r4
            r15 = r5
            r16 = r6
            r17 = r8
            r19 = r0
            r22 = r1
            d(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            boolean r3 = androidx.compose.runtime.ComposerKt.P()
            if (r3 == 0) goto L_0x0191
            androidx.compose.runtime.ComposerKt.X()
        L_0x0191:
            r3 = r7
            r7 = r8
            r8 = r0
            goto L_0x01a2
        L_0x0195:
            r1.B()
            r2 = r27
            r8 = r33
            r3 = r7
            r4 = r11
            r5 = r13
            r6 = r15
            r7 = r32
        L_0x01a2:
            androidx.compose.runtime.ScopeUpdateScope r11 = r1.x()
            if (r11 == 0) goto L_0x01b7
            androidx.compose.foundation.text.BasicTextKt$BasicText$7 r12 = new androidx.compose.foundation.text.BasicTextKt$BasicText$7
            r0 = r12
            r1 = r26
            r9 = r35
            r10 = r36
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r11.a(r12)
        L_0x01b7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.BasicTextKt.a(androidx.compose.ui.text.AnnotatedString, androidx.compose.ui.Modifier, androidx.compose.ui.text.TextStyle, kotlin.jvm.functions.Function1, int, boolean, int, java.util.Map, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:119:0x0173  */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x0186  */
    /* JADX WARNING: Removed duplicated region for block: B:124:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00a1  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00b9  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00be  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x00d7  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x00dc  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x00fb  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x00fe  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x0107  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final /* synthetic */ void b(java.lang.String r24, androidx.compose.ui.Modifier r25, androidx.compose.ui.text.TextStyle r26, kotlin.jvm.functions.Function1 r27, int r28, boolean r29, int r30, int r31, androidx.compose.runtime.Composer r32, int r33, int r34) {
        /*
            r9 = r33
            r10 = r34
            r0 = 1542716361(0x5bf3fbc9, float:1.3735052E17)
            r1 = r32
            androidx.compose.runtime.Composer r1 = r1.q(r0)
            r2 = r10 & 1
            if (r2 == 0) goto L_0x0017
            r2 = r9 | 6
            r3 = r2
            r2 = r24
            goto L_0x002b
        L_0x0017:
            r2 = r9 & 6
            if (r2 != 0) goto L_0x0028
            r2 = r24
            boolean r3 = r1.W(r2)
            if (r3 == 0) goto L_0x0025
            r3 = 4
            goto L_0x0026
        L_0x0025:
            r3 = 2
        L_0x0026:
            r3 = r3 | r9
            goto L_0x002b
        L_0x0028:
            r2 = r24
            r3 = r9
        L_0x002b:
            r4 = r10 & 2
            if (r4 == 0) goto L_0x0034
            r3 = r3 | 48
        L_0x0031:
            r5 = r25
            goto L_0x0046
        L_0x0034:
            r5 = r9 & 48
            if (r5 != 0) goto L_0x0031
            r5 = r25
            boolean r6 = r1.W(r5)
            if (r6 == 0) goto L_0x0043
            r6 = 32
            goto L_0x0045
        L_0x0043:
            r6 = 16
        L_0x0045:
            r3 = r3 | r6
        L_0x0046:
            r6 = r10 & 4
            if (r6 == 0) goto L_0x004f
            r3 = r3 | 384(0x180, float:5.38E-43)
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
            r3 = r3 | r8
        L_0x0061:
            r8 = r10 & 8
            if (r8 == 0) goto L_0x006a
            r3 = r3 | 3072(0xc00, float:4.305E-42)
        L_0x0067:
            r11 = r27
            goto L_0x007c
        L_0x006a:
            r11 = r9 & 3072(0xc00, float:4.305E-42)
            if (r11 != 0) goto L_0x0067
            r11 = r27
            boolean r12 = r1.l(r11)
            if (r12 == 0) goto L_0x0079
            r12 = 2048(0x800, float:2.87E-42)
            goto L_0x007b
        L_0x0079:
            r12 = 1024(0x400, float:1.435E-42)
        L_0x007b:
            r3 = r3 | r12
        L_0x007c:
            r12 = r10 & 16
            if (r12 == 0) goto L_0x0085
            r3 = r3 | 24576(0x6000, float:3.4438E-41)
        L_0x0082:
            r13 = r28
            goto L_0x0097
        L_0x0085:
            r13 = r9 & 24576(0x6000, float:3.4438E-41)
            if (r13 != 0) goto L_0x0082
            r13 = r28
            boolean r14 = r1.i(r13)
            if (r14 == 0) goto L_0x0094
            r14 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0096
        L_0x0094:
            r14 = 8192(0x2000, float:1.14794E-41)
        L_0x0096:
            r3 = r3 | r14
        L_0x0097:
            r14 = r10 & 32
            r15 = 196608(0x30000, float:2.75506E-40)
            if (r14 == 0) goto L_0x00a1
            r3 = r3 | r15
        L_0x009e:
            r15 = r29
            goto L_0x00b3
        L_0x00a1:
            r15 = r15 & r9
            if (r15 != 0) goto L_0x009e
            r15 = r29
            boolean r16 = r1.d(r15)
            if (r16 == 0) goto L_0x00af
            r16 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00b1
        L_0x00af:
            r16 = 65536(0x10000, float:9.18355E-41)
        L_0x00b1:
            r3 = r3 | r16
        L_0x00b3:
            r16 = r10 & 64
            r17 = 1572864(0x180000, float:2.204052E-39)
            if (r16 == 0) goto L_0x00be
            r3 = r3 | r17
            r0 = r30
            goto L_0x00d1
        L_0x00be:
            r17 = r9 & r17
            r0 = r30
            if (r17 != 0) goto L_0x00d1
            boolean r18 = r1.i(r0)
            if (r18 == 0) goto L_0x00cd
            r18 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00cf
        L_0x00cd:
            r18 = 524288(0x80000, float:7.34684E-40)
        L_0x00cf:
            r3 = r3 | r18
        L_0x00d1:
            r0 = r10 & 128(0x80, float:1.794E-43)
            r18 = 12582912(0xc00000, float:1.7632415E-38)
            if (r0 == 0) goto L_0x00dc
            r3 = r3 | r18
            r2 = r31
            goto L_0x00ef
        L_0x00dc:
            r18 = r9 & r18
            r2 = r31
            if (r18 != 0) goto L_0x00ef
            boolean r18 = r1.i(r2)
            if (r18 == 0) goto L_0x00eb
            r18 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00ed
        L_0x00eb:
            r18 = 4194304(0x400000, float:5.877472E-39)
        L_0x00ed:
            r3 = r3 | r18
        L_0x00ef:
            r18 = 4793491(0x492493, float:6.717112E-39)
            r2 = r3 & r18
            r5 = 4793490(0x492492, float:6.71711E-39)
            r18 = 1
            if (r2 == r5) goto L_0x00fe
            r2 = r18
            goto L_0x00ff
        L_0x00fe:
            r2 = 0
        L_0x00ff:
            r5 = r3 & 1
            boolean r2 = r1.E(r2, r5)
            if (r2 == 0) goto L_0x0173
            if (r4 == 0) goto L_0x010c
            androidx.compose.ui.Modifier$Companion r2 = androidx.compose.ui.Modifier.f15489d
            goto L_0x010e
        L_0x010c:
            r2 = r25
        L_0x010e:
            if (r6 == 0) goto L_0x0117
            androidx.compose.ui.text.TextStyle$Companion r4 = androidx.compose.ui.text.TextStyle.f18499d
            androidx.compose.ui.text.TextStyle r4 = r4.a()
            r7 = r4
        L_0x0117:
            if (r8 == 0) goto L_0x011b
            r4 = 0
            goto L_0x011c
        L_0x011b:
            r4 = r11
        L_0x011c:
            if (r12 == 0) goto L_0x0125
            androidx.compose.ui.text.style.TextOverflow$Companion r5 = androidx.compose.ui.text.style.TextOverflow.f19125b
            int r5 = r5.a()
            goto L_0x0126
        L_0x0125:
            r5 = r13
        L_0x0126:
            if (r14 == 0) goto L_0x012b
            r6 = r18
            goto L_0x012c
        L_0x012b:
            r6 = r15
        L_0x012c:
            if (r16 == 0) goto L_0x0132
            r8 = 2147483647(0x7fffffff, float:NaN)
            goto L_0x0134
        L_0x0132:
            r8 = r30
        L_0x0134:
            if (r0 == 0) goto L_0x0139
            r0 = r18
            goto L_0x013b
        L_0x0139:
            r0 = r31
        L_0x013b:
            boolean r11 = androidx.compose.runtime.ComposerKt.P()
            if (r11 == 0) goto L_0x014a
            r11 = -1
            java.lang.String r12 = "androidx.compose.foundation.text.BasicText (BasicText.kt:417)"
            r13 = 1542716361(0x5bf3fbc9, float:1.3735052E17)
            androidx.compose.runtime.ComposerKt.Y(r13, r3, r11, r12)
        L_0x014a:
            r11 = 33554430(0x1fffffe, float:9.4039537E-38)
            r22 = r3 & r11
            r23 = 768(0x300, float:1.076E-42)
            r19 = 0
            r20 = 0
            r11 = r24
            r12 = r2
            r13 = r7
            r14 = r4
            r15 = r5
            r16 = r6
            r17 = r8
            r18 = r0
            r21 = r1
            f(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            boolean r3 = androidx.compose.runtime.ComposerKt.P()
            if (r3 == 0) goto L_0x016f
            androidx.compose.runtime.ComposerKt.X()
        L_0x016f:
            r3 = r7
            r7 = r8
            r8 = r0
            goto L_0x0180
        L_0x0173:
            r1.B()
            r2 = r25
            r8 = r31
            r3 = r7
            r4 = r11
            r5 = r13
            r6 = r15
            r7 = r30
        L_0x0180:
            androidx.compose.runtime.ScopeUpdateScope r11 = r1.x()
            if (r11 == 0) goto L_0x0195
            androidx.compose.foundation.text.BasicTextKt$BasicText$8 r12 = new androidx.compose.foundation.text.BasicTextKt$BasicText$8
            r0 = r12
            r1 = r24
            r9 = r33
            r10 = r34
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r11.a(r12)
        L_0x0195:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.BasicTextKt.b(java.lang.String, androidx.compose.ui.Modifier, androidx.compose.ui.text.TextStyle, kotlin.jvm.functions.Function1, int, boolean, int, int, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:106:0x0162  */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x0172  */
    /* JADX WARNING: Removed duplicated region for block: B:111:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x009f  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00b6  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00bb  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x00da  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x00dd  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x00e6  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final /* synthetic */ void c(java.lang.String r22, androidx.compose.ui.Modifier r23, androidx.compose.ui.text.TextStyle r24, kotlin.jvm.functions.Function1 r25, int r26, boolean r27, int r28, androidx.compose.runtime.Composer r29, int r30, int r31) {
        /*
            r8 = r30
            r0 = 1022429478(0x3cf10926, float:0.029423308)
            r1 = r29
            androidx.compose.runtime.Composer r1 = r1.q(r0)
            r2 = r31 & 1
            if (r2 == 0) goto L_0x0015
            r2 = r8 | 6
            r3 = r2
            r2 = r22
            goto L_0x0029
        L_0x0015:
            r2 = r8 & 6
            if (r2 != 0) goto L_0x0026
            r2 = r22
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
            r2 = r22
            r3 = r8
        L_0x0029:
            r4 = r31 & 2
            if (r4 == 0) goto L_0x0032
            r3 = r3 | 48
        L_0x002f:
            r5 = r23
            goto L_0x0044
        L_0x0032:
            r5 = r8 & 48
            if (r5 != 0) goto L_0x002f
            r5 = r23
            boolean r6 = r1.W(r5)
            if (r6 == 0) goto L_0x0041
            r6 = 32
            goto L_0x0043
        L_0x0041:
            r6 = 16
        L_0x0043:
            r3 = r3 | r6
        L_0x0044:
            r6 = r31 & 4
            if (r6 == 0) goto L_0x004d
            r3 = r3 | 384(0x180, float:5.38E-43)
        L_0x004a:
            r7 = r24
            goto L_0x005f
        L_0x004d:
            r7 = r8 & 384(0x180, float:5.38E-43)
            if (r7 != 0) goto L_0x004a
            r7 = r24
            boolean r9 = r1.W(r7)
            if (r9 == 0) goto L_0x005c
            r9 = 256(0x100, float:3.59E-43)
            goto L_0x005e
        L_0x005c:
            r9 = 128(0x80, float:1.794E-43)
        L_0x005e:
            r3 = r3 | r9
        L_0x005f:
            r9 = r31 & 8
            if (r9 == 0) goto L_0x0068
            r3 = r3 | 3072(0xc00, float:4.305E-42)
        L_0x0065:
            r10 = r25
            goto L_0x007a
        L_0x0068:
            r10 = r8 & 3072(0xc00, float:4.305E-42)
            if (r10 != 0) goto L_0x0065
            r10 = r25
            boolean r11 = r1.l(r10)
            if (r11 == 0) goto L_0x0077
            r11 = 2048(0x800, float:2.87E-42)
            goto L_0x0079
        L_0x0077:
            r11 = 1024(0x400, float:1.435E-42)
        L_0x0079:
            r3 = r3 | r11
        L_0x007a:
            r11 = r31 & 16
            if (r11 == 0) goto L_0x0083
            r3 = r3 | 24576(0x6000, float:3.4438E-41)
        L_0x0080:
            r12 = r26
            goto L_0x0095
        L_0x0083:
            r12 = r8 & 24576(0x6000, float:3.4438E-41)
            if (r12 != 0) goto L_0x0080
            r12 = r26
            boolean r13 = r1.i(r12)
            if (r13 == 0) goto L_0x0092
            r13 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0094
        L_0x0092:
            r13 = 8192(0x2000, float:1.14794E-41)
        L_0x0094:
            r3 = r3 | r13
        L_0x0095:
            r13 = r31 & 32
            r14 = 196608(0x30000, float:2.75506E-40)
            if (r13 == 0) goto L_0x009f
            r3 = r3 | r14
        L_0x009c:
            r14 = r27
            goto L_0x00b0
        L_0x009f:
            r14 = r14 & r8
            if (r14 != 0) goto L_0x009c
            r14 = r27
            boolean r15 = r1.d(r14)
            if (r15 == 0) goto L_0x00ad
            r15 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00af
        L_0x00ad:
            r15 = 65536(0x10000, float:9.18355E-41)
        L_0x00af:
            r3 = r3 | r15
        L_0x00b0:
            r15 = r31 & 64
            r16 = 1572864(0x180000, float:2.204052E-39)
            if (r15 == 0) goto L_0x00bb
            r3 = r3 | r16
            r0 = r28
            goto L_0x00ce
        L_0x00bb:
            r16 = r8 & r16
            r0 = r28
            if (r16 != 0) goto L_0x00ce
            boolean r17 = r1.i(r0)
            if (r17 == 0) goto L_0x00ca
            r17 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00cc
        L_0x00ca:
            r17 = 524288(0x80000, float:7.34684E-40)
        L_0x00cc:
            r3 = r3 | r17
        L_0x00ce:
            r17 = 599187(0x92493, float:8.3964E-40)
            r0 = r3 & r17
            r2 = 599186(0x92492, float:8.39638E-40)
            r17 = 1
            if (r0 == r2) goto L_0x00dd
            r0 = r17
            goto L_0x00de
        L_0x00dd:
            r0 = 0
        L_0x00de:
            r2 = r3 & 1
            boolean r0 = r1.E(r0, r2)
            if (r0 == 0) goto L_0x0162
            if (r4 == 0) goto L_0x00eb
            androidx.compose.ui.Modifier$Companion r0 = androidx.compose.ui.Modifier.f15489d
            goto L_0x00ec
        L_0x00eb:
            r0 = r5
        L_0x00ec:
            if (r6 == 0) goto L_0x00f5
            androidx.compose.ui.text.TextStyle$Companion r2 = androidx.compose.ui.text.TextStyle.f18499d
            androidx.compose.ui.text.TextStyle r2 = r2.a()
            r7 = r2
        L_0x00f5:
            if (r9 == 0) goto L_0x00f9
            r2 = 0
            goto L_0x00fa
        L_0x00f9:
            r2 = r10
        L_0x00fa:
            if (r11 == 0) goto L_0x0103
            androidx.compose.ui.text.style.TextOverflow$Companion r4 = androidx.compose.ui.text.style.TextOverflow.f19125b
            int r4 = r4.a()
            goto L_0x0104
        L_0x0103:
            r4 = r12
        L_0x0104:
            if (r13 == 0) goto L_0x0109
            r5 = r17
            goto L_0x010a
        L_0x0109:
            r5 = r14
        L_0x010a:
            if (r15 == 0) goto L_0x0110
            r6 = 2147483647(0x7fffffff, float:NaN)
            goto L_0x0112
        L_0x0110:
            r6 = r28
        L_0x0112:
            boolean r9 = androidx.compose.runtime.ComposerKt.P()
            if (r9 == 0) goto L_0x0121
            r9 = -1
            java.lang.String r10 = "androidx.compose.foundation.text.BasicText (BasicText.kt:368)"
            r11 = 1022429478(0x3cf10926, float:0.029423308)
            androidx.compose.runtime.ComposerKt.Y(r11, r3, r9, r10)
        L_0x0121:
            r9 = r3 & 14
            r10 = 12582912(0xc00000, float:1.7632415E-38)
            r9 = r9 | r10
            r10 = r3 & 112(0x70, float:1.57E-43)
            r9 = r9 | r10
            r10 = r3 & 896(0x380, float:1.256E-42)
            r9 = r9 | r10
            r10 = r3 & 7168(0x1c00, float:1.0045E-41)
            r9 = r9 | r10
            r10 = 57344(0xe000, float:8.0356E-41)
            r10 = r10 & r3
            r9 = r9 | r10
            r10 = 458752(0x70000, float:6.42848E-40)
            r10 = r10 & r3
            r9 = r9 | r10
            r10 = 3670016(0x380000, float:5.142788E-39)
            r3 = r3 & r10
            r20 = r9 | r3
            r21 = 768(0x300, float:1.076E-42)
            r16 = 1
            r17 = 0
            r18 = 0
            r9 = r22
            r10 = r0
            r11 = r7
            r12 = r2
            r13 = r4
            r14 = r5
            r15 = r6
            r19 = r1
            f(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            boolean r3 = androidx.compose.runtime.ComposerKt.P()
            if (r3 == 0) goto L_0x015b
            androidx.compose.runtime.ComposerKt.X()
        L_0x015b:
            r3 = r7
            r7 = r6
            r6 = r5
            r5 = r4
            r4 = r2
            r2 = r0
            goto L_0x016c
        L_0x0162:
            r1.B()
            r2 = r5
            r3 = r7
            r4 = r10
            r5 = r12
            r6 = r14
            r7 = r28
        L_0x016c:
            androidx.compose.runtime.ScopeUpdateScope r10 = r1.x()
            if (r10 == 0) goto L_0x0181
            androidx.compose.foundation.text.BasicTextKt$BasicText$6 r11 = new androidx.compose.foundation.text.BasicTextKt$BasicText$6
            r0 = r11
            r1 = r22
            r8 = r30
            r9 = r31
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r10.a(r11)
        L_0x0181:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.BasicTextKt.c(java.lang.String, androidx.compose.ui.Modifier, androidx.compose.ui.text.TextStyle, kotlin.jvm.functions.Function1, int, boolean, int, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r29v0, resolved type: kotlin.jvm.functions.Function1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v9, resolved type: kotlin.jvm.functions.Function0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v10, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v11, resolved type: androidx.compose.foundation.text.modifiers.SelectionController} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r35v2, resolved type: androidx.compose.ui.Modifier$Companion} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v19, resolved type: androidx.compose.foundation.text.modifiers.SelectionController} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r48v3, resolved type: androidx.compose.foundation.text.modifiers.SelectionController} */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x0258, code lost:
        if (r9 == androidx.compose.runtime.Composer.f14567a.a()) goto L_0x025a;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x012f  */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x0134  */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x0164  */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x0166  */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x0170  */
    /* JADX WARNING: Removed duplicated region for block: B:211:0x040b  */
    /* JADX WARNING: Removed duplicated region for block: B:214:0x0429  */
    /* JADX WARNING: Removed duplicated region for block: B:216:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x007d  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00a0  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00b9  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00be  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x00d7  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x00dc  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x00f5  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x00fa  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x0113  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x0118  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void d(androidx.compose.ui.text.AnnotatedString r47, androidx.compose.ui.Modifier r48, androidx.compose.ui.text.TextStyle r49, kotlin.jvm.functions.Function1 r50, int r51, boolean r52, int r53, int r54, java.util.Map r55, androidx.compose.ui.graphics.ColorProducer r56, androidx.compose.foundation.text.TextAutoSize r57, androidx.compose.runtime.Composer r58, int r59, int r60, int r61) {
        /*
            r15 = r47
            r0 = r57
            r14 = r59
            r13 = r61
            r1 = -1343466571(0xffffffffafec53b5, float:-4.2987627E-10)
            r2 = r58
            androidx.compose.runtime.Composer r12 = r2.q(r1)
            r2 = r13 & 1
            if (r2 == 0) goto L_0x0018
            r2 = r14 | 6
            goto L_0x0028
        L_0x0018:
            r2 = r14 & 6
            if (r2 != 0) goto L_0x0027
            boolean r2 = r12.W(r15)
            if (r2 == 0) goto L_0x0024
            r2 = 4
            goto L_0x0025
        L_0x0024:
            r2 = 2
        L_0x0025:
            r2 = r2 | r14
            goto L_0x0028
        L_0x0027:
            r2 = r14
        L_0x0028:
            r5 = r13 & 2
            if (r5 == 0) goto L_0x0031
            r2 = r2 | 48
        L_0x002e:
            r6 = r48
            goto L_0x0043
        L_0x0031:
            r6 = r14 & 48
            if (r6 != 0) goto L_0x002e
            r6 = r48
            boolean r7 = r12.W(r6)
            if (r7 == 0) goto L_0x0040
            r7 = 32
            goto L_0x0042
        L_0x0040:
            r7 = 16
        L_0x0042:
            r2 = r2 | r7
        L_0x0043:
            r7 = r13 & 4
            if (r7 == 0) goto L_0x004c
            r2 = r2 | 384(0x180, float:5.38E-43)
        L_0x0049:
            r8 = r49
            goto L_0x005e
        L_0x004c:
            r8 = r14 & 384(0x180, float:5.38E-43)
            if (r8 != 0) goto L_0x0049
            r8 = r49
            boolean r9 = r12.W(r8)
            if (r9 == 0) goto L_0x005b
            r9 = 256(0x100, float:3.59E-43)
            goto L_0x005d
        L_0x005b:
            r9 = 128(0x80, float:1.794E-43)
        L_0x005d:
            r2 = r2 | r9
        L_0x005e:
            r9 = r13 & 8
            if (r9 == 0) goto L_0x0067
            r2 = r2 | 3072(0xc00, float:4.305E-42)
        L_0x0064:
            r10 = r50
            goto L_0x0079
        L_0x0067:
            r10 = r14 & 3072(0xc00, float:4.305E-42)
            if (r10 != 0) goto L_0x0064
            r10 = r50
            boolean r11 = r12.l(r10)
            if (r11 == 0) goto L_0x0076
            r11 = 2048(0x800, float:2.87E-42)
            goto L_0x0078
        L_0x0076:
            r11 = 1024(0x400, float:1.435E-42)
        L_0x0078:
            r2 = r2 | r11
        L_0x0079:
            r11 = r13 & 16
            if (r11 == 0) goto L_0x0082
            r2 = r2 | 24576(0x6000, float:3.4438E-41)
        L_0x007f:
            r3 = r51
            goto L_0x0095
        L_0x0082:
            r3 = r14 & 24576(0x6000, float:3.4438E-41)
            if (r3 != 0) goto L_0x007f
            r3 = r51
            boolean r16 = r12.i(r3)
            if (r16 == 0) goto L_0x0091
            r16 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0093
        L_0x0091:
            r16 = 8192(0x2000, float:1.14794E-41)
        L_0x0093:
            r2 = r2 | r16
        L_0x0095:
            r16 = r13 & 32
            r17 = 196608(0x30000, float:2.75506E-40)
            if (r16 == 0) goto L_0x00a0
            r2 = r2 | r17
            r1 = r52
            goto L_0x00b3
        L_0x00a0:
            r17 = r14 & r17
            r1 = r52
            if (r17 != 0) goto L_0x00b3
            boolean r18 = r12.d(r1)
            if (r18 == 0) goto L_0x00af
            r18 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00b1
        L_0x00af:
            r18 = 65536(0x10000, float:9.18355E-41)
        L_0x00b1:
            r2 = r2 | r18
        L_0x00b3:
            r18 = r13 & 64
            r19 = 1572864(0x180000, float:2.204052E-39)
            if (r18 == 0) goto L_0x00be
            r2 = r2 | r19
            r4 = r53
            goto L_0x00d1
        L_0x00be:
            r19 = r14 & r19
            r4 = r53
            if (r19 != 0) goto L_0x00d1
            boolean r20 = r12.i(r4)
            if (r20 == 0) goto L_0x00cd
            r20 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00cf
        L_0x00cd:
            r20 = 524288(0x80000, float:7.34684E-40)
        L_0x00cf:
            r2 = r2 | r20
        L_0x00d1:
            r1 = r13 & 128(0x80, float:1.794E-43)
            r20 = 12582912(0xc00000, float:1.7632415E-38)
            if (r1 == 0) goto L_0x00dc
            r2 = r2 | r20
            r3 = r54
            goto L_0x00ef
        L_0x00dc:
            r20 = r14 & r20
            r3 = r54
            if (r20 != 0) goto L_0x00ef
            boolean r20 = r12.i(r3)
            if (r20 == 0) goto L_0x00eb
            r20 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00ed
        L_0x00eb:
            r20 = 4194304(0x400000, float:5.877472E-39)
        L_0x00ed:
            r2 = r2 | r20
        L_0x00ef:
            r3 = r13 & 256(0x100, float:3.59E-43)
            r20 = 100663296(0x6000000, float:2.4074124E-35)
            if (r3 == 0) goto L_0x00fa
            r2 = r2 | r20
            r4 = r55
            goto L_0x010d
        L_0x00fa:
            r20 = r14 & r20
            r4 = r55
            if (r20 != 0) goto L_0x010d
            boolean r20 = r12.l(r4)
            if (r20 == 0) goto L_0x0109
            r20 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x010b
        L_0x0109:
            r20 = 33554432(0x2000000, float:9.403955E-38)
        L_0x010b:
            r2 = r2 | r20
        L_0x010d:
            r4 = r13 & 512(0x200, float:7.175E-43)
            r20 = 805306368(0x30000000, float:4.656613E-10)
            if (r4 == 0) goto L_0x0118
            r2 = r2 | r20
            r6 = r56
            goto L_0x012b
        L_0x0118:
            r20 = r14 & r20
            r6 = r56
            if (r20 != 0) goto L_0x012b
            boolean r20 = r12.l(r6)
            if (r20 == 0) goto L_0x0127
            r20 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x0129
        L_0x0127:
            r20 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x0129:
            r2 = r2 | r20
        L_0x012b:
            r6 = r13 & 1024(0x400, float:1.435E-42)
            if (r6 == 0) goto L_0x0134
            r20 = r60 | 6
        L_0x0131:
            r0 = r20
            goto L_0x0151
        L_0x0134:
            r20 = r60 & 6
            if (r20 != 0) goto L_0x014f
            r20 = r60 & 8
            if (r20 != 0) goto L_0x0141
            boolean r20 = r12.W(r0)
            goto L_0x0145
        L_0x0141:
            boolean r20 = r12.l(r0)
        L_0x0145:
            if (r20 == 0) goto L_0x014a
            r20 = 4
            goto L_0x014c
        L_0x014a:
            r20 = 2
        L_0x014c:
            r20 = r60 | r20
            goto L_0x0131
        L_0x014f:
            r0 = r60
        L_0x0151:
            r20 = 306783379(0x12492493, float:6.34695E-28)
            r8 = r2 & r20
            r10 = 306783378(0x12492492, float:6.3469493E-28)
            r13 = 0
            r20 = 1
            if (r8 != r10) goto L_0x0166
            r8 = r0 & 3
            r10 = 2
            if (r8 == r10) goto L_0x0164
            goto L_0x0166
        L_0x0164:
            r8 = r13
            goto L_0x0168
        L_0x0166:
            r8 = r20
        L_0x0168:
            r10 = r2 & 1
            boolean r8 = r12.E(r8, r10)
            if (r8 == 0) goto L_0x040b
            if (r5 == 0) goto L_0x0177
            androidx.compose.ui.Modifier$Companion r5 = androidx.compose.ui.Modifier.f15489d
            r35 = r5
            goto L_0x0179
        L_0x0177:
            r35 = r48
        L_0x0179:
            if (r7 == 0) goto L_0x0184
            androidx.compose.ui.text.TextStyle$Companion r5 = androidx.compose.ui.text.TextStyle.f18499d
            androidx.compose.ui.text.TextStyle r5 = r5.a()
            r36 = r5
            goto L_0x0186
        L_0x0184:
            r36 = r49
        L_0x0186:
            r5 = 0
            if (r9 == 0) goto L_0x018c
            r37 = r5
            goto L_0x018e
        L_0x018c:
            r37 = r50
        L_0x018e:
            if (r11 == 0) goto L_0x0199
            androidx.compose.ui.text.style.TextOverflow$Companion r7 = androidx.compose.ui.text.style.TextOverflow.f19125b
            int r7 = r7.a()
            r38 = r7
            goto L_0x019b
        L_0x0199:
            r38 = r51
        L_0x019b:
            if (r16 == 0) goto L_0x01a0
            r39 = r20
            goto L_0x01a2
        L_0x01a0:
            r39 = r52
        L_0x01a2:
            if (r18 == 0) goto L_0x01a9
            r7 = 2147483647(0x7fffffff, float:NaN)
            r11 = r7
            goto L_0x01ab
        L_0x01a9:
            r11 = r53
        L_0x01ab:
            if (r1 == 0) goto L_0x01b0
            r10 = r20
            goto L_0x01b2
        L_0x01b0:
            r10 = r54
        L_0x01b2:
            if (r3 == 0) goto L_0x01bb
            java.util.Map r1 = kotlin.collections.MapsKt.h()
            r40 = r1
            goto L_0x01bd
        L_0x01bb:
            r40 = r55
        L_0x01bd:
            if (r4 == 0) goto L_0x01c2
            r41 = r5
            goto L_0x01c4
        L_0x01c2:
            r41 = r56
        L_0x01c4:
            if (r6 == 0) goto L_0x01c9
            r42 = r5
            goto L_0x01cb
        L_0x01c9:
            r42 = r57
        L_0x01cb:
            boolean r1 = androidx.compose.runtime.ComposerKt.P()
            if (r1 == 0) goto L_0x01d9
            java.lang.String r1 = "androidx.compose.foundation.text.BasicText (BasicText.kt:194)"
            r3 = -1343466571(0xffffffffafec53b5, float:-4.2987627E-10)
            androidx.compose.runtime.ComposerKt.Y(r3, r2, r0, r1)
        L_0x01d9:
            androidx.compose.foundation.text.HeightInLinesModifierKt.b(r10, r11)
            androidx.compose.runtime.ProvidableCompositionLocal r1 = androidx.compose.foundation.text.selection.SelectionRegistrarKt.a()
            java.lang.Object r1 = r12.C(r1)
            androidx.compose.foundation.text.selection.SelectionRegistrar r1 = (androidx.compose.foundation.text.selection.SelectionRegistrar) r1
            if (r1 == 0) goto L_0x027e
            r3 = -1584170794(0xffffffffa19378d6, float:-9.993092E-19)
            r12.X(r3)
            androidx.compose.runtime.ProvidableCompositionLocal r3 = androidx.compose.foundation.text.selection.TextSelectionColorsKt.b()
            java.lang.Object r3 = r12.C(r3)
            androidx.compose.foundation.text.selection.TextSelectionColors r3 = (androidx.compose.foundation.text.selection.TextSelectionColors) r3
            long r3 = r3.a()
            java.lang.Object[] r6 = new java.lang.Object[]{r1}
            androidx.compose.runtime.saveable.Saver r7 = p(r1)
            boolean r8 = r12.l(r1)
            java.lang.Object r9 = r12.g()
            if (r8 != 0) goto L_0x0216
            androidx.compose.runtime.Composer$Companion r8 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r8 = r8.a()
            if (r9 != r8) goto L_0x021e
        L_0x0216:
            androidx.compose.foundation.text.BasicTextKt$BasicText$selectionController$selectableId$2$1 r9 = new androidx.compose.foundation.text.BasicTextKt$BasicText$selectionController$selectableId$2$1
            r9.<init>(r1)
            r12.N(r9)
        L_0x021e:
            r8 = r9
            kotlin.jvm.functions.Function0 r8 = (kotlin.jvm.functions.Function0) r8
            r9 = 0
            r16 = 4
            r17 = 0
            r48 = r6
            r49 = r7
            r50 = r17
            r51 = r8
            r52 = r12
            r53 = r9
            r54 = r16
            java.lang.Object r6 = androidx.compose.runtime.saveable.RememberSaveableKt.h(r48, r49, r50, r51, r52, r53, r54)
            java.lang.Number r6 = (java.lang.Number) r6
            long r6 = r6.longValue()
            boolean r8 = r12.j(r6)
            boolean r9 = r12.W(r1)
            r8 = r8 | r9
            boolean r9 = r12.j(r3)
            r8 = r8 | r9
            java.lang.Object r9 = r12.g()
            if (r8 != 0) goto L_0x025a
            androidx.compose.runtime.Composer$Companion r8 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r8 = r8.a()
            if (r9 != r8) goto L_0x0276
        L_0x025a:
            androidx.compose.foundation.text.modifiers.SelectionController r9 = new androidx.compose.foundation.text.modifiers.SelectionController
            r8 = 8
            r16 = 0
            r17 = 0
            r48 = r9
            r49 = r6
            r51 = r1
            r52 = r3
            r54 = r17
            r55 = r8
            r56 = r16
            r48.<init>(r49, r51, r52, r54, r55, r56)
            r12.N(r9)
        L_0x0276:
            androidx.compose.foundation.text.modifiers.SelectionController r9 = (androidx.compose.foundation.text.modifiers.SelectionController) r9
            r12.M()
            r27 = r9
            goto L_0x0289
        L_0x027e:
            r1 = -1583679630(0xffffffffa19af772, float:-1.0500944E-18)
            r12.X(r1)
            r12.M()
            r27 = r5
        L_0x0289:
            boolean r1 = androidx.compose.foundation.text.AnnotatedStringResolveInlineContentKt.b(r47)
            boolean r3 = androidx.compose.foundation.text.modifiers.TextAnnotatedStringNodeKt.a(r47)
            if (r1 != 0) goto L_0x0344
            if (r3 != 0) goto L_0x0344
            r0 = -1583500636(0xffffffffa19db2a4, float:-1.068602E-18)
            r12.X(r0)
            androidx.compose.runtime.ProvidableCompositionLocal r0 = androidx.compose.ui.platform.CompositionLocalsKt.i()
            java.lang.Object r0 = r12.C(r0)
            r8 = r0
            androidx.compose.ui.text.font.FontFamily$Resolver r8 = (androidx.compose.ui.text.font.FontFamily.Resolver) r8
            r16 = 0
            r17 = 0
            r9 = 0
            r0 = r35
            r1 = r47
            r2 = r36
            r3 = r37
            r4 = r38
            r5 = r39
            r6 = r11
            r7 = r10
            r43 = r10
            r10 = r16
            r44 = r11
            r11 = r27
            r45 = r12
            r12 = r41
            r13 = r17
            r14 = r42
            androidx.compose.ui.Modifier r0 = q(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            androidx.compose.foundation.text.EmptyMeasurePolicy r1 = androidx.compose.foundation.text.EmptyMeasurePolicy.f5730a
            r3 = r45
            r4 = 0
            int r2 = androidx.compose.runtime.ComposablesKt.a(r3, r4)
            androidx.compose.ui.Modifier r0 = androidx.compose.ui.ComposedModifierKt.e(r3, r0)
            androidx.compose.runtime.CompositionLocalMap r4 = r3.I()
            androidx.compose.ui.node.ComposeUiNode$Companion r5 = androidx.compose.ui.node.ComposeUiNode.f17222h
            kotlin.jvm.functions.Function0 r6 = r5.a()
            androidx.compose.runtime.Applier r7 = r3.v()
            if (r7 != 0) goto L_0x02ed
            androidx.compose.runtime.ComposablesKt.d()
        L_0x02ed:
            r3.s()
            boolean r7 = r3.n()
            if (r7 == 0) goto L_0x02fa
            r3.y(r6)
            goto L_0x02fd
        L_0x02fa:
            r3.K()
        L_0x02fd:
            androidx.compose.runtime.Composer r6 = androidx.compose.runtime.Updater.b(r3)
            kotlin.jvm.functions.Function2 r7 = r5.c()
            androidx.compose.runtime.Updater.g(r6, r1, r7)
            kotlin.jvm.functions.Function2 r1 = r5.e()
            androidx.compose.runtime.Updater.g(r6, r4, r1)
            kotlin.jvm.functions.Function2 r1 = r5.d()
            androidx.compose.runtime.Updater.g(r6, r0, r1)
            kotlin.jvm.functions.Function2 r0 = r5.b()
            boolean r1 = r6.n()
            if (r1 != 0) goto L_0x032e
            java.lang.Object r1 = r6.g()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r2)
            boolean r1 = kotlin.jvm.internal.Intrinsics.d(r1, r4)
            if (r1 != 0) goto L_0x033c
        L_0x032e:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
            r6.N(r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
            r6.A(r1, r0)
        L_0x033c:
            r3.T()
            r3.M()
            goto L_0x03ef
        L_0x0344:
            r43 = r10
            r44 = r11
            r3 = r12
            r4 = r13
            r6 = -1582650709(0xffffffffa1aaaaab, float:-1.1564824E-18)
            r3.X(r6)
            r6 = r2 & 14
            r7 = 4
            if (r6 != r7) goto L_0x0358
            r13 = r20
            goto L_0x0359
        L_0x0358:
            r13 = r4
        L_0x0359:
            java.lang.Object r4 = r3.g()
            if (r13 != 0) goto L_0x0367
            androidx.compose.runtime.Composer$Companion r6 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r6 = r6.a()
            if (r4 != r6) goto L_0x036f
        L_0x0367:
            r4 = 2
            androidx.compose.runtime.MutableState r4 = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.e(r15, r5, r4, r5)
            r3.N(r4)
        L_0x036f:
            androidx.compose.runtime.MutableState r4 = (androidx.compose.runtime.MutableState) r4
            androidx.compose.ui.text.AnnotatedString r17 = i(r4)
            androidx.compose.runtime.ProvidableCompositionLocal r5 = androidx.compose.ui.platform.CompositionLocalsKt.i()
            java.lang.Object r5 = r3.C(r5)
            r26 = r5
            androidx.compose.ui.text.font.FontFamily$Resolver r26 = (androidx.compose.ui.text.font.FontFamily.Resolver) r26
            boolean r5 = r3.W(r4)
            java.lang.Object r6 = r3.g()
            if (r5 != 0) goto L_0x0393
            androidx.compose.runtime.Composer$Companion r5 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r5 = r5.a()
            if (r6 != r5) goto L_0x039b
        L_0x0393:
            androidx.compose.foundation.text.BasicTextKt$BasicText$2$1 r6 = new androidx.compose.foundation.text.BasicTextKt$BasicText$2$1
            r6.<init>(r4)
            r3.N(r6)
        L_0x039b:
            r29 = r6
            kotlin.jvm.functions.Function1 r29 = (kotlin.jvm.functions.Function1) r29
            int r4 = r2 >> 3
            r4 = r4 & 910(0x38e, float:1.275E-42)
            int r5 = r2 >> 12
            r6 = 57344(0xe000, float:8.0356E-41)
            r5 = r5 & r6
            r4 = r4 | r5
            int r5 = r2 << 9
            r6 = 458752(0x70000, float:6.42848E-40)
            r5 = r5 & r6
            r4 = r4 | r5
            int r5 = r2 << 6
            r6 = 3670016(0x380000, float:5.142788E-39)
            r6 = r6 & r5
            r4 = r4 | r6
            r6 = 29360128(0x1c00000, float:7.052966E-38)
            r6 = r6 & r5
            r4 = r4 | r6
            r6 = 234881024(0xe000000, float:1.5777218E-30)
            r6 = r6 & r5
            r4 = r4 | r6
            r6 = 1879048192(0x70000000, float:1.58456325E29)
            r5 = r5 & r6
            r32 = r4 | r5
            int r2 = r2 >> 21
            r2 = r2 & 896(0x380, float:1.256E-42)
            int r0 = r0 << 12
            r4 = 57344(0xe000, float:8.0356E-41)
            r0 = r0 & r4
            r33 = r2 | r0
            r34 = 0
            r16 = r35
            r18 = r37
            r19 = r1
            r20 = r40
            r21 = r36
            r22 = r38
            r23 = r39
            r24 = r44
            r25 = r43
            r28 = r41
            r30 = r42
            r31 = r3
            k(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34)
            r3.M()
        L_0x03ef:
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x03f8
            androidx.compose.runtime.ComposerKt.X()
        L_0x03f8:
            r2 = r35
            r4 = r37
            r5 = r38
            r6 = r39
            r9 = r40
            r10 = r41
            r11 = r42
            r8 = r43
            r7 = r44
            goto L_0x0423
        L_0x040b:
            r3 = r12
            r3.B()
            r2 = r48
            r36 = r49
            r4 = r50
            r5 = r51
            r6 = r52
            r7 = r53
            r8 = r54
            r9 = r55
            r10 = r56
            r11 = r57
        L_0x0423:
            androidx.compose.runtime.ScopeUpdateScope r14 = r3.x()
            if (r14 == 0) goto L_0x0441
            androidx.compose.foundation.text.BasicTextKt$BasicText$3 r13 = new androidx.compose.foundation.text.BasicTextKt$BasicText$3
            r0 = r13
            r1 = r47
            r3 = r36
            r12 = r59
            r15 = r13
            r13 = r60
            r46 = r14
            r14 = r61
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            r0 = r46
            r0.a(r15)
        L_0x0441:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.BasicTextKt.d(androidx.compose.ui.text.AnnotatedString, androidx.compose.ui.Modifier, androidx.compose.ui.text.TextStyle, kotlin.jvm.functions.Function1, int, boolean, int, int, java.util.Map, androidx.compose.ui.graphics.ColorProducer, androidx.compose.foundation.text.TextAutoSize, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:108:0x0137  */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x013a  */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x0143  */
    /* JADX WARNING: Removed duplicated region for block: B:146:0x01d0  */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x01e9  */
    /* JADX WARNING: Removed duplicated region for block: B:151:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00a1  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00b9  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00be  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x00d7  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x00dc  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x00f5  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x00fa  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x0113  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x0118  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final /* synthetic */ void e(androidx.compose.ui.text.AnnotatedString r29, androidx.compose.ui.Modifier r30, androidx.compose.ui.text.TextStyle r31, kotlin.jvm.functions.Function1 r32, int r33, boolean r34, int r35, int r36, java.util.Map r37, androidx.compose.ui.graphics.ColorProducer r38, androidx.compose.runtime.Composer r39, int r40, int r41) {
        /*
            r11 = r40
            r12 = r41
            r0 = -1064305212(0xffffffffc08ffdc4, float:-4.4997272)
            r1 = r39
            androidx.compose.runtime.Composer r1 = r1.q(r0)
            r2 = r12 & 1
            if (r2 == 0) goto L_0x0017
            r2 = r11 | 6
            r3 = r2
            r2 = r29
            goto L_0x002b
        L_0x0017:
            r2 = r11 & 6
            if (r2 != 0) goto L_0x0028
            r2 = r29
            boolean r3 = r1.W(r2)
            if (r3 == 0) goto L_0x0025
            r3 = 4
            goto L_0x0026
        L_0x0025:
            r3 = 2
        L_0x0026:
            r3 = r3 | r11
            goto L_0x002b
        L_0x0028:
            r2 = r29
            r3 = r11
        L_0x002b:
            r4 = r12 & 2
            if (r4 == 0) goto L_0x0034
            r3 = r3 | 48
        L_0x0031:
            r5 = r30
            goto L_0x0046
        L_0x0034:
            r5 = r11 & 48
            if (r5 != 0) goto L_0x0031
            r5 = r30
            boolean r6 = r1.W(r5)
            if (r6 == 0) goto L_0x0043
            r6 = 32
            goto L_0x0045
        L_0x0043:
            r6 = 16
        L_0x0045:
            r3 = r3 | r6
        L_0x0046:
            r6 = r12 & 4
            if (r6 == 0) goto L_0x004f
            r3 = r3 | 384(0x180, float:5.38E-43)
        L_0x004c:
            r7 = r31
            goto L_0x0061
        L_0x004f:
            r7 = r11 & 384(0x180, float:5.38E-43)
            if (r7 != 0) goto L_0x004c
            r7 = r31
            boolean r8 = r1.W(r7)
            if (r8 == 0) goto L_0x005e
            r8 = 256(0x100, float:3.59E-43)
            goto L_0x0060
        L_0x005e:
            r8 = 128(0x80, float:1.794E-43)
        L_0x0060:
            r3 = r3 | r8
        L_0x0061:
            r8 = r12 & 8
            if (r8 == 0) goto L_0x006a
            r3 = r3 | 3072(0xc00, float:4.305E-42)
        L_0x0067:
            r9 = r32
            goto L_0x007c
        L_0x006a:
            r9 = r11 & 3072(0xc00, float:4.305E-42)
            if (r9 != 0) goto L_0x0067
            r9 = r32
            boolean r10 = r1.l(r9)
            if (r10 == 0) goto L_0x0079
            r10 = 2048(0x800, float:2.87E-42)
            goto L_0x007b
        L_0x0079:
            r10 = 1024(0x400, float:1.435E-42)
        L_0x007b:
            r3 = r3 | r10
        L_0x007c:
            r10 = r12 & 16
            if (r10 == 0) goto L_0x0085
            r3 = r3 | 24576(0x6000, float:3.4438E-41)
        L_0x0082:
            r13 = r33
            goto L_0x0097
        L_0x0085:
            r13 = r11 & 24576(0x6000, float:3.4438E-41)
            if (r13 != 0) goto L_0x0082
            r13 = r33
            boolean r14 = r1.i(r13)
            if (r14 == 0) goto L_0x0094
            r14 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0096
        L_0x0094:
            r14 = 8192(0x2000, float:1.14794E-41)
        L_0x0096:
            r3 = r3 | r14
        L_0x0097:
            r14 = r12 & 32
            r15 = 196608(0x30000, float:2.75506E-40)
            if (r14 == 0) goto L_0x00a1
            r3 = r3 | r15
        L_0x009e:
            r15 = r34
            goto L_0x00b3
        L_0x00a1:
            r15 = r15 & r11
            if (r15 != 0) goto L_0x009e
            r15 = r34
            boolean r16 = r1.d(r15)
            if (r16 == 0) goto L_0x00af
            r16 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00b1
        L_0x00af:
            r16 = 65536(0x10000, float:9.18355E-41)
        L_0x00b1:
            r3 = r3 | r16
        L_0x00b3:
            r16 = r12 & 64
            r17 = 1572864(0x180000, float:2.204052E-39)
            if (r16 == 0) goto L_0x00be
            r3 = r3 | r17
            r0 = r35
            goto L_0x00d1
        L_0x00be:
            r17 = r11 & r17
            r0 = r35
            if (r17 != 0) goto L_0x00d1
            boolean r18 = r1.i(r0)
            if (r18 == 0) goto L_0x00cd
            r18 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00cf
        L_0x00cd:
            r18 = 524288(0x80000, float:7.34684E-40)
        L_0x00cf:
            r3 = r3 | r18
        L_0x00d1:
            r0 = r12 & 128(0x80, float:1.794E-43)
            r18 = 12582912(0xc00000, float:1.7632415E-38)
            if (r0 == 0) goto L_0x00dc
            r3 = r3 | r18
            r2 = r36
            goto L_0x00ef
        L_0x00dc:
            r18 = r11 & r18
            r2 = r36
            if (r18 != 0) goto L_0x00ef
            boolean r18 = r1.i(r2)
            if (r18 == 0) goto L_0x00eb
            r18 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00ed
        L_0x00eb:
            r18 = 4194304(0x400000, float:5.877472E-39)
        L_0x00ed:
            r3 = r3 | r18
        L_0x00ef:
            r2 = r12 & 256(0x100, float:3.59E-43)
            r18 = 100663296(0x6000000, float:2.4074124E-35)
            if (r2 == 0) goto L_0x00fa
            r3 = r3 | r18
            r5 = r37
            goto L_0x010d
        L_0x00fa:
            r18 = r11 & r18
            r5 = r37
            if (r18 != 0) goto L_0x010d
            boolean r18 = r1.l(r5)
            if (r18 == 0) goto L_0x0109
            r18 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x010b
        L_0x0109:
            r18 = 33554432(0x2000000, float:9.403955E-38)
        L_0x010b:
            r3 = r3 | r18
        L_0x010d:
            r5 = r12 & 512(0x200, float:7.175E-43)
            r18 = 805306368(0x30000000, float:4.656613E-10)
            if (r5 == 0) goto L_0x0118
            r3 = r3 | r18
            r7 = r38
            goto L_0x012b
        L_0x0118:
            r18 = r11 & r18
            r7 = r38
            if (r18 != 0) goto L_0x012b
            boolean r18 = r1.l(r7)
            if (r18 == 0) goto L_0x0127
            r18 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x0129
        L_0x0127:
            r18 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x0129:
            r3 = r3 | r18
        L_0x012b:
            r18 = 306783379(0x12492493, float:6.34695E-28)
            r7 = r3 & r18
            r9 = 306783378(0x12492492, float:6.3469493E-28)
            r18 = 1
            if (r7 == r9) goto L_0x013a
            r7 = r18
            goto L_0x013b
        L_0x013a:
            r7 = 0
        L_0x013b:
            r9 = r3 & 1
            boolean r7 = r1.E(r7, r9)
            if (r7 == 0) goto L_0x01d0
            if (r4 == 0) goto L_0x0148
            androidx.compose.ui.Modifier$Companion r4 = androidx.compose.ui.Modifier.f15489d
            goto L_0x014a
        L_0x0148:
            r4 = r30
        L_0x014a:
            if (r6 == 0) goto L_0x0153
            androidx.compose.ui.text.TextStyle$Companion r6 = androidx.compose.ui.text.TextStyle.f18499d
            androidx.compose.ui.text.TextStyle r6 = r6.a()
            goto L_0x0155
        L_0x0153:
            r6 = r31
        L_0x0155:
            r7 = 0
            if (r8 == 0) goto L_0x015a
            r8 = r7
            goto L_0x015c
        L_0x015a:
            r8 = r32
        L_0x015c:
            if (r10 == 0) goto L_0x0165
            androidx.compose.ui.text.style.TextOverflow$Companion r9 = androidx.compose.ui.text.style.TextOverflow.f19125b
            int r9 = r9.a()
            goto L_0x0166
        L_0x0165:
            r9 = r13
        L_0x0166:
            if (r14 == 0) goto L_0x016b
            r10 = r18
            goto L_0x016c
        L_0x016b:
            r10 = r15
        L_0x016c:
            if (r16 == 0) goto L_0x0174
            r13 = 2147483647(0x7fffffff, float:NaN)
            r28 = r13
            goto L_0x0176
        L_0x0174:
            r28 = r35
        L_0x0176:
            if (r0 == 0) goto L_0x017b
            r0 = r18
            goto L_0x017d
        L_0x017b:
            r0 = r36
        L_0x017d:
            if (r2 == 0) goto L_0x0184
            java.util.Map r2 = kotlin.collections.MapsKt.h()
            goto L_0x0186
        L_0x0184:
            r2 = r37
        L_0x0186:
            if (r5 == 0) goto L_0x0189
            goto L_0x018b
        L_0x0189:
            r7 = r38
        L_0x018b:
            boolean r5 = androidx.compose.runtime.ComposerKt.P()
            if (r5 == 0) goto L_0x019a
            r5 = -1
            java.lang.String r13 = "androidx.compose.foundation.text.BasicText (BasicText.kt:343)"
            r14 = -1064305212(0xffffffffc08ffdc4, float:-4.4997272)
            androidx.compose.runtime.ComposerKt.Y(r14, r3, r5, r13)
        L_0x019a:
            r5 = 2147483646(0x7ffffffe, float:NaN)
            r25 = r3 & r5
            r26 = 0
            r27 = 1024(0x400, float:1.435E-42)
            r23 = 0
            r13 = r29
            r14 = r4
            r15 = r6
            r16 = r8
            r17 = r9
            r18 = r10
            r19 = r28
            r20 = r0
            r21 = r2
            r22 = r7
            r24 = r1
            d(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            boolean r3 = androidx.compose.runtime.ComposerKt.P()
            if (r3 == 0) goto L_0x01c5
            androidx.compose.runtime.ComposerKt.X()
        L_0x01c5:
            r3 = r6
            r5 = r9
            r6 = r10
            r9 = r2
            r2 = r4
            r10 = r7
            r4 = r8
            r7 = r28
            r8 = r0
            goto L_0x01e3
        L_0x01d0:
            r1.B()
            r2 = r30
            r3 = r31
            r4 = r32
            r7 = r35
            r8 = r36
            r9 = r37
            r10 = r38
            r5 = r13
            r6 = r15
        L_0x01e3:
            androidx.compose.runtime.ScopeUpdateScope r13 = r1.x()
            if (r13 == 0) goto L_0x01f8
            androidx.compose.foundation.text.BasicTextKt$BasicText$5 r14 = new androidx.compose.foundation.text.BasicTextKt$BasicText$5
            r0 = r14
            r1 = r29
            r11 = r40
            r12 = r41
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            r13.a(r14)
        L_0x01f8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.BasicTextKt.e(androidx.compose.ui.text.AnnotatedString, androidx.compose.ui.Modifier, androidx.compose.ui.text.TextStyle, kotlin.jvm.functions.Function1, int, boolean, int, int, java.util.Map, androidx.compose.ui.graphics.ColorProducer, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v17, resolved type: kotlin.jvm.functions.Function0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v8, resolved type: androidx.compose.foundation.text.modifiers.SelectionController} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v15, resolved type: androidx.compose.foundation.text.modifiers.SelectionController} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r37v4, resolved type: androidx.compose.foundation.text.modifiers.SelectionController} */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x01d6, code lost:
        if (r1 == androidx.compose.runtime.Composer.f14567a.a()) goto L_0x01db;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x021d, code lost:
        if (r15 == androidx.compose.runtime.Composer.f14567a.a()) goto L_0x021f;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x013d  */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x0140  */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x0149  */
    /* JADX WARNING: Removed duplicated region for block: B:179:0x0354  */
    /* JADX WARNING: Removed duplicated region for block: B:182:0x036d  */
    /* JADX WARNING: Removed duplicated region for block: B:184:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x007d  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00a0  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00b9  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00be  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x00d7  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x00dc  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x00f5  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x00fa  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x0116  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void f(java.lang.String r36, androidx.compose.ui.Modifier r37, androidx.compose.ui.text.TextStyle r38, kotlin.jvm.functions.Function1 r39, int r40, boolean r41, int r42, int r43, androidx.compose.ui.graphics.ColorProducer r44, androidx.compose.foundation.text.TextAutoSize r45, androidx.compose.runtime.Composer r46, int r47, int r48) {
        /*
            r1 = r36
            r0 = r45
            r11 = r47
            r12 = r48
            r2 = -1040751001(0xffffffffc1f76667, float:-30.925001)
            r3 = r46
            androidx.compose.runtime.Composer r3 = r3.q(r2)
            r4 = r12 & 1
            if (r4 == 0) goto L_0x0018
            r4 = r11 | 6
            goto L_0x0028
        L_0x0018:
            r4 = r11 & 6
            if (r4 != 0) goto L_0x0027
            boolean r4 = r3.W(r1)
            if (r4 == 0) goto L_0x0024
            r4 = 4
            goto L_0x0025
        L_0x0024:
            r4 = 2
        L_0x0025:
            r4 = r4 | r11
            goto L_0x0028
        L_0x0027:
            r4 = r11
        L_0x0028:
            r6 = r12 & 2
            if (r6 == 0) goto L_0x0031
            r4 = r4 | 48
        L_0x002e:
            r7 = r37
            goto L_0x0043
        L_0x0031:
            r7 = r11 & 48
            if (r7 != 0) goto L_0x002e
            r7 = r37
            boolean r8 = r3.W(r7)
            if (r8 == 0) goto L_0x0040
            r8 = 32
            goto L_0x0042
        L_0x0040:
            r8 = 16
        L_0x0042:
            r4 = r4 | r8
        L_0x0043:
            r8 = r12 & 4
            if (r8 == 0) goto L_0x004c
            r4 = r4 | 384(0x180, float:5.38E-43)
        L_0x0049:
            r9 = r38
            goto L_0x005e
        L_0x004c:
            r9 = r11 & 384(0x180, float:5.38E-43)
            if (r9 != 0) goto L_0x0049
            r9 = r38
            boolean r10 = r3.W(r9)
            if (r10 == 0) goto L_0x005b
            r10 = 256(0x100, float:3.59E-43)
            goto L_0x005d
        L_0x005b:
            r10 = 128(0x80, float:1.794E-43)
        L_0x005d:
            r4 = r4 | r10
        L_0x005e:
            r10 = r12 & 8
            if (r10 == 0) goto L_0x0067
            r4 = r4 | 3072(0xc00, float:4.305E-42)
        L_0x0064:
            r13 = r39
            goto L_0x0079
        L_0x0067:
            r13 = r11 & 3072(0xc00, float:4.305E-42)
            if (r13 != 0) goto L_0x0064
            r13 = r39
            boolean r14 = r3.l(r13)
            if (r14 == 0) goto L_0x0076
            r14 = 2048(0x800, float:2.87E-42)
            goto L_0x0078
        L_0x0076:
            r14 = 1024(0x400, float:1.435E-42)
        L_0x0078:
            r4 = r4 | r14
        L_0x0079:
            r14 = r12 & 16
            if (r14 == 0) goto L_0x0082
            r4 = r4 | 24576(0x6000, float:3.4438E-41)
        L_0x007f:
            r15 = r40
            goto L_0x0095
        L_0x0082:
            r15 = r11 & 24576(0x6000, float:3.4438E-41)
            if (r15 != 0) goto L_0x007f
            r15 = r40
            boolean r16 = r3.i(r15)
            if (r16 == 0) goto L_0x0091
            r16 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0093
        L_0x0091:
            r16 = 8192(0x2000, float:1.14794E-41)
        L_0x0093:
            r4 = r4 | r16
        L_0x0095:
            r16 = r12 & 32
            r17 = 196608(0x30000, float:2.75506E-40)
            if (r16 == 0) goto L_0x00a0
            r4 = r4 | r17
            r5 = r41
            goto L_0x00b3
        L_0x00a0:
            r17 = r11 & r17
            r5 = r41
            if (r17 != 0) goto L_0x00b3
            boolean r17 = r3.d(r5)
            if (r17 == 0) goto L_0x00af
            r17 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00b1
        L_0x00af:
            r17 = 65536(0x10000, float:9.18355E-41)
        L_0x00b1:
            r4 = r4 | r17
        L_0x00b3:
            r17 = r12 & 64
            r18 = 1572864(0x180000, float:2.204052E-39)
            if (r17 == 0) goto L_0x00be
            r4 = r4 | r18
            r2 = r42
            goto L_0x00d1
        L_0x00be:
            r18 = r11 & r18
            r2 = r42
            if (r18 != 0) goto L_0x00d1
            boolean r19 = r3.i(r2)
            if (r19 == 0) goto L_0x00cd
            r19 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00cf
        L_0x00cd:
            r19 = 524288(0x80000, float:7.34684E-40)
        L_0x00cf:
            r4 = r4 | r19
        L_0x00d1:
            r2 = r12 & 128(0x80, float:1.794E-43)
            r19 = 12582912(0xc00000, float:1.7632415E-38)
            if (r2 == 0) goto L_0x00dc
            r4 = r4 | r19
            r5 = r43
            goto L_0x00ef
        L_0x00dc:
            r19 = r11 & r19
            r5 = r43
            if (r19 != 0) goto L_0x00ef
            boolean r19 = r3.i(r5)
            if (r19 == 0) goto L_0x00eb
            r19 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00ed
        L_0x00eb:
            r19 = 4194304(0x400000, float:5.877472E-39)
        L_0x00ed:
            r4 = r4 | r19
        L_0x00ef:
            r5 = r12 & 256(0x100, float:3.59E-43)
            r19 = 100663296(0x6000000, float:2.4074124E-35)
            if (r5 == 0) goto L_0x00fa
            r4 = r4 | r19
            r7 = r44
            goto L_0x010d
        L_0x00fa:
            r19 = r11 & r19
            r7 = r44
            if (r19 != 0) goto L_0x010d
            boolean r19 = r3.l(r7)
            if (r19 == 0) goto L_0x0109
            r19 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x010b
        L_0x0109:
            r19 = 33554432(0x2000000, float:9.403955E-38)
        L_0x010b:
            r4 = r4 | r19
        L_0x010d:
            r7 = r12 & 512(0x200, float:7.175E-43)
            r19 = 805306368(0x30000000, float:4.656613E-10)
            if (r7 == 0) goto L_0x0116
        L_0x0113:
            r4 = r4 | r19
            goto L_0x0131
        L_0x0116:
            r19 = r11 & r19
            if (r19 != 0) goto L_0x0131
            r19 = 1073741824(0x40000000, float:2.0)
            r19 = r11 & r19
            if (r19 != 0) goto L_0x0125
            boolean r19 = r3.W(r0)
            goto L_0x0129
        L_0x0125:
            boolean r19 = r3.l(r0)
        L_0x0129:
            if (r19 == 0) goto L_0x012e
            r19 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x0113
        L_0x012e:
            r19 = 268435456(0x10000000, float:2.5243549E-29)
            goto L_0x0113
        L_0x0131:
            r19 = 306783379(0x12492493, float:6.34695E-28)
            r0 = r4 & r19
            r9 = 306783378(0x12492492, float:6.3469493E-28)
            r19 = 1
            if (r0 == r9) goto L_0x0140
            r0 = r19
            goto L_0x0141
        L_0x0140:
            r0 = 0
        L_0x0141:
            r9 = r4 & 1
            boolean r0 = r3.E(r0, r9)
            if (r0 == 0) goto L_0x0354
            if (r6 == 0) goto L_0x014e
            androidx.compose.ui.Modifier$Companion r0 = androidx.compose.ui.Modifier.f15489d
            goto L_0x0150
        L_0x014e:
            r0 = r37
        L_0x0150:
            if (r8 == 0) goto L_0x0159
            androidx.compose.ui.text.TextStyle$Companion r6 = androidx.compose.ui.text.TextStyle.f18499d
            androidx.compose.ui.text.TextStyle r6 = r6.a()
            goto L_0x015b
        L_0x0159:
            r6 = r38
        L_0x015b:
            if (r10 == 0) goto L_0x015e
            r13 = 0
        L_0x015e:
            if (r14 == 0) goto L_0x0167
            androidx.compose.ui.text.style.TextOverflow$Companion r9 = androidx.compose.ui.text.style.TextOverflow.f19125b
            int r9 = r9.a()
            goto L_0x0168
        L_0x0167:
            r9 = r15
        L_0x0168:
            if (r16 == 0) goto L_0x016d
            r10 = r19
            goto L_0x016f
        L_0x016d:
            r10 = r41
        L_0x016f:
            if (r17 == 0) goto L_0x0175
            r14 = 2147483647(0x7fffffff, float:NaN)
            goto L_0x0177
        L_0x0175:
            r14 = r42
        L_0x0177:
            if (r2 == 0) goto L_0x017c
            r2 = r19
            goto L_0x017e
        L_0x017c:
            r2 = r43
        L_0x017e:
            if (r5 == 0) goto L_0x0182
            r5 = 0
            goto L_0x0184
        L_0x0182:
            r5 = r44
        L_0x0184:
            if (r7 == 0) goto L_0x0188
            r7 = 0
            goto L_0x018a
        L_0x0188:
            r7 = r45
        L_0x018a:
            boolean r15 = androidx.compose.runtime.ComposerKt.P()
            if (r15 == 0) goto L_0x0199
            r15 = -1
            java.lang.String r11 = "androidx.compose.foundation.text.BasicText (BasicText.kt:101)"
            r8 = -1040751001(0xffffffffc1f76667, float:-30.925001)
            androidx.compose.runtime.ComposerKt.Y(r8, r4, r15, r11)
        L_0x0199:
            androidx.compose.foundation.text.HeightInLinesModifierKt.b(r2, r14)
            androidx.compose.runtime.ProvidableCompositionLocal r4 = androidx.compose.foundation.text.selection.SelectionRegistrarKt.a()
            java.lang.Object r4 = r3.C(r4)
            androidx.compose.foundation.text.selection.SelectionRegistrar r4 = (androidx.compose.foundation.text.selection.SelectionRegistrar) r4
            if (r4 == 0) goto L_0x0243
            r8 = -1588802442(0xffffffffa14ccc76, float:-6.938849E-19)
            r3.X(r8)
            androidx.compose.runtime.ProvidableCompositionLocal r8 = androidx.compose.foundation.text.selection.TextSelectionColorsKt.b()
            java.lang.Object r8 = r3.C(r8)
            androidx.compose.foundation.text.selection.TextSelectionColors r8 = (androidx.compose.foundation.text.selection.TextSelectionColors) r8
            long r11 = r8.a()
            java.lang.Object[] r8 = new java.lang.Object[]{r4}
            androidx.compose.runtime.saveable.Saver r15 = p(r4)
            boolean r18 = r3.l(r4)
            java.lang.Object r1 = r3.g()
            if (r18 != 0) goto L_0x01d9
            androidx.compose.runtime.Composer$Companion r18 = androidx.compose.runtime.Composer.f14567a
            r19 = r0
            java.lang.Object r0 = r18.a()
            if (r1 != r0) goto L_0x01e3
            goto L_0x01db
        L_0x01d9:
            r19 = r0
        L_0x01db:
            androidx.compose.foundation.text.BasicTextKt$BasicText$selectionController$selectableId$1$1 r1 = new androidx.compose.foundation.text.BasicTextKt$BasicText$selectionController$selectableId$1$1
            r1.<init>(r4)
            r3.N(r1)
        L_0x01e3:
            r0 = r1
            kotlin.jvm.functions.Function0 r0 = (kotlin.jvm.functions.Function0) r0
            r1 = 0
            r18 = 4
            r20 = 0
            r37 = r8
            r38 = r15
            r39 = r20
            r40 = r0
            r41 = r3
            r42 = r1
            r43 = r18
            java.lang.Object r0 = androidx.compose.runtime.saveable.RememberSaveableKt.h(r37, r38, r39, r40, r41, r42, r43)
            java.lang.Number r0 = (java.lang.Number) r0
            long r0 = r0.longValue()
            boolean r8 = r3.j(r0)
            boolean r15 = r3.W(r4)
            r8 = r8 | r15
            boolean r15 = r3.j(r11)
            r8 = r8 | r15
            java.lang.Object r15 = r3.g()
            if (r8 != 0) goto L_0x021f
            androidx.compose.runtime.Composer$Companion r8 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r8 = r8.a()
            if (r15 != r8) goto L_0x023b
        L_0x021f:
            androidx.compose.foundation.text.modifiers.SelectionController r15 = new androidx.compose.foundation.text.modifiers.SelectionController
            r8 = 8
            r18 = 0
            r20 = 0
            r37 = r15
            r38 = r0
            r40 = r4
            r41 = r11
            r43 = r20
            r44 = r8
            r45 = r18
            r37.<init>(r38, r40, r41, r43, r44, r45)
            r3.N(r15)
        L_0x023b:
            androidx.compose.foundation.text.modifiers.SelectionController r15 = (androidx.compose.foundation.text.modifiers.SelectionController) r15
            r3.M()
            r31 = r15
            goto L_0x0250
        L_0x0243:
            r19 = r0
            r0 = -1588311278(0xffffffffa1544b12, float:-7.192775E-19)
            r3.X(r0)
            r3.M()
            r31 = 0
        L_0x0250:
            if (r31 != 0) goto L_0x0256
            if (r13 != 0) goto L_0x0256
            if (r7 == 0) goto L_0x0259
        L_0x0256:
            r1 = r19
            goto L_0x028f
        L_0x0259:
            r0 = -1587511974(0xffffffffa1607d5a, float:-7.6060053E-19)
            r3.X(r0)
            androidx.compose.foundation.text.modifiers.TextStringSimpleElement r0 = new androidx.compose.foundation.text.modifiers.TextStringSimpleElement
            androidx.compose.runtime.ProvidableCompositionLocal r1 = androidx.compose.ui.platform.CompositionLocalsKt.i()
            java.lang.Object r1 = r3.C(r1)
            androidx.compose.ui.text.font.FontFamily$Resolver r1 = (androidx.compose.ui.text.font.FontFamily.Resolver) r1
            r4 = 0
            r37 = r0
            r38 = r36
            r39 = r6
            r40 = r1
            r41 = r9
            r42 = r10
            r43 = r14
            r44 = r2
            r45 = r5
            r46 = r4
            r37.<init>(r38, r39, r40, r41, r42, r43, r44, r45, r46)
            r1 = r19
            androidx.compose.ui.Modifier r0 = r1.o0(r0)
            r3.M()
            r4 = r36
            goto L_0x02cb
        L_0x028f:
            r0 = -1588155131(0xffffffffa156ad05, float:-7.273501E-19)
            r3.X(r0)
            androidx.compose.ui.text.AnnotatedString r0 = new androidx.compose.ui.text.AnnotatedString
            r8 = 2
            r11 = 0
            r4 = r36
            r0.<init>(r4, r11, r8, r11)
            androidx.compose.runtime.ProvidableCompositionLocal r8 = androidx.compose.ui.platform.CompositionLocalsKt.i()
            java.lang.Object r8 = r3.C(r8)
            r28 = r8
            androidx.compose.ui.text.font.FontFamily$Resolver r28 = (androidx.compose.ui.text.font.FontFamily.Resolver) r28
            r30 = 0
            r33 = 0
            r29 = 0
            r20 = r1
            r21 = r0
            r22 = r6
            r23 = r13
            r24 = r9
            r25 = r10
            r26 = r14
            r27 = r2
            r32 = r5
            r34 = r7
            androidx.compose.ui.Modifier r0 = q(r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34)
            r3.M()
        L_0x02cb:
            androidx.compose.foundation.text.EmptyMeasurePolicy r8 = androidx.compose.foundation.text.EmptyMeasurePolicy.f5730a
            r11 = 0
            int r11 = androidx.compose.runtime.ComposablesKt.a(r3, r11)
            androidx.compose.ui.Modifier r0 = androidx.compose.ui.ComposedModifierKt.e(r3, r0)
            androidx.compose.runtime.CompositionLocalMap r12 = r3.I()
            androidx.compose.ui.node.ComposeUiNode$Companion r15 = androidx.compose.ui.node.ComposeUiNode.f17222h
            r19 = r1
            kotlin.jvm.functions.Function0 r1 = r15.a()
            androidx.compose.runtime.Applier r16 = r3.v()
            if (r16 != 0) goto L_0x02eb
            androidx.compose.runtime.ComposablesKt.d()
        L_0x02eb:
            r3.s()
            boolean r16 = r3.n()
            if (r16 == 0) goto L_0x02f8
            r3.y(r1)
            goto L_0x02fb
        L_0x02f8:
            r3.K()
        L_0x02fb:
            androidx.compose.runtime.Composer r1 = androidx.compose.runtime.Updater.b(r3)
            r16 = r2
            kotlin.jvm.functions.Function2 r2 = r15.c()
            androidx.compose.runtime.Updater.g(r1, r8, r2)
            kotlin.jvm.functions.Function2 r2 = r15.e()
            androidx.compose.runtime.Updater.g(r1, r12, r2)
            kotlin.jvm.functions.Function2 r2 = r15.d()
            androidx.compose.runtime.Updater.g(r1, r0, r2)
            kotlin.jvm.functions.Function2 r0 = r15.b()
            boolean r2 = r1.n()
            if (r2 != 0) goto L_0x032e
            java.lang.Object r2 = r1.g()
            java.lang.Integer r8 = java.lang.Integer.valueOf(r11)
            boolean r2 = kotlin.jvm.internal.Intrinsics.d(r2, r8)
            if (r2 != 0) goto L_0x033c
        L_0x032e:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r11)
            r1.N(r2)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r11)
            r1.A(r2, r0)
        L_0x033c:
            r3.T()
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x0348
            androidx.compose.runtime.ComposerKt.X()
        L_0x0348:
            r11 = r7
            r7 = r14
            r8 = r16
            r2 = r19
            r35 = r9
            r9 = r5
            r5 = r35
            goto L_0x0367
        L_0x0354:
            r4 = r1
            r3.B()
            r2 = r37
            r6 = r38
            r10 = r41
            r7 = r42
            r8 = r43
            r9 = r44
            r11 = r45
            r5 = r15
        L_0x0367:
            androidx.compose.runtime.ScopeUpdateScope r14 = r3.x()
            if (r14 == 0) goto L_0x0380
            androidx.compose.foundation.text.BasicTextKt$BasicText$1 r15 = new androidx.compose.foundation.text.BasicTextKt$BasicText$1
            r0 = r15
            r1 = r36
            r3 = r6
            r4 = r13
            r6 = r10
            r10 = r11
            r11 = r47
            r12 = r48
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            r14.a(r15)
        L_0x0380:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.BasicTextKt.f(java.lang.String, androidx.compose.ui.Modifier, androidx.compose.ui.text.TextStyle, kotlin.jvm.functions.Function1, int, boolean, int, int, androidx.compose.ui.graphics.ColorProducer, androidx.compose.foundation.text.TextAutoSize, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:102:0x0125  */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x01a6  */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x01bc  */
    /* JADX WARNING: Removed duplicated region for block: B:138:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00a1  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00b9  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00be  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x00d7  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x00dc  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x00f5  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x00fa  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x0119  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x011c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final /* synthetic */ void g(androidx.compose.ui.text.AnnotatedString r27, androidx.compose.ui.Modifier r28, androidx.compose.ui.text.TextStyle r29, kotlin.jvm.functions.Function1 r30, int r31, boolean r32, int r33, int r34, java.util.Map r35, androidx.compose.runtime.Composer r36, int r37, int r38) {
        /*
            r10 = r37
            r11 = r38
            r0 = 851408699(0x32bf773b, float:2.2289546E-8)
            r1 = r36
            androidx.compose.runtime.Composer r1 = r1.q(r0)
            r2 = r11 & 1
            if (r2 == 0) goto L_0x0017
            r2 = r10 | 6
            r3 = r2
            r2 = r27
            goto L_0x002b
        L_0x0017:
            r2 = r10 & 6
            if (r2 != 0) goto L_0x0028
            r2 = r27
            boolean r3 = r1.W(r2)
            if (r3 == 0) goto L_0x0025
            r3 = 4
            goto L_0x0026
        L_0x0025:
            r3 = 2
        L_0x0026:
            r3 = r3 | r10
            goto L_0x002b
        L_0x0028:
            r2 = r27
            r3 = r10
        L_0x002b:
            r4 = r11 & 2
            if (r4 == 0) goto L_0x0034
            r3 = r3 | 48
        L_0x0031:
            r5 = r28
            goto L_0x0046
        L_0x0034:
            r5 = r10 & 48
            if (r5 != 0) goto L_0x0031
            r5 = r28
            boolean r6 = r1.W(r5)
            if (r6 == 0) goto L_0x0043
            r6 = 32
            goto L_0x0045
        L_0x0043:
            r6 = 16
        L_0x0045:
            r3 = r3 | r6
        L_0x0046:
            r6 = r11 & 4
            if (r6 == 0) goto L_0x004f
            r3 = r3 | 384(0x180, float:5.38E-43)
        L_0x004c:
            r7 = r29
            goto L_0x0061
        L_0x004f:
            r7 = r10 & 384(0x180, float:5.38E-43)
            if (r7 != 0) goto L_0x004c
            r7 = r29
            boolean r8 = r1.W(r7)
            if (r8 == 0) goto L_0x005e
            r8 = 256(0x100, float:3.59E-43)
            goto L_0x0060
        L_0x005e:
            r8 = 128(0x80, float:1.794E-43)
        L_0x0060:
            r3 = r3 | r8
        L_0x0061:
            r8 = r11 & 8
            if (r8 == 0) goto L_0x006a
            r3 = r3 | 3072(0xc00, float:4.305E-42)
        L_0x0067:
            r9 = r30
            goto L_0x007c
        L_0x006a:
            r9 = r10 & 3072(0xc00, float:4.305E-42)
            if (r9 != 0) goto L_0x0067
            r9 = r30
            boolean r12 = r1.l(r9)
            if (r12 == 0) goto L_0x0079
            r12 = 2048(0x800, float:2.87E-42)
            goto L_0x007b
        L_0x0079:
            r12 = 1024(0x400, float:1.435E-42)
        L_0x007b:
            r3 = r3 | r12
        L_0x007c:
            r12 = r11 & 16
            if (r12 == 0) goto L_0x0085
            r3 = r3 | 24576(0x6000, float:3.4438E-41)
        L_0x0082:
            r13 = r31
            goto L_0x0097
        L_0x0085:
            r13 = r10 & 24576(0x6000, float:3.4438E-41)
            if (r13 != 0) goto L_0x0082
            r13 = r31
            boolean r14 = r1.i(r13)
            if (r14 == 0) goto L_0x0094
            r14 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0096
        L_0x0094:
            r14 = 8192(0x2000, float:1.14794E-41)
        L_0x0096:
            r3 = r3 | r14
        L_0x0097:
            r14 = r11 & 32
            r15 = 196608(0x30000, float:2.75506E-40)
            if (r14 == 0) goto L_0x00a1
            r3 = r3 | r15
        L_0x009e:
            r15 = r32
            goto L_0x00b3
        L_0x00a1:
            r15 = r15 & r10
            if (r15 != 0) goto L_0x009e
            r15 = r32
            boolean r16 = r1.d(r15)
            if (r16 == 0) goto L_0x00af
            r16 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00b1
        L_0x00af:
            r16 = 65536(0x10000, float:9.18355E-41)
        L_0x00b1:
            r3 = r3 | r16
        L_0x00b3:
            r16 = r11 & 64
            r17 = 1572864(0x180000, float:2.204052E-39)
            if (r16 == 0) goto L_0x00be
            r3 = r3 | r17
            r0 = r33
            goto L_0x00d1
        L_0x00be:
            r17 = r10 & r17
            r0 = r33
            if (r17 != 0) goto L_0x00d1
            boolean r18 = r1.i(r0)
            if (r18 == 0) goto L_0x00cd
            r18 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00cf
        L_0x00cd:
            r18 = 524288(0x80000, float:7.34684E-40)
        L_0x00cf:
            r3 = r3 | r18
        L_0x00d1:
            r0 = r11 & 128(0x80, float:1.794E-43)
            r18 = 12582912(0xc00000, float:1.7632415E-38)
            if (r0 == 0) goto L_0x00dc
            r3 = r3 | r18
            r2 = r34
            goto L_0x00ef
        L_0x00dc:
            r18 = r10 & r18
            r2 = r34
            if (r18 != 0) goto L_0x00ef
            boolean r18 = r1.i(r2)
            if (r18 == 0) goto L_0x00eb
            r18 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00ed
        L_0x00eb:
            r18 = 4194304(0x400000, float:5.877472E-39)
        L_0x00ed:
            r3 = r3 | r18
        L_0x00ef:
            r2 = r11 & 256(0x100, float:3.59E-43)
            r18 = 100663296(0x6000000, float:2.4074124E-35)
            if (r2 == 0) goto L_0x00fa
            r3 = r3 | r18
            r5 = r35
            goto L_0x010d
        L_0x00fa:
            r18 = r10 & r18
            r5 = r35
            if (r18 != 0) goto L_0x010d
            boolean r18 = r1.l(r5)
            if (r18 == 0) goto L_0x0109
            r18 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x010b
        L_0x0109:
            r18 = 33554432(0x2000000, float:9.403955E-38)
        L_0x010b:
            r3 = r3 | r18
        L_0x010d:
            r18 = 38347923(0x2492493, float:1.4777644E-37)
            r5 = r3 & r18
            r7 = 38347922(0x2492492, float:1.4777643E-37)
            r18 = 1
            if (r5 == r7) goto L_0x011c
            r5 = r18
            goto L_0x011d
        L_0x011c:
            r5 = 0
        L_0x011d:
            r7 = r3 & 1
            boolean r5 = r1.E(r5, r7)
            if (r5 == 0) goto L_0x01a6
            if (r4 == 0) goto L_0x012a
            androidx.compose.ui.Modifier$Companion r4 = androidx.compose.ui.Modifier.f15489d
            goto L_0x012c
        L_0x012a:
            r4 = r28
        L_0x012c:
            if (r6 == 0) goto L_0x0135
            androidx.compose.ui.text.TextStyle$Companion r5 = androidx.compose.ui.text.TextStyle.f18499d
            androidx.compose.ui.text.TextStyle r5 = r5.a()
            goto L_0x0137
        L_0x0135:
            r5 = r29
        L_0x0137:
            if (r8 == 0) goto L_0x013b
            r6 = 0
            goto L_0x013c
        L_0x013b:
            r6 = r9
        L_0x013c:
            if (r12 == 0) goto L_0x0145
            androidx.compose.ui.text.style.TextOverflow$Companion r7 = androidx.compose.ui.text.style.TextOverflow.f19125b
            int r7 = r7.a()
            goto L_0x0146
        L_0x0145:
            r7 = r13
        L_0x0146:
            if (r14 == 0) goto L_0x014b
            r8 = r18
            goto L_0x014c
        L_0x014b:
            r8 = r15
        L_0x014c:
            if (r16 == 0) goto L_0x0152
            r9 = 2147483647(0x7fffffff, float:NaN)
            goto L_0x0154
        L_0x0152:
            r9 = r33
        L_0x0154:
            if (r0 == 0) goto L_0x0159
            r0 = r18
            goto L_0x015b
        L_0x0159:
            r0 = r34
        L_0x015b:
            if (r2 == 0) goto L_0x0162
            java.util.Map r2 = kotlin.collections.MapsKt.h()
            goto L_0x0164
        L_0x0162:
            r2 = r35
        L_0x0164:
            boolean r12 = androidx.compose.runtime.ComposerKt.P()
            if (r12 == 0) goto L_0x0173
            r12 = -1
            java.lang.String r13 = "androidx.compose.foundation.text.BasicText (BasicText.kt:432)"
            r14 = 851408699(0x32bf773b, float:2.2289546E-8)
            androidx.compose.runtime.ComposerKt.Y(r14, r3, r12, r13)
        L_0x0173:
            r12 = 268435454(0xffffffe, float:2.5243546E-29)
            r24 = r3 & r12
            r25 = 0
            r26 = 1536(0x600, float:2.152E-42)
            r21 = 0
            r22 = 0
            r12 = r27
            r13 = r4
            r14 = r5
            r15 = r6
            r16 = r7
            r17 = r8
            r18 = r9
            r19 = r0
            r20 = r2
            r23 = r1
            d(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            boolean r3 = androidx.compose.runtime.ComposerKt.P()
            if (r3 == 0) goto L_0x019d
            androidx.compose.runtime.ComposerKt.X()
        L_0x019d:
            r3 = r5
            r5 = r7
            r7 = r9
            r9 = r2
            r2 = r4
            r4 = r6
            r6 = r8
            r8 = r0
            goto L_0x01b6
        L_0x01a6:
            r1.B()
            r2 = r28
            r3 = r29
            r7 = r33
            r8 = r34
            r4 = r9
            r5 = r13
            r6 = r15
            r9 = r35
        L_0x01b6:
            androidx.compose.runtime.ScopeUpdateScope r12 = r1.x()
            if (r12 == 0) goto L_0x01cb
            androidx.compose.foundation.text.BasicTextKt$BasicText$9 r13 = new androidx.compose.foundation.text.BasicTextKt$BasicText$9
            r0 = r13
            r1 = r27
            r10 = r37
            r11 = r38
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r12.a(r13)
        L_0x01cb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.BasicTextKt.g(androidx.compose.ui.text.AnnotatedString, androidx.compose.ui.Modifier, androidx.compose.ui.text.TextStyle, kotlin.jvm.functions.Function1, int, boolean, int, int, java.util.Map, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:102:0x0125  */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x01a0  */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x01b6  */
    /* JADX WARNING: Removed duplicated region for block: B:137:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00a1  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00b9  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00be  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x00d7  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x00dc  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x00f5  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x00fa  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x0119  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x011c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final /* synthetic */ void h(java.lang.String r26, androidx.compose.ui.Modifier r27, androidx.compose.ui.text.TextStyle r28, kotlin.jvm.functions.Function1 r29, int r30, boolean r31, int r32, int r33, androidx.compose.ui.graphics.ColorProducer r34, androidx.compose.runtime.Composer r35, int r36, int r37) {
        /*
            r10 = r36
            r11 = r37
            r0 = -1186827822(0xffffffffb94271d2, float:-1.8543683E-4)
            r1 = r35
            androidx.compose.runtime.Composer r1 = r1.q(r0)
            r2 = r11 & 1
            if (r2 == 0) goto L_0x0017
            r2 = r10 | 6
            r3 = r2
            r2 = r26
            goto L_0x002b
        L_0x0017:
            r2 = r10 & 6
            if (r2 != 0) goto L_0x0028
            r2 = r26
            boolean r3 = r1.W(r2)
            if (r3 == 0) goto L_0x0025
            r3 = 4
            goto L_0x0026
        L_0x0025:
            r3 = 2
        L_0x0026:
            r3 = r3 | r10
            goto L_0x002b
        L_0x0028:
            r2 = r26
            r3 = r10
        L_0x002b:
            r4 = r11 & 2
            if (r4 == 0) goto L_0x0034
            r3 = r3 | 48
        L_0x0031:
            r5 = r27
            goto L_0x0046
        L_0x0034:
            r5 = r10 & 48
            if (r5 != 0) goto L_0x0031
            r5 = r27
            boolean r6 = r1.W(r5)
            if (r6 == 0) goto L_0x0043
            r6 = 32
            goto L_0x0045
        L_0x0043:
            r6 = 16
        L_0x0045:
            r3 = r3 | r6
        L_0x0046:
            r6 = r11 & 4
            if (r6 == 0) goto L_0x004f
            r3 = r3 | 384(0x180, float:5.38E-43)
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
            r3 = r3 | r8
        L_0x0061:
            r8 = r11 & 8
            if (r8 == 0) goto L_0x006a
            r3 = r3 | 3072(0xc00, float:4.305E-42)
        L_0x0067:
            r9 = r29
            goto L_0x007c
        L_0x006a:
            r9 = r10 & 3072(0xc00, float:4.305E-42)
            if (r9 != 0) goto L_0x0067
            r9 = r29
            boolean r12 = r1.l(r9)
            if (r12 == 0) goto L_0x0079
            r12 = 2048(0x800, float:2.87E-42)
            goto L_0x007b
        L_0x0079:
            r12 = 1024(0x400, float:1.435E-42)
        L_0x007b:
            r3 = r3 | r12
        L_0x007c:
            r12 = r11 & 16
            if (r12 == 0) goto L_0x0085
            r3 = r3 | 24576(0x6000, float:3.4438E-41)
        L_0x0082:
            r13 = r30
            goto L_0x0097
        L_0x0085:
            r13 = r10 & 24576(0x6000, float:3.4438E-41)
            if (r13 != 0) goto L_0x0082
            r13 = r30
            boolean r14 = r1.i(r13)
            if (r14 == 0) goto L_0x0094
            r14 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0096
        L_0x0094:
            r14 = 8192(0x2000, float:1.14794E-41)
        L_0x0096:
            r3 = r3 | r14
        L_0x0097:
            r14 = r11 & 32
            r15 = 196608(0x30000, float:2.75506E-40)
            if (r14 == 0) goto L_0x00a1
            r3 = r3 | r15
        L_0x009e:
            r15 = r31
            goto L_0x00b3
        L_0x00a1:
            r15 = r15 & r10
            if (r15 != 0) goto L_0x009e
            r15 = r31
            boolean r16 = r1.d(r15)
            if (r16 == 0) goto L_0x00af
            r16 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00b1
        L_0x00af:
            r16 = 65536(0x10000, float:9.18355E-41)
        L_0x00b1:
            r3 = r3 | r16
        L_0x00b3:
            r16 = r11 & 64
            r17 = 1572864(0x180000, float:2.204052E-39)
            if (r16 == 0) goto L_0x00be
            r3 = r3 | r17
            r0 = r32
            goto L_0x00d1
        L_0x00be:
            r17 = r10 & r17
            r0 = r32
            if (r17 != 0) goto L_0x00d1
            boolean r18 = r1.i(r0)
            if (r18 == 0) goto L_0x00cd
            r18 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00cf
        L_0x00cd:
            r18 = 524288(0x80000, float:7.34684E-40)
        L_0x00cf:
            r3 = r3 | r18
        L_0x00d1:
            r0 = r11 & 128(0x80, float:1.794E-43)
            r18 = 12582912(0xc00000, float:1.7632415E-38)
            if (r0 == 0) goto L_0x00dc
            r3 = r3 | r18
            r2 = r33
            goto L_0x00ef
        L_0x00dc:
            r18 = r10 & r18
            r2 = r33
            if (r18 != 0) goto L_0x00ef
            boolean r18 = r1.i(r2)
            if (r18 == 0) goto L_0x00eb
            r18 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00ed
        L_0x00eb:
            r18 = 4194304(0x400000, float:5.877472E-39)
        L_0x00ed:
            r3 = r3 | r18
        L_0x00ef:
            r2 = r11 & 256(0x100, float:3.59E-43)
            r18 = 100663296(0x6000000, float:2.4074124E-35)
            if (r2 == 0) goto L_0x00fa
            r3 = r3 | r18
            r5 = r34
            goto L_0x010d
        L_0x00fa:
            r18 = r10 & r18
            r5 = r34
            if (r18 != 0) goto L_0x010d
            boolean r18 = r1.l(r5)
            if (r18 == 0) goto L_0x0109
            r18 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x010b
        L_0x0109:
            r18 = 33554432(0x2000000, float:9.403955E-38)
        L_0x010b:
            r3 = r3 | r18
        L_0x010d:
            r18 = 38347923(0x2492493, float:1.4777644E-37)
            r5 = r3 & r18
            r7 = 38347922(0x2492492, float:1.4777643E-37)
            r18 = 1
            if (r5 == r7) goto L_0x011c
            r5 = r18
            goto L_0x011d
        L_0x011c:
            r5 = 0
        L_0x011d:
            r7 = r3 & 1
            boolean r5 = r1.E(r5, r7)
            if (r5 == 0) goto L_0x01a0
            if (r4 == 0) goto L_0x012a
            androidx.compose.ui.Modifier$Companion r4 = androidx.compose.ui.Modifier.f15489d
            goto L_0x012c
        L_0x012a:
            r4 = r27
        L_0x012c:
            if (r6 == 0) goto L_0x0135
            androidx.compose.ui.text.TextStyle$Companion r5 = androidx.compose.ui.text.TextStyle.f18499d
            androidx.compose.ui.text.TextStyle r5 = r5.a()
            goto L_0x0137
        L_0x0135:
            r5 = r28
        L_0x0137:
            r6 = 0
            if (r8 == 0) goto L_0x013b
            r9 = r6
        L_0x013b:
            if (r12 == 0) goto L_0x0144
            androidx.compose.ui.text.style.TextOverflow$Companion r7 = androidx.compose.ui.text.style.TextOverflow.f19125b
            int r7 = r7.a()
            goto L_0x0145
        L_0x0144:
            r7 = r13
        L_0x0145:
            if (r14 == 0) goto L_0x014a
            r8 = r18
            goto L_0x014b
        L_0x014a:
            r8 = r15
        L_0x014b:
            if (r16 == 0) goto L_0x0153
            r12 = 2147483647(0x7fffffff, float:NaN)
            r25 = r12
            goto L_0x0155
        L_0x0153:
            r25 = r32
        L_0x0155:
            if (r0 == 0) goto L_0x015a
            r0 = r18
            goto L_0x015c
        L_0x015a:
            r0 = r33
        L_0x015c:
            if (r2 == 0) goto L_0x015f
            goto L_0x0161
        L_0x015f:
            r6 = r34
        L_0x0161:
            boolean r2 = androidx.compose.runtime.ComposerKt.P()
            if (r2 == 0) goto L_0x0170
            r2 = -1
            java.lang.String r12 = "androidx.compose.foundation.text.BasicText (BasicText.kt:301)"
            r13 = -1186827822(0xffffffffb94271d2, float:-1.8543683E-4)
            androidx.compose.runtime.ComposerKt.Y(r13, r3, r2, r12)
        L_0x0170:
            r2 = 268435454(0xffffffe, float:2.5243546E-29)
            r23 = r3 & r2
            r24 = 512(0x200, float:7.175E-43)
            r21 = 0
            r12 = r26
            r13 = r4
            r14 = r5
            r15 = r9
            r16 = r7
            r17 = r8
            r18 = r25
            r19 = r0
            r20 = r6
            r22 = r1
            f(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            boolean r2 = androidx.compose.runtime.ComposerKt.P()
            if (r2 == 0) goto L_0x0196
            androidx.compose.runtime.ComposerKt.X()
        L_0x0196:
            r2 = r4
            r3 = r5
            r5 = r7
            r4 = r9
            r7 = r25
            r9 = r6
            r6 = r8
            r8 = r0
            goto L_0x01b0
        L_0x01a0:
            r1.B()
            r2 = r27
            r3 = r28
            r7 = r32
            r8 = r33
            r4 = r9
            r5 = r13
            r6 = r15
            r9 = r34
        L_0x01b0:
            androidx.compose.runtime.ScopeUpdateScope r12 = r1.x()
            if (r12 == 0) goto L_0x01c5
            androidx.compose.foundation.text.BasicTextKt$BasicText$4 r13 = new androidx.compose.foundation.text.BasicTextKt$BasicText$4
            r0 = r13
            r1 = r26
            r10 = r36
            r11 = r37
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r12.a(r13)
        L_0x01c5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.BasicTextKt.h(java.lang.String, androidx.compose.ui.Modifier, androidx.compose.ui.text.TextStyle, kotlin.jvm.functions.Function1, int, boolean, int, int, androidx.compose.ui.graphics.ColorProducer, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final AnnotatedString i(MutableState mutableState) {
        return (AnnotatedString) mutableState.getValue();
    }

    public static final void j(MutableState mutableState, AnnotatedString annotatedString) {
        mutableState.setValue(annotatedString);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v3, resolved type: kotlin.jvm.functions.Function1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v25, resolved type: androidx.compose.runtime.MutableState} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r34v1, resolved type: androidx.compose.runtime.MutableState} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v27, resolved type: androidx.compose.runtime.MutableState} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v29, resolved type: androidx.compose.runtime.MutableState} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x0143  */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x014a  */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x0165  */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x016c  */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x0181  */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x0186  */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x01a1  */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x01a6  */
    /* JADX WARNING: Removed duplicated region for block: B:154:0x01c1  */
    /* JADX WARNING: Removed duplicated region for block: B:155:0x01c4  */
    /* JADX WARNING: Removed duplicated region for block: B:169:0x01f0  */
    /* JADX WARNING: Removed duplicated region for block: B:170:0x01f2  */
    /* JADX WARNING: Removed duplicated region for block: B:173:0x01fc  */
    /* JADX WARNING: Removed duplicated region for block: B:284:0x04bb  */
    /* JADX WARNING: Removed duplicated region for block: B:287:0x04c7  */
    /* JADX WARNING: Removed duplicated region for block: B:289:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00af  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00b4  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00cd  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00d2  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x00e9  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x00ef  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0108  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x010c  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x0121  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x0127  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void k(androidx.compose.ui.Modifier r30, androidx.compose.ui.text.AnnotatedString r31, kotlin.jvm.functions.Function1 r32, boolean r33, java.util.Map r34, androidx.compose.ui.text.TextStyle r35, int r36, boolean r37, int r38, int r39, androidx.compose.ui.text.font.FontFamily.Resolver r40, androidx.compose.foundation.text.modifiers.SelectionController r41, androidx.compose.ui.graphics.ColorProducer r42, kotlin.jvm.functions.Function1 r43, androidx.compose.foundation.text.TextAutoSize r44, androidx.compose.runtime.Composer r45, int r46, int r47, int r48) {
        /*
            r2 = r31
            r3 = r32
            r4 = r33
            r1 = r44
            r0 = r46
            r15 = r47
            r14 = r48
            r7 = 12582912(0xc00000, float:1.7632415E-38)
            r13 = 128(0x80, float:1.794E-43)
            r8 = 32
            r17 = 16
            r9 = -2118572703(0xffffffff81b92561, float:-6.8011903E-38)
            r10 = r45
            androidx.compose.runtime.Composer r10 = r10.q(r9)
            r20 = 1
            r21 = r14 & 1
            r22 = 4
            r9 = 2
            if (r21 == 0) goto L_0x002f
            r21 = r0 | 6
            r11 = r30
            r23 = r21
            goto L_0x0045
        L_0x002f:
            r21 = r0 & 6
            r11 = r30
            if (r21 != 0) goto L_0x0043
            boolean r23 = r10.W(r11)
            if (r23 == 0) goto L_0x003e
            r23 = r22
            goto L_0x0040
        L_0x003e:
            r23 = r9
        L_0x0040:
            r23 = r0 | r23
            goto L_0x0045
        L_0x0043:
            r23 = r0
        L_0x0045:
            r24 = r14 & 2
            if (r24 == 0) goto L_0x004e
            r23 = r23 | 48
        L_0x004b:
            r9 = r23
            goto L_0x0060
        L_0x004e:
            r24 = r0 & 48
            if (r24 != 0) goto L_0x004b
            boolean r24 = r10.W(r2)
            if (r24 == 0) goto L_0x005b
            r24 = r8
            goto L_0x005d
        L_0x005b:
            r24 = r17
        L_0x005d:
            r23 = r23 | r24
            goto L_0x004b
        L_0x0060:
            r23 = r14 & 4
            if (r23 == 0) goto L_0x0067
            r9 = r9 | 384(0x180, float:5.38E-43)
            goto L_0x0076
        L_0x0067:
            r5 = r0 & 384(0x180, float:5.38E-43)
            if (r5 != 0) goto L_0x0076
            boolean r5 = r10.l(r3)
            if (r5 == 0) goto L_0x0074
            r5 = 256(0x100, float:3.59E-43)
            goto L_0x0075
        L_0x0074:
            r5 = r13
        L_0x0075:
            r9 = r9 | r5
        L_0x0076:
            r5 = r14 & 8
            if (r5 == 0) goto L_0x007d
            r9 = r9 | 3072(0xc00, float:4.305E-42)
            goto L_0x008d
        L_0x007d:
            r5 = r0 & 3072(0xc00, float:4.305E-42)
            if (r5 != 0) goto L_0x008d
            boolean r5 = r10.d(r4)
            if (r5 == 0) goto L_0x008a
            r5 = 2048(0x800, float:2.87E-42)
            goto L_0x008c
        L_0x008a:
            r5 = 1024(0x400, float:1.435E-42)
        L_0x008c:
            r9 = r9 | r5
        L_0x008d:
            r5 = r14 & 16
            if (r5 == 0) goto L_0x0096
            r9 = r9 | 24576(0x6000, float:3.4438E-41)
        L_0x0093:
            r6 = r34
            goto L_0x00a9
        L_0x0096:
            r6 = r0 & 24576(0x6000, float:3.4438E-41)
            if (r6 != 0) goto L_0x0093
            r6 = r34
            boolean r25 = r10.l(r6)
            if (r25 == 0) goto L_0x00a5
            r25 = 16384(0x4000, float:2.2959E-41)
            goto L_0x00a7
        L_0x00a5:
            r25 = 8192(0x2000, float:1.14794E-41)
        L_0x00a7:
            r9 = r9 | r25
        L_0x00a9:
            r25 = r14 & 32
            r26 = 196608(0x30000, float:2.75506E-40)
            if (r25 == 0) goto L_0x00b4
            r9 = r9 | r26
            r8 = r35
            goto L_0x00c7
        L_0x00b4:
            r25 = r0 & r26
            r8 = r35
            if (r25 != 0) goto L_0x00c7
            boolean r26 = r10.W(r8)
            if (r26 == 0) goto L_0x00c3
            r26 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00c5
        L_0x00c3:
            r26 = 65536(0x10000, float:9.18355E-41)
        L_0x00c5:
            r9 = r9 | r26
        L_0x00c7:
            r26 = r14 & 64
            r27 = 1572864(0x180000, float:2.204052E-39)
            if (r26 == 0) goto L_0x00d2
            r9 = r9 | r27
            r12 = r36
            goto L_0x00e5
        L_0x00d2:
            r26 = r0 & r27
            r12 = r36
            if (r26 != 0) goto L_0x00e5
            boolean r27 = r10.i(r12)
            if (r27 == 0) goto L_0x00e1
            r27 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00e3
        L_0x00e1:
            r27 = 524288(0x80000, float:7.34684E-40)
        L_0x00e3:
            r9 = r9 | r27
        L_0x00e5:
            r6 = r14 & 128(0x80, float:1.794E-43)
            if (r6 == 0) goto L_0x00ef
            r9 = r9 | r7
            r7 = r37
        L_0x00ec:
            r6 = 256(0x100, float:3.59E-43)
            goto L_0x0102
        L_0x00ef:
            r6 = r0 & r7
            r7 = r37
            if (r6 != 0) goto L_0x00ec
            boolean r6 = r10.d(r7)
            if (r6 == 0) goto L_0x00fe
            r6 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x0100
        L_0x00fe:
            r6 = 4194304(0x400000, float:5.877472E-39)
        L_0x0100:
            r9 = r9 | r6
            goto L_0x00ec
        L_0x0102:
            r13 = r14 & 256(0x100, float:3.59E-43)
            r6 = 100663296(0x6000000, float:2.4074124E-35)
            if (r13 == 0) goto L_0x010c
            r9 = r9 | r6
            r13 = r38
            goto L_0x011d
        L_0x010c:
            r6 = r6 & r0
            r13 = r38
            if (r6 != 0) goto L_0x011d
            boolean r6 = r10.i(r13)
            if (r6 == 0) goto L_0x011a
            r6 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x011c
        L_0x011a:
            r6 = 33554432(0x2000000, float:9.403955E-38)
        L_0x011c:
            r9 = r9 | r6
        L_0x011d:
            r6 = r14 & 512(0x200, float:7.175E-43)
            if (r6 == 0) goto L_0x0127
            r6 = 805306368(0x30000000, float:4.656613E-10)
            r9 = r9 | r6
        L_0x0124:
            r0 = 1024(0x400, float:1.435E-42)
            goto L_0x013f
        L_0x0127:
            r6 = 805306368(0x30000000, float:4.656613E-10)
            r6 = r6 & r0
            if (r6 != 0) goto L_0x013c
            r6 = r39
            boolean r23 = r10.i(r6)
            if (r23 == 0) goto L_0x0137
            r23 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x0139
        L_0x0137:
            r23 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x0139:
            r9 = r9 | r23
            goto L_0x0124
        L_0x013c:
            r6 = r39
            goto L_0x0124
        L_0x013f:
            r6 = r14 & 1024(0x400, float:1.435E-42)
            if (r6 == 0) goto L_0x014a
            r6 = r15 | 6
            r21 = r6
        L_0x0147:
            r0 = 2048(0x800, float:2.87E-42)
            goto L_0x0161
        L_0x014a:
            r6 = r15 & 6
            if (r6 != 0) goto L_0x015c
            r6 = r40
            boolean r21 = r10.l(r6)
            if (r21 == 0) goto L_0x0157
            goto L_0x0159
        L_0x0157:
            r22 = 2
        L_0x0159:
            r21 = r15 | r22
            goto L_0x0147
        L_0x015c:
            r6 = r40
            r21 = r15
            goto L_0x0147
        L_0x0161:
            r6 = r14 & 2048(0x800, float:2.87E-42)
            if (r6 == 0) goto L_0x016c
            r21 = r21 | 48
        L_0x0167:
            r6 = r41
        L_0x0169:
            r0 = r21
            goto L_0x017d
        L_0x016c:
            r6 = r15 & 48
            if (r6 != 0) goto L_0x0167
            r6 = r41
            boolean r22 = r10.l(r6)
            if (r22 == 0) goto L_0x017a
            r17 = 32
        L_0x017a:
            r21 = r21 | r17
            goto L_0x0169
        L_0x017d:
            r6 = r14 & 4096(0x1000, float:5.74E-42)
            if (r6 == 0) goto L_0x0186
            r0 = r0 | 384(0x180, float:5.38E-43)
        L_0x0183:
            r6 = 8192(0x2000, float:1.14794E-41)
            goto L_0x019d
        L_0x0186:
            r6 = r15 & 384(0x180, float:5.38E-43)
            if (r6 != 0) goto L_0x019a
            r6 = r42
            boolean r21 = r10.l(r6)
            if (r21 == 0) goto L_0x0195
            r27 = 256(0x100, float:3.59E-43)
            goto L_0x0197
        L_0x0195:
            r27 = 128(0x80, float:1.794E-43)
        L_0x0197:
            r0 = r0 | r27
            goto L_0x0183
        L_0x019a:
            r6 = r42
            goto L_0x0183
        L_0x019d:
            r7 = r14 & 8192(0x2000, float:1.14794E-41)
            if (r7 == 0) goto L_0x01a6
            r0 = r0 | 3072(0xc00, float:4.305E-42)
        L_0x01a3:
            r6 = 16384(0x4000, float:2.2959E-41)
            goto L_0x01bd
        L_0x01a6:
            r7 = r15 & 3072(0xc00, float:4.305E-42)
            if (r7 != 0) goto L_0x01ba
            r7 = r43
            boolean r18 = r10.l(r7)
            if (r18 == 0) goto L_0x01b5
            r17 = 2048(0x800, float:2.87E-42)
            goto L_0x01b7
        L_0x01b5:
            r17 = 1024(0x400, float:1.435E-42)
        L_0x01b7:
            r0 = r0 | r17
            goto L_0x01a3
        L_0x01ba:
            r7 = r43
            goto L_0x01a3
        L_0x01bd:
            r7 = r14 & 16384(0x4000, float:2.2959E-41)
            if (r7 == 0) goto L_0x01c4
            r0 = r0 | 24576(0x6000, float:3.4438E-41)
            goto L_0x01e0
        L_0x01c4:
            r7 = r15 & 24576(0x6000, float:3.4438E-41)
            if (r7 != 0) goto L_0x01e0
            r7 = 32768(0x8000, float:4.5918E-41)
            r7 = r7 & r15
            if (r7 != 0) goto L_0x01d3
            boolean r7 = r10.W(r1)
            goto L_0x01d7
        L_0x01d3:
            boolean r7 = r10.l(r1)
        L_0x01d7:
            if (r7 == 0) goto L_0x01dc
            r18 = r6
            goto L_0x01de
        L_0x01dc:
            r18 = 8192(0x2000, float:1.14794E-41)
        L_0x01de:
            r0 = r0 | r18
        L_0x01e0:
            r6 = 306783379(0x12492493, float:6.34695E-28)
            r6 = r6 & r9
            r7 = 306783378(0x12492492, float:6.3469493E-28)
            if (r6 != r7) goto L_0x01f2
            r6 = r0 & 9363(0x2493, float:1.312E-41)
            r7 = 9362(0x2492, float:1.3119E-41)
            if (r6 == r7) goto L_0x01f0
            goto L_0x01f2
        L_0x01f0:
            r6 = 0
            goto L_0x01f4
        L_0x01f2:
            r6 = r20
        L_0x01f4:
            r7 = r9 & 1
            boolean r6 = r10.E(r6, r7)
            if (r6 == 0) goto L_0x04bb
            if (r5 == 0) goto L_0x0204
            java.util.Map r5 = kotlin.collections.MapsKt.h()
            r7 = r5
            goto L_0x0206
        L_0x0204:
            r7 = r34
        L_0x0206:
            boolean r5 = androidx.compose.runtime.ComposerKt.P()
            if (r5 == 0) goto L_0x0214
            java.lang.String r5 = "androidx.compose.foundation.text.LayoutWithLinksAndInlineContent (BasicText.kt:630)"
            r6 = -2118572703(0xffffffff81b92561, float:-6.8011903E-38)
            androidx.compose.runtime.ComposerKt.Y(r6, r9, r0, r5)
        L_0x0214:
            boolean r0 = androidx.compose.foundation.text.modifiers.TextAnnotatedStringNodeKt.a(r31)
            r5 = 0
            if (r0 == 0) goto L_0x0248
            r0 = -613484007(0xffffffffdb6efa19, float:-6.726603E16)
            r10.X(r0)
            r0 = r9 & 112(0x70, float:1.57E-43)
            r6 = 32
            if (r0 != r6) goto L_0x022a
            r0 = r20
            goto L_0x022b
        L_0x022a:
            r0 = 0
        L_0x022b:
            java.lang.Object r6 = r10.g()
            if (r0 != 0) goto L_0x0239
            androidx.compose.runtime.Composer$Companion r0 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r0 = r0.a()
            if (r6 != r0) goto L_0x0241
        L_0x0239:
            androidx.compose.foundation.text.TextLinkScope r6 = new androidx.compose.foundation.text.TextLinkScope
            r6.<init>(r2)
            r10.N(r6)
        L_0x0241:
            androidx.compose.foundation.text.TextLinkScope r6 = (androidx.compose.foundation.text.TextLinkScope) r6
            r10.M()
            r0 = r6
            goto L_0x0252
        L_0x0248:
            r0 = -613418350(0xffffffffdb6ffa92, float:-6.7548024E16)
            r10.X(r0)
            r10.M()
            r0 = r5
        L_0x0252:
            boolean r6 = androidx.compose.foundation.text.modifiers.TextAnnotatedStringNodeKt.a(r31)
            if (r6 == 0) goto L_0x0289
            r6 = -613220135(0xffffffffdb7300d9, float:-6.8399351E16)
            r10.X(r6)
            r6 = r9 & 112(0x70, float:1.57E-43)
            r1 = 32
            if (r6 != r1) goto L_0x0267
            r1 = r20
            goto L_0x0268
        L_0x0267:
            r1 = 0
        L_0x0268:
            boolean r6 = r10.W(r0)
            r1 = r1 | r6
            java.lang.Object r6 = r10.g()
            if (r1 != 0) goto L_0x027b
            androidx.compose.runtime.Composer$Companion r1 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r1 = r1.a()
            if (r6 != r1) goto L_0x0283
        L_0x027b:
            androidx.compose.foundation.text.BasicTextKt$LayoutWithLinksAndInlineContent$styledText$1$1 r6 = new androidx.compose.foundation.text.BasicTextKt$LayoutWithLinksAndInlineContent$styledText$1$1
            r6.<init>(r0, r2)
            r10.N(r6)
        L_0x0283:
            kotlin.jvm.functions.Function0 r6 = (kotlin.jvm.functions.Function0) r6
            r10.M()
            goto L_0x02b4
        L_0x0289:
            r1 = -613122857(0xffffffffdb747cd7, float:-6.8817157E16)
            r10.X(r1)
            r1 = r9 & 112(0x70, float:1.57E-43)
            r6 = 32
            if (r1 != r6) goto L_0x0298
            r1 = r20
            goto L_0x0299
        L_0x0298:
            r1 = 0
        L_0x0299:
            java.lang.Object r6 = r10.g()
            if (r1 != 0) goto L_0x02a7
            androidx.compose.runtime.Composer$Companion r1 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r1 = r1.a()
            if (r6 != r1) goto L_0x02af
        L_0x02a7:
            androidx.compose.foundation.text.BasicTextKt$LayoutWithLinksAndInlineContent$styledText$2$1 r6 = new androidx.compose.foundation.text.BasicTextKt$LayoutWithLinksAndInlineContent$styledText$2$1
            r6.<init>(r2)
            r10.N(r6)
        L_0x02af:
            kotlin.jvm.functions.Function0 r6 = (kotlin.jvm.functions.Function0) r6
            r10.M()
        L_0x02b4:
            if (r4 == 0) goto L_0x02bb
            kotlin.Pair r1 = androidx.compose.foundation.text.AnnotatedStringResolveInlineContentKt.c(r2, r7)
            goto L_0x02c0
        L_0x02bb:
            kotlin.Pair r1 = new kotlin.Pair
            r1.<init>(r5, r5)
        L_0x02c0:
            java.lang.Object r16 = r1.a()
            java.util.List r16 = (java.util.List) r16
            java.lang.Object r1 = r1.b()
            java.util.List r1 = (java.util.List) r1
            if (r4 == 0) goto L_0x02f7
            r5 = -612806750(0xffffffffdb794fa2, float:-7.0174826E16)
            r10.X(r5)
            java.lang.Object r5 = r10.g()
            androidx.compose.runtime.Composer$Companion r17 = androidx.compose.runtime.Composer.f14567a
            r18 = r7
            java.lang.Object r7 = r17.a()
            if (r5 != r7) goto L_0x02ec
            r5 = 0
            r7 = 2
            androidx.compose.runtime.MutableState r7 = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.e(r5, r5, r7, r5)
            r10.N(r7)
            goto L_0x02f1
        L_0x02ec:
            r34 = r5
            r5 = 0
            r7 = r34
        L_0x02f1:
            androidx.compose.runtime.MutableState r7 = (androidx.compose.runtime.MutableState) r7
            r10.M()
            goto L_0x0303
        L_0x02f7:
            r18 = r7
            r7 = -612718990(0xffffffffdb7aa672, float:-7.0551753E16)
            r10.X(r7)
            r10.M()
            r7 = r5
        L_0x0303:
            if (r4 == 0) goto L_0x032d
            r5 = -612625741(0xffffffffdb7c12b3, float:-7.0952254E16)
            r10.X(r5)
            boolean r5 = r10.W(r7)
            java.lang.Object r8 = r10.g()
            if (r5 != 0) goto L_0x031d
            androidx.compose.runtime.Composer$Companion r5 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r5 = r5.a()
            if (r8 != r5) goto L_0x0325
        L_0x031d:
            androidx.compose.foundation.text.BasicTextKt$LayoutWithLinksAndInlineContent$onPlaceholderLayout$1$1 r8 = new androidx.compose.foundation.text.BasicTextKt$LayoutWithLinksAndInlineContent$onPlaceholderLayout$1$1
            r8.<init>(r7)
            r10.N(r8)
        L_0x0325:
            kotlin.jvm.functions.Function1 r8 = (kotlin.jvm.functions.Function1) r8
            r10.M()
            r17 = r8
            goto L_0x0338
        L_0x032d:
            r8 = -612554318(0xffffffffdb7d29b2, float:-7.1259014E16)
            r10.X(r8)
            r10.M()
            r17 = r5
        L_0x0338:
            java.lang.Object r5 = r6.invoke()
            r6 = r5
            androidx.compose.ui.text.AnnotatedString r6 = (androidx.compose.ui.text.AnnotatedString) r6
            boolean r5 = r10.l(r0)
            r8 = r9 & 896(0x380, float:1.256E-42)
            r19 = r7
            r7 = 256(0x100, float:3.59E-43)
            if (r8 != r7) goto L_0x034c
            goto L_0x034e
        L_0x034c:
            r20 = 0
        L_0x034e:
            r5 = r5 | r20
            java.lang.Object r7 = r10.g()
            if (r5 != 0) goto L_0x035e
            androidx.compose.runtime.Composer$Companion r5 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r5 = r5.a()
            if (r7 != r5) goto L_0x0366
        L_0x035e:
            androidx.compose.foundation.text.BasicTextKt$LayoutWithLinksAndInlineContent$2$1 r7 = new androidx.compose.foundation.text.BasicTextKt$LayoutWithLinksAndInlineContent$2$1
            r7.<init>(r0, r3)
            r10.N(r7)
        L_0x0366:
            r8 = r7
            kotlin.jvm.functions.Function1 r8 = (kotlin.jvm.functions.Function1) r8
            r5 = r30
            r20 = r18
            r3 = r19
            r7 = r35
            r22 = r9
            r9 = r36
            r2 = r10
            r10 = r37
            r11 = r38
            r12 = r39
            r13 = r40
            r14 = r16
            r15 = r17
            r16 = r41
            r17 = r42
            r18 = r43
            r19 = r44
            androidx.compose.ui.Modifier r5 = q(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            if (r4 != 0) goto L_0x03bc
            r3 = -611542291(0xffffffffdb8c9aed, float:-7.9153679E16)
            r2.X(r3)
            boolean r3 = r2.l(r0)
            java.lang.Object r6 = r2.g()
            if (r3 != 0) goto L_0x03a8
            androidx.compose.runtime.Composer$Companion r3 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r3 = r3.a()
            if (r6 != r3) goto L_0x03b0
        L_0x03a8:
            androidx.compose.foundation.text.BasicTextKt$LayoutWithLinksAndInlineContent$3$1 r6 = new androidx.compose.foundation.text.BasicTextKt$LayoutWithLinksAndInlineContent$3$1
            r6.<init>(r0)
            r2.N(r6)
        L_0x03b0:
            kotlin.jvm.functions.Function0 r6 = (kotlin.jvm.functions.Function0) r6
            androidx.compose.foundation.text.LinksTextMeasurePolicy r3 = new androidx.compose.foundation.text.LinksTextMeasurePolicy
            r3.<init>(r6)
            r2.M()
        L_0x03ba:
            r6 = 0
            goto L_0x0403
        L_0x03bc:
            r6 = -611365560(0xffffffffdb8f4d48, float:-8.0671787E16)
            r2.X(r6)
            boolean r6 = r2.l(r0)
            java.lang.Object r7 = r2.g()
            if (r6 != 0) goto L_0x03d4
            androidx.compose.runtime.Composer$Companion r6 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r6 = r6.a()
            if (r7 != r6) goto L_0x03dc
        L_0x03d4:
            androidx.compose.foundation.text.BasicTextKt$LayoutWithLinksAndInlineContent$4$1 r7 = new androidx.compose.foundation.text.BasicTextKt$LayoutWithLinksAndInlineContent$4$1
            r7.<init>(r0)
            r2.N(r7)
        L_0x03dc:
            kotlin.jvm.functions.Function0 r7 = (kotlin.jvm.functions.Function0) r7
            boolean r6 = r2.W(r3)
            java.lang.Object r8 = r2.g()
            if (r6 != 0) goto L_0x03f0
            androidx.compose.runtime.Composer$Companion r6 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r6 = r6.a()
            if (r8 != r6) goto L_0x03f8
        L_0x03f0:
            androidx.compose.foundation.text.BasicTextKt$LayoutWithLinksAndInlineContent$5$1 r8 = new androidx.compose.foundation.text.BasicTextKt$LayoutWithLinksAndInlineContent$5$1
            r8.<init>(r3)
            r2.N(r8)
        L_0x03f8:
            kotlin.jvm.functions.Function0 r8 = (kotlin.jvm.functions.Function0) r8
            androidx.compose.foundation.text.TextMeasurePolicy r3 = new androidx.compose.foundation.text.TextMeasurePolicy
            r3.<init>(r7, r8)
            r2.M()
            goto L_0x03ba
        L_0x0403:
            int r7 = androidx.compose.runtime.ComposablesKt.a(r2, r6)
            androidx.compose.runtime.CompositionLocalMap r6 = r2.I()
            androidx.compose.ui.Modifier r5 = androidx.compose.ui.ComposedModifierKt.e(r2, r5)
            androidx.compose.ui.node.ComposeUiNode$Companion r8 = androidx.compose.ui.node.ComposeUiNode.f17222h
            kotlin.jvm.functions.Function0 r9 = r8.a()
            androidx.compose.runtime.Applier r10 = r2.v()
            if (r10 != 0) goto L_0x041e
            androidx.compose.runtime.ComposablesKt.d()
        L_0x041e:
            r2.s()
            boolean r10 = r2.n()
            if (r10 == 0) goto L_0x042b
            r2.y(r9)
            goto L_0x042e
        L_0x042b:
            r2.K()
        L_0x042e:
            androidx.compose.runtime.Composer r9 = androidx.compose.runtime.Updater.b(r2)
            kotlin.jvm.functions.Function2 r10 = r8.c()
            androidx.compose.runtime.Updater.g(r9, r3, r10)
            kotlin.jvm.functions.Function2 r3 = r8.e()
            androidx.compose.runtime.Updater.g(r9, r6, r3)
            kotlin.jvm.functions.Function2 r3 = r8.b()
            boolean r6 = r9.n()
            if (r6 != 0) goto L_0x0458
            java.lang.Object r6 = r9.g()
            java.lang.Integer r10 = java.lang.Integer.valueOf(r7)
            boolean r6 = kotlin.jvm.internal.Intrinsics.d(r6, r10)
            if (r6 != 0) goto L_0x0466
        L_0x0458:
            java.lang.Integer r6 = java.lang.Integer.valueOf(r7)
            r9.N(r6)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r7)
            r9.A(r6, r3)
        L_0x0466:
            kotlin.jvm.functions.Function2 r3 = r8.d()
            androidx.compose.runtime.Updater.g(r9, r5, r3)
            if (r0 != 0) goto L_0x0479
            r0 = -509592027(0xffffffffe1a03e25, float:-3.6949463E20)
            r2.X(r0)
            r2.M()
            goto L_0x0488
        L_0x0479:
            r3 = 537750876(0x200d6d5c, float:1.1979349E-19)
            r2.X(r3)
            r3 = 0
            r0.b(r2, r3)
            r2.M()
            kotlin.Unit r0 = kotlin.Unit.f40552a
        L_0x0488:
            if (r1 != 0) goto L_0x0497
            r0 = -509541249(0xffffffffe1a1047f, float:-3.7128122E20)
            r2.X(r0)
            r2.M()
            r3 = r2
            r2 = r31
            goto L_0x04ac
        L_0x0497:
            r0 = -509541248(0xffffffffe1a10480, float:-3.7128126E20)
            r2.X(r0)
            int r0 = r22 >> 3
            r0 = r0 & 14
            r3 = r2
            r2 = r31
            androidx.compose.foundation.text.AnnotatedStringResolveInlineContentKt.a(r2, r1, r3, r0)
            kotlin.Unit r0 = kotlin.Unit.f40552a
            r3.M()
        L_0x04ac:
            r3.T()
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x04b8
            androidx.compose.runtime.ComposerKt.X()
        L_0x04b8:
            r5 = r20
            goto L_0x04c1
        L_0x04bb:
            r3 = r10
            r3.B()
            r5 = r34
        L_0x04c1:
            androidx.compose.runtime.ScopeUpdateScope r15 = r3.x()
            if (r15 == 0) goto L_0x04fa
            androidx.compose.foundation.text.BasicTextKt$LayoutWithLinksAndInlineContent$6 r14 = new androidx.compose.foundation.text.BasicTextKt$LayoutWithLinksAndInlineContent$6
            r0 = r14
            r1 = r30
            r2 = r31
            r3 = r32
            r4 = r33
            r6 = r35
            r7 = r36
            r8 = r37
            r9 = r38
            r10 = r39
            r11 = r40
            r12 = r41
            r13 = r42
            r28 = r14
            r14 = r43
            r29 = r15
            r15 = r44
            r16 = r46
            r17 = r47
            r18 = r48
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            r1 = r28
            r0 = r29
            r0.a(r1)
        L_0x04fa:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.BasicTextKt.k(androidx.compose.ui.Modifier, androidx.compose.ui.text.AnnotatedString, kotlin.jvm.functions.Function1, boolean, java.util.Map, androidx.compose.ui.text.TextStyle, int, boolean, int, int, androidx.compose.ui.text.font.FontFamily$Resolver, androidx.compose.foundation.text.modifiers.SelectionController, androidx.compose.ui.graphics.ColorProducer, kotlin.jvm.functions.Function1, androidx.compose.foundation.text.TextAutoSize, androidx.compose.runtime.Composer, int, int, int):void");
    }

    public static final List o(List list, Function0 function0) {
        if (!((Boolean) function0.invoke()).booleanValue()) {
            return null;
        }
        TextRangeLayoutMeasureScope textRangeLayoutMeasureScope = new TextRangeLayoutMeasureScope();
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            Measurable measurable = (Measurable) list.get(i2);
            Object t2 = measurable.t();
            Intrinsics.g(t2, "null cannot be cast to non-null type androidx.compose.foundation.text.TextRangeLayoutModifier");
            TextRangeLayoutMeasureResult a2 = ((TextRangeLayoutModifier) t2).a().a(textRangeLayoutMeasureScope);
            arrayList.add(new Pair(measurable.c0(Constraints.f19137b.b(a2.c(), a2.c(), a2.a(), a2.a())), a2.b()));
        }
        return arrayList;
    }

    public static final Saver p(SelectionRegistrar selectionRegistrar) {
        return SaverKt.e(new BasicTextKt$selectionIdSaver$1(selectionRegistrar), BasicTextKt$selectionIdSaver$2.f5619z);
    }

    public static final Modifier q(Modifier modifier, AnnotatedString annotatedString, TextStyle textStyle, Function1 function1, int i2, boolean z2, int i3, int i4, FontFamily.Resolver resolver, List list, Function1 function12, SelectionController selectionController, ColorProducer colorProducer, Function1 function13, TextAutoSize textAutoSize) {
        Modifier modifier2 = modifier;
        if (selectionController == null) {
            TextAnnotatedStringElement textAnnotatedStringElement = r1;
            TextAnnotatedStringElement textAnnotatedStringElement2 = new TextAnnotatedStringElement(annotatedString, textStyle, resolver, function1, i2, z2, i3, i4, list, function12, (SelectionController) null, colorProducer, textAutoSize, function13, (DefaultConstructorMarker) null);
            return modifier2.o0(Modifier.f15489d).o0(textAnnotatedStringElement);
        }
        SelectableTextAnnotatedStringElement selectableTextAnnotatedStringElement = r1;
        SelectableTextAnnotatedStringElement selectableTextAnnotatedStringElement2 = new SelectableTextAnnotatedStringElement(annotatedString, textStyle, resolver, function1, i2, z2, i3, i4, list, function12, selectionController, colorProducer, textAutoSize, (DefaultConstructorMarker) null);
        return modifier2.o0(selectionController.c()).o0(selectableTextAnnotatedStringElement);
    }
}
