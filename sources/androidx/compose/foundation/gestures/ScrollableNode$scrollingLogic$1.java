package androidx.compose.foundation.gestures;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class ScrollableNode$scrollingLogic$1 extends Lambda implements Function0<Boolean> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ ScrollableNode f3576z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ScrollableNode$scrollingLogic$1(ScrollableNode scrollableNode) {
        super(0);
        this.f3576z = scrollableNode;
    }

    /* renamed from: b */
    public final Boolean invoke() {
        return Boolean.valueOf(this.f3576z.F2());
    }
}
