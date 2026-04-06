package androidx.compose.foundation.gestures;

import androidx.compose.foundation.ComposeFoundationFlags;
import androidx.compose.ui.input.nestedscroll.NestedScrollSource;
import kotlin.Metadata;

@Metadata
public final class ScrollingLogic$doFlingAnimation$2$reverseScope$1 implements ScrollScope {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ScrollingLogic f3592a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ NestedScrollScope f3593b;

    public ScrollingLogic$doFlingAnimation$2$reverseScope$1(ScrollingLogic scrollingLogic, NestedScrollScope nestedScrollScope) {
        this.f3592a = scrollingLogic;
        this.f3593b = nestedScrollScope;
    }

    public float g(float f2) {
        if (!ComposeFoundationFlags.f3044b || Math.abs(f2) == 0.0f || !this.f3592a.A(f2)) {
            ScrollingLogic scrollingLogic = this.f3592a;
            return scrollingLogic.x(scrollingLogic.F(this.f3593b.a(scrollingLogic.y(scrollingLogic.G(f2)), NestedScrollSource.f16795b.a())));
        }
        throw new FlingCancellationException();
    }
}
