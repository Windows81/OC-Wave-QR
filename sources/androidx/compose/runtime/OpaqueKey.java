package androidx.compose.runtime;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class OpaqueKey {

    /* renamed from: a  reason: collision with root package name */
    public final String f14744a;

    public OpaqueKey(String str) {
        this.f14744a = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof OpaqueKey) && Intrinsics.d(this.f14744a, ((OpaqueKey) obj).f14744a);
    }

    public int hashCode() {
        return this.f14744a.hashCode();
    }

    public String toString() {
        return "OpaqueKey(key=" + this.f14744a + ')';
    }
}
