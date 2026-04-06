package com.google.common.hash;

import com.google.common.base.Objects;
import com.google.common.base.Predicate;
import com.google.common.hash.BloomFilterStrategies;
import java.io.Serializable;

@ElementTypesAreNonnullByDefault
public final class BloomFilter<T> implements Predicate<T>, Serializable {

    /* renamed from: A  reason: collision with root package name */
    public final int f28838A;

    /* renamed from: B  reason: collision with root package name */
    public final Funnel f28839B;
    public final Strategy C;

    /* renamed from: z  reason: collision with root package name */
    public final BloomFilterStrategies.LockFreeBitArray f28840z;

    public static class SerialForm<T> implements Serializable {
    }

    public interface Strategy extends Serializable {
        boolean O(Object obj, Funnel funnel, int i2, BloomFilterStrategies.LockFreeBitArray lockFreeBitArray);
    }

    public boolean a(Object obj) {
        return this.C.O(obj, this.f28839B, this.f28838A, this.f28840z);
    }

    public boolean apply(Object obj) {
        return a(obj);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BloomFilter)) {
            return false;
        }
        BloomFilter bloomFilter = (BloomFilter) obj;
        return this.f28838A == bloomFilter.f28838A && this.f28839B.equals(bloomFilter.f28839B) && this.f28840z.equals(bloomFilter.f28840z) && this.C.equals(bloomFilter.C);
    }

    public int hashCode() {
        return Objects.b(Integer.valueOf(this.f28838A), this.f28839B, this.C, this.f28840z);
    }
}
