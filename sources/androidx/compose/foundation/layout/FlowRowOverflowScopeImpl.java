package androidx.compose.foundation.layout;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import kotlin.Lazy;
import kotlin.Metadata;

@Metadata
public final class FlowRowOverflowScopeImpl implements FlowRowScope, FlowRowOverflowScope {

    /* renamed from: a  reason: collision with root package name */
    public final FlowLayoutOverflowState f4036a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ FlowRowScopeInstance f4037b = FlowRowScopeInstance.f4042b;

    /* renamed from: c  reason: collision with root package name */
    public final Lazy f4038c = FlowLayoutOverflowKt.b((String) null, new FlowRowOverflowScopeImpl$totalItemCount$2(this), 1, (Object) null);

    /* renamed from: d  reason: collision with root package name */
    public final Lazy f4039d;

    public FlowRowOverflowScopeImpl(FlowLayoutOverflowState flowLayoutOverflowState) {
        this.f4036a = flowLayoutOverflowState;
        this.f4039d = FlowLayoutOverflowKt.a(flowLayoutOverflowState.k(), new FlowRowOverflowScopeImpl$shownItemCount$2(this));
    }

    public Modifier a(Modifier modifier, float f2, boolean z2) {
        return this.f4037b.a(modifier, f2, z2);
    }

    public Modifier b(Modifier modifier) {
        return this.f4037b.b(modifier);
    }

    public Modifier d(Modifier modifier, Alignment.Vertical vertical) {
        return this.f4037b.d(modifier, vertical);
    }
}
