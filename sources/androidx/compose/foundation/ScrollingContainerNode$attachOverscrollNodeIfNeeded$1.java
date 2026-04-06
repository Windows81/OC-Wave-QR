package androidx.compose.foundation;

import androidx.compose.ui.node.CompositionLocalConsumerModifierNodeKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class ScrollingContainerNode$attachOverscrollNodeIfNeeded$1 extends Lambda implements Function0<Unit> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ ScrollingContainerNode f3182z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ScrollingContainerNode$attachOverscrollNodeIfNeeded$1(ScrollingContainerNode scrollingContainerNode) {
        super(0);
        this.f3182z = scrollingContainerNode;
    }

    public final void invoke() {
        ScrollingContainerNode scrollingContainerNode = this.f3182z;
        scrollingContainerNode.b0 = (OverscrollFactory) CompositionLocalConsumerModifierNodeKt.a(scrollingContainerNode, OverscrollKt.a());
        ScrollingContainerNode scrollingContainerNode2 = this.f3182z;
        OverscrollFactory f3 = scrollingContainerNode2.b0;
        scrollingContainerNode2.c0 = f3 != null ? f3.a() : null;
    }
}
