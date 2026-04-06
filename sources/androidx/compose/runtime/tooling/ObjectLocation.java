package androidx.compose.runtime.tooling;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class ObjectLocation {

    /* renamed from: a  reason: collision with root package name */
    public final int f15402a;

    /* renamed from: b  reason: collision with root package name */
    public final Integer f15403b;

    public ObjectLocation(int i2, Integer num) {
        this.f15402a = i2;
        this.f15403b = num;
    }

    public final int a() {
        return this.f15402a;
    }

    public final Integer b() {
        return this.f15403b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ObjectLocation)) {
            return false;
        }
        ObjectLocation objectLocation = (ObjectLocation) obj;
        return this.f15402a == objectLocation.f15402a && Intrinsics.d(this.f15403b, objectLocation.f15403b);
    }

    public int hashCode() {
        int hashCode = Integer.hashCode(this.f15402a) * 31;
        Integer num = this.f15403b;
        return hashCode + (num == null ? 0 : num.hashCode());
    }

    public String toString() {
        return "ObjectLocation(group=" + this.f15402a + ", dataOffset=" + this.f15403b + ')';
    }
}
