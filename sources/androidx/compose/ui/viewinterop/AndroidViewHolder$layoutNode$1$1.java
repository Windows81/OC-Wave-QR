package androidx.compose.ui.viewinterop;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.LayoutNode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class AndroidViewHolder$layoutNode$1$1 extends Lambda implements Function1<Modifier, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Modifier f19204A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ LayoutNode f19205z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AndroidViewHolder$layoutNode$1$1(LayoutNode layoutNode, Modifier modifier) {
        super(1);
        this.f19205z = layoutNode;
        this.f19204A = modifier;
    }

    public final void b(Modifier modifier) {
        this.f19205z.h(modifier.o0(this.f19204A));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        b((Modifier) obj);
        return Unit.f40552a;
    }
}
