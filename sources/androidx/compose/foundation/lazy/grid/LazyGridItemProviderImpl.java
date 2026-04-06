package androidx.compose.foundation.lazy.grid;

import androidx.collection.IntList;
import androidx.compose.foundation.lazy.layout.LazyLayoutKeyIndexMap;
import androidx.compose.foundation.lazy.layout.LazyLayoutPinnableItemKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
final class LazyGridItemProviderImpl implements LazyGridItemProvider {

    /* renamed from: a  reason: collision with root package name */
    public final LazyGridState f4595a;

    /* renamed from: b  reason: collision with root package name */
    public final LazyGridIntervalContent f4596b;

    /* renamed from: c  reason: collision with root package name */
    public final LazyLayoutKeyIndexMap f4597c;

    public LazyGridItemProviderImpl(LazyGridState lazyGridState, LazyGridIntervalContent lazyGridIntervalContent, LazyLayoutKeyIndexMap lazyLayoutKeyIndexMap) {
        this.f4595a = lazyGridState;
        this.f4596b = lazyGridIntervalContent;
        this.f4597c = lazyLayoutKeyIndexMap;
    }

    public LazyLayoutKeyIndexMap a() {
        return this.f4597c;
    }

    public int b() {
        return this.f4596b.i();
    }

    public Object c(int i2) {
        Object c2 = a().c(i2);
        return c2 == null ? this.f4596b.j(i2) : c2;
    }

    public IntList d() {
        return this.f4596b.l();
    }

    public int e(Object obj) {
        return a().e(obj);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LazyGridItemProviderImpl)) {
            return false;
        }
        return Intrinsics.d(this.f4596b, ((LazyGridItemProviderImpl) obj).f4596b);
    }

    public Object f(int i2) {
        return this.f4596b.g(i2);
    }

    public int hashCode() {
        return this.f4596b.hashCode();
    }

    public void i(int i2, Object obj, Composer composer, int i3) {
        composer.X(1493551140);
        if (ComposerKt.P()) {
            ComposerKt.Y(1493551140, i3, -1, "androidx.compose.foundation.lazy.grid.LazyGridItemProviderImpl.Item (LazyGridItemProvider.kt:81)");
        }
        LazyLayoutPinnableItemKt.a(obj, i2, this.f4595a.A(), ComposableLambdaKt.e(726189336, true, new LazyGridItemProviderImpl$Item$1(this, i2), composer, 54), composer, ((i3 >> 3) & 14) | 3072 | ((i3 << 3) & 112));
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
        composer.M();
    }

    public LazyGridSpanLayoutProvider j() {
        return this.f4596b.n();
    }
}
