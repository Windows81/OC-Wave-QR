package androidx.compose.foundation.lazy;

import androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState;
import androidx.compose.foundation.lazy.layout.NestedPrefetchScope;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;

@Metadata
final class DefaultLazyListPrefetchStrategy implements LazyListPrefetchStrategy {

    /* renamed from: a  reason: collision with root package name */
    public final int f4299a;

    /* renamed from: b  reason: collision with root package name */
    public int f4300b = -1;

    /* renamed from: c  reason: collision with root package name */
    public LazyLayoutPrefetchState.PrefetchHandle f4301c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f4302d;

    public DefaultLazyListPrefetchStrategy(int i2) {
        this.f4299a = i2;
    }

    public void a(NestedPrefetchScope nestedPrefetchScope, int i2) {
        int i3 = this.f4299a;
        for (int i4 = 0; i4 < i3; i4++) {
            nestedPrefetchScope.a(i2 + i4);
        }
    }

    public void c(LazyListPrefetchScope lazyListPrefetchScope, float f2, LazyListLayoutInfo lazyListLayoutInfo) {
        LazyLayoutPrefetchState.PrefetchHandle prefetchHandle;
        LazyLayoutPrefetchState.PrefetchHandle prefetchHandle2;
        LazyLayoutPrefetchState.PrefetchHandle prefetchHandle3;
        if (!lazyListLayoutInfo.k().isEmpty()) {
            boolean z2 = f2 < 0.0f;
            int index = z2 ? ((LazyListItemInfo) CollectionsKt.p0(lazyListLayoutInfo.k())).getIndex() + 1 : ((LazyListItemInfo) CollectionsKt.e0(lazyListLayoutInfo.k())).getIndex() - 1;
            if (index >= 0 && index < lazyListLayoutInfo.h()) {
                if (index != this.f4300b) {
                    if (!(this.f4302d == z2 || (prefetchHandle3 = this.f4301c) == null)) {
                        prefetchHandle3.cancel();
                    }
                    this.f4302d = z2;
                    this.f4300b = index;
                    this.f4301c = lazyListPrefetchScope.a(index);
                }
                if (z2) {
                    LazyListItemInfo lazyListItemInfo = (LazyListItemInfo) CollectionsKt.p0(lazyListLayoutInfo.k());
                    if (((float) (((lazyListItemInfo.f() + lazyListItemInfo.e()) + lazyListLayoutInfo.i()) - lazyListLayoutInfo.g())) < (-f2) && (prefetchHandle2 = this.f4301c) != null) {
                        prefetchHandle2.a();
                    }
                } else if (((float) (lazyListLayoutInfo.j() - ((LazyListItemInfo) CollectionsKt.e0(lazyListLayoutInfo.k())).f())) < f2 && (prefetchHandle = this.f4301c) != null) {
                    prefetchHandle.a();
                }
            }
        }
    }

    public void d(LazyListPrefetchScope lazyListPrefetchScope, LazyListLayoutInfo lazyListLayoutInfo) {
        if (this.f4300b != -1 && !lazyListLayoutInfo.k().isEmpty()) {
            if (this.f4300b != (this.f4302d ? ((LazyListItemInfo) CollectionsKt.p0(lazyListLayoutInfo.k())).getIndex() + 1 : ((LazyListItemInfo) CollectionsKt.e0(lazyListLayoutInfo.k())).getIndex() - 1)) {
                this.f4300b = -1;
                LazyLayoutPrefetchState.PrefetchHandle prefetchHandle = this.f4301c;
                if (prefetchHandle != null) {
                    prefetchHandle.cancel();
                }
                this.f4301c = null;
            }
        }
    }
}
