package androidx.compose.foundation.layout;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

@Metadata
final class FlowRowOverflow$Companion$expandOrCollapseIndicator$1$collapseGetter$1 extends Lambda implements Function1<FlowLayoutOverflowState, Function2<? super Composer, ? super Integer, ? extends Unit>> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Function3 f4030z;

    /* renamed from: b */
    public final Function2 invoke(final FlowLayoutOverflowState flowLayoutOverflowState) {
        final Function3 function3 = this.f4030z;
        return ComposableLambdaKt.c(-972285589, true, new Function2<Composer, Integer, Unit>() {
            public final void b(Composer composer, int i2) {
                if (composer.E((i2 & 3) != 2, i2 & 1)) {
                    if (ComposerKt.P()) {
                        ComposerKt.Y(-972285589, i2, -1, "androidx.compose.foundation.layout.FlowRowOverflow.Companion.expandOrCollapseIndicator.<anonymous>.<anonymous>.<anonymous> (FlowLayoutOverflow.kt:158)");
                    }
                    function3.d(new FlowRowOverflowScopeImpl(flowLayoutOverflowState), composer, 0);
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
        });
    }
}
