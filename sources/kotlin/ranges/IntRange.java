package kotlin.ranges;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
public final class IntRange extends IntProgression implements ClosedRange<Integer>, OpenEndRange<Integer> {
    public static final Companion D = new Companion((DefaultConstructorMarker) null);
    public static final IntRange E = new IntRange(1, 0);

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final IntRange a() {
            return IntRange.E;
        }

        public Companion() {
        }
    }

    public IntRange(int i2, int i3) {
        super(i2, i3, 1);
    }

    public boolean equals(Object obj) {
        if (obj instanceof IntRange) {
            if (!isEmpty() || !((IntRange) obj).isEmpty()) {
                IntRange intRange = (IntRange) obj;
                if (!(n() == intRange.n() && o() == intRange.o())) {
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
        return (n() * 31) + o();
    }

    public boolean isEmpty() {
        return n() > o();
    }

    public String toString() {
        return n() + ".." + o();
    }

    public boolean u(int i2) {
        return n() <= i2 && i2 <= o();
    }

    /* renamed from: v */
    public Integer h() {
        if (o() != Integer.MAX_VALUE) {
            return Integer.valueOf(o() + 1);
        }
        throw new IllegalStateException("Cannot return the exclusive upper bound of a range that includes MAX_VALUE.");
    }

    /* renamed from: w */
    public Integer m() {
        return Integer.valueOf(o());
    }

    /* renamed from: z */
    public Integer e() {
        return Integer.valueOf(n());
    }
}
