package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class LazyStaggeredGridDslKt$rememberRowSlots$1$1 extends Lambda implements Function2<Density, Constraints, LazyStaggeredGridSlots> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ StaggeredGridCells f5045A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Arrangement.Vertical f5046B;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ PaddingValues f5047z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LazyStaggeredGridDslKt$rememberRowSlots$1$1(PaddingValues paddingValues, StaggeredGridCells staggeredGridCells, Arrangement.Vertical vertical) {
        super(2);
        this.f5047z = paddingValues;
        this.f5045A = staggeredGridCells;
        this.f5046B = vertical;
    }

    public final LazyStaggeredGridSlots b(Density density, long j2) {
        if (!(Constraints.k(j2) != Integer.MAX_VALUE)) {
            InlineClassHelperKt.a("LazyHorizontalStaggeredGrid's height should be bound by parent.");
        }
        int k2 = Constraints.k(j2) - density.P1(Dp.m(this.f5047z.d() + this.f5047z.a()));
        StaggeredGridCells staggeredGridCells = this.f5045A;
        Arrangement.Vertical vertical = this.f5046B;
        int[] a2 = staggeredGridCells.a(density, k2, density.P1(vertical.a()));
        int[] iArr = new int[a2.length];
        vertical.b(density, k2, a2, iArr);
        return new LazyStaggeredGridSlots(iArr, a2);
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        return b((Density) obj, ((Constraints) obj2).r());
    }
}
