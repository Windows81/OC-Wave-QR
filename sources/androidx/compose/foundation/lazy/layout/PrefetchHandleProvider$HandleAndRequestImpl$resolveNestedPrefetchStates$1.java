package androidx.compose.foundation.lazy.layout;

import androidx.compose.ui.node.TraversableNode;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;

@Metadata
public final class PrefetchHandleProvider$HandleAndRequestImpl$resolveNestedPrefetchStates$1 extends Lambda implements Function1<TraversableNode, TraversableNode.Companion.TraverseDescendantsAction> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Ref.ObjectRef f4982z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PrefetchHandleProvider$HandleAndRequestImpl$resolveNestedPrefetchStates$1(Ref.ObjectRef objectRef) {
        super(1);
        this.f4982z = objectRef;
    }

    /* renamed from: b */
    public final TraversableNode.Companion.TraverseDescendantsAction invoke(TraversableNode traversableNode) {
        Intrinsics.g(traversableNode, "null cannot be cast to non-null type androidx.compose.foundation.lazy.layout.TraversablePrefetchStateNode");
        LazyLayoutPrefetchState Z2 = ((TraversablePrefetchStateNode) traversableNode).Z2();
        Ref.ObjectRef objectRef = this.f4982z;
        List list = (List) objectRef.f40908z;
        if (list != null) {
            list.add(Z2);
        } else {
            list = CollectionsKt.s(Z2);
        }
        objectRef.f40908z = list;
        return TraversableNode.Companion.TraverseDescendantsAction.SkipSubtreeAndContinueTraversal;
    }
}
