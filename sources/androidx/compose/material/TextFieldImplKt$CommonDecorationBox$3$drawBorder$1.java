package androidx.compose.material;

import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class TextFieldImplKt$CommonDecorationBox$3$drawBorder$1 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ PaddingValues f8780A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Function2 f8781B;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ MutableState f8782z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TextFieldImplKt$CommonDecorationBox$3$drawBorder$1(MutableState mutableState, PaddingValues paddingValues, Function2 function2) {
        super(2);
        this.f8782z = mutableState;
        this.f8780A = paddingValues;
        this.f8781B = function2;
    }

    public final void b(Composer composer, int i2) {
        if (composer.E((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.P()) {
                ComposerKt.Y(-1212965554, i2, -1, "androidx.compose.material.CommonDecorationBox.<anonymous>.<anonymous> (TextFieldImpl.kt:193)");
            }
            Modifier o2 = OutlinedTextFieldKt.o(LayoutIdKt.b(Modifier.f15489d, "border"), ((Size) this.f8782z.getValue()).m(), this.f8780A);
            Function2 function2 = this.f8781B;
            MeasurePolicy g2 = BoxKt.g(Alignment.f15444a.o(), true);
            int a2 = ComposablesKt.a(composer, 0);
            CompositionLocalMap I = composer.I();
            Modifier e2 = ComposedModifierKt.e(composer, o2);
            ComposeUiNode.Companion companion = ComposeUiNode.f17222h;
            Function0 a3 = companion.a();
            if (composer.v() == null) {
                ComposablesKt.d();
            }
            composer.s();
            if (composer.n()) {
                composer.y(a3);
            } else {
                composer.K();
            }
            Composer b2 = Updater.b(composer);
            Updater.g(b2, g2, companion.c());
            Updater.g(b2, I, companion.e());
            Function2 b3 = companion.b();
            if (b2.n() || !Intrinsics.d(b2.g(), Integer.valueOf(a2))) {
                b2.N(Integer.valueOf(a2));
                b2.A(Integer.valueOf(a2), b3);
            }
            Updater.g(b2, e2, companion.d());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.f3797a;
            if (function2 == null) {
                composer.X(720285106);
            } else {
                composer.X(-392406993);
                function2.m(composer, 0);
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

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        b((Composer) obj, ((Number) obj2).intValue());
        return Unit.f40552a;
    }
}
