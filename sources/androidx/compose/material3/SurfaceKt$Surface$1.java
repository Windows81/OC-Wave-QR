package androidx.compose.material3;

import androidx.compose.foundation.BorderStroke;
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
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.Density;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class SurfaceKt$Surface$1 implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Shape f11210A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ long f11211B;
    public final /* synthetic */ float C;
    public final /* synthetic */ BorderStroke D;
    public final /* synthetic */ float E;
    public final /* synthetic */ Function2 F;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Modifier f11212z;

    public SurfaceKt$Surface$1(Modifier modifier, Shape shape, long j2, float f2, BorderStroke borderStroke, float f3, Function2 function2) {
        this.f11212z = modifier;
        this.f11210A = shape;
        this.f11211B = j2;
        this.C = f2;
        this.D = borderStroke;
        this.E = f3;
        this.F = function2;
    }

    /* access modifiers changed from: private */
    public static final Unit e(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertiesKt.c0(semanticsPropertyReceiver, true);
        return Unit.f40552a;
    }

    public final void c(Composer composer, int i2) {
        if (composer.E((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.P()) {
                ComposerKt.Y(421772006, i2, -1, "androidx.compose.material3.Surface.<anonymous> (Surface.kt:110)");
            }
            Modifier f2 = SurfaceKt.h(this.f11212z, this.f11210A, SurfaceKt.i(this.f11211B, this.C, composer, 0), this.D, ((Density) composer.C(CompositionLocalsKt.g())).B1(this.E));
            Object g2 = composer.g();
            Composer.Companion companion = Composer.f14567a;
            if (g2 == companion.a()) {
                g2 = new K6();
                composer.N(g2);
            }
            Modifier c2 = SemanticsModifierKt.c(f2, false, (Function1) g2);
            Unit unit = Unit.f40552a;
            Object g3 = composer.g();
            if (g3 == companion.a()) {
                g3 = SurfaceKt$Surface$1$3$1.f11213z;
                composer.N(g3);
            }
            Modifier c3 = SuspendingPointerInputFilterKt.c(c2, unit, (PointerInputEventHandler) g3);
            Function2 function2 = this.F;
            MeasurePolicy g4 = BoxKt.g(Alignment.f15444a.o(), true);
            int a2 = ComposablesKt.a(composer, 0);
            CompositionLocalMap I = composer.I();
            Modifier e2 = ComposedModifierKt.e(composer, c3);
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
            Composer b2 = Updater.b(composer);
            Updater.g(b2, g4, companion2.c());
            Updater.g(b2, I, companion2.e());
            Function2 b3 = companion2.b();
            if (b2.n() || !Intrinsics.d(b2.g(), Integer.valueOf(a2))) {
                b2.N(Integer.valueOf(a2));
                b2.A(Integer.valueOf(a2), b3);
            }
            Updater.g(b2, e2, companion2.d());
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
        c((Composer) obj, ((Number) obj2).intValue());
        return Unit.f40552a;
    }
}
