package androidx.compose.runtime;

import androidx.compose.runtime.tooling.CompositionGroup;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.markers.KMappedMarker;

@Metadata
final class SlotTableGroup implements CompositionGroup, Iterable<CompositionGroup>, KMappedMarker {

    /* renamed from: A  reason: collision with root package name */
    public final int f14859A;

    /* renamed from: B  reason: collision with root package name */
    public final int f14860B;

    /* renamed from: z  reason: collision with root package name */
    public final SlotTable f14861z;

    public SlotTableGroup(SlotTable slotTable, int i2, int i3) {
        this.f14861z = slotTable;
        this.f14859A = i2;
        this.f14860B = i3;
    }

    private final void e() {
        if (this.f14861z.A() != this.f14860B) {
            SlotTableKt.u();
        }
    }

    public Iterator iterator() {
        e();
        GroupSourceInformation M = this.f14861z.M(this.f14859A);
        if (M != null) {
            SlotTable slotTable = this.f14861z;
            int i2 = this.f14859A;
            return new SourceInformationGroupIterator(slotTable, i2, M, new AnchoredGroupPath(i2));
        }
        SlotTable slotTable2 = this.f14861z;
        int i3 = this.f14859A;
        return new GroupIterator(slotTable2, i3 + 1, i3 + SlotTableKt.o(slotTable2.s(), this.f14859A));
    }
}
