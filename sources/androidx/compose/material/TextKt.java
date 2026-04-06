package androidx.compose.material;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.ui.text.TextStyle;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;

@Metadata
public final class TextKt {

    /* renamed from: a  reason: collision with root package name */
    public static final ProvidableCompositionLocal f8862a = CompositionLocalKt.g(SnapshotStateKt.r(), TextKt$LocalTextStyle$1.f8863z);

    public static final void a(TextStyle textStyle, Function2 function2, Composer composer, int i2) {
        int i3;
        Composer q2 = composer.q(1772272796);
        if ((i2 & 6) == 0) {
            i3 = (q2.W(textStyle) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= q2.l(function2) ? 32 : 16;
        }
        if (q2.E((i3 & 19) != 18, i3 & 1)) {
            if (ComposerKt.P()) {
                ComposerKt.Y(1772272796, i3, -1, "androidx.compose.material.ProvideTextStyle (Text.kt:400)");
            }
            ProvidableCompositionLocal providableCompositionLocal = f8862a;
            CompositionLocalKt.c(providableCompositionLocal.d(((TextStyle) q2.C(providableCompositionLocal)).J(textStyle)), function2, q2, (i3 & 112) | ProvidedValue.f14769i);
            if (ComposerKt.P()) {
                ComposerKt.X();
            }
        } else {
            q2.B();
        }
        ScopeUpdateScope x2 = q2.x();
        if (x2 != null) {
            x2.a(new TextKt$ProvideTextStyle$1(textStyle, function2, i2));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:106:0x0140  */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x0145  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x015f  */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x0164  */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x017f  */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x0184  */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x019b  */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x01a0  */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x01b4  */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x01bb  */
    /* JADX WARNING: Removed duplicated region for block: B:160:0x01d4  */
    /* JADX WARNING: Removed duplicated region for block: B:161:0x01d9  */
    /* JADX WARNING: Removed duplicated region for block: B:169:0x01ee  */
    /* JADX WARNING: Removed duplicated region for block: B:176:0x0202  */
    /* JADX WARNING: Removed duplicated region for block: B:181:0x021a  */
    /* JADX WARNING: Removed duplicated region for block: B:182:0x021c  */
    /* JADX WARNING: Removed duplicated region for block: B:185:0x0226  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:250:0x039b  */
    /* JADX WARNING: Removed duplicated region for block: B:253:0x03c6  */
    /* JADX WARNING: Removed duplicated region for block: B:255:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0091  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00cc  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00d1  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x00ea  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x00ef  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0108  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x010c  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x0124  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x0129  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final /* synthetic */ void b(androidx.compose.ui.text.AnnotatedString r56, androidx.compose.ui.Modifier r57, long r58, long r60, androidx.compose.ui.text.font.FontStyle r62, androidx.compose.ui.text.font.FontWeight r63, androidx.compose.ui.text.font.FontFamily r64, long r65, androidx.compose.ui.text.style.TextDecoration r67, androidx.compose.ui.text.style.TextAlign r68, long r69, int r71, boolean r72, int r73, java.util.Map r74, kotlin.jvm.functions.Function1 r75, androidx.compose.ui.text.TextStyle r76, androidx.compose.runtime.Composer r77, int r78, int r79, int r80) {
        /*
            r14 = r78
            r15 = r79
            r13 = r80
            r0 = -422393234(0xffffffffe6d2ca6e, float:-4.9771557E23)
            r1 = r77
            androidx.compose.runtime.Composer r1 = r1.q(r0)
            r2 = r13 & 1
            if (r2 == 0) goto L_0x0019
            r2 = r14 | 6
            r5 = r2
            r2 = r56
            goto L_0x002d
        L_0x0019:
            r2 = r14 & 6
            if (r2 != 0) goto L_0x002a
            r2 = r56
            boolean r5 = r1.W(r2)
            if (r5 == 0) goto L_0x0027
            r5 = 4
            goto L_0x0028
        L_0x0027:
            r5 = 2
        L_0x0028:
            r5 = r5 | r14
            goto L_0x002d
        L_0x002a:
            r2 = r56
            r5 = r14
        L_0x002d:
            r6 = r13 & 2
            if (r6 == 0) goto L_0x0036
            r5 = r5 | 48
        L_0x0033:
            r9 = r57
            goto L_0x0048
        L_0x0036:
            r9 = r14 & 48
            if (r9 != 0) goto L_0x0033
            r9 = r57
            boolean r10 = r1.W(r9)
            if (r10 == 0) goto L_0x0045
            r10 = 32
            goto L_0x0047
        L_0x0045:
            r10 = 16
        L_0x0047:
            r5 = r5 | r10
        L_0x0048:
            r10 = r13 & 4
            if (r10 == 0) goto L_0x0051
            r5 = r5 | 384(0x180, float:5.38E-43)
            r7 = r58
            goto L_0x0064
        L_0x0051:
            r3 = r14 & 384(0x180, float:5.38E-43)
            r7 = r58
            if (r3 != 0) goto L_0x0064
            boolean r17 = r1.j(r7)
            if (r17 == 0) goto L_0x0060
            r17 = 256(0x100, float:3.59E-43)
            goto L_0x0062
        L_0x0060:
            r17 = 128(0x80, float:1.794E-43)
        L_0x0062:
            r5 = r5 | r17
        L_0x0064:
            r17 = r13 & 8
            r18 = 1024(0x400, float:1.435E-42)
            r19 = 2048(0x800, float:2.87E-42)
            if (r17 == 0) goto L_0x0071
            r5 = r5 | 3072(0xc00, float:4.305E-42)
            r11 = r60
            goto L_0x0084
        L_0x0071:
            r3 = r14 & 3072(0xc00, float:4.305E-42)
            r11 = r60
            if (r3 != 0) goto L_0x0084
            boolean r22 = r1.j(r11)
            if (r22 == 0) goto L_0x0080
            r22 = r19
            goto L_0x0082
        L_0x0080:
            r22 = r18
        L_0x0082:
            r5 = r5 | r22
        L_0x0084:
            r22 = r13 & 16
            r23 = 8192(0x2000, float:1.14794E-41)
            r24 = 16384(0x4000, float:2.2959E-41)
            if (r22 == 0) goto L_0x0091
            r5 = r5 | 24576(0x6000, float:3.4438E-41)
        L_0x008e:
            r3 = r62
            goto L_0x00a4
        L_0x0091:
            r3 = r14 & 24576(0x6000, float:3.4438E-41)
            if (r3 != 0) goto L_0x008e
            r3 = r62
            boolean r26 = r1.W(r3)
            if (r26 == 0) goto L_0x00a0
            r26 = r24
            goto L_0x00a2
        L_0x00a0:
            r26 = r23
        L_0x00a2:
            r5 = r5 | r26
        L_0x00a4:
            r26 = r13 & 32
            r27 = 131072(0x20000, float:1.83671E-40)
            r28 = 196608(0x30000, float:2.75506E-40)
            r29 = 65536(0x10000, float:9.18355E-41)
            if (r26 == 0) goto L_0x00b3
            r5 = r5 | r28
            r4 = r63
            goto L_0x00c6
        L_0x00b3:
            r30 = r14 & r28
            r4 = r63
            if (r30 != 0) goto L_0x00c6
            boolean r31 = r1.W(r4)
            if (r31 == 0) goto L_0x00c2
            r31 = r27
            goto L_0x00c4
        L_0x00c2:
            r31 = r29
        L_0x00c4:
            r5 = r5 | r31
        L_0x00c6:
            r31 = r13 & 64
            r32 = 1572864(0x180000, float:2.204052E-39)
            if (r31 == 0) goto L_0x00d1
            r5 = r5 | r32
            r0 = r64
            goto L_0x00e4
        L_0x00d1:
            r33 = r14 & r32
            r0 = r64
            if (r33 != 0) goto L_0x00e4
            boolean r34 = r1.W(r0)
            if (r34 == 0) goto L_0x00e0
            r34 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00e2
        L_0x00e0:
            r34 = 524288(0x80000, float:7.34684E-40)
        L_0x00e2:
            r5 = r5 | r34
        L_0x00e4:
            r0 = r13 & 128(0x80, float:1.794E-43)
            r34 = 12582912(0xc00000, float:1.7632415E-38)
            if (r0 == 0) goto L_0x00ef
            r5 = r5 | r34
            r2 = r65
            goto L_0x0102
        L_0x00ef:
            r34 = r14 & r34
            r2 = r65
            if (r34 != 0) goto L_0x0102
            boolean r34 = r1.j(r2)
            if (r34 == 0) goto L_0x00fe
            r34 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x0100
        L_0x00fe:
            r34 = 4194304(0x400000, float:5.877472E-39)
        L_0x0100:
            r5 = r5 | r34
        L_0x0102:
            r2 = r13 & 256(0x100, float:3.59E-43)
            r3 = 100663296(0x6000000, float:2.4074124E-35)
            if (r2 == 0) goto L_0x010c
            r5 = r5 | r3
        L_0x0109:
            r3 = r67
            goto L_0x011e
        L_0x010c:
            r3 = r3 & r14
            if (r3 != 0) goto L_0x0109
            r3 = r67
            boolean r34 = r1.W(r3)
            if (r34 == 0) goto L_0x011a
            r34 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x011c
        L_0x011a:
            r34 = 33554432(0x2000000, float:9.403955E-38)
        L_0x011c:
            r5 = r5 | r34
        L_0x011e:
            r3 = r13 & 512(0x200, float:7.175E-43)
            r34 = 805306368(0x30000000, float:4.656613E-10)
            if (r3 == 0) goto L_0x0129
            r5 = r5 | r34
            r4 = r68
            goto L_0x013c
        L_0x0129:
            r34 = r14 & r34
            r4 = r68
            if (r34 != 0) goto L_0x013c
            boolean r34 = r1.W(r4)
            if (r34 == 0) goto L_0x0138
            r34 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x013a
        L_0x0138:
            r34 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x013a:
            r5 = r5 | r34
        L_0x013c:
            r4 = r13 & 1024(0x400, float:1.435E-42)
            if (r4 == 0) goto L_0x0145
            r30 = r15 | 6
            r7 = r69
            goto L_0x015b
        L_0x0145:
            r34 = r15 & 6
            r7 = r69
            if (r34 != 0) goto L_0x0159
            boolean r34 = r1.j(r7)
            if (r34 == 0) goto L_0x0154
            r30 = 4
            goto L_0x0156
        L_0x0154:
            r30 = 2
        L_0x0156:
            r30 = r15 | r30
            goto L_0x015b
        L_0x0159:
            r30 = r15
        L_0x015b:
            r7 = r13 & 2048(0x800, float:2.87E-42)
            if (r7 == 0) goto L_0x0164
            r30 = r30 | 48
        L_0x0161:
            r8 = r30
            goto L_0x017b
        L_0x0164:
            r8 = r15 & 48
            if (r8 != 0) goto L_0x0178
            r8 = r71
            boolean r34 = r1.i(r8)
            if (r34 == 0) goto L_0x0173
            r16 = 32
            goto L_0x0175
        L_0x0173:
            r16 = 16
        L_0x0175:
            r30 = r30 | r16
            goto L_0x0161
        L_0x0178:
            r8 = r71
            goto L_0x0161
        L_0x017b:
            r9 = r13 & 4096(0x1000, float:5.74E-42)
            if (r9 == 0) goto L_0x0184
            r8 = r8 | 384(0x180, float:5.38E-43)
        L_0x0181:
            r11 = r72
            goto L_0x0197
        L_0x0184:
            r11 = r15 & 384(0x180, float:5.38E-43)
            if (r11 != 0) goto L_0x0181
            r11 = r72
            boolean r12 = r1.d(r11)
            if (r12 == 0) goto L_0x0193
            r25 = 256(0x100, float:3.59E-43)
            goto L_0x0195
        L_0x0193:
            r25 = 128(0x80, float:1.794E-43)
        L_0x0195:
            r8 = r8 | r25
        L_0x0197:
            r12 = r13 & 8192(0x2000, float:1.14794E-41)
            if (r12 == 0) goto L_0x01a0
            r8 = r8 | 3072(0xc00, float:4.305E-42)
        L_0x019d:
            r11 = r73
            goto L_0x01b0
        L_0x01a0:
            r11 = r15 & 3072(0xc00, float:4.305E-42)
            if (r11 != 0) goto L_0x019d
            r11 = r73
            boolean r16 = r1.i(r11)
            if (r16 == 0) goto L_0x01ae
            r18 = r19
        L_0x01ae:
            r8 = r8 | r18
        L_0x01b0:
            r11 = r13 & 16384(0x4000, float:2.2959E-41)
            if (r11 == 0) goto L_0x01bb
            r8 = r8 | 24576(0x6000, float:3.4438E-41)
            r16 = r11
        L_0x01b8:
            r11 = r74
            goto L_0x01cd
        L_0x01bb:
            r16 = r11
            r11 = r15 & 24576(0x6000, float:3.4438E-41)
            if (r11 != 0) goto L_0x01b8
            r11 = r74
            boolean r18 = r1.l(r11)
            if (r18 == 0) goto L_0x01cb
            r23 = r24
        L_0x01cb:
            r8 = r8 | r23
        L_0x01cd:
            r18 = 32768(0x8000, float:4.5918E-41)
            r18 = r13 & r18
            if (r18 == 0) goto L_0x01d9
            r8 = r8 | r28
            r11 = r75
            goto L_0x01ea
        L_0x01d9:
            r19 = r15 & r28
            r11 = r75
            if (r19 != 0) goto L_0x01ea
            boolean r19 = r1.l(r11)
            if (r19 == 0) goto L_0x01e6
            goto L_0x01e8
        L_0x01e6:
            r27 = r29
        L_0x01e8:
            r8 = r8 | r27
        L_0x01ea:
            r19 = r15 & r32
            if (r19 != 0) goto L_0x0202
            r19 = r13 & r29
            r11 = r76
            if (r19 != 0) goto L_0x01fd
            boolean r19 = r1.W(r11)
            if (r19 == 0) goto L_0x01fd
            r19 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x01ff
        L_0x01fd:
            r19 = 524288(0x80000, float:7.34684E-40)
        L_0x01ff:
            r8 = r8 | r19
            goto L_0x0204
        L_0x0202:
            r11 = r76
        L_0x0204:
            r19 = 306783379(0x12492493, float:6.34695E-28)
            r11 = r5 & r19
            r15 = 306783378(0x12492492, float:6.3469493E-28)
            r19 = 1
            if (r11 != r15) goto L_0x021c
            r11 = 599187(0x92493, float:8.3964E-40)
            r11 = r11 & r8
            r15 = 599186(0x92492, float:8.39638E-40)
            if (r11 == r15) goto L_0x021a
            goto L_0x021c
        L_0x021a:
            r11 = 0
            goto L_0x021e
        L_0x021c:
            r11 = r19
        L_0x021e:
            r15 = r5 & 1
            boolean r11 = r1.E(r11, r15)
            if (r11 == 0) goto L_0x039b
            r1.p()
            r11 = r14 & 1
            if (r11 == 0) goto L_0x0262
            boolean r11 = r1.J()
            if (r11 == 0) goto L_0x0234
            goto L_0x0262
        L_0x0234:
            r1.B()
            r0 = r13 & r29
            if (r0 == 0) goto L_0x023f
            r0 = -3670017(0xffffffffffc7ffff, float:NaN)
            r8 = r8 & r0
        L_0x023f:
            r6 = r57
            r10 = r58
            r2 = r60
            r0 = r62
            r4 = r63
            r7 = r64
            r12 = r67
            r15 = r68
            r42 = r69
            r44 = r71
            r45 = r72
            r46 = r73
            r47 = r74
            r48 = r75
            r49 = r76
            r13 = r8
            r8 = r65
            goto L_0x0310
        L_0x0262:
            if (r6 == 0) goto L_0x0267
            androidx.compose.ui.Modifier$Companion r6 = androidx.compose.ui.Modifier.f15489d
            goto L_0x0269
        L_0x0267:
            r6 = r57
        L_0x0269:
            if (r10 == 0) goto L_0x0272
            androidx.compose.ui.graphics.Color$Companion r10 = androidx.compose.ui.graphics.Color.f15975b
            long r10 = r10.f()
            goto L_0x0274
        L_0x0272:
            r10 = r58
        L_0x0274:
            if (r17 == 0) goto L_0x027d
            androidx.compose.ui.unit.TextUnit$Companion r15 = androidx.compose.ui.unit.TextUnit.f19177b
            long r20 = r15.a()
            goto L_0x027f
        L_0x027d:
            r20 = r60
        L_0x027f:
            r15 = 0
            if (r22 == 0) goto L_0x0285
            r17 = r15
            goto L_0x0287
        L_0x0285:
            r17 = r62
        L_0x0287:
            if (r26 == 0) goto L_0x028c
            r22 = r15
            goto L_0x028e
        L_0x028c:
            r22 = r63
        L_0x028e:
            if (r31 == 0) goto L_0x0293
            r23 = r15
            goto L_0x0295
        L_0x0293:
            r23 = r64
        L_0x0295:
            if (r0 == 0) goto L_0x029e
            androidx.compose.ui.unit.TextUnit$Companion r0 = androidx.compose.ui.unit.TextUnit.f19177b
            long r24 = r0.a()
            goto L_0x02a0
        L_0x029e:
            r24 = r65
        L_0x02a0:
            if (r2 == 0) goto L_0x02a4
            r0 = r15
            goto L_0x02a6
        L_0x02a4:
            r0 = r67
        L_0x02a6:
            if (r3 == 0) goto L_0x02a9
            goto L_0x02ab
        L_0x02a9:
            r15 = r68
        L_0x02ab:
            if (r4 == 0) goto L_0x02b4
            androidx.compose.ui.unit.TextUnit$Companion r2 = androidx.compose.ui.unit.TextUnit.f19177b
            long r2 = r2.a()
            goto L_0x02b6
        L_0x02b4:
            r2 = r69
        L_0x02b6:
            if (r7 == 0) goto L_0x02bf
            androidx.compose.ui.text.style.TextOverflow$Companion r4 = androidx.compose.ui.text.style.TextOverflow.f19125b
            int r4 = r4.a()
            goto L_0x02c1
        L_0x02bf:
            r4 = r71
        L_0x02c1:
            if (r9 == 0) goto L_0x02c4
            goto L_0x02c6
        L_0x02c4:
            r19 = r72
        L_0x02c6:
            if (r12 == 0) goto L_0x02cc
            r7 = 2147483647(0x7fffffff, float:NaN)
            goto L_0x02ce
        L_0x02cc:
            r7 = r73
        L_0x02ce:
            if (r16 == 0) goto L_0x02d5
            java.util.Map r9 = kotlin.collections.MapsKt.h()
            goto L_0x02d7
        L_0x02d5:
            r9 = r74
        L_0x02d7:
            if (r18 == 0) goto L_0x02dc
            androidx.compose.material.TextKt$Text$8 r12 = androidx.compose.material.TextKt$Text$8.f8880z
            goto L_0x02de
        L_0x02dc:
            r12 = r75
        L_0x02de:
            r16 = r13 & r29
            r57 = r0
            if (r16 == 0) goto L_0x030d
            androidx.compose.runtime.ProvidableCompositionLocal r0 = f8862a
            java.lang.Object r0 = r1.C(r0)
            androidx.compose.ui.text.TextStyle r0 = (androidx.compose.ui.text.TextStyle) r0
            r16 = -3670017(0xffffffffffc7ffff, float:NaN)
            r8 = r8 & r16
            r49 = r0
        L_0x02f3:
            r42 = r2
            r44 = r4
            r46 = r7
            r13 = r8
            r47 = r9
            r48 = r12
            r0 = r17
            r45 = r19
            r2 = r20
            r4 = r22
            r7 = r23
            r8 = r24
            r12 = r57
            goto L_0x0310
        L_0x030d:
            r49 = r76
            goto L_0x02f3
        L_0x0310:
            r1.U()
            boolean r16 = androidx.compose.runtime.ComposerKt.P()
            if (r16 == 0) goto L_0x0324
            java.lang.String r14 = "androidx.compose.material.Text (Text.kt:359)"
            r77 = r1
            r1 = -422393234(0xffffffffe6d2ca6e, float:-4.9771557E23)
            androidx.compose.runtime.ComposerKt.Y(r1, r5, r13, r14)
            goto L_0x0326
        L_0x0324:
            r77 = r1
        L_0x0326:
            r1 = 2147483646(0x7ffffffe, float:NaN)
            r39 = r5 & r1
            r1 = r13 & 14
            r1 = r1 | 24576(0x6000, float:3.4438E-41)
            r5 = r13 & 112(0x70, float:1.57E-43)
            r1 = r1 | r5
            r5 = r13 & 896(0x380, float:1.256E-42)
            r1 = r1 | r5
            r5 = r13 & 7168(0x1c00, float:1.0045E-41)
            r1 = r1 | r5
            int r5 = r13 << 3
            r13 = 458752(0x70000, float:6.42848E-40)
            r13 = r13 & r5
            r1 = r1 | r13
            r13 = 3670016(0x380000, float:5.142788E-39)
            r13 = r13 & r5
            r1 = r1 | r13
            r13 = 29360128(0x1c00000, float:7.052966E-38)
            r5 = r5 & r13
            r40 = r1 | r5
            r41 = 0
            r34 = 1
            r16 = r56
            r17 = r6
            r18 = r10
            r20 = r2
            r22 = r0
            r23 = r4
            r24 = r7
            r25 = r8
            r27 = r12
            r28 = r15
            r29 = r42
            r31 = r44
            r32 = r45
            r33 = r46
            r35 = r47
            r36 = r48
            r37 = r49
            r38 = r77
            d(r16, r17, r18, r20, r22, r23, r24, r25, r27, r28, r29, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41)
            boolean r1 = androidx.compose.runtime.ComposerKt.P()
            if (r1 == 0) goto L_0x037b
            androidx.compose.runtime.ComposerKt.X()
        L_0x037b:
            r13 = r15
            r14 = r42
            r16 = r44
            r17 = r45
            r18 = r46
            r19 = r47
            r20 = r48
            r21 = r49
            r51 = r7
            r7 = r0
            r52 = r8
            r8 = r4
            r9 = r51
            r54 = r2
            r2 = r6
            r5 = r54
            r3 = r10
            r10 = r52
            goto L_0x03c0
        L_0x039b:
            r77 = r1
            r77.B()
            r2 = r57
            r3 = r58
            r5 = r60
            r7 = r62
            r8 = r63
            r9 = r64
            r10 = r65
            r12 = r67
            r13 = r68
            r14 = r69
            r16 = r71
            r17 = r72
            r18 = r73
            r19 = r74
            r20 = r75
            r21 = r76
        L_0x03c0:
            androidx.compose.runtime.ScopeUpdateScope r1 = r77.x()
            if (r1 == 0) goto L_0x03de
            androidx.compose.material.TextKt$Text$9 r0 = new androidx.compose.material.TextKt$Text$9
            r57 = r0
            r50 = r1
            r1 = r56
            r22 = r78
            r23 = r79
            r24 = r80
            r0.<init>(r1, r2, r3, r5, r7, r8, r9, r10, r12, r13, r14, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            r1 = r57
            r0 = r50
            r0.a(r1)
        L_0x03de:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.TextKt.b(androidx.compose.ui.text.AnnotatedString, androidx.compose.ui.Modifier, long, long, androidx.compose.ui.text.font.FontStyle, androidx.compose.ui.text.font.FontWeight, androidx.compose.ui.text.font.FontFamily, long, androidx.compose.ui.text.style.TextDecoration, androidx.compose.ui.text.style.TextAlign, long, int, boolean, int, java.util.Map, kotlin.jvm.functions.Function1, androidx.compose.ui.text.TextStyle, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:106:0x0140  */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x0145  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x015f  */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x0164  */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x017f  */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x0184  */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x019b  */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x01a0  */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x01b4  */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x01bb  */
    /* JADX WARNING: Removed duplicated region for block: B:160:0x01d4  */
    /* JADX WARNING: Removed duplicated region for block: B:161:0x01d9  */
    /* JADX WARNING: Removed duplicated region for block: B:169:0x01ee  */
    /* JADX WARNING: Removed duplicated region for block: B:176:0x0202  */
    /* JADX WARNING: Removed duplicated region for block: B:181:0x021a  */
    /* JADX WARNING: Removed duplicated region for block: B:182:0x021c  */
    /* JADX WARNING: Removed duplicated region for block: B:185:0x0226  */
    /* JADX WARNING: Removed duplicated region for block: B:243:0x02fb  */
    /* JADX WARNING: Removed duplicated region for block: B:244:0x0306  */
    /* JADX WARNING: Removed duplicated region for block: B:247:0x032a  */
    /* JADX WARNING: Removed duplicated region for block: B:248:0x032d  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:254:0x035f  */
    /* JADX WARNING: Removed duplicated region for block: B:256:0x0366  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:264:0x0400  */
    /* JADX WARNING: Removed duplicated region for block: B:266:0x041f  */
    /* JADX WARNING: Removed duplicated region for block: B:269:0x0448  */
    /* JADX WARNING: Removed duplicated region for block: B:271:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0091  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00cc  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00d1  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x00ea  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x00ef  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0108  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x010c  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x0124  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x0129  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void c(java.lang.String r67, androidx.compose.ui.Modifier r68, long r69, long r71, androidx.compose.ui.text.font.FontStyle r73, androidx.compose.ui.text.font.FontWeight r74, androidx.compose.ui.text.font.FontFamily r75, long r76, androidx.compose.ui.text.style.TextDecoration r78, androidx.compose.ui.text.style.TextAlign r79, long r80, int r82, boolean r83, int r84, int r85, kotlin.jvm.functions.Function1 r86, androidx.compose.ui.text.TextStyle r87, androidx.compose.runtime.Composer r88, int r89, int r90, int r91) {
        /*
            r14 = r89
            r15 = r90
            r13 = r91
            r0 = 1028090691(0x3d476b43, float:0.048686277)
            r1 = r88
            androidx.compose.runtime.Composer r1 = r1.q(r0)
            r2 = r13 & 1
            if (r2 == 0) goto L_0x0019
            r2 = r14 | 6
            r5 = r2
            r2 = r67
            goto L_0x002d
        L_0x0019:
            r2 = r14 & 6
            if (r2 != 0) goto L_0x002a
            r2 = r67
            boolean r5 = r1.W(r2)
            if (r5 == 0) goto L_0x0027
            r5 = 4
            goto L_0x0028
        L_0x0027:
            r5 = 2
        L_0x0028:
            r5 = r5 | r14
            goto L_0x002d
        L_0x002a:
            r2 = r67
            r5 = r14
        L_0x002d:
            r6 = r13 & 2
            if (r6 == 0) goto L_0x0036
            r5 = r5 | 48
        L_0x0033:
            r9 = r68
            goto L_0x0048
        L_0x0036:
            r9 = r14 & 48
            if (r9 != 0) goto L_0x0033
            r9 = r68
            boolean r10 = r1.W(r9)
            if (r10 == 0) goto L_0x0045
            r10 = 32
            goto L_0x0047
        L_0x0045:
            r10 = 16
        L_0x0047:
            r5 = r5 | r10
        L_0x0048:
            r10 = r13 & 4
            if (r10 == 0) goto L_0x0051
            r5 = r5 | 384(0x180, float:5.38E-43)
            r7 = r69
            goto L_0x0064
        L_0x0051:
            r3 = r14 & 384(0x180, float:5.38E-43)
            r7 = r69
            if (r3 != 0) goto L_0x0064
            boolean r17 = r1.j(r7)
            if (r17 == 0) goto L_0x0060
            r17 = 256(0x100, float:3.59E-43)
            goto L_0x0062
        L_0x0060:
            r17 = 128(0x80, float:1.794E-43)
        L_0x0062:
            r5 = r5 | r17
        L_0x0064:
            r17 = r13 & 8
            r18 = 1024(0x400, float:1.435E-42)
            r19 = 2048(0x800, float:2.87E-42)
            if (r17 == 0) goto L_0x0071
            r5 = r5 | 3072(0xc00, float:4.305E-42)
            r11 = r71
            goto L_0x0084
        L_0x0071:
            r3 = r14 & 3072(0xc00, float:4.305E-42)
            r11 = r71
            if (r3 != 0) goto L_0x0084
            boolean r22 = r1.j(r11)
            if (r22 == 0) goto L_0x0080
            r22 = r19
            goto L_0x0082
        L_0x0080:
            r22 = r18
        L_0x0082:
            r5 = r5 | r22
        L_0x0084:
            r22 = r13 & 16
            r23 = 8192(0x2000, float:1.14794E-41)
            r24 = 16384(0x4000, float:2.2959E-41)
            if (r22 == 0) goto L_0x0091
            r5 = r5 | 24576(0x6000, float:3.4438E-41)
        L_0x008e:
            r3 = r73
            goto L_0x00a4
        L_0x0091:
            r3 = r14 & 24576(0x6000, float:3.4438E-41)
            if (r3 != 0) goto L_0x008e
            r3 = r73
            boolean r26 = r1.W(r3)
            if (r26 == 0) goto L_0x00a0
            r26 = r24
            goto L_0x00a2
        L_0x00a0:
            r26 = r23
        L_0x00a2:
            r5 = r5 | r26
        L_0x00a4:
            r26 = r13 & 32
            r27 = 131072(0x20000, float:1.83671E-40)
            r28 = 196608(0x30000, float:2.75506E-40)
            r29 = 65536(0x10000, float:9.18355E-41)
            if (r26 == 0) goto L_0x00b3
            r5 = r5 | r28
            r4 = r74
            goto L_0x00c6
        L_0x00b3:
            r30 = r14 & r28
            r4 = r74
            if (r30 != 0) goto L_0x00c6
            boolean r31 = r1.W(r4)
            if (r31 == 0) goto L_0x00c2
            r31 = r27
            goto L_0x00c4
        L_0x00c2:
            r31 = r29
        L_0x00c4:
            r5 = r5 | r31
        L_0x00c6:
            r31 = r13 & 64
            r32 = 1572864(0x180000, float:2.204052E-39)
            if (r31 == 0) goto L_0x00d1
            r5 = r5 | r32
            r0 = r75
            goto L_0x00e4
        L_0x00d1:
            r33 = r14 & r32
            r0 = r75
            if (r33 != 0) goto L_0x00e4
            boolean r34 = r1.W(r0)
            if (r34 == 0) goto L_0x00e0
            r34 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00e2
        L_0x00e0:
            r34 = 524288(0x80000, float:7.34684E-40)
        L_0x00e2:
            r5 = r5 | r34
        L_0x00e4:
            r0 = r13 & 128(0x80, float:1.794E-43)
            r34 = 12582912(0xc00000, float:1.7632415E-38)
            if (r0 == 0) goto L_0x00ef
            r5 = r5 | r34
            r2 = r76
            goto L_0x0102
        L_0x00ef:
            r34 = r14 & r34
            r2 = r76
            if (r34 != 0) goto L_0x0102
            boolean r34 = r1.j(r2)
            if (r34 == 0) goto L_0x00fe
            r34 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x0100
        L_0x00fe:
            r34 = 4194304(0x400000, float:5.877472E-39)
        L_0x0100:
            r5 = r5 | r34
        L_0x0102:
            r2 = r13 & 256(0x100, float:3.59E-43)
            r3 = 100663296(0x6000000, float:2.4074124E-35)
            if (r2 == 0) goto L_0x010c
            r5 = r5 | r3
        L_0x0109:
            r3 = r78
            goto L_0x011e
        L_0x010c:
            r3 = r3 & r14
            if (r3 != 0) goto L_0x0109
            r3 = r78
            boolean r34 = r1.W(r3)
            if (r34 == 0) goto L_0x011a
            r34 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x011c
        L_0x011a:
            r34 = 33554432(0x2000000, float:9.403955E-38)
        L_0x011c:
            r5 = r5 | r34
        L_0x011e:
            r3 = r13 & 512(0x200, float:7.175E-43)
            r34 = 805306368(0x30000000, float:4.656613E-10)
            if (r3 == 0) goto L_0x0129
            r5 = r5 | r34
            r4 = r79
            goto L_0x013c
        L_0x0129:
            r34 = r14 & r34
            r4 = r79
            if (r34 != 0) goto L_0x013c
            boolean r34 = r1.W(r4)
            if (r34 == 0) goto L_0x0138
            r34 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x013a
        L_0x0138:
            r34 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x013a:
            r5 = r5 | r34
        L_0x013c:
            r4 = r13 & 1024(0x400, float:1.435E-42)
            if (r4 == 0) goto L_0x0145
            r30 = r15 | 6
            r7 = r80
            goto L_0x015b
        L_0x0145:
            r34 = r15 & 6
            r7 = r80
            if (r34 != 0) goto L_0x0159
            boolean r34 = r1.j(r7)
            if (r34 == 0) goto L_0x0154
            r30 = 4
            goto L_0x0156
        L_0x0154:
            r30 = 2
        L_0x0156:
            r30 = r15 | r30
            goto L_0x015b
        L_0x0159:
            r30 = r15
        L_0x015b:
            r7 = r13 & 2048(0x800, float:2.87E-42)
            if (r7 == 0) goto L_0x0164
            r30 = r30 | 48
        L_0x0161:
            r8 = r30
            goto L_0x017b
        L_0x0164:
            r8 = r15 & 48
            if (r8 != 0) goto L_0x0178
            r8 = r82
            boolean r34 = r1.i(r8)
            if (r34 == 0) goto L_0x0173
            r16 = 32
            goto L_0x0175
        L_0x0173:
            r16 = 16
        L_0x0175:
            r30 = r30 | r16
            goto L_0x0161
        L_0x0178:
            r8 = r82
            goto L_0x0161
        L_0x017b:
            r9 = r13 & 4096(0x1000, float:5.74E-42)
            if (r9 == 0) goto L_0x0184
            r8 = r8 | 384(0x180, float:5.38E-43)
        L_0x0181:
            r11 = r83
            goto L_0x0197
        L_0x0184:
            r11 = r15 & 384(0x180, float:5.38E-43)
            if (r11 != 0) goto L_0x0181
            r11 = r83
            boolean r12 = r1.d(r11)
            if (r12 == 0) goto L_0x0193
            r25 = 256(0x100, float:3.59E-43)
            goto L_0x0195
        L_0x0193:
            r25 = 128(0x80, float:1.794E-43)
        L_0x0195:
            r8 = r8 | r25
        L_0x0197:
            r12 = r13 & 8192(0x2000, float:1.14794E-41)
            if (r12 == 0) goto L_0x01a0
            r8 = r8 | 3072(0xc00, float:4.305E-42)
        L_0x019d:
            r11 = r84
            goto L_0x01b0
        L_0x01a0:
            r11 = r15 & 3072(0xc00, float:4.305E-42)
            if (r11 != 0) goto L_0x019d
            r11 = r84
            boolean r16 = r1.i(r11)
            if (r16 == 0) goto L_0x01ae
            r18 = r19
        L_0x01ae:
            r8 = r8 | r18
        L_0x01b0:
            r11 = r13 & 16384(0x4000, float:2.2959E-41)
            if (r11 == 0) goto L_0x01bb
            r8 = r8 | 24576(0x6000, float:3.4438E-41)
            r16 = r11
        L_0x01b8:
            r11 = r85
            goto L_0x01cd
        L_0x01bb:
            r16 = r11
            r11 = r15 & 24576(0x6000, float:3.4438E-41)
            if (r11 != 0) goto L_0x01b8
            r11 = r85
            boolean r18 = r1.i(r11)
            if (r18 == 0) goto L_0x01cb
            r23 = r24
        L_0x01cb:
            r8 = r8 | r23
        L_0x01cd:
            r18 = 32768(0x8000, float:4.5918E-41)
            r18 = r13 & r18
            if (r18 == 0) goto L_0x01d9
            r8 = r8 | r28
            r11 = r86
            goto L_0x01ea
        L_0x01d9:
            r19 = r15 & r28
            r11 = r86
            if (r19 != 0) goto L_0x01ea
            boolean r19 = r1.l(r11)
            if (r19 == 0) goto L_0x01e6
            goto L_0x01e8
        L_0x01e6:
            r27 = r29
        L_0x01e8:
            r8 = r8 | r27
        L_0x01ea:
            r19 = r15 & r32
            if (r19 != 0) goto L_0x0202
            r19 = r13 & r29
            r11 = r87
            if (r19 != 0) goto L_0x01fd
            boolean r19 = r1.W(r11)
            if (r19 == 0) goto L_0x01fd
            r19 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x01ff
        L_0x01fd:
            r19 = 524288(0x80000, float:7.34684E-40)
        L_0x01ff:
            r8 = r8 | r19
            goto L_0x0204
        L_0x0202:
            r11 = r87
        L_0x0204:
            r19 = 306783379(0x12492493, float:6.34695E-28)
            r11 = r5 & r19
            r15 = 306783378(0x12492492, float:6.3469493E-28)
            r19 = 1
            if (r11 != r15) goto L_0x021c
            r11 = 599187(0x92493, float:8.3964E-40)
            r11 = r11 & r8
            r15 = 599186(0x92492, float:8.39638E-40)
            if (r11 == r15) goto L_0x021a
            goto L_0x021c
        L_0x021a:
            r11 = 0
            goto L_0x021e
        L_0x021c:
            r11 = r19
        L_0x021e:
            r15 = r5 & 1
            boolean r11 = r1.E(r11, r15)
            if (r11 == 0) goto L_0x041f
            r1.p()
            r11 = r14 & 1
            if (r11 == 0) goto L_0x0262
            boolean r11 = r1.J()
            if (r11 == 0) goto L_0x0234
            goto L_0x0262
        L_0x0234:
            r1.B()
            r0 = r13 & r29
            if (r0 == 0) goto L_0x023f
            r0 = -3670017(0xffffffffffc7ffff, float:NaN)
            r8 = r8 & r0
        L_0x023f:
            r6 = r68
            r10 = r69
            r20 = r71
            r17 = r73
            r22 = r74
            r23 = r75
            r24 = r76
            r0 = r78
            r2 = r79
            r3 = r80
            r7 = r82
            r9 = r83
            r12 = r84
            r19 = r85
            r15 = r86
        L_0x025d:
            r13 = r8
            r8 = r87
            goto L_0x02f2
        L_0x0262:
            if (r6 == 0) goto L_0x0267
            androidx.compose.ui.Modifier$Companion r6 = androidx.compose.ui.Modifier.f15489d
            goto L_0x0269
        L_0x0267:
            r6 = r68
        L_0x0269:
            if (r10 == 0) goto L_0x0272
            androidx.compose.ui.graphics.Color$Companion r10 = androidx.compose.ui.graphics.Color.f15975b
            long r10 = r10.f()
            goto L_0x0274
        L_0x0272:
            r10 = r69
        L_0x0274:
            if (r17 == 0) goto L_0x027d
            androidx.compose.ui.unit.TextUnit$Companion r15 = androidx.compose.ui.unit.TextUnit.f19177b
            long r20 = r15.a()
            goto L_0x027f
        L_0x027d:
            r20 = r71
        L_0x027f:
            r15 = 0
            if (r22 == 0) goto L_0x0285
            r17 = r15
            goto L_0x0287
        L_0x0285:
            r17 = r73
        L_0x0287:
            if (r26 == 0) goto L_0x028c
            r22 = r15
            goto L_0x028e
        L_0x028c:
            r22 = r74
        L_0x028e:
            if (r31 == 0) goto L_0x0293
            r23 = r15
            goto L_0x0295
        L_0x0293:
            r23 = r75
        L_0x0295:
            if (r0 == 0) goto L_0x029e
            androidx.compose.ui.unit.TextUnit$Companion r0 = androidx.compose.ui.unit.TextUnit.f19177b
            long r24 = r0.a()
            goto L_0x02a0
        L_0x029e:
            r24 = r76
        L_0x02a0:
            if (r2 == 0) goto L_0x02a4
            r0 = r15
            goto L_0x02a6
        L_0x02a4:
            r0 = r78
        L_0x02a6:
            if (r3 == 0) goto L_0x02aa
            r2 = r15
            goto L_0x02ac
        L_0x02aa:
            r2 = r79
        L_0x02ac:
            if (r4 == 0) goto L_0x02b5
            androidx.compose.ui.unit.TextUnit$Companion r3 = androidx.compose.ui.unit.TextUnit.f19177b
            long r3 = r3.a()
            goto L_0x02b7
        L_0x02b5:
            r3 = r80
        L_0x02b7:
            if (r7 == 0) goto L_0x02c0
            androidx.compose.ui.text.style.TextOverflow$Companion r7 = androidx.compose.ui.text.style.TextOverflow.f19125b
            int r7 = r7.a()
            goto L_0x02c2
        L_0x02c0:
            r7 = r82
        L_0x02c2:
            if (r9 == 0) goto L_0x02c7
            r9 = r19
            goto L_0x02c9
        L_0x02c7:
            r9 = r83
        L_0x02c9:
            if (r12 == 0) goto L_0x02cf
            r12 = 2147483647(0x7fffffff, float:NaN)
            goto L_0x02d1
        L_0x02cf:
            r12 = r84
        L_0x02d1:
            if (r16 == 0) goto L_0x02d4
            goto L_0x02d6
        L_0x02d4:
            r19 = r85
        L_0x02d6:
            if (r18 == 0) goto L_0x02d9
            goto L_0x02db
        L_0x02d9:
            r15 = r86
        L_0x02db:
            r16 = r13 & r29
            r68 = r0
            if (r16 == 0) goto L_0x025d
            androidx.compose.runtime.ProvidableCompositionLocal r0 = f8862a
            java.lang.Object r0 = r1.C(r0)
            androidx.compose.ui.text.TextStyle r0 = (androidx.compose.ui.text.TextStyle) r0
            r16 = -3670017(0xffffffffffc7ffff, float:NaN)
            r8 = r8 & r16
            r13 = r8
            r8 = r0
            r0 = r68
        L_0x02f2:
            r1.U()
            boolean r16 = androidx.compose.runtime.ComposerKt.P()
            if (r16 == 0) goto L_0x0306
            java.lang.String r14 = "androidx.compose.material.Text (Text.kt:110)"
            r80 = r12
            r12 = 1028090691(0x3d476b43, float:0.048686277)
            androidx.compose.runtime.ComposerKt.Y(r12, r5, r13, r14)
            goto L_0x0308
        L_0x0306:
            r80 = r12
        L_0x0308:
            androidx.compose.runtime.ProvidableCompositionLocal r12 = androidx.compose.material.ContentColorKt.a()
            java.lang.Object r12 = r1.C(r12)
            androidx.compose.ui.graphics.Color r12 = (androidx.compose.ui.graphics.Color) r12
            long r26 = r12.v()
            androidx.compose.runtime.ProvidableCompositionLocal r12 = androidx.compose.material.ContentAlphaKt.a()
            java.lang.Object r12 = r1.C(r12)
            java.lang.Number r12 = (java.lang.Number) r12
            float r12 = r12.floatValue()
            r28 = 16
            int r14 = (r10 > r28 ? 1 : (r10 == r28 ? 0 : -1))
            if (r14 == 0) goto L_0x032d
            r81 = r10
            goto L_0x035d
        L_0x032d:
            long r28 = r8.h()
            r30 = 16
            int r14 = (r28 > r30 ? 1 : (r28 == r30 ? 0 : -1))
            if (r14 == 0) goto L_0x0340
            long r26 = r8.h()
        L_0x033b:
            r81 = r10
            r10 = r26
            goto L_0x035d
        L_0x0340:
            r14 = 14
            r16 = 0
            r18 = 0
            r28 = 0
            r29 = 0
            r68 = r26
            r70 = r12
            r71 = r18
            r72 = r28
            r73 = r29
            r74 = r14
            r75 = r16
            long r26 = androidx.compose.ui.graphics.Color.l(r68, r70, r71, r72, r73, r74, r75)
            goto L_0x033b
        L_0x035d:
            if (r2 == 0) goto L_0x0366
            int r12 = r2.n()
        L_0x0363:
            r54 = r12
            goto L_0x036d
        L_0x0366:
            androidx.compose.ui.text.style.TextAlign$Companion r12 = androidx.compose.ui.text.style.TextAlign.f19080b
            int r12 = r12.g()
            goto L_0x0363
        L_0x036d:
            r64 = 16609105(0xfd6f51, float:2.3274313E-38)
            r65 = 0
            r35 = 0
            r41 = 0
            r43 = 0
            r46 = 0
            r47 = 0
            r48 = 0
            r49 = 0
            r52 = 0
            r53 = 0
            r55 = 0
            r58 = 0
            r59 = 0
            r60 = 0
            r61 = 0
            r62 = 0
            r63 = 0
            r34 = r8
            r37 = r20
            r39 = r22
            r40 = r17
            r42 = r23
            r44 = r24
            r51 = r0
            r56 = r3
            androidx.compose.ui.text.TextStyle r12 = androidx.compose.ui.text.TextStyle.L(r34, r35, r37, r39, r40, r41, r42, r43, r44, r46, r47, r48, r49, r51, r52, r53, r54, r55, r56, r58, r59, r60, r61, r62, r63, r64, r65)
            boolean r14 = r1.j(r10)
            r83 = r0
            java.lang.Object r0 = r1.g()
            if (r14 != 0) goto L_0x03ba
            androidx.compose.runtime.Composer$Companion r14 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r14 = r14.a()
            if (r0 != r14) goto L_0x03c2
        L_0x03ba:
            androidx.compose.material.TextKt$Text$1$1 r0 = new androidx.compose.material.TextKt$Text$1$1
            r0.<init>(r10)
            r1.N(r0)
        L_0x03c2:
            androidx.compose.ui.graphics.ColorProducer r0 = (androidx.compose.ui.graphics.ColorProducer) r0
            r5 = r5 & 126(0x7e, float:1.77E-43)
            int r10 = r13 >> 6
            r10 = r10 & 7168(0x1c00, float:1.0045E-41)
            r5 = r5 | r10
            int r10 = r13 << 9
            r11 = 57344(0xe000, float:8.0356E-41)
            r11 = r11 & r10
            r5 = r5 | r11
            r11 = 458752(0x70000, float:6.42848E-40)
            r11 = r11 & r10
            r5 = r5 | r11
            r11 = 3670016(0x380000, float:5.142788E-39)
            r11 = r11 & r10
            r5 = r5 | r11
            r11 = 29360128(0x1c00000, float:7.052966E-38)
            r10 = r10 & r11
            r5 = r5 | r10
            r10 = 0
            r68 = r67
            r69 = r6
            r70 = r12
            r71 = r15
            r72 = r7
            r73 = r9
            r74 = r80
            r75 = r19
            r76 = r0
            r77 = r1
            r78 = r5
            r79 = r10
            androidx.compose.foundation.text.BasicTextKt.h(r68, r69, r70, r71, r72, r73, r74, r75, r76, r77, r78, r79)
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x0403
            androidx.compose.runtime.ComposerKt.X()
        L_0x0403:
            r18 = r80
            r12 = r83
            r13 = r2
            r2 = r6
            r16 = r7
            r7 = r17
            r5 = r20
            r10 = r24
            r21 = r8
            r17 = r9
            r20 = r15
            r8 = r22
            r9 = r23
            r14 = r3
            r3 = r81
            goto L_0x0442
        L_0x041f:
            r1.B()
            r2 = r68
            r3 = r69
            r5 = r71
            r7 = r73
            r8 = r74
            r9 = r75
            r10 = r76
            r12 = r78
            r13 = r79
            r14 = r80
            r16 = r82
            r17 = r83
            r18 = r84
            r19 = r85
            r20 = r86
            r21 = r87
        L_0x0442:
            androidx.compose.runtime.ScopeUpdateScope r1 = r1.x()
            if (r1 == 0) goto L_0x0460
            androidx.compose.material.TextKt$Text$2 r0 = new androidx.compose.material.TextKt$Text$2
            r68 = r0
            r66 = r1
            r1 = r67
            r22 = r89
            r23 = r90
            r24 = r91
            r0.<init>(r1, r2, r3, r5, r7, r8, r9, r10, r12, r13, r14, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            r1 = r68
            r0 = r66
            r0.a(r1)
        L_0x0460:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.TextKt.c(java.lang.String, androidx.compose.ui.Modifier, long, long, androidx.compose.ui.text.font.FontStyle, androidx.compose.ui.text.font.FontWeight, androidx.compose.ui.text.font.FontFamily, long, androidx.compose.ui.text.style.TextDecoration, androidx.compose.ui.text.style.TextAlign, long, int, boolean, int, int, kotlin.jvm.functions.Function1, androidx.compose.ui.text.TextStyle, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:273:0x03f3, code lost:
        if (r1 == androidx.compose.runtime.Composer.f14567a.a()) goto L_0x03f8;
     */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x0140  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x0145  */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x015f  */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x0166  */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x017e  */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x0183  */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x019a  */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x019f  */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x01b3  */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x01ba  */
    /* JADX WARNING: Removed duplicated region for block: B:158:0x01d3  */
    /* JADX WARNING: Removed duplicated region for block: B:159:0x01d8  */
    /* JADX WARNING: Removed duplicated region for block: B:168:0x01ef  */
    /* JADX WARNING: Removed duplicated region for block: B:169:0x01f4  */
    /* JADX WARNING: Removed duplicated region for block: B:178:0x020b  */
    /* JADX WARNING: Removed duplicated region for block: B:185:0x021f  */
    /* JADX WARNING: Removed duplicated region for block: B:190:0x0237  */
    /* JADX WARNING: Removed duplicated region for block: B:191:0x0239  */
    /* JADX WARNING: Removed duplicated region for block: B:194:0x0243  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:280:0x0466  */
    /* JADX WARNING: Removed duplicated region for block: B:283:0x0491  */
    /* JADX WARNING: Removed duplicated region for block: B:285:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0091  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00cc  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00d1  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x00ea  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x00ef  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0107  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x010c  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x0124  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x0129  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void d(androidx.compose.ui.text.AnnotatedString r59, androidx.compose.ui.Modifier r60, long r61, long r63, androidx.compose.ui.text.font.FontStyle r65, androidx.compose.ui.text.font.FontWeight r66, androidx.compose.ui.text.font.FontFamily r67, long r68, androidx.compose.ui.text.style.TextDecoration r70, androidx.compose.ui.text.style.TextAlign r71, long r72, int r74, boolean r75, int r76, int r77, java.util.Map r78, kotlin.jvm.functions.Function1 r79, androidx.compose.ui.text.TextStyle r80, androidx.compose.runtime.Composer r81, int r82, int r83, int r84) {
        /*
            r14 = r82
            r15 = r83
            r13 = r84
            r0 = 744129681(0x2c5a8491, float:3.1053252E-12)
            r1 = r81
            androidx.compose.runtime.Composer r0 = r1.q(r0)
            r1 = r13 & 1
            if (r1 == 0) goto L_0x0019
            r1 = r14 | 6
            r4 = r1
            r1 = r59
            goto L_0x002d
        L_0x0019:
            r1 = r14 & 6
            if (r1 != 0) goto L_0x002a
            r1 = r59
            boolean r4 = r0.W(r1)
            if (r4 == 0) goto L_0x0027
            r4 = 4
            goto L_0x0028
        L_0x0027:
            r4 = 2
        L_0x0028:
            r4 = r4 | r14
            goto L_0x002d
        L_0x002a:
            r1 = r59
            r4 = r14
        L_0x002d:
            r5 = r13 & 2
            if (r5 == 0) goto L_0x0036
            r4 = r4 | 48
        L_0x0033:
            r8 = r60
            goto L_0x0048
        L_0x0036:
            r8 = r14 & 48
            if (r8 != 0) goto L_0x0033
            r8 = r60
            boolean r9 = r0.W(r8)
            if (r9 == 0) goto L_0x0045
            r9 = 32
            goto L_0x0047
        L_0x0045:
            r9 = 16
        L_0x0047:
            r4 = r4 | r9
        L_0x0048:
            r9 = r13 & 4
            if (r9 == 0) goto L_0x0051
            r4 = r4 | 384(0x180, float:5.38E-43)
            r2 = r61
            goto L_0x0064
        L_0x0051:
            r12 = r14 & 384(0x180, float:5.38E-43)
            r2 = r61
            if (r12 != 0) goto L_0x0064
            boolean r16 = r0.j(r2)
            if (r16 == 0) goto L_0x0060
            r16 = 256(0x100, float:3.59E-43)
            goto L_0x0062
        L_0x0060:
            r16 = 128(0x80, float:1.794E-43)
        L_0x0062:
            r4 = r4 | r16
        L_0x0064:
            r16 = r13 & 8
            r17 = 1024(0x400, float:1.435E-42)
            r18 = 2048(0x800, float:2.87E-42)
            if (r16 == 0) goto L_0x0071
            r4 = r4 | 3072(0xc00, float:4.305E-42)
            r7 = r63
            goto L_0x0084
        L_0x0071:
            r6 = r14 & 3072(0xc00, float:4.305E-42)
            r7 = r63
            if (r6 != 0) goto L_0x0084
            boolean r20 = r0.j(r7)
            if (r20 == 0) goto L_0x0080
            r20 = r18
            goto L_0x0082
        L_0x0080:
            r20 = r17
        L_0x0082:
            r4 = r4 | r20
        L_0x0084:
            r20 = r13 & 16
            r21 = 8192(0x2000, float:1.14794E-41)
            r22 = 16384(0x4000, float:2.2959E-41)
            if (r20 == 0) goto L_0x0091
            r4 = r4 | 24576(0x6000, float:3.4438E-41)
        L_0x008e:
            r6 = r65
            goto L_0x00a4
        L_0x0091:
            r6 = r14 & 24576(0x6000, float:3.4438E-41)
            if (r6 != 0) goto L_0x008e
            r6 = r65
            boolean r24 = r0.W(r6)
            if (r24 == 0) goto L_0x00a0
            r24 = r22
            goto L_0x00a2
        L_0x00a0:
            r24 = r21
        L_0x00a2:
            r4 = r4 | r24
        L_0x00a4:
            r24 = r13 & 32
            r25 = 65536(0x10000, float:9.18355E-41)
            r26 = 196608(0x30000, float:2.75506E-40)
            r27 = 131072(0x20000, float:1.83671E-40)
            if (r24 == 0) goto L_0x00b3
            r4 = r4 | r26
            r10 = r66
            goto L_0x00c6
        L_0x00b3:
            r28 = r14 & r26
            r10 = r66
            if (r28 != 0) goto L_0x00c6
            boolean r29 = r0.W(r10)
            if (r29 == 0) goto L_0x00c2
            r29 = r27
            goto L_0x00c4
        L_0x00c2:
            r29 = r25
        L_0x00c4:
            r4 = r4 | r29
        L_0x00c6:
            r29 = r13 & 64
            r30 = 1572864(0x180000, float:2.204052E-39)
            if (r29 == 0) goto L_0x00d1
            r4 = r4 | r30
            r11 = r67
            goto L_0x00e4
        L_0x00d1:
            r31 = r14 & r30
            r11 = r67
            if (r31 != 0) goto L_0x00e4
            boolean r32 = r0.W(r11)
            if (r32 == 0) goto L_0x00e0
            r32 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00e2
        L_0x00e0:
            r32 = 524288(0x80000, float:7.34684E-40)
        L_0x00e2:
            r4 = r4 | r32
        L_0x00e4:
            r12 = r13 & 128(0x80, float:1.794E-43)
            r33 = 12582912(0xc00000, float:1.7632415E-38)
            if (r12 == 0) goto L_0x00ef
            r4 = r4 | r33
            r1 = r68
            goto L_0x0101
        L_0x00ef:
            r34 = r14 & r33
            r1 = r68
            if (r34 != 0) goto L_0x0101
            boolean r3 = r0.j(r1)
            if (r3 == 0) goto L_0x00fe
            r3 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x0100
        L_0x00fe:
            r3 = 4194304(0x400000, float:5.877472E-39)
        L_0x0100:
            r4 = r4 | r3
        L_0x0101:
            r3 = r13 & 256(0x100, float:3.59E-43)
            r34 = 100663296(0x6000000, float:2.4074124E-35)
            if (r3 == 0) goto L_0x010c
            r4 = r4 | r34
            r1 = r70
            goto L_0x011e
        L_0x010c:
            r34 = r14 & r34
            r1 = r70
            if (r34 != 0) goto L_0x011e
            boolean r2 = r0.W(r1)
            if (r2 == 0) goto L_0x011b
            r2 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x011d
        L_0x011b:
            r2 = 33554432(0x2000000, float:9.403955E-38)
        L_0x011d:
            r4 = r4 | r2
        L_0x011e:
            r2 = r13 & 512(0x200, float:7.175E-43)
            r34 = 805306368(0x30000000, float:4.656613E-10)
            if (r2 == 0) goto L_0x0129
            r4 = r4 | r34
            r1 = r71
            goto L_0x013c
        L_0x0129:
            r34 = r14 & r34
            r1 = r71
            if (r34 != 0) goto L_0x013c
            boolean r34 = r0.W(r1)
            if (r34 == 0) goto L_0x0138
            r34 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x013a
        L_0x0138:
            r34 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x013a:
            r4 = r4 | r34
        L_0x013c:
            r1 = r13 & 1024(0x400, float:1.435E-42)
            if (r1 == 0) goto L_0x0145
            r32 = r15 | 6
            r6 = r72
            goto L_0x015b
        L_0x0145:
            r34 = r15 & 6
            r6 = r72
            if (r34 != 0) goto L_0x0159
            boolean r8 = r0.j(r6)
            if (r8 == 0) goto L_0x0154
            r32 = 4
            goto L_0x0156
        L_0x0154:
            r32 = 2
        L_0x0156:
            r32 = r15 | r32
            goto L_0x015b
        L_0x0159:
            r32 = r15
        L_0x015b:
            r8 = r13 & 2048(0x800, float:2.87E-42)
            if (r8 == 0) goto L_0x0166
            r32 = r32 | 48
            r6 = r74
        L_0x0163:
            r7 = r32
            goto L_0x017a
        L_0x0166:
            r34 = r15 & 48
            r6 = r74
            if (r34 != 0) goto L_0x0163
            boolean r7 = r0.i(r6)
            if (r7 == 0) goto L_0x0175
            r23 = 32
            goto L_0x0177
        L_0x0175:
            r23 = 16
        L_0x0177:
            r32 = r32 | r23
            goto L_0x0163
        L_0x017a:
            r6 = r13 & 4096(0x1000, float:5.74E-42)
            if (r6 == 0) goto L_0x0183
            r7 = r7 | 384(0x180, float:5.38E-43)
        L_0x0180:
            r10 = r75
            goto L_0x0196
        L_0x0183:
            r10 = r15 & 384(0x180, float:5.38E-43)
            if (r10 != 0) goto L_0x0180
            r10 = r75
            boolean r19 = r0.d(r10)
            if (r19 == 0) goto L_0x0192
            r28 = 256(0x100, float:3.59E-43)
            goto L_0x0194
        L_0x0192:
            r28 = 128(0x80, float:1.794E-43)
        L_0x0194:
            r7 = r7 | r28
        L_0x0196:
            r10 = r13 & 8192(0x2000, float:1.14794E-41)
            if (r10 == 0) goto L_0x019f
            r7 = r7 | 3072(0xc00, float:4.305E-42)
        L_0x019c:
            r11 = r76
            goto L_0x01af
        L_0x019f:
            r11 = r15 & 3072(0xc00, float:4.305E-42)
            if (r11 != 0) goto L_0x019c
            r11 = r76
            boolean r19 = r0.i(r11)
            if (r19 == 0) goto L_0x01ad
            r17 = r18
        L_0x01ad:
            r7 = r7 | r17
        L_0x01af:
            r11 = r13 & 16384(0x4000, float:2.2959E-41)
            if (r11 == 0) goto L_0x01ba
            r7 = r7 | 24576(0x6000, float:3.4438E-41)
            r17 = r11
        L_0x01b7:
            r11 = r77
            goto L_0x01cc
        L_0x01ba:
            r17 = r11
            r11 = r15 & 24576(0x6000, float:3.4438E-41)
            if (r11 != 0) goto L_0x01b7
            r11 = r77
            boolean r18 = r0.i(r11)
            if (r18 == 0) goto L_0x01ca
            r21 = r22
        L_0x01ca:
            r7 = r7 | r21
        L_0x01cc:
            r18 = 32768(0x8000, float:4.5918E-41)
            r18 = r13 & r18
            if (r18 == 0) goto L_0x01d8
            r7 = r7 | r26
            r11 = r78
            goto L_0x01eb
        L_0x01d8:
            r19 = r15 & r26
            r11 = r78
            if (r19 != 0) goto L_0x01eb
            boolean r19 = r0.l(r11)
            if (r19 == 0) goto L_0x01e7
            r19 = r27
            goto L_0x01e9
        L_0x01e7:
            r19 = r25
        L_0x01e9:
            r7 = r7 | r19
        L_0x01eb:
            r19 = r13 & r25
            if (r19 == 0) goto L_0x01f4
            r7 = r7 | r30
            r11 = r79
            goto L_0x0207
        L_0x01f4:
            r21 = r15 & r30
            r11 = r79
            if (r21 != 0) goto L_0x0207
            boolean r21 = r0.l(r11)
            if (r21 == 0) goto L_0x0203
            r21 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x0205
        L_0x0203:
            r21 = 524288(0x80000, float:7.34684E-40)
        L_0x0205:
            r7 = r7 | r21
        L_0x0207:
            r21 = r15 & r33
            if (r21 != 0) goto L_0x021f
            r21 = r13 & r27
            r11 = r80
            if (r21 != 0) goto L_0x021a
            boolean r21 = r0.W(r11)
            if (r21 == 0) goto L_0x021a
            r21 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x021c
        L_0x021a:
            r21 = 4194304(0x400000, float:5.877472E-39)
        L_0x021c:
            r7 = r7 | r21
            goto L_0x0221
        L_0x021f:
            r11 = r80
        L_0x0221:
            r21 = 306783379(0x12492493, float:6.34695E-28)
            r11 = r4 & r21
            r15 = 306783378(0x12492492, float:6.3469493E-28)
            r21 = 1
            if (r11 != r15) goto L_0x0239
            r11 = 4793491(0x492493, float:6.717112E-39)
            r11 = r11 & r7
            r15 = 4793490(0x492492, float:6.71711E-39)
            if (r11 == r15) goto L_0x0237
            goto L_0x0239
        L_0x0237:
            r11 = 0
            goto L_0x023b
        L_0x0239:
            r11 = r21
        L_0x023b:
            r15 = r4 & 1
            boolean r11 = r0.E(r11, r15)
            if (r11 == 0) goto L_0x0466
            r0.p()
            r11 = r14 & 1
            if (r11 == 0) goto L_0x0281
            boolean r11 = r0.J()
            if (r11 == 0) goto L_0x0251
            goto L_0x0281
        L_0x0251:
            r0.B()
            r1 = r13 & r27
            if (r1 == 0) goto L_0x025c
            r1 = -29360129(0xfffffffffe3fffff, float:-6.380294E37)
            r7 = r7 & r1
        L_0x025c:
            r5 = r60
            r22 = r61
            r15 = r63
            r11 = r65
            r20 = r66
            r1 = r67
            r2 = r68
            r6 = r70
            r9 = r71
            r10 = r74
            r12 = r75
            r17 = r76
            r21 = r77
            r18 = r78
            r19 = r79
            r56 = r80
            r13 = r7
            r7 = r72
            goto L_0x032b
        L_0x0281:
            if (r5 == 0) goto L_0x0286
            androidx.compose.ui.Modifier$Companion r5 = androidx.compose.ui.Modifier.f15489d
            goto L_0x0288
        L_0x0286:
            r5 = r60
        L_0x0288:
            if (r9 == 0) goto L_0x0291
            androidx.compose.ui.graphics.Color$Companion r9 = androidx.compose.ui.graphics.Color.f15975b
            long r22 = r9.f()
            goto L_0x0293
        L_0x0291:
            r22 = r61
        L_0x0293:
            if (r16 == 0) goto L_0x029c
            androidx.compose.ui.unit.TextUnit$Companion r9 = androidx.compose.ui.unit.TextUnit.f19177b
            long r15 = r9.a()
            goto L_0x029e
        L_0x029c:
            r15 = r63
        L_0x029e:
            r9 = 0
            if (r20 == 0) goto L_0x02a3
            r11 = r9
            goto L_0x02a5
        L_0x02a3:
            r11 = r65
        L_0x02a5:
            if (r24 == 0) goto L_0x02aa
            r20 = r9
            goto L_0x02ac
        L_0x02aa:
            r20 = r66
        L_0x02ac:
            if (r29 == 0) goto L_0x02b1
            r24 = r9
            goto L_0x02b3
        L_0x02b1:
            r24 = r67
        L_0x02b3:
            if (r12 == 0) goto L_0x02bc
            androidx.compose.ui.unit.TextUnit$Companion r12 = androidx.compose.ui.unit.TextUnit.f19177b
            long r25 = r12.a()
            goto L_0x02be
        L_0x02bc:
            r25 = r68
        L_0x02be:
            if (r3 == 0) goto L_0x02c2
            r3 = r9
            goto L_0x02c4
        L_0x02c2:
            r3 = r70
        L_0x02c4:
            if (r2 == 0) goto L_0x02c7
            goto L_0x02c9
        L_0x02c7:
            r9 = r71
        L_0x02c9:
            if (r1 == 0) goto L_0x02d2
            androidx.compose.ui.unit.TextUnit$Companion r1 = androidx.compose.ui.unit.TextUnit.f19177b
            long r1 = r1.a()
            goto L_0x02d4
        L_0x02d2:
            r1 = r72
        L_0x02d4:
            if (r8 == 0) goto L_0x02dd
            androidx.compose.ui.text.style.TextOverflow$Companion r8 = androidx.compose.ui.text.style.TextOverflow.f19125b
            int r8 = r8.a()
            goto L_0x02df
        L_0x02dd:
            r8 = r74
        L_0x02df:
            if (r6 == 0) goto L_0x02e4
            r6 = r21
            goto L_0x02e6
        L_0x02e4:
            r6 = r75
        L_0x02e6:
            if (r10 == 0) goto L_0x02ec
            r10 = 2147483647(0x7fffffff, float:NaN)
            goto L_0x02ee
        L_0x02ec:
            r10 = r76
        L_0x02ee:
            if (r17 == 0) goto L_0x02f1
            goto L_0x02f3
        L_0x02f1:
            r21 = r77
        L_0x02f3:
            if (r18 == 0) goto L_0x02fa
            java.util.Map r12 = kotlin.collections.MapsKt.h()
            goto L_0x02fc
        L_0x02fa:
            r12 = r78
        L_0x02fc:
            if (r19 == 0) goto L_0x0301
            androidx.compose.material.TextKt$Text$5 r17 = androidx.compose.material.TextKt$Text$5.f8875z
            goto L_0x0303
        L_0x0301:
            r17 = r79
        L_0x0303:
            r18 = r13 & r27
            r60 = r1
            if (r18 == 0) goto L_0x0328
            androidx.compose.runtime.ProvidableCompositionLocal r1 = f8862a
            java.lang.Object r1 = r0.C(r1)
            androidx.compose.ui.text.TextStyle r1 = (androidx.compose.ui.text.TextStyle) r1
            r2 = -29360129(0xfffffffffe3fffff, float:-6.380294E37)
            r7 = r7 & r2
            r56 = r1
        L_0x0317:
            r13 = r7
            r18 = r12
            r19 = r17
            r1 = r24
            r12 = r6
            r17 = r10
            r6 = r3
            r10 = r8
            r2 = r25
            r7 = r60
            goto L_0x032b
        L_0x0328:
            r56 = r80
            goto L_0x0317
        L_0x032b:
            r0.U()
            boolean r24 = androidx.compose.runtime.ComposerKt.P()
            if (r24 == 0) goto L_0x033f
            r14 = 744129681(0x2c5a8491, float:3.1053252E-12)
            r73 = r12
            java.lang.String r12 = "androidx.compose.material.Text (Text.kt:283)"
            androidx.compose.runtime.ComposerKt.Y(r14, r4, r13, r12)
            goto L_0x0341
        L_0x033f:
            r73 = r12
        L_0x0341:
            androidx.compose.runtime.ProvidableCompositionLocal r12 = androidx.compose.material.ContentColorKt.a()
            java.lang.Object r12 = r0.C(r12)
            androidx.compose.ui.graphics.Color r12 = (androidx.compose.ui.graphics.Color) r12
            long r24 = r12.v()
            androidx.compose.runtime.ProvidableCompositionLocal r12 = androidx.compose.material.ContentAlphaKt.a()
            java.lang.Object r12 = r0.C(r12)
            java.lang.Number r12 = (java.lang.Number) r12
            float r12 = r12.floatValue()
            r26 = 16
            int r14 = (r22 > r26 ? 1 : (r22 == r26 ? 0 : -1))
            if (r14 == 0) goto L_0x0367
            r14 = r13
            r12 = r22
            goto L_0x0396
        L_0x0367:
            long r26 = r56.h()
            r28 = 16
            int r14 = (r26 > r28 ? 1 : (r26 == r28 ? 0 : -1))
            if (r14 == 0) goto L_0x0379
            long r24 = r56.h()
        L_0x0375:
            r14 = r13
            r12 = r24
            goto L_0x0396
        L_0x0379:
            r14 = 14
            r26 = 0
            r27 = 0
            r28 = 0
            r29 = 0
            r60 = r24
            r62 = r12
            r63 = r27
            r64 = r28
            r65 = r29
            r66 = r14
            r67 = r26
            long r24 = androidx.compose.ui.graphics.Color.l(r60, r62, r63, r64, r65, r66, r67)
            goto L_0x0375
        L_0x0396:
            if (r9 == 0) goto L_0x039f
            int r24 = r9.n()
        L_0x039c:
            r44 = r24
            goto L_0x03a6
        L_0x039f:
            androidx.compose.ui.text.style.TextAlign$Companion r24 = androidx.compose.ui.text.style.TextAlign.f19080b
            int r24 = r24.g()
            goto L_0x039c
        L_0x03a6:
            r54 = 16609105(0xfd6f51, float:2.3274313E-38)
            r55 = 0
            r25 = 0
            r31 = 0
            r33 = 0
            r36 = 0
            r37 = 0
            r38 = 0
            r39 = 0
            r42 = 0
            r43 = 0
            r45 = 0
            r48 = 0
            r49 = 0
            r50 = 0
            r51 = 0
            r52 = 0
            r53 = 0
            r24 = r56
            r27 = r15
            r29 = r20
            r30 = r11
            r32 = r1
            r34 = r2
            r41 = r6
            r46 = r7
            androidx.compose.ui.text.TextStyle r24 = androidx.compose.ui.text.TextStyle.L(r24, r25, r27, r29, r30, r31, r32, r33, r34, r36, r37, r38, r39, r41, r42, r43, r44, r45, r46, r48, r49, r50, r51, r52, r53, r54, r55)
            boolean r25 = r0.j(r12)
            r74 = r1
            java.lang.Object r1 = r0.g()
            if (r25 != 0) goto L_0x03f6
            androidx.compose.runtime.Composer$Companion r25 = androidx.compose.runtime.Composer.f14567a
            r75 = r2
            java.lang.Object r2 = r25.a()
            if (r1 != r2) goto L_0x0400
            goto L_0x03f8
        L_0x03f6:
            r75 = r2
        L_0x03f8:
            androidx.compose.material.TextKt$Text$6$1 r1 = new androidx.compose.material.TextKt$Text$6$1
            r1.<init>(r12)
            r0.N(r1)
        L_0x0400:
            androidx.compose.ui.graphics.ColorProducer r1 = (androidx.compose.ui.graphics.ColorProducer) r1
            r2 = r4 & 126(0x7e, float:1.77E-43)
            int r3 = r14 >> 9
            r3 = r3 & 7168(0x1c00, float:1.0045E-41)
            r2 = r2 | r3
            int r3 = r14 << 9
            r4 = 57344(0xe000, float:8.0356E-41)
            r4 = r4 & r3
            r2 = r2 | r4
            r4 = 458752(0x70000, float:6.42848E-40)
            r4 = r4 & r3
            r2 = r2 | r4
            r4 = 3670016(0x380000, float:5.142788E-39)
            r4 = r4 & r3
            r2 = r2 | r4
            r4 = 29360128(0x1c00000, float:7.052966E-38)
            r4 = r4 & r3
            r2 = r2 | r4
            r4 = 234881024(0xe000000, float:1.5777218E-30)
            r3 = r3 & r4
            r2 = r2 | r3
            r3 = 0
            r60 = r59
            r61 = r5
            r62 = r24
            r63 = r19
            r64 = r10
            r65 = r73
            r66 = r17
            r67 = r21
            r68 = r18
            r69 = r1
            r70 = r0
            r71 = r2
            r72 = r3
            androidx.compose.foundation.text.BasicTextKt.e(r60, r61, r62, r63, r64, r65, r66, r67, r68, r69, r70, r71, r72)
            boolean r1 = androidx.compose.runtime.ComposerKt.P()
            if (r1 == 0) goto L_0x0447
            androidx.compose.runtime.ComposerKt.X()
        L_0x0447:
            r2 = r5
            r12 = r6
            r13 = r9
            r5 = r15
            r3 = r22
            r22 = r56
            r9 = r74
            r14 = r7
            r16 = r10
            r7 = r11
            r8 = r20
            r10 = r75
            r20 = r18
            r18 = r17
            r17 = r73
            r58 = r21
            r21 = r19
            r19 = r58
            goto L_0x048b
        L_0x0466:
            r0.B()
            r2 = r60
            r3 = r61
            r5 = r63
            r7 = r65
            r8 = r66
            r9 = r67
            r10 = r68
            r12 = r70
            r13 = r71
            r14 = r72
            r16 = r74
            r17 = r75
            r18 = r76
            r19 = r77
            r20 = r78
            r21 = r79
            r22 = r80
        L_0x048b:
            androidx.compose.runtime.ScopeUpdateScope r1 = r0.x()
            if (r1 == 0) goto L_0x04a9
            androidx.compose.material.TextKt$Text$7 r0 = new androidx.compose.material.TextKt$Text$7
            r60 = r0
            r57 = r1
            r1 = r59
            r23 = r82
            r24 = r83
            r25 = r84
            r0.<init>(r1, r2, r3, r5, r7, r8, r9, r10, r12, r13, r14, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            r1 = r60
            r0 = r57
            r0.a(r1)
        L_0x04a9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.TextKt.d(androidx.compose.ui.text.AnnotatedString, androidx.compose.ui.Modifier, long, long, androidx.compose.ui.text.font.FontStyle, androidx.compose.ui.text.font.FontWeight, androidx.compose.ui.text.font.FontFamily, long, androidx.compose.ui.text.style.TextDecoration, androidx.compose.ui.text.style.TextAlign, long, int, boolean, int, int, java.util.Map, kotlin.jvm.functions.Function1, androidx.compose.ui.text.TextStyle, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:106:0x0140  */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x0145  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x015f  */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x0164  */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x017f  */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x0184  */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x019b  */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x01a0  */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x01b4  */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x01bb  */
    /* JADX WARNING: Removed duplicated region for block: B:160:0x01d4  */
    /* JADX WARNING: Removed duplicated region for block: B:166:0x01e5  */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x01fd  */
    /* JADX WARNING: Removed duplicated region for block: B:172:0x01ff  */
    /* JADX WARNING: Removed duplicated region for block: B:175:0x0209  */
    /* JADX WARNING: Removed duplicated region for block: B:236:0x037b  */
    /* JADX WARNING: Removed duplicated region for block: B:239:0x03a4  */
    /* JADX WARNING: Removed duplicated region for block: B:241:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0091  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00cc  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00d1  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x00ea  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x00ef  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0108  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x010c  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x0124  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x0129  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final /* synthetic */ void e(java.lang.String r54, androidx.compose.ui.Modifier r55, long r56, long r58, androidx.compose.ui.text.font.FontStyle r60, androidx.compose.ui.text.font.FontWeight r61, androidx.compose.ui.text.font.FontFamily r62, long r63, androidx.compose.ui.text.style.TextDecoration r65, androidx.compose.ui.text.style.TextAlign r66, long r67, int r69, boolean r70, int r71, kotlin.jvm.functions.Function1 r72, androidx.compose.ui.text.TextStyle r73, androidx.compose.runtime.Composer r74, int r75, int r76, int r77) {
        /*
            r14 = r75
            r15 = r76
            r13 = r77
            r0 = -366126944(0xffffffffea2d58a0, float:-5.239067E25)
            r1 = r74
            androidx.compose.runtime.Composer r1 = r1.q(r0)
            r2 = r13 & 1
            if (r2 == 0) goto L_0x0019
            r2 = r14 | 6
            r5 = r2
            r2 = r54
            goto L_0x002d
        L_0x0019:
            r2 = r14 & 6
            if (r2 != 0) goto L_0x002a
            r2 = r54
            boolean r5 = r1.W(r2)
            if (r5 == 0) goto L_0x0027
            r5 = 4
            goto L_0x0028
        L_0x0027:
            r5 = 2
        L_0x0028:
            r5 = r5 | r14
            goto L_0x002d
        L_0x002a:
            r2 = r54
            r5 = r14
        L_0x002d:
            r6 = r13 & 2
            if (r6 == 0) goto L_0x0036
            r5 = r5 | 48
        L_0x0033:
            r9 = r55
            goto L_0x0048
        L_0x0036:
            r9 = r14 & 48
            if (r9 != 0) goto L_0x0033
            r9 = r55
            boolean r10 = r1.W(r9)
            if (r10 == 0) goto L_0x0045
            r10 = 32
            goto L_0x0047
        L_0x0045:
            r10 = 16
        L_0x0047:
            r5 = r5 | r10
        L_0x0048:
            r10 = r13 & 4
            if (r10 == 0) goto L_0x0051
            r5 = r5 | 384(0x180, float:5.38E-43)
            r7 = r56
            goto L_0x0064
        L_0x0051:
            r3 = r14 & 384(0x180, float:5.38E-43)
            r7 = r56
            if (r3 != 0) goto L_0x0064
            boolean r17 = r1.j(r7)
            if (r17 == 0) goto L_0x0060
            r17 = 256(0x100, float:3.59E-43)
            goto L_0x0062
        L_0x0060:
            r17 = 128(0x80, float:1.794E-43)
        L_0x0062:
            r5 = r5 | r17
        L_0x0064:
            r17 = r13 & 8
            r18 = 1024(0x400, float:1.435E-42)
            r19 = 2048(0x800, float:2.87E-42)
            if (r17 == 0) goto L_0x0071
            r5 = r5 | 3072(0xc00, float:4.305E-42)
            r11 = r58
            goto L_0x0084
        L_0x0071:
            r3 = r14 & 3072(0xc00, float:4.305E-42)
            r11 = r58
            if (r3 != 0) goto L_0x0084
            boolean r22 = r1.j(r11)
            if (r22 == 0) goto L_0x0080
            r22 = r19
            goto L_0x0082
        L_0x0080:
            r22 = r18
        L_0x0082:
            r5 = r5 | r22
        L_0x0084:
            r22 = r13 & 16
            r23 = 8192(0x2000, float:1.14794E-41)
            r24 = 16384(0x4000, float:2.2959E-41)
            if (r22 == 0) goto L_0x0091
            r5 = r5 | 24576(0x6000, float:3.4438E-41)
        L_0x008e:
            r3 = r60
            goto L_0x00a4
        L_0x0091:
            r3 = r14 & 24576(0x6000, float:3.4438E-41)
            if (r3 != 0) goto L_0x008e
            r3 = r60
            boolean r26 = r1.W(r3)
            if (r26 == 0) goto L_0x00a0
            r26 = r24
            goto L_0x00a2
        L_0x00a0:
            r26 = r23
        L_0x00a2:
            r5 = r5 | r26
        L_0x00a4:
            r26 = r13 & 32
            r27 = 65536(0x10000, float:9.18355E-41)
            r28 = 131072(0x20000, float:1.83671E-40)
            r29 = 196608(0x30000, float:2.75506E-40)
            if (r26 == 0) goto L_0x00b3
            r5 = r5 | r29
            r4 = r61
            goto L_0x00c6
        L_0x00b3:
            r30 = r14 & r29
            r4 = r61
            if (r30 != 0) goto L_0x00c6
            boolean r31 = r1.W(r4)
            if (r31 == 0) goto L_0x00c2
            r31 = r28
            goto L_0x00c4
        L_0x00c2:
            r31 = r27
        L_0x00c4:
            r5 = r5 | r31
        L_0x00c6:
            r31 = r13 & 64
            r32 = 1572864(0x180000, float:2.204052E-39)
            if (r31 == 0) goto L_0x00d1
            r5 = r5 | r32
            r0 = r62
            goto L_0x00e4
        L_0x00d1:
            r32 = r14 & r32
            r0 = r62
            if (r32 != 0) goto L_0x00e4
            boolean r33 = r1.W(r0)
            if (r33 == 0) goto L_0x00e0
            r33 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00e2
        L_0x00e0:
            r33 = 524288(0x80000, float:7.34684E-40)
        L_0x00e2:
            r5 = r5 | r33
        L_0x00e4:
            r0 = r13 & 128(0x80, float:1.794E-43)
            r33 = 12582912(0xc00000, float:1.7632415E-38)
            if (r0 == 0) goto L_0x00ef
            r5 = r5 | r33
            r2 = r63
            goto L_0x0102
        L_0x00ef:
            r33 = r14 & r33
            r2 = r63
            if (r33 != 0) goto L_0x0102
            boolean r33 = r1.j(r2)
            if (r33 == 0) goto L_0x00fe
            r33 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x0100
        L_0x00fe:
            r33 = 4194304(0x400000, float:5.877472E-39)
        L_0x0100:
            r5 = r5 | r33
        L_0x0102:
            r2 = r13 & 256(0x100, float:3.59E-43)
            r3 = 100663296(0x6000000, float:2.4074124E-35)
            if (r2 == 0) goto L_0x010c
            r5 = r5 | r3
        L_0x0109:
            r3 = r65
            goto L_0x011e
        L_0x010c:
            r3 = r3 & r14
            if (r3 != 0) goto L_0x0109
            r3 = r65
            boolean r33 = r1.W(r3)
            if (r33 == 0) goto L_0x011a
            r33 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x011c
        L_0x011a:
            r33 = 33554432(0x2000000, float:9.403955E-38)
        L_0x011c:
            r5 = r5 | r33
        L_0x011e:
            r3 = r13 & 512(0x200, float:7.175E-43)
            r33 = 805306368(0x30000000, float:4.656613E-10)
            if (r3 == 0) goto L_0x0129
            r5 = r5 | r33
            r4 = r66
            goto L_0x013c
        L_0x0129:
            r33 = r14 & r33
            r4 = r66
            if (r33 != 0) goto L_0x013c
            boolean r33 = r1.W(r4)
            if (r33 == 0) goto L_0x0138
            r33 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x013a
        L_0x0138:
            r33 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x013a:
            r5 = r5 | r33
        L_0x013c:
            r4 = r13 & 1024(0x400, float:1.435E-42)
            if (r4 == 0) goto L_0x0145
            r30 = r15 | 6
            r7 = r67
            goto L_0x015b
        L_0x0145:
            r33 = r15 & 6
            r7 = r67
            if (r33 != 0) goto L_0x0159
            boolean r33 = r1.j(r7)
            if (r33 == 0) goto L_0x0154
            r30 = 4
            goto L_0x0156
        L_0x0154:
            r30 = 2
        L_0x0156:
            r30 = r15 | r30
            goto L_0x015b
        L_0x0159:
            r30 = r15
        L_0x015b:
            r7 = r13 & 2048(0x800, float:2.87E-42)
            if (r7 == 0) goto L_0x0164
            r30 = r30 | 48
        L_0x0161:
            r8 = r30
            goto L_0x017b
        L_0x0164:
            r8 = r15 & 48
            if (r8 != 0) goto L_0x0178
            r8 = r69
            boolean r33 = r1.i(r8)
            if (r33 == 0) goto L_0x0173
            r16 = 32
            goto L_0x0175
        L_0x0173:
            r16 = 16
        L_0x0175:
            r30 = r30 | r16
            goto L_0x0161
        L_0x0178:
            r8 = r69
            goto L_0x0161
        L_0x017b:
            r9 = r13 & 4096(0x1000, float:5.74E-42)
            if (r9 == 0) goto L_0x0184
            r8 = r8 | 384(0x180, float:5.38E-43)
        L_0x0181:
            r11 = r70
            goto L_0x0197
        L_0x0184:
            r11 = r15 & 384(0x180, float:5.38E-43)
            if (r11 != 0) goto L_0x0181
            r11 = r70
            boolean r12 = r1.d(r11)
            if (r12 == 0) goto L_0x0193
            r25 = 256(0x100, float:3.59E-43)
            goto L_0x0195
        L_0x0193:
            r25 = 128(0x80, float:1.794E-43)
        L_0x0195:
            r8 = r8 | r25
        L_0x0197:
            r12 = r13 & 8192(0x2000, float:1.14794E-41)
            if (r12 == 0) goto L_0x01a0
            r8 = r8 | 3072(0xc00, float:4.305E-42)
        L_0x019d:
            r11 = r71
            goto L_0x01b0
        L_0x01a0:
            r11 = r15 & 3072(0xc00, float:4.305E-42)
            if (r11 != 0) goto L_0x019d
            r11 = r71
            boolean r16 = r1.i(r11)
            if (r16 == 0) goto L_0x01ae
            r18 = r19
        L_0x01ae:
            r8 = r8 | r18
        L_0x01b0:
            r11 = r13 & 16384(0x4000, float:2.2959E-41)
            if (r11 == 0) goto L_0x01bb
            r8 = r8 | 24576(0x6000, float:3.4438E-41)
            r16 = r11
        L_0x01b8:
            r11 = r72
            goto L_0x01cd
        L_0x01bb:
            r16 = r11
            r11 = r15 & 24576(0x6000, float:3.4438E-41)
            if (r11 != 0) goto L_0x01b8
            r11 = r72
            boolean r18 = r1.l(r11)
            if (r18 == 0) goto L_0x01cb
            r23 = r24
        L_0x01cb:
            r8 = r8 | r23
        L_0x01cd:
            r18 = r15 & r29
            r19 = 32768(0x8000, float:4.5918E-41)
            if (r18 != 0) goto L_0x01e5
            r18 = r13 & r19
            r11 = r73
            if (r18 != 0) goto L_0x01e2
            boolean r18 = r1.W(r11)
            if (r18 == 0) goto L_0x01e2
            r27 = r28
        L_0x01e2:
            r8 = r8 | r27
            goto L_0x01e7
        L_0x01e5:
            r11 = r73
        L_0x01e7:
            r18 = 306783379(0x12492493, float:6.34695E-28)
            r11 = r5 & r18
            r15 = 306783378(0x12492492, float:6.3469493E-28)
            r18 = 1
            if (r11 != r15) goto L_0x01ff
            r11 = 74899(0x12493, float:1.04956E-40)
            r11 = r11 & r8
            r15 = 74898(0x12492, float:1.04954E-40)
            if (r11 == r15) goto L_0x01fd
            goto L_0x01ff
        L_0x01fd:
            r11 = 0
            goto L_0x0201
        L_0x01ff:
            r11 = r18
        L_0x0201:
            r15 = r5 & 1
            boolean r11 = r1.E(r11, r15)
            if (r11 == 0) goto L_0x037b
            r1.p()
            r11 = r14 & 1
            if (r11 == 0) goto L_0x0243
            boolean r11 = r1.J()
            if (r11 == 0) goto L_0x0217
            goto L_0x0243
        L_0x0217:
            r1.B()
            r0 = r13 & r19
            if (r0 == 0) goto L_0x0222
            r0 = -458753(0xfffffffffff8ffff, float:NaN)
            r8 = r8 & r0
        L_0x0222:
            r6 = r55
            r10 = r56
            r2 = r58
            r0 = r60
            r4 = r61
            r7 = r62
            r12 = r65
            r15 = r66
            r41 = r67
            r43 = r69
            r44 = r70
            r45 = r71
            r46 = r72
            r47 = r73
            r13 = r8
            r8 = r63
            goto L_0x02f8
        L_0x0243:
            if (r6 == 0) goto L_0x0248
            androidx.compose.ui.Modifier$Companion r6 = androidx.compose.ui.Modifier.f15489d
            goto L_0x024a
        L_0x0248:
            r6 = r55
        L_0x024a:
            if (r10 == 0) goto L_0x0253
            androidx.compose.ui.graphics.Color$Companion r10 = androidx.compose.ui.graphics.Color.f15975b
            long r10 = r10.f()
            goto L_0x0255
        L_0x0253:
            r10 = r56
        L_0x0255:
            if (r17 == 0) goto L_0x025e
            androidx.compose.ui.unit.TextUnit$Companion r15 = androidx.compose.ui.unit.TextUnit.f19177b
            long r20 = r15.a()
            goto L_0x0260
        L_0x025e:
            r20 = r58
        L_0x0260:
            r15 = 0
            if (r22 == 0) goto L_0x0266
            r17 = r15
            goto L_0x0268
        L_0x0266:
            r17 = r60
        L_0x0268:
            if (r26 == 0) goto L_0x026d
            r22 = r15
            goto L_0x026f
        L_0x026d:
            r22 = r61
        L_0x026f:
            if (r31 == 0) goto L_0x0274
            r23 = r15
            goto L_0x0276
        L_0x0274:
            r23 = r62
        L_0x0276:
            if (r0 == 0) goto L_0x027f
            androidx.compose.ui.unit.TextUnit$Companion r0 = androidx.compose.ui.unit.TextUnit.f19177b
            long r24 = r0.a()
            goto L_0x0281
        L_0x027f:
            r24 = r63
        L_0x0281:
            if (r2 == 0) goto L_0x0285
            r0 = r15
            goto L_0x0287
        L_0x0285:
            r0 = r65
        L_0x0287:
            if (r3 == 0) goto L_0x028a
            goto L_0x028c
        L_0x028a:
            r15 = r66
        L_0x028c:
            if (r4 == 0) goto L_0x0295
            androidx.compose.ui.unit.TextUnit$Companion r2 = androidx.compose.ui.unit.TextUnit.f19177b
            long r2 = r2.a()
            goto L_0x0297
        L_0x0295:
            r2 = r67
        L_0x0297:
            if (r7 == 0) goto L_0x02a0
            androidx.compose.ui.text.style.TextOverflow$Companion r4 = androidx.compose.ui.text.style.TextOverflow.f19125b
            int r4 = r4.a()
            goto L_0x02a2
        L_0x02a0:
            r4 = r69
        L_0x02a2:
            if (r9 == 0) goto L_0x02a5
            goto L_0x02a7
        L_0x02a5:
            r18 = r70
        L_0x02a7:
            if (r12 == 0) goto L_0x02ad
            r7 = 2147483647(0x7fffffff, float:NaN)
            goto L_0x02af
        L_0x02ad:
            r7 = r71
        L_0x02af:
            if (r16 == 0) goto L_0x02b4
            androidx.compose.material.TextKt$Text$3 r9 = androidx.compose.material.TextKt$Text$3.f8871z
            goto L_0x02b6
        L_0x02b4:
            r9 = r72
        L_0x02b6:
            r12 = r13 & r19
            if (r12 == 0) goto L_0x02e0
            androidx.compose.runtime.ProvidableCompositionLocal r12 = f8862a
            java.lang.Object r12 = r1.C(r12)
            androidx.compose.ui.text.TextStyle r12 = (androidx.compose.ui.text.TextStyle) r12
            r16 = -458753(0xfffffffffff8ffff, float:NaN)
            r8 = r8 & r16
            r41 = r2
            r43 = r4
            r45 = r7
            r13 = r8
            r46 = r9
            r47 = r12
            r44 = r18
            r2 = r20
            r4 = r22
            r7 = r23
            r8 = r24
            r12 = r0
            r0 = r17
            goto L_0x02f8
        L_0x02e0:
            r47 = r73
            r12 = r0
            r41 = r2
            r43 = r4
            r45 = r7
            r13 = r8
            r46 = r9
            r0 = r17
            r44 = r18
            r2 = r20
            r4 = r22
            r7 = r23
            r8 = r24
        L_0x02f8:
            r1.U()
            boolean r16 = androidx.compose.runtime.ComposerKt.P()
            if (r16 == 0) goto L_0x030c
            java.lang.String r14 = "androidx.compose.material.Text (Text.kt:184)"
            r74 = r1
            r1 = -366126944(0xffffffffea2d58a0, float:-5.239067E25)
            androidx.compose.runtime.ComposerKt.Y(r1, r5, r13, r14)
            goto L_0x030e
        L_0x030c:
            r74 = r1
        L_0x030e:
            r1 = 2147483646(0x7ffffffe, float:NaN)
            r38 = r5 & r1
            r1 = r13 & 14
            r1 = r1 | 24576(0x6000, float:3.4438E-41)
            r5 = r13 & 112(0x70, float:1.57E-43)
            r1 = r1 | r5
            r5 = r13 & 896(0x380, float:1.256E-42)
            r1 = r1 | r5
            r5 = r13 & 7168(0x1c00, float:1.0045E-41)
            r1 = r1 | r5
            int r5 = r13 << 3
            r13 = 458752(0x70000, float:6.42848E-40)
            r13 = r13 & r5
            r1 = r1 | r13
            r13 = 3670016(0x380000, float:5.142788E-39)
            r5 = r5 & r13
            r39 = r1 | r5
            r40 = 0
            r34 = 1
            r16 = r54
            r17 = r6
            r18 = r10
            r20 = r2
            r22 = r0
            r23 = r4
            r24 = r7
            r25 = r8
            r27 = r12
            r28 = r15
            r29 = r41
            r31 = r43
            r32 = r44
            r33 = r45
            r35 = r46
            r36 = r47
            r37 = r74
            c(r16, r17, r18, r20, r22, r23, r24, r25, r27, r28, r29, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40)
            boolean r1 = androidx.compose.runtime.ComposerKt.P()
            if (r1 == 0) goto L_0x035d
            androidx.compose.runtime.ComposerKt.X()
        L_0x035d:
            r13 = r15
            r14 = r41
            r16 = r43
            r17 = r44
            r18 = r45
            r19 = r46
            r20 = r47
            r49 = r7
            r7 = r0
            r50 = r8
            r8 = r4
            r9 = r49
            r52 = r2
            r2 = r6
            r5 = r52
            r3 = r10
            r10 = r50
            goto L_0x039e
        L_0x037b:
            r74 = r1
            r74.B()
            r2 = r55
            r3 = r56
            r5 = r58
            r7 = r60
            r8 = r61
            r9 = r62
            r10 = r63
            r12 = r65
            r13 = r66
            r14 = r67
            r16 = r69
            r17 = r70
            r18 = r71
            r19 = r72
            r20 = r73
        L_0x039e:
            androidx.compose.runtime.ScopeUpdateScope r1 = r74.x()
            if (r1 == 0) goto L_0x03bc
            androidx.compose.material.TextKt$Text$4 r0 = new androidx.compose.material.TextKt$Text$4
            r55 = r0
            r48 = r1
            r1 = r54
            r21 = r75
            r22 = r76
            r23 = r77
            r0.<init>(r1, r2, r3, r5, r7, r8, r9, r10, r12, r13, r14, r16, r17, r18, r19, r20, r21, r22, r23)
            r1 = r55
            r0 = r48
            r0.a(r1)
        L_0x03bc:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.TextKt.e(java.lang.String, androidx.compose.ui.Modifier, long, long, androidx.compose.ui.text.font.FontStyle, androidx.compose.ui.text.font.FontWeight, androidx.compose.ui.text.font.FontFamily, long, androidx.compose.ui.text.style.TextDecoration, androidx.compose.ui.text.style.TextAlign, long, int, boolean, int, kotlin.jvm.functions.Function1, androidx.compose.ui.text.TextStyle, androidx.compose.runtime.Composer, int, int, int):void");
    }

    public static final ProvidableCompositionLocal f() {
        return f8862a;
    }
}
