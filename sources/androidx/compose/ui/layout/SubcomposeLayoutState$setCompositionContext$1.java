package androidx.compose.ui.layout;

import androidx.compose.runtime.CompositionContext;
import androidx.compose.ui.node.LayoutNode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class SubcomposeLayoutState$setCompositionContext$1 extends Lambda implements Function2<LayoutNode, CompositionContext, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ SubcomposeLayoutState f17170z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SubcomposeLayoutState$setCompositionContext$1(SubcomposeLayoutState subcomposeLayoutState) {
        super(2);
        this.f17170z = subcomposeLayoutState;
    }

    public final void b(LayoutNode layoutNode, CompositionContext compositionContext) {
        this.f17170z.h().H(compositionContext);
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        b((LayoutNode) obj, (CompositionContext) obj2);
        return Unit.f40552a;
    }
}
