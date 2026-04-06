package androidx.compose.foundation.text;

import androidx.compose.foundation.text.input.TextFieldDecorator;
import androidx.compose.foundation.text.input.internal.selection.TextFieldHandleState;
import androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState;
import androidx.compose.foundation.text.selection.OffsetProvider;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.DpKt;
import kotlin.Metadata;

@Metadata
public final class BasicTextFieldKt {

    /* renamed from: a  reason: collision with root package name */
    public static final TextFieldDecorator f5504a = BasicTextFieldKt$DefaultTextFieldDecorator$1.f5565a;

    /* renamed from: b  reason: collision with root package name */
    public static final long f5505b;

    static {
        float f2 = (float) 40;
        f5505b = DpKt.b(Dp.m(f2), Dp.m(f2));
    }

    /* JADX WARNING: Removed duplicated region for block: B:107:0x0142  */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x0147  */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x0161  */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x0166  */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x017e  */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x0183  */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x0198  */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x019d  */
    /* JADX WARNING: Removed duplicated region for block: B:151:0x01ba  */
    /* JADX WARNING: Removed duplicated region for block: B:158:0x01ce  */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x01e2  */
    /* JADX WARNING: Removed duplicated region for block: B:164:0x01e4  */
    /* JADX WARNING: Removed duplicated region for block: B:167:0x01ed  */
    /* JADX WARNING: Removed duplicated region for block: B:227:0x0328  */
    /* JADX WARNING: Removed duplicated region for block: B:230:0x034f  */
    /* JADX WARNING: Removed duplicated region for block: B:232:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0075  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0095  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00cc  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00d1  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x00ea  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x00ef  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0108  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x010d  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x0126  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x012b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void a(androidx.compose.foundation.text.input.TextFieldState r40, androidx.compose.ui.Modifier r41, boolean r42, boolean r43, androidx.compose.foundation.text.input.InputTransformation r44, androidx.compose.ui.text.TextStyle r45, androidx.compose.foundation.text.KeyboardOptions r46, androidx.compose.foundation.text.input.KeyboardActionHandler r47, androidx.compose.foundation.text.input.TextFieldLineLimits r48, kotlin.jvm.functions.Function2 r49, androidx.compose.foundation.interaction.MutableInteractionSource r50, androidx.compose.ui.graphics.Brush r51, androidx.compose.foundation.text.input.OutputTransformation r52, androidx.compose.foundation.text.input.TextFieldDecorator r53, androidx.compose.foundation.ScrollState r54, androidx.compose.runtime.Composer r55, int r56, int r57, int r58) {
        /*
            r0 = r53
            r15 = r56
            r14 = r57
            r13 = r58
            r1 = 469439921(0x1bfb15b1, float:4.1538484E-22)
            r2 = r55
            androidx.compose.runtime.Composer r2 = r2.q(r1)
            r3 = r13 & 1
            if (r3 == 0) goto L_0x001b
            r3 = r15 | 6
            r6 = r3
            r3 = r40
            goto L_0x002f
        L_0x001b:
            r3 = r15 & 6
            if (r3 != 0) goto L_0x002c
            r3 = r40
            boolean r6 = r2.W(r3)
            if (r6 == 0) goto L_0x0029
            r6 = 4
            goto L_0x002a
        L_0x0029:
            r6 = 2
        L_0x002a:
            r6 = r6 | r15
            goto L_0x002f
        L_0x002c:
            r3 = r40
            r6 = r15
        L_0x002f:
            r7 = r13 & 2
            if (r7 == 0) goto L_0x0038
            r6 = r6 | 48
        L_0x0035:
            r10 = r41
            goto L_0x004a
        L_0x0038:
            r10 = r15 & 48
            if (r10 != 0) goto L_0x0035
            r10 = r41
            boolean r11 = r2.W(r10)
            if (r11 == 0) goto L_0x0047
            r11 = 32
            goto L_0x0049
        L_0x0047:
            r11 = 16
        L_0x0049:
            r6 = r6 | r11
        L_0x004a:
            r11 = r13 & 4
            r16 = 256(0x100, float:3.59E-43)
            if (r11 == 0) goto L_0x0055
            r6 = r6 | 384(0x180, float:5.38E-43)
        L_0x0052:
            r4 = r42
            goto L_0x0068
        L_0x0055:
            r4 = r15 & 384(0x180, float:5.38E-43)
            if (r4 != 0) goto L_0x0052
            r4 = r42
            boolean r17 = r2.d(r4)
            if (r17 == 0) goto L_0x0064
            r17 = r16
            goto L_0x0066
        L_0x0064:
            r17 = 128(0x80, float:1.794E-43)
        L_0x0066:
            r6 = r6 | r17
        L_0x0068:
            r17 = r13 & 8
            r18 = 1024(0x400, float:1.435E-42)
            r19 = 2048(0x800, float:2.87E-42)
            if (r17 == 0) goto L_0x0075
            r6 = r6 | 3072(0xc00, float:4.305E-42)
        L_0x0072:
            r5 = r43
            goto L_0x0088
        L_0x0075:
            r5 = r15 & 3072(0xc00, float:4.305E-42)
            if (r5 != 0) goto L_0x0072
            r5 = r43
            boolean r21 = r2.d(r5)
            if (r21 == 0) goto L_0x0084
            r21 = r19
            goto L_0x0086
        L_0x0084:
            r21 = r18
        L_0x0086:
            r6 = r6 | r21
        L_0x0088:
            r21 = r13 & 16
            r22 = 8192(0x2000, float:1.14794E-41)
            r23 = 16384(0x4000, float:2.2959E-41)
            if (r21 == 0) goto L_0x0095
            r6 = r6 | 24576(0x6000, float:3.4438E-41)
        L_0x0092:
            r8 = r44
            goto L_0x00a8
        L_0x0095:
            r8 = r15 & 24576(0x6000, float:3.4438E-41)
            if (r8 != 0) goto L_0x0092
            r8 = r44
            boolean r25 = r2.W(r8)
            if (r25 == 0) goto L_0x00a4
            r25 = r23
            goto L_0x00a6
        L_0x00a4:
            r25 = r22
        L_0x00a6:
            r6 = r6 | r25
        L_0x00a8:
            r25 = r13 & 32
            r26 = 196608(0x30000, float:2.75506E-40)
            if (r25 == 0) goto L_0x00b3
            r6 = r6 | r26
            r9 = r45
            goto L_0x00c6
        L_0x00b3:
            r26 = r15 & r26
            r9 = r45
            if (r26 != 0) goto L_0x00c6
            boolean r27 = r2.W(r9)
            if (r27 == 0) goto L_0x00c2
            r27 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00c4
        L_0x00c2:
            r27 = 65536(0x10000, float:9.18355E-41)
        L_0x00c4:
            r6 = r6 | r27
        L_0x00c6:
            r27 = r13 & 64
            r28 = 1572864(0x180000, float:2.204052E-39)
            if (r27 == 0) goto L_0x00d1
            r6 = r6 | r28
            r12 = r46
            goto L_0x00e4
        L_0x00d1:
            r28 = r15 & r28
            r12 = r46
            if (r28 != 0) goto L_0x00e4
            boolean r29 = r2.W(r12)
            if (r29 == 0) goto L_0x00e0
            r29 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00e2
        L_0x00e0:
            r29 = 524288(0x80000, float:7.34684E-40)
        L_0x00e2:
            r6 = r6 | r29
        L_0x00e4:
            r1 = r13 & 128(0x80, float:1.794E-43)
            r30 = 12582912(0xc00000, float:1.7632415E-38)
            if (r1 == 0) goto L_0x00ef
            r6 = r6 | r30
            r3 = r47
            goto L_0x0102
        L_0x00ef:
            r30 = r15 & r30
            r3 = r47
            if (r30 != 0) goto L_0x0102
            boolean r30 = r2.W(r3)
            if (r30 == 0) goto L_0x00fe
            r30 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x0100
        L_0x00fe:
            r30 = 4194304(0x400000, float:5.877472E-39)
        L_0x0100:
            r6 = r6 | r30
        L_0x0102:
            r3 = r13 & 256(0x100, float:3.59E-43)
            r30 = 100663296(0x6000000, float:2.4074124E-35)
            if (r3 == 0) goto L_0x010d
            r6 = r6 | r30
            r4 = r48
            goto L_0x0120
        L_0x010d:
            r30 = r15 & r30
            r4 = r48
            if (r30 != 0) goto L_0x0120
            boolean r30 = r2.W(r4)
            if (r30 == 0) goto L_0x011c
            r30 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x011e
        L_0x011c:
            r30 = 33554432(0x2000000, float:9.403955E-38)
        L_0x011e:
            r6 = r6 | r30
        L_0x0120:
            r4 = r13 & 512(0x200, float:7.175E-43)
            r30 = 805306368(0x30000000, float:4.656613E-10)
            if (r4 == 0) goto L_0x012b
            r6 = r6 | r30
            r5 = r49
            goto L_0x013e
        L_0x012b:
            r30 = r15 & r30
            r5 = r49
            if (r30 != 0) goto L_0x013e
            boolean r30 = r2.l(r5)
            if (r30 == 0) goto L_0x013a
            r30 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x013c
        L_0x013a:
            r30 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x013c:
            r6 = r6 | r30
        L_0x013e:
            r5 = r13 & 1024(0x400, float:1.435E-42)
            if (r5 == 0) goto L_0x0147
            r20 = r14 | 6
            r8 = r50
            goto L_0x015d
        L_0x0147:
            r30 = r14 & 6
            r8 = r50
            if (r30 != 0) goto L_0x015b
            boolean r30 = r2.W(r8)
            if (r30 == 0) goto L_0x0156
            r20 = 4
            goto L_0x0158
        L_0x0156:
            r20 = 2
        L_0x0158:
            r20 = r14 | r20
            goto L_0x015d
        L_0x015b:
            r20 = r14
        L_0x015d:
            r8 = r13 & 2048(0x800, float:2.87E-42)
            if (r8 == 0) goto L_0x0166
            r20 = r20 | 48
        L_0x0163:
            r9 = r20
            goto L_0x017a
        L_0x0166:
            r30 = r14 & 48
            r9 = r51
            if (r30 != 0) goto L_0x0163
            boolean r30 = r2.W(r9)
            if (r30 == 0) goto L_0x0175
            r24 = 32
            goto L_0x0177
        L_0x0175:
            r24 = 16
        L_0x0177:
            r20 = r20 | r24
            goto L_0x0163
        L_0x017a:
            r10 = r13 & 4096(0x1000, float:5.74E-42)
            if (r10 == 0) goto L_0x0183
            r9 = r9 | 384(0x180, float:5.38E-43)
        L_0x0180:
            r12 = r52
            goto L_0x0194
        L_0x0183:
            r12 = r14 & 384(0x180, float:5.38E-43)
            if (r12 != 0) goto L_0x0180
            r12 = r52
            boolean r20 = r2.W(r12)
            if (r20 == 0) goto L_0x0190
            goto L_0x0192
        L_0x0190:
            r16 = 128(0x80, float:1.794E-43)
        L_0x0192:
            r9 = r9 | r16
        L_0x0194:
            r12 = r13 & 8192(0x2000, float:1.14794E-41)
            if (r12 == 0) goto L_0x019d
            r9 = r9 | 3072(0xc00, float:4.305E-42)
            r16 = r12
            goto L_0x01b6
        L_0x019d:
            r16 = r12
            r12 = r14 & 3072(0xc00, float:4.305E-42)
            if (r12 != 0) goto L_0x01b6
            r12 = r14 & 4096(0x1000, float:5.74E-42)
            if (r12 != 0) goto L_0x01ac
            boolean r12 = r2.W(r0)
            goto L_0x01b0
        L_0x01ac:
            boolean r12 = r2.l(r0)
        L_0x01b0:
            if (r12 == 0) goto L_0x01b4
            r18 = r19
        L_0x01b4:
            r9 = r9 | r18
        L_0x01b6:
            r12 = r14 & 24576(0x6000, float:3.4438E-41)
            if (r12 != 0) goto L_0x01ce
            r12 = r13 & 16384(0x4000, float:2.2959E-41)
            if (r12 != 0) goto L_0x01c9
            r12 = r54
            boolean r18 = r2.W(r12)
            if (r18 == 0) goto L_0x01cb
            r22 = r23
            goto L_0x01cb
        L_0x01c9:
            r12 = r54
        L_0x01cb:
            r9 = r9 | r22
            goto L_0x01d0
        L_0x01ce:
            r12 = r54
        L_0x01d0:
            r18 = 306783379(0x12492493, float:6.34695E-28)
            r0 = r6 & r18
            r12 = 306783378(0x12492492, float:6.3469493E-28)
            r14 = 1
            if (r0 != r12) goto L_0x01e4
            r0 = r9 & 9363(0x2493, float:1.312E-41)
            r12 = 9362(0x2492, float:1.3119E-41)
            if (r0 == r12) goto L_0x01e2
            goto L_0x01e4
        L_0x01e2:
            r0 = 0
            goto L_0x01e5
        L_0x01e4:
            r0 = r14
        L_0x01e5:
            r12 = r6 & 1
            boolean r0 = r2.E(r0, r12)
            if (r0 == 0) goto L_0x0328
            r2.p()
            r0 = r15 & 1
            if (r0 == 0) goto L_0x0225
            boolean r0 = r2.J()
            if (r0 == 0) goto L_0x01fb
            goto L_0x0225
        L_0x01fb:
            r2.B()
            r0 = r13 & 16384(0x4000, float:2.2959E-41)
            if (r0 == 0) goto L_0x0206
            r0 = -57345(0xffffffffffff1fff, float:NaN)
            r9 = r9 & r0
        L_0x0206:
            r0 = r41
            r7 = r42
            r11 = r43
            r1 = r44
            r3 = r45
            r4 = r46
            r5 = r47
            r8 = r48
            r10 = r50
            r12 = r51
            r14 = r52
            r37 = r53
            r38 = r54
            r13 = r9
            r9 = r49
            goto L_0x02b5
        L_0x0225:
            if (r7 == 0) goto L_0x022a
            androidx.compose.ui.Modifier$Companion r0 = androidx.compose.ui.Modifier.f15489d
            goto L_0x022c
        L_0x022a:
            r0 = r41
        L_0x022c:
            if (r11 == 0) goto L_0x0230
            r7 = r14
            goto L_0x0232
        L_0x0230:
            r7 = r42
        L_0x0232:
            if (r17 == 0) goto L_0x0236
            r11 = 0
            goto L_0x0238
        L_0x0236:
            r11 = r43
        L_0x0238:
            r12 = 0
            if (r21 == 0) goto L_0x023e
            r17 = r12
            goto L_0x0240
        L_0x023e:
            r17 = r44
        L_0x0240:
            if (r25 == 0) goto L_0x0249
            androidx.compose.ui.text.TextStyle$Companion r18 = androidx.compose.ui.text.TextStyle.f18499d
            androidx.compose.ui.text.TextStyle r18 = r18.a()
            goto L_0x024b
        L_0x0249:
            r18 = r45
        L_0x024b:
            if (r27 == 0) goto L_0x0254
            androidx.compose.foundation.text.KeyboardOptions$Companion r19 = androidx.compose.foundation.text.KeyboardOptions.f5771h
            androidx.compose.foundation.text.KeyboardOptions r19 = r19.a()
            goto L_0x0256
        L_0x0254:
            r19 = r46
        L_0x0256:
            if (r1 == 0) goto L_0x025a
            r1 = r12
            goto L_0x025c
        L_0x025a:
            r1 = r47
        L_0x025c:
            if (r3 == 0) goto L_0x0265
            androidx.compose.foundation.text.input.TextFieldLineLimits$Companion r3 = androidx.compose.foundation.text.input.TextFieldLineLimits.f6068a
            androidx.compose.foundation.text.input.TextFieldLineLimits r3 = r3.a()
            goto L_0x0267
        L_0x0265:
            r3 = r48
        L_0x0267:
            if (r4 == 0) goto L_0x026b
            r4 = r12
            goto L_0x026d
        L_0x026b:
            r4 = r49
        L_0x026d:
            if (r5 == 0) goto L_0x0271
            r5 = r12
            goto L_0x0273
        L_0x0271:
            r5 = r50
        L_0x0273:
            if (r8 == 0) goto L_0x027c
            androidx.compose.foundation.text.BasicTextFieldDefaults r8 = androidx.compose.foundation.text.BasicTextFieldDefaults.f5502a
            androidx.compose.ui.graphics.SolidColor r8 = r8.a()
            goto L_0x027e
        L_0x027c:
            r8 = r51
        L_0x027e:
            if (r10 == 0) goto L_0x0282
            r10 = r12
            goto L_0x0284
        L_0x0282:
            r10 = r52
        L_0x0284:
            if (r16 == 0) goto L_0x0287
            goto L_0x0289
        L_0x0287:
            r12 = r53
        L_0x0289:
            r41 = r0
            r0 = r13 & 16384(0x4000, float:2.2959E-41)
            if (r0 == 0) goto L_0x02ac
            r0 = 0
            androidx.compose.foundation.ScrollState r0 = androidx.compose.foundation.ScrollKt.c(r0, r2, r0, r14)
            r14 = -57345(0xffffffffffff1fff, float:NaN)
            r9 = r9 & r14
            r38 = r0
            r13 = r9
            r14 = r10
            r37 = r12
            r0 = r41
        L_0x02a0:
            r9 = r4
            r10 = r5
            r12 = r8
            r4 = r19
            r5 = r1
            r8 = r3
            r1 = r17
            r3 = r18
            goto L_0x02b5
        L_0x02ac:
            r0 = r41
            r38 = r54
            r13 = r9
            r14 = r10
            r37 = r12
            goto L_0x02a0
        L_0x02b5:
            r2.U()
            boolean r16 = androidx.compose.runtime.ComposerKt.P()
            if (r16 == 0) goto L_0x02c9
            java.lang.String r15 = "androidx.compose.foundation.text.BasicTextField (BasicTextField.kt:194)"
            r55 = r2
            r2 = 469439921(0x1bfb15b1, float:4.1538484E-22)
            androidx.compose.runtime.ComposerKt.Y(r2, r6, r13, r15)
            goto L_0x02cb
        L_0x02c9:
            r55 = r2
        L_0x02cb:
            r2 = 2147483646(0x7ffffffe, float:NaN)
            r34 = r6 & r2
            r2 = r13 & 14
            r2 = r2 | 384(0x180, float:5.38E-43)
            r6 = r13 & 112(0x70, float:1.57E-43)
            r2 = r2 | r6
            int r6 = r13 << 3
            r13 = r6 & 7168(0x1c00, float:1.0045E-41)
            r2 = r2 | r13
            r13 = 57344(0xe000, float:8.0356E-41)
            r13 = r13 & r6
            r2 = r2 | r13
            r13 = 458752(0x70000, float:6.42848E-40)
            r6 = r6 & r13
            r35 = r2 | r6
            r36 = 65536(0x10000, float:9.18355E-41)
            r28 = 0
            r32 = 0
            r16 = r40
            r17 = r0
            r18 = r7
            r19 = r11
            r20 = r1
            r21 = r3
            r22 = r4
            r23 = r5
            r24 = r8
            r25 = r9
            r26 = r10
            r27 = r12
            r29 = r14
            r30 = r37
            r31 = r38
            r33 = r55
            b(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36)
            boolean r2 = androidx.compose.runtime.ComposerKt.P()
            if (r2 == 0) goto L_0x0318
            androidx.compose.runtime.ComposerKt.X()
        L_0x0318:
            r2 = r0
            r6 = r3
            r3 = r7
            r13 = r14
            r14 = r37
            r15 = r38
            r7 = r4
            r4 = r11
            r11 = r10
            r10 = r9
            r9 = r8
            r8 = r5
            r5 = r1
            goto L_0x0349
        L_0x0328:
            r55 = r2
            r55.B()
            r2 = r41
            r3 = r42
            r4 = r43
            r5 = r44
            r6 = r45
            r7 = r46
            r8 = r47
            r9 = r48
            r10 = r49
            r11 = r50
            r12 = r51
            r13 = r52
            r14 = r53
            r15 = r54
        L_0x0349:
            androidx.compose.runtime.ScopeUpdateScope r1 = r55.x()
            if (r1 == 0) goto L_0x0367
            androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$1 r0 = new androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$1
            r41 = r0
            r39 = r1
            r1 = r40
            r16 = r56
            r17 = r57
            r18 = r58
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            r1 = r41
            r0 = r39
            r0.a(r1)
        L_0x0367:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.BasicTextFieldKt.a(androidx.compose.foundation.text.input.TextFieldState, androidx.compose.ui.Modifier, boolean, boolean, androidx.compose.foundation.text.input.InputTransformation, androidx.compose.ui.text.TextStyle, androidx.compose.foundation.text.KeyboardOptions, androidx.compose.foundation.text.input.KeyboardActionHandler, androidx.compose.foundation.text.input.TextFieldLineLimits, kotlin.jvm.functions.Function2, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.ui.graphics.Brush, androidx.compose.foundation.text.input.OutputTransformation, androidx.compose.foundation.text.input.TextFieldDecorator, androidx.compose.foundation.ScrollState, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v13, resolved type: androidx.compose.foundation.text.input.internal.TransformedTextFieldState} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r40v0, resolved type: androidx.compose.foundation.text.input.internal.TextLayoutState} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v8, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v22, resolved type: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$textToolbarHandler$1$1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v21, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v14, resolved type: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v56, resolved type: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$2$1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r58v6, resolved type: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$2$1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r58v7, resolved type: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState} */
    /* JADX WARNING: type inference failed for: r15v9 */
    /* JADX WARNING: type inference failed for: r8v22 */
    /* JADX WARNING: Code restructure failed: missing block: B:311:0x044b, code lost:
        if (r15 == r22.a()) goto L_0x044d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:324:0x04bd, code lost:
        if (r5 == r22.a()) goto L_0x04c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:346:0x051f, code lost:
        if (r8 == r22.a()) goto L_0x0521;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x012e  */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x0144  */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x014b  */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x0166  */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x016b  */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x0183  */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x0188  */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x01a3  */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x01a8  */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x01c6  */
    /* JADX WARNING: Removed duplicated region for block: B:158:0x01cb  */
    /* JADX WARNING: Removed duplicated region for block: B:170:0x01eb  */
    /* JADX WARNING: Removed duplicated region for block: B:178:0x0201  */
    /* JADX WARNING: Removed duplicated region for block: B:181:0x0207  */
    /* JADX WARNING: Removed duplicated region for block: B:182:0x020c  */
    /* JADX WARNING: Removed duplicated region for block: B:193:0x0233  */
    /* JADX WARNING: Removed duplicated region for block: B:195:0x0236  */
    /* JADX WARNING: Removed duplicated region for block: B:198:0x0240  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0078  */
    /* JADX WARNING: Removed duplicated region for block: B:370:0x05e0  */
    /* JADX WARNING: Removed duplicated region for block: B:371:0x05e2  */
    /* JADX WARNING: Removed duplicated region for block: B:374:0x0637  */
    /* JADX WARNING: Removed duplicated region for block: B:377:0x0643  */
    /* JADX WARNING: Removed duplicated region for block: B:378:0x0647  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x007d  */
    /* JADX WARNING: Removed duplicated region for block: B:386:0x06c6  */
    /* JADX WARNING: Removed duplicated region for block: B:388:0x06e4  */
    /* JADX WARNING: Removed duplicated region for block: B:391:0x070d  */
    /* JADX WARNING: Removed duplicated region for block: B:393:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0094  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0099  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00b4  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00b9  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00d2  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00d7  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x00ee  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x00f4  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x010d  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0111  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void b(androidx.compose.foundation.text.input.TextFieldState r57, androidx.compose.ui.Modifier r58, boolean r59, boolean r60, androidx.compose.foundation.text.input.InputTransformation r61, androidx.compose.ui.text.TextStyle r62, androidx.compose.foundation.text.KeyboardOptions r63, androidx.compose.foundation.text.input.KeyboardActionHandler r64, androidx.compose.foundation.text.input.TextFieldLineLimits r65, kotlin.jvm.functions.Function2 r66, androidx.compose.foundation.interaction.MutableInteractionSource r67, androidx.compose.ui.graphics.Brush r68, androidx.compose.foundation.text.input.internal.CodepointTransformation r69, androidx.compose.foundation.text.input.OutputTransformation r70, androidx.compose.foundation.text.input.TextFieldDecorator r71, androidx.compose.foundation.ScrollState r72, boolean r73, androidx.compose.runtime.Composer r74, int r75, int r76, int r77) {
        /*
            r1 = r57
            r0 = r71
            r15 = r75
            r14 = r76
            r13 = r77
            r3 = 12582912(0xc00000, float:1.7632415E-38)
            r11 = 128(0x80, float:1.794E-43)
            r12 = 32
            r16 = 16
            r5 = 965149429(0x398702f5, float:2.575141E-4)
            r4 = r74
            androidx.compose.runtime.Composer r4 = r4.q(r5)
            r5 = 1
            r21 = r13 & 1
            r5 = 4
            r6 = 2
            if (r21 == 0) goto L_0x0025
            r21 = r15 | 6
            goto L_0x0039
        L_0x0025:
            r21 = r15 & 6
            if (r21 != 0) goto L_0x0037
            boolean r21 = r4.W(r1)
            if (r21 == 0) goto L_0x0032
            r21 = r5
            goto L_0x0034
        L_0x0032:
            r21 = r6
        L_0x0034:
            r21 = r15 | r21
            goto L_0x0039
        L_0x0037:
            r21 = r15
        L_0x0039:
            r22 = r13 & 2
            if (r22 == 0) goto L_0x0044
            r21 = r21 | 48
            r6 = r58
        L_0x0041:
            r7 = r21
            goto L_0x0058
        L_0x0044:
            r23 = r15 & 48
            r6 = r58
            if (r23 != 0) goto L_0x0041
            boolean r24 = r4.W(r6)
            if (r24 == 0) goto L_0x0053
            r24 = r12
            goto L_0x0055
        L_0x0053:
            r24 = r16
        L_0x0055:
            r21 = r21 | r24
            goto L_0x0041
        L_0x0058:
            r21 = r13 & 4
            if (r21 == 0) goto L_0x0061
            r7 = r7 | 384(0x180, float:5.38E-43)
        L_0x005e:
            r5 = r59
            goto L_0x0074
        L_0x0061:
            r5 = r15 & 384(0x180, float:5.38E-43)
            if (r5 != 0) goto L_0x005e
            r5 = r59
            boolean r26 = r4.d(r5)
            if (r26 == 0) goto L_0x0070
            r26 = 256(0x100, float:3.59E-43)
            goto L_0x0072
        L_0x0070:
            r26 = r11
        L_0x0072:
            r7 = r7 | r26
        L_0x0074:
            r26 = r13 & 8
            if (r26 == 0) goto L_0x007d
            r7 = r7 | 3072(0xc00, float:4.305E-42)
        L_0x007a:
            r8 = r60
            goto L_0x0090
        L_0x007d:
            r8 = r15 & 3072(0xc00, float:4.305E-42)
            if (r8 != 0) goto L_0x007a
            r8 = r60
            boolean r27 = r4.d(r8)
            if (r27 == 0) goto L_0x008c
            r27 = 2048(0x800, float:2.87E-42)
            goto L_0x008e
        L_0x008c:
            r27 = 1024(0x400, float:1.435E-42)
        L_0x008e:
            r7 = r7 | r27
        L_0x0090:
            r27 = r13 & 16
            if (r27 == 0) goto L_0x0099
            r7 = r7 | 24576(0x6000, float:3.4438E-41)
        L_0x0096:
            r9 = r61
            goto L_0x00ac
        L_0x0099:
            r9 = r15 & 24576(0x6000, float:3.4438E-41)
            if (r9 != 0) goto L_0x0096
            r9 = r61
            boolean r29 = r4.W(r9)
            if (r29 == 0) goto L_0x00a8
            r29 = 16384(0x4000, float:2.2959E-41)
            goto L_0x00aa
        L_0x00a8:
            r29 = 8192(0x2000, float:1.14794E-41)
        L_0x00aa:
            r7 = r7 | r29
        L_0x00ac:
            r29 = r13 & 32
            r30 = 65536(0x10000, float:9.18355E-41)
            r31 = 196608(0x30000, float:2.75506E-40)
            if (r29 == 0) goto L_0x00b9
            r7 = r7 | r31
            r12 = r62
            goto L_0x00cc
        L_0x00b9:
            r32 = r15 & r31
            r12 = r62
            if (r32 != 0) goto L_0x00cc
            boolean r33 = r4.W(r12)
            if (r33 == 0) goto L_0x00c8
            r33 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00ca
        L_0x00c8:
            r33 = r30
        L_0x00ca:
            r7 = r7 | r33
        L_0x00cc:
            r33 = r13 & 64
            r34 = 1572864(0x180000, float:2.204052E-39)
            if (r33 == 0) goto L_0x00d7
            r7 = r7 | r34
            r2 = r63
            goto L_0x00ea
        L_0x00d7:
            r35 = r15 & r34
            r2 = r63
            if (r35 != 0) goto L_0x00ea
            boolean r36 = r4.W(r2)
            if (r36 == 0) goto L_0x00e6
            r36 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00e8
        L_0x00e6:
            r36 = 524288(0x80000, float:7.34684E-40)
        L_0x00e8:
            r7 = r7 | r36
        L_0x00ea:
            r10 = r13 & 128(0x80, float:1.794E-43)
            if (r10 == 0) goto L_0x00f4
            r7 = r7 | r3
        L_0x00ef:
            r3 = r64
        L_0x00f1:
            r11 = 256(0x100, float:3.59E-43)
            goto L_0x0107
        L_0x00f4:
            r3 = r3 & r15
            if (r3 != 0) goto L_0x00ef
            r3 = r64
            boolean r37 = r4.W(r3)
            if (r37 == 0) goto L_0x0102
            r37 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x0104
        L_0x0102:
            r37 = 4194304(0x400000, float:5.877472E-39)
        L_0x0104:
            r7 = r7 | r37
            goto L_0x00f1
        L_0x0107:
            r2 = r13 & 256(0x100, float:3.59E-43)
            r11 = 100663296(0x6000000, float:2.4074124E-35)
            if (r2 == 0) goto L_0x0111
            r7 = r7 | r11
        L_0x010e:
            r11 = r65
            goto L_0x0123
        L_0x0111:
            r11 = r11 & r15
            if (r11 != 0) goto L_0x010e
            r11 = r65
            boolean r35 = r4.W(r11)
            if (r35 == 0) goto L_0x011f
            r35 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x0121
        L_0x011f:
            r35 = 33554432(0x2000000, float:9.403955E-38)
        L_0x0121:
            r7 = r7 | r35
        L_0x0123:
            r3 = r13 & 512(0x200, float:7.175E-43)
            r35 = 805306368(0x30000000, float:4.656613E-10)
            if (r3 == 0) goto L_0x012e
        L_0x0129:
            r7 = r7 | r35
        L_0x012b:
            r5 = 1024(0x400, float:1.435E-42)
            goto L_0x0140
        L_0x012e:
            r35 = r15 & r35
            r5 = r66
            if (r35 != 0) goto L_0x012b
            boolean r35 = r4.l(r5)
            if (r35 == 0) goto L_0x013d
            r35 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x0129
        L_0x013d:
            r35 = 268435456(0x10000000, float:2.5243549E-29)
            goto L_0x0129
        L_0x0140:
            r6 = r13 & 1024(0x400, float:1.435E-42)
            if (r6 == 0) goto L_0x014b
            r28 = r14 | 6
            r35 = r28
        L_0x0148:
            r5 = 2048(0x800, float:2.87E-42)
            goto L_0x0162
        L_0x014b:
            r28 = r14 & 6
            r5 = r67
            if (r28 != 0) goto L_0x015f
            boolean r35 = r4.W(r5)
            if (r35 == 0) goto L_0x015a
            r35 = 4
            goto L_0x015c
        L_0x015a:
            r35 = 2
        L_0x015c:
            r35 = r14 | r35
            goto L_0x0148
        L_0x015f:
            r35 = r14
            goto L_0x0148
        L_0x0162:
            r8 = r13 & 2048(0x800, float:2.87E-42)
            if (r8 == 0) goto L_0x016b
            r35 = r35 | 48
        L_0x0168:
            r5 = r35
            goto L_0x017f
        L_0x016b:
            r5 = r14 & 48
            if (r5 != 0) goto L_0x017c
            r5 = r68
            boolean r38 = r4.W(r5)
            if (r38 == 0) goto L_0x0179
            r16 = 32
        L_0x0179:
            r35 = r35 | r16
            goto L_0x0168
        L_0x017c:
            r5 = r68
            goto L_0x0168
        L_0x017f:
            r9 = r13 & 4096(0x1000, float:5.74E-42)
            if (r9 == 0) goto L_0x0188
            r5 = r5 | 384(0x180, float:5.38E-43)
        L_0x0185:
            r11 = 8192(0x2000, float:1.14794E-41)
            goto L_0x019f
        L_0x0188:
            r11 = r14 & 384(0x180, float:5.38E-43)
            if (r11 != 0) goto L_0x019c
            r11 = r69
            boolean r16 = r4.W(r11)
            if (r16 == 0) goto L_0x0197
            r37 = 256(0x100, float:3.59E-43)
            goto L_0x0199
        L_0x0197:
            r37 = 128(0x80, float:1.794E-43)
        L_0x0199:
            r5 = r5 | r37
            goto L_0x0185
        L_0x019c:
            r11 = r69
            goto L_0x0185
        L_0x019f:
            r12 = r13 & 8192(0x2000, float:1.14794E-41)
            if (r12 == 0) goto L_0x01a8
            r5 = r5 | 3072(0xc00, float:4.305E-42)
        L_0x01a5:
            r11 = 16384(0x4000, float:2.2959E-41)
            goto L_0x01bf
        L_0x01a8:
            r11 = r14 & 3072(0xc00, float:4.305E-42)
            if (r11 != 0) goto L_0x01bc
            r11 = r70
            boolean r16 = r4.W(r11)
            if (r16 == 0) goto L_0x01b7
            r28 = 2048(0x800, float:2.87E-42)
            goto L_0x01b9
        L_0x01b7:
            r28 = 1024(0x400, float:1.435E-42)
        L_0x01b9:
            r5 = r5 | r28
            goto L_0x01a5
        L_0x01bc:
            r11 = r70
            goto L_0x01a5
        L_0x01bf:
            r1 = r13 & 16384(0x4000, float:2.2959E-41)
            r11 = 32768(0x8000, float:4.5918E-41)
            if (r1 == 0) goto L_0x01cb
            r5 = r5 | 24576(0x6000, float:3.4438E-41)
            r16 = r1
            goto L_0x01e7
        L_0x01cb:
            r16 = r1
            r1 = r14 & 24576(0x6000, float:3.4438E-41)
            if (r1 != 0) goto L_0x01e7
            r1 = r14 & r11
            if (r1 != 0) goto L_0x01da
            boolean r1 = r4.W(r0)
            goto L_0x01de
        L_0x01da:
            boolean r1 = r4.l(r0)
        L_0x01de:
            if (r1 == 0) goto L_0x01e3
            r24 = 16384(0x4000, float:2.2959E-41)
            goto L_0x01e5
        L_0x01e3:
            r24 = 8192(0x2000, float:1.14794E-41)
        L_0x01e5:
            r5 = r5 | r24
        L_0x01e7:
            r1 = r14 & r31
            if (r1 != 0) goto L_0x0201
            r1 = r13 & r11
            if (r1 != 0) goto L_0x01fa
            r1 = r72
            boolean r24 = r4.W(r1)
            if (r24 == 0) goto L_0x01fc
            r18 = 131072(0x20000, float:1.83671E-40)
            goto L_0x01fe
        L_0x01fa:
            r1 = r72
        L_0x01fc:
            r18 = r30
        L_0x01fe:
            r5 = r5 | r18
            goto L_0x0203
        L_0x0201:
            r1 = r72
        L_0x0203:
            r18 = r13 & r30
            if (r18 == 0) goto L_0x020c
            r5 = r5 | r34
            r11 = r73
            goto L_0x021f
        L_0x020c:
            r24 = r14 & r34
            r11 = r73
            if (r24 != 0) goto L_0x021f
            boolean r28 = r4.d(r11)
            if (r28 == 0) goto L_0x021b
            r17 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x021d
        L_0x021b:
            r17 = 524288(0x80000, float:7.34684E-40)
        L_0x021d:
            r5 = r5 | r17
        L_0x021f:
            r17 = 306783379(0x12492493, float:6.34695E-28)
            r0 = r7 & r17
            r1 = 306783378(0x12492492, float:6.3469493E-28)
            if (r0 != r1) goto L_0x0236
            r0 = 599187(0x92493, float:8.3964E-40)
            r0 = r0 & r5
            r1 = 599186(0x92492, float:8.39638E-40)
            if (r0 == r1) goto L_0x0233
            goto L_0x0236
        L_0x0233:
            r0 = 0
        L_0x0234:
            r1 = 1
            goto L_0x0238
        L_0x0236:
            r0 = 1
            goto L_0x0234
        L_0x0238:
            r11 = r7 & 1
            boolean r0 = r4.E(r0, r11)
            if (r0 == 0) goto L_0x06e4
            r4.p()
            r0 = r15 & 1
            if (r0 == 0) goto L_0x027e
            boolean r0 = r4.J()
            if (r0 == 0) goto L_0x024e
            goto L_0x027e
        L_0x024e:
            r4.B()
            r0 = 32768(0x8000, float:4.5918E-41)
            r0 = r0 & r13
            if (r0 == 0) goto L_0x025b
            r0 = -458753(0xfffffffffff8ffff, float:NaN)
            r5 = r5 & r0
        L_0x025b:
            r0 = r58
            r11 = r59
            r21 = r60
            r1 = r61
            r26 = r62
            r2 = r63
            r10 = r64
            r3 = r65
            r6 = r67
            r8 = r68
            r9 = r69
            r12 = r70
            r16 = r71
            r28 = r72
            r18 = r73
            r13 = r5
            r5 = r66
            goto L_0x0315
        L_0x027e:
            if (r22 == 0) goto L_0x0283
            androidx.compose.ui.Modifier$Companion r0 = androidx.compose.ui.Modifier.f15489d
            goto L_0x0285
        L_0x0283:
            r0 = r58
        L_0x0285:
            if (r21 == 0) goto L_0x0289
            r11 = 1
            goto L_0x028b
        L_0x0289:
            r11 = r59
        L_0x028b:
            if (r26 == 0) goto L_0x0290
            r21 = 0
            goto L_0x0292
        L_0x0290:
            r21 = r60
        L_0x0292:
            if (r27 == 0) goto L_0x0297
            r22 = 0
            goto L_0x0299
        L_0x0297:
            r22 = r61
        L_0x0299:
            if (r29 == 0) goto L_0x02a2
            androidx.compose.ui.text.TextStyle$Companion r26 = androidx.compose.ui.text.TextStyle.f18499d
            androidx.compose.ui.text.TextStyle r26 = r26.a()
            goto L_0x02a4
        L_0x02a2:
            r26 = r62
        L_0x02a4:
            if (r33 == 0) goto L_0x02ad
            androidx.compose.foundation.text.KeyboardOptions$Companion r27 = androidx.compose.foundation.text.KeyboardOptions.f5771h
            androidx.compose.foundation.text.KeyboardOptions r27 = r27.a()
            goto L_0x02af
        L_0x02ad:
            r27 = r63
        L_0x02af:
            if (r10 == 0) goto L_0x02b3
            r10 = 0
            goto L_0x02b5
        L_0x02b3:
            r10 = r64
        L_0x02b5:
            if (r2 == 0) goto L_0x02be
            androidx.compose.foundation.text.input.TextFieldLineLimits$Companion r2 = androidx.compose.foundation.text.input.TextFieldLineLimits.f6068a
            androidx.compose.foundation.text.input.TextFieldLineLimits r2 = r2.a()
            goto L_0x02c0
        L_0x02be:
            r2 = r65
        L_0x02c0:
            if (r3 == 0) goto L_0x02c4
            r3 = 0
            goto L_0x02c6
        L_0x02c4:
            r3 = r66
        L_0x02c6:
            if (r6 == 0) goto L_0x02ca
            r6 = 0
            goto L_0x02cc
        L_0x02ca:
            r6 = r67
        L_0x02cc:
            if (r8 == 0) goto L_0x02d5
            androidx.compose.foundation.text.BasicTextFieldDefaults r8 = androidx.compose.foundation.text.BasicTextFieldDefaults.f5502a
            androidx.compose.ui.graphics.SolidColor r8 = r8.a()
            goto L_0x02d7
        L_0x02d5:
            r8 = r68
        L_0x02d7:
            if (r9 == 0) goto L_0x02db
            r9 = 0
            goto L_0x02dd
        L_0x02db:
            r9 = r69
        L_0x02dd:
            if (r12 == 0) goto L_0x02e1
            r12 = 0
            goto L_0x02e3
        L_0x02e1:
            r12 = r70
        L_0x02e3:
            if (r16 == 0) goto L_0x02eb
            r16 = 0
        L_0x02e7:
            r24 = 32768(0x8000, float:4.5918E-41)
            goto L_0x02ee
        L_0x02eb:
            r16 = r71
            goto L_0x02e7
        L_0x02ee:
            r24 = r13 & r24
            r58 = r0
            if (r24 == 0) goto L_0x02ff
            r0 = 0
            r1 = 1
            androidx.compose.foundation.ScrollState r28 = androidx.compose.foundation.ScrollKt.c(r0, r4, r0, r1)
            r0 = -458753(0xfffffffffff8ffff, float:NaN)
            r5 = r5 & r0
            goto L_0x0301
        L_0x02ff:
            r28 = r72
        L_0x0301:
            r0 = r58
            if (r18 == 0) goto L_0x030f
            r13 = r5
            r1 = r22
            r18 = 0
        L_0x030a:
            r5 = r3
            r3 = r2
            r2 = r27
            goto L_0x0315
        L_0x030f:
            r18 = r73
            r13 = r5
            r1 = r22
            goto L_0x030a
        L_0x0315:
            r4.U()
            boolean r22 = androidx.compose.runtime.ComposerKt.P()
            if (r22 == 0) goto L_0x0326
            java.lang.String r14 = "androidx.compose.foundation.text.BasicTextField (BasicTextField.kt:244)"
            r15 = 965149429(0x398702f5, float:2.575141E-4)
            androidx.compose.runtime.ComposerKt.Y(r15, r7, r13, r14)
        L_0x0326:
            androidx.compose.runtime.ProvidableCompositionLocal r14 = androidx.compose.ui.platform.CompositionLocalsKt.g()
            java.lang.Object r14 = r4.C(r14)
            androidx.compose.ui.unit.Density r14 = (androidx.compose.ui.unit.Density) r14
            androidx.compose.runtime.ProvidableCompositionLocal r15 = androidx.compose.ui.platform.CompositionLocalsKt.m()
            java.lang.Object r15 = r4.C(r15)
            androidx.compose.ui.unit.LayoutDirection r15 = (androidx.compose.ui.unit.LayoutDirection) r15
            r71 = r5
            androidx.compose.runtime.ProvidableCompositionLocal r5 = androidx.compose.ui.platform.CompositionLocalsKt.u()
            java.lang.Object r5 = r4.C(r5)
            androidx.compose.ui.platform.WindowInfo r5 = (androidx.compose.ui.platform.WindowInfo) r5
            r72 = r8
            androidx.compose.foundation.text.input.TextFieldLineLimits$SingleLine r8 = androidx.compose.foundation.text.input.TextFieldLineLimits.SingleLine.f6073b
            boolean r52 = kotlin.jvm.internal.Intrinsics.d(r3, r8)
            if (r6 != 0) goto L_0x0371
            r8 = 97517141(0x5cffe55, float:1.9559613E-35)
            r4.X(r8)
            java.lang.Object r8 = r4.g()
            androidx.compose.runtime.Composer$Companion r20 = androidx.compose.runtime.Composer.f14567a
            r73 = r6
            java.lang.Object r6 = r20.a()
            if (r8 != r6) goto L_0x036b
            androidx.compose.foundation.interaction.MutableInteractionSource r8 = androidx.compose.foundation.interaction.InteractionSourceKt.a()
            r4.N(r8)
        L_0x036b:
            androidx.compose.foundation.interaction.MutableInteractionSource r8 = (androidx.compose.foundation.interaction.MutableInteractionSource) r8
            r4.M()
            goto L_0x037e
        L_0x0371:
            r73 = r6
            r6 = -1243780926(0xffffffffb5dd68c2, float:-1.6496272E-6)
            r4.X(r6)
            r4.M()
            r8 = r73
        L_0x037e:
            if (r52 == 0) goto L_0x0386
            androidx.compose.foundation.gestures.Orientation r6 = androidx.compose.foundation.gestures.Orientation.Horizontal
        L_0x0382:
            r20 = r3
            r3 = 0
            goto L_0x0389
        L_0x0386:
            androidx.compose.foundation.gestures.Orientation r6 = androidx.compose.foundation.gestures.Orientation.Vertical
            goto L_0x0382
        L_0x0389:
            androidx.compose.runtime.State r17 = androidx.compose.foundation.interaction.FocusInteractionKt.a(r8, r4, r3)
            java.lang.Object r17 = r17.getValue()
            java.lang.Boolean r17 = (java.lang.Boolean) r17
            boolean r42 = r17.booleanValue()
            androidx.compose.runtime.State r17 = androidx.compose.foundation.interaction.HoverInteractionKt.a(r8, r4, r3)
            java.lang.Object r17 = r17.getValue()
            java.lang.Boolean r17 = (java.lang.Boolean) r17
            boolean r44 = r17.booleanValue()
            boolean r43 = r5.b()
            java.lang.Object r5 = r4.g()
            androidx.compose.runtime.Composer$Companion r22 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r3 = r22.a()
            if (r5 != r3) goto L_0x03ca
            kotlinx.coroutines.channels.BufferOverflow r3 = kotlinx.coroutines.channels.BufferOverflow.DROP_LATEST
            r30 = r0
            r27 = r6
            r29 = r15
            r0 = 0
            r5 = 1
            r6 = 2
            r15 = 0
            kotlinx.coroutines.flow.MutableSharedFlow r3 = kotlinx.coroutines.flow.SharedFlowKt.b(r5, r15, r3, r6, r0)
            r4.N(r3)
            r5 = r3
            goto L_0x03d0
        L_0x03ca:
            r30 = r0
            r27 = r6
            r29 = r15
        L_0x03d0:
            kotlinx.coroutines.flow.MutableSharedFlow r5 = (kotlinx.coroutines.flow.MutableSharedFlow) r5
            r0 = r7 & 14
            r3 = 4
            if (r0 != r3) goto L_0x03d9
            r0 = 1
            goto L_0x03da
        L_0x03d9:
            r0 = 0
        L_0x03da:
            r3 = r13 & 896(0x380, float:1.256E-42)
            r6 = 256(0x100, float:3.59E-43)
            if (r3 != r6) goto L_0x03e2
            r3 = 1
            goto L_0x03e3
        L_0x03e2:
            r3 = 0
        L_0x03e3:
            r0 = r0 | r3
            r3 = r13 & 7168(0x1c00, float:1.0045E-41)
            r6 = 2048(0x800, float:2.87E-42)
            if (r3 != r6) goto L_0x03ec
            r3 = 1
            goto L_0x03ed
        L_0x03ec:
            r3 = 0
        L_0x03ed:
            r0 = r0 | r3
            java.lang.Object r3 = r4.g()
            if (r0 != 0) goto L_0x03fe
            java.lang.Object r0 = r22.a()
            if (r3 != r0) goto L_0x03fb
            goto L_0x03fe
        L_0x03fb:
            r6 = r57
            goto L_0x0412
        L_0x03fe:
            if (r9 != 0) goto L_0x0407
            androidx.compose.foundation.text.input.internal.SingleLineCodepointTransformation r0 = androidx.compose.foundation.text.input.internal.SingleLineCodepointTransformation.f6279a
            if (r52 == 0) goto L_0x0405
            goto L_0x0408
        L_0x0405:
            r0 = 0
            goto L_0x0408
        L_0x0407:
            r0 = r9
        L_0x0408:
            androidx.compose.foundation.text.input.internal.TransformedTextFieldState r3 = new androidx.compose.foundation.text.input.internal.TransformedTextFieldState
            r6 = r57
            r3.<init>(r6, r1, r0, r12)
            r4.N(r3)
        L_0x0412:
            r0 = r3
            androidx.compose.foundation.text.input.internal.TransformedTextFieldState r0 = (androidx.compose.foundation.text.input.internal.TransformedTextFieldState) r0
            boolean r3 = r4.W(r0)
            java.lang.Object r15 = r4.g()
            if (r3 != 0) goto L_0x0425
            java.lang.Object r3 = r22.a()
            if (r15 != r3) goto L_0x042d
        L_0x0425:
            androidx.compose.foundation.text.input.internal.TextLayoutState r15 = new androidx.compose.foundation.text.input.internal.TextLayoutState
            r15.<init>()
            r4.N(r15)
        L_0x042d:
            r40 = r15
            androidx.compose.foundation.text.input.internal.TextLayoutState r40 = (androidx.compose.foundation.text.input.internal.TextLayoutState) r40
            if (r1 == 0) goto L_0x0438
            androidx.compose.foundation.text.KeyboardOptions r3 = r1.Y()
            goto L_0x0439
        L_0x0438:
            r3 = 0
        L_0x0439:
            androidx.compose.foundation.text.KeyboardOptions r54 = r2.e(r3)
            boolean r3 = r4.W(r0)
            java.lang.Object r15 = r4.g()
            if (r3 != 0) goto L_0x044d
            java.lang.Object r3 = r22.a()
            if (r15 != r3) goto L_0x046c
        L_0x044d:
            androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState r15 = new androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState
            if (r42 == 0) goto L_0x0455
            if (r43 == 0) goto L_0x0455
            r3 = 1
            goto L_0x0456
        L_0x0455:
            r3 = 0
        L_0x0456:
            r58 = r15
            r59 = r0
            r60 = r40
            r61 = r14
            r62 = r11
            r63 = r21
            r64 = r3
            r65 = r18
            r58.<init>(r59, r60, r61, r62, r63, r64, r65)
            r4.N(r15)
        L_0x046c:
            androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState r15 = (androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState) r15
            java.lang.Object r3 = r4.g()
            java.lang.Object r6 = r22.a()
            if (r3 != r6) goto L_0x0481
            kotlin.coroutines.EmptyCoroutineContext r3 = kotlin.coroutines.EmptyCoroutineContext.f40721z
            kotlinx.coroutines.CoroutineScope r3 = androidx.compose.runtime.EffectsKt.j(r3, r4)
            r4.N(r3)
        L_0x0481:
            kotlinx.coroutines.CoroutineScope r3 = (kotlinx.coroutines.CoroutineScope) r3
            androidx.compose.runtime.ProvidableCompositionLocal r6 = androidx.compose.ui.platform.CompositionLocalsKt.k()
            java.lang.Object r6 = r4.C(r6)
            androidx.compose.ui.hapticfeedback.HapticFeedback r6 = (androidx.compose.ui.hapticfeedback.HapticFeedback) r6
            r25 = r9
            androidx.compose.runtime.ProvidableCompositionLocal r9 = androidx.compose.ui.platform.CompositionLocalsKt.e()
            java.lang.Object r9 = r4.C(r9)
            androidx.compose.ui.platform.Clipboard r9 = (androidx.compose.ui.platform.Clipboard) r9
            r31 = r12
            androidx.compose.runtime.ProvidableCompositionLocal r12 = androidx.compose.ui.platform.CompositionLocalsKt.r()
            java.lang.Object r12 = r4.C(r12)
            androidx.compose.ui.platform.TextToolbar r12 = (androidx.compose.ui.platform.TextToolbar) r12
            boolean r32 = r4.W(r3)
            boolean r33 = r4.W(r12)
            r32 = r32 | r33
            r33 = r5
            java.lang.Object r5 = r4.g()
            if (r32 != 0) goto L_0x04c0
            r32 = r8
            java.lang.Object r8 = r22.a()
            if (r5 != r8) goto L_0x04ca
            goto L_0x04c2
        L_0x04c0:
            r32 = r8
        L_0x04c2:
            androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$textToolbarHandler$1$1 r5 = new androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$textToolbarHandler$1$1
            r5.<init>(r12, r3)
            r4.N(r5)
        L_0x04ca:
            r3 = r5
            androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$textToolbarHandler$1$1 r3 = (androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$textToolbarHandler$1$1) r3
            boolean r5 = r4.W(r0)
            r8 = 57344(0xe000, float:8.0356E-41)
            r8 = r8 & r7
            r12 = 16384(0x4000, float:2.2959E-41)
            if (r8 != r12) goto L_0x04db
            r8 = 1
            goto L_0x04dc
        L_0x04db:
            r8 = 0
        L_0x04dc:
            r5 = r5 | r8
            boolean r8 = r4.l(r15)
            r5 = r5 | r8
            boolean r8 = r4.l(r6)
            r5 = r5 | r8
            boolean r8 = r4.l(r9)
            r5 = r5 | r8
            boolean r8 = r4.W(r3)
            r5 = r5 | r8
            boolean r8 = r4.W(r14)
            r5 = r5 | r8
            r8 = r7 & 896(0x380, float:1.256E-42)
            r12 = 256(0x100, float:3.59E-43)
            if (r8 != r12) goto L_0x04fe
            r8 = 1
            goto L_0x04ff
        L_0x04fe:
            r8 = 0
        L_0x04ff:
            r5 = r5 | r8
            r8 = r7 & 7168(0x1c00, float:1.0045E-41)
            r12 = 2048(0x800, float:2.87E-42)
            if (r8 != r12) goto L_0x0508
            r8 = 1
            goto L_0x0509
        L_0x0508:
            r8 = 0
        L_0x0509:
            r5 = r5 | r8
            r8 = 3670016(0x380000, float:5.142788E-39)
            r8 = r8 & r13
            r12 = 1048576(0x100000, float:1.469368E-39)
            if (r8 != r12) goto L_0x0513
            r8 = 1
            goto L_0x0514
        L_0x0513:
            r8 = 0
        L_0x0514:
            r5 = r5 | r8
            java.lang.Object r8 = r4.g()
            if (r5 != 0) goto L_0x0521
            java.lang.Object r5 = r22.a()
            if (r8 != r5) goto L_0x053f
        L_0x0521:
            androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$2$1 r8 = new androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$2$1
            r58 = r8
            r59 = r0
            r60 = r1
            r61 = r15
            r62 = r6
            r63 = r9
            r64 = r3
            r65 = r14
            r66 = r11
            r67 = r21
            r68 = r18
            r58.<init>(r59, r60, r61, r62, r63, r64, r65, r66, r67, r68)
            r4.N(r8)
        L_0x053f:
            kotlin.jvm.functions.Function0 r8 = (kotlin.jvm.functions.Function0) r8
            r3 = 0
            androidx.compose.runtime.EffectsKt.h(r8, r4, r3)
            boolean r3 = r4.l(r15)
            java.lang.Object r5 = r4.g()
            if (r3 != 0) goto L_0x0555
            java.lang.Object r3 = r22.a()
            if (r5 != r3) goto L_0x055d
        L_0x0555:
            androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$3$1 r5 = new androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$3$1
            r5.<init>(r15)
            r4.N(r5)
        L_0x055d:
            kotlin.jvm.functions.Function1 r5 = (kotlin.jvm.functions.Function1) r5
            r3 = 0
            androidx.compose.runtime.EffectsKt.c(r15, r5, r4, r3)
            if (r18 != 0) goto L_0x0585
            int r3 = r2.k()
            androidx.compose.ui.text.input.KeyboardType$Companion r5 = androidx.compose.ui.text.input.KeyboardType.f18852b
            int r6 = r5.f()
            boolean r3 = androidx.compose.ui.text.input.KeyboardType.n(r3, r6)
            if (r3 != 0) goto L_0x0585
            int r3 = r2.k()
            int r5 = r5.e()
            boolean r3 = androidx.compose.ui.text.input.KeyboardType.n(r3, r5)
            if (r3 != 0) goto L_0x0585
            r3 = 1
            goto L_0x0586
        L_0x0585:
            r3 = 0
        L_0x0586:
            androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifier r5 = new androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifier
            r58 = r5
            r59 = r0
            r60 = r40
            r61 = r15
            r62 = r1
            r63 = r11
            r64 = r21
            r65 = r54
            r66 = r10
            r67 = r52
            r68 = r32
            r69 = r18
            r70 = r33
            r58.<init>(r59, r60, r61, r62, r63, r64, r65, r66, r67, r68, r69, r70)
            r6 = r30
            androidx.compose.ui.Modifier r5 = r6.o0(r5)
            boolean r8 = r4.d(r3)
            r9 = r33
            boolean r12 = r4.l(r9)
            r8 = r8 | r12
            java.lang.Object r12 = r4.g()
            if (r8 != 0) goto L_0x05c2
            java.lang.Object r8 = r22.a()
            if (r12 != r8) goto L_0x05ca
        L_0x05c2:
            androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$decorationModifiers$1$1 r12 = new androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$decorationModifiers$1$1
            r12.<init>(r3, r9)
            r4.N(r12)
        L_0x05ca:
            kotlin.jvm.functions.Function0 r12 = (kotlin.jvm.functions.Function0) r12
            androidx.compose.ui.Modifier r3 = androidx.compose.foundation.text.handwriting.StylusHandwritingKt.b(r5, r11, r3, r12)
            r8 = r32
            androidx.compose.ui.Modifier r3 = androidx.compose.foundation.FocusableKt.a(r3, r11, r8)
            if (r11 == 0) goto L_0x05e2
            androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$InputType r5 = r15.X()
            androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$InputType r9 = androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.InputType.None
            if (r5 != r9) goto L_0x05e2
            r5 = 1
            goto L_0x05e3
        L_0x05e2:
            r5 = 0
        L_0x05e3:
            androidx.compose.foundation.gestures.ScrollableDefaults r9 = androidx.compose.foundation.gestures.ScrollableDefaults.f3558a
            r14 = r27
            r13 = r29
            r12 = 0
            boolean r9 = r9.b(r13, r14, r12)
            r12 = 16
            r13 = 0
            r19 = 0
            r58 = r3
            r59 = r28
            r60 = r14
            r61 = r5
            r62 = r9
            r63 = r19
            r64 = r8
            r65 = r12
            r66 = r13
            androidx.compose.ui.Modifier r3 = androidx.compose.foundation.gestures.ScrollableKt.k(r58, r59, r60, r61, r62, r63, r64, r65, r66)
            androidx.compose.ui.input.pointer.PointerIcon r5 = androidx.compose.foundation.text.TextPointerIcon_androidKt.b()
            r8 = 2
            r9 = 0
            r12 = 0
            androidx.compose.ui.Modifier r3 = androidx.compose.ui.input.pointer.PointerIconKt.b(r3, r5, r9, r8, r12)
            androidx.compose.ui.Alignment$Companion r5 = androidx.compose.ui.Alignment.f15444a
            androidx.compose.ui.Alignment r5 = r5.o()
            r8 = 1
            androidx.compose.ui.layout.MeasurePolicy r5 = androidx.compose.foundation.layout.BoxKt.g(r5, r8)
            int r8 = androidx.compose.runtime.ComposablesKt.a(r4, r9)
            androidx.compose.runtime.CompositionLocalMap r9 = r4.I()
            androidx.compose.ui.Modifier r3 = androidx.compose.ui.ComposedModifierKt.e(r4, r3)
            androidx.compose.ui.node.ComposeUiNode$Companion r12 = androidx.compose.ui.node.ComposeUiNode.f17222h
            kotlin.jvm.functions.Function0 r13 = r12.a()
            androidx.compose.runtime.Applier r17 = r4.v()
            if (r17 != 0) goto L_0x063a
            androidx.compose.runtime.ComposablesKt.d()
        L_0x063a:
            r4.s()
            boolean r17 = r4.n()
            if (r17 == 0) goto L_0x0647
            r4.y(r13)
            goto L_0x064a
        L_0x0647:
            r4.K()
        L_0x064a:
            androidx.compose.runtime.Composer r13 = androidx.compose.runtime.Updater.b(r4)
            r17 = r1
            kotlin.jvm.functions.Function2 r1 = r12.c()
            androidx.compose.runtime.Updater.g(r13, r5, r1)
            kotlin.jvm.functions.Function2 r1 = r12.e()
            androidx.compose.runtime.Updater.g(r13, r9, r1)
            kotlin.jvm.functions.Function2 r1 = r12.b()
            boolean r5 = r13.n()
            if (r5 != 0) goto L_0x0676
            java.lang.Object r5 = r13.g()
            java.lang.Integer r9 = java.lang.Integer.valueOf(r8)
            boolean r5 = kotlin.jvm.internal.Intrinsics.d(r5, r9)
            if (r5 != 0) goto L_0x0684
        L_0x0676:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r8)
            r13.N(r5)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r8)
            r13.A(r5, r1)
        L_0x0684:
            kotlin.jvm.functions.Function2 r1 = r12.d()
            androidx.compose.runtime.Updater.g(r13, r3, r1)
            androidx.compose.foundation.layout.BoxScopeInstance r1 = androidx.compose.foundation.layout.BoxScopeInstance.f3797a
            androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$4$1 r1 = new androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$4$1
            r37 = r1
            r38 = r16
            r39 = r20
            r41 = r26
            r45 = r0
            r46 = r15
            r47 = r72
            r48 = r11
            r49 = r21
            r50 = r28
            r51 = r14
            r53 = r71
            r37.<init>(r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54)
            r0 = 54
            r3 = -673241599(0xffffffffd7df2601, float:-4.90708637E14)
            r5 = 1
            androidx.compose.runtime.internal.ComposableLambda r0 = androidx.compose.runtime.internal.ComposableLambdaKt.e(r3, r5, r1, r4, r0)
            int r1 = r7 >> 3
            r1 = r1 & 112(0x70, float:1.57E-43)
            r1 = r1 | 384(0x180, float:5.38E-43)
            androidx.compose.foundation.text.ContextMenu_androidKt.a(r15, r11, r0, r4, r1)
            r4.T()
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x06c9
            androidx.compose.runtime.ComposerKt.X()
        L_0x06c9:
            r12 = r72
            r7 = r2
            r2 = r6
            r8 = r10
            r3 = r11
            r15 = r16
            r5 = r17
            r17 = r18
            r9 = r20
            r13 = r25
            r6 = r26
            r16 = r28
            r14 = r31
            r10 = r71
            r11 = r73
            goto L_0x0707
        L_0x06e4:
            r4.B()
            r2 = r58
            r3 = r59
            r21 = r60
            r5 = r61
            r6 = r62
            r7 = r63
            r8 = r64
            r9 = r65
            r10 = r66
            r11 = r67
            r12 = r68
            r13 = r69
            r14 = r70
            r15 = r71
            r16 = r72
            r17 = r73
        L_0x0707:
            androidx.compose.runtime.ScopeUpdateScope r4 = r4.x()
            if (r4 == 0) goto L_0x0728
            androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$5 r1 = new androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$5
            r0 = r1
            r55 = r1
            r1 = r57
            r56 = r4
            r4 = r21
            r18 = r75
            r19 = r76
            r20 = r77
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            r1 = r55
            r0 = r56
            r0.a(r1)
        L_0x0728:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.BasicTextFieldKt.b(androidx.compose.foundation.text.input.TextFieldState, androidx.compose.ui.Modifier, boolean, boolean, androidx.compose.foundation.text.input.InputTransformation, androidx.compose.ui.text.TextStyle, androidx.compose.foundation.text.KeyboardOptions, androidx.compose.foundation.text.input.KeyboardActionHandler, androidx.compose.foundation.text.input.TextFieldLineLimits, kotlin.jvm.functions.Function2, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.ui.graphics.Brush, androidx.compose.foundation.text.input.internal.CodepointTransformation, androidx.compose.foundation.text.input.OutputTransformation, androidx.compose.foundation.text.input.TextFieldDecorator, androidx.compose.foundation.ScrollState, boolean, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v19, resolved type: kotlin.jvm.functions.Function1} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x0135  */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x013b  */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x0140  */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x015a  */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x015f  */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x0177  */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x017c  */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x0193  */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x0198  */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x01ac  */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x01b1  */
    /* JADX WARNING: Removed duplicated region for block: B:160:0x01c8  */
    /* JADX WARNING: Removed duplicated region for block: B:161:0x01cd  */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x01f5  */
    /* JADX WARNING: Removed duplicated region for block: B:172:0x01f8  */
    /* JADX WARNING: Removed duplicated region for block: B:175:0x0202  */
    /* JADX WARNING: Removed duplicated region for block: B:256:0x03e1  */
    /* JADX WARNING: Removed duplicated region for block: B:259:0x0408  */
    /* JADX WARNING: Removed duplicated region for block: B:261:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00a7  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00ac  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00c5  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00ca  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x00e3  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x00e8  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0101  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0106  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x011f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void c(androidx.compose.ui.text.input.TextFieldValue r38, kotlin.jvm.functions.Function1 r39, androidx.compose.ui.Modifier r40, boolean r41, boolean r42, androidx.compose.ui.text.TextStyle r43, androidx.compose.foundation.text.KeyboardOptions r44, androidx.compose.foundation.text.KeyboardActions r45, boolean r46, int r47, int r48, androidx.compose.ui.text.input.VisualTransformation r49, kotlin.jvm.functions.Function1 r50, androidx.compose.foundation.interaction.MutableInteractionSource r51, androidx.compose.ui.graphics.Brush r52, kotlin.jvm.functions.Function3 r53, androidx.compose.runtime.Composer r54, int r55, int r56, int r57) {
        /*
            r15 = r38
            r14 = r39
            r13 = r55
            r12 = r56
            r11 = r57
            r0 = 1804514146(0x6b8eb362, float:3.4502916E26)
            r1 = r54
            androidx.compose.runtime.Composer r10 = r1.q(r0)
            r1 = r11 & 1
            if (r1 == 0) goto L_0x001a
            r1 = r13 | 6
            goto L_0x002a
        L_0x001a:
            r1 = r13 & 6
            if (r1 != 0) goto L_0x0029
            boolean r1 = r10.W(r15)
            if (r1 == 0) goto L_0x0026
            r1 = 4
            goto L_0x0027
        L_0x0026:
            r1 = 2
        L_0x0027:
            r1 = r1 | r13
            goto L_0x002a
        L_0x0029:
            r1 = r13
        L_0x002a:
            r4 = r11 & 2
            if (r4 == 0) goto L_0x0031
            r1 = r1 | 48
            goto L_0x0041
        L_0x0031:
            r4 = r13 & 48
            if (r4 != 0) goto L_0x0041
            boolean r4 = r10.l(r14)
            if (r4 == 0) goto L_0x003e
            r4 = 32
            goto L_0x0040
        L_0x003e:
            r4 = 16
        L_0x0040:
            r1 = r1 | r4
        L_0x0041:
            r4 = r11 & 4
            if (r4 == 0) goto L_0x004a
            r1 = r1 | 384(0x180, float:5.38E-43)
        L_0x0047:
            r9 = r40
            goto L_0x005d
        L_0x004a:
            r9 = r13 & 384(0x180, float:5.38E-43)
            if (r9 != 0) goto L_0x0047
            r9 = r40
            boolean r16 = r10.W(r9)
            if (r16 == 0) goto L_0x0059
            r16 = 256(0x100, float:3.59E-43)
            goto L_0x005b
        L_0x0059:
            r16 = 128(0x80, float:1.794E-43)
        L_0x005b:
            r1 = r1 | r16
        L_0x005d:
            r16 = r11 & 8
            r17 = 1024(0x400, float:1.435E-42)
            r18 = 2048(0x800, float:2.87E-42)
            if (r16 == 0) goto L_0x006a
            r1 = r1 | 3072(0xc00, float:4.305E-42)
        L_0x0067:
            r2 = r41
            goto L_0x007d
        L_0x006a:
            r2 = r13 & 3072(0xc00, float:4.305E-42)
            if (r2 != 0) goto L_0x0067
            r2 = r41
            boolean r19 = r10.d(r2)
            if (r19 == 0) goto L_0x0079
            r19 = r18
            goto L_0x007b
        L_0x0079:
            r19 = r17
        L_0x007b:
            r1 = r1 | r19
        L_0x007d:
            r19 = r11 & 16
            r20 = 8192(0x2000, float:1.14794E-41)
            r21 = 16384(0x4000, float:2.2959E-41)
            if (r19 == 0) goto L_0x008a
            r1 = r1 | 24576(0x6000, float:3.4438E-41)
        L_0x0087:
            r5 = r42
            goto L_0x009d
        L_0x008a:
            r5 = r13 & 24576(0x6000, float:3.4438E-41)
            if (r5 != 0) goto L_0x0087
            r5 = r42
            boolean r23 = r10.d(r5)
            if (r23 == 0) goto L_0x0099
            r23 = r21
            goto L_0x009b
        L_0x0099:
            r23 = r20
        L_0x009b:
            r1 = r1 | r23
        L_0x009d:
            r23 = r11 & 32
            r24 = 65536(0x10000, float:9.18355E-41)
            r25 = 131072(0x20000, float:1.83671E-40)
            r26 = 196608(0x30000, float:2.75506E-40)
            if (r23 == 0) goto L_0x00ac
            r1 = r1 | r26
            r7 = r43
            goto L_0x00bf
        L_0x00ac:
            r27 = r13 & r26
            r7 = r43
            if (r27 != 0) goto L_0x00bf
            boolean r28 = r10.W(r7)
            if (r28 == 0) goto L_0x00bb
            r28 = r25
            goto L_0x00bd
        L_0x00bb:
            r28 = r24
        L_0x00bd:
            r1 = r1 | r28
        L_0x00bf:
            r28 = r11 & 64
            r29 = 1572864(0x180000, float:2.204052E-39)
            if (r28 == 0) goto L_0x00ca
            r1 = r1 | r29
            r8 = r44
            goto L_0x00dd
        L_0x00ca:
            r29 = r13 & r29
            r8 = r44
            if (r29 != 0) goto L_0x00dd
            boolean r30 = r10.W(r8)
            if (r30 == 0) goto L_0x00d9
            r30 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00db
        L_0x00d9:
            r30 = 524288(0x80000, float:7.34684E-40)
        L_0x00db:
            r1 = r1 | r30
        L_0x00dd:
            r6 = r11 & 128(0x80, float:1.794E-43)
            r31 = 12582912(0xc00000, float:1.7632415E-38)
            if (r6 == 0) goto L_0x00e8
            r1 = r1 | r31
            r3 = r45
            goto L_0x00fb
        L_0x00e8:
            r31 = r13 & r31
            r3 = r45
            if (r31 != 0) goto L_0x00fb
            boolean r32 = r10.W(r3)
            if (r32 == 0) goto L_0x00f7
            r32 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00f9
        L_0x00f7:
            r32 = 4194304(0x400000, float:5.877472E-39)
        L_0x00f9:
            r1 = r1 | r32
        L_0x00fb:
            r0 = r11 & 256(0x100, float:3.59E-43)
            r33 = 100663296(0x6000000, float:2.4074124E-35)
            if (r0 == 0) goto L_0x0106
            r1 = r1 | r33
            r2 = r46
            goto L_0x0119
        L_0x0106:
            r33 = r13 & r33
            r2 = r46
            if (r33 != 0) goto L_0x0119
            boolean r33 = r10.d(r2)
            if (r33 == 0) goto L_0x0115
            r33 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x0117
        L_0x0115:
            r33 = 33554432(0x2000000, float:9.403955E-38)
        L_0x0117:
            r1 = r1 | r33
        L_0x0119:
            r33 = 805306368(0x30000000, float:4.656613E-10)
            r33 = r13 & r33
            if (r33 != 0) goto L_0x0135
            r2 = r11 & 512(0x200, float:7.175E-43)
            if (r2 != 0) goto L_0x012e
            r2 = r47
            boolean r33 = r10.i(r2)
            if (r33 == 0) goto L_0x0130
            r33 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x0132
        L_0x012e:
            r2 = r47
        L_0x0130:
            r33 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x0132:
            r1 = r1 | r33
            goto L_0x0137
        L_0x0135:
            r2 = r47
        L_0x0137:
            r2 = r11 & 1024(0x400, float:1.435E-42)
            if (r2 == 0) goto L_0x0140
            r33 = r12 | 6
            r3 = r48
            goto L_0x0156
        L_0x0140:
            r33 = r12 & 6
            r3 = r48
            if (r33 != 0) goto L_0x0154
            boolean r33 = r10.i(r3)
            if (r33 == 0) goto L_0x014f
            r33 = 4
            goto L_0x0151
        L_0x014f:
            r33 = 2
        L_0x0151:
            r33 = r12 | r33
            goto L_0x0156
        L_0x0154:
            r33 = r12
        L_0x0156:
            r3 = r11 & 2048(0x800, float:2.87E-42)
            if (r3 == 0) goto L_0x015f
            r33 = r33 | 48
        L_0x015c:
            r5 = r33
            goto L_0x0173
        L_0x015f:
            r34 = r12 & 48
            r5 = r49
            if (r34 != 0) goto L_0x015c
            boolean r34 = r10.W(r5)
            if (r34 == 0) goto L_0x016e
            r22 = 32
            goto L_0x0170
        L_0x016e:
            r22 = 16
        L_0x0170:
            r33 = r33 | r22
            goto L_0x015c
        L_0x0173:
            r7 = r11 & 4096(0x1000, float:5.74E-42)
            if (r7 == 0) goto L_0x017c
            r5 = r5 | 384(0x180, float:5.38E-43)
        L_0x0179:
            r8 = r50
            goto L_0x018f
        L_0x017c:
            r8 = r12 & 384(0x180, float:5.38E-43)
            if (r8 != 0) goto L_0x0179
            r8 = r50
            boolean r22 = r10.l(r8)
            if (r22 == 0) goto L_0x018b
            r29 = 256(0x100, float:3.59E-43)
            goto L_0x018d
        L_0x018b:
            r29 = 128(0x80, float:1.794E-43)
        L_0x018d:
            r5 = r5 | r29
        L_0x018f:
            r8 = r11 & 8192(0x2000, float:1.14794E-41)
            if (r8 == 0) goto L_0x0198
            r5 = r5 | 3072(0xc00, float:4.305E-42)
        L_0x0195:
            r9 = r51
            goto L_0x01a8
        L_0x0198:
            r9 = r12 & 3072(0xc00, float:4.305E-42)
            if (r9 != 0) goto L_0x0195
            r9 = r51
            boolean r22 = r10.W(r9)
            if (r22 == 0) goto L_0x01a6
            r17 = r18
        L_0x01a6:
            r5 = r5 | r17
        L_0x01a8:
            r9 = r11 & 16384(0x4000, float:2.2959E-41)
            if (r9 == 0) goto L_0x01b1
            r5 = r5 | 24576(0x6000, float:3.4438E-41)
        L_0x01ae:
            r14 = r52
            goto L_0x01c1
        L_0x01b1:
            r14 = r12 & 24576(0x6000, float:3.4438E-41)
            if (r14 != 0) goto L_0x01ae
            r14 = r52
            boolean r17 = r10.W(r14)
            if (r17 == 0) goto L_0x01bf
            r20 = r21
        L_0x01bf:
            r5 = r5 | r20
        L_0x01c1:
            r17 = 32768(0x8000, float:4.5918E-41)
            r17 = r11 & r17
            if (r17 == 0) goto L_0x01cd
            r5 = r5 | r26
            r12 = r53
            goto L_0x01dd
        L_0x01cd:
            r18 = r12 & r26
            r12 = r53
            if (r18 != 0) goto L_0x01dd
            boolean r18 = r10.l(r12)
            if (r18 == 0) goto L_0x01db
            r24 = r25
        L_0x01db:
            r5 = r5 | r24
        L_0x01dd:
            r18 = 306783379(0x12492493, float:6.34695E-28)
            r12 = r1 & r18
            r14 = 306783378(0x12492492, float:6.3469493E-28)
            r18 = 0
            r20 = 1
            if (r12 != r14) goto L_0x01f8
            r12 = 74899(0x12493, float:1.04956E-40)
            r12 = r12 & r5
            r14 = 74898(0x12492, float:1.04954E-40)
            if (r12 == r14) goto L_0x01f5
            goto L_0x01f8
        L_0x01f5:
            r12 = r18
            goto L_0x01fa
        L_0x01f8:
            r12 = r20
        L_0x01fa:
            r14 = r1 & 1
            boolean r12 = r10.E(r12, r14)
            if (r12 == 0) goto L_0x03e1
            r10.p()
            r12 = r13 & 1
            if (r12 == 0) goto L_0x023a
            boolean r12 = r10.J()
            if (r12 == 0) goto L_0x0210
            goto L_0x023a
        L_0x0210:
            r10.B()
            r0 = r11 & 512(0x200, float:7.175E-43)
            if (r0 == 0) goto L_0x021b
            r0 = -1879048193(0xffffffff8fffffff, float:-2.5243547E-29)
            r1 = r1 & r0
        L_0x021b:
            r21 = r40
            r22 = r41
            r23 = r42
            r24 = r43
            r14 = r44
            r25 = r45
            r12 = r46
            r26 = r47
            r27 = r48
            r28 = r49
            r29 = r50
            r33 = r51
            r34 = r52
            r35 = r53
            r0 = r1
            goto L_0x030e
        L_0x023a:
            if (r4 == 0) goto L_0x023f
            androidx.compose.ui.Modifier$Companion r4 = androidx.compose.ui.Modifier.f15489d
            goto L_0x0241
        L_0x023f:
            r4 = r40
        L_0x0241:
            if (r16 == 0) goto L_0x0246
            r12 = r20
            goto L_0x0248
        L_0x0246:
            r12 = r41
        L_0x0248:
            if (r19 == 0) goto L_0x024d
            r14 = r18
            goto L_0x024f
        L_0x024d:
            r14 = r42
        L_0x024f:
            if (r23 == 0) goto L_0x0258
            androidx.compose.ui.text.TextStyle$Companion r16 = androidx.compose.ui.text.TextStyle.f18499d
            androidx.compose.ui.text.TextStyle r16 = r16.a()
            goto L_0x025a
        L_0x0258:
            r16 = r43
        L_0x025a:
            if (r28 == 0) goto L_0x0263
            androidx.compose.foundation.text.KeyboardOptions$Companion r19 = androidx.compose.foundation.text.KeyboardOptions.f5771h
            androidx.compose.foundation.text.KeyboardOptions r19 = r19.a()
            goto L_0x0265
        L_0x0263:
            r19 = r44
        L_0x0265:
            if (r6 == 0) goto L_0x026e
            androidx.compose.foundation.text.KeyboardActions$Companion r6 = androidx.compose.foundation.text.KeyboardActions.f5763g
            androidx.compose.foundation.text.KeyboardActions r6 = r6.a()
            goto L_0x0270
        L_0x026e:
            r6 = r45
        L_0x0270:
            if (r0 == 0) goto L_0x0275
            r0 = r18
            goto L_0x0277
        L_0x0275:
            r0 = r46
        L_0x0277:
            r40 = r4
            r4 = r11 & 512(0x200, float:7.175E-43)
            if (r4 == 0) goto L_0x028b
            if (r0 == 0) goto L_0x0282
            r4 = r20
            goto L_0x0285
        L_0x0282:
            r4 = 2147483647(0x7fffffff, float:NaN)
        L_0x0285:
            r21 = -1879048193(0xffffffff8fffffff, float:-2.5243547E-29)
            r1 = r1 & r21
            goto L_0x028d
        L_0x028b:
            r4 = r47
        L_0x028d:
            if (r2 == 0) goto L_0x0292
            r2 = r20
            goto L_0x0294
        L_0x0292:
            r2 = r48
        L_0x0294:
            if (r3 == 0) goto L_0x029d
            androidx.compose.ui.text.input.VisualTransformation$Companion r3 = androidx.compose.ui.text.input.VisualTransformation.f18929a
            androidx.compose.ui.text.input.VisualTransformation r3 = r3.c()
            goto L_0x029f
        L_0x029d:
            r3 = r49
        L_0x029f:
            if (r7 == 0) goto L_0x02a4
            androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$10 r7 = androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$10.f5525z
            goto L_0x02a6
        L_0x02a4:
            r7 = r50
        L_0x02a6:
            if (r8 == 0) goto L_0x02aa
            r8 = 0
            goto L_0x02ac
        L_0x02aa:
            r8 = r51
        L_0x02ac:
            if (r9 == 0) goto L_0x02c1
            androidx.compose.ui.graphics.SolidColor r9 = new androidx.compose.ui.graphics.SolidColor
            androidx.compose.ui.graphics.Color$Companion r21 = androidx.compose.ui.graphics.Color.f15975b
            r41 = r0
            r42 = r1
            long r0 = r21.a()
            r43 = r2
            r2 = 0
            r9.<init>(r0, r2)
            goto L_0x02c9
        L_0x02c1:
            r41 = r0
            r42 = r1
            r43 = r2
            r9 = r52
        L_0x02c9:
            if (r17 == 0) goto L_0x02f0
            androidx.compose.foundation.text.ComposableSingletons$BasicTextFieldKt r0 = androidx.compose.foundation.text.ComposableSingletons$BasicTextFieldKt.f5630a
            kotlin.jvm.functions.Function3 r0 = r0.b()
            r21 = r40
            r27 = r43
            r35 = r0
            r28 = r3
            r26 = r4
            r25 = r6
            r29 = r7
            r33 = r8
            r34 = r9
            r22 = r12
            r23 = r14
            r24 = r16
            r14 = r19
            r12 = r41
            r0 = r42
            goto L_0x030e
        L_0x02f0:
            r21 = r40
            r0 = r42
            r27 = r43
            r35 = r53
            r28 = r3
            r26 = r4
            r25 = r6
            r29 = r7
            r33 = r8
            r34 = r9
            r22 = r12
            r23 = r14
            r24 = r16
            r14 = r19
            r12 = r41
        L_0x030e:
            r10.U()
            boolean r1 = androidx.compose.runtime.ComposerKt.P()
            if (r1 == 0) goto L_0x031f
            java.lang.String r1 = "androidx.compose.foundation.text.BasicTextField (BasicTextField.kt:866)"
            r2 = 1804514146(0x6b8eb362, float:3.4502916E26)
            androidx.compose.runtime.ComposerKt.Y(r2, r0, r5, r1)
        L_0x031f:
            androidx.compose.ui.text.input.ImeOptions r17 = r14.o(r12)
            r8 = r12 ^ 1
            if (r12 == 0) goto L_0x032a
            r32 = r20
            goto L_0x032c
        L_0x032a:
            r32 = r27
        L_0x032c:
            if (r12 == 0) goto L_0x0331
            r9 = r20
            goto L_0x0333
        L_0x0331:
            r9 = r26
        L_0x0333:
            r1 = r0 & 14
            r2 = 4
            if (r1 != r2) goto L_0x033b
            r1 = r20
            goto L_0x033d
        L_0x033b:
            r1 = r18
        L_0x033d:
            r2 = r0 & 112(0x70, float:1.57E-43)
            r3 = 32
            if (r2 != r3) goto L_0x0345
            r18 = r20
        L_0x0345:
            r1 = r1 | r18
            java.lang.Object r2 = r10.g()
            if (r1 != 0) goto L_0x0359
            androidx.compose.runtime.Composer$Companion r1 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r1 = r1.a()
            if (r2 != r1) goto L_0x0356
            goto L_0x0359
        L_0x0356:
            r7 = r39
            goto L_0x0363
        L_0x0359:
            androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$11$1 r2 = new androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$11$1
            r7 = r39
            r2.<init>(r15, r7)
            r10.N(r2)
        L_0x0363:
            r1 = r2
            kotlin.jvm.functions.Function1 r1 = (kotlin.jvm.functions.Function1) r1
            r2 = r0 & 910(0x38e, float:1.275E-42)
            int r3 = r0 >> 6
            r3 = r3 & 7168(0x1c00, float:1.0045E-41)
            r2 = r2 | r3
            int r3 = r5 << 9
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
            r3 = r3 & r4
            r18 = r2 | r3
            int r2 = r0 >> 15
            r2 = r2 & 896(0x380, float:1.256E-42)
            r3 = r0 & 7168(0x1c00, float:1.0045E-41)
            r2 = r2 | r3
            r3 = 57344(0xe000, float:8.0356E-41)
            r0 = r0 & r3
            r0 = r0 | r2
            r2 = 458752(0x70000, float:6.42848E-40)
            r2 = r2 & r5
            r19 = r0 | r2
            r20 = 65536(0x10000, float:9.18355E-41)
            r16 = 0
            r0 = r38
            r2 = r21
            r3 = r24
            r4 = r28
            r5 = r29
            r6 = r33
            r7 = r34
            r30 = r10
            r10 = r32
            r11 = r17
            r31 = r12
            r12 = r25
            r13 = r22
            r32 = r14
            r14 = r23
            r15 = r35
            r17 = r30
            androidx.compose.foundation.text.CoreTextFieldKt.a(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x03c4
            androidx.compose.runtime.ComposerKt.X()
        L_0x03c4:
            r3 = r21
            r4 = r22
            r5 = r23
            r6 = r24
            r8 = r25
            r10 = r26
            r11 = r27
            r12 = r28
            r13 = r29
            r9 = r31
            r7 = r32
            r14 = r33
            r15 = r34
            r16 = r35
            goto L_0x0402
        L_0x03e1:
            r30 = r10
            r30.B()
            r3 = r40
            r4 = r41
            r5 = r42
            r6 = r43
            r7 = r44
            r8 = r45
            r9 = r46
            r10 = r47
            r11 = r48
            r12 = r49
            r13 = r50
            r14 = r51
            r15 = r52
            r16 = r53
        L_0x0402:
            androidx.compose.runtime.ScopeUpdateScope r2 = r30.x()
            if (r2 == 0) goto L_0x0423
            androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$12 r1 = new androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$12
            r0 = r1
            r36 = r1
            r1 = r38
            r37 = r2
            r2 = r39
            r17 = r55
            r18 = r56
            r19 = r57
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            r1 = r36
            r0 = r37
            r0.a(r1)
        L_0x0423:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.BasicTextFieldKt.c(androidx.compose.ui.text.input.TextFieldValue, kotlin.jvm.functions.Function1, androidx.compose.ui.Modifier, boolean, boolean, androidx.compose.ui.text.TextStyle, androidx.compose.foundation.text.KeyboardOptions, androidx.compose.foundation.text.KeyboardActions, boolean, int, int, androidx.compose.ui.text.input.VisualTransformation, kotlin.jvm.functions.Function1, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.ui.graphics.Brush, kotlin.jvm.functions.Function3, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:107:0x013e  */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x0143  */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x015d  */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x0162  */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x017a  */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x017f  */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x0196  */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x019b  */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x01af  */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x01b4  */
    /* JADX WARNING: Removed duplicated region for block: B:162:0x01d9  */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x01dc  */
    /* JADX WARNING: Removed duplicated region for block: B:166:0x01e6  */
    /* JADX WARNING: Removed duplicated region for block: B:215:0x02e7  */
    /* JADX WARNING: Removed duplicated region for block: B:218:0x030c  */
    /* JADX WARNING: Removed duplicated region for block: B:220:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0091  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00aa  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00af  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00c8  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00cd  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x00e6  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x00eb  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0104  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0109  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x0122  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x0127  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final /* synthetic */ void d(androidx.compose.ui.text.input.TextFieldValue r41, kotlin.jvm.functions.Function1 r42, androidx.compose.ui.Modifier r43, boolean r44, boolean r45, androidx.compose.ui.text.TextStyle r46, androidx.compose.foundation.text.KeyboardOptions r47, androidx.compose.foundation.text.KeyboardActions r48, boolean r49, int r50, androidx.compose.ui.text.input.VisualTransformation r51, kotlin.jvm.functions.Function1 r52, androidx.compose.foundation.interaction.MutableInteractionSource r53, androidx.compose.ui.graphics.Brush r54, kotlin.jvm.functions.Function3 r55, androidx.compose.runtime.Composer r56, int r57, int r58, int r59) {
        /*
            r15 = r57
            r14 = r58
            r13 = r59
            r0 = -560482651(0xffffffffde97b6a5, float:-5.4660533E18)
            r1 = r56
            androidx.compose.runtime.Composer r1 = r1.q(r0)
            r2 = r13 & 1
            if (r2 == 0) goto L_0x0019
            r2 = r15 | 6
            r5 = r2
            r2 = r41
            goto L_0x002d
        L_0x0019:
            r2 = r15 & 6
            if (r2 != 0) goto L_0x002a
            r2 = r41
            boolean r5 = r1.W(r2)
            if (r5 == 0) goto L_0x0027
            r5 = 4
            goto L_0x0028
        L_0x0027:
            r5 = 2
        L_0x0028:
            r5 = r5 | r15
            goto L_0x002d
        L_0x002a:
            r2 = r41
            r5 = r15
        L_0x002d:
            r6 = r13 & 2
            if (r6 == 0) goto L_0x0036
            r5 = r5 | 48
        L_0x0033:
            r6 = r42
            goto L_0x0048
        L_0x0036:
            r6 = r15 & 48
            if (r6 != 0) goto L_0x0033
            r6 = r42
            boolean r9 = r1.l(r6)
            if (r9 == 0) goto L_0x0045
            r9 = 32
            goto L_0x0047
        L_0x0045:
            r9 = 16
        L_0x0047:
            r5 = r5 | r9
        L_0x0048:
            r9 = r13 & 4
            if (r9 == 0) goto L_0x0051
            r5 = r5 | 384(0x180, float:5.38E-43)
        L_0x004e:
            r12 = r43
            goto L_0x0064
        L_0x0051:
            r12 = r15 & 384(0x180, float:5.38E-43)
            if (r12 != 0) goto L_0x004e
            r12 = r43
            boolean r16 = r1.W(r12)
            if (r16 == 0) goto L_0x0060
            r16 = 256(0x100, float:3.59E-43)
            goto L_0x0062
        L_0x0060:
            r16 = 128(0x80, float:1.794E-43)
        L_0x0062:
            r5 = r5 | r16
        L_0x0064:
            r16 = r13 & 8
            r17 = 1024(0x400, float:1.435E-42)
            r18 = 2048(0x800, float:2.87E-42)
            if (r16 == 0) goto L_0x0071
            r5 = r5 | 3072(0xc00, float:4.305E-42)
        L_0x006e:
            r3 = r44
            goto L_0x0084
        L_0x0071:
            r3 = r15 & 3072(0xc00, float:4.305E-42)
            if (r3 != 0) goto L_0x006e
            r3 = r44
            boolean r19 = r1.d(r3)
            if (r19 == 0) goto L_0x0080
            r19 = r18
            goto L_0x0082
        L_0x0080:
            r19 = r17
        L_0x0082:
            r5 = r5 | r19
        L_0x0084:
            r19 = r13 & 16
            r20 = 8192(0x2000, float:1.14794E-41)
            r21 = 16384(0x4000, float:2.2959E-41)
            if (r19 == 0) goto L_0x0091
            r5 = r5 | 24576(0x6000, float:3.4438E-41)
        L_0x008e:
            r4 = r45
            goto L_0x00a4
        L_0x0091:
            r4 = r15 & 24576(0x6000, float:3.4438E-41)
            if (r4 != 0) goto L_0x008e
            r4 = r45
            boolean r23 = r1.d(r4)
            if (r23 == 0) goto L_0x00a0
            r23 = r21
            goto L_0x00a2
        L_0x00a0:
            r23 = r20
        L_0x00a2:
            r5 = r5 | r23
        L_0x00a4:
            r23 = r13 & 32
            r24 = 196608(0x30000, float:2.75506E-40)
            if (r23 == 0) goto L_0x00af
            r5 = r5 | r24
            r7 = r46
            goto L_0x00c2
        L_0x00af:
            r24 = r15 & r24
            r7 = r46
            if (r24 != 0) goto L_0x00c2
            boolean r25 = r1.W(r7)
            if (r25 == 0) goto L_0x00be
            r25 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00c0
        L_0x00be:
            r25 = 65536(0x10000, float:9.18355E-41)
        L_0x00c0:
            r5 = r5 | r25
        L_0x00c2:
            r25 = r13 & 64
            r26 = 1572864(0x180000, float:2.204052E-39)
            if (r25 == 0) goto L_0x00cd
            r5 = r5 | r26
            r8 = r47
            goto L_0x00e0
        L_0x00cd:
            r26 = r15 & r26
            r8 = r47
            if (r26 != 0) goto L_0x00e0
            boolean r27 = r1.W(r8)
            if (r27 == 0) goto L_0x00dc
            r27 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00de
        L_0x00dc:
            r27 = 524288(0x80000, float:7.34684E-40)
        L_0x00de:
            r5 = r5 | r27
        L_0x00e0:
            r10 = r13 & 128(0x80, float:1.794E-43)
            r28 = 12582912(0xc00000, float:1.7632415E-38)
            if (r10 == 0) goto L_0x00eb
            r5 = r5 | r28
            r11 = r48
            goto L_0x00fe
        L_0x00eb:
            r28 = r15 & r28
            r11 = r48
            if (r28 != 0) goto L_0x00fe
            boolean r29 = r1.W(r11)
            if (r29 == 0) goto L_0x00fa
            r29 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00fc
        L_0x00fa:
            r29 = 4194304(0x400000, float:5.877472E-39)
        L_0x00fc:
            r5 = r5 | r29
        L_0x00fe:
            r0 = r13 & 256(0x100, float:3.59E-43)
            r30 = 100663296(0x6000000, float:2.4074124E-35)
            if (r0 == 0) goto L_0x0109
            r5 = r5 | r30
            r2 = r49
            goto L_0x011c
        L_0x0109:
            r30 = r15 & r30
            r2 = r49
            if (r30 != 0) goto L_0x011c
            boolean r30 = r1.d(r2)
            if (r30 == 0) goto L_0x0118
            r30 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x011a
        L_0x0118:
            r30 = 33554432(0x2000000, float:9.403955E-38)
        L_0x011a:
            r5 = r5 | r30
        L_0x011c:
            r2 = r13 & 512(0x200, float:7.175E-43)
            r30 = 805306368(0x30000000, float:4.656613E-10)
            if (r2 == 0) goto L_0x0127
            r5 = r5 | r30
            r3 = r50
            goto L_0x013a
        L_0x0127:
            r30 = r15 & r30
            r3 = r50
            if (r30 != 0) goto L_0x013a
            boolean r30 = r1.i(r3)
            if (r30 == 0) goto L_0x0136
            r30 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x0138
        L_0x0136:
            r30 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x0138:
            r5 = r5 | r30
        L_0x013a:
            r3 = r13 & 1024(0x400, float:1.435E-42)
            if (r3 == 0) goto L_0x0143
            r22 = r14 | 6
            r4 = r51
            goto L_0x0159
        L_0x0143:
            r30 = r14 & 6
            r4 = r51
            if (r30 != 0) goto L_0x0157
            boolean r30 = r1.W(r4)
            if (r30 == 0) goto L_0x0152
            r22 = 4
            goto L_0x0154
        L_0x0152:
            r22 = 2
        L_0x0154:
            r22 = r14 | r22
            goto L_0x0159
        L_0x0157:
            r22 = r14
        L_0x0159:
            r4 = r13 & 2048(0x800, float:2.87E-42)
            if (r4 == 0) goto L_0x0162
            r22 = r22 | 48
        L_0x015f:
            r6 = r22
            goto L_0x0176
        L_0x0162:
            r30 = r14 & 48
            r6 = r52
            if (r30 != 0) goto L_0x015f
            boolean r30 = r1.l(r6)
            if (r30 == 0) goto L_0x0171
            r24 = 32
            goto L_0x0173
        L_0x0171:
            r24 = 16
        L_0x0173:
            r22 = r22 | r24
            goto L_0x015f
        L_0x0176:
            r7 = r13 & 4096(0x1000, float:5.74E-42)
            if (r7 == 0) goto L_0x017f
            r6 = r6 | 384(0x180, float:5.38E-43)
        L_0x017c:
            r8 = r53
            goto L_0x0192
        L_0x017f:
            r8 = r14 & 384(0x180, float:5.38E-43)
            if (r8 != 0) goto L_0x017c
            r8 = r53
            boolean r22 = r1.W(r8)
            if (r22 == 0) goto L_0x018e
            r27 = 256(0x100, float:3.59E-43)
            goto L_0x0190
        L_0x018e:
            r27 = 128(0x80, float:1.794E-43)
        L_0x0190:
            r6 = r6 | r27
        L_0x0192:
            r8 = r13 & 8192(0x2000, float:1.14794E-41)
            if (r8 == 0) goto L_0x019b
            r6 = r6 | 3072(0xc00, float:4.305E-42)
        L_0x0198:
            r11 = r54
            goto L_0x01ab
        L_0x019b:
            r11 = r14 & 3072(0xc00, float:4.305E-42)
            if (r11 != 0) goto L_0x0198
            r11 = r54
            boolean r22 = r1.W(r11)
            if (r22 == 0) goto L_0x01a9
            r17 = r18
        L_0x01a9:
            r6 = r6 | r17
        L_0x01ab:
            r11 = r13 & 16384(0x4000, float:2.2959E-41)
            if (r11 == 0) goto L_0x01b4
            r6 = r6 | 24576(0x6000, float:3.4438E-41)
        L_0x01b1:
            r12 = r55
            goto L_0x01c4
        L_0x01b4:
            r12 = r14 & 24576(0x6000, float:3.4438E-41)
            if (r12 != 0) goto L_0x01b1
            r12 = r55
            boolean r17 = r1.l(r12)
            if (r17 == 0) goto L_0x01c2
            r20 = r21
        L_0x01c2:
            r6 = r6 | r20
        L_0x01c4:
            r17 = 306783379(0x12492493, float:6.34695E-28)
            r12 = r5 & r17
            r13 = 306783378(0x12492492, float:6.3469493E-28)
            r17 = 0
            r18 = 1
            if (r12 != r13) goto L_0x01dc
            r12 = r6 & 9363(0x2493, float:1.312E-41)
            r13 = 9362(0x2492, float:1.3119E-41)
            if (r12 == r13) goto L_0x01d9
            goto L_0x01dc
        L_0x01d9:
            r12 = r17
            goto L_0x01de
        L_0x01dc:
            r12 = r18
        L_0x01de:
            r13 = r5 & 1
            boolean r12 = r1.E(r12, r13)
            if (r12 == 0) goto L_0x02e7
            if (r9 == 0) goto L_0x01eb
            androidx.compose.ui.Modifier$Companion r9 = androidx.compose.ui.Modifier.f15489d
            goto L_0x01ed
        L_0x01eb:
            r9 = r43
        L_0x01ed:
            if (r16 == 0) goto L_0x01f2
            r12 = r18
            goto L_0x01f4
        L_0x01f2:
            r12 = r44
        L_0x01f4:
            if (r19 == 0) goto L_0x01f9
            r13 = r17
            goto L_0x01fb
        L_0x01f9:
            r13 = r45
        L_0x01fb:
            if (r23 == 0) goto L_0x0206
            androidx.compose.ui.text.TextStyle$Companion r16 = androidx.compose.ui.text.TextStyle.f18499d
            androidx.compose.ui.text.TextStyle r16 = r16.a()
            r36 = r16
            goto L_0x0208
        L_0x0206:
            r36 = r46
        L_0x0208:
            if (r25 == 0) goto L_0x0213
            androidx.compose.foundation.text.KeyboardOptions$Companion r16 = androidx.compose.foundation.text.KeyboardOptions.f5771h
            androidx.compose.foundation.text.KeyboardOptions r16 = r16.a()
            r37 = r16
            goto L_0x0215
        L_0x0213:
            r37 = r47
        L_0x0215:
            if (r10 == 0) goto L_0x021e
            androidx.compose.foundation.text.KeyboardActions$Companion r10 = androidx.compose.foundation.text.KeyboardActions.f5763g
            androidx.compose.foundation.text.KeyboardActions r10 = r10.a()
            goto L_0x0220
        L_0x021e:
            r10 = r48
        L_0x0220:
            if (r0 == 0) goto L_0x0225
            r0 = r17
            goto L_0x0227
        L_0x0225:
            r0 = r49
        L_0x0227:
            if (r2 == 0) goto L_0x022d
            r2 = 2147483647(0x7fffffff, float:NaN)
            goto L_0x022f
        L_0x022d:
            r2 = r50
        L_0x022f:
            if (r3 == 0) goto L_0x0238
            androidx.compose.ui.text.input.VisualTransformation$Companion r3 = androidx.compose.ui.text.input.VisualTransformation.f18929a
            androidx.compose.ui.text.input.VisualTransformation r3 = r3.c()
            goto L_0x023a
        L_0x0238:
            r3 = r51
        L_0x023a:
            if (r4 == 0) goto L_0x023f
            androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$16 r4 = androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$16.f5535z
            goto L_0x0241
        L_0x023f:
            r4 = r52
        L_0x0241:
            if (r7 == 0) goto L_0x0259
            java.lang.Object r7 = r1.g()
            androidx.compose.runtime.Composer$Companion r16 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r14 = r16.a()
            if (r7 != r14) goto L_0x0256
            androidx.compose.foundation.interaction.MutableInteractionSource r7 = androidx.compose.foundation.interaction.InteractionSourceKt.a()
            r1.N(r7)
        L_0x0256:
            androidx.compose.foundation.interaction.MutableInteractionSource r7 = (androidx.compose.foundation.interaction.MutableInteractionSource) r7
            goto L_0x025b
        L_0x0259:
            r7 = r53
        L_0x025b:
            if (r8 == 0) goto L_0x026c
            androidx.compose.ui.graphics.SolidColor r8 = new androidx.compose.ui.graphics.SolidColor
            androidx.compose.ui.graphics.Color$Companion r14 = androidx.compose.ui.graphics.Color.f15975b
            long r14 = r14.a()
            r56 = r1
            r1 = 0
            r8.<init>(r14, r1)
            goto L_0x0270
        L_0x026c:
            r56 = r1
            r8 = r54
        L_0x0270:
            if (r11 == 0) goto L_0x0279
            androidx.compose.foundation.text.ComposableSingletons$BasicTextFieldKt r1 = androidx.compose.foundation.text.ComposableSingletons$BasicTextFieldKt.f5630a
            kotlin.jvm.functions.Function3 r1 = r1.d()
            goto L_0x027b
        L_0x0279:
            r1 = r55
        L_0x027b:
            boolean r11 = androidx.compose.runtime.ComposerKt.P()
            if (r11 == 0) goto L_0x0289
            java.lang.String r11 = "androidx.compose.foundation.text.BasicTextField (BasicTextField.kt:950)"
            r14 = -560482651(0xffffffffde97b6a5, float:-5.4660533E18)
            androidx.compose.runtime.ComposerKt.Y(r14, r5, r6, r11)
        L_0x0289:
            r11 = 2147483646(0x7ffffffe, float:NaN)
            r33 = r5 & r11
            int r5 = r6 << 3
            r6 = r5 & 112(0x70, float:1.57E-43)
            r6 = r6 | 6
            r11 = r5 & 896(0x380, float:1.256E-42)
            r6 = r6 | r11
            r11 = r5 & 7168(0x1c00, float:1.0045E-41)
            r6 = r6 | r11
            r11 = 57344(0xe000, float:8.0356E-41)
            r11 = r11 & r5
            r6 = r6 | r11
            r11 = 458752(0x70000, float:6.42848E-40)
            r5 = r5 & r11
            r34 = r6 | r5
            r35 = 0
            r26 = 1
            r16 = r41
            r17 = r42
            r18 = r9
            r19 = r12
            r20 = r13
            r21 = r36
            r22 = r37
            r23 = r10
            r24 = r0
            r25 = r2
            r27 = r3
            r28 = r4
            r29 = r7
            r30 = r8
            r31 = r1
            r32 = r56
            c(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35)
            boolean r5 = androidx.compose.runtime.ComposerKt.P()
            if (r5 == 0) goto L_0x02d4
            androidx.compose.runtime.ComposerKt.X()
        L_0x02d4:
            r15 = r1
            r11 = r3
            r14 = r8
            r3 = r9
            r8 = r10
            r5 = r13
            r6 = r36
            r9 = r0
            r10 = r2
            r13 = r7
            r7 = r37
            r40 = r12
            r12 = r4
            r4 = r40
            goto L_0x0306
        L_0x02e7:
            r56 = r1
            r56.B()
            r3 = r43
            r4 = r44
            r5 = r45
            r6 = r46
            r7 = r47
            r8 = r48
            r9 = r49
            r10 = r50
            r11 = r51
            r12 = r52
            r13 = r53
            r14 = r54
            r15 = r55
        L_0x0306:
            androidx.compose.runtime.ScopeUpdateScope r2 = r56.x()
            if (r2 == 0) goto L_0x0327
            androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$18 r1 = new androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$18
            r0 = r1
            r38 = r1
            r1 = r41
            r39 = r2
            r2 = r42
            r16 = r57
            r17 = r58
            r18 = r59
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            r1 = r38
            r0 = r39
            r0.a(r1)
        L_0x0327:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.BasicTextFieldKt.d(androidx.compose.ui.text.input.TextFieldValue, kotlin.jvm.functions.Function1, androidx.compose.ui.Modifier, boolean, boolean, androidx.compose.ui.text.TextStyle, androidx.compose.foundation.text.KeyboardOptions, androidx.compose.foundation.text.KeyboardActions, boolean, int, androidx.compose.ui.text.input.VisualTransformation, kotlin.jvm.functions.Function1, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.ui.graphics.Brush, kotlin.jvm.functions.Function3, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v10, resolved type: androidx.compose.runtime.MutableState} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v6, resolved type: kotlin.jvm.functions.Function1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v23, resolved type: androidx.compose.runtime.MutableState} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x0133  */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x0139  */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x013e  */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x0158  */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x015d  */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x0175  */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x017a  */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x0191  */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x0196  */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x01aa  */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x01af  */
    /* JADX WARNING: Removed duplicated region for block: B:160:0x01c6  */
    /* JADX WARNING: Removed duplicated region for block: B:161:0x01cb  */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x01f2  */
    /* JADX WARNING: Removed duplicated region for block: B:172:0x01f4  */
    /* JADX WARNING: Removed duplicated region for block: B:175:0x01fe  */
    /* JADX WARNING: Removed duplicated region for block: B:273:0x0437  */
    /* JADX WARNING: Removed duplicated region for block: B:276:0x0460  */
    /* JADX WARNING: Removed duplicated region for block: B:278:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00a5  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00aa  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00c3  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00c8  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x00e1  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x00e6  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x00ff  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0104  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x011d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void e(java.lang.String r42, kotlin.jvm.functions.Function1 r43, androidx.compose.ui.Modifier r44, boolean r45, boolean r46, androidx.compose.ui.text.TextStyle r47, androidx.compose.foundation.text.KeyboardOptions r48, androidx.compose.foundation.text.KeyboardActions r49, boolean r50, int r51, int r52, androidx.compose.ui.text.input.VisualTransformation r53, kotlin.jvm.functions.Function1 r54, androidx.compose.foundation.interaction.MutableInteractionSource r55, androidx.compose.ui.graphics.Brush r56, kotlin.jvm.functions.Function3 r57, androidx.compose.runtime.Composer r58, int r59, int r60, int r61) {
        /*
            r1 = r42
            r2 = r43
            r15 = r59
            r14 = r60
            r13 = r61
            r0 = 945255183(0x3857730f, float:5.136715E-5)
            r3 = r58
            androidx.compose.runtime.Composer r3 = r3.q(r0)
            r4 = r13 & 1
            if (r4 == 0) goto L_0x001a
            r4 = r15 | 6
            goto L_0x002a
        L_0x001a:
            r4 = r15 & 6
            if (r4 != 0) goto L_0x0029
            boolean r4 = r3.W(r1)
            if (r4 == 0) goto L_0x0026
            r4 = 4
            goto L_0x0027
        L_0x0026:
            r4 = 2
        L_0x0027:
            r4 = r4 | r15
            goto L_0x002a
        L_0x0029:
            r4 = r15
        L_0x002a:
            r7 = r13 & 2
            if (r7 == 0) goto L_0x0031
            r4 = r4 | 48
            goto L_0x0041
        L_0x0031:
            r7 = r15 & 48
            if (r7 != 0) goto L_0x0041
            boolean r7 = r3.l(r2)
            if (r7 == 0) goto L_0x003e
            r7 = 32
            goto L_0x0040
        L_0x003e:
            r7 = 16
        L_0x0040:
            r4 = r4 | r7
        L_0x0041:
            r7 = r13 & 4
            if (r7 == 0) goto L_0x004a
            r4 = r4 | 384(0x180, float:5.38E-43)
        L_0x0047:
            r12 = r44
            goto L_0x005d
        L_0x004a:
            r12 = r15 & 384(0x180, float:5.38E-43)
            if (r12 != 0) goto L_0x0047
            r12 = r44
            boolean r16 = r3.W(r12)
            if (r16 == 0) goto L_0x0059
            r16 = 256(0x100, float:3.59E-43)
            goto L_0x005b
        L_0x0059:
            r16 = 128(0x80, float:1.794E-43)
        L_0x005b:
            r4 = r4 | r16
        L_0x005d:
            r16 = r13 & 8
            r17 = 1024(0x400, float:1.435E-42)
            r18 = 2048(0x800, float:2.87E-42)
            if (r16 == 0) goto L_0x006a
            r4 = r4 | 3072(0xc00, float:4.305E-42)
        L_0x0067:
            r8 = r45
            goto L_0x007d
        L_0x006a:
            r8 = r15 & 3072(0xc00, float:4.305E-42)
            if (r8 != 0) goto L_0x0067
            r8 = r45
            boolean r19 = r3.d(r8)
            if (r19 == 0) goto L_0x0079
            r19 = r18
            goto L_0x007b
        L_0x0079:
            r19 = r17
        L_0x007b:
            r4 = r4 | r19
        L_0x007d:
            r19 = r13 & 16
            r20 = 8192(0x2000, float:1.14794E-41)
            r21 = 16384(0x4000, float:2.2959E-41)
            if (r19 == 0) goto L_0x008a
            r4 = r4 | 24576(0x6000, float:3.4438E-41)
        L_0x0087:
            r10 = r46
            goto L_0x009d
        L_0x008a:
            r10 = r15 & 24576(0x6000, float:3.4438E-41)
            if (r10 != 0) goto L_0x0087
            r10 = r46
            boolean r23 = r3.d(r10)
            if (r23 == 0) goto L_0x0099
            r23 = r21
            goto L_0x009b
        L_0x0099:
            r23 = r20
        L_0x009b:
            r4 = r4 | r23
        L_0x009d:
            r23 = r13 & 32
            r24 = 131072(0x20000, float:1.83671E-40)
            r25 = 196608(0x30000, float:2.75506E-40)
            if (r23 == 0) goto L_0x00aa
            r4 = r4 | r25
            r11 = r47
            goto L_0x00bd
        L_0x00aa:
            r26 = r15 & r25
            r11 = r47
            if (r26 != 0) goto L_0x00bd
            boolean r27 = r3.W(r11)
            if (r27 == 0) goto L_0x00b9
            r27 = r24
            goto L_0x00bb
        L_0x00b9:
            r27 = 65536(0x10000, float:9.18355E-41)
        L_0x00bb:
            r4 = r4 | r27
        L_0x00bd:
            r27 = r13 & 64
            r28 = 1572864(0x180000, float:2.204052E-39)
            if (r27 == 0) goto L_0x00c8
            r4 = r4 | r28
            r9 = r48
            goto L_0x00db
        L_0x00c8:
            r28 = r15 & r28
            r9 = r48
            if (r28 != 0) goto L_0x00db
            boolean r29 = r3.W(r9)
            if (r29 == 0) goto L_0x00d7
            r29 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00d9
        L_0x00d7:
            r29 = 524288(0x80000, float:7.34684E-40)
        L_0x00d9:
            r4 = r4 | r29
        L_0x00db:
            r5 = r13 & 128(0x80, float:1.794E-43)
            r30 = 12582912(0xc00000, float:1.7632415E-38)
            if (r5 == 0) goto L_0x00e6
            r4 = r4 | r30
            r6 = r49
            goto L_0x00f9
        L_0x00e6:
            r30 = r15 & r30
            r6 = r49
            if (r30 != 0) goto L_0x00f9
            boolean r31 = r3.W(r6)
            if (r31 == 0) goto L_0x00f5
            r31 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00f7
        L_0x00f5:
            r31 = 4194304(0x400000, float:5.877472E-39)
        L_0x00f7:
            r4 = r4 | r31
        L_0x00f9:
            r0 = r13 & 256(0x100, float:3.59E-43)
            r32 = 100663296(0x6000000, float:2.4074124E-35)
            if (r0 == 0) goto L_0x0104
            r4 = r4 | r32
            r6 = r50
            goto L_0x0117
        L_0x0104:
            r32 = r15 & r32
            r6 = r50
            if (r32 != 0) goto L_0x0117
            boolean r32 = r3.d(r6)
            if (r32 == 0) goto L_0x0113
            r32 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x0115
        L_0x0113:
            r32 = 33554432(0x2000000, float:9.403955E-38)
        L_0x0115:
            r4 = r4 | r32
        L_0x0117:
            r32 = 805306368(0x30000000, float:4.656613E-10)
            r32 = r15 & r32
            if (r32 != 0) goto L_0x0133
            r6 = r13 & 512(0x200, float:7.175E-43)
            if (r6 != 0) goto L_0x012c
            r6 = r51
            boolean r32 = r3.i(r6)
            if (r32 == 0) goto L_0x012e
            r32 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x0130
        L_0x012c:
            r6 = r51
        L_0x012e:
            r32 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x0130:
            r4 = r4 | r32
            goto L_0x0135
        L_0x0133:
            r6 = r51
        L_0x0135:
            r6 = r13 & 1024(0x400, float:1.435E-42)
            if (r6 == 0) goto L_0x013e
            r32 = r14 | 6
            r8 = r52
            goto L_0x0154
        L_0x013e:
            r32 = r14 & 6
            r8 = r52
            if (r32 != 0) goto L_0x0152
            boolean r32 = r3.i(r8)
            if (r32 == 0) goto L_0x014d
            r32 = 4
            goto L_0x014f
        L_0x014d:
            r32 = 2
        L_0x014f:
            r32 = r14 | r32
            goto L_0x0154
        L_0x0152:
            r32 = r14
        L_0x0154:
            r8 = r13 & 2048(0x800, float:2.87E-42)
            if (r8 == 0) goto L_0x015d
            r32 = r32 | 48
        L_0x015a:
            r9 = r32
            goto L_0x0171
        L_0x015d:
            r33 = r14 & 48
            r9 = r53
            if (r33 != 0) goto L_0x015a
            boolean r33 = r3.W(r9)
            if (r33 == 0) goto L_0x016c
            r33 = 32
            goto L_0x016e
        L_0x016c:
            r33 = 16
        L_0x016e:
            r32 = r32 | r33
            goto L_0x015a
        L_0x0171:
            r10 = r13 & 4096(0x1000, float:5.74E-42)
            if (r10 == 0) goto L_0x017a
            r9 = r9 | 384(0x180, float:5.38E-43)
        L_0x0177:
            r11 = r54
            goto L_0x018d
        L_0x017a:
            r11 = r14 & 384(0x180, float:5.38E-43)
            if (r11 != 0) goto L_0x0177
            r11 = r54
            boolean r32 = r3.l(r11)
            if (r32 == 0) goto L_0x0189
            r22 = 256(0x100, float:3.59E-43)
            goto L_0x018b
        L_0x0189:
            r22 = 128(0x80, float:1.794E-43)
        L_0x018b:
            r9 = r9 | r22
        L_0x018d:
            r11 = r13 & 8192(0x2000, float:1.14794E-41)
            if (r11 == 0) goto L_0x0196
            r9 = r9 | 3072(0xc00, float:4.305E-42)
        L_0x0193:
            r12 = r55
            goto L_0x01a6
        L_0x0196:
            r12 = r14 & 3072(0xc00, float:4.305E-42)
            if (r12 != 0) goto L_0x0193
            r12 = r55
            boolean r22 = r3.W(r12)
            if (r22 == 0) goto L_0x01a4
            r17 = r18
        L_0x01a4:
            r9 = r9 | r17
        L_0x01a6:
            r12 = r13 & 16384(0x4000, float:2.2959E-41)
            if (r12 == 0) goto L_0x01af
            r9 = r9 | 24576(0x6000, float:3.4438E-41)
        L_0x01ac:
            r2 = r56
            goto L_0x01bf
        L_0x01af:
            r2 = r14 & 24576(0x6000, float:3.4438E-41)
            if (r2 != 0) goto L_0x01ac
            r2 = r56
            boolean r17 = r3.W(r2)
            if (r17 == 0) goto L_0x01bd
            r20 = r21
        L_0x01bd:
            r9 = r9 | r20
        L_0x01bf:
            r17 = 32768(0x8000, float:4.5918E-41)
            r17 = r13 & r17
            if (r17 == 0) goto L_0x01cb
            r9 = r9 | r25
            r2 = r57
            goto L_0x01dc
        L_0x01cb:
            r18 = r14 & r25
            r2 = r57
            if (r18 != 0) goto L_0x01dc
            boolean r18 = r3.l(r2)
            if (r18 == 0) goto L_0x01d8
            goto L_0x01da
        L_0x01d8:
            r24 = 65536(0x10000, float:9.18355E-41)
        L_0x01da:
            r9 = r9 | r24
        L_0x01dc:
            r18 = 306783379(0x12492493, float:6.34695E-28)
            r2 = r4 & r18
            r14 = 306783378(0x12492492, float:6.3469493E-28)
            r18 = 1
            if (r2 != r14) goto L_0x01f4
            r2 = 74899(0x12493, float:1.04956E-40)
            r2 = r2 & r9
            r14 = 74898(0x12492, float:1.04954E-40)
            if (r2 == r14) goto L_0x01f2
            goto L_0x01f4
        L_0x01f2:
            r2 = 0
            goto L_0x01f6
        L_0x01f4:
            r2 = r18
        L_0x01f6:
            r14 = r4 & 1
            boolean r2 = r3.E(r2, r14)
            if (r2 == 0) goto L_0x0437
            r3.p()
            r2 = r15 & 1
            r14 = 0
            if (r2 == 0) goto L_0x0237
            boolean r2 = r3.J()
            if (r2 == 0) goto L_0x020d
            goto L_0x0237
        L_0x020d:
            r3.B()
            r0 = r13 & 512(0x200, float:7.175E-43)
            if (r0 == 0) goto L_0x0218
            r0 = -1879048193(0xffffffff8fffffff, float:-2.5243547E-29)
            r4 = r4 & r0
        L_0x0218:
            r2 = r44
            r7 = r45
            r0 = r46
            r1 = r47
            r5 = r49
            r6 = r50
            r8 = r51
            r10 = r52
            r11 = r53
            r12 = r54
            r37 = r55
            r38 = r56
            r39 = r57
            r14 = r4
            r4 = r48
            goto L_0x02de
        L_0x0237:
            if (r7 == 0) goto L_0x023c
            androidx.compose.ui.Modifier$Companion r2 = androidx.compose.ui.Modifier.f15489d
            goto L_0x023e
        L_0x023c:
            r2 = r44
        L_0x023e:
            if (r16 == 0) goto L_0x0243
            r7 = r18
            goto L_0x0245
        L_0x0243:
            r7 = r45
        L_0x0245:
            if (r19 == 0) goto L_0x024a
            r16 = 0
            goto L_0x024c
        L_0x024a:
            r16 = r46
        L_0x024c:
            if (r23 == 0) goto L_0x0255
            androidx.compose.ui.text.TextStyle$Companion r19 = androidx.compose.ui.text.TextStyle.f18499d
            androidx.compose.ui.text.TextStyle r19 = r19.a()
            goto L_0x0257
        L_0x0255:
            r19 = r47
        L_0x0257:
            if (r27 == 0) goto L_0x0260
            androidx.compose.foundation.text.KeyboardOptions$Companion r20 = androidx.compose.foundation.text.KeyboardOptions.f5771h
            androidx.compose.foundation.text.KeyboardOptions r20 = r20.a()
            goto L_0x0262
        L_0x0260:
            r20 = r48
        L_0x0262:
            if (r5 == 0) goto L_0x026b
            androidx.compose.foundation.text.KeyboardActions$Companion r5 = androidx.compose.foundation.text.KeyboardActions.f5763g
            androidx.compose.foundation.text.KeyboardActions r5 = r5.a()
            goto L_0x026d
        L_0x026b:
            r5 = r49
        L_0x026d:
            if (r0 == 0) goto L_0x0271
            r0 = 0
            goto L_0x0273
        L_0x0271:
            r0 = r50
        L_0x0273:
            r1 = r13 & 512(0x200, float:7.175E-43)
            if (r1 == 0) goto L_0x0285
            if (r0 == 0) goto L_0x027c
            r1 = r18
            goto L_0x027f
        L_0x027c:
            r1 = 2147483647(0x7fffffff, float:NaN)
        L_0x027f:
            r21 = -1879048193(0xffffffff8fffffff, float:-2.5243547E-29)
            r4 = r4 & r21
            goto L_0x0287
        L_0x0285:
            r1 = r51
        L_0x0287:
            if (r6 == 0) goto L_0x028c
            r6 = r18
            goto L_0x028e
        L_0x028c:
            r6 = r52
        L_0x028e:
            if (r8 == 0) goto L_0x0297
            androidx.compose.ui.text.input.VisualTransformation$Companion r8 = androidx.compose.ui.text.input.VisualTransformation.f18929a
            androidx.compose.ui.text.input.VisualTransformation r8 = r8.c()
            goto L_0x0299
        L_0x0297:
            r8 = r53
        L_0x0299:
            if (r10 == 0) goto L_0x029e
            androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$6 r10 = androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$6.f5552z
            goto L_0x02a0
        L_0x029e:
            r10 = r54
        L_0x02a0:
            if (r11 == 0) goto L_0x02a4
            r11 = r14
            goto L_0x02a6
        L_0x02a4:
            r11 = r55
        L_0x02a6:
            if (r12 == 0) goto L_0x02b8
            androidx.compose.ui.graphics.SolidColor r12 = new androidx.compose.ui.graphics.SolidColor
            androidx.compose.ui.graphics.Color$Companion r21 = androidx.compose.ui.graphics.Color.f15975b
            r44 = r0
            r45 = r1
            long r0 = r21.a()
            r12.<init>(r0, r14)
            goto L_0x02be
        L_0x02b8:
            r44 = r0
            r45 = r1
            r12 = r56
        L_0x02be:
            if (r17 == 0) goto L_0x02db
            androidx.compose.foundation.text.ComposableSingletons$BasicTextFieldKt r0 = androidx.compose.foundation.text.ComposableSingletons$BasicTextFieldKt.f5630a
            kotlin.jvm.functions.Function3 r0 = r0.a()
            r39 = r0
        L_0x02c8:
            r14 = r4
            r37 = r11
            r38 = r12
            r0 = r16
            r1 = r19
            r4 = r20
            r11 = r8
            r12 = r10
            r8 = r45
            r10 = r6
            r6 = r44
            goto L_0x02de
        L_0x02db:
            r39 = r57
            goto L_0x02c8
        L_0x02de:
            r3.U()
            boolean r17 = androidx.compose.runtime.ComposerKt.P()
            r51 = r8
            if (r17 == 0) goto L_0x02f4
            java.lang.String r8 = "androidx.compose.foundation.text.BasicTextField (BasicTextField.kt:709)"
            r52 = r10
            r10 = 945255183(0x3857730f, float:5.136715E-5)
            androidx.compose.runtime.ComposerKt.Y(r10, r14, r9, r8)
            goto L_0x02f6
        L_0x02f4:
            r52 = r10
        L_0x02f6:
            java.lang.Object r8 = r3.g()
            androidx.compose.runtime.Composer$Companion r10 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r13 = r10.a()
            if (r8 != r13) goto L_0x0323
            androidx.compose.ui.text.input.TextFieldValue r8 = new androidx.compose.ui.text.input.TextFieldValue
            r13 = 6
            r17 = 0
            r19 = 0
            r21 = 0
            r44 = r8
            r45 = r42
            r46 = r19
            r48 = r21
            r49 = r13
            r50 = r17
            r44.<init>((java.lang.String) r45, (long) r46, (androidx.compose.ui.text.TextRange) r48, (int) r49, (kotlin.jvm.internal.DefaultConstructorMarker) r50)
            r13 = 2
            r15 = 0
            androidx.compose.runtime.MutableState r8 = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.e(r8, r15, r13, r15)
            r3.N(r8)
        L_0x0323:
            androidx.compose.runtime.MutableState r8 = (androidx.compose.runtime.MutableState) r8
            androidx.compose.ui.text.input.TextFieldValue r13 = g(r8)
            r15 = 6
            r17 = 0
            r19 = 0
            r21 = 0
            r44 = r13
            r45 = r42
            r46 = r19
            r48 = r21
            r49 = r15
            r50 = r17
            androidx.compose.ui.text.input.TextFieldValue r13 = androidx.compose.ui.text.input.TextFieldValue.e(r44, r45, r46, r48, r49, r50)
            boolean r15 = r3.W(r13)
            r44 = r0
            java.lang.Object r0 = r3.g()
            if (r15 != 0) goto L_0x0352
            java.lang.Object r15 = r10.a()
            if (r0 != r15) goto L_0x035a
        L_0x0352:
            androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$7$1 r0 = new androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$7$1
            r0.<init>(r13, r8)
            r3.N(r0)
        L_0x035a:
            kotlin.jvm.functions.Function0 r0 = (kotlin.jvm.functions.Function0) r0
            r15 = 0
            androidx.compose.runtime.EffectsKt.h(r0, r3, r15)
            r0 = r14 & 14
            r15 = 4
            if (r0 != r15) goto L_0x0368
            r0 = r18
            goto L_0x0369
        L_0x0368:
            r0 = 0
        L_0x0369:
            java.lang.Object r15 = r3.g()
            if (r0 != 0) goto L_0x0375
            java.lang.Object r0 = r10.a()
            if (r15 != r0) goto L_0x037c
        L_0x0375:
            r0 = 2
            r15 = r42
            r45 = r7
            r7 = 0
            goto L_0x0382
        L_0x037c:
            r45 = r7
            r0 = r15
            r15 = r42
            goto L_0x0389
        L_0x0382:
            androidx.compose.runtime.MutableState r0 = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.e(r15, r7, r0, r7)
            r3.N(r0)
        L_0x0389:
            androidx.compose.runtime.MutableState r0 = (androidx.compose.runtime.MutableState) r0
            androidx.compose.ui.text.input.ImeOptions r27 = r4.o(r6)
            r24 = r6 ^ 1
            if (r6 == 0) goto L_0x0396
            r26 = r18
            goto L_0x0398
        L_0x0396:
            r26 = r52
        L_0x0398:
            if (r6 == 0) goto L_0x039d
            r25 = r18
            goto L_0x039f
        L_0x039d:
            r25 = r51
        L_0x039f:
            boolean r7 = r3.W(r0)
            r46 = r4
            r4 = r14 & 112(0x70, float:1.57E-43)
            r47 = r6
            r6 = 32
            if (r4 != r6) goto L_0x03ae
            goto L_0x03b0
        L_0x03ae:
            r18 = 0
        L_0x03b0:
            r4 = r7 | r18
            java.lang.Object r6 = r3.g()
            if (r4 != 0) goto L_0x03c2
            java.lang.Object r4 = r10.a()
            if (r6 != r4) goto L_0x03bf
            goto L_0x03c2
        L_0x03bf:
            r4 = r43
            goto L_0x03cc
        L_0x03c2:
            androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$8$1 r6 = new androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$8$1
            r4 = r43
            r6.<init>(r4, r8, r0)
            r3.N(r6)
        L_0x03cc:
            r17 = r6
            kotlin.jvm.functions.Function1 r17 = (kotlin.jvm.functions.Function1) r17
            r0 = r14 & 896(0x380, float:1.256E-42)
            int r6 = r14 >> 6
            r6 = r6 & 7168(0x1c00, float:1.0045E-41)
            r0 = r0 | r6
            int r6 = r9 << 9
            r7 = 57344(0xe000, float:8.0356E-41)
            r7 = r7 & r6
            r0 = r0 | r7
            r7 = 458752(0x70000, float:6.42848E-40)
            r7 = r7 & r6
            r0 = r0 | r7
            r7 = 3670016(0x380000, float:5.142788E-39)
            r7 = r7 & r6
            r0 = r0 | r7
            r7 = 29360128(0x1c00000, float:7.052966E-38)
            r6 = r6 & r7
            r34 = r0 | r6
            int r0 = r14 >> 15
            r0 = r0 & 896(0x380, float:1.256E-42)
            r6 = r14 & 7168(0x1c00, float:1.0045E-41)
            r0 = r0 | r6
            r6 = 57344(0xe000, float:8.0356E-41)
            r6 = r6 & r14
            r0 = r0 | r6
            r6 = 458752(0x70000, float:6.42848E-40)
            r6 = r6 & r9
            r35 = r0 | r6
            r36 = 65536(0x10000, float:9.18355E-41)
            r32 = 0
            r16 = r13
            r18 = r2
            r19 = r1
            r20 = r11
            r21 = r12
            r22 = r37
            r23 = r38
            r28 = r5
            r29 = r45
            r30 = r44
            r31 = r39
            r33 = r3
            androidx.compose.foundation.text.CoreTextFieldKt.a(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36)
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x0424
            androidx.compose.runtime.ComposerKt.X()
        L_0x0424:
            r7 = r44
            r6 = r45
            r9 = r46
            r13 = r52
            r8 = r1
            r10 = r5
            r14 = r11
            r16 = r12
            r11 = r47
            r12 = r51
            r5 = r2
            goto L_0x045a
        L_0x0437:
            r15 = r42
            r4 = r43
            r3.B()
            r5 = r44
            r6 = r45
            r7 = r46
            r8 = r47
            r9 = r48
            r10 = r49
            r11 = r50
            r12 = r51
            r13 = r52
            r14 = r53
            r16 = r54
            r37 = r55
            r38 = r56
            r39 = r57
        L_0x045a:
            androidx.compose.runtime.ScopeUpdateScope r3 = r3.x()
            if (r3 == 0) goto L_0x0499
            androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$9 r2 = new androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$9
            r0 = r2
            r1 = r42
            r15 = r2
            r2 = r43
            r4 = r3
            r3 = r5
            r5 = r4
            r4 = r6
            r6 = r5
            r5 = r7
            r7 = r6
            r6 = r8
            r8 = r7
            r7 = r9
            r9 = r8
            r8 = r10
            r10 = r9
            r9 = r11
            r11 = r10
            r10 = r12
            r12 = r11
            r11 = r13
            r13 = r12
            r12 = r14
            r14 = r13
            r13 = r16
            r40 = r14
            r14 = r37
            r41 = r15
            r15 = r38
            r16 = r39
            r17 = r59
            r18 = r60
            r19 = r61
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            r0 = r40
            r1 = r41
            r0.a(r1)
        L_0x0499:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.BasicTextFieldKt.e(java.lang.String, kotlin.jvm.functions.Function1, androidx.compose.ui.Modifier, boolean, boolean, androidx.compose.ui.text.TextStyle, androidx.compose.foundation.text.KeyboardOptions, androidx.compose.foundation.text.KeyboardActions, boolean, int, int, androidx.compose.ui.text.input.VisualTransformation, kotlin.jvm.functions.Function1, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.ui.graphics.Brush, kotlin.jvm.functions.Function3, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:107:0x013e  */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x0143  */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x015d  */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x0162  */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x017a  */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x017f  */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x0196  */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x019b  */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x01af  */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x01b4  */
    /* JADX WARNING: Removed duplicated region for block: B:162:0x01d9  */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x01dc  */
    /* JADX WARNING: Removed duplicated region for block: B:166:0x01e6  */
    /* JADX WARNING: Removed duplicated region for block: B:215:0x02e7  */
    /* JADX WARNING: Removed duplicated region for block: B:218:0x030c  */
    /* JADX WARNING: Removed duplicated region for block: B:220:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0091  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00aa  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00af  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00c8  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00cd  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x00e6  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x00eb  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0104  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0109  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x0122  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x0127  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final /* synthetic */ void f(java.lang.String r41, kotlin.jvm.functions.Function1 r42, androidx.compose.ui.Modifier r43, boolean r44, boolean r45, androidx.compose.ui.text.TextStyle r46, androidx.compose.foundation.text.KeyboardOptions r47, androidx.compose.foundation.text.KeyboardActions r48, boolean r49, int r50, androidx.compose.ui.text.input.VisualTransformation r51, kotlin.jvm.functions.Function1 r52, androidx.compose.foundation.interaction.MutableInteractionSource r53, androidx.compose.ui.graphics.Brush r54, kotlin.jvm.functions.Function3 r55, androidx.compose.runtime.Composer r56, int r57, int r58, int r59) {
        /*
            r15 = r57
            r14 = r58
            r13 = r59
            r0 = -454732590(0xffffffffe4e554d2, float:-3.384333E22)
            r1 = r56
            androidx.compose.runtime.Composer r1 = r1.q(r0)
            r2 = r13 & 1
            if (r2 == 0) goto L_0x0019
            r2 = r15 | 6
            r5 = r2
            r2 = r41
            goto L_0x002d
        L_0x0019:
            r2 = r15 & 6
            if (r2 != 0) goto L_0x002a
            r2 = r41
            boolean r5 = r1.W(r2)
            if (r5 == 0) goto L_0x0027
            r5 = 4
            goto L_0x0028
        L_0x0027:
            r5 = 2
        L_0x0028:
            r5 = r5 | r15
            goto L_0x002d
        L_0x002a:
            r2 = r41
            r5 = r15
        L_0x002d:
            r6 = r13 & 2
            if (r6 == 0) goto L_0x0036
            r5 = r5 | 48
        L_0x0033:
            r6 = r42
            goto L_0x0048
        L_0x0036:
            r6 = r15 & 48
            if (r6 != 0) goto L_0x0033
            r6 = r42
            boolean r9 = r1.l(r6)
            if (r9 == 0) goto L_0x0045
            r9 = 32
            goto L_0x0047
        L_0x0045:
            r9 = 16
        L_0x0047:
            r5 = r5 | r9
        L_0x0048:
            r9 = r13 & 4
            if (r9 == 0) goto L_0x0051
            r5 = r5 | 384(0x180, float:5.38E-43)
        L_0x004e:
            r12 = r43
            goto L_0x0064
        L_0x0051:
            r12 = r15 & 384(0x180, float:5.38E-43)
            if (r12 != 0) goto L_0x004e
            r12 = r43
            boolean r16 = r1.W(r12)
            if (r16 == 0) goto L_0x0060
            r16 = 256(0x100, float:3.59E-43)
            goto L_0x0062
        L_0x0060:
            r16 = 128(0x80, float:1.794E-43)
        L_0x0062:
            r5 = r5 | r16
        L_0x0064:
            r16 = r13 & 8
            r17 = 1024(0x400, float:1.435E-42)
            r18 = 2048(0x800, float:2.87E-42)
            if (r16 == 0) goto L_0x0071
            r5 = r5 | 3072(0xc00, float:4.305E-42)
        L_0x006e:
            r3 = r44
            goto L_0x0084
        L_0x0071:
            r3 = r15 & 3072(0xc00, float:4.305E-42)
            if (r3 != 0) goto L_0x006e
            r3 = r44
            boolean r19 = r1.d(r3)
            if (r19 == 0) goto L_0x0080
            r19 = r18
            goto L_0x0082
        L_0x0080:
            r19 = r17
        L_0x0082:
            r5 = r5 | r19
        L_0x0084:
            r19 = r13 & 16
            r20 = 8192(0x2000, float:1.14794E-41)
            r21 = 16384(0x4000, float:2.2959E-41)
            if (r19 == 0) goto L_0x0091
            r5 = r5 | 24576(0x6000, float:3.4438E-41)
        L_0x008e:
            r4 = r45
            goto L_0x00a4
        L_0x0091:
            r4 = r15 & 24576(0x6000, float:3.4438E-41)
            if (r4 != 0) goto L_0x008e
            r4 = r45
            boolean r23 = r1.d(r4)
            if (r23 == 0) goto L_0x00a0
            r23 = r21
            goto L_0x00a2
        L_0x00a0:
            r23 = r20
        L_0x00a2:
            r5 = r5 | r23
        L_0x00a4:
            r23 = r13 & 32
            r24 = 196608(0x30000, float:2.75506E-40)
            if (r23 == 0) goto L_0x00af
            r5 = r5 | r24
            r7 = r46
            goto L_0x00c2
        L_0x00af:
            r24 = r15 & r24
            r7 = r46
            if (r24 != 0) goto L_0x00c2
            boolean r25 = r1.W(r7)
            if (r25 == 0) goto L_0x00be
            r25 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00c0
        L_0x00be:
            r25 = 65536(0x10000, float:9.18355E-41)
        L_0x00c0:
            r5 = r5 | r25
        L_0x00c2:
            r25 = r13 & 64
            r26 = 1572864(0x180000, float:2.204052E-39)
            if (r25 == 0) goto L_0x00cd
            r5 = r5 | r26
            r8 = r47
            goto L_0x00e0
        L_0x00cd:
            r26 = r15 & r26
            r8 = r47
            if (r26 != 0) goto L_0x00e0
            boolean r27 = r1.W(r8)
            if (r27 == 0) goto L_0x00dc
            r27 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00de
        L_0x00dc:
            r27 = 524288(0x80000, float:7.34684E-40)
        L_0x00de:
            r5 = r5 | r27
        L_0x00e0:
            r10 = r13 & 128(0x80, float:1.794E-43)
            r28 = 12582912(0xc00000, float:1.7632415E-38)
            if (r10 == 0) goto L_0x00eb
            r5 = r5 | r28
            r11 = r48
            goto L_0x00fe
        L_0x00eb:
            r28 = r15 & r28
            r11 = r48
            if (r28 != 0) goto L_0x00fe
            boolean r29 = r1.W(r11)
            if (r29 == 0) goto L_0x00fa
            r29 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00fc
        L_0x00fa:
            r29 = 4194304(0x400000, float:5.877472E-39)
        L_0x00fc:
            r5 = r5 | r29
        L_0x00fe:
            r0 = r13 & 256(0x100, float:3.59E-43)
            r30 = 100663296(0x6000000, float:2.4074124E-35)
            if (r0 == 0) goto L_0x0109
            r5 = r5 | r30
            r2 = r49
            goto L_0x011c
        L_0x0109:
            r30 = r15 & r30
            r2 = r49
            if (r30 != 0) goto L_0x011c
            boolean r30 = r1.d(r2)
            if (r30 == 0) goto L_0x0118
            r30 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x011a
        L_0x0118:
            r30 = 33554432(0x2000000, float:9.403955E-38)
        L_0x011a:
            r5 = r5 | r30
        L_0x011c:
            r2 = r13 & 512(0x200, float:7.175E-43)
            r30 = 805306368(0x30000000, float:4.656613E-10)
            if (r2 == 0) goto L_0x0127
            r5 = r5 | r30
            r3 = r50
            goto L_0x013a
        L_0x0127:
            r30 = r15 & r30
            r3 = r50
            if (r30 != 0) goto L_0x013a
            boolean r30 = r1.i(r3)
            if (r30 == 0) goto L_0x0136
            r30 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x0138
        L_0x0136:
            r30 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x0138:
            r5 = r5 | r30
        L_0x013a:
            r3 = r13 & 1024(0x400, float:1.435E-42)
            if (r3 == 0) goto L_0x0143
            r22 = r14 | 6
            r4 = r51
            goto L_0x0159
        L_0x0143:
            r30 = r14 & 6
            r4 = r51
            if (r30 != 0) goto L_0x0157
            boolean r30 = r1.W(r4)
            if (r30 == 0) goto L_0x0152
            r22 = 4
            goto L_0x0154
        L_0x0152:
            r22 = 2
        L_0x0154:
            r22 = r14 | r22
            goto L_0x0159
        L_0x0157:
            r22 = r14
        L_0x0159:
            r4 = r13 & 2048(0x800, float:2.87E-42)
            if (r4 == 0) goto L_0x0162
            r22 = r22 | 48
        L_0x015f:
            r6 = r22
            goto L_0x0176
        L_0x0162:
            r30 = r14 & 48
            r6 = r52
            if (r30 != 0) goto L_0x015f
            boolean r30 = r1.l(r6)
            if (r30 == 0) goto L_0x0171
            r24 = 32
            goto L_0x0173
        L_0x0171:
            r24 = 16
        L_0x0173:
            r22 = r22 | r24
            goto L_0x015f
        L_0x0176:
            r7 = r13 & 4096(0x1000, float:5.74E-42)
            if (r7 == 0) goto L_0x017f
            r6 = r6 | 384(0x180, float:5.38E-43)
        L_0x017c:
            r8 = r53
            goto L_0x0192
        L_0x017f:
            r8 = r14 & 384(0x180, float:5.38E-43)
            if (r8 != 0) goto L_0x017c
            r8 = r53
            boolean r22 = r1.W(r8)
            if (r22 == 0) goto L_0x018e
            r27 = 256(0x100, float:3.59E-43)
            goto L_0x0190
        L_0x018e:
            r27 = 128(0x80, float:1.794E-43)
        L_0x0190:
            r6 = r6 | r27
        L_0x0192:
            r8 = r13 & 8192(0x2000, float:1.14794E-41)
            if (r8 == 0) goto L_0x019b
            r6 = r6 | 3072(0xc00, float:4.305E-42)
        L_0x0198:
            r11 = r54
            goto L_0x01ab
        L_0x019b:
            r11 = r14 & 3072(0xc00, float:4.305E-42)
            if (r11 != 0) goto L_0x0198
            r11 = r54
            boolean r22 = r1.W(r11)
            if (r22 == 0) goto L_0x01a9
            r17 = r18
        L_0x01a9:
            r6 = r6 | r17
        L_0x01ab:
            r11 = r13 & 16384(0x4000, float:2.2959E-41)
            if (r11 == 0) goto L_0x01b4
            r6 = r6 | 24576(0x6000, float:3.4438E-41)
        L_0x01b1:
            r12 = r55
            goto L_0x01c4
        L_0x01b4:
            r12 = r14 & 24576(0x6000, float:3.4438E-41)
            if (r12 != 0) goto L_0x01b1
            r12 = r55
            boolean r17 = r1.l(r12)
            if (r17 == 0) goto L_0x01c2
            r20 = r21
        L_0x01c2:
            r6 = r6 | r20
        L_0x01c4:
            r17 = 306783379(0x12492493, float:6.34695E-28)
            r12 = r5 & r17
            r13 = 306783378(0x12492492, float:6.3469493E-28)
            r17 = 0
            r18 = 1
            if (r12 != r13) goto L_0x01dc
            r12 = r6 & 9363(0x2493, float:1.312E-41)
            r13 = 9362(0x2492, float:1.3119E-41)
            if (r12 == r13) goto L_0x01d9
            goto L_0x01dc
        L_0x01d9:
            r12 = r17
            goto L_0x01de
        L_0x01dc:
            r12 = r18
        L_0x01de:
            r13 = r5 & 1
            boolean r12 = r1.E(r12, r13)
            if (r12 == 0) goto L_0x02e7
            if (r9 == 0) goto L_0x01eb
            androidx.compose.ui.Modifier$Companion r9 = androidx.compose.ui.Modifier.f15489d
            goto L_0x01ed
        L_0x01eb:
            r9 = r43
        L_0x01ed:
            if (r16 == 0) goto L_0x01f2
            r12 = r18
            goto L_0x01f4
        L_0x01f2:
            r12 = r44
        L_0x01f4:
            if (r19 == 0) goto L_0x01f9
            r13 = r17
            goto L_0x01fb
        L_0x01f9:
            r13 = r45
        L_0x01fb:
            if (r23 == 0) goto L_0x0206
            androidx.compose.ui.text.TextStyle$Companion r16 = androidx.compose.ui.text.TextStyle.f18499d
            androidx.compose.ui.text.TextStyle r16 = r16.a()
            r36 = r16
            goto L_0x0208
        L_0x0206:
            r36 = r46
        L_0x0208:
            if (r25 == 0) goto L_0x0213
            androidx.compose.foundation.text.KeyboardOptions$Companion r16 = androidx.compose.foundation.text.KeyboardOptions.f5771h
            androidx.compose.foundation.text.KeyboardOptions r16 = r16.a()
            r37 = r16
            goto L_0x0215
        L_0x0213:
            r37 = r47
        L_0x0215:
            if (r10 == 0) goto L_0x021e
            androidx.compose.foundation.text.KeyboardActions$Companion r10 = androidx.compose.foundation.text.KeyboardActions.f5763g
            androidx.compose.foundation.text.KeyboardActions r10 = r10.a()
            goto L_0x0220
        L_0x021e:
            r10 = r48
        L_0x0220:
            if (r0 == 0) goto L_0x0225
            r0 = r17
            goto L_0x0227
        L_0x0225:
            r0 = r49
        L_0x0227:
            if (r2 == 0) goto L_0x022d
            r2 = 2147483647(0x7fffffff, float:NaN)
            goto L_0x022f
        L_0x022d:
            r2 = r50
        L_0x022f:
            if (r3 == 0) goto L_0x0238
            androidx.compose.ui.text.input.VisualTransformation$Companion r3 = androidx.compose.ui.text.input.VisualTransformation.f18929a
            androidx.compose.ui.text.input.VisualTransformation r3 = r3.c()
            goto L_0x023a
        L_0x0238:
            r3 = r51
        L_0x023a:
            if (r4 == 0) goto L_0x023f
            androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$13 r4 = androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$13.f5531z
            goto L_0x0241
        L_0x023f:
            r4 = r52
        L_0x0241:
            if (r7 == 0) goto L_0x0259
            java.lang.Object r7 = r1.g()
            androidx.compose.runtime.Composer$Companion r16 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r14 = r16.a()
            if (r7 != r14) goto L_0x0256
            androidx.compose.foundation.interaction.MutableInteractionSource r7 = androidx.compose.foundation.interaction.InteractionSourceKt.a()
            r1.N(r7)
        L_0x0256:
            androidx.compose.foundation.interaction.MutableInteractionSource r7 = (androidx.compose.foundation.interaction.MutableInteractionSource) r7
            goto L_0x025b
        L_0x0259:
            r7 = r53
        L_0x025b:
            if (r8 == 0) goto L_0x026c
            androidx.compose.ui.graphics.SolidColor r8 = new androidx.compose.ui.graphics.SolidColor
            androidx.compose.ui.graphics.Color$Companion r14 = androidx.compose.ui.graphics.Color.f15975b
            long r14 = r14.a()
            r56 = r1
            r1 = 0
            r8.<init>(r14, r1)
            goto L_0x0270
        L_0x026c:
            r56 = r1
            r8 = r54
        L_0x0270:
            if (r11 == 0) goto L_0x0279
            androidx.compose.foundation.text.ComposableSingletons$BasicTextFieldKt r1 = androidx.compose.foundation.text.ComposableSingletons$BasicTextFieldKt.f5630a
            kotlin.jvm.functions.Function3 r1 = r1.c()
            goto L_0x027b
        L_0x0279:
            r1 = r55
        L_0x027b:
            boolean r11 = androidx.compose.runtime.ComposerKt.P()
            if (r11 == 0) goto L_0x0289
            java.lang.String r11 = "androidx.compose.foundation.text.BasicTextField (BasicTextField.kt:910)"
            r14 = -454732590(0xffffffffe4e554d2, float:-3.384333E22)
            androidx.compose.runtime.ComposerKt.Y(r14, r5, r6, r11)
        L_0x0289:
            r11 = 2147483646(0x7ffffffe, float:NaN)
            r33 = r5 & r11
            int r5 = r6 << 3
            r6 = r5 & 112(0x70, float:1.57E-43)
            r6 = r6 | 6
            r11 = r5 & 896(0x380, float:1.256E-42)
            r6 = r6 | r11
            r11 = r5 & 7168(0x1c00, float:1.0045E-41)
            r6 = r6 | r11
            r11 = 57344(0xe000, float:8.0356E-41)
            r11 = r11 & r5
            r6 = r6 | r11
            r11 = 458752(0x70000, float:6.42848E-40)
            r5 = r5 & r11
            r34 = r6 | r5
            r35 = 0
            r26 = 1
            r16 = r41
            r17 = r42
            r18 = r9
            r19 = r12
            r20 = r13
            r21 = r36
            r22 = r37
            r23 = r10
            r24 = r0
            r25 = r2
            r27 = r3
            r28 = r4
            r29 = r7
            r30 = r8
            r31 = r1
            r32 = r56
            e(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35)
            boolean r5 = androidx.compose.runtime.ComposerKt.P()
            if (r5 == 0) goto L_0x02d4
            androidx.compose.runtime.ComposerKt.X()
        L_0x02d4:
            r15 = r1
            r11 = r3
            r14 = r8
            r3 = r9
            r8 = r10
            r5 = r13
            r6 = r36
            r9 = r0
            r10 = r2
            r13 = r7
            r7 = r37
            r40 = r12
            r12 = r4
            r4 = r40
            goto L_0x0306
        L_0x02e7:
            r56 = r1
            r56.B()
            r3 = r43
            r4 = r44
            r5 = r45
            r6 = r46
            r7 = r47
            r8 = r48
            r9 = r49
            r10 = r50
            r11 = r51
            r12 = r52
            r13 = r53
            r14 = r54
            r15 = r55
        L_0x0306:
            androidx.compose.runtime.ScopeUpdateScope r2 = r56.x()
            if (r2 == 0) goto L_0x0327
            androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$15 r1 = new androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$15
            r0 = r1
            r38 = r1
            r1 = r41
            r39 = r2
            r2 = r42
            r16 = r57
            r17 = r58
            r18 = r59
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            r1 = r38
            r0 = r39
            r0.a(r1)
        L_0x0327:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.BasicTextFieldKt.f(java.lang.String, kotlin.jvm.functions.Function1, androidx.compose.ui.Modifier, boolean, boolean, androidx.compose.ui.text.TextStyle, androidx.compose.foundation.text.KeyboardOptions, androidx.compose.foundation.text.KeyboardActions, boolean, int, androidx.compose.ui.text.input.VisualTransformation, kotlin.jvm.functions.Function1, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.ui.graphics.Brush, kotlin.jvm.functions.Function3, androidx.compose.runtime.Composer, int, int, int):void");
    }

    public static final TextFieldValue g(MutableState mutableState) {
        return (TextFieldValue) mutableState.getValue();
    }

    public static final void h(MutableState mutableState, TextFieldValue textFieldValue) {
        mutableState.setValue(textFieldValue);
    }

    public static final String i(MutableState mutableState) {
        return (String) mutableState.getValue();
    }

    public static final void j(MutableState mutableState, String str) {
        mutableState.setValue(str);
    }

    public static final void k(TextFieldSelectionState textFieldSelectionState, Composer composer, int i2) {
        int i3;
        Composer q2 = composer.q(1991581797);
        if ((i2 & 6) == 0) {
            i3 = (q2.l(textFieldSelectionState) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if (q2.E((i3 & 3) != 2, i3 & 1)) {
            if (ComposerKt.P()) {
                ComposerKt.Y(1991581797, i3, -1, "androidx.compose.foundation.text.TextFieldCursorHandle (BasicTextField.kt:501)");
            }
            boolean W = q2.W(textFieldSelectionState);
            Object g2 = q2.g();
            if (W || g2 == Composer.f14567a.a()) {
                g2 = SnapshotStateKt.e(new BasicTextFieldKt$TextFieldCursorHandle$cursorHandleState$2$1(textFieldSelectionState));
                q2.N(g2);
            }
            if (l((State) g2).f()) {
                q2.X(-311835217);
                boolean l2 = q2.l(textFieldSelectionState);
                Object g3 = q2.g();
                if (l2 || g3 == Composer.f14567a.a()) {
                    g3 = new BasicTextFieldKt$TextFieldCursorHandle$1$1(textFieldSelectionState);
                    q2.N(g3);
                }
                OffsetProvider offsetProvider = (OffsetProvider) g3;
                Modifier.Companion companion = Modifier.f15489d;
                boolean l3 = q2.l(textFieldSelectionState);
                Object g4 = q2.g();
                if (l3 || g4 == Composer.f14567a.a()) {
                    g4 = new BasicTextFieldKt$TextFieldCursorHandle$2$1(textFieldSelectionState);
                    q2.N(g4);
                }
                AndroidCursorHandle_androidKt.a(offsetProvider, SuspendingPointerInputFilterKt.c(companion, textFieldSelectionState, (PointerInputEventHandler) g4), f5505b, q2, 384, 0);
                q2.M();
            } else {
                q2.X(-311451778);
                q2.M();
            }
            if (ComposerKt.P()) {
                ComposerKt.X();
            }
        } else {
            q2.B();
        }
        ScopeUpdateScope x2 = q2.x();
        if (x2 != null) {
            x2.a(new BasicTextFieldKt$TextFieldCursorHandle$3(textFieldSelectionState, i2));
        }
    }

    public static final TextFieldHandleState l(State state) {
        return (TextFieldHandleState) state.getValue();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v12, resolved type: androidx.compose.foundation.text.selection.OffsetProvider} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v22, resolved type: androidx.compose.foundation.text.selection.OffsetProvider} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m(androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState r12, androidx.compose.runtime.Composer r13, int r14) {
        /*
            r0 = 2025287684(0x78b77004, float:2.9764446E34)
            androidx.compose.runtime.Composer r13 = r13.q(r0)
            r1 = r14 & 6
            r2 = 2
            if (r1 != 0) goto L_0x0017
            boolean r1 = r13.l(r12)
            if (r1 == 0) goto L_0x0014
            r1 = 4
            goto L_0x0015
        L_0x0014:
            r1 = r2
        L_0x0015:
            r1 = r1 | r14
            goto L_0x0018
        L_0x0017:
            r1 = r14
        L_0x0018:
            r3 = r1 & 3
            if (r3 == r2) goto L_0x001e
            r2 = 1
            goto L_0x001f
        L_0x001e:
            r2 = 0
        L_0x001f:
            r3 = r1 & 1
            boolean r2 = r13.E(r2, r3)
            if (r2 == 0) goto L_0x017b
            boolean r2 = androidx.compose.runtime.ComposerKt.P()
            if (r2 == 0) goto L_0x0033
            r2 = -1
            java.lang.String r3 = "androidx.compose.foundation.text.TextFieldSelectionHandles (BasicTextField.kt:522)"
            androidx.compose.runtime.ComposerKt.Y(r0, r1, r2, r3)
        L_0x0033:
            boolean r0 = r13.W(r12)
            java.lang.Object r1 = r13.g()
            if (r0 != 0) goto L_0x0045
            androidx.compose.runtime.Composer$Companion r0 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r0 = r0.a()
            if (r1 != r0) goto L_0x0051
        L_0x0045:
            androidx.compose.foundation.text.BasicTextFieldKt$TextFieldSelectionHandles$startHandleState$2$1 r0 = new androidx.compose.foundation.text.BasicTextFieldKt$TextFieldSelectionHandles$startHandleState$2$1
            r0.<init>(r12)
            androidx.compose.runtime.State r1 = androidx.compose.runtime.SnapshotStateKt.e(r0)
            r13.N(r1)
        L_0x0051:
            androidx.compose.runtime.State r1 = (androidx.compose.runtime.State) r1
            androidx.compose.foundation.text.input.internal.selection.TextFieldHandleState r0 = n(r1)
            boolean r0 = r0.f()
            if (r0 == 0) goto L_0x00c9
            r0 = -1348660553(0xffffffffaf9d12b7, float:-2.857143E-10)
            r13.X(r0)
            boolean r0 = r13.l(r12)
            java.lang.Object r2 = r13.g()
            if (r0 != 0) goto L_0x0075
            androidx.compose.runtime.Composer$Companion r0 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r0 = r0.a()
            if (r2 != r0) goto L_0x007d
        L_0x0075:
            androidx.compose.foundation.text.BasicTextFieldKt$TextFieldSelectionHandles$1$1 r2 = new androidx.compose.foundation.text.BasicTextFieldKt$TextFieldSelectionHandles$1$1
            r2.<init>(r12)
            r13.N(r2)
        L_0x007d:
            r0 = r2
            androidx.compose.foundation.text.selection.OffsetProvider r0 = (androidx.compose.foundation.text.selection.OffsetProvider) r0
            androidx.compose.foundation.text.input.internal.selection.TextFieldHandleState r2 = n(r1)
            androidx.compose.ui.text.style.ResolvedTextDirection r3 = r2.b()
            androidx.compose.foundation.text.input.internal.selection.TextFieldHandleState r2 = n(r1)
            boolean r4 = r2.c()
            androidx.compose.ui.Modifier$Companion r2 = androidx.compose.ui.Modifier.f15489d
            boolean r5 = r13.l(r12)
            java.lang.Object r6 = r13.g()
            if (r5 != 0) goto L_0x00a4
            androidx.compose.runtime.Composer$Companion r5 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r5 = r5.a()
            if (r6 != r5) goto L_0x00ac
        L_0x00a4:
            androidx.compose.foundation.text.BasicTextFieldKt$TextFieldSelectionHandles$2$1 r6 = new androidx.compose.foundation.text.BasicTextFieldKt$TextFieldSelectionHandles$2$1
            r6.<init>(r12)
            r13.N(r6)
        L_0x00ac:
            androidx.compose.ui.input.pointer.PointerInputEventHandler r6 = (androidx.compose.ui.input.pointer.PointerInputEventHandler) r6
            androidx.compose.ui.Modifier r8 = androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt.c(r2, r12, r6)
            androidx.compose.foundation.text.input.internal.selection.TextFieldHandleState r1 = n(r1)
            float r7 = r1.d()
            long r5 = f5505b
            r10 = 24624(0x6030, float:3.4506E-41)
            r11 = 0
            r2 = 1
            r1 = r0
            r9 = r13
            androidx.compose.foundation.text.selection.AndroidSelectionHandles_androidKt.b(r1, r2, r3, r4, r5, r7, r8, r9, r10, r11)
            r13.M()
            goto L_0x00d2
        L_0x00c9:
            r0 = -1348008995(0xffffffffafa703dd, float:-3.0379868E-10)
            r13.X(r0)
            r13.M()
        L_0x00d2:
            boolean r0 = r13.W(r12)
            java.lang.Object r1 = r13.g()
            if (r0 != 0) goto L_0x00e4
            androidx.compose.runtime.Composer$Companion r0 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r0 = r0.a()
            if (r1 != r0) goto L_0x00f0
        L_0x00e4:
            androidx.compose.foundation.text.BasicTextFieldKt$TextFieldSelectionHandles$endHandleState$2$1 r0 = new androidx.compose.foundation.text.BasicTextFieldKt$TextFieldSelectionHandles$endHandleState$2$1
            r0.<init>(r12)
            androidx.compose.runtime.State r1 = androidx.compose.runtime.SnapshotStateKt.e(r0)
            r13.N(r1)
        L_0x00f0:
            androidx.compose.runtime.State r1 = (androidx.compose.runtime.State) r1
            androidx.compose.foundation.text.input.internal.selection.TextFieldHandleState r0 = o(r1)
            boolean r0 = r0.f()
            if (r0 == 0) goto L_0x0168
            r0 = -1347616070(0xffffffffafad02ba, float:-3.1470454E-10)
            r13.X(r0)
            boolean r0 = r13.l(r12)
            java.lang.Object r2 = r13.g()
            if (r0 != 0) goto L_0x0114
            androidx.compose.runtime.Composer$Companion r0 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r0 = r0.a()
            if (r2 != r0) goto L_0x011c
        L_0x0114:
            androidx.compose.foundation.text.BasicTextFieldKt$TextFieldSelectionHandles$3$1 r2 = new androidx.compose.foundation.text.BasicTextFieldKt$TextFieldSelectionHandles$3$1
            r2.<init>(r12)
            r13.N(r2)
        L_0x011c:
            r0 = r2
            androidx.compose.foundation.text.selection.OffsetProvider r0 = (androidx.compose.foundation.text.selection.OffsetProvider) r0
            androidx.compose.foundation.text.input.internal.selection.TextFieldHandleState r2 = o(r1)
            androidx.compose.ui.text.style.ResolvedTextDirection r3 = r2.b()
            androidx.compose.foundation.text.input.internal.selection.TextFieldHandleState r2 = o(r1)
            boolean r4 = r2.c()
            androidx.compose.ui.Modifier$Companion r2 = androidx.compose.ui.Modifier.f15489d
            boolean r5 = r13.l(r12)
            java.lang.Object r6 = r13.g()
            if (r5 != 0) goto L_0x0143
            androidx.compose.runtime.Composer$Companion r5 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r5 = r5.a()
            if (r6 != r5) goto L_0x014b
        L_0x0143:
            androidx.compose.foundation.text.BasicTextFieldKt$TextFieldSelectionHandles$4$1 r6 = new androidx.compose.foundation.text.BasicTextFieldKt$TextFieldSelectionHandles$4$1
            r6.<init>(r12)
            r13.N(r6)
        L_0x014b:
            androidx.compose.ui.input.pointer.PointerInputEventHandler r6 = (androidx.compose.ui.input.pointer.PointerInputEventHandler) r6
            androidx.compose.ui.Modifier r8 = androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt.c(r2, r12, r6)
            androidx.compose.foundation.text.input.internal.selection.TextFieldHandleState r1 = o(r1)
            float r7 = r1.d()
            long r5 = f5505b
            r10 = 24624(0x6030, float:3.4506E-41)
            r11 = 0
            r2 = 0
            r1 = r0
            r9 = r13
            androidx.compose.foundation.text.selection.AndroidSelectionHandles_androidKt.b(r1, r2, r3, r4, r5, r7, r8, r9, r10, r11)
            r13.M()
            goto L_0x0171
        L_0x0168:
            r0 = -1346967395(0xffffffffafb6e89d, float:-3.327089E-10)
            r13.X(r0)
            r13.M()
        L_0x0171:
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x017e
            androidx.compose.runtime.ComposerKt.X()
            goto L_0x017e
        L_0x017b:
            r13.B()
        L_0x017e:
            androidx.compose.runtime.ScopeUpdateScope r13 = r13.x()
            if (r13 == 0) goto L_0x018c
            androidx.compose.foundation.text.BasicTextFieldKt$TextFieldSelectionHandles$5 r0 = new androidx.compose.foundation.text.BasicTextFieldKt$TextFieldSelectionHandles$5
            r0.<init>(r12, r14)
            r13.a(r0)
        L_0x018c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.BasicTextFieldKt.m(androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState, androidx.compose.runtime.Composer, int):void");
    }

    public static final TextFieldHandleState n(State state) {
        return (TextFieldHandleState) state.getValue();
    }

    public static final TextFieldHandleState o(State state) {
        return (TextFieldHandleState) state.getValue();
    }
}
