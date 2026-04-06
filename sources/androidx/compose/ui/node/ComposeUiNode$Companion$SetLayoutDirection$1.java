package androidx.compose.ui.node;

import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class ComposeUiNode$Companion$SetLayoutDirection$1 extends Lambda implements Function2<ComposeUiNode, LayoutDirection, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public static final ComposeUiNode$Companion$SetLayoutDirection$1 f17235z = new ComposeUiNode$Companion$SetLayoutDirection$1();

    public ComposeUiNode$Companion$SetLayoutDirection$1() {
        super(2);
    }

    public final void b(ComposeUiNode composeUiNode, LayoutDirection layoutDirection) {
        composeUiNode.d(layoutDirection);
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        b((ComposeUiNode) obj, (LayoutDirection) obj2);
        return Unit.f40552a;
    }
}
