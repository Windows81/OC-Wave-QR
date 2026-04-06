package androidx.compose.material3;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.selection.SelectableKt;
import androidx.compose.material3.internal.ChildParentSemanticsKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.unit.Density;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class SurfaceKt$Surface$3 implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Shape f11217A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ long f11218B;
    public final /* synthetic */ float C;
    public final /* synthetic */ BorderStroke D;
    public final /* synthetic */ boolean E;
    public final /* synthetic */ MutableInteractionSource F;
    public final /* synthetic */ boolean G;
    public final /* synthetic */ Function0 H;
    public final /* synthetic */ float I;
    public final /* synthetic */ Function2 J;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Modifier f11219z;

    public SurfaceKt$Surface$3(Modifier modifier, Shape shape, long j2, float f2, BorderStroke borderStroke, boolean z2, MutableInteractionSource mutableInteractionSource, boolean z3, Function0 function0, float f3, Function2 function2) {
        this.f11219z = modifier;
        this.f11217A = shape;
        this.f11218B = j2;
        this.C = f2;
        this.D = borderStroke;
        this.E = z2;
        this.F = mutableInteractionSource;
        this.G = z3;
        this.H = function0;
        this.I = f3;
        this.J = function2;
    }

    public final void b(Composer composer, int i2) {
        Composer composer2 = composer;
        int i3 = i2;
        if (composer2.E((i3 & 3) != 2, i3 & 1)) {
            if (ComposerKt.P()) {
                ComposerKt.Y(1508735219, i3, -1, "androidx.compose.material3.Surface.<anonymous> (Surface.kt:321)");
            }
            Modifier c2 = ChildParentSemanticsKt.c(SelectableKt.b(SurfaceKt.h(InteractiveComponentSizeKt.h(this.f11219z), this.f11217A, SurfaceKt.i(this.f11218B, this.C, composer2, 0), this.D, ((Density) composer2.C(CompositionLocalsKt.g())).B1(this.I)), this.E, this.F, RippleKt.e(false, 0.0f, 0, 7, (Object) null), this.G, (Role) null, this.H, 16, (Object) null), (Function1) null, 1, (Object) null);
            Function2 function2 = this.J;
            MeasurePolicy g2 = BoxKt.g(Alignment.f15444a.o(), true);
            int a2 = ComposablesKt.a(composer2, 0);
            CompositionLocalMap I2 = composer.I();
            Modifier e2 = ComposedModifierKt.e(composer2, c2);
            ComposeUiNode.Companion companion = ComposeUiNode.f17222h;
            Function0 a3 = companion.a();
            if (composer.v() == null) {
                ComposablesKt.d();
            }
            composer.s();
            if (composer.n()) {
                composer2.y(a3);
            } else {
                composer.K();
            }
            Composer b2 = Updater.b(composer);
            Updater.g(b2, g2, companion.c());
            Updater.g(b2, I2, companion.e());
            Function2 b3 = companion.b();
            if (b2.n() || !Intrinsics.d(b2.g(), Integer.valueOf(a2))) {
                b2.N(Integer.valueOf(a2));
                b2.A(Integer.valueOf(a2), b3);
            }
            Updater.g(b2, e2, companion.d());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.f3797a;
            function2.m(composer2, 0);
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
