package androidx.collection;

import kotlin.Metadata;

@Metadata
public final class LongLongPair {

    /* renamed from: a  reason: collision with root package name */
    public final long f1827a;

    /* renamed from: b  reason: collision with root package name */
    public final long f1828b;

    public boolean equals(Object obj) {
        if (!(obj instanceof LongLongPair)) {
            return false;
        }
        LongLongPair longLongPair = (LongLongPair) obj;
        return longLongPair.f1827a == this.f1827a && longLongPair.f1828b == this.f1828b;
    }

    public int hashCode() {
        return Long.hashCode(this.f1827a) ^ Long.hashCode(this.f1828b);
    }

    public String toString() {
        return '(' + this.f1827a + ", " + this.f1828b + ')';
    }
}
