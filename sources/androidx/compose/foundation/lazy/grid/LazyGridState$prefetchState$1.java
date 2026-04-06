package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.lazy.layout.NestedPrefetchScope;
import androidx.compose.runtime.snapshots.Snapshot;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class LazyGridState$prefetchState$1 extends Lambda implements Function1<NestedPrefetchScope, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ int f4751A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ LazyGridState f4752z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LazyGridState$prefetchState$1(LazyGridState lazyGridState, int i2) {
        super(1);
        this.f4752z = lazyGridState;
        this.f4751A = i2;
    }

    public final void b(NestedPrefetchScope nestedPrefetchScope) {
        LazyGridPrefetchStrategy i2 = this.f4752z.f4723a;
        int i3 = this.f4751A;
        Snapshot.Companion companion = Snapshot.f15255e;
        Snapshot d2 = companion.d();
        companion.m(d2, companion.f(d2), d2 != null ? d2.g() : null);
        i2.a(nestedPrefetchScope, i3);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        b((NestedPrefetchScope) obj);
        return Unit.f40552a;
    }
}
