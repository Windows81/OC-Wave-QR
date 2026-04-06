package com.hansecom.abt.presentation.screens.auth.welcome;

import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.TestTagKt;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Dp;
import com.hansecom.abt.R;
import com.hansecom.abt.presentation.screens.auth.welcome.Welcome;
import com.hansecom.abt.ui.components.AbtTextKt;
import com.hansecom.abt.ui.components.abtButton.AbtButtonIconPosition;
import com.hansecom.abt.ui.components.abtButton.AbtButtonKt;
import com.hansecom.abt.ui.components.abtButton.AbtButtonState;
import com.hansecom.abt.ui.components.abtButton.AbtButtonStyle;
import com.hansecom.abt.ui.components.screenHeader.ScreenHeaderKt;
import com.hansecom.abt.ui.components.snackbar.AbtSnackbarHostKt;
import com.hansecom.abt.ui.components.snackbar.AbtSnackbarHostState;
import com.hansecom.abt.ui.theme.AbtTheme;
import com.hansecom.abt.util.DebugMenuModifierKt;
import com.hansecom.abt.util.ScaffoldImePaddingKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class WelcomeScreenKt$ScreenImpl$1 implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Welcome.State f34661A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Function0 f34662B;
    public final /* synthetic */ Function0 C;
    public final /* synthetic */ Function0 D;
    public final /* synthetic */ Function0 E;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ AbtSnackbarHostState f34663z;

    public WelcomeScreenKt$ScreenImpl$1(AbtSnackbarHostState abtSnackbarHostState, Welcome.State state, Function0 function0, Function0 function02, Function0 function03, Function0 function04) {
        this.f34663z = abtSnackbarHostState;
        this.f34661A = state;
        this.f34662B = function0;
        this.C = function02;
        this.D = function03;
        this.E = function04;
    }

    public final void b(Composer composer, int i2) {
        Composer composer2 = composer;
        int i3 = i2;
        if ((i3 & 3) != 2 || !composer.t()) {
            if (ComposerKt.P()) {
                ComposerKt.Y(-1689046766, i3, -1, "com.hansecom.abt.presentation.screens.auth.welcome.ScreenImpl.<anonymous> (WelcomeScreen.kt:77)");
            }
            long e2 = Color.f15975b.e();
            Modifier a2 = TestTagKt.a(Modifier.f15489d, "WelcomeScreen");
            final AbtSnackbarHostState abtSnackbarHostState = this.f34663z;
            ComposableLambda e3 = ComposableLambdaKt.e(577591692, true, new Function2<Composer, Integer, Unit>() {
                public final void b(Composer composer, int i2) {
                    if ((i2 & 3) != 2 || !composer.t()) {
                        if (ComposerKt.P()) {
                            ComposerKt.Y(577591692, i2, -1, "com.hansecom.abt.presentation.screens.auth.welcome.ScreenImpl.<anonymous>.<anonymous> (WelcomeScreen.kt:79)");
                        }
                        AbtSnackbarHostKt.b(abtSnackbarHostState, (Modifier) null, composer, 0, 2);
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
            }, composer2, 54);
            final Welcome.State state = this.f34661A;
            Function0 function0 = this.f34662B;
            Function0 function02 = this.C;
            final Function0 function03 = function0;
            final Function0 function04 = function02;
            final Function0 function05 = this.D;
            final Function0 function06 = this.E;
            ScaffoldKt.f(a2, (Function2) null, (Function2) null, e3, (Function2) null, 0, e2, 0, (WindowInsets) null, ComposableLambdaKt.e(1339615395, true, new Function3<PaddingValues, Composer, Integer, Unit>() {
                public final void b(PaddingValues paddingValues, Composer composer, int i2) {
                    int i3;
                    Function0 function0;
                    Welcome.State state;
                    Function0 function02;
                    Function0 function03;
                    Function0 function04;
                    int i4;
                    PaddingValues paddingValues2 = paddingValues;
                    Composer composer2 = composer;
                    Intrinsics.i(paddingValues2, "innerPadding");
                    if ((i2 & 6) == 0) {
                        i3 = i2 | (composer2.W(paddingValues2) ? 4 : 2);
                    } else {
                        i3 = i2;
                    }
                    if ((i3 & 19) != 18 || !composer.t()) {
                        if (ComposerKt.P()) {
                            ComposerKt.Y(1339615395, i3, -1, "com.hansecom.abt.presentation.screens.auth.welcome.ScreenImpl.<anonymous>.<anonymous> (WelcomeScreen.kt:82)");
                        }
                        Modifier.Companion companion = Modifier.f15489d;
                        Modifier j2 = PaddingKt.j(SizeKt.f(ScaffoldImePaddingKt.a(companion, paddingValues2), 0.0f, 1, (Object) null), Dp.m((float) 28), Dp.m((float) 32));
                        Alignment.Horizontal g2 = Alignment.f15444a.g();
                        Welcome.State state2 = state;
                        Function0 function05 = function03;
                        Function0 function06 = function04;
                        Function0 function07 = function05;
                        Function0 function08 = function06;
                        MeasurePolicy a2 = ColumnKt.a(Arrangement.f3739a.g(), g2, composer2, 48);
                        int a3 = ComposablesKt.a(composer2, 0);
                        CompositionLocalMap I = composer.I();
                        Modifier e2 = ComposedModifierKt.e(composer2, j2);
                        ComposeUiNode.Companion companion2 = ComposeUiNode.f17222h;
                        Function0 a4 = companion2.a();
                        if (composer.v() == null) {
                            ComposablesKt.d();
                        }
                        composer.s();
                        if (composer.n()) {
                            composer2.y(a4);
                        } else {
                            composer.K();
                        }
                        Composer b2 = Updater.b(composer);
                        Updater.g(b2, a2, companion2.c());
                        Updater.g(b2, I, companion2.e());
                        Function2 b3 = companion2.b();
                        if (b2.n() || !Intrinsics.d(b2.g(), Integer.valueOf(a3))) {
                            b2.N(Integer.valueOf(a3));
                            b2.A(Integer.valueOf(a3), b3);
                        }
                        Updater.g(b2, e2, companion2.d());
                        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.f3815a;
                        composer2.X(-615960896);
                        if (state2.b()) {
                            i4 = 0;
                            function0 = function08;
                            function04 = function07;
                            function03 = function06;
                            function02 = function05;
                            state = state2;
                            ImageKt.a(PainterResources_androidKt.c(R.drawable.h0, composer2, 0), (String) null, SizeKt.i(SizeKt.y(companion, Dp.m((float) 162)), Dp.m((float) 60)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer, 432, 120);
                        } else {
                            i4 = 0;
                            function0 = function08;
                            function04 = function07;
                            function03 = function06;
                            function02 = function05;
                            state = state2;
                        }
                        composer.M();
                        SpacerKt.a(ColumnScope.c(columnScopeInstance, companion, 1.0f, false, 2, (Object) null), composer2, i4);
                        String b4 = StringResources_androidKt.b(R.string.na, composer2, i4);
                        String b5 = StringResources_androidKt.b(R.string.qa, composer2, i4);
                        AbtTheme abtTheme = AbtTheme.f38851a;
                        AbtTheme abtTheme2 = abtTheme;
                        ScreenHeaderKt.b(DebugMenuModifierKt.c(companion, function02, 0, composer, 6, 2), PaddingKt.e(0.0f, 0.0f, 0.0f, Dp.m((float) 40), 7, (Object) null), abtTheme.b(composer2, 6).o(), abtTheme.b(composer2, 6).o(), b4, b5, true, composer, 1572912, 0);
                        Modifier a5 = TestTagKt.a(SizeKt.h(companion, 0.0f, 1, (Object) null), "sign_in");
                        String b6 = StringResources_androidKt.b(R.string.oa, composer2, 0);
                        AbtButtonStyle.Companion companion3 = AbtButtonStyle.f37880f;
                        AbtButtonKt.j(function03, a5, companion3.a(composer2, 6).g(composer2, 0), (AbtButtonState) null, b6, (Integer) null, (AbtButtonIconPosition) null, composer, 48, 104);
                        SpacerKt.a(SizeKt.i(companion, Dp.m((float) 16)), composer2, 6);
                        AbtButtonKt.j(function04, TestTagKt.a(SizeKt.h(companion, 0.0f, 1, (Object) null), "register"), companion3.a(composer2, 6).d(composer2, 0), (AbtButtonState) null, StringResources_androidKt.b(R.string.pa, composer2, 0), (Integer) null, (AbtButtonIconPosition) null, composer, 48, 104);
                        composer2.X(-615903548);
                        if (state.a()) {
                            SpacerKt.a(SizeKt.i(companion, Dp.m((float) 24)), composer2, 6);
                            AbtTheme abtTheme3 = abtTheme2;
                            Modifier.Companion companion4 = companion;
                            AbtTextKt.c(StringResources_androidKt.b(R.string.ma, composer2, 0), (Modifier) null, abtTheme3.b(composer2, 6).o(), 0, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0, (TextDecoration) null, TextAlign.h(TextAlign.f19080b.a()), 0, 0, false, 0, 0, (Function1) null, abtTheme3.d(composer2, 6).f(), composer, 0, 0, 65018);
                            Composer composer3 = composer;
                            SpacerKt.a(SizeKt.i(companion4, Dp.m((float) 12)), composer3, 6);
                            AbtButtonKt.j(function0, TestTagKt.a(SizeKt.h(companion4, 0.0f, 1, (Object) null), "guest_mode"), companion3.a(composer3, 6).d(composer3, 0), (AbtButtonState) null, StringResources_androidKt.b(R.string.la, composer3, 0), (Integer) null, (AbtButtonIconPosition) null, composer, 48, 104);
                        } else {
                            Composer composer4 = composer2;
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
                    b((PaddingValues) obj, (Composer) obj2, ((Number) obj3).intValue());
                    return Unit.f40552a;
                }
            }, composer2, 54), composer, 806882310, 438);
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
}
