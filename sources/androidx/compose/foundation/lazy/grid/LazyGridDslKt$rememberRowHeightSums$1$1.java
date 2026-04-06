package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class LazyGridDslKt$rememberRowHeightSums$1$1 extends Lambda implements Function2<Density, Constraints, LazyGridSlots> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Arrangement.Vertical f4573A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ GridCells f4574z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LazyGridDslKt$rememberRowHeightSums$1$1(GridCells gridCells, Arrangement.Vertical vertical) {
        super(2);
        this.f4574z = gridCells;
        this.f4573A = vertical;
    }

    public final LazyGridSlots b(Density density, long j2) {
        if (!(Constraints.k(j2) != Integer.MAX_VALUE)) {
            InlineClassHelperKt.a("LazyHorizontalGrid's height should be bound by parent.");
        }
        int k2 = Constraints.k(j2);
        GridCells gridCells = this.f4574z;
        Arrangement.Vertical vertical = this.f4573A;
        int[] L0 = CollectionsKt.L0(gridCells.a(density, k2, density.P1(vertical.a())));
        int[] iArr = new int[L0.length];
        vertical.b(density, k2, L0, iArr);
        return new LazyGridSlots(L0, iArr);
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        return b((Density) obj, ((Constraints) obj2).r());
    }
}
