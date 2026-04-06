package androidx.compose.ui.node;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class ComposeUiNode$Companion$SetCompositeKeyHash$1 extends Lambda implements Function2<ComposeUiNode, Integer, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public static final ComposeUiNode$Companion$SetCompositeKeyHash$1 f17233z = new ComposeUiNode$Companion$SetCompositeKeyHash$1();

    public ComposeUiNode$Companion$SetCompositeKeyHash$1() {
        super(2);
    }

    public final void b(ComposeUiNode composeUiNode, int i2) {
        composeUiNode.f(i2);
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        b((ComposeUiNode) obj, ((Number) obj2).intValue());
        return Unit.f40552a;
    }
}
