package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridLaneInfo;
import kotlin.Metadata;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class LazyStaggeredGridLaneInfo$getGaps$$inlined$binarySearchBy$default$1 extends Lambda implements Function1<LazyStaggeredGridLaneInfo.SpannedItem, Integer> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Comparable f5075z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LazyStaggeredGridLaneInfo$getGaps$$inlined$binarySearchBy$default$1(Comparable comparable) {
        super(1);
        this.f5075z = comparable;
    }

    /* renamed from: b */
    public final Integer invoke(Object obj) {
        return Integer.valueOf(ComparisonsKt.d(Integer.valueOf(((LazyStaggeredGridLaneInfo.SpannedItem) obj).b()), this.f5075z));
    }
}
