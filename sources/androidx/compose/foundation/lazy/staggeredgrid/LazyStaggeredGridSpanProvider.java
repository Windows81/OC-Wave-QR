package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.lazy.layout.IntervalList;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

@Metadata
public final class LazyStaggeredGridSpanProvider {

    /* renamed from: a  reason: collision with root package name */
    public final IntervalList f5184a;

    public LazyStaggeredGridSpanProvider(IntervalList intervalList) {
        this.f5184a = intervalList;
    }

    public final boolean a(int i2) {
        if (i2 < 0 || i2 >= this.f5184a.e()) {
            return false;
        }
        IntervalList.Interval interval = this.f5184a.get(i2);
        Function1 b2 = ((LazyStaggeredGridInterval) interval.c()).b();
        return b2 != null && b2.invoke(Integer.valueOf(i2 - interval.b())) == StaggeredGridItemSpan.f5221b.a();
    }
}
