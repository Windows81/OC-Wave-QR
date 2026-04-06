package androidx.compose.material;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
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
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class SurfaceKt$Surface$3 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Shape f8524A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ long f8525B;
    public final /* synthetic */ float C;
    public final /* synthetic */ BorderStroke D;
    public final /* synthetic */ float E;
    public final /* synthetic */ MutableInteractionSource F;
    public final /* synthetic */ boolean G;
    public final /* synthetic */ Function0 H;
    public final /* synthetic */ Function2 I;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Modifier f8526z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SurfaceKt$Surface$3(Modifier modifier, Shape shape, long j2, float f2, BorderStroke borderStroke, float f3, MutableInteractionSource mutableInteractionSource, boolean z2, Function0 function0, Function2 function2) {
        super(2);
        this.f8526z = modifier;
        this.f8524A = shape;
        this.f8525B = j2;
        this.C = f2;
        this.D = borderStroke;
        this.E = f3;
        this.F = mutableInteractionSource;
        this.G = z2;
        this.H = function0;
        this.I = function2;
    }

    public final void b(Composer composer, int i2) {
        Composer composer2 = composer;
        int i3 = i2;
        if (composer2.E((i3 & 3) != 2, i3 & 1)) {
            if (ComposerKt.P()) {
                ComposerKt.Y(2031491085, i3, -1, "androidx.compose.material.Surface.<anonymous> (Surface.kt:214)");
            }
            Modifier d2 = ClickableKt.d(SurfaceKt.g(InteractiveComponentSizeKt.c(this.f8526z), this.f8524A, SurfaceKt.h(this.f8525B, (ElevationOverlay) composer2.C(ElevationOverlayKt.d()), this.C, composer, 0), this.D, this.E), this.F, RippleKt.f(false, 0.0f, 0, 7, (Object) null), this.G, (String) null, (Role) null, this.H, 24, (Object) null);
            Function2 function2 = this.I;
            MeasurePolicy g2 = BoxKt.g(Alignment.f15444a.o(), true);
            int a2 = ComposablesKt.a(composer2, 0);
            CompositionLocalMap I2 = composer.I();
            Modifier e2 = ComposedModifierKt.e(composer2, d2);
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
