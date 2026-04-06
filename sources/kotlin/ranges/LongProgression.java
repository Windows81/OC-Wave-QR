package kotlin.ranges;

import kotlin.Metadata;
import kotlin.collections.LongIterator;
import kotlin.internal.ProgressionUtilKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.markers.KMappedMarker;

@Metadata
public class LongProgression implements Iterable<Long>, KMappedMarker {
    public static final Companion C = new Companion((DefaultConstructorMarker) null);

    /* renamed from: A  reason: collision with root package name */
    public final long f40963A;

    /* renamed from: B  reason: collision with root package name */
    public final long f40964B;

    /* renamed from: z  reason: collision with root package name */
    public final long f40965z;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    public LongProgression(long j2, long j3, long j4) {
        if (j4 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        } else if (j4 != Long.MIN_VALUE) {
            this.f40965z = j2;
            this.f40963A = ProgressionUtilKt.d(j2, j3, j4);
            this.f40964B = j4;
        } else {
            throw new IllegalArgumentException("Step must be greater than Long.MIN_VALUE to avoid overflow on negation.");
        }
    }

    public boolean equals(Object obj) {
        if (obj instanceof LongProgression) {
            if (!isEmpty() || !((LongProgression) obj).isEmpty()) {
                LongProgression longProgression = (LongProgression) obj;
                if (!(this.f40965z == longProgression.f40965z && this.f40963A == longProgression.f40963A && this.f40964B == longProgression.f40964B)) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        long j2 = (long) 31;
        long j3 = this.f40965z;
        long j4 = this.f40963A;
        long j5 = j2 * (((j3 ^ (j3 >>> 32)) * j2) + (j4 ^ (j4 >>> 32)));
        long j6 = this.f40964B;
        return (int) (j5 + (j6 ^ (j6 >>> 32)));
    }

    public boolean isEmpty() {
        int i2 = (this.f40964B > 0 ? 1 : (this.f40964B == 0 ? 0 : -1));
        long j2 = this.f40965z;
        long j3 = this.f40963A;
        if (i2 > 0) {
            if (j2 <= j3) {
                return false;
            }
        } else if (j2 >= j3) {
            return false;
        }
        return true;
    }

    public final long n() {
        return this.f40965z;
    }

    public final long o() {
        return this.f40963A;
    }

    /* renamed from: p */
    public LongIterator iterator() {
        return new LongProgressionIterator(this.f40965z, this.f40963A, this.f40964B);
    }

    public String toString() {
        StringBuilder sb;
        long j2;
        if (this.f40964B > 0) {
            sb = new StringBuilder();
            sb.append(this.f40965z);
            sb.append("..");
            sb.append(this.f40963A);
            sb.append(" step ");
            j2 = this.f40964B;
        } else {
            sb = new StringBuilder();
            sb.append(this.f40965z);
            sb.append(" downTo ");
            sb.append(this.f40963A);
            sb.append(" step ");
            j2 = -this.f40964B;
        }
        sb.append(j2);
        return sb.toString();
    }
}
