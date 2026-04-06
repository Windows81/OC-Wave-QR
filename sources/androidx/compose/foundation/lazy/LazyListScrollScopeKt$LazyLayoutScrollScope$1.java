package androidx.compose.foundation.lazy;

import androidx.compose.foundation.gestures.ScrollScope;
import androidx.compose.foundation.lazy.layout.LazyLayoutScrollScope;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;

@Metadata
public final class LazyListScrollScopeKt$LazyLayoutScrollScope$1 implements LazyLayoutScrollScope, ScrollScope {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ScrollScope f4461a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ LazyListState f4462b;

    public LazyListScrollScopeKt$LazyLayoutScrollScope$1(ScrollScope scrollScope, LazyListState lazyListState) {
        this.f4462b = lazyListState;
        this.f4461a = scrollScope;
    }

    public int b() {
        return this.f4462b.x().h();
    }

    public int c() {
        LazyListItemInfo lazyListItemInfo = (LazyListItemInfo) CollectionsKt.q0(this.f4462b.x().k());
        if (lazyListItemInfo != null) {
            return lazyListItemInfo.getIndex();
        }
        return 0;
    }

    public int d(int i2, int i3) {
        Object obj;
        LazyListLayoutInfo x2 = this.f4462b.x();
        int i4 = 0;
        if (x2.k().isEmpty()) {
            return 0;
        }
        int h2 = h();
        if (i2 > c() || h2 > i2) {
            i4 = (LazyListLayoutInfoKt.a(x2) * (i2 - h())) - f();
        } else {
            List k2 = x2.k();
            int size = k2.size();
            int i5 = 0;
            while (true) {
                if (i5 >= size) {
                    obj = null;
                    break;
                }
                obj = k2.get(i5);
                if (((LazyListItemInfo) obj).getIndex() == i2) {
                    break;
                }
                i5++;
            }
            LazyListItemInfo lazyListItemInfo = (LazyListItemInfo) obj;
            if (lazyListItemInfo != null) {
                i4 = lazyListItemInfo.f();
            }
        }
        return i4 + i3;
    }

    public void e(int i2, int i3) {
        this.f4462b.M(i2, i3, true);
    }

    public int f() {
        return this.f4462b.t();
    }

    public float g(float f2) {
        return this.f4461a.g(f2);
    }

    public int h() {
        return this.f4462b.s();
    }
}
