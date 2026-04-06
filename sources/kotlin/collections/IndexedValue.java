package kotlin.collections;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class IndexedValue<T> {

    /* renamed from: a  reason: collision with root package name */
    public final int f40618a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f40619b;

    public IndexedValue(int i2, Object obj) {
        this.f40618a = i2;
        this.f40619b = obj;
    }

    public final int a() {
        return this.f40618a;
    }

    public final Object b() {
        return this.f40619b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IndexedValue)) {
            return false;
        }
        IndexedValue indexedValue = (IndexedValue) obj;
        return this.f40618a == indexedValue.f40618a && Intrinsics.d(this.f40619b, indexedValue.f40619b);
    }

    public int hashCode() {
        int hashCode = Integer.hashCode(this.f40618a) * 31;
        Object obj = this.f40619b;
        return hashCode + (obj == null ? 0 : obj.hashCode());
    }

    public String toString() {
        return "IndexedValue(index=" + this.f40618a + ", value=" + this.f40619b + ')';
    }
}
