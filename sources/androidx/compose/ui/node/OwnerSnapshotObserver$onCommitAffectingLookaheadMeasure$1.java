package androidx.compose.ui.node;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class OwnerSnapshotObserver$onCommitAffectingLookaheadMeasure$1 extends Lambda implements Function1<LayoutNode, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public static final OwnerSnapshotObserver$onCommitAffectingLookaheadMeasure$1 f17444z = new OwnerSnapshotObserver$onCommitAffectingLookaheadMeasure$1();

    public OwnerSnapshotObserver$onCommitAffectingLookaheadMeasure$1() {
        super(1);
    }

    public final void b(LayoutNode layoutNode) {
        if (layoutNode.v0()) {
            LayoutNode.D1(layoutNode, false, false, false, 7, (Object) null);
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        b((LayoutNode) obj);
        return Unit.f40552a;
    }
}
