package androidx.compose.ui.layout;

import androidx.compose.ui.node.LayoutNode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class SubcomposeLayoutState$setRoot$1 extends Lambda implements Function2<LayoutNode, SubcomposeLayoutState, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ SubcomposeLayoutState f17172z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SubcomposeLayoutState$setRoot$1(SubcomposeLayoutState subcomposeLayoutState) {
        super(2);
        this.f17172z = subcomposeLayoutState;
    }

    public final void b(LayoutNode layoutNode, SubcomposeLayoutState subcomposeLayoutState) {
        SubcomposeLayoutState subcomposeLayoutState2 = this.f17172z;
        LayoutNodeSubcompositionsState E0 = layoutNode.E0();
        if (E0 == null) {
            E0 = new LayoutNodeSubcompositionsState(layoutNode, this.f17172z.f17165a);
            layoutNode.a2(E0);
        }
        subcomposeLayoutState2.f17166b = E0;
        this.f17172z.h().B();
        this.f17172z.h().I(this.f17172z.f17165a);
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        b((LayoutNode) obj, (SubcomposeLayoutState) obj2);
        return Unit.f40552a;
    }
}
