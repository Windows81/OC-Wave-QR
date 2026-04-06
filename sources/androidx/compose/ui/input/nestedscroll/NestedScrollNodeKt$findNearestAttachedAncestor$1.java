package androidx.compose.ui.input.nestedscroll;

import androidx.compose.ui.node.TraversableNode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;

@Metadata
public final class NestedScrollNodeKt$findNearestAttachedAncestor$1 extends Lambda implements Function1<TraversableNode, Boolean> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Ref.ObjectRef f16794z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NestedScrollNodeKt$findNearestAttachedAncestor$1(Ref.ObjectRef objectRef) {
        super(1);
        this.f16794z = objectRef;
    }

    /* renamed from: b */
    public final Boolean invoke(TraversableNode traversableNode) {
        boolean z2;
        if (traversableNode.M().F2()) {
            this.f16794z.f40908z = traversableNode;
            z2 = false;
        } else {
            z2 = true;
        }
        return Boolean.valueOf(z2);
    }
}
