package androidx.compose.material;

import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ProvidedValue;
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
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class FloatingActionButtonKt$FloatingActionButton$2 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function2 f7881A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ long f7882z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FloatingActionButtonKt$FloatingActionButton$2(long j2, Function2 function2) {
        super(2);
        this.f7882z = j2;
        this.f7881A = function2;
    }

    public final void b(Composer composer, int i2) {
        if (composer.E((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.P()) {
                ComposerKt.Y(1972871863, i2, -1, "androidx.compose.material.FloatingActionButton.<anonymous> (FloatingActionButton.kt:102)");
            }
            ProvidedValue d2 = ContentAlphaKt.a().d(Float.valueOf(Color.o(this.f7882z)));
            final Function2 function2 = this.f7881A;
            CompositionLocalKt.c(d2, ComposableLambdaKt.e(1867794295, true, new Function2<Composer, Integer, Unit>() {
                public final void b(Composer composer, int i2) {
                    if (composer.E((i2 & 3) != 2, i2 & 1)) {
                        if (ComposerKt.P()) {
                            ComposerKt.Y(1867794295, i2, -1, "androidx.compose.material.FloatingActionButton.<anonymous>.<anonymous> (FloatingActionButton.kt:103)");
                        }
                        TextStyle c2 = MaterialTheme.f7937a.c(composer, 6).c();
                        final Function2 function2 = function2;
                        TextKt.a(c2, ComposableLambdaKt.e(-1567914264, true, new Function2<Composer, Integer, Unit>() {
                            public final void b(Composer composer, int i2) {
                                if (composer.E((i2 & 3) != 2, 1 & i2)) {
                                    if (ComposerKt.P()) {
                                        ComposerKt.Y(-1567914264, i2, -1, "androidx.compose.material.FloatingActionButton.<anonymous>.<anonymous>.<anonymous> (FloatingActionButton.kt:104)");
                                    }
                                    Modifier a2 = SizeKt.a(Modifier.f15489d, FloatingActionButtonKt.f7871a, FloatingActionButtonKt.f7871a);
                                    Alignment e2 = Alignment.f15444a.e();
                                    Function2 function2 = function2;
                                    MeasurePolicy g2 = BoxKt.g(e2, false);
                                    int a3 = ComposablesKt.a(composer, 0);
                                    CompositionLocalMap I = composer.I();
                                    Modifier e3 = ComposedModifierKt.e(composer, a2);
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
                                    Updater.g(b2, e3, companion.d());
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
