package androidx.compose.ui.layout;

import androidx.compose.ui.node.LayoutNode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class LookaheadScopeKt$LookaheadScope$2$1 extends Lambda implements Function1<LayoutNode, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public static final LookaheadScopeKt$LookaheadScope$2$1 f17103z = new LookaheadScopeKt$LookaheadScope$2$1();

    public LookaheadScopeKt$LookaheadScope$2$1() {
        super(1);
    }

    public final void b(LayoutNode layoutNode) {
        layoutNode.b2(true);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        b((LayoutNode) obj);
        return Unit.f40552a;
    }
}
