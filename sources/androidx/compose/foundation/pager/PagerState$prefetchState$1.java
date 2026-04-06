package androidx.compose.foundation.pager;

import androidx.compose.foundation.lazy.layout.NestedPrefetchScope;
import androidx.compose.runtime.snapshots.Snapshot;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class PagerState$prefetchState$1 extends Lambda implements Function1<NestedPrefetchScope, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ PagerState f5381z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PagerState$prefetchState$1(PagerState pagerState) {
        super(1);
        this.f5381z = pagerState;
    }

    public final void b(NestedPrefetchScope nestedPrefetchScope) {
        Snapshot.Companion companion = Snapshot.f15255e;
        PagerState pagerState = this.f5381z;
        Snapshot d2 = companion.d();
        Function1 g2 = d2 != null ? d2.g() : null;
        Snapshot f2 = companion.f(d2);
        try {
            nestedPrefetchScope.a(pagerState.y());
            Unit unit = Unit.f40552a;
        } finally {
            companion.m(d2, f2, g2);
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        b((NestedPrefetchScope) obj);
        return Unit.f40552a;
    }
}
