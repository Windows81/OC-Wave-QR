package androidx.compose.ui.node;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class OwnerSnapshotObserver$onCommitAffectingLookahead$1 extends Lambda implements Function1<LayoutNode, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public static final OwnerSnapshotObserver$onCommitAffectingLookahead$1 f17443z = new OwnerSnapshotObserver$onCommitAffectingLookahead$1();

    public OwnerSnapshotObserver$onCommitAffectingLookahead$1() {
        super(1);
    }

    public final void b(LayoutNode layoutNode) {
        if (layoutNode.v0()) {
            LayoutNode.B1(layoutNode, false, 1, (Object) null);
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        b((LayoutNode) obj);
        return Unit.f40552a;
    }
}
