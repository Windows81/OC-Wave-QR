package androidx.compose.ui.node;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class OwnerSnapshotObserver$onCommitAffectingSemantics$1 extends Lambda implements Function1<LayoutNode, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public static final OwnerSnapshotObserver$onCommitAffectingSemantics$1 f17446z = new OwnerSnapshotObserver$onCommitAffectingSemantics$1();

    public OwnerSnapshotObserver$onCommitAffectingSemantics$1() {
        super(1);
    }

    public final void b(LayoutNode layoutNode) {
        if (layoutNode.v0()) {
            layoutNode.U0();
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        b((LayoutNode) obj);
        return Unit.f40552a;
    }
}
