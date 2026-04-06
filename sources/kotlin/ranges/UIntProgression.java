package kotlin.ranges;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.UInt;
import kotlin.internal.UProgressionUtilKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.markers.KMappedMarker;

@Metadata
public class UIntProgression implements Iterable<UInt>, KMappedMarker {
    public static final Companion C = new Companion((DefaultConstructorMarker) null);

    /* renamed from: A  reason: collision with root package name */
    public final int f40973A;

    /* renamed from: B  reason: collision with root package name */
    public final int f40974B;

    /* renamed from: z  reason: collision with root package name */
    public final int f40975z;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    public /* synthetic */ UIntProgression(int i2, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(i2, i3, i4);
    }

    public boolean equals(Object obj) {
        if (obj instanceof UIntProgression) {
            if (!isEmpty() || !((UIntProgression) obj).isEmpty()) {
                UIntProgression uIntProgression = (UIntProgression) obj;
                if (!(this.f40975z == uIntProgression.f40975z && this.f40973A == uIntProgression.f40973A && this.f40974B == uIntProgression.f40974B)) {
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
        return (((this.f40975z * 31) + this.f40973A) * 31) + this.f40974B;
    }

    public boolean isEmpty() {
        if (this.f40974B > 0) {
            if (Integer.compareUnsigned(this.f40975z, this.f40973A) <= 0) {
                return false;
            }
        } else if (Integer.compareUnsigned(this.f40975z, this.f40973A) >= 0) {
            return false;
        }
        return true;
    }

    public final Iterator iterator() {
        return new UIntProgressionIterator(this.f40975z, this.f40973A, this.f40974B, (DefaultConstructorMarker) null);
    }

    public final int n() {
        return this.f40975z;
    }

    public final int o() {
        return this.f40973A;
    }

    public String toString() {
        StringBuilder sb;
        int i2;
        if (this.f40974B > 0) {
            sb = new StringBuilder();
            sb.append(UInt.k(this.f40975z));
            sb.append("..");
            sb.append(UInt.k(this.f40973A));
            sb.append(" step ");
            i2 = this.f40974B;
        } else {
            sb = new StringBuilder();
            sb.append(UInt.k(this.f40975z));
            sb.append(" downTo ");
            sb.append(UInt.k(this.f40973A));
            sb.append(" step ");
            i2 = -this.f40974B;
        }
        sb.append(i2);
        return sb.toString();
    }

    public UIntProgression(int i2, int i3, int i4) {
        if (i4 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        } else if (i4 != Integer.MIN_VALUE) {
            this.f40975z = i2;
            this.f40973A = UProgressionUtilKt.d(i2, i3, i4);
            this.f40974B = i4;
        } else {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
    }
}
