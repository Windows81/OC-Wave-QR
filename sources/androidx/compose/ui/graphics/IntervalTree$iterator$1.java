package androidx.compose.ui.graphics;

import androidx.compose.ui.graphics.IntervalTree;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.markers.KMappedMarker;

@Metadata
public final class IntervalTree$iterator$1 implements Iterator<Interval<Object>>, KMappedMarker {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ IntervalTree f16041A;

    /* renamed from: z  reason: collision with root package name */
    public IntervalTree.Node f16042z;

    /* renamed from: b */
    public Interval next() {
        IntervalTree.Node node = this.f16042z;
        this.f16042z = node.l();
        return node;
    }

    public boolean hasNext() {
        return this.f16042z != this.f16041A.f16031a;
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
