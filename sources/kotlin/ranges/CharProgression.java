package kotlin.ranges;

import kotlin.Metadata;
import kotlin.collections.CharIterator;
import kotlin.internal.ProgressionUtilKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;

@Metadata
public class CharProgression implements Iterable<Character>, KMappedMarker {
    public static final Companion C = new Companion((DefaultConstructorMarker) null);

    /* renamed from: A  reason: collision with root package name */
    public final char f40943A;

    /* renamed from: B  reason: collision with root package name */
    public final int f40944B;

    /* renamed from: z  reason: collision with root package name */
    public final char f40945z;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    public CharProgression(char c2, char c3, int i2) {
        if (i2 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        } else if (i2 != Integer.MIN_VALUE) {
            this.f40945z = c2;
            this.f40943A = (char) ProgressionUtilKt.c(c2, c3, i2);
            this.f40944B = i2;
        } else {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
    }

    public boolean equals(Object obj) {
        if (obj instanceof CharProgression) {
            if (!isEmpty() || !((CharProgression) obj).isEmpty()) {
                CharProgression charProgression = (CharProgression) obj;
                if (!(this.f40945z == charProgression.f40945z && this.f40943A == charProgression.f40943A && this.f40944B == charProgression.f40944B)) {
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
        return (((this.f40945z * 31) + this.f40943A) * 31) + this.f40944B;
    }

    public boolean isEmpty() {
        if (this.f40944B > 0) {
            if (Intrinsics.k(this.f40945z, this.f40943A) <= 0) {
                return false;
            }
        } else if (Intrinsics.k(this.f40945z, this.f40943A) >= 0) {
            return false;
        }
        return true;
    }

    public final char n() {
        return this.f40945z;
    }

    public final char o() {
        return this.f40943A;
    }

    /* renamed from: p */
    public CharIterator iterator() {
        return new CharProgressionIterator(this.f40945z, this.f40943A, this.f40944B);
    }

    public String toString() {
        StringBuilder sb;
        int i2;
        if (this.f40944B > 0) {
            sb = new StringBuilder();
            sb.append(this.f40945z);
            sb.append("..");
            sb.append(this.f40943A);
            sb.append(" step ");
            i2 = this.f40944B;
        } else {
            sb = new StringBuilder();
            sb.append(this.f40945z);
            sb.append(" downTo ");
            sb.append(this.f40943A);
            sb.append(" step ");
            i2 = -this.f40944B;
        }
        sb.append(i2);
        return sb.toString();
    }
}
