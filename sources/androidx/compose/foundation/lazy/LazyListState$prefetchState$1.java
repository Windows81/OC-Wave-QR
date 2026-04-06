package androidx.compose.foundation.lazy;

import androidx.compose.foundation.lazy.layout.NestedPrefetchScope;
import androidx.compose.runtime.snapshots.Snapshot;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class LazyListState$prefetchState$1 extends Lambda implements Function1<NestedPrefetchScope, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ int f4493A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ LazyListState f4494z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LazyListState$prefetchState$1(LazyListState lazyListState, int i2) {
        super(1);
        this.f4494z = lazyListState;
        this.f4493A = i2;
    }

    public final void b(NestedPrefetchScope nestedPrefetchScope) {
        LazyListPrefetchStrategy h2 = this.f4494z.f4465a;
        int i2 = this.f4493A;
        Snapshot.Companion companion = Snapshot.f15255e;
        Snapshot d2 = companion.d();
        companion.m(d2, companion.f(d2), d2 != null ? d2.g() : null);
        h2.a(nestedPrefetchScope, i2);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        b((NestedPrefetchScope) obj);
        return Unit.f40552a;
    }
}
