package com.hansecom.abt.ui.theme;

import androidx.compose.foundation.text.AutofillHighlightKt;
import androidx.compose.foundation.text.selection.TextSelectionColorsKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.graphics.Color;
import com.hansecom.abt.ui.components.abtButton.AbtButtonStyles;
import com.hansecom.abt.ui.components.listItem.AbtMenuItemStyle;
import com.hansecom.abt.ui.components.quickSelectionButton.AbtQuickSelectionButtonStyle;
import com.hansecom.abt.ui.theme.colorScheme.AbtColorScheme;
import com.hansecom.abt.ui.theme.typography.AbtTypography;
import com.hansecom.abt.ui.theme.typography.AbtTypographyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class AbtBaseThemeKt {

    /* renamed from: a  reason: collision with root package name */
    public static final ProvidableCompositionLocal f38842a = CompositionLocalKt.j(new a());

    /* renamed from: b  reason: collision with root package name */
    public static final ProvidableCompositionLocal f38843b = CompositionLocalKt.j(new b());

    /* renamed from: c  reason: collision with root package name */
    public static final ProvidableCompositionLocal f38844c = CompositionLocalKt.j(new c());

    /* renamed from: d  reason: collision with root package name */
    public static final ProvidableCompositionLocal f38845d = CompositionLocalKt.j(new d());

    public static final void f(AbtColorScheme abtColorScheme, AbtTypography abtTypography, AbtButtonStyles abtButtonStyles, AbtMenuItemStyle abtMenuItemStyle, AbtQuickSelectionButtonStyle abtQuickSelectionButtonStyle, Function2 function2, Composer composer, int i2, int i3) {
        int i4;
        AbtColorScheme abtColorScheme2 = abtColorScheme;
        AbtTypography abtTypography2 = abtTypography;
        AbtButtonStyles abtButtonStyles2 = abtButtonStyles;
        AbtMenuItemStyle abtMenuItemStyle2 = abtMenuItemStyle;
        AbtQuickSelectionButtonStyle abtQuickSelectionButtonStyle2 = abtQuickSelectionButtonStyle;
        Function2 function22 = function2;
        int i5 = i2;
        Intrinsics.i(abtColorScheme2, "colorScheme");
        Intrinsics.i(abtTypography2, "typography");
        Intrinsics.i(function22, "content");
        Composer q2 = composer.q(-607341315);
        if ((i3 & 1) != 0) {
            i4 = i5 | 6;
        } else if ((i5 & 6) == 0) {
            i4 = (q2.W(abtColorScheme2) ? 4 : 2) | i5;
        } else {
            i4 = i5;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i5 & 48) == 0) {
            i4 |= q2.W(abtTypography2) ? 32 : 16;
        }
        int i6 = i3 & 4;
        if (i6 != 0) {
            i4 |= 384;
        } else if ((i5 & 384) == 0) {
            i4 |= (i5 & 512) == 0 ? q2.W(abtButtonStyles2) : q2.l(abtButtonStyles2) ? 256 : 128;
        }
        int i7 = i3 & 8;
        if (i7 != 0) {
            i4 |= 3072;
        } else if ((i5 & 3072) == 0) {
            i4 |= (i5 & 4096) == 0 ? q2.W(abtMenuItemStyle2) : q2.l(abtMenuItemStyle2) ? 2048 : 1024;
        }
        int i8 = i3 & 16;
        if (i8 != 0) {
            i4 |= 24576;
        } else if ((i5 & 24576) == 0) {
            i4 |= (32768 & i5) == 0 ? q2.W(abtQuickSelectionButtonStyle2) : q2.l(abtQuickSelectionButtonStyle2) ? 16384 : 8192;
        }
        if ((i3 & 32) != 0) {
            i4 |= 196608;
        } else if ((i5 & 196608) == 0) {
            i4 |= q2.l(function22) ? 131072 : 65536;
        }
        if ((74899 & i4) != 74898 || !q2.t()) {
            if (i6 != 0) {
                abtButtonStyles2 = DefaultButtonStyles.f38852a;
            }
            if (i7 != 0) {
                abtMenuItemStyle2 = DefaultMenuItemStyle.f38854a;
            }
            if (i8 != 0) {
                abtQuickSelectionButtonStyle2 = DefaultQuickSelectionButtonStyle.f38855a;
            }
            if (ComposerKt.P()) {
                ComposerKt.Y(-607341315, i4, -1, "com.hansecom.abt.ui.theme.AbtBaseTheme (AbtBaseTheme.kt:29)");
            }
            CompositionLocalKt.d(new ProvidedValue[]{f38842a.d(abtColorScheme2), TextSelectionColorsKt.b().d(p(abtColorScheme.E(), q2, 0)), AutofillHighlightKt.a().d(Color.h(Color.f15975b.e())), AbtTypographyKt.d().d(abtTypography2), f38843b.d(abtButtonStyles2), f38844c.d(abtMenuItemStyle2), f38845d.d(abtQuickSelectionButtonStyle2)}, ComposableLambdaKt.e(2058213821, true, new AbtBaseThemeKt$AbtBaseTheme$1(abtColorScheme2, abtTypography2, function22), q2, 54), q2, ProvidedValue.f14769i | 48);
            if (ComposerKt.P()) {
                ComposerKt.X();
            }
        } else {
            q2.B();
        }
        AbtQuickSelectionButtonStyle abtQuickSelectionButtonStyle3 = abtQuickSelectionButtonStyle2;
        AbtMenuItemStyle abtMenuItemStyle3 = abtMenuItemStyle2;
        AbtButtonStyles abtButtonStyles3 = abtButtonStyles2;
        ScopeUpdateScope x2 = q2.x();
        if (x2 != null) {
            x2.a(new e(abtColorScheme, abtTypography, abtButtonStyles3, abtMenuItemStyle3, abtQuickSelectionButtonStyle3, function2, i2, i3));
        }
    }

    public static final Unit g(AbtColorScheme abtColorScheme, AbtTypography abtTypography, AbtButtonStyles abtButtonStyles, AbtMenuItemStyle abtMenuItemStyle, AbtQuickSelectionButtonStyle abtQuickSelectionButtonStyle, Function2 function2, int i2, int i3, Composer composer, int i4) {
        f(abtColorScheme, abtTypography, abtButtonStyles, abtMenuItemStyle, abtQuickSelectionButtonStyle, function2, composer, RecomposeScopeImplKt.a(i2 | 1), i3);
        return Unit.f40552a;
    }

    public static final AbtButtonStyles h() {
        throw new IllegalStateException("CompositionLocal AbtButtonStyles not present");
    }

    public static final AbtColorScheme i() {
        throw new IllegalStateException("CompositionLocal AbtColorScheme not present");
    }

    public static final AbtMenuItemStyle j() {
        throw new IllegalStateException("CompositionLocal AbtMenuItemStyle not present");
    }

    public static final AbtQuickSelectionButtonStyle k() {
        throw new IllegalStateException("CompositionLocal AbtQuickSelectionButtonStyle not present");
    }

    public static final ProvidableCompositionLocal l() {
        return f38843b;
    }

    public static final ProvidableCompositionLocal m() {
        return f38842a;
    }

    public static final ProvidableCompositionLocal n() {
        return f38844c;
    }

    public static final ProvidableCompositionLocal o() {
        return f38845d;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v4, resolved type: androidx.compose.foundation.text.selection.TextSelectionColors} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: androidx.compose.foundation.text.selection.TextSelectionColors} */
    /* JADX WARNING: type inference failed for: r13v2 */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0031, code lost:
        if (r13 == androidx.compose.runtime.Composer.f14567a.a()) goto L_0x0033;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final androidx.compose.foundation.text.selection.TextSelectionColors p(androidx.compose.material3.ColorScheme r11, androidx.compose.runtime.Composer r12, int r13) {
        /*
            java.lang.String r0 = "colorScheme"
            kotlin.jvm.internal.Intrinsics.i(r11, r0)
            r0 = 1150019989(0x448be995, float:1119.2994)
            r12.X(r0)
            boolean r1 = androidx.compose.runtime.ComposerKt.P()
            if (r1 == 0) goto L_0x0017
            r1 = -1
            java.lang.String r2 = "com.hansecom.abt.ui.theme.rememberTextSelectionColors (AbtBaseTheme.kt:88)"
            androidx.compose.runtime.ComposerKt.Y(r0, r13, r1, r2)
        L_0x0017:
            long r0 = r11.N()
            r11 = -976085042(0xffffffffc5d21fce, float:-6723.9756)
            r12.X(r11)
            boolean r11 = r12.j(r0)
            java.lang.Object r13 = r12.g()
            if (r11 != 0) goto L_0x0033
            androidx.compose.runtime.Composer$Companion r11 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r11 = r11.a()
            if (r13 != r11) goto L_0x004c
        L_0x0033:
            androidx.compose.foundation.text.selection.TextSelectionColors r13 = new androidx.compose.foundation.text.selection.TextSelectionColors
            r9 = 14
            r10 = 0
            r5 = 1053609165(0x3ecccccd, float:0.4)
            r6 = 0
            r7 = 0
            r8 = 0
            r3 = r0
            long r6 = androidx.compose.ui.graphics.Color.l(r3, r5, r6, r7, r8, r9, r10)
            r8 = 0
            r3 = r13
            r4 = r0
            r3.<init>(r4, r6, r8)
            r12.N(r13)
        L_0x004c:
            androidx.compose.foundation.text.selection.TextSelectionColors r13 = (androidx.compose.foundation.text.selection.TextSelectionColors) r13
            r12.M()
            boolean r11 = androidx.compose.runtime.ComposerKt.P()
            if (r11 == 0) goto L_0x005a
            androidx.compose.runtime.ComposerKt.X()
        L_0x005a:
            r12.M()
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.ui.theme.AbtBaseThemeKt.p(androidx.compose.material3.ColorScheme, androidx.compose.runtime.Composer, int):androidx.compose.foundation.text.selection.TextSelectionColors");
    }
}
