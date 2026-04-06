package androidx.compose.material;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.selection.ToggleableKt;
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
import androidx.compose.ui.semantics.Role;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class SurfaceKt$Surface$7 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Shape f8536A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ long f8537B;
    public final /* synthetic */ float C;
    public final /* synthetic */ BorderStroke D;
    public final /* synthetic */ float E;
    public final /* synthetic */ boolean F;
    public final /* synthetic */ MutableInteractionSource G;
    public final /* synthetic */ boolean H;
    public final /* synthetic */ Function1 I;
    public final /* synthetic */ Function2 J;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Modifier f8538z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SurfaceKt$Surface$7(Modifier modifier, Shape shape, long j2, float f2, BorderStroke borderStroke, float f3, boolean z2, MutableInteractionSource mutableInteractionSource, boolean z3, Function1 function1, Function2 function2) {
        super(2);
        this.f8538z = modifier;
        this.f8536A = shape;
        this.f8537B = j2;
        this.C = f2;
        this.D = borderStroke;
        this.E = f3;
        this.F = z2;
        this.G = mutableInteractionSource;
        this.H = z3;
        this.I = function1;
        this.J = function2;
    }

    public final void b(Composer composer, int i2) {
        Composer composer2 = composer;
        int i3 = i2;
        if (composer2.E((i3 & 3) != 2, i3 & 1)) {
            if (ComposerKt.P()) {
                ComposerKt.Y(-311657392, i3, -1, "androidx.compose.material.Surface.<anonymous> (Surface.kt:435)");
            }
            Modifier b2 = ToggleableKt.b(SurfaceKt.g(InteractiveComponentSizeKt.c(this.f8538z), this.f8536A, SurfaceKt.h(this.f8537B, (ElevationOverlay) composer2.C(ElevationOverlayKt.d()), this.C, composer, 0), this.D, this.E), this.F, this.G, RippleKt.f(false, 0.0f, 0, 7, (Object) null), this.H, (Role) null, this.I, 16, (Object) null);
            Function2 function2 = this.J;
            MeasurePolicy g2 = BoxKt.g(Alignment.f15444a.o(), true);
            int a2 = ComposablesKt.a(composer2, 0);
            CompositionLocalMap I2 = composer.I();
            Modifier e2 = ComposedModifierKt.e(composer2, b2);
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
            Composer b3 = Updater.b(composer);
            Updater.g(b3, g2, companion.c());
            Updater.g(b3, I2, companion.e());
            Function2 b4 = companion.b();
            if (b3.n() || !Intrinsics.d(b3.g(), Integer.valueOf(a2))) {
                b3.N(Integer.valueOf(a2));
                b3.A(Integer.valueOf(a2), b4);
            }
            Updater.g(b3, e2, companion.d());
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
