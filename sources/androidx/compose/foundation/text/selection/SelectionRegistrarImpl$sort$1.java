package androidx.compose.foundation.text.selection;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.layout.LayoutCoordinates;
import kotlin.Metadata;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class SelectionRegistrarImpl$sort$1 extends Lambda implements Function2<Selectable, Selectable, Integer> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ LayoutCoordinates f6954z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SelectionRegistrarImpl$sort$1(LayoutCoordinates layoutCoordinates) {
        super(2);
        this.f6954z = layoutCoordinates;
    }

    /* renamed from: b */
    public final Integer m(Selectable selectable, Selectable selectable2) {
        LayoutCoordinates N = selectable.N();
        LayoutCoordinates N2 = selectable2.N();
        long N3 = N != null ? this.f6954z.N(N, Offset.f15855b.c()) : Offset.f15855b.c();
        long N4 = N2 != null ? this.f6954z.N(N2, Offset.f15855b.c()) : Offset.f15855b.c();
        int i2 = (int) (N3 & 4294967295L);
        int i3 = (int) (4294967295L & N4);
        return Integer.valueOf(Float.intBitsToFloat(i2) == Float.intBitsToFloat(i3) ? ComparisonsKt.d(Float.valueOf(Float.intBitsToFloat((int) (N3 >> 32))), Float.valueOf(Float.intBitsToFloat((int) (N4 >> 32)))) : ComparisonsKt.d(Float.valueOf(Float.intBitsToFloat(i2)), Float.valueOf(Float.intBitsToFloat(i3))));
    }
}
