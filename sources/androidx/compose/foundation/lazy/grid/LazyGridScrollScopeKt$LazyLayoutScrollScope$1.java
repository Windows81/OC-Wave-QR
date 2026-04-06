package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.ScrollScope;
import androidx.compose.foundation.lazy.layout.LazyLayoutScrollScope;
import androidx.compose.ui.unit.IntOffset;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;

@Metadata
public final class LazyGridScrollScopeKt$LazyLayoutScrollScope$1 implements LazyLayoutScrollScope, ScrollScope {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ScrollScope f4700a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ LazyGridState f4701b;

    public LazyGridScrollScopeKt$LazyLayoutScrollScope$1(ScrollScope scrollScope, LazyGridState lazyGridState) {
        this.f4701b = lazyGridState;
        this.f4700a = scrollScope;
    }

    public int b() {
        return this.f4701b.w().h();
    }

    public int c() {
        LazyGridItemInfo lazyGridItemInfo = (LazyGridItemInfo) CollectionsKt.q0(this.f4701b.w().k());
        if (lazyGridItemInfo != null) {
            return lazyGridItemInfo.getIndex();
        }
        return 0;
    }

    public int d(int i2, int i3) {
        Integer num;
        Object obj;
        LazyGridLayoutInfo w2 = this.f4701b.w();
        int i4 = 0;
        if (w2.k().isEmpty()) {
            return 0;
        }
        int h2 = h();
        if (i2 > c() || h2 > i2) {
            int G = this.f4701b.G();
            int a2 = LazyGridLayoutInfoKt.a(w2);
            int i5 = 1;
            if (i2 < h()) {
                i4 = 1;
            }
            int h3 = i2 - h();
            int i6 = G - 1;
            if (i4 != 0) {
                i5 = -1;
            }
            i4 = (a2 * ((h3 + (i6 * i5)) / G)) - f();
        } else {
            List k2 = w2.k();
            int size = k2.size();
            int i7 = 0;
            while (true) {
                num = null;
                if (i7 >= size) {
                    obj = null;
                    break;
                }
                obj = k2.get(i7);
                if (((LazyGridItemInfo) obj).getIndex() == i2) {
                    break;
                }
                i7++;
            }
            LazyGridItemInfo lazyGridItemInfo = (LazyGridItemInfo) obj;
            if (w2.e() == Orientation.Vertical) {
                if (lazyGridItemInfo != null) {
                    num = Integer.valueOf(IntOffset.l(lazyGridItemInfo.e()));
                }
            } else if (lazyGridItemInfo != null) {
                num = Integer.valueOf(IntOffset.k(lazyGridItemInfo.e()));
            }
            if (num != null) {
                i4 = num.intValue();
            }
        }
        return i4 + i3;
    }

    public void e(int i2, int i3) {
        this.f4701b.N(i2, i3, true);
    }

    public int f() {
        return this.f4701b.s();
    }

    public float g(float f2) {
        return this.f4700a.g(f2);
    }

    public int h() {
        return this.f4701b.r();
    }
}
