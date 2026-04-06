package androidx.compose.ui.layout;

import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.unit.Constraints;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class SubcomposeLayoutState$setMeasurePolicy$1 extends Lambda implements Function2<LayoutNode, Function2<? super SubcomposeMeasureScope, ? super Constraints, ? extends MeasureResult>, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ SubcomposeLayoutState f17171z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SubcomposeLayoutState$setMeasurePolicy$1(SubcomposeLayoutState subcomposeLayoutState) {
        super(2);
        this.f17171z = subcomposeLayoutState;
    }

    public final void b(LayoutNode layoutNode, Function2 function2) {
        layoutNode.e(this.f17171z.h().u(function2));
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        b((LayoutNode) obj, (Function2) obj2);
        return Unit.f40552a;
    }
}
