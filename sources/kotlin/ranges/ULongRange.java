package kotlin.ranges;

import kotlin.Metadata;
import kotlin.ULong;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
public final class ULongRange extends ULongProgression implements ClosedRange<ULong>, OpenEndRange<ULong> {
    public static final Companion D = new Companion((DefaultConstructorMarker) null);
    public static final ULongRange E = new ULongRange(-1, 0, (DefaultConstructorMarker) null);

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    public /* synthetic */ ULongRange(long j2, long j3, DefaultConstructorMarker defaultConstructorMarker) {
        this(j2, j3);
    }

    public /* bridge */ /* synthetic */ Comparable e() {
        return ULong.d(s());
    }

    public boolean equals(Object obj) {
        if (obj instanceof ULongRange) {
            if (!isEmpty() || !((ULongRange) obj).isEmpty()) {
                ULongRange uLongRange = (ULongRange) obj;
                if (!(n() == uLongRange.n() && o() == uLongRange.o())) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public /* bridge */ /* synthetic */ Comparable h() {
        return ULong.d(p());
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((int) ULong.f(n() ^ ULong.f(n() >>> 32))) * 31) + ((int) ULong.f(o() ^ ULong.f(o() >>> 32)));
    }

    public boolean isEmpty() {
        return Long.compareUnsigned(n(), o()) > 0;
    }

    public /* bridge */ /* synthetic */ Comparable m() {
        return ULong.d(q());
    }

    public long p() {
        if (o() != -1) {
            return ULong.f(o() + ULong.f(((long) 1) & 4294967295L));
        }
        throw new IllegalStateException("Cannot return the exclusive upper bound of a range that includes MAX_VALUE.");
    }

    public long q() {
        return o();
    }

    public long s() {
        return n();
    }

    public String toString() {
        return ULong.l(n()) + ".." + ULong.l(o());
    }

    public ULongRange(long j2, long j3) {
        super(j2, j3, 1, (DefaultConstructorMarker) null);
    }
}
