package kotlin.ranges;

import kotlin.Metadata;
import kotlin.UInt;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
public final class UIntRange extends UIntProgression implements ClosedRange<UInt>, OpenEndRange<UInt> {
    public static final Companion D = new Companion((DefaultConstructorMarker) null);
    public static final UIntRange E = new UIntRange(-1, 0, (DefaultConstructorMarker) null);

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    public /* synthetic */ UIntRange(int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(i2, i3);
    }

    public /* bridge */ /* synthetic */ Comparable e() {
        return UInt.d(s());
    }

    public boolean equals(Object obj) {
        if (obj instanceof UIntRange) {
            if (!isEmpty() || !((UIntRange) obj).isEmpty()) {
                UIntRange uIntRange = (UIntRange) obj;
                if (!(n() == uIntRange.n() && o() == uIntRange.o())) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public /* bridge */ /* synthetic */ Comparable h() {
        return UInt.d(p());
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (n() * 31) + o();
    }

    public boolean isEmpty() {
        return Integer.compareUnsigned(n(), o()) > 0;
    }

    public /* bridge */ /* synthetic */ Comparable m() {
        return UInt.d(q());
    }

    public int p() {
        if (o() != -1) {
            return UInt.f(o() + 1);
        }
        throw new IllegalStateException("Cannot return the exclusive upper bound of a range that includes MAX_VALUE.");
    }

    public int q() {
        return o();
    }

    public int s() {
        return n();
    }

    public String toString() {
        return UInt.k(n()) + ".." + UInt.k(o());
    }

    public UIntRange(int i2, int i3) {
        super(i2, i3, 1, (DefaultConstructorMarker) null);
    }
}
