package androidx.compose.material;

import androidx.compose.foundation.IndicationNodeFactory;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.selection.SelectableKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.semantics.Role;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class TabKt$Tab$3 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ boolean f8661A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ MutableInteractionSource f8662B;
    public final /* synthetic */ IndicationNodeFactory C;
    public final /* synthetic */ boolean D;
    public final /* synthetic */ Function0 E;
    public final /* synthetic */ Function3 F;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Modifier f8663z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TabKt$Tab$3(Modifier modifier, boolean z2, MutableInteractionSource mutableInteractionSource, IndicationNodeFactory indicationNodeFactory, boolean z3, Function0 function0, Function3 function3) {
        super(2);
        this.f8663z = modifier;
        this.f8661A = z2;
        this.f8662B = mutableInteractionSource;
        this.C = indicationNodeFactory;
        this.D = z3;
        this.E = function0;
        this.F = function3;
    }

    public final void b(Composer composer, int i2) {
        if (composer.E((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.P()) {
                ComposerKt.Y(-1237246709, i2, -1, "androidx.compose.material.Tab.<anonymous> (Tab.kt:239)");
            }
            Modifier h2 = SizeKt.h(SelectableKt.a(this.f8663z, this.f8661A, this.f8662B, this.C, this.D, Role.j(Role.f18040b.h()), this.E), 0.0f, 1, (Object) null);
            Alignment.Horizontal g2 = Alignment.f15444a.g();
            Arrangement.HorizontalOrVertical b2 = Arrangement.f3739a.b();
            Function3 function3 = this.F;
            MeasurePolicy a2 = ColumnKt.a(b2, g2, composer, 54);
            int a3 = ComposablesKt.a(composer, 0);
            CompositionLocalMap I = composer.I();
            Modifier e2 = ComposedModifierKt.e(composer, h2);
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
            Composer b3 = Updater.b(composer);
            Updater.g(b3, a2, companion.c());
            Updater.g(b3, I, companion.e());
            Function2 b4 = companion.b();
            if (b3.n() || !Intrinsics.d(b3.g(), Integer.valueOf(a3))) {
                b3.N(Integer.valueOf(a3));
                b3.A(Integer.valueOf(a3), b4);
            }
            Updater.g(b3, e2, companion.d());
            function3.d(ColumnScopeInstance.f3815a, composer, 6);
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
