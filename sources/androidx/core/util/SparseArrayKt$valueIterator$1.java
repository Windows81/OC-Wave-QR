package androidx.core.util;

import android.util.SparseArray;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.markers.KMappedMarker;

@Metadata
public final class SparseArrayKt$valueIterator$1 implements Iterator<Object>, KMappedMarker {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ SparseArray f20174A;

    /* renamed from: z  reason: collision with root package name */
    public int f20175z;

    public boolean hasNext() {
        return this.f20175z < this.f20174A.size();
    }

    public Object next() {
        SparseArray sparseArray = this.f20174A;
        int i2 = this.f20175z;
        this.f20175z = i2 + 1;
        return sparseArray.valueAt(i2);
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
