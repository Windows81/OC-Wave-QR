package androidx.compose.material;

import androidx.compose.foundation.interaction.FocusInteractionKt;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.LayoutIdParentData;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.input.TransformedText;
import androidx.compose.ui.text.input.VisualTransformation;
import androidx.compose.ui.unit.Dp;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
public final class TextFieldImplKt {

    /* renamed from: a  reason: collision with root package name */
    public static final float f8762a = Dp.m((float) 16);

    /* renamed from: b  reason: collision with root package name */
    public static final float f8763b = Dp.m((float) 12);

    public static final void a(TextFieldType textFieldType, String str, Function2 function2, VisualTransformation visualTransformation, Function2 function22, Function2 function23, Function2 function24, Function2 function25, boolean z2, boolean z3, boolean z4, InteractionSource interactionSource, PaddingValues paddingValues, Shape shape, TextFieldColors textFieldColors, Function2 function26, Composer composer, int i2, int i3) {
        int i4;
        int i5;
        Composer composer2;
        VisualTransformation visualTransformation2 = visualTransformation;
        Function2 function27 = function22;
        boolean z5 = z3;
        boolean z6 = z4;
        InteractionSource interactionSource2 = interactionSource;
        TextFieldColors textFieldColors2 = textFieldColors;
        int i6 = i2;
        int i7 = i3;
        Composer q2 = composer.q(341783750);
        TextFieldType textFieldType2 = textFieldType;
        if ((i6 & 6) == 0) {
            i4 = (q2.W(textFieldType2) ? 4 : 2) | i6;
        } else {
            i4 = i6;
        }
        if ((i6 & 48) == 0) {
            i4 |= q2.W(str) ? 32 : 16;
        } else {
            String str2 = str;
        }
        int i8 = 128;
        if ((i6 & 384) == 0) {
            i4 |= q2.l(function2) ? 256 : 128;
        } else {
            Function2 function28 = function2;
        }
        int i9 = 1024;
        if ((i6 & 3072) == 0) {
            i4 |= q2.W(visualTransformation2) ? 2048 : 1024;
        }
        int i10 = 8192;
        if ((i6 & 24576) == 0) {
            i4 |= q2.l(function27) ? 16384 : 8192;
        }
        int i11 = 65536;
        Function2 function29 = function23;
        if ((i6 & 196608) == 0) {
            i4 |= q2.l(function29) ? 131072 : 65536;
        }
        Function2 function210 = function24;
        if ((i6 & 1572864) == 0) {
            i4 |= q2.l(function210) ? 1048576 : 524288;
        }
        Function2 function211 = function25;
        if ((i6 & 12582912) == 0) {
            i4 |= q2.l(function211) ? 8388608 : 4194304;
        }
        boolean z7 = z2;
        if ((i6 & 100663296) == 0) {
            i4 |= q2.d(z7) ? 67108864 : 33554432;
        }
        if ((i6 & 805306368) == 0) {
            i4 |= q2.d(z5) ? 536870912 : 268435456;
        }
        if ((i7 & 6) == 0) {
            i5 = i7 | (q2.d(z6) ? 4 : 2);
        } else {
            i5 = i7;
        }
        if ((i7 & 48) == 0) {
            i5 |= q2.W(interactionSource2) ? 32 : 16;
        }
        if ((i7 & 384) == 0) {
            if (q2.W(paddingValues)) {
                i8 = 256;
            }
            i5 |= i8;
        } else {
            PaddingValues paddingValues2 = paddingValues;
        }
        if ((i7 & 3072) == 0) {
            if (q2.W(shape)) {
                i9 = 2048;
            }
            i5 |= i9;
        } else {
            Shape shape2 = shape;
        }
        if ((i7 & 24576) == 0) {
            if (q2.W(textFieldColors2)) {
                i10 = 16384;
            }
            i5 |= i10;
        }
        if ((196608 & i7) == 0) {
            if (q2.l(function26)) {
                i11 = 131072;
            }
            i5 |= i11;
        } else {
            Function2 function212 = function26;
        }
        int i12 = i5;
        boolean z8 = false;
        if (q2.E(((i4 & 306783379) == 306783378 && (74899 & i12) == 74898) ? false : true, i4 & 1)) {
            if (ComposerKt.P()) {
                ComposerKt.Y(341783750, i4, i12, "androidx.compose.material.CommonDecorationBox (TextFieldImpl.kt:78)");
            }
            boolean z9 = ((i4 & 7168) == 2048) | ((i4 & 112) == 32);
            Object g2 = q2.g();
            if (z9 || g2 == Composer.f14567a.a()) {
                g2 = visualTransformation2.a(new AnnotatedString(str, (List) null, (List) null, 6, (DefaultConstructorMarker) null));
                q2.N(g2);
            }
            String k2 = ((TransformedText) g2).b().k();
            InputPhase inputPhase = ((Boolean) FocusInteractionKt.a(interactionSource2, q2, (i12 >> 3) & 14).getValue()).booleanValue() ? InputPhase.Focused : k2.length() == 0 ? InputPhase.UnfocusedEmpty : InputPhase.UnfocusedNotEmpty;
            TextFieldImplKt$CommonDecorationBox$labelColor$1 textFieldImplKt$CommonDecorationBox$labelColor$1 = new TextFieldImplKt$CommonDecorationBox$labelColor$1(textFieldColors2, z5, z6, interactionSource2);
            MaterialTheme materialTheme = MaterialTheme.f7937a;
            Typography c2 = materialTheme.c(q2, 6);
            TextStyle g3 = c2.g();
            TextStyle d2 = c2.d();
            long h2 = g3.h();
            Color.Companion companion = Color.f15975b;
            boolean z10 = (Color.n(h2, companion.f()) && !Color.n(d2.h(), companion.f())) || (!Color.n(g3.h(), companion.f()) && Color.n(d2.h(), companion.f()));
            TextFieldTransitionScope textFieldTransitionScope = TextFieldTransitionScope.f8850a;
            q2.X(1578866909);
            long h3 = materialTheme.c(q2, 6).d().h();
            if (z10) {
                q2.X(-1572812364);
                if (h3 == 16) {
                    h3 = ((Color) textFieldImplKt$CommonDecorationBox$labelColor$1.d(inputPhase, q2, 0)).v();
                }
                q2.M();
            } else {
                q2.X(780549965);
                q2.M();
            }
            long j2 = h3;
            q2.M();
            q2.X(1578874175);
            long h4 = materialTheme.c(q2, 6).g().h();
            if (z10) {
                q2.X(-1572585196);
                if (h4 == 16) {
                    h4 = ((Color) textFieldImplKt$CommonDecorationBox$labelColor$1.d(inputPhase, q2, 0)).v();
                }
                q2.M();
            } else {
                q2.X(780557293);
                q2.M();
            }
            long j3 = h4;
            q2.M();
            if (function27 != null) {
                z8 = true;
            }
            composer2 = q2;
            textFieldTransitionScope.a(inputPhase, j2, j3, textFieldImplKt$CommonDecorationBox$labelColor$1, z8, ComposableLambdaKt.e(225557475, true, new TextFieldImplKt$CommonDecorationBox$3(function22, function23, k2, textFieldColors, z3, z4, interactionSource, function24, function25, shape, textFieldType, function2, z2, paddingValues, z10, function26), composer2, 54), composer2, 1769472);
            if (ComposerKt.P()) {
                ComposerKt.X();
            }
        } else {
            composer2 = q2;
            composer2.B();
        }
        ScopeUpdateScope x2 = composer2.x();
        if (x2 != null) {
            TextFieldImplKt$CommonDecorationBox$4 textFieldImplKt$CommonDecorationBox$4 = r0;
            TextFieldImplKt$CommonDecorationBox$4 textFieldImplKt$CommonDecorationBox$42 = new TextFieldImplKt$CommonDecorationBox$4(textFieldType, str, function2, visualTransformation, function22, function23, function24, function25, z2, z3, z4, interactionSource, paddingValues, shape, textFieldColors, function26, i2, i3);
            x2.a(textFieldImplKt$CommonDecorationBox$4);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0044  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00d4  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00de  */
    /* JADX WARNING: Removed duplicated region for block: B:71:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void b(long r14, androidx.compose.ui.text.TextStyle r16, java.lang.Float r17, kotlin.jvm.functions.Function2 r18, androidx.compose.runtime.Composer r19, int r20, int r21) {
        /*
            r1 = r14
            r5 = r18
            r6 = r20
            r0 = -399493340(0xffffffffe8303724, float:-3.3286147E24)
            r3 = r19
            androidx.compose.runtime.Composer r3 = r3.q(r0)
            r4 = r21 & 1
            if (r4 == 0) goto L_0x0015
            r4 = r6 | 6
            goto L_0x0025
        L_0x0015:
            r4 = r6 & 6
            if (r4 != 0) goto L_0x0024
            boolean r4 = r3.j(r14)
            if (r4 == 0) goto L_0x0021
            r4 = 4
            goto L_0x0022
        L_0x0021:
            r4 = 2
        L_0x0022:
            r4 = r4 | r6
            goto L_0x0025
        L_0x0024:
            r4 = r6
        L_0x0025:
            r7 = r21 & 2
            if (r7 == 0) goto L_0x002e
            r4 = r4 | 48
        L_0x002b:
            r8 = r16
            goto L_0x0040
        L_0x002e:
            r8 = r6 & 48
            if (r8 != 0) goto L_0x002b
            r8 = r16
            boolean r9 = r3.W(r8)
            if (r9 == 0) goto L_0x003d
            r9 = 32
            goto L_0x003f
        L_0x003d:
            r9 = 16
        L_0x003f:
            r4 = r4 | r9
        L_0x0040:
            r9 = r21 & 4
            if (r9 == 0) goto L_0x0049
            r4 = r4 | 384(0x180, float:5.38E-43)
        L_0x0046:
            r10 = r17
            goto L_0x005b
        L_0x0049:
            r10 = r6 & 384(0x180, float:5.38E-43)
            if (r10 != 0) goto L_0x0046
            r10 = r17
            boolean r11 = r3.W(r10)
            if (r11 == 0) goto L_0x0058
            r11 = 256(0x100, float:3.59E-43)
            goto L_0x005a
        L_0x0058:
            r11 = 128(0x80, float:1.794E-43)
        L_0x005a:
            r4 = r4 | r11
        L_0x005b:
            r11 = r21 & 8
            if (r11 == 0) goto L_0x0062
            r4 = r4 | 3072(0xc00, float:4.305E-42)
            goto L_0x0072
        L_0x0062:
            r11 = r6 & 3072(0xc00, float:4.305E-42)
            if (r11 != 0) goto L_0x0072
            boolean r11 = r3.l(r5)
            if (r11 == 0) goto L_0x006f
            r11 = 2048(0x800, float:2.87E-42)
            goto L_0x0071
        L_0x006f:
            r11 = 1024(0x400, float:1.435E-42)
        L_0x0071:
            r4 = r4 | r11
        L_0x0072:
            r11 = r4 & 1171(0x493, float:1.641E-42)
            r12 = 1170(0x492, float:1.64E-42)
            r13 = 1
            if (r11 == r12) goto L_0x007b
            r11 = r13
            goto L_0x007c
        L_0x007b:
            r11 = 0
        L_0x007c:
            r12 = r4 & 1
            boolean r11 = r3.E(r11, r12)
            if (r11 == 0) goto L_0x00d4
            r11 = 0
            if (r7 == 0) goto L_0x0088
            r8 = r11
        L_0x0088:
            if (r9 == 0) goto L_0x008b
            r10 = r11
        L_0x008b:
            boolean r7 = androidx.compose.runtime.ComposerKt.P()
            if (r7 == 0) goto L_0x0097
            r7 = -1
            java.lang.String r9 = "androidx.compose.material.Decoration (TextFieldImpl.kt:236)"
            androidx.compose.runtime.ComposerKt.Y(r0, r4, r7, r9)
        L_0x0097:
            androidx.compose.material.TextFieldImplKt$Decoration$colorAndEmphasis$1 r0 = new androidx.compose.material.TextFieldImplKt$Decoration$colorAndEmphasis$1
            r0.<init>(r14, r10, r5)
            r7 = 54
            r9 = 494684590(0x1d7c49ae, float:3.3390014E-21)
            androidx.compose.runtime.internal.ComposableLambda r0 = androidx.compose.runtime.internal.ComposableLambdaKt.e(r9, r13, r0, r3, r7)
            if (r8 == 0) goto L_0x00ba
            r7 = 2115981348(0x7e1f5024, float:5.294084E37)
            r3.X(r7)
            int r4 = r4 >> 3
            r4 = r4 & 14
            r4 = r4 | 48
            androidx.compose.material.TextKt.a(r8, r0, r3, r4)
        L_0x00b6:
            r3.M()
            goto L_0x00c9
        L_0x00ba:
            r4 = 2115982984(0x7e1f5688, float:5.2949137E37)
            r3.X(r4)
            r4 = 6
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r0.m(r3, r4)
            goto L_0x00b6
        L_0x00c9:
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x00d2
            androidx.compose.runtime.ComposerKt.X()
        L_0x00d2:
            r4 = r10
            goto L_0x00d8
        L_0x00d4:
            r3.B()
            goto L_0x00d2
        L_0x00d8:
            androidx.compose.runtime.ScopeUpdateScope r9 = r3.x()
            if (r9 == 0) goto L_0x00ef
            androidx.compose.material.TextFieldImplKt$Decoration$1 r10 = new androidx.compose.material.TextFieldImplKt$Decoration$1
            r0 = r10
            r1 = r14
            r3 = r8
            r5 = r18
            r6 = r20
            r7 = r21
            r0.<init>(r1, r3, r4, r5, r6, r7)
            r9.a(r10)
        L_0x00ef:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.TextFieldImplKt.b(long, androidx.compose.ui.text.TextStyle, java.lang.Float, kotlin.jvm.functions.Function2, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final Modifier c(Modifier modifier, boolean z2, String str) {
        return z2 ? SemanticsModifierKt.d(modifier, false, new TextFieldImplKt$defaultErrorSemantics$1(str), 1, (Object) null) : modifier;
    }

    public static final float d() {
        return f8763b;
    }

    public static final Object e(IntrinsicMeasurable intrinsicMeasurable) {
        Object t2 = intrinsicMeasurable.t();
        LayoutIdParentData layoutIdParentData = t2 instanceof LayoutIdParentData ? (LayoutIdParentData) t2 : null;
        if (layoutIdParentData != null) {
            return layoutIdParentData.u0();
        }
        return null;
    }

    public static final float f() {
        return f8762a;
    }

    public static final int g(Placeable placeable) {
        if (placeable != null) {
            return placeable.C0();
        }
        return 0;
    }

    public static final int h(Placeable placeable) {
        if (placeable != null) {
            return placeable.L0();
        }
        return 0;
    }
}
