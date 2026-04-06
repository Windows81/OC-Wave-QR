package androidx.core.graphics;

import android.graphics.Rect;
import android.graphics.RegionIterator;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.markers.KMappedMarker;

@Metadata
public final class RegionKt$iterator$1 implements Iterator<Rect>, KMappedMarker {

    /* renamed from: A  reason: collision with root package name */
    public final Rect f19787A;

    /* renamed from: B  reason: collision with root package name */
    public boolean f19788B;

    /* renamed from: z  reason: collision with root package name */
    public final RegionIterator f19789z;

    /* renamed from: b */
    public Rect next() {
        if (this.f19788B) {
            Rect rect = new Rect(this.f19787A);
            this.f19788B = this.f19789z.next(this.f19787A);
            return rect;
        }
        throw new IndexOutOfBoundsException();
    }

    public boolean hasNext() {
        return this.f19788B;
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
