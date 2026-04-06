package androidx.compose.runtime;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class StaticValueHolder<T> implements ValueHolder<T> {

    /* renamed from: a  reason: collision with root package name */
    public final Object f14919a;

    public StaticValueHolder(Object obj) {
        this.f14919a = obj;
    }

    public Object a(PersistentCompositionLocalMap persistentCompositionLocalMap) {
        return this.f14919a;
    }

    public final Object b() {
        return this.f14919a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof StaticValueHolder) && Intrinsics.d(this.f14919a, ((StaticValueHolder) obj).f14919a);
    }

    public int hashCode() {
        Object obj = this.f14919a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public String toString() {
        return "StaticValueHolder(value=" + this.f14919a + ')';
    }
}
