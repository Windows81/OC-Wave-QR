package androidx.compose.foundation.layout;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.SubcomposeMeasureScope;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class FlowMeasureLazyPolicy$measure$measurablesIterator$1 extends Lambda implements Function2<Integer, FlowLineInfo, List<? extends Measurable>> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ FlowMeasureLazyPolicy f4008A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ SubcomposeMeasureScope f4009z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FlowMeasureLazyPolicy$measure$measurablesIterator$1(SubcomposeMeasureScope subcomposeMeasureScope, FlowMeasureLazyPolicy flowMeasureLazyPolicy) {
        super(2);
        this.f4009z = subcomposeMeasureScope;
        this.f4008A = flowMeasureLazyPolicy;
    }

    public final List b(final int i2, final FlowLineInfo flowLineInfo) {
        SubcomposeMeasureScope subcomposeMeasureScope = this.f4009z;
        Integer valueOf = Integer.valueOf(i2);
        final FlowMeasureLazyPolicy flowMeasureLazyPolicy = this.f4008A;
        return subcomposeMeasureScope.j0(valueOf, ComposableLambdaKt.c(-195060736, true, new Function2<Composer, Integer, Unit>() {
            public final void b(Composer composer, int i2) {
                if (composer.E((i2 & 3) != 2, i2 & 1)) {
                    if (ComposerKt.P()) {
                        ComposerKt.Y(-195060736, i2, -1, "androidx.compose.foundation.layout.FlowMeasureLazyPolicy.measure.<anonymous>.<anonymous> (ContextualFlowLayout.kt:496)");
                    }
                    flowMeasureLazyPolicy.f4003l.j(Integer.valueOf(i2), flowLineInfo, composer, 0);
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
        }));
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        return b(((Number) obj).intValue(), (FlowLineInfo) obj2);
    }
}
