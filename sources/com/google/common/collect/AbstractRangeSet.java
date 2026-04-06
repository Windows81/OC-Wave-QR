package com.google.common.collect;

import java.lang.Comparable;

@ElementTypesAreNonnullByDefault
abstract class AbstractRangeSet<C extends Comparable> implements RangeSet<C> {
    public boolean b(Comparable comparable) {
        return c(comparable) != null;
    }

    public abstract Range c(Comparable comparable);

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof RangeSet) {
            return a().equals(((RangeSet) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return a().hashCode();
    }

    public final String toString() {
        return a().toString();
    }
}
