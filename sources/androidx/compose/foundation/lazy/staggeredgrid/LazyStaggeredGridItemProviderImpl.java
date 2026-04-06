package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.lazy.layout.LazyLayoutKeyIndexMap;
import androidx.compose.foundation.lazy.layout.LazyLayoutPinnableItemKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
final class LazyStaggeredGridItemProviderImpl implements LazyStaggeredGridItemProvider {

    /* renamed from: a  reason: collision with root package name */
    public final LazyStaggeredGridState f5058a;

    /* renamed from: b  reason: collision with root package name */
    public final LazyStaggeredGridIntervalContent f5059b;

    /* renamed from: c  reason: collision with root package name */
    public final LazyLayoutKeyIndexMap f5060c;

    public LazyStaggeredGridItemProviderImpl(LazyStaggeredGridState lazyStaggeredGridState, LazyStaggeredGridIntervalContent lazyStaggeredGridIntervalContent, LazyLayoutKeyIndexMap lazyLayoutKeyIndexMap) {
        this.f5058a = lazyStaggeredGridState;
        this.f5059b = lazyStaggeredGridIntervalContent;
        this.f5060c = lazyLayoutKeyIndexMap;
    }

    public LazyLayoutKeyIndexMap a() {
        return this.f5060c;
    }

    public int b() {
        return this.f5059b.i();
    }

    public Object c(int i2) {
        Object c2 = a().c(i2);
        return c2 == null ? this.f5059b.j(i2) : c2;
    }

    public int e(Object obj) {
        return a().e(obj);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LazyStaggeredGridItemProviderImpl)) {
            return false;
        }
        return Intrinsics.d(this.f5059b, ((LazyStaggeredGridItemProviderImpl) obj).f5059b);
    }

    public Object f(int i2) {
        return this.f5059b.g(i2);
    }

    public LazyStaggeredGridSpanProvider g() {
        return this.f5059b.l();
    }

    public int hashCode() {
        return this.f5059b.hashCode();
    }

    public void i(int i2, Object obj, Composer composer, int i3) {
        composer.X(89098518);
        if (ComposerKt.P()) {
            ComposerKt.Y(89098518, i3, -1, "androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemProviderImpl.Item (LazyStaggeredGridItemProvider.kt:77)");
        }
        LazyLayoutPinnableItemKt.a(obj, i2, this.f5058a.C(), ComposableLambdaKt.e(608834466, true, new LazyStaggeredGridItemProviderImpl$Item$1(this, i2), composer, 54), composer, ((i3 >> 3) & 14) | 3072 | ((i3 << 3) & 112));
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
        composer.M();
    }
}
