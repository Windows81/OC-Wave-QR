package androidx.compose.ui.node;

import androidx.compose.ui.layout.MeasurePolicy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class ComposeUiNode$Companion$SetMeasurePolicy$1 extends Lambda implements Function2<ComposeUiNode, MeasurePolicy, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public static final ComposeUiNode$Companion$SetMeasurePolicy$1 f17236z = new ComposeUiNode$Companion$SetMeasurePolicy$1();

    public ComposeUiNode$Companion$SetMeasurePolicy$1() {
        super(2);
    }

    public final void b(ComposeUiNode composeUiNode, MeasurePolicy measurePolicy) {
        composeUiNode.e(measurePolicy);
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        b((ComposeUiNode) obj, (MeasurePolicy) obj2);
        return Unit.f40552a;
    }
}
