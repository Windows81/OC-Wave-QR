package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.lazy.layout.LazyLayoutIntervalContent;
import androidx.compose.foundation.lazy.layout.MutableIntervalList;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

@Metadata
public final class LazyStaggeredGridIntervalContent extends LazyLayoutIntervalContent<LazyStaggeredGridInterval> implements LazyStaggeredGridScope {

    /* renamed from: a  reason: collision with root package name */
    public final MutableIntervalList f5052a = new MutableIntervalList();

    /* renamed from: b  reason: collision with root package name */
    public final LazyStaggeredGridSpanProvider f5053b = new LazyStaggeredGridSpanProvider(h());

    public LazyStaggeredGridIntervalContent(Function1 function1) {
        function1.invoke(this);
    }

    /* renamed from: k */
    public MutableIntervalList h() {
        return this.f5052a;
    }

    public final LazyStaggeredGridSpanProvider l() {
        return this.f5053b;
    }
}
