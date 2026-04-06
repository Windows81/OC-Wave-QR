package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.lazy.layout.LazyLayoutIntervalContent;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function4;

@Metadata
public final class LazyStaggeredGridInterval implements LazyLayoutIntervalContent.Interval {

    /* renamed from: a  reason: collision with root package name */
    public final Function1 f5048a;

    /* renamed from: b  reason: collision with root package name */
    public final Function1 f5049b;

    /* renamed from: c  reason: collision with root package name */
    public final Function1 f5050c;

    /* renamed from: d  reason: collision with root package name */
    public final Function4 f5051d;

    public final Function4 a() {
        return this.f5051d;
    }

    public final Function1 b() {
        return this.f5050c;
    }

    public Function1 getKey() {
        return this.f5048a;
    }

    public Function1 getType() {
        return this.f5049b;
    }
}
