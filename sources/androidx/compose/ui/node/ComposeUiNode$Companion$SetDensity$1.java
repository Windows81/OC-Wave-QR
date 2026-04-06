package androidx.compose.ui.node;

import androidx.compose.ui.unit.Density;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class ComposeUiNode$Companion$SetDensity$1 extends Lambda implements Function2<ComposeUiNode, Density, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public static final ComposeUiNode$Companion$SetDensity$1 f17234z = new ComposeUiNode$Companion$SetDensity$1();

    public ComposeUiNode$Companion$SetDensity$1() {
        super(2);
    }

    public final void b(ComposeUiNode composeUiNode, Density density) {
        composeUiNode.a(density);
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        b((ComposeUiNode) obj, (Density) obj2);
        return Unit.f40552a;
    }
}
