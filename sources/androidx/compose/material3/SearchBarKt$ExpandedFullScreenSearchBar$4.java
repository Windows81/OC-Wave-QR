package androidx.compose.material3;

import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.material3.internal.PredictiveBackState;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.focus.FocusRequesterModifierKt;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.SoftwareKeyboardController;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

@Metadata
final class SearchBarKt$ExpandedFullScreenSearchBar$4 implements Function3<PredictiveBackState, Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Modifier f10856A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Shape f10857B;
    public final /* synthetic */ SearchBarColors C;
    public final /* synthetic */ float D;
    public final /* synthetic */ float E;
    public final /* synthetic */ Function2 F;
    public final /* synthetic */ Function3 G;
    public final /* synthetic */ Function2 H;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ SearchBarState f10858z;

    public final void b(PredictiveBackState predictiveBackState, Composer composer, int i2) {
        int i3;
        PredictiveBackState predictiveBackState2 = predictiveBackState;
        Composer composer2 = composer;
        if ((i2 & 6) == 0) {
            i3 = i2 | ((i2 & 8) == 0 ? composer2.W(predictiveBackState2) : composer2.l(predictiveBackState2) ? 4 : 2);
        } else {
            i3 = i2;
        }
        if (composer2.E((i3 & 19) != 18, i3 & 1)) {
            if (ComposerKt.P()) {
                ComposerKt.Y(625093617, i3, -1, "androidx.compose.material3.ExpandedFullScreenSearchBar.<anonymous> (SearchBar.kt:362)");
            }
            Object g2 = composer.g();
            Composer.Companion companion = Composer.f14567a;
            if (g2 == companion.a()) {
                g2 = new FocusRequester();
                composer2.N(g2);
            }
            final FocusRequester focusRequester = (FocusRequester) g2;
            SearchBarState searchBarState = this.f10858z;
            final Function2 function2 = this.H;
            FocusRequester focusRequester2 = focusRequester;
            SearchBarKt.j(searchBarState, predictiveBackState, ComposableLambdaKt.e(-2142632188, true, new Function2<Composer, Integer, Unit>() {
                public final void b(Composer composer, int i2) {
                    if (composer.E((i2 & 3) != 2, i2 & 1)) {
                        if (ComposerKt.P()) {
                            ComposerKt.Y(-2142632188, i2, -1, "androidx.compose.material3.ExpandedFullScreenSearchBar.<anonymous>.<anonymous> (SearchBar.kt:367)");
                        }
                        Modifier a2 = FocusRequesterModifierKt.a(Modifier.f15489d, focusRequester);
                        Function2 function2 = function2;
                        MeasurePolicy g2 = BoxKt.g(Alignment.f15444a.o(), true);
                        int a3 = ComposablesKt.a(composer, 0);
                        CompositionLocalMap I = composer.I();
                        Modifier e2 = ComposedModifierKt.e(composer, a2);
                        ComposeUiNode.Companion companion = ComposeUiNode.f17222h;
                        Function0 a4 = companion.a();
                        if (composer.v() == null) {
                            ComposablesKt.d();
                        }
                        composer.s();
                        if (composer.n()) {
                            composer.y(a4);
                        } else {
                            composer.K();
                        }
                        Composer b2 = Updater.b(composer);
                        Updater.g(b2, g2, companion.c());
                        Updater.g(b2, I, companion.e());
                        Function2 b3 = companion.b();
                        if (b2.n() || !Intrinsics.d(b2.g(), Integer.valueOf(a3))) {
                            b2.N(Integer.valueOf(a3));
                            b2.A(Integer.valueOf(a3), b3);
                        }
                        Updater.g(b2, e2, companion.d());
                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.f3797a;
                        function2.m(composer, 0);
                        composer.T();
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
            }, composer2, 54), this.f10856A, this.f10857B, this.C, this.D, this.E, (WindowInsets) this.F.m(composer2, 0), this.G, composer, ((i3 << 3) & 112) | 384);
            Unit unit = Unit.f40552a;
            Object g3 = composer.g();
            if (g3 == companion.a()) {
                g3 = new SearchBarKt$ExpandedFullScreenSearchBar$4$2$1(focusRequester2, (Continuation) null);
                composer2.N(g3);
            }
            EffectsKt.g(unit, (Function2) g3, composer2, 6);
            SoftwareKeyboardController softwareKeyboardController = (SoftwareKeyboardController) composer2.C(CompositionLocalsKt.q());
            SearchBarValue f2 = this.f10858z.f();
            boolean W = composer2.W(this.f10858z) | composer2.W(softwareKeyboardController);
            SearchBarState searchBarState2 = this.f10858z;
            Object g4 = composer.g();
            if (W || g4 == companion.a()) {
                g4 = new SearchBarKt$ExpandedFullScreenSearchBar$4$3$1(searchBarState2, softwareKeyboardController, (Continuation) null);
                composer2.N(g4);
            }
            EffectsKt.g(f2, (Function2) g4, composer2, 0);
            if (ComposerKt.P()) {
                ComposerKt.X();
                return;
            }
            return;
        }
        composer.B();
    }

    public /* bridge */ /* synthetic */ Object d(Object obj, Object obj2, Object obj3) {
        b((PredictiveBackState) obj, (Composer) obj2, ((Number) obj3).intValue());
        return Unit.f40552a;
    }
}
