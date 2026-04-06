package com.google.common.collect;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Comparator;

@ElementTypesAreNonnullByDefault
final class CompoundOrdering<T> extends Ordering<T> implements Serializable {

    /* renamed from: z  reason: collision with root package name */
    public final Comparator[] f28056z;

    public int compare(Object obj, Object obj2) {
        int i2 = 0;
        while (true) {
            Comparator[] comparatorArr = this.f28056z;
            if (i2 >= comparatorArr.length) {
                return 0;
            }
            int compare = comparatorArr[i2].compare(obj, obj2);
            if (compare != 0) {
                return compare;
            }
            i2++;
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof CompoundOrdering) {
            return Arrays.equals(this.f28056z, ((CompoundOrdering) obj).f28056z);
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(this.f28056z);
    }

    public String toString() {
        String arrays = Arrays.toString(this.f28056z);
        StringBuilder sb = new StringBuilder(String.valueOf(arrays).length() + 19);
        sb.append("Ordering.compound(");
        sb.append(arrays);
        sb.append(")");
        return sb.toString();
    }
}
