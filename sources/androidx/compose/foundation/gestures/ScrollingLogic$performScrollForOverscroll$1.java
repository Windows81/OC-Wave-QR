package androidx.compose.foundation.gestures;

import androidx.compose.ui.geometry.Offset;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class ScrollingLogic$performScrollForOverscroll$1 extends Lambda implements Function1<Offset, Offset> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ ScrollingLogic f3595z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ScrollingLogic$performScrollForOverscroll$1(ScrollingLogic scrollingLogic) {
        super(1);
        this.f3595z = scrollingLogic;
    }

    public final long b(long j2) {
        ScrollScope e2 = this.f3595z.f3589j;
        ScrollingLogic scrollingLogic = this.f3595z;
        return scrollingLogic.w(e2, j2, scrollingLogic.f3588i);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return Offset.d(b(((Offset) obj).t()));
    }
}
