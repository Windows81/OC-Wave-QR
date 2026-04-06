package kotlin;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class Triple<A, B, C> implements Serializable {

    /* renamed from: A  reason: collision with root package name */
    public final Object f40528A;

    /* renamed from: B  reason: collision with root package name */
    public final Object f40529B;

    /* renamed from: z  reason: collision with root package name */
    public final Object f40530z;

    public Triple(Object obj, Object obj2, Object obj3) {
        this.f40530z = obj;
        this.f40528A = obj2;
        this.f40529B = obj3;
    }

    public final Object a() {
        return this.f40530z;
    }

    public final Object b() {
        return this.f40528A;
    }

    public final Object c() {
        return this.f40529B;
    }

    public final Object d() {
        return this.f40530z;
    }

    public final Object e() {
        return this.f40528A;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Triple)) {
            return false;
        }
        Triple triple = (Triple) obj;
        return Intrinsics.d(this.f40530z, triple.f40530z) && Intrinsics.d(this.f40528A, triple.f40528A) && Intrinsics.d(this.f40529B, triple.f40529B);
    }

    public final Object f() {
        return this.f40529B;
    }

    public int hashCode() {
        Object obj = this.f40530z;
        int i2 = 0;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.f40528A;
        int hashCode2 = (hashCode + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Object obj3 = this.f40529B;
        if (obj3 != null) {
            i2 = obj3.hashCode();
        }
        return hashCode2 + i2;
    }

    public String toString() {
        return '(' + this.f40530z + ", " + this.f40528A + ", " + this.f40529B + ')';
    }
}
