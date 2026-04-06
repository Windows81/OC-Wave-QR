package androidx.compose.foundation.layout;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import kotlin.Lazy;
import kotlin.Metadata;

@Metadata
public final class FlowColumnOverflowScopeImpl implements FlowColumnScope, FlowColumnOverflowScope {

    /* renamed from: a  reason: collision with root package name */
    public final FlowLayoutOverflowState f3916a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ FlowColumnScopeInstance f3917b = FlowColumnScopeInstance.f3922b;

    /* renamed from: c  reason: collision with root package name */
    public final Lazy f3918c = FlowLayoutOverflowKt.b((String) null, new FlowColumnOverflowScopeImpl$totalItemCount$2(this), 1, (Object) null);

    /* renamed from: d  reason: collision with root package name */
    public final Lazy f3919d;

    public FlowColumnOverflowScopeImpl(FlowLayoutOverflowState flowLayoutOverflowState) {
        this.f3916a = flowLayoutOverflowState;
        this.f3919d = FlowLayoutOverflowKt.a(flowLayoutOverflowState.k(), new FlowColumnOverflowScopeImpl$shownItemCount$2(this));
    }

    public Modifier a(Modifier modifier, float f2, boolean z2) {
        return this.f3917b.a(modifier, f2, z2);
    }

    public Modifier b(Modifier modifier, Alignment.Horizontal horizontal) {
        return this.f3917b.b(modifier, horizontal);
    }
}
