package kotlin.ranges;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class CharRange extends CharProgression implements ClosedRange<Character>, OpenEndRange<Character> {
    public static final Companion D = new Companion((DefaultConstructorMarker) null);
    public static final CharRange E = new CharRange(1, 0);

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    public CharRange(char c2, char c3) {
        super(c2, c3, 1);
    }

    public boolean equals(Object obj) {
        if (obj instanceof CharRange) {
            if (!isEmpty() || !((CharRange) obj).isEmpty()) {
                CharRange charRange = (CharRange) obj;
                if (!(n() == charRange.n() && o() == charRange.o())) {
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
        return Intrinsics.k(n(), o()) > 0;
    }

    /* renamed from: q */
    public Character h() {
        if (o() != 65535) {
            return Character.valueOf((char) (o() + 1));
        }
        throw new IllegalStateException("Cannot return the exclusive upper bound of a range that includes MAX_VALUE.");
    }

    /* renamed from: s */
    public Character m() {
        return Character.valueOf(o());
    }

    public String toString() {
        return n() + ".." + o();
    }

    /* renamed from: u */
    public Character e() {
        return Character.valueOf(n());
    }
}
