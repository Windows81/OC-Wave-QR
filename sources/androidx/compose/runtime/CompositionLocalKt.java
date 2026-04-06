package androidx.compose.runtime;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

@Metadata
public final class CompositionLocalKt {
    public static final void c(ProvidedValue providedValue, Function2 function2, Composer composer, int i2) {
        Composer q2 = composer.q(-149765515);
        if (ComposerKt.P()) {
            ComposerKt.Y(-149765515, i2, -1, "androidx.compose.runtime.CompositionLocalProvider (CompositionLocal.kt:387)");
        }
        q2.u(providedValue);
        function2.m(q2, Integer.valueOf((i2 >> 3) & 14));
        q2.R();
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
        ScopeUpdateScope x2 = q2.x();
        if (x2 != null) {
            x2.a(new j(providedValue, function2, i2));
        }
    }

    public static final void d(ProvidedValue[] providedValueArr, Function2 function2, Composer composer, int i2) {
        Composer q2 = composer.q(415205898);
        if (ComposerKt.P()) {
            ComposerKt.Y(415205898, i2, -1, "androidx.compose.runtime.CompositionLocalProvider (CompositionLocal.kt:367)");
        }
        q2.Z(providedValueArr);
        function2.m(q2, Integer.valueOf((i2 >> 3) & 14));
        q2.H();
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
        ScopeUpdateScope x2 = q2.x();
        if (x2 != null) {
            x2.a(new k(providedValueArr, function2, i2));
        }
    }

    public static final Unit e(ProvidedValue[] providedValueArr, Function2 function2, int i2, Composer composer, int i3) {
        d(providedValueArr, function2, composer, RecomposeScopeImplKt.a(i2 | 1));
        return Unit.f40552a;
    }

    public static final Unit f(ProvidedValue providedValue, Function2 function2, int i2, Composer composer, int i3) {
        c(providedValue, function2, composer, RecomposeScopeImplKt.a(i2 | 1));
        return Unit.f40552a;
    }

    public static final ProvidableCompositionLocal g(SnapshotMutationPolicy snapshotMutationPolicy, Function0 function0) {
        return new DynamicProvidableCompositionLocal(snapshotMutationPolicy, function0);
    }

    public static /* synthetic */ ProvidableCompositionLocal h(SnapshotMutationPolicy snapshotMutationPolicy, Function0 function0, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            snapshotMutationPolicy = SnapshotStateKt.r();
        }
        return g(snapshotMutationPolicy, function0);
    }

    public static final ProvidableCompositionLocal i(Function1 function1) {
        return new ComputedProvidableCompositionLocal(function1);
    }

    public static final ProvidableCompositionLocal j(Function0 function0) {
        return new StaticProvidableCompositionLocal(function0);
    }
}
