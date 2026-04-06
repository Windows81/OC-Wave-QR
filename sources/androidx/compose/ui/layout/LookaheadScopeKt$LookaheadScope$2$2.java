package androidx.compose.ui.layout;

import androidx.compose.ui.node.LayoutNode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class LookaheadScopeKt$LookaheadScope$2$2 extends Lambda implements Function2<LayoutNode, LookaheadScopeImpl, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public static final LookaheadScopeKt$LookaheadScope$2$2 f17104z = new LookaheadScopeKt$LookaheadScope$2$2();

    public LookaheadScopeKt$LookaheadScope$2$2() {
        super(2);
    }

    public final void b(final LayoutNode layoutNode, LookaheadScopeImpl lookaheadScopeImpl) {
        lookaheadScopeImpl.a(new Function0<LayoutCoordinates>() {
            /* renamed from: b */
            public final LayoutCoordinates invoke() {
                LayoutNode C0 = layoutNode.C0();
                Intrinsics.f(C0);
                return C0.V().e1();
            }
        });
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        b((LayoutNode) obj, (LookaheadScopeImpl) obj2);
        return Unit.f40552a;
    }
}
