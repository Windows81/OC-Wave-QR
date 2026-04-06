package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.snapping.LazyGridSnapLayoutInfoProviderKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState;
import androidx.compose.foundation.lazy.layout.NestedPrefetchScope;
import androidx.compose.runtime.collection.MutableVector;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;

@Metadata
final class DefaultLazyGridPrefetchStrategy implements LazyGridPrefetchStrategy {

    /* renamed from: a  reason: collision with root package name */
    public final int f4510a;

    /* renamed from: b  reason: collision with root package name */
    public int f4511b = -1;

    /* renamed from: c  reason: collision with root package name */
    public final MutableVector f4512c = new MutableVector(new LazyLayoutPrefetchState.PrefetchHandle[16], 0);

    /* renamed from: d  reason: collision with root package name */
    public boolean f4513d;

    public DefaultLazyGridPrefetchStrategy(int i2) {
        this.f4510a = i2;
    }

    public void a(NestedPrefetchScope nestedPrefetchScope, int i2) {
        int i3 = this.f4510a;
        for (int i4 = 0; i4 < i3; i4++) {
            nestedPrefetchScope.a(i2 + i4);
        }
    }

    public void c(LazyGridPrefetchScope lazyGridPrefetchScope, LazyGridLayoutInfo lazyGridLayoutInfo) {
        int i2;
        if (this.f4511b != -1 && !lazyGridLayoutInfo.k().isEmpty()) {
            if (this.f4513d) {
                LazyGridItemInfo lazyGridItemInfo = (LazyGridItemInfo) CollectionsKt.p0(lazyGridLayoutInfo.k());
                i2 = (lazyGridLayoutInfo.e() == Orientation.Vertical ? lazyGridItemInfo.f() : lazyGridItemInfo.n()) + 1;
            } else {
                LazyGridItemInfo lazyGridItemInfo2 = (LazyGridItemInfo) CollectionsKt.e0(lazyGridLayoutInfo.k());
                i2 = (lazyGridLayoutInfo.e() == Orientation.Vertical ? lazyGridItemInfo2.f() : lazyGridItemInfo2.n()) - 1;
            }
            if (this.f4511b != i2) {
                this.f4511b = -1;
                MutableVector mutableVector = this.f4512c;
                Object[] objArr = mutableVector.f15005z;
                int p2 = mutableVector.p();
                for (int i3 = 0; i3 < p2; i3++) {
                    ((LazyLayoutPrefetchState.PrefetchHandle) objArr[i3]).cancel();
                }
                this.f4512c.l();
            }
        }
    }

    public void d(LazyGridPrefetchScope lazyGridPrefetchScope, float f2, LazyGridLayoutInfo lazyGridLayoutInfo) {
        int i2;
        int i3;
        if (!lazyGridLayoutInfo.k().isEmpty()) {
            int i4 = 0;
            boolean z2 = f2 < 0.0f;
            if (z2) {
                LazyGridItemInfo lazyGridItemInfo = (LazyGridItemInfo) CollectionsKt.p0(lazyGridLayoutInfo.k());
                i3 = (lazyGridLayoutInfo.e() == Orientation.Vertical ? lazyGridItemInfo.f() : lazyGridItemInfo.n()) + 1;
                i2 = ((LazyGridItemInfo) CollectionsKt.p0(lazyGridLayoutInfo.k())).getIndex() + 1;
            } else {
                LazyGridItemInfo lazyGridItemInfo2 = (LazyGridItemInfo) CollectionsKt.e0(lazyGridLayoutInfo.k());
                i3 = (lazyGridLayoutInfo.e() == Orientation.Vertical ? lazyGridItemInfo2.f() : lazyGridItemInfo2.n()) - 1;
                i2 = ((LazyGridItemInfo) CollectionsKt.e0(lazyGridLayoutInfo.k())).getIndex() - 1;
            }
            if (i2 >= 0 && i2 < lazyGridLayoutInfo.h()) {
                if (i3 != this.f4511b && i3 >= 0) {
                    if (this.f4513d != z2) {
                        MutableVector mutableVector = this.f4512c;
                        Object[] objArr = mutableVector.f15005z;
                        int p2 = mutableVector.p();
                        for (int i5 = 0; i5 < p2; i5++) {
                            ((LazyLayoutPrefetchState.PrefetchHandle) objArr[i5]).cancel();
                        }
                    }
                    this.f4513d = z2;
                    this.f4511b = i3;
                    this.f4512c.l();
                    MutableVector mutableVector2 = this.f4512c;
                    mutableVector2.h(mutableVector2.p(), lazyGridPrefetchScope.a(i3));
                }
                if (z2) {
                    LazyGridItemInfo lazyGridItemInfo3 = (LazyGridItemInfo) CollectionsKt.p0(lazyGridLayoutInfo.k());
                    if (((float) (((LazyGridSnapLayoutInfoProviderKt.b(lazyGridItemInfo3, lazyGridLayoutInfo.e()) + LazyGridSnapLayoutInfoProviderKt.c(lazyGridItemInfo3, lazyGridLayoutInfo.e())) + lazyGridLayoutInfo.i()) - lazyGridLayoutInfo.g())) < (-f2)) {
                        MutableVector mutableVector3 = this.f4512c;
                        Object[] objArr2 = mutableVector3.f15005z;
                        int p3 = mutableVector3.p();
                        while (i4 < p3) {
                            ((LazyLayoutPrefetchState.PrefetchHandle) objArr2[i4]).a();
                            i4++;
                        }
                    }
                } else if (((float) (lazyGridLayoutInfo.j() - LazyGridSnapLayoutInfoProviderKt.b((LazyGridItemInfo) CollectionsKt.e0(lazyGridLayoutInfo.k()), lazyGridLayoutInfo.e()))) < f2) {
                    MutableVector mutableVector4 = this.f4512c;
                    Object[] objArr3 = mutableVector4.f15005z;
                    int p4 = mutableVector4.p();
                    while (i4 < p4) {
                        ((LazyLayoutPrefetchState.PrefetchHandle) objArr3[i4]).a();
                        i4++;
                    }
                }
            }
        }
    }
}
