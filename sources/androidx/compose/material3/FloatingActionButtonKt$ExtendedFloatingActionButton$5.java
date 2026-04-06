package androidx.compose.material3;

import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.TransitionKt;
import androidx.compose.animation.core.TwoWayConverter;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material3.tokens.MotionSchemeKeyTokens;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.layout.LayoutModifierKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.util.MathHelpersKt;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FloatCompanionObject;
import kotlin.jvm.internal.Intrinsics;

@Metadata
final class FloatingActionButtonKt$ExtendedFloatingActionButton$5 implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ float f10059A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ float f10060B;
    public final /* synthetic */ float C;
    public final /* synthetic */ float D;
    public final /* synthetic */ Function2 E;
    public final /* synthetic */ float F;
    public final /* synthetic */ Function2 G;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ boolean f10061z;

    public static final Unit i(State state, GraphicsLayerScope graphicsLayerScope) {
        graphicsLayerScope.d(((Number) state.getValue()).floatValue());
        return Unit.f40552a;
    }

    public static final boolean k(Transition transition) {
        return ((Number) transition.i()).floatValue() == 0.0f && !transition.u();
    }

    public static final Unit p(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        return Unit.f40552a;
    }

    public static final MeasureResult q(float f2, State state, MeasureScope measureScope, Measurable measurable, Constraints constraints) {
        int c2 = MathHelpersKt.c(measureScope.P1(f2), measurable.a0(Constraints.k(constraints.r())), ((Number) state.getValue()).floatValue());
        Placeable c0 = measurable.c0(constraints.r());
        return MeasureScope.R1(measureScope, c2, c0.C0(), (Map) null, new V2(c0), 4, (Object) null);
    }

    public static final Unit s(Placeable placeable, Placeable.PlacementScope placementScope) {
        Placeable.PlacementScope.j(placementScope, placeable, 0, 0, 0.0f, 4, (Object) null);
        return Unit.f40552a;
    }

    public final void h(Composer composer, int i2) {
        Composer composer2 = composer;
        int i3 = i2;
        if (composer2.E((i3 & 3) != 2, 1 & i3)) {
            if (ComposerKt.P()) {
                ComposerKt.Y(-827388388, i3, -1, "androidx.compose.material3.ExtendedFloatingActionButton.<anonymous> (FloatingActionButton.kt:464)");
            }
            Transition j2 = TransitionKt.j(Float.valueOf(this.f10061z ? 1.0f : 0.0f), "expanded state", composer2, 48, 0);
            FiniteAnimationSpec b2 = MotionSchemeKt.b(MotionSchemeKeyTokens.FastSpatial, composer2, 6);
            FiniteAnimationSpec b3 = MotionSchemeKt.b(MotionSchemeKeyTokens.FastEffects, composer2, 6);
            FloatingActionButtonKt$ExtendedFloatingActionButton$5$expandedWidthProgress$1 floatingActionButtonKt$ExtendedFloatingActionButton$5$expandedWidthProgress$1 = new FloatingActionButtonKt$ExtendedFloatingActionButton$5$expandedWidthProgress$1(b2);
            FloatCompanionObject floatCompanionObject = FloatCompanionObject.f40896a;
            TwoWayConverter i4 = VectorConvertersKt.i(floatCompanionObject);
            float floatValue = ((Number) j2.i()).floatValue();
            composer2.X(-157343033);
            if (ComposerKt.P()) {
                ComposerKt.Y(-157343033, 0, -1, "androidx.compose.material3.ExtendedFloatingActionButton.<anonymous>.<anonymous> (FloatingActionButton.kt:469)");
            }
            if (ComposerKt.P()) {
                ComposerKt.X();
            }
            composer.M();
            Float valueOf = Float.valueOf(floatValue);
            float floatValue2 = ((Number) j2.q()).floatValue();
            composer2.X(-157343033);
            if (ComposerKt.P()) {
                ComposerKt.Y(-157343033, 0, -1, "androidx.compose.material3.ExtendedFloatingActionButton.<anonymous>.<anonymous> (FloatingActionButton.kt:469)");
            }
            if (ComposerKt.P()) {
                ComposerKt.X();
            }
            composer.M();
            State f2 = TransitionKt.f(j2, valueOf, Float.valueOf(floatValue2), (FiniteAnimationSpec) floatingActionButtonKt$ExtendedFloatingActionButton$5$expandedWidthProgress$1.d(j2.o(), composer2, 0), i4, "FloatAnimation", composer, 0);
            FloatingActionButtonKt$ExtendedFloatingActionButton$5$expandedAlphaProgress$1 floatingActionButtonKt$ExtendedFloatingActionButton$5$expandedAlphaProgress$1 = new FloatingActionButtonKt$ExtendedFloatingActionButton$5$expandedAlphaProgress$1(b3);
            TwoWayConverter i5 = VectorConvertersKt.i(floatCompanionObject);
            float floatValue3 = ((Number) j2.i()).floatValue();
            composer2.X(175363167);
            if (ComposerKt.P()) {
                ComposerKt.Y(175363167, 0, -1, "androidx.compose.material3.ExtendedFloatingActionButton.<anonymous>.<anonymous> (FloatingActionButton.kt:471)");
            }
            if (ComposerKt.P()) {
                ComposerKt.X();
            }
            composer.M();
            Float valueOf2 = Float.valueOf(floatValue3);
            float floatValue4 = ((Number) j2.q()).floatValue();
            composer2.X(175363167);
            if (ComposerKt.P()) {
                ComposerKt.Y(175363167, 0, -1, "androidx.compose.material3.ExtendedFloatingActionButton.<anonymous>.<anonymous> (FloatingActionButton.kt:471)");
            }
            if (ComposerKt.P()) {
                ComposerKt.X();
            }
            composer.M();
            State state = f2;
            State f3 = TransitionKt.f(j2, valueOf2, Float.valueOf(floatValue4), (FiniteAnimationSpec) floatingActionButtonKt$ExtendedFloatingActionButton$5$expandedAlphaProgress$1.d(j2.o(), composer2, 0), i5, "FloatAnimation", composer, 0);
            Modifier.Companion companion = Modifier.f15489d;
            boolean h2 = composer2.h(this.f10059A) | composer2.W(state);
            float f4 = this.f10059A;
            Object g2 = composer.g();
            if (h2 || g2 == Composer.f14567a.a()) {
                g2 = new R2(f4, state);
                composer2.N(g2);
            }
            Modifier m2 = PaddingKt.m(SizeKt.x(LayoutModifierKt.a(companion, (Function3) g2), this.f10059A, this.f10060B, 0.0f, 0.0f, 12, (Object) null), this.C, 0.0f, this.D, 0.0f, 10, (Object) null);
            Alignment.Companion companion2 = Alignment.f15444a;
            Alignment.Vertical i6 = companion2.i();
            Function2 function2 = this.E;
            float f5 = this.F;
            Function2 function22 = this.G;
            Arrangement arrangement = Arrangement.f3739a;
            MeasurePolicy b4 = RowKt.b(arrangement.f(), i6, composer2, 48);
            int a2 = ComposablesKt.a(composer2, 0);
            CompositionLocalMap I = composer.I();
            Modifier e2 = ComposedModifierKt.e(composer2, m2);
            ComposeUiNode.Companion companion3 = ComposeUiNode.f17222h;
            Function0 a3 = companion3.a();
            if (composer.v() == null) {
                ComposablesKt.d();
            }
            composer.s();
            if (composer.n()) {
                composer2.y(a3);
            } else {
                composer.K();
            }
            Composer b5 = Updater.b(composer);
            Updater.g(b5, b4, companion3.c());
            Updater.g(b5, I, companion3.e());
            Function2 b6 = companion3.b();
            if (b5.n() || !Intrinsics.d(b5.g(), Integer.valueOf(a2))) {
                b5.N(Integer.valueOf(a2));
                b5.A(Integer.valueOf(a2), b6);
            }
            Updater.g(b5, e2, companion3.d());
            RowScopeInstance rowScopeInstance = RowScopeInstance.f4150a;
            function2.m(composer2, 0);
            boolean W = composer2.W(j2);
            Object g3 = composer.g();
            if (W || g3 == Composer.f14567a.a()) {
                g3 = SnapshotStateKt.e(new S2(j2));
                composer2.N(g3);
            }
            if (!((Boolean) ((State) g3).getValue()).booleanValue()) {
                composer2.X(65675329);
                Object g4 = composer.g();
                Composer.Companion companion4 = Composer.f14567a;
                if (g4 == companion4.a()) {
                    g4 = new T2();
                    composer2.N(g4);
                }
                Modifier a4 = SemanticsModifierKt.a(companion, (Function1) g4);
                boolean W2 = composer2.W(f3);
                Object g5 = composer.g();
                if (W2 || g5 == companion4.a()) {
                    g5 = new U2(f3);
                    composer2.N(g5);
                }
                Modifier a5 = GraphicsLayerModifierKt.a(a4, (Function1) g5);
                MeasurePolicy b7 = RowKt.b(arrangement.f(), companion2.l(), composer2, 0);
                int a6 = ComposablesKt.a(composer2, 0);
                CompositionLocalMap I2 = composer.I();
                Modifier e3 = ComposedModifierKt.e(composer2, a5);
                Function0 a7 = companion3.a();
                if (composer.v() == null) {
                    ComposablesKt.d();
                }
                composer.s();
                if (composer.n()) {
                    composer2.y(a7);
                } else {
                    composer.K();
                }
                Composer b8 = Updater.b(composer);
                Updater.g(b8, b7, companion3.c());
                Updater.g(b8, I2, companion3.e());
                Function2 b9 = companion3.b();
                if (b8.n() || !Intrinsics.d(b8.g(), Integer.valueOf(a6))) {
                    b8.N(Integer.valueOf(a6));
                    b8.A(Integer.valueOf(a6), b9);
                }
                Updater.g(b8, e3, companion3.d());
                SpacerKt.a(SizeKt.y(companion, f5), composer2, 0);
                function22.m(composer2, 0);
                composer.T();
                composer.M();
            } else {
                composer2.X(65953058);
                composer.M();
            }
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
        h((Composer) obj, ((Number) obj2).intValue());
        return Unit.f40552a;
    }
}
