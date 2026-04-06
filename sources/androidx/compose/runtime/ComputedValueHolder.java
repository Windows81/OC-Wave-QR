package androidx.compose.runtime;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class ComputedValueHolder<T> implements ValueHolder<T> {

    /* renamed from: a  reason: collision with root package name */
    public final Function1 f14636a;

    public ComputedValueHolder(Function1 function1) {
        this.f14636a = function1;
    }

    public Object a(PersistentCompositionLocalMap persistentCompositionLocalMap) {
        return this.f14636a.invoke(persistentCompositionLocalMap);
    }

    public final Function1 b() {
        return this.f14636a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ComputedValueHolder) && Intrinsics.d(this.f14636a, ((ComputedValueHolder) obj).f14636a);
    }

    public int hashCode() {
        return this.f14636a.hashCode();
    }

    public String toString() {
        return "ComputedValueHolder(compute=" + this.f14636a + ')';
    }
}
