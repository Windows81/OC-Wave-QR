package androidx.compose.material3.internal;

import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.TextStyle;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class TextFieldImplKt$CommonDecorationBox$3$decoratedPlaceholder$1 implements Function3<Modifier, Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ long f12345A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ TextStyle f12346B;
    public final /* synthetic */ Function2 C;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ State f12347z;

    public TextFieldImplKt$CommonDecorationBox$3$decoratedPlaceholder$1(State state, long j2, TextStyle textStyle, Function2 function2) {
        this.f12347z = state;
        this.f12345A = j2;
        this.f12346B = textStyle;
        this.C = function2;
    }

    /* access modifiers changed from: private */
    public static final Unit e(State state, GraphicsLayerScope graphicsLayerScope) {
        graphicsLayerScope.d(((Number) state.getValue()).floatValue());
        return Unit.f40552a;
    }

    public final void c(Modifier modifier, Composer composer, int i2) {
        if ((i2 & 6) == 0) {
            i2 |= composer.W(modifier) ? 4 : 2;
        }
        if (composer.E((i2 & 19) != 18, 1 & i2)) {
            if (ComposerKt.P()) {
                ComposerKt.Y(1405547205, i2, -1, "androidx.compose.material3.internal.CommonDecorationBox.<anonymous>.<anonymous> (TextFieldImpl.kt:161)");
            }
            boolean W = composer.W(this.f12347z);
            State state = this.f12347z;
            Object g2 = composer.g();
            if (W || g2 == Composer.f14567a.a()) {
                g2 = new e0(state);
                composer.N(g2);
            }
            Modifier a2 = GraphicsLayerModifierKt.a(modifier, (Function1) g2);
            long j2 = this.f12345A;
            TextStyle textStyle = this.f12346B;
            Function2 function2 = this.C;
            MeasurePolicy g3 = BoxKt.g(Alignment.f15444a.o(), false);
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
            Updater.g(b2, g3, companion.c());
            Updater.g(b2, I, companion.e());
            Function2 b3 = companion.b();
            if (b2.n() || !Intrinsics.d(b2.g(), Integer.valueOf(a3))) {
                b2.N(Integer.valueOf(a3));
                b2.A(Integer.valueOf(a3), b3);
            }
            Updater.g(b2, e2, companion.d());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.f3797a;
            TextFieldImplKt.s(j2, textStyle, function2, composer, 0);
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
        c((Modifier) obj, (Composer) obj2, ((Number) obj3).intValue());
        return Unit.f40552a;
    }
}
