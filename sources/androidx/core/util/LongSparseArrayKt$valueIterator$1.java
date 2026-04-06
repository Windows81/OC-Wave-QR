package androidx.core.util;

import android.util.LongSparseArray;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.markers.KMappedMarker;

@Metadata
public final class LongSparseArrayKt$valueIterator$1 implements Iterator<Object>, KMappedMarker {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ LongSparseArray f20149A;

    /* renamed from: z  reason: collision with root package name */
    public int f20150z;

    public boolean hasNext() {
        return this.f20150z < this.f20149A.size();
    }

    public Object next() {
        LongSparseArray longSparseArray = this.f20149A;
        int i2 = this.f20150z;
        this.f20150z = i2 + 1;
        return longSparseArray.valueAt(i2);
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
