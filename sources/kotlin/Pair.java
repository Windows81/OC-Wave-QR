package kotlin;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class Pair<A, B> implements Serializable {

    /* renamed from: A  reason: collision with root package name */
    public final Object f40514A;

    /* renamed from: z  reason: collision with root package name */
    public final Object f40515z;

    public Pair(Object obj, Object obj2) {
        this.f40515z = obj;
        this.f40514A = obj2;
    }

    public static /* synthetic */ Pair d(Pair pair, Object obj, Object obj2, int i2, Object obj3) {
        if ((i2 & 1) != 0) {
            obj = pair.f40515z;
        }
        if ((i2 & 2) != 0) {
            obj2 = pair.f40514A;
        }
        return pair.c(obj, obj2);
    }

    public final Object a() {
        return this.f40515z;
    }

    public final Object b() {
        return this.f40514A;
    }

    public final Pair c(Object obj, Object obj2) {
        return new Pair(obj, obj2);
    }

    public final Object e() {
        return this.f40515z;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Pair)) {
            return false;
        }
        Pair pair = (Pair) obj;
        return Intrinsics.d(this.f40515z, pair.f40515z) && Intrinsics.d(this.f40514A, pair.f40514A);
    }

    public final Object f() {
        return this.f40514A;
    }

    public int hashCode() {
        Object obj = this.f40515z;
        int i2 = 0;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.f40514A;
        if (obj2 != null) {
            i2 = obj2.hashCode();
        }
        return hashCode + i2;
    }

    public String toString() {
        return '(' + this.f40515z + ", " + this.f40514A + ')';
    }
}
