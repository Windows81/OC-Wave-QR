package androidx.compose.ui.node;

import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class ComposeUiNode$Companion$SetModifier$1 extends Lambda implements Function2<ComposeUiNode, Modifier, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public static final ComposeUiNode$Companion$SetModifier$1 f17237z = new ComposeUiNode$Companion$SetModifier$1();

    public ComposeUiNode$Companion$SetModifier$1() {
        super(2);
    }

    public final void b(ComposeUiNode composeUiNode, Modifier modifier) {
        composeUiNode.h(modifier);
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        b((ComposeUiNode) obj, (Modifier) obj2);
        return Unit.f40552a;
    }
}
