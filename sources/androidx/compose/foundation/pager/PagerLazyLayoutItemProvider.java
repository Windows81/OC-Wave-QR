package androidx.compose.foundation.pager;

import androidx.compose.foundation.lazy.layout.LazyLayoutIntervalContent;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider;
import androidx.compose.foundation.lazy.layout.LazyLayoutKeyIndexMap;
import androidx.compose.foundation.lazy.layout.LazyLayoutPinnableItemKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class PagerLazyLayoutItemProvider implements LazyLayoutItemProvider {

    /* renamed from: a  reason: collision with root package name */
    public final PagerState f5298a;

    /* renamed from: b  reason: collision with root package name */
    public final LazyLayoutIntervalContent f5299b;

    /* renamed from: c  reason: collision with root package name */
    public final LazyLayoutKeyIndexMap f5300c;

    /* renamed from: d  reason: collision with root package name */
    public final PagerScopeImpl f5301d = PagerScopeImpl.f5340a;

    public PagerLazyLayoutItemProvider(PagerState pagerState, LazyLayoutIntervalContent lazyLayoutIntervalContent, LazyLayoutKeyIndexMap lazyLayoutKeyIndexMap) {
        this.f5298a = pagerState;
        this.f5299b = lazyLayoutIntervalContent;
        this.f5300c = lazyLayoutKeyIndexMap;
    }

    public int b() {
        return this.f5299b.i();
    }

    public Object c(int i2) {
        Object c2 = this.f5300c.c(i2);
        return c2 == null ? this.f5299b.j(i2) : c2;
    }

    public int e(Object obj) {
        return this.f5300c.e(obj);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PagerLazyLayoutItemProvider)) {
            return false;
        }
        return Intrinsics.d(this.f5299b, ((PagerLazyLayoutItemProvider) obj).f5299b);
    }

    public int hashCode() {
        return this.f5299b.hashCode();
    }

    public void i(int i2, Object obj, Composer composer, int i3) {
        composer.X(-1201380429);
        if (ComposerKt.P()) {
            ComposerKt.Y(-1201380429, i3, -1, "androidx.compose.foundation.pager.PagerLazyLayoutItemProvider.Item (LazyLayoutPager.kt:210)");
        }
        LazyLayoutPinnableItemKt.a(obj, i2, this.f5298a.L(), ComposableLambdaKt.e(1142237095, true, new PagerLazyLayoutItemProvider$Item$1(this, i2), composer, 54), composer, ((i3 >> 3) & 14) | 3072 | ((i3 << 3) & 112));
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
        composer.M();
    }
}
