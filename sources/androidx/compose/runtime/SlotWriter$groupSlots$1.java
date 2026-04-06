package androidx.compose.runtime;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.markers.KMappedMarker;

@Metadata
public final class SlotWriter$groupSlots$1 implements Iterator<Object>, KMappedMarker {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ int f14889A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ SlotWriter f14890B;

    /* renamed from: z  reason: collision with root package name */
    public int f14891z;

    public boolean hasNext() {
        return this.f14891z < this.f14889A;
    }

    public Object next() {
        if (!hasNext()) {
            return null;
        }
        Object[] k2 = this.f14890B.f14867c;
        SlotWriter slotWriter = this.f14890B;
        int i2 = this.f14891z;
        this.f14891z = i2 + 1;
        return k2[slotWriter.P(i2)];
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
