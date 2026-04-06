package kotlin.ranges;

import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.collections.LongIterator;

@Metadata
public final class LongProgressionIterator extends LongIterator {

    /* renamed from: A  reason: collision with root package name */
    public final long f40966A;

    /* renamed from: B  reason: collision with root package name */
    public boolean f40967B;
    public long C;

    /* renamed from: z  reason: collision with root package name */
    public final long f40968z;

    public LongProgressionIterator(long j2, long j3, long j4) {
        this.f40968z = j4;
        this.f40966A = j3;
        boolean z2 = false;
        if (j4 <= 0 ? j2 >= j3 : j2 <= j3) {
            z2 = true;
        }
        this.f40967B = z2;
        this.C = !z2 ? j3 : j2;
    }

    public long b() {
        long j2 = this.C;
        if (j2 != this.f40966A) {
            this.C = this.f40968z + j2;
        } else if (this.f40967B) {
            this.f40967B = false;
        } else {
            throw new NoSuchElementException();
        }
        return j2;
    }

    public boolean hasNext() {
        return this.f40967B;
    }
}
