package kotlin.ranges;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.ULong;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.markers.KMappedMarker;

@Metadata
final class ULongProgressionIterator implements Iterator<ULong>, KMappedMarker {

    /* renamed from: A  reason: collision with root package name */
    public boolean f40982A;

    /* renamed from: B  reason: collision with root package name */
    public final long f40983B;
    public long C;

    /* renamed from: z  reason: collision with root package name */
    public final long f40984z;

    public /* synthetic */ ULongProgressionIterator(long j2, long j3, long j4, DefaultConstructorMarker defaultConstructorMarker) {
        this(j2, j3, j4);
    }

    public long b() {
        long j2 = this.C;
        if (j2 != this.f40984z) {
            this.C = ULong.f(this.f40983B + j2);
        } else if (this.f40982A) {
            this.f40982A = false;
        } else {
            throw new NoSuchElementException();
        }
        return j2;
    }

    public boolean hasNext() {
        return this.f40982A;
    }

    public /* bridge */ /* synthetic */ Object next() {
        return ULong.d(b());
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public ULongProgressionIterator(long j2, long j3, long j4) {
        this.f40984z = j3;
        boolean z2 = false;
        if (j4 <= 0 ? Long.compareUnsigned(j2, j3) >= 0 : Long.compareUnsigned(j2, j3) <= 0) {
            z2 = true;
        }
        this.f40982A = z2;
        this.f40983B = ULong.f(j4);
        this.C = !this.f40982A ? j3 : j2;
    }
}
