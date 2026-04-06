package androidx.compose.ui.node;

import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class BackwardsCompatNodeKt {

    /* renamed from: a  reason: collision with root package name */
    public static final BackwardsCompatNodeKt$DetachedModifierLocalReadScope$1 f17214a = new BackwardsCompatNodeKt$DetachedModifierLocalReadScope$1();

    /* renamed from: b  reason: collision with root package name */
    public static final Function1 f17215b = BackwardsCompatNodeKt$onDrawCacheReadsChanged$1.f17217z;

    /* renamed from: c  reason: collision with root package name */
    public static final Function1 f17216c = BackwardsCompatNodeKt$updateModifierLocalConsumer$1.f17218z;

    public static final boolean e(BackwardsCompatNode backwardsCompatNode) {
        Modifier.Node o2 = DelegatableNodeKt.o(backwardsCompatNode).u0().o();
        Intrinsics.g(o2, "null cannot be cast to non-null type androidx.compose.ui.node.TailModifierNode");
        return ((TailModifierNode) o2).Z2();
    }
}
