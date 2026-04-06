package androidx.compose.ui;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.platform.InspectableValueKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;

@Metadata
public final class ComposedModifierKt {
    public static final Modifier b(Modifier modifier, Function1 function1, Function3 function3) {
        return modifier.o0(new ComposedModifier(function1, function3));
    }

    public static /* synthetic */ Modifier c(Modifier modifier, Function1 function1, Function3 function3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            function1 = InspectableValueKt.a();
        }
        return b(modifier, function1, function3);
    }

    public static final Modifier d(Composer composer, Modifier modifier) {
        if (modifier.P(ComposedModifierKt$materializeImpl$1.f15482z)) {
            return modifier;
        }
        composer.f(1219399079);
        Modifier modifier2 = (Modifier) modifier.C(Modifier.f15489d, new ComposedModifierKt$materializeImpl$result$1(composer));
        composer.S();
        return modifier2;
    }

    public static final Modifier e(Composer composer, Modifier modifier) {
        composer.X(439770924);
        Modifier d2 = d(composer, modifier);
        composer.M();
        return d2;
    }

    public static final Modifier f(Composer composer, Modifier modifier) {
        return modifier == Modifier.f15489d ? modifier : e(composer, new CompositionLocalMapInjectionElement(composer.I()).o0(modifier));
    }
}
