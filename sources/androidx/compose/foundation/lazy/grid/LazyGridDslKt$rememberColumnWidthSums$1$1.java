package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class LazyGridDslKt$rememberColumnWidthSums$1$1 extends Lambda implements Function2<Density, Constraints, LazyGridSlots> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Arrangement.Horizontal f4571A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ GridCells f4572z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LazyGridDslKt$rememberColumnWidthSums$1$1(GridCells gridCells, Arrangement.Horizontal horizontal) {
        super(2);
        this.f4572z = gridCells;
        this.f4571A = horizontal;
    }

    public final LazyGridSlots b(Density density, long j2) {
        if (!(Constraints.l(j2) != Integer.MAX_VALUE)) {
            InlineClassHelperKt.a("LazyVerticalGrid's width should be bound by parent.");
        }
        int l2 = Constraints.l(j2);
        GridCells gridCells = this.f4572z;
        Arrangement.Horizontal horizontal = this.f4571A;
        int[] L0 = CollectionsKt.L0(gridCells.a(density, l2, density.P1(horizontal.a())));
        int[] iArr = new int[L0.length];
        horizontal.c(density, l2, L0, LayoutDirection.Ltr, iArr);
        return new LazyGridSlots(L0, iArr);
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        return b((Density) obj, ((Constraints) obj2).r());
    }
}
