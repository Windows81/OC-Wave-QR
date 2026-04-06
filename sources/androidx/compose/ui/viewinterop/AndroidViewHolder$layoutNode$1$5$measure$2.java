package androidx.compose.ui.viewinterop;

import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.LayoutNode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class AndroidViewHolder$layoutNode$1$5$measure$2 extends Lambda implements Function1<Placeable.PlacementScope, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ LayoutNode f19213A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ AndroidViewHolder f19214z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AndroidViewHolder$layoutNode$1$5$measure$2(AndroidViewHolder androidViewHolder, LayoutNode layoutNode) {
        super(1);
        this.f19214z = androidViewHolder;
        this.f19213A = layoutNode;
    }

    public final void b(Placeable.PlacementScope placementScope) {
        AndroidViewHolder_androidKt.f(this.f19214z, this.f19213A);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        b((Placeable.PlacementScope) obj);
        return Unit.f40552a;
    }
}
