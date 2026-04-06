package androidx.compose.material3;

import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.text.input.OutputTransformation;
import androidx.compose.foundation.text.input.TextFieldDecorator;
import androidx.compose.foundation.text.input.TextFieldLineLimits;
import androidx.compose.foundation.text.input.TextFieldState;
import androidx.compose.foundation.text.selection.TextSelectionColors;
import androidx.compose.foundation.text.selection.TextSelectionColorsKt;
import androidx.compose.material3.TextFieldLabelPosition;
import androidx.compose.material3.internal.TextFieldImplKt;
import androidx.compose.material3.tokens.FilledTextFieldTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.text.input.VisualTransformation;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class TextFieldDefaults {

    /* renamed from: a  reason: collision with root package name */
    public static final TextFieldDefaults f11367a = new TextFieldDefaults();

    /* renamed from: b  reason: collision with root package name */
    public static final float f11368b = Dp.m((float) 56);

    /* renamed from: c  reason: collision with root package name */
    public static final float f11369c = Dp.m((float) 280);

    /* renamed from: d  reason: collision with root package name */
    public static final float f11370d;

    /* renamed from: e  reason: collision with root package name */
    public static final float f11371e;

    /* renamed from: f  reason: collision with root package name */
    public static final float f11372f;

    /* renamed from: g  reason: collision with root package name */
    public static final float f11373g;

    static {
        float m2 = Dp.m((float) 1);
        f11370d = m2;
        float m3 = Dp.m((float) 2);
        f11371e = m3;
        f11372f = m2;
        f11373g = m3;
    }

    public static final Unit d(TextFieldDefaults textFieldDefaults, boolean z2, boolean z3, InteractionSource interactionSource, Modifier modifier, TextFieldColors textFieldColors, Shape shape, float f2, float f3, int i2, int i3, Composer composer, int i4) {
        textFieldDefaults.c(z2, z3, interactionSource, modifier, textFieldColors, shape, f2, f3, composer, RecomposeScopeImplKt.a(i2 | 1), i3);
        return Unit.f40552a;
    }

    public static final Unit f(TextFieldDefaults textFieldDefaults, String str, Function2 function2, boolean z2, boolean z3, VisualTransformation visualTransformation, InteractionSource interactionSource, boolean z4, Function2 function22, Function2 function23, Function2 function24, Function2 function25, Function2 function26, Function2 function27, Function2 function28, Shape shape, TextFieldColors textFieldColors, PaddingValues paddingValues, Function2 function29, int i2, int i3, int i4, Composer composer, int i5) {
        textFieldDefaults.e(str, function2, z2, z3, visualTransformation, interactionSource, z4, function22, function23, function24, function25, function26, function27, function28, shape, textFieldColors, paddingValues, function29, composer, RecomposeScopeImplKt.a(i2 | 1), RecomposeScopeImplKt.a(i3), i4);
        return Unit.f40552a;
    }

    public static /* synthetic */ PaddingValues j(TextFieldDefaults textFieldDefaults, float f2, float f3, float f4, float f5, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            f2 = TextFieldImplKt.L();
        }
        if ((i2 & 2) != 0) {
            f3 = TextFieldImplKt.L();
        }
        if ((i2 & 4) != 0) {
            f4 = TextFieldKt.f();
        }
        if ((i2 & 8) != 0) {
            f5 = TextFieldKt.f();
        }
        return textFieldDefaults.i(f2, f3, f4, f5);
    }

    public static /* synthetic */ PaddingValues l(TextFieldDefaults textFieldDefaults, float f2, float f3, float f4, float f5, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            f2 = TextFieldImplKt.L();
        }
        if ((i2 & 2) != 0) {
            f3 = TextFieldImplKt.L();
        }
        if ((i2 & 4) != 0) {
            f4 = TextFieldImplKt.L();
        }
        if ((i2 & 8) != 0) {
            f5 = TextFieldImplKt.L();
        }
        return textFieldDefaults.k(f2, f3, f4, f5);
    }

    public static /* synthetic */ PaddingValues v(TextFieldDefaults textFieldDefaults, float f2, float f3, float f4, float f5, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            f2 = TextFieldImplKt.L();
        }
        if ((i2 & 2) != 0) {
            f3 = TextFieldImplKt.K();
        }
        if ((i2 & 4) != 0) {
            f4 = TextFieldImplKt.L();
        }
        if ((i2 & 8) != 0) {
            f5 = Dp.m((float) 0);
        }
        return textFieldDefaults.u(f2, f3, f4, f5);
    }

    /* JADX WARNING: Removed duplicated region for block: B:102:0x0111  */
    /* JADX WARNING: Removed duplicated region for block: B:143:0x01fe  */
    /* JADX WARNING: Removed duplicated region for block: B:146:0x020d  */
    /* JADX WARNING: Removed duplicated region for block: B:148:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x008e  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0095  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x00aa  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00b1  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x00c6  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x00cd  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x00e2  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x00ea  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x00ed  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x0106  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x0108  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c(boolean r22, boolean r23, androidx.compose.foundation.interaction.InteractionSource r24, androidx.compose.ui.Modifier r25, androidx.compose.material3.TextFieldColors r26, androidx.compose.ui.graphics.Shape r27, float r28, float r29, androidx.compose.runtime.Composer r30, int r31, int r32) {
        /*
            r21 = this;
            r12 = r21
            r9 = r22
            r10 = r23
            r11 = r24
            r13 = r31
            r14 = r32
            r0 = -818661242(0xffffffffcf343886, float:-3.0236032E9)
            r1 = r30
            androidx.compose.runtime.Composer r15 = r1.q(r0)
            r1 = r14 & 1
            if (r1 == 0) goto L_0x001c
            r1 = r13 | 6
            goto L_0x002c
        L_0x001c:
            r1 = r13 & 6
            if (r1 != 0) goto L_0x002b
            boolean r1 = r15.d(r9)
            if (r1 == 0) goto L_0x0028
            r1 = 4
            goto L_0x0029
        L_0x0028:
            r1 = 2
        L_0x0029:
            r1 = r1 | r13
            goto L_0x002c
        L_0x002b:
            r1 = r13
        L_0x002c:
            r2 = r14 & 2
            if (r2 == 0) goto L_0x0033
            r1 = r1 | 48
            goto L_0x0043
        L_0x0033:
            r2 = r13 & 48
            if (r2 != 0) goto L_0x0043
            boolean r2 = r15.d(r10)
            if (r2 == 0) goto L_0x0040
            r2 = 32
            goto L_0x0042
        L_0x0040:
            r2 = 16
        L_0x0042:
            r1 = r1 | r2
        L_0x0043:
            r2 = r14 & 4
            if (r2 == 0) goto L_0x004a
            r1 = r1 | 384(0x180, float:5.38E-43)
            goto L_0x005a
        L_0x004a:
            r2 = r13 & 384(0x180, float:5.38E-43)
            if (r2 != 0) goto L_0x005a
            boolean r2 = r15.W(r11)
            if (r2 == 0) goto L_0x0057
            r2 = 256(0x100, float:3.59E-43)
            goto L_0x0059
        L_0x0057:
            r2 = 128(0x80, float:1.794E-43)
        L_0x0059:
            r1 = r1 | r2
        L_0x005a:
            r2 = r14 & 8
            if (r2 == 0) goto L_0x0063
            r1 = r1 | 3072(0xc00, float:4.305E-42)
        L_0x0060:
            r3 = r25
            goto L_0x0075
        L_0x0063:
            r3 = r13 & 3072(0xc00, float:4.305E-42)
            if (r3 != 0) goto L_0x0060
            r3 = r25
            boolean r4 = r15.W(r3)
            if (r4 == 0) goto L_0x0072
            r4 = 2048(0x800, float:2.87E-42)
            goto L_0x0074
        L_0x0072:
            r4 = 1024(0x400, float:1.435E-42)
        L_0x0074:
            r1 = r1 | r4
        L_0x0075:
            r4 = r13 & 24576(0x6000, float:3.4438E-41)
            if (r4 != 0) goto L_0x008e
            r4 = r14 & 16
            if (r4 != 0) goto L_0x0088
            r4 = r26
            boolean r5 = r15.W(r4)
            if (r5 == 0) goto L_0x008a
            r5 = 16384(0x4000, float:2.2959E-41)
            goto L_0x008c
        L_0x0088:
            r4 = r26
        L_0x008a:
            r5 = 8192(0x2000, float:1.14794E-41)
        L_0x008c:
            r1 = r1 | r5
            goto L_0x0090
        L_0x008e:
            r4 = r26
        L_0x0090:
            r5 = 196608(0x30000, float:2.75506E-40)
            r5 = r5 & r13
            if (r5 != 0) goto L_0x00aa
            r5 = r14 & 32
            if (r5 != 0) goto L_0x00a4
            r5 = r27
            boolean r6 = r15.W(r5)
            if (r6 == 0) goto L_0x00a6
            r6 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00a8
        L_0x00a4:
            r5 = r27
        L_0x00a6:
            r6 = 65536(0x10000, float:9.18355E-41)
        L_0x00a8:
            r1 = r1 | r6
            goto L_0x00ac
        L_0x00aa:
            r5 = r27
        L_0x00ac:
            r6 = 1572864(0x180000, float:2.204052E-39)
            r6 = r6 & r13
            if (r6 != 0) goto L_0x00c6
            r6 = r14 & 64
            if (r6 != 0) goto L_0x00c0
            r6 = r28
            boolean r7 = r15.h(r6)
            if (r7 == 0) goto L_0x00c2
            r7 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00c4
        L_0x00c0:
            r6 = r28
        L_0x00c2:
            r7 = 524288(0x80000, float:7.34684E-40)
        L_0x00c4:
            r1 = r1 | r7
            goto L_0x00c8
        L_0x00c6:
            r6 = r28
        L_0x00c8:
            r7 = 12582912(0xc00000, float:1.7632415E-38)
            r7 = r7 & r13
            if (r7 != 0) goto L_0x00e2
            r7 = r14 & 128(0x80, float:1.794E-43)
            if (r7 != 0) goto L_0x00dc
            r7 = r29
            boolean r8 = r15.h(r7)
            if (r8 == 0) goto L_0x00de
            r8 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00e0
        L_0x00dc:
            r7 = r29
        L_0x00de:
            r8 = 4194304(0x400000, float:5.877472E-39)
        L_0x00e0:
            r1 = r1 | r8
            goto L_0x00e4
        L_0x00e2:
            r7 = r29
        L_0x00e4:
            r8 = r14 & 256(0x100, float:3.59E-43)
            r16 = 100663296(0x6000000, float:2.4074124E-35)
            if (r8 == 0) goto L_0x00ed
            r1 = r1 | r16
            goto L_0x00fd
        L_0x00ed:
            r8 = r13 & r16
            if (r8 != 0) goto L_0x00fd
            boolean r8 = r15.W(r12)
            if (r8 == 0) goto L_0x00fa
            r8 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x00fc
        L_0x00fa:
            r8 = 33554432(0x2000000, float:9.403955E-38)
        L_0x00fc:
            r1 = r1 | r8
        L_0x00fd:
            r8 = 38347923(0x2492493, float:1.4777644E-37)
            r8 = r8 & r1
            r0 = 38347922(0x2492492, float:1.4777643E-37)
            if (r8 == r0) goto L_0x0108
            r0 = 1
            goto L_0x0109
        L_0x0108:
            r0 = 0
        L_0x0109:
            r8 = r1 & 1
            boolean r0 = r15.E(r0, r8)
            if (r0 == 0) goto L_0x01fe
            r15.p()
            r0 = r13 & 1
            r8 = -29360129(0xfffffffffe3fffff, float:-6.380294E37)
            r17 = -3670017(0xffffffffffc7ffff, float:NaN)
            r18 = -458753(0xfffffffffff8ffff, float:NaN)
            r19 = -57345(0xffffffffffff1fff, float:NaN)
            r7 = 6
            if (r0 == 0) goto L_0x014e
            boolean r0 = r15.J()
            if (r0 == 0) goto L_0x012c
            goto L_0x014e
        L_0x012c:
            r15.B()
            r0 = r14 & 16
            if (r0 == 0) goto L_0x0135
            r1 = r1 & r19
        L_0x0135:
            r0 = r14 & 32
            if (r0 == 0) goto L_0x013b
            r1 = r1 & r18
        L_0x013b:
            r0 = r14 & 64
            if (r0 == 0) goto L_0x0141
            r1 = r1 & r17
        L_0x0141:
            r0 = r14 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x0146
            r1 = r1 & r8
        L_0x0146:
            r18 = r29
            r0 = r3
        L_0x0149:
            r8 = r4
            r17 = r6
            r6 = r5
            goto L_0x0186
        L_0x014e:
            if (r2 == 0) goto L_0x0153
            androidx.compose.ui.Modifier$Companion r0 = androidx.compose.ui.Modifier.f15489d
            goto L_0x0154
        L_0x0153:
            r0 = r3
        L_0x0154:
            r2 = r14 & 16
            if (r2 == 0) goto L_0x0163
            int r2 = r1 >> 24
            r2 = r2 & 14
            androidx.compose.material3.TextFieldColors r2 = r12.g(r15, r2)
            r1 = r1 & r19
            r4 = r2
        L_0x0163:
            r2 = r14 & 32
            if (r2 == 0) goto L_0x0170
            androidx.compose.material3.TextFieldDefaults r2 = f11367a
            androidx.compose.ui.graphics.Shape r2 = r2.r(r15, r7)
            r1 = r1 & r18
            r5 = r2
        L_0x0170:
            r2 = r14 & 64
            if (r2 == 0) goto L_0x0179
            float r2 = f11371e
            r1 = r1 & r17
            r6 = r2
        L_0x0179:
            r2 = r14 & 128(0x80, float:1.794E-43)
            if (r2 == 0) goto L_0x0183
            float r2 = f11370d
            r1 = r1 & r8
            r18 = r2
            goto L_0x0149
        L_0x0183:
            r18 = r29
            goto L_0x0149
        L_0x0186:
            r15.U()
            boolean r2 = androidx.compose.runtime.ComposerKt.P()
            if (r2 == 0) goto L_0x0198
            r2 = -1
            java.lang.String r3 = "androidx.compose.material3.TextFieldDefaults.Container (TextFieldDefaults.kt:241)"
            r4 = -818661242(0xffffffffcf343886, float:-3.0236032E9)
            androidx.compose.runtime.ComposerKt.Y(r4, r1, r2, r3)
        L_0x0198:
            int r1 = r1 >> r7
            r1 = r1 & 14
            androidx.compose.runtime.State r1 = androidx.compose.foundation.interaction.FocusInteractionKt.a(r11, r15, r1)
            java.lang.Object r1 = r1.getValue()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            long r1 = r8.b(r9, r10, r1)
            androidx.compose.material3.tokens.MotionSchemeKeyTokens r3 = androidx.compose.material3.tokens.MotionSchemeKeyTokens.FastEffects
            androidx.compose.animation.core.FiniteAnimationSpec r3 = androidx.compose.material3.MotionSchemeKt.b(r3, r15, r7)
            r7 = 0
            r16 = 12
            r4 = 0
            r5 = 0
            r20 = r6
            r6 = r15
            r19 = r8
            r8 = r16
            androidx.compose.runtime.State r1 = androidx.compose.animation.SingleValueAnimationKt.a(r1, r3, r4, r5, r6, r7, r8)
            androidx.compose.material3.TextFieldDefaults$Container$1 r2 = new androidx.compose.material3.TextFieldDefaults$Container$1
            r2.<init>(r1)
            androidx.compose.material3.TextFieldDefaults$sam$androidx_compose_ui_graphics_ColorProducer$0 r1 = new androidx.compose.material3.TextFieldDefaults$sam$androidx_compose_ui_graphics_ColorProducer$0
            r1.<init>(r2)
            r8 = r20
            androidx.compose.ui.Modifier r1 = androidx.compose.material3.internal.TextFieldImplKt.N(r0, r1, r8)
            r16 = r0
            r0 = r21
            r2 = r22
            r3 = r23
            r4 = r24
            r5 = r19
            r6 = r8
            r7 = r17
            r8 = r18
            androidx.compose.ui.Modifier r0 = r0.t(r1, r2, r3, r4, r5, r6, r7, r8)
            r1 = 0
            androidx.compose.foundation.layout.BoxKt.a(r0, r15, r1)
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x01f5
            androidx.compose.runtime.ComposerKt.X()
        L_0x01f5:
            r5 = r16
            r8 = r17
            r6 = r19
            r7 = r20
            goto L_0x0207
        L_0x01fe:
            r15.B()
            r18 = r29
            r7 = r5
            r8 = r6
            r5 = r3
            r6 = r4
        L_0x0207:
            androidx.compose.runtime.ScopeUpdateScope r15 = r15.x()
            if (r15 == 0) goto L_0x0227
            androidx.compose.material3.c7 r4 = new androidx.compose.material3.c7
            r0 = r4
            r1 = r21
            r2 = r22
            r3 = r23
            r10 = r4
            r4 = r24
            r9 = r18
            r11 = r10
            r10 = r31
            r13 = r11
            r11 = r32
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r15.a(r13)
        L_0x0227:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.TextFieldDefaults.c(boolean, boolean, androidx.compose.foundation.interaction.InteractionSource, androidx.compose.ui.Modifier, androidx.compose.material3.TextFieldColors, androidx.compose.ui.graphics.Shape, float, float, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:107:0x0138  */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x013d  */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x0157  */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x015c  */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x0174  */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x0179  */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x0190  */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x0195  */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x01a9  */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x01bd  */
    /* JADX WARNING: Removed duplicated region for block: B:160:0x01c5  */
    /* JADX WARNING: Removed duplicated region for block: B:167:0x01dc  */
    /* JADX WARNING: Removed duplicated region for block: B:170:0x01e4  */
    /* JADX WARNING: Removed duplicated region for block: B:177:0x01f8  */
    /* JADX WARNING: Removed duplicated region for block: B:180:0x0200  */
    /* JADX WARNING: Removed duplicated region for block: B:181:0x0205  */
    /* JADX WARNING: Removed duplicated region for block: B:190:0x021e  */
    /* JADX WARNING: Removed duplicated region for block: B:191:0x0221  */
    /* JADX WARNING: Removed duplicated region for block: B:202:0x0248  */
    /* JADX WARNING: Removed duplicated region for block: B:203:0x024b  */
    /* JADX WARNING: Removed duplicated region for block: B:206:0x0254  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:287:0x04a9  */
    /* JADX WARNING: Removed duplicated region for block: B:290:0x04cc  */
    /* JADX WARNING: Removed duplicated region for block: B:292:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0089  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00a8  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00c2  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00c7  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x00e0  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x00e5  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x00fe  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0103  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x011c  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x0121  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void e(java.lang.String r42, kotlin.jvm.functions.Function2 r43, boolean r44, boolean r45, androidx.compose.ui.text.input.VisualTransformation r46, androidx.compose.foundation.interaction.InteractionSource r47, boolean r48, kotlin.jvm.functions.Function2 r49, kotlin.jvm.functions.Function2 r50, kotlin.jvm.functions.Function2 r51, kotlin.jvm.functions.Function2 r52, kotlin.jvm.functions.Function2 r53, kotlin.jvm.functions.Function2 r54, kotlin.jvm.functions.Function2 r55, androidx.compose.ui.graphics.Shape r56, androidx.compose.material3.TextFieldColors r57, androidx.compose.foundation.layout.PaddingValues r58, kotlin.jvm.functions.Function2 r59, androidx.compose.runtime.Composer r60, int r61, int r62, int r63) {
        /*
            r41 = this;
            r15 = r41
            r2 = r42
            r6 = r46
            r14 = r61
            r13 = r62
            r12 = r63
            r0 = 1806980801(0x6bb456c1, float:4.3603266E26)
            r1 = r60
            androidx.compose.runtime.Composer r0 = r1.q(r0)
            r1 = r12 & 1
            if (r1 == 0) goto L_0x001c
            r1 = r14 | 6
            goto L_0x002c
        L_0x001c:
            r1 = r14 & 6
            if (r1 != 0) goto L_0x002b
            boolean r1 = r0.W(r2)
            if (r1 == 0) goto L_0x0028
            r1 = 4
            goto L_0x0029
        L_0x0028:
            r1 = 2
        L_0x0029:
            r1 = r1 | r14
            goto L_0x002c
        L_0x002b:
            r1 = r14
        L_0x002c:
            r5 = r12 & 2
            if (r5 == 0) goto L_0x0035
            r1 = r1 | 48
        L_0x0032:
            r5 = r43
            goto L_0x0047
        L_0x0035:
            r5 = r14 & 48
            if (r5 != 0) goto L_0x0032
            r5 = r43
            boolean r9 = r0.l(r5)
            if (r9 == 0) goto L_0x0044
            r9 = 32
            goto L_0x0046
        L_0x0044:
            r9 = 16
        L_0x0046:
            r1 = r1 | r9
        L_0x0047:
            r9 = r12 & 4
            if (r9 == 0) goto L_0x0050
            r1 = r1 | 384(0x180, float:5.38E-43)
        L_0x004d:
            r9 = r44
            goto L_0x0063
        L_0x0050:
            r9 = r14 & 384(0x180, float:5.38E-43)
            if (r9 != 0) goto L_0x004d
            r9 = r44
            boolean r16 = r0.d(r9)
            if (r16 == 0) goto L_0x005f
            r16 = 256(0x100, float:3.59E-43)
            goto L_0x0061
        L_0x005f:
            r16 = 128(0x80, float:1.794E-43)
        L_0x0061:
            r1 = r1 | r16
        L_0x0063:
            r16 = r12 & 8
            r17 = 1024(0x400, float:1.435E-42)
            r18 = 2048(0x800, float:2.87E-42)
            if (r16 == 0) goto L_0x0070
            r1 = r1 | 3072(0xc00, float:4.305E-42)
        L_0x006d:
            r7 = r45
            goto L_0x0083
        L_0x0070:
            r7 = r14 & 3072(0xc00, float:4.305E-42)
            if (r7 != 0) goto L_0x006d
            r7 = r45
            boolean r16 = r0.d(r7)
            if (r16 == 0) goto L_0x007f
            r16 = r18
            goto L_0x0081
        L_0x007f:
            r16 = r17
        L_0x0081:
            r1 = r1 | r16
        L_0x0083:
            r16 = r12 & 16
            r19 = 8192(0x2000, float:1.14794E-41)
            if (r16 == 0) goto L_0x008c
            r1 = r1 | 24576(0x6000, float:3.4438E-41)
            goto L_0x009c
        L_0x008c:
            r10 = r14 & 24576(0x6000, float:3.4438E-41)
            if (r10 != 0) goto L_0x009c
            boolean r10 = r0.W(r6)
            if (r10 == 0) goto L_0x0099
            r10 = 16384(0x4000, float:2.2959E-41)
            goto L_0x009b
        L_0x0099:
            r10 = r19
        L_0x009b:
            r1 = r1 | r10
        L_0x009c:
            r10 = r12 & 32
            r21 = 65536(0x10000, float:9.18355E-41)
            if (r10 == 0) goto L_0x00a8
            r10 = 196608(0x30000, float:2.75506E-40)
            r1 = r1 | r10
        L_0x00a5:
            r10 = r47
            goto L_0x00bc
        L_0x00a8:
            r10 = 196608(0x30000, float:2.75506E-40)
            r10 = r10 & r14
            if (r10 != 0) goto L_0x00a5
            r10 = r47
            boolean r22 = r0.W(r10)
            if (r22 == 0) goto L_0x00b8
            r22 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00ba
        L_0x00b8:
            r22 = r21
        L_0x00ba:
            r1 = r1 | r22
        L_0x00bc:
            r22 = r12 & 64
            r23 = 1572864(0x180000, float:2.204052E-39)
            if (r22 == 0) goto L_0x00c7
            r1 = r1 | r23
            r11 = r48
            goto L_0x00da
        L_0x00c7:
            r23 = r14 & r23
            r11 = r48
            if (r23 != 0) goto L_0x00da
            boolean r24 = r0.d(r11)
            if (r24 == 0) goto L_0x00d6
            r24 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00d8
        L_0x00d6:
            r24 = 524288(0x80000, float:7.34684E-40)
        L_0x00d8:
            r1 = r1 | r24
        L_0x00da:
            r3 = r12 & 128(0x80, float:1.794E-43)
            r25 = 12582912(0xc00000, float:1.7632415E-38)
            if (r3 == 0) goto L_0x00e5
            r1 = r1 | r25
            r8 = r49
            goto L_0x00f8
        L_0x00e5:
            r26 = r14 & r25
            r8 = r49
            if (r26 != 0) goto L_0x00f8
            boolean r27 = r0.l(r8)
            if (r27 == 0) goto L_0x00f4
            r27 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00f6
        L_0x00f4:
            r27 = 4194304(0x400000, float:5.877472E-39)
        L_0x00f6:
            r1 = r1 | r27
        L_0x00f8:
            r4 = r12 & 256(0x100, float:3.59E-43)
            r28 = 100663296(0x6000000, float:2.4074124E-35)
            if (r4 == 0) goto L_0x0103
            r1 = r1 | r28
            r5 = r50
            goto L_0x0116
        L_0x0103:
            r29 = r14 & r28
            r5 = r50
            if (r29 != 0) goto L_0x0116
            boolean r29 = r0.l(r5)
            if (r29 == 0) goto L_0x0112
            r29 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x0114
        L_0x0112:
            r29 = 33554432(0x2000000, float:9.403955E-38)
        L_0x0114:
            r1 = r1 | r29
        L_0x0116:
            r5 = r12 & 512(0x200, float:7.175E-43)
            r29 = 805306368(0x30000000, float:4.656613E-10)
            if (r5 == 0) goto L_0x0121
            r1 = r1 | r29
            r7 = r51
            goto L_0x0134
        L_0x0121:
            r29 = r14 & r29
            r7 = r51
            if (r29 != 0) goto L_0x0134
            boolean r29 = r0.l(r7)
            if (r29 == 0) goto L_0x0130
            r29 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x0132
        L_0x0130:
            r29 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x0132:
            r1 = r1 | r29
        L_0x0134:
            r7 = r12 & 1024(0x400, float:1.435E-42)
            if (r7 == 0) goto L_0x013d
            r29 = r13 | 6
            r8 = r52
            goto L_0x0153
        L_0x013d:
            r29 = r13 & 6
            r8 = r52
            if (r29 != 0) goto L_0x0151
            boolean r29 = r0.l(r8)
            if (r29 == 0) goto L_0x014c
            r29 = 4
            goto L_0x014e
        L_0x014c:
            r29 = 2
        L_0x014e:
            r29 = r13 | r29
            goto L_0x0153
        L_0x0151:
            r29 = r13
        L_0x0153:
            r8 = r12 & 2048(0x800, float:2.87E-42)
            if (r8 == 0) goto L_0x015c
            r29 = r29 | 48
        L_0x0159:
            r9 = r29
            goto L_0x0170
        L_0x015c:
            r30 = r13 & 48
            r9 = r53
            if (r30 != 0) goto L_0x0159
            boolean r30 = r0.l(r9)
            if (r30 == 0) goto L_0x016b
            r20 = 32
            goto L_0x016d
        L_0x016b:
            r20 = 16
        L_0x016d:
            r29 = r29 | r20
            goto L_0x0159
        L_0x0170:
            r10 = r12 & 4096(0x1000, float:5.74E-42)
            if (r10 == 0) goto L_0x0179
            r9 = r9 | 384(0x180, float:5.38E-43)
        L_0x0176:
            r11 = r54
            goto L_0x018c
        L_0x0179:
            r11 = r13 & 384(0x180, float:5.38E-43)
            if (r11 != 0) goto L_0x0176
            r11 = r54
            boolean r20 = r0.l(r11)
            if (r20 == 0) goto L_0x0188
            r16 = 256(0x100, float:3.59E-43)
            goto L_0x018a
        L_0x0188:
            r16 = 128(0x80, float:1.794E-43)
        L_0x018a:
            r9 = r9 | r16
        L_0x018c:
            r11 = r12 & 8192(0x2000, float:1.14794E-41)
            if (r11 == 0) goto L_0x0195
            r9 = r9 | 3072(0xc00, float:4.305E-42)
        L_0x0192:
            r6 = r55
            goto L_0x01a5
        L_0x0195:
            r6 = r13 & 3072(0xc00, float:4.305E-42)
            if (r6 != 0) goto L_0x0192
            r6 = r55
            boolean r16 = r0.l(r6)
            if (r16 == 0) goto L_0x01a3
            r17 = r18
        L_0x01a3:
            r9 = r9 | r17
        L_0x01a5:
            r6 = r13 & 24576(0x6000, float:3.4438E-41)
            if (r6 != 0) goto L_0x01bd
            r6 = r12 & 16384(0x4000, float:2.2959E-41)
            if (r6 != 0) goto L_0x01b8
            r6 = r56
            boolean r16 = r0.W(r6)
            if (r16 == 0) goto L_0x01ba
            r19 = 16384(0x4000, float:2.2959E-41)
            goto L_0x01ba
        L_0x01b8:
            r6 = r56
        L_0x01ba:
            r9 = r9 | r19
            goto L_0x01bf
        L_0x01bd:
            r6 = r56
        L_0x01bf:
            r16 = 196608(0x30000, float:2.75506E-40)
            r16 = r13 & r16
            if (r16 != 0) goto L_0x01dc
            r16 = 32768(0x8000, float:4.5918E-41)
            r16 = r12 & r16
            r6 = r57
            if (r16 != 0) goto L_0x01d7
            boolean r16 = r0.W(r6)
            if (r16 == 0) goto L_0x01d7
            r16 = 131072(0x20000, float:1.83671E-40)
            goto L_0x01d9
        L_0x01d7:
            r16 = r21
        L_0x01d9:
            r9 = r9 | r16
            goto L_0x01de
        L_0x01dc:
            r6 = r57
        L_0x01de:
            r16 = 1572864(0x180000, float:2.204052E-39)
            r16 = r13 & r16
            if (r16 != 0) goto L_0x01f8
            r16 = r12 & r21
            r6 = r58
            if (r16 != 0) goto L_0x01f3
            boolean r16 = r0.W(r6)
            if (r16 == 0) goto L_0x01f3
            r16 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x01f5
        L_0x01f3:
            r16 = 524288(0x80000, float:7.34684E-40)
        L_0x01f5:
            r9 = r9 | r16
            goto L_0x01fa
        L_0x01f8:
            r6 = r58
        L_0x01fa:
            r16 = 131072(0x20000, float:1.83671E-40)
            r16 = r12 & r16
            if (r16 == 0) goto L_0x0205
            r9 = r9 | r25
            r6 = r59
            goto L_0x0218
        L_0x0205:
            r17 = r13 & r25
            r6 = r59
            if (r17 != 0) goto L_0x0218
            boolean r17 = r0.l(r6)
            if (r17 == 0) goto L_0x0214
            r17 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x0216
        L_0x0214:
            r17 = 4194304(0x400000, float:5.877472E-39)
        L_0x0216:
            r9 = r9 | r17
        L_0x0218:
            r17 = 262144(0x40000, float:3.67342E-40)
            r17 = r12 & r17
            if (r17 == 0) goto L_0x0221
            r9 = r9 | r28
            goto L_0x0232
        L_0x0221:
            r17 = r13 & r28
            if (r17 != 0) goto L_0x0232
            boolean r17 = r0.W(r15)
            if (r17 == 0) goto L_0x022e
            r17 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x0230
        L_0x022e:
            r17 = 33554432(0x2000000, float:9.403955E-38)
        L_0x0230:
            r9 = r9 | r17
        L_0x0232:
            r17 = 306783379(0x12492493, float:6.34695E-28)
            r6 = r1 & r17
            r13 = 306783378(0x12492492, float:6.3469493E-28)
            r17 = 0
            if (r6 != r13) goto L_0x024b
            r6 = 38347923(0x2492493, float:1.4777644E-37)
            r6 = r6 & r9
            r13 = 38347922(0x2492492, float:1.4777643E-37)
            if (r6 == r13) goto L_0x0248
            goto L_0x024b
        L_0x0248:
            r6 = r17
            goto L_0x024c
        L_0x024b:
            r6 = 1
        L_0x024c:
            r13 = r1 & 1
            boolean r6 = r0.E(r6, r13)
            if (r6 == 0) goto L_0x04a9
            r0.p()
            r6 = r14 & 1
            r13 = 6
            if (r6 == 0) goto L_0x029b
            boolean r6 = r0.J()
            if (r6 == 0) goto L_0x0263
            goto L_0x029b
        L_0x0263:
            r0.B()
            r3 = r12 & 16384(0x4000, float:2.2959E-41)
            if (r3 == 0) goto L_0x026e
            r3 = -57345(0xffffffffffff1fff, float:NaN)
            r9 = r9 & r3
        L_0x026e:
            r3 = 32768(0x8000, float:4.5918E-41)
            r3 = r3 & r12
            if (r3 == 0) goto L_0x0278
            r3 = -458753(0xfffffffffff8ffff, float:NaN)
            r9 = r9 & r3
        L_0x0278:
            r3 = r12 & r21
            if (r3 == 0) goto L_0x0280
            r3 = -3670017(0xffffffffffc7ffff, float:NaN)
            r9 = r9 & r3
        L_0x0280:
            r6 = r48
            r2 = r49
            r3 = r50
            r4 = r51
            r7 = r52
            r8 = r53
            r10 = r54
            r11 = r55
            r13 = r57
            r37 = r58
            r38 = r59
            r5 = r9
            r9 = r56
            goto L_0x0382
        L_0x029b:
            if (r22 == 0) goto L_0x02a0
            r6 = r17
            goto L_0x02a2
        L_0x02a0:
            r6 = r48
        L_0x02a2:
            if (r3 == 0) goto L_0x02a6
            r3 = 0
            goto L_0x02a8
        L_0x02a6:
            r3 = r49
        L_0x02a8:
            if (r4 == 0) goto L_0x02ac
            r4 = 0
            goto L_0x02ae
        L_0x02ac:
            r4 = r50
        L_0x02ae:
            if (r5 == 0) goto L_0x02b2
            r5 = 0
            goto L_0x02b4
        L_0x02b2:
            r5 = r51
        L_0x02b4:
            if (r7 == 0) goto L_0x02b8
            r7 = 0
            goto L_0x02ba
        L_0x02b8:
            r7 = r52
        L_0x02ba:
            if (r8 == 0) goto L_0x02be
            r8 = 0
            goto L_0x02c0
        L_0x02be:
            r8 = r53
        L_0x02c0:
            if (r10 == 0) goto L_0x02c4
            r10 = 0
            goto L_0x02c6
        L_0x02c4:
            r10 = r54
        L_0x02c6:
            if (r11 == 0) goto L_0x02ca
            r11 = 0
            goto L_0x02cc
        L_0x02ca:
            r11 = r55
        L_0x02cc:
            r2 = r12 & 16384(0x4000, float:2.2959E-41)
            if (r2 == 0) goto L_0x02dc
            androidx.compose.material3.TextFieldDefaults r2 = f11367a
            androidx.compose.ui.graphics.Shape r2 = r2.r(r0, r13)
            r19 = -57345(0xffffffffffff1fff, float:NaN)
            r9 = r9 & r19
            goto L_0x02de
        L_0x02dc:
            r2 = r56
        L_0x02de:
            r19 = 32768(0x8000, float:4.5918E-41)
            r19 = r12 & r19
            if (r19 == 0) goto L_0x02f3
            int r19 = r9 >> 24
            r13 = r19 & 14
            androidx.compose.material3.TextFieldColors r13 = r15.g(r0, r13)
            r19 = -458753(0xfffffffffff8ffff, float:NaN)
            r9 = r9 & r19
            goto L_0x02f5
        L_0x02f3:
            r13 = r57
        L_0x02f5:
            r19 = r12 & r21
            if (r19 == 0) goto L_0x033e
            if (r3 != 0) goto L_0x031a
            r19 = 15
            r21 = 0
            r22 = 0
            r23 = 0
            r25 = 0
            r28 = 0
            r48 = r41
            r49 = r22
            r50 = r23
            r51 = r25
            r52 = r28
            r53 = r19
            r54 = r21
            androidx.compose.foundation.layout.PaddingValues r19 = l(r48, r49, r50, r51, r52, r53, r54)
            goto L_0x0338
        L_0x031a:
            r19 = 15
            r21 = 0
            r22 = 0
            r23 = 0
            r25 = 0
            r28 = 0
            r48 = r41
            r49 = r22
            r50 = r23
            r51 = r25
            r52 = r28
            r53 = r19
            r54 = r21
            androidx.compose.foundation.layout.PaddingValues r19 = j(r48, r49, r50, r51, r52, r53, r54)
        L_0x0338:
            r21 = -3670017(0xffffffffffc7ffff, float:NaN)
            r9 = r9 & r21
            goto L_0x0340
        L_0x033e:
            r19 = r58
        L_0x0340:
            if (r16 == 0) goto L_0x0373
            r16 = r3
            androidx.compose.material3.TextFieldDefaults$DecorationBox$1 r3 = new androidx.compose.material3.TextFieldDefaults$DecorationBox$1
            r48 = r3
            r49 = r44
            r50 = r6
            r51 = r47
            r52 = r13
            r53 = r2
            r48.<init>(r49, r50, r51, r52, r53)
            r48 = r2
            r2 = 54
            r49 = r4
            r4 = 417908150(0x18e8c5b6, float:6.017023E-24)
            r50 = r5
            r5 = 1
            androidx.compose.runtime.internal.ComposableLambda r2 = androidx.compose.runtime.internal.ComposableLambdaKt.e(r4, r5, r3, r0, r2)
            r3 = r49
            r4 = r50
            r38 = r2
        L_0x036b:
            r5 = r9
            r2 = r16
            r37 = r19
            r9 = r48
            goto L_0x0382
        L_0x0373:
            r48 = r2
            r16 = r3
            r49 = r4
            r50 = r5
            r3 = r49
            r4 = r50
            r38 = r59
            goto L_0x036b
        L_0x0382:
            r0.U()
            boolean r16 = androidx.compose.runtime.ComposerKt.P()
            r48 = r9
            if (r16 == 0) goto L_0x0395
            r9 = 1806980801(0x6bb456c1, float:4.3603266E26)
            java.lang.String r12 = "androidx.compose.material3.TextFieldDefaults.DecorationBox (TextFieldDefaults.kt:401)"
            androidx.compose.runtime.ComposerKt.Y(r9, r1, r5, r12)
        L_0x0395:
            r9 = r1 & 14
            r12 = 4
            if (r9 != r12) goto L_0x039c
            r9 = 1
            goto L_0x039e
        L_0x039c:
            r9 = r17
        L_0x039e:
            r12 = 57344(0xe000, float:8.0356E-41)
            r12 = r12 & r1
            r14 = 16384(0x4000, float:2.2959E-41)
            if (r12 != r14) goto L_0x03a8
            r17 = 1
        L_0x03a8:
            r9 = r9 | r17
            java.lang.Object r12 = r0.g()
            if (r9 != 0) goto L_0x03c0
            androidx.compose.runtime.Composer$Companion r9 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r9 = r9.a()
            if (r12 != r9) goto L_0x03b9
            goto L_0x03c0
        L_0x03b9:
            r14 = r46
            r9 = r12
            r15 = 0
            r12 = r42
            goto L_0x03d2
        L_0x03c0:
            androidx.compose.ui.text.AnnotatedString r9 = new androidx.compose.ui.text.AnnotatedString
            r12 = r42
            r14 = 2
            r15 = 0
            r9.<init>(r12, r15, r14, r15)
            r14 = r46
            androidx.compose.ui.text.input.TransformedText r9 = r14.a(r9)
            r0.N(r9)
        L_0x03d2:
            androidx.compose.ui.text.input.TransformedText r9 = (androidx.compose.ui.text.input.TransformedText) r9
            androidx.compose.ui.text.AnnotatedString r9 = r9.b()
            java.lang.String r17 = r9.k()
            androidx.compose.material3.internal.TextFieldType r16 = androidx.compose.material3.internal.TextFieldType.Filled
            androidx.compose.material3.TextFieldLabelPosition$Attached r19 = new androidx.compose.material3.TextFieldLabelPosition$Attached
            r9 = 7
            r18 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r49 = r19
            r50 = r21
            r51 = r22
            r52 = r23
            r53 = r9
            r54 = r18
            r49.<init>(r50, r51, r52, r53, r54)
            if (r2 != 0) goto L_0x0406
            r9 = -1353131191(0xffffffffaf58db49, float:-1.9722991E-10)
            r0.X(r9)
            r0.M()
            r49 = r2
            goto L_0x0421
        L_0x0406:
            r9 = -1353131190(0xffffffffaf58db4a, float:-1.9722993E-10)
            r0.X(r9)
            androidx.compose.material3.TextFieldDefaults$DecorationBox$2$1 r9 = new androidx.compose.material3.TextFieldDefaults$DecorationBox$2$1
            r9.<init>(r2)
            r15 = 54
            r49 = r2
            r2 = 1110058497(0x422a2601, float:42.537113)
            r12 = 1
            androidx.compose.runtime.internal.ComposableLambda r2 = androidx.compose.runtime.internal.ComposableLambdaKt.e(r2, r12, r9, r0, r15)
            r0.M()
            r15 = r2
        L_0x0421:
            int r2 = r1 << 3
            r2 = r2 & 896(0x380, float:1.256E-42)
            r9 = 6
            r2 = r2 | r9
            int r9 = r1 >> 9
            r12 = 458752(0x70000, float:6.42848E-40)
            r12 = r12 & r9
            r2 = r2 | r12
            r12 = 3670016(0x380000, float:5.142788E-39)
            r12 = r12 & r9
            r2 = r2 | r12
            int r12 = r5 << 21
            r18 = 29360128(0x1c00000, float:7.052966E-38)
            r18 = r12 & r18
            r2 = r2 | r18
            r18 = 234881024(0xe000000, float:1.5777218E-30)
            r18 = r12 & r18
            r2 = r2 | r18
            r18 = 1879048192(0x70000000, float:1.58456325E29)
            r12 = r12 & r18
            r35 = r2 | r12
            int r2 = r5 >> 9
            r2 = r2 & 14
            int r12 = r1 >> 6
            r12 = r12 & 112(0x70, float:1.57E-43)
            r2 = r2 | r12
            r12 = r1 & 896(0x380, float:1.256E-42)
            r2 = r2 | r12
            r9 = r9 & 7168(0x1c00, float:1.0045E-41)
            r2 = r2 | r9
            r9 = 57344(0xe000, float:8.0356E-41)
            int r1 = r1 >> 3
            r1 = r1 & r9
            r1 = r1 | r2
            int r2 = r5 >> 3
            r9 = 458752(0x70000, float:6.42848E-40)
            r2 = r2 & r9
            r1 = r1 | r2
            int r2 = r5 << 3
            r9 = 3670016(0x380000, float:5.142788E-39)
            r2 = r2 & r9
            r1 = r1 | r2
            r2 = 29360128(0x1c00000, float:7.052966E-38)
            r2 = r2 & r5
            r36 = r1 | r2
            r18 = r43
            r20 = r15
            r21 = r3
            r22 = r4
            r23 = r7
            r24 = r8
            r25 = r10
            r26 = r11
            r27 = r45
            r28 = r44
            r29 = r6
            r30 = r47
            r31 = r37
            r32 = r13
            r33 = r38
            r34 = r0
            androidx.compose.material3.internal.TextFieldImplKt.l(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36)
            boolean r1 = androidx.compose.runtime.ComposerKt.P()
            if (r1 == 0) goto L_0x0498
            androidx.compose.runtime.ComposerKt.X()
        L_0x0498:
            r17 = r48
            r9 = r49
            r12 = r7
            r15 = r10
            r16 = r11
            r18 = r13
            r19 = r38
            r10 = r3
            r11 = r4
            r13 = r8
            r8 = r6
            goto L_0x04c6
        L_0x04a9:
            r14 = r46
            r0.B()
            r8 = r48
            r9 = r49
            r10 = r50
            r11 = r51
            r12 = r52
            r13 = r53
            r15 = r54
            r16 = r55
            r17 = r56
            r18 = r57
            r37 = r58
            r19 = r59
        L_0x04c6:
            androidx.compose.runtime.ScopeUpdateScope r7 = r0.x()
            if (r7 == 0) goto L_0x04fb
            androidx.compose.material3.b7 r6 = new androidx.compose.material3.b7
            r0 = r6
            r1 = r41
            r2 = r42
            r3 = r43
            r4 = r44
            r5 = r45
            r39 = r6
            r6 = r46
            r14 = r7
            r7 = r47
            r40 = r14
            r14 = r15
            r15 = r16
            r16 = r17
            r17 = r18
            r18 = r37
            r20 = r61
            r21 = r62
            r22 = r63
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            r1 = r39
            r0 = r40
            r0.a(r1)
        L_0x04fb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.TextFieldDefaults.e(java.lang.String, kotlin.jvm.functions.Function2, boolean, boolean, androidx.compose.ui.text.input.VisualTransformation, androidx.compose.foundation.interaction.InteractionSource, boolean, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, androidx.compose.ui.graphics.Shape, androidx.compose.material3.TextFieldColors, androidx.compose.foundation.layout.PaddingValues, kotlin.jvm.functions.Function2, androidx.compose.runtime.Composer, int, int, int):void");
    }

    public final TextFieldColors g(Composer composer, int i2) {
        if (ComposerKt.P()) {
            ComposerKt.Y(831731228, i2, -1, "androidx.compose.material3.TextFieldDefaults.colors (TextFieldDefaults.kt:478)");
        }
        TextFieldColors n2 = n(MaterialTheme.f10273a.a(composer, 6), (TextSelectionColors) composer.C(TextSelectionColorsKt.b()));
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
        return n2;
    }

    public final TextFieldColors h(long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, TextSelectionColors textSelectionColors, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37, long j38, long j39, long j40, long j41, long j42, long j43, Composer composer, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        long j44;
        long j45;
        Composer composer2 = composer;
        int i9 = i7;
        int i10 = i8;
        long f2 = (i9 & 1) != 0 ? Color.f15975b.f() : j2;
        long f3 = (i9 & 2) != 0 ? Color.f15975b.f() : j3;
        long f4 = (i9 & 4) != 0 ? Color.f15975b.f() : j4;
        long f5 = (i9 & 8) != 0 ? Color.f15975b.f() : j5;
        long f6 = (i9 & 16) != 0 ? Color.f15975b.f() : j6;
        long f7 = (i9 & 32) != 0 ? Color.f15975b.f() : j7;
        long f8 = (i9 & 64) != 0 ? Color.f15975b.f() : j8;
        long f9 = (i9 & 128) != 0 ? Color.f15975b.f() : j9;
        long f10 = (i9 & 256) != 0 ? Color.f15975b.f() : j10;
        long f11 = (i9 & 512) != 0 ? Color.f15975b.f() : j11;
        TextSelectionColors textSelectionColors2 = (i9 & 1024) != 0 ? null : textSelectionColors;
        long f12 = (i9 & 2048) != 0 ? Color.f15975b.f() : j12;
        long f13 = (i9 & 4096) != 0 ? Color.f15975b.f() : j13;
        long f14 = (i9 & 8192) != 0 ? Color.f15975b.f() : j14;
        long f15 = (i9 & 16384) != 0 ? Color.f15975b.f() : j15;
        long f16 = (i9 & 32768) != 0 ? Color.f15975b.f() : j16;
        long f17 = (i9 & 65536) != 0 ? Color.f15975b.f() : j17;
        long f18 = (i9 & 131072) != 0 ? Color.f15975b.f() : j18;
        long f19 = (i9 & 262144) != 0 ? Color.f15975b.f() : j19;
        long f20 = (i9 & 524288) != 0 ? Color.f15975b.f() : j20;
        long f21 = (i9 & 1048576) != 0 ? Color.f15975b.f() : j21;
        long f22 = (i9 & 2097152) != 0 ? Color.f15975b.f() : j22;
        long f23 = (i9 & 4194304) != 0 ? Color.f15975b.f() : j23;
        long f24 = (i9 & 8388608) != 0 ? Color.f15975b.f() : j24;
        long f25 = (i9 & 16777216) != 0 ? Color.f15975b.f() : j25;
        long f26 = (i9 & 33554432) != 0 ? Color.f15975b.f() : j26;
        long f27 = (i9 & 67108864) != 0 ? Color.f15975b.f() : j27;
        long f28 = (i9 & 134217728) != 0 ? Color.f15975b.f() : j28;
        long f29 = (i9 & 268435456) != 0 ? Color.f15975b.f() : j29;
        long f30 = (i9 & 536870912) != 0 ? Color.f15975b.f() : j30;
        long f31 = (i9 & 1073741824) != 0 ? Color.f15975b.f() : j31;
        long f32 = (i10 & 1) != 0 ? Color.f15975b.f() : j32;
        long f33 = (i10 & 2) != 0 ? Color.f15975b.f() : j33;
        long f34 = (i10 & 4) != 0 ? Color.f15975b.f() : j34;
        long f35 = (i10 & 8) != 0 ? Color.f15975b.f() : j35;
        long f36 = (i10 & 16) != 0 ? Color.f15975b.f() : j36;
        long f37 = (i10 & 32) != 0 ? Color.f15975b.f() : j37;
        long f38 = (i10 & 64) != 0 ? Color.f15975b.f() : j38;
        long f39 = (i10 & 128) != 0 ? Color.f15975b.f() : j39;
        long f40 = (i10 & 256) != 0 ? Color.f15975b.f() : j40;
        long f41 = (i10 & 512) != 0 ? Color.f15975b.f() : j41;
        long f42 = (i10 & 1024) != 0 ? Color.f15975b.f() : j42;
        long f43 = (i10 & 2048) != 0 ? Color.f15975b.f() : j43;
        if (ComposerKt.P()) {
            j44 = f7;
            j45 = f15;
            ComposerKt.Y(1513344955, i2, i3, "androidx.compose.material3.TextFieldDefaults.colors (TextFieldDefaults.kt:580)");
        } else {
            j44 = f7;
            j45 = f15;
        }
        TextFieldColors c2 = n(MaterialTheme.f10273a.a(composer2, 6), (TextSelectionColors) composer2.C(TextSelectionColorsKt.b())).c(f2, f3, f4, f5, f6, j44, f8, f9, f10, f11, textSelectionColors2, f12, f13, f14, j45, f16, f17, f18, f19, f20, f21, f22, f23, f24, f25, f26, f27, f28, f29, f30, f31, f32, f33, f34, f35, f36, f37, f38, f39, f40, f41, f42, f43);
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
        return c2;
    }

    public final PaddingValues i(float f2, float f3, float f4, float f5) {
        return PaddingKt.d(f2, f4, f3, f5);
    }

    public final PaddingValues k(float f2, float f3, float f4, float f5) {
        return PaddingKt.d(f2, f3, f4, f5);
    }

    public final TextFieldDecorator m(TextFieldState textFieldState, boolean z2, TextFieldLineLimits textFieldLineLimits, OutputTransformation outputTransformation, InteractionSource interactionSource, TextFieldLabelPosition textFieldLabelPosition, Function3 function3, Function2 function2, Function2 function22, Function2 function23, Function2 function24, Function2 function25, Function2 function26, boolean z3, TextFieldColors textFieldColors, PaddingValues paddingValues, Function2 function27, Composer composer, int i2, int i3, int i4) {
        TextFieldColors textFieldColors2;
        PaddingValues paddingValues2;
        ComposableLambda composableLambda;
        Composer composer2 = composer;
        int i5 = i3;
        int i6 = i4;
        TextFieldLabelPosition.Attached attached = (i6 & 32) != 0 ? new TextFieldLabelPosition.Attached(false, (Alignment.Horizontal) null, (Alignment.Horizontal) null, 7, (DefaultConstructorMarker) null) : textFieldLabelPosition;
        Function3 function32 = (i6 & 64) != 0 ? null : function3;
        Function2 function28 = (i6 & 128) != 0 ? null : function2;
        Function2 function29 = (i6 & 256) != 0 ? null : function22;
        Function2 function210 = (i6 & 512) != 0 ? null : function23;
        Function2 function211 = (i6 & 1024) != 0 ? null : function24;
        Function2 function212 = (i6 & 2048) != 0 ? null : function25;
        Function2 function213 = (i6 & 4096) != 0 ? null : function26;
        boolean z4 = (i6 & 8192) != 0 ? false : z3;
        if ((i6 & 16384) != 0) {
            textFieldColors2 = g(composer2, (i5 >> 21) & 14);
        } else {
            textFieldColors2 = textFieldColors;
        }
        if ((32768 & i6) != 0) {
            paddingValues2 = (function32 == null || (attached instanceof TextFieldLabelPosition.Above)) ? l(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, (Object) null) : j(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, (Object) null);
        } else {
            paddingValues2 = paddingValues;
        }
        if ((i6 & 65536) != 0) {
            composableLambda = ComposableLambdaKt.e(245572296, true, new TextFieldDefaults$decorator$1(z2, z4, interactionSource, textFieldColors2), composer2, 54);
        } else {
            boolean z5 = z2;
            InteractionSource interactionSource2 = interactionSource;
            composableLambda = function27;
        }
        if (ComposerKt.P()) {
            ComposerKt.Y(320881373, i2, i5, "androidx.compose.material3.TextFieldDefaults.decorator (TextFieldDefaults.kt:178)");
        }
        TextFieldDefaults$decorator$2 textFieldDefaults$decorator$2 = new TextFieldDefaults$decorator$2(outputTransformation, textFieldState, textFieldLineLimits, attached, function32, function28, function29, function210, function211, function212, function213, z2, z4, interactionSource, paddingValues2, textFieldColors2, composableLambda);
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
        return textFieldDefaults$decorator$2;
    }

    public final TextFieldColors n(ColorScheme colorScheme, TextSelectionColors textSelectionColors) {
        ColorScheme colorScheme2 = colorScheme;
        TextFieldColors n2 = colorScheme.n();
        if (n2 != null) {
            if (!Intrinsics.d(n2.l(), textSelectionColors)) {
                n2 = TextFieldColors.d(n2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, textSelectionColors, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1025, 2047, (Object) null);
                colorScheme2.w0(n2);
            }
            if (n2 != null) {
                return n2;
            }
        }
        FilledTextFieldTokens filledTextFieldTokens = FilledTextFieldTokens.f13329a;
        TextFieldColors textFieldColors = r3;
        TextFieldColors textFieldColors2 = new TextFieldColors(ColorSchemeKt.i(colorScheme2, filledTextFieldTokens.y()), ColorSchemeKt.i(colorScheme2, filledTextFieldTokens.D()), Color.l(ColorSchemeKt.i(colorScheme2, filledTextFieldTokens.g()), filledTextFieldTokens.h(), 0.0f, 0.0f, 0.0f, 14, (Object) null), ColorSchemeKt.i(colorScheme2, filledTextFieldTokens.s()), ColorSchemeKt.i(colorScheme2, filledTextFieldTokens.c()), ColorSchemeKt.i(colorScheme2, filledTextFieldTokens.c()), ColorSchemeKt.i(colorScheme2, filledTextFieldTokens.c()), ColorSchemeKt.i(colorScheme2, filledTextFieldTokens.c()), ColorSchemeKt.i(colorScheme2, filledTextFieldTokens.b()), ColorSchemeKt.i(colorScheme2, filledTextFieldTokens.r()), textSelectionColors, ColorSchemeKt.i(colorScheme2, filledTextFieldTokens.x()), ColorSchemeKt.i(colorScheme2, filledTextFieldTokens.a()), Color.l(ColorSchemeKt.i(colorScheme2, filledTextFieldTokens.e()), filledTextFieldTokens.f(), 0.0f, 0.0f, 0.0f, 14, (Object) null), ColorSchemeKt.i(colorScheme2, filledTextFieldTokens.q()), ColorSchemeKt.i(colorScheme2, filledTextFieldTokens.A()), ColorSchemeKt.i(colorScheme2, filledTextFieldTokens.I()), Color.l(ColorSchemeKt.i(colorScheme2, filledTextFieldTokens.k()), filledTextFieldTokens.l(), 0.0f, 0.0f, 0.0f, 14, (Object) null), ColorSchemeKt.i(colorScheme2, filledTextFieldTokens.u()), ColorSchemeKt.i(colorScheme2, filledTextFieldTokens.C()), ColorSchemeKt.i(colorScheme2, filledTextFieldTokens.K()), Color.l(ColorSchemeKt.i(colorScheme2, filledTextFieldTokens.o()), filledTextFieldTokens.p(), 0.0f, 0.0f, 0.0f, 14, (Object) null), ColorSchemeKt.i(colorScheme2, filledTextFieldTokens.w()), ColorSchemeKt.i(colorScheme2, filledTextFieldTokens.z()), ColorSchemeKt.i(colorScheme2, filledTextFieldTokens.H()), Color.l(ColorSchemeKt.i(colorScheme2, filledTextFieldTokens.i()), filledTextFieldTokens.j(), 0.0f, 0.0f, 0.0f, 14, (Object) null), ColorSchemeKt.i(colorScheme2, filledTextFieldTokens.t()), ColorSchemeKt.i(colorScheme2, filledTextFieldTokens.E()), ColorSchemeKt.i(colorScheme2, filledTextFieldTokens.E()), Color.l(ColorSchemeKt.i(colorScheme2, filledTextFieldTokens.g()), filledTextFieldTokens.h(), 0.0f, 0.0f, 0.0f, 14, (Object) null), ColorSchemeKt.i(colorScheme2, filledTextFieldTokens.E()), ColorSchemeKt.i(colorScheme2, filledTextFieldTokens.B()), ColorSchemeKt.i(colorScheme2, filledTextFieldTokens.J()), Color.l(ColorSchemeKt.i(colorScheme2, filledTextFieldTokens.m()), filledTextFieldTokens.n(), 0.0f, 0.0f, 0.0f, 14, (Object) null), ColorSchemeKt.i(colorScheme2, filledTextFieldTokens.v()), ColorSchemeKt.i(colorScheme2, filledTextFieldTokens.F()), ColorSchemeKt.i(colorScheme2, filledTextFieldTokens.F()), Color.l(ColorSchemeKt.i(colorScheme2, filledTextFieldTokens.F()), filledTextFieldTokens.h(), 0.0f, 0.0f, 0.0f, 14, (Object) null), ColorSchemeKt.i(colorScheme2, filledTextFieldTokens.F()), ColorSchemeKt.i(colorScheme2, filledTextFieldTokens.G()), ColorSchemeKt.i(colorScheme2, filledTextFieldTokens.G()), Color.l(ColorSchemeKt.i(colorScheme2, filledTextFieldTokens.G()), filledTextFieldTokens.h(), 0.0f, 0.0f, 0.0f, 14, (Object) null), ColorSchemeKt.i(colorScheme2, filledTextFieldTokens.G()), (DefaultConstructorMarker) null);
        TextFieldColors textFieldColors3 = textFieldColors;
        colorScheme2.w0(textFieldColors3);
        return textFieldColors3;
    }

    public final float o() {
        return f11371e;
    }

    public final float p() {
        return f11368b;
    }

    public final float q() {
        return f11369c;
    }

    public final Shape r(Composer composer, int i2) {
        if (ComposerKt.P()) {
            ComposerKt.Y(-1941327459, i2, -1, "androidx.compose.material3.TextFieldDefaults.<get-shape> (TextFieldDefaults.kt:68)");
        }
        Shape g2 = ShapesKt.g(FilledTextFieldTokens.f13329a.d(), composer, 6);
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
        return g2;
    }

    public final float s() {
        return f11370d;
    }

    public final Modifier t(Modifier modifier, boolean z2, boolean z3, InteractionSource interactionSource, TextFieldColors textFieldColors, Shape shape, float f2, float f3) {
        Modifier modifier2 = modifier;
        return modifier.o0(new IndicatorLineElement(z2, z3, interactionSource, textFieldColors, shape, f2, f3, (DefaultConstructorMarker) null));
    }

    public final PaddingValues u(float f2, float f3, float f4, float f5) {
        return PaddingKt.d(f2, f3, f4, f5);
    }
}
