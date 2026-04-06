package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Density;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

@Metadata
final class LazyStaggeredGridSlotCache implements LazyGridStaggeredGridSlotsProvider {

    /* renamed from: a  reason: collision with root package name */
    public final Function2 f5178a;

    /* renamed from: b  reason: collision with root package name */
    public long f5179b = ConstraintsKt.b(0, 0, 0, 0, 15, (Object) null);

    /* renamed from: c  reason: collision with root package name */
    public float f5180c;

    /* renamed from: d  reason: collision with root package name */
    public LazyStaggeredGridSlots f5181d;

    public LazyStaggeredGridSlotCache(Function2 function2) {
        this.f5178a = function2;
    }

    public LazyStaggeredGridSlots a(Density density, long j2) {
        if (this.f5181d == null || !Constraints.f(this.f5179b, j2) || this.f5180c != density.getDensity()) {
            this.f5179b = j2;
            this.f5180c = density.getDensity();
            LazyStaggeredGridSlots lazyStaggeredGridSlots = (LazyStaggeredGridSlots) this.f5178a.m(density, Constraints.a(j2));
            this.f5181d = lazyStaggeredGridSlots;
            return lazyStaggeredGridSlots;
        }
        LazyStaggeredGridSlots lazyStaggeredGridSlots2 = this.f5181d;
        Intrinsics.f(lazyStaggeredGridSlots2);
        return lazyStaggeredGridSlots2;
    }
}
