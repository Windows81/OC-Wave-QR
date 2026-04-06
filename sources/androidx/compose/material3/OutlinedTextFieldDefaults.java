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
import androidx.compose.material3.tokens.OutlinedTextFieldTokens;
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
public final class OutlinedTextFieldDefaults {

    /* renamed from: a  reason: collision with root package name */
    public static final OutlinedTextFieldDefaults f10533a = new OutlinedTextFieldDefaults();

    /* renamed from: b  reason: collision with root package name */
    public static final float f10534b = Dp.m((float) 56);

    /* renamed from: c  reason: collision with root package name */
    public static final float f10535c = Dp.m((float) 280);

    /* renamed from: d  reason: collision with root package name */
    public static final float f10536d = Dp.m((float) 1);

    /* renamed from: e  reason: collision with root package name */
    public static final float f10537e = Dp.m((float) 2);

    public static final Unit d(OutlinedTextFieldDefaults outlinedTextFieldDefaults, boolean z2, boolean z3, InteractionSource interactionSource, Modifier modifier, TextFieldColors textFieldColors, Shape shape, float f2, float f3, int i2, int i3, Composer composer, int i4) {
        outlinedTextFieldDefaults.c(z2, z3, interactionSource, modifier, textFieldColors, shape, f2, f3, composer, RecomposeScopeImplKt.a(i2 | 1), i3);
        return Unit.f40552a;
    }

    public static final Unit f(OutlinedTextFieldDefaults outlinedTextFieldDefaults, String str, Function2 function2, boolean z2, boolean z3, VisualTransformation visualTransformation, InteractionSource interactionSource, boolean z4, Function2 function22, Function2 function23, Function2 function24, Function2 function25, Function2 function26, Function2 function27, Function2 function28, TextFieldColors textFieldColors, PaddingValues paddingValues, Function2 function29, int i2, int i3, int i4, Composer composer, int i5) {
        outlinedTextFieldDefaults.e(str, function2, z2, z3, visualTransformation, interactionSource, z4, function22, function23, function24, function25, function26, function27, function28, textFieldColors, paddingValues, function29, composer, RecomposeScopeImplKt.a(i2 | 1), RecomposeScopeImplKt.a(i3), i4);
        return Unit.f40552a;
    }

    public static /* synthetic */ PaddingValues j(OutlinedTextFieldDefaults outlinedTextFieldDefaults, float f2, float f3, float f4, float f5, int i2, Object obj) {
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
        return outlinedTextFieldDefaults.i(f2, f3, f4, f5);
    }

