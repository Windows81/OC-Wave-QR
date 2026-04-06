package androidx.compose.material;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.TextStyle;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class ButtonKt$Button$2 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ PaddingValues f7434A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Function3 f7435B;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ State f7436z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ButtonKt$Button$2(State state, PaddingValues paddingValues, Function3 function3) {
        super(2);
        this.f7436z = state;
        this.f7434A = paddingValues;
        this.f7435B = function3;
    }

    public final void b(Composer composer, int i2) {
        if (composer.E((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.P()) {
                ComposerKt.Y(7524271, i2, -1, "androidx.compose.material.Button.<anonymous> (Button.kt:121)");
            }
            ProvidedValue d2 = ContentAlphaKt.a().d(Float.valueOf(Color.o(ButtonKt.b(this.f7436z))));
            final PaddingValues paddingValues = this.f7434A;
            final Function3 function3 = this.f7435B;
            CompositionLocalKt.c(d2, ComposableLambdaKt.e(-1699085201, true, new Function2<Composer, Integer, Unit>() {
                public final void b(Composer composer, int i2) {
                    if (composer.E((i2 & 3) != 2, i2 & 1)) {
                        if (ComposerKt.P()) {
                            ComposerKt.Y(-1699085201, i2, -1, "androidx.compose.material.Button.<anonymous>.<anonymous> (Button.kt:122)");
                        }
                        TextStyle c2 = MaterialTheme.f7937a.c(composer, 6).c();
                        final PaddingValues paddingValues = paddingValues;
                        final Function3 function3 = function3;
                        TextKt.a(c2, ComposableLambdaKt.e(-630330208, true, new Function2<Composer, Integer, Unit>() {
                            public final void b(Composer composer, int i2) {
                                if (composer.E((i2 & 3) != 2, i2 & 1)) {
                                    if (ComposerKt.P()) {
                                        ComposerKt.Y(-630330208, i2, -1, "androidx.compose.material.Button.<anonymous>.<anonymous>.<anonymous> (Button.kt:123)");
                                    }
                                    Modifier.Companion companion = Modifier.f15489d;
                                    ButtonDefaults buttonDefaults = ButtonDefaults.f7422a;
                                    Modifier h2 = PaddingKt.h(SizeKt.a(companion, buttonDefaults.e(), buttonDefaults.d()), paddingValues);
                                    Arrangement.HorizontalOrVertical b2 = Arrangement.f3739a.b();
                                    Alignment.Vertical i3 = Alignment.f15444a.i();
                                    Function3 function3 = function3;
                                    MeasurePolicy b3 = RowKt.b(b2, i3, composer, 54);
                                    int a2 = ComposablesKt.a(composer, 0);
                                    CompositionLocalMap I = composer.I();
                                    Modifier e2 = ComposedModifierKt.e(composer, h2);
                                    ComposeUiNode.Companion companion2 = ComposeUiNode.f17222h;
                                    Function0 a3 = companion2.a();
                                    if (composer.v() == null) {
                                        ComposablesKt.d();
                                    }
                                    composer.s();
                                    if (composer.n()) {
                                        composer.y(a3);
                                    } else {
                                        composer.K();
                                    }
                                    Composer b4 = Updater.b(composer);
                                    Updater.g(b4, b3, companion2.c());
                                    Updater.g(b4, I, companion2.e());
                                    Function2 b5 = companion2.b();
                                    if (b4.n() || !Intrinsics.d(b4.g(), Integer.valueOf(a2))) {
                                        b4.N(Integer.valueOf(a2));
                                        b4.A(Integer.valueOf(a2), b5);
                                    }
                                    Updater.g(b4, e2, companion2.d());
                                    function3.d(RowScopeInstance.f4150a, composer, 6);
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
                        }, composer, 54), composer, 48);
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
            }, composer, 54), composer, ProvidedValue.f14769i | 48);
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
