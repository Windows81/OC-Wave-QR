package androidx.compose.material;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;

@Metadata
public final class TextFieldKt {

    /* renamed from: a  reason: collision with root package name */
    public static final float f8799a = Dp.m((float) 20);

    /* renamed from: b  reason: collision with root package name */
    public static final float f8800b = Dp.m((float) 10);

    /* renamed from: c  reason: collision with root package name */
    public static final float f8801c = Dp.m((float) 2);

    /* JADX WARNING: Removed duplicated region for block: B:107:0x0142  */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x0147  */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x0161  */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x0166  */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x017e  */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x0183  */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x019a  */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x019f  */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x01b3  */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x01c7  */
    /* JADX WARNING: Removed duplicated region for block: B:160:0x01cd  */
    /* JADX WARNING: Removed duplicated region for block: B:167:0x01e4  */
    /* JADX WARNING: Removed duplicated region for block: B:170:0x01ec  */
    /* JADX WARNING: Removed duplicated region for block: B:177:0x0200  */
    /* JADX WARNING: Removed duplicated region for block: B:180:0x0208  */
    /* JADX WARNING: Removed duplicated region for block: B:187:0x021c  */
    /* JADX WARNING: Removed duplicated region for block: B:190:0x0224  */
    /* JADX WARNING: Removed duplicated region for block: B:191:0x0229  */
    /* JADX WARNING: Removed duplicated region for block: B:202:0x0252  */
    /* JADX WARNING: Removed duplicated region for block: B:203:0x0254  */
    /* JADX WARNING: Removed duplicated region for block: B:206:0x025d  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:305:0x055e  */
    /* JADX WARNING: Removed duplicated region for block: B:308:0x058b  */
    /* JADX WARNING: Removed duplicated region for block: B:310:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00a2  */
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
    public static final void a(androidx.compose.foundation.text.input.TextFieldState r69, androidx.compose.ui.Modifier r70, boolean r71, boolean r72, androidx.compose.ui.text.TextStyle r73, kotlin.jvm.functions.Function2 r74, kotlin.jvm.functions.Function2 r75, kotlin.jvm.functions.Function2 r76, kotlin.jvm.functions.Function2 r77, boolean r78, androidx.compose.foundation.text.input.InputTransformation r79, androidx.compose.foundation.text.input.OutputTransformation r80, androidx.compose.foundation.text.KeyboardOptions r81, androidx.compose.foundation.text.input.KeyboardActionHandler r82, androidx.compose.foundation.text.input.TextFieldLineLimits r83, androidx.compose.foundation.ScrollState r84, androidx.compose.ui.graphics.Shape r85, androidx.compose.material.TextFieldColors r86, androidx.compose.foundation.interaction.MutableInteractionSource r87, androidx.compose.runtime.Composer r88, int r89, int r90, int r91) {
        /*
            r15 = r89
            r14 = r90
            r13 = r91
            r0 = -1967634894(0xffffffff8ab84632, float:-1.774496E-32)
            r1 = r88
            androidx.compose.runtime.Composer r0 = r1.q(r0)
            r1 = r13 & 1
            if (r1 == 0) goto L_0x0019
            r1 = r15 | 6
            r4 = r1
            r1 = r69
            goto L_0x002d
        L_0x0019:
            r1 = r15 & 6
            if (r1 != 0) goto L_0x002a
            r1 = r69
            boolean r4 = r0.W(r1)
            if (r4 == 0) goto L_0x0027
            r4 = 4
            goto L_0x0028
        L_0x0027:
            r4 = 2
        L_0x0028:
            r4 = r4 | r15
            goto L_0x002d
        L_0x002a:
            r1 = r69
            r4 = r15
        L_0x002d:
            r5 = r13 & 2
            if (r5 == 0) goto L_0x0036
            r4 = r4 | 48
        L_0x0033:
            r8 = r70
            goto L_0x0048
        L_0x0036:
            r8 = r15 & 48
            if (r8 != 0) goto L_0x0033
            r8 = r70
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
        L_0x004e:
            r12 = r71
            goto L_0x0064
        L_0x0051:
            r12 = r15 & 384(0x180, float:5.38E-43)
            if (r12 != 0) goto L_0x004e
            r12 = r71
            boolean r16 = r0.d(r12)
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
        L_0x006e:
            r2 = r72
            goto L_0x0084
        L_0x0071:
            r2 = r15 & 3072(0xc00, float:4.305E-42)
            if (r2 != 0) goto L_0x006e
            r2 = r72
            boolean r19 = r0.d(r2)
            if (r19 == 0) goto L_0x0080
            r19 = r18
            goto L_0x0082
        L_0x0080:
            r19 = r17
        L_0x0082:
            r4 = r4 | r19
        L_0x0084:
            r3 = r15 & 24576(0x6000, float:3.4438E-41)
            r20 = 8192(0x2000, float:1.14794E-41)
            r21 = 16384(0x4000, float:2.2959E-41)
            if (r3 != 0) goto L_0x00a2
            r3 = r13 & 16
            if (r3 != 0) goto L_0x009b
            r3 = r73
            boolean r22 = r0.W(r3)
            if (r22 == 0) goto L_0x009d
            r22 = r21
            goto L_0x009f
        L_0x009b:
            r3 = r73
        L_0x009d:
            r22 = r20
        L_0x009f:
            r4 = r4 | r22
            goto L_0x00a4
        L_0x00a2:
            r3 = r73
        L_0x00a4:
            r22 = r13 & 32
            r23 = 196608(0x30000, float:2.75506E-40)
            r24 = 65536(0x10000, float:9.18355E-41)
            r25 = 131072(0x20000, float:1.83671E-40)
            if (r22 == 0) goto L_0x00b3
            r4 = r4 | r23
            r6 = r74
            goto L_0x00c6
        L_0x00b3:
            r26 = r15 & r23
            r6 = r74
            if (r26 != 0) goto L_0x00c6
            boolean r27 = r0.l(r6)
            if (r27 == 0) goto L_0x00c2
            r27 = r25
            goto L_0x00c4
        L_0x00c2:
            r27 = r24
        L_0x00c4:
            r4 = r4 | r27
        L_0x00c6:
            r27 = r13 & 64
            r28 = 1572864(0x180000, float:2.204052E-39)
            if (r27 == 0) goto L_0x00d1
            r4 = r4 | r28
            r7 = r75
            goto L_0x00e4
        L_0x00d1:
            r28 = r15 & r28
            r7 = r75
            if (r28 != 0) goto L_0x00e4
            boolean r29 = r0.l(r7)
            if (r29 == 0) goto L_0x00e0
            r29 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00e2
        L_0x00e0:
            r29 = 524288(0x80000, float:7.34684E-40)
        L_0x00e2:
            r4 = r4 | r29
        L_0x00e4:
            r10 = r13 & 128(0x80, float:1.794E-43)
            r30 = 12582912(0xc00000, float:1.7632415E-38)
            if (r10 == 0) goto L_0x00ef
            r4 = r4 | r30
            r11 = r76
            goto L_0x0102
        L_0x00ef:
            r30 = r15 & r30
            r11 = r76
            if (r30 != 0) goto L_0x0102
            boolean r31 = r0.l(r11)
            if (r31 == 0) goto L_0x00fe
            r31 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x0100
        L_0x00fe:
            r31 = 4194304(0x400000, float:5.877472E-39)
        L_0x0100:
            r4 = r4 | r31
        L_0x0102:
            r1 = r13 & 256(0x100, float:3.59E-43)
            r31 = 100663296(0x6000000, float:2.4074124E-35)
            if (r1 == 0) goto L_0x010d
            r4 = r4 | r31
            r2 = r77
            goto L_0x0120
        L_0x010d:
            r32 = r15 & r31
            r2 = r77
            if (r32 != 0) goto L_0x0120
            boolean r32 = r0.l(r2)
            if (r32 == 0) goto L_0x011c
            r32 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x011e
        L_0x011c:
            r32 = 33554432(0x2000000, float:9.403955E-38)
        L_0x011e:
            r4 = r4 | r32
        L_0x0120:
            r2 = r13 & 512(0x200, float:7.175E-43)
            r32 = 805306368(0x30000000, float:4.656613E-10)
            if (r2 == 0) goto L_0x012b
            r4 = r4 | r32
            r3 = r78
            goto L_0x013e
        L_0x012b:
            r32 = r15 & r32
            r3 = r78
            if (r32 != 0) goto L_0x013e
            boolean r32 = r0.d(r3)
            if (r32 == 0) goto L_0x013a
            r32 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x013c
        L_0x013a:
            r32 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x013c:
            r4 = r4 | r32
        L_0x013e:
            r3 = r13 & 1024(0x400, float:1.435E-42)
            if (r3 == 0) goto L_0x0147
            r19 = r14 | 6
            r6 = r79
            goto L_0x015d
        L_0x0147:
            r32 = r14 & 6
            r6 = r79
            if (r32 != 0) goto L_0x015b
            boolean r32 = r0.W(r6)
            if (r32 == 0) goto L_0x0156
            r19 = 4
            goto L_0x0158
        L_0x0156:
            r19 = 2
        L_0x0158:
            r19 = r14 | r19
            goto L_0x015d
        L_0x015b:
            r19 = r14
        L_0x015d:
            r6 = r13 & 2048(0x800, float:2.87E-42)
            if (r6 == 0) goto L_0x0166
            r19 = r19 | 48
        L_0x0163:
            r7 = r19
            goto L_0x017a
        L_0x0166:
            r32 = r14 & 48
            r7 = r80
            if (r32 != 0) goto L_0x0163
            boolean r32 = r0.W(r7)
            if (r32 == 0) goto L_0x0175
            r26 = 32
            goto L_0x0177
        L_0x0175:
            r26 = 16
        L_0x0177:
            r19 = r19 | r26
            goto L_0x0163
        L_0x017a:
            r8 = r13 & 4096(0x1000, float:5.74E-42)
            if (r8 == 0) goto L_0x0183
            r7 = r7 | 384(0x180, float:5.38E-43)
        L_0x0180:
            r11 = r81
            goto L_0x0196
        L_0x0183:
            r11 = r14 & 384(0x180, float:5.38E-43)
            if (r11 != 0) goto L_0x0180
            r11 = r81
            boolean r19 = r0.W(r11)
            if (r19 == 0) goto L_0x0192
            r29 = 256(0x100, float:3.59E-43)
            goto L_0x0194
        L_0x0192:
            r29 = 128(0x80, float:1.794E-43)
        L_0x0194:
            r7 = r7 | r29
        L_0x0196:
            r11 = r13 & 8192(0x2000, float:1.14794E-41)
            if (r11 == 0) goto L_0x019f
            r7 = r7 | 3072(0xc00, float:4.305E-42)
        L_0x019c:
            r12 = r82
            goto L_0x01af
        L_0x019f:
            r12 = r14 & 3072(0xc00, float:4.305E-42)
            if (r12 != 0) goto L_0x019c
            r12 = r82
            boolean r19 = r0.W(r12)
            if (r19 == 0) goto L_0x01ad
            r17 = r18
        L_0x01ad:
            r7 = r7 | r17
        L_0x01af:
            r12 = r14 & 24576(0x6000, float:3.4438E-41)
            if (r12 != 0) goto L_0x01c7
            r12 = r13 & 16384(0x4000, float:2.2959E-41)
            if (r12 != 0) goto L_0x01c2
            r12 = r83
            boolean r17 = r0.W(r12)
            if (r17 == 0) goto L_0x01c4
            r20 = r21
            goto L_0x01c4
        L_0x01c2:
            r12 = r83
        L_0x01c4:
            r7 = r7 | r20
            goto L_0x01c9
        L_0x01c7:
            r12 = r83
        L_0x01c9:
            r17 = r14 & r23
            if (r17 != 0) goto L_0x01e4
            r17 = 32768(0x8000, float:4.5918E-41)
            r17 = r13 & r17
            r12 = r84
            if (r17 != 0) goto L_0x01df
            boolean r17 = r0.W(r12)
            if (r17 == 0) goto L_0x01df
            r17 = r25
            goto L_0x01e1
        L_0x01df:
            r17 = r24
        L_0x01e1:
            r7 = r7 | r17
            goto L_0x01e6
        L_0x01e4:
            r12 = r84
        L_0x01e6:
            r17 = 1572864(0x180000, float:2.204052E-39)
            r17 = r14 & r17
            if (r17 != 0) goto L_0x0200
            r17 = r13 & r24
            r12 = r85
            if (r17 != 0) goto L_0x01fb
            boolean r17 = r0.W(r12)
            if (r17 == 0) goto L_0x01fb
            r17 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x01fd
        L_0x01fb:
            r17 = 524288(0x80000, float:7.34684E-40)
        L_0x01fd:
            r7 = r7 | r17
            goto L_0x0202
        L_0x0200:
            r12 = r85
        L_0x0202:
            r17 = 12582912(0xc00000, float:1.7632415E-38)
            r17 = r14 & r17
            if (r17 != 0) goto L_0x021c
            r17 = r13 & r25
            r12 = r86
            if (r17 != 0) goto L_0x0217
            boolean r17 = r0.W(r12)
            if (r17 == 0) goto L_0x0217
            r17 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x0219
        L_0x0217:
            r17 = 4194304(0x400000, float:5.877472E-39)
        L_0x0219:
            r7 = r7 | r17
            goto L_0x021e
        L_0x021c:
            r12 = r86
        L_0x021e:
            r17 = 262144(0x40000, float:3.67342E-40)
            r64 = r13 & r17
            if (r64 == 0) goto L_0x0229
            r7 = r7 | r31
            r12 = r87
            goto L_0x023c
        L_0x0229:
            r17 = r14 & r31
            r12 = r87
            if (r17 != 0) goto L_0x023c
            boolean r17 = r0.W(r12)
            if (r17 == 0) goto L_0x0238
            r17 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x023a
        L_0x0238:
            r17 = 33554432(0x2000000, float:9.403955E-38)
        L_0x023a:
            r7 = r7 | r17
        L_0x023c:
            r17 = 306783379(0x12492493, float:6.34695E-28)
            r12 = r4 & r17
            r14 = 306783378(0x12492492, float:6.3469493E-28)
            r17 = r11
            if (r12 != r14) goto L_0x0254
            r12 = 38347923(0x2492493, float:1.4777644E-37)
            r12 = r12 & r7
            r14 = 38347922(0x2492492, float:1.4777643E-37)
            if (r12 == r14) goto L_0x0252
            goto L_0x0254
        L_0x0252:
            r12 = 0
            goto L_0x0255
        L_0x0254:
            r12 = 1
        L_0x0255:
            r14 = r4 & 1
            boolean r12 = r0.E(r12, r14)
            if (r12 == 0) goto L_0x055e
            r0.p()
            r12 = r15 & 1
            r14 = -57345(0xffffffffffff1fff, float:NaN)
            if (r12 == 0) goto L_0x02bd
            boolean r12 = r0.J()
            if (r12 == 0) goto L_0x026e
            goto L_0x02bd
        L_0x026e:
            r0.B()
            r1 = r13 & 16
            if (r1 == 0) goto L_0x0276
            r4 = r4 & r14
        L_0x0276:
            r1 = r13 & 16384(0x4000, float:2.2959E-41)
            if (r1 == 0) goto L_0x027b
            r7 = r7 & r14
        L_0x027b:
            r1 = 32768(0x8000, float:4.5918E-41)
            r1 = r1 & r13
            if (r1 == 0) goto L_0x0285
            r1 = -458753(0xfffffffffff8ffff, float:NaN)
            r7 = r7 & r1
        L_0x0285:
            r1 = r13 & r24
            if (r1 == 0) goto L_0x028d
            r1 = -3670017(0xffffffffffc7ffff, float:NaN)
            r7 = r7 & r1
        L_0x028d:
            r1 = r13 & r25
            if (r1 == 0) goto L_0x0295
            r1 = -29360129(0xfffffffffe3fffff, float:-6.380294E37)
            r7 = r7 & r1
        L_0x0295:
            r5 = r70
            r9 = r71
            r12 = r72
            r11 = r73
            r65 = r74
            r66 = r75
            r10 = r76
            r1 = r77
            r2 = r78
            r3 = r79
            r6 = r80
            r8 = r81
            r67 = r82
            r14 = r83
            r30 = r84
            r13 = r86
            r29 = r87
            r15 = r4
            r4 = r7
            r7 = r85
            goto L_0x03bc
        L_0x02bd:
            if (r5 == 0) goto L_0x02c2
            androidx.compose.ui.Modifier$Companion r5 = androidx.compose.ui.Modifier.f15489d
            goto L_0x02c4
        L_0x02c2:
            r5 = r70
        L_0x02c4:
            if (r9 == 0) goto L_0x02c8
            r9 = 1
            goto L_0x02ca
        L_0x02c8:
            r9 = r71
        L_0x02ca:
            if (r16 == 0) goto L_0x02ce
            r12 = 0
            goto L_0x02d0
        L_0x02ce:
            r12 = r72
        L_0x02d0:
            r16 = r13 & 16
            if (r16 == 0) goto L_0x02e0
            androidx.compose.runtime.ProvidableCompositionLocal r11 = androidx.compose.material.TextKt.f()
            java.lang.Object r11 = r0.C(r11)
            androidx.compose.ui.text.TextStyle r11 = (androidx.compose.ui.text.TextStyle) r11
            r4 = r4 & r14
            goto L_0x02e2
        L_0x02e0:
            r11 = r73
        L_0x02e2:
            if (r22 == 0) goto L_0x02e7
            r65 = 0
            goto L_0x02e9
        L_0x02e7:
            r65 = r74
        L_0x02e9:
            if (r27 == 0) goto L_0x02ee
            r66 = 0
            goto L_0x02f0
        L_0x02ee:
            r66 = r75
        L_0x02f0:
            if (r10 == 0) goto L_0x02f4
            r10 = 0
            goto L_0x02f6
        L_0x02f4:
            r10 = r76
        L_0x02f6:
            if (r1 == 0) goto L_0x02fa
            r1 = 0
            goto L_0x02fc
        L_0x02fa:
            r1 = r77
        L_0x02fc:
            if (r2 == 0) goto L_0x0300
            r2 = 0
            goto L_0x0302
        L_0x0300:
            r2 = r78
        L_0x0302:
            if (r3 == 0) goto L_0x0306
            r3 = 0
            goto L_0x0308
        L_0x0306:
            r3 = r79
        L_0x0308:
            if (r6 == 0) goto L_0x030c
            r6 = 0
            goto L_0x030e
        L_0x030c:
            r6 = r80
        L_0x030e:
            if (r8 == 0) goto L_0x0317
            androidx.compose.foundation.text.KeyboardOptions$Companion r8 = androidx.compose.foundation.text.KeyboardOptions.f5771h
            androidx.compose.foundation.text.KeyboardOptions r8 = r8.a()
            goto L_0x0319
        L_0x0317:
            r8 = r81
        L_0x0319:
            if (r17 == 0) goto L_0x031e
            r67 = 0
            goto L_0x0320
        L_0x031e:
            r67 = r82
        L_0x0320:
            r14 = r13 & 16384(0x4000, float:2.2959E-41)
            if (r14 == 0) goto L_0x0330
            androidx.compose.foundation.text.input.TextFieldLineLimits$Companion r14 = androidx.compose.foundation.text.input.TextFieldLineLimits.f6068a
            androidx.compose.foundation.text.input.TextFieldLineLimits r14 = r14.a()
            r16 = -57345(0xffffffffffff1fff, float:NaN)
            r7 = r7 & r16
            goto L_0x0332
        L_0x0330:
            r14 = r83
        L_0x0332:
            r16 = 32768(0x8000, float:4.5918E-41)
            r16 = r13 & r16
            r70 = r1
            r71 = r2
            if (r16 == 0) goto L_0x0348
            r1 = 0
            r2 = 1
            androidx.compose.foundation.ScrollState r1 = androidx.compose.foundation.ScrollKt.c(r1, r0, r1, r2)
            r2 = -458753(0xfffffffffff8ffff, float:NaN)
            r7 = r7 & r2
            goto L_0x034a
        L_0x0348:
            r1 = r84
        L_0x034a:
            r2 = r13 & r24
            if (r2 == 0) goto L_0x035c
            androidx.compose.material.TextFieldDefaults r2 = androidx.compose.material.TextFieldDefaults.f8730a
            r72 = r1
            r1 = 6
            androidx.compose.ui.graphics.Shape r2 = r2.i(r0, r1)
            r1 = -3670017(0xffffffffffc7ffff, float:NaN)
            r7 = r7 & r1
            goto L_0x0360
        L_0x035c:
            r72 = r1
            r2 = r85
        L_0x0360:
            r1 = r13 & r25
            if (r1 == 0) goto L_0x03a5
            androidx.compose.material.TextFieldDefaults r16 = androidx.compose.material.TextFieldDefaults.f8730a
            r62 = 48
            r63 = 2097151(0x1fffff, float:2.938734E-39)
            r17 = 0
            r19 = 0
            r21 = 0
            r23 = 0
            r25 = 0
            r27 = 0
            r29 = 0
            r31 = 0
            r33 = 0
            r35 = 0
            r37 = 0
            r39 = 0
            r41 = 0
            r43 = 0
            r45 = 0
            r47 = 0
            r49 = 0
            r51 = 0
            r53 = 0
            r55 = 0
            r57 = 0
            r60 = 0
            r61 = 0
            r59 = r0
            androidx.compose.material.TextFieldColors r1 = r16.o(r17, r19, r21, r23, r25, r27, r29, r31, r33, r35, r37, r39, r41, r43, r45, r47, r49, r51, r53, r55, r57, r59, r60, r61, r62, r63)
            r16 = -29360129(0xfffffffffe3fffff, float:-6.380294E37)
            r7 = r7 & r16
            goto L_0x03a7
        L_0x03a5:
            r1 = r86
        L_0x03a7:
            r30 = r72
            if (r64 == 0) goto L_0x03b6
            r13 = r1
            r15 = r4
            r4 = r7
            r29 = 0
        L_0x03b0:
            r1 = r70
            r7 = r2
            r2 = r71
            goto L_0x03bc
        L_0x03b6:
            r29 = r87
            r13 = r1
            r15 = r4
            r4 = r7
            goto L_0x03b0
        L_0x03bc:
            r0.U()
            boolean r16 = androidx.compose.runtime.ComposerKt.P()
            if (r16 == 0) goto L_0x03d2
            r31 = r8
            r8 = -1967634894(0xffffffff8ab84632, float:-1.774496E-32)
            r32 = r3
            java.lang.String r3 = "androidx.compose.material.TextField (TextField.kt:196)"
            androidx.compose.runtime.ComposerKt.Y(r8, r15, r4, r3)
            goto L_0x03d6
        L_0x03d2:
            r32 = r3
            r31 = r8
        L_0x03d6:
            if (r29 != 0) goto L_0x03f7
            r3 = -1673838860(0xffffffff9c3b3ef4, float:-6.1954475E-22)
            r0.X(r3)
            java.lang.Object r3 = r0.g()
            androidx.compose.runtime.Composer$Companion r8 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r8 = r8.a()
            if (r3 != r8) goto L_0x03f1
            androidx.compose.foundation.interaction.MutableInteractionSource r3 = androidx.compose.foundation.interaction.InteractionSourceKt.a()
            r0.N(r3)
        L_0x03f1:
            androidx.compose.foundation.interaction.MutableInteractionSource r3 = (androidx.compose.foundation.interaction.MutableInteractionSource) r3
            r0.M()
            goto L_0x0402
        L_0x03f7:
            r3 = -53995453(0xfffffffffcc81843, float:-8.3116117E36)
            r0.X(r3)
            r0.M()
            r3 = r29
        L_0x0402:
            r8 = -53989707(0xfffffffffcc82eb5, float:-8.3152536E36)
            r0.X(r8)
            long r16 = r11.h()
            r18 = 16
            int r8 = (r16 > r18 ? 1 : (r16 == r18 ? 0 : -1))
            if (r8 == 0) goto L_0x0415
        L_0x0412:
            r34 = r16
            goto L_0x042e
        L_0x0415:
            int r8 = r15 >> 6
            r8 = r8 & 14
            int r16 = r4 >> 18
            r16 = r16 & 112(0x70, float:1.57E-43)
            r8 = r8 | r16
            androidx.compose.runtime.State r8 = r13.c(r9, r0, r8)
            java.lang.Object r8 = r8.getValue()
            androidx.compose.ui.graphics.Color r8 = (androidx.compose.ui.graphics.Color) r8
            long r16 = r8.v()
            goto L_0x0412
        L_0x042e:
            r0.M()
            androidx.compose.ui.text.TextStyle r8 = new androidx.compose.ui.text.TextStyle
            r33 = r8
            r63 = 16777214(0xfffffe, float:2.3509884E-38)
            r64 = 0
            r36 = 0
            r38 = 0
            r39 = 0
            r40 = 0
            r41 = 0
            r42 = 0
            r43 = 0
            r45 = 0
            r46 = 0
            r47 = 0
            r48 = 0
            r50 = 0
            r51 = 0
            r52 = 0
            r53 = 0
            r54 = 0
            r55 = 0
            r57 = 0
            r58 = 0
            r59 = 0
            r60 = 0
            r61 = 0
            r62 = 0
            r33.<init>(r34, r36, r38, r39, r40, r41, r42, r43, r45, r46, r47, r48, r50, r51, r52, r53, r54, r55, r57, r58, r59, r60, r61, r62, r63, r64)
            androidx.compose.ui.text.TextStyle r8 = r11.J(r8)
            r75 = r8
            androidx.compose.material.TextFieldDefaults r8 = androidx.compose.material.TextFieldDefaults.f8730a
            r16 = 48
            r17 = 0
            r18 = 0
            r19 = 0
            r76 = r8
            r77 = r5
            r78 = r9
            r79 = r2
            r80 = r3
            r81 = r13
            r82 = r18
            r83 = r19
            r84 = r16
            r85 = r17
            r33 = r5
            androidx.compose.ui.Modifier r5 = androidx.compose.material.TextFieldDefaults.k(r76, r77, r78, r79, r80, r81, r82, r83, r84, r85)
            androidx.compose.material.Strings$Companion r16 = androidx.compose.material.Strings.f8507b
            r34 = r11
            int r11 = r16.c()
            r35 = r12
            r12 = 6
            java.lang.String r11 = androidx.compose.material.Strings_androidKt.a(r11, r0, r12)
            androidx.compose.ui.Modifier r5 = androidx.compose.material.TextFieldImplKt.c(r5, r2, r11)
            float r11 = r8.g()
            float r8 = r8.f()
            androidx.compose.ui.Modifier r5 = androidx.compose.foundation.layout.SizeKt.a(r5, r11, r8)
            r71 = r5
            androidx.compose.ui.graphics.SolidColor r5 = new androidx.compose.ui.graphics.SolidColor
            r81 = r5
            int r8 = r15 >> 27
            r8 = r8 & 14
            int r11 = r4 >> 18
            r11 = r11 & 112(0x70, float:1.57E-43)
            r8 = r8 | r11
            androidx.compose.runtime.State r8 = r13.f(r2, r0, r8)
            java.lang.Object r8 = r8.getValue()
            androidx.compose.ui.graphics.Color r8 = (androidx.compose.ui.graphics.Color) r8
            long r11 = r8.v()
            r8 = 0
            r5.<init>(r11, r8)
            androidx.compose.material.TextFieldKt$TextField$1 r16 = new androidx.compose.material.TextFieldKt$TextField$1
            r83 = r16
            r17 = r6
            r18 = r69
            r19 = r14
            r20 = r9
            r21 = r3
            r22 = r2
            r23 = r65
            r24 = r66
            r25 = r10
            r26 = r1
            r27 = r7
            r28 = r13
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
            r5 = r15 & 8078(0x1f8e, float:1.132E-41)
            int r8 = r4 << 12
            r11 = 57344(0xe000, float:8.0356E-41)
            r11 = r11 & r8
            r5 = r5 | r11
            r11 = 3670016(0x380000, float:5.142788E-39)
            r11 = r11 & r8
            r5 = r5 | r11
            r11 = 29360128(0x1c00000, float:7.052966E-38)
            r11 = r11 & r8
            r5 = r5 | r11
            r11 = 234881024(0xe000000, float:1.5777218E-30)
            r8 = r8 & r11
            r5 = r5 | r8
            r86 = r5
            int r5 = r4 << 3
            r5 = r5 & 896(0x380, float:1.256E-42)
            int r4 = r4 >> 3
            r8 = 57344(0xe000, float:8.0356E-41)
            r4 = r4 & r8
            r4 = r4 | r5
            r87 = r4
            r4 = 512(0x200, float:7.175E-43)
            r88 = r4
            r4 = 0
            r79 = r4
            r70 = r69
            r72 = r9
            r73 = r35
            r74 = r32
            r76 = r31
            r77 = r67
            r78 = r14
            r82 = r6
            r84 = r30
            r85 = r0
            androidx.compose.foundation.text.BasicTextFieldKt.a(r70, r71, r72, r73, r74, r75, r76, r77, r78, r79, r80, r81, r82, r83, r84, r85, r86, r87, r88)
            boolean r3 = androidx.compose.runtime.ComposerKt.P()
            if (r3 == 0) goto L_0x053f
            androidx.compose.runtime.ComposerKt.X()
        L_0x053f:
            r12 = r6
            r17 = r7
            r3 = r9
            r8 = r10
            r18 = r13
            r15 = r14
            r19 = r29
            r16 = r30
            r13 = r31
            r11 = r32
            r5 = r34
            r4 = r35
            r6 = r65
            r7 = r66
            r14 = r67
            r9 = r1
            r10 = r2
            r2 = r33
            goto L_0x0585
        L_0x055e:
            r0.B()
            r2 = r70
            r3 = r71
            r4 = r72
            r5 = r73
            r6 = r74
            r7 = r75
            r8 = r76
            r9 = r77
            r10 = r78
            r11 = r79
            r12 = r80
            r13 = r81
            r14 = r82
            r15 = r83
            r16 = r84
            r17 = r85
            r18 = r86
            r19 = r87
        L_0x0585:
            androidx.compose.runtime.ScopeUpdateScope r1 = r0.x()
            if (r1 == 0) goto L_0x05a3
            androidx.compose.material.TextFieldKt$TextField$2 r0 = new androidx.compose.material.TextFieldKt$TextField$2
            r70 = r0
            r68 = r1
            r1 = r69
            r20 = r89
            r21 = r90
            r22 = r91
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            r1 = r70
            r0 = r68
            r0.a(r1)
        L_0x05a3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.TextFieldKt.a(androidx.compose.foundation.text.input.TextFieldState, androidx.compose.ui.Modifier, boolean, boolean, androidx.compose.ui.text.TextStyle, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, boolean, androidx.compose.foundation.text.input.InputTransformation, androidx.compose.foundation.text.input.OutputTransformation, androidx.compose.foundation.text.KeyboardOptions, androidx.compose.foundation.text.input.KeyboardActionHandler, androidx.compose.foundation.text.input.TextFieldLineLimits, androidx.compose.foundation.ScrollState, androidx.compose.ui.graphics.Shape, androidx.compose.material.TextFieldColors, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:107:0x013d  */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x0142  */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x015c  */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x0161  */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x0179  */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x017e  */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x0195  */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x01a9  */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x01af  */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x01b4  */
    /* JADX WARNING: Removed duplicated region for block: B:160:0x01cb  */
    /* JADX WARNING: Removed duplicated region for block: B:167:0x01e2  */
    /* JADX WARNING: Removed duplicated region for block: B:170:0x01ea  */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x01ef  */
    /* JADX WARNING: Removed duplicated region for block: B:180:0x0208  */
    /* JADX WARNING: Removed duplicated region for block: B:181:0x020d  */
    /* JADX WARNING: Removed duplicated region for block: B:190:0x0226  */
    /* JADX WARNING: Removed duplicated region for block: B:197:0x023c  */
    /* JADX WARNING: Removed duplicated region for block: B:200:0x0244  */
    /* JADX WARNING: Removed duplicated region for block: B:207:0x0258  */
    /* JADX WARNING: Removed duplicated region for block: B:212:0x0272  */
    /* JADX WARNING: Removed duplicated region for block: B:213:0x0275  */
    /* JADX WARNING: Removed duplicated region for block: B:216:0x027e  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:317:0x05b3  */
    /* JADX WARNING: Removed duplicated region for block: B:320:0x05e0  */
    /* JADX WARNING: Removed duplicated region for block: B:322:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00a9  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00bd  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00c7  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00cc  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x00e5  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x00ea  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0103  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0108  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x0121  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x0126  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void b(androidx.compose.ui.text.input.TextFieldValue r71, kotlin.jvm.functions.Function1 r72, androidx.compose.ui.Modifier r73, boolean r74, boolean r75, androidx.compose.ui.text.TextStyle r76, kotlin.jvm.functions.Function2 r77, kotlin.jvm.functions.Function2 r78, kotlin.jvm.functions.Function2 r79, kotlin.jvm.functions.Function2 r80, boolean r81, androidx.compose.ui.text.input.VisualTransformation r82, androidx.compose.foundation.text.KeyboardOptions r83, androidx.compose.foundation.text.KeyboardActions r84, boolean r85, int r86, int r87, androidx.compose.foundation.interaction.MutableInteractionSource r88, androidx.compose.ui.graphics.Shape r89, androidx.compose.material.TextFieldColors r90, androidx.compose.runtime.Composer r91, int r92, int r93, int r94) {
        /*
            r15 = r92
            r14 = r93
            r13 = r94
            r0 = -359119489(0xffffffffea98457f, float:-9.2042455E25)
            r1 = r91
            androidx.compose.runtime.Composer r0 = r1.q(r0)
            r1 = r13 & 1
            if (r1 == 0) goto L_0x0019
            r1 = r15 | 6
            r4 = r1
            r1 = r71
            goto L_0x002d
        L_0x0019:
            r1 = r15 & 6
            if (r1 != 0) goto L_0x002a
            r1 = r71
            boolean r4 = r0.W(r1)
            if (r4 == 0) goto L_0x0027
            r4 = 4
            goto L_0x0028
        L_0x0027:
            r4 = 2
        L_0x0028:
            r4 = r4 | r15
            goto L_0x002d
        L_0x002a:
            r1 = r71
            r4 = r15
        L_0x002d:
            r5 = r13 & 2
            if (r5 == 0) goto L_0x0036
            r4 = r4 | 48
        L_0x0033:
            r5 = r72
            goto L_0x0048
        L_0x0036:
            r5 = r15 & 48
            if (r5 != 0) goto L_0x0033
            r5 = r72
            boolean r8 = r0.l(r5)
            if (r8 == 0) goto L_0x0045
            r8 = 32
            goto L_0x0047
        L_0x0045:
            r8 = 16
        L_0x0047:
            r4 = r4 | r8
        L_0x0048:
            r8 = r13 & 4
            if (r8 == 0) goto L_0x0051
            r4 = r4 | 384(0x180, float:5.38E-43)
        L_0x004e:
            r11 = r73
            goto L_0x0063
        L_0x0051:
            r11 = r15 & 384(0x180, float:5.38E-43)
            if (r11 != 0) goto L_0x004e
            r11 = r73
            boolean r12 = r0.W(r11)
            if (r12 == 0) goto L_0x0060
            r12 = 256(0x100, float:3.59E-43)
            goto L_0x0062
        L_0x0060:
            r12 = 128(0x80, float:1.794E-43)
        L_0x0062:
            r4 = r4 | r12
        L_0x0063:
            r12 = r13 & 8
            r16 = 1024(0x400, float:1.435E-42)
            r17 = 2048(0x800, float:2.87E-42)
            if (r12 == 0) goto L_0x0070
            r4 = r4 | 3072(0xc00, float:4.305E-42)
        L_0x006d:
            r2 = r74
            goto L_0x0083
        L_0x0070:
            r2 = r15 & 3072(0xc00, float:4.305E-42)
            if (r2 != 0) goto L_0x006d
            r2 = r74
            boolean r18 = r0.d(r2)
            if (r18 == 0) goto L_0x007f
            r18 = r17
            goto L_0x0081
        L_0x007f:
            r18 = r16
        L_0x0081:
            r4 = r4 | r18
        L_0x0083:
            r18 = r13 & 16
            r19 = 16384(0x4000, float:2.2959E-41)
            r20 = 8192(0x2000, float:1.14794E-41)
            if (r18 == 0) goto L_0x0090
            r4 = r4 | 24576(0x6000, float:3.4438E-41)
        L_0x008d:
            r3 = r75
            goto L_0x00a3
        L_0x0090:
            r3 = r15 & 24576(0x6000, float:3.4438E-41)
            if (r3 != 0) goto L_0x008d
            r3 = r75
            boolean r22 = r0.d(r3)
            if (r22 == 0) goto L_0x009f
            r22 = r19
            goto L_0x00a1
        L_0x009f:
            r22 = r20
        L_0x00a1:
            r4 = r4 | r22
        L_0x00a3:
            r22 = 196608(0x30000, float:2.75506E-40)
            r22 = r15 & r22
            if (r22 != 0) goto L_0x00bd
            r22 = r13 & 32
            r6 = r76
            if (r22 != 0) goto L_0x00b8
            boolean r23 = r0.W(r6)
            if (r23 == 0) goto L_0x00b8
            r23 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00ba
        L_0x00b8:
            r23 = 65536(0x10000, float:9.18355E-41)
        L_0x00ba:
            r4 = r4 | r23
            goto L_0x00bf
        L_0x00bd:
            r6 = r76
        L_0x00bf:
            r23 = r13 & 64
            r24 = 1572864(0x180000, float:2.204052E-39)
            r25 = 524288(0x80000, float:7.34684E-40)
            if (r23 == 0) goto L_0x00cc
            r4 = r4 | r24
            r7 = r77
            goto L_0x00df
        L_0x00cc:
            r26 = r15 & r24
            r7 = r77
            if (r26 != 0) goto L_0x00df
            boolean r27 = r0.l(r7)
            if (r27 == 0) goto L_0x00db
            r27 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00dd
        L_0x00db:
            r27 = r25
        L_0x00dd:
            r4 = r4 | r27
        L_0x00df:
            r9 = r13 & 128(0x80, float:1.794E-43)
            r28 = 12582912(0xc00000, float:1.7632415E-38)
            if (r9 == 0) goto L_0x00ea
            r4 = r4 | r28
            r10 = r78
            goto L_0x00fd
        L_0x00ea:
            r29 = r15 & r28
            r10 = r78
            if (r29 != 0) goto L_0x00fd
            boolean r30 = r0.l(r10)
            if (r30 == 0) goto L_0x00f9
            r30 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00fb
        L_0x00f9:
            r30 = 4194304(0x400000, float:5.877472E-39)
        L_0x00fb:
            r4 = r4 | r30
        L_0x00fd:
            r1 = r13 & 256(0x100, float:3.59E-43)
            r30 = 100663296(0x6000000, float:2.4074124E-35)
            if (r1 == 0) goto L_0x0108
            r4 = r4 | r30
            r2 = r79
            goto L_0x011b
        L_0x0108:
            r30 = r15 & r30
            r2 = r79
            if (r30 != 0) goto L_0x011b
            boolean r30 = r0.l(r2)
            if (r30 == 0) goto L_0x0117
            r30 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x0119
        L_0x0117:
            r30 = 33554432(0x2000000, float:9.403955E-38)
        L_0x0119:
            r4 = r4 | r30
        L_0x011b:
            r2 = r13 & 512(0x200, float:7.175E-43)
            r30 = 805306368(0x30000000, float:4.656613E-10)
            if (r2 == 0) goto L_0x0126
            r4 = r4 | r30
            r3 = r80
            goto L_0x0139
        L_0x0126:
            r30 = r15 & r30
            r3 = r80
            if (r30 != 0) goto L_0x0139
            boolean r30 = r0.l(r3)
            if (r30 == 0) goto L_0x0135
            r30 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x0137
        L_0x0135:
            r30 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x0137:
            r4 = r4 | r30
        L_0x0139:
            r3 = r13 & 1024(0x400, float:1.435E-42)
            if (r3 == 0) goto L_0x0142
            r21 = r14 | 6
            r5 = r81
            goto L_0x0158
        L_0x0142:
            r30 = r14 & 6
            r5 = r81
            if (r30 != 0) goto L_0x0156
            boolean r30 = r0.d(r5)
            if (r30 == 0) goto L_0x0151
            r21 = 4
            goto L_0x0153
        L_0x0151:
            r21 = 2
        L_0x0153:
            r21 = r14 | r21
            goto L_0x0158
        L_0x0156:
            r21 = r14
        L_0x0158:
            r5 = r13 & 2048(0x800, float:2.87E-42)
            if (r5 == 0) goto L_0x0161
            r21 = r21 | 48
        L_0x015e:
            r6 = r21
            goto L_0x0175
        L_0x0161:
            r30 = r14 & 48
            r6 = r82
            if (r30 != 0) goto L_0x015e
            boolean r30 = r0.W(r6)
            if (r30 == 0) goto L_0x0170
            r26 = 32
            goto L_0x0172
        L_0x0170:
            r26 = 16
        L_0x0172:
            r21 = r21 | r26
            goto L_0x015e
        L_0x0175:
            r7 = r13 & 4096(0x1000, float:5.74E-42)
            if (r7 == 0) goto L_0x017e
            r6 = r6 | 384(0x180, float:5.38E-43)
        L_0x017b:
            r10 = r83
            goto L_0x0191
        L_0x017e:
            r10 = r14 & 384(0x180, float:5.38E-43)
            if (r10 != 0) goto L_0x017b
            r10 = r83
            boolean r21 = r0.W(r10)
            if (r21 == 0) goto L_0x018d
            r27 = 256(0x100, float:3.59E-43)
            goto L_0x018f
        L_0x018d:
            r27 = 128(0x80, float:1.794E-43)
        L_0x018f:
            r6 = r6 | r27
        L_0x0191:
            r10 = r14 & 3072(0xc00, float:4.305E-42)
            if (r10 != 0) goto L_0x01a9
            r10 = r13 & 8192(0x2000, float:1.14794E-41)
            if (r10 != 0) goto L_0x01a4
            r10 = r84
            boolean r21 = r0.W(r10)
            if (r21 == 0) goto L_0x01a6
            r16 = r17
            goto L_0x01a6
        L_0x01a4:
            r10 = r84
        L_0x01a6:
            r6 = r6 | r16
            goto L_0x01ab
        L_0x01a9:
            r10 = r84
        L_0x01ab:
            r10 = r13 & 16384(0x4000, float:2.2959E-41)
            if (r10 == 0) goto L_0x01b4
            r6 = r6 | 24576(0x6000, float:3.4438E-41)
        L_0x01b1:
            r11 = r85
            goto L_0x01c5
        L_0x01b4:
            r11 = r14 & 24576(0x6000, float:3.4438E-41)
            if (r11 != 0) goto L_0x01b1
            r11 = r85
            boolean r16 = r0.d(r11)
            if (r16 == 0) goto L_0x01c1
            goto L_0x01c3
        L_0x01c1:
            r19 = r20
        L_0x01c3:
            r6 = r6 | r19
        L_0x01c5:
            r16 = 196608(0x30000, float:2.75506E-40)
            r16 = r14 & r16
            if (r16 != 0) goto L_0x01e2
            r16 = 32768(0x8000, float:4.5918E-41)
            r16 = r13 & r16
            r11 = r86
            if (r16 != 0) goto L_0x01dd
            boolean r16 = r0.i(r11)
            if (r16 == 0) goto L_0x01dd
            r16 = 131072(0x20000, float:1.83671E-40)
            goto L_0x01df
        L_0x01dd:
            r16 = 65536(0x10000, float:9.18355E-41)
        L_0x01df:
            r6 = r6 | r16
            goto L_0x01e4
        L_0x01e2:
            r11 = r86
        L_0x01e4:
            r16 = 65536(0x10000, float:9.18355E-41)
            r16 = r13 & r16
            if (r16 == 0) goto L_0x01ef
            r6 = r6 | r24
            r11 = r87
            goto L_0x0202
        L_0x01ef:
            r17 = r14 & r24
            r11 = r87
            if (r17 != 0) goto L_0x0202
            boolean r17 = r0.i(r11)
            if (r17 == 0) goto L_0x01fe
            r17 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x0200
        L_0x01fe:
            r17 = r25
        L_0x0200:
            r6 = r6 | r17
        L_0x0202:
            r17 = 131072(0x20000, float:1.83671E-40)
            r17 = r13 & r17
            if (r17 == 0) goto L_0x020d
            r6 = r6 | r28
            r11 = r88
            goto L_0x0220
        L_0x020d:
            r19 = r14 & r28
            r11 = r88
            if (r19 != 0) goto L_0x0220
            boolean r19 = r0.W(r11)
            if (r19 == 0) goto L_0x021c
            r19 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x021e
        L_0x021c:
            r19 = 4194304(0x400000, float:5.877472E-39)
        L_0x021e:
            r6 = r6 | r19
        L_0x0220:
            r19 = 100663296(0x6000000, float:2.4074124E-35)
            r19 = r14 & r19
            if (r19 != 0) goto L_0x023c
            r19 = 262144(0x40000, float:3.67342E-40)
            r19 = r13 & r19
            r11 = r89
            if (r19 != 0) goto L_0x0237
            boolean r19 = r0.W(r11)
            if (r19 == 0) goto L_0x0237
            r19 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x0239
        L_0x0237:
            r19 = 33554432(0x2000000, float:9.403955E-38)
        L_0x0239:
            r6 = r6 | r19
            goto L_0x023e
        L_0x023c:
            r11 = r89
        L_0x023e:
            r19 = 805306368(0x30000000, float:4.656613E-10)
            r19 = r14 & r19
            if (r19 != 0) goto L_0x0258
            r19 = r13 & r25
            r11 = r90
            if (r19 != 0) goto L_0x0253
            boolean r19 = r0.W(r11)
            if (r19 == 0) goto L_0x0253
            r19 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x0255
        L_0x0253:
            r19 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x0255:
            r6 = r6 | r19
            goto L_0x025a
        L_0x0258:
            r11 = r90
        L_0x025a:
            r19 = 306783379(0x12492493, float:6.34695E-28)
            r11 = r4 & r19
            r14 = 306783378(0x12492492, float:6.3469493E-28)
            r19 = 0
            r20 = r10
            if (r11 != r14) goto L_0x0275
            r11 = 306783379(0x12492493, float:6.34695E-28)
            r11 = r11 & r6
            r14 = 306783378(0x12492492, float:6.3469493E-28)
            if (r11 == r14) goto L_0x0272
            goto L_0x0275
        L_0x0272:
            r11 = r19
            goto L_0x0276
        L_0x0275:
            r11 = 1
        L_0x0276:
            r14 = r4 & 1
            boolean r11 = r0.E(r11, r14)
            if (r11 == 0) goto L_0x05b3
            r0.p()
            r11 = r15 & 1
            r14 = -458753(0xfffffffffff8ffff, float:NaN)
            if (r11 == 0) goto L_0x02da
            boolean r11 = r0.J()
            if (r11 == 0) goto L_0x028f
            goto L_0x02da
        L_0x028f:
            r0.B()
            r1 = r13 & 32
            if (r1 == 0) goto L_0x0297
            r4 = r4 & r14
        L_0x0297:
            r1 = r13 & 8192(0x2000, float:1.14794E-41)
            if (r1 == 0) goto L_0x029d
            r6 = r6 & -7169(0xffffffffffffe3ff, float:NaN)
        L_0x029d:
            r1 = 32768(0x8000, float:4.5918E-41)
            r1 = r1 & r13
            if (r1 == 0) goto L_0x02a4
            r6 = r6 & r14
        L_0x02a4:
            r1 = 262144(0x40000, float:3.67342E-40)
            r1 = r1 & r13
            if (r1 == 0) goto L_0x02ad
            r1 = -234881025(0xfffffffff1ffffff, float:-2.535301E30)
            r6 = r6 & r1
        L_0x02ad:
            r1 = r13 & r25
            if (r1 == 0) goto L_0x02b5
            r1 = -1879048193(0xffffffff8fffffff, float:-2.5243547E-29)
            r6 = r6 & r1
        L_0x02b5:
            r8 = r73
            r11 = r74
            r12 = r75
            r10 = r76
            r64 = r77
            r9 = r78
            r1 = r79
            r2 = r80
            r3 = r81
            r5 = r82
            r7 = r83
            r14 = r84
            r65 = r85
            r66 = r87
            r67 = r88
            r13 = r90
            r15 = r4
            r4 = r89
            goto L_0x040e
        L_0x02da:
            if (r8 == 0) goto L_0x02df
            androidx.compose.ui.Modifier$Companion r8 = androidx.compose.ui.Modifier.f15489d
            goto L_0x02e1
        L_0x02df:
            r8 = r73
        L_0x02e1:
            if (r12 == 0) goto L_0x02e5
            r11 = 1
            goto L_0x02e7
        L_0x02e5:
            r11 = r74
        L_0x02e7:
            if (r18 == 0) goto L_0x02ec
            r12 = r19
            goto L_0x02ee
        L_0x02ec:
            r12 = r75
        L_0x02ee:
            r18 = r13 & 32
            if (r18 == 0) goto L_0x02fe
            androidx.compose.runtime.ProvidableCompositionLocal r10 = androidx.compose.material.TextKt.f()
            java.lang.Object r10 = r0.C(r10)
            androidx.compose.ui.text.TextStyle r10 = (androidx.compose.ui.text.TextStyle) r10
            r4 = r4 & r14
            goto L_0x0300
        L_0x02fe:
            r10 = r76
        L_0x0300:
            if (r23 == 0) goto L_0x0305
            r64 = 0
            goto L_0x0307
        L_0x0305:
            r64 = r77
        L_0x0307:
            if (r9 == 0) goto L_0x030b
            r9 = 0
            goto L_0x030d
        L_0x030b:
            r9 = r78
        L_0x030d:
            if (r1 == 0) goto L_0x0311
            r1 = 0
            goto L_0x0313
        L_0x0311:
            r1 = r79
        L_0x0313:
            if (r2 == 0) goto L_0x0317
            r2 = 0
            goto L_0x0319
        L_0x0317:
            r2 = r80
        L_0x0319:
            if (r3 == 0) goto L_0x031e
            r3 = r19
            goto L_0x0320
        L_0x031e:
            r3 = r81
        L_0x0320:
            if (r5 == 0) goto L_0x0329
            androidx.compose.ui.text.input.VisualTransformation$Companion r5 = androidx.compose.ui.text.input.VisualTransformation.f18929a
            androidx.compose.ui.text.input.VisualTransformation r5 = r5.c()
            goto L_0x032b
        L_0x0329:
            r5 = r82
        L_0x032b:
            if (r7 == 0) goto L_0x0334
            androidx.compose.foundation.text.KeyboardOptions$Companion r7 = androidx.compose.foundation.text.KeyboardOptions.f5771h
            androidx.compose.foundation.text.KeyboardOptions r7 = r7.a()
            goto L_0x0336
        L_0x0334:
            r7 = r83
        L_0x0336:
            r14 = r13 & 8192(0x2000, float:1.14794E-41)
            if (r14 == 0) goto L_0x0364
            androidx.compose.foundation.text.KeyboardActions r14 = new androidx.compose.foundation.text.KeyboardActions
            r21 = 63
            r22 = 0
            r23 = 0
            r24 = 0
            r26 = 0
            r27 = 0
            r28 = 0
            r29 = 0
            r73 = r14
            r74 = r23
            r75 = r24
            r76 = r26
            r77 = r27
            r78 = r28
            r79 = r29
            r80 = r21
            r81 = r22
            r73.<init>(r74, r75, r76, r77, r78, r79, r80, r81)
            r6 = r6 & -7169(0xffffffffffffe3ff, float:NaN)
            goto L_0x0366
        L_0x0364:
            r14 = r84
        L_0x0366:
            if (r20 == 0) goto L_0x036b
            r65 = r19
            goto L_0x036d
        L_0x036b:
            r65 = r85
        L_0x036d:
            r19 = 32768(0x8000, float:4.5918E-41)
            r19 = r13 & r19
            if (r19 == 0) goto L_0x0389
            if (r65 == 0) goto L_0x037c
            r18 = -458753(0xfffffffffff8ffff, float:NaN)
            r19 = 1
            goto L_0x0382
        L_0x037c:
            r19 = 2147483647(0x7fffffff, float:NaN)
            r18 = -458753(0xfffffffffff8ffff, float:NaN)
        L_0x0382:
            r6 = r6 & r18
            r18 = r6
            r6 = r19
            goto L_0x038d
        L_0x0389:
            r18 = r6
            r6 = r86
        L_0x038d:
            if (r16 == 0) goto L_0x0392
            r66 = 1
            goto L_0x0394
        L_0x0392:
            r66 = r87
        L_0x0394:
            if (r17 == 0) goto L_0x0399
            r67 = 0
            goto L_0x039b
        L_0x0399:
            r67 = r88
        L_0x039b:
            r16 = 262144(0x40000, float:3.67342E-40)
            r16 = r13 & r16
            r73 = r1
            if (r16 == 0) goto L_0x03b2
            androidx.compose.material.TextFieldDefaults r1 = androidx.compose.material.TextFieldDefaults.f8730a
            r74 = r2
            r2 = 6
            androidx.compose.ui.graphics.Shape r1 = r1.i(r0, r2)
            r2 = -234881025(0xfffffffff1ffffff, float:-2.535301E30)
            r2 = r18 & r2
            goto L_0x03b8
        L_0x03b2:
            r74 = r2
            r1 = r89
            r2 = r18
        L_0x03b8:
            r16 = r13 & r25
            if (r16 == 0) goto L_0x0408
            androidx.compose.material.TextFieldDefaults r16 = androidx.compose.material.TextFieldDefaults.f8730a
            r62 = 48
            r63 = 2097151(0x1fffff, float:2.938734E-39)
            r17 = 0
            r19 = 0
            r21 = 0
            r23 = 0
            r25 = 0
            r27 = 0
            r29 = 0
            r31 = 0
            r33 = 0
            r35 = 0
            r37 = 0
            r39 = 0
            r41 = 0
            r43 = 0
            r45 = 0
            r47 = 0
            r49 = 0
            r51 = 0
            r53 = 0
            r55 = 0
            r57 = 0
            r60 = 0
            r61 = 0
            r59 = r0
            androidx.compose.material.TextFieldColors r16 = r16.o(r17, r19, r21, r23, r25, r27, r29, r31, r33, r35, r37, r39, r41, r43, r45, r47, r49, r51, r53, r55, r57, r59, r60, r61, r62, r63)
            r17 = -1879048193(0xffffffff8fffffff, float:-2.5243547E-29)
            r2 = r2 & r17
            r15 = r4
            r86 = r6
            r13 = r16
        L_0x0401:
            r4 = r1
            r6 = r2
            r1 = r73
            r2 = r74
            goto L_0x040e
        L_0x0408:
            r13 = r90
            r15 = r4
            r86 = r6
            goto L_0x0401
        L_0x040e:
            r0.U()
            boolean r16 = androidx.compose.runtime.ComposerKt.P()
            if (r16 == 0) goto L_0x0424
            r87 = r14
            r14 = -359119489(0xffffffffea98457f, float:-9.2042455E25)
            r88 = r7
            java.lang.String r7 = "androidx.compose.material.TextField (TextField.kt:535)"
            androidx.compose.runtime.ComposerKt.Y(r14, r15, r6, r7)
            goto L_0x0428
        L_0x0424:
            r88 = r7
            r87 = r14
        L_0x0428:
            if (r67 != 0) goto L_0x044b
            r7 = -1656495724(0xffffffff9d43e194, float:-2.5924656E-21)
            r0.X(r7)
            java.lang.Object r7 = r0.g()
            androidx.compose.runtime.Composer$Companion r14 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r14 = r14.a()
            if (r7 != r14) goto L_0x0443
            androidx.compose.foundation.interaction.MutableInteractionSource r7 = androidx.compose.foundation.interaction.InteractionSourceKt.a()
            r0.N(r7)
        L_0x0443:
            androidx.compose.foundation.interaction.MutableInteractionSource r7 = (androidx.compose.foundation.interaction.MutableInteractionSource) r7
            r0.M()
            r29 = r7
            goto L_0x0456
        L_0x044b:
            r7 = -53435997(0xfffffffffcd0a1a3, float:-8.666209E36)
            r0.X(r7)
            r0.M()
            r29 = r67
        L_0x0456:
            r7 = -53430251(0xfffffffffcd0b815, float:-8.669851E36)
            r0.X(r7)
            long r16 = r10.h()
            r18 = 16
            int r7 = (r16 > r18 ? 1 : (r16 == r18 ? 0 : -1))
            if (r7 == 0) goto L_0x0469
        L_0x0466:
            r31 = r16
            goto L_0x0481
        L_0x0469:
            int r7 = r15 >> 9
            r7 = r7 & 14
            int r14 = r6 >> 24
            r14 = r14 & 112(0x70, float:1.57E-43)
            r7 = r7 | r14
            androidx.compose.runtime.State r7 = r13.c(r11, r0, r7)
            java.lang.Object r7 = r7.getValue()
            androidx.compose.ui.graphics.Color r7 = (androidx.compose.ui.graphics.Color) r7
            long r16 = r7.v()
            goto L_0x0466
        L_0x0481:
            r0.M()
            androidx.compose.ui.text.TextStyle r7 = new androidx.compose.ui.text.TextStyle
            r30 = r7
            r60 = 16777214(0xfffffe, float:2.3509884E-38)
            r61 = 0
            r33 = 0
            r35 = 0
            r36 = 0
            r37 = 0
            r38 = 0
            r39 = 0
            r40 = 0
            r42 = 0
            r43 = 0
            r44 = 0
            r45 = 0
            r47 = 0
            r48 = 0
            r49 = 0
            r50 = 0
            r51 = 0
            r52 = 0
            r54 = 0
            r55 = 0
            r56 = 0
            r57 = 0
            r58 = 0
            r59 = 0
            r30.<init>(r31, r33, r35, r36, r37, r38, r39, r40, r42, r43, r44, r45, r47, r48, r49, r50, r51, r52, r54, r55, r56, r57, r58, r59, r60, r61)
            androidx.compose.ui.text.TextStyle r21 = r10.J(r7)
            androidx.compose.material.TextFieldDefaults r7 = androidx.compose.material.TextFieldDefaults.f8730a
            r14 = 48
            r16 = 0
            r17 = 0
            r18 = 0
            r75 = r7
            r76 = r8
            r77 = r11
            r78 = r3
            r79 = r29
            r80 = r13
            r81 = r17
            r82 = r18
            r83 = r14
            r84 = r16
            androidx.compose.ui.Modifier r14 = androidx.compose.material.TextFieldDefaults.k(r75, r76, r77, r78, r79, r80, r81, r82, r83, r84)
            androidx.compose.material.Strings$Companion r16 = androidx.compose.material.Strings.f8507b
            r89 = r8
            int r8 = r16.c()
            r90 = r10
            r10 = 6
            java.lang.String r8 = androidx.compose.material.Strings_androidKt.a(r8, r0, r10)
            androidx.compose.ui.Modifier r8 = androidx.compose.material.TextFieldImplKt.c(r14, r3, r8)
            float r10 = r7.g()
            float r7 = r7.f()
            androidx.compose.ui.Modifier r18 = androidx.compose.foundation.layout.SizeKt.a(r8, r10, r7)
            androidx.compose.ui.graphics.SolidColor r7 = new androidx.compose.ui.graphics.SolidColor
            r30 = r7
            r8 = r6 & 14
            int r10 = r6 >> 24
            r10 = r10 & 112(0x70, float:1.57E-43)
            r8 = r8 | r10
            androidx.compose.runtime.State r8 = r13.f(r3, r0, r8)
            java.lang.Object r8 = r8.getValue()
            androidx.compose.ui.graphics.Color r8 = (androidx.compose.ui.graphics.Color) r8
            r10 = r15
            long r14 = r8.v()
            r8 = 0
            r7.<init>(r14, r8)
            androidx.compose.material.TextFieldKt$TextField$7 r7 = new androidx.compose.material.TextFieldKt$TextField$7
            r73 = r7
            r74 = r71
            r75 = r11
            r76 = r65
            r77 = r5
            r78 = r29
            r79 = r3
            r80 = r64
            r81 = r9
            r82 = r1
            r83 = r2
            r84 = r4
            r85 = r13
            r73.<init>(r74, r75, r76, r77, r78, r79, r80, r81, r82, r83, r84, r85)
            r8 = 54
            r14 = -126640971(0xfffffffff8739cb5, float:-1.9764165E34)
            r15 = 1
            androidx.compose.runtime.internal.ComposableLambda r31 = androidx.compose.runtime.internal.ComposableLambdaKt.e(r14, r15, r7, r0, r8)
            r7 = 64638(0xfc7e, float:9.0577E-41)
            r7 = r7 & r10
            int r8 = r6 << 12
            r10 = 3670016(0x380000, float:5.142788E-39)
            r10 = r10 & r8
            r7 = r7 | r10
            r10 = 29360128(0x1c00000, float:7.052966E-38)
            r10 = r10 & r8
            r7 = r7 | r10
            r10 = 234881024(0xe000000, float:1.5777218E-30)
            r10 = r10 & r8
            r7 = r7 | r10
            r10 = 1879048192(0x70000000, float:1.58456325E29)
            r8 = r8 & r10
            r33 = r7 | r8
            int r7 = r6 >> 18
            r7 = r7 & 14
            r8 = 196608(0x30000, float:2.75506E-40)
            r7 = r7 | r8
            r6 = r6 & 112(0x70, float:1.57E-43)
            r34 = r7 | r6
            r35 = 4096(0x1000, float:5.74E-42)
            r28 = 0
            r16 = r71
            r17 = r72
            r19 = r11
            r20 = r12
            r22 = r88
            r23 = r87
            r24 = r65
            r25 = r86
            r26 = r66
            r27 = r5
            r32 = r0
            androidx.compose.foundation.text.BasicTextFieldKt.c(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35)
            boolean r6 = androidx.compose.runtime.ComposerKt.P()
            if (r6 == 0) goto L_0x0592
            androidx.compose.runtime.ComposerKt.X()
        L_0x0592:
            r16 = r86
            r14 = r87
            r6 = r90
            r10 = r2
            r19 = r4
            r8 = r9
            r4 = r11
            r20 = r13
            r7 = r64
            r15 = r65
            r17 = r66
            r18 = r67
            r13 = r88
            r9 = r1
            r11 = r3
            r3 = r89
            r70 = r12
            r12 = r5
            r5 = r70
            goto L_0x05da
        L_0x05b3:
            r0.B()
            r3 = r73
            r4 = r74
            r5 = r75
            r6 = r76
            r7 = r77
            r8 = r78
            r9 = r79
            r10 = r80
            r11 = r81
            r12 = r82
            r13 = r83
            r14 = r84
            r15 = r85
            r16 = r86
            r17 = r87
            r18 = r88
            r19 = r89
            r20 = r90
        L_0x05da:
            androidx.compose.runtime.ScopeUpdateScope r2 = r0.x()
            if (r2 == 0) goto L_0x05fb
            androidx.compose.material.TextFieldKt$TextField$8 r1 = new androidx.compose.material.TextFieldKt$TextField$8
            r0 = r1
            r68 = r1
            r1 = r71
            r69 = r2
            r2 = r72
            r21 = r92
            r22 = r93
            r23 = r94
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            r1 = r68
            r0 = r69
            r0.a(r1)
        L_0x05fb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.TextFieldKt.b(androidx.compose.ui.text.input.TextFieldValue, kotlin.jvm.functions.Function1, androidx.compose.ui.Modifier, boolean, boolean, androidx.compose.ui.text.TextStyle, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, boolean, androidx.compose.ui.text.input.VisualTransformation, androidx.compose.foundation.text.KeyboardOptions, androidx.compose.foundation.text.KeyboardActions, boolean, int, int, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.ui.graphics.Shape, androidx.compose.material.TextFieldColors, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:107:0x013f  */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x0144  */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x015e  */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x0163  */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x017b  */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x0180  */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x0197  */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x01ab  */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x01b1  */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x01b6  */
    /* JADX WARNING: Removed duplicated region for block: B:160:0x01ce  */
    /* JADX WARNING: Removed duplicated region for block: B:161:0x01d3  */
    /* JADX WARNING: Removed duplicated region for block: B:170:0x01ea  */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x01ef  */
    /* JADX WARNING: Removed duplicated region for block: B:180:0x0208  */
    /* JADX WARNING: Removed duplicated region for block: B:187:0x021c  */
    /* JADX WARNING: Removed duplicated region for block: B:190:0x0224  */
    /* JADX WARNING: Removed duplicated region for block: B:197:0x023a  */
    /* JADX WARNING: Removed duplicated region for block: B:202:0x0254  */
    /* JADX WARNING: Removed duplicated region for block: B:203:0x0257  */
    /* JADX WARNING: Removed duplicated region for block: B:206:0x0261  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:292:0x048c  */
    /* JADX WARNING: Removed duplicated region for block: B:295:0x04b9  */
    /* JADX WARNING: Removed duplicated region for block: B:297:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00ad  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00c1  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00c9  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00ce  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x00e7  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x00ec  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0105  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x010a  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x0123  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x0128  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final /* synthetic */ void c(androidx.compose.ui.text.input.TextFieldValue r70, kotlin.jvm.functions.Function1 r71, androidx.compose.ui.Modifier r72, boolean r73, boolean r74, androidx.compose.ui.text.TextStyle r75, kotlin.jvm.functions.Function2 r76, kotlin.jvm.functions.Function2 r77, kotlin.jvm.functions.Function2 r78, kotlin.jvm.functions.Function2 r79, boolean r80, androidx.compose.ui.text.input.VisualTransformation r81, androidx.compose.foundation.text.KeyboardOptions r82, androidx.compose.foundation.text.KeyboardActions r83, boolean r84, int r85, androidx.compose.foundation.interaction.MutableInteractionSource r86, androidx.compose.ui.graphics.Shape r87, androidx.compose.material.TextFieldColors r88, androidx.compose.runtime.Composer r89, int r90, int r91, int r92) {
        /*
            r15 = r90
            r14 = r91
            r13 = r92
            r0 = -1576622884(0xffffffffa206a4dc, float:-1.8247662E-18)
            r1 = r89
            androidx.compose.runtime.Composer r0 = r1.q(r0)
            r1 = r13 & 1
            if (r1 == 0) goto L_0x0019
            r1 = r15 | 6
            r4 = r1
            r1 = r70
            goto L_0x002d
        L_0x0019:
            r1 = r15 & 6
            if (r1 != 0) goto L_0x002a
            r1 = r70
            boolean r4 = r0.W(r1)
            if (r4 == 0) goto L_0x0027
            r4 = 4
            goto L_0x0028
        L_0x0027:
            r4 = 2
        L_0x0028:
            r4 = r4 | r15
            goto L_0x002d
        L_0x002a:
            r1 = r70
            r4 = r15
        L_0x002d:
            r5 = r13 & 2
            if (r5 == 0) goto L_0x0036
            r4 = r4 | 48
        L_0x0033:
            r5 = r71
            goto L_0x0048
        L_0x0036:
            r5 = r15 & 48
            if (r5 != 0) goto L_0x0033
            r5 = r71
            boolean r8 = r0.l(r5)
            if (r8 == 0) goto L_0x0045
            r8 = 32
            goto L_0x0047
        L_0x0045:
            r8 = 16
        L_0x0047:
            r4 = r4 | r8
        L_0x0048:
            r8 = r13 & 4
            if (r8 == 0) goto L_0x0051
            r4 = r4 | 384(0x180, float:5.38E-43)
        L_0x004e:
            r11 = r72
            goto L_0x0063
        L_0x0051:
            r11 = r15 & 384(0x180, float:5.38E-43)
            if (r11 != 0) goto L_0x004e
            r11 = r72
            boolean r12 = r0.W(r11)
            if (r12 == 0) goto L_0x0060
            r12 = 256(0x100, float:3.59E-43)
            goto L_0x0062
        L_0x0060:
            r12 = 128(0x80, float:1.794E-43)
        L_0x0062:
            r4 = r4 | r12
        L_0x0063:
            r12 = r13 & 8
            r16 = 1024(0x400, float:1.435E-42)
            r17 = 2048(0x800, float:2.87E-42)
            if (r12 == 0) goto L_0x0070
            r4 = r4 | 3072(0xc00, float:4.305E-42)
        L_0x006d:
            r2 = r73
            goto L_0x0083
        L_0x0070:
            r2 = r15 & 3072(0xc00, float:4.305E-42)
            if (r2 != 0) goto L_0x006d
            r2 = r73
            boolean r18 = r0.d(r2)
            if (r18 == 0) goto L_0x007f
            r18 = r17
            goto L_0x0081
        L_0x007f:
            r18 = r16
        L_0x0081:
            r4 = r4 | r18
        L_0x0083:
            r18 = r13 & 16
            r19 = 16384(0x4000, float:2.2959E-41)
            r20 = 8192(0x2000, float:1.14794E-41)
            if (r18 == 0) goto L_0x0090
            r4 = r4 | 24576(0x6000, float:3.4438E-41)
        L_0x008d:
            r3 = r74
            goto L_0x00a3
        L_0x0090:
            r3 = r15 & 24576(0x6000, float:3.4438E-41)
            if (r3 != 0) goto L_0x008d
            r3 = r74
            boolean r22 = r0.d(r3)
            if (r22 == 0) goto L_0x009f
            r22 = r19
            goto L_0x00a1
        L_0x009f:
            r22 = r20
        L_0x00a1:
            r4 = r4 | r22
        L_0x00a3:
            r22 = 196608(0x30000, float:2.75506E-40)
            r23 = r15 & r22
            r24 = 65536(0x10000, float:9.18355E-41)
            r25 = 131072(0x20000, float:1.83671E-40)
            if (r23 != 0) goto L_0x00c1
            r23 = r13 & 32
            r6 = r75
            if (r23 != 0) goto L_0x00bc
            boolean r26 = r0.W(r6)
            if (r26 == 0) goto L_0x00bc
            r26 = r25
            goto L_0x00be
        L_0x00bc:
            r26 = r24
        L_0x00be:
            r4 = r4 | r26
            goto L_0x00c3
        L_0x00c1:
            r6 = r75
        L_0x00c3:
            r26 = r13 & 64
            r64 = 1572864(0x180000, float:2.204052E-39)
            if (r26 == 0) goto L_0x00ce
            r4 = r4 | r64
            r7 = r76
            goto L_0x00e1
        L_0x00ce:
            r27 = r15 & r64
            r7 = r76
            if (r27 != 0) goto L_0x00e1
            boolean r28 = r0.l(r7)
            if (r28 == 0) goto L_0x00dd
            r28 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00df
        L_0x00dd:
            r28 = 524288(0x80000, float:7.34684E-40)
        L_0x00df:
            r4 = r4 | r28
        L_0x00e1:
            r9 = r13 & 128(0x80, float:1.794E-43)
            r29 = 12582912(0xc00000, float:1.7632415E-38)
            if (r9 == 0) goto L_0x00ec
            r4 = r4 | r29
            r10 = r77
            goto L_0x00ff
        L_0x00ec:
            r29 = r15 & r29
            r10 = r77
            if (r29 != 0) goto L_0x00ff
            boolean r30 = r0.l(r10)
            if (r30 == 0) goto L_0x00fb
            r30 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00fd
        L_0x00fb:
            r30 = 4194304(0x400000, float:5.877472E-39)
        L_0x00fd:
            r4 = r4 | r30
        L_0x00ff:
            r1 = r13 & 256(0x100, float:3.59E-43)
            r30 = 100663296(0x6000000, float:2.4074124E-35)
            if (r1 == 0) goto L_0x010a
            r4 = r4 | r30
            r2 = r78
            goto L_0x011d
        L_0x010a:
            r30 = r15 & r30
            r2 = r78
            if (r30 != 0) goto L_0x011d
            boolean r30 = r0.l(r2)
            if (r30 == 0) goto L_0x0119
            r30 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x011b
        L_0x0119:
            r30 = 33554432(0x2000000, float:9.403955E-38)
        L_0x011b:
            r4 = r4 | r30
        L_0x011d:
            r2 = r13 & 512(0x200, float:7.175E-43)
            r30 = 805306368(0x30000000, float:4.656613E-10)
            if (r2 == 0) goto L_0x0128
            r4 = r4 | r30
            r3 = r79
            goto L_0x013b
        L_0x0128:
            r30 = r15 & r30
            r3 = r79
            if (r30 != 0) goto L_0x013b
            boolean r30 = r0.l(r3)
            if (r30 == 0) goto L_0x0137
            r30 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x0139
        L_0x0137:
            r30 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x0139:
            r4 = r4 | r30
        L_0x013b:
            r3 = r13 & 1024(0x400, float:1.435E-42)
            if (r3 == 0) goto L_0x0144
            r21 = r14 | 6
            r5 = r80
            goto L_0x015a
        L_0x0144:
            r30 = r14 & 6
            r5 = r80
            if (r30 != 0) goto L_0x0158
            boolean r30 = r0.d(r5)
            if (r30 == 0) goto L_0x0153
            r21 = 4
            goto L_0x0155
        L_0x0153:
            r21 = 2
        L_0x0155:
            r21 = r14 | r21
            goto L_0x015a
        L_0x0158:
            r21 = r14
        L_0x015a:
            r5 = r13 & 2048(0x800, float:2.87E-42)
            if (r5 == 0) goto L_0x0163
            r21 = r21 | 48
        L_0x0160:
            r6 = r21
            goto L_0x0177
        L_0x0163:
            r30 = r14 & 48
            r6 = r81
            if (r30 != 0) goto L_0x0160
            boolean r30 = r0.W(r6)
            if (r30 == 0) goto L_0x0172
            r27 = 32
            goto L_0x0174
        L_0x0172:
            r27 = 16
        L_0x0174:
            r21 = r21 | r27
            goto L_0x0160
        L_0x0177:
            r7 = r13 & 4096(0x1000, float:5.74E-42)
            if (r7 == 0) goto L_0x0180
            r6 = r6 | 384(0x180, float:5.38E-43)
        L_0x017d:
            r10 = r82
            goto L_0x0193
        L_0x0180:
            r10 = r14 & 384(0x180, float:5.38E-43)
            if (r10 != 0) goto L_0x017d
            r10 = r82
            boolean r21 = r0.W(r10)
            if (r21 == 0) goto L_0x018f
            r28 = 256(0x100, float:3.59E-43)
            goto L_0x0191
        L_0x018f:
            r28 = 128(0x80, float:1.794E-43)
        L_0x0191:
            r6 = r6 | r28
        L_0x0193:
            r10 = r14 & 3072(0xc00, float:4.305E-42)
            if (r10 != 0) goto L_0x01ab
            r10 = r13 & 8192(0x2000, float:1.14794E-41)
            if (r10 != 0) goto L_0x01a6
            r10 = r83
            boolean r21 = r0.W(r10)
            if (r21 == 0) goto L_0x01a8
            r16 = r17
            goto L_0x01a8
        L_0x01a6:
            r10 = r83
        L_0x01a8:
            r6 = r6 | r16
            goto L_0x01ad
        L_0x01ab:
            r10 = r83
        L_0x01ad:
            r10 = r13 & 16384(0x4000, float:2.2959E-41)
            if (r10 == 0) goto L_0x01b6
            r6 = r6 | 24576(0x6000, float:3.4438E-41)
        L_0x01b3:
            r11 = r84
            goto L_0x01c7
        L_0x01b6:
            r11 = r14 & 24576(0x6000, float:3.4438E-41)
            if (r11 != 0) goto L_0x01b3
            r11 = r84
            boolean r16 = r0.d(r11)
            if (r16 == 0) goto L_0x01c3
            goto L_0x01c5
        L_0x01c3:
            r19 = r20
        L_0x01c5:
            r6 = r6 | r19
        L_0x01c7:
            r16 = 32768(0x8000, float:4.5918E-41)
            r16 = r13 & r16
            if (r16 == 0) goto L_0x01d3
            r6 = r6 | r22
            r11 = r85
            goto L_0x01e6
        L_0x01d3:
            r17 = r14 & r22
            r11 = r85
            if (r17 != 0) goto L_0x01e6
            boolean r17 = r0.i(r11)
            if (r17 == 0) goto L_0x01e2
            r17 = r25
            goto L_0x01e4
        L_0x01e2:
            r17 = r24
        L_0x01e4:
            r6 = r6 | r17
        L_0x01e6:
            r17 = r13 & r24
            if (r17 == 0) goto L_0x01ef
            r6 = r6 | r64
            r11 = r86
            goto L_0x0202
        L_0x01ef:
            r19 = r14 & r64
            r11 = r86
            if (r19 != 0) goto L_0x0202
            boolean r19 = r0.W(r11)
            if (r19 == 0) goto L_0x01fe
            r19 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x0200
        L_0x01fe:
            r19 = 524288(0x80000, float:7.34684E-40)
        L_0x0200:
            r6 = r6 | r19
        L_0x0202:
            r19 = 12582912(0xc00000, float:1.7632415E-38)
            r19 = r14 & r19
            if (r19 != 0) goto L_0x021c
            r19 = r13 & r25
            r11 = r87
            if (r19 != 0) goto L_0x0217
            boolean r19 = r0.W(r11)
            if (r19 == 0) goto L_0x0217
            r19 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x0219
        L_0x0217:
            r19 = 4194304(0x400000, float:5.877472E-39)
        L_0x0219:
            r6 = r6 | r19
            goto L_0x021e
        L_0x021c:
            r11 = r87
        L_0x021e:
            r19 = 100663296(0x6000000, float:2.4074124E-35)
            r19 = r14 & r19
            if (r19 != 0) goto L_0x023a
            r19 = 262144(0x40000, float:3.67342E-40)
            r19 = r13 & r19
            r11 = r88
            if (r19 != 0) goto L_0x0235
            boolean r19 = r0.W(r11)
            if (r19 == 0) goto L_0x0235
            r19 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x0237
        L_0x0235:
            r19 = 33554432(0x2000000, float:9.403955E-38)
        L_0x0237:
            r6 = r6 | r19
            goto L_0x023c
        L_0x023a:
            r11 = r88
        L_0x023c:
            r19 = 306783379(0x12492493, float:6.34695E-28)
            r11 = r4 & r19
            r14 = 306783378(0x12492492, float:6.3469493E-28)
            r19 = 0
            r20 = 1
            if (r11 != r14) goto L_0x0257
            r11 = 38347923(0x2492493, float:1.4777644E-37)
            r11 = r11 & r6
            r14 = 38347922(0x2492492, float:1.4777643E-37)
            if (r11 == r14) goto L_0x0254
            goto L_0x0257
        L_0x0254:
            r11 = r19
            goto L_0x0259
        L_0x0257:
            r11 = r20
        L_0x0259:
            r14 = r4 & 1
            boolean r11 = r0.E(r11, r14)
            if (r11 == 0) goto L_0x048c
            r0.p()
            r11 = r15 & 1
            if (r11 == 0) goto L_0x02b7
            boolean r11 = r0.J()
            if (r11 == 0) goto L_0x026f
            goto L_0x02b7
        L_0x026f:
            r0.B()
            r1 = r13 & 32
            if (r1 == 0) goto L_0x027a
            r1 = -458753(0xfffffffffff8ffff, float:NaN)
            r4 = r4 & r1
        L_0x027a:
            r1 = r13 & 8192(0x2000, float:1.14794E-41)
            if (r1 == 0) goto L_0x0280
            r6 = r6 & -7169(0xffffffffffffe3ff, float:NaN)
        L_0x0280:
            r1 = r13 & r25
            if (r1 == 0) goto L_0x0288
            r1 = -29360129(0xfffffffffe3fffff, float:-6.380294E37)
            r6 = r6 & r1
        L_0x0288:
            r1 = 262144(0x40000, float:3.67342E-40)
            r1 = r1 & r13
            if (r1 == 0) goto L_0x0291
            r1 = -234881025(0xfffffffff1ffffff, float:-2.535301E30)
            r6 = r6 & r1
        L_0x0291:
            r8 = r72
            r11 = r73
            r12 = r74
            r14 = r75
            r65 = r76
            r9 = r77
            r1 = r78
            r2 = r79
            r3 = r80
            r5 = r81
            r7 = r82
            r10 = r84
            r66 = r85
            r40 = r87
            r41 = r88
            r13 = r4
            r15 = r6
            r4 = r83
            r6 = r86
            goto L_0x03f8
        L_0x02b7:
            if (r8 == 0) goto L_0x02bc
            androidx.compose.ui.Modifier$Companion r8 = androidx.compose.ui.Modifier.f15489d
            goto L_0x02be
        L_0x02bc:
            r8 = r72
        L_0x02be:
            if (r12 == 0) goto L_0x02c3
            r11 = r20
            goto L_0x02c5
        L_0x02c3:
            r11 = r73
        L_0x02c5:
            if (r18 == 0) goto L_0x02ca
            r12 = r19
            goto L_0x02cc
        L_0x02ca:
            r12 = r74
        L_0x02cc:
            r14 = r13 & 32
            if (r14 == 0) goto L_0x02e0
            androidx.compose.runtime.ProvidableCompositionLocal r14 = androidx.compose.material.TextKt.f()
            java.lang.Object r14 = r0.C(r14)
            androidx.compose.ui.text.TextStyle r14 = (androidx.compose.ui.text.TextStyle) r14
            r18 = -458753(0xfffffffffff8ffff, float:NaN)
            r4 = r4 & r18
            goto L_0x02e2
        L_0x02e0:
            r14 = r75
        L_0x02e2:
            r18 = 0
            if (r26 == 0) goto L_0x02e9
            r65 = r18
            goto L_0x02eb
        L_0x02e9:
            r65 = r76
        L_0x02eb:
            if (r9 == 0) goto L_0x02f0
            r9 = r18
            goto L_0x02f2
        L_0x02f0:
            r9 = r77
        L_0x02f2:
            if (r1 == 0) goto L_0x02f7
            r1 = r18
            goto L_0x02f9
        L_0x02f7:
            r1 = r78
        L_0x02f9:
            if (r2 == 0) goto L_0x02fe
            r2 = r18
            goto L_0x0300
        L_0x02fe:
            r2 = r79
        L_0x0300:
            if (r3 == 0) goto L_0x0305
            r3 = r19
            goto L_0x0307
        L_0x0305:
            r3 = r80
        L_0x0307:
            if (r5 == 0) goto L_0x0310
            androidx.compose.ui.text.input.VisualTransformation$Companion r5 = androidx.compose.ui.text.input.VisualTransformation.f18929a
            androidx.compose.ui.text.input.VisualTransformation r5 = r5.c()
            goto L_0x0312
        L_0x0310:
            r5 = r81
        L_0x0312:
            if (r7 == 0) goto L_0x031b
            androidx.compose.foundation.text.KeyboardOptions$Companion r7 = androidx.compose.foundation.text.KeyboardOptions.f5771h
            androidx.compose.foundation.text.KeyboardOptions r7 = r7.a()
            goto L_0x031d
        L_0x031b:
            r7 = r82
        L_0x031d:
            r72 = r1
            r1 = r13 & 8192(0x2000, float:1.14794E-41)
            if (r1 == 0) goto L_0x034d
            androidx.compose.foundation.text.KeyboardActions r1 = new androidx.compose.foundation.text.KeyboardActions
            r18 = 63
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r26 = 0
            r27 = 0
            r73 = r1
            r74 = r21
            r75 = r22
            r76 = r23
            r77 = r24
            r78 = r26
            r79 = r27
            r80 = r18
            r81 = r20
            r73.<init>(r74, r75, r76, r77, r78, r79, r80, r81)
            r6 = r6 & -7169(0xffffffffffffe3ff, float:NaN)
            goto L_0x034f
        L_0x034d:
            r1 = r83
        L_0x034f:
            if (r10 == 0) goto L_0x0354
            r10 = r19
            goto L_0x0356
        L_0x0354:
            r10 = r84
        L_0x0356:
            if (r16 == 0) goto L_0x035e
            r16 = 2147483647(0x7fffffff, float:NaN)
            r66 = r16
            goto L_0x0360
        L_0x035e:
            r66 = r85
        L_0x0360:
            r73 = r1
            if (r17 == 0) goto L_0x037c
            java.lang.Object r1 = r0.g()
            androidx.compose.runtime.Composer$Companion r16 = androidx.compose.runtime.Composer.f14567a
            r74 = r2
            java.lang.Object r2 = r16.a()
            if (r1 != r2) goto L_0x0379
            androidx.compose.foundation.interaction.MutableInteractionSource r1 = androidx.compose.foundation.interaction.InteractionSourceKt.a()
            r0.N(r1)
        L_0x0379:
            androidx.compose.foundation.interaction.MutableInteractionSource r1 = (androidx.compose.foundation.interaction.MutableInteractionSource) r1
            goto L_0x0380
        L_0x037c:
            r74 = r2
            r1 = r86
        L_0x0380:
            r2 = r13 & r25
            if (r2 == 0) goto L_0x0393
            androidx.compose.material.TextFieldDefaults r2 = androidx.compose.material.TextFieldDefaults.f8730a
            r75 = r1
            r1 = 6
            androidx.compose.ui.graphics.Shape r1 = r2.i(r0, r1)
            r2 = -29360129(0xfffffffffe3fffff, float:-6.380294E37)
            r2 = r2 & r6
            r6 = r2
            goto L_0x0397
        L_0x0393:
            r75 = r1
            r1 = r87
        L_0x0397:
            r2 = 262144(0x40000, float:3.67342E-40)
            r2 = r2 & r13
            if (r2 == 0) goto L_0x03eb
            androidx.compose.material.TextFieldDefaults r16 = androidx.compose.material.TextFieldDefaults.f8730a
            r62 = 48
            r63 = 2097151(0x1fffff, float:2.938734E-39)
            r17 = 0
            r19 = 0
            r21 = 0
            r23 = 0
            r25 = 0
            r27 = 0
            r29 = 0
            r31 = 0
            r33 = 0
            r35 = 0
            r37 = 0
            r39 = 0
            r41 = 0
            r43 = 0
            r45 = 0
            r47 = 0
            r49 = 0
            r51 = 0
            r53 = 0
            r55 = 0
            r57 = 0
            r60 = 0
            r61 = 0
            r59 = r0
            androidx.compose.material.TextFieldColors r2 = r16.o(r17, r19, r21, r23, r25, r27, r29, r31, r33, r35, r37, r39, r41, r43, r45, r47, r49, r51, r53, r55, r57, r59, r60, r61, r62, r63)
            r16 = -234881025(0xfffffffff1ffffff, float:-2.535301E30)
            r6 = r6 & r16
            r40 = r1
            r41 = r2
            r13 = r4
            r15 = r6
            r1 = r72
            r4 = r73
            r2 = r74
        L_0x03e8:
            r6 = r75
            goto L_0x03f8
        L_0x03eb:
            r2 = r74
            r41 = r88
            r40 = r1
            r13 = r4
            r15 = r6
            r1 = r72
            r4 = r73
            goto L_0x03e8
        L_0x03f8:
            r0.U()
            boolean r16 = androidx.compose.runtime.ComposerKt.P()
            r89 = r0
            if (r16 == 0) goto L_0x040e
            r0 = -1576622884(0xffffffffa206a4dc, float:-1.8247662E-18)
            r72 = r6
            java.lang.String r6 = "androidx.compose.material.TextField (TextField.kt:612)"
            androidx.compose.runtime.ComposerKt.Y(r0, r13, r15, r6)
            goto L_0x0410
        L_0x040e:
            r72 = r6
        L_0x0410:
            r0 = 2147483646(0x7ffffffe, float:NaN)
            r37 = r13 & r0
            r0 = r15 & 14
            r0 = r0 | r64
            r6 = r15 & 112(0x70, float:1.57E-43)
            r0 = r0 | r6
            r6 = r15 & 896(0x380, float:1.256E-42)
            r0 = r0 | r6
            r6 = r15 & 7168(0x1c00, float:1.0045E-41)
            r0 = r0 | r6
            r6 = 57344(0xe000, float:8.0356E-41)
            r6 = r6 & r15
            r0 = r0 | r6
            r6 = 458752(0x70000, float:6.42848E-40)
            r6 = r6 & r15
            r0 = r0 | r6
            int r6 = r15 << 3
            r13 = 29360128(0x1c00000, float:7.052966E-38)
            r13 = r13 & r6
            r0 = r0 | r13
            r13 = 234881024(0xe000000, float:1.5777218E-30)
            r13 = r13 & r6
            r0 = r0 | r13
            r13 = 1879048192(0x70000000, float:1.58456325E29)
            r6 = r6 & r13
            r38 = r0 | r6
            r39 = 0
            r32 = 1
            r16 = r70
            r17 = r71
            r18 = r8
            r19 = r11
            r20 = r12
            r21 = r14
            r22 = r65
            r23 = r9
            r24 = r1
            r25 = r2
            r26 = r3
            r27 = r5
            r28 = r7
            r29 = r4
            r30 = r10
            r31 = r66
            r33 = r72
            r34 = r40
            r35 = r41
            r36 = r89
            b(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39)
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x0472
            androidx.compose.runtime.ComposerKt.X()
        L_0x0472:
            r17 = r72
            r13 = r7
            r15 = r10
            r6 = r14
            r18 = r40
            r19 = r41
            r7 = r65
            r16 = r66
            r10 = r2
            r14 = r4
            r4 = r11
            r11 = r3
            r3 = r8
            r8 = r9
            r9 = r1
            r69 = r12
            r12 = r5
            r5 = r69
            goto L_0x04b3
        L_0x048c:
            r89 = r0
            r89.B()
            r3 = r72
            r4 = r73
            r5 = r74
            r6 = r75
            r7 = r76
            r8 = r77
            r9 = r78
            r10 = r79
            r11 = r80
            r12 = r81
            r13 = r82
            r14 = r83
            r15 = r84
            r16 = r85
            r17 = r86
            r18 = r87
            r19 = r88
        L_0x04b3:
            androidx.compose.runtime.ScopeUpdateScope r2 = r89.x()
            if (r2 == 0) goto L_0x04d4
            androidx.compose.material.TextFieldKt$TextField$10 r1 = new androidx.compose.material.TextFieldKt$TextField$10
            r0 = r1
            r67 = r1
            r1 = r70
            r68 = r2
            r2 = r71
            r20 = r90
            r21 = r91
            r22 = r92
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            r1 = r67
            r0 = r68
            r0.a(r1)
        L_0x04d4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.TextFieldKt.c(androidx.compose.ui.text.input.TextFieldValue, kotlin.jvm.functions.Function1, androidx.compose.ui.Modifier, boolean, boolean, androidx.compose.ui.text.TextStyle, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, boolean, androidx.compose.ui.text.input.VisualTransformation, androidx.compose.foundation.text.KeyboardOptions, androidx.compose.foundation.text.KeyboardActions, boolean, int, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.ui.graphics.Shape, androidx.compose.material.TextFieldColors, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:107:0x013d  */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x0142  */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x015c  */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x0161  */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x0179  */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x017e  */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x0195  */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x01a9  */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x01af  */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x01b4  */
    /* JADX WARNING: Removed duplicated region for block: B:160:0x01cb  */
    /* JADX WARNING: Removed duplicated region for block: B:167:0x01e2  */
    /* JADX WARNING: Removed duplicated region for block: B:170:0x01ea  */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x01ef  */
    /* JADX WARNING: Removed duplicated region for block: B:180:0x0208  */
    /* JADX WARNING: Removed duplicated region for block: B:181:0x020d  */
    /* JADX WARNING: Removed duplicated region for block: B:190:0x0226  */
    /* JADX WARNING: Removed duplicated region for block: B:197:0x023c  */
    /* JADX WARNING: Removed duplicated region for block: B:200:0x0244  */
    /* JADX WARNING: Removed duplicated region for block: B:207:0x0258  */
    /* JADX WARNING: Removed duplicated region for block: B:212:0x0272  */
    /* JADX WARNING: Removed duplicated region for block: B:213:0x0275  */
    /* JADX WARNING: Removed duplicated region for block: B:216:0x027e  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:317:0x05b3  */
    /* JADX WARNING: Removed duplicated region for block: B:320:0x05e0  */
    /* JADX WARNING: Removed duplicated region for block: B:322:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00a9  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00bd  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00c7  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00cc  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x00e5  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x00ea  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0103  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0108  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x0121  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x0126  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void d(java.lang.String r71, kotlin.jvm.functions.Function1 r72, androidx.compose.ui.Modifier r73, boolean r74, boolean r75, androidx.compose.ui.text.TextStyle r76, kotlin.jvm.functions.Function2 r77, kotlin.jvm.functions.Function2 r78, kotlin.jvm.functions.Function2 r79, kotlin.jvm.functions.Function2 r80, boolean r81, androidx.compose.ui.text.input.VisualTransformation r82, androidx.compose.foundation.text.KeyboardOptions r83, androidx.compose.foundation.text.KeyboardActions r84, boolean r85, int r86, int r87, androidx.compose.foundation.interaction.MutableInteractionSource r88, androidx.compose.ui.graphics.Shape r89, androidx.compose.material.TextFieldColors r90, androidx.compose.runtime.Composer r91, int r92, int r93, int r94) {
        /*
            r15 = r92
            r14 = r93
            r13 = r94
            r0 = -1504264404(0xffffffffa656bf2c, float:-7.450525E-16)
            r1 = r91
            androidx.compose.runtime.Composer r0 = r1.q(r0)
            r1 = r13 & 1
            if (r1 == 0) goto L_0x0019
            r1 = r15 | 6
            r4 = r1
            r1 = r71
            goto L_0x002d
        L_0x0019:
            r1 = r15 & 6
            if (r1 != 0) goto L_0x002a
            r1 = r71
            boolean r4 = r0.W(r1)
            if (r4 == 0) goto L_0x0027
            r4 = 4
            goto L_0x0028
        L_0x0027:
            r4 = 2
        L_0x0028:
            r4 = r4 | r15
            goto L_0x002d
        L_0x002a:
            r1 = r71
            r4 = r15
        L_0x002d:
            r5 = r13 & 2
            if (r5 == 0) goto L_0x0036
            r4 = r4 | 48
        L_0x0033:
            r5 = r72
            goto L_0x0048
        L_0x0036:
            r5 = r15 & 48
            if (r5 != 0) goto L_0x0033
            r5 = r72
            boolean r8 = r0.l(r5)
            if (r8 == 0) goto L_0x0045
            r8 = 32
            goto L_0x0047
        L_0x0045:
            r8 = 16
        L_0x0047:
            r4 = r4 | r8
        L_0x0048:
            r8 = r13 & 4
            if (r8 == 0) goto L_0x0051
            r4 = r4 | 384(0x180, float:5.38E-43)
        L_0x004e:
            r11 = r73
            goto L_0x0063
        L_0x0051:
            r11 = r15 & 384(0x180, float:5.38E-43)
            if (r11 != 0) goto L_0x004e
            r11 = r73
            boolean r12 = r0.W(r11)
            if (r12 == 0) goto L_0x0060
            r12 = 256(0x100, float:3.59E-43)
            goto L_0x0062
        L_0x0060:
            r12 = 128(0x80, float:1.794E-43)
        L_0x0062:
            r4 = r4 | r12
        L_0x0063:
            r12 = r13 & 8
            r16 = 1024(0x400, float:1.435E-42)
            r17 = 2048(0x800, float:2.87E-42)
            if (r12 == 0) goto L_0x0070
            r4 = r4 | 3072(0xc00, float:4.305E-42)
        L_0x006d:
            r2 = r74
            goto L_0x0083
        L_0x0070:
            r2 = r15 & 3072(0xc00, float:4.305E-42)
            if (r2 != 0) goto L_0x006d
            r2 = r74
            boolean r18 = r0.d(r2)
            if (r18 == 0) goto L_0x007f
            r18 = r17
            goto L_0x0081
        L_0x007f:
            r18 = r16
        L_0x0081:
            r4 = r4 | r18
        L_0x0083:
            r18 = r13 & 16
            r19 = 16384(0x4000, float:2.2959E-41)
            r20 = 8192(0x2000, float:1.14794E-41)
            if (r18 == 0) goto L_0x0090
            r4 = r4 | 24576(0x6000, float:3.4438E-41)
        L_0x008d:
            r3 = r75
            goto L_0x00a3
        L_0x0090:
            r3 = r15 & 24576(0x6000, float:3.4438E-41)
            if (r3 != 0) goto L_0x008d
            r3 = r75
            boolean r22 = r0.d(r3)
            if (r22 == 0) goto L_0x009f
            r22 = r19
            goto L_0x00a1
        L_0x009f:
            r22 = r20
        L_0x00a1:
            r4 = r4 | r22
        L_0x00a3:
            r22 = 196608(0x30000, float:2.75506E-40)
            r22 = r15 & r22
            if (r22 != 0) goto L_0x00bd
            r22 = r13 & 32
            r6 = r76
            if (r22 != 0) goto L_0x00b8
            boolean r23 = r0.W(r6)
            if (r23 == 0) goto L_0x00b8
            r23 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00ba
        L_0x00b8:
            r23 = 65536(0x10000, float:9.18355E-41)
        L_0x00ba:
            r4 = r4 | r23
            goto L_0x00bf
        L_0x00bd:
            r6 = r76
        L_0x00bf:
            r23 = r13 & 64
            r24 = 1572864(0x180000, float:2.204052E-39)
            r25 = 524288(0x80000, float:7.34684E-40)
            if (r23 == 0) goto L_0x00cc
            r4 = r4 | r24
            r7 = r77
            goto L_0x00df
        L_0x00cc:
            r26 = r15 & r24
            r7 = r77
            if (r26 != 0) goto L_0x00df
            boolean r27 = r0.l(r7)
            if (r27 == 0) goto L_0x00db
            r27 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00dd
        L_0x00db:
            r27 = r25
        L_0x00dd:
            r4 = r4 | r27
        L_0x00df:
            r9 = r13 & 128(0x80, float:1.794E-43)
            r28 = 12582912(0xc00000, float:1.7632415E-38)
            if (r9 == 0) goto L_0x00ea
            r4 = r4 | r28
            r10 = r78
            goto L_0x00fd
        L_0x00ea:
            r29 = r15 & r28
            r10 = r78
            if (r29 != 0) goto L_0x00fd
            boolean r30 = r0.l(r10)
            if (r30 == 0) goto L_0x00f9
            r30 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00fb
        L_0x00f9:
            r30 = 4194304(0x400000, float:5.877472E-39)
        L_0x00fb:
            r4 = r4 | r30
        L_0x00fd:
            r1 = r13 & 256(0x100, float:3.59E-43)
            r30 = 100663296(0x6000000, float:2.4074124E-35)
            if (r1 == 0) goto L_0x0108
            r4 = r4 | r30
            r2 = r79
            goto L_0x011b
        L_0x0108:
            r30 = r15 & r30
            r2 = r79
            if (r30 != 0) goto L_0x011b
            boolean r30 = r0.l(r2)
            if (r30 == 0) goto L_0x0117
            r30 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x0119
        L_0x0117:
            r30 = 33554432(0x2000000, float:9.403955E-38)
        L_0x0119:
            r4 = r4 | r30
        L_0x011b:
            r2 = r13 & 512(0x200, float:7.175E-43)
            r30 = 805306368(0x30000000, float:4.656613E-10)
            if (r2 == 0) goto L_0x0126
            r4 = r4 | r30
            r3 = r80
            goto L_0x0139
        L_0x0126:
            r30 = r15 & r30
            r3 = r80
            if (r30 != 0) goto L_0x0139
            boolean r30 = r0.l(r3)
            if (r30 == 0) goto L_0x0135
            r30 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x0137
        L_0x0135:
            r30 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x0137:
            r4 = r4 | r30
        L_0x0139:
            r3 = r13 & 1024(0x400, float:1.435E-42)
            if (r3 == 0) goto L_0x0142
            r21 = r14 | 6
            r5 = r81
            goto L_0x0158
        L_0x0142:
            r30 = r14 & 6
            r5 = r81
            if (r30 != 0) goto L_0x0156
            boolean r30 = r0.d(r5)
            if (r30 == 0) goto L_0x0151
            r21 = 4
            goto L_0x0153
        L_0x0151:
            r21 = 2
        L_0x0153:
            r21 = r14 | r21
            goto L_0x0158
        L_0x0156:
            r21 = r14
        L_0x0158:
            r5 = r13 & 2048(0x800, float:2.87E-42)
            if (r5 == 0) goto L_0x0161
            r21 = r21 | 48
        L_0x015e:
            r6 = r21
            goto L_0x0175
        L_0x0161:
            r30 = r14 & 48
            r6 = r82
            if (r30 != 0) goto L_0x015e
            boolean r30 = r0.W(r6)
            if (r30 == 0) goto L_0x0170
            r26 = 32
            goto L_0x0172
        L_0x0170:
            r26 = 16
        L_0x0172:
            r21 = r21 | r26
            goto L_0x015e
        L_0x0175:
            r7 = r13 & 4096(0x1000, float:5.74E-42)
            if (r7 == 0) goto L_0x017e
            r6 = r6 | 384(0x180, float:5.38E-43)
        L_0x017b:
            r10 = r83
            goto L_0x0191
        L_0x017e:
            r10 = r14 & 384(0x180, float:5.38E-43)
            if (r10 != 0) goto L_0x017b
            r10 = r83
            boolean r21 = r0.W(r10)
            if (r21 == 0) goto L_0x018d
            r27 = 256(0x100, float:3.59E-43)
            goto L_0x018f
        L_0x018d:
            r27 = 128(0x80, float:1.794E-43)
        L_0x018f:
            r6 = r6 | r27
        L_0x0191:
            r10 = r14 & 3072(0xc00, float:4.305E-42)
            if (r10 != 0) goto L_0x01a9
            r10 = r13 & 8192(0x2000, float:1.14794E-41)
            if (r10 != 0) goto L_0x01a4
            r10 = r84
            boolean r21 = r0.W(r10)
            if (r21 == 0) goto L_0x01a6
            r16 = r17
            goto L_0x01a6
        L_0x01a4:
            r10 = r84
        L_0x01a6:
            r6 = r6 | r16
            goto L_0x01ab
        L_0x01a9:
            r10 = r84
        L_0x01ab:
            r10 = r13 & 16384(0x4000, float:2.2959E-41)
            if (r10 == 0) goto L_0x01b4
            r6 = r6 | 24576(0x6000, float:3.4438E-41)
        L_0x01b1:
            r11 = r85
            goto L_0x01c5
        L_0x01b4:
            r11 = r14 & 24576(0x6000, float:3.4438E-41)
            if (r11 != 0) goto L_0x01b1
            r11 = r85
            boolean r16 = r0.d(r11)
            if (r16 == 0) goto L_0x01c1
            goto L_0x01c3
        L_0x01c1:
            r19 = r20
        L_0x01c3:
            r6 = r6 | r19
        L_0x01c5:
            r16 = 196608(0x30000, float:2.75506E-40)
            r16 = r14 & r16
            if (r16 != 0) goto L_0x01e2
            r16 = 32768(0x8000, float:4.5918E-41)
            r16 = r13 & r16
            r11 = r86
            if (r16 != 0) goto L_0x01dd
            boolean r16 = r0.i(r11)
            if (r16 == 0) goto L_0x01dd
            r16 = 131072(0x20000, float:1.83671E-40)
            goto L_0x01df
        L_0x01dd:
            r16 = 65536(0x10000, float:9.18355E-41)
        L_0x01df:
            r6 = r6 | r16
            goto L_0x01e4
        L_0x01e2:
            r11 = r86
        L_0x01e4:
            r16 = 65536(0x10000, float:9.18355E-41)
            r16 = r13 & r16
            if (r16 == 0) goto L_0x01ef
            r6 = r6 | r24
            r11 = r87
            goto L_0x0202
        L_0x01ef:
            r17 = r14 & r24
            r11 = r87
            if (r17 != 0) goto L_0x0202
            boolean r17 = r0.i(r11)
            if (r17 == 0) goto L_0x01fe
            r17 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x0200
        L_0x01fe:
            r17 = r25
        L_0x0200:
            r6 = r6 | r17
        L_0x0202:
            r17 = 131072(0x20000, float:1.83671E-40)
            r17 = r13 & r17
            if (r17 == 0) goto L_0x020d
            r6 = r6 | r28
            r11 = r88
            goto L_0x0220
        L_0x020d:
            r19 = r14 & r28
            r11 = r88
            if (r19 != 0) goto L_0x0220
            boolean r19 = r0.W(r11)
            if (r19 == 0) goto L_0x021c
            r19 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x021e
        L_0x021c:
            r19 = 4194304(0x400000, float:5.877472E-39)
        L_0x021e:
            r6 = r6 | r19
        L_0x0220:
            r19 = 100663296(0x6000000, float:2.4074124E-35)
            r19 = r14 & r19
            if (r19 != 0) goto L_0x023c
            r19 = 262144(0x40000, float:3.67342E-40)
            r19 = r13 & r19
            r11 = r89
            if (r19 != 0) goto L_0x0237
            boolean r19 = r0.W(r11)
            if (r19 == 0) goto L_0x0237
            r19 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x0239
        L_0x0237:
            r19 = 33554432(0x2000000, float:9.403955E-38)
        L_0x0239:
            r6 = r6 | r19
            goto L_0x023e
        L_0x023c:
            r11 = r89
        L_0x023e:
            r19 = 805306368(0x30000000, float:4.656613E-10)
            r19 = r14 & r19
            if (r19 != 0) goto L_0x0258
            r19 = r13 & r25
            r11 = r90
            if (r19 != 0) goto L_0x0253
            boolean r19 = r0.W(r11)
            if (r19 == 0) goto L_0x0253
            r19 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x0255
        L_0x0253:
            r19 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x0255:
            r6 = r6 | r19
            goto L_0x025a
        L_0x0258:
            r11 = r90
        L_0x025a:
            r19 = 306783379(0x12492493, float:6.34695E-28)
            r11 = r4 & r19
            r14 = 306783378(0x12492492, float:6.3469493E-28)
            r19 = 0
            r20 = r10
            if (r11 != r14) goto L_0x0275
            r11 = 306783379(0x12492493, float:6.34695E-28)
            r11 = r11 & r6
            r14 = 306783378(0x12492492, float:6.3469493E-28)
            if (r11 == r14) goto L_0x0272
            goto L_0x0275
        L_0x0272:
            r11 = r19
            goto L_0x0276
        L_0x0275:
            r11 = 1
        L_0x0276:
            r14 = r4 & 1
            boolean r11 = r0.E(r11, r14)
            if (r11 == 0) goto L_0x05b3
            r0.p()
            r11 = r15 & 1
            r14 = -458753(0xfffffffffff8ffff, float:NaN)
            if (r11 == 0) goto L_0x02da
            boolean r11 = r0.J()
            if (r11 == 0) goto L_0x028f
            goto L_0x02da
        L_0x028f:
            r0.B()
            r1 = r13 & 32
            if (r1 == 0) goto L_0x0297
            r4 = r4 & r14
        L_0x0297:
            r1 = r13 & 8192(0x2000, float:1.14794E-41)
            if (r1 == 0) goto L_0x029d
            r6 = r6 & -7169(0xffffffffffffe3ff, float:NaN)
        L_0x029d:
            r1 = 32768(0x8000, float:4.5918E-41)
            r1 = r1 & r13
            if (r1 == 0) goto L_0x02a4
            r6 = r6 & r14
        L_0x02a4:
            r1 = 262144(0x40000, float:3.67342E-40)
            r1 = r1 & r13
            if (r1 == 0) goto L_0x02ad
            r1 = -234881025(0xfffffffff1ffffff, float:-2.535301E30)
            r6 = r6 & r1
        L_0x02ad:
            r1 = r13 & r25
            if (r1 == 0) goto L_0x02b5
            r1 = -1879048193(0xffffffff8fffffff, float:-2.5243547E-29)
            r6 = r6 & r1
        L_0x02b5:
            r8 = r73
            r11 = r74
            r12 = r75
            r10 = r76
            r64 = r77
            r9 = r78
            r1 = r79
            r2 = r80
            r3 = r81
            r5 = r82
            r7 = r83
            r14 = r84
            r65 = r85
            r66 = r87
            r67 = r88
            r13 = r90
            r15 = r4
            r4 = r89
            goto L_0x040e
        L_0x02da:
            if (r8 == 0) goto L_0x02df
            androidx.compose.ui.Modifier$Companion r8 = androidx.compose.ui.Modifier.f15489d
            goto L_0x02e1
        L_0x02df:
            r8 = r73
        L_0x02e1:
            if (r12 == 0) goto L_0x02e5
            r11 = 1
            goto L_0x02e7
        L_0x02e5:
            r11 = r74
        L_0x02e7:
            if (r18 == 0) goto L_0x02ec
            r12 = r19
            goto L_0x02ee
        L_0x02ec:
            r12 = r75
        L_0x02ee:
            r18 = r13 & 32
            if (r18 == 0) goto L_0x02fe
            androidx.compose.runtime.ProvidableCompositionLocal r10 = androidx.compose.material.TextKt.f()
            java.lang.Object r10 = r0.C(r10)
            androidx.compose.ui.text.TextStyle r10 = (androidx.compose.ui.text.TextStyle) r10
            r4 = r4 & r14
            goto L_0x0300
        L_0x02fe:
            r10 = r76
        L_0x0300:
            if (r23 == 0) goto L_0x0305
            r64 = 0
            goto L_0x0307
        L_0x0305:
            r64 = r77
        L_0x0307:
            if (r9 == 0) goto L_0x030b
            r9 = 0
            goto L_0x030d
        L_0x030b:
            r9 = r78
        L_0x030d:
            if (r1 == 0) goto L_0x0311
            r1 = 0
            goto L_0x0313
        L_0x0311:
            r1 = r79
        L_0x0313:
            if (r2 == 0) goto L_0x0317
            r2 = 0
            goto L_0x0319
        L_0x0317:
            r2 = r80
        L_0x0319:
            if (r3 == 0) goto L_0x031e
            r3 = r19
            goto L_0x0320
        L_0x031e:
            r3 = r81
        L_0x0320:
            if (r5 == 0) goto L_0x0329
            androidx.compose.ui.text.input.VisualTransformation$Companion r5 = androidx.compose.ui.text.input.VisualTransformation.f18929a
            androidx.compose.ui.text.input.VisualTransformation r5 = r5.c()
            goto L_0x032b
        L_0x0329:
            r5 = r82
        L_0x032b:
            if (r7 == 0) goto L_0x0334
            androidx.compose.foundation.text.KeyboardOptions$Companion r7 = androidx.compose.foundation.text.KeyboardOptions.f5771h
            androidx.compose.foundation.text.KeyboardOptions r7 = r7.a()
            goto L_0x0336
        L_0x0334:
            r7 = r83
        L_0x0336:
            r14 = r13 & 8192(0x2000, float:1.14794E-41)
            if (r14 == 0) goto L_0x0364
            androidx.compose.foundation.text.KeyboardActions r14 = new androidx.compose.foundation.text.KeyboardActions
            r21 = 63
            r22 = 0
            r23 = 0
            r24 = 0
            r26 = 0
            r27 = 0
            r28 = 0
            r29 = 0
            r73 = r14
            r74 = r23
            r75 = r24
            r76 = r26
            r77 = r27
            r78 = r28
            r79 = r29
            r80 = r21
            r81 = r22
            r73.<init>(r74, r75, r76, r77, r78, r79, r80, r81)
            r6 = r6 & -7169(0xffffffffffffe3ff, float:NaN)
            goto L_0x0366
        L_0x0364:
            r14 = r84
        L_0x0366:
            if (r20 == 0) goto L_0x036b
            r65 = r19
            goto L_0x036d
        L_0x036b:
            r65 = r85
        L_0x036d:
            r19 = 32768(0x8000, float:4.5918E-41)
            r19 = r13 & r19
            if (r19 == 0) goto L_0x0389
            if (r65 == 0) goto L_0x037c
            r18 = -458753(0xfffffffffff8ffff, float:NaN)
            r19 = 1
            goto L_0x0382
        L_0x037c:
            r19 = 2147483647(0x7fffffff, float:NaN)
            r18 = -458753(0xfffffffffff8ffff, float:NaN)
        L_0x0382:
            r6 = r6 & r18
            r18 = r6
            r6 = r19
            goto L_0x038d
        L_0x0389:
            r18 = r6
            r6 = r86
        L_0x038d:
            if (r16 == 0) goto L_0x0392
            r66 = 1
            goto L_0x0394
        L_0x0392:
            r66 = r87
        L_0x0394:
            if (r17 == 0) goto L_0x0399
            r67 = 0
            goto L_0x039b
        L_0x0399:
            r67 = r88
        L_0x039b:
            r16 = 262144(0x40000, float:3.67342E-40)
            r16 = r13 & r16
            r73 = r1
            if (r16 == 0) goto L_0x03b2
            androidx.compose.material.TextFieldDefaults r1 = androidx.compose.material.TextFieldDefaults.f8730a
            r74 = r2
            r2 = 6
            androidx.compose.ui.graphics.Shape r1 = r1.i(r0, r2)
            r2 = -234881025(0xfffffffff1ffffff, float:-2.535301E30)
            r2 = r18 & r2
            goto L_0x03b8
        L_0x03b2:
            r74 = r2
            r1 = r89
            r2 = r18
        L_0x03b8:
            r16 = r13 & r25
            if (r16 == 0) goto L_0x0408
            androidx.compose.material.TextFieldDefaults r16 = androidx.compose.material.TextFieldDefaults.f8730a
            r62 = 48
            r63 = 2097151(0x1fffff, float:2.938734E-39)
            r17 = 0
            r19 = 0
            r21 = 0
            r23 = 0
            r25 = 0
            r27 = 0
            r29 = 0
            r31 = 0
            r33 = 0
            r35 = 0
            r37 = 0
            r39 = 0
            r41 = 0
            r43 = 0
            r45 = 0
            r47 = 0
            r49 = 0
            r51 = 0
            r53 = 0
            r55 = 0
            r57 = 0
            r60 = 0
            r61 = 0
            r59 = r0
            androidx.compose.material.TextFieldColors r16 = r16.o(r17, r19, r21, r23, r25, r27, r29, r31, r33, r35, r37, r39, r41, r43, r45, r47, r49, r51, r53, r55, r57, r59, r60, r61, r62, r63)
            r17 = -1879048193(0xffffffff8fffffff, float:-2.5243547E-29)
            r2 = r2 & r17
            r15 = r4
            r86 = r6
            r13 = r16
        L_0x0401:
            r4 = r1
            r6 = r2
            r1 = r73
            r2 = r74
            goto L_0x040e
        L_0x0408:
            r13 = r90
            r15 = r4
            r86 = r6
            goto L_0x0401
        L_0x040e:
            r0.U()
            boolean r16 = androidx.compose.runtime.ComposerKt.P()
            if (r16 == 0) goto L_0x0424
            r87 = r14
            r14 = -1504264404(0xffffffffa656bf2c, float:-7.450525E-16)
            r88 = r7
            java.lang.String r7 = "androidx.compose.material.TextField (TextField.kt:344)"
            androidx.compose.runtime.ComposerKt.Y(r14, r15, r6, r7)
            goto L_0x0428
        L_0x0424:
            r88 = r7
            r87 = r14
        L_0x0428:
            if (r67 != 0) goto L_0x044b
            r7 = -1665803660(0xffffffff9cb5da74, float:-1.2034044E-21)
            r0.X(r7)
            java.lang.Object r7 = r0.g()
            androidx.compose.runtime.Composer$Companion r14 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r14 = r14.a()
            if (r7 != r14) goto L_0x0443
            androidx.compose.foundation.interaction.MutableInteractionSource r7 = androidx.compose.foundation.interaction.InteractionSourceKt.a()
            r0.N(r7)
        L_0x0443:
            androidx.compose.foundation.interaction.MutableInteractionSource r7 = (androidx.compose.foundation.interaction.MutableInteractionSource) r7
            r0.M()
            r29 = r7
            goto L_0x0456
        L_0x044b:
            r7 = -53736253(0xfffffffffccc0cc3, float:-8.475899E36)
            r0.X(r7)
            r0.M()
            r29 = r67
        L_0x0456:
            r7 = -53730507(0xfffffffffccc2335, float:-8.479541E36)
            r0.X(r7)
            long r16 = r10.h()
            r18 = 16
            int r7 = (r16 > r18 ? 1 : (r16 == r18 ? 0 : -1))
            if (r7 == 0) goto L_0x0469
        L_0x0466:
            r31 = r16
            goto L_0x0481
        L_0x0469:
            int r7 = r15 >> 9
            r7 = r7 & 14
            int r14 = r6 >> 24
            r14 = r14 & 112(0x70, float:1.57E-43)
            r7 = r7 | r14
            androidx.compose.runtime.State r7 = r13.c(r11, r0, r7)
            java.lang.Object r7 = r7.getValue()
            androidx.compose.ui.graphics.Color r7 = (androidx.compose.ui.graphics.Color) r7
            long r16 = r7.v()
            goto L_0x0466
        L_0x0481:
            r0.M()
            androidx.compose.ui.text.TextStyle r7 = new androidx.compose.ui.text.TextStyle
            r30 = r7
            r60 = 16777214(0xfffffe, float:2.3509884E-38)
            r61 = 0
            r33 = 0
            r35 = 0
            r36 = 0
            r37 = 0
            r38 = 0
            r39 = 0
            r40 = 0
            r42 = 0
            r43 = 0
            r44 = 0
            r45 = 0
            r47 = 0
            r48 = 0
            r49 = 0
            r50 = 0
            r51 = 0
            r52 = 0
            r54 = 0
            r55 = 0
            r56 = 0
            r57 = 0
            r58 = 0
            r59 = 0
            r30.<init>(r31, r33, r35, r36, r37, r38, r39, r40, r42, r43, r44, r45, r47, r48, r49, r50, r51, r52, r54, r55, r56, r57, r58, r59, r60, r61)
            androidx.compose.ui.text.TextStyle r21 = r10.J(r7)
            androidx.compose.material.TextFieldDefaults r7 = androidx.compose.material.TextFieldDefaults.f8730a
            r14 = 48
            r16 = 0
            r17 = 0
            r18 = 0
            r75 = r7
            r76 = r8
            r77 = r11
            r78 = r3
            r79 = r29
            r80 = r13
            r81 = r17
            r82 = r18
            r83 = r14
            r84 = r16
            androidx.compose.ui.Modifier r14 = androidx.compose.material.TextFieldDefaults.k(r75, r76, r77, r78, r79, r80, r81, r82, r83, r84)
            androidx.compose.material.Strings$Companion r16 = androidx.compose.material.Strings.f8507b
            r89 = r8
            int r8 = r16.c()
            r90 = r10
            r10 = 6
            java.lang.String r8 = androidx.compose.material.Strings_androidKt.a(r8, r0, r10)
            androidx.compose.ui.Modifier r8 = androidx.compose.material.TextFieldImplKt.c(r14, r3, r8)
            float r10 = r7.g()
            float r7 = r7.f()
            androidx.compose.ui.Modifier r18 = androidx.compose.foundation.layout.SizeKt.a(r8, r10, r7)
            androidx.compose.ui.graphics.SolidColor r7 = new androidx.compose.ui.graphics.SolidColor
            r30 = r7
            r8 = r6 & 14
            int r10 = r6 >> 24
            r10 = r10 & 112(0x70, float:1.57E-43)
            r8 = r8 | r10
            androidx.compose.runtime.State r8 = r13.f(r3, r0, r8)
            java.lang.Object r8 = r8.getValue()
            androidx.compose.ui.graphics.Color r8 = (androidx.compose.ui.graphics.Color) r8
            r10 = r15
            long r14 = r8.v()
            r8 = 0
            r7.<init>(r14, r8)
            androidx.compose.material.TextFieldKt$TextField$3 r7 = new androidx.compose.material.TextFieldKt$TextField$3
            r73 = r7
            r74 = r71
            r75 = r11
            r76 = r65
            r77 = r5
            r78 = r29
            r79 = r3
            r80 = r64
            r81 = r9
            r82 = r1
            r83 = r2
            r84 = r4
            r85 = r13
            r73.<init>(r74, r75, r76, r77, r78, r79, r80, r81, r82, r83, r84, r85)
            r8 = 54
            r14 = 989834338(0x3affac62, float:0.001950633)
            r15 = 1
            androidx.compose.runtime.internal.ComposableLambda r31 = androidx.compose.runtime.internal.ComposableLambdaKt.e(r14, r15, r7, r0, r8)
            r7 = 64638(0xfc7e, float:9.0577E-41)
            r7 = r7 & r10
            int r8 = r6 << 12
            r10 = 3670016(0x380000, float:5.142788E-39)
            r10 = r10 & r8
            r7 = r7 | r10
            r10 = 29360128(0x1c00000, float:7.052966E-38)
            r10 = r10 & r8
            r7 = r7 | r10
            r10 = 234881024(0xe000000, float:1.5777218E-30)
            r10 = r10 & r8
            r7 = r7 | r10
            r10 = 1879048192(0x70000000, float:1.58456325E29)
            r8 = r8 & r10
            r33 = r7 | r8
            int r7 = r6 >> 18
            r7 = r7 & 14
            r8 = 196608(0x30000, float:2.75506E-40)
            r7 = r7 | r8
            r6 = r6 & 112(0x70, float:1.57E-43)
            r34 = r7 | r6
            r35 = 4096(0x1000, float:5.74E-42)
            r28 = 0
            r16 = r71
            r17 = r72
            r19 = r11
            r20 = r12
            r22 = r88
            r23 = r87
            r24 = r65
            r25 = r86
            r26 = r66
            r27 = r5
            r32 = r0
            androidx.compose.foundation.text.BasicTextFieldKt.e(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35)
            boolean r6 = androidx.compose.runtime.ComposerKt.P()
            if (r6 == 0) goto L_0x0592
            androidx.compose.runtime.ComposerKt.X()
        L_0x0592:
            r16 = r86
            r14 = r87
            r6 = r90
            r10 = r2
            r19 = r4
            r8 = r9
            r4 = r11
            r20 = r13
            r7 = r64
            r15 = r65
            r17 = r66
            r18 = r67
            r13 = r88
            r9 = r1
            r11 = r3
            r3 = r89
            r70 = r12
            r12 = r5
            r5 = r70
            goto L_0x05da
        L_0x05b3:
            r0.B()
            r3 = r73
            r4 = r74
            r5 = r75
            r6 = r76
            r7 = r77
            r8 = r78
            r9 = r79
            r10 = r80
            r11 = r81
            r12 = r82
            r13 = r83
            r14 = r84
            r15 = r85
            r16 = r86
            r17 = r87
            r18 = r88
            r19 = r89
            r20 = r90
        L_0x05da:
            androidx.compose.runtime.ScopeUpdateScope r2 = r0.x()
            if (r2 == 0) goto L_0x05fb
            androidx.compose.material.TextFieldKt$TextField$4 r1 = new androidx.compose.material.TextFieldKt$TextField$4
            r0 = r1
            r68 = r1
            r1 = r71
            r69 = r2
            r2 = r72
            r21 = r92
            r22 = r93
            r23 = r94
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            r1 = r68
            r0 = r69
            r0.a(r1)
        L_0x05fb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.TextFieldKt.d(java.lang.String, kotlin.jvm.functions.Function1, androidx.compose.ui.Modifier, boolean, boolean, androidx.compose.ui.text.TextStyle, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, boolean, androidx.compose.ui.text.input.VisualTransformation, androidx.compose.foundation.text.KeyboardOptions, androidx.compose.foundation.text.KeyboardActions, boolean, int, int, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.ui.graphics.Shape, androidx.compose.material.TextFieldColors, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:107:0x013f  */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x0144  */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x015e  */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x0163  */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x017b  */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x0180  */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x0197  */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x01ab  */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x01b1  */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x01b6  */
    /* JADX WARNING: Removed duplicated region for block: B:160:0x01ce  */
    /* JADX WARNING: Removed duplicated region for block: B:161:0x01d3  */
    /* JADX WARNING: Removed duplicated region for block: B:170:0x01ea  */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x01ef  */
    /* JADX WARNING: Removed duplicated region for block: B:180:0x0208  */
    /* JADX WARNING: Removed duplicated region for block: B:187:0x021c  */
    /* JADX WARNING: Removed duplicated region for block: B:190:0x0224  */
    /* JADX WARNING: Removed duplicated region for block: B:197:0x023a  */
    /* JADX WARNING: Removed duplicated region for block: B:202:0x0254  */
    /* JADX WARNING: Removed duplicated region for block: B:203:0x0257  */
    /* JADX WARNING: Removed duplicated region for block: B:206:0x0261  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:292:0x04b2  */
    /* JADX WARNING: Removed duplicated region for block: B:295:0x04df  */
    /* JADX WARNING: Removed duplicated region for block: B:297:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00ad  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00c1  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00c9  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00ce  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x00e7  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x00ec  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0105  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x010a  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x0123  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x0128  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final /* synthetic */ void e(java.lang.String r70, kotlin.jvm.functions.Function1 r71, androidx.compose.ui.Modifier r72, boolean r73, boolean r74, androidx.compose.ui.text.TextStyle r75, kotlin.jvm.functions.Function2 r76, kotlin.jvm.functions.Function2 r77, kotlin.jvm.functions.Function2 r78, kotlin.jvm.functions.Function2 r79, boolean r80, androidx.compose.ui.text.input.VisualTransformation r81, androidx.compose.foundation.text.KeyboardOptions r82, androidx.compose.foundation.text.KeyboardActions r83, boolean r84, int r85, androidx.compose.foundation.interaction.MutableInteractionSource r86, androidx.compose.ui.graphics.Shape r87, androidx.compose.material.TextFieldColors r88, androidx.compose.runtime.Composer r89, int r90, int r91, int r92) {
        /*
            r15 = r90
            r14 = r91
            r13 = r92
            r0 = -1690895095(0xffffffff9b36fd09, float:-1.5136447E-22)
            r1 = r89
            androidx.compose.runtime.Composer r0 = r1.q(r0)
            r1 = r13 & 1
            if (r1 == 0) goto L_0x0019
            r1 = r15 | 6
            r4 = r1
            r1 = r70
            goto L_0x002d
        L_0x0019:
            r1 = r15 & 6
            if (r1 != 0) goto L_0x002a
            r1 = r70
            boolean r4 = r0.W(r1)
            if (r4 == 0) goto L_0x0027
            r4 = 4
            goto L_0x0028
        L_0x0027:
            r4 = 2
        L_0x0028:
            r4 = r4 | r15
            goto L_0x002d
        L_0x002a:
            r1 = r70
            r4 = r15
        L_0x002d:
            r5 = r13 & 2
            if (r5 == 0) goto L_0x0036
            r4 = r4 | 48
        L_0x0033:
            r5 = r71
            goto L_0x0048
        L_0x0036:
            r5 = r15 & 48
            if (r5 != 0) goto L_0x0033
            r5 = r71
            boolean r8 = r0.l(r5)
            if (r8 == 0) goto L_0x0045
            r8 = 32
            goto L_0x0047
        L_0x0045:
            r8 = 16
        L_0x0047:
            r4 = r4 | r8
        L_0x0048:
            r8 = r13 & 4
            if (r8 == 0) goto L_0x0051
            r4 = r4 | 384(0x180, float:5.38E-43)
        L_0x004e:
            r11 = r72
            goto L_0x0063
        L_0x0051:
            r11 = r15 & 384(0x180, float:5.38E-43)
            if (r11 != 0) goto L_0x004e
            r11 = r72
            boolean r12 = r0.W(r11)
            if (r12 == 0) goto L_0x0060
            r12 = 256(0x100, float:3.59E-43)
            goto L_0x0062
        L_0x0060:
            r12 = 128(0x80, float:1.794E-43)
        L_0x0062:
            r4 = r4 | r12
        L_0x0063:
            r12 = r13 & 8
            r16 = 1024(0x400, float:1.435E-42)
            r17 = 2048(0x800, float:2.87E-42)
            if (r12 == 0) goto L_0x0070
            r4 = r4 | 3072(0xc00, float:4.305E-42)
        L_0x006d:
            r2 = r73
            goto L_0x0083
        L_0x0070:
            r2 = r15 & 3072(0xc00, float:4.305E-42)
            if (r2 != 0) goto L_0x006d
            r2 = r73
            boolean r18 = r0.d(r2)
            if (r18 == 0) goto L_0x007f
            r18 = r17
            goto L_0x0081
        L_0x007f:
            r18 = r16
        L_0x0081:
            r4 = r4 | r18
        L_0x0083:
            r18 = r13 & 16
            r19 = 16384(0x4000, float:2.2959E-41)
            r20 = 8192(0x2000, float:1.14794E-41)
            if (r18 == 0) goto L_0x0090
            r4 = r4 | 24576(0x6000, float:3.4438E-41)
        L_0x008d:
            r3 = r74
            goto L_0x00a3
        L_0x0090:
            r3 = r15 & 24576(0x6000, float:3.4438E-41)
            if (r3 != 0) goto L_0x008d
            r3 = r74
            boolean r22 = r0.d(r3)
            if (r22 == 0) goto L_0x009f
            r22 = r19
            goto L_0x00a1
        L_0x009f:
            r22 = r20
        L_0x00a1:
            r4 = r4 | r22
        L_0x00a3:
            r22 = 196608(0x30000, float:2.75506E-40)
            r23 = r15 & r22
            r24 = 65536(0x10000, float:9.18355E-41)
            r25 = 131072(0x20000, float:1.83671E-40)
            if (r23 != 0) goto L_0x00c1
            r23 = r13 & 32
            r6 = r75
            if (r23 != 0) goto L_0x00bc
            boolean r26 = r0.W(r6)
            if (r26 == 0) goto L_0x00bc
            r26 = r25
            goto L_0x00be
        L_0x00bc:
            r26 = r24
        L_0x00be:
            r4 = r4 | r26
            goto L_0x00c3
        L_0x00c1:
            r6 = r75
        L_0x00c3:
            r26 = r13 & 64
            r64 = 1572864(0x180000, float:2.204052E-39)
            if (r26 == 0) goto L_0x00ce
            r4 = r4 | r64
            r7 = r76
            goto L_0x00e1
        L_0x00ce:
            r27 = r15 & r64
            r7 = r76
            if (r27 != 0) goto L_0x00e1
            boolean r28 = r0.l(r7)
            if (r28 == 0) goto L_0x00dd
            r28 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00df
        L_0x00dd:
            r28 = 524288(0x80000, float:7.34684E-40)
        L_0x00df:
            r4 = r4 | r28
        L_0x00e1:
            r9 = r13 & 128(0x80, float:1.794E-43)
            r29 = 12582912(0xc00000, float:1.7632415E-38)
            if (r9 == 0) goto L_0x00ec
            r4 = r4 | r29
            r10 = r77
            goto L_0x00ff
        L_0x00ec:
            r29 = r15 & r29
            r10 = r77
            if (r29 != 0) goto L_0x00ff
            boolean r30 = r0.l(r10)
            if (r30 == 0) goto L_0x00fb
            r30 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00fd
        L_0x00fb:
            r30 = 4194304(0x400000, float:5.877472E-39)
        L_0x00fd:
            r4 = r4 | r30
        L_0x00ff:
            r1 = r13 & 256(0x100, float:3.59E-43)
            r30 = 100663296(0x6000000, float:2.4074124E-35)
            if (r1 == 0) goto L_0x010a
            r4 = r4 | r30
            r2 = r78
            goto L_0x011d
        L_0x010a:
            r30 = r15 & r30
            r2 = r78
            if (r30 != 0) goto L_0x011d
            boolean r30 = r0.l(r2)
            if (r30 == 0) goto L_0x0119
            r30 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x011b
        L_0x0119:
            r30 = 33554432(0x2000000, float:9.403955E-38)
        L_0x011b:
            r4 = r4 | r30
        L_0x011d:
            r2 = r13 & 512(0x200, float:7.175E-43)
            r30 = 805306368(0x30000000, float:4.656613E-10)
            if (r2 == 0) goto L_0x0128
            r4 = r4 | r30
            r3 = r79
            goto L_0x013b
        L_0x0128:
            r30 = r15 & r30
            r3 = r79
            if (r30 != 0) goto L_0x013b
            boolean r30 = r0.l(r3)
            if (r30 == 0) goto L_0x0137
            r30 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x0139
        L_0x0137:
            r30 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x0139:
            r4 = r4 | r30
        L_0x013b:
            r3 = r13 & 1024(0x400, float:1.435E-42)
            if (r3 == 0) goto L_0x0144
            r21 = r14 | 6
            r5 = r80
            goto L_0x015a
        L_0x0144:
            r30 = r14 & 6
            r5 = r80
            if (r30 != 0) goto L_0x0158
            boolean r30 = r0.d(r5)
            if (r30 == 0) goto L_0x0153
            r21 = 4
            goto L_0x0155
        L_0x0153:
            r21 = 2
        L_0x0155:
            r21 = r14 | r21
            goto L_0x015a
        L_0x0158:
            r21 = r14
        L_0x015a:
            r5 = r13 & 2048(0x800, float:2.87E-42)
            if (r5 == 0) goto L_0x0163
            r21 = r21 | 48
        L_0x0160:
            r6 = r21
            goto L_0x0177
        L_0x0163:
            r30 = r14 & 48
            r6 = r81
            if (r30 != 0) goto L_0x0160
            boolean r30 = r0.W(r6)
            if (r30 == 0) goto L_0x0172
            r27 = 32
            goto L_0x0174
        L_0x0172:
            r27 = 16
        L_0x0174:
            r21 = r21 | r27
            goto L_0x0160
        L_0x0177:
            r7 = r13 & 4096(0x1000, float:5.74E-42)
            if (r7 == 0) goto L_0x0180
            r6 = r6 | 384(0x180, float:5.38E-43)
        L_0x017d:
            r10 = r82
            goto L_0x0193
        L_0x0180:
            r10 = r14 & 384(0x180, float:5.38E-43)
            if (r10 != 0) goto L_0x017d
            r10 = r82
            boolean r21 = r0.W(r10)
            if (r21 == 0) goto L_0x018f
            r28 = 256(0x100, float:3.59E-43)
            goto L_0x0191
        L_0x018f:
            r28 = 128(0x80, float:1.794E-43)
        L_0x0191:
            r6 = r6 | r28
        L_0x0193:
            r10 = r14 & 3072(0xc00, float:4.305E-42)
            if (r10 != 0) goto L_0x01ab
            r10 = r13 & 8192(0x2000, float:1.14794E-41)
            if (r10 != 0) goto L_0x01a6
            r10 = r83
            boolean r21 = r0.W(r10)
            if (r21 == 0) goto L_0x01a8
            r16 = r17
            goto L_0x01a8
        L_0x01a6:
            r10 = r83
        L_0x01a8:
            r6 = r6 | r16
            goto L_0x01ad
        L_0x01ab:
            r10 = r83
        L_0x01ad:
            r10 = r13 & 16384(0x4000, float:2.2959E-41)
            if (r10 == 0) goto L_0x01b6
            r6 = r6 | 24576(0x6000, float:3.4438E-41)
        L_0x01b3:
            r11 = r84
            goto L_0x01c7
        L_0x01b6:
            r11 = r14 & 24576(0x6000, float:3.4438E-41)
            if (r11 != 0) goto L_0x01b3
            r11 = r84
            boolean r16 = r0.d(r11)
            if (r16 == 0) goto L_0x01c3
            goto L_0x01c5
        L_0x01c3:
            r19 = r20
        L_0x01c5:
            r6 = r6 | r19
        L_0x01c7:
            r16 = 32768(0x8000, float:4.5918E-41)
            r16 = r13 & r16
            if (r16 == 0) goto L_0x01d3
            r6 = r6 | r22
            r11 = r85
            goto L_0x01e6
        L_0x01d3:
            r17 = r14 & r22
            r11 = r85
            if (r17 != 0) goto L_0x01e6
            boolean r17 = r0.i(r11)
            if (r17 == 0) goto L_0x01e2
            r17 = r25
            goto L_0x01e4
        L_0x01e2:
            r17 = r24
        L_0x01e4:
            r6 = r6 | r17
        L_0x01e6:
            r17 = r13 & r24
            if (r17 == 0) goto L_0x01ef
            r6 = r6 | r64
            r11 = r86
            goto L_0x0202
        L_0x01ef:
            r19 = r14 & r64
            r11 = r86
            if (r19 != 0) goto L_0x0202
            boolean r19 = r0.W(r11)
            if (r19 == 0) goto L_0x01fe
            r19 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x0200
        L_0x01fe:
            r19 = 524288(0x80000, float:7.34684E-40)
        L_0x0200:
            r6 = r6 | r19
        L_0x0202:
            r19 = 12582912(0xc00000, float:1.7632415E-38)
            r19 = r14 & r19
            if (r19 != 0) goto L_0x021c
            r19 = r13 & r25
            r11 = r87
            if (r19 != 0) goto L_0x0217
            boolean r19 = r0.W(r11)
            if (r19 == 0) goto L_0x0217
            r19 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x0219
        L_0x0217:
            r19 = 4194304(0x400000, float:5.877472E-39)
        L_0x0219:
            r6 = r6 | r19
            goto L_0x021e
        L_0x021c:
            r11 = r87
        L_0x021e:
            r19 = 100663296(0x6000000, float:2.4074124E-35)
            r19 = r14 & r19
            if (r19 != 0) goto L_0x023a
            r19 = 262144(0x40000, float:3.67342E-40)
            r19 = r13 & r19
            r11 = r88
            if (r19 != 0) goto L_0x0235
            boolean r19 = r0.W(r11)
            if (r19 == 0) goto L_0x0235
            r19 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x0237
        L_0x0235:
            r19 = 33554432(0x2000000, float:9.403955E-38)
        L_0x0237:
            r6 = r6 | r19
            goto L_0x023c
        L_0x023a:
            r11 = r88
        L_0x023c:
            r19 = 306783379(0x12492493, float:6.34695E-28)
            r11 = r4 & r19
            r14 = 306783378(0x12492492, float:6.3469493E-28)
            r19 = 0
            r20 = 1
            if (r11 != r14) goto L_0x0257
            r11 = 38347923(0x2492493, float:1.4777644E-37)
            r11 = r11 & r6
            r14 = 38347922(0x2492492, float:1.4777643E-37)
            if (r11 == r14) goto L_0x0254
            goto L_0x0257
        L_0x0254:
            r11 = r19
            goto L_0x0259
        L_0x0257:
            r11 = r20
        L_0x0259:
            r14 = r4 & 1
            boolean r11 = r0.E(r11, r14)
            if (r11 == 0) goto L_0x04b2
            r0.p()
            r11 = r15 & 1
            if (r11 == 0) goto L_0x02b7
            boolean r11 = r0.J()
            if (r11 == 0) goto L_0x026f
            goto L_0x02b7
        L_0x026f:
            r0.B()
            r1 = r13 & 32
            if (r1 == 0) goto L_0x027a
            r1 = -458753(0xfffffffffff8ffff, float:NaN)
            r4 = r4 & r1
        L_0x027a:
            r1 = r13 & 8192(0x2000, float:1.14794E-41)
            if (r1 == 0) goto L_0x0280
            r6 = r6 & -7169(0xffffffffffffe3ff, float:NaN)
        L_0x0280:
            r1 = r13 & r25
            if (r1 == 0) goto L_0x0288
            r1 = -29360129(0xfffffffffe3fffff, float:-6.380294E37)
            r6 = r6 & r1
        L_0x0288:
            r1 = 262144(0x40000, float:3.67342E-40)
            r1 = r1 & r13
            if (r1 == 0) goto L_0x0291
            r1 = -234881025(0xfffffffff1ffffff, float:-2.535301E30)
            r6 = r6 & r1
        L_0x0291:
            r8 = r72
            r11 = r73
            r12 = r74
            r14 = r75
            r65 = r76
            r9 = r77
            r1 = r78
            r2 = r79
            r3 = r80
            r5 = r81
            r7 = r82
            r10 = r84
            r66 = r85
            r40 = r87
            r41 = r88
            r13 = r4
            r15 = r6
            r4 = r83
            r6 = r86
            goto L_0x041e
        L_0x02b7:
            if (r8 == 0) goto L_0x02bc
            androidx.compose.ui.Modifier$Companion r8 = androidx.compose.ui.Modifier.f15489d
            goto L_0x02be
        L_0x02bc:
            r8 = r72
        L_0x02be:
            if (r12 == 0) goto L_0x02c3
            r11 = r20
            goto L_0x02c5
        L_0x02c3:
            r11 = r73
        L_0x02c5:
            if (r18 == 0) goto L_0x02ca
            r12 = r19
            goto L_0x02cc
        L_0x02ca:
            r12 = r74
        L_0x02cc:
            r14 = r13 & 32
            if (r14 == 0) goto L_0x02e0
            androidx.compose.runtime.ProvidableCompositionLocal r14 = androidx.compose.material.TextKt.f()
            java.lang.Object r14 = r0.C(r14)
            androidx.compose.ui.text.TextStyle r14 = (androidx.compose.ui.text.TextStyle) r14
            r18 = -458753(0xfffffffffff8ffff, float:NaN)
            r4 = r4 & r18
            goto L_0x02e2
        L_0x02e0:
            r14 = r75
        L_0x02e2:
            r18 = 0
            if (r26 == 0) goto L_0x02e9
            r65 = r18
            goto L_0x02eb
        L_0x02e9:
            r65 = r76
        L_0x02eb:
            if (r9 == 0) goto L_0x02f0
            r9 = r18
            goto L_0x02f2
        L_0x02f0:
            r9 = r77
        L_0x02f2:
            if (r1 == 0) goto L_0x02f7
            r1 = r18
            goto L_0x02f9
        L_0x02f7:
            r1 = r78
        L_0x02f9:
            if (r2 == 0) goto L_0x02fe
            r2 = r18
            goto L_0x0300
        L_0x02fe:
            r2 = r79
        L_0x0300:
            if (r3 == 0) goto L_0x0305
            r3 = r19
            goto L_0x0307
        L_0x0305:
            r3 = r80
        L_0x0307:
            if (r5 == 0) goto L_0x0310
            androidx.compose.ui.text.input.VisualTransformation$Companion r5 = androidx.compose.ui.text.input.VisualTransformation.f18929a
            androidx.compose.ui.text.input.VisualTransformation r5 = r5.c()
            goto L_0x0312
        L_0x0310:
            r5 = r81
        L_0x0312:
            if (r7 == 0) goto L_0x031b
            androidx.compose.foundation.text.KeyboardOptions$Companion r7 = androidx.compose.foundation.text.KeyboardOptions.f5771h
            androidx.compose.foundation.text.KeyboardOptions r7 = r7.a()
            goto L_0x031d
        L_0x031b:
            r7 = r82
        L_0x031d:
            r72 = r1
            r1 = r13 & 8192(0x2000, float:1.14794E-41)
            if (r1 == 0) goto L_0x034d
            androidx.compose.foundation.text.KeyboardActions r1 = new androidx.compose.foundation.text.KeyboardActions
            r18 = 63
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r26 = 0
            r27 = 0
            r73 = r1
            r74 = r21
            r75 = r22
            r76 = r23
            r77 = r24
            r78 = r26
            r79 = r27
            r80 = r18
            r81 = r20
            r73.<init>(r74, r75, r76, r77, r78, r79, r80, r81)
            r6 = r6 & -7169(0xffffffffffffe3ff, float:NaN)
            goto L_0x034f
        L_0x034d:
            r1 = r83
        L_0x034f:
            if (r10 == 0) goto L_0x0354
            r10 = r19
            goto L_0x0356
        L_0x0354:
            r10 = r84
        L_0x0356:
            if (r16 == 0) goto L_0x035e
            r16 = 2147483647(0x7fffffff, float:NaN)
            r66 = r16
            goto L_0x0360
        L_0x035e:
            r66 = r85
        L_0x0360:
            r73 = r1
            if (r17 == 0) goto L_0x037c
            java.lang.Object r1 = r0.g()
            androidx.compose.runtime.Composer$Companion r16 = androidx.compose.runtime.Composer.f14567a
            r74 = r2
            java.lang.Object r2 = r16.a()
            if (r1 != r2) goto L_0x0379
            androidx.compose.foundation.interaction.MutableInteractionSource r1 = androidx.compose.foundation.interaction.InteractionSourceKt.a()
            r0.N(r1)
        L_0x0379:
            androidx.compose.foundation.interaction.MutableInteractionSource r1 = (androidx.compose.foundation.interaction.MutableInteractionSource) r1
            goto L_0x0380
        L_0x037c:
            r74 = r2
            r1 = r86
        L_0x0380:
            r2 = r13 & r25
            if (r2 == 0) goto L_0x03b9
            androidx.compose.material.MaterialTheme r2 = androidx.compose.material.MaterialTheme.f7937a
            r75 = r1
            r1 = 6
            androidx.compose.material.Shapes r1 = r2.b(r0, r1)
            androidx.compose.foundation.shape.CornerBasedShape r1 = r1.c()
            androidx.compose.foundation.shape.CornerSize r2 = androidx.compose.foundation.shape.CornerSizeKt.d()
            androidx.compose.foundation.shape.CornerSize r16 = androidx.compose.foundation.shape.CornerSizeKt.d()
            r17 = 3
            r18 = 0
            r19 = 0
            r20 = 0
            r76 = r1
            r77 = r19
            r78 = r20
            r79 = r2
            r80 = r16
            r81 = r17
            r82 = r18
            androidx.compose.foundation.shape.CornerBasedShape r1 = androidx.compose.foundation.shape.CornerBasedShape.d(r76, r77, r78, r79, r80, r81, r82)
            r2 = -29360129(0xfffffffffe3fffff, float:-6.380294E37)
            r2 = r2 & r6
            r6 = r2
            goto L_0x03bd
        L_0x03b9:
            r75 = r1
            r1 = r87
        L_0x03bd:
            r2 = 262144(0x40000, float:3.67342E-40)
            r2 = r2 & r13
            if (r2 == 0) goto L_0x0411
            androidx.compose.material.TextFieldDefaults r16 = androidx.compose.material.TextFieldDefaults.f8730a
            r62 = 48
            r63 = 2097151(0x1fffff, float:2.938734E-39)
            r17 = 0
            r19 = 0
            r21 = 0
            r23 = 0
            r25 = 0
            r27 = 0
            r29 = 0
            r31 = 0
            r33 = 0
            r35 = 0
            r37 = 0
            r39 = 0
            r41 = 0
            r43 = 0
            r45 = 0
            r47 = 0
            r49 = 0
            r51 = 0
            r53 = 0
            r55 = 0
            r57 = 0
            r60 = 0
            r61 = 0
            r59 = r0
            androidx.compose.material.TextFieldColors r2 = r16.o(r17, r19, r21, r23, r25, r27, r29, r31, r33, r35, r37, r39, r41, r43, r45, r47, r49, r51, r53, r55, r57, r59, r60, r61, r62, r63)
            r16 = -234881025(0xfffffffff1ffffff, float:-2.535301E30)
            r6 = r6 & r16
            r40 = r1
            r41 = r2
            r13 = r4
            r15 = r6
            r1 = r72
            r4 = r73
            r2 = r74
        L_0x040e:
            r6 = r75
            goto L_0x041e
        L_0x0411:
            r2 = r74
            r41 = r88
            r40 = r1
            r13 = r4
            r15 = r6
            r1 = r72
            r4 = r73
            goto L_0x040e
        L_0x041e:
            r0.U()
            boolean r16 = androidx.compose.runtime.ComposerKt.P()
            r89 = r0
            if (r16 == 0) goto L_0x0434
            r0 = -1690895095(0xffffffff9b36fd09, float:-1.5136447E-22)
            r72 = r6
            java.lang.String r6 = "androidx.compose.material.TextField (TextField.kt:422)"
            androidx.compose.runtime.ComposerKt.Y(r0, r13, r15, r6)
            goto L_0x0436
        L_0x0434:
            r72 = r6
        L_0x0436:
            r0 = 2147483646(0x7ffffffe, float:NaN)
            r37 = r13 & r0
            r0 = r15 & 14
            r0 = r0 | r64
            r6 = r15 & 112(0x70, float:1.57E-43)
            r0 = r0 | r6
            r6 = r15 & 896(0x380, float:1.256E-42)
            r0 = r0 | r6
            r6 = r15 & 7168(0x1c00, float:1.0045E-41)
            r0 = r0 | r6
            r6 = 57344(0xe000, float:8.0356E-41)
            r6 = r6 & r15
            r0 = r0 | r6
            r6 = 458752(0x70000, float:6.42848E-40)
            r6 = r6 & r15
            r0 = r0 | r6
            int r6 = r15 << 3
            r13 = 29360128(0x1c00000, float:7.052966E-38)
            r13 = r13 & r6
            r0 = r0 | r13
            r13 = 234881024(0xe000000, float:1.5777218E-30)
            r13 = r13 & r6
            r0 = r0 | r13
            r13 = 1879048192(0x70000000, float:1.58456325E29)
            r6 = r6 & r13
            r38 = r0 | r6
            r39 = 0
            r32 = 1
            r16 = r70
            r17 = r71
            r18 = r8
            r19 = r11
            r20 = r12
            r21 = r14
            r22 = r65
            r23 = r9
            r24 = r1
            r25 = r2
            r26 = r3
            r27 = r5
            r28 = r7
            r29 = r4
            r30 = r10
            r31 = r66
            r33 = r72
            r34 = r40
            r35 = r41
            r36 = r89
            d(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39)
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x0498
            androidx.compose.runtime.ComposerKt.X()
        L_0x0498:
            r17 = r72
            r13 = r7
            r15 = r10
            r6 = r14
            r18 = r40
            r19 = r41
            r7 = r65
            r16 = r66
            r10 = r2
            r14 = r4
            r4 = r11
            r11 = r3
            r3 = r8
            r8 = r9
            r9 = r1
            r69 = r12
            r12 = r5
            r5 = r69
            goto L_0x04d9
        L_0x04b2:
            r89 = r0
            r89.B()
            r3 = r72
            r4 = r73
            r5 = r74
            r6 = r75
            r7 = r76
            r8 = r77
            r9 = r78
            r10 = r79
            r11 = r80
            r12 = r81
            r13 = r82
            r14 = r83
            r15 = r84
            r16 = r85
            r17 = r86
            r18 = r87
            r19 = r88
        L_0x04d9:
            androidx.compose.runtime.ScopeUpdateScope r2 = r89.x()
            if (r2 == 0) goto L_0x04fa
            androidx.compose.material.TextFieldKt$TextField$6 r1 = new androidx.compose.material.TextFieldKt$TextField$6
            r0 = r1
            r67 = r1
            r1 = r70
            r68 = r2
            r2 = r71
            r20 = r90
            r21 = r91
            r22 = r92
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            r1 = r67
            r0 = r68
            r0.a(r1)
        L_0x04fa:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.TextFieldKt.e(java.lang.String, kotlin.jvm.functions.Function1, androidx.compose.ui.Modifier, boolean, boolean, androidx.compose.ui.text.TextStyle, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, boolean, androidx.compose.ui.text.input.VisualTransformation, androidx.compose.foundation.text.KeyboardOptions, androidx.compose.foundation.text.KeyboardActions, boolean, int, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.ui.graphics.Shape, androidx.compose.material.TextFieldColors, androidx.compose.runtime.Composer, int, int, int):void");
    }

    public static final void f(Modifier modifier, Function2 function2, Function2 function22, Function3 function3, Function2 function23, Function2 function24, boolean z2, float f2, PaddingValues paddingValues, Composer composer, int i2) {
        int i3;
        int i4;
        Modifier modifier2 = modifier;
        Function2 function25 = function2;
        Function2 function26 = function22;
        Function3 function32 = function3;
        Function2 function27 = function23;
        Function2 function28 = function24;
        boolean z3 = z2;
        float f3 = f2;
        PaddingValues paddingValues2 = paddingValues;
        int i5 = i2;
        Composer q2 = composer.q(-2112507061);
        if ((i5 & 6) == 0) {
            i3 = (q2.W(modifier2) ? 4 : 2) | i5;
        } else {
            i3 = i5;
        }
        if ((i5 & 48) == 0) {
            i3 |= q2.l(function25) ? 32 : 16;
        }
        if ((i5 & 384) == 0) {
            i3 |= q2.l(function26) ? 256 : 128;
        }
        if ((i5 & 3072) == 0) {
            i3 |= q2.l(function32) ? 2048 : 1024;
        }
        if ((i5 & 24576) == 0) {
            i3 |= q2.l(function27) ? 16384 : 8192;
        }
        if ((196608 & i5) == 0) {
            i3 |= q2.l(function28) ? 131072 : 65536;
        }
        if ((1572864 & i5) == 0) {
            i3 |= q2.d(z3) ? 1048576 : 524288;
        }
        if ((12582912 & i5) == 0) {
            i3 |= q2.h(f3) ? 8388608 : 4194304;
        }
        if ((100663296 & i5) == 0) {
            i3 |= q2.W(paddingValues2) ? 67108864 : 33554432;
        }
        if (q2.E((38347923 & i3) != 38347922, i3 & 1)) {
            if (ComposerKt.P()) {
                ComposerKt.Y(-2112507061, i3, -1, "androidx.compose.material.TextFieldLayout (TextField.kt:652)");
            }
            boolean z4 = ((3670016 & i3) == 1048576) | ((29360128 & i3) == 8388608) | ((234881024 & i3) == 67108864);
            Object g2 = q2.g();
            if (z4 || g2 == Composer.f14567a.a()) {
                g2 = new TextFieldMeasurePolicy(z3, f3, paddingValues2);
                q2.N(g2);
            }
            TextFieldMeasurePolicy textFieldMeasurePolicy = (TextFieldMeasurePolicy) g2;
            LayoutDirection layoutDirection = (LayoutDirection) q2.C(CompositionLocalsKt.m());
            int a2 = ComposablesKt.a(q2, 0);
            CompositionLocalMap I = q2.I();
            Modifier e2 = ComposedModifierKt.e(q2, modifier2);
            ComposeUiNode.Companion companion = ComposeUiNode.f17222h;
            Function0 a3 = companion.a();
            if (q2.v() == null) {
                ComposablesKt.d();
            }
            q2.s();
            if (q2.n()) {
                q2.y(a3);
            } else {
                q2.K();
            }
            Composer b2 = Updater.b(q2);
            Updater.g(b2, textFieldMeasurePolicy, companion.c());
            Updater.g(b2, I, companion.e());
            Function2 b3 = companion.b();
            if (b2.n() || !Intrinsics.d(b2.g(), Integer.valueOf(a2))) {
                b2.N(Integer.valueOf(a2));
                b2.A(Integer.valueOf(a2), b3);
            }
            Updater.g(b2, e2, companion.d());
            if (function27 != null) {
                q2.X(79117075);
                Modifier c2 = InteractiveComponentSizeKt.c(LayoutIdKt.b(Modifier.f15489d, "Leading"));
                MeasurePolicy g3 = BoxKt.g(Alignment.f15444a.e(), false);
                int a4 = ComposablesKt.a(q2, 0);
                CompositionLocalMap I2 = q2.I();
                Modifier e3 = ComposedModifierKt.e(q2, c2);
                Function0 a5 = companion.a();
                if (q2.v() == null) {
                    ComposablesKt.d();
                }
                q2.s();
                if (q2.n()) {
                    q2.y(a5);
                } else {
                    q2.K();
                }
                Composer b4 = Updater.b(q2);
                Updater.g(b4, g3, companion.c());
                Updater.g(b4, I2, companion.e());
                Function2 b5 = companion.b();
                if (b4.n() || !Intrinsics.d(b4.g(), Integer.valueOf(a4))) {
                    b4.N(Integer.valueOf(a4));
                    b4.A(Integer.valueOf(a4), b5);
                }
                Updater.g(b4, e3, companion.d());
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.f3797a;
                function27.m(q2, Integer.valueOf((i3 >> 12) & 14));
                q2.T();
                q2.M();
            } else {
                q2.X(79362130);
                q2.M();
            }
            if (function28 != null) {
                q2.X(79404817);
                Modifier c3 = InteractiveComponentSizeKt.c(LayoutIdKt.b(Modifier.f15489d, "Trailing"));
                MeasurePolicy g4 = BoxKt.g(Alignment.f15444a.e(), false);
                int a6 = ComposablesKt.a(q2, 0);
                CompositionLocalMap I3 = q2.I();
                Modifier e4 = ComposedModifierKt.e(q2, c3);
                Function0 a7 = companion.a();
                if (q2.v() == null) {
                    ComposablesKt.d();
                }
                q2.s();
                if (q2.n()) {
                    q2.y(a7);
                } else {
                    q2.K();
                }
                Composer b6 = Updater.b(q2);
                Updater.g(b6, g4, companion.c());
                Updater.g(b6, I3, companion.e());
                Function2 b7 = companion.b();
                if (b6.n() || !Intrinsics.d(b6.g(), Integer.valueOf(a6))) {
                    b6.N(Integer.valueOf(a6));
                    b6.A(Integer.valueOf(a6), b7);
                }
                Updater.g(b6, e4, companion.d());
                BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.f3797a;
                function28.m(q2, Integer.valueOf((i3 >> 15) & 14));
                q2.T();
                q2.M();
            } else {
                q2.X(79651794);
                q2.M();
            }
            float g5 = PaddingKt.g(paddingValues2, layoutDirection);
            float f4 = PaddingKt.f(paddingValues2, layoutDirection);
            Modifier.Companion companion2 = Modifier.f15489d;
            if (function27 != null) {
                i4 = 0;
                g5 = Dp.m(RangesKt.d(Dp.m(g5 - TextFieldImplKt.d()), Dp.m((float) 0)));
            } else {
                i4 = 0;
            }
            float f5 = g5;
            if (function28 != null) {
                f4 = Dp.m(RangesKt.d(Dp.m(f4 - TextFieldImplKt.d()), Dp.m((float) i4)));
            }
            Modifier m2 = PaddingKt.m(companion2, f5, 0.0f, f4, 0.0f, 10, (Object) null);
            if (function32 != null) {
                q2.X(80502775);
                function32.d(LayoutIdKt.b(companion2, "Hint").o0(m2), q2, Integer.valueOf((i3 >> 6) & 112));
                q2.M();
            } else {
                q2.X(80590226);
                q2.M();
            }
            if (function26 != null) {
                q2.X(80624729);
                Modifier o0 = LayoutIdKt.b(companion2, "Label").o0(m2);
                MeasurePolicy g6 = BoxKt.g(Alignment.f15444a.o(), false);
                int a8 = ComposablesKt.a(q2, 0);
                CompositionLocalMap I4 = q2.I();
                Modifier e5 = ComposedModifierKt.e(q2, o0);
                Function0 a9 = companion.a();
                if (q2.v() == null) {
                    ComposablesKt.d();
                }
                q2.s();
                if (q2.n()) {
                    q2.y(a9);
                } else {
                    q2.K();
                }
                Composer b8 = Updater.b(q2);
                Updater.g(b8, g6, companion.c());
                Updater.g(b8, I4, companion.e());
                Function2 b9 = companion.b();
                if (b8.n() || !Intrinsics.d(b8.g(), Integer.valueOf(a8))) {
                    b8.N(Integer.valueOf(a8));
                    b8.A(Integer.valueOf(a8), b9);
                }
                Updater.g(b8, e5, companion.d());
                BoxScopeInstance boxScopeInstance3 = BoxScopeInstance.f3797a;
                function26.m(q2, Integer.valueOf((i3 >> 6) & 14));
                q2.T();
                q2.M();
            } else {
                q2.X(80710258);
                q2.M();
            }
            Modifier o02 = LayoutIdKt.b(companion2, "TextField").o0(m2);
            MeasurePolicy g7 = BoxKt.g(Alignment.f15444a.o(), true);
            int a10 = ComposablesKt.a(q2, 0);
            CompositionLocalMap I5 = q2.I();
            Modifier e6 = ComposedModifierKt.e(q2, o02);
            Function0 a11 = companion.a();
            if (q2.v() == null) {
                ComposablesKt.d();
            }
            q2.s();
            if (q2.n()) {
                q2.y(a11);
            } else {
                q2.K();
            }
            Composer b10 = Updater.b(q2);
            Updater.g(b10, g7, companion.c());
            Updater.g(b10, I5, companion.e());
            Function2 b11 = companion.b();
            if (b10.n() || !Intrinsics.d(b10.g(), Integer.valueOf(a10))) {
                b10.N(Integer.valueOf(a10));
                b10.A(Integer.valueOf(a10), b11);
            }
            Updater.g(b10, e6, companion.d());
            BoxScopeInstance boxScopeInstance4 = BoxScopeInstance.f3797a;
            function25.m(q2, Integer.valueOf((i3 >> 3) & 14));
            q2.T();
            q2.T();
            if (ComposerKt.P()) {
                ComposerKt.X();
            }
        } else {
            q2.B();
        }
        ScopeUpdateScope x2 = q2.x();
        if (x2 != null) {
            x2.a(new TextFieldKt$TextFieldLayout$2(modifier, function2, function22, function3, function23, function24, z2, f2, paddingValues, i2));
        }
    }

    public static final int l(int i2, boolean z2, int i3, int i4, int i5, int i6, long j2, float f2, PaddingValues paddingValues) {
        float f3 = f8801c * f2;
        float d2 = paddingValues.d() * f2;
        float a2 = paddingValues.a() * f2;
        int max = Math.max(i2, i6);
        return ConstraintsKt.f(j2, Math.max(MathKt.d(z2 ? ((float) i3) + f3 + ((float) max) + a2 : d2 + ((float) max) + a2), Math.max(i4, i5)));
    }

    public static final int m(int i2, int i3, int i4, int i5, int i6, long j2) {
        return ConstraintsKt.g(j2, i2 + Math.max(i4, Math.max(i5, i6)) + i3);
    }

    public static final Modifier n(Modifier modifier, BorderStroke borderStroke) {
        return DrawModifierKt.d(modifier, new TextFieldKt$drawIndicatorLine$1(borderStroke.b(), borderStroke));
    }

    public static final float o() {
        return f8799a;
    }

    public static final float p() {
        return f8800b;
    }

    public static final float q() {
        return f8801c;
    }

    public static final void r(Placeable.PlacementScope placementScope, int i2, int i3, Placeable placeable, Placeable placeable2, Placeable placeable3, Placeable placeable4, Placeable placeable5, boolean z2, int i4, int i5, float f2, float f3) {
        int i6 = i3;
        if (placeable4 != null) {
            Placeable.PlacementScope.n(placementScope, placeable4, 0, Alignment.f15444a.i().a(placeable4.C0(), i6), 0.0f, 4, (Object) null);
        }
        if (placeable5 != null) {
            Placeable.PlacementScope.n(placementScope, placeable5, i2 - placeable5.L0(), Alignment.f15444a.i().a(placeable5.C0(), i6), 0.0f, 4, (Object) null);
        }
        if (placeable2 != null) {
            int a2 = z2 ? Alignment.f15444a.i().a(placeable2.C0(), i6) : MathKt.d(TextFieldImplKt.f() * f3);
            Placeable.PlacementScope.n(placementScope, placeable2, TextFieldImplKt.h(placeable4), a2 - MathKt.d(((float) (a2 - i4)) * f2), 0.0f, 4, (Object) null);
        }
        Placeable.PlacementScope.n(placementScope, placeable, TextFieldImplKt.h(placeable4), i5, 0.0f, 4, (Object) null);
        if (placeable3 != null) {
            Placeable.PlacementScope.n(placementScope, placeable3, TextFieldImplKt.h(placeable4), i5, 0.0f, 4, (Object) null);
        }
    }

    public static final void s(Placeable.PlacementScope placementScope, int i2, int i3, Placeable placeable, Placeable placeable2, Placeable placeable3, Placeable placeable4, boolean z2, float f2, PaddingValues paddingValues) {
        int i4 = i3;
        int d2 = MathKt.d(paddingValues.d() * f2);
        if (placeable3 != null) {
            Placeable.PlacementScope.n(placementScope, placeable3, 0, Alignment.f15444a.i().a(placeable3.C0(), i3), 0.0f, 4, (Object) null);
        }
        if (placeable4 != null) {
            Placeable.PlacementScope.n(placementScope, placeable4, i2 - placeable4.L0(), Alignment.f15444a.i().a(placeable4.C0(), i3), 0.0f, 4, (Object) null);
        }
        Placeable.PlacementScope.n(placementScope, placeable, TextFieldImplKt.h(placeable3), z2 ? Alignment.f15444a.i().a(placeable.C0(), i3) : d2, 0.0f, 4, (Object) null);
        if (placeable2 != null) {
            if (z2) {
                d2 = Alignment.f15444a.i().a(placeable2.C0(), i3);
            }
            Placeable.PlacementScope.n(placementScope, placeable2, TextFieldImplKt.h(placeable3), d2, 0.0f, 4, (Object) null);
        }
    }

    public static final int t(int i2, int i3) {
        return i2 == Integer.MAX_VALUE ? i2 : i2 - i3;
    }
}
