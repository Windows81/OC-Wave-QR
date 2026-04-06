package androidx.compose.ui.node;

import androidx.compose.ui.platform.ViewConfiguration;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class ComposeUiNode$Companion$SetViewConfiguration$1 extends Lambda implements Function2<ComposeUiNode, ViewConfiguration, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public static final ComposeUiNode$Companion$SetViewConfiguration$1 f17239z = new ComposeUiNode$Companion$SetViewConfiguration$1();

    public ComposeUiNode$Companion$SetViewConfiguration$1() {
        super(2);
    }

    public final void b(ComposeUiNode composeUiNode, ViewConfiguration viewConfiguration) {
        composeUiNode.k(viewConfiguration);
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        b((ComposeUiNode) obj, (ViewConfiguration) obj2);
        return Unit.f40552a;
    }
}
