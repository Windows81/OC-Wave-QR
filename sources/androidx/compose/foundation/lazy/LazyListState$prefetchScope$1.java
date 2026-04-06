package androidx.compose.foundation.lazy;

import androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState;
import androidx.compose.runtime.snapshots.Snapshot;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

@Metadata
public final class LazyListState$prefetchScope$1 implements LazyListPrefetchScope {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ LazyListState f4492a;

    public LazyListState$prefetchScope$1(LazyListState lazyListState) {
        this.f4492a = lazyListState;
    }

    /* JADX INFO: finally extract failed */
    public LazyLayoutPrefetchState.PrefetchHandle a(int i2) {
        Snapshot.Companion companion = Snapshot.f15255e;
        LazyListState lazyListState = this.f4492a;
        Snapshot d2 = companion.d();
        Function1 g2 = d2 != null ? d2.g() : null;
        Snapshot f2 = companion.f(d2);
        try {
            long o2 = ((LazyListMeasureResult) lazyListState.f4469e.getValue()).o();
            companion.m(d2, f2, g2);
            return this.f4492a.C().e(i2, o2);
        } catch (Throwable th) {
            companion.m(d2, f2, g2);
            throw th;
        }
    }
}
