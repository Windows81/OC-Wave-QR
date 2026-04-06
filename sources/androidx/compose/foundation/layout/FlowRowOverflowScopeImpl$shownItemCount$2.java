package androidx.compose.foundation.layout;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class FlowRowOverflowScopeImpl$shownItemCount$2 extends Lambda implements Function0<Integer> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ FlowRowOverflowScopeImpl f4040z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FlowRowOverflowScopeImpl$shownItemCount$2(FlowRowOverflowScopeImpl flowRowOverflowScopeImpl) {
        super(0);
        this.f4040z = flowRowOverflowScopeImpl;
    }

    public final Integer invoke() {
        return Integer.valueOf(this.f4040z.f4036a.h());
    }
}
