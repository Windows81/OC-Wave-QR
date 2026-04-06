package androidx.compose.runtime;

import androidx.compose.runtime.tooling.CompositionGroup;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.markers.KMappedMarker;

@Metadata
final class SourceInformationSlotTableGroup implements CompositionGroup, Iterable<CompositionGroup>, KMappedMarker {

    /* renamed from: A  reason: collision with root package name */
    public final int f14913A;

    /* renamed from: B  reason: collision with root package name */
    public final GroupSourceInformation f14914B;
    public final SourceInformationGroupPath C;
    public final Object D;
    public final Iterable E = this;

    /* renamed from: z  reason: collision with root package name */
    public final SlotTable f14915z;

    public SourceInformationSlotTableGroup(SlotTable slotTable, int i2, GroupSourceInformation groupSourceInformation, SourceInformationGroupPath sourceInformationGroupPath) {
        this.f14915z = slotTable;
        this.f14913A = i2;
        this.f14914B = groupSourceInformation;
        this.C = sourceInformationGroupPath;
        this.D = Integer.valueOf(groupSourceInformation.g());
    }

    public Iterator iterator() {
        return new SourceInformationGroupIterator(this.f14915z, this.f14913A, this.f14914B, this.C);
    }
}
