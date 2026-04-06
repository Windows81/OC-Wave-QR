package androidx.compose.foundation;

import androidx.compose.ui.layout.PinnableContainerKt;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNodeKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;

@Metadata
public final class FocusableNode$retrievePinnableContainer$1 extends Lambda implements Function0<Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ FocusableNode f3074A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Ref.ObjectRef f3075z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FocusableNode$retrievePinnableContainer$1(Ref.ObjectRef objectRef, FocusableNode focusableNode) {
        super(0);
        this.f3075z = objectRef;
        this.f3074A = focusableNode;
    }

    public final void invoke() {
        this.f3075z.f40908z = CompositionLocalConsumerModifierNodeKt.a(this.f3074A, PinnableContainerKt.a());
    }
}
