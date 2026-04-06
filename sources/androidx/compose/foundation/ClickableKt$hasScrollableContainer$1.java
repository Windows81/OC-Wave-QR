package androidx.compose.foundation;

import androidx.compose.foundation.gestures.ScrollableContainerNode;
import androidx.compose.ui.node.TraversableNode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;

@Metadata
public final class ClickableKt$hasScrollableContainer$1 extends Lambda implements Function1<TraversableNode, Boolean> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Ref.BooleanRef f3030z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ClickableKt$hasScrollableContainer$1(Ref.BooleanRef booleanRef) {
        super(1);
        this.f3030z = booleanRef;
    }

    /* renamed from: b */
    public final Boolean invoke(TraversableNode traversableNode) {
        boolean z2;
        Ref.BooleanRef booleanRef = this.f3030z;
        if (!booleanRef.f40901z) {
            Intrinsics.g(traversableNode, "null cannot be cast to non-null type androidx.compose.foundation.gestures.ScrollableContainerNode");
            if (!((ScrollableContainerNode) traversableNode).Z2()) {
                z2 = false;
                booleanRef.f40901z = z2;
                return Boolean.valueOf(!this.f3030z.f40901z);
            }
        }
        z2 = true;
        booleanRef.f40901z = z2;
        return Boolean.valueOf(!this.f3030z.f40901z);
    }
}
