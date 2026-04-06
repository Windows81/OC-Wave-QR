package kotlin.ranges;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
public final class LongRange extends LongProgression implements ClosedRange<Long>, OpenEndRange<Long> {
    public static final Companion D = new Companion((DefaultConstructorMarker) null);
    public static final LongRange E = new LongRange(1, 0);

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    public LongRange(long j2, long j3) {
        super(j2, j3, 1);
    }

    public boolean equals(Object obj) {
        if (obj instanceof LongRange) {
            if (!isEmpty() || !((LongRange) obj).isEmpty()) {
                LongRange longRange = (LongRange) obj;
                if (!(n() == longRange.n() && o() == longRange.o())) {
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
        return (int) ((((long) 31) * (n() ^ (n() >>> 32))) + (o() ^ (o() >>> 32)));
    }

    public boolean isEmpty() {
        return n() > o();
    }

    /* renamed from: q */
    public Long h() {
        if (o() != Long.MAX_VALUE) {
            return Long.valueOf(o() + 1);
        }
        throw new IllegalStateException("Cannot return the exclusive upper bound of a range that includes MAX_VALUE.");
    }

    /* renamed from: s */
    public Long m() {
        return Long.valueOf(o());
    }

    public String toString() {
        return n() + ".." + o();
    }

    /* renamed from: u */
    public Long e() {
        return Long.valueOf(n());
    }
}
