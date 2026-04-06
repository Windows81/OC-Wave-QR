package kotlin.ranges;

import kotlin.Metadata;
import kotlin.collections.IntIterator;
import kotlin.internal.ProgressionUtilKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.markers.KMappedMarker;

@Metadata
public class IntProgression implements Iterable<Integer>, KMappedMarker {
    public static final Companion C = new Companion((DefaultConstructorMarker) null);

    /* renamed from: A  reason: collision with root package name */
    public final int f40957A;

    /* renamed from: B  reason: collision with root package name */
    public final int f40958B;

    /* renamed from: z  reason: collision with root package name */
    public final int f40959z;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final IntProgression a(int i2, int i3, int i4) {
            return new IntProgression(i2, i3, i4);
        }

        public Companion() {
        }
    }

    public IntProgression(int i2, int i3, int i4) {
        if (i4 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        } else if (i4 != Integer.MIN_VALUE) {
            this.f40959z = i2;
            this.f40957A = ProgressionUtilKt.c(i2, i3, i4);
            this.f40958B = i4;
        } else {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
    }

    public boolean equals(Object obj) {
        if (obj instanceof IntProgression) {
            if (!isEmpty() || !((IntProgression) obj).isEmpty()) {
                IntProgression intProgression = (IntProgression) obj;
                if (!(this.f40959z == intProgression.f40959z && this.f40957A == intProgression.f40957A && this.f40958B == intProgression.f40958B)) {
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
        return (((this.f40959z * 31) + this.f40957A) * 31) + this.f40958B;
    }

    public boolean isEmpty() {
        if (this.f40958B > 0) {
            if (this.f40959z <= this.f40957A) {
                return false;
            }
        } else if (this.f40959z >= this.f40957A) {
            return false;
        }
        return true;
    }

    public final int n() {
        return this.f40959z;
    }

    public final int o() {
        return this.f40957A;
    }

    public final int p() {
        return this.f40958B;
    }

    /* renamed from: q */
    public IntIterator iterator() {
        return new IntProgressionIterator(this.f40959z, this.f40957A, this.f40958B);
    }

    public String toString() {
        StringBuilder sb;
        int i2;
        if (this.f40958B > 0) {
            sb = new StringBuilder();
            sb.append(this.f40959z);
            sb.append("..");
            sb.append(this.f40957A);
            sb.append(" step ");
            i2 = this.f40958B;
        } else {
            sb = new StringBuilder();
            sb.append(this.f40959z);
            sb.append(" downTo ");
            sb.append(this.f40957A);
            sb.append(" step ");
            i2 = -this.f40958B;
        }
        sb.append(i2);
        return sb.toString();
    }
}