    /* JADX WARNING: Removed duplicated region for block: B:102:0x0111  */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x0192  */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x0212  */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x0218  */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x022b  */
    /* JADX WARNING: Removed duplicated region for block: B:149:? A[RETURN, SYNTHETIC] */
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
    public final void c(boolean r25, boolean r26, androidx.compose.foundation.interaction.InteractionSource r27, androidx.compose.ui.Modifier r28, androidx.compose.material3.TextFieldColors r29, androidx.compose.ui.graphics.Shape r30, float r31, float r32, androidx.compose.runtime.Composer r33, int r34, int r35) {
        /*
            r24 = this;
            r12 = r24
            r8 = r25
            r9 = r26
            r10 = r27
            r11 = r34
            r13 = r35
            r0 = 1035477640(0x3db82288, float:0.08990961)
            r1 = r33
            androidx.compose.runtime.Composer r14 = r1.q(r0)
            r1 = r13 & 1
            if (r1 == 0) goto L_0x001c
            r1 = r11 | 6
            goto L_0x002c
        L_0x001c:
            r1 = r11 & 6
            if (r1 != 0) goto L_0x002b
            boolean r1 = r14.d(r8)
            if (r1 == 0) goto L_0x0028
            r1 = 4
            goto L_0x0029
        L_0x0028:
            r1 = 2
        L_0x0029:
            r1 = r1 | r11
            goto L_0x002c
        L_0x002b:
            r1 = r11
        L_0x002c:
            r2 = r13 & 2
            if (r2 == 0) goto L_0x0033
            r1 = r1 | 48
            goto L_0x0043
        L_0x0033:
            r2 = r11 & 48
            if (r2 != 0) goto L_0x0043
            boolean r2 = r14.d(r9)
            if (r2 == 0) goto L_0x0040
            r2 = 32
            goto L_0x0042
        L_0x0040:
            r2 = 16
        L_0x0042:
            r1 = r1 | r2
        L_0x0043:
            r2 = r13 & 4
            if (r2 == 0) goto L_0x004a
            r1 = r1 | 384(0x180, float:5.38E-43)
            goto L_0x005a
        L_0x004a:
            r2 = r11 & 384(0x180, float:5.38E-43)
            if (r2 != 0) goto L_0x005a
            boolean r2 = r14.W(r10)
            if (r2 == 0) goto L_0x0057
            r2 = 256(0x100, float:3.59E-43)
            goto L_0x0059
        L_0x0057:
            r2 = 128(0x80, float:1.794E-43)
        L_0x0059:
            r1 = r1 | r2
        L_0x005a:
            r2 = r13 & 8
            if (r2 == 0) goto L_0x0063
            r1 = r1 | 3072(0xc00, float:4.305E-42)
        L_0x0060:
            r3 = r28
            goto L_0x0075
        L_0x0063:
            r3 = r11 & 3072(0xc00, float:4.305E-42)
            if (r3 != 0) goto L_0x0060
            r3 = r28
            boolean r4 = r14.W(r3)
            if (r4 == 0) goto L_0x0072
            r4 = 2048(0x800, float:2.87E-42)
            goto L_0x0074
        L_0x0072:
            r4 = 1024(0x400, float:1.435E-42)
        L_0x0074:
            r1 = r1 | r4
        L_0x0075:
            r4 = r11 & 24576(0x6000, float:3.4438E-41)
            if (r4 != 0) goto L_0x008e
            r4 = r13 & 16
            if (r4 != 0) goto L_0x0088
            r4 = r29
            boolean r5 = r14.W(r4)
            if (r5 == 0) goto L_0x008a
            r5 = 16384(0x4000, float:2.2959E-41)
            goto L_0x008c
        L_0x0088:
            r4 = r29
        L_0x008a:
            r5 = 8192(0x2000, float:1.14794E-41)
        L_0x008c:
            r1 = r1 | r5
            goto L_0x0090
        L_0x008e:
            r4 = r29
        L_0x0090:
            r5 = 196608(0x30000, float:2.75506E-40)
            r5 = r5 & r11
            if (r5 != 0) goto L_0x00aa
            r5 = r13 & 32
            if (r5 != 0) goto L_0x00a4
            r5 = r30
            boolean r6 = r14.W(r5)
            if (r6 == 0) goto L_0x00a6
            r6 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00a8
        L_0x00a4:
            r5 = r30
        L_0x00a6:
            r6 = 65536(0x10000, float:9.18355E-41)
        L_0x00a8:
            r1 = r1 | r6
            goto L_0x00ac
        L_0x00aa:
            r5 = r30
        L_0x00ac:
            r6 = 1572864(0x180000, float:2.204052E-39)
            r6 = r6 & r11
            if (r6 != 0) goto L_0x00c6
            r6 = r13 & 64
            if (r6 != 0) goto L_0x00c0
            r6 = r31
            boolean r7 = r14.h(r6)
            if (r7 == 0) goto L_0x00c2
            r7 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00c4
        L_0x00c0:
            r6 = r31
        L_0x00c2:
            r7 = 524288(0x80000, float:7.34684E-40)
        L_0x00c4:
            r1 = r1 | r7
            goto L_0x00c8
        L_0x00c6:
            r6 = r31
        L_0x00c8:
            r7 = 12582912(0xc00000, float:1.7632415E-38)
            r7 = r7 & r11
            if (r7 != 0) goto L_0x00e2
            r7 = r13 & 128(0x80, float:1.794E-43)
            if (r7 != 0) goto L_0x00dc
            r7 = r32
            boolean r15 = r14.h(r7)
            if (r15 == 0) goto L_0x00de
            r15 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00e0
        L_0x00dc:
            r7 = r32
        L_0x00de:
            r15 = 4194304(0x400000, float:5.877472E-39)
        L_0x00e0:
            r1 = r1 | r15
            goto L_0x00e4
        L_0x00e2:
            r7 = r32
        L_0x00e4:
            r15 = r13 & 256(0x100, float:3.59E-43)
            r16 = 100663296(0x6000000, float:2.4074124E-35)
            if (r15 == 0) goto L_0x00ed
            r1 = r1 | r16
            goto L_0x00fd
        L_0x00ed:
            r15 = r11 & r16
            if (r15 != 0) goto L_0x00fd
            boolean r15 = r14.W(r12)
            if (r15 == 0) goto L_0x00fa
            r15 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x00fc
        L_0x00fa:
            r15 = 33554432(0x2000000, float:9.403955E-38)
        L_0x00fc:
            r1 = r1 | r15
        L_0x00fd:
            r15 = 38347923(0x2492493, float:1.4777644E-37)
            r15 = r15 & r1
            r0 = 38347922(0x2492492, float:1.4777643E-37)
            if (r15 == r0) goto L_0x0108
            r0 = 1
            goto L_0x0109
        L_0x0108:
            r0 = 0
        L_0x0109:
            r15 = r1 & 1
            boolean r0 = r14.E(r0, r15)
            if (r0 == 0) goto L_0x0218
            r14.p()
            r0 = r11 & 1
            r15 = -29360129(0xfffffffffe3fffff, float:-6.380294E37)
            r17 = -3670017(0xffffffffffc7ffff, float:NaN)
            r18 = -458753(0xfffffffffff8ffff, float:NaN)
            r19 = -57345(0xffffffffffff1fff, float:NaN)
            r8 = 6
            if (r0 == 0) goto L_0x014e
            boolean r0 = r14.J()
            if (r0 == 0) goto L_0x012c
            goto L_0x014e
        L_0x012c:
            r14.B()
            r0 = r13 & 16
            if (r0 == 0) goto L_0x0135
            r1 = r1 & r19
        L_0x0135:
            r0 = r13 & 32
            if (r0 == 0) goto L_0x013b
            r1 = r1 & r18
        L_0x013b:
            r0 = r13 & 64
            if (r0 == 0) goto L_0x0141
            r1 = r1 & r17
        L_0x0141:
            r0 = r13 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x0146
            r1 = r1 & r15
        L_0x0146:
            r15 = r3
        L_0x0147:
            r22 = r6
            r23 = r7
            r7 = r4
        L_0x014c:
            r6 = r5
            goto L_0x0189
        L_0x014e:
            if (r2 == 0) goto L_0x0153
            androidx.compose.ui.Modifier$Companion r0 = androidx.compose.ui.Modifier.f15489d
            goto L_0x0154
        L_0x0153:
            r0 = r3
        L_0x0154:
            r2 = r13 & 16
            if (r2 == 0) goto L_0x0163
            int r2 = r1 >> 24
            r2 = r2 & 14
            androidx.compose.material3.TextFieldColors r2 = r12.g(r14, r2)
            r1 = r1 & r19
            r4 = r2
        L_0x0163:
            r2 = r13 & 32
            if (r2 == 0) goto L_0x0170
            androidx.compose.material3.OutlinedTextFieldDefaults r2 = f10533a
            androidx.compose.ui.graphics.Shape r2 = r2.p(r14, r8)
            r1 = r1 & r18
            r5 = r2
        L_0x0170:
            r2 = r13 & 64
            if (r2 == 0) goto L_0x0179
            float r2 = f10537e
            r1 = r1 & r17
            r6 = r2
        L_0x0179:
            r2 = r13 & 128(0x80, float:1.794E-43)
            if (r2 == 0) goto L_0x0187
            float r2 = f10536d
            r1 = r1 & r15
            r15 = r0
            r23 = r2
            r7 = r4
            r22 = r6
            goto L_0x014c
        L_0x0187:
            r15 = r0
            goto L_0x0147
        L_0x0189:
            r14.U()
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x019b
            r0 = -1
            java.lang.String r2 = "androidx.compose.material3.OutlinedTextFieldDefaults.Container (TextFieldDefaults.kt:1054)"
            r3 = 1035477640(0x3db82288, float:0.08990961)
            androidx.compose.runtime.ComposerKt.Y(r3, r1, r0, r2)
        L_0x019b:
            int r0 = r1 >> 6
            r2 = r0 & 14
            androidx.compose.runtime.State r2 = androidx.compose.foundation.interaction.FocusInteractionKt.a(r10, r14, r2)
            java.lang.Object r2 = r2.getValue()
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r5 = r2.booleanValue()
            r2 = r1 & 126(0x7e, float:1.77E-43)
            int r1 = r1 >> 3
            r1 = r1 & 7168(0x1c00, float:1.0045E-41)
            r1 = r1 | r2
            r2 = 57344(0xe000, float:8.0356E-41)
            r2 = r2 & r0
            r1 = r1 | r2
            r2 = 458752(0x70000, float:6.42848E-40)
            r0 = r0 & r2
            r16 = r1 | r0
            r0 = r25
            r1 = r26
            r2 = r5
            r3 = r7
            r4 = r22
            r8 = r5
            r5 = r23
            r10 = r6
            r6 = r14
            r11 = r7
            r7 = r16
            androidx.compose.runtime.State r0 = androidx.compose.material3.internal.TextFieldImplKt.y(r0, r1, r2, r3, r4, r5, r6, r7)
            r2 = r25
            r1 = 0
            long r3 = r11.b(r2, r9, r8)
            androidx.compose.material3.tokens.MotionSchemeKeyTokens r5 = androidx.compose.material3.tokens.MotionSchemeKeyTokens.FastEffects
            r6 = 6
            androidx.compose.animation.core.FiniteAnimationSpec r16 = androidx.compose.material3.MotionSchemeKt.b(r5, r14, r6)
            r20 = 0
            r21 = 12
            r17 = 0
            r18 = 0
            r8 = r14
            r5 = r15
            r14 = r3
            r19 = r8
            androidx.compose.runtime.State r3 = androidx.compose.animation.SingleValueAnimationKt.a(r14, r16, r17, r18, r19, r20, r21)
            java.lang.Object r0 = r0.getValue()
            androidx.compose.foundation.BorderStroke r0 = (androidx.compose.foundation.BorderStroke) r0
            androidx.compose.ui.Modifier r0 = androidx.compose.foundation.BorderKt.e(r5, r0, r10)
            androidx.compose.material3.OutlinedTextFieldDefaults$Container$1 r4 = new androidx.compose.material3.OutlinedTextFieldDefaults$Container$1
            r4.<init>(r3)
            androidx.compose.material3.TextFieldDefaults$sam$androidx_compose_ui_graphics_ColorProducer$0 r3 = new androidx.compose.material3.TextFieldDefaults$sam$androidx_compose_ui_graphics_ColorProducer$0
            r3.<init>(r4)
            androidx.compose.ui.Modifier r0 = androidx.compose.material3.internal.TextFieldImplKt.N(r0, r3, r10)
            androidx.compose.foundation.layout.BoxKt.a(r0, r8, r1)
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x0215
            androidx.compose.runtime.ComposerKt.X()
        L_0x0215:
            r7 = r10
            r6 = r11
            goto L_0x0225
        L_0x0218:
            r2 = r25
            r8 = r14
            r8.B()
            r22 = r6
            r23 = r7
            r6 = r4
            r7 = r5
            r5 = r3
        L_0x0225:
            androidx.compose.runtime.ScopeUpdateScope r14 = r8.x()
            if (r14 == 0) goto L_0x0244
            androidx.compose.material3.H4 r15 = new androidx.compose.material3.H4
            r0 = r15
            r1 = r24
            r2 = r25
            r3 = r26
            r4 = r27
            r8 = r22
            r9 = r23
            r10 = r34
            r11 = r35
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r14.a(r15)
        L_0x0244:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.OutlinedTextFieldDefaults.c(boolean, boolean, androidx.compose.foundation.interaction.InteractionSource, androidx.compose.ui.Modifier, androidx.compose.material3.TextFieldColors, androidx.compose.ui.graphics.Shape, float, float, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:105:0x0136  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x013b  */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x0155  */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x015a  */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x0172  */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x0177  */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x018b  */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x0190  */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x01a4  */
    /* JADX WARNING: Removed duplicated region for block: B:154:0x01b8  */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x01be  */
    /* JADX WARNING: Removed duplicated region for block: B:164:0x01d5  */
    /* JADX WARNING: Removed duplicated region for block: B:167:0x01dd  */
    /* JADX WARNING: Removed duplicated region for block: B:168:0x01e2  */
    /* JADX WARNING: Removed duplicated region for block: B:177:0x01f9  */
    /* JADX WARNING: Removed duplicated region for block: B:178:0x01fc  */
    /* JADX WARNING: Removed duplicated region for block: B:189:0x0224  */
    /* JADX WARNING: Removed duplicated region for block: B:190:0x0227  */
    /* JADX WARNING: Removed duplicated region for block: B:193:0x0230  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:264:0x0447  */
    /* JADX WARNING: Removed duplicated region for block: B:267:0x0466  */
    /* JADX WARNING: Removed duplicated region for block: B:269:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x008f  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00a7  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00aa  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00c0  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00c5  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x00de  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x00e3  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x00fc  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0101  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x011a  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x011f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void e(java.lang.String r41, kotlin.jvm.functions.Function2 r42, boolean r43, boolean r44, androidx.compose.ui.text.input.VisualTransformation r45, androidx.compose.foundation.interaction.InteractionSource r46, boolean r47, kotlin.jvm.functions.Function2 r48, kotlin.jvm.functions.Function2 r49, kotlin.jvm.functions.Function2 r50, kotlin.jvm.functions.Function2 r51, kotlin.jvm.functions.Function2 r52, kotlin.jvm.functions.Function2 r53, kotlin.jvm.functions.Function2 r54, androidx.compose.material3.TextFieldColors r55, androidx.compose.foundation.layout.PaddingValues r56, kotlin.jvm.functions.Function2 r57, androidx.compose.runtime.Composer r58, int r59, int r60, int r61) {
        /*
            r40 = this;
            r15 = r40
            r2 = r41
            r4 = r43
            r6 = r45
            r7 = r46
            r14 = r59
            r13 = r60
            r12 = r61
            r0 = -1732281618(0xffffffff98bf7aee, float:-4.949647E-24)
            r1 = r58
            androidx.compose.runtime.Composer r0 = r1.q(r0)
            r1 = r12 & 1
            if (r1 == 0) goto L_0x0020
            r1 = r14 | 6
            goto L_0x0030
        L_0x0020:
            r1 = r14 & 6
            if (r1 != 0) goto L_0x002f
            boolean r1 = r0.W(r2)
            if (r1 == 0) goto L_0x002c
            r1 = 4
            goto L_0x002d
        L_0x002c:
            r1 = 2
        L_0x002d:
            r1 = r1 | r14
            goto L_0x0030
        L_0x002f:
            r1 = r14
        L_0x0030:
            r8 = r12 & 2
            if (r8 == 0) goto L_0x0039
            r1 = r1 | 48
        L_0x0036:
            r8 = r42
            goto L_0x004b
        L_0x0039:
            r8 = r14 & 48
            if (r8 != 0) goto L_0x0036
            r8 = r42
            boolean r11 = r0.l(r8)
            if (r11 == 0) goto L_0x0048
            r11 = 32
            goto L_0x004a
        L_0x0048:
            r11 = 16
        L_0x004a:
            r1 = r1 | r11
        L_0x004b:
            r11 = r12 & 4
            r16 = 128(0x80, float:1.794E-43)
            r17 = 256(0x100, float:3.59E-43)
            if (r11 == 0) goto L_0x0056
            r1 = r1 | 384(0x180, float:5.38E-43)
            goto L_0x0066
        L_0x0056:
            r11 = r14 & 384(0x180, float:5.38E-43)
            if (r11 != 0) goto L_0x0066
            boolean r11 = r0.d(r4)
            if (r11 == 0) goto L_0x0063
            r11 = r17
            goto L_0x0065
        L_0x0063:
            r11 = r16
        L_0x0065:
            r1 = r1 | r11
        L_0x0066:
            r11 = r12 & 8
            r18 = 1024(0x400, float:1.435E-42)
            r19 = 2048(0x800, float:2.87E-42)
            if (r11 == 0) goto L_0x0073
            r1 = r1 | 3072(0xc00, float:4.305E-42)
        L_0x0070:
            r11 = r44
            goto L_0x0086
        L_0x0073:
            r11 = r14 & 3072(0xc00, float:4.305E-42)
            if (r11 != 0) goto L_0x0070
            r11 = r44
            boolean r20 = r0.d(r11)
            if (r20 == 0) goto L_0x0082
            r20 = r19
            goto L_0x0084
        L_0x0082:
            r20 = r18
        L_0x0084:
            r1 = r1 | r20
        L_0x0086:
            r20 = r12 & 16
            r21 = 8192(0x2000, float:1.14794E-41)
            if (r20 == 0) goto L_0x008f
            r1 = r1 | 24576(0x6000, float:3.4438E-41)
            goto L_0x009f
        L_0x008f:
            r10 = r14 & 24576(0x6000, float:3.4438E-41)
            if (r10 != 0) goto L_0x009f
            boolean r10 = r0.W(r6)
            if (r10 == 0) goto L_0x009c
            r10 = 16384(0x4000, float:2.2959E-41)
            goto L_0x009e
        L_0x009c:
            r10 = r21
        L_0x009e:
            r1 = r1 | r10
        L_0x009f:
            r10 = r12 & 32
            r22 = 131072(0x20000, float:1.83671E-40)
            r23 = 196608(0x30000, float:2.75506E-40)
            if (r10 == 0) goto L_0x00aa
            r1 = r1 | r23
            goto L_0x00ba
        L_0x00aa:
            r10 = r14 & r23
            if (r10 != 0) goto L_0x00ba
            boolean r10 = r0.W(r7)
            if (r10 == 0) goto L_0x00b7
            r10 = r22
            goto L_0x00b9
        L_0x00b7:
            r10 = 65536(0x10000, float:9.18355E-41)
        L_0x00b9:
            r1 = r1 | r10
        L_0x00ba:
            r10 = r12 & 64
            r24 = 1572864(0x180000, float:2.204052E-39)
            if (r10 == 0) goto L_0x00c5
            r1 = r1 | r24
            r3 = r47
            goto L_0x00d8
        L_0x00c5:
            r25 = r14 & r24
            r3 = r47
            if (r25 != 0) goto L_0x00d8
            boolean r26 = r0.d(r3)
            if (r26 == 0) goto L_0x00d4
            r26 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00d6
        L_0x00d4:
            r26 = 524288(0x80000, float:7.34684E-40)
        L_0x00d6:
            r1 = r1 | r26
        L_0x00d8:
            r9 = r12 & 128(0x80, float:1.794E-43)
            r27 = 12582912(0xc00000, float:1.7632415E-38)
            if (r9 == 0) goto L_0x00e3
            r1 = r1 | r27
            r5 = r48
            goto L_0x00f6
        L_0x00e3:
            r28 = r14 & r27
            r5 = r48
            if (r28 != 0) goto L_0x00f6
            boolean r29 = r0.l(r5)
            if (r29 == 0) goto L_0x00f2
            r29 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00f4
        L_0x00f2:
            r29 = 4194304(0x400000, float:5.877472E-39)
        L_0x00f4:
            r1 = r1 | r29
        L_0x00f6:
            r3 = r12 & 256(0x100, float:3.59E-43)
            r29 = 100663296(0x6000000, float:2.4074124E-35)
            if (r3 == 0) goto L_0x0101
            r1 = r1 | r29
            r5 = r49
            goto L_0x0114
        L_0x0101:
            r29 = r14 & r29
            r5 = r49
            if (r29 != 0) goto L_0x0114
            boolean r29 = r0.l(r5)
            if (r29 == 0) goto L_0x0110
            r29 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x0112
        L_0x0110:
            r29 = 33554432(0x2000000, float:9.403955E-38)
        L_0x0112:
            r1 = r1 | r29
        L_0x0114:
            r5 = r12 & 512(0x200, float:7.175E-43)
            r29 = 805306368(0x30000000, float:4.656613E-10)
            if (r5 == 0) goto L_0x011f
            r1 = r1 | r29
            r8 = r50
            goto L_0x0132
        L_0x011f:
            r29 = r14 & r29
            r8 = r50
            if (r29 != 0) goto L_0x0132
            boolean r29 = r0.l(r8)
            if (r29 == 0) goto L_0x012e
            r29 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x0130
        L_0x012e:
            r29 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x0130:
            r1 = r1 | r29
        L_0x0132:
            r8 = r12 & 1024(0x400, float:1.435E-42)
            if (r8 == 0) goto L_0x013b
            r29 = r13 | 6
            r11 = r51
            goto L_0x0151
        L_0x013b:
            r29 = r13 & 6
            r11 = r51
            if (r29 != 0) goto L_0x014f
            boolean r29 = r0.l(r11)
            if (r29 == 0) goto L_0x014a
            r29 = 4
            goto L_0x014c
        L_0x014a:
            r29 = 2
        L_0x014c:
            r29 = r13 | r29
            goto L_0x0151
        L_0x014f:
            r29 = r13
        L_0x0151:
            r11 = r12 & 2048(0x800, float:2.87E-42)
            if (r11 == 0) goto L_0x015a
            r29 = r29 | 48
        L_0x0157:
            r6 = r29
            goto L_0x016e
        L_0x015a:
            r30 = r13 & 48
            r6 = r52
            if (r30 != 0) goto L_0x0157
            boolean r30 = r0.l(r6)
            if (r30 == 0) goto L_0x0169
            r20 = 32
            goto L_0x016b
        L_0x0169:
            r20 = 16
        L_0x016b:
            r29 = r29 | r20
            goto L_0x0157
        L_0x016e:
            r2 = r12 & 4096(0x1000, float:5.74E-42)
            if (r2 == 0) goto L_0x0177
            r6 = r6 | 384(0x180, float:5.38E-43)
        L_0x0174:
            r4 = r53
            goto L_0x0187
        L_0x0177:
            r4 = r13 & 384(0x180, float:5.38E-43)
            if (r4 != 0) goto L_0x0174
            r4 = r53
            boolean r20 = r0.l(r4)
            if (r20 == 0) goto L_0x0185
            r16 = r17
        L_0x0185:
            r6 = r6 | r16
        L_0x0187:
            r4 = r12 & 8192(0x2000, float:1.14794E-41)
            if (r4 == 0) goto L_0x0190
            r6 = r6 | 3072(0xc00, float:4.305E-42)
        L_0x018d:
            r7 = r54
            goto L_0x01a0
        L_0x0190:
            r7 = r13 & 3072(0xc00, float:4.305E-42)
            if (r7 != 0) goto L_0x018d
            r7 = r54
            boolean r16 = r0.l(r7)
            if (r16 == 0) goto L_0x019e
            r18 = r19
        L_0x019e:
            r6 = r6 | r18
        L_0x01a0:
            r7 = r13 & 24576(0x6000, float:3.4438E-41)
            if (r7 != 0) goto L_0x01b8
            r7 = r12 & 16384(0x4000, float:2.2959E-41)
            if (r7 != 0) goto L_0x01b3
            r7 = r55
            boolean r16 = r0.W(r7)
            if (r16 == 0) goto L_0x01b5
            r21 = 16384(0x4000, float:2.2959E-41)
            goto L_0x01b5
        L_0x01b3:
            r7 = r55
        L_0x01b5:
            r6 = r6 | r21
            goto L_0x01ba
        L_0x01b8:
            r7 = r55
        L_0x01ba:
            r16 = r13 & r23
            if (r16 != 0) goto L_0x01d5
            r16 = 32768(0x8000, float:4.5918E-41)
            r16 = r12 & r16
            r7 = r56
            if (r16 != 0) goto L_0x01d0
            boolean r16 = r0.W(r7)
            if (r16 == 0) goto L_0x01d0
            r16 = r22
            goto L_0x01d2
        L_0x01d0:
            r16 = 65536(0x10000, float:9.18355E-41)
        L_0x01d2:
            r6 = r6 | r16
            goto L_0x01d7
        L_0x01d5:
            r7 = r56
        L_0x01d7:
            r16 = 65536(0x10000, float:9.18355E-41)
            r16 = r12 & r16
            if (r16 == 0) goto L_0x01e2
            r6 = r6 | r24
            r7 = r57
            goto L_0x01f5
        L_0x01e2:
            r17 = r13 & r24
            r7 = r57
            if (r17 != 0) goto L_0x01f5
            boolean r17 = r0.l(r7)
            if (r17 == 0) goto L_0x01f1
            r17 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x01f3
        L_0x01f1:
            r17 = 524288(0x80000, float:7.34684E-40)
        L_0x01f3:
            r6 = r6 | r17
        L_0x01f5:
            r17 = r12 & r22
            if (r17 == 0) goto L_0x01fc
            r6 = r6 | r27
            goto L_0x020d
        L_0x01fc:
            r17 = r13 & r27
            if (r17 != 0) goto L_0x020d
            boolean r17 = r0.W(r15)
            if (r17 == 0) goto L_0x0209
            r17 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x020b
        L_0x0209:
            r17 = 4194304(0x400000, float:5.877472E-39)
        L_0x020b:
            r6 = r6 | r17
        L_0x020d:
            r17 = 306783379(0x12492493, float:6.34695E-28)
            r7 = r1 & r17
            r13 = 306783378(0x12492492, float:6.3469493E-28)
            r17 = 0
            r15 = 1
            if (r7 != r13) goto L_0x0227
            r7 = 4793491(0x492493, float:6.717112E-39)
            r7 = r7 & r6
            r13 = 4793490(0x492492, float:6.71711E-39)
            if (r7 == r13) goto L_0x0224
            goto L_0x0227
        L_0x0224:
            r7 = r17
            goto L_0x0228
        L_0x0227:
            r7 = r15
        L_0x0228:
            r13 = r1 & 1
            boolean r7 = r0.E(r7, r13)
            if (r7 == 0) goto L_0x0447
            r0.p()
            r7 = r14 & 1
            if (r7 == 0) goto L_0x026e
            boolean r7 = r0.J()
            if (r7 == 0) goto L_0x023e
            goto L_0x026e
        L_0x023e:
            r0.B()
            r2 = r12 & 16384(0x4000, float:2.2959E-41)
            if (r2 == 0) goto L_0x0249
            r2 = -57345(0xffffffffffff1fff, float:NaN)
            r6 = r6 & r2
        L_0x0249:
            r2 = 32768(0x8000, float:4.5918E-41)
            r2 = r2 & r12
            if (r2 == 0) goto L_0x0253
            r2 = -458753(0xfffffffffff8ffff, float:NaN)
            r6 = r6 & r2
        L_0x0253:
            r13 = r40
            r7 = r47
            r9 = r48
            r2 = r49
            r5 = r50
            r3 = r51
            r10 = r52
            r4 = r53
            r11 = r55
            r15 = r56
            r37 = r57
            r8 = r6
            r6 = r54
            goto L_0x0320
        L_0x026e:
            if (r10 == 0) goto L_0x0273
            r7 = r17
            goto L_0x0275
        L_0x0273:
            r7 = r47
        L_0x0275:
            if (r9 == 0) goto L_0x0279
            r9 = 0
            goto L_0x027b
        L_0x0279:
            r9 = r48
        L_0x027b:
            if (r3 == 0) goto L_0x027f
            r3 = 0
            goto L_0x0281
        L_0x027f:
            r3 = r49
        L_0x0281:
            if (r5 == 0) goto L_0x0285
            r5 = 0
            goto L_0x0287
        L_0x0285:
            r5 = r50
        L_0x0287:
            if (r8 == 0) goto L_0x028b
            r8 = 0
            goto L_0x028d
        L_0x028b:
            r8 = r51
        L_0x028d:
            if (r11 == 0) goto L_0x0291
            r10 = 0
            goto L_0x0293
        L_0x0291:
            r10 = r52
        L_0x0293:
            if (r2 == 0) goto L_0x0297
            r2 = 0
            goto L_0x0299
        L_0x0297:
            r2 = r53
        L_0x0299:
            if (r4 == 0) goto L_0x029d
            r4 = 0
            goto L_0x029f
        L_0x029d:
            r4 = r54
        L_0x029f:
            r11 = r12 & 16384(0x4000, float:2.2959E-41)
            if (r11 == 0) goto L_0x02b3
            int r11 = r6 >> 21
            r11 = r11 & 14
            r13 = r40
            androidx.compose.material3.TextFieldColors r11 = r13.g(r0, r11)
            r18 = -57345(0xffffffffffff1fff, float:NaN)
            r6 = r6 & r18
            goto L_0x02b7
        L_0x02b3:
            r13 = r40
            r11 = r55
        L_0x02b7:
            r18 = 32768(0x8000, float:4.5918E-41)
            r18 = r12 & r18
            if (r18 == 0) goto L_0x02e2
            r18 = 15
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r47 = r40
            r48 = r20
            r49 = r21
            r50 = r22
            r51 = r23
            r52 = r18
            r53 = r19
            androidx.compose.foundation.layout.PaddingValues r18 = j(r47, r48, r49, r50, r51, r52, r53)
            r19 = -458753(0xfffffffffff8ffff, float:NaN)
            r6 = r6 & r19
            goto L_0x02e4
        L_0x02e2:
            r18 = r56
        L_0x02e4:
            if (r16 == 0) goto L_0x030f
            androidx.compose.material3.OutlinedTextFieldDefaults$DecorationBox$1 r15 = new androidx.compose.material3.OutlinedTextFieldDefaults$DecorationBox$1
            r47 = r4
            r48 = r8
            r4 = r43
            r8 = r46
            r15.<init>(r4, r7, r8, r11)
            r49 = r2
            r2 = 54
            r19 = r3
            r3 = -896270173(0xffffffffca9400a3, float:-4849745.5)
            r4 = 1
            androidx.compose.runtime.internal.ComposableLambda r2 = androidx.compose.runtime.internal.ComposableLambdaKt.e(r3, r4, r15, r0, r2)
            r3 = r48
            r4 = r49
            r37 = r2
        L_0x0307:
            r8 = r6
            r15 = r18
            r2 = r19
            r6 = r47
            goto L_0x0320
        L_0x030f:
            r49 = r2
            r19 = r3
            r47 = r4
            r48 = r8
            r8 = r46
            r3 = r48
            r4 = r49
            r37 = r57
            goto L_0x0307
        L_0x0320:
            r0.U()
            boolean r18 = androidx.compose.runtime.ComposerKt.P()
            if (r18 == 0) goto L_0x0331
            r12 = -1732281618(0xffffffff98bf7aee, float:-4.949647E-24)
            java.lang.String r13 = "androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox (TextFieldDefaults.kt:1168)"
            androidx.compose.runtime.ComposerKt.Y(r12, r1, r8, r13)
        L_0x0331:
            r12 = r1 & 14
            r13 = 4
            if (r12 != r13) goto L_0x0338
            r12 = 1
            goto L_0x033a
        L_0x0338:
            r12 = r17
        L_0x033a:
            r13 = 57344(0xe000, float:8.0356E-41)
            r13 = r13 & r1
            r14 = 16384(0x4000, float:2.2959E-41)
            if (r13 != r14) goto L_0x0344
            r17 = 1
        L_0x0344:
            r12 = r12 | r17
            java.lang.Object r13 = r0.g()
            if (r12 != 0) goto L_0x035e
            androidx.compose.runtime.Composer$Companion r12 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r12 = r12.a()
            if (r13 != r12) goto L_0x0355
            goto L_0x035e
        L_0x0355:
            r14 = r45
            r47 = r11
            r12 = r13
            r11 = 0
            r13 = r41
            goto L_0x0372
        L_0x035e:
            androidx.compose.ui.text.AnnotatedString r12 = new androidx.compose.ui.text.AnnotatedString
            r13 = r41
            r47 = r11
            r11 = 0
            r14 = 2
            r12.<init>(r13, r11, r14, r11)
            r14 = r45
            androidx.compose.ui.text.input.TransformedText r12 = r14.a(r12)
            r0.N(r12)
        L_0x0372:
            androidx.compose.ui.text.input.TransformedText r12 = (androidx.compose.ui.text.input.TransformedText) r12
            androidx.compose.ui.text.AnnotatedString r12 = r12.b()
            java.lang.String r17 = r12.k()
            androidx.compose.material3.internal.TextFieldType r12 = androidx.compose.material3.internal.TextFieldType.Outlined
            androidx.compose.material3.TextFieldLabelPosition$Attached r19 = new androidx.compose.material3.TextFieldLabelPosition$Attached
            r18 = 7
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r48 = r19
            r49 = r21
            r50 = r22
            r51 = r23
            r52 = r18
            r53 = r20
            r48.<init>(r49, r50, r51, r52, r53)
            if (r9 != 0) goto L_0x03a9
            r11 = 1927058812(0x72dc957c, float:8.7382295E30)
            r0.X(r11)
            r0.M()
            r48 = r9
            r20 = 0
            goto L_0x03c5
        L_0x03a9:
            r11 = 1927058813(0x72dc957d, float:8.73823E30)
            r0.X(r11)
            androidx.compose.material3.OutlinedTextFieldDefaults$DecorationBox$2$1 r11 = new androidx.compose.material3.OutlinedTextFieldDefaults$DecorationBox$2$1
            r11.<init>(r9)
            r48 = r9
            r9 = 54
            r13 = -1459717586(0xffffffffa8fe7a2e, float:-2.8252652E-14)
            r14 = 1
            androidx.compose.runtime.internal.ComposableLambda r9 = androidx.compose.runtime.internal.ComposableLambdaKt.e(r13, r14, r11, r0, r9)
            r0.M()
            r20 = r9
        L_0x03c5:
            int r9 = r1 << 3
            r9 = r9 & 896(0x380, float:1.256E-42)
            r9 = r9 | 6
            int r11 = r1 >> 9
            r13 = 458752(0x70000, float:6.42848E-40)
            r13 = r13 & r11
            r9 = r9 | r13
            r13 = 3670016(0x380000, float:5.142788E-39)
            r13 = r13 & r11
            r9 = r9 | r13
            int r13 = r8 << 21
            r14 = 29360128(0x1c00000, float:7.052966E-38)
            r14 = r14 & r13
            r9 = r9 | r14
            r14 = 234881024(0xe000000, float:1.5777218E-30)
            r14 = r14 & r13
            r9 = r9 | r14
            r14 = 1879048192(0x70000000, float:1.58456325E29)
            r13 = r13 & r14
            r35 = r9 | r13
            int r9 = r8 >> 9
            r9 = r9 & 14
            int r13 = r1 >> 6
            r13 = r13 & 112(0x70, float:1.57E-43)
            r9 = r9 | r13
            r13 = r1 & 896(0x380, float:1.256E-42)
            r9 = r9 | r13
            r11 = r11 & 7168(0x1c00, float:1.0045E-41)
            r9 = r9 | r11
            int r1 = r1 >> 3
            r11 = 57344(0xe000, float:8.0356E-41)
            r1 = r1 & r11
            r1 = r1 | r9
            r9 = 458752(0x70000, float:6.42848E-40)
            r9 = r9 & r8
            r1 = r1 | r9
            int r9 = r8 << 6
            r11 = 3670016(0x380000, float:5.142788E-39)
            r9 = r9 & r11
            r1 = r1 | r9
            int r8 = r8 << 3
            r9 = 29360128(0x1c00000, float:7.052966E-38)
            r8 = r8 & r9
            r36 = r1 | r8
            r16 = r12
            r18 = r42
            r21 = r2
            r22 = r5
            r23 = r3
            r24 = r10
            r25 = r4
            r26 = r6
            r27 = r44
            r28 = r43
            r29 = r7
            r30 = r46
            r31 = r15
            r32 = r47
            r33 = r37
            r34 = r0
            androidx.compose.material3.internal.TextFieldImplKt.l(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36)
            boolean r1 = androidx.compose.runtime.ComposerKt.P()
            if (r1 == 0) goto L_0x0437
            androidx.compose.runtime.ComposerKt.X()
        L_0x0437:
            r16 = r47
            r9 = r48
            r12 = r3
            r14 = r4
            r11 = r5
            r8 = r7
            r13 = r10
            r17 = r15
            r18 = r37
            r10 = r2
            r15 = r6
            goto L_0x0460
        L_0x0447:
            r0.B()
            r8 = r47
            r9 = r48
            r10 = r49
            r11 = r50
            r12 = r51
            r13 = r52
            r14 = r53
            r15 = r54
            r16 = r55
            r17 = r56
            r18 = r57
        L_0x0460:
            androidx.compose.runtime.ScopeUpdateScope r7 = r0.x()
            if (r7 == 0) goto L_0x048b
            androidx.compose.material3.I4 r6 = new androidx.compose.material3.I4
            r0 = r6
            r1 = r40
            r2 = r41
            r3 = r42
            r4 = r43
            r5 = r44
            r38 = r6
            r6 = r45
            r39 = r7
            r7 = r46
            r19 = r59
            r20 = r60
            r21 = r61
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            r1 = r38
            r0 = r39
            r0.a(r1)
        L_0x048b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.OutlinedTextFieldDefaults.e(java.lang.String, kotlin.jvm.functions.Function2, boolean, boolean, androidx.compose.ui.text.input.VisualTransformation, androidx.compose.foundation.interaction.InteractionSource, boolean, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, androidx.compose.material3.TextFieldColors, androidx.compose.foundation.layout.PaddingValues, kotlin.jvm.functions.Function2, androidx.compose.runtime.Composer, int, int, int):void");
    }

    public final TextFieldColors g(Composer composer, int i2) {
        if (ComposerKt.P()) {
            ComposerKt.Y(-471651810, i2, -1, "androidx.compose.material3.OutlinedTextFieldDefaults.colors (TextFieldDefaults.kt:1215)");
        }
        TextFieldColors l2 = l(MaterialTheme.f10273a.a(composer, 6), composer, (i2 << 3) & 112);
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
        return l2;
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
        long f16 = (32768 & i9) != 0 ? Color.f15975b.f() : j16;
        long f17 = (65536 & i9) != 0 ? Color.f15975b.f() : j17;
        long f18 = (131072 & i9) != 0 ? Color.f15975b.f() : j18;
        long f19 = (262144 & i9) != 0 ? Color.f15975b.f() : j19;
        long f20 = (524288 & i9) != 0 ? Color.f15975b.f() : j20;
        long f21 = (1048576 & i9) != 0 ? Color.f15975b.f() : j21;
        long f22 = (2097152 & i9) != 0 ? Color.f15975b.f() : j22;
        long f23 = (4194304 & i9) != 0 ? Color.f15975b.f() : j23;
        long f24 = (8388608 & i9) != 0 ? Color.f15975b.f() : j24;
        long f25 = (16777216 & i9) != 0 ? Color.f15975b.f() : j25;
        long f26 = (33554432 & i9) != 0 ? Color.f15975b.f() : j26;
        long f27 = (67108864 & i9) != 0 ? Color.f15975b.f() : j27;
        long f28 = (134217728 & i9) != 0 ? Color.f15975b.f() : j28;
        long f29 = (268435456 & i9) != 0 ? Color.f15975b.f() : j29;
        long f30 = (536870912 & i9) != 0 ? Color.f15975b.f() : j30;
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
            j44 = f43;
            j45 = f7;
            ComposerKt.Y(1767617725, i2, i3, "androidx.compose.material3.OutlinedTextFieldDefaults.colors (TextFieldDefaults.kt:1317)");
        } else {
            j44 = f43;
            j45 = f7;
        }
        TextFieldColors c2 = l(MaterialTheme.f10273a.a(composer2, 6), composer2, (i6 >> 6) & 112).c(f2, f3, f4, f5, f6, j45, f8, f9, f10, f11, textSelectionColors2, f12, f13, f14, f15, f16, f17, f18, f19, f20, f21, f22, f23, f24, f25, f26, f27, f28, f29, f30, f31, f32, f33, f34, f35, f36, f37, f38, f39, f40, f41, f42, j44);
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
        return c2;
    }

    public final PaddingValues i(float f2, float f3, float f4, float f5) {
        return PaddingKt.d(f2, f3, f4, f5);
    }

    public final TextFieldDecorator k(TextFieldState textFieldState, boolean z2, TextFieldLineLimits textFieldLineLimits, OutputTransformation outputTransformation, InteractionSource interactionSource, TextFieldLabelPosition textFieldLabelPosition, Function3 function3, Function2 function2, Function2 function22, Function2 function23, Function2 function24, Function2 function25, Function2 function26, boolean z3, TextFieldColors textFieldColors, PaddingValues paddingValues, Function2 function27, Composer composer, int i2, int i3, int i4) {
        TextFieldColors textFieldColors2;
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
        PaddingValues j2 = (32768 & i6) != 0 ? j(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, (Object) null) : paddingValues;
        if ((i6 & 65536) != 0) {
            composableLambda = ComposableLambdaKt.e(-163468598, true, new OutlinedTextFieldDefaults$decorator$1(z2, z4, interactionSource, textFieldColors2), composer2, 54);
        } else {
            boolean z5 = z2;
            InteractionSource interactionSource2 = interactionSource;
            composableLambda = function27;
        }
        if (ComposerKt.P()) {
            ComposerKt.Y(-449059361, i2, i5, "androidx.compose.material3.OutlinedTextFieldDefaults.decorator (TextFieldDefaults.kt:993)");
        }
        OutlinedTextFieldDefaults$decorator$2 outlinedTextFieldDefaults$decorator$2 = new OutlinedTextFieldDefaults$decorator$2(outputTransformation, textFieldState, textFieldLineLimits, attached, function32, function28, function29, function210, function211, function212, function213, z2, z4, interactionSource, j2, textFieldColors2, composableLambda);
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
        return outlinedTextFieldDefaults$decorator$2;
    }

    public final TextFieldColors l(ColorScheme colorScheme, Composer composer, int i2) {
        TextFieldColors textFieldColors;
        ColorScheme colorScheme2 = colorScheme;
        Composer composer2 = composer;
        if (ComposerKt.P()) {
            ComposerKt.Y(-292363577, i2, -1, "androidx.compose.material3.OutlinedTextFieldDefaults.<get-defaultOutlinedTextFieldColors> (TextFieldDefaults.kt:1365)");
        }
        TextFieldColors j2 = colorScheme.j();
        if (j2 == null) {
            composer2.X(390452338);
            composer.M();
            textFieldColors = null;
        } else {
            composer2.X(390452339);
            TextSelectionColors textSelectionColors = (TextSelectionColors) composer2.C(TextSelectionColorsKt.b());
            if (!Intrinsics.d(j2.l(), textSelectionColors)) {
                j2 = TextFieldColors.d(j2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, textSelectionColors, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1025, 2047, (Object) null);
                colorScheme2.s0(j2);
            }
            composer.M();
            textFieldColors = j2;
        }
        if (textFieldColors == null) {
            composer2.X(-1788321191);
            OutlinedTextFieldTokens outlinedTextFieldTokens = OutlinedTextFieldTokens.f13799a;
            long i3 = ColorSchemeKt.i(colorScheme2, outlinedTextFieldTokens.p());
            long i4 = ColorSchemeKt.i(colorScheme2, outlinedTextFieldTokens.v());
            long l2 = Color.l(ColorSchemeKt.i(colorScheme2, outlinedTextFieldTokens.c()), 0.38f, 0.0f, 0.0f, 0.0f, 14, (Object) null);
            long i5 = ColorSchemeKt.i(colorScheme2, outlinedTextFieldTokens.j());
            Color.Companion companion = Color.f15975b;
            TextFieldColors textFieldColors2 = r3;
            TextFieldColors textFieldColors3 = new TextFieldColors(i3, i4, l2, i5, companion.e(), companion.e(), companion.e(), companion.e(), ColorSchemeKt.i(colorScheme2, outlinedTextFieldTokens.a()), ColorSchemeKt.i(colorScheme2, outlinedTextFieldTokens.i()), (TextSelectionColors) composer2.C(TextSelectionColorsKt.b()), ColorSchemeKt.i(colorScheme2, outlinedTextFieldTokens.s()), ColorSchemeKt.i(colorScheme2, outlinedTextFieldTokens.B()), Color.l(ColorSchemeKt.i(colorScheme2, outlinedTextFieldTokens.f()), 0.12f, 0.0f, 0.0f, 0.0f, 14, (Object) null), ColorSchemeKt.i(colorScheme2, outlinedTextFieldTokens.m()), ColorSchemeKt.i(colorScheme2, outlinedTextFieldTokens.r()), ColorSchemeKt.i(colorScheme2, outlinedTextFieldTokens.A()), Color.l(ColorSchemeKt.i(colorScheme2, outlinedTextFieldTokens.e()), 0.38f, 0.0f, 0.0f, 0.0f, 14, (Object) null), ColorSchemeKt.i(colorScheme2, outlinedTextFieldTokens.l()), ColorSchemeKt.i(colorScheme2, outlinedTextFieldTokens.u()), ColorSchemeKt.i(colorScheme2, outlinedTextFieldTokens.D()), Color.l(ColorSchemeKt.i(colorScheme2, outlinedTextFieldTokens.h()), 0.38f, 0.0f, 0.0f, 0.0f, 14, (Object) null), ColorSchemeKt.i(colorScheme2, outlinedTextFieldTokens.o()), ColorSchemeKt.i(colorScheme2, outlinedTextFieldTokens.q()), ColorSchemeKt.i(colorScheme2, outlinedTextFieldTokens.z()), Color.l(ColorSchemeKt.i(colorScheme2, outlinedTextFieldTokens.d()), 0.38f, 0.0f, 0.0f, 0.0f, 14, (Object) null), ColorSchemeKt.i(colorScheme2, outlinedTextFieldTokens.k()), ColorSchemeKt.i(colorScheme2, outlinedTextFieldTokens.w()), ColorSchemeKt.i(colorScheme2, outlinedTextFieldTokens.w()), Color.l(ColorSchemeKt.i(colorScheme2, outlinedTextFieldTokens.c()), 0.38f, 0.0f, 0.0f, 0.0f, 14, (Object) null), ColorSchemeKt.i(colorScheme2, outlinedTextFieldTokens.w()), ColorSchemeKt.i(colorScheme2, outlinedTextFieldTokens.t()), ColorSchemeKt.i(colorScheme2, outlinedTextFieldTokens.C()), Color.l(ColorSchemeKt.i(colorScheme2, outlinedTextFieldTokens.g()), 0.38f, 0.0f, 0.0f, 0.0f, 14, (Object) null), ColorSchemeKt.i(colorScheme2, outlinedTextFieldTokens.n()), ColorSchemeKt.i(colorScheme2, outlinedTextFieldTokens.x()), ColorSchemeKt.i(colorScheme2, outlinedTextFieldTokens.x()), Color.l(ColorSchemeKt.i(colorScheme2, outlinedTextFieldTokens.x()), 0.38f, 0.0f, 0.0f, 0.0f, 14, (Object) null), ColorSchemeKt.i(colorScheme2, outlinedTextFieldTokens.x()), ColorSchemeKt.i(colorScheme2, outlinedTextFieldTokens.y()), ColorSchemeKt.i(colorScheme2, outlinedTextFieldTokens.y()), Color.l(ColorSchemeKt.i(colorScheme2, outlinedTextFieldTokens.y()), 0.38f, 0.0f, 0.0f, 0.0f, 14, (Object) null), ColorSchemeKt.i(colorScheme2, outlinedTextFieldTokens.y()), (DefaultConstructorMarker) null);
            textFieldColors = textFieldColors2;
            colorScheme2.s0(textFieldColors);
            composer.M();
        } else {
            composer2.X(-1788515437);
            composer.M();
        }
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
        return textFieldColors;
    }

    public final float m() {
        return f10537e;
    }

    public final float n() {
        return f10534b;
    }

    public final float o() {
        return f10535c;
    }

    public final Shape p(Composer composer, int i2) {
        if (ComposerKt.P()) {
            ComposerKt.Y(-1066756961, i2, -1, "androidx.compose.material3.OutlinedTextFieldDefaults.<get-shape> (TextFieldDefaults.kt:887)");
        }
        Shape g2 = ShapesKt.g(OutlinedTextFieldTokens.f13799a.b(), composer, 6);
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
        return g2;
    }

    public final float q() {
        return f10536d;
    }
}
