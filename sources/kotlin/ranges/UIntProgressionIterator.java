package kotlin.ranges;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.UInt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.markers.KMappedMarker;

@Metadata
final class UIntProgressionIterator implements Iterator<UInt>, KMappedMarker {

    /* renamed from: A  reason: collision with root package name */
    public boolean f40976A;

    /* renamed from: B  reason: collision with root package name */
    public final int f40977B;
    public int C;

    /* renamed from: z  reason: collision with root package name */
    public final int f40978z;

    public /* synthetic */ UIntProgressionIterator(int i2, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(i2, i3, i4);
    }

    public int b() {
        int i2 = this.C;
        if (i2 != this.f40978z) {
            this.C = UInt.f(this.f40977B + i2);
        } else if (this.f40976A) {
            this.f40976A = false;
        } else {
            throw new NoSuchElementException();
        }
        return i2;
    }

    public boolean hasNext() {
        return this.f40976A;
    }

    public /* bridge */ /* synthetic */ Object next() {
        return UInt.d(b());
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public UIntProgressionIterator(int i2, int i3, int i4) {
        this.f40978z = i3;
        boolean z2 = false;
        int compareUnsigned = Integer.compareUnsigned(i2, i3);
        if (i4 <= 0 ? compareUnsigned >= 0 : compareUnsigned <= 0) {
            z2 = true;
        }
        this.f40976A = z2;
        this.f40977B = UInt.f(i4);
        this.C = !this.f40976A ? i3 : i2;
    }
}
