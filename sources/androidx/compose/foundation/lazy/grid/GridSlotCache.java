package androidx.compose.foundation.lazy.grid;

import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Density;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

@Metadata
final class GridSlotCache implements LazyGridSlotsProvider {

    /* renamed from: a  reason: collision with root package name */
    public final Function2 f4518a;

    /* renamed from: b  reason: collision with root package name */
    public long f4519b = ConstraintsKt.b(0, 0, 0, 0, 15, (Object) null);

    /* renamed from: c  reason: collision with root package name */
    public float f4520c;

    /* renamed from: d  reason: collision with root package name */
    public LazyGridSlots f4521d;

    public GridSlotCache(Function2 function2) {
        this.f4518a = function2;
    }

    public LazyGridSlots a(Density density, long j2) {
        if (this.f4521d == null || !Constraints.f(this.f4519b, j2) || this.f4520c != density.getDensity()) {
            this.f4519b = j2;
            this.f4520c = density.getDensity();
            LazyGridSlots lazyGridSlots = (LazyGridSlots) this.f4518a.m(density, Constraints.a(j2));
            this.f4521d = lazyGridSlots;
            return lazyGridSlots;
        }
        LazyGridSlots lazyGridSlots2 = this.f4521d;
        Intrinsics.f(lazyGridSlots2);
        return lazyGridSlots2;
    }
}
