package com.hansecom.abt.ui.components.dialog;

import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.foundation.text.TextAutoSize;
import androidx.compose.material3.CardColors;
import androidx.compose.material3.CardElevation;
import androidx.compose.material3.CardKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.TestTagKt;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.window.AndroidDialog_androidKt;
import androidx.compose.ui.window.DialogProperties;
import com.hansecom.abt.ui.components.AbtTextKt;
import com.hansecom.abt.ui.components.abtButton.AbtButtonIconPosition;
import com.hansecom.abt.ui.components.abtButton.AbtButtonKt;
import com.hansecom.abt.ui.components.abtButton.AbtButtonState;
import com.hansecom.abt.ui.components.abtButton.AbtButtonStyle;
import com.hansecom.abt.ui.theme.AbtTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class AbtDialogKt$AbtDialog$1 implements Function3<AnimatedVisibilityScope, Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ DialogProperties f38122A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Function2 f38123B;
    public final /* synthetic */ String C;
    public final /* synthetic */ CharSequence D;
    public final /* synthetic */ String E;
    public final /* synthetic */ Function2 F;
    public final /* synthetic */ String G;
    public final /* synthetic */ String H;
    public final /* synthetic */ Function0 I;
    public final /* synthetic */ AbtButtonStyle J;
    public final /* synthetic */ AbtButtonState K;
    public final /* synthetic */ Integer L;
    public final /* synthetic */ Function0 M;
    public final /* synthetic */ AbtButtonStyle N;
    public final /* synthetic */ AbtButtonState O;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Function0 f38124z;

    public AbtDialogKt$AbtDialog$1(Function0 function0, DialogProperties dialogProperties, Function2 function2, String str, CharSequence charSequence, String str2, Function2 function22, String str3, String str4, Function0 function02, AbtButtonStyle abtButtonStyle, AbtButtonState abtButtonState, Integer num, Function0 function03, AbtButtonStyle abtButtonStyle2, AbtButtonState abtButtonState2) {
        this.f38124z = function0;
        this.f38122A = dialogProperties;
        this.f38123B = function2;
        this.C = str;
        this.D = charSequence;
        this.E = str2;
        this.F = function22;
        this.G = str3;
        this.H = str4;
        this.I = function02;
        this.J = abtButtonStyle;
        this.K = abtButtonState;
        this.L = num;
        this.M = function03;
        this.N = abtButtonStyle2;
        this.O = abtButtonState2;
    }

    public final void b(AnimatedVisibilityScope animatedVisibilityScope, Composer composer, int i2) {
        Intrinsics.i(animatedVisibilityScope, "$this$AnimatedVisibility");
        if (ComposerKt.P()) {
            ComposerKt.Y(194323336, i2, -1, "com.hansecom.abt.ui.components.dialog.AbtDialog.<anonymous> (AbtDialog.kt:96)");
        }
        Function0 function0 = this.f38124z;
        DialogProperties dialogProperties = this.f38122A;
        final Function2 function2 = this.f38123B;
        final String str = this.C;
        final CharSequence charSequence = this.D;
        final String str2 = this.E;
        final Function2 function22 = this.F;
        final String str3 = this.G;
        final String str4 = this.H;
        final Function0 function02 = this.I;
        final AbtButtonStyle abtButtonStyle = this.J;
        final AbtButtonState abtButtonState = this.K;
        Integer num = this.L;
        Function0 function03 = this.M;
        final AbtButtonStyle abtButtonStyle2 = this.N;
        final Function0 function04 = function03;
        final Integer num2 = num;
        final Function0 function05 = function0;
        final AbtButtonState abtButtonState2 = this.O;
        AnonymousClass1 r4 = new Function2<Composer, Integer, Unit>() {
            public final void b(Composer composer, int i2) {
                int i3 = i2;
                if ((i3 & 3) != 2 || !composer.t()) {
                    if (ComposerKt.P()) {
                        ComposerKt.Y(949410207, i3, -1, "com.hansecom.abt.ui.components.dialog.AbtDialog.<anonymous>.<anonymous> (AbtDialog.kt:101)");
                    }
                    Modifier k2 = PaddingKt.k(SizeKt.h(Modifier.f15489d, 0.0f, 1, (Object) null), Dp.m((float) 32), 0.0f, 2, (Object) null);
                    RoundedCornerShape d2 = RoundedCornerShapeKt.d(Dp.m((float) 16));
                    final Function2 function2 = function2;
                    final String str = str;
                    final CharSequence charSequence = charSequence;
                    final String str2 = str2;
                    final Function2 function22 = function22;
                    final String str3 = str3;
                    String str4 = str4;
                    Function0 function0 = function02;
                    Function0 function02 = function05;
                    AbtButtonStyle abtButtonStyle = abtButtonStyle;
                    AbtButtonState abtButtonState = abtButtonState;
                    Integer num = num2;
                    RoundedCornerShape roundedCornerShape = d2;
                    Function0 function03 = function04;
                    final AbtButtonStyle abtButtonStyle2 = abtButtonStyle2;
                    final AbtButtonState abtButtonState2 = abtButtonState;
                    final String str5 = str4;
                    final Function0 function04 = function0;
                    final Function0 function05 = function02;
                    final AbtButtonStyle abtButtonStyle3 = abtButtonStyle;
                    final Integer num2 = num;
                    final Function0 function06 = function03;
                    final AbtButtonState abtButtonState3 = abtButtonState2;
                    CardKt.c(k2, roundedCornerShape, (CardColors) null, (CardElevation) null, (BorderStroke) null, ComposableLambdaKt.e(901583633, true, new Function3<ColumnScope, Composer, Integer, Unit>() {
                        public final void b(ColumnScope columnScope, Composer composer, int i2) {
                            int i3;
                            Modifier.Companion companion;
                            Modifier.Companion companion2;
                            int i4;
                            int i5;
                            Object obj;
                            int i6;
                            float f2;
                            Composer composer2 = composer;
                            int i7 = i2;
                            Intrinsics.i(columnScope, "$this$Card");
                            if ((i7 & 17) != 16 || !composer.t()) {
                                if (ComposerKt.P()) {
                                    ComposerKt.Y(901583633, i7, -1, "com.hansecom.abt.ui.components.dialog.AbtDialog.<anonymous>.<anonymous>.<anonymous> (AbtDialog.kt:107)");
                                }
                                Modifier.Companion companion3 = Modifier.f15489d;
                                float f3 = (float) 20;
                                Modifier j2 = PaddingKt.j(SizeKt.h(companion3, 0.0f, 1, (Object) null), Dp.m(f3), Dp.m((float) 32));
                                Arrangement arrangement = Arrangement.f3739a;
                                Arrangement.HorizontalOrVertical b2 = arrangement.b();
                                Alignment.Companion companion4 = Alignment.f15444a;
                                Alignment.Horizontal g2 = companion4.g();
                                Function2 function2 = function2;
                                String str = str;
                                CharSequence charSequence = charSequence;
                                String str2 = str2;
                                Function2 function22 = function22;
                                float f4 = f3;
                                String str3 = str3;
                                String str4 = str5;
                                Function0 function0 = function04;
                                Function0 function02 = function05;
                                AbtButtonStyle abtButtonStyle = abtButtonStyle3;
                                AbtButtonState abtButtonState = abtButtonState2;
                                Integer num = num2;
                                Function0 function03 = function06;
                                AbtButtonStyle abtButtonStyle2 = abtButtonStyle2;
                                AbtButtonState abtButtonState2 = abtButtonState3;
                                MeasurePolicy a2 = ColumnKt.a(b2, g2, composer2, 54);
                                int a3 = ComposablesKt.a(composer2, 0);
                                CompositionLocalMap I2 = composer.I();
                                Modifier e2 = ComposedModifierKt.e(composer2, j2);
                                ComposeUiNode.Companion companion5 = ComposeUiNode.f17222h;
                                Function0 a4 = companion5.a();
                                if (composer.v() == null) {
                                    ComposablesKt.d();
                                }
                                composer.s();
                                if (composer.n()) {
                                    composer2.y(a4);
                                } else {
                                    composer.K();
                                }
                                Composer b3 = Updater.b(composer);
                                Updater.g(b3, a2, companion5.c());
                                Updater.g(b3, I2, companion5.e());
                                Function2 b4 = companion5.b();
                                if (b3.n() || !Intrinsics.d(b3.g(), Integer.valueOf(a3))) {
                                    b3.N(Integer.valueOf(a3));
                                    b3.A(Integer.valueOf(a3), b4);
                                }
                                Updater.g(b3, e2, companion5.d());
                                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.f3815a;
                                composer2.X(1532415853);
                                if (function2 == null) {
                                    i3 = 0;
                                } else {
                                    i3 = 0;
                                    function2.m(composer2, 0);
                                    SpacerKt.a(SizeKt.i(companion3, Dp.m((float) 28)), composer2, 6);
                                    Unit unit = Unit.f40552a;
                                }
                                composer.M();
                                TextAlign.Companion companion6 = TextAlign.f19080b;
                                int a5 = companion6.a();
                                Modifier.Companion companion7 = companion3;
                                AbtTheme abtTheme = AbtTheme.f38851a;
                                Function2 function23 = function22;
                                String str5 = str2;
                                Arrangement arrangement2 = arrangement;
                                Function0 function04 = function03;
                                AbtButtonStyle abtButtonStyle3 = abtButtonStyle2;
                                AbtButtonState abtButtonState3 = abtButtonState2;
                                float f5 = f4;
                                String str6 = str3;
                                String str7 = str4;
                                Function0 function05 = function0;
                                Function0 function06 = function02;
                                AbtButtonStyle abtButtonStyle4 = abtButtonStyle;
                                AbtButtonState abtButtonState4 = abtButtonState;
                                Integer num2 = num;
                                int i8 = i3;
                                AbtTheme abtTheme2 = abtTheme;
                                TextKt.j(str, SizeKt.h(companion3, 0.0f, 1, (Object) null), abtTheme.b(composer2, 6).q(), (TextAutoSize) null, 0, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0, (TextDecoration) null, TextAlign.h(a5), 0, 0, false, 0, 0, (Function1) null, abtTheme.d(composer2, 6).m(), composer, 48, 0, 130040);
                                float f6 = (float) 8;
                                Modifier.Companion companion8 = companion7;
                                Composer composer3 = composer;
                                SpacerKt.a(SizeKt.i(companion8, Dp.m(f6)), composer3, 6);
                                AbtTheme abtTheme3 = abtTheme2;
                                AbtTheme abtTheme4 = abtTheme3;
                                Modifier.Companion companion9 = companion8;
                                float f7 = f6;
                                AbtTextKt.c(charSequence, SizeKt.h(companion8, 0.0f, 1, (Object) null), 0, 0, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0, (TextDecoration) null, TextAlign.h(companion6.a()), 0, 0, false, 0, 0, (Function1) null, abtTheme3.d(composer3, 6).b(), composer, 48, 0, 65020);
                                Composer composer4 = composer;
                                composer4.X(1532441601);
                                if (str5.length() > 0) {
                                    Modifier.Companion companion10 = companion9;
                                    SpacerKt.a(SizeKt.i(companion10, Dp.m(f5)), composer4, 6);
                                    AbtTheme abtTheme5 = abtTheme4;
                                    companion = companion10;
                                    TextKt.j(str5, SizeKt.h(companion10, 0.0f, 1, (Object) null), abtTheme5.b(composer4, 6).b(), (TextAutoSize) null, 0, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0, (TextDecoration) null, TextAlign.h(companion6.a()), 0, 0, false, 0, 0, (Function1) null, abtTheme5.d(composer4, 6).g(), composer, 48, 0, 130040);
                                } else {
                                    companion = companion9;
                                }
                                composer.M();
                                Composer composer5 = composer;
                                composer5.X(1532457104);
                                Function2 function24 = function23;
                                if (function24 == null) {
                                    companion2 = companion;
                                    i5 = 28;
                                    i4 = 6;
                                } else {
                                    i5 = 28;
                                    companion2 = companion;
                                    i4 = 6;
                                    SpacerKt.a(SizeKt.i(companion2, Dp.m((float) 28)), composer5, 6);
                                    function24.m(composer5, Integer.valueOf(i8));
                                    Unit unit2 = Unit.f40552a;
                                }
                                composer.M();
                                composer5.X(1532463376);
                                if (!(str6 == null && str7 == null)) {
                                    SpacerKt.a(SizeKt.i(companion2, Dp.m((float) i5)), composer5, i4);
                                    MeasurePolicy a6 = ColumnKt.a(arrangement2.n(Dp.m(f7)), companion4.k(), composer5, i4);
                                    int a7 = ComposablesKt.a(composer5, i8);
                                    CompositionLocalMap I3 = composer.I();
                                    Modifier e3 = ComposedModifierKt.e(composer5, companion2);
                                    Function0 a8 = companion5.a();
                                    if (composer.v() == null) {
                                        ComposablesKt.d();
                                    }
                                    composer.s();
                                    if (composer.n()) {
                                        composer5.y(a8);
                                    } else {
                                        composer.K();
                                    }
                                    Composer b5 = Updater.b(composer);
                                    Updater.g(b5, a6, companion5.c());
                                    Updater.g(b5, I3, companion5.e());
                                    Function2 b6 = companion5.b();
                                    if (b5.n() || !Intrinsics.d(b5.g(), Integer.valueOf(a7))) {
                                        b5.N(Integer.valueOf(a7));
                                        b5.A(Integer.valueOf(a7), b6);
                                    }
                                    Updater.g(b5, e3, companion5.d());
                                    composer5.X(-913224561);
                                    if (str6 == null) {
                                        f2 = 0.0f;
                                        i6 = 1;
                                        obj = null;
                                    } else {
                                        f2 = 0.0f;
                                        i6 = 1;
                                        obj = null;
                                        AbtButtonKt.j(function05 == null ? function06 : function05, TestTagKt.a(SizeKt.h(companion2, 0.0f, 1, (Object) null), "dialog_primary"), abtButtonStyle4, abtButtonState4, str6, num2, (AbtButtonIconPosition) null, composer, 48, 64);
                                        Unit unit3 = Unit.f40552a;
                                    }
                                    composer.M();
                                    composer5.X(-913202631);
                                    if (str7 != null) {
                                        AbtButtonKt.j(function04 == null ? function06 : function04, TestTagKt.a(SizeKt.h(companion2, f2, i6, obj), "dialog_secondary"), abtButtonStyle3, abtButtonState3, str7, (Integer) null, (AbtButtonIconPosition) null, composer, 48, 96);
                                        Unit unit4 = Unit.f40552a;
                                    }
                                    composer.M();
                                    composer.T();
                                }
                                composer.M();
                                composer.T();
                                if (ComposerKt.P()) {
                                    ComposerKt.X();
                                    return;
                                }
                                return;
                            }
                            composer.B();
                        }

                        public /* bridge */ /* synthetic */ Object d(Object obj, Object obj2, Object obj3) {
                            b((ColumnScope) obj, (Composer) obj2, ((Number) obj3).intValue());
                            return Unit.f40552a;
                        }
                    }, composer, 54), composer, 196614, 28);
                    if (ComposerKt.P()) {
                        ComposerKt.X();
                        return;
                    }
                    return;
                }
                composer.B();
            }

            public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
                b((Composer) obj, ((Number) obj2).intValue());
                return Unit.f40552a;
            }
        };
        Composer composer2 = composer;
        AndroidDialog_androidKt.a(function0, dialogProperties, ComposableLambdaKt.e(949410207, true, r4, composer2, 54), composer2, 384, 0);
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
    }

    public /* bridge */ /* synthetic */ Object d(Object obj, Object obj2, Object obj3) {
        b((AnimatedVisibilityScope) obj, (Composer) obj2, ((Number) obj3).intValue());
        return Unit.f40552a;
    }
}
