package androidx.compose.foundation.gestures;

import androidx.compose.foundation.OverscrollEffect;
import kotlin.Metadata;

@Metadata
public final class ScrollingLogic$nestedScrollScope$1 implements NestedScrollScope {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ScrollingLogic f3594a;

    public ScrollingLogic$nestedScrollScope$1(ScrollingLogic scrollingLogic) {
        this.f3594a = scrollingLogic;
    }

    public long a(long j2, int i2) {
        this.f3594a.f3588i = i2;
        OverscrollEffect f2 = this.f3594a.f3581b;
        if (f2 != null && this.f3594a.r()) {
            return f2.N(j2, this.f3594a.f3588i, this.f3594a.f3591l);
        }
        return this.f3594a.w(this.f3594a.f3589j, j2, i2);
    }

    public long b(long j2, int i2) {
        return this.f3594a.w(this.f3594a.f3589j, j2, i2);
    }
}
