package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.ScrollScope;
import androidx.compose.foundation.lazy.layout.LazyLayoutScrollScope;
import androidx.compose.ui.unit.IntOffset;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;

@Metadata
public final class LazyStaggeredGridScrollScopeKt$LazyLayoutScrollScope$1 implements LazyLayoutScrollScope, ScrollScope {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ScrollScope f5175a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ LazyStaggeredGridState f5176b;

    public LazyStaggeredGridScrollScopeKt$LazyLayoutScrollScope$1(ScrollScope scrollScope, LazyStaggeredGridState lazyStaggeredGridState) {
        this.f5176b = lazyStaggeredGridState;
        this.f5175a = scrollScope;
    }

    public int b() {
        return this.f5176b.y().h();
    }

    public int c() {
        LazyStaggeredGridItemInfo lazyStaggeredGridItemInfo = (LazyStaggeredGridItemInfo) CollectionsKt.q0(this.f5176b.y().k());
        if (lazyStaggeredGridItemInfo != null) {
            return lazyStaggeredGridItemInfo.getIndex();
        }
        return 0;
    }

    public int d(int i2, int i3) {
        Object obj;
        int i4;
        LazyStaggeredGridLayoutInfo y2 = this.f5176b.y();
        int i5 = 0;
        if (y2.k().isEmpty()) {
            return 0;
        }
        List k2 = y2.k();
        int size = k2.size();
        while (true) {
            if (i5 >= size) {
                obj = null;
                break;
            }
            obj = k2.get(i5);
            if (((LazyStaggeredGridItemInfo) obj).getIndex() == i2) {
                break;
            }
            i5++;
        }
        LazyStaggeredGridItemInfo lazyStaggeredGridItemInfo = (LazyStaggeredGridItemInfo) obj;
        if (lazyStaggeredGridItemInfo == null) {
            int d2 = LazyStaggeredGridMeasureResultKt.d(y2);
            int w2 = this.f5176b.w();
            i4 = (d2 * ((i2 / w2) - (h() / w2))) - f();
        } else {
            i4 = y2.e() == Orientation.Vertical ? IntOffset.l(lazyStaggeredGridItemInfo.e()) : IntOffset.k(lazyStaggeredGridItemInfo.e());
        }
        return i4 + i3;
    }

    public void e(int i2, int i3) {
        this.f5176b.Q(i2, i3, true);
    }

    public int f() {
        return this.f5176b.t();
    }

    public float g(float f2) {
        return this.f5175a.g(f2);
    }

    public int h() {
        return this.f5176b.s();
    }
}
