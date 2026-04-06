package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class LazyStaggeredGridDslKt$rememberColumnSlots$1$1 extends Lambda implements Function2<Density, Constraints, LazyStaggeredGridSlots> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ StaggeredGridCells f5042A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Arrangement.Horizontal f5043B;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ PaddingValues f5044z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LazyStaggeredGridDslKt$rememberColumnSlots$1$1(PaddingValues paddingValues, StaggeredGridCells staggeredGridCells, Arrangement.Horizontal horizontal) {
        super(2);
        this.f5044z = paddingValues;
        this.f5042A = staggeredGridCells;
        this.f5043B = horizontal;
    }

    public final LazyStaggeredGridSlots b(Density density, long j2) {
        if (!(Constraints.l(j2) != Integer.MAX_VALUE)) {
            InlineClassHelperKt.a("LazyVerticalStaggeredGrid's width should be bound by parent.");
        }
        PaddingValues paddingValues = this.f5044z;
        LayoutDirection layoutDirection = LayoutDirection.Ltr;
        int l2 = Constraints.l(j2) - density.P1(Dp.m(PaddingKt.g(paddingValues, layoutDirection) + PaddingKt.f(this.f5044z, layoutDirection)));
        StaggeredGridCells staggeredGridCells = this.f5042A;
        Arrangement.Horizontal horizontal = this.f5043B;
        int[] a2 = staggeredGridCells.a(density, l2, density.P1(horizontal.a()));
        int[] iArr = new int[a2.length];
        horizontal.c(density, l2, a2, layoutDirection, iArr);
        return new LazyStaggeredGridSlots(iArr, a2);
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        return b((Density) obj, ((Constraints) obj2).r());
    }
}
