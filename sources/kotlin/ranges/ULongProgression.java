package kotlin.ranges;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.ULong;
import kotlin.internal.UProgressionUtilKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.markers.KMappedMarker;

@Metadata
public class ULongProgression implements Iterable<ULong>, KMappedMarker {
    public static final Companion C = new Companion((DefaultConstructorMarker) null);

    /* renamed from: A  reason: collision with root package name */
    public final long f40979A;

    /* renamed from: B  reason: collision with root package name */
    public final long f40980B;

    /* renamed from: z  reason: collision with root package name */
    public final long f40981z;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    public /* synthetic */ ULongProgression(long j2, long j3, long j4, DefaultConstructorMarker defaultConstructorMarker) {
        this(j2, j3, j4);
    }

    public boolean equals(Object obj) {
        if (obj instanceof ULongProgression) {
            if (!isEmpty() || !((ULongProgression) obj).isEmpty()) {
                ULongProgression uLongProgression = (ULongProgression) obj;
                if (!(this.f40981z == uLongProgression.f40981z && this.f40979A == uLongProgression.f40979A && this.f40980B == uLongProgression.f40980B)) {
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
        long j2 = this.f40981z;
        long j3 = this.f40979A;
        long j4 = this.f40980B;
        return (((((int) ULong.f(j2 ^ ULong.f(j2 >>> 32))) * 31) + ((int) ULong.f(j3 ^ ULong.f(j3 >>> 32)))) * 31) + ((int) ((j4 >>> 32) ^ j4));
    }

    public boolean isEmpty() {
        int i2 = (this.f40980B > 0 ? 1 : (this.f40980B == 0 ? 0 : -1));
        long j2 = this.f40981z;
        long j3 = this.f40979A;
        if (i2 > 0) {
            if (Long.compareUnsigned(j2, j3) <= 0) {
                return false;
            }
        } else if (Long.compareUnsigned(j2, j3) >= 0) {
            return false;
        }
        return true;
    }

    public final Iterator iterator() {
        return new ULongProgressionIterator(this.f40981z, this.f40979A, this.f40980B, (DefaultConstructorMarker) null);
    }

    public final long n() {
        return this.f40981z;
    }

    public final long o() {
        return this.f40979A;
    }

    public String toString() {
        StringBuilder sb;
        long j2;
        if (this.f40980B > 0) {
            sb = new StringBuilder();
            sb.append(ULong.l(this.f40981z));
            sb.append("..");
            sb.append(ULong.l(this.f40979A));
            sb.append(" step ");
            j2 = this.f40980B;
        } else {
            sb = new StringBuilder();
            sb.append(ULong.l(this.f40981z));
            sb.append(" downTo ");
            sb.append(ULong.l(this.f40979A));
            sb.append(" step ");
            j2 = -this.f40980B;
        }
        sb.append(j2);
        return sb.toString();
    }

    public ULongProgression(long j2, long j3, long j4) {
        if (j4 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        } else if (j4 != Long.MIN_VALUE) {
            this.f40981z = j2;
            this.f40979A = UProgressionUtilKt.c(j2, j3, j4);
            this.f40980B = j4;
        } else {
            throw new IllegalArgumentException("Step must be greater than Long.MIN_VALUE to avoid overflow on negation.");
        }
    }
}
