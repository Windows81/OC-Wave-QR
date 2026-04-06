package androidx.compose.foundation.layout;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import kotlin.Metadata;

@Metadata
public final class ContextualFlowRowOverflowScopeImpl implements FlowRowOverflowScope, ContextualFlowRowOverflowScope {

    /* renamed from: a  reason: collision with root package name */
    public final FlowLayoutOverflowState f3860a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ FlowRowOverflowScopeImpl f3861b;

    public ContextualFlowRowOverflowScopeImpl(FlowLayoutOverflowState flowLayoutOverflowState) {
        this.f3860a = flowLayoutOverflowState;
        this.f3861b = new FlowRowOverflowScopeImpl(flowLayoutOverflowState);
    }

    public Modifier a(Modifier modifier, float f2, boolean z2) {
        return this.f3861b.a(modifier, f2, z2);
    }

    public Modifier b(Modifier modifier) {
        return this.f3861b.b(modifier);
    }

    public Modifier d(Modifier modifier, Alignment.Vertical vertical) {
        return this.f3861b.d(modifier, vertical);
    }
}
