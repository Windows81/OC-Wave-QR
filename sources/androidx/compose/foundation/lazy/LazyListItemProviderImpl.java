package androidx.compose.foundation.lazy;

import androidx.collection.IntList;
import androidx.compose.foundation.lazy.layout.LazyLayoutKeyIndexMap;
import androidx.compose.foundation.lazy.layout.LazyLayoutPinnableItemKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
final class LazyListItemProviderImpl implements LazyListItemProvider {

    /* renamed from: a  reason: collision with root package name */
    public final LazyListState f4367a;

    /* renamed from: b  reason: collision with root package name */
    public final LazyListIntervalContent f4368b;

    /* renamed from: c  reason: collision with root package name */
    public final LazyItemScopeImpl f4369c;

    /* renamed from: d  reason: collision with root package name */
    public final LazyLayoutKeyIndexMap f4370d;

    public LazyListItemProviderImpl(LazyListState lazyListState, LazyListIntervalContent lazyListIntervalContent, LazyItemScopeImpl lazyItemScopeImpl, LazyLayoutKeyIndexMap lazyLayoutKeyIndexMap) {
        this.f4367a = lazyListState;
        this.f4368b = lazyListIntervalContent;
        this.f4369c = lazyItemScopeImpl;
        this.f4370d = lazyLayoutKeyIndexMap;
    }

    public LazyLayoutKeyIndexMap a() {
        return this.f4370d;
    }

    public int b() {
        return this.f4368b.i();
    }

    public Object c(int i2) {
        Object c2 = a().c(i2);
        return c2 == null ? this.f4368b.j(i2) : c2;
    }

    public IntList d() {
        return this.f4368b.k();
    }

    public int e(Object obj) {
        return a().e(obj);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LazyListItemProviderImpl)) {
            return false;
        }
        return Intrinsics.d(this.f4368b, ((LazyListItemProviderImpl) obj).f4368b);
    }

    public Object f(int i2) {
        return this.f4368b.g(i2);
    }

    public LazyItemScopeImpl h() {
        return this.f4369c;
    }

    public int hashCode() {
        return this.f4368b.hashCode();
    }

    public void i(int i2, Object obj, Composer composer, int i3) {
        composer.X(-462424778);
        if (ComposerKt.P()) {
            ComposerKt.Y(-462424778, i3, -1, "androidx.compose.foundation.lazy.LazyListItemProviderImpl.Item (LazyListItemProvider.kt:80)");
        }
        LazyLayoutPinnableItemKt.a(obj, i2, this.f4367a.A(), ComposableLambdaKt.e(-824725566, true, new LazyListItemProviderImpl$Item$1(this, i2), composer, 54), composer, ((i3 >> 3) & 14) | 3072 | ((i3 << 3) & 112));
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
        composer.M();
    }
}
