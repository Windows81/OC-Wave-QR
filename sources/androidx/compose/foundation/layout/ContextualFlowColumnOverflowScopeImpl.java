package androidx.compose.foundation.layout;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import kotlin.Metadata;

@Metadata
public final class ContextualFlowColumnOverflowScopeImpl implements FlowColumnOverflowScope, ContextualFlowColumnOverflowScope {

    /* renamed from: a  reason: collision with root package name */
    public final FlowLayoutOverflowState f3830a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ FlowColumnOverflowScopeImpl f3831b;

    public ContextualFlowColumnOverflowScopeImpl(FlowLayoutOverflowState flowLayoutOverflowState) {
        this.f3830a = flowLayoutOverflowState;
        this.f3831b = new FlowColumnOverflowScopeImpl(flowLayoutOverflowState);
    }

    public Modifier a(Modifier modifier, float f2, boolean z2) {
        return this.f3831b.a(modifier, f2, z2);
    }

    public Modifier b(Modifier modifier, Alignment.Horizontal horizontal) {
        return this.f3831b.b(modifier, horizontal);
    }
}
