package androidx.compose.ui.viewinterop;

import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.unit.Density;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class AndroidViewHolder$layoutNode$1$2 extends Lambda implements Function1<Density, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ LayoutNode f19206z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AndroidViewHolder$layoutNode$1$2(LayoutNode layoutNode) {
        super(1);
        this.f19206z = layoutNode;
    }

    public final void b(Density density) {
        this.f19206z.a(density);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        b((Density) obj);
        return Unit.f40552a;
    }
}
