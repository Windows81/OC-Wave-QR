package androidx.compose.ui.graphics.vector;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.markers.KMappedMarker;

@Metadata
public final class VectorGroup$iterator$1 implements Iterator<VectorNode>, KMappedMarker {

    /* renamed from: z  reason: collision with root package name */
    public final Iterator f16658z;

    public VectorGroup$iterator$1(VectorGroup vectorGroup) {
        this.f16658z = vectorGroup.I.iterator();
    }

    /* renamed from: b */
    public VectorNode next() {
        return (VectorNode) this.f16658z.next();
    }

    public boolean hasNext() {
        return this.f16658z.hasNext();
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
