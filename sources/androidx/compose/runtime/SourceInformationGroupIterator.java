package androidx.compose.runtime;

import androidx.compose.runtime.tooling.CompositionGroup;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.jvm.internal.markers.KMappedMarker;

@Metadata
final class SourceInformationGroupIterator implements Iterator<CompositionGroup>, KMappedMarker {

    /* renamed from: A  reason: collision with root package name */
    public final int f14910A;

    /* renamed from: B  reason: collision with root package name */
    public final GroupSourceInformation f14911B;
    public final SourceInformationGroupPath C;
    public final int D;
    public int E;

    /* renamed from: z  reason: collision with root package name */
    public final SlotTable f14912z;

    public SourceInformationGroupIterator(SlotTable slotTable, int i2, GroupSourceInformation groupSourceInformation, SourceInformationGroupPath sourceInformationGroupPath) {
        this.f14912z = slotTable;
        this.f14910A = i2;
        this.f14911B = groupSourceInformation;
        this.C = sourceInformationGroupPath;
        this.D = slotTable.A();
    }

    /* renamed from: b */
    public CompositionGroup next() {
        Object obj;
        ArrayList f2 = this.f14911B.f();
        if (f2 != null) {
            int i2 = this.E;
            this.E = i2 + 1;
            obj = f2.get(i2);
        } else {
            obj = null;
        }
        if (obj instanceof Anchor) {
            return new SlotTableGroup(this.f14912z, ((Anchor) obj).a(), this.D);
        }
        if (obj instanceof GroupSourceInformation) {
            return new SourceInformationSlotTableGroup(this.f14912z, this.f14910A, (GroupSourceInformation) obj, new RelativeGroupPath(this.C, this.E - 1));
        }
        ComposerKt.w("Unexpected group information structure");
        throw new KotlinNothingValueException();
    }

    public boolean hasNext() {
        ArrayList f2 = this.f14911B.f();
        return f2 != null && this.E < f2.size();
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
