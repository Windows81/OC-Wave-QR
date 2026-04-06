package androidx.compose.runtime;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class DynamicValueHolder<T> implements ValueHolder<T> {

    /* renamed from: a  reason: collision with root package name */
    public final MutableState f14659a;

    public DynamicValueHolder(MutableState mutableState) {
        this.f14659a = mutableState;
    }

    public Object a(PersistentCompositionLocalMap persistentCompositionLocalMap) {
        return this.f14659a.getValue();
    }

    public final MutableState b() {
        return this.f14659a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DynamicValueHolder) && Intrinsics.d(this.f14659a, ((DynamicValueHolder) obj).f14659a);
    }

    public int hashCode() {
        return this.f14659a.hashCode();
    }

    public String toString() {
        return "DynamicValueHolder(state=" + this.f14659a + ')';
    }
}
