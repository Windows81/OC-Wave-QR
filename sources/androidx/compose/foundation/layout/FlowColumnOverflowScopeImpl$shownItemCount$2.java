package androidx.compose.foundation.layout;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class FlowColumnOverflowScopeImpl$shownItemCount$2 extends Lambda implements Function0<Integer> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ FlowColumnOverflowScopeImpl f3920z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FlowColumnOverflowScopeImpl$shownItemCount$2(FlowColumnOverflowScopeImpl flowColumnOverflowScopeImpl) {
        super(0);
        this.f3920z = flowColumnOverflowScopeImpl;
    }

    public final Integer invoke() {
        return Integer.valueOf(this.f3920z.f3916a.h());
    }
}
