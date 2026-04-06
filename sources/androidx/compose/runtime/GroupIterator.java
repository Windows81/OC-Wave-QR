package androidx.compose.runtime;

import androidx.compose.runtime.tooling.CompositionGroup;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.markers.KMappedMarker;

@Metadata
final class GroupIterator implements Iterator<CompositionGroup>, KMappedMarker {

    /* renamed from: A  reason: collision with root package name */
    public final int f14666A;

    /* renamed from: B  reason: collision with root package name */
    public int f14667B;
    public final int C;

    /* renamed from: z  reason: collision with root package name */
    public final SlotTable f14668z;

    public GroupIterator(SlotTable slotTable, int i2, int i3) {
        this.f14668z = slotTable;
        this.f14666A = i3;
        this.f14667B = i2;
        this.C = slotTable.A();
        if (slotTable.B()) {
            SlotTableKt.u();
        }
    }

    /* renamed from: b */
    public CompositionGroup next() {
        c();
        int i2 = this.f14667B;
        this.f14667B = SlotTableKt.o(this.f14668z.s(), i2) + i2;
        return new SlotTableGroup(this.f14668z, i2, this.C);
    }

    public final void c() {
        if (this.f14668z.A() != this.C) {
            SlotTableKt.u();
        }
    }

    public boolean hasNext() {
        return this.f14667B < this.f14666A;
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
