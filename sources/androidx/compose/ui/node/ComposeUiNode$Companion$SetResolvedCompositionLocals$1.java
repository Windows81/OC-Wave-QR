package androidx.compose.ui.node;

import androidx.compose.runtime.CompositionLocalMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class ComposeUiNode$Companion$SetResolvedCompositionLocals$1 extends Lambda implements Function2<ComposeUiNode, CompositionLocalMap, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public static final ComposeUiNode$Companion$SetResolvedCompositionLocals$1 f17238z = new ComposeUiNode$Companion$SetResolvedCompositionLocals$1();

    public ComposeUiNode$Companion$SetResolvedCompositionLocals$1() {
        super(2);
    }

    public final void b(ComposeUiNode composeUiNode, CompositionLocalMap compositionLocalMap) {
        composeUiNode.l(compositionLocalMap);
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        b((ComposeUiNode) obj, (CompositionLocalMap) obj2);
        return Unit.f40552a;
    }
}
