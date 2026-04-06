package androidx.compose.runtime;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class JoinedKey {

    /* renamed from: a  reason: collision with root package name */
    public final Object f14689a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f14690b;

    public JoinedKey(Object obj, Object obj2) {
        this.f14689a = obj;
        this.f14690b = obj2;
    }

    public final int a(Object obj) {
        if (obj instanceof Enum) {
            return ((Enum) obj).ordinal();
        }
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof JoinedKey)) {
            return false;
        }
        JoinedKey joinedKey = (JoinedKey) obj;
        return Intrinsics.d(this.f14689a, joinedKey.f14689a) && Intrinsics.d(this.f14690b, joinedKey.f14690b);
    }

    public int hashCode() {
        return (a(this.f14689a) * 31) + a(this.f14690b);
    }

    public String toString() {
        return "JoinedKey(left=" + this.f14689a + ", right=" + this.f14690b + ')';
    }
}
